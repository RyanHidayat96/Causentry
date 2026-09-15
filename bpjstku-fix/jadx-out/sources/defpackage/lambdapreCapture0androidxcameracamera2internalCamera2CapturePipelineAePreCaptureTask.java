package defpackage;

import androidx.p002lifecycle.MediatorLiveData;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModel;
import java.io.File;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdapreCapture0androidxcameracamera2internalCamera2CapturePipelineAePreCaptureTask extends ViewModel {
    private final acquireBuffer TuitionPaymentFragmentbindingInflater1;
    private final MutableLiveData<File> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private MediatorLiveData<Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final MutableLiveData<File> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MutableLiveData<Integer> f1256a;
    private final MutableLiveData<File> asInterface;
    private final MutableLiveData<File> b;
    private final MutableLiveData<Boolean> g;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentbindingInflater1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentbindingInflater1.invoke(obj);
        }
    }

    public lambdapreCapture0androidxcameracamera2internalCamera2CapturePipelineAePreCaptureTask(acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentbindingInflater1 = acquirebuffer;
        MutableLiveData<File> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData;
        MutableLiveData<File> mutableLiveData2 = new MutableLiveData<>();
        this.b = mutableLiveData2;
        MutableLiveData<File> mutableLiveData3 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableLiveData3;
        MutableLiveData<File> mutableLiveData4 = new MutableLiveData<>();
        this.asInterface = mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>();
        this.g = mutableLiveData5;
        this.f1256a = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new MediatorLiveData<>();
        final Function0 function0 = new Function0() { // from class: lambdapreCapture1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(lambdapreCapture0androidxcameracamera2internalCamera2CapturePipelineAePreCaptureTask.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            }
        };
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addSource(mutableLiveData, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: Camera2CapturePipelineAfTask
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdapreCapture0androidxcameracamera2internalCamera2CapturePipelineAePreCaptureTask.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, function0);
            }
        }));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addSource(mutableLiveData2, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: Camera2CapturePipelineCameraCapturePipelineImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdapreCapture0androidxcameracamera2internalCamera2CapturePipelineAePreCaptureTask.b(this.b, function0);
            }
        }));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addSource(mutableLiveData3, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: lambdainvokePreCapture0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdapreCapture0androidxcameracamera2internalCamera2CapturePipelineAePreCaptureTask.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, function0);
            }
        }));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addSource(mutableLiveData4, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: Camera2CapturePipelineAePreCaptureTaskExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdapreCapture0androidxcameracamera2internalCamera2CapturePipelineAePreCaptureTask.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, function0);
            }
        }));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addSource(mutableLiveData5, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: Camera2CapturePipelineAePreCaptureTaskExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdapreCapture0androidxcameracamera2internalCamera2CapturePipelineAePreCaptureTask.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, function0);
            }
        }));
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.TuitionPaymentFragmentbindingInflater1.isDisposed()) {
            return;
        }
        this.TuitionPaymentFragmentbindingInflater1.dispose();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdapreCapture0androidxcameracamera2internalCamera2CapturePipelineAePreCaptureTask lambdaprecapture0androidxcameracamera2internalcamera2capturepipelineaeprecapturetask, Function0 function0) {
        lambdaprecapture0androidxcameracamera2internalcamera2capturepipelineaeprecapturetask.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue((Boolean) function0.invoke());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdapreCapture0androidxcameracamera2internalCamera2CapturePipelineAePreCaptureTask lambdaprecapture0androidxcameracamera2internalcamera2capturepipelineaeprecapturetask, Function0 function0) {
        lambdaprecapture0androidxcameracamera2internalcamera2capturepipelineaeprecapturetask.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue((Boolean) function0.invoke());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(lambdapreCapture0androidxcameracamera2internalCamera2CapturePipelineAePreCaptureTask lambdaprecapture0androidxcameracamera2internalcamera2capturepipelineaeprecapturetask) {
        return (lambdaprecapture0androidxcameracamera2internalcamera2capturepipelineaeprecapturetask.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue() == null || lambdaprecapture0androidxcameracamera2internalcamera2capturepipelineaeprecapturetask.b.getValue() == null || lambdaprecapture0androidxcameracamera2internalcamera2capturepipelineaeprecapturetask.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue() == null || lambdaprecapture0androidxcameracamera2internalcamera2capturepipelineaeprecapturetask.asInterface.getValue() == null || !Intrinsics.areEqual(lambdaprecapture0androidxcameracamera2internalcamera2capturepipelineaeprecapturetask.g.getValue(), Boolean.TRUE)) ? false : true;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(lambdapreCapture0androidxcameracamera2internalCamera2CapturePipelineAePreCaptureTask lambdaprecapture0androidxcameracamera2internalcamera2capturepipelineaeprecapturetask, Function0 function0) {
        lambdaprecapture0androidxcameracamera2internalcamera2capturepipelineaeprecapturetask.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue((Boolean) function0.invoke());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(lambdapreCapture0androidxcameracamera2internalCamera2CapturePipelineAePreCaptureTask lambdaprecapture0androidxcameracamera2internalcamera2capturepipelineaeprecapturetask, Function0 function0) {
        lambdaprecapture0androidxcameracamera2internalcamera2capturepipelineaeprecapturetask.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue((Boolean) function0.invoke());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdapreCapture0androidxcameracamera2internalCamera2CapturePipelineAePreCaptureTask lambdaprecapture0androidxcameracamera2internalcamera2capturepipelineaeprecapturetask, Function0 function0) {
        lambdaprecapture0androidxcameracamera2internalcamera2capturepipelineaeprecapturetask.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue((Boolean) function0.invoke());
        return Unit.INSTANCE;
    }
}
