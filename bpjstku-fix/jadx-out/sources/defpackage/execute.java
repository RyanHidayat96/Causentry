package defpackage;

import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.menu.MenuRepository;
import com.bpjstku.data.menu.model.response.AvailabilityMenuResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class execute implements ComponentActivityReportFullyDrawnExecutorImplExternalSyntheticLambda0 {
    private final MenuRepository TuitionPaymentFragmentbindingInflater1;
    private final PreferenceManager TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public execute(MenuRepository menuRepository, PreferenceManager preferenceManager) {
        Intrinsics.checkNotNullParameter(menuRepository, "");
        Intrinsics.checkNotNullParameter(preferenceManager, "");
        this.TuitionPaymentFragmentbindingInflater1 = menuRepository;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = preferenceManager;
    }

    @Override // defpackage.ComponentActivityReportFullyDrawnExecutorImplExternalSyntheticLambda0
    public final deriveCodec<setCurrentRunnable> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        deriveCodec<AvailabilityMenuResponse> menuAvailability = this.TuitionPaymentFragmentbindingInflater1.getMenuAvailability();
        final Function1 function1 = new Function1() { // from class: executelambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return execute.b((AvailabilityMenuResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getOnDrawScheduled
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return execute.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(menuAvailability, readablems);
        final Function1 function2 = new Function1() { // from class: getEndWatchTimeMillis
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return execute.TuitionPaymentFragmentbindingInflater1(this.b, (setCurrentRunnable) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: onDraw
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        };
        share.b(logtostring, "onSuccess is null");
        currentSystemTimeNs currentsystemtimens = new currentSystemTimeNs(api23Impl, logtostring);
        Intrinsics.checkNotNullExpressionValue(currentsystemtimens, "");
        return currentsystemtimens;
    }

    @Override // defpackage.ComponentActivityReportFullyDrawnExecutorImplExternalSyntheticLambda0
    public final setCurrentRunnable TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return (setCurrentRunnable) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getObject("MENU_AVAILABILITY", setCurrentRunnable.class);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(execute executeVar, setCurrentRunnable setcurrentrunnable) {
        PreferenceManager preferenceManager = executeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Intrinsics.checkNotNull(setcurrentrunnable);
        preferenceManager.saveObject("MENU_AVAILABILITY", setcurrentrunnable);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ setCurrentRunnable b(AvailabilityMenuResponse availabilityMenuResponse) {
        Intrinsics.checkNotNullParameter(availabilityMenuResponse, "");
        Intrinsics.checkNotNullParameter(availabilityMenuResponse, "");
        return new setCurrentRunnable(availabilityMenuResponse.getData());
    }

    public static /* synthetic */ setCurrentRunnable TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (setCurrentRunnable) function1.invoke(obj);
    }
}
