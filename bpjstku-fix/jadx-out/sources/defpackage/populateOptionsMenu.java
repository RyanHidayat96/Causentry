package defpackage;

import androidx.p002lifecycle.ViewModel;
import androidx.p002lifecycle.ViewModelKt;
import com.bpjstku.presentation.biometric.LivenessFlowViewModel$startLiveness$1$1;
import com.bpjstku.presentation.biometric.LivenessFlowViewModel$startLiveness$2$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012"}, d2 = {"LpopulateOptionsMenu;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", "onCleared", "LToolbarActionBarToolbarMenuCallback;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LToolbarActionBarToolbarMenuCallback;", "TuitionPaymentFragmentbindingInflater1", "LacquireBuffer;", "b", "LacquireBuffer;", "LEncoder;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LEncoder;", "LclampVideoBitrateIfNotSupported;", "LclampVideoBitrateIfNotSupported;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class populateOptionsMenu extends ViewModel {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final clampVideoBitrateIfNotSupported<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public ToolbarActionBarToolbarMenuCallback TuitionPaymentFragmentbindingInflater1;
    private final Encoder<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final acquireBuffer b = new acquireBuffer();

    public populateOptionsMenu() {
        Encoder<Object> encoderTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2, null, 6);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = encoderTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdanotifyError11.TuitionPaymentFragmentspecialinlinedviewModeldefault1(encoderTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.b.isDisposed()) {
            return;
        }
        this.b.dispose();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(populateOptionsMenu populateoptionsmenu, Throwable th) {
        b.TuitionPaymentFragmentbindingInflater1(ViewModelKt.getViewModelScope(populateoptionsmenu), null, null, new LivenessFlowViewModel$startLiveness$2$1(populateoptionsmenu, th, null), 3, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(populateOptionsMenu populateoptionsmenu, TwilightManager twilightManager) {
        b.TuitionPaymentFragmentbindingInflater1(ViewModelKt.getViewModelScope(populateoptionsmenu), null, null, new LivenessFlowViewModel$startLiveness$1$1(populateoptionsmenu, twilightManager, null), 3, null);
        return Unit.INSTANCE;
    }
}
