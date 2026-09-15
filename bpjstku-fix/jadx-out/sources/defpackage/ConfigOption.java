package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class ConfigOption {
    private static final ThreadLocal<char[]> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ThreadLocal<char[]>() { // from class: ConfigOption.4
        private static final byte[] $$c = {113, 29, -123, -97};
        private static final int $$d = 66;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {106, -22, 107, 95, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 196;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722251;

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r7, int r8, byte r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 + 1
                int r9 = r9 * 14
                int r9 = 98 - r9
                int r8 = r8 + 4
                byte[] r0 = defpackage.ConfigOption.AnonymousClass4.$$a
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L13
                r3 = r9
                r5 = r2
                r9 = r8
                goto L2a
            L13:
                r3 = r2
            L14:
                int r8 = r8 + 1
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L25:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r6
            L2a:
                int r8 = r8 + r3
                int r8 = r8 + (-11)
                r3 = r5
                r6 = r9
                r9 = r8
                r8 = r6
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ConfigOption.AnonymousClass4.c(short, int, byte, java.lang.Object[]):void");
        }

        private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
            char[] cArr2;
            int i4 = 2 % 2;
            setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
            char[] cArr3 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i5 = $10 + 73;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i7]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", ""), ExpandableListView.getPackedPositionType(0L) + 3291, 31 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1199271174, false, $$e(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 651 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 44 - View.combineMeasuredStates(0, 0), -450685997, false, $$e(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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
            }
            if (i3 > 0) {
                int i8 = $10 + 63;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                char[] cArr4 = new char[i2];
                System.arraycopy(cArr3, 0, cArr4, 0, i2);
                System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                int i10 = $10 + 69;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 4 % 2;
                }
            }
            if (z) {
                int i12 = $11 + 95;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr2 = new char[i2];
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                } else {
                    cArr2 = new char[i2];
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                }
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.resolveSize(0, 0), (Process.myPid() >> 22) + 651, 44 - View.MeasureSpec.getMode(0), -450685997, false, $$e(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
                int i13 = $10 + 77;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr3 = cArr2;
            }
            objArr[0] = new String(cArr3);
        }

        @Override // java.lang.ThreadLocal
        protected /* synthetic */ char[] initialValue() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 109;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            char[] cArr = new char[1024];
            int i5 = i2 + 89;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            return cArr;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x04e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:29:0x047e  */
        /* JADX WARN: Code duplicated, block: B:31:0x0487  */
        /* JADX WARN: Code duplicated, block: B:40:0x04ea  */
        /* JADX WARN: Code duplicated, block: B:44:0x059f A[Catch: all -> 0x06a2, TryCatch #0 {all -> 0x06a2, blocks: (B:42:0x0592, B:44:0x059f, B:45:0x05df), top: B:92:0x0592, outer: #4 }] */
        /* JADX WARN: Code duplicated, block: B:53:0x06ab A[Catch: Exception -> 0x07d1, TRY_LEAVE, TryCatch #4 {Exception -> 0x07d1, blocks: (B:37:0x04e4, B:41:0x04f5, B:47:0x063f, B:49:0x06a3, B:51:0x06a9, B:52:0x06aa, B:53:0x06ab, B:58:0x07b1, B:62:0x07c9, B:64:0x07cf, B:65:0x07d0, B:42:0x0592, B:44:0x059f, B:45:0x05df, B:54:0x0758, B:56:0x0765, B:57:0x07aa), top: B:100:0x04e4, inners: #0, #3 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x0765 A[Catch: all -> 0x07c8, TryCatch #3 {all -> 0x07c8, blocks: (B:54:0x0758, B:56:0x0765, B:57:0x07aa), top: B:98:0x0758, outer: #4 }] */
        /* JADX WARN: Code duplicated, block: B:60:0x07b7  */
        /* JADX WARN: Code duplicated, block: B:66:0x07d1  */
        /* JADX WARN: Code duplicated, block: B:69:0x0802  */
        /* JADX WARN: Code duplicated, block: B:72:0x0838  */
        /* JADX WARN: Code duplicated, block: B:73:0x0846  */
        /* JADX WARN: Code duplicated, block: B:76:0x088f  */
        /* JADX WARN: Code duplicated, block: B:77:0x08c5  */
        /* JADX WARN: Code duplicated, block: B:80:0x090f  */
        /* JADX WARN: Code duplicated, block: B:82:0x092a  */
        /* JADX WARN: Code duplicated, block: B:84:0x0941  */
        public static Object[] b(Context context, int i, int i2, int i3) throws Throwable {
            int i4;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            String str;
            Object[] objArr;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            Object[] objArr2;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16 = 2 % 2;
            int i17 = TuitionPaymentFragmentbindingInflater1;
            int i18 = (i17 ^ 119) + ((i17 & 119) << 1);
            int i19 = i18 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19;
            int i20 = i18 % 2;
            if (context != null) {
                int i21 = i19 + 89;
                TuitionPaymentFragmentbindingInflater1 = i21 % 128;
                int i22 = i21 % 2;
                try {
                    int i23 = -TextUtils.lastIndexOf("", '0', 0);
                    int i24 = ~i23;
                    int i25 = ~i;
                    int i26 = ~(i24 | (-252) | i25);
                    int i27 = ~(i23 | 251);
                    int i28 = (i26 ^ i27) | (i27 & i26);
                    int i29 = ~((i & 251) | (i ^ 251));
                    int i30 = ((i23 * 69) - 16817) + (((i29 & i28) | (i28 ^ i29)) * (-68));
                    int i31 = (i24 ^ i25) | (i24 & i25);
                    int i32 = -(-((~((i31 & 251) | (i31 ^ 251))) * (-68)));
                    int i33 = (i30 & i32) + (i32 | i30);
                    int i34 = -(-(((~i23) | (~(((-252) & i25) | ((-252) ^ i25)))) * 68));
                    int i35 = (i33 & i34) + (i34 | i33);
                    int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 16;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i36 = keyRepeatDelay * 659;
                    int i37 = (i36 & (-15111)) + (i36 | (-15111));
                    int i38 = ~((~keyRepeatDelay) | 23);
                    int i39 = ~(((-24) & keyRepeatDelay) | ((-24) ^ keyRepeatDelay));
                    int i40 = (i38 & i39) | (i38 ^ i39);
                    int i41 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & keyRepeatDelay) | (keyRepeatDelay ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i42 = ~i41;
                    int i43 = i37 + (((i40 ^ i42) | (i40 & i42)) * (-658));
                    int i44 = (~(keyRepeatDelay | (-24))) * 658;
                    Object[] objArr3 = new Object[1];
                    a(false, i35, (((i43 & i44) + (i44 | i43)) - (~(((~i41) | i39) * 658))) - 1, 7 - TextUtils.lastIndexOf("", '0', 0), new char[]{65481, 65502, '\n', '\t', 15, 0, 19, 15, 65532, '\t', 65535, '\r', '\n', 4, 65535, 65481, 65534, '\n', '\t', 15, 0, '\t', 15}, objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    int i45 = 254 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int i46 = 17 - (~(-TextUtils.indexOf("", "", 0)));
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0);
                    Object[] objArr4 = new Object[1];
                    a(false, i45, i46, ((iIndexOf | 10) << 1) - (iIndexOf ^ 10), new char[]{65530, '\r', 2, '\b', 7, 65506, 7, 65535, '\b', 0, 65534, '\r', 65498, '\t', '\t', 5, 2, 65532}, objArr4);
                    Object objInvoke = cls.getMethod((String) objArr4[0], null).invoke(context, null);
                    int i47 = -TextUtils.getOffsetBefore("", 0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i48 = i47 * 860;
                    int i49 = (i48 & (-214500)) + (i48 | (-214500));
                    int i50 = -(-(((i47 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i47 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2)) * (-859)));
                    int i51 = (i49 & i50) + (i50 | i49);
                    int i52 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i53 = ~((i52 & i47) | (i52 ^ i47));
                    int i54 = ~i47;
                    int i55 = (i54 & (-251)) | (i54 ^ (-251));
                    int i56 = ~((i55 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i55 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                    int i57 = (i51 - (~(-(-(((i53 & i56) | (i53 ^ i56)) * 859))))) - 1;
                    int i58 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
                    TuitionPaymentFragmentbindingInflater1 = i58 % 128;
                    int i59 = i58 % 2;
                    int i60 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i61 = i57 + (859 * ((~(i47 | (-251))) | (~((i60 & (-251)) | ((-251) ^ i60)))));
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i62 = packedPositionChild * (-501);
                    int i63 = ((i62 | 17605) << 1) - (i62 ^ 17605);
                    int i64 = ~(((-36) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-36) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    int i65 = ~((packedPositionChild ^ 35) | (packedPositionChild & 35));
                    int i66 = -(-(((i64 & i65) | (i64 ^ i65)) * (-502)));
                    int i67 = (i63 & i66) + (i66 | i63);
                    int i68 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i69 = (i68 & (-36)) | ((-36) ^ i68);
                    int i70 = -(-((~((i69 & packedPositionChild) | (i69 ^ packedPositionChild))) * (-502)));
                    int i71 = ~packedPositionChild;
                    int i72 = ~((i71 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i71 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    int i73 = (((i67 & i70) + (i70 | i67)) - (~(((i72 & (-36)) | ((-36) ^ i72)) * TypedValues.PositionType.TYPE_DRAWPATH))) - 1;
                    int iAxisFromString = MotionEvent.axisFromString("");
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i74 = TuitionPaymentFragmentbindingInflater1;
                    int i75 = ((i74 | 101) << 1) - (i74 ^ 101);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i75 % 128;
                    int i76 = i75 % 2;
                    int i77 = iAxisFromString * (-183);
                    int i78 = ((i77 | (-2013)) << 1) - (i77 ^ (-2013));
                    int i79 = ~iAxisFromString;
                    int i80 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i81 = ~((i79 ^ i80) | (i79 & i80) | 11);
                    int i82 = ~(((-12) ^ i80) | ((-12) & i80) | iAxisFromString);
                    int i83 = (i78 - (~(-(-(((i81 ^ i82) | (i81 & i82)) * (-184)))))) - 1;
                    int i84 = ~((i79 ^ (-12)) | (i79 & (-12)));
                    int i85 = ~iAxisFromString;
                    int i86 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i87 = i84 | (~((i85 & i86) | (i85 ^ i86)));
                    int i88 = ~((i86 & (-12)) | ((-12) ^ i86));
                    int i89 = ((i88 & i87) | (i87 ^ i88)) * 184;
                    Object[] objArr5 = new Object[1];
                    a(true, i61, i73, (i83 ^ i89) + ((i89 & i83) << 1) + (((iAxisFromString & 11) | (iAxisFromString ^ 11)) * 184), new char[]{'\f', 0, 65483, 1, 6, '\f', 15, 1, 11, 65534, '\f', 3, 11, 65510, 11, '\f', 6, 17, 65534, 0, 6, '\t', '\r', '\r', 65502, 65483, '\n', '\r', 65483, 17, 11, 2, 17, 11}, objArr5);
                    Class<?> cls2 = Class.forName((String) objArr5[0]);
                    int deadChar = KeyEvent.getDeadChar(0, 0);
                    int i90 = TuitionPaymentFragmentbindingInflater1 + 95;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i90 % 128;
                    int i91 = i90 % 2;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i92 = deadChar * (-419);
                    int i93 = ((i92 | 107776) << 1) - (i92 ^ 107776);
                    int i94 = -(-((~((256 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (256 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) * TypedValues.CycleType.TYPE_EASING));
                    int i95 = ((i93 | i94) << 1) - (i94 ^ i93);
                    int i96 = ~deadChar;
                    int i97 = -(-((256 | i96) * (-420)));
                    int i98 = (i95 & i97) + (i97 | i95);
                    int i99 = ~((i96 & (-257)) | (i96 ^ (-257)));
                    int i100 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                    int i101 = ~((i100 & 256) | (i100 ^ 256));
                    int i102 = ((i99 & i101) | (i99 ^ i101)) * TypedValues.CycleType.TYPE_EASING;
                    int i103 = (i98 & i102) + (i102 | i98);
                    int i104 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int i105 = (i104 * 70) - 272;
                    int i106 = ~i104;
                    int i107 = (i106 ^ (-5)) | (i106 & (-5));
                    int i108 = -(-(((~((i107 & i) | (i107 ^ i))) | (~((i104 ^ 4) | (i104 & 4) | i))) * 69));
                    int i109 = (i105 ^ i108) + ((i105 & i108) << 1);
                    int i110 = ~i104;
                    int i111 = ~((i110 & 4) | (i110 ^ 4));
                    int i112 = ~((i106 & i) | (i106 ^ i));
                    int i113 = (i111 & i112) | (i111 ^ i112);
                    int i114 = ~((i ^ 4) | (i & 4));
                    int i115 = ((i113 & i114) | (i113 ^ i114)) * (-69);
                    int i116 = (((i109 & i115) + (i115 | i109)) - (~(-(-((~((i104 & (-5)) | ((-5) ^ i104))) * 69))))) - 1;
                    int i117 = -(ViewConfiguration.getTapTimeout() >> 16);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i118 = i117 * 70;
                    int i119 = (i118 & (-272)) + (i118 | (-272));
                    int i120 = ~i117;
                    int i121 = (i120 ^ (-5)) | (i120 & (-5));
                    int i122 = ~((i121 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i121 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                    int i123 = (i117 ^ 4) | (i117 & 4);
                    int i124 = ~((i123 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i123 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                    int i125 = (i119 - (~(-(-(((i122 ^ i124) | (i124 & i122)) * 69))))) - 1;
                    int i126 = ~i117;
                    int i127 = ~((i126 & 4) | (i126 ^ 4));
                    int i128 = ~((i120 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i120 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                    int i129 = (i128 & i127) | (i127 ^ i128);
                    int i130 = ~((4 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (4 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                    int i131 = (-69) * ((i130 & i129) | (i129 ^ i130));
                    int i132 = (i125 ^ i131) + ((i131 & i125) << 1);
                    int i133 = -(-((~((i117 & (-5)) | ((-5) ^ i117))) * 69));
                    Object[] objArr6 = new Object[1];
                    a(false, i103, i116, (i132 ^ i133) + ((i133 & i132) << 1), new char[]{3, 65528, 65534, '\n', 65533}, objArr6);
                    int i134 = cls2.getField((String) objArr6[0]).getInt(objInvoke) & 2;
                    int i135 = -i134;
                    int i136 = ((i134 & i135) | (i134 ^ i135)) >> 31;
                    i4 = (i136 & (~(i & 1)) & (i | 1)) | ((~i136) & i);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                i4 = i;
            }
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char windowTouchSlop = (char) (16949 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    int edgeSlop = 2739 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 13;
                    byte[] bArr = $$a;
                    Object[] objArr7 = new Object[1];
                    c((byte) 52, bArr[5], bArr[132], objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(windowTouchSlop, edgeSlop, absoluteGravity, 1501733736, false, (String) objArr7[0], new Class[0]);
                }
                Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, null);
                int i137 = TuitionPaymentFragmentbindingInflater1;
                int i138 = (i137 & 99) + (i137 | 99);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i138 % 128;
                int i139 = i138 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                if (i139 == 0) {
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 16949);
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2739;
                        int packedPositionType = 13 - ExpandableListView.getPackedPositionType(0L);
                        byte b = (byte) 52;
                        Object[] objArr8 = new Object[1];
                        c(b, (short) (b - 1), $$a[132], objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, doubleTapTimeout, packedPositionType, 47863026, false, (String) objArr8[0], null);
                    }
                    if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cGreen = (char) (16949 - Color.green(0));
                            int jumpTapTimeout = 2739 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int iIndexOf2 = 12 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            byte b2 = (byte) 37;
                            Object[] objArr9 = new Object[1];
                            c(b2, (short) (b2 | 66), $$a[132], objArr9);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, jumpTapTimeout, iIndexOf2, 631063962, false, (String) objArr9[0], null);
                        }
                        if (!(!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null)))) {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i140 = TuitionPaymentFragmentbindingInflater1 + 59;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i140 % 128;
                                int i141 = i140 % 2;
                                int i142 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                int i143 = (i142 & 245) + (i142 | 245);
                                int i144 = -TextUtils.indexOf("", "", 0, 0);
                                int i145 = ~i;
                                int i146 = ~(((-29) & i145) | ((-29) ^ i145));
                                int i147 = ~((i144 ^ i) | (i144 & i));
                                int i148 = ((i144 * 960) - 53676) + (((i146 & i147) | (i146 ^ i147)) * 959) + 27811;
                                int i149 = ~((-29) | i);
                                int i150 = ~((i144 & i145) | (i145 ^ i144));
                                int i151 = (i148 - (~(((i150 & i149) | (i149 ^ i150)) * 959))) - 1;
                                int iKeyCodeFromString = KeyEvent.keyCodeFromString("");
                                int i152 = iKeyCodeFromString * (-167);
                                int i153 = ((i152 | (-4008)) << 1) - (i152 ^ (-4008));
                                int i154 = ~iKeyCodeFromString;
                                int i155 = ~((i154 & (-25)) | (i154 ^ (-25)));
                                int i156 = ~(((-25) ^ i) | ((-25) & i));
                                int i157 = -(-(((i155 & i156) | (i155 ^ i156)) * 336));
                                int i158 = (i153 ^ i157) + ((i157 & i153) << 1);
                                int i159 = ~((iKeyCodeFromString ^ 24) | (iKeyCodeFromString & 24));
                                int i160 = ~((iKeyCodeFromString ^ i) | (iKeyCodeFromString & i));
                                int i161 = -(-(((i159 & i160) | (i159 ^ i160)) * (-168)));
                                Object[] objArr10 = new Object[1];
                                a(true, i143, i151, (i158 & i161) + (i161 | i158) + (((~((iKeyCodeFromString & i145) | (i145 ^ iKeyCodeFromString))) | (-25)) * 168), new char[]{14, 4, 3, '\t', '\t', 23, 4, 7, 6, 65487, 6, '\r', 14, 14, 65489, 22, 11, 16, 11, 65489, 5, 22, 7, 65489, 5, 20, 65488, 7}, objArr10);
                                Object[] objArr11 = {(String) objArr10[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int i162 = 994 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    int i163 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8;
                                    byte b3 = $$a[7];
                                    byte b4 = b3;
                                    Object[] objArr12 = new Object[1];
                                    c(b4, (short) (b4 | 140), b3, objArr12);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i162, i163, 410748506, false, (String) objArr12[0], new Class[]{String.class});
                                }
                                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr11)).longValue();
                                long j = 1521906726;
                                long j2 = -1;
                                long j3 = jLongValue ^ j2;
                                long j4 = i;
                                long j5 = (j | j4) ^ j2;
                                long j6 = 407;
                                long j7 = j ^ j2;
                                long j8 = (j7 | jLongValue) ^ j2;
                                long j9 = (((long) (-813)) * j) + (((long) 408) * jLongValue) + (((long) (-814)) * (((j3 | j) ^ j2) | j5)) + ((((j3 | (j4 ^ j2)) ^ j2) | j8 | j5) * j6) + (j6 * (j8 | ((j7 | j4) ^ j2) | ((jLongValue | j4) ^ j2))) + ((long) (-1722824963));
                                int i164 = (int) (j9 >> 32);
                                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                                int i165 = ~iFreeMemory;
                                int i166 = 955794966 + (((~((-1899516724) | i165)) | 1075838994) * (-1188));
                                int i167 = (~(iFreeMemory | 1899516723)) | 1075838994;
                                int i168 = ~((-958224162) | i165);
                                int i169 = i164 & (i166 + ((i167 | i168) * 594) + (((~(1899516723 | i165)) | 134546432 | i168) * 594));
                                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                                i5 = i169 | (((int) j9) & ((-1090125254) + ((~((~iMaxMemory) | (-1111822737))) * 433) + (((~(1139773850 | iMaxMemory)) | 297452559) * (-433)) + (((~(iMaxMemory | 297452559)) | 27951114) * 433)));
                            } else {
                                int i170 = 199 - (~(-View.resolveSizeAndState(0, 0, 0)));
                                int i171 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                int i172 = -View.resolveSize(0, 0);
                                Object[] objArr13 = new Object[1];
                                a(false, i170, (i171 & 1) + (i171 | 1), ((i172 | 1) << 1) - (i172 ^ 1), new char[]{0}, objArr13);
                                str = (String) objArr13[0];
                                int iAxisFromString2 = 249 - MotionEvent.axisFromString("");
                                int touchSlop = ViewConfiguration.getTouchSlop() >> 8;
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i173 = touchSlop * 465;
                                int i174 = (i173 ^ (-6019)) + ((i173 & (-6019)) << 1);
                                int i175 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                int i176 = ((-14) & touchSlop) | ((-14) ^ touchSlop);
                                int i177 = i174 + (((~((i175 & touchSlop) | (i175 ^ touchSlop))) | (~((-14) | i175)) | (~i176)) * 464);
                                int i178 = ~touchSlop;
                                int i179 = (i178 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault7 ^ i178);
                                int i180 = i177 + (((i179 & (-14)) | (i179 ^ (-14))) * (-464));
                                int i181 = ~i176;
                                int i182 = ~((touchSlop & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (touchSlop ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                int i183 = -(-(((i182 & i181) | (i181 ^ i182)) * 464));
                                int i184 = ((i180 | i183) << 1) - (i183 ^ i180);
                                int i185 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                Object[] objArr14 = new Object[1];
                                a(false, iAxisFromString2, i184, (i185 ^ 9) + ((i185 & 9) << 1), new char[]{2, 65535, 18, 4, 4, 65534, 65535, '\t', 2, 15, '\f', 65483, 1}, objArr14);
                                objArr = new Object[]{(String) objArr14[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char offsetBefore = (char) (33602 - TextUtils.getOffsetBefore("", 0));
                                    int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 3085;
                                    int iMyPid = 26 - (Process.myPid() >> 22);
                                    byte b5 = $$a[7];
                                    byte b6 = b5;
                                    Object[] objArr15 = new Object[1];
                                    c(b6, (short) (b6 | 140), b5, objArr15);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetBefore, edgeSlop2, iMyPid, 1411172903, false, (String) objArr15[0], new Class[]{String.class});
                                }
                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr))) {
                                    int i186 = TuitionPaymentFragmentbindingInflater1;
                                    int i187 = (i186 ^ 107) + ((i186 & 107) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i187 % 128;
                                    int i188 = i187 % 2;
                                    i5 = 1;
                                } else {
                                    i5 = 0;
                                }
                            }
                            int i189 = -i5;
                            int i190 = ((i5 & i189) | (i5 ^ i189)) >> 31;
                            i6 = (i190 & (~(i & 10)) & (i | 10)) | ((~i190) & i);
                            int i191 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i192 = (i191 ^ 31) + ((i191 & 31) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i192 % 128;
                            int i193 = i192 % 2;
                            int i194 = i2 & 32;
                            i7 = (i194 | (-i194)) >> 31;
                            i8 = i191 + 21;
                            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                            if (i8 % 2 == 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            int i195 = i6 & (~i7);
                            int i196 = i & i7;
                            i9 = (i195 & i196) | (i195 ^ i196);
                        }
                    }
                    int i197 = i ^ i4;
                    int i198 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i199 = (i198 ^ 117) + ((i198 & 117) << 1);
                    int i200 = i199 % 128;
                    TuitionPaymentFragmentbindingInflater1 = i200;
                    int i201 = i199 % 2;
                    int i202 = (i197 | (-i197)) >> 31;
                    int i203 = i9 & (~i202);
                    int i204 = i4 & i202;
                    int i205 = (i203 & i204) | (i203 ^ i204);
                    objArr2 = new Object[4];
                    i10 = ((i200 | 113) << 1) - (i200 ^ 113);
                    int i206 = i10 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i206;
                    if (i10 % 2 != 0) {
                        objArr2[1] = new int[1];
                        objArr2[0] = new int[1];
                        objArr2[2] = new int[0];
                    } else {
                        objArr2[0] = new int[1];
                        objArr2[1] = new int[1];
                        objArr2[2] = new int[1];
                    }
                    int i207 = (~(i & i205)) & (i | i205);
                    int i208 = -i207;
                    i11 = (((i207 & i208) | (i207 ^ i208)) >> 31) & 16;
                    int[] iArr = (int[]) objArr2[0];
                    int i209 = ((i206 | 31) << 1) - (i206 ^ 31);
                    TuitionPaymentFragmentbindingInflater1 = i209 % 128;
                    int i210 = i209 % 2;
                    iArr[0] = i;
                    ((int[]) objArr2[2])[0] = i205;
                    objArr2[3] = null;
                    i12 = (i206 & 17) + (i206 | 17);
                    TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i211 = -((2063533684 + ((230372955 | i) * 376) + (((~((~i) | 437348024)) | 95031363) * (-376)) + (((~((-437348025) | i)) | (-397037796)) * 376)) * i11);
                        int i212 = (i3 ^ i211) + ((i3 & i211) << 1);
                        int i213 = i212 / 94;
                        i13 = (i213 & (~i212)) | ((~i213) & i212);
                        i14 = 106;
                    } else {
                        int i214 = (int) Runtime.getRuntime().totalMemory();
                        int i215 = ~i214;
                        int i216 = 323825756 + ((1048435583 | i214) * (-676)) + (((~(544528723 | i215)) | (-1048435584)) * 676) + (((~(i214 | (-503906861))) | (~(i215 | 504218494)) | 544217089) * 676);
                        int i217 = -(-i11);
                        int i218 = i3 + (i216 & i217) + (i217 | i216);
                        i13 = i218 ^ (i218 << 13);
                        i14 = 17;
                    }
                    i15 = TuitionPaymentFragmentbindingInflater1 + 73;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                    if (i15 % 2 != 0) {
                        int i219 = i13 % i14;
                        int i220 = (i13 | i219) & (~(i13 & i219));
                        int i221 = (i220 ^ (-2)) + ((i220 & (-2)) << 1);
                        ((int[]) objArr2[1])[0] = (i220 | i221) & (~(i220 & i221));
                        return objArr2;
                    }
                    int i222 = i13 >>> i14;
                    int i223 = (i13 | i222) & (~(i13 & i222));
                    int i224 = i223 << 5;
                    ((int[]) objArr2[1])[0] = (i223 | i224) & (~(i223 & i224));
                    return objArr2;
                }
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char offsetAfter = (char) (16949 - TextUtils.getOffsetAfter("", 0));
                    int keyRepeatDelay2 = 2739 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13;
                    byte b7 = (byte) 52;
                    Object[] objArr16 = new Object[1];
                    c(b7, (short) (b7 - 1), $$a[132], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetAfter, keyRepeatDelay2, scrollBarFadeDuration, 47863026, false, (String) objArr16[0], null);
                }
                int i225 = 22 / 0;
                if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cGreen2 = (char) (16949 - Color.green(0));
                        int jumpTapTimeout2 = 2739 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int iIndexOf3 = 12 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        byte b8 = (byte) 37;
                        Object[] objArr17 = new Object[1];
                        c(b8, (short) (b8 | 66), $$a[132], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen2, jumpTapTimeout2, iIndexOf3, 631063962, false, (String) objArr17[0], null);
                    }
                    if (!(!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null)))) {
                        try {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i1410 = TuitionPaymentFragmentbindingInflater1 + 59;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1410 % 128;
                                int i1411 = i1410 % 2;
                                int i1412 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                int i1413 = (i1412 & 245) + (i1412 | 245);
                                int i1414 = -TextUtils.indexOf("", "", 0, 0);
                                int i1415 = ~i;
                                int i1416 = ~(((-29) & i1415) | ((-29) ^ i1415));
                                int i1417 = ~((i1414 ^ i) | (i1414 & i));
                                int i1418 = ((i1414 * 960) - 53676) + (((i1416 & i1417) | (i1416 ^ i1417)) * 959) + 27811;
                                int i1419 = ~((-29) | i);
                                int i1510 = ~((i1414 & i1415) | (i1415 ^ i1414));
                                int i1511 = (i1418 - (~(((i1510 & i1419) | (i1419 ^ i1510)) * 959))) - 1;
                                int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("");
                                int i1512 = iKeyCodeFromString2 * (-167);
                                int i1513 = ((i1512 | (-4008)) << 1) - (i1512 ^ (-4008));
                                int i1514 = ~iKeyCodeFromString2;
                                int i1515 = ~((i1514 & (-25)) | (i1514 ^ (-25)));
                                int i1516 = ~(((-25) ^ i) | ((-25) & i));
                                int i1517 = -(-(((i1515 & i1516) | (i1515 ^ i1516)) * 336));
                                int i1518 = (i1513 ^ i1517) + ((i1517 & i1513) << 1);
                                int i1519 = ~((iKeyCodeFromString2 ^ 24) | (iKeyCodeFromString2 & 24));
                                int i1610 = ~((iKeyCodeFromString2 ^ i) | (iKeyCodeFromString2 & i));
                                int i1611 = -(-(((i1519 & i1610) | (i1519 ^ i1610)) * (-168)));
                                Object[] objArr18 = new Object[1];
                                a(true, i1413, i1511, (i1518 & i1611) + (i1611 | i1518) + (((~((iKeyCodeFromString2 & i1415) | (i1415 ^ iKeyCodeFromString2))) | (-25)) * 168), new char[]{14, 4, 3, '\t', '\t', 23, 4, 7, 6, 65487, 6, '\r', 14, 14, 65489, 22, 11, 16, 11, 65489, 5, 22, 7, 65489, 5, 20, 65488, 7}, objArr18);
                                try {
                                    Object[] objArr19 = {(String) objArr18[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int i1612 = 994 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                        int i1613 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8;
                                        byte b9 = $$a[7];
                                        byte b10 = b9;
                                        Object[] objArr110 = new Object[1];
                                        c(b10, (short) (b10 | 140), b9, objArr110);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, i1612, i1613, 410748506, false, (String) objArr110[0], new Class[]{String.class});
                                    }
                                    long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr19)).longValue();
                                    long j10 = 1521906726;
                                    long j11 = -1;
                                    long j12 = jLongValue2 ^ j11;
                                    long j13 = i;
                                    long j14 = (j10 | j13) ^ j11;
                                    long j15 = 407;
                                    long j16 = j10 ^ j11;
                                    long j17 = (j16 | jLongValue2) ^ j11;
                                    long j18 = (((long) (-813)) * j10) + (((long) 408) * jLongValue2) + (((long) (-814)) * (((j12 | j10) ^ j11) | j14)) + ((((j12 | (j13 ^ j11)) ^ j11) | j17 | j14) * j15) + (j15 * (j17 | ((j16 | j13) ^ j11) | ((jLongValue2 | j13) ^ j11))) + ((long) (-1722824963));
                                    int i1614 = (int) (j18 >> 32);
                                    int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                                    int i1615 = ~iFreeMemory2;
                                    int i1616 = 955794966 + (((~((-1899516724) | i1615)) | 1075838994) * (-1188));
                                    int i1617 = (~(iFreeMemory2 | 1899516723)) | 1075838994;
                                    int i1618 = ~((-958224162) | i1615);
                                    int i1619 = i1614 & (i1616 + ((i1617 | i1618) * 594) + (((~(1899516723 | i1615)) | 134546432 | i1618) * 594));
                                    int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
                                    i5 = i1619 | (((int) j18) & ((-1090125254) + ((~((~iMaxMemory2) | (-1111822737))) * 433) + (((~(1139773850 | iMaxMemory2)) | 297452559) * (-433)) + (((~(iMaxMemory2 | 297452559)) | 27951114) * 433)));
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            } else {
                                int i1710 = 199 - (~(-View.resolveSizeAndState(0, 0, 0)));
                                int i1711 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                int i1712 = -View.resolveSize(0, 0);
                                Object[] objArr111 = new Object[1];
                                a(false, i1710, (i1711 & 1) + (i1711 | 1), ((i1712 | 1) << 1) - (i1712 ^ 1), new char[]{0}, objArr111);
                                str = (String) objArr111[0];
                                int iAxisFromString3 = 249 - MotionEvent.axisFromString("");
                                int touchSlop2 = ViewConfiguration.getTouchSlop() >> 8;
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i1713 = touchSlop2 * 465;
                                int i1714 = (i1713 ^ (-6019)) + ((i1713 & (-6019)) << 1);
                                int i1715 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                int i1716 = ((-14) & touchSlop2) | ((-14) ^ touchSlop2);
                                int i1717 = i1714 + (((~((i1715 & touchSlop2) | (i1715 ^ touchSlop2))) | (~((-14) | i1715)) | (~i1716)) * 464);
                                int i1718 = ~touchSlop2;
                                int i1719 = (i1718 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 ^ i1718);
                                int i1810 = i1717 + (((i1719 & (-14)) | (i1719 ^ (-14))) * (-464));
                                int i1811 = ~i1716;
                                int i1812 = ~((touchSlop2 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (touchSlop2 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                                int i1813 = -(-(((i1812 & i1811) | (i1811 ^ i1812)) * 464));
                                int i1814 = ((i1810 | i1813) << 1) - (i1813 ^ i1810);
                                int i1815 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                Object[] objArr112 = new Object[1];
                                a(false, iAxisFromString3, i1814, (i1815 ^ 9) + ((i1815 & 9) << 1), new char[]{2, 65535, 18, 4, 4, 65534, 65535, '\t', 2, 15, '\f', 65483, 1}, objArr112);
                                try {
                                    objArr = new Object[]{(String) objArr112[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char offsetBefore2 = (char) (33602 - TextUtils.getOffsetBefore("", 0));
                                        int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 3085;
                                        int iMyPid2 = 26 - (Process.myPid() >> 22);
                                        byte b11 = $$a[7];
                                        byte b12 = b11;
                                        Object[] objArr113 = new Object[1];
                                        c(b12, (short) (b12 | 140), b11, objArr113);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetBefore2, edgeSlop3, iMyPid2, 1411172903, false, (String) objArr113[0], new Class[]{String.class});
                                    }
                                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr))) {
                                        int i1816 = TuitionPaymentFragmentbindingInflater1;
                                        int i1817 = (i1816 ^ 107) + ((i1816 & 107) << 1);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1817 % 128;
                                        int i1818 = i1817 % 2;
                                        i5 = 1;
                                    } else {
                                        i5 = 0;
                                    }
                                } catch (Throwable th3) {
                                    Throwable cause3 = th3.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th3;
                                }
                            }
                        } catch (Exception unused) {
                            i5 = 0;
                        }
                        int i1819 = -i5;
                        int i1910 = ((i5 & i1819) | (i5 ^ i1819)) >> 31;
                        i6 = (i1910 & (~(i & 10)) & (i | 10)) | ((~i1910) & i);
                        int i1911 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i1912 = (i1911 ^ 31) + ((i1911 & 31) << 1);
                        TuitionPaymentFragmentbindingInflater1 = i1912 % 128;
                        int i1913 = i1912 % 2;
                        int i1914 = i2 & 32;
                        i7 = (i1914 | (-i1914)) >> 31;
                        i8 = i1911 + 21;
                        TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                        if (i8 % 2 == 0) {
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        int i1915 = i6 & (~i7);
                        int i1916 = i & i7;
                        i9 = (i1915 & i1916) | (i1915 ^ i1916);
                    }
                }
                int i1917 = i ^ i4;
                int i1918 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i1919 = (i1918 ^ 117) + ((i1918 & 117) << 1);
                int i2010 = i1919 % 128;
                TuitionPaymentFragmentbindingInflater1 = i2010;
                int i2011 = i1919 % 2;
                int i2012 = (i1917 | (-i1917)) >> 31;
                int i2013 = i9 & (~i2012);
                int i2014 = i4 & i2012;
                int i2015 = (i2013 & i2014) | (i2013 ^ i2014);
                objArr2 = new Object[4];
                i10 = ((i2010 | 113) << 1) - (i2010 ^ 113);
                int i2016 = i10 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2016;
                if (i10 % 2 != 0) {
                    objArr2[1] = new int[1];
                    objArr2[0] = new int[1];
                    objArr2[2] = new int[0];
                } else {
                    objArr2[0] = new int[1];
                    objArr2[1] = new int[1];
                    objArr2[2] = new int[1];
                }
                int i2017 = (~(i & i2015)) & (i | i2015);
                int i2018 = -i2017;
                i11 = (((i2017 & i2018) | (i2017 ^ i2018)) >> 31) & 16;
                int[] iArr2 = (int[]) objArr2[0];
                int i2019 = ((i2016 | 31) << 1) - (i2016 ^ 31);
                TuitionPaymentFragmentbindingInflater1 = i2019 % 128;
                int i2110 = i2019 % 2;
                iArr2[0] = i;
                ((int[]) objArr2[2])[0] = i2015;
                objArr2[3] = null;
                i12 = (i2016 & 17) + (i2016 | 17);
                TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                if (i12 % 2 == 0) {
                    int i2111 = -((2063533684 + ((230372955 | i) * 376) + (((~((~i) | 437348024)) | 95031363) * (-376)) + (((~((-437348025) | i)) | (-397037796)) * 376)) * i11);
                    int i2112 = (i3 ^ i2111) + ((i3 & i2111) << 1);
                    int i2113 = i2112 / 94;
                    i13 = (i2113 & (~i2112)) | ((~i2113) & i2112);
                    i14 = 106;
                } else {
                    int i2114 = (int) Runtime.getRuntime().totalMemory();
                    int i2115 = ~i2114;
                    int i2116 = 323825756 + ((1048435583 | i2114) * (-676)) + (((~(544528723 | i2115)) | (-1048435584)) * 676) + (((~(i2114 | (-503906861))) | (~(i2115 | 504218494)) | 544217089) * 676);
                    int i2117 = -(-i11);
                    int i2118 = i3 + (i2116 & i2117) + (i2117 | i2116);
                    i13 = i2118 ^ (i2118 << 13);
                    i14 = 17;
                }
                i15 = TuitionPaymentFragmentbindingInflater1 + 73;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                if (i15 % 2 != 0) {
                    int i2119 = i13 % i14;
                    int i226 = (i13 | i2119) & (~(i13 & i2119));
                    int i227 = (i226 ^ (-2)) + ((i226 & (-2)) << 1);
                    ((int[]) objArr2[1])[0] = (i226 | i227) & (~(i226 & i227));
                    return objArr2;
                }
                int i228 = i13 >>> i14;
                int i229 = (i13 | i228) & (~(i13 & i228));
                int i2210 = i229 << 5;
                ((int[]) objArr2[1])[0] = (i229 | i2210) & (~(i229 & i2210));
                return objArr2;
                if (Build.VERSION.SDK_INT == 30) {
                    int i230 = TuitionPaymentFragmentbindingInflater1;
                    int i231 = (i230 & 9) + (i230 | 9);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i231 % 128;
                    int i232 = i231 % 2;
                    i9 = i;
                } else {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i14110 = TuitionPaymentFragmentbindingInflater1 + 59;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14110 % 128;
                        int i14111 = i14110 % 2;
                        int i14112 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                        int i14113 = (i14112 & 245) + (i14112 | 245);
                        int i14114 = -TextUtils.indexOf("", "", 0, 0);
                        int i14115 = ~i;
                        int i14116 = ~(((-29) & i14115) | ((-29) ^ i14115));
                        int i14117 = ~((i14114 ^ i) | (i14114 & i));
                        int i14118 = ((i14114 * 960) - 53676) + (((i14116 & i14117) | (i14116 ^ i14117)) * 959) + 27811;
                        int i14119 = ~((-29) | i);
                        int i15110 = ~((i14114 & i14115) | (i14115 ^ i14114));
                        int i15111 = (i14118 - (~(((i15110 & i14119) | (i14119 ^ i15110)) * 959))) - 1;
                        int iKeyCodeFromString3 = KeyEvent.keyCodeFromString("");
                        int i15112 = iKeyCodeFromString3 * (-167);
                        int i15113 = ((i15112 | (-4008)) << 1) - (i15112 ^ (-4008));
                        int i15114 = ~iKeyCodeFromString3;
                        int i15115 = ~((i15114 & (-25)) | (i15114 ^ (-25)));
                        int i15116 = ~(((-25) ^ i) | ((-25) & i));
                        int i15117 = -(-(((i15115 & i15116) | (i15115 ^ i15116)) * 336));
                        int i15118 = (i15113 ^ i15117) + ((i15117 & i15113) << 1);
                        int i15119 = ~((iKeyCodeFromString3 ^ 24) | (iKeyCodeFromString3 & 24));
                        int i16110 = ~((iKeyCodeFromString3 ^ i) | (iKeyCodeFromString3 & i));
                        int i16111 = -(-(((i15119 & i16110) | (i15119 ^ i16110)) * (-168)));
                        Object[] objArr114 = new Object[1];
                        a(true, i14113, i15111, (i15118 & i16111) + (i16111 | i15118) + (((~((iKeyCodeFromString3 & i14115) | (i14115 ^ iKeyCodeFromString3))) | (-25)) * 168), new char[]{14, 4, 3, '\t', '\t', 23, 4, 7, 6, 65487, 6, '\r', 14, 14, 65489, 22, 11, 16, 11, 65489, 5, 22, 7, 65489, 5, 20, 65488, 7}, objArr114);
                        Object[] objArr115 = {(String) objArr114[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i16112 = 994 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int i16113 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8;
                            byte b13 = $$a[7];
                            byte b14 = b13;
                            Object[] objArr116 = new Object[1];
                            c(b14, (short) (b14 | 140), b13, objArr116);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, i16112, i16113, 410748506, false, (String) objArr116[0], new Class[]{String.class});
                        }
                        long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr115)).longValue();
                        long j19 = 1521906726;
                        long j110 = -1;
                        long j111 = jLongValue3 ^ j110;
                        long j112 = i;
                        long j113 = (j19 | j112) ^ j110;
                        long j114 = 407;
                        long j115 = j19 ^ j110;
                        long j116 = (j115 | jLongValue3) ^ j110;
                        long j117 = (((long) (-813)) * j19) + (((long) 408) * jLongValue3) + (((long) (-814)) * (((j111 | j19) ^ j110) | j113)) + ((((j111 | (j112 ^ j110)) ^ j110) | j116 | j113) * j114) + (j114 * (j116 | ((j115 | j112) ^ j110) | ((jLongValue3 | j112) ^ j110))) + ((long) (-1722824963));
                        int i16114 = (int) (j117 >> 32);
                        int iFreeMemory3 = (int) Runtime.getRuntime().freeMemory();
                        int i16115 = ~iFreeMemory3;
                        int i16116 = 955794966 + (((~((-1899516724) | i16115)) | 1075838994) * (-1188));
                        int i16117 = (~(iFreeMemory3 | 1899516723)) | 1075838994;
                        int i16118 = ~((-958224162) | i16115);
                        int i16119 = i16114 & (i16116 + ((i16117 | i16118) * 594) + (((~(1899516723 | i16115)) | 134546432 | i16118) * 594));
                        int iMaxMemory3 = (int) Runtime.getRuntime().maxMemory();
                        i5 = i16119 | (((int) j117) & ((-1090125254) + ((~((~iMaxMemory3) | (-1111822737))) * 433) + (((~(1139773850 | iMaxMemory3)) | 297452559) * (-433)) + (((~(iMaxMemory3 | 297452559)) | 27951114) * 433)));
                    } else {
                        int i17110 = 199 - (~(-View.resolveSizeAndState(0, 0, 0)));
                        int i17111 = -(ViewConfiguration.getScrollBarSize() >> 8);
                        int i17112 = -View.resolveSize(0, 0);
                        Object[] objArr117 = new Object[1];
                        a(false, i17110, (i17111 & 1) + (i17111 | 1), ((i17112 | 1) << 1) - (i17112 ^ 1), new char[]{0}, objArr117);
                        str = (String) objArr117[0];
                        int iAxisFromString4 = 249 - MotionEvent.axisFromString("");
                        int touchSlop3 = ViewConfiguration.getTouchSlop() >> 8;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i17113 = touchSlop3 * 465;
                        int i17114 = (i17113 ^ (-6019)) + ((i17113 & (-6019)) << 1);
                        int i17115 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                        int i17116 = ((-14) & touchSlop3) | ((-14) ^ touchSlop3);
                        int i17117 = i17114 + (((~((i17115 & touchSlop3) | (i17115 ^ touchSlop3))) | (~((-14) | i17115)) | (~i17116)) * 464);
                        int i17118 = ~touchSlop3;
                        int i17119 = (i17118 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault9 ^ i17118);
                        int i18110 = i17117 + (((i17119 & (-14)) | (i17119 ^ (-14))) * (-464));
                        int i18111 = ~i17116;
                        int i18112 = ~((touchSlop3 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (touchSlop3 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                        int i18113 = -(-(((i18112 & i18111) | (i18111 ^ i18112)) * 464));
                        int i18114 = ((i18110 | i18113) << 1) - (i18113 ^ i18110);
                        int i18115 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        Object[] objArr118 = new Object[1];
                        a(false, iAxisFromString4, i18114, (i18115 ^ 9) + ((i18115 & 9) << 1), new char[]{2, 65535, 18, 4, 4, 65534, 65535, '\t', 2, 15, '\f', 65483, 1}, objArr118);
                        objArr = new Object[]{(String) objArr118[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char offsetBefore3 = (char) (33602 - TextUtils.getOffsetBefore("", 0));
                            int edgeSlop4 = (ViewConfiguration.getEdgeSlop() >> 16) + 3085;
                            int iMyPid3 = 26 - (Process.myPid() >> 22);
                            byte b15 = $$a[7];
                            byte b16 = b15;
                            Object[] objArr119 = new Object[1];
                            c(b16, (short) (b16 | 140), b15, objArr119);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetBefore3, edgeSlop4, iMyPid3, 1411172903, false, (String) objArr119[0], new Class[]{String.class});
                        }
                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr))) {
                            int i18116 = TuitionPaymentFragmentbindingInflater1;
                            int i18117 = (i18116 ^ 107) + ((i18116 & 107) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18117 % 128;
                            int i18118 = i18117 % 2;
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                    }
                    int i18119 = -i5;
                    int i19110 = ((i5 & i18119) | (i5 ^ i18119)) >> 31;
                    i6 = (i19110 & (~(i & 10)) & (i | 10)) | ((~i19110) & i);
                    int i19111 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i19112 = (i19111 ^ 31) + ((i19111 & 31) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i19112 % 128;
                    int i19113 = i19112 % 2;
                    int i19114 = i2 & 32;
                    i7 = (i19114 | (-i19114)) >> 31;
                    i8 = i19111 + 21;
                    TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                    if (i8 % 2 == 0) {
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    int i19115 = i6 & (~i7);
                    int i19116 = i & i7;
                    i9 = (i19115 & i19116) | (i19115 ^ i19116);
                }
                int i19117 = i ^ i4;
                int i19118 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i19119 = (i19118 ^ 117) + ((i19118 & 117) << 1);
                int i20110 = i19119 % 128;
                TuitionPaymentFragmentbindingInflater1 = i20110;
                int i20111 = i19119 % 2;
                int i20112 = (i19117 | (-i19117)) >> 31;
                int i20113 = i9 & (~i20112);
                int i20114 = i4 & i20112;
                int i20115 = (i20113 & i20114) | (i20113 ^ i20114);
                objArr2 = new Object[4];
                i10 = ((i20110 | 113) << 1) - (i20110 ^ 113);
                int i20116 = i10 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20116;
                if (i10 % 2 != 0) {
                    objArr2[1] = new int[1];
                    objArr2[0] = new int[1];
                    objArr2[2] = new int[0];
                } else {
                    objArr2[0] = new int[1];
                    objArr2[1] = new int[1];
                    objArr2[2] = new int[1];
                }
                int i20117 = (~(i & i20115)) & (i | i20115);
                int i20118 = -i20117;
                i11 = (((i20117 & i20118) | (i20117 ^ i20118)) >> 31) & 16;
                int[] iArr3 = (int[]) objArr2[0];
                int i20119 = ((i20116 | 31) << 1) - (i20116 ^ 31);
                TuitionPaymentFragmentbindingInflater1 = i20119 % 128;
                int i21110 = i20119 % 2;
                iArr3[0] = i;
                ((int[]) objArr2[2])[0] = i20115;
                objArr2[3] = null;
                i12 = (i20116 & 17) + (i20116 | 17);
                TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                if (i12 % 2 == 0) {
                    int i21111 = -((2063533684 + ((230372955 | i) * 376) + (((~((~i) | 437348024)) | 95031363) * (-376)) + (((~((-437348025) | i)) | (-397037796)) * 376)) * i11);
                    int i21112 = (i3 ^ i21111) + ((i3 & i21111) << 1);
                    int i21113 = i21112 / 94;
                    i13 = (i21113 & (~i21112)) | ((~i21113) & i21112);
                    i14 = 106;
                } else {
                    int i21114 = (int) Runtime.getRuntime().totalMemory();
                    int i21115 = ~i21114;
                    int i21116 = 323825756 + ((1048435583 | i21114) * (-676)) + (((~(544528723 | i21115)) | (-1048435584)) * 676) + (((~(i21114 | (-503906861))) | (~(i21115 | 504218494)) | 544217089) * 676);
                    int i21117 = -(-i11);
                    int i21118 = i3 + (i21116 & i21117) + (i21117 | i21116);
                    i13 = i21118 ^ (i21118 << 13);
                    i14 = 17;
                }
                i15 = TuitionPaymentFragmentbindingInflater1 + 73;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                if (i15 % 2 != 0) {
                    int i21119 = i13 % i14;
                    int i2211 = (i13 | i21119) & (~(i13 & i21119));
                    int i2212 = (i2211 ^ (-2)) + ((i2211 & (-2)) << 1);
                    ((int[]) objArr2[1])[0] = (i2211 | i2212) & (~(i2211 & i2212));
                    return objArr2;
                }
                int i2213 = i13 >>> i14;
                int i2214 = (i13 | i2213) & (~(i13 & i2213));
                int i2215 = i2214 << 5;
                ((int[]) objArr2[1])[0] = (i2214 | i2215) & (~(i2214 & i2215));
                return objArr2;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th4;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(int r7, int r8, int r9) {
            /*
                int r9 = r9 * 2
                int r9 = 3 - r9
                byte[] r0 = defpackage.ConfigOption.AnonymousClass4.$$c
                int r7 = r7 * 4
                int r7 = r7 + 1
                int r8 = 120 - r8
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r9
                r5 = r2
                r9 = r7
                goto L2b
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L23:
                int r9 = r9 + 1
                r3 = r0[r9]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L2b:
                int r8 = -r8
                int r8 = r8 + r9
                r9 = r3
                r3 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ConfigOption.AnonymousClass4.$$e(int, int, int):java.lang.String");
        }
    };

    static char[] b() {
        return (char[]) Objects.requireNonNull(TuitionPaymentFragmentspecialinlinedviewModeldefault2.get());
    }
}
