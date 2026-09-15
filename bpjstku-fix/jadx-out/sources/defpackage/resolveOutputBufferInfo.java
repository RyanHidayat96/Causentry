package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"LresolveOutputBufferInfo;", "", "<init>", "()V", "LsetInputTimebase;", "TuitionPaymentFragmentbindingInflater1", "()LsetInputTimebase;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "LsetInputTimebase;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class resolveOutputBufferInfo {
    public static final resolveOutputBufferInfo INSTANCE = new resolveOutputBufferInfo();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final setInputTimebase TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    private resolveOutputBufferInfo() {
    }

    static {
        String strTuitionPaymentFragmentbindingInflater1 = EncoderImplMediaCodecCallbackExternalSyntheticLambda10.TuitionPaymentFragmentbindingInflater1("kotlinx.coroutines.fast.service.loader");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = strTuitionPaymentFragmentbindingInflater1 != null ? Boolean.parseBoolean(strTuitionPaymentFragmentbindingInflater1) : true;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentbindingInflater1();
    }

    private static setInputTimebase TuitionPaymentFragmentbindingInflater1() {
        Object next;
        setInputTimebase setinputtimebaseTuitionPaymentFragmentbindingInflater1;
        try {
            List<MainDispatcherFactory> listTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? EncoderImplByteBufferInputExternalSyntheticLambda8.INSTANCE.TuitionPaymentFragmentbindingInflater1() : SequencesKt.toList(SequencesKt.asSequence(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
            Iterator<T> it = listTuitionPaymentFragmentbindingInflater1.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            return (mainDispatcherFactory == null || (setinputtimebaseTuitionPaymentFragmentbindingInflater1 = lambdaonError4androidxcameravideointernalencoderEncoderImplMediaCodecCallback.TuitionPaymentFragmentbindingInflater1(mainDispatcherFactory, listTuitionPaymentFragmentbindingInflater1)) == null) ? new onInputBufferAvailable(null, null) : setinputtimebaseTuitionPaymentFragmentbindingInflater1;
        } catch (Throwable th) {
            return new onInputBufferAvailable(th, null);
        }
    }
}
