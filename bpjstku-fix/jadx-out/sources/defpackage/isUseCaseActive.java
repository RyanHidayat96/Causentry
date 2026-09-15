package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.R;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
public final class isUseCaseActive {

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        public static final int TuitionPaymentFragmentbindingInflater1 = 3;
        public static final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        public static final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {R.attr.autoCorrect, R.attr.dateFormat, R.attr.dividerCharacter, R.attr.helperTextEnabled, R.attr.helperTextHighlightedColor, R.attr.maxDate, R.attr.minDate};
        public static final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f1233a = 6;
        public static final int asBinder = 5;
        public static final int asInterface = 4;
        public static final int b = 1;
    }

    public static final class TuitionPaymentFragmentbindingInflater1 {
        public static final int TuitionPaymentFragmentbindingInflater1 = 2132018148;
        public static final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2132018149;
        public static final int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2132018147;
        public static final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2132018145;
        public static final int b = 2132018146;
        public static final int d = 2132018150;
        private static final byte[] $$c = {92, 126, -38, -95};
        private static final int $$d = 10;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {8, -36, 87, -65};
        private static final int $$b = 143;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f1232a = 0;
        private static int asBinder = 1;
        private static char[] g = {60095, 60048, 60055, 60041, 60056, 60117, 60052, 60093, 60068, 60057, 60040, 60058, 60034, 60038, 60039, 60046, 60032, 60033, 60062, 60060, 60047, 60042, 60036, 60035, 60053, 60061, 60044, 60037, 60088, 60116, 60063, 60050, 60094, 60043, 60106, 60045};
        private static char asInterface = 57191;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(short r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = isUseCaseActive.TuitionPaymentFragmentbindingInflater1.$$a
                int r6 = r6 * 4
                int r6 = r6 + 1
                int r8 = r8 * 4
                int r8 = 98 - r8
                int r7 = r7 + 4
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r8
                r5 = r2
                r8 = r6
                goto L29
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                int r7 = r7 + 1
                if (r5 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                r3 = r0[r7]
            L29:
                int r8 = r8 + r3
                r3 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: isUseCaseActive.TuitionPaymentFragmentbindingInflater1.e(short, short, short, java.lang.Object[]):void");
        }

        private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3;
            int i4 = 2 % 2;
            deInitSession deinitsession = new deInitSession();
            char[] cArr2 = g;
            Object obj2 = null;
            int i5 = 3;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b3 = (byte) i5;
                            byte b4 = (byte) (b3 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), 2268 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 34 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1927765101, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i6++;
                        i5 = 3;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(asInterface)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                byte b5 = (byte) 3;
                byte b6 = (byte) (b5 - 3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) KeyEvent.normalizeMetaState(0), 2267 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33, -1927765101, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i7 = $11 + 69;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        obj = obj2;
                        i3 = 2;
                    } else {
                        Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cAlpha = (char) (49267 - Color.alpha(0));
                            int defaultSize = View.getDefaultSize(0, 0) + 3261;
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 31;
                            byte b7 = (byte) ($$d >>> 2);
                            byte b8 = (byte) (b7 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha, defaultSize, iLastIndexOf, -127612708, false, $$e(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            int i9 = $10 + 103;
                            $11 = i9 % 128;
                            int i10 = i9 % 2;
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b9 = (byte) 0;
                                byte b10 = b9;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 22878), 594 - View.resolveSize(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 17, 1570859318, false, $$e(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i12 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i12];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                            } else {
                                int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                                int i16 = $10 + 5;
                                $11 = i16 % 128;
                                i3 = 2;
                                int i17 = i16 % 2;
                            }
                        }
                        i3 = 2;
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += i3;
                    obj2 = obj;
                }
            }
            int i18 = 0;
            while (i18 < i) {
                cArr4[i18] = (char) (cArr4[i18] ^ 13722);
                i18++;
                int i19 = $11 + 31;
                $10 = i19 % 128;
                int i20 = i19 % 2;
            }
            objArr[0] = new String(cArr4);
        }

        /* JADX WARN: Code duplicated, block: B:121:0x0896  */
        /* JADX WARN: Code duplicated, block: B:123:0x08c0  */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2) throws Throwable {
            int i3;
            int i4;
            int i5;
            String line;
            Object[] objArr;
            char c;
            Object[] objArr2;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            char[] cArr;
            int size;
            int i11;
            int i12;
            Object obj;
            int i13 = 2 % 2;
            int i14 = f1232a;
            int i15 = ((i14 | 93) << 1) - (i14 ^ 93);
            asBinder = i15 % 128;
            int i16 = i15 % 2;
            try {
                String[] strArr = new String[2];
                char[] cArr2 = {Typography.quote, 7, 6, 24, 15, 21, 13912, 13912, 21, 0, 24, '\n', 13903, 13903, 22, 0, 21, 19, 13913};
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                int i17 = iMakeMeasureSpec * (-159);
                int i18 = f1232a + 51;
                asBinder = i18 % 128;
                if (i18 % 2 == 0) {
                    int i19 = ~iMakeMeasureSpec;
                    int i20 = (i17 / (-250)) / (160 >>> ((i19 & 91) | (i19 ^ 91)));
                    int i21 = ~i;
                    i10 = i20 << (((~((i21 & iMakeMeasureSpec) | (i21 ^ iMakeMeasureSpec))) | (~(iMakeMeasureSpec | 91))) * (-160));
                } else {
                    int i22 = ((i17 | (-14469)) << 1) - (i17 ^ (-14469));
                    int i23 = ((~iMakeMeasureSpec) | 91) * 160;
                    int i24 = (i22 & i23) + (i23 | i22);
                    int i25 = ~i;
                    int i26 = ((~((i25 & iMakeMeasureSpec) | (i25 ^ iMakeMeasureSpec))) | (~((iMakeMeasureSpec ^ 91) | (iMakeMeasureSpec & 91)))) * (-160);
                    i10 = ((i26 & i24) << 1) + (i24 ^ i26);
                }
                int i27 = ~i;
                int i28 = ~(((-92) & i27) | ((-92) ^ i27));
                byte b2 = (byte) (i10 + (160 * ((iMakeMeasureSpec & i28) | (iMakeMeasureSpec ^ i28))));
                int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                int i29 = (maxKeyCode * 592) - 11210;
                int i30 = ~maxKeyCode;
                int i31 = (~((i30 ^ 19) | (i30 & 19))) * (-1182);
                int i32 = (i29 ^ i31) + ((i31 & i29) << 1);
                int i33 = (i30 ^ (-20)) | (i30 & (-20));
                int i34 = ~((i33 & i27) | (i33 ^ i27));
                int i35 = f1232a + 5;
                asBinder = i35 % 128;
                int i36 = i35 % 2;
                int i37 = ~((maxKeyCode ^ 19) | (19 & maxKeyCode));
                if (i36 == 0) {
                    int i38 = -((i37 & i34) | (i34 ^ i37));
                    int i39 = i32 * (((i38 | (-591)) << 1) - (i38 ^ (-591)));
                    int i40 = i | i30;
                    Object[] objArr3 = new Object[1];
                    c(cArr2, b2, i39 % (590 - (~(-(-((i40 & (-20)) | (i40 ^ (-20))))))), objArr3);
                    strArr[0] = (String) objArr3[0];
                    cArr = new char[]{29, '\b', ' ', 19, 30, 25, 25, '\r', '\t', 0, 6, 24, 15, 21, 13896, 13896, 21, 0};
                    size = View.MeasureSpec.getSize(0);
                    i11 = 18;
                } else {
                    int i41 = (i37 | i34) * (-591);
                    int i42 = (i32 & i41) + (i32 | i41);
                    int i43 = (i ^ i30) | (i & i30);
                    int i44 = -(-(((i43 & (-20)) | (i43 ^ (-20))) * 591));
                    int i45 = (i42 ^ i44) + ((i44 & i42) << 1);
                    Object[] objArr4 = new Object[1];
                    c(cArr2, b2, i45, objArr4);
                    strArr[0] = (String) objArr4[0];
                    cArr = new char[]{29, '\b', ' ', 19, 30, 25, 25, '\r', '\t', 0, 6, 24, 15, 21, 13896, 13896, 21, 0};
                    size = View.MeasureSpec.getSize(0);
                    i11 = 75;
                }
                int i46 = asBinder;
                int i47 = (i46 & 55) + (i46 | 55);
                int i48 = i47 % 128;
                f1232a = i48;
                int i49 = i47 % 2;
                int i50 = size * (-711);
                int i51 = -(-(i11 * 713));
                int i52 = (i50 ^ i51) + ((i50 & i51) << 1);
                int i53 = ~i11;
                int i54 = ~((i53 ^ size) | (i53 & size));
                int i55 = ~i;
                int i56 = (i55 ^ size) | (i55 & size);
                int i57 = ((i48 | 125) << 1) - (i48 ^ 125);
                asBinder = i57 % 128;
                if (i57 % 2 == 0) {
                    int i58 = ~i56;
                    int i59 = (~i11) | i27;
                    int i60 = (size ^ i11) | (i11 & size);
                    i12 = (i52 * ((-712) / ((i58 & i54) | (i54 ^ i58)))) - (((~((i59 & size) | (i59 ^ size))) | (~((i60 & i) | (i60 ^ i)))) - 712);
                } else {
                    int i61 = ~i56;
                    int i62 = i52 + (((i61 & i54) | (i54 ^ i61)) * (-712));
                    int i63 = ~i11;
                    int i64 = (i63 & i55) | (i63 ^ i55);
                    int i65 = ~((i64 & size) | (i64 ^ size));
                    int i66 = (size ^ i11) | (i11 & size);
                    int i67 = ~((i66 & i) | (i66 ^ i));
                    i12 = i62 + (((i65 & i67) | (i65 ^ i67)) * (-712));
                }
                int i68 = ~((i27 ^ size) | (size & i27));
                int i69 = 712 * ((i68 & i53) | (i53 ^ i68));
                Object[] objArr5 = new Object[1];
                c(cArr, (byte) ((i12 & i69) + (i69 | i12)), 18 - (~TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr5);
                strArr[1] = (String) objArr5[0];
                int i70 = 0;
                while (true) {
                    if (i70 >= 2) {
                        i3 = i;
                        break;
                    }
                    String str = strArr[i70];
                    char[] cArr3 = {6, 29, '!', 0, 7, 30, '#', 0, 7, 11, 0, 1, 21, 6, '\r', 21};
                    int i71 = f1232a;
                    int i72 = (i71 ^ 5) + ((i71 & 5) << 1);
                    asBinder = i72 % 128;
                    if (i72 % 2 == 0) {
                        Object[] objArr6 = new Object[1];
                        c(cArr3, (byte) (85 % TextUtils.lastIndexOf("", '0', 0, 0)), 7 >> (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr6);
                        obj = objArr6[0];
                    } else {
                        int i73 = -TextUtils.lastIndexOf("", '0', 0, 0);
                        byte b3 = (byte) ((i73 ^ 85) + ((85 & i73) << 1));
                        int i74 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        Object[] objArr7 = new Object[1];
                        c(cArr3, b3, (i74 & 17) + (i74 | 17), objArr7);
                        obj = objArr7[0];
                    }
                    Class<?> cls = Class.forName((String) obj);
                    Method method = cls.getMethod(str, new Class[0]);
                    int i75 = f1232a;
                    int i76 = (i75 ^ 117) + ((i75 & 117) << 1);
                    asBinder = i76 % 128;
                    int i77 = i76 % 2;
                    if (((Boolean) method.invoke(cls, null)).booleanValue()) {
                        i3 = i ^ 1;
                        int i78 = asBinder + 15;
                        f1232a = i78 % 128;
                        int i79 = i78 % 2;
                        break;
                    }
                    i70++;
                }
            } catch (Exception unused) {
                i3 = i ^ 2;
            }
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char trimmedLength = (char) (2419 - TextUtils.getTrimmedLength(""));
                    int i80 = 2845 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iResolveSizeAndState = 5 - View.resolveSizeAndState(0, 0, 0);
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    Object[] objArr8 = new Object[1];
                    e(b4, b5, (byte) (b5 + 1), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength, i80, iResolveSizeAndState, -501222268, false, (String) objArr8[0], new Class[0]);
                }
                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                long j = -1082680986;
                long j2 = -502;
                long j3 = -1;
                long j4 = jLongValue ^ j3;
                long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                long j5 = (((long) (-501)) * j) + (((long) TypedValues.PositionType.TYPE_PERCENT_WIDTH) * jLongValue) + ((((j4 | startElapsedRealtime) ^ j3) | ((jLongValue | j) ^ j3)) * j2) + (j2 * (((j4 | (startElapsedRealtime ^ j3)) | j) ^ j3)) + (((long) TypedValues.PositionType.TYPE_DRAWPATH) * (j4 | (((j ^ j3) | startElapsedRealtime) ^ j3))) + ((long) (-76505700));
                int i81 = ((int) (j5 >> 32)) & ((((~((-1821903728) | i)) | 76022084) * (-566)) + 1516052994 + ((~((-1745881644) | i)) * 566));
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i82 = ((int) j5) & (2005432269 + (((~((-1136968694) | startUptimeMillis)) | 1115734624) * 104) + ((~((~startUptimeMillis) | 1742006261)) * (-104)) + ((startUptimeMillis | 1720772192) * 104));
                int i83 = (i81 & i82) | (i81 ^ i82);
                int i84 = ~i;
                int i85 = (i83 | 1) & (~(i83 & 1));
                int i86 = -i85;
                int i87 = ((i85 & i86) | (i85 ^ i86)) >> 31;
                int i88 = ((i & (-11)) | (i84 & 10)) & (~i87);
                int i89 = asBinder;
                int i90 = ((i89 | 63) << 1) - (i89 ^ 63);
                f1232a = i90 % 128;
                int i91 = (i87 & i) | i88;
                if (i90 % 2 != 0) {
                    int i92 = ((~i3) & i) | (i3 & i84);
                    int i93 = -i92;
                    i4 = (i92 & i93) | (i92 ^ i93);
                    i5 = 108;
                } else {
                    int i94 = i ^ i3;
                    int i95 = -i94;
                    i4 = (i94 & i95) | (i94 ^ i95);
                    i5 = 31;
                }
                int i96 = i4 >> i5;
                int i97 = i91 & (~i96);
                int i98 = i3 & i96;
                int i99 = (i97 ^ i98) | (i98 & i97);
                try {
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0);
                    int i100 = (iLastIndexOf * 477) - 48925;
                    int i101 = ~iLastIndexOf;
                    int i102 = ~((i101 & 103) | (i101 ^ 103));
                    int i103 = ((-104) ^ iLastIndexOf) | ((-104) & iLastIndexOf);
                    int i104 = ~((i103 & i) | (i103 ^ i));
                    int i105 = ((i102 & i104) | (i102 ^ i104)) * (-476);
                    int i106 = (i100 ^ i105) + ((i100 & i105) << 1);
                    int i107 = (-104) | iLastIndexOf;
                    int i108 = i106 + ((~((i107 & i) | (i107 ^ i))) * 952);
                    int i109 = ~i;
                    byte b6 = (byte) (i108 + ((~((i109 & (-104)) | ((-104) ^ i109) | iLastIndexOf)) * 476));
                    int i110 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    Object[] objArr9 = new Object[1];
                    c(new char[]{28, 11, 16, 6, 25, 5, 21, 0, 30, 24, 5, 26, 0, 24, 15, 21, 23, 25, 21, 2, '\n', 5, 30, 25, 23, 25, 3, 16, 13902, 13902, 24, 30, 26, 14, 21, 2, '\n', 5, 21, 0}, b6, (i110 & 39) + (i110 | 39), objArr9);
                    File file = new File((String) objArr9[0]);
                    if (!file.canRead()) {
                        int i111 = asBinder;
                        int i112 = (i111 ^ 55) + ((i111 & 55) << 1);
                        int i113 = i112 % 128;
                        f1232a = i113;
                        if (i112 % 2 != 0) {
                            int i114 = 50 / 0;
                        }
                        int i115 = i113 + 25;
                        asBinder = i115 % 128;
                        if (i115 % 2 == 0) {
                            int i116 = 3 % 3;
                        }
                        line = null;
                    } else {
                        FileReader fileReader = new FileReader(file);
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        try {
                            line = bufferedReader.readLine();
                            char[] cArr4 = {30, '\f', 13828};
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0');
                            int i117 = asBinder + 21;
                            f1232a = i117 % 128;
                            int i118 = i117 % 2;
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = com.google.android.material.R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i119 = (iIndexOf * (-432)) + 11718;
                            int i120 = ~iIndexOf;
                            int i121 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i122 = (i120 ^ i121) | (i121 & i120);
                            int i123 = (~((i122 ^ 27) | (i122 & 27))) * 433;
                            int i124 = (i119 ^ i123) + ((i119 & i123) << 1);
                            int i125 = ~(((-28) & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | ((-28) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                            int i126 = i124 + (((i125 & i120) | (i120 ^ i125)) * (-433));
                            int i127 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & i120) | (i120 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                            int i128 = ~((iIndexOf & 27) | (iIndexOf ^ 27));
                            int i129 = ((i127 & i128) | (i127 ^ i128)) * 433;
                            byte b7 = (byte) ((i126 & i129) + (i126 | i129));
                            int threadPriority = Process.getThreadPriority(0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = com.google.android.material.R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i130 = threadPriority * (-903);
                            int i131 = (18100 ^ i130) + ((i130 & 18100) << 1);
                            int i132 = ~(((-21) & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | ((-21) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                            int i133 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i134 = ~((i133 ^ threadPriority) | (i133 & threadPriority));
                            int i135 = ((i132 ^ i134) | (i132 & i134)) * (-1808);
                            int i136 = ((i131 | i135) << 1) - (i131 ^ i135);
                            int i137 = ~threadPriority;
                            int i138 = ((-21) ^ i137) | ((-21) & i137);
                            int i139 = ~((i138 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i138 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                            int i140 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i141 = (i140 ^ 20) | (i140 & 20);
                            int i142 = ~((i141 ^ threadPriority) | (i141 & threadPriority));
                            int i143 = ((i139 ^ i142) | (i142 & i139)) * TypedValues.Custom.TYPE_BOOLEAN;
                            int i144 = (i136 & i143) + (i143 | i136);
                            int i145 = ~(((-21) & threadPriority) | ((-21) ^ threadPriority));
                            int i146 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault2 | i137);
                            int i147 = (i145 & i146) | (i145 ^ i146);
                            int i148 = ~i141;
                            int i149 = ((i147 & i148) | (i147 ^ i148)) * TypedValues.Custom.TYPE_BOOLEAN;
                            int i150 = -(((i144 ^ i149) + ((i149 & i144) << 1)) >> 6);
                            int i151 = i150 * (-300);
                            int i152 = (i151 & TypedValues.Custom.TYPE_REFERENCE) + (i151 | TypedValues.Custom.TYPE_REFERENCE) + ((~(i150 | 3 | i)) * (-301));
                            int i153 = ~(((-4) & i) | ((-4) ^ i));
                            int i154 = f1232a;
                            int i155 = ((i154 | 77) << 1) - (i154 ^ 77);
                            asBinder = i155 % 128;
                            int i156 = i155 % 2;
                            int i157 = ~((i84 & i150) | (i84 ^ i150));
                            int i158 = -(-((-301) * ((i153 & i157) | (i153 ^ i157))));
                            int i159 = (i152 & i158) + (i158 | i152);
                            int i160 = ~((~i150) | i);
                            Object[] objArr10 = new Object[1];
                            c(cArr4, b7, i159 + (((i160 & (-4)) | ((-4) ^ i160)) * 301), objArr10);
                            if (line.equals((String) objArr10[0])) {
                                fileReader.close();
                                bufferedReader.close();
                                int i161 = f1232a + 67;
                                asBinder = i161 % 128;
                                int i162 = i161 % 2;
                                int i163 = f1232a + 37;
                                asBinder = i163 % 128;
                                if (i163 % 2 == 0) {
                                    int i164 = 3 / 4;
                                }
                                line = null;
                            } else {
                                fileReader.close();
                                bufferedReader.close();
                            }
                        } catch (Throwable th) {
                            fileReader.close();
                            bufferedReader.close();
                            throw th;
                        }
                    }
                } catch (Exception unused2) {
                }
                try {
                    int i165 = -TextUtils.indexOf((CharSequence) "", '0');
                    int i166 = -TextUtils.lastIndexOf("", '0', 0, 0);
                    int i167 = ~i;
                    int i168 = ~((i167 ^ 30) | (i167 & 30));
                    int i169 = ((i166 * 522) - 15600) + (((i168 & i166) | (i166 ^ i168)) * (-1042));
                    int i170 = (i | 30) * 521;
                    int i171 = (i169 & i170) + (i169 | i170);
                    int i172 = ~i166;
                    int i173 = ~(i172 | (-31));
                    int i174 = ~(i172 | i);
                    int i175 = (i166 & i167) | (i167 ^ i166);
                    int i176 = (i171 - (~(((~((i175 & 30) | (i175 ^ 30))) | ((i174 & i173) | (i173 ^ i174))) * 521))) - 1;
                    Object[] objArr11 = new Object[1];
                    c(new char[]{27, '#', 0, '\t', 5, 28, 6, 16, 11, 28, 0, 19, 0, 27, 20, 0, 24, 26, 21, 2, '\n', 5, 20, 6, 24, 30, 6, '\n', 0, 20, 13850}, (byte) ((i165 ^ 27) + ((i165 & 27) << 1)), i176, objArr11);
                    File file2 = new File((String) objArr11[0]);
                    if (file2.canRead()) {
                        FileReader fileReader2 = new FileReader(file2);
                        BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
                        try {
                            String line2 = bufferedReader2.readLine();
                            int i177 = -Gravity.getAbsoluteGravity(0, 0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = com.google.android.material.R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i178 = i177 * (-432);
                            int i179 = (i178 & 33852) + (i178 | 33852);
                            int i180 = ~i177;
                            int i181 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i182 = (i181 & i180) | (i180 ^ i181);
                            int i183 = (i179 - (~((~((i182 & 78) | (i182 ^ 78))) * 433))) - 1;
                            int i184 = ~(((-79) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-79) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            int i185 = ((i184 & i180) | (i180 ^ i184)) * (-433);
                            int i186 = (i183 ^ i185) + ((i185 & i183) << 1);
                            int i187 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i180) | (i180 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            int i188 = ~(i177 | 78);
                            Object[] objArr12 = new Object[1];
                            c(new char[]{13817}, (byte) ((i186 - (~(((i188 & i187) | (i187 ^ i188)) * 433))) - 1), -TextUtils.lastIndexOf("", '0'), objArr12);
                            boolean zEquals = line2.equals((String) objArr12[0]);
                            fileReader2.close();
                            bufferedReader2.close();
                            if (zEquals) {
                                Object[] objArr13 = new Object[1];
                                c(new char[]{28, 11, 16, 6, 25, 5, 21, 0, 30, 24, 5, 26, 0, 24, 15, 21, 23, 25, 21, 2, '\n', 5, 30, 25, 23, 25, 21, 2, '\n', 5, 30, 25, 20, 7, '\f', 30}, (byte) (37 - (~(-(-TextUtils.getOffsetBefore("", 0))))), 34 - (~(-TextUtils.indexOf((CharSequence) "", '0'))), objArr13);
                                File file3 = new File((String) objArr13[0]);
                                if (!(!file3.canRead())) {
                                    FileReader fileReader3 = new FileReader(file3);
                                    BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                    try {
                                        String line3 = bufferedReader3.readLine();
                                        Object[] objArr14 = new Object[1];
                                        c(new char[]{13817}, (byte) (77 - (~(-View.MeasureSpec.makeMeasureSpec(0, 0)))), -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr14);
                                        boolean zEquals2 = line3.equals((String) objArr14[0]);
                                        fileReader3.close();
                                        bufferedReader3.close();
                                        int i189 = f1232a;
                                        int i190 = (i189 & 57) + (i189 | 57);
                                        int i191 = i190 % 128;
                                        asBinder = i191;
                                        if (i190 % 2 == 0) {
                                            int i192 = 42 / 0;
                                        }
                                        if (zEquals2) {
                                            int i193 = i191 + 121;
                                            f1232a = i193 % 128;
                                            i9 = 2;
                                            if (i193 % 2 != 0) {
                                                throw null;
                                            }
                                            if (line != null) {
                                                objArr = new Object[2];
                                                objArr[0] = new int[1];
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = com.google.android.material.R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                int i194 = (~(2130049863 | iTuitionPaymentFragmentspecialinlinedviewModeldefault4)) * TypedValues.CycleType.TYPE_EASING;
                                                int i195 = ((-1319149547) ^ i194) + ((i194 & (-1319149547)) << 1);
                                                int i196 = (i195 & (-1267798652)) + ((-1267798652) | i195);
                                                int i197 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                                int i198 = ~((i197 & 2130049863) | (i197 ^ 2130049863));
                                                int i199 = -(-(((i198 & 270587970) | (270587970 ^ i198)) * TypedValues.CycleType.TYPE_EASING));
                                                int i200 = ((i196 | i199) << 1) - (i199 ^ i196);
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = com.google.android.material.R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                int i201 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                                int i202 = ~((476512749 & i201) | (476512749 ^ i201));
                                                int i203 = (i202 & 51387394) | (i202 ^ 51387394);
                                                int i204 = ((-460332296) & i201) | (i201 ^ (-460332296));
                                                int i205 = ~i204;
                                                int i206 = (i203 & i205) | (i203 ^ i205);
                                                int i207 = ~(((-67567849) & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | ((-67567849) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                                int i208 = (-1893378314) + (((i206 & i207) | (i206 ^ i207)) * 590);
                                                int i209 = ~((i201 & 476512749) | (476512749 ^ i201));
                                                int i210 = ((i209 & 51387394) | (i209 ^ 51387394) | (~i204)) * (-1180);
                                                int i211 = ((i208 | i210) << 1) - (i210 ^ i208);
                                                int i212 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                                int i213 = ~((460332295 & i212) | (460332295 ^ i212));
                                                int i214 = ~(i212 | (-476512750));
                                                int i215 = -(-(((i214 & i213) | (i213 ^ i214)) * 590));
                                                int i216 = i200 > (i211 ^ i215) + ((i215 & i211) << 1) ? (~(i & 42)) & (i | 42) : i ^ 20;
                                                int i217 = f1232a;
                                                int i218 = (i217 ^ 71) + ((i217 & 71) << 1);
                                                asBinder = i218 % 128;
                                                int i219 = i218 % 2;
                                                String[] strArr2 = {line};
                                                int[] iArr = (int[]) objArr[0];
                                                int i220 = i217 + 29;
                                                asBinder = i220 % 128;
                                                if (i220 % 2 == 0) {
                                                    iArr[1] = i216;
                                                    objArr[1] = strArr2;
                                                } else {
                                                    iArr[0] = i216;
                                                    objArr[1] = strArr2;
                                                }
                                                int i221 = i217 + 51;
                                                asBinder = i221 % 128;
                                                int i222 = i221 % 2;
                                                c = 0;
                                            }
                                        }
                                        objArr = new Object[i9];
                                        objArr[0] = new int[]{i};
                                        int i223 = asBinder;
                                        int i224 = (i223 ^ 89) + ((i223 & 89) << 1);
                                        f1232a = i224 % 128;
                                        int i225 = i224 % 2;
                                        c = 0;
                                        objArr[1] = new String[0];
                                    } catch (Throwable th2) {
                                        fileReader3.close();
                                        bufferedReader3.close();
                                        throw th2;
                                    }
                                }
                            }
                            int i226 = ((int[]) objArr[c])[c];
                            int i227 = i ^ i99;
                            int i228 = -i227;
                            int i229 = ((i227 & i228) | (i227 ^ i228)) >> 31;
                            int i230 = (~i229) & i226;
                            int i231 = i229 & i99;
                            int i232 = (i231 & i230) | (i230 ^ i231);
                            String[] strArr3 = (String[]) objArr[1];
                            Object[] objArr15 = new Object[2];
                            int i233 = (i226 | i) & (~(i & i226));
                            int i234 = -i233;
                            int i235 = (((i233 & i234) | (i233 ^ i234)) >> 31) & 1;
                            int i236 = -i235;
                            int i237 = (~(((i236 & i235) | (i235 ^ i236)) >> 31)) & 1;
                            objArr15[i235] = null;
                            objArr15[i237] = strArr3;
                            String[] strArr4 = (String[]) objArr15[0];
                            int i238 = (~(i & i232)) & (i | i232);
                            int i239 = -i238;
                            i6 = (((i238 & i239) | (i238 ^ i239)) >> 31) & 16;
                            objArr2 = new Object[]{new int[]{i}, new int[1], new int[]{i232}, strArr4};
                            int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
                            i7 = (-981816544) + (((~((-19150814) | startElapsedRealtime2)) | 16782805) * 345) + (((~((-19150814) | (~startElapsedRealtime2))) | 4376610) * 345) + ((~(startElapsedRealtime2 | (-16782806))) * 345);
                            int i240 = asBinder;
                            i8 = (i240 ^ 17) + ((i240 & 17) << 1);
                            f1232a = i8 % 128;
                            if (i8 % 2 != 0) {
                                int i241 = (i2 - (~(i7 + i6))) - 1;
                                int i242 = i241 << 13;
                                int i243 = ((~i241) & i242) | ((~i242) & i241);
                                int i244 = i243 ^ (i243 >>> 17);
                                int i245 = i244 << 5;
                                ((int[]) objArr2[1])[0] = (i244 | i245) & (~(i244 & i245));
                                return objArr2;
                            }
                            int i246 = i2 << (i7 >> i6);
                            int i247 = (i246 ^ (-49)) + ((i246 & (-49)) << 1);
                            int i248 = ((~i246) & i247) | ((~i247) & i246);
                            int i249 = (i248 ^ 96) + ((i248 & 96) << 1);
                            int i250 = (i248 | i249) & (~(i248 & i249));
                            int i251 = i250 >> 3;
                            ((int[]) objArr2[0])[0] = ((~i250) & i251) | ((~i251) & i250);
                            return objArr2;
                        } catch (Throwable th3) {
                            fileReader2.close();
                            bufferedReader2.close();
                            throw th3;
                        }
                    }
                    int i252 = f1232a;
                    int i253 = (i252 & 23) + (i252 | 23);
                    asBinder = i253 % 128;
                    if (i253 % 2 == 0) {
                        int i254 = 3 / 3;
                    }
                } catch (Exception unused3) {
                }
                i9 = 2;
                objArr = new Object[i9];
                objArr[0] = new int[]{i};
                int i2210 = asBinder;
                int i2211 = (i2210 ^ 89) + ((i2210 & 89) << 1);
                f1232a = i2211 % 128;
                int i2212 = i2211 % 2;
                c = 0;
                objArr[1] = new String[0];
                int i2213 = ((int[]) objArr[c])[c];
                int i2214 = i ^ i99;
                int i2215 = -i2214;
                int i2216 = ((i2214 & i2215) | (i2214 ^ i2215)) >> 31;
                int i2310 = (~i2216) & i2213;
                int i2311 = i2216 & i99;
                int i2312 = (i2311 & i2310) | (i2310 ^ i2311);
                String[] strArr5 = (String[]) objArr[1];
                Object[] objArr16 = new Object[2];
                int i2313 = (i2213 | i) & (~(i & i2213));
                int i2314 = -i2313;
                int i2315 = (((i2313 & i2314) | (i2313 ^ i2314)) >> 31) & 1;
                int i2316 = -i2315;
                int i2317 = (~(((i2316 & i2315) | (i2315 ^ i2316)) >> 31)) & 1;
                objArr16[i2315] = null;
                objArr16[i2317] = strArr5;
                String[] strArr6 = (String[]) objArr16[0];
                int i2318 = (~(i & i2312)) & (i | i2312);
                int i2319 = -i2318;
                i6 = (((i2318 & i2319) | (i2318 ^ i2319)) >> 31) & 16;
                objArr2 = new Object[]{new int[]{i}, new int[1], new int[]{i2312}, strArr6};
                int startElapsedRealtime3 = (int) Process.getStartElapsedRealtime();
                i7 = (-981816544) + (((~((-19150814) | startElapsedRealtime3)) | 16782805) * 345) + (((~((-19150814) | (~startElapsedRealtime3))) | 4376610) * 345) + ((~(startElapsedRealtime3 | (-16782806))) * 345);
                int i2410 = asBinder;
                i8 = (i2410 ^ 17) + ((i2410 & 17) << 1);
                f1232a = i8 % 128;
                if (i8 % 2 != 0) {
                    int i2411 = (i2 - (~(i7 + i6))) - 1;
                    int i2412 = i2411 << 13;
                    int i2413 = ((~i2411) & i2412) | ((~i2412) & i2411);
                    int i2414 = i2413 ^ (i2413 >>> 17);
                    int i2415 = i2414 << 5;
                    ((int[]) objArr2[1])[0] = (i2414 | i2415) & (~(i2414 & i2415));
                    return objArr2;
                }
                int i2416 = i2 << (i7 >> i6);
                int i2417 = (i2416 ^ (-49)) + ((i2416 & (-49)) << 1);
                int i2418 = ((~i2416) & i2417) | ((~i2417) & i2416);
                int i2419 = (i2418 ^ 96) + ((i2418 & 96) << 1);
                int i255 = (i2418 | i2419) & (~(i2418 & i2419));
                int i256 = i255 >> 3;
                ((int[]) objArr2[0])[0] = ((~i255) & i256) | ((~i256) & i255);
                return objArr2;
            } catch (Throwable th4) {
                Throwable cause = th4.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th4;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(byte r5, int r6, int r7) {
            /*
                int r7 = r7 * 3
                int r7 = r7 + 1
                int r5 = 116 - r5
                int r6 = r6 * 3
                int r6 = 4 - r6
                byte[] r0 = isUseCaseActive.TuitionPaymentFragmentbindingInflater1.$$c
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r4 = r5
                r5 = r7
                r3 = r2
                goto L25
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r5
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L23
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L23:
                r4 = r0[r6]
            L25:
                int r5 = r5 + r4
                int r6 = r6 + 1
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: isUseCaseActive.TuitionPaymentFragmentbindingInflater1.$$e(byte, int, int):java.lang.String");
        }
    }
}
