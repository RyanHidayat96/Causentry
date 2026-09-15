package defpackage;

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
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import com.nbs.nucleo.utils.exception.ApiException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class unbind<T> implements deriveProfile<T, Response<T>> {

    public static final class TuitionPaymentFragmentbindingInflater1 implements getDefaultVideoProfile<Response<T>> {
        private /* synthetic */ getDefaultVideoProfile b;
        private static final byte[] $$c = {81, -102, -70, -91};
        private static final int $$f = 149;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {94, 6, -99, -107, -12, 2, 63, -57, -8, 0, 8, -5, 7, 55, -51, -13, 10, -14, 3, 6, 5, 54, -57, -6, -6, 69, -51, -20, 1, 12, 58, -51, -15, 7, 59, -69, 10, 2, -7, 5, -5, 64, -36, -19, -17, 7, 12, 2, -19, 11, -6, 1, 44, -45, -6, 7, 10, 17, -18, -13, -4, 13, 6, -2, -33, 12, -11, 11, -6, 1, 30, -17, -24, 12, 8, -9, -6, 46, -44, 17, -6, -6, 8, -9, -6, 1, 3, 11, 2, -6, 8, -11, 3, -5, 2, 3, -5, 9, 1, -18, 13, 4, -18, 42, -34, 11, -1, -7, 8, -1, -1, 5, -20, 9, -8, 67};
        private static final int $$e = 29;
        private static final byte[] $$a = {90, 46, 113, 8, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
        private static final int $$b = 129;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f1419a = 0;
        private static int g = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {47426, 47477, 47487, 47473, 47476, 47482, 47413, 47472, 47440, 47466, 47471, 47486, 47478, 47392, 47479, 47424, 47480, 47475, 47441, 47394, 47469, 47439, 47483, 47470, 47481, 47484, 47451};
        private static int TuitionPaymentFragmentbindingInflater1 = 2047719651;
        private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r5, byte r6, short r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = unbind.TuitionPaymentFragmentbindingInflater1.$$a
                int r1 = r7 + 1
                int r6 = r6 * 52
                int r6 = 56 - r6
                int r5 = r5 * 14
                int r5 = r5 + 84
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L14
                r4 = r7
                r3 = r2
                goto L26
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r5
                r1[r3] = r4
                if (r3 != r7) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L22:
                int r3 = r3 + 1
                r4 = r0[r6]
            L26:
                int r4 = -r4
                int r5 = r5 + r4
                int r5 = r5 + (-10)
                int r6 = r6 + 1
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: unbind.TuitionPaymentFragmentbindingInflater1.c(byte, byte, short, java.lang.Object[]):void");
        }

        private static void e(byte b, short s, int i, Object[] objArr) {
            int i2 = 99 - (b * 15);
            int i3 = 64 - (s * 60);
            int i4 = i * 8;
            byte[] bArr = $$d;
            byte[] bArr2 = new byte[i4 + 53];
            int i5 = i4 + 52;
            int i6 = -1;
            if (bArr == null) {
                int i7 = i3 + (-i5);
                i3++;
                i2 = i7;
            }
            while (true) {
                i6++;
                bArr2[i6] = (byte) i2;
                if (i6 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i8 = i3;
                i3 = i8 + 1;
                i2 += -bArr[i3];
            }
        }

        TuitionPaymentFragmentbindingInflater1(getDefaultVideoProfile getdefaultvideoprofile) {
            this.b = getdefaultvideoprofile;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.getDefaultVideoProfile
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            int i = 2 % 2;
            int i2 = g + 105;
            f1419a = i2 % 128;
            int i3 = i2 % 2;
            Response response = (Response) obj;
            if (!response.isSuccessful()) {
                int i4 = f1419a + 79;
                g = i4 % 128;
                if (i4 % 2 != 0) {
                    getDefaultVideoProfile getdefaultvideoprofile = this.b;
                    resetChildren resetchildren = resetChildren.INSTANCE;
                    getdefaultvideoprofile.onError(resetChildren.TuitionPaymentFragmentspecialinlinedviewModeldefault3(response));
                    return;
                } else {
                    getDefaultVideoProfile getdefaultvideoprofile2 = this.b;
                    resetChildren resetchildren2 = resetChildren.INSTANCE;
                    getdefaultvideoprofile2.onError(resetChildren.TuitionPaymentFragmentspecialinlinedviewModeldefault3(response));
                    throw null;
                }
            }
            if (response.code() == 204) {
                this.b.onError(new ApiException(new lambdasubmitStillCaptureRequests0(204, "Data Empty", "No Content"), response));
                int i5 = g + 59;
                f1419a = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            getDefaultVideoProfile getdefaultvideoprofile3 = this.b;
            Object objBody = response.body();
            if (objBody == null) {
                int i7 = f1419a + 43;
                g = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.throwNpe();
            }
            getdefaultvideoprofile3.b(objBody);
        }

        private static void d(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
            char[] cArr2;
            int length;
            char[] cArr3;
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
            char[] cArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            char c = '0';
            int i5 = 0;
            if (cArr4 != null) {
                int i6 = $11 + 73;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    length = cArr4.length;
                    cArr3 = new char[length];
                    i2 = 1;
                } else {
                    length = cArr4.length;
                    cArr3 = new char[length];
                    i2 = 0;
                }
                while (i2 < length) {
                    int i7 = $11 + 101;
                    $10 = i7 % 128;
                    int i8 = i7 % i3;
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i5] = Integer.valueOf(cArr4[i2]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) i5;
                            byte b2 = b;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.resolveSizeAndState(i5, i5, i5) + 31339), 2993 - TextUtils.lastIndexOf("", c, i5, i5), TextUtils.getTrimmedLength("") + 17, 1182129903, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i2++;
                        i3 = 2;
                        c = '0';
                        i5 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr4 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            long j = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - (ViewConfiguration.getTapTimeout() >> 16)), 252 - MotionEvent.axisFromString(""), ExpandableListView.getPackedPositionChild(0L) + 23, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            int i9 = 1687675375;
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33602 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 3086 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 27, -2146875848, false, $$g(b3, b4, (byte) (-b4)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    j = 0;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i10 = $11 + 113;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
                } else {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                }
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i11 = $10 + 107;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i9);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33601 - TextUtils.lastIndexOf("", '0')), 3085 - View.getDefaultSize(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 26, -2146875848, false, $$g(b5, b6, (byte) (-b6)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    i9 = 1687675375;
                }
                objArr[0] = new String(cArr2);
                return;
            }
            int i13 = 0;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            while (true) {
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13;
                if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    i13 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                }
            }
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onSubscribe(BufferProviderState bufferProviderState) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cGreen = (char) (Color.green(0) + 31533);
                int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0');
                int defaultSize = View.getDefaultSize(0, 0) + 28;
                byte[] bArr = $$a;
                byte b = bArr[7];
                Object[] objArr2 = new Object[1];
                c(b, b, bArr[80], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, iLastIndexOf, defaultSize, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            d(null, null, Color.green(0) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d(null, null, Gravity.getAbsoluteGravity(0, 0) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 31533);
                int gidForName = Process.getGidForName("") + 922;
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 28;
                byte[] bArr2 = $$a;
                Object[] objArr5 = new Object[1];
                c(bArr2[80], bArr2[7], (byte) 52, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarSize, gidForName, edgeSlop, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i2 = g + 95;
                f1419a = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 921;
                    int iNormalizeMetaState = 28 - KeyEvent.normalizeMetaState(0);
                    byte b2 = $$a[80];
                    byte b3 = b2;
                    Object[] objArr6 = new Object[1];
                    c(b2, b3, (byte) (b3 | 37), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, edgeSlop2, iNormalizeMetaState, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i4 = (((1953390499 + (((~((-1693268795) | iIdentityHashCode)) | 79762208) * 104)) + ((~((~iIdentityHashCode) | 1694317435)) * (-104))) + ((iIdentityHashCode | 80810849) * 104)) - 387045528;
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                d(null, null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                d(null, null, 127 - View.MeasureSpec.getSize(0), new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i7 = f1419a + 57;
                    g = i7 % 128;
                    int i8 = i7 % 2;
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                d(null, null, 127 - (Process.myPid() >> 22), new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                d(null, null, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -387045528};
                    byte[] bArr3 = $$d;
                    byte b4 = bArr3[9];
                    byte b5 = bArr3[28];
                    Object[] objArr13 = new Object[1];
                    e(b4, b5, b5, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b6 = bArr3[28];
                    byte b7 = bArr3[9];
                    Object[] objArr14 = new Object[1];
                    e(b6, b7, b7, objArr14);
                    objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) (31534 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 921;
                        int maxKeyCode2 = 28 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte b8 = $$a[80];
                        byte b9 = b8;
                        Object[] objArr15 = new Object[1];
                        c(b8, b9, (byte) (b9 | 37), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, maxKeyCode, maxKeyCode2, -1142834547, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        d(null, null, ImageFormat.getBitsPerPixel(0) + 128, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        d(null, null, 127 - View.resolveSize(0, 0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char keyRepeatTimeout = (char) (31533 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                            int i9 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 922;
                            int trimmedLength = 28 + TextUtils.getTrimmedLength("");
                            byte[] bArr4 = $$a;
                            Object[] objArr18 = new Object[1];
                            c(bArr4[80], bArr4[7], (byte) 52, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout, i9, trimmedLength, -778300370, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31533);
                            int iRgb = Color.rgb(0, 0, 0) + 16778137;
                            int iLastIndexOf2 = 27 - TextUtils.lastIndexOf("", '0', 0, 0);
                            byte[] bArr5 = $$a;
                            byte b10 = bArr5[7];
                            Object[] objArr19 = new Object[1];
                            c(b10, b10, bArr5[80], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(minimumFlingVelocity, iRgb, iLastIndexOf2, -1048449946, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i10 = ((int[]) objArr[1])[0];
            int i11 = ((int[]) objArr[3])[0];
            if (i11 == i10) {
                int i12 = f1419a + 37;
                g = i12 % 128;
                int i13 = i12 % 2;
                int i14 = ((int[]) objArr[0])[0];
                Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i15 = ~iIdentityHashCode2;
                int i16 = i14 + 315929631 + (((~(1755716625 | i15)) | 18363018) * (-328)) + ((iIdentityHashCode2 | 18363018) * 164) + (((~(iIdentityHashCode2 | (-1755716626))) | 4096 | (~(i15 | 1774075547))) * 164);
                int i17 = (i16 << 13) ^ i16;
                int i18 = i17 ^ (i17 >>> 17);
                ((int[]) objArr20[0])[0] = i18 ^ (i18 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    int i19 = f1419a + 125;
                    g = i19 % 128;
                    int i20 = i19 % 2;
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
                int i21 = ((int[]) objArr[0])[0];
                Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int iNextInt = new Random().nextInt();
                int i22 = i21 + 440064755 + (((-1170058596) | iNextInt) * 376) + (((~((~iNextInt) | 369916061)) | (-1472069120)) * (-376)) + (((~(iNextInt | (-369916062))) | 1404163582) * 376);
                int i23 = (i22 << 13) ^ i22;
                int i24 = i23 ^ (i23 >>> 17);
                ((int[]) objArr21[0])[0] = i24 ^ (i24 << 5);
            }
            this.b.onSubscribe(bufferProviderState);
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onError(Throwable th) {
            int i = 2 % 2;
            int i2 = f1419a + 57;
            g = i2 % 128;
            int i3 = i2 % 2;
            this.b.onError(th);
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001f  */
        /* JADX WARN: Code duplicated, block: B:8:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001f
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r6, short r7, byte r8) {
            /*
                byte[] r0 = unbind.TuitionPaymentFragmentbindingInflater1.$$c
                int r6 = r6 * 3
                int r1 = r6 + 1
                int r7 = 68 - r7
                int r8 = r8 + 4
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L13
                r4 = r6
                r7 = r8
                r3 = r2
                goto L28
            L13:
                r3 = r2
            L14:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r6) goto L1f
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L1f:
                int r3 = r3 + 1
                int r8 = r8 + 1
                r4 = r0[r8]
                r5 = r8
                r8 = r7
                r7 = r5
            L28:
                int r4 = -r4
                int r8 = r8 + r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: unbind.TuitionPaymentFragmentbindingInflater1.$$g(short, short, byte):java.lang.String");
        }
    }

    @Override // defpackage.deriveProfile
    public final getDefaultVideoProfile<? super Response<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(getDefaultVideoProfile<? super T> getdefaultvideoprofile) {
        return new TuitionPaymentFragmentbindingInflater1(getdefaultvideoprofile);
    }
}
