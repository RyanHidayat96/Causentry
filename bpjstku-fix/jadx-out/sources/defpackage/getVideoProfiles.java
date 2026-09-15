package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
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
import androidx.core.view.ViewCompat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import kotlin.jvm.internal.ByteCompanionObject;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getVideoProfiles implements Runnable {
    private static final byte[] $$c = {86, -48, ByteCompanionObject.MIN_VALUE, 88};
    private static final int $$d = 88;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {21, 65, -9, -121, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 82;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long TuitionPaymentFragmentbindingInflater1 = -578503375166402475L;
    private static int b = -981105359;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 34097;

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = 103 - r8
            int r7 = r7 * 52
            int r0 = r7 + 1
            byte[] r1 = defpackage.getVideoProfiles.$$a
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L20:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getVideoProfiles.a(int, short, byte, java.lang.Object[]):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
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
        int i3 = $10 + 63;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i5 = $11 + 57;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8328), TextUtils.indexOf((CharSequence) "", '0', 0) + 1236, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 34, -653973969, false, $$e(b2, b3, (byte) (b3 + 2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), 2764 - TextUtils.indexOf("", ""), 14 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1504416861, false, $$e(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 43325), Color.alpha(0) + 253, 22 - TextUtils.getCapsMode("", 0, 0), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 65200);
                    int i7 = 2892 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int fadingEdgeLength = 17 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    String str$$e = $$e(b6, b7, (byte) (b7 + 1));
                    c2 = 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatDelay, i7, fadingEdgeLength, 2012627446, false, str$$e, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    c2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentbindingInflater1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) b) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
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

    /* JADX WARN: Code duplicated, block: B:103:0x082b  */
    /* JADX WARN: Code duplicated, block: B:138:0x0a56  */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) throws Throwable {
        int i;
        boolean z;
        int i2;
        String string;
        Method[] declaredMethods;
        int length;
        int i3;
        long j;
        int i4;
        Class<?> cls;
        char[] cArr;
        char[] cArr2;
        int iCombineMeasuredStates;
        int i5;
        int i6;
        int i7;
        char c;
        char[] cArr3;
        char[] cArr4;
        int modifierMetaStateMask;
        int i8;
        char c2;
        int iAxisFromString;
        Long l;
        int i9 = 2 % 2;
        Constructor[] constructorArr = {OkHttpClient.class.getDeclaredConstructor(OkHttpClient.Builder.class)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        int i10 = 1;
        int i11 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2823;
            int capsMode = 22 - TextUtils.getCapsMode("", 0, 0);
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            Object[] objArr = new Object[1];
            a((byte) (-b2), b2, bArr[10], objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop, iKeyCodeFromString, capsMode, 1814927978, false, (String) objArr[0], null);
        }
        try {
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
                int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
                int i13 = 24;
                if (i12 % 2 != 0) {
                    declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getTapTimeout() >> 16) + 2823, View.MeasureSpec.getMode(0) + 22)).getDeclaredMethods();
                    length = declaredMethods.length;
                } else {
                    declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) KeyEvent.getDeadChar(0, 0), 2823 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 21 - TextUtils.indexOf((CharSequence) "", '0', 0))).getDeclaredMethods();
                    length = declaredMethods.length;
                }
                int i14 = 0;
                while (i14 < length) {
                    Method method = declaredMethods[i14];
                    int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                    int i16 = i15 % 2;
                    try {
                        char[] cArr5 = new char[i13];
                        // fill-array-data instruction
                        cArr5[0] = 28370;
                        cArr5[1] = 51716;
                        cArr5[2] = 9535;
                        cArr5[3] = 31540;
                        cArr5[4] = 52523;
                        cArr5[5] = 30737;
                        cArr5[6] = 46531;
                        cArr5[7] = 54315;
                        cArr5[8] = 35739;
                        cArr5[9] = 16596;
                        cArr5[10] = 19302;
                        cArr5[11] = 45248;
                        cArr5[12] = 51023;
                        cArr5[13] = 6523;
                        cArr5[14] = 35021;
                        cArr5[15] = 4126;
                        cArr5[16] = 32657;
                        cArr5[17] = 61607;
                        cArr5[18] = 40137;
                        cArr5[19] = 9152;
                        cArr5[20] = 6171;
                        cArr5[21] = 39244;
                        cArr5[22] = 18789;
                        cArr5[23] = 10802;
                        Object[] objArr2 = new Object[i10];
                        c(new char[]{5476, 2130, 21325, 20614}, new char[]{48776, 49905, 61144, 8592}, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.MeasureSpec.makeMeasureSpec(i11, i11), cArr5, objArr2);
                        Class<?> cls2 = Class.forName((String) objArr2[i11]);
                        char[] cArr6 = {5476, 2130, 21325, 20614};
                        char[] cArr7 = {57694, 35077, 39841, 42978};
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> i13);
                        int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
                        int i18 = i17 % 2;
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', i11, i11);
                        int iTuitionPaymentFragmentbindingInflater1 = applyAppLocales.TuitionPaymentFragmentbindingInflater1();
                        int i19 = (iLastIndexOf * (-300)) + 302 + ((~((iLastIndexOf ^ 1) | (iLastIndexOf & 1) | iTuitionPaymentFragmentbindingInflater1)) * (-301));
                        int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i21 = (i20 & 59) + (i20 | 59);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i21 % 128;
                        if (i21 % 2 == 0) {
                            int i22 = ~(((-2) & iTuitionPaymentFragmentbindingInflater1) | ((-2) ^ iTuitionPaymentFragmentbindingInflater1));
                            int i23 = ~iTuitionPaymentFragmentbindingInflater1;
                            int i24 = ~((i23 ^ iLastIndexOf) | (i23 & iLastIndexOf));
                            i3 = i19 << ((-301) % ((i22 ^ i24) | (i22 & i24)));
                        } else {
                            int i25 = ~(((-2) & iTuitionPaymentFragmentbindingInflater1) | ((-2) ^ iTuitionPaymentFragmentbindingInflater1));
                            int i26 = ~iTuitionPaymentFragmentbindingInflater1;
                            int i27 = -(-((i25 | (~((i26 ^ iLastIndexOf) | (i26 & iLastIndexOf)))) * (-301)));
                            i3 = (i27 | i19) + (i19 & i27);
                        }
                        int i28 = ~iLastIndexOf;
                        int i29 = ~((i28 & iTuitionPaymentFragmentbindingInflater1) | (i28 ^ iTuitionPaymentFragmentbindingInflater1));
                        int i30 = -(-(301 * ((i29 & (-2)) | ((-2) ^ i29))));
                        Object[] objArr3 = new Object[1];
                        c(cArr6, cArr7, maximumDrawingCacheSize, ((i3 | i30) << 1) - (i3 ^ i30), new char[]{43639, 16447, 52691, 10876, 50991, 57526, 32415, 57114, 35248, 35096, 29686, 29213}, objArr3);
                        Object[] objArr4 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr3[0], null).invoke(method, null)).intValue())};
                        char[] cArr8 = {5476, 2130, 21325, 20614};
                        char[] cArr9 = {53781, 44819, 36664, 31721};
                        int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                        int iTuitionPaymentFragmentbindingInflater2 = applyAppLocales.TuitionPaymentFragmentbindingInflater1();
                        int i31 = scrollBarSize * 624;
                        int i32 = ((i31 | (-37190002)) << 1) - (i31 ^ (-37190002));
                        int i33 = ((-59792) & scrollBarSize) | ((-59792) ^ scrollBarSize);
                        int i34 = -(-((~((i33 & iTuitionPaymentFragmentbindingInflater2) | (i33 ^ iTuitionPaymentFragmentbindingInflater2))) * 623));
                        int i35 = (i32 & i34) + (i34 | i32);
                        int i36 = ~iTuitionPaymentFragmentbindingInflater2;
                        int i37 = ~scrollBarSize;
                        int i38 = ~((i37 ^ 59791) | (i37 & 59791));
                        int i39 = -(-(((i36 & i38) | (i36 ^ i38)) * (-623)));
                        int i40 = (i35 & i39) + (i39 | i35);
                        int i41 = ~(((-59792) & scrollBarSize) | ((-59792) ^ scrollBarSize));
                        int i42 = ~(((-59792) & iTuitionPaymentFragmentbindingInflater2) | ((-59792) ^ iTuitionPaymentFragmentbindingInflater2));
                        int i43 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i44 = (i43 ^ 5) + ((i43 & 5) << 1);
                        Method[] methodArr = declaredMethods;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i44 % 128;
                        int i45 = i44 % 2;
                        int i46 = (i41 ^ i42) | (i41 & i42);
                        int i47 = ~((scrollBarSize & iTuitionPaymentFragmentbindingInflater2) | (scrollBarSize ^ iTuitionPaymentFragmentbindingInflater2));
                        Object[] objArr5 = new Object[1];
                        c(cArr8, cArr9, (char) (i40 + (623 * ((i47 & i46) | (i46 ^ i47)))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{55796, 63112, 31043, 41453, 53978, 57758, 25502, 35486, 6690, 57819, 35785, 56147, 36976, 55879, 32791, 38059, 50178, 31627, 16781, 51265, 17238, 8087, 30803, 28034, 29872, 37581}, objArr5);
                        Class<?> cls3 = Class.forName((String) objArr5[0]);
                        char[] cArr10 = {5476, 2130, 21325, 20614};
                        char[] cArr11 = {18034, 45376, 55905, 30659};
                        char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int i48 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i48 % 128;
                        int i49 = i48 % 2;
                        Object[] objArr6 = new Object[1];
                        c(cArr10, cArr11, scrollBarFadeDuration, TextUtils.indexOf("", "", 0), new char[]{41273, 57552, 31765, 38217, 29644, 38201, 48891, 17900}, objArr6);
                        if (!(!((Boolean) cls3.getMethod((String) objArr6[0], Integer.TYPE).invoke(null, objArr4)).booleanValue())) {
                            int i50 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i50 % 128;
                            int i51 = i50 % 2;
                            Class cls4 = Long.TYPE;
                            char[] cArr12 = {5476, 2130, 21325, 20614};
                            char[] cArr13 = {48776, 49905, 61144, 8592};
                            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
                            int i52 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i53 = (i52 ^ 97) + ((i52 & 97) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i53 % 128;
                            if (i53 % 2 == 0) {
                                Object[] objArr7 = new Object[1];
                                c(cArr12, cArr13, longPressTimeout, absoluteGravity, new char[]{28370, 51716, 9535, 31540, 52523, 30737, 46531, 54315, 35739, 16596, 19302, 45248, 51023, 6523, 35021, 4126, 32657, 61607, 40137, 9152, 6171, 39244, 18789, 10802}, objArr7);
                                cls = Class.forName((String) objArr7[0]);
                                cArr = new char[]{5476, 2130, 21325, 20614};
                                cArr2 = new char[]{55747, 43934, 39666, 48790};
                                iCombineMeasuredStates = View.combineMeasuredStates(1, 0);
                            } else {
                                Object[] objArr8 = new Object[1];
                                c(cArr12, cArr13, longPressTimeout, absoluteGravity, new char[]{28370, 51716, 9535, 31540, 52523, 30737, 46531, 54315, 35739, 16596, 19302, 45248, 51023, 6523, 35021, 4126, 32657, 61607, 40137, 9152, 6171, 39244, 18789, 10802}, objArr8);
                                cls = Class.forName((String) objArr8[0]);
                                cArr = new char[]{5476, 2130, 21325, 20614};
                                cArr2 = new char[]{55747, 43934, 39666, 48790};
                                iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                            }
                            char[] cArr14 = cArr;
                            char[] cArr15 = cArr2;
                            int i54 = -iCombineMeasuredStates;
                            int iTuitionPaymentFragmentbindingInflater3 = applyAppLocales.TuitionPaymentFragmentbindingInflater1();
                            int i55 = i54 * 236;
                            int i56 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i57 = ((i56 | 37) << 1) - (i56 ^ 37);
                            int i58 = i57 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i58;
                            int i59 = i57 % 2 == 0 ? i55 / (-38083) : ((i55 | 18158934) << 1) - (i55 ^ 18158934);
                            int i60 = (~i54) | (~iTuitionPaymentFragmentbindingInflater3);
                            int i61 = i58 + 81;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i61 % 128;
                            if (i61 % 2 != 0) {
                                i5 = i59 >> ((-235) % ((i60 ^ (-1)) | 38554));
                                int i62 = ~i54;
                                i6 = (i62 & iTuitionPaymentFragmentbindingInflater3) | (i62 ^ iTuitionPaymentFragmentbindingInflater3);
                            } else {
                                i5 = (i59 - (~(-(-((-235) * (((i60 ^ (-1)) & 38554) | (i60 ^ (-38555)))))))) - 1;
                                i6 = (~i54) | iTuitionPaymentFragmentbindingInflater3;
                            }
                            int i63 = ~i6;
                            int i64 = i5 + ((-470) * ((i63 & 38554) | (38554 ^ i63)));
                            int i65 = ~(((-38555) & i54) | ((-38555) ^ i54));
                            int i66 = ~i54;
                            int i67 = (i66 & 38554) | (i66 ^ 38554);
                            int i68 = ((~((i67 & iTuitionPaymentFragmentbindingInflater3) | (i67 ^ iTuitionPaymentFragmentbindingInflater3))) | i65) * 235;
                            int i69 = -(-Color.alpha(0));
                            Object[] objArr9 = new Object[1];
                            c(cArr14, cArr15, (char) ((i64 & i68) + (i68 | i64)), (i69 & (-223633703)) + (i69 | (-223633703)), new char[]{3937, 15096, 9380, 11907, 37805, 26052, 6521, 7010, 22961, 51245, 31230, 47853, 53489}, objArr9);
                            if (cls4.equals(cls.getMethod((String) objArr9[0], null).invoke(method, null))) {
                                int iTuitionPaymentFragmentbindingInflater4 = applyAppLocales.TuitionPaymentFragmentbindingInflater1();
                                int i70 = ~iTuitionPaymentFragmentbindingInflater4;
                                int i71 = ~((i70 ^ (-968852375)) | (i70 & (-968852375)));
                                int i72 = (((-1472166441) - (~(-(-(((i71 & (-836314032)) | ((-836314032) ^ i71)) * (-1042)))))) - (~(-(-((((-968852375) ^ iTuitionPaymentFragmentbindingInflater4) | ((-968852375) & iTuitionPaymentFragmentbindingInflater4)) * 521))))) - 1;
                                int i73 = ~((iTuitionPaymentFragmentbindingInflater4 & 836314031) | (836314031 ^ iTuitionPaymentFragmentbindingInflater4));
                                int i74 = (i73 & (-973054912)) | ((-973054912) ^ i73);
                                int i75 = i70 | (-836314032);
                                int i76 = ~((i75 & (-968852375)) | (i75 ^ (-968852375)));
                                int i77 = i72 + (((i74 & i76) | (i74 ^ i76)) * 521);
                                int iTuitionPaymentFragmentbindingInflater5 = applyAppLocales.TuitionPaymentFragmentbindingInflater1();
                                int i78 = ~iTuitionPaymentFragmentbindingInflater5;
                                int i79 = ~((i78 & 636363918) | (i78 ^ 636363918));
                                int i80 = 1077712357 + (((i79 & (-1710222543)) | ((-1710222543) ^ i79)) * (-108));
                                int i81 = ~((1709820102 & iTuitionPaymentFragmentbindingInflater5) | (1709820102 ^ iTuitionPaymentFragmentbindingInflater5));
                                int i82 = (i81 & 635961478) | (i81 ^ 635961478);
                                int i83 = ~iTuitionPaymentFragmentbindingInflater5;
                                int i84 = ~((i83 & (-1709820103)) | (i83 ^ (-1709820103)));
                                int i85 = -(-(((i82 & i84) | (i82 ^ i84)) * 54));
                                int i86 = (i80 ^ i85) + ((i85 & i80) << 1);
                                int i87 = ((iTuitionPaymentFragmentbindingInflater5 & 635961478) | (iTuitionPaymentFragmentbindingInflater5 ^ 635961478)) * 54;
                                if (i77 > (i86 ^ i87) + ((i87 & i86) << 1)) {
                                    int tapTimeout = ViewConfiguration.getTapTimeout();
                                    c = (char) ((tapTimeout ^ (-67)) + ((tapTimeout & (-67)) << 1));
                                    cArr3 = new char[]{5476, 2130, 21325, 20614};
                                    cArr4 = new char[]{48776, 49905, 61144, 8592};
                                    modifierMetaStateMask = 0 / ((byte) KeyEvent.getModifierMetaStateMask());
                                    i8 = 24;
                                    i7 = 1;
                                } else {
                                    char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                    byte modifierMetaStateMask2 = (byte) KeyEvent.getModifierMetaStateMask();
                                    i7 = 1;
                                    c = tapTimeout2;
                                    cArr3 = new char[]{5476, 2130, 21325, 20614};
                                    cArr4 = new char[]{48776, 49905, 61144, 8592};
                                    modifierMetaStateMask = (modifierMetaStateMask2 | 1) + (modifierMetaStateMask2 & 1);
                                    i8 = 24;
                                }
                                char[] cArr16 = new char[i8];
                                // fill-array-data instruction
                                cArr16[0] = 28370;
                                cArr16[1] = 51716;
                                cArr16[2] = 9535;
                                cArr16[3] = 31540;
                                cArr16[4] = 52523;
                                cArr16[5] = 30737;
                                cArr16[6] = 46531;
                                cArr16[7] = 54315;
                                cArr16[8] = 35739;
                                cArr16[9] = 16596;
                                cArr16[10] = 19302;
                                cArr16[11] = 45248;
                                cArr16[12] = 51023;
                                cArr16[13] = 6523;
                                cArr16[14] = 35021;
                                cArr16[15] = 4126;
                                cArr16[16] = 32657;
                                cArr16[17] = 61607;
                                cArr16[18] = 40137;
                                cArr16[19] = 9152;
                                cArr16[20] = 6171;
                                cArr16[21] = 39244;
                                cArr16[22] = 18789;
                                cArr16[23] = 10802;
                                Object[] objArr10 = new Object[i7];
                                c(cArr3, cArr4, c, modifierMetaStateMask, cArr16, objArr10);
                                Class<?> cls5 = Class.forName((String) objArr10[0]);
                                char[] cArr17 = {5476, 2130, 21325, 20614};
                                char[] cArr18 = {12616, 9952, 13763, 54648};
                                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                                int i88 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i88 % 128;
                                if (i88 % 2 == 0) {
                                    int i89 = -(-(jElapsedRealtimeNanos > 0L ? 1 : (jElapsedRealtimeNanos == 0L ? 0 : -1)));
                                    c2 = (char) (((i89 | 30772) << 1) - (i89 ^ 30772));
                                    iAxisFromString = MotionEvent.axisFromString("");
                                } else {
                                    c2 = (char) (30771 - (~(jElapsedRealtimeNanos > 0L ? 1 : (jElapsedRealtimeNanos == 0L ? 0 : -1))));
                                    iAxisFromString = MotionEvent.axisFromString("");
                                }
                                int i90 = -iAxisFromString;
                                int iTuitionPaymentFragmentbindingInflater6 = applyAppLocales.TuitionPaymentFragmentbindingInflater1();
                                char c3 = c2;
                                int i91 = (i90 * (-103)) + 2069613744;
                                int i92 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
                                int i93 = i92 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i93;
                                if (i92 % 2 == 0) {
                                    Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }
                                int i94 = ~i90;
                                int i95 = ~((i94 & 1020862415) | (i94 ^ 1020862415));
                                int i96 = ~((1020862415 & iTuitionPaymentFragmentbindingInflater6) | (1020862415 ^ iTuitionPaymentFragmentbindingInflater6));
                                int i97 = 104 * ((i95 & i96) | (i95 ^ i96));
                                int i98 = (i91 ^ i97) + ((i91 & i97) << 1);
                                int i99 = ~iTuitionPaymentFragmentbindingInflater6;
                                int i100 = (i98 - (~(-(-((~(((i99 & i90) | (i99 ^ i90)) | (-1020862416))) * (-104)))))) - 1;
                                int i101 = (i93 ^ 113) + ((i93 & 113) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i101 % 128;
                                int i102 = i101 % 2;
                                int i103 = ((i90 ^ iTuitionPaymentFragmentbindingInflater6) | (i90 & iTuitionPaymentFragmentbindingInflater6)) * 104;
                                Object[] objArr11 = new Object[1];
                                c(cArr17, cArr18, c3, (i100 ^ i103) + ((i103 & i100) << 1), new char[]{26823, 62267, 10849, 54493, 33654, 28533, 24888, 40283, 9106, 17450, 62501, 14727, 39543, 34688, 8047, 10513, 10719}, objArr11);
                                Object[] objArr12 = (Object[]) cls5.getMethod((String) objArr11[0], null).invoke(method, null);
                                if (objArr12.length == 2) {
                                    int i104 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i105 = (i104 ^ 101) + ((i104 & 101) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i105 % 128;
                                    int i106 = i105 % 2;
                                    if (Long.TYPE.equals(objArr12[0])) {
                                        int i107 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                        int i108 = (i107 ^ 69) + ((i107 & 69) << 1);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i108 % 128;
                                        int i109 = i108 % 2;
                                        int i110 = -((byte) KeyEvent.getModifierMetaStateMask());
                                        i4 = 24;
                                        Object[] objArr13 = new Object[1];
                                        c(new char[]{5476, 2130, 21325, 20614}, new char[]{48776, 49905, 61144, 8592}, (char) ((i110 ^ (-1)) + (i110 << 1)), TextUtils.getCapsMode("", 0, 0), new char[]{28370, 51716, 9535, 31540, 52523, 30737, 46531, 54315, 35739, 16596, 19302, 45248, 51023, 6523, 35021, 4126, 32657, 61607, 40137, 9152, 6171, 39244, 18789, 10802}, objArr13);
                                        if (Class.forName((String) objArr13[0]).equals(objArr12[1])) {
                                            int i111 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i111 % 128;
                                            if (i111 % 2 != 0) {
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char gidForName = (char) ((-1) - Process.getGidForName(""));
                                                    int iResolveSizeAndState = 2823 - View.resolveSizeAndState(0, 0, 0);
                                                    int packedPositionType = 22 - ExpandableListView.getPackedPositionType(0L);
                                                    byte[] bArr2 = $$a;
                                                    byte b3 = bArr2[5];
                                                    Object[] objArr14 = new Object[1];
                                                    a((byte) (-b3), b3, bArr2[10], objArr14);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName, iResolveSizeAndState, packedPositionType, 1814927978, false, (String) objArr14[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method);
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                                                    int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 2823;
                                                    int longPressTimeout2 = 22 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                                    byte[] bArr3 = $$a;
                                                    byte b4 = bArr3[5];
                                                    Object[] objArr15 = new Object[1];
                                                    a((byte) (-b4), b4, bArr3[10], objArr15);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, scrollBarSize2, longPressTimeout2, 1814927978, false, (String) objArr15[0], null);
                                                }
                                                Object[] objArr16 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                    char c4 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    int offsetAfter = 2823 - TextUtils.getOffsetAfter("", 0);
                                                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 22;
                                                    byte b5 = $$a[7];
                                                    Object[] objArr17 = new Object[1];
                                                    a((byte) 51, b5, b5, objArr17);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c4, offsetAfter, iNormalizeMetaState, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                l = (Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr16);
                                            } else {
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                    char longPressTimeout3 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                                    int i112 = 2823 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 22;
                                                    byte[] bArr4 = $$a;
                                                    byte b6 = bArr4[5];
                                                    Object[] objArr18 = new Object[1];
                                                    a((byte) (-b6), b6, bArr4[10], objArr18);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(longPressTimeout3, i112, offsetBefore, 1814927978, false, (String) objArr18[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, method);
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                    int i113 = 2822 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 22;
                                                    byte[] bArr5 = $$a;
                                                    byte b7 = bArr5[5];
                                                    Object[] objArr19 = new Object[1];
                                                    a((byte) (-b7), b7, bArr5[10], objArr19);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(doubleTapTimeout, i113, pressedStateDuration, 1814927978, false, (String) objArr19[0], null);
                                                }
                                                Object[] objArr20 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null)};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                    char c5 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                    int i114 = 2823 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    int iResolveOpacity = 22 - Drawable.resolveOpacity(0, 0);
                                                    byte b8 = $$a[7];
                                                    Object[] objArr21 = new Object[1];
                                                    a((byte) 51, b8, b8, objArr21);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c5, i114, iResolveOpacity, -2137287382, false, (String) objArr21[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                l = (Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr20);
                                            }
                                            l.longValue();
                                            int i115 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i115 % 128;
                                            int i116 = i115 % 2;
                                            break;
                                        }
                                        j = 0;
                                    } else {
                                        j = 0;
                                        i4 = 24;
                                    }
                                } else {
                                    j = 0;
                                    i4 = 24;
                                }
                            } else {
                                j = 0;
                                i4 = 24;
                            }
                        } else {
                            j = 0;
                            i4 = 24;
                        }
                        int i117 = ((i14 | 69) << 1) - (i14 ^ 69);
                        i14 = (i117 & (-68)) + (i117 | (-68));
                        int i118 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i118 % 128;
                        int i119 = i118 % 2;
                        i13 = i4;
                        declaredMethods = methodArr;
                        i10 = 1;
                        i11 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                int offsetBefore2 = 2823 - TextUtils.getOffsetBefore("", 0);
                int iGreen = 22 - Color.green(0);
                byte[] bArr6 = $$a;
                byte b9 = bArr6[5];
                Object[] objArr22 = new Object[1];
                a((byte) (-b9), b9, bArr6[10], objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cAxisFromString, offsetBefore2, iGreen, 1814927978, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char scrollBarSize3 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int trimmedLength = TextUtils.getTrimmedLength("") + 2823;
                int i120 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22;
                byte b10 = $$a[7];
                Object[] objArr24 = new Object[1];
                a((byte) 51, b10, (byte) (b10 + 5), objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(scrollBarSize3, trimmedLength, i120, 1025296417, false, (String) objArr24[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr23);
            Object[] objArr25 = {0, constructorArr, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-687574488);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cGreen = (char) (Color.green(0) + 37657);
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 2720;
                int i121 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19;
                byte[] bArr7 = $$a;
                Object[] objArr26 = new Object[1];
                a((byte) 51, bArr7[7], (byte) (-bArr7[14]), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cGreen, edgeSlop, i121, 865785343, false, (String) objArr26[0], new Class[]{Integer.TYPE, Constructor[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr25)).longValue();
            long j2 = 632495208;
            long j3 = 829;
            long j4 = (j3 * j2) + (j3 * jLongValue);
            long j5 = -828;
            long j6 = -1;
            long jNextInt = ((long) new Random().nextInt()) ^ j6;
            long j7 = j4 + (((((j2 ^ j6) | (jLongValue ^ j6)) ^ j6) | (((jNextInt | j2) | jLongValue) ^ j6)) * j5);
            long j8 = jLongValue | j2;
            long j9 = j7 + (j5 * (jNextInt | j8)) + (((long) 828) * (j8 ^ j6)) + ((long) (-1656550830));
            int iMyPid = Process.myPid();
            int i122 = ((int) (j9 >> 32)) & ((-2087620630) + (((~(2035644412 | (~iMyPid))) | (~((-822096473) | iMyPid))) * (-272)) + (((~(961640312 | iMyPid)) | 1074004100) * (-272)) + (((~(iMyPid | (-961640313))) | (-1896100573)) * 272));
            int iNextInt = new Random().nextInt(371649951);
            int i123 = i122 | (((int) j9) & ((-635053948) + (((-545276326) | iNextInt) * (-627)) + (((~(915490727 | iNextInt)) | (-521735683)) * (-627)) + (((~(iNextInt | (-521735683))) | (~((~iNextInt) | (-915490728)))) * 627)));
            int i124 = i123 >>> 24;
            int i125 = i123 & ViewCompat.MEASURED_SIZE_MASK;
            if (i124 != 0) {
                int i126 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i126 % 128;
                i = 2;
                int i127 = i126 % 2;
                z = true;
            } else {
                i = 2;
                z = false;
            }
            if (z) {
                int i128 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i129 = i128 + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i129 % 128;
                int i130 = i129 % i;
                int i131 = i128 + 35;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i131 % 128;
                int i132 = i131 % i;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (!z || i125 >= 1) {
                string = null;
            } else {
                int i133 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i134 = (i133 & 95) + (i133 | 95);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i134 % 128;
                if (i134 % 2 == 0) {
                    Constructor constructor = constructorArr[i125];
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Constructor constructor2 = constructorArr[i125];
                if (constructor2 != null) {
                    string = constructor2.toString();
                } else {
                    string = null;
                }
            }
            list.add(string);
            int i135 = (((i124 | 6) << 1) - (i124 ^ 6)) * i2;
            int i136 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i136 % 128;
            if (i136 % 2 != 0) {
                int i137 = 16 / 0;
            }
            return i135;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
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
    private static java.lang.String $$e(byte r5, short r6, short r7) {
        /*
            int r6 = r6 * 2
            int r6 = 1 - r6
            byte[] r0 = defpackage.getVideoProfiles.$$c
            int r7 = 104 - r7
            int r5 = r5 * 2
            int r5 = 4 - r5
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r5
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            r4 = r0[r5]
        L25:
            int r5 = r5 + 1
            int r7 = r7 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getVideoProfiles.$$e(byte, short, short):java.lang.String");
    }
}
