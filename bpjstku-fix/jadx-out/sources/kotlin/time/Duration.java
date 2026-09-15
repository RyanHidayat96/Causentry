package kotlin.time;

import androidx.collection.SieveCacheKt;
import androidx.exifinterface.media.ExifInterface;
import com.midtrans.sdk.corekit.models.ExpiryModel;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b,\b\u0087@\u0018\u0000 \u0086\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0086\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\r\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\u0005J\u0018\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u0018\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0017H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001bH\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0017H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u0019J\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001bH\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020!H\u0000¢\u0006\u0004\b\"\u0010#J\r\u0010&\u001a\u00020\u0006¢\u0006\u0004\b%\u0010\bJ\r\u0010(\u001a\u00020\u0006¢\u0006\u0004\b'\u0010\bJ\r\u0010*\u001a\u00020\u0006¢\u0006\u0004\b)\u0010\bJ\r\u0010,\u001a\u00020\u0006¢\u0006\u0004\b+\u0010\bJ\u0018\u0010/\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b-\u0010.J\u009d\u0001\u0010;\u001a\u00028\u0000\"\u0004\b\u0000\u001002u\u0010\u0003\u001aq\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(5\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(6\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(7\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(8\u0012\u0004\u0012\u00028\u000001H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b9\u0010:J\u0088\u0001\u0010;\u001a\u00028\u0000\"\u0004\b\u0000\u001002`\u0010\u0003\u001a\\\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(5\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(6\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(7\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(8\u0012\u0004\u0012\u00028\u00000<H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b9\u0010=Js\u0010;\u001a\u00028\u0000\"\u0004\b\u0000\u001002K\u0010\u0003\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(6\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(7\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(8\u0012\u0004\u0012\u00028\u00000>H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b9\u0010?J^\u0010;\u001a\u00028\u0000\"\u0004\b\u0000\u0010026\u0010\u0003\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(7\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(8\u0012\u0004\u0012\u00028\u00000@H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b9\u0010AJ\u0015\u0010D\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020!¢\u0006\u0004\bB\u0010CJ\u0015\u0010F\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020!¢\u0006\u0004\bE\u0010#J\u0015\u0010I\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020!¢\u0006\u0004\bG\u0010HJ\u000f\u0010M\u001a\u00020JH\u0017¢\u0006\u0004\bK\u0010LJ?\u0010V\u001a\u00020S*\u00060Nj\u0002`O2\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00172\u0006\u0010P\u001a\u00020\u00172\u0006\u0010Q\u001a\u00020J2\u0006\u0010R\u001a\u00020\u0006H\u0002¢\u0006\u0004\bT\u0010UJ!\u0010M\u001a\u00020J2\u0006\u0010\u0003\u001a\u00020!2\b\b\u0002\u0010\u0011\u001a\u00020\u0017H\u0007¢\u0006\u0004\bK\u0010WJ\u000f\u0010Y\u001a\u00020JH\u0007¢\u0006\u0004\bX\u0010LJ\u001a\u0010[\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010ZHÖ\u0003¢\u0006\u0004\b[\u0010\\J\u0010\u0010]\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010\u0005R\u0015\u0010e\u001a\u00020\u00178Ã\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010h\u001a\u00020!8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0011\u0010j\u001a\u00020\u00008G¢\u0006\u0006\u001a\u0004\bi\u0010\u0005R\u001a\u0010n\u001a\u00020\u00178AX\u0081\u0004¢\u0006\f\u0012\u0004\bl\u0010m\u001a\u0004\bk\u0010dR\u001a\u0010q\u001a\u00020\u00178AX\u0081\u0004¢\u0006\f\u0012\u0004\bp\u0010m\u001a\u0004\bo\u0010dR\u001a\u0010t\u001a\u00020\u00178AX\u0081\u0004¢\u0006\f\u0012\u0004\bs\u0010m\u001a\u0004\br\u0010dR\u001a\u0010w\u001a\u00020\u00178AX\u0081\u0004¢\u0006\f\u0012\u0004\bv\u0010m\u001a\u0004\bu\u0010dR\u0011\u0010y\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bx\u0010\u0005R\u0011\u0010{\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bz\u0010\u0005R\u0011\u0010}\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b|\u0010\u0005R\u0011\u0010\u007f\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b~\u0010\u0005R\u0013\u0010\u0081\u0001\u001a\u00020\u00028G¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\u0005R\u0013\u0010\u0083\u0001\u001a\u00020\u00028G¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\u0005R\u0013\u0010\u0085\u0001\u001a\u00020\u00028G¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010\u0005\u0088\u0001_\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "", "p0", "constructor-impl", "(J)J", "", "isInNanos-impl", "(J)Z", "isInNanos", "isInMillis-impl", "isInMillis", "unaryMinus-UwyO8pc", "unaryMinus", "plus-LRDsOJo", "(JJ)J", "plus", "p1", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "addValuesMixedRanges", "minus-LRDsOJo", "minus", "", "times-UwyO8pc", "(JI)J", "times", "", "(JD)J", "div-UwyO8pc", "div", "div-LRDsOJo", "(JJ)D", "Lkotlin/time/DurationUnit;", "truncateTo-UwyO8pc$kotlin_stdlib", "(JLkotlin/time/DurationUnit;)J", "truncateTo", "isNegative-impl", "isNegative", "isPositive-impl", "isPositive", "isInfinite-impl", "isInfinite", "isFinite-impl", "isFinite", "compareTo-LRDsOJo", "(JJ)I", "compareTo", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", ExpiryModel.UNIT_DAY, ExpiryModel.UNIT_HOUR, ExpiryModel.UNIT_MINUTE, "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "toComponents", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toDouble", "toLong-impl", "toLong", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "toInt", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "Ljava/lang/StringBuilder;", "Lkotlin/text/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "p2", "p3", "p4", "", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "appendFractional", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "toIsoString-impl", "toIsoString", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "rawValue", "J", "getValue-impl", "value", "getUnitDiscriminator-impl", "(J)I", "unitDiscriminator", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "storageUnit", "getAbsoluteValue-UwyO8pc", "absoluteValue", "getHoursComponent-impl", "getHoursComponent$annotations", "()V", "hoursComponent", "getMinutesComponent-impl", "getMinutesComponent$annotations", "minutesComponent", "getSecondsComponent-impl", "getSecondsComponent$annotations", "secondsComponent", "getNanosecondsComponent-impl", "getNanosecondsComponent$annotations", "nanosecondsComponent", "getInWholeDays-impl", "inWholeDays", "getInWholeHours-impl", "inWholeHours", "getInWholeMinutes-impl", "inWholeMinutes", "getInWholeSeconds-impl", "inWholeSeconds", "getInWholeMilliseconds-impl", "inWholeMilliseconds", "getInWholeMicroseconds-impl", "inWholeMicroseconds", "getInWholeNanoseconds-impl", "inWholeNanoseconds", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
public final class Duration implements Comparable<Duration> {
    private final long rawValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long ZERO = m9374constructorimpl(0);
    private static final long INFINITE = DurationKt.durationOfMillis(4611686018427387903L);
    private static final long NEG_INFINITE = DurationKt.durationOfMillis(-4611686018427387903L);

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9379equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* JADX INFO: renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m9393getUnitDiscriminatorimpl(long j) {
        return ((int) j) & 1;
    }

    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    private static final long m9394getValueimpl(long j) {
        return j >> 1;
    }

