package com.google.android.gms.internal.measurement;

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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
public final class zznb implements zznk {
    private static final byte[] $$c = {0, -94, -62, -97};
    private static final int $$d = 3;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {91, -17, 90, 37};
    private static final int $$b = 113;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static long b = -6377398940819159759L;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -981105359;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 46044;

    private static void c(short s, int i, int i2, Object[] objArr) {
        int i3 = s * 2;
        int i4 = 98 - (i2 * 4);
        int i5 = i + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        int i7 = -1;
        if (bArr == null) {
            i4 = i6 + i4;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            i5++;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 += bArr[i5];
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final zznj zzc(Class cls) {
        int i = 2 % 2;
        throw new IllegalStateException("This should never be called.");
    }

    private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
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
            int i4 = $11 + 89;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c2 = (char) (8329 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1236;
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 35;
                    byte b2 = $$c[0];
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, iIndexOf, jumpTapTimeout, -653973969, false, $$e(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2764;
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 14;
                        byte b4 = $$c[0];
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(windowTouchSlop, keyRepeatDelay, deadChar, 1504416861, false, $$e(b4, b5, (byte) (b5 + 2)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - Gravity.getAbsoluteGravity(0, 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 253, 22 - (ViewConfiguration.getFadingEdgeLength() >> 16), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char c3 = (char) (65200 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                int mirror = AndroidCharacter.getMirror('0') + 2843;
                                int maximumDrawingCacheSize = 17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                byte b6 = $$c[0];
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, mirror, maximumDrawingCacheSize, 2012627446, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = sessionProcessor.b;
                            cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
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
        int i6 = $11 + 19;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 38 / 0;
        }
    }

    zznb() {
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final boolean zzb(Class cls) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        boolean z = i3 % 2 != 0;
        int i4 = i2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:109:0x0775  */
    /* JADX WARN: Code duplicated, block: B:110:0x0790  */
    /* JADX WARN: Code duplicated, block: B:113:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:114:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:117:0x08d8  */
    /* JADX WARN: Code duplicated, block: B:118:0x0908  */
    /* JADX WARN: Code duplicated, block: B:133:0x04c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x05d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:55:0x0541  */
    /* JADX WARN: Code duplicated, block: B:60:0x055b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0587  */
    /* JADX WARN: Code duplicated, block: B:66:0x05a9 A[Catch: all -> 0x0558, TRY_LEAVE, TryCatch #4 {all -> 0x0558, blocks: (B:56:0x0552, B:64:0x0592, B:65:0x05a4, B:66:0x05a9), top: B:134:0x0552 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0617 A[Catch: Exception -> 0x06d4, TRY_LEAVE, TryCatch #6 {Exception -> 0x06d4, blocks: (B:70:0x05d1, B:72:0x060f, B:74:0x0617, B:83:0x06a2, B:86:0x06b4, B:87:0x06ba, B:77:0x062d, B:79:0x0650, B:81:0x0673, B:78:0x0641), top: B:138:0x05d1, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x062d A[Catch: all -> 0x06b3, TRY_ENTER, TryCatch #0 {all -> 0x06b3, blocks: (B:77:0x062d, B:79:0x0650, B:81:0x0673, B:78:0x0641), top: B:129:0x062b, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0641 A[Catch: all -> 0x06b3, TryCatch #0 {all -> 0x06b3, blocks: (B:77:0x062d, B:79:0x0650, B:81:0x0673, B:78:0x0641), top: B:129:0x062b, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:90:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:91:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:97:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:99:0x06e8  */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2) throws Throwable {
        int i3;
        String str;
        int i4;
        Object[] objArr;
        int i5;
        Object[] objArr2;
        int i6;
        int i7;
        int i8;
        int i9;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;
        char[] cArr;
        char[] cArr2;
        char c;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        String str2;
        boolean zEquals;
        boolean zEquals2;
        boolean z;
        File file2;
        int i23;
        boolean z2;
        FileReader fileReader2;
        BufferedReader bufferedReader2;
        int i24;
        String line;
        char[] cArr3;
        char[] cArr4;
        String str3;
        int i25 = 2 % 2;
        int i26 = TuitionPaymentFragmentbindingInflater1 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i26 % 128;
        int i27 = i26 % 2;
        try {
            byte modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
            int i28 = modifierMetaStateMask * 934;
            int i29 = (i28 & (-55645992)) + (i28 | (-55645992));
            int i30 = ~modifierMetaStateMask;
            int i31 = ~i;
            int i32 = ~((i30 ^ i31) | (i30 & i31));
            int i33 = (i29 - (~(-(-((((-59707) ^ i32) | ((-59707) & i32)) * (-933)))))) - 1;
            int i34 = ~i;
            int i35 = ((~(((-59707) ^ modifierMetaStateMask) | ((-59707) & modifierMetaStateMask))) | (~(((-59707) ^ i34) | ((-59707) & i34)))) * 933;
            char c2 = (char) ((((i33 & i35) + (i33 | i35)) - (~(-(-((~(59706 | modifierMetaStateMask)) * 933))))) - 1);
            int i36 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i37 = (i36 * (-661)) + 1071288202;
            int i38 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i39 = ~i36;
            int i40 = ~((i39 ^ 242034913) | (i39 & 242034913));
            int i41 = ((i38 ^ i40) | (i38 & i40)) * 1324;
            int i42 = (i37 ^ i41) + ((i37 & i41) << 1);
            int i43 = ~((i36 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i36 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
            int i44 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault4 | (-242034914));
            int i45 = -(-(((i43 ^ i44) | (i44 & i43)) * (-1324)));
            int i46 = (i42 & i45) + (i45 | i42);
            int i47 = ~i36;
            int i48 = ~((i47 & (-242034914)) | (i47 ^ (-242034914)));
            int i49 = ~((i36 & 242034913) | (242034913 ^ i36));
            int i50 = i48 ^ i49;
            Object[] objArr3 = new Object[1];
            a(new char[]{0, 0, 0, 0}, new char[]{8116, 37591, 14833, 37609}, c2, i46 + (((i49 & i48) | i50) * 662), new char[]{39976, 21047, 61531, 32356, 4259, 60379, 11803, 14147, 60736, 58464, 41142, 47727, 33519, 20859, 40928, 20836, 7498, 44766, 10908}, objArr3);
            int i51 = -MotionEvent.axisFromString("");
            int i52 = ~i51;
            int i53 = ~((i52 & i31) | (i52 ^ i31));
            int i54 = ~((-3205) | i);
            int i55 = ((((i51 * (-574)) - 1839096) - (~(-(-(((i53 & i54) | (i53 ^ i54)) * 1150))))) - 1) + (((~((i34 ^ 3204) | (i34 & 3204))) | i54) * (-575));
            int i56 = ~i51;
            int i57 = ~((i56 & i) | (i56 ^ i));
            int i58 = ~(i51 | i34);
            int i59 = -(-(((i58 & i57) | (i57 ^ i58)) * 575));
            Object[] objArr4 = new Object[1];
            a(new char[]{0, 0, 0, 0}, new char[]{53594, 25665, 34195, 45068}, (char) (((i55 | i59) << 1) - (i59 ^ i55)), TextUtils.indexOf("", ""), new char[]{44972, 17330, 11322, 42855, 41375, 5688, 51524, 25391, 16945, 57974, 45545, 22922, 18933, 9681, 50648, 43996, 51777, 1413}, objArr4);
            String[] strArr = {(String) objArr3[0], (String) objArr4[0]};
            int i60 = TuitionPaymentFragmentbindingInflater1 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i60 % 128;
            int i61 = 2;
            if (i60 % 2 != 0) {
                int i62 = 4 / 3;
            }
            int i63 = 0;
            while (true) {
                if (i63 >= i61) {
                    i3 = i;
                    break;
                }
                String str4 = strArr[i63];
                char[] cArr5 = {0, 0, 0, 0};
                char[] cArr6 = {5194, 64202, 1015, 41143};
                int i64 = -(ViewConfiguration.getScrollBarSize() >> 8);
                char c3 = (char) (((i64 | 46851) << 1) - (i64 ^ 46851));
                int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
                char[] cArr7 = {56270, 59263, 15307, 43612, 20762, 53417, 44939, 51302, 31457, 43817, 33554, 12697, 46760, 18585, 56427, 41718};
                int i65 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
                TuitionPaymentFragmentbindingInflater1 = i65 % 128;
                if (i65 % 2 == 0) {
                    Object[] objArr5 = new Object[1];
                    a(cArr5, cArr6, c3, doubleTapTimeout, cArr7, objArr5);
                    str3 = (String) objArr5[0];
                } else {
                    Object[] objArr6 = new Object[1];
                    a(cArr5, cArr6, c3, doubleTapTimeout, cArr7, objArr6);
                    str3 = (String) objArr6[0];
                }
                Class<?> cls = Class.forName(str3);
                if (((Boolean) cls.getMethod(str4, new Class[0]).invoke(cls, null)).booleanValue()) {
                    i3 = (i & (-2)) | (i34 & 1);
                    break;
                }
                i63 = (i63 | 1) + (i63 & 1);
                int i66 = TuitionPaymentFragmentbindingInflater1 + 63;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i66 % 128;
                int i67 = i66 % 2;
                i61 = 2;
            }
        } catch (Exception unused) {
            i3 = i ^ 2;
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char size = (char) (2419 - View.MeasureSpec.getSize(0));
                int i68 = 2846 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 5;
                byte b2 = (byte) 0;
                byte b3 = (byte) (b2 - 1);
                Object[] objArr7 = new Object[1];
                c(b2, b3, (byte) (b3 + 1), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, i68, iCombineMeasuredStates, -501222268, false, (String) objArr7[0], new Class[0]);
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
            long j = 16723049;
            long j2 = -1;
            long j3 = j ^ j2;
            long j4 = jLongValue ^ j2;
            long jMyTid = Process.myTid();
            long j5 = (((long) 592) * j) + (((long) (-590)) * jLongValue) + (((long) (-1182)) * ((j3 | jLongValue) ^ j2)) + (((long) (-591)) * ((((j3 | j4) | (jMyTid ^ j2)) ^ j2) | ((jLongValue | j) ^ j2))) + (((long) 591) * (jMyTid | j3 | j4)) + ((long) (-1175909735));
            int iMyUid = Process.myUid();
            int i69 = ((int) (j5 >> 32)) & ((-580930444) + ((~((-285213995) | iMyUid)) * 623) + (((~iMyUid) | 1150619648) * (-623)) + (((~(iMyUid | 1151316032)) | (~((-285910379) | iMyUid)) | 285213994) * 623));
            int i70 = ~i;
            int i71 = ((int) j5) & (2036779980 + (((~(i70 | 2057669900)) | (-2142608718) | (~((-715132169) | i))) * 717) + (((~(2057669900 | i)) | (~((-715132169) | i70)) | (-2142608718)) * 717));
            int i72 = (i69 & i71) | (i69 ^ i71);
            int i73 = (i72 | 1) & (~(i72 & 1));
            int i74 = -i73;
            int i75 = ((i73 & i74) | (i73 ^ i74)) >> 31;
            int i76 = ((i & (-11)) | (i70 & 10)) & (~i75);
            int i77 = i75 & i;
            int i78 = (i77 & i76) | (i76 ^ i77);
            int i79 = ((~i3) & i) | (i3 & i70);
            int i80 = -i79;
            int i81 = ((i79 & i80) | (i79 ^ i80)) >> 31;
            int i82 = i78 & (~i81);
            int i83 = i3 & i81;
            int i84 = (i82 ^ i83) | (i83 & i82);
            try {
                Object[] objArr8 = new Object[1];
                a(new char[]{0, 0, 0, 0}, new char[]{26103, 4481, 48178, 49324}, (char) (44219 - (~(-(ViewConfiguration.getTapTimeout() >> 16)))), Drawable.resolveOpacity(0, 0), new char[]{42266, 19237, 13883, 17602, 47345, 37246, 5997, 14272, 34817, 4024, 47485, 3174, 51026, 45390, 62276, 13635, 60136, 36629, 12905, 62270, 42042, 20243, 37755, 37546, 26685, 34450, 51239, 46322, 3268, 18421, 5862, 33020, 26014, 57700, 22644, 46298, 43421, 4, 36312, 50151}, objArr8);
                File file3 = new File((String) objArr8[0]);
                try {
                    if (file3.canRead()) {
                        FileReader fileReader3 = new FileReader(file3);
                        BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                        try {
                            String line2 = bufferedReader3.readLine();
                            Object[] objArr9 = new Object[1];
                            a(new char[]{0, 0, 0, 0}, new char[]{17589, 3475, 25631, 40685}, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 60772), 520983363 - (~(-Gravity.getAbsoluteGravity(0, 0))), new char[]{3001, 6635, 20008}, objArr9);
                            String str5 = (String) objArr9[0];
                            int i85 = TuitionPaymentFragmentbindingInflater1;
                            int i86 = (i85 & 31) + (i85 | 31);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i86 % 128;
                            if (i86 % 2 != 0) {
                                line2.equals(str5);
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            if (line2.equals(str5)) {
                                fileReader3.close();
                                bufferedReader3.close();
                            } else {
                                fileReader3.close();
                                bufferedReader3.close();
                                int i87 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i88 = (i87 ^ 59) + ((i87 & 59) << 1);
                                TuitionPaymentFragmentbindingInflater1 = i88 % 128;
                                int i89 = i88 % 2;
                                str = line2;
                            }
                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i90 = packedPositionGroup * 70;
                            int i91 = ((i90 | (-4254760)) << 1) - (i90 ^ (-4254760));
                            int i92 = ~packedPositionGroup;
                            int i93 = (i92 & (-62571)) | (i92 ^ (-62571));
                            int i94 = ~((i93 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i93 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                            int i95 = (packedPositionGroup ^ 62570) | (packedPositionGroup & 62570);
                            int i96 = ~((i95 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i95 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                            int i97 = (i91 - (~(-(-(((i94 ^ i96) | (i94 & i96)) * 69))))) - 1;
                            int i98 = ~packedPositionGroup;
                            int i99 = ~(i98 | 62570);
                            int i100 = ~(i98 | iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
                            int i101 = (i99 ^ i100) | (i100 & i99);
                            int i102 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & 62570) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 ^ 62570));
                            char c4 = (char) (((i97 - (~(-(-(((i102 & i101) | (i101 ^ i102)) * (-69)))))) - 1) + ((~(packedPositionGroup | (-62571))) * 69));
                            int i103 = -TextUtils.indexOf("", "", 0, 0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i104 = ~i103;
                            int i105 = (i104 & (-972043670)) | (i104 ^ (-972043670));
                            int i106 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                            int i107 = ~((i105 ^ i106) | (i105 & i106));
                            int i108 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 ^ 972043669) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & 972043669));
                            int i109 = ((i103 * (-519)) - 371389379) + (((i107 ^ i108) | (i108 & i107)) * 520);
                            int i110 = ~((-972043670) | i106);
                            int i111 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & i103) | (i103 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                            int i112 = ~i111;
                            i4 = i110 ^ i112;
                            int i113 = (i109 - (~((i4 | (i110 & i112)) * (-1040)))) - 1;
                            int i114 = ~i103;
                            int i115 = ~((i114 & i106) | (i114 ^ i106));
                            int i116 = ~(i103 | (-972043670));
                            int i117 = (i115 & i116) | (i115 ^ i116);
                            int i118 = ~i111;
                            int i119 = ((i117 & i118) | (i117 ^ i118)) * 520;
                            Object[] objArr10 = new Object[1];
                            a(new char[]{0, 0, 0, 0}, new char[]{38233, 61493, 27193, 49652}, c4, (i113 & i119) + (i119 | i113), new char[]{56551, 22779, 4338, 34581, 60087, 45064, 22231, 52074, 32286, 30976, 4347, 7628, 9251, 1148, 64682, 17752, 36738, 50452, 1136, 42105, 43236, 13035, 9347, 20098, 55621, 26482, 62045, 7231, 54615, 57248, 53585}, objArr10);
                            file = new File((String) objArr10[0]);
                            int i120 = TuitionPaymentFragmentbindingInflater1;
                            int i121 = (i120 ^ 33) + ((i120 & 33) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i121 % 128;
                            int i122 = i121 % 2;
                            if (!file.canRead()) {
                                try {
                                    fileReader = new FileReader(file);
                                    bufferedReader = new BufferedReader(fileReader);
                                    try {
                                        String line3 = bufferedReader.readLine();
                                        cArr = new char[]{0, 0, 0, 0};
                                        cArr2 = new char[]{61885, 57138, 4635, 33775};
                                        int i123 = -Gravity.getAbsoluteGravity(0, 0);
                                        c = (char) ((i123 & 61202) + (i123 | 61202));
                                        i17 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                        int i124 = (i17 * (-167)) - 781859639;
                                        int i125 = ~i17;
                                        int i126 = TuitionPaymentFragmentbindingInflater1;
                                        int i127 = ((i126 | 81) << 1) - (i126 ^ 81);
                                        i4 = i84;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i127 % 128;
                                        int i128 = i127 % 2;
                                        int i129 = -(-(336 * ((~((i125 & (-467612402)) | (i125 ^ (-467612402)))) | (~(((-467612402) ^ i) | ((-467612402) & i))))));
                                        i18 = ((i124 | i129) << 1) - (i124 ^ i129);
                                        i19 = ((i126 | 65) << 1) - (i126 ^ 65);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
                                        if (i19 % 2 != 0) {
                                            int i130 = ~((i17 ^ 467612401) | (467612401 & i17));
                                            int i131 = ~((i17 ^ i) | (i17 & i));
                                            try {
                                                i21 = i18 >> ((-168) / ((i130 ^ i131) | (i130 & i131)));
                                                i20 = 1;
                                            } catch (Throwable th) {
                                                th = th;
                                                fileReader.close();
                                                bufferedReader.close();
                                                throw th;
                                            }
                                        } else {
                                            int i132 = ~((i17 ^ 467612401) | (467612401 & i17));
                                            int i133 = ~((i17 ^ i) | (i17 & i));
                                            i20 = 1;
                                            i21 = (i18 - (~(-(-(((i132 ^ i133) | (i132 & i133)) * (-168)))))) - 1;
                                        }
                                        i22 = ((i126 | 119) << i20) - (i126 ^ 119);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
                                        if (i22 % 2 != 0) {
                                            int i134 = ~i;
                                            Object[] objArr11 = new Object[1];
                                            a(cArr, cArr2, c, i21 % (168 * ((~((i17 & i134) | (i134 ^ i17))) | (-467612402))), new char[]{62152}, objArr11);
                                            str2 = (String) objArr11[0];
                                        } else {
                                            int i135 = ~((i17 & i70) | (i70 ^ i17));
                                            Object[] objArr12 = new Object[1];
                                            a(cArr, cArr2, c, i21 + (168 * ((i135 & (-467612402)) | ((-467612402) ^ i135))), new char[]{62152}, objArr12);
                                            str2 = (String) objArr12[0];
                                        }
                                        zEquals = line3.equals(str2);
                                        fileReader.close();
                                        bufferedReader.close();
                                        if (zEquals) {
                                            try {
                                                Object[] objArr13 = new Object[1];
                                                a(new char[]{0, 0, 0, 0}, new char[]{24644, 1603, 18461, 57045}, (char) (ViewConfiguration.getPressedStateDuration() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{21509, 36823, 35057, 24332, 59132, 54821, 50232, 11382, 29575, 19511, 35474, 5652, 59361, 29227, 54608, 54968, 31833, 60930, 64881, 20343, 45079, 33113, 61254, 59450, 1580, 7876, 64590, 12810, 33932, 26910, 34734, 52386, 45397, 8622, 25761, 42042}, objArr13);
                                                file2 = new File((String) objArr13[0]);
                                                int i136 = TuitionPaymentFragmentbindingInflater1 + 43;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i136 % 128;
                                                int i137 = i136 % 2;
                                                if (!(!file2.canRead())) {
                                                    fileReader2 = new FileReader(file2);
                                                    bufferedReader2 = new BufferedReader(fileReader2);
                                                    i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
                                                    TuitionPaymentFragmentbindingInflater1 = i24 % 128;
                                                    try {
                                                        if (i24 % 2 == 0) {
                                                            line = bufferedReader2.readLine();
                                                            cArr3 = new char[]{0, 0, 0, 0};
                                                            cArr4 = new char[]{61885, 57138, 4635, 33775};
                                                            int i138 = 77 / 0;
                                                        } else {
                                                            line = bufferedReader2.readLine();
                                                            cArr3 = new char[]{0, 0, 0, 0};
                                                            cArr4 = new char[]{61885, 57138, 4635, 33775};
                                                        }
                                                        char[] cArr8 = cArr3;
                                                        char[] cArr9 = cArr4;
                                                        int i139 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                                        char c5 = (char) (((61201 | i139) << 1) - (i139 ^ 61201));
                                                        int i140 = TuitionPaymentFragmentbindingInflater1;
                                                        int i141 = (i140 ^ 65) + ((i140 & 65) << 1);
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i141 % 128;
                                                        int i142 = i141 % 2;
                                                        int i143 = -View.resolveSizeAndState(0, 0, 0);
                                                        Object[] objArr14 = new Object[1];
                                                        a(cArr8, cArr9, c5, ((i143 & 467612401) << 1) + (i143 ^ 467612401), new char[]{62152}, objArr14);
                                                        zEquals2 = line.equals((String) objArr14[0]);
                                                        int i144 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                        int i145 = (i144 & 93) + (i144 | 93);
                                                        TuitionPaymentFragmentbindingInflater1 = i145 % 128;
                                                        int i146 = i145 % 2;
                                                        fileReader2.close();
                                                        bufferedReader2.close();
                                                        int i147 = TuitionPaymentFragmentbindingInflater1 + 17;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i147 % 128;
                                                        int i148 = i147 % 2;
                                                        z = true;
                                                    } catch (Throwable th2) {
                                                        fileReader2.close();
                                                        bufferedReader2.close();
                                                        throw th2;
                                                    }
                                                } else {
                                                    int i149 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                    i23 = (i149 & 57) + (i149 | 57);
                                                    TuitionPaymentFragmentbindingInflater1 = i23 % 128;
                                                    if (i23 % 2 == 0) {
                                                        z = true;
                                                        z2 = false;
                                                    } else {
                                                        z = true;
                                                        z2 = true;
                                                    }
                                                    zEquals2 = !z2;
                                                }
                                            } catch (Exception unused2) {
                                                zEquals2 = false;
                                            }
                                            if ((zEquals2 ^ z) != z) {
                                                int i150 = TuitionPaymentFragmentbindingInflater1;
                                                int i151 = (i150 & 75) + (i150 | 75);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i151 % 128;
                                                int i152 = i151 % 2;
                                                if (str != null) {
                                                    objArr = new Object[]{new int[]{i ^ 20}, new String[]{str}};
                                                } else {
                                                    i16 = 2;
                                                }
                                            }
                                            objArr = new Object[i16];
                                            objArr[0] = new int[]{i};
                                            objArr[1] = new String[0];
                                            int i153 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
                                            TuitionPaymentFragmentbindingInflater1 = i153 % 128;
                                            int i154 = i153 % 2;
                                        }
                                        int i155 = ((int[]) objArr[0])[0];
                                        int i156 = i ^ i4;
                                        int i157 = -i156;
                                        int i158 = ((i156 & i157) | (i156 ^ i157)) >> 31;
                                        int i159 = (~i158) & i155;
                                        int i160 = i4 & i158;
                                        i5 = (i160 & i159) | (i159 ^ i160);
                                        String[] strArr2 = (String[]) objArr[1];
                                        Object[] objArr15 = new Object[2];
                                        int i161 = (i155 & i70) | ((~i155) & i);
                                        int i162 = -i161;
                                        int i163 = (((i161 & i162) | (i161 ^ i162)) >> 31) & 1;
                                        int i164 = (~(((-i163) | i163) >> 31)) & 1;
                                        objArr15[i163] = null;
                                        objArr15[i164] = strArr2;
                                        String[] strArr3 = (String[]) objArr15[0];
                                        objArr2 = new Object[4];
                                        int i165 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        i6 = ((i165 | 95) << 1) - (i165 ^ 95);
                                        int i166 = i6 % 128;
                                        TuitionPaymentFragmentbindingInflater1 = i166;
                                        if (i6 % 2 == 0) {
                                            objArr2[1] = new int[1];
                                            objArr2[1] = new int[1];
                                            objArr2[4] = new int[0];
                                            int i167 = i ^ i5;
                                            int i168 = -i167;
                                            i7 = (((i167 & i168) | (i167 ^ i168)) >> 16) & 61;
                                        } else {
                                            objArr2[0] = new int[1];
                                            objArr2[1] = new int[1];
                                            objArr2[2] = new int[1];
                                            int i169 = (~(i & i5)) & (i | i5);
                                            int i170 = -i169;
                                            i7 = (((i169 & i170) | (i169 ^ i170)) >> 31) & 16;
                                        }
                                        i8 = (i166 & 57) + (i166 | 57);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                                        if (i8 % 2 != 0) {
                                            ((int[]) objArr2[1])[1] = i;
                                            ((int[]) objArr2[2])[0] = i5;
                                        } else {
                                            ((int[]) objArr2[0])[0] = i;
                                            ((int[]) objArr2[2])[0] = i5;
                                        }
                                        objArr2[3] = strArr3;
                                        int i171 = (~((-447557491) | i70)) | 44639842;
                                        int i172 = ~((-4329614) | i);
                                        i9 = 974674432 + ((i171 | i172) * (-502)) + (((~((-402917649) | i70)) | i172) * TypedValues.PositionType.TYPE_DRAWPATH) + i7;
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                        int i173 = i9 * 483;
                                        int i174 = -(-(i2 * 242));
                                        int i175 = (i173 ^ i174) + ((i173 & i174) << 1);
                                        int i176 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i177 = ((i176 | 11) << 1) - (i176 ^ 11);
                                        TuitionPaymentFragmentbindingInflater1 = i177 % 128;
                                        int i178 = i177 % 2;
                                        i10 = ~i9;
                                        int i179 = ~i2;
                                        int i180 = ~((i179 & i10) | (i10 ^ i179));
                                        int i181 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i182 = ~((i181 & i10) | (i10 ^ i181));
                                        int i183 = -(-((-241) * ((i180 & i182) | (i180 ^ i182))));
                                        i11 = (i175 ^ i183) + ((i175 & i183) << 1) + (((i9 ^ i2) | (i9 & i2)) * (-482));
                                        int i184 = ~i2;
                                        i12 = ~((i184 & i9) | (i184 ^ i9));
                                        int i185 = ~i;
                                        int i186 = ~(1692697645 | i185);
                                        int i187 = (i186 & 1160770147) | (1160770147 ^ i186);
                                        int i188 = ~(((-1692697646) & i) | ((-1692697646) ^ i));
                                        int i189 = -(-(((i187 & i188) | (i187 ^ i188)) * (-564)));
                                        int i190 = (2082101350 & i189) + (i189 | 2082101350) + ((~(((-549454861) & i) | ((-549454861) ^ i))) * 1128);
                                        int i191 = ~((1160770147 ^ i185) | (1160770147 & i185));
                                        int i192 = -(-(((i191 & 1143242785) | (i191 ^ 1143242785)) * 564));
                                        i13 = ((i190 | i192) << 1) - (i192 ^ i190);
                                        int i193 = (i70 ^ (-401107025)) | (i70 & (-401107025));
                                        int i194 = 941251590 + (((~((-1333826888) | i)) | (~((i193 ^ 1333826887) | (i193 & 1333826887)))) * (-406));
                                        int i195 = -(-((~(((-1333826888) ^ i70) | (i70 & (-1333826888)) | (-401107025))) * (-406)));
                                        i14 = (i194 ^ i195) + ((i195 & i194) << 1);
                                        int i196 = ~((i & 401107024) | (401107024 ^ i));
                                        int i197 = ~((i185 ^ 1333826887) | (i185 & 1333826887));
                                        i15 = -(-(((i196 & i197) | (i196 ^ i197)) * 406));
                                        if (i13 <= (i14 & i15) + (i15 | i14)) {
                                            int i198 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            int i199 = (i198 & i10) | (i10 ^ i198);
                                            int i200 = ~((i199 & i2) | (i199 ^ i2));
                                            int i201 = i11 / (241 >> ((i200 & i12) | (i12 ^ i200)));
                                            int i202 = ((i201 | 26) << 1) - (i201 ^ 26);
                                            int i203 = (i202 & (~i201)) | ((~i202) & i201);
                                            int i204 = i203 / 88;
                                            int i205 = (i203 | i204) & (~(i203 & i204));
                                            ((int[]) objArr2[0])[1] = i205 ^ (i205 * 5);
                                        } else {
                                            int i206 = ~i9;
                                            int i207 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            int i208 = (i207 & i206) | (i206 ^ i207);
                                            int i209 = ~((i208 & i2) | (i208 ^ i2));
                                            int i210 = -(-(((i209 & i12) | (i12 ^ i209)) * 241));
                                            int i211 = (i11 & i210) + (i210 | i11);
                                            int i212 = (i211 << 13) ^ i211;
                                            int i213 = i212 ^ (i212 >>> 17);
                                            int i214 = i213 << 5;
                                            ((int[]) objArr2[1])[0] = ((~i213) & i214) | ((~i214) & i213);
                                        }
                                        int i215 = i176 + 77;
                                        TuitionPaymentFragmentbindingInflater1 = i215 % 128;
                                        int i216 = i215 % 2;
                                        return objArr2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                } catch (Exception unused3) {
                                }
                            } else {
                                i4 = i84;
                            }
                            i16 = 2;
                            objArr = new Object[i16];
                            objArr[0] = new int[]{i};
                            objArr[1] = new String[0];
                            int i1510 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
                            TuitionPaymentFragmentbindingInflater1 = i1510 % 128;
                            int i1511 = i1510 % 2;
                            int i1512 = ((int[]) objArr[0])[0];
                            int i1513 = i ^ i4;
                            int i1514 = -i1513;
                            int i1515 = ((i1513 & i1514) | (i1513 ^ i1514)) >> 31;
                            int i1516 = (~i1515) & i1512;
                            int i1610 = i4 & i1515;
                            i5 = (i1610 & i1516) | (i1516 ^ i1610);
                            String[] strArr4 = (String[]) objArr[1];
                            Object[] objArr16 = new Object[2];
                            int i1611 = (i1512 & i70) | ((~i1512) & i);
                            int i1612 = -i1611;
                            int i1613 = (((i1611 & i1612) | (i1611 ^ i1612)) >> 31) & 1;
                            int i1614 = (~(((-i1613) | i1613) >> 31)) & 1;
                            objArr16[i1613] = null;
                            objArr16[i1614] = strArr4;
                            String[] strArr5 = (String[]) objArr16[0];
                            objArr2 = new Object[4];
                            int i1615 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            i6 = ((i1615 | 95) << 1) - (i1615 ^ 95);
                            int i1616 = i6 % 128;
                            TuitionPaymentFragmentbindingInflater1 = i1616;
                            if (i6 % 2 == 0) {
                                objArr2[1] = new int[1];
                                objArr2[1] = new int[1];
                                objArr2[4] = new int[0];
                                int i1617 = i ^ i5;
                                int i1618 = -i1617;
                                i7 = (((i1617 & i1618) | (i1617 ^ i1618)) >> 16) & 61;
                            } else {
                                objArr2[0] = new int[1];
                                objArr2[1] = new int[1];
                                objArr2[2] = new int[1];
                                int i1619 = (~(i & i5)) & (i | i5);
                                int i1710 = -i1619;
                                i7 = (((i1619 & i1710) | (i1619 ^ i1710)) >> 31) & 16;
                            }
                            i8 = (i1616 & 57) + (i1616 | 57);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                            if (i8 % 2 != 0) {
                                ((int[]) objArr2[1])[1] = i;
                                ((int[]) objArr2[2])[0] = i5;
                            } else {
                                ((int[]) objArr2[0])[0] = i;
                                ((int[]) objArr2[2])[0] = i5;
                            }
                            objArr2[3] = strArr5;
                            int i1711 = (~((-447557491) | i70)) | 44639842;
                            int i1712 = ~((-4329614) | i);
                            i9 = 974674432 + ((i1711 | i1712) * (-502)) + (((~((-402917649) | i70)) | i1712) * TypedValues.PositionType.TYPE_DRAWPATH) + i7;
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i1713 = i9 * 483;
                            int i1714 = -(-(i2 * 242));
                            int i1715 = (i1713 ^ i1714) + ((i1713 & i1714) << 1);
                            int i1716 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i1717 = ((i1716 | 11) << 1) - (i1716 ^ 11);
                            TuitionPaymentFragmentbindingInflater1 = i1717 % 128;
                            int i1718 = i1717 % 2;
                            i10 = ~i9;
                            int i1719 = ~i2;
                            int i1810 = ~((i1719 & i10) | (i10 ^ i1719));
                            int i1811 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i1812 = ~((i1811 & i10) | (i10 ^ i1811));
                            int i1813 = -(-((-241) * ((i1810 & i1812) | (i1810 ^ i1812))));
                            i11 = (i1715 ^ i1813) + ((i1715 & i1813) << 1) + (((i9 ^ i2) | (i9 & i2)) * (-482));
                            int i1814 = ~i2;
                            i12 = ~((i1814 & i9) | (i1814 ^ i9));
                            int i1815 = ~i;
                            int i1816 = ~(1692697645 | i1815);
                            int i1817 = (i1816 & 1160770147) | (1160770147 ^ i1816);
                            int i1818 = ~(((-1692697646) & i) | ((-1692697646) ^ i));
                            int i1819 = -(-(((i1817 & i1818) | (i1817 ^ i1818)) * (-564)));
                            int i1910 = (2082101350 & i1819) + (i1819 | 2082101350) + ((~(((-549454861) & i) | ((-549454861) ^ i))) * 1128);
                            int i1911 = ~((1160770147 ^ i1815) | (1160770147 & i1815));
                            int i1912 = -(-(((i1911 & 1143242785) | (i1911 ^ 1143242785)) * 564));
                            i13 = ((i1910 | i1912) << 1) - (i1912 ^ i1910);
                            int i1913 = (i70 ^ (-401107025)) | (i70 & (-401107025));
                            int i1914 = 941251590 + (((~((-1333826888) | i)) | (~((i1913 ^ 1333826887) | (i1913 & 1333826887)))) * (-406));
                            int i1915 = -(-((~(((-1333826888) ^ i70) | (i70 & (-1333826888)) | (-401107025))) * (-406)));
                            i14 = (i1914 ^ i1915) + ((i1915 & i1914) << 1);
                            int i1916 = ~((i & 401107024) | (401107024 ^ i));
                            int i1917 = ~((i1815 ^ 1333826887) | (i1815 & 1333826887));
                            i15 = -(-(((i1916 & i1917) | (i1916 ^ i1917)) * 406));
                            if (i13 <= (i14 & i15) + (i15 | i14)) {
                                int i1918 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i1919 = (i1918 & i10) | (i10 ^ i1918);
                                int i2010 = ~((i1919 & i2) | (i1919 ^ i2));
                                int i2011 = i11 / (241 >> ((i2010 & i12) | (i12 ^ i2010)));
                                int i2012 = ((i2011 | 26) << 1) - (i2011 ^ 26);
                                int i2013 = (i2012 & (~i2011)) | ((~i2012) & i2011);
                                int i2014 = i2013 / 88;
                                int i2015 = (i2013 | i2014) & (~(i2013 & i2014));
                                ((int[]) objArr2[0])[1] = i2015 ^ (i2015 * 5);
                            } else {
                                int i2016 = ~i9;
                                int i2017 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i2018 = (i2017 & i2016) | (i2016 ^ i2017);
                                int i2019 = ~((i2018 & i2) | (i2018 ^ i2));
                                int i217 = -(-(((i2019 & i12) | (i12 ^ i2019)) * 241));
                                int i218 = (i11 & i217) + (i217 | i11);
                                int i219 = (i218 << 13) ^ i218;
                                int i2110 = i219 ^ (i219 >>> 17);
                                int i2111 = i2110 << 5;
                                ((int[]) objArr2[1])[0] = ((~i2110) & i2111) | ((~i2111) & i2110);
                            }
                            int i2112 = i1716 + 77;
                            TuitionPaymentFragmentbindingInflater1 = i2112 % 128;
                            int i2113 = i2112 % 2;
                            return objArr2;
                        } catch (Throwable th4) {
                            fileReader3.close();
                            bufferedReader3.close();
                            throw th4;
                        }
                    }
                    int i220 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i221 = (i220 & 85) + (i220 | 85);
                    TuitionPaymentFragmentbindingInflater1 = i221 % 128;
                    int i222 = i221 % 2;
                    int i223 = (i220 ^ 79) + ((i220 & 79) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i223 % 128;
                    int i224 = i223 % 2;
                    int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i910 = packedPositionGroup2 * 70;
                    int i911 = ((i910 | (-4254760)) << 1) - (i910 ^ (-4254760));
                    int i912 = ~packedPositionGroup2;
                    int i913 = (i912 & (-62571)) | (i912 ^ (-62571));
                    int i914 = ~((i913 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i913 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                    int i915 = (packedPositionGroup2 ^ 62570) | (packedPositionGroup2 & 62570);
                    int i916 = ~((i915 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i915 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                    int i917 = (i911 - (~(-(-(((i914 ^ i916) | (i914 & i916)) * 69))))) - 1;
                    int i918 = ~packedPositionGroup2;
                    int i919 = ~(i918 | 62570);
                    int i1010 = ~(i918 | iTuitionPaymentFragmentspecialinlinedviewModeldefault7);
                    int i1011 = (i919 ^ i1010) | (i1010 & i919);
                    int i1012 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault7 & 62570) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault7 ^ 62570));
                    char c6 = (char) (((i917 - (~(-(-(((i1012 & i1011) | (i1011 ^ i1012)) * (-69)))))) - 1) + ((~(packedPositionGroup2 | (-62571))) * 69));
                    int i1013 = -TextUtils.indexOf("", "", 0, 0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i1014 = ~i1013;
                    int i1015 = (i1014 & (-972043670)) | (i1014 ^ (-972043670));
                    int i1016 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                    int i1017 = ~((i1015 ^ i1016) | (i1015 & i1016));
                    int i1018 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault8 ^ 972043669) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & 972043669));
                    int i1019 = ((i1013 * (-519)) - 371389379) + (((i1017 ^ i1018) | (i1018 & i1017)) * 520);
                    int i1110 = ~((-972043670) | i1016);
                    int i1111 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & i1013) | (i1013 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8);
                    int i1112 = ~i1111;
                    i4 = i1110 ^ i1112;
                    int i1113 = (i1019 - (~((i4 | (i1110 & i1112)) * (-1040)))) - 1;
                    int i1114 = ~i1013;
                    int i1115 = ~((i1114 & i1016) | (i1114 ^ i1016));
                    int i1116 = ~(i1013 | (-972043670));
                    int i1117 = (i1115 & i1116) | (i1115 ^ i1116);
                    int i1118 = ~i1111;
                    int i1119 = ((i1117 & i1118) | (i1117 ^ i1118)) * 520;
                    Object[] objArr17 = new Object[1];
                    a(new char[]{0, 0, 0, 0}, new char[]{38233, 61493, 27193, 49652}, c6, (i1113 & i1119) + (i1119 | i1113), new char[]{56551, 22779, 4338, 34581, 60087, 45064, 22231, 52074, 32286, 30976, 4347, 7628, 9251, 1148, 64682, 17752, 36738, 50452, 1136, 42105, 43236, 13035, 9347, 20098, 55621, 26482, 62045, 7231, 54615, 57248, 53585}, objArr17);
                    file = new File((String) objArr17[0]);
                    int i1210 = TuitionPaymentFragmentbindingInflater1;
                    int i1211 = (i1210 ^ 33) + ((i1210 & 33) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1211 % 128;
                    int i1212 = i1211 % 2;
                    if (!file.canRead()) {
                        fileReader = new FileReader(file);
                        bufferedReader = new BufferedReader(fileReader);
                        String line4 = bufferedReader.readLine();
                        cArr = new char[]{0, 0, 0, 0};
                        cArr2 = new char[]{61885, 57138, 4635, 33775};
                        int i1213 = -Gravity.getAbsoluteGravity(0, 0);
                        c = (char) ((i1213 & 61202) + (i1213 | 61202));
                        i17 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int i1214 = (i17 * (-167)) - 781859639;
                        int i1215 = ~i17;
                        int i1216 = TuitionPaymentFragmentbindingInflater1;
                        int i1217 = ((i1216 | 81) << 1) - (i1216 ^ 81);
                        i4 = i84;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1217 % 128;
                        int i1218 = i1217 % 2;
                        int i1219 = -(-(336 * ((~((i1215 & (-467612402)) | (i1215 ^ (-467612402)))) | (~(((-467612402) ^ i) | ((-467612402) & i))))));
                        i18 = ((i1214 | i1219) << 1) - (i1214 ^ i1219);
                        i19 = ((i1216 | 65) << 1) - (i1216 ^ 65);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
                        if (i19 % 2 != 0) {
                            int i1310 = ~((i17 ^ 467612401) | (467612401 & i17));
                            int i1311 = ~((i17 ^ i) | (i17 & i));
                            i21 = i18 >> ((-168) / ((i1310 ^ i1311) | (i1310 & i1311)));
                            i20 = 1;
                        } else {
                            int i1312 = ~((i17 ^ 467612401) | (467612401 & i17));
                            int i1313 = ~((i17 ^ i) | (i17 & i));
                            i20 = 1;
                            i21 = (i18 - (~(-(-(((i1312 ^ i1313) | (i1312 & i1313)) * (-168)))))) - 1;
                        }
                        i22 = ((i1216 | 119) << i20) - (i1216 ^ 119);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
                        if (i22 % 2 != 0) {
                            int i1314 = ~i;
                            Object[] objArr18 = new Object[1];
                            a(cArr, cArr2, c, i21 % (168 * ((~((i17 & i1314) | (i1314 ^ i17))) | (-467612402))), new char[]{62152}, objArr18);
                            str2 = (String) objArr18[0];
                        } else {
                            int i1315 = ~((i17 & i70) | (i70 ^ i17));
                            Object[] objArr19 = new Object[1];
                            a(cArr, cArr2, c, i21 + (168 * ((i1315 & (-467612402)) | ((-467612402) ^ i1315))), new char[]{62152}, objArr19);
                            str2 = (String) objArr19[0];
                        }
                        zEquals = line4.equals(str2);
                        fileReader.close();
                        bufferedReader.close();
                        if (zEquals) {
                            Object[] objArr110 = new Object[1];
                            a(new char[]{0, 0, 0, 0}, new char[]{24644, 1603, 18461, 57045}, (char) (ViewConfiguration.getPressedStateDuration() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{21509, 36823, 35057, 24332, 59132, 54821, 50232, 11382, 29575, 19511, 35474, 5652, 59361, 29227, 54608, 54968, 31833, 60930, 64881, 20343, 45079, 33113, 61254, 59450, 1580, 7876, 64590, 12810, 33932, 26910, 34734, 52386, 45397, 8622, 25761, 42042}, objArr110);
                            file2 = new File((String) objArr110[0]);
                            int i1316 = TuitionPaymentFragmentbindingInflater1 + 43;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1316 % 128;
                            int i1317 = i1316 % 2;
                            if (!(!file2.canRead())) {
                                fileReader2 = new FileReader(file2);
                                bufferedReader2 = new BufferedReader(fileReader2);
                                i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
                                TuitionPaymentFragmentbindingInflater1 = i24 % 128;
                                if (i24 % 2 == 0) {
                                    line = bufferedReader2.readLine();
                                    cArr3 = new char[]{0, 0, 0, 0};
                                    cArr4 = new char[]{61885, 57138, 4635, 33775};
                                    int i1318 = 77 / 0;
                                } else {
                                    line = bufferedReader2.readLine();
                                    cArr3 = new char[]{0, 0, 0, 0};
                                    cArr4 = new char[]{61885, 57138, 4635, 33775};
                                }
                                char[] cArr10 = cArr3;
                                char[] cArr11 = cArr4;
                                int i1319 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                char c7 = (char) (((61201 | i1319) << 1) - (i1319 ^ 61201));
                                int i1410 = TuitionPaymentFragmentbindingInflater1;
                                int i1411 = (i1410 ^ 65) + ((i1410 & 65) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1411 % 128;
                                int i1412 = i1411 % 2;
                                int i1413 = -View.resolveSizeAndState(0, 0, 0);
                                Object[] objArr111 = new Object[1];
                                a(cArr10, cArr11, c7, ((i1413 & 467612401) << 1) + (i1413 ^ 467612401), new char[]{62152}, objArr111);
                                zEquals2 = line.equals((String) objArr111[0]);
                                int i1414 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i1415 = (i1414 & 93) + (i1414 | 93);
                                TuitionPaymentFragmentbindingInflater1 = i1415 % 128;
                                int i1416 = i1415 % 2;
                                fileReader2.close();
                                bufferedReader2.close();
                                int i1417 = TuitionPaymentFragmentbindingInflater1 + 17;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1417 % 128;
                                int i1418 = i1417 % 2;
                                z = true;
                            } else {
                                int i1419 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                i23 = (i1419 & 57) + (i1419 | 57);
                                TuitionPaymentFragmentbindingInflater1 = i23 % 128;
                                if (i23 % 2 == 0) {
                                    z = true;
                                    z2 = false;
                                } else {
                                    z = true;
                                    z2 = true;
                                }
                                zEquals2 = !z2;
                            }
                            if ((zEquals2 ^ z) != z) {
                                int i1517 = TuitionPaymentFragmentbindingInflater1;
                                int i1518 = (i1517 & 75) + (i1517 | 75);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1518 % 128;
                                int i1519 = i1518 % 2;
                                if (str != null) {
                                    objArr = new Object[]{new int[]{i ^ 20}, new String[]{str}};
                                } else {
                                    i16 = 2;
                                }
                            }
                            objArr = new Object[i16];
                            objArr[0] = new int[]{i};
                            objArr[1] = new String[0];
                            int i15110 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
                            TuitionPaymentFragmentbindingInflater1 = i15110 % 128;
                            int i15111 = i15110 % 2;
                        }
                        int i15112 = ((int[]) objArr[0])[0];
                        int i15113 = i ^ i4;
                        int i15114 = -i15113;
                        int i15115 = ((i15113 & i15114) | (i15113 ^ i15114)) >> 31;
                        int i15116 = (~i15115) & i15112;
                        int i16110 = i4 & i15115;
                        i5 = (i16110 & i15116) | (i15116 ^ i16110);
                        String[] strArr6 = (String[]) objArr[1];
                        Object[] objArr112 = new Object[2];
                        int i16111 = (i15112 & i70) | ((~i15112) & i);
                        int i16112 = -i16111;
                        int i16113 = (((i16111 & i16112) | (i16111 ^ i16112)) >> 31) & 1;
                        int i16114 = (~(((-i16113) | i16113) >> 31)) & 1;
                        objArr112[i16113] = null;
                        objArr112[i16114] = strArr6;
                        String[] strArr7 = (String[]) objArr112[0];
                        objArr2 = new Object[4];
                        int i16115 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        i6 = ((i16115 | 95) << 1) - (i16115 ^ 95);
                        int i16116 = i6 % 128;
                        TuitionPaymentFragmentbindingInflater1 = i16116;
                        if (i6 % 2 == 0) {
                            objArr2[1] = new int[1];
                            objArr2[1] = new int[1];
                            objArr2[4] = new int[0];
                            int i16117 = i ^ i5;
                            int i16118 = -i16117;
                            i7 = (((i16117 & i16118) | (i16117 ^ i16118)) >> 16) & 61;
                        } else {
                            objArr2[0] = new int[1];
                            objArr2[1] = new int[1];
                            objArr2[2] = new int[1];
                            int i16119 = (~(i & i5)) & (i | i5);
                            int i17110 = -i16119;
                            i7 = (((i16119 & i17110) | (i16119 ^ i17110)) >> 31) & 16;
                        }
                        i8 = (i16116 & 57) + (i16116 | 57);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                        if (i8 % 2 != 0) {
                            ((int[]) objArr2[1])[1] = i;
                            ((int[]) objArr2[2])[0] = i5;
                        } else {
                            ((int[]) objArr2[0])[0] = i;
                            ((int[]) objArr2[2])[0] = i5;
                        }
                        objArr2[3] = strArr7;
                        int i17111 = (~((-447557491) | i70)) | 44639842;
                        int i17112 = ~((-4329614) | i);
                        i9 = 974674432 + ((i17111 | i17112) * (-502)) + (((~((-402917649) | i70)) | i17112) * TypedValues.PositionType.TYPE_DRAWPATH) + i7;
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i17113 = i9 * 483;
                        int i17114 = -(-(i2 * 242));
                        int i17115 = (i17113 ^ i17114) + ((i17113 & i17114) << 1);
                        int i17116 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i17117 = ((i17116 | 11) << 1) - (i17116 ^ 11);
                        TuitionPaymentFragmentbindingInflater1 = i17117 % 128;
                        int i17118 = i17117 % 2;
                        i10 = ~i9;
                        int i17119 = ~i2;
                        int i18110 = ~((i17119 & i10) | (i10 ^ i17119));
                        int i18111 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i18112 = ~((i18111 & i10) | (i10 ^ i18111));
                        int i18113 = -(-((-241) * ((i18110 & i18112) | (i18110 ^ i18112))));
                        i11 = (i17115 ^ i18113) + ((i17115 & i18113) << 1) + (((i9 ^ i2) | (i9 & i2)) * (-482));
                        int i18114 = ~i2;
                        i12 = ~((i18114 & i9) | (i18114 ^ i9));
                        int i18115 = ~i;
                        int i18116 = ~(1692697645 | i18115);
                        int i18117 = (i18116 & 1160770147) | (1160770147 ^ i18116);
                        int i18118 = ~(((-1692697646) & i) | ((-1692697646) ^ i));
                        int i18119 = -(-(((i18117 & i18118) | (i18117 ^ i18118)) * (-564)));
                        int i19110 = (2082101350 & i18119) + (i18119 | 2082101350) + ((~(((-549454861) & i) | ((-549454861) ^ i))) * 1128);
                        int i19111 = ~((1160770147 ^ i18115) | (1160770147 & i18115));
                        int i19112 = -(-(((i19111 & 1143242785) | (i19111 ^ 1143242785)) * 564));
                        i13 = ((i19110 | i19112) << 1) - (i19112 ^ i19110);
                        int i19113 = (i70 ^ (-401107025)) | (i70 & (-401107025));
                        int i19114 = 941251590 + (((~((-1333826888) | i)) | (~((i19113 ^ 1333826887) | (i19113 & 1333826887)))) * (-406));
                        int i19115 = -(-((~(((-1333826888) ^ i70) | (i70 & (-1333826888)) | (-401107025))) * (-406)));
                        i14 = (i19114 ^ i19115) + ((i19115 & i19114) << 1);
                        int i19116 = ~((i & 401107024) | (401107024 ^ i));
                        int i19117 = ~((i18115 ^ 1333826887) | (i18115 & 1333826887));
                        i15 = -(-(((i19116 & i19117) | (i19116 ^ i19117)) * 406));
                        if (i13 <= (i14 & i15) + (i15 | i14)) {
                            int i19118 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i19119 = (i19118 & i10) | (i10 ^ i19118);
                            int i20110 = ~((i19119 & i2) | (i19119 ^ i2));
                            int i20111 = i11 / (241 >> ((i20110 & i12) | (i12 ^ i20110)));
                            int i20112 = ((i20111 | 26) << 1) - (i20111 ^ 26);
                            int i20113 = (i20112 & (~i20111)) | ((~i20112) & i20111);
                            int i20114 = i20113 / 88;
                            int i20115 = (i20113 | i20114) & (~(i20113 & i20114));
                            ((int[]) objArr2[0])[1] = i20115 ^ (i20115 * 5);
                        } else {
                            int i20116 = ~i9;
                            int i20117 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i20118 = (i20117 & i20116) | (i20116 ^ i20117);
                            int i20119 = ~((i20118 & i2) | (i20118 ^ i2));
                            int i2114 = -(-(((i20119 & i12) | (i12 ^ i20119)) * 241));
                            int i2115 = (i11 & i2114) + (i2114 | i11);
                            int i2116 = (i2115 << 13) ^ i2115;
                            int i2117 = i2116 ^ (i2116 >>> 17);
                            int i2118 = i2117 << 5;
                            ((int[]) objArr2[1])[0] = ((~i2117) & i2118) | ((~i2118) & i2117);
                        }
                        int i2119 = i17116 + 77;
                        TuitionPaymentFragmentbindingInflater1 = i2119 % 128;
                        int i21110 = i2119 % 2;
                        return objArr2;
                    }
                    i4 = i84;
                } catch (Exception unused4) {
                }
            } catch (Exception unused5) {
            }
            str = null;
            i16 = 2;
            objArr = new Object[i16];
            objArr[0] = new int[]{i};
            objArr[1] = new String[0];
            int i15117 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
            TuitionPaymentFragmentbindingInflater1 = i15117 % 128;
            int i15118 = i15117 % 2;
            int i15119 = ((int[]) objArr[0])[0];
            int i151110 = i ^ i4;
            int i151111 = -i151110;
            int i151112 = ((i151110 & i151111) | (i151110 ^ i151111)) >> 31;
            int i151113 = (~i151112) & i15119;
            int i161110 = i4 & i151112;
            i5 = (i161110 & i151113) | (i151113 ^ i161110);
            String[] strArr8 = (String[]) objArr[1];
            Object[] objArr113 = new Object[2];
            int i161111 = (i15119 & i70) | ((~i15119) & i);
            int i161112 = -i161111;
            int i161113 = (((i161111 & i161112) | (i161111 ^ i161112)) >> 31) & 1;
            int i161114 = (~(((-i161113) | i161113) >> 31)) & 1;
            objArr113[i161113] = null;
            objArr113[i161114] = strArr8;
            String[] strArr9 = (String[]) objArr113[0];
            objArr2 = new Object[4];
            int i161115 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            i6 = ((i161115 | 95) << 1) - (i161115 ^ 95);
            int i161116 = i6 % 128;
            TuitionPaymentFragmentbindingInflater1 = i161116;
            if (i6 % 2 == 0) {
                objArr2[1] = new int[1];
                objArr2[1] = new int[1];
                objArr2[4] = new int[0];
                int i161117 = i ^ i5;
                int i161118 = -i161117;
                i7 = (((i161117 & i161118) | (i161117 ^ i161118)) >> 16) & 61;
            } else {
                objArr2[0] = new int[1];
                objArr2[1] = new int[1];
                objArr2[2] = new int[1];
                int i161119 = (~(i & i5)) & (i | i5);
                int i171110 = -i161119;
                i7 = (((i161119 & i171110) | (i161119 ^ i171110)) >> 31) & 16;
            }
            i8 = (i161116 & 57) + (i161116 | 57);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
            if (i8 % 2 != 0) {
                ((int[]) objArr2[1])[1] = i;
                ((int[]) objArr2[2])[0] = i5;
            } else {
                ((int[]) objArr2[0])[0] = i;
                ((int[]) objArr2[2])[0] = i5;
            }
            objArr2[3] = strArr9;
            int i171111 = (~((-447557491) | i70)) | 44639842;
            int i171112 = ~((-4329614) | i);
            i9 = 974674432 + ((i171111 | i171112) * (-502)) + (((~((-402917649) | i70)) | i171112) * TypedValues.PositionType.TYPE_DRAWPATH) + i7;
            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i171113 = i9 * 483;
            int i171114 = -(-(i2 * 242));
            int i171115 = (i171113 ^ i171114) + ((i171113 & i171114) << 1);
            int i171116 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i171117 = ((i171116 | 11) << 1) - (i171116 ^ 11);
            TuitionPaymentFragmentbindingInflater1 = i171117 % 128;
            int i171118 = i171117 % 2;
            i10 = ~i9;
            int i171119 = ~i2;
            int i181110 = ~((i171119 & i10) | (i10 ^ i171119));
            int i181111 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i181112 = ~((i181111 & i10) | (i10 ^ i181111));
            int i181113 = -(-((-241) * ((i181110 & i181112) | (i181110 ^ i181112))));
            i11 = (i171115 ^ i181113) + ((i171115 & i181113) << 1) + (((i9 ^ i2) | (i9 & i2)) * (-482));
            int i181114 = ~i2;
            i12 = ~((i181114 & i9) | (i181114 ^ i9));
            int i181115 = ~i;
            int i181116 = ~(1692697645 | i181115);
            int i181117 = (i181116 & 1160770147) | (1160770147 ^ i181116);
            int i181118 = ~(((-1692697646) & i) | ((-1692697646) ^ i));
            int i181119 = -(-(((i181117 & i181118) | (i181117 ^ i181118)) * (-564)));
            int i191110 = (2082101350 & i181119) + (i181119 | 2082101350) + ((~(((-549454861) & i) | ((-549454861) ^ i))) * 1128);
            int i191111 = ~((1160770147 ^ i181115) | (1160770147 & i181115));
            int i191112 = -(-(((i191111 & 1143242785) | (i191111 ^ 1143242785)) * 564));
            i13 = ((i191110 | i191112) << 1) - (i191112 ^ i191110);
            int i191113 = (i70 ^ (-401107025)) | (i70 & (-401107025));
            int i191114 = 941251590 + (((~((-1333826888) | i)) | (~((i191113 ^ 1333826887) | (i191113 & 1333826887)))) * (-406));
            int i191115 = -(-((~(((-1333826888) ^ i70) | (i70 & (-1333826888)) | (-401107025))) * (-406)));
            i14 = (i191114 ^ i191115) + ((i191115 & i191114) << 1);
            int i191116 = ~((i & 401107024) | (401107024 ^ i));
            int i191117 = ~((i181115 ^ 1333826887) | (i181115 & 1333826887));
            i15 = -(-(((i191116 & i191117) | (i191116 ^ i191117)) * 406));
            if (i13 <= (i14 & i15) + (i15 | i14)) {
                int i191118 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i191119 = (i191118 & i10) | (i10 ^ i191118);
                int i201110 = ~((i191119 & i2) | (i191119 ^ i2));
                int i201111 = i11 / (241 >> ((i201110 & i12) | (i12 ^ i201110)));
                int i201112 = ((i201111 | 26) << 1) - (i201111 ^ 26);
                int i201113 = (i201112 & (~i201111)) | ((~i201112) & i201111);
                int i201114 = i201113 / 88;
                int i201115 = (i201113 | i201114) & (~(i201113 & i201114));
                ((int[]) objArr2[0])[1] = i201115 ^ (i201115 * 5);
            } else {
                int i201116 = ~i9;
                int i201117 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i201118 = (i201117 & i201116) | (i201116 ^ i201117);
                int i201119 = ~((i201118 & i2) | (i201118 ^ i2));
                int i21111 = -(-(((i201119 & i12) | (i12 ^ i201119)) * 241));
                int i21112 = (i11 & i21111) + (i21111 | i11);
                int i21113 = (i21112 << 13) ^ i21112;
                int i21114 = i21113 ^ (i21113 >>> 17);
                int i21115 = i21114 << 5;
                ((int[]) objArr2[1])[0] = ((~i21114) & i21115) | ((~i21115) & i21114);
            }
            int i21116 = i171116 + 77;
            TuitionPaymentFragmentbindingInflater1 = i21116 % 128;
            int i21117 = i21116 % 2;
            return objArr2;
        } catch (Throwable th5) {
            Throwable cause = th5.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r5, short r6, byte r7) {
        /*
            byte[] r0 = com.google.android.gms.internal.measurement.zznb.$$c
            int r5 = r5 * 2
            int r1 = r5 + 1
            int r7 = r7 + 102
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r0[r6]
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznb.$$e(byte, short, byte):java.lang.String");
    }
}
