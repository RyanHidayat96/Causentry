package kotlin;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0006H\u0087\b¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\bH\u0087\b¢\u0006\u0004\b\u0002\u0010\t\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\nH\u0087\b¢\u0006\u0004\b\u0002\u0010\u000b\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\fH\u0087\b¢\u0006\u0004\b\u0002\u0010\r"}, d2 = {"", "Lkotlin/ULong;", "toULong", "(B)J", "", "(S)J", "", "(I)J", "", "(J)J", "", "(F)J", "", "(D)J"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ULongKt {
    private static final long toULong(byte b) {
        return ULong.m8203constructorimpl(b);
    }

    private static final long toULong(short s) {
        return ULong.m8203constructorimpl(s);
    }

    private static final long toULong(int i) {
        return ULong.m8203constructorimpl(i);
    }

    private static final long toULong(long j) {
        return ULong.m8203constructorimpl(j);
    }

    private static final long toULong(float f) {
        return UnsignedKt.doubleToULong(f);
    }

    private static final long toULong(double d) {
        return UnsignedKt.doubleToULong(d);
    }
}
