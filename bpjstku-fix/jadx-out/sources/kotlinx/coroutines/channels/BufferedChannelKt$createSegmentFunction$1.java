package kotlinx.coroutines.channels;

import defpackage.EncodedData;
import defpackage.requestKeyFrame;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final /* synthetic */ class BufferedChannelKt$createSegmentFunction$1<E> extends FunctionReferenceImpl implements Function2<Long, requestKeyFrame<E>, requestKeyFrame<E>> {
    public static final BufferedChannelKt$createSegmentFunction$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new BufferedChannelKt$createSegmentFunction$1();

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(Long l, Object obj) {
        return EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1(l.longValue(), (requestKeyFrame) obj);
    }

    BufferedChannelKt$createSegmentFunction$1() {
        super(2, EncodedData.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }
}
