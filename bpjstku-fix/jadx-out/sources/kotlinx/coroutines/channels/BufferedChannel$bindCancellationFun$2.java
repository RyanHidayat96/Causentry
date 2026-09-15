package kotlinx.coroutines.channels;

import com.bpjstku.data.scholarship.model.request.ScholarshipPhotoPersonForInsert;
import defpackage.EncodeExceptionErrorType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final /* synthetic */ class BufferedChannel$bindCancellationFun$2<E> extends FunctionReferenceImpl implements Function3<Throwable, E, CoroutineContext, Unit> {
    public final void b(Throwable th, E e2, CoroutineContext coroutineContext) {
        Object[] objArr = {(EncodeExceptionErrorType) this.receiver, th, e2, coroutineContext};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        EncodeExceptionErrorType.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, -1163089776, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1163089776, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ Unit invoke(Throwable th, Object obj, CoroutineContext coroutineContext) {
        b(th, obj, coroutineContext);
        return Unit.INSTANCE;
    }

    public BufferedChannel$bindCancellationFun$2(Object obj) {
        super(3, obj, EncodeExceptionErrorType.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }
}
