package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
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
import defpackage.updateQuirkSettings;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class initInternal<K extends updateQuirkSettings, V> {
    private final b<K, V> TuitionPaymentFragmentbindingInflater1 = new b<>();
    private final Map<K, b<K, V>> b = new HashMap();

    initInternal() {
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(K k, V v) {
        b<K, V> bVar = this.b.get(k);
        if (bVar == null) {
            bVar = new b<>(k);
            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b = bVar.b;
            bVar.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            bVar.b = this.TuitionPaymentFragmentbindingInflater1;
            bVar.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bVar;
            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b = bVar;
            this.b.put(k, bVar);
        } else {
            k.TuitionPaymentFragmentbindingInflater1();
        }
        if (bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ArrayList();
        }
        bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(v);
    }

    public final V TuitionPaymentFragmentbindingInflater1(K k) throws Throwable {
        b<K, V> bVar = this.b.get(k);
        if (bVar == null) {
            bVar = new b<>(k);
            this.b.put(k, bVar);
        } else {
            k.TuitionPaymentFragmentbindingInflater1();
        }
        bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b = bVar.b;
        bVar.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentbindingInflater1;
        bVar.b = this.TuitionPaymentFragmentbindingInflater1.b;
        bVar.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bVar;
        bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b = bVar;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 > 0) {
            return bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remove(iTuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1);
        }
        return null;
    }

    public final V TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
        b bVar = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        while (true) {
            if (bVar.equals(this.TuitionPaymentFragmentbindingInflater1)) {
                return null;
            }
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            V vRemove = iTuitionPaymentFragmentspecialinlinedviewModeldefault3 > 0 ? bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remove(iTuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1) : null;
            if (vRemove != null) {
                return vRemove;
            }
            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b = bVar.b;
            bVar.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            this.b.remove(bVar.TuitionPaymentFragmentbindingInflater1);
            ((updateQuirkSettings) bVar.TuitionPaymentFragmentbindingInflater1).TuitionPaymentFragmentbindingInflater1();
            bVar = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        b bVar = this.TuitionPaymentFragmentbindingInflater1.b;
        boolean z = false;
        while (!bVar.equals(this.TuitionPaymentFragmentbindingInflater1)) {
            sb.append('{');
            sb.append(bVar.TuitionPaymentFragmentbindingInflater1);
            sb.append(':');
            sb.append(bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            sb.append("}, ");
            bVar = bVar.b;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    static class b<K, V> {
        final K TuitionPaymentFragmentbindingInflater1;
        b<K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        List<V> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        b<K, V> b;
        private static final byte[] $$c = {60, 80, 13, 34};
        private static final int $$f = 128;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {25, -93, -120, -48, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -48, -12, 10, 62, -60, 1, 14, 2, -4, 65, -73, 3, 26, -12};
        private static final int $$e = 14;
        private static final byte[] $$a = {12, -88, 33, 118, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
        private static final int $$b = 148;
        private static int d = 0;
        private static int asBinder = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -6377398940819159759L;
        private static int g = 606871325;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static char f1202a = 34097;

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                int r6 = 53 - r6
                int r7 = r7 * 14
                int r7 = r7 + 84
                int r8 = r8 + 4
                byte[] r0 = initInternal.b.$$a
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L13
                r3 = r8
                r4 = r2
                r8 = r6
                goto L2c
            L13:
                r3 = r2
            L14:
                int r8 = r8 + 1
                byte r4 = (byte) r7
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L25:
                r4 = r0[r8]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2c:
                int r7 = -r7
                int r8 = r8 + r7
                int r7 = r8 + (-10)
                r8 = r3
                r3 = r4
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: initInternal.b.c(int, byte, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void f(int r5, byte r6, short r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 * 49
                int r7 = r7 + 4
                int r6 = 99 - r6
                byte[] r0 = initInternal.b.$$d
                int r5 = r5 * 49
                int r5 = r5 + 1
                byte[] r1 = new byte[r5]
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
                int r3 = r3 + 1
                if (r3 != r5) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L24:
                r4 = r0[r7]
            L26:
                int r4 = -r4
                int r6 = r6 + r4
                int r6 = r6 + 3
                int r7 = r7 + 1
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: initInternal.b.f(int, byte, short, java.lang.Object[]):void");
        }

        private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
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
                int i3 = $11 + 91;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 8327), View.combineMeasuredStates(0, 0) + 1235, MotionEvent.axisFromString("") + 36, -653973969, false, $$g(b, b2, (byte) (b2 + 2)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2764, ImageFormat.getBitsPerPixel(0) + 15, 1504416861, false, $$g(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 43325), 254 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 23, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 65199), 2891 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.lastIndexOf("", '0') + 18, 2012627446, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = sessionProcessor.b;
                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) g) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) f1202a) ^ (-6377398940819159759L)))));
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                    int i5 = $10 + 111;
                    $11 = i5 % 128;
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

        b() {
            this(null);
        }

        b(K k) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = this;
            this.b = this;
            this.TuitionPaymentFragmentbindingInflater1 = k;
        }

        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) (31533 - TextUtils.indexOf("", ""));
                int iIndexOf = 921 - TextUtils.indexOf("", "", 0);
                int iRed = Color.red(0) + 28;
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                c((byte) 52, bArr[7], bArr[37], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iIndexOf, iRed, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{63395, 52422, 12329, 16528}, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), ViewConfiguration.getKeyRepeatTimeout() >> 16, new char[]{1926, 7560, 12770, 63746, 19490, 34562, 38694, 64459, 37400, 18528, 15407, 29542, 37679, 63495, 19499, 59284, 59913, 38714, 49285, 12109, 45227, 45218}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{27374, 1143, 45654, 54516}, (char) (62641 - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1443133290, new char[]{17096, 38670, 18694, 16194, 23599, 35492, 33663, 37072, 5841, 39079, 28043, 18254, 61265, 18046, 56257}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) (31534 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 921;
                int mirror = AndroidCharacter.getMirror('0') - 20;
                byte[] bArr2 = $$a;
                byte b = bArr2[80];
                Object[] objArr5 = new Object[1];
                c(b, b, bArr2[37], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iCombineMeasuredStates, mirror, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i2 = asBinder + 117;
                d = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c2 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                    int threadPriority = 921 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int capsMode = 28 - TextUtils.getCapsMode("", 0, 0);
                    byte[] bArr3 = $$a;
                    byte b2 = (byte) (-bArr3[33]);
                    byte b3 = bArr3[80];
                    Object[] objArr6 = new Object[1];
                    c(b2, b3, (byte) (b3 | 51), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, threadPriority, capsMode, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int i4 = (int) Runtime.getRuntime().totalMemory();
                int i5 = ~(171862513 | i4);
                int i6 = (-1415709549) + ((1430357002 | i5) * (-814)) + ((i5 | (~((~i4) | (-1602217131))) | 2385) * 407) + (((~(i4 | 1602217130)) | (~((-171862514) | i4)) | 2385) * 407) + 1537294426;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{3517, 58365, 13374, 21323}, (char) (19252 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), MotionEvent.axisFromString("") + 1, new char[]{17977, 2495, 37752, 19303, 26319, 15616, 53116, 46417, 2609, 40491, 14000, 41073, 8433, 16913, 44714, 56131, 56461, 47632, 17175, 32155, 64120, 1064, 43004, 17955, 19444, 57158}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{35566, 60536, 25783, 14681}, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 22885), ViewConfiguration.getScrollBarFadeDuration() >> 16, new char[]{33511, 63846, 60024, 11219, 7119, 50850, 50942, 46614, 63774, 52259, 36557, 26287, 18138, 8712, 55782, 30978, 50826, 52884}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i9 = d + 25;
                    asBinder = i9 % 128;
                    int i10 = i9 % 2;
                    if ((!(applicationContext instanceof ContextWrapper)) || ((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        int i11 = asBinder + 43;
                        d = i11 % 128;
                        int i12 = i11 % 2;
                        applicationContext = null;
                    }
                }
                Object[] objArr10 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{36724, 5790, 2513, 48506}, (char) (31241 - ((Process.getThreadPriority(0) + 20) >> 6)), View.getDefaultSize(0, 0), new char[]{37475, 25931, 36606, 25196, 12041, 39958, 40589, 4808, 55413, 62787, 1567, 43264, 56156, 32315, 20696, 41393}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{20141, 21722, 45345, 41690}, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 55985), (-1) - TextUtils.indexOf((CharSequence) "", '0'), new char[]{50748, 29533, 5028, 21158, 23785, 39161, 1656, 49961, 18068, 43177, 10638, 3866, 53218, 45826, 44502, 54456}, objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1537294426};
                    byte[] bArr4 = $$d;
                    byte b4 = bArr4[35];
                    byte b5 = (byte) (b4 - 1);
                    Object[] objArr13 = new Object[1];
                    f(b4, b5, b5, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b6 = bArr4[35];
                    byte b7 = (byte) (b6 - 1);
                    byte b8 = b6;
                    Object[] objArr14 = new Object[1];
                    f(b7, b8, b8, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cMyPid = (char) (31533 - (Process.myPid() >> 22));
                        int iGreen = 921 - Color.green(0);
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 28;
                        byte[] bArr5 = $$a;
                        byte b9 = (byte) (-bArr5[33]);
                        byte b10 = bArr5[80];
                        Object[] objArr16 = new Object[1];
                        c(b9, b10, (byte) (b10 | 51), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyPid, iGreen, pressedStateDuration, -1142834547, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(new char[]{0, 0, 0, 0}, new char[]{63395, 52422, 12329, 16528}, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-1) - ExpandableListView.getPackedPositionChild(0L), new char[]{1926, 7560, 12770, 63746, 19490, 34562, 38694, 64459, 37400, 18528, 15407, 29542, 37679, 63495, 19499, 59284, 59913, 38714, 49285, 12109, 45227, 45218}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e(new char[]{0, 0, 0, 0}, new char[]{27374, 1143, 45654, 54516}, (char) (62642 - Color.green(0)), KeyEvent.getDeadChar(0, 0) + 1443133290, new char[]{17096, 38670, 18694, 16194, 23599, 35492, 33663, 37072, 5841, 39079, 28043, 18254, 61265, 18046, 56257}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char scrollBarFadeDuration = (char) (31533 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                            int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 921;
                            int iNormalizeMetaState = 28 - KeyEvent.normalizeMetaState(0);
                            byte[] bArr6 = $$a;
                            byte b11 = bArr6[80];
                            Object[] objArr19 = new Object[1];
                            c(b11, b11, bArr6[37], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, threadPriority2, iNormalizeMetaState, -778300370, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char modifierMetaStateMask = (char) (31532 - ((byte) KeyEvent.getModifierMetaStateMask()));
                            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 922;
                            int tapTimeout = 28 - (ViewConfiguration.getTapTimeout() >> 16);
                            byte[] bArr7 = $$a;
                            Object[] objArr20 = new Object[1];
                            c((byte) 52, bArr7[7], bArr7[37], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(modifierMetaStateMask, bitsPerPixel, tapTimeout, -1048449946, false, (String) objArr20[0], null);
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
            if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr == null) {
                    throw null;
                }
                for (String str : strArr) {
                    arrayList.add(str);
                }
                throw null;
            }
            int i13 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i14 = i13 + ((((~((-1143742610) | iIdentityHashCode)) | 34701322) * 449) - 1762259658) + (((~((~iIdentityHashCode) | (-1143742610))) | 34701322) * 449);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            Object obj = objArr21[0];
            ((int[]) obj)[0] = i16 ^ (i16 << 5);
            int i17 = d + 103;
            asBinder = i17 % 128;
            int i18 = i17 % 2;
            List<V> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (list != null) {
                return list.size();
            }
            int i19 = ((int[]) obj)[0];
            int i20 = ((i19 * i19) - (~(-(1469510726 * i19)))) - 1;
            int i21 = -(i19 * 611745548);
            int i22 = ((i20 & i21) + (i21 | i20)) - (-378646929);
            int i23 = i22 >> 18;
            int i24 = ((i23 & (-32767)) + (i23 | (-32767))) / 16384;
            int i25 = ((i24 | 1) << 1) - (i24 ^ 1);
            int i26 = (i22 & i25) + (i25 | i22);
            int i27 = i22 >> 19;
            int i28 = ((i27 ^ (-16383)) + ((i27 & (-16383)) << 1)) / 8192;
            int i29 = -(((i28 ^ 1) + ((i28 & 1) << 1)) ^ i26);
            int i30 = (i29 ^ 8) + ((i29 & 8) << 1);
            int i31 = i30 >> 15;
            int i32 = (((((-262143) | i31) << 1) - (i31 ^ (-262143))) / 131072) + 1;
            return 0 / (((-((i32 & 1) + (i32 | 1))) & i30) * 1930);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r7, short r8, int r9) {
            /*
                byte[] r0 = initInternal.b.$$c
                int r7 = r7 * 2
                int r7 = r7 + 4
                int r8 = r8 * 3
                int r8 = r8 + 1
                int r9 = 104 - r9
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r9
                r5 = r2
                r9 = r7
                goto L29
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r8) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L23:
                r3 = r0[r7]
                r6 = r9
                r9 = r7
                r7 = r3
                r3 = r6
            L29:
                int r7 = -r7
                int r9 = r9 + 1
                int r7 = r7 + r3
                r3 = r5
                r6 = r9
                r9 = r7
                r7 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: initInternal.b.$$g(short, short, int):java.lang.String");
        }
    }
}
