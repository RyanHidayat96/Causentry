package kotlin.time;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.animation.core.AnimationKt;
import com.datadog.android.rum.internal.domain.scope.RumViewScope$onStopView$1;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001'B\u0019\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\fH\u0087\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\fH\u0087\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0005\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000bR\u001a\u0010$\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001b"}, d2 = {"Lkotlin/time/Instant;", "", "Ljava/io/Serializable;", "Lkotlin/io/TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "p0", "", "p1", "<init>", "(JI)V", "toEpochMilliseconds", "()J", "Lkotlin/time/Duration;", "plus-LRDsOJo", "(J)Lkotlin/time/Instant;", "plus", "minus-LRDsOJo", "minus", "minus-UwyO8pc", "(Lkotlin/time/Instant;)J", "compareTo", "(Lkotlin/time/Instant;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "writeReplace", "()Ljava/lang/Object;", "epochSeconds", "J", "getEpochSeconds", "nanosecondsOfSecond", "I", "getNanosecondsOfSecond", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Instant implements Comparable<Instant>, Serializable {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Instant MAX;
    private static final Instant MIN;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int b;
    private final long epochSeconds;
    private final int nanosecondsOfSecond;
    private static final byte[] $$a = {92, 126, -38, -95, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 191;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 84
            int r8 = r8 + 4
            int r7 = r7 * 15
            int r7 = 53 - r7
            byte[] r0 = kotlin.time.Instant.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2d
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            int r8 = r8 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-11)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.Instant.a(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0149  */
    /* JADX WARN: Code duplicated, block: B:32:0x014a  */
    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        Throwable cause;
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $11 + 73;
        while (true) {
            $10 = i3 % 128;
            int i4 = i3 % 2;
            if (getrealtimecapturelatency.b >= cArr.length) {
                break;
            }
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 2624 - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.lastIndexOf("", '0', 0) + 14, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 39422), 481 - (ViewConfiguration.getPressedStateDuration() >> 16), 37 - Color.alpha(0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                i3 = $11 + 123;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i6 = $11 + 115;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 481, 37 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    public static final /* synthetic */ Instant access$getMAX$cp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        Instant instant = MAX;
        int i5 = i3 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return instant;
        }
        throw null;
    }

    public static final /* synthetic */ Instant access$getMIN$cp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Instant instant = MIN;
        int i4 = i3 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return instant;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Instant instant) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Instant instant2 = instant;
        if (i2 % 2 != 0) {
            return compareTo2(instant2);
        }
        compareTo2(instant2);
        throw null;
    }

    public Instant(long j, int i) {
        this.epochSeconds = j;
        this.nanosecondsOfSecond = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant".toString());
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u000b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\f\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u0011\u0010\u0016\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0006R\u001a\u0010\u0017\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0006R\u001a\u0010\u001a\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0006"}, d2 = {"Lkotlin/time/Instant$Companion;", "", "<init>", "()V", "Lkotlin/time/Instant;", "now", "()Lkotlin/time/Instant;", "", "p0", "fromEpochMilliseconds", "(J)Lkotlin/time/Instant;", "p1", "fromEpochSeconds", "(JJ)Lkotlin/time/Instant;", "", "(JI)Lkotlin/time/Instant;", "", "parse", "(Ljava/lang/CharSequence;)Lkotlin/time/Instant;", "getDISTANT_PAST", "DISTANT_PAST", "getDISTANT_FUTURE", "DISTANT_FUTURE", "MIN", "Lkotlin/time/Instant;", "getMIN$kotlin_stdlib", "MAX", "getMAX$kotlin_stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Use Clock.System.now() instead", replaceWith = @ReplaceWith(expression = "Clock.System.now()", imports = {"kotlin.time.Clock"}))
        public final Instant now() {
            throw new NotImplementedError(null, 1, null);
        }

        public final Instant fromEpochMilliseconds(long p0) {
            long j = p0 / 1000;
            if ((p0 ^ 1000) < 0 && j * 1000 != p0) {
                j--;
            }
            long j2 = p0 % 1000;
            int i = (int) ((j2 + (1000 & (((j2 ^ 1000) & ((-j2) | j2)) >> 63))) * AnimationKt.MillisToNanos);
            if (j < -31557014167219200L) {
                return getMIN$kotlin_stdlib();
            }
            if (j > 31556889864403199L) {
                return getMAX$kotlin_stdlib();
            }
            return fromEpochSeconds(j, i);
        }

        public static /* synthetic */ Instant fromEpochSeconds$default(Companion companion, long j, long j2, int i, Object obj) {
            if ((i & 2) != 0) {
                j2 = 0;
            }
            return companion.fromEpochSeconds(j, j2);
        }

        public final Instant fromEpochSeconds(long p0, long p1) {
            long j = p1 / 1000000000;
            if ((p1 ^ 1000000000) < 0 && j * 1000000000 != p1) {
                j--;
            }
            long j2 = p0 + j;
            if ((p0 ^ j2) < 0 && (j ^ p0) >= 0) {
                return p0 > 0 ? Instant.INSTANCE.getMAX$kotlin_stdlib() : Instant.INSTANCE.getMIN$kotlin_stdlib();
            }
            if (j2 < -31557014167219200L) {
                return getMIN$kotlin_stdlib();
            }
            if (j2 > 31556889864403199L) {
                return getMAX$kotlin_stdlib();
            }
            long j3 = p1 % 1000000000;
            return new Instant(j2, (int) (j3 + ((((j3 ^ 1000000000) & ((-j3) | j3)) >> 63) & 1000000000)));
        }

        public final Instant fromEpochSeconds(long p0, int p1) {
            return fromEpochSeconds(p0, p1);
        }

        public final Instant parse(CharSequence p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return InstantKt.parseIso(p0);
        }

        public final Instant getDISTANT_PAST() {
            return fromEpochSeconds(-3217862419201L, 999999999);
        }

        public final Instant getDISTANT_FUTURE() {
            return fromEpochSeconds(3093527980800L, 0);
        }

        public final Instant getMIN$kotlin_stdlib() {
            return Instant.access$getMIN$cp();
        }

        public final Instant getMAX$kotlin_stdlib() {
            return Instant.access$getMAX$cp();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final long getEpochSeconds() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 29945);
            int packedPositionGroup = 1755 - ExpandableListView.getPackedPositionGroup(0L);
            int i5 = 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[7], bArr[5], bArr[28], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, packedPositionGroup, i5, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{50908, 24552, 62639, 3454, 41534, 14579, 20923, 62990, 3850, 42461, 15069, 21351, 59392, 305, 42995, 15533, 21856, 59925, 247, 39347, 15938, 22273}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 39226, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{50904, 2218, 23082, 44476, 65314, 52927, 4155, 25522, 46336, 33935, 54815, 6528, 27408, 47855, 35938}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 52859, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29943);
            int scrollBarSize = 1755 - (ViewConfiguration.getScrollBarSize() >> 8);
            int iResolveSizeAndState = 23 - View.resolveSizeAndState(0, 0, 0);
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr5 = new Object[1];
            a(b2, b3, (byte) (b3 | 36), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, scrollBarSize, iResolveSizeAndState, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29944);
                int iMyTid = (Process.myTid() >> 22) + 1755;
                int maximumFlingVelocity = 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                a(b4, b5, (byte) (b5 | 88), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, iMyTid, maximumFlingVelocity, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr7[0])[0];
            objArr = new Object[]{new int[]{i6}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i7 = ~startUptimeMillis;
            int i8 = (((~(i7 | (-516046871))) | (~((-728649297) | i7)) | 172113936) * (-397)) + 825985828 + ((startUptimeMillis | (-900468295)) * 397) + 1848759960;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[3])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{50903, 22105, 59329, 30547, 33927, 5192, 42434, 13680, 17138, 53822, 25564, 62323, 242, 36872, 8606, 45339}, 36997 - TextUtils.getOffsetAfter("", 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{50900, 41714, 3726, 59986, 22117, 12803, 40907, 31721, 59309, 17247, 12128, 35596, 29946, 53501, 48259, 6237}, 25644 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-401357251};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 42049), Drawable.resolveOpacity(0, 0) + 1726, ExpandableListView.getPackedPositionChild(0L) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = RumViewScope$onStopView$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), 1848759960);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 29944);
                    int iResolveOpacity = 1755 - Drawable.resolveOpacity(0, 0);
                    int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0');
                    byte b6 = $$a[7];
                    byte b7 = b6;
                    Object[] objArr11 = new Object[1];
                    a(b6, b7, (byte) (b7 | 88), objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetAfter, iResolveOpacity, iLastIndexOf, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr12 = new Object[1];
                    c(new char[]{50908, 24552, 62639, 3454, 41534, 14579, 20923, 62990, 3850, 42461, 15069, 21351, 59392, 305, 42995, 15533, 21856, 59925, 247, 39347, 15938, 22273}, ExpandableListView.getPackedPositionGroup(0L) + 39227, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(new char[]{50904, 2218, 23082, 44476, 65314, 52927, 4155, 25522, 46336, 33935, 54815, 6528, 27408, 47855, 35938}, 52859 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 29945);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1755;
                        int offsetBefore = 23 - TextUtils.getOffsetBefore("", 0);
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr14 = new Object[1];
                        a(b8, b9, (byte) (b9 | 36), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionChild, iMakeMeasureSpec, offsetBefore, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29943);
                        int mirror = 1803 - AndroidCharacter.getMirror('0');
                        int i11 = 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        byte[] bArr2 = $$a;
                        Object[] objArr15 = new Object[1];
                        a(bArr2[7], bArr2[5], bArr2[28], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, mirror, i11, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    objArr = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[0])[0];
        if (i13 == i12) {
            int i14 = ((int[]) objArr[3])[0];
            int i15 = ((int[]) objArr[0])[0];
            Object[] objArr16 = {new int[]{i15}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int iNextInt = new Random().nextInt();
            int i16 = i14 + 1878469249 + ((334246874 | iNextInt) * 376) + (((~((~iNextInt) | 340534539)) | 60822224) * (-376)) + (((~(iNextInt | (-340534540))) | (-127932114)) * 376);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr16[3])[0] = i18 ^ (i18 << 5);
            return this.epochSeconds;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr != null) {
            int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i20 = i19 + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
            int i21 = 2;
            int i22 = i20 % 2;
            int i23 = i19 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 % 128;
            int i24 = i23 % 2;
            while (i4 < strArr.length) {
                int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i25 % 128;
                int i26 = i25 % i21;
                arrayList.add(strArr[i4]);
                i4++;
                int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i27 % 128;
                int i28 = i27 % 2;
                i21 = 2;
            }
        }
        throw new RuntimeException(String.valueOf(i13));
    }

    public final int getNanosecondsOfSecond() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.nanosecondsOfSecond;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r11 == 1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r11 == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r2 = r11 * 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if ((r2 / 1000) == r11) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        r1 = r1 + 23;
        kotlin.time.Instant.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        return Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        r2 = r15.nanosecondsOfSecond / 1000000;
        r11 = r7 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if ((r7 ^ r11) >= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        r1 = r1 + 53;
        r4 = r1 % 128;
        kotlin.time.Instant.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r4;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if ((r2 ^ r7) < 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        r4 = r4 + 97;
        kotlin.time.Instant.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        return Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r11 == 1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        if (r11 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        r1 = r11 * 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if ((r1 / 1000) == r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        return Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        r1 = (r15.nanosecondsOfSecond / 1000000) + androidx.core.app.NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        r11 = r7 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        if ((r7 ^ r11) >= 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
    
        if ((r1 ^ r7) < 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
    
        r3 = r3 + 27;
        kotlin.time.Instant.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
    
        if ((r3 % 2) != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        return Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r11 >= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r11 >= 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long toEpochMilliseconds() {
        /*
            r15 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.time.Instant.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r2 = r1 + 71
            int r3 = r2 % 128
            kotlin.time.Instant.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3
            int r2 = r2 % r0
            r4 = 1000000(0xf4240, float:1.401298E-39)
            r5 = 1
            r7 = 1000(0x3e8, double:4.94E-321)
            r9 = 0
            if (r2 != 0) goto L1e
            long r11 = r15.epochSeconds
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r2 < 0) goto L66
            goto L24
        L1e:
            long r11 = r15.epochSeconds
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r2 < 0) goto L66
        L24:
            int r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L44
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r2 == 0) goto L43
            long r2 = r11 * r7
            long r7 = r2 / r7
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 == 0) goto L41
            int r1 = r1 + 23
            int r2 = r1 % 128
            kotlin.time.Instant.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            return r5
        L41:
            r7 = r2
            goto L44
        L43:
            r7 = r9
        L44:
            int r2 = r15.nanosecondsOfSecond
            int r2 = r2 / r4
            long r2 = (long) r2
            long r11 = r7 + r2
            long r13 = r7 ^ r11
            int r4 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r4 >= 0) goto L65
            int r1 = r1 + 53
            int r4 = r1 % 128
            kotlin.time.Instant.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r4
            int r1 = r1 % r0
            long r1 = r2 ^ r7
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 < 0) goto L65
            int r4 = r4 + 97
            int r1 = r4 % 128
            kotlin.time.Instant.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1
            int r4 = r4 % r0
            return r5
        L65:
            return r11
        L66:
            long r11 = r11 + r5
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            r5 = -9223372036854775808
            if (r1 == 0) goto L7d
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 == 0) goto L7c
            long r1 = r11 * r7
            long r7 = r1 / r7
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 == 0) goto L7a
            return r5
        L7a:
            r7 = r1
            goto L7d
        L7c:
            r7 = r9
        L7d:
            int r1 = r15.nanosecondsOfSecond
            int r1 = r1 / r4
            int r1 = r1 + (-1000)
            long r1 = (long) r1
            long r11 = r7 + r1
            long r13 = r7 ^ r11
            int r4 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r4 >= 0) goto L9c
            long r1 = r1 ^ r7
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 < 0) goto L9c
            int r3 = r3 + 27
            int r1 = r3 % 128
            kotlin.time.Instant.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1
            int r3 = r3 % r0
            if (r3 != 0) goto L9a
            return r5
        L9a:
            r0 = 0
            throw r0
        L9c:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.Instant.toEpochMilliseconds():long");
    }

    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public final Instant m9474plusLRDsOJo(long p0) {
        int i = 2 % 2;
        long jM9388getInWholeSecondsimpl = Duration.m9388getInWholeSecondsimpl(p0);
        int iM9390getNanosecondsComponentimpl = Duration.m9390getNanosecondsComponentimpl(p0);
        if (jM9388getInWholeSecondsimpl == 0 && iM9390getNanosecondsComponentimpl == 0) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 == 0) {
                return this;
            }
            throw null;
        }
        long j = this.epochSeconds;
        long j2 = j + jM9388getInWholeSecondsimpl;
        if ((j ^ j2) >= 0 || (jM9388getInWholeSecondsimpl ^ j) < 0) {
            return INSTANCE.fromEpochSeconds(j2, this.nanosecondsOfSecond + iM9390getNanosecondsComponentimpl);
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        if (!Duration.m9401isPositiveimpl(p0)) {
            return MIN;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return MAX;
    }

    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public final Instant m9472minusLRDsOJo(long p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Instant instantM9474plusLRDsOJo = m9474plusLRDsOJo(Duration.m9418unaryMinusUwyO8pc(p0));
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return instantM9474plusLRDsOJo;
    }

    /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
    public final long m9473minusUwyO8pc(Instant p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Duration.Companion companion = Duration.INSTANCE;
        long duration = DurationKt.toDuration(this.epochSeconds - p0.epochSeconds, DurationUnit.SECONDS);
        Duration.Companion companion2 = Duration.INSTANCE;
        long jM9403plusLRDsOJo = Duration.m9403plusLRDsOJo(duration, DurationKt.toDuration(this.nanosecondsOfSecond - p0.nanosecondsOfSecond, DurationUnit.NANOSECONDS));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return jM9403plusLRDsOJo;
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public final int compareTo2(Instant p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        int iCompare = Intrinsics.compare(this.epochSeconds, p0.epochSeconds);
        if (iCompare == 0) {
            return Intrinsics.compare(this.nanosecondsOfSecond, p0.nanosecondsOfSecond);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iCompare;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r9.nanosecondsOfSecond != r10.nanosecondsOfSecond) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.time.Instant.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r1 = r1 + 41
            int r2 = r1 % 128
            kotlin.time.Instant.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            r3 = 0
            r4 = 0
            if (r1 != 0) goto L16
            r1 = 64
            int r1 = r1 / r3
            if (r9 == r10) goto L43
            goto L18
        L16:
            if (r9 == r10) goto L43
        L18:
            boolean r1 = r10 instanceof kotlin.time.Instant
            if (r1 == 0) goto L42
            int r1 = r2 + 49
            int r5 = r1 % 128
            kotlin.time.Instant.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r5
            int r1 = r1 % r0
            if (r1 != 0) goto L3d
            long r5 = r9.epochSeconds
            kotlin.time.Instant r10 = (kotlin.time.Instant) r10
            long r7 = r10.epochSeconds
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L42
            int r1 = r2 + 81
            int r5 = r1 % 128
            kotlin.time.Instant.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r5
            int r1 = r1 % r0
            int r1 = r9.nanosecondsOfSecond
            int r10 = r10.nanosecondsOfSecond
            if (r1 == r10) goto L43
            goto L42
        L3d:
            kotlin.time.Instant r10 = (kotlin.time.Instant) r10
            long r0 = r10.epochSeconds
            throw r4
        L42:
            return r3
        L43:
            int r2 = r2 + 19
            int r10 = r2 % 128
            kotlin.time.Instant.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r10
            int r2 = r2 % r0
            if (r2 != 0) goto L4e
            r10 = 1
            return r10
        L4e:
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.Instant.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? Long.hashCode(this.epochSeconds) >> (this.nanosecondsOfSecond >> 83) : Long.hashCode(this.epochSeconds) + (this.nanosecondsOfSecond * 51);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return InstantKt.formatIso(this);
        }
        InstantKt.formatIso(this);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Object writeReplace() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object objSerializedInstant = InstantJvmKt.serializedInstant(this);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return objSerializedInstant;
    }

    static {
        b = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        INSTANCE = new Companion(null);
        MIN = new Instant(-31557014167219200L, 0);
        MAX = new Instant(31556889864403199L, 999999999);
        int i = TuitionPaymentFragmentbindingInflater1 + 91;
        b = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 341162421380870054L;
    }
}
