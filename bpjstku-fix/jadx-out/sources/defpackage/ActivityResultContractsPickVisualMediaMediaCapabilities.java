package defpackage;

import android.graphics.Bitmap;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.user.model.request.ProfilePictureRequest;
import com.bpjstku.data.user.model.response.KpjItem;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.user.model.User;
import java.io.IOException;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00148\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00150\u00148\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00150\u00148\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00150\u00148\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0#8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010$R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150#8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010$"}, d2 = {"LActivityResultContractsPickVisualMediaMediaCapabilities;", "Landroidx/lifecycle/ViewModel;", "Lregisterlambda1;", "p0", "LacquireBuffer;", "p1", "<init>", "(Lregisterlambda1;LacquireBuffer;)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()V", "", "(Ljava/lang/String;Ljava/lang/String;)V", "onCleared", "d", "Lregisterlambda1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LacquireBuffer;", "b", "Landroidx/lifecycle/MutableLiveData;", "LVirtualCameraAdapter1;", "Landroid/graphics/Bitmap;", "g", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bpjstku/domain/general/model/BaseModel;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/data/user/model/response/KpjItem;", "Lcom/bpjstku/domain/user/model/User;", "asBinder", "asInterface", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "LsetOnImageAvailableListener;", "LActivityResultRegistryExternalSyntheticLambda1;", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "LstopMediaCodec;", "LstopMediaCodec;", "a"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ActivityResultContractsPickVisualMediaMediaCapabilities extends ViewModel {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    final MutableLiveData<VirtualCameraAdapter1<BaseModel>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final stopMediaCodec<setOnImageAvailableListener<ActivityResultRegistryExternalSyntheticLambda1>> d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<KpjItem>> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final acquireBuffer b;
    private final lambdastop3androidxcameravideointernalencoderEncoderImpl<VirtualCameraAdapter1<Bitmap>> a;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    final MutableLiveData<VirtualCameraAdapter1<User>> asInterface;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final stopMediaCodec<VirtualCameraAdapter1<Bitmap>> asBinder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final lambdastop3androidxcameravideointernalencoderEncoderImpl<setOnImageAvailableListener<ActivityResultRegistryExternalSyntheticLambda1>> g;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final registerlambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<Bitmap>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(obj);
        }
    }

    public ActivityResultContractsPickVisualMediaMediaCapabilities(registerlambda1 registerlambda1Var, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = registerlambda1Var;
        this.b = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<Bitmap>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData2 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<KpjItem>> mutableLiveData3 = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = mutableLiveData3;
        MutableLiveData<VirtualCameraAdapter1<User>> mutableLiveData4 = new MutableLiveData<>();
        this.asInterface = mutableLiveData4;
        lambdastop3androidxcameravideointernalencoderEncoderImpl<setOnImageAvailableListener<ActivityResultRegistryExternalSyntheticLambda1>> lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
        this.g = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.d = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        lambdastop3androidxcameravideointernalencoderEncoderImpl<VirtualCameraAdapter1<Bitmap>> lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault3 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        this.a = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.asBinder = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion4 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion5 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData4.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        mutableLiveData.observeForever(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: ActivityResultContractsPickVisualMediaMediaCapabilitiesCompanionHdrType
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.a()));
        final Function1 function1 = new Function1() { // from class: ActivityResultContractsStartIntentSenderForResult
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityResultContractsPickVisualMediaMediaCapabilities.b(this.TuitionPaymentFragmentbindingInflater1, (BaseModel) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: ActivityResultContractsRequestPermission
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ActivityResultContractsStartActivityForResult
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: ActivityResultContractsStartIntentSenderForResultCompanion
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        MutableLiveData<VirtualCameraAdapter1<Bitmap>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ProfilePictureRequest(p1, p0))));
        final Function1 function1 = new Function1() { // from class: ActivityResultContractsRequestMultiplePermissionsCompanion
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityResultContractsPickVisualMediaMediaCapabilities.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Bitmap) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: ActivityResultContractsPickVisualMediaVisualMediaType
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ActivityResultContractsPickVisualMediaImageOnly
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: ActivityResultContractsPickVisualMediaVideoOnly
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.b.isDisposed()) {
            return;
        }
        this.b.dispose();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, activityResultContractsPickVisualMediaMediaCapabilities.asInterface);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, VirtualCameraAdapter1 virtualCameraAdapter1) {
        activityResultContractsPickVisualMediaMediaCapabilities.a.b(virtualCameraAdapter1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) throws IOException {
        getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, Bitmap bitmap) {
        MutableLiveData<VirtualCameraAdapter1<Bitmap>> mutableLiveData = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(bitmap));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(Throwable th) throws IOException {
        getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, User user) {
        MutableLiveData<VirtualCameraAdapter1<User>> mutableLiveData = activityResultContractsPickVisualMediaMediaCapabilities.asInterface;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(user));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, String str) throws IOException {
        if (getContentPaddingRight.TuitionPaymentFragmentbindingInflater1() > 0) {
            getContentPaddingRight.b("Success update FCM", new Object[0]);
        }
        activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(str);
    }

    public static /* synthetic */ Unit b(ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, BaseModel baseModel) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseModel));
        return Unit.INSTANCE;
    }
}
