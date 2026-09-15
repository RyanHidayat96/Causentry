package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.registration.general.model.response.VerificationSignatureItem;
import com.bpjstku.data.setting.model.request.AddKpjRequest;
import com.bpjstku.data.setting.model.request.ChangeDataFirstVerificationRequest;
import com.bpjstku.data.setting.model.request.ChangeEmailVerificationRequest;
import com.bpjstku.data.setting.model.request.ChangeHandphoneVerificationRequest;
import com.bpjstku.data.setting.model.request.ChangePhoneNumberRequest;
import com.bpjstku.data.setting.model.request.KeyRequest;
import com.bpjstku.data.setting.model.request.PhoneVerificationRequest;
import com.bpjstku.data.setting.model.response.ClientToApiResponse;
import com.bpjstku.data.setting.model.response.KeyResponse;
import com.bpjstku.data.user.model.request.LogoutRequest;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.domain.user.model.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0012J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\f\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0018¢\u0006\u0004\b\u000f\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u001d¢\u0006\u0004\b\u001b\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 J\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010 J\u0015\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020!¢\u0006\u0004\b\u001f\u0010\"J\u000f\u0010#\u001a\u00020\u000bH\u0014¢\u0006\u0004\b#\u0010 R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0*8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0*8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010.R \u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000+0*8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010.R \u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000+0*8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010.R \u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000+0*8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010.R \u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050+0*8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010.R \u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050+0*8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010.R \u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110+0*8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010.R \u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000+0*8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010.R \u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000+0*8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010.R \u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050+0*8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010.R \u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0+0*8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010.R \u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050+0*8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u0010.R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0+0*8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010.R \u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0*8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010.R \u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050+0*8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010.R \u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0+0*8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010.R \u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050+0*8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010.R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0+0*8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010.R \u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0*8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010.R \u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0+0*8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010.R \u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0+0*8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010.R \u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0+0E8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010GR \u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0+0I8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010J"}, d2 = {"LIntegerRes;", "Landroidx/lifecycle/ViewModel;", "LReportDrawnAfterlambda0;", "p0", "LacquireBuffer;", "p1", "Lregisterlambda1;", "p2", "<init>", "(LReportDrawnAfterlambda0;LacquireBuffer;Lregisterlambda1;)V", "Lcom/bpjstku/data/user/model/request/LogoutRequest;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/bpjstku/data/user/model/request/LogoutRequest;)V", "Lcom/bpjstku/data/setting/model/request/ChangePhoneNumberRequest;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/bpjstku/data/setting/model/request/ChangePhoneNumberRequest;)V", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "p3", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/bpjstku/data/setting/model/request/PhoneVerificationRequest;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/bpjstku/data/setting/model/request/PhoneVerificationRequest;)V", "Lcom/bpjstku/data/setting/model/request/ChangeDataFirstVerificationRequest;", "(Lcom/bpjstku/data/setting/model/request/ChangeDataFirstVerificationRequest;)V", "Lcom/bpjstku/data/setting/model/request/ChangeEmailVerificationRequest;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/bpjstku/data/setting/model/request/ChangeEmailVerificationRequest;)V", "Lcom/bpjstku/data/setting/model/request/ChangeHandphoneVerificationRequest;", "(Lcom/bpjstku/data/setting/model/request/ChangeHandphoneVerificationRequest;)V", "b", "()V", "Lcom/bpjstku/data/setting/model/request/KeyRequest;", "(Lcom/bpjstku/data/setting/model/request/KeyRequest;)V", "onCleared", "write", "LReportDrawnAfterlambda0;", "INotificationSideChannelStub", "LacquireBuffer;", "getNotifyChildrenChangedOptions", "Lregisterlambda1;", "Landroidx/lifecycle/MutableLiveData;", "LVirtualCameraAdapter1;", "Lcom/bpjstku/data/lib/model/BaseItem;", "read", "Landroidx/lifecycle/MutableLiveData;", "MediaBrowserCompat", "Lcom/bpjstku/domain/general/model/BaseModel;", "INotificationSideChannelDefault", "asInterface", "a", "g", "Lcom/bpjstku/domain/registration/general/model/Verification;", "getInterfaceDescriptor", "d", "IconCompatParcelizer", "asBinder", "notify", "cancel", "cancelAll", "onTransact", "Lcom/bpjstku/data/registration/general/model/response/VerificationSignatureItem;", "INotificationSideChannel", "INotificationSideChannelStubProxy", "RemoteActionCompatParcelizer", "connect", "Lcom/bpjstku/data/setting/model/response/KeyResponse;", "Lcom/bpjstku/data/setting/model/response/ClientToApiResponse;", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "getItem", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "getExtras", "LstopMediaCodec;", "LstopMediaCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IntegerRes extends ViewModel {

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<BaseItem>> INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> asInterface;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    public final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<ClientToApiResponse>> read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<Verification>> asBinder;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<BaseItem>> b;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<KeyResponse>> MediaBrowserCompat;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<VerificationSignatureItem>> INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<VerificationSignatureItem>> getInterfaceDescriptor;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<Verification>> onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> a;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<VerificationSignatureItem>> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<Verification>> INotificationSideChannelStub;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<VerificationSignatureItem>> write;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> g;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> cancelAll;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<Verification>> connect;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    public final stopMediaCodec<VirtualCameraAdapter1<KeyResponse>> getNotifyChildrenChangedOptions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<Verification>> INotificationSideChannelDefault;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<BaseItem>> IconCompatParcelizer;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<Verification>> d;

    /* JADX INFO: renamed from: getItem, reason: from kotlin metadata */
    private final lambdastop3androidxcameravideointernalencoderEncoderImpl<VirtualCameraAdapter1<KeyResponse>> getExtras;

    /* JADX INFO: renamed from: getNotifyChildrenChangedOptions, reason: from kotlin metadata */
    public final registerlambda1 TuitionPaymentFragmentbindingInflater1;
    public final MutableLiveData<VirtualCameraAdapter1<String>> notify;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> cancel;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<BaseItem>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public final ReportDrawnAfterlambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    static final /* synthetic */ class b implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 b;

        b(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.b = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.b.invoke(obj);
        }
    }

    public IntegerRes(ReportDrawnAfterlambda0 reportDrawnAfterlambda0, acquireBuffer acquirebuffer, registerlambda1 registerlambda1Var) {
        Intrinsics.checkNotNullParameter(reportDrawnAfterlambda0, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = reportDrawnAfterlambda0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = acquirebuffer;
        this.TuitionPaymentFragmentbindingInflater1 = registerlambda1Var;
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData2 = new MutableLiveData<>();
        this.b = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData3 = new MutableLiveData<>();
        this.asInterface = mutableLiveData3;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData4 = new MutableLiveData<>();
        this.a = mutableLiveData4;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData5 = new MutableLiveData<>();
        this.g = mutableLiveData5;
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData6 = new MutableLiveData<>();
        this.d = mutableLiveData6;
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData7 = new MutableLiveData<>();
        this.asBinder = mutableLiveData7;
        MutableLiveData<VirtualCameraAdapter1<String>> mutableLiveData8 = new MutableLiveData<>();
        this.notify = mutableLiveData8;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData9 = new MutableLiveData<>();
        this.cancelAll = mutableLiveData9;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData10 = new MutableLiveData<>();
        this.cancel = mutableLiveData10;
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData11 = new MutableLiveData<>();
        this.onTransact = mutableLiveData11;
        MutableLiveData<VirtualCameraAdapter1<VerificationSignatureItem>> mutableLiveData12 = new MutableLiveData<>();
        this.INotificationSideChannel = mutableLiveData12;
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData13 = new MutableLiveData<>();
        this.INotificationSideChannelDefault = mutableLiveData13;
        MutableLiveData<VirtualCameraAdapter1<VerificationSignatureItem>> mutableLiveData14 = new MutableLiveData<>();
        this.getInterfaceDescriptor = mutableLiveData14;
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData15 = new MutableLiveData<>();
        this.INotificationSideChannelStubProxy = mutableLiveData15;
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData16 = new MutableLiveData<>();
        this.INotificationSideChannelStub = mutableLiveData16;
        MutableLiveData<VirtualCameraAdapter1<VerificationSignatureItem>> mutableLiveData17 = new MutableLiveData<>();
        this.RemoteActionCompatParcelizer = mutableLiveData17;
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData18 = new MutableLiveData<>();
        this.connect = mutableLiveData18;
        MutableLiveData<VirtualCameraAdapter1<VerificationSignatureItem>> mutableLiveData19 = new MutableLiveData<>();
        this.write = mutableLiveData19;
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData20 = new MutableLiveData<>();
        this.IconCompatParcelizer = mutableLiveData20;
        MutableLiveData<VirtualCameraAdapter1<KeyResponse>> mutableLiveData21 = new MutableLiveData<>();
        this.MediaBrowserCompat = mutableLiveData21;
        MutableLiveData<VirtualCameraAdapter1<ClientToApiResponse>> mutableLiveData22 = new MutableLiveData<>();
        this.read = mutableLiveData22;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        lambdastop3androidxcameravideointernalencoderEncoderImpl<VirtualCameraAdapter1<KeyResponse>> lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        this.getExtras = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.getNotifyChildrenChangedOptions = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion4 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        mutableLiveData4.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData5.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData6.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData7.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData8.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData9.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData10.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        VirtualCameraAdapter1.Companion companion5 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData11.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion6 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData12.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion7 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData13.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion8 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData14.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion9 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData15.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion10 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData16.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion11 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData17.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion12 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData18.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion13 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData19.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion14 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData20.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion15 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData21.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion16 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData22.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        mutableLiveData21.observeForever(new b(new Function1() { // from class: RequiresPermissionWrite
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegerRes.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(LogoutRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = this.asInterface;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1.b(p0)));
        final Function1 function1 = new Function1() { // from class: Rdimen
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegerRes.b(this.b, (BaseModel) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: Rattr
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: Rbool
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegerRes.INotificationSideChannelStubProxy(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: Rdrawable
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentbindingInflater1(ChangePhoneNumberRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = this.cancelAll;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(p0)));
        final Function1 function1 = new Function1() { // from class: UiThread
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (BaseModel) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: Rinteger
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: dispatchMenuVisibilityChanged
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegerRes.a(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: hide
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.String] */
    public final void TuitionPaymentFragmentbindingInflater1(final String p0, final String p1, final String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (((CharSequence) objectRef.element).length() == 0) {
            Intrinsics.checkNotNull(FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: addOnMenuVisibilityListener
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    IntegerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(objectRef, this, p0, p1, p2, task);
                }
            }));
        } else {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1((String) objectRef.element, p0, p1, p2);
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0, String p1, String p2, String p3) {
        User userAsBinder = this.TuitionPaymentFragmentbindingInflater1.asBinder();
        String string = Settings.Secure.getString(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getContentResolver(), "android_id");
        Intrinsics.checkExpressionValueIsNotNull(string, "");
        String str = userAsBinder != null ? userAsBinder.asInterface : null;
        String str2 = str == null ? "" : str;
        String str3 = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = userAsBinder != null ? userAsBinder.b : null;
        String str5 = str4 == null ? "" : str4;
        String str6 = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
        String str7 = str6 == null ? "" : str6;
        String str8 = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null;
        AddKpjRequest addKpjRequest = new AddKpjRequest(string, str3, p1, p3, p2, str7, str5, str8 == null ? "" : str8, (Intrinsics.areEqual(p3, "BPU") || Intrinsics.areEqual(p3, "PU")) ? "" : p2, p0, str2);
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = this.g;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(addKpjRequest)));
        final Function1 function1 = new Function1() { // from class: level
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegerRes.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (BaseModel) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: allOf
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: anyOf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegerRes.onTransact(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: RequiresOptInLevel
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(PhoneVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = this.asBinder;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(p0)));
        final Function1 function1 = new Function1() { // from class: Nullable
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Verification) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: NonNull
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: Px
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegerRes.INotificationSideChannelDefault(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: PluralsRes
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentbindingInflater1(ChangeDataFirstVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = this.onTransact;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0)));
        final Function1 function1 = new Function1() { // from class: RequiresPermission
            private static final byte[] $$c = {86, -48, ByteCompanionObject.MIN_VALUE, 88};
            private static final int $$f = 218;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {14, 70, 6, -35, -18, -4, 57, -60, -3, -25, 13, -9, -17, 2, 51, -57, -19, 4, -20, -3, 0, -1, 48, -74, -9, 2, 57, -69, -8, 5, -7, -13, 56, -25, -40, -23, 5, -12, -5, 35, -55, 11, -15, -12, 74, -43, -11, -39, -11, 5, -3, -9, 0, -4, -25, 5, -12, -5, 21, -28, -1, -7, 28, -43, 1, -19, -6, 3, -13, 34, -39, -7, -1, -26, 3, -14, 74, -54, -39, 6, -17, 5, -12, -5, 24, -23, -30, 6, 2, -15, -12, 40, -50, 11, -12, -12, 2, -15, -12, 12, -13, -11, 4, -11, -11, 1, 24, -43, 2, -12, 5, -25, 9, -19, 59, -39, 6, -17, 5, -12, -5, 24, -23, -30, 6, 2, -15, -12, 40, -50, 11, -12, -12, 2, -15, -12, -5, -3, 5, -4, -12, 2, -17, -3, -11, -4, -3, -11, 3, -5, -24, 7, -2, -24, 36, -40, 5, -7, -13, 2, -7, -7, -1, -26, 3, -14, 59};
            private static final int $$e = 131;
            private static final byte[] $$a = {41, 2, 45, -60, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
            private static final int $$b = 55;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 5245932729807498048L;

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = defpackage.RequiresPermission.$$a
                    int r8 = 103 - r8
                    int r6 = r6 * 52
                    int r6 = r6 + 1
                    int r7 = r7 * 52
                    int r7 = 55 - r7
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r6
                    r4 = r2
                    goto L28
                L14:
                    r3 = r2
                L15:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    int r7 = r7 + 1
                    if (r4 != r6) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L26:
                    r3 = r0[r7]
                L28:
                    int r3 = -r3
                    int r8 = r8 + r3
                    int r8 = r8 + (-11)
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.RequiresPermission.a(short, byte, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(byte r6, byte r7, int r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 15
                    int r7 = 99 - r7
                    int r8 = r8 * 111
                    int r8 = 115 - r8
                    byte[] r0 = defpackage.RequiresPermission.$$d
                    int r6 = r6 * 59
                    int r1 = r6 + 53
                    byte[] r1 = new byte[r1]
                    int r6 = r6 + 52
                    r2 = 0
                    if (r0 != 0) goto L19
                    r7 = r6
                    r3 = r8
                    r4 = r2
                    goto L2f
                L19:
                    r3 = r2
                L1a:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    if (r3 != r6) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L27:
                    int r3 = r3 + 1
                    r4 = r0[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L2f:
                    int r8 = -r8
                    int r7 = r7 + r8
                    int r7 = r7 + (-6)
                    int r8 = r3 + 1
                    r3 = r4
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.RequiresPermission.d(byte, byte, int, java.lang.Object[]):void");
            }

            private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                abortCapture abortcapture = new abortCapture();
                char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
                abortcapture.b = 4;
                int i3 = $10 + 53;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                while (abortcapture.b < cArrB.length) {
                    int i5 = $11 + 31;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                    int i7 = abortcapture.b;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64839 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 1355 - ExpandableListView.getPackedPositionChild(0L), View.MeasureSpec.getSize(0) + 38, 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {abortcapture, abortcapture};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 47773), 468 - Color.blue(0), 13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 896083767, false, "n", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArrB, 4, cArrB.length - 4);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cMyPid = (char) (Process.myPid() >> 22);
                    int i2 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                    int i3 = 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte[] bArr = $$a;
                    byte b2 = bArr[7];
                    byte b3 = bArr[5];
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, (byte) (b3 + 4), objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyPid, i2, i3, 252381699, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{63439, 63406, 49204, 16764, 56908, 56420, 59604, 27604, 62264, 50347, 55500, 24816, 65168, 52057, 54558, 25637, 64126, 53217, 52780, 31115, 58818, 53945, 51852, 32105, 57684, 55561}, ViewConfiguration.getJumpTapTimeout() >> 16, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{11675, 11774, 17627, 50577, 36091, 36566, 49513, 17003, 10608, 16458, 35451, 18737, 9422, 20390, 34795, 19903, 8250, 19218, 40074}, Process.getGidForName("") + 1, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char defaultSize = (char) View.getDefaultSize(0, 0);
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 877;
                    int keyRepeatTimeout = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[5];
                    Object[] objArr5 = new Object[1];
                    a(b4, b4, bArr2[10], objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, bitsPerPixel, keyRepeatTimeout, 2009631821, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                    int i5 = i4 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 876;
                        int iResolveSizeAndState = 10 - View.resolveSizeAndState(0, 0, 0);
                        byte b5 = $$a[7];
                        byte b6 = b5;
                        Object[] objArr6 = new Object[1];
                        a(b5, b6, b6, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, packedPositionGroup, iResolveSizeAndState, 256017550, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                    int i6 = ~System.identityHashCode(this);
                    int i7 = (((-139944268) + (((~(i6 | 645502802)) | 131117) * (-160))) + (((~(i6 | 605192573)) | 645502802) * 160)) - 2034278854;
                    int i8 = (i7 << 13) ^ i7;
                    int i9 = i8 ^ (i8 >>> 17);
                    ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{56613, 56644, 32956, 500, 37971, 38523, 63844, 31332, 55762, 33827, 37587, 28992, 54388, 35794, 40799, 30184, 53420, 36729, 33843, 26679, 53043, 37403, 32907, 27855, 52105, 39298, 36197, 25451, 50900, 40230}, Gravity.getAbsoluteGravity(0, 0), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{28527, 28428, 9175, 41604, 6166, 6696, 56805, 24293, 27538, 10068, 7814, 21934, 26159, 10402, 4870, 20782, 25284, 11275, 2166, 19638, 32096, 12652}, ExpandableListView.getPackedPositionType(0L), objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                        if (i10 % 2 == 0) {
                            boolean z = applicationContext instanceof ContextWrapper;
                            throw null;
                        }
                        if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                            if (i11 % 2 != 0) {
                                int i12 = 2 % 3;
                            }
                            applicationContext = null;
                        } else {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                    }
                    Object[] objArr10 = new Object[1];
                    c(new char[]{58552, 58578, 16327, 48768, 57007, 56469, 29632, 61651, 57358, 15186, 55338, 64420, 60911, 13560, 54656, 65307, 59651, 12314, 52958, 58007}, ViewConfiguration.getScrollBarSize() >> 8, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{42459, 42418, 57468, 24894, 62391, 61854, 22152, 54676, 41271, 58601, 62759, 57083, 44195, 60169, 63672, 55874, 43088, 61375, 58311, 51159}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
                    int i14 = i13 % 2;
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), -2034278854};
                        byte[] bArr3 = $$d;
                        byte b7 = bArr3[64];
                        Object[] objArr13 = new Object[1];
                        d(b7, bArr3[20], b7, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b8 = bArr3[20];
                        Object[] objArr14 = new Object[1];
                        d(b8, bArr3[64], b8, objArr14);
                        objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        if (applicationContext != null) {
                            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                            int i16 = i15 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                                int offsetBefore = 876 - TextUtils.getOffsetBefore("", 0);
                                int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 10;
                                byte b9 = $$a[7];
                                byte b10 = b9;
                                Object[] objArr15 = new Object[1];
                                a(b9, b10, b10, objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode, offsetBefore, packedPositionGroup2, 256017550, false, (String) objArr15[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                            try {
                                Object[] objArr16 = new Object[1];
                                c(new char[]{63439, 63406, 49204, 16764, 56908, 56420, 59604, 27604, 62264, 50347, 55500, 24816, 65168, 52057, 54558, 25637, 64126, 53217, 52780, 31115, 58818, 53945, 51852, 32105, 57684, 55561}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, objArr16);
                                Class<?> cls5 = Class.forName((String) objArr16[0]);
                                Object[] objArr17 = new Object[1];
                                c(new char[]{11675, 11774, 17627, 50577, 36091, 36566, 49513, 17003, 10608, 16458, 35451, 18737, 9422, 20390, 34795, 19903, 8250, 19218, 40074}, View.MeasureSpec.getSize(0), objArr17);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
                                    int iRed = Color.red(0) + 876;
                                    int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 11;
                                    byte[] bArr4 = $$a;
                                    byte b11 = bArr4[5];
                                    Object[] objArr18 = new Object[1];
                                    a(b11, b11, bArr4[10], objArr18);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(capsMode2, iRed, bitsPerPixel2, 2009631821, false, (String) objArr18[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                                    int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 876;
                                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 10;
                                    byte[] bArr5 = $$a;
                                    byte b12 = bArr5[7];
                                    byte b13 = bArr5[5];
                                    Object[] objArr19 = new Object[1];
                                    a(b12, b13, (byte) (b13 + 4), objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionChild, iResolveSizeAndState2, tapTimeout, 252381699, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i17 = ((int[]) objArr[2])[0];
                int i18 = ((int[]) objArr[0])[0];
                if (i18 == i17) {
                    int i19 = ((int[]) objArr[1])[0];
                    Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int i20 = ~startElapsedRealtime;
                    int i21 = i19 + 1559757088 + (((~((-658746154) | i20)) | 553812008) * (-108)) + (((~(i20 | 699056382)) | (~((-699056383) | startElapsedRealtime)) | (-803990528)) * 54) + ((startElapsedRealtime | (-803990528)) * 54);
                    int i22 = (i21 << 13) ^ i21;
                    int i23 = i22 ^ (i22 >>> 17);
                    ((int[]) objArr20[1])[0] = i23 ^ (i23 << 5);
                    int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24 % 128;
                    int i25 = i24 % 2;
                } else {
                    Toast.makeText((Context) null, i18 / (((i18 - 1) * i18) % 2), 0).show();
                    int i26 = ((int[]) objArr[1])[0];
                    Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                    int i27 = ~startUptimeMillis;
                    int i28 = i26 + (-219778240) + (((~(652831860 | i27)) | 693142089) * 226) + (((~(i27 | 804908669)) | (~((-693142090) | startUptimeMillis)) | 541065280) * (-113)) + ((~(startUptimeMillis | 652831860)) * 113);
                    int i29 = (i28 << 13) ^ i28;
                    int i30 = i29 ^ (i29 >>> 17);
                    ((int[]) objArr21[1])[0] = i30 ^ (i30 << 5);
                }
                return IntegerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (Verification) obj);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(int r6, byte r7, short r8) {
                /*
                    int r8 = r8 * 2
                    int r8 = 107 - r8
                    byte[] r0 = defpackage.RequiresPermission.$$c
                    int r7 = r7 * 3
                    int r1 = 1 - r7
                    int r6 = r6 * 3
                    int r6 = r6 + 4
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r7 = 0 - r7
                    if (r0 != 0) goto L18
                    r3 = r7
                    r4 = r2
                    goto L2c
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    if (r3 != r7) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L24:
                    int r3 = r3 + 1
                    r4 = r0[r6]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L2c:
                    int r8 = -r8
                    int r6 = r6 + 1
                    int r8 = r8 + r3
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.RequiresPermission.$$g(int, byte, short):java.lang.String");
            }
        };
        logToString logtostring = new logToString() { // from class: RestrictTo
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: RestrictToScope
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegerRes.cancel(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: ReturnThis
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ChangeEmailVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = this.INotificationSideChannelDefault;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(p0)));
        final Function1 function1 = new Function1() { // from class: getCustomView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegerRes.g(this.b, (Verification) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: collapseActionView
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getDisplayOptions
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegerRes.RemoteActionCompatParcelizer(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getElevation
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ChangeDataFirstVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = this.INotificationSideChannelStub;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(p0)));
        final Function1 function1 = new Function1() { // from class: RequiresPermissionRead
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegerRes.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Verification) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: StringDef
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: multiple
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegerRes.MediaBrowserCompat(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: Size
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ChangeHandphoneVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = this.connect;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(p0)));
        final Function1 function1 = new Function1() { // from class: markerClass
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegerRes.TuitionPaymentFragmentbindingInflater1(this.b, (Verification) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: expression
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: imports
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegerRes.cancelAll(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: RequiresApi
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void b() {
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1()));
        final Function1 function1 = new Function1() { // from class: IntRange
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (BaseItem) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: MainThread
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ReplaceWith
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegerRes.INotificationSideChannelStub(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: enforcement
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = this.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3()));
        final RequiresExtension requiresExtension = new RequiresExtension(this);
        logToString logtostring = new logToString() { // from class: RequiresExtensionContainer
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                requiresExtension.invoke(obj);
            }
        };
        final Function1 function1 = new Function1() { // from class: RequiresFeature
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: RequiresOptIn
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void b(KeyRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        MutableLiveData<VirtualCameraAdapter1<KeyResponse>> mutableLiveData = this.MediaBrowserCompat;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0)));
        final Function1 function1 = new Function1() { // from class: conditional
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegerRes.TuitionPaymentFragmentbindingInflater1(this.b, (KeyResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: StyleableRes
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: Experimental
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegerRes.asInterface(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: Rlayout
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isDisposed()) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
    }

    public static /* synthetic */ Unit b(IntegerRes integerRes, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, integerRes.RemoteActionCompatParcelizer);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(IntegerRes integerRes, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, integerRes.notify);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(IntegerRes integerRes, VerificationSignatureItem verificationSignatureItem) {
        MutableLiveData<VirtualCameraAdapter1<VerificationSignatureItem>> mutableLiveData = integerRes.RemoteActionCompatParcelizer;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verificationSignatureItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(IntegerRes integerRes, VerificationSignatureItem verificationSignatureItem) {
        MutableLiveData<VirtualCameraAdapter1<VerificationSignatureItem>> mutableLiveData = integerRes.INotificationSideChannel;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verificationSignatureItem));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.Object] */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Ref.ObjectRef objectRef, IntegerRes integerRes, String str, String str2, String str3, Task task) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(task, "");
        if (!task.isSuccessful() || (charSequence = (CharSequence) task.getResult()) == null || charSequence.length() == 0) {
            return;
        }
        objectRef.element = task.getResult();
        integerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault1((String) objectRef.element, str, str2, str3);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(IntegerRes integerRes, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, integerRes.b);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(IntegerRes integerRes, Verification verification) {
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = integerRes.d;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verification));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(IntegerRes integerRes, Verification verification) {
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = integerRes.connect;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verification));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(IntegerRes integerRes, BaseItem baseItem) {
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = integerRes.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(IntegerRes integerRes, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, integerRes.INotificationSideChannel);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(IntegerRes integerRes, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, integerRes.d);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(IntegerRes integerRes, BaseModel baseModel) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = integerRes.cancelAll;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseModel));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asInterface(IntegerRes integerRes, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, integerRes.MediaBrowserCompat);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asBinder(IntegerRes integerRes, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, integerRes.INotificationSideChannelStubProxy);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(IntegerRes integerRes, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, integerRes.cancelAll);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(IntegerRes integerRes, Verification verification) {
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = integerRes.onTransact;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verification));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(IntegerRes integerRes, BaseModel baseModel) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = integerRes.a;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseModel));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(IntegerRes integerRes, BaseModel baseModel) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = integerRes.cancel;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseModel));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit d(IntegerRes integerRes, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, integerRes.write);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit g(IntegerRes integerRes, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, integerRes.IconCompatParcelizer);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit cancelAll(IntegerRes integerRes, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, integerRes.connect);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit notify(IntegerRes integerRes, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, integerRes.cancel);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit INotificationSideChannel(IntegerRes integerRes, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, integerRes.getInterfaceDescriptor);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(IntegerRes integerRes, VerificationSignatureItem verificationSignatureItem) {
        MutableLiveData<VirtualCameraAdapter1<VerificationSignatureItem>> mutableLiveData = integerRes.getInterfaceDescriptor;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verificationSignatureItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(IntegerRes integerRes, String str) {
        MutableLiveData<VirtualCameraAdapter1<String>> mutableLiveData = integerRes.notify;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(str));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(IntegerRes integerRes, Verification verification) {
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = integerRes.INotificationSideChannelStub;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verification));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(IntegerRes integerRes, VirtualCameraAdapter1 virtualCameraAdapter1) {
        integerRes.getExtras.b(virtualCameraAdapter1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(IntegerRes integerRes, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, integerRes.a);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(IntegerRes integerRes, BaseModel baseModel) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = integerRes.asInterface;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseModel));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit INotificationSideChannelStubProxy(IntegerRes integerRes, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, integerRes.asInterface);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onTransact(IntegerRes integerRes, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, integerRes.g);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(IntegerRes integerRes, Verification verification) {
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = integerRes.asBinder;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verification));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(IntegerRes integerRes, BaseModel baseModel) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = integerRes.g;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseModel));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit INotificationSideChannelDefault(IntegerRes integerRes, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, integerRes.asBinder);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit cancel(IntegerRes integerRes, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, integerRes.onTransact);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit g(IntegerRes integerRes, Verification verification) {
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = integerRes.INotificationSideChannelDefault;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verification));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit RemoteActionCompatParcelizer(IntegerRes integerRes, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, integerRes.INotificationSideChannelDefault);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(IntegerRes integerRes, BaseItem baseItem) {
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = integerRes.INotificationSideChannelStubProxy;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit MediaBrowserCompat(IntegerRes integerRes, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, integerRes.INotificationSideChannelStub);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(IntegerRes integerRes, VerificationSignatureItem verificationSignatureItem) {
        MutableLiveData<VirtualCameraAdapter1<VerificationSignatureItem>> mutableLiveData = integerRes.write;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verificationSignatureItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(IntegerRes integerRes, BaseItem baseItem) {
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = integerRes.IconCompatParcelizer;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(IntegerRes integerRes, BaseItem baseItem) {
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = integerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit INotificationSideChannelStub(IntegerRes integerRes, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, integerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(IntegerRes integerRes, KeyResponse keyResponse) {
        MutableLiveData<VirtualCameraAdapter1<KeyResponse>> mutableLiveData = integerRes.MediaBrowserCompat;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(keyResponse));
        return Unit.INSTANCE;
    }
}
