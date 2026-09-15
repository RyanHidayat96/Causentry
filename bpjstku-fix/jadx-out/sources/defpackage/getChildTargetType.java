package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public final class getChildTargetType {
    public final Executor b = Executors.newSingleThreadExecutor();

    public interface b {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault3(SharedPreferences sharedPreferences);
    }

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Callable<SharedPreferences> {
        private final b TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private final String b;
        private static final byte[] $$c = {91, -9, 99, 11};
        private static final int $$d = 82;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {36, -74, -79, -21};
        private static final int $$b = 166;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int asBinder = 1;
        private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {-1385628709, 1445392691, 1541952334, 351597384, 117583288, 77921096, -1789243428, -371794094, -201359457, 1943024672, 1585377545, 1013233728, -889184941, 1972070055, 900761234, -1278184350, 960293432, 1854387547};

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r7, int r8, short r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 2
                int r9 = 4 - r9
                byte[] r0 = getChildTargetType.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$a
                int r8 = r8 * 4
                int r8 = r8 + 98
                int r7 = r7 * 3
                int r7 = r7 + 1
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r8 = r7
                r3 = r9
                r4 = r2
                goto L2c
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r9]
                r6 = r3
                r3 = r9
                r9 = r6
            L2c:
                int r9 = -r9
                int r8 = r8 + r9
                int r9 = r3 + 1
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: getChildTargetType.TuitionPaymentFragmentspecialinlinedviewModeldefault3.c(byte, int, short, java.lang.Object[]):void");
        }

        @Override // java.util.concurrent.Callable
        public /* synthetic */ SharedPreferences call() throws Exception {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 15;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            SharedPreferences sharedPreferences = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getSharedPreferences(this.b, 0);
            b bVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (bVar != null) {
                int i4 = asBinder + 69;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i5 = i4 % 2;
                bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sharedPreferences);
            }
            return sharedPreferences;
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, String str, b bVar) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context;
            this.b = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bVar;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i5 = -1870535734;
            int i6 = 1;
            int i7 = 0;
            if (iArr3 != null) {
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int i8 = 0;
                while (i8 < length2) {
                    int i9 = $10 + 99;
                    $11 = i9 % 128;
                    if (i9 % i3 == 0) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i7] = Integer.valueOf(iArr3[i8]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b = (byte) i7;
                                byte b2 = (byte) (b - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0', i7, i7) + 1), (ViewConfiguration.getTapTimeout() >> 16) + 3291, 31 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1948206109, false, $$e(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                            }
                            iArr4[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            i8 >>= 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(iArr3[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = (byte) (b3 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3290, TextUtils.indexOf("", "", 0, 0) + 31, 1948206109, false, $$e(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                            }
                            iArr4[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            i8++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i3 = 2;
                    i5 = -1870535734;
                    i7 = 0;
                }
                iArr3 = iArr4;
            }
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (iArr6 != null) {
                int i10 = $10 + 79;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i2 = 1;
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i2 = 0;
                }
                while (i2 < length) {
                    Object[] objArr4 = new Object[i6];
                    objArr4[0] = Integer.valueOf(iArr6[i2]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), 3291 - TextUtils.getOffsetBefore("", 0), 31 - Gravity.getAbsoluteGravity(0, 0), 1948206109, false, $$e(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    i2++;
                    iArr6 = iArr6;
                    i6 = 1;
                }
                iArr6 = iArr2;
            }
            char c = 0;
            System.arraycopy(iArr6, 0, iArr5, 0, length3);
            sessionConfigValidatingBuilder.b = 2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                cArr[c] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                int i11 = 17;
                for (int i12 = 1; i11 > i12; i12 = 1) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i11];
                    Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 1;
                        byte b8 = (byte) (-b7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 2560 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 29 - TextUtils.getCapsMode("", 0, 0), 683220507, false, $$e(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i11--;
                }
                int i13 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i14 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr6 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 28879), 349 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 25, -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
                cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                sessionConfigValidatingBuilder.b += 2;
                c = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int r28, int r29) {
            /*
                Method dump skipped, instruction units count: 2192
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: getChildTargetType.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(int, int):java.lang.Object[]");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(int r6, byte r7, byte r8) {
            /*
                int r7 = r7 + 4
                byte[] r0 = getChildTargetType.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$c
                int r6 = r6 * 56
                int r6 = r6 + 66
                int r8 = r8 * 4
                int r8 = 1 - r8
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r6 = r7
                r4 = r8
                r3 = r2
                goto L2a
            L15:
                r3 = r2
                r5 = r7
                r7 = r6
                r6 = r5
            L19:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r8) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L26:
                int r6 = r6 + 1
                r4 = r0[r6]
            L2a:
                int r7 = r7 + r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: getChildTargetType.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$e(int, byte, byte):java.lang.String");
        }
    }
}
