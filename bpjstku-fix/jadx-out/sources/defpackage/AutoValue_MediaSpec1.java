package defpackage;

import android.view.View;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoValue_MediaSpec1 {
    public static final BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault2(View view, final Function0<Unit> function0) {
        BufferProviderState bufferProviderStateSubscribe = new ImageUtil(view).throttleFirst(1L, TimeUnit.SECONDS).observeOn(dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1()).subscribe(new logToString<Unit>() { // from class: AutoValue_MediaSpec1.5
            @Override // defpackage.logToString
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
            public final void accept(Unit unit) {
                function0.invoke();
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(bufferProviderStateSubscribe, "");
        return bufferProviderStateSubscribe;
    }
}
