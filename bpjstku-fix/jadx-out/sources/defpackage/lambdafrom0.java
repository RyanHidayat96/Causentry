package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdafrom0 extends RequestManager {
    private static final byte[] $$c = {108, -26, -110, 50};
    private static final int $$f = 162;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {87, 51, -85, 78, -13, 1, 62, -53, -15, 5, -10, -2, 8, -11, 70, -55, 2, -20, 18, 50, -67, 14, -25, 11, 7, -10, -7, 69, -64, -3, 10, -2, -8, Base64.padSymbol, -69, 12, -13, -5, 15, -15, -2, 69, -28, -38, 9, -6, -14, 12, 4, -18, 19, -12, 39, -34, -16, 18, -9, -4, 40, -51, 1, -2, 4, 1, 7, -14, 34, -20, -9, 4, 1, -18, -34, 11, -12, 10, -7, 0, 29, -18, -25, 11, 7, -10, -7, 45, -45, 16, -7, -7, 7, -10, -7, 17, -8, -6, 9, -6, -6, 6, 29, -38, 7, -7, 10, -20, 14, -14, 64};
    private static final int $$h = 139;
    private static final byte[] $$a = {87, -91, 60, 112, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 79;
    private static int asBinder = 0;
    private static int notify = 1;
    private static long g = -6377398940819159759L;
    private static int asInterface = -981105359;
    private static char d = 45839;

    private static void c(byte b, int i, byte b2, Object[] objArr) {
        int i2 = (b2 * 52) + 4;
        byte[] bArr = $$a;
        int i3 = (i * 14) + 84;
        byte[] bArr2 = new byte[53 - b];
        int i4 = 52 - b;
        int i5 = -1;
        if (bArr == null) {
            i2++;
            i3 = (i2 + (-i3)) - 10;
            i5 = -1;
        }
        while (true) {
            int i6 = i2;
            int i7 = i3;
            int i8 = i5 + 1;
            bArr2[i8] = (byte) i7;
            if (i8 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = i6 + 1;
                i3 = (i7 + (-bArr[i6])) - 10;
                i5 = i8;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.lambdafrom0.$$g
            int r8 = r8 * 68
            int r8 = 71 - r8
            int r7 = r7 * 15
            int r7 = r7 + 84
            int r6 = r6 * 31
            int r1 = r6 + 38
            byte[] r1 = new byte[r1]
            int r6 = r6 + 37
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L30
        L18:
            r3 = r2
        L19:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L30:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-1)
            r8 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdafrom0.f(int, byte, int, java.lang.Object[]):void");
    }

    @Override // com.bumptech.glide.RequestManager
    public final /* bridge */ /* synthetic */ RequestBuilder TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        notify = i2 % 128;
        int i3 = i2 % 2;
        clearCaptureRequestOption clearcapturerequestoption = (clearCaptureRequestOption) super.TuitionPaymentFragmentbindingInflater1();
        int i4 = asBinder + 91;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return clearcapturerequestoption;
    }

    @Override // com.bumptech.glide.RequestManager
    public final /* synthetic */ RequestBuilder TuitionPaymentFragmentbindingInflater1(Class cls) {
        int i = 2 % 2;
        clearCaptureRequestOption clearcapturerequestoption = new clearCaptureRequestOption(this.TuitionPaymentFragmentbindingInflater1, this, cls, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        int i2 = asBinder + 35;
        notify = i2 % 128;
        int i3 = i2 % 2;
        return clearcapturerequestoption;
    }

    @Override // com.bumptech.glide.RequestManager
    public final /* bridge */ /* synthetic */ RequestBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = notify + 119;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        clearCaptureRequestOption clearcapturerequestoption = (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i3 = notify + 63;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return clearcapturerequestoption;
    }

    @Override // com.bumptech.glide.RequestManager
    public final /* bridge */ /* synthetic */ RequestBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj) {
        int i = 2 % 2;
        int i2 = notify + 41;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        clearCaptureRequestOption clearcapturerequestoption = (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj);
        int i4 = asBinder + 91;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return clearcapturerequestoption;
    }

    @Override // com.bumptech.glide.RequestManager
    public final /* bridge */ /* synthetic */ RequestBuilder b(File file) {
        int i = 2 % 2;
        int i2 = notify + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        clearCaptureRequestOption clearcapturerequestoption = (clearCaptureRequestOption) super.b(file);
        int i4 = asBinder + 119;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            return clearcapturerequestoption;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bumptech.glide.RequestManager
    public final /* bridge */ /* synthetic */ RequestBuilder load(Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            return (clearCaptureRequestOption) super.load(bitmap);
        }
        int i3 = 62 / 0;
        return (clearCaptureRequestOption) super.load(bitmap);
    }

    @Override // com.bumptech.glide.RequestManager
    public final /* bridge */ /* synthetic */ RequestBuilder load(Integer num) {
        int i = 2 % 2;
        int i2 = notify + 119;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        clearCaptureRequestOption clearcapturerequestoption = (clearCaptureRequestOption) super.load(num);
        int i3 = asBinder + 3;
        notify = i3 % 128;
        int i4 = i3 % 2;
        return clearcapturerequestoption;
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
            int i4 = $10 + 87;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 8328), 1235 - (ViewConfiguration.getEdgeSlop() >> 16), 35 - View.MeasureSpec.makeMeasureSpec(0, 0), -653973969, false, $$i(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.getGidForName("") + 1), ImageFormat.getBitsPerPixel(0) + 2765, 14 - KeyEvent.keyCodeFromString(""), 1504416861, false, $$i(b3, b4, (byte) (b4 - 2)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getScrollBarSize() >> 8)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 253, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = (byte) (b5 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - ExpandableListView.getPackedPositionType(0L)), 2891 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 17, 2012627446, false, $$i(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = sessionProcessor.b;
                            cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (g ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) asInterface) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) d) ^ (-6377398940819159759L)))));
                            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
        int i6 = $11 + 17;
        $10 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.bumptech.glide.RequestManager
    public final /* bridge */ /* synthetic */ RequestBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) throws Throwable {
        int length;
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyPid = (char) (31533 - (Process.myPid() >> 22));
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 921;
            int i3 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) 52, bArr[7], bArr[80], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyPid, offsetAfter, i3, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{46052, 8294, 37082, 61272}, (char) ((Process.getThreadPriority(0) + 20) >> 6), ExpandableListView.getPackedPositionGroup(0L), new char[]{280, 1518, 25046, 59819, 29019, 7073, 30757, 22824, 47871, 17300, 41880, 50434, 56254, 27166, 40677, 61576, 10553, 28330, 2679, 30563, 33730, 55342}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{61792, 37401, 6649, 20751}, (char) (3865 - (ViewConfiguration.getScrollBarSize() >> 8)), (ViewConfiguration.getWindowTouchSlop() >> 8) - 107865615, new char[]{21249, 24279, 53055, 39355, 24934, 52227, 39030, 6130, 55800, 19391, 51893, 46731, 36744, 9883, 61238}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 31533);
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 921;
            int iIndexOf = 28 - TextUtils.indexOf("", "");
            byte b = $$a[80];
            byte b2 = b;
            Object[] objArr5 = new Object[1];
            c(b, b2, b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(edgeSlop, maximumFlingVelocity, iIndexOf, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = asBinder + 11;
            notify = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 31533);
                int keyRepeatDelay = 921 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int iIndexOf2 = 28 - TextUtils.indexOf("", "");
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c((byte) (-bArr2[33]), bArr2[80], bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cNormalizeMetaState, keyRepeatDelay, iIndexOf2, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = 1379739113 + ((364489795 | iIdentityHashCode) * 614);
            int i7 = ~iIdentityHashCode;
            int i8 = i6 + (((~((-1044107565) | i7)) | 339312640 | (~(729972079 | i7))) * (-1228)) + (((~(i7 | 1069284719)) | (~((-704794925) | i7))) * 614) + 2083944772;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{49380, 7026, 45954, 65338}, (char) (TextUtils.indexOf("", "") + 15027), ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{8610, 1675, 61807, 56335, 20845, 12611, 31256, 23382, 8394, 17142, 54311, 32302, 37532, 62865, 29808, 14675, 29105, 45658, 19517, 32795, 51339, 50053, 51379, 16938, 25809, 34533}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{14396, 52054, 35477, 56318}, (char) (65162 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new char[]{42485, 10951, 8455, 60967, 63043, 32482, 33583, 53416, 27612, 64242, 14302, 29845, 60128, 54395, 19436, 58456, 20835, 5330}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            if (str != null) {
                int i11 = asBinder + 39;
                notify = i11 % 128;
                if (i11 % 2 == 0) {
                    str.length();
                    throw null;
                }
                length = str.length();
            } else {
                length = 0;
            }
            int i12 = asBinder + 47;
            notify = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(length), 0, 2083944772};
                byte[] bArr3 = $$g;
                byte b3 = bArr3[5];
                byte b4 = b3;
                Object[] objArr11 = new Object[1];
                f(b3, b4, b4, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b5 = bArr3[77];
                byte b6 = b5;
                Object[] objArr12 = new Object[1];
                f(b5, b6, b6, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 31533);
                    int maxKeyCode = 921 - (KeyEvent.getMaxKeyCode() >> 16);
                    int i14 = 28 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte[] bArr4 = $$a;
                    Object[] objArr14 = new Object[1];
                    c((byte) (-bArr4[33]), bArr4[80], bArr4[7], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode, maxKeyCode, i14, -1142834547, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{46052, 8294, 37082, 61272}, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{280, 1518, 25046, 59819, 29019, 7073, 30757, 22824, 47871, 17300, 41880, 50434, 56254, 27166, 40677, 61576, 10553, 28330, 2679, 30563, 33730, 55342}, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{61792, 37401, 6649, 20751}, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 3865), (-107865615) - (ViewConfiguration.getJumpTapTimeout() >> 16), new char[]{21249, 24279, 53055, 39355, 24934, 52227, 39030, 6130, 55800, 19391, 51893, 46731, 36744, 9883, 61238}, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cAlpha = (char) (31533 - Color.alpha(0));
                        int edgeSlop2 = 921 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int iMyPid = (Process.myPid() >> 22) + 28;
                        byte b7 = $$a[80];
                        byte b8 = b7;
                        Object[] objArr17 = new Object[1];
                        c(b7, b8, b8, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAlpha, edgeSlop2, iMyPid, -778300370, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31532);
                        int maximumDrawingCacheSize = 921 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int fadingEdgeLength = 28 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte[] bArr5 = $$a;
                        Object[] objArr18 = new Object[1];
                        c((byte) 52, bArr5[7], bArr5[80], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, maximumDrawingCacheSize, fadingEdgeLength, -1048449946, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
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
        if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
            int i15 = ((int[]) objArr[0])[0];
            Object[] objArr19 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i16 = ~System.identityHashCode(this);
            int i17 = i15 + (-436541176) + ((~((-606668803) | i16)) * (-783)) + (((~(i16 | 1129640921)) | (-644438723)) * 783);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr19[0])[0] = i19 ^ (i19 << 5);
            return (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr == null) {
            throw null;
        }
        while (i2 < strArr.length) {
            arrayList.add(strArr[i2]);
            i2++;
            int i20 = asBinder + 53;
            notify = i20 % 128;
            int i21 = i20 % 2;
        }
        throw null;
    }

    public lambdafrom0(Glide glide, getImageQueueDepth getimagequeuedepth, getUseCaseConfigBuilder getusecaseconfigbuilder, Context context) {
        super(glide, getimagequeuedepth, getusecaseconfigbuilder, context);
    }

    @Override // com.bumptech.glide.RequestManager
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(RequestOptions requestOptions) {
        int i = 2 % 2;
        if (!(requestOptions instanceof CaptureRequestOptionsBuilder)) {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CaptureRequestOptionsBuilder().TuitionPaymentFragmentbindingInflater1(requestOptions));
            int i2 = notify + 105;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = notify + 29;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(requestOptions);
            return;
        }
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(requestOptions);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, int r7, int r8) {
        /*
            int r7 = r7 + 102
            int r8 = r8 * 4
            int r8 = r8 + 4
            byte[] r0 = defpackage.lambdafrom0.$$c
            int r6 = r6 * 3
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L28:
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdafrom0.$$i(short, int, int):java.lang.String");
    }
}