    /* JADX INFO: renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m9397isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    /* JADX INFO: renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m9398isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    /* JADX INFO: renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m9400isNegativeimpl(long j) {
        return j < 0;
    }

    /* JADX INFO: renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m9401isPositiveimpl(long j) {
        return j > 0;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Duration duration) {
        return m9419compareToLRDsOJo(duration.getRawValue());
    }

    private /* synthetic */ Duration(long j) {
        this.rawValue = j;
    }

    /* JADX INFO: renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnit m9392getStorageUnitimpl(long j) {
        return m9398isInNanosimpl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m9374constructorimpl(long j) {
        if (!DurationJvmKt.getDurationAssertionsEnabled()) {
            return j;
        }
        if (m9398isInNanosimpl(j)) {
            long jM9394getValueimpl = m9394getValueimpl(j);
            if (-4611686018426999999L <= jM9394getValueimpl && jM9394getValueimpl < 4611686018427000000L) {
                return j;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(m9394getValueimpl(j));
            sb.append(" ns is out of nanoseconds range");
            throw new AssertionError(sb.toString());
        }
        long jM9394getValueimpl2 = m9394getValueimpl(j);
        if (-4611686018427387903L > jM9394getValueimpl2 || jM9394getValueimpl2 >= SieveCacheKt.NodeVisitedBit) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m9394getValueimpl(j));
            sb2.append(" ms is out of milliseconds range");
            throw new AssertionError(sb2.toString());
        }
        long jM9394getValueimpl3 = m9394getValueimpl(j);
        if (-4611686018426L > jM9394getValueimpl3 || jM9394getValueimpl3 >= 4611686018427L) {
            return j;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m9394getValueimpl(j));
        sb3.append(" ms is denormalized");
        throw new AssertionError(sb3.toString());
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0016\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001f\u0010$\u001a\u00020\f*\u00020\u001f8Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u001f\u0010$\u001a\u00020\f*\u00020%8Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010'\u001a\u0004\b \u0010&R\u001f\u0010$\u001a\u00020\f*\u00020\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010)\u001a\u0004\b \u0010(R\u001f\u0010,\u001a\u00020\f*\u00020\u001f8Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010#\u001a\u0004\b*\u0010!R\u001f\u0010,\u001a\u00020\f*\u00020%8Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010'\u001a\u0004\b*\u0010&R\u001f\u0010,\u001a\u00020\f*\u00020\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010(R\u001f\u0010/\u001a\u00020\f*\u00020\u001f8Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010#\u001a\u0004\b-\u0010!R\u001f\u0010/\u001a\u00020\f*\u00020%8Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010'\u001a\u0004\b-\u0010&R\u001f\u0010/\u001a\u00020\f*\u00020\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010(R\u001f\u00102\u001a\u00020\f*\u00020\u001f8Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b1\u0010#\u001a\u0004\b0\u0010!R\u001f\u00102\u001a\u00020\f*\u00020%8Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b1\u0010'\u001a\u0004\b0\u0010&R\u001f\u00102\u001a\u00020\f*\u00020\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b1\u0010)\u001a\u0004\b0\u0010(R\u001f\u00105\u001a\u00020\f*\u00020\u001f8Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b4\u0010#\u001a\u0004\b3\u0010!R\u001f\u00105\u001a\u00020\f*\u00020%8Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b4\u0010'\u001a\u0004\b3\u0010&R\u001f\u00105\u001a\u00020\f*\u00020\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b4\u0010)\u001a\u0004\b3\u0010(R\u001f\u00108\u001a\u00020\f*\u00020\u001f8Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b7\u0010#\u001a\u0004\b6\u0010!R\u001f\u00108\u001a\u00020\f*\u00020%8Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b7\u0010'\u001a\u0004\b6\u0010&R\u001f\u00108\u001a\u00020\f*\u00020\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b7\u0010)\u001a\u0004\b6\u0010(R\u001f\u0010;\u001a\u00020\f*\u00020\u001f8Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b:\u0010#\u001a\u0004\b9\u0010!R\u001f\u0010;\u001a\u00020\f*\u00020%8Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b:\u0010'\u001a\u0004\b9\u0010&R\u001f\u0010;\u001a\u00020\f*\u00020\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b:\u0010)\u001a\u0004\b9\u0010("}, d2 = {"Lkotlin/time/Duration$Companion;", "", "<init>", "()V", "", "p0", "Lkotlin/time/DurationUnit;", "p1", "p2", "convert", "(DLkotlin/time/DurationUnit;Lkotlin/time/DurationUnit;)D", "", "Lkotlin/time/Duration;", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parse", "parseIsoString-UwyO8pc", "parseIsoString", "parseOrNull-FghU774", "(Ljava/lang/String;)Lkotlin/time/Duration;", "parseOrNull", "parseIsoStringOrNull-FghU774", "parseIsoStringOrNull", "ZERO", "J", "getZERO-UwyO8pc", "()J", "INFINITE", "getINFINITE-UwyO8pc", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "", "getNanoseconds-UwyO8pc", "(I)J", "getNanoseconds-UwyO8pc$annotations", "(I)V", "nanoseconds", "", "(J)J", "(J)V", "(D)J", "(D)V", "getMicroseconds-UwyO8pc", "getMicroseconds-UwyO8pc$annotations", "microseconds", "getMilliseconds-UwyO8pc", "getMilliseconds-UwyO8pc$annotations", "milliseconds", "getSeconds-UwyO8pc", "getSeconds-UwyO8pc$annotations", "seconds", "getMinutes-UwyO8pc", "getMinutes-UwyO8pc$annotations", ExpiryModel.UNIT_MINUTE, "getHours-UwyO8pc", "getHours-UwyO8pc$annotations", ExpiryModel.UNIT_HOUR, "getDays-UwyO8pc", "getDays-UwyO8pc$annotations", ExpiryModel.UNIT_DAY}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m9424getDaysUwyO8pc$annotations(double d) {
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m9425getDaysUwyO8pc$annotations(int i) {
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m9426getDaysUwyO8pc$annotations(long j) {
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m9430getHoursUwyO8pc$annotations(double d) {
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m9431getHoursUwyO8pc$annotations(int i) {
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m9432getHoursUwyO8pc$annotations(long j) {
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m9436getMicrosecondsUwyO8pc$annotations(double d) {
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m9437getMicrosecondsUwyO8pc$annotations(int i) {
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m9438getMicrosecondsUwyO8pc$annotations(long j) {
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m9442getMillisecondsUwyO8pc$annotations(double d) {
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m9443getMillisecondsUwyO8pc$annotations(int i) {
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m9444getMillisecondsUwyO8pc$annotations(long j) {
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m9448getMinutesUwyO8pc$annotations(double d) {
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m9449getMinutesUwyO8pc$annotations(int i) {
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m9450getMinutesUwyO8pc$annotations(long j) {
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m9454getNanosecondsUwyO8pc$annotations(double d) {
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m9455getNanosecondsUwyO8pc$annotations(int i) {
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m9456getNanosecondsUwyO8pc$annotations(long j) {
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m9460getSecondsUwyO8pc$annotations(double d) {
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m9461getSecondsUwyO8pc$annotations(int i) {
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m9462getSecondsUwyO8pc$annotations(long j) {
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m9465getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        /* JADX INFO: renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m9463getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* JADX INFO: renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m9464getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        public final double convert(double p0, DurationUnit p1, DurationUnit p2) {
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            return DurationUnitKt.convertDurationUnit(p0, p1, p2);
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m9452getNanosecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m9453getNanosecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m9451getNanosecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m9434getMicrosecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MICROSECONDS);
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m9435getMicrosecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MICROSECONDS);
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m9433getMicrosecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MICROSECONDS);
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m9440getMillisecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MILLISECONDS);
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m9441getMillisecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MILLISECONDS);
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m9439getMillisecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MILLISECONDS);
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m9458getSecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.SECONDS);
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m9459getSecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.SECONDS);
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m9457getSecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.SECONDS);
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m9446getMinutesUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MINUTES);
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m9447getMinutesUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MINUTES);
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m9445getMinutesUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MINUTES);
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m9428getHoursUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.HOURS);
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m9429getHoursUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.HOURS);
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m9427getHoursUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.HOURS);
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m9422getDaysUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.DAYS);
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m9423getDaysUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.DAYS);
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m9421getDaysUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.DAYS);
        }

        /* JADX INFO: renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m9466parseUwyO8pc(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            try {
                return DurationKt.parseDuration(p0, false);
            } catch (IllegalArgumentException e2) {
                StringBuilder sb = new StringBuilder("Invalid duration string format: '");
                sb.append(p0);
                sb.append("'.");
                throw new IllegalArgumentException(sb.toString(), e2);
            }
        }

        /* JADX INFO: renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m9467parseIsoStringUwyO8pc(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            try {
                return DurationKt.parseDuration(p0, true);
            } catch (IllegalArgumentException e2) {
                StringBuilder sb = new StringBuilder("Invalid ISO duration string format: '");
                sb.append(p0);
                sb.append("'.");
                throw new IllegalArgumentException(sb.toString(), e2);
            }
        }

        /* JADX INFO: renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final Duration m9469parseOrNullFghU774(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            try {
                return Duration.m9372boximpl(DurationKt.parseDuration(p0, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final Duration m9468parseIsoStringOrNullFghU774(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            try {
                return Duration.m9372boximpl(DurationKt.parseDuration(p0, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m9418unaryMinusUwyO8pc(long j) {
        return DurationKt.durationOf(-m9394getValueimpl(j), ((int) j) & 1);
    }

    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m9403plusLRDsOJo(long j, long j2) {
        if (m9399isInfiniteimpl(j)) {
            if (m9396isFiniteimpl(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m9399isInfiniteimpl(j2)) {
            return j2;
        }
        if ((((int) j) & 1) == (((int) j2) & 1)) {
            long jM9394getValueimpl = m9394getValueimpl(j) + m9394getValueimpl(j2);
            return m9398isInNanosimpl(j) ? DurationKt.durationOfNanosNormalized(jM9394getValueimpl) : DurationKt.durationOfMillisNormalized(jM9394getValueimpl);
        }
        if (m9397isInMillisimpl(j)) {
            return m9370addValuesMixedRangesUwyO8pc(j, m9394getValueimpl(j), m9394getValueimpl(j2));
        }
        return m9370addValuesMixedRangesUwyO8pc(j, m9394getValueimpl(j2), m9394getValueimpl(j));
    }

    /* JADX INFO: renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m9370addValuesMixedRangesUwyO8pc(long j, long j2, long j3) {
        long jNanosToMillis = DurationKt.nanosToMillis(j3);
        long j4 = j2 + jNanosToMillis;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return DurationKt.durationOfMillis(RangesKt.coerceIn(j4, -4611686018427387903L, 4611686018427387903L));
        }
        return DurationKt.durationOfNanos(DurationKt.millisToNanos(j4) + (j3 - DurationKt.millisToNanos(jNanosToMillis)));
    }

    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m9402minusLRDsOJo(long j, long j2) {
        return m9403plusLRDsOJo(j, m9418unaryMinusUwyO8pc(j2));
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m9405timesUwyO8pc(long j, int i) {
        if (m9399isInfiniteimpl(j)) {
            if (i != 0) {
                return i > 0 ? j : m9418unaryMinusUwyO8pc(j);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i == 0) {
            return ZERO;
        }
        long jM9394getValueimpl = m9394getValueimpl(j);
        long j2 = i;
        long j3 = jM9394getValueimpl * j2;
        if (!m9398isInNanosimpl(j)) {
            if (j3 / j2 == jM9394getValueimpl) {
                return DurationKt.durationOfMillis(RangesKt.coerceIn(j3, new LongRange(-4611686018427387903L, 4611686018427387903L)));
            }
            return MathKt.getSign(jM9394getValueimpl) * MathKt.getSign(i) > 0 ? INFINITE : NEG_INFINITE;
        }
        if (-2147483647L <= jM9394getValueimpl && jM9394getValueimpl < 2147483648L) {
            return DurationKt.durationOfNanos(j3);
        }
        if (j3 / j2 == jM9394getValueimpl) {
            return DurationKt.durationOfNanosNormalized(j3);
        }
        long jNanosToMillis = DurationKt.nanosToMillis(jM9394getValueimpl);
        long j4 = jNanosToMillis * j2;
        long jNanosToMillis2 = DurationKt.nanosToMillis((jM9394getValueimpl - DurationKt.millisToNanos(jNanosToMillis)) * j2) + j4;
        if (j4 / j2 != jNanosToMillis || (jNanosToMillis2 ^ j4) < 0) {
            return MathKt.getSign(jM9394getValueimpl) * MathKt.getSign(i) > 0 ? INFINITE : NEG_INFINITE;
        }
        return DurationKt.durationOfMillis(RangesKt.coerceIn(jNanosToMillis2, new LongRange(-4611686018427387903L, 4611686018427387903L)));
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m9404timesUwyO8pc(long j, double d) {
        int iRoundToInt = MathKt.roundToInt(d);
        if (iRoundToInt == d) {
            return m9405timesUwyO8pc(j, iRoundToInt);
        }
        DurationUnit durationUnitM9392getStorageUnitimpl = m9392getStorageUnitimpl(j);
        return DurationKt.toDuration(m9410toDoubleimpl(j, durationUnitM9392getStorageUnitimpl) * d, durationUnitM9392getStorageUnitimpl);
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m9377divUwyO8pc(long j, int i) {
        if (i == 0) {
            if (m9401isPositiveimpl(j)) {
                return INFINITE;
            }
            if (m9400isNegativeimpl(j)) {
                return NEG_INFINITE;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m9398isInNanosimpl(j)) {
            return DurationKt.durationOfNanos(m9394getValueimpl(j) / ((long) i));
        }
        if (m9399isInfiniteimpl(j)) {
            return m9405timesUwyO8pc(j, MathKt.getSign(i));
        }
        long j2 = i;
        long jM9394getValueimpl = m9394getValueimpl(j) / j2;
        if (-4611686018426L > jM9394getValueimpl || jM9394getValueimpl >= 4611686018427L) {
            return DurationKt.durationOfMillis(jM9394getValueimpl);
        }
        return DurationKt.durationOfNanos(DurationKt.millisToNanos(jM9394getValueimpl) + (DurationKt.millisToNanos(m9394getValueimpl(j) - (jM9394getValueimpl * j2)) / j2));
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m9376divUwyO8pc(long j, double d) {
        int iRoundToInt = MathKt.roundToInt(d);
        if (iRoundToInt == d && iRoundToInt != 0) {
            return m9377divUwyO8pc(j, iRoundToInt);
        }
        DurationUnit durationUnitM9392getStorageUnitimpl = m9392getStorageUnitimpl(j);
        return DurationKt.toDuration(m9410toDoubleimpl(j, durationUnitM9392getStorageUnitimpl) / d, durationUnitM9392getStorageUnitimpl);
    }

    /* JADX INFO: renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m9375divLRDsOJo(long j, long j2) {
        DurationUnit durationUnit = (DurationUnit) ComparisonsKt.maxOf(m9392getStorageUnitimpl(j), m9392getStorageUnitimpl(j2));
        return m9410toDoubleimpl(j, durationUnit) / m9410toDoubleimpl(j2, durationUnit);
    }

    /* JADX INFO: renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m9417truncateToUwyO8pc$kotlin_stdlib(long j, DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        DurationUnit durationUnitM9392getStorageUnitimpl = m9392getStorageUnitimpl(j);
        if (durationUnit.compareTo(durationUnitM9392getStorageUnitimpl) <= 0 || m9399isInfiniteimpl(j)) {
            return j;
        }
        return DurationKt.toDuration(m9394getValueimpl(j) - (m9394getValueimpl(j) % DurationUnitKt.convertDurationUnit(1L, durationUnit, durationUnitM9392getStorageUnitimpl)), durationUnitM9392getStorageUnitimpl);
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m9399isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m9396isFiniteimpl(long j) {
        return !m9399isInfiniteimpl(j);
    }

    /* JADX INFO: renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m9380getAbsoluteValueUwyO8pc(long j) {
        return m9400isNegativeimpl(j) ? m9418unaryMinusUwyO8pc(j) : j;
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public final int m9419compareToLRDsOJo(long j) {
        return m9373compareToLRDsOJo(this.rawValue, j);
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m9373compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m9400isNegativeimpl(j) ? -i : i;
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m9409toComponentsimpl(long j, Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> function5) {
        Intrinsics.checkNotNullParameter(function5, "");
        return function5.invoke(Long.valueOf(m9382getInWholeDaysimpl(j)), Integer.valueOf(m9381getHoursComponentimpl(j)), Integer.valueOf(m9389getMinutesComponentimpl(j)), Integer.valueOf(m9391getSecondsComponentimpl(j)), Integer.valueOf(m9390getNanosecondsComponentimpl(j)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m9408toComponentsimpl(long j, Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> function4) {
        Intrinsics.checkNotNullParameter(function4, "");
        return function4.invoke(Long.valueOf(m9383getInWholeHoursimpl(j)), Integer.valueOf(m9389getMinutesComponentimpl(j)), Integer.valueOf(m9391getSecondsComponentimpl(j)), Integer.valueOf(m9390getNanosecondsComponentimpl(j)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m9407toComponentsimpl(long j, Function3<? super Long, ? super Integer, ? super Integer, ? extends T> function3) {
        Intrinsics.checkNotNullParameter(function3, "");
        return function3.invoke(Long.valueOf(m9386getInWholeMinutesimpl(j)), Integer.valueOf(m9391getSecondsComponentimpl(j)), Integer.valueOf(m9390getNanosecondsComponentimpl(j)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m9406toComponentsimpl(long j, Function2<? super Long, ? super Integer, ? extends T> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        return function2.invoke(Long.valueOf(m9388getInWholeSecondsimpl(j)), Integer.valueOf(m9390getNanosecondsComponentimpl(j)));
    }

    /* JADX INFO: renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m9381getHoursComponentimpl(long j) {
        if (m9399isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m9383getInWholeHoursimpl(j) % 24);
    }

    /* JADX INFO: renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m9389getMinutesComponentimpl(long j) {
        if (m9399isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m9386getInWholeMinutesimpl(j) % 60);
    }

    /* JADX INFO: renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m9391getSecondsComponentimpl(long j) {
        if (m9399isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m9388getInWholeSecondsimpl(j) % 60);
    }

    /* JADX INFO: renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m9390getNanosecondsComponentimpl(long j) {
        long jM9394getValueimpl;
        if (m9399isInfiniteimpl(j)) {
            return 0;
        }
        if (m9397isInMillisimpl(j)) {
            jM9394getValueimpl = DurationKt.millisToNanos(m9394getValueimpl(j) % 1000);
        } else {
            jM9394getValueimpl = m9394getValueimpl(j) % 1000000000;
        }
        return (int) jM9394getValueimpl;
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m9410toDoubleimpl(long j, DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        if (j == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt.convertDurationUnit(m9394getValueimpl(j), m9392getStorageUnitimpl(j), durationUnit);
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m9413toLongimpl(long j, DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt.convertDurationUnit(m9394getValueimpl(j), m9392getStorageUnitimpl(j), durationUnit);
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m9411toIntimpl(long j, DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        return (int) RangesKt.coerceIn(m9413toLongimpl(j, durationUnit), SieveCacheKt.NodeMetaAndPreviousMask, SieveCacheKt.NodeLinkMask);
    }

    /* JADX INFO: renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m9382getInWholeDaysimpl(long j) {
        return m9413toLongimpl(j, DurationUnit.DAYS);
    }

    /* JADX INFO: renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m9383getInWholeHoursimpl(long j) {
        return m9413toLongimpl(j, DurationUnit.HOURS);
    }

    /* JADX INFO: renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m9386getInWholeMinutesimpl(long j) {
        return m9413toLongimpl(j, DurationUnit.MINUTES);
    }

    /* JADX INFO: renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m9388getInWholeSecondsimpl(long j) {
        return m9413toLongimpl(j, DurationUnit.SECONDS);
    }

    /* JADX INFO: renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m9385getInWholeMillisecondsimpl(long j) {
        return (m9397isInMillisimpl(j) && m9396isFiniteimpl(j)) ? m9394getValueimpl(j) : m9413toLongimpl(j, DurationUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m9384getInWholeMicrosecondsimpl(long j) {
        return m9413toLongimpl(j, DurationUnit.MICROSECONDS);
    }

    /* JADX INFO: renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m9387getInWholeNanosecondsimpl(long j) {
        long jM9394getValueimpl = m9394getValueimpl(j);
        if (m9398isInNanosimpl(j)) {
            return jM9394getValueimpl;
        }
        if (jM9394getValueimpl > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jM9394getValueimpl < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return DurationKt.millisToNanos(jM9394getValueimpl);
    }

    public final String toString() {
        return m9414toStringimpl(this.rawValue);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m9414toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean zM9400isNegativeimpl = m9400isNegativeimpl(j);
        StringBuilder sb = new StringBuilder();
        if (zM9400isNegativeimpl) {
            sb.append('-');
        }
        long jM9380getAbsoluteValueUwyO8pc = m9380getAbsoluteValueUwyO8pc(j);
        long jM9382getInWholeDaysimpl = m9382getInWholeDaysimpl(jM9380getAbsoluteValueUwyO8pc);
        int iM9381getHoursComponentimpl = m9381getHoursComponentimpl(jM9380getAbsoluteValueUwyO8pc);
        int iM9389getMinutesComponentimpl = m9389getMinutesComponentimpl(jM9380getAbsoluteValueUwyO8pc);
        int iM9391getSecondsComponentimpl = m9391getSecondsComponentimpl(jM9380getAbsoluteValueUwyO8pc);
        int iM9390getNanosecondsComponentimpl = m9390getNanosecondsComponentimpl(jM9380getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = jM9382getInWholeDaysimpl != 0;
        boolean z2 = iM9381getHoursComponentimpl != 0;
        boolean z3 = iM9389getMinutesComponentimpl != 0;
        boolean z4 = (iM9391getSecondsComponentimpl == 0 && iM9390getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(jM9382getInWholeDaysimpl);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM9381getHoursComponentimpl);
            sb.append('h');
            i++;
        }
        if (z3 || (z4 && (z2 || z))) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM9389getMinutesComponentimpl);
            sb.append('m');
            i++;
        }
        if (z4) {
            if (i > 0) {
                sb.append(' ');
            }
            if (iM9391getSecondsComponentimpl != 0 || z || z2 || z3) {
                m9371appendFractionalimpl(j, sb, iM9391getSecondsComponentimpl, iM9390getNanosecondsComponentimpl, 9, "s", false);
            } else if (iM9390getNanosecondsComponentimpl >= 1000000) {
                m9371appendFractionalimpl(j, sb, iM9390getNanosecondsComponentimpl / 1000000, iM9390getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (iM9390getNanosecondsComponentimpl >= 1000) {
                m9371appendFractionalimpl(j, sb, iM9390getNanosecondsComponentimpl / 1000, iM9390getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(iM9390getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i++;
        }
        if (zM9400isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m9371appendFractionalimpl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strPadStart = StringsKt.padStart(String.valueOf(i2), i3, '0');
            int length = strPadStart.length() - 1;
            int i4 = -1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strPadStart.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (!z && i6 < 3) {
                sb.append((CharSequence) strPadStart, 0, i6);
                Intrinsics.checkNotNullExpressionValue(sb, "");
            } else {
                sb.append((CharSequence) strPadStart, 0, ((i4 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "");
            }
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m9416toStringimpl$default(long j, DurationUnit durationUnit, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m9415toStringimpl(j, durationUnit, i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static final String m9415toStringimpl(long j, DurationUnit durationUnit, int i) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        if (i < 0) {
            throw new IllegalArgumentException("decimals must be not negative, but was ".concat(String.valueOf(i)).toString());
        }
        double dM9410toDoubleimpl = m9410toDoubleimpl(j, durationUnit);
        if (Double.isInfinite(dM9410toDoubleimpl)) {
            return String.valueOf(dM9410toDoubleimpl);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(DurationJvmKt.formatToExactDecimals(dM9410toDoubleimpl, RangesKt.coerceAtMost(i, 12)));
        sb.append(DurationUnitKt.shortName(durationUnit));
        return sb.toString();
    }

    /* JADX INFO: renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m9412toIsoStringimpl(long j) {
        StringBuilder sb = new StringBuilder();
        if (m9400isNegativeimpl(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long jM9380getAbsoluteValueUwyO8pc = m9380getAbsoluteValueUwyO8pc(j);
        long jM9383getInWholeHoursimpl = m9383getInWholeHoursimpl(jM9380getAbsoluteValueUwyO8pc);
        int iM9389getMinutesComponentimpl = m9389getMinutesComponentimpl(jM9380getAbsoluteValueUwyO8pc);
        int iM9391getSecondsComponentimpl = m9391getSecondsComponentimpl(jM9380getAbsoluteValueUwyO8pc);
        int iM9390getNanosecondsComponentimpl = m9390getNanosecondsComponentimpl(jM9380getAbsoluteValueUwyO8pc);
        if (m9399isInfiniteimpl(j)) {
            jM9383getInWholeHoursimpl = 9999999999999L;
        }
        boolean z = false;
        boolean z2 = jM9383getInWholeHoursimpl != 0;
        boolean z3 = (iM9391getSecondsComponentimpl == 0 && iM9390getNanosecondsComponentimpl == 0) ? false : true;
        if (iM9389getMinutesComponentimpl != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jM9383getInWholeHoursimpl);
            sb.append('H');
        }
        if (z) {
            sb.append(iM9389getMinutesComponentimpl);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            m9371appendFractionalimpl(j, sb, iM9391getSecondsComponentimpl, iM9390getNanosecondsComponentimpl, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m9372boximpl(long j) {
        return new Duration(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m9378equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).getRawValue();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m9395hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object p0) {
        return m9378equalsimpl(this.rawValue, p0);
    }

    public final int hashCode() {
        return m9395hashCodeimpl(this.rawValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }
}
