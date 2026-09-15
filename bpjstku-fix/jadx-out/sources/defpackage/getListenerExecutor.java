package defpackage;

import android.content.Context;
import defpackage.getRecorder;
import defpackage.getSortedQualities;
import id.zelory.compressor.Compressor$compress$3;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LgetListenerExecutor;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0})
public final class getListenerExecutor {
    public static final getListenerExecutor INSTANCE = new getListenerExecutor();

    private getListenerExecutor() {
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, File file, CoroutineContext coroutineContext, Function1 function1, Continuation continuation, int i) {
        if ((i & 4) != 0) {
            coroutineContext = Dispatchers.getIO();
        }
        if ((i & 8) != 0) {
            function1 = new Function1<getRecorder, Unit>() { // from class: id.zelory.compressor.Compressor$compress$2
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Unit invoke(getRecorder getrecorder) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3(getrecorder);
                    return Unit.INSTANCE;
                }

                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(getRecorder getrecorder) {
                    getSortedQualities.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getrecorder, 0, 0, null, 0, 15);
                }
            };
        }
        return BuildersKt.TuitionPaymentFragmentbindingInflater1(coroutineContext, new Compressor$compress$3(function1, context, file, null), continuation);
    }
}
