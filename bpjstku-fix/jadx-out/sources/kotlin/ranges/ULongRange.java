package kotlin.ranges;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
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
import android.widget.Toast;
import com.google.android.libraries.places.internal.zzbla;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 !2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001!B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010 \u001a\u00020\u00038WX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0019"}, d2 = {"Lkotlin/ranges/ULongRange;", "Lkotlin/ranges/ULongProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/ULong;", "Lkotlin/ranges/OpenEndRange;", "p0", "p1", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "contains-VKZWuLQ", "(J)Z", "contains", "isEmpty", "()Z", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getStart-s-VKNKU", "()J", "start", "getEndInclusive-s-VKNKU", "endInclusive", "getEndExclusive-s-VKNKU", "getEndExclusive-s-VKNKU$annotations", "()V", "endExclusive", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ULongRange extends ULongProgression implements ClosedRange<ULong>, OpenEndRange<ULong> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final ULongRange EMPTY;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$a = {97, 58, 103, -72, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 18;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 15
            int r0 = 53 - r8
            int r7 = r7 * 4
            int r7 = r7 + 84
            byte[] r1 = kotlin.ranges.ULongRange.$$a
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.ULongRange.a(short, byte, short, java.lang.Object[]):void");
    }

    public static final /* synthetic */ ULongRange access$getEMPTY$cp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return EMPTY;
        }
        throw null;
    }

    @Override // kotlin.ranges.ClosedRange
    public final /* synthetic */ boolean contains(Comparable comparable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        b = i2 % 128;
        ULong uLong = (ULong) comparable;
        if (i2 % 2 != 0) {
            m9274containsVKZWuLQ(uLong.getData());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zM9274containsVKZWuLQ = m9274containsVKZWuLQ(uLong.getData());
        int i3 = b + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return zM9274containsVKZWuLQ;
    }

    @Override // kotlin.ranges.OpenEndRange
    public final /* synthetic */ Comparable getEndExclusive() {
        int i = 2 % 2;
        int i2 = b + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        ULong uLongM8197boximpl = ULong.m8197boximpl(m9275getEndExclusivesVKNKU());
        int i4 = b + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return uLongM8197boximpl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.ranges.ClosedRange
    public final /* synthetic */ Comparable getEndInclusive() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        b = i2 % 128;
        int i3 = i2 % 2;
        ULong uLongM8197boximpl = ULong.m8197boximpl(m9276getEndInclusivesVKNKU());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        b = i4 % 128;
        int i5 = i4 % 2;
        return uLongM8197boximpl;
    }

    @Override // kotlin.ranges.ClosedRange
    public final /* synthetic */ Comparable getStart() {
        int i = 2 % 2;
        int i2 = b + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return ULong.m8197boximpl(m9277getStartsVKNKU());
        }
        ULong.m8197boximpl(m9277getStartsVKNKU());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ULongRange(long j, long j2) {
        super(j, j2, 1L, null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/ranges/ULongRange$Companion;", "", "<init>", "()V", "Lkotlin/ranges/ULongRange;", "EMPTY", "Lkotlin/ranges/ULongRange;", "getEMPTY", "()Lkotlin/ranges/ULongRange;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ULongRange getEMPTY() {
            return ULongRange.access$getEMPTY$cp();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $11 + 89;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 19472), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2623, View.getDefaultSize(0, 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 481 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 38 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $10 + 33;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 481, 37 - TextUtils.getTrimmedLength(""), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX INFO: renamed from: getStart-s-VKNKU, reason: not valid java name */
    public final long m9277getStartsVKNKU() throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cBlue = (char) (Color.blue(0) + 29944);
            int i2 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1754;
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr = new Object[1];
            a(b2, b2, bArr[5], objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, i2, scrollBarFadeDuration, 986134021, false, (String) objArr[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr2 = new Object[1];
        c(new char[]{1664, 24472, 46251, 3542, 25298, 48123, 4111, 26990, 52790, 10077, 31785, 54607, 11148, 32953, 55767, 16093, 38908, 60453, 17683, 39483, 62286, 18537}, TextUtils.lastIndexOf("", '0', 0, 0) + 22808, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        c(new char[]{1668, 53880, 44906, 30798, 21830, 11853, 64315, 54272, 41260, 31261, 22303, 8210, 65012, 55037, 41954}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 54517, objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16807160);
            int i3 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1754;
            int jumpTapTimeout = 23 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            byte b3 = $$a[7];
            Object[] objArr4 = new Object[1];
            a((byte) 37, b3, b3, objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, i3, jumpTapTimeout, 1596667560, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29944);
                int mirror = AndroidCharacter.getMirror('0') + 1707;
                int iIndexOf = TextUtils.indexOf("", "", 0) + 23;
                byte b4 = $$a[7];
                Object[] objArr5 = new Object[1];
                a((byte) 89, b4, b4, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(doubleTapTimeout, mirror, iIndexOf, 1599039318, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr6[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = new Object[]{new int[]{i4}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
            int i5 = ~System.identityHashCode(this);
            int i6 = (-251538111) + (((~(i5 | (-54618245))) | (~((-688434) | i5))) * (-184)) + ((78647874 | (~((-79336308) | i5)) | (~((-133266119) | i5))) * 184) + 609388923;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr7 = new Object[1];
            c(new char[]{1675, 9511, 16857, 27765, 34899, 46286, 54122, 65310, 7102, 17936, 25140, 36533, 44358, 51694, 62886, 4165}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9126, objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            c(new char[]{1672, 55250, 42026, 29322, 17353, 4155, 61087, 49145, 35857, 23183, 11252, 63540, 54966, 42981, 29767, 17053}, 53590 - TextUtils.lastIndexOf("", '0', 0, 0), objArr8);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr9 = {-1879349795};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 1726 - View.MeasureSpec.getSize(0), 29 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = zzbla.TuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), 1731555315, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) (29945 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1755;
                    int iIndexOf2 = 22 - TextUtils.indexOf((CharSequence) "", '0');
                    byte b5 = $$a[7];
                    Object[] objArr10 = new Object[1];
                    a((byte) 89, b5, b5, objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, maximumFlingVelocity, iIndexOf2, 1599039318, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113);
                try {
                    Object[] objArr11 = new Object[1];
                    c(new char[]{1664, 24472, 46251, 3542, 25298, 48123, 4111, 26990, 52790, 10077, 31785, 54607, 11148, 32953, 55767, 16093, 38908, 60453, 17683, 39483, 62286, 18537}, 22808 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c(new char[]{1668, 53880, 44906, 30798, 21830, 11853, 64315, 54272, 41260, 31261, 22303, 8210, 65012, 55037, 41954}, 54517 - KeyEvent.normalizeMetaState(0), objArr12);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cRed = (char) (Color.red(0) + 29944);
                        int iMyPid = (Process.myPid() >> 22) + 1755;
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 23;
                        byte b6 = $$a[7];
                        Object[] objArr13 = new Object[1];
                        a((byte) 37, b6, b6, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed, iMyPid, fadingEdgeLength, 1596667560, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 29945);
                        int iIndexOf3 = TextUtils.indexOf("", "", 0) + 1755;
                        int i9 = 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte[] bArr2 = $$a;
                        byte b7 = bArr2[7];
                        Object[] objArr14 = new Object[1];
                        a(b7, b7, bArr2[5], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cAxisFromString, iIndexOf3, i9, 986134021, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0];
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0];
        if (i11 == i10) {
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
            b = i12 % 128;
            int i13 = i12 % 2;
            int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0];
            int i15 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0];
            Object[] objArr15 = {new int[]{i15}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i16 = ~iIdentityHashCode;
            int i17 = i14 + (-758324311) + (((~(i16 | 845766558)) | (~(633164132 | i16)) | (-939352063)) * 464) + (((-306187931) | iIdentityHashCode) * (-464)) + (((~(iIdentityHashCode | 845766558)) | (-939352063)) * 464);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr15[3])[0] = i19 ^ (i19 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4];
            if (strArr != null) {
                int i20 = 0;
                while (i20 < strArr.length) {
                    int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
                    b = i21 % 128;
                    int i22 = i21 % 2;
                    arrayList.add(strArr[i20]);
                    i20++;
                    int i23 = b + 61;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 % 128;
                    int i24 = i23 % 2;
                }
            }
            Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
            int i25 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0];
            int i26 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0];
            Object[] objArr16 = {new int[]{i26}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i27 = ~iIdentityHashCode2;
            int i28 = i25 + 1650560149 + (((~(iIdentityHashCode2 | (-725368695))) | (~((-348143745) | i27)) | 135541318) * (-68)) + ((~((-589827377) | i27)) * (-68)) + (((~(725368694 | i27)) | (-937971121)) * 68);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr16[3])[0] = i30 ^ (i30 << 5);
            int i31 = b + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i31 % 128;
            if (i31 % 2 == 0) {
                int i32 = 5 % 2;
            }
        }
        return getFirst();
    }

    /* JADX INFO: renamed from: getEndInclusive-s-VKNKU, reason: not valid java name */
    public final long m9276getEndInclusivesVKNKU() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return getLast();
        }
        getLast();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: getEndExclusive-s-VKNKU, reason: not valid java name */
    public final long m9275getEndExclusivesVKNKU() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (getLast() == -1) {
            throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
        }
        int i4 = b + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        long jM8203constructorimpl = ULong.m8203constructorimpl(getLast() + ULong.m8203constructorimpl(1L));
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        b = i6 % 128;
        int i7 = i6 % 2;
        return jM8203constructorimpl;
    }

    /* JADX INFO: renamed from: contains-VKZWuLQ, reason: not valid java name */
    public final boolean m9274containsVKZWuLQ(long p0) {
        int i = 2 % 2;
        int i2 = b + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            Long.compare(getFirst() ^ Long.MIN_VALUE, p0 ^ Long.MIN_VALUE);
            throw null;
        }
        if (Long.compare(getFirst() ^ Long.MIN_VALUE, p0 ^ Long.MIN_VALUE) > 0 || Long.compare(p0 ^ Long.MIN_VALUE, getLast() ^ Long.MIN_VALUE) > 0) {
            return false;
        }
        int i3 = b + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    @Override // kotlin.ranges.ULongProgression, kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        int i = 2 % 2;
        if (Long.compare(getFirst() ^ Long.MIN_VALUE, getLast() ^ Long.MIN_VALUE) <= 0) {
            return false;
        }
        int i2 = b + 59;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 43;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 61 / 0;
        }
        return true;
    }

    @Override // kotlin.ranges.ULongProgression
    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = b + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (!(p0 instanceof ULongRange)) {
            return false;
        }
        if (isEmpty()) {
            int i4 = b + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            if (((ULongRange) p0).isEmpty()) {
                return true;
            }
        }
        ULongRange uLongRange = (ULongRange) p0;
        return getFirst() == uLongRange.getFirst() && getLast() == uLongRange.getLast();
    }

    @Override // kotlin.ranges.ULongProgression
    public final int hashCode() {
        int i = 2 % 2;
        int i2 = b + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (!isEmpty()) {
            return (((int) ULong.m8203constructorimpl(getFirst() ^ ULong.m8203constructorimpl(getFirst() >>> 32))) * 31) + ((int) ULong.m8203constructorimpl(getLast() ^ ULong.m8203constructorimpl(getLast() >>> 32)));
        }
        int i4 = b + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return -1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.ranges.ULongProgression
    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append((Object) ULong.m8249toStringimpl(getFirst()));
        sb.append("..");
        sb.append((Object) ULong.m8249toStringimpl(getLast()));
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        b = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        INSTANCE = new Companion(null);
        EMPTY = new ULongRange(-1L, 0L, null);
        int i = TuitionPaymentFragmentbindingInflater1 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ ULongRange(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    @Deprecated(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    /* JADX INFO: renamed from: getEndExclusive-s-VKNKU$annotations, reason: not valid java name */
    public static /* synthetic */ void m9273getEndExclusivesVKNKU$annotations() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 6499065236144762874L;
    }
}
