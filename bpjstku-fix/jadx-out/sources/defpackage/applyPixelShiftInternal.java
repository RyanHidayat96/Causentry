package defpackage;

import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.datadog.android.privacy.TrackingConsent;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class applyPixelShiftInternal implements convertYUVToRGBInternal {
    private final LinkedList<isInfoEnabled> TuitionPaymentFragmentbindingInflater1;
    private volatile TrackingConsent TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {21, ByteCompanionObject.MAX_VALUE, 49, -115};
    private static final int $$d = 75;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {94, 6, -99, -107};
    private static final int $$b = 33;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int d = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {45557, 18663, 17352, 23265, 21982, 27841, 26571, 32451, 31161, 28838, 2959, 683, 7570, 5274, 12169, 9863, 8552, 14449, 13160, 45547, 18677, 17381, 23280, 21973, 27866, 26571, 32482, 31155, 28838, 2952, 673, 7582, 5249, 12171, 9859, 8569, 14438, 45565, 18682, 17384, 23286, 21971, 27869, 26568, 32394, 31155, 28839, 3042, 640, 7577, 5270, 12185, 9859, 45491, 18663, 17397, 23287, 21907, 27871, 26569, 32470, 31154, 28849, 2976, 747, 7576, 5265, 12174, 9873, 8571, 14395, 13176, 51830, 50525, 56407, 55109, 61002, 59707, 57467, 64303, 62001, 36110, 33798, 40713, 38410, 37096, 43979, 41720, 48630, 46301, 20439, 18121, 16854, 45554, 18683, 17404, 10554, 53357, 56183, 49762, 52566, 62482, 65366, 58964, 57638, 59506, 37678, 39464, 34055, 35859, 46848, 48641, 47546, 41211, 44017, 21247, 24020, 17630, 20416, 30450, 29104, 30899, 25508, 27311, 5529, 7320, 1921, 45485, 40507, 26479, 27773, 30079, 31259, 17239, 18497, 20830, 22074, 24377, 9256, 11619, 12816, 15129, 6, 2329, 3827, 6067, 7408, 58878, 60117, 62431, 63693, 49602, 50867, 53235, 54448, 56766, 41621, 43935, 45197, 47490, 49011, 33859, 36203, 37474};
    private static long b = 8232956582807488660L;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 98
            int r8 = r8 * 4
            int r8 = r8 + 1
            int r9 = r9 * 3
            int r9 = 3 - r9
            byte[] r0 = defpackage.applyPixelShiftInternal.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2e:
            int r7 = r7 + r9
            r9 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.applyPixelShiftInternal.c(int, short, short, java.lang.Object[]):void");
    }

    public applyPixelShiftInternal(TrackingConsent trackingConsent) {
        Intrinsics.checkNotNullParameter(trackingConsent, "");
        this.TuitionPaymentFragmentbindingInflater1 = new LinkedList<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = trackingConsent;
    }

    @Override // defpackage.convertYUVToRGBInternal
    public final TrackingConsent TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.convertYUVToRGBInternal
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(TrackingConsent trackingConsent) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(trackingConsent, "");
            if (trackingConsent == this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return;
            }
            TrackingConsent trackingConsent2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = trackingConsent;
            Iterator<T> it = this.TuitionPaymentFragmentbindingInflater1.iterator();
            while (it.hasNext()) {
                ((isInfoEnabled) it.next()).TuitionPaymentFragmentbindingInflater1(trackingConsent2, trackingConsent);
            }
        }
    }

    @Override // defpackage.convertYUVToRGBInternal
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(isInfoEnabled isinfoenabled) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(isinfoenabled, "");
            this.TuitionPaymentFragmentbindingInflater1.add(isinfoenabled);
        }
    }

    @Override // defpackage.convertYUVToRGBInternal
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(isInfoEnabled isinfoenabled) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(isinfoenabled, "");
            this.TuitionPaymentFragmentbindingInflater1.remove(isinfoenabled);
        }
    }

    @Override // defpackage.convertYUVToRGBInternal
    public final void TuitionPaymentFragmentbindingInflater1() {
        synchronized (this) {
            this.TuitionPaymentFragmentbindingInflater1.clear();
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:44:0x01b6  */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            obj = null;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.myTid() >> 22), 2235 - AndroidCharacter.getMirror('0'), 40 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 841711447, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(b), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - View.combineMeasuredStates(0, 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 3011, 26 - (Process.myTid() >> 22), 321985076, false, $$e(b4, b5, (byte) (b5 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - TextUtils.getCapsMode("", 0, 0)), AndroidCharacter.getMirror('0') + 3328, (ViewConfiguration.getPressedStateDuration() >> 16) + 17, -968507904, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
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
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i5 = $10 + 23;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - KeyEvent.keyCodeFromString("")), 3375 - ExpandableListView.getPackedPositionChild(0L), 17 - (Process.myTid() >> 22), -968507904, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            int i7 = $10 + 113;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr);
        int i9 = $10 + 31;
        $11 = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 2355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.applyPixelShiftInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault1(int, int):java.lang.Object[]");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r6, short r7, byte r8) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 109
            int r6 = r6 * 2
            int r0 = 1 - r6
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r1 = defpackage.applyPixelShiftInternal.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L19
            r3 = r6
            r8 = r7
            r4 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.applyPixelShiftInternal.$$e(int, short, byte):java.lang.String");
    }
}
