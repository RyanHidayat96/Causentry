package defpackage;

import android.app.Activity;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ToolbarActionBarActionMenuPresenterCallback extends ViewModel {
    private final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new acquireBuffer();
    public final MutableLiveData<TwilightManager> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new MutableLiveData<>();
    private ToolbarActionBarToolbarMenuCallback b;

    public final void TuitionPaymentFragmentbindingInflater1(Activity activity) {
        VideoRecordEventStart<TwilightManager> videoRecordEventStartTuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNullParameter(activity, "");
        if (this.b == null) {
            this.b = new ToolbarActionBarToolbarMenuCallback();
        }
        ToolbarActionBarToolbarMenuCallback toolbarActionBarToolbarMenuCallback = this.b;
        if (toolbarActionBarToolbarMenuCallback == null || (videoRecordEventStartTuitionPaymentFragmentbindingInflater1 = toolbarActionBarToolbarMenuCallback.TuitionPaymentFragmentbindingInflater1(activity)) == null) {
            return;
        }
        final Function1 function1 = new Function1() { // from class: calculateTwilight
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToolbarActionBarActionMenuPresenterCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (TwilightManager) obj);
            }
        };
        logToString<? super TwilightManager> logtostring = new logToString() { // from class: TwilightCalculator
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getLastKnownLocation
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToolbarActionBarActionMenuPresenterCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartTuitionPaymentFragmentbindingInflater1.subscribe(logtostring, new logToString() { // from class: getInstance
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        if (bufferProviderStateSubscribe != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
        }
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) throws IOException {
        th.printStackTrace();
        getContentPaddingRight.TuitionPaymentFragmentbindingInflater1(th);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ToolbarActionBarActionMenuPresenterCallback toolbarActionBarActionMenuPresenterCallback, TwilightManager twilightManager) {
        toolbarActionBarActionMenuPresenterCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3.postValue(twilightManager);
        return Unit.INSTANCE;
    }
}
