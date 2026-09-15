package defpackage;

import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class MediaControllerCompatCallback extends onSessionEvent<getAudioAttributes> {
    private final getAudioAttributes TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {31, 115, -100, -11};
    private static final int $$d = 84;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {0, -94, -62, -97};
    private static final int $$b = 130;
    private static int asBinder = 0;
    private static int INotificationSideChannel = 1;
    private static char d = 54776;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f175a = 47609;
    private static char g = 47586;
    private static char asInterface = 54825;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = defpackage.MediaControllerCompatCallback.$$a
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r5 = r5 * 3
            int r5 = r5 + 98
            int r7 = r7 * 4
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = -1
            if (r0 != 0) goto L16
            r5 = r6
            r3 = r7
            goto L2d
        L16:
            r4 = r6
            r6 = r5
            r5 = r4
        L19:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r1[r2] = r3
            if (r2 != r7) goto L29
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L29:
            int r5 = r5 + 1
            r3 = r0[r5]
        L2d:
            int r3 = -r3
            int r6 = r6 + r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaControllerCompatCallback.e(short, int, short, java.lang.Object[]):void");
    }

    @Override // defpackage.binderDied
    final /* bridge */ /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSkipToNext onskiptonext, float f) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getAudioAttributes getaudioattributes = this.TuitionPaymentFragmentbindingInflater1;
        getAudioAttributes getaudioattributes2 = (getAudioAttributes) onskiptonext.d;
        getAudioAttributes getaudioattributes3 = (getAudioAttributes) onskiptonext.b;
        if (getaudioattributes2.b.length != getaudioattributes3.b.length) {
            StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb.append(getaudioattributes2.b.length);
            sb.append(" vs ");
            sb.append(getaudioattributes3.b.length);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        int i4 = INotificationSideChannel + 85;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        for (int i6 = 0; i6 < getaudioattributes2.b.length; i6++) {
            getaudioattributes.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i6] = onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getaudioattributes2.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i6], getaudioattributes3.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i6], f);
            getaudioattributes.b[i6] = onSetRating.TuitionPaymentFragmentspecialinlinedviewModeldefault1(f, getaudioattributes2.b[i6], getaudioattributes3.b[i6]);
        }
        int i7 = asBinder + 125;
        INotificationSideChannel = i7 % 128;
        if (i7 % 2 != 0) {
            return this.TuitionPaymentFragmentbindingInflater1;
        }
        throw null;
    }

    public MediaControllerCompatCallback(List<onSkipToNext<getAudioAttributes>> list) {
        super(list);
        int length = 0;
        getAudioAttributes getaudioattributes = list.get(0).d;
        if (getaudioattributes != null) {
            length = getaudioattributes.b.length;
            int i = INotificationSideChannel + 21;
            asBinder = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        }
        this.TuitionPaymentFragmentbindingInflater1 = new getAudioAttributes(new float[length], new int[length]);
        int i3 = INotificationSideChannel + 19;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i4 = $10 + 117;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                break;
            }
            int i6 = $11 + 69;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 0];
                i2 = 1;
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                i2 = 0;
            }
            int i7 = 58224;
            while (i2 < 16) {
                int i8 = $11 + 17;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[c];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i7) ^ ((c3 << 4) + ((char) (((long) g) ^ 8611973335120459638L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(asInterface)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (47774 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 468 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) d) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f175a)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - ExpandableListView.getPackedPositionGroup(0L)), View.resolveSizeAndState(0, 0, 0) + 468, 12 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i2++;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b = (byte) 0;
                byte b2 = b;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2323, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44, -1312321721, false, $$e(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
        int i10 = $10 + 39;
        $11 = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        Object obj = null;
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
    public static java.lang.Object[] b(int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 1936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaControllerCompatCallback.b(int, int):java.lang.Object[]");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, byte r7, byte r8) {
        /*
            byte[] r0 = defpackage.MediaControllerCompatCallback.$$c
            int r7 = r7 * 3
            int r1 = 1 - r7
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r6 = r6 * 4
            int r6 = 108 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L19
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2e
        L19:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1d:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L2c:
            r3 = r0[r6]
        L2e:
            int r8 = r8 + r3
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaControllerCompatCallback.$$e(short, byte, byte):java.lang.String");
    }
}
