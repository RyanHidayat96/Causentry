package defpackage;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.sessions.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class shouldRespectInputCropRect {
    String TuitionPaymentFragmentbindingInflater1;
    String TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "Raygun4Android";
    String b;
    private static final byte[] $$c = {101, 89, 94, -73};
    private static final int $$d = 246;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {19, 78, 114, 113, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 243;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int asBinder = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -7277059228071531858L;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 2
            int r5 = r5 + 84
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r0 = defpackage.shouldRespectInputCropRect.$$a
            int r7 = r7 * 4
            int r7 = 53 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r5
            r5 = r7
            r3 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            r4 = r0[r6]
        L29:
            int r5 = r5 + r4
            int r6 = r6 + 1
            int r5 = r5 + (-11)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.shouldRespectInputCropRect.c(int, byte, byte, java.lang.Object[]):void");
    }

    public shouldRespectInputCropRect() throws Throwable {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        long j = 0;
        int i = ((Field) (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null ? initSession.b((char) (46400 - (ViewConfiguration.getEdgeSlop() >> 16)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 39, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null) : objTuitionPaymentFragmentspecialinlinedviewModeldefault3)).getInt(null);
        Object[] objArr = new Object[1];
        a(new char[]{39550, 28679, 39596, 39455, 52407, 61601, 39768, 20125, 39217, 62342, 40568, 18913, 40017, 63356, 40274, 17532, 37735, 64092, 36904, 18282, 38547, 64780, 38096, 16896, 38333, 57348}, ViewConfiguration.getTouchSlop() >> 8, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(new char[]{33220, 58945, 34644, 33185, 3469, 26341, 34469, 36773, 33431, 26060, 33664, 34983, 34785, 24872, 33000, 34145, 35021, 27652, 36289}, '0' - AndroidCharacter.getMirror('0'), objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j2 = -1;
        long j3 = j2 ^ 836331232894216689L;
        long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        long j4 = (j3 | startElapsedRealtime) ^ j2;
        long j5 = 140;
        long j6 = j2 ^ 1260925941847742298L;
        long j7 = (((long) 141) * 836331232894216689L) + (((long) (-139)) * 1260925941847742298L) + (((long) (-280)) * (((j3 | 1260925941847742298L) ^ j2) | j4)) + ((j4 | ((j6 | startElapsedRealtime) ^ j2)) * j5);
        long j8 = ((j3 | j6) | startElapsedRealtime) ^ j2;
        long j9 = startElapsedRealtime ^ j2;
        long j10 = j7 + (j5 * (j8 | (((j3 | j9) | 1260925941847742298L) ^ j2) | (((j6 | j9) | 836331232894216689L) ^ j2)));
        int i2 = 2 % 2;
        int i3 = 0;
        try {
            while (i3 != 10) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37835 - TextUtils.indexOf((CharSequence) "", '0')), 59 - (ViewConfiguration.getTapTimeout() >> 16), 19 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                long j11 = jLongValue;
                int i5 = 0;
                while (true) {
                    int i6 = 0;
                    for (int i7 = 8; i6 != i7; i7 = 8) {
                        int i8 = asBinder + 27;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                        int i9 = i8 % 2;
                        i4 = (((((int) (j11 >> i6)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
                        i6++;
                    }
                    if (i5 != 0) {
                        break;
                    }
                    i5++;
                    j11 = j10;
                }
                if (i4 == i) {
                    this.b = BuildConfig.VERSION_NAME;
                    this.TuitionPaymentFragmentbindingInflater1 = "https://github.com/MindscapeHQ/raygun4android";
                }
                jLongValue -= 1024;
                i3++;
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
                asBinder = i10 % 128;
                int i11 = i10 % 2;
                j = 0;
            }
            Object[] objArr3 = {-5033587};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            Object[] objArr4 = {5, 0, -1807651101, ((Constructor) (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null ? initSession.b((char) (46038 - KeyEvent.normalizeMetaState(0)), ExpandableListView.getPackedPositionType(0L) + 1134, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault5)).newInstance(objArr3), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cMyPid = (char) (Process.myPid() >> 22);
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1032;
                int i12 = 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                byte b = $$a[7];
                byte b2 = b;
                Object[] objArr5 = new Object[1];
                c(b, b2, b2, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyPid, modifierMetaStateMask, i12, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getTouchSlop() >> 8) + 45993), 1117 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17), Boolean.TYPE});
            }
            Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4);
            int i13 = 0;
            if (((int[]) objArr6[3])[0] != ((int[]) objArr6[1])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr6[0];
                if (strArr != null) {
                    int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
                    asBinder = i14 % 128;
                    while (true) {
                        int i15 = i14 % 2;
                        if (i13 >= strArr.length) {
                            break;
                        }
                        arrayList.add(strArr[i13]);
                        i13++;
                        i14 = asBinder + 29;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
                    }
                }
                throw null;
            }
            this.b = BuildConfig.VERSION_NAME;
            this.TuitionPaymentFragmentbindingInflater1 = "https://github.com/MindscapeHQ/raygun4android";
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $11 + 61;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - Color.green(0)), 1356 - KeyEvent.normalizeMetaState(0), 37 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 894276454, false, $$e(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 47774), (ViewConfiguration.getScrollBarSize() >> 8) + 468, 12 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $11 + 121;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, byte r7, int r8) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r1 = defpackage.shouldRespectInputCropRect.$$c
            int r8 = r8 * 4
            int r8 = r8 + 107
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r3 = r1[r6]
            r5 = r3
            r3 = r8
            r8 = r5
        L29:
            int r8 = -r8
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.shouldRespectInputCropRect.$$e(short, byte, int):java.lang.String");
    }
}
