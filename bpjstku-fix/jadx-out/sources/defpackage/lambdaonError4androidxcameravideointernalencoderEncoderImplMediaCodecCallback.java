package defpackage;

import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdaonError4androidxcameravideointernalencoderEncoderImplMediaCodecCallback {
    public static final setInputTimebase TuitionPaymentFragmentbindingInflater1(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            return new onInputBufferAvailable(th, mainDispatcherFactory.hintOnError());
        }
    }
}
