package kotlin.ranges;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000  2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001 B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001f\u001a\u00020\u00038WX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0014"}, d2 = {"Lkotlin/ranges/UIntRange;", "Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/UInt;", "Lkotlin/ranges/OpenEndRange;", "p0", "p1", "<init>", "(IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "contains-WZ4Q5Ns", "(I)Z", "contains", "isEmpty", "()Z", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getStart-pVg5ArA", "start", "getEndInclusive-pVg5ArA", "endInclusive", "getEndExclusive-pVg5ArA", "getEndExclusive-pVg5ArA$annotations", "()V", "endExclusive", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UIntRange extends UIntProgression implements ClosedRange<UInt>, OpenEndRange<UInt> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final UIntRange EMPTY;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int b;
    private static final byte[] $$c = {49, 89, 41, 48};
    private static final int $$f = 234;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {25, 5, -88, -44, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 59, -6, -10, 13, -20, 14, -12, -7, 11, -72, 63, -7, -14, -1, -1, 11, -72, 70, -17, -8, 0, -5, 12, -73, 73, -3, -23, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -21, 4, 2, -13, 2, 2, -10, -33, 34, -11, 3, -14, 16, -18, 10, -68};
    private static final int $$e = 149;
    private static final byte[] $$a = {60, 80, 13, 34, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 187;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1239a = 0;
    private static int asInterface = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 52
            int r0 = r6 + 1
            byte[] r1 = kotlin.ranges.UIntRange.$$a
            int r5 = 103 - r5
            int r7 = r7 * 52
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
        L26:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            int r7 = r7 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.UIntRange.c(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.ranges.UIntRange.$$d
            int r8 = r8 * 45
            int r8 = r8 + 4
            int r6 = r6 * 15
            int r6 = 99 - r6
            int r7 = r7 * 8
            int r1 = r7 + 38
            byte[] r1 = new byte[r1]
            int r7 = r7 + 37
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r7
            r6 = r8
            r3 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L31:
            int r8 = r8 + 1
            int r6 = r6 + r4
            int r6 = r6 + 3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.UIntRange.e(byte, byte, short, java.lang.Object[]):void");
    }

    public static final /* synthetic */ UIntRange access$getEMPTY$cp() {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        int i3 = i2 % 128;
        f1239a = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        UIntRange uIntRange = EMPTY;
        int i4 = i3 + 3;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return uIntRange;
    }

    @Override // kotlin.ranges.ClosedRange
    public final /* synthetic */ boolean contains(Comparable comparable) {
        boolean zM9265containsWZ4Q5Ns;
        int i = 2 % 2;
        int i2 = f1239a + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int data = ((UInt) comparable).getData();
        if (i3 == 0) {
            zM9265containsWZ4Q5Ns = m9265containsWZ4Q5Ns(data);
            int i4 = 66 / 0;
        } else {
            zM9265containsWZ4Q5Ns = m9265containsWZ4Q5Ns(data);
        }
        int i5 = asInterface + 7;
        f1239a = i5 % 128;
        int i6 = i5 % 2;
        return zM9265containsWZ4Q5Ns;
    }

    @Override // kotlin.ranges.OpenEndRange
    public final /* synthetic */ Comparable getEndExclusive() {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        f1239a = i2 % 128;
        int i3 = i2 % 2;
        UInt uIntM8118boximpl = UInt.m8118boximpl(m9266getEndExclusivepVg5ArA());
        int i4 = asInterface + 7;
        f1239a = i4 % 128;
        int i5 = i4 % 2;
        return uIntM8118boximpl;
    }

    @Override // kotlin.ranges.ClosedRange
    public final /* synthetic */ Comparable getEndInclusive() {
        int i = 2 % 2;
        int i2 = f1239a + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        UInt uIntM8118boximpl = UInt.m8118boximpl(m9267getEndInclusivepVg5ArA());
        int i4 = asInterface + 81;
        f1239a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return uIntM8118boximpl;
    }

    @Override // kotlin.ranges.ClosedRange
    public final /* synthetic */ Comparable getStart() {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        f1239a = i2 % 128;
        int i3 = i2 % 2;
        int iM9268getStartpVg5ArA = m9268getStartpVg5ArA();
        if (i3 == 0) {
            return UInt.m8118boximpl(iM9268getStartpVg5ArA);
        }
        UInt.m8118boximpl(iM9268getStartpVg5ArA);
        throw null;
    }

    private UIntRange(int i, int i2) {
        super(i, i2, 1, null);
    }

    /* JADX INFO: renamed from: getStart-pVg5ArA, reason: not valid java name */
    public final int m9268getStartpVg5ArA() {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        f1239a = i2 % 128;
        if (i2 % 2 != 0) {
            getFirst();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iM9260getFirstpVg5ArA = getFirst();
        int i3 = f1239a + 25;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return iM9260getFirstpVg5ArA;
    }

    /* JADX INFO: renamed from: getEndInclusive-pVg5ArA, reason: not valid java name */
    public final int m9267getEndInclusivepVg5ArA() {
        int i = 2 % 2;
        int i2 = f1239a + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iM9261getLastpVg5ArA = getLast();
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        return iM9261getLastpVg5ArA;
    }

    /* JADX INFO: renamed from: getEndExclusive-pVg5ArA, reason: not valid java name */
    public final int m9266getEndExclusivepVg5ArA() {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        f1239a = i2 % 128;
        int i3 = i2 % 2;
        if (getLast() == -1) {
            throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
        }
        int iM8124constructorimpl = UInt.m8124constructorimpl(getLast() + 1);
        int i4 = f1239a + 19;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return iM8124constructorimpl;
    }

    /* JADX INFO: renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public final boolean m9265containsWZ4Q5Ns(int p0) {
        int i = 2 % 2;
        int i2 = f1239a + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (Integer.compare(getFirst() ^ Integer.MIN_VALUE, p0 ^ Integer.MIN_VALUE) <= 0) {
            int i4 = asInterface + 33;
            f1239a = i4 % 128;
            if (i4 % 2 != 0) {
                Integer.compare(p0 ^ Integer.MIN_VALUE, getLast() ^ Integer.MIN_VALUE);
                throw null;
            }
            if (Integer.compare(p0 ^ Integer.MIN_VALUE, getLast() ^ Integer.MIN_VALUE) <= 0) {
                return true;
            }
        }
        int i5 = f1239a + 113;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // kotlin.ranges.UIntProgression, kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        int i = 2 % 2;
        if (Integer.compare(getFirst() ^ Integer.MIN_VALUE, getLast() ^ Integer.MIN_VALUE) > 0) {
            int i2 = asInterface + 103;
            f1239a = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = asInterface + 87;
        f1239a = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (m9261getLastpVg5ArA() == r6.m9261getLastpVg5ArA()) goto L19;
     */
    @Override // kotlin.ranges.UIntProgression
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r6 instanceof kotlin.ranges.UIntRange
            r2 = 0
            if (r1 == 0) goto L5b
            boolean r1 = r5.isEmpty()
            r3 = 1
            if (r1 == 0) goto L31
            int r1 = kotlin.ranges.UIntRange.asInterface
            int r1 = r1 + 9
            int r4 = r1 % 128
            kotlin.ranges.UIntRange.f1239a = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L28
            r1 = r6
            kotlin.ranges.UIntRange r1 = (kotlin.ranges.UIntRange) r1
            boolean r1 = r1.isEmpty()
            r4 = 25
            int r4 = r4 / r2
            r1 = r1 ^ r3
            if (r1 == r3) goto L31
            goto L52
        L28:
            r1 = r6
            kotlin.ranges.UIntRange r1 = (kotlin.ranges.UIntRange) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L52
        L31:
            int r1 = r5.getFirst()
            kotlin.ranges.UIntRange r6 = (kotlin.ranges.UIntRange) r6
            int r4 = r6.getFirst()
            if (r1 != r4) goto L5b
            int r1 = kotlin.ranges.UIntRange.f1239a
            int r1 = r1 + 121
            int r4 = r1 % 128
            kotlin.ranges.UIntRange.asInterface = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L53
            int r1 = r5.getLast()
            int r6 = r6.getLast()
            if (r1 != r6) goto L5b
        L52:
            return r3
        L53:
            r5.getLast()
            r6.getLast()
            r6 = 0
            throw r6
        L5b:
            int r6 = kotlin.ranges.UIntRange.f1239a
            int r6 = r6 + 63
            int r1 = r6 % 128
            kotlin.ranges.UIntRange.asInterface = r1
            int r6 = r6 % r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.UIntRange.equals(java.lang.Object):boolean");
    }

    @Override // kotlin.ranges.UIntProgression
    public final int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        f1239a = i2 % 128;
        if (i2 % 2 != 0) {
            isEmpty();
            throw null;
        }
        if (!isEmpty()) {
            return (getFirst() * 31) + getLast();
        }
        int i3 = f1239a + 59;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return -1;
        }
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/ranges/UIntRange$Companion;", "", "<init>", "()V", "Lkotlin/ranges/UIntRange;", "EMPTY", "Lkotlin/ranges/UIntRange;", "getEMPTY", "()Lkotlin/ranges/UIntRange;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final UIntRange getEMPTY() {
            return UIntRange.access$getEMPTY$cp();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void d(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $10 + 43;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cAxisFromString = (char) (MotionEvent.axisFromString("") + 8329);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', i3, i3) + 1236;
                    int iCombineMeasuredStates = 35 - View.combineMeasuredStates(i3, i3);
                    byte b2 = (byte) i3;
                    byte b3 = b2;
                    String str$$g = $$g(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString, iLastIndexOf, iCombineMeasuredStates, -653973969, false, str$$g, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) i3;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), 2763 - TextUtils.lastIndexOf("", '0', i3), 14 - Color.green(i3), 1504416861, false, $$g(b4, b5, (byte) (b5 + 2)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 43325), 253 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65201 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 2892, TextUtils.getTrimmedLength("") + 17, 2012627446, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = sessionProcessor.b;
                            cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) b) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L)))));
                            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                            int i6 = $11 + 121;
                            $10 = i6 % 128;
                            int i7 = i6 % 2;
                            i3 = 0;
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
    }

    @Override // kotlin.ranges.UIntProgression
    public final String toString() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cRed = (char) Color.red(0);
            int maximumDrawingCacheSize = 876 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int i2 = 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            byte[] bArr = $$a;
            byte b2 = (byte) (bArr[19] - 1);
            byte b3 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRed, maximumDrawingCacheSize, i2, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new char[]{0, 0, 0, 0}, new char[]{56517, 20064, 31706, 53394}, (char) (ViewConfiguration.getScrollBarSize() >> 8), KeyEvent.normalizeMetaState(0), new char[]{41670, 11765, 5639, 5765, 10658, 27338, 50358, 816, 21218, 9080, 53451, 58445, 62455, 36770, 50678, 55394, 33933, 55551, 34444, 31570, 22486, 48826}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new char[]{0, 0, 0, 0}, new char[]{12560, 60478, 61291, 53212}, (char) (56558 - TextUtils.indexOf((CharSequence) "", '0')), 1810644529 - (ViewConfiguration.getScrollBarSize() >> 8), new char[]{54347, 54509, 50697, 52053, 32386, 22709, 55844, 38635, 33050, 63645, 40914, 18618, 60664, 58967, 38703}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 876;
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 10;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c(bArr2[10], bArr2[5], bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, doubleTapTimeout, pressedStateDuration, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 876;
                int iMyPid = (Process.myPid() >> 22) + 10;
                byte[] bArr3 = $$a;
                byte b4 = bArr3[7];
                Object[] objArr6 = new Object[1];
                c(b4, b4, bArr3[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, iMakeMeasureSpec, iMyPid, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i3 = ~startElapsedRealtime;
            int i4 = (-1575678975) + (((~((-125476536) | i3)) | (~(85166306 | startElapsedRealtime))) * 217) + (((~(startElapsedRealtime | (-125476536))) | 40375829) * 217) + (((~(85166306 | i3)) | 125476535) * 217) + 1066174841;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
            int i7 = f1239a + 125;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            d(new char[]{0, 0, 0, 0}, new char[]{19865, 46875, 59393, 14648}, (char) (View.combineMeasuredStates(0, 0) + 14568), 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{42996, 22976, 45884, 56820, 12174, 1601, 39293, 38484, 61591, 8134, 63273, 40357, 15484, 38845, 22630, 30362, 38511, 35358, 64240, 31830, 41824, 16725, 62127, 218, 37496, 27816}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new char[]{0, 0, 0, 0}, new char[]{55568, 28300, 51118, 59637}, (char) (KeyEvent.normalizeMetaState(0) + 62919), (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{47389, 31049, 6015, 18649, 4908, 8971, 11552, 8853, 2137, 41605, 54717, 25561, 8065, 39514, 64643, 19531, 54069, 60545}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            d(new char[]{0, 0, 0, 0}, new char[]{53715, 14631, 34807, 38293}, (char) (38278 - TextUtils.lastIndexOf("", '0')), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, new char[]{42180, 53484, 15020, 29032, 30270, 't', 7566, 39982, 38774, 56125, 58908, 12912, 43252, 26277, 5597, 58106}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(new char[]{0, 0, 0, 0}, new char[]{62670, 63786, 31639, 17328}, (char) (45179 - (Process.myTid() >> 22)), Gravity.getAbsoluteGravity(0, 0), new char[]{23424, 40580, 53757, 12585, 32192, 50516, 28846, 18710, 18208, 10966, 43557, 46260, 56168, 59042, 27307, 50589}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i9 = asInterface + 7;
            f1239a = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 1066174841};
                byte[] bArr4 = $$d;
                byte b5 = bArr4[42];
                Object[] objArr13 = new Object[1];
                e(b5, (byte) (-bArr4[35]), b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr4[35];
                Object[] objArr14 = new Object[1];
                e((byte) (-b6), bArr4[42], (byte) (-b6), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i11 = f1239a + 23;
                    asInterface = i11 % 128;
                    int i12 = i11 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int i13 = 877 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int absoluteGravity = 10 - Gravity.getAbsoluteGravity(0, 0);
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[7];
                        Object[] objArr16 = new Object[1];
                        c(b7, b7, bArr5[5], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(fadingEdgeLength, i13, absoluteGravity, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        d(new char[]{0, 0, 0, 0}, new char[]{56517, 20064, 31706, 53394}, (char) View.combineMeasuredStates(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 1, new char[]{41670, 11765, 5639, 5765, 10658, 27338, 50358, 816, 21218, 9080, 53451, 58445, 62455, 36770, 50678, 55394, 33933, 55551, 34444, 31570, 22486, 48826}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        d(new char[]{0, 0, 0, 0}, new char[]{12560, 60478, 61291, 53212}, (char) (56559 - (ViewConfiguration.getScrollBarSize() >> 8)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1810644528, new char[]{54347, 54509, 50697, 52053, 32386, 22709, 55844, 38635, 33050, 63645, 40914, 18618, 60664, 58967, 38703}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 876;
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                            byte[] bArr6 = $$a;
                            Object[] objArr19 = new Object[1];
                            c(bArr6[10], bArr6[5], bArr6[7], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(edgeSlop, keyRepeatDelay, minimumFlingVelocity, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char trimmedLength = (char) TextUtils.getTrimmedLength("");
                            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
                            int i14 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10;
                            byte[] bArr7 = $$a;
                            byte b8 = (byte) (bArr7[19] - 1);
                            byte b9 = bArr7[7];
                            Object[] objArr20 = new Object[1];
                            c(b8, b9, b9, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(trimmedLength, windowTouchSlop, i14, 252381699, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            throw null;
        }
        int i15 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i16 = ~startUptimeMillis;
        int i17 = (~(611267079 | i16)) | 43009496;
        int i18 = ~(startUptimeMillis | (-2699268));
        int i19 = i15 + (((i17 | i18) * (-252)) - 2006198668) + ((i18 | (~(i16 | 654276575))) * 252);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr21[1])[0] = i21 ^ (i21 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) UInt.m8170toStringimpl(getFirst()));
        int i22 = ((int[]) objArr21[1])[0];
        int i23 = ((i22 * i22) - (~(-(1170113187 * i22)))) - 1;
        int i24 = -(i22 * 1912624201);
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        int i26 = (i25 ^ 1219484260) + ((1219484260 & i25) << 1);
        int i27 = i26 >> 15;
        int i28 = ((((-262143) | i27) << 1) - (i27 ^ (-262143))) / 131072;
        int i29 = (i26 - (~((i28 ^ 1) + ((i28 & 1) << 1)))) - 1;
        int i30 = i26 >> 23;
        int i31 = ((i30 & (-1023)) + (i30 | (-1023))) / 512;
        int i32 = -(i29 ^ ((i31 & 1) + (i31 | 1)));
        int i33 = (i32 & 7) + (i32 | 7);
        int i34 = i33 >> 27;
        int i35 = (((i34 | (-63)) << 1) - (i34 ^ (-63))) / 32;
        int i36 = (i35 ^ 1) + ((i35 & 1) << 1);
        sb.append("21|..".substring(40404 / (((-(((i36 | 1) << 1) - (i36 ^ 1))) & i33) * 1924)));
        sb.append((Object) UInt.m8170toStringimpl(getLast()));
        String string = sb.toString();
        int i37 = asInterface + 93;
        f1239a = i37 % 128;
        if (i37 % 2 == 0) {
            return string;
        }
        throw null;
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 1;
        b();
        INSTANCE = new Companion(null);
        EMPTY = new UIntRange(-1, 0, null);
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ UIntRange(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    @Deprecated(message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    /* JADX INFO: renamed from: getEndExclusive-pVg5ArA$annotations, reason: not valid java name */
    public static /* synthetic */ void m9264getEndExclusivepVg5ArA$annotations() {
        int i = 2 % 2;
        int i2 = f1239a + 99;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -6377398940819159759L;
        b = 1113122859;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 34097;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, byte r8, byte r9) {
        /*
            byte[] r0 = kotlin.ranges.UIntRange.$$c
            int r9 = r9 + 102
            int r8 = r8 * 3
            int r8 = 1 - r8
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r5 = r2
            r9 = r7
            goto L2a
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2a:
            int r7 = r7 + r3
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.UIntRange.$$g(short, byte, byte):java.lang.String");
    }
}
