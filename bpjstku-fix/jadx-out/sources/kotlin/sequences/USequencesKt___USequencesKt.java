package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00040\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00070\u0000H\u0007¢\u0006\u0004\b\b\u0010\u0003\u001a\u0019\u0010\n\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0\u0000H\u0007¢\u0006\u0004\b\n\u0010\u0003"}, d2 = {"Lkotlin/sequences/Sequence;", "Lkotlin/UInt;", "sumOfUInt", "(Lkotlin/sequences/Sequence;)I", "Lkotlin/ULong;", "sumOfULong", "(Lkotlin/sequences/Sequence;)J", "Lkotlin/UByte;", "sumOfUByte", "Lkotlin/UShort;", "sumOfUShort"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/sequences/USequencesKt")
class USequencesKt___USequencesKt {
    public static final int sumOfUInt(Sequence<UInt> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Iterator<UInt> it = sequence.iterator();
        int iM8124constructorimpl = 0;
        while (it.hasNext()) {
            iM8124constructorimpl = UInt.m8124constructorimpl(iM8124constructorimpl + it.next().getData());
        }
        return iM8124constructorimpl;
    }

    public static final long sumOfULong(Sequence<ULong> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Iterator<ULong> it = sequence.iterator();
        long jM8203constructorimpl = 0;
        while (it.hasNext()) {
            jM8203constructorimpl = ULong.m8203constructorimpl(jM8203constructorimpl + it.next().getData());
        }
        return jM8203constructorimpl;
    }

    public static final int sumOfUByte(Sequence<UByte> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Iterator<UByte> it = sequence.iterator();
        int iM8124constructorimpl = 0;
        while (it.hasNext()) {
            iM8124constructorimpl = UInt.m8124constructorimpl(iM8124constructorimpl + UInt.m8124constructorimpl(it.next().getData() & UByte.MAX_VALUE));
        }
        return iM8124constructorimpl;
    }

    public static final int sumOfUShort(Sequence<UShort> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Iterator<UShort> it = sequence.iterator();
        int iM8124constructorimpl = 0;
        while (it.hasNext()) {
            iM8124constructorimpl = UInt.m8124constructorimpl(iM8124constructorimpl + UInt.m8124constructorimpl(it.next().getData() & UShort.MAX_VALUE));
        }
        return iM8124constructorimpl;
    }
}
