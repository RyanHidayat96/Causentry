package kotlinx.coroutines.sync;

import defpackage.VideoEncoderInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final /* synthetic */ class MutexImpl$onLock$2 extends FunctionReferenceImpl implements Function3<VideoEncoderInfo, Object, Object, Object> {
    public static final MutexImpl$onLock$2 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new MutexImpl$onLock$2();

    @Override // kotlin.jvm.functions.Function3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(VideoEncoderInfo videoEncoderInfo, Object obj, Object obj2) {
        return videoEncoderInfo.b(obj, obj2);
    }

    MutexImpl$onLock$2() {
        super(3, VideoEncoderInfo.class, "onLockProcessResult", "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }
}
