package androidx.compose.runtime.snapshots;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u0000 ,2\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u0001,B5\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0013J\u001a\u0010\u0017\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0016H\u0097\u0002¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002!\u0010\u0005\u001a\u001d\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u001a\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00000\u0019H\u0082\b¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u001f\u001a\u00020\u001e2\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u001e0\u001dH\u0086\b¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0017¢\u0006\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0018\u0010)\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u001c\u0010*\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "p0", "p1", "p2", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "p3", "<init>", "(JJJ[J)V", "", "get", "(J)Z", "set", "(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "clear", "andNot", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "and", "or", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "fastFold", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "Lkotlin/Function1;", "", "fastForEach", "(Lkotlin/jvm/functions/Function1;)V", "lowest", "(J)J", "", "toString", "()Ljava/lang/String;", "upperSet", "J", "lowerSet", "lowerBound", "belowBound", "[J", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnapshotIdSet implements Iterable<Long>, KMappedMarker {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, null);
    private final long[] belowBound;
    private final long lowerBound;
    private final long lowerSet;
    private final long upperSet;

    private SnapshotIdSet(long j, long j2, long j3, long[] jArr) {
        this.upperSet = j;
        this.lowerSet = j2;
        this.lowerBound = j3;
        this.belowBound = jArr;
    }

    public final boolean get(long p0) {
        long[] jArr;
        long j = p0 - this.lowerBound;
        if (Intrinsics.compare(j, 0L) >= 0 && Intrinsics.compare(j, 64L) < 0) {
            return ((1 << ((int) j)) & this.lowerSet) != 0;
        }
        if (Intrinsics.compare(j, 64L) < 0 || Intrinsics.compare(j, 128L) >= 0) {
            return Intrinsics.compare(j, 0L) <= 0 && (jArr = this.belowBound) != null && SnapshotId_jvmKt.binarySearch(jArr, p0) >= 0;
        }
        return ((1 << (((int) j) + (-64))) & this.upperSet) != 0;
    }

    public final SnapshotIdSet set(long p0) {
        long j;
        long j2;
        long[] array;
        SnapshotIdSet snapshotIdSet = this;
        while (true) {
            long j3 = p0 - snapshotIdSet.lowerBound;
            long j4 = 1;
            if (Intrinsics.compare(j3, 0L) >= 0 && Intrinsics.compare(j3, 64L) < 0) {
                long j5 = 1 << ((int) j3);
                long j6 = snapshotIdSet.lowerSet;
                if ((j6 & j5) != 0) {
                    break;
                }
                return new SnapshotIdSet(snapshotIdSet.upperSet, j6 | j5, snapshotIdSet.lowerBound, snapshotIdSet.belowBound);
            }
            if (Intrinsics.compare(j3, 64L) >= 0 && Intrinsics.compare(j3, 128L) < 0) {
                long j7 = 1 << (((int) j3) - 64);
                long j8 = snapshotIdSet.upperSet;
                if ((j8 & j7) != 0) {
                    break;
                }
                return new SnapshotIdSet(j8 | j7, snapshotIdSet.lowerSet, snapshotIdSet.lowerBound, snapshotIdSet.belowBound);
            }
            if (Intrinsics.compare(j3, 128L) >= 0) {
                if (snapshotIdSet.get(p0)) {
                    break;
                }
                long j9 = snapshotIdSet.upperSet;
                long j10 = snapshotIdSet.lowerSet;
                long j11 = snapshotIdSet.lowerBound;
                long j12 = ((p0 + 1) / 64) * 64;
                if (Intrinsics.compare(j12, 0L) < 0) {
                    j12 = 9223372036854775680L;
                }
                SnapshotIdArrayBuilder snapshotIdArrayBuilder = null;
                long j13 = j9;
                while (true) {
                    if (Intrinsics.compare(j11, j12) >= 0) {
                        j = j11;
                        j2 = j10;
                        break;
                    }
                    if (j10 != 0) {
                        SnapshotIdArrayBuilder snapshotIdArrayBuilder2 = snapshotIdArrayBuilder == null ? new SnapshotIdArrayBuilder(snapshotIdSet.belowBound) : snapshotIdArrayBuilder;
                        int i = 0;
                        while (i < 64) {
                            if ((j10 & (j4 << i)) != 0) {
                                snapshotIdArrayBuilder2.add(((long) i) + j11);
                            }
                            i++;
                            j4 = 1;
                        }
                        snapshotIdArrayBuilder = snapshotIdArrayBuilder2;
                    }
                    if (j13 == 0) {
                        j2 = 0;
                        j = j12;
                        break;
                    }
                    j11 += 64;
                    j10 = j13;
                    j4 = 1;
                    j13 = 0;
                }
                snapshotIdSet = new SnapshotIdSet(j13, j2, j, (snapshotIdArrayBuilder == null || (array = snapshotIdArrayBuilder.toArray()) == null) ? snapshotIdSet.belowBound : array);
            } else {
                long[] jArr = snapshotIdSet.belowBound;
                if (jArr == null) {
                    return new SnapshotIdSet(snapshotIdSet.upperSet, snapshotIdSet.lowerSet, snapshotIdSet.lowerBound, new long[]{p0});
                }
                int iBinarySearch = SnapshotId_jvmKt.binarySearch(jArr, p0);
                if (iBinarySearch >= 0) {
                    break;
                }
                return new SnapshotIdSet(snapshotIdSet.upperSet, snapshotIdSet.lowerSet, snapshotIdSet.lowerBound, SnapshotId_jvmKt.withIdInsertedAt(jArr, -(iBinarySearch + 1), p0));
            }
        }
        return snapshotIdSet;
    }

    public final SnapshotIdSet clear(long p0) {
        long[] jArr;
        int iBinarySearch;
        long j = p0 - this.lowerBound;
        if (Intrinsics.compare(j, 0L) >= 0 && Intrinsics.compare(j, 64L) < 0) {
            long j2 = 1 << ((int) j);
            long j3 = this.lowerSet;
            if ((j3 & j2) != 0) {
                return new SnapshotIdSet(this.upperSet, j3 & (~j2), this.lowerBound, this.belowBound);
            }
        } else if (Intrinsics.compare(j, 64L) >= 0 && Intrinsics.compare(j, 128L) < 0) {
            long j4 = 1 << (((int) j) - 64);
            long j5 = this.upperSet;
            if ((j5 & j4) != 0) {
                return new SnapshotIdSet(j5 & (~j4), this.lowerSet, this.lowerBound, this.belowBound);
            }
        } else if (Intrinsics.compare(j, 0L) < 0 && (jArr = this.belowBound) != null && (iBinarySearch = SnapshotId_jvmKt.binarySearch(jArr, p0)) >= 0) {
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.withIdRemovedAt(jArr, iBinarySearch));
        }
        return this;
    }

    public final SnapshotIdSet andNot(SnapshotIdSet p0) {
        SnapshotIdSet snapshotIdSetClear;
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (p0 == snapshotIdSet) {
            return this;
        }
        if (this == snapshotIdSet) {
            return snapshotIdSet;
        }
        long j = p0.lowerBound;
        long j2 = this.lowerBound;
        if (j == j2) {
            long[] jArr = p0.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet(this.upperSet & (~p0.upperSet), (~p0.lowerSet) & this.lowerSet, j2, jArr2);
            }
        }
        long[] jArr3 = p0.belowBound;
        if (jArr3 != null) {
            snapshotIdSetClear = this;
            for (long j3 : jArr3) {
                snapshotIdSetClear = snapshotIdSetClear.clear(j3);
            }
        } else {
            snapshotIdSetClear = this;
        }
        if (p0.lowerSet != 0) {
            for (int i = 0; i < 64; i++) {
                if ((p0.lowerSet & (1 << i)) != 0) {
                    snapshotIdSetClear = snapshotIdSetClear.clear(p0.lowerBound + ((long) i));
                }
            }
        }
        if (p0.upperSet != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((p0.upperSet & (1 << i2)) != 0) {
                    snapshotIdSetClear = snapshotIdSetClear.clear(p0.lowerBound + ((long) i2) + 64);
                }
            }
        }
        return snapshotIdSetClear;
    }

    public final SnapshotIdSet and(SnapshotIdSet p0) {
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (Intrinsics.areEqual(p0, snapshotIdSet) || Intrinsics.areEqual(this, snapshotIdSet)) {
            return snapshotIdSet;
        }
        long j = p0.lowerBound;
        long j2 = this.lowerBound;
        if (j == j2) {
            long[] jArr = p0.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                long j3 = this.upperSet;
                long j4 = p0.upperSet;
                long j5 = this.lowerSet;
                long j6 = p0.lowerSet;
                long j7 = j3 & j4;
                return (j7 == 0 && (j5 & j6) == 0 && jArr2 == null) ? snapshotIdSet : new SnapshotIdSet(j7, j5 & j6, j2, jArr2);
            }
        }
        SnapshotIdSet snapshotIdSet2 = snapshotIdSet;
        int i = 0;
        if (this.belowBound == null) {
            long[] jArr3 = this.belowBound;
            if (jArr3 != null) {
                for (long j8 : jArr3) {
                    if (p0.get(j8)) {
                        snapshotIdSet2 = snapshotIdSet2.set(j8);
                    }
                }
            }
            SnapshotIdSet snapshotIdSet3 = snapshotIdSet2;
            if (this.lowerSet != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if ((this.lowerSet & (1 << i2)) != 0) {
                        long j9 = this.lowerBound + ((long) i2);
                        if (p0.get(j9)) {
                            snapshotIdSet3 = snapshotIdSet3.set(j9);
                        }
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i < 64) {
                    if ((this.upperSet & (1 << i)) != 0) {
                        long j10 = this.lowerBound + ((long) i) + 64;
                        if (p0.get(j10)) {
                            snapshotIdSet3 = snapshotIdSet3.set(j10);
                        }
                    }
                    i++;
                }
            }
            return snapshotIdSet3;
        }
        long[] jArr4 = p0.belowBound;
        if (jArr4 != null) {
            for (long j11 : jArr4) {
                if (get(j11)) {
                    snapshotIdSet2 = snapshotIdSet2.set(j11);
                }
            }
        }
        SnapshotIdSet snapshotIdSet4 = snapshotIdSet2;
        if (p0.lowerSet != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((p0.lowerSet & (1 << i3)) != 0) {
                    long j12 = p0.lowerBound + ((long) i3);
                    if (get(j12)) {
                        snapshotIdSet4 = snapshotIdSet4.set(j12);
                    }
                }
            }
        }
        if (p0.upperSet != 0) {
            while (i < 64) {
                if ((p0.upperSet & (1 << i)) != 0) {
                    long j13 = p0.lowerBound + ((long) i) + 64;
                    if (get(j13)) {
                        snapshotIdSet4 = snapshotIdSet4.set(j13);
                    }
                }
                i++;
            }
        }
        return snapshotIdSet4;
    }

    public final SnapshotIdSet or(SnapshotIdSet p0) {
        SnapshotIdSet snapshotIdSet;
        SnapshotIdSet snapshotIdSet2 = p0;
        SnapshotIdSet snapshotIdSet3 = EMPTY;
        if (snapshotIdSet2 == snapshotIdSet3) {
            return this;
        }
        if (this == snapshotIdSet3) {
            return snapshotIdSet2;
        }
        long j = snapshotIdSet2.lowerBound;
        long j2 = this.lowerBound;
        if (j == j2) {
            long[] jArr = snapshotIdSet2.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new SnapshotIdSet(this.upperSet | snapshotIdSet2.upperSet, snapshotIdSet2.lowerSet | this.lowerSet, j2, jArr2);
            }
        }
        int i = 0;
        if (this.belowBound == null) {
            long[] jArr3 = this.belowBound;
            if (jArr3 != null) {
                for (long j3 : jArr3) {
                    snapshotIdSet2 = snapshotIdSet2.set(j3);
                }
            }
            if (this.lowerSet != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if ((this.lowerSet & (1 << i2)) != 0) {
                        snapshotIdSet2 = snapshotIdSet2.set(this.lowerBound + ((long) i2));
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i < 64) {
                    if ((this.upperSet & (1 << i)) != 0) {
                        snapshotIdSet2 = snapshotIdSet2.set(this.lowerBound + ((long) i) + 64);
                    }
                    i++;
                }
            }
            return snapshotIdSet2;
        }
        long[] jArr4 = p0.belowBound;
        if (jArr4 != null) {
            snapshotIdSet = this;
            for (long j4 : jArr4) {
                snapshotIdSet = snapshotIdSet.set(j4);
            }
        } else {
            snapshotIdSet = this;
        }
        if (p0.lowerSet != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((p0.lowerSet & (1 << i3)) != 0) {
                    snapshotIdSet = snapshotIdSet.set(p0.lowerBound + ((long) i3));
                }
            }
        }
        if (p0.upperSet != 0) {
            while (i < 64) {
                if ((p0.upperSet & (1 << i)) != 0) {
                    snapshotIdSet = snapshotIdSet.set(p0.lowerBound + ((long) i) + 64);
                }
                i++;
            }
        }
        return snapshotIdSet;
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", i = {0, 0, 1, 1, 2, 2}, l = {252, 256, 263}, m = "invokeSuspend", n = {"$this$sequence", "$this$forEach$iv", "$this$sequence", FirebaseAnalytics.Param.INDEX, "$this$sequence", FirebaseAnalytics.Param.INDEX}, s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Long>, Continuation<? super Unit>, Object> {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:39:0x00f4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0073 -> B:18:0x0075). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0092 -> B:28:0x00b1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00af -> B:28:0x00b1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d1 -> B:41:0x00f6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f4 -> B:40:0x00f5). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = SnapshotIdSet.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super Long> sequenceScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return SequencesKt.sequence(new AnonymousClass1(null)).iterator();
    }

    public final void fastForEach(Function1<? super Long, Unit> p0) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            for (long j : jArr) {
                p0.invoke(Long.valueOf(j));
            }
        }
        if (this.lowerSet != 0) {
            for (int i = 0; i < 64; i++) {
                if ((this.lowerSet & (1 << i)) != 0) {
                    p0.invoke(Long.valueOf(this.lowerBound + ((long) i)));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((this.upperSet & (1 << i2)) != 0) {
                    p0.invoke(Long.valueOf(this.lowerBound + ((long) i2) + 64));
                }
            }
        }
    }

    public final long lowest(long p0) {
        long[] jArr = this.belowBound;
        if (jArr == null) {
            long j = this.lowerSet;
            if (j != 0) {
                return this.lowerBound + ((long) Long.numberOfTrailingZeros(j));
            }
            long j2 = this.upperSet;
            return j2 != 0 ? this.lowerBound + 64 + ((long) Long.numberOfTrailingZeros(j2)) : p0;
        }
        return jArr[0];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        SnapshotIdSet snapshotIdSet = this;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(snapshotIdSet, 10));
        Iterator<Long> it = snapshotIdSet.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        sb.append(ListUtilsKt.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(']');
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getEMPTY", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final SnapshotIdSet fastFold(SnapshotIdSet p0, Function2<? super SnapshotIdSet, ? super Long, SnapshotIdSet> p1) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            for (long j : jArr) {
                p0 = p1.invoke(p0, Long.valueOf(j));
            }
        }
        if (this.lowerSet != 0) {
            for (int i = 0; i < 64; i++) {
                if ((this.lowerSet & (1 << i)) != 0) {
                    p0 = p1.invoke(p0, Long.valueOf(this.lowerBound + ((long) i)));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((this.upperSet & (1 << i2)) != 0) {
                    p0 = p1.invoke(p0, Long.valueOf(this.lowerBound + ((long) i2) + 64));
                }
            }
        }
        return p0;
    }
}
