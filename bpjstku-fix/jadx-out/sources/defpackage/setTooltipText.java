package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setTooltipText implements Function2 {
    private /* synthetic */ getRatioByPercentage TuitionPaymentFragmentbindingInflater1;
    private /* synthetic */ Function0 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private /* synthetic */ Function0 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private /* synthetic */ int f1397a;
    private /* synthetic */ int asInterface;
    private /* synthetic */ lambdaenableTorch1androidxcameracamera2internalTorchControl b;

    public /* synthetic */ setTooltipText(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, getRatioByPercentage getratiobypercentage, Function0 function0, Function0 function1, int i, int i2) {
        this.b = lambdaenabletorch1androidxcameracamera2internaltorchcontrol;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = activityResultContractsPickVisualMediaMediaCapabilities;
        this.TuitionPaymentFragmentbindingInflater1 = getratiobypercentage;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        this.asInterface = i;
        this.f1397a = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol = this.b;
        ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        getRatioByPercentage getratiobypercentage = this.TuitionPaymentFragmentbindingInflater1;
        Function0 function0 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Function0 function1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i = this.asInterface;
        setCheckable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaenabletorch1androidxcameracamera2internaltorchcontrol, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, function0, function1, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), this.f1397a);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        flipVertically.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0] = createFromInputStream.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0];
    }
}
