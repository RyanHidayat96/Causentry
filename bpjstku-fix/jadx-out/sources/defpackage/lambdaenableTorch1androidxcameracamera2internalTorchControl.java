package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.scholarship.model.request.Penerima;
import com.bpjstku.data.scholarship.model.request.ScholarshipEducationListRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipFmBeginRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipFmRequest;
import com.bpjstku.data.scholarship.model.response.ConfirmResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipDocumentResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipEducationListResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipFmResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipVerificationResponse;
import com.bpjstku.domain.scholarship.model.ScholarBenefit;
import com.bpjstku.domain.scholarship.model.ScholarDocument;
import com.bpjstku.domain.scholarship.model.ScholarInsertResult;
import com.bpjstku.domain.scholarship.model.ScholarPerson;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import id.vida.liveness.dto.VidaLivenessResponse;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u0013J%\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00182\u0006\u0010\u0003\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u000e\u0010\u001aJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001b\u0010\u0013R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020%0 8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010#R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020'0 8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010#R,\u0010\u001c\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00180)0 8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010#R \u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00180 8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010#R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0 8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010#R\u001c\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000 8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010#R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\f0 8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\f0 8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010#R\"\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%060 8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010#R&\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u0018060 8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010#R&\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u0018060 8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R \u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000209060 8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010#R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:060 8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010#R \u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;060 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010#R \u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=060 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010#R\"\u0010B\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%060?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\"\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%060C8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010ER&\u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u0018060?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010AR&\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u0018060C8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010ER&\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u0018060?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bH\u0010AR&\u0010I\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u0018060C8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010ER \u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000209060?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bJ\u0010AR \u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000209060C8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010ER \u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:060?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bK\u0010AR \u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:060C8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010ER \u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;060?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bL\u0010AR \u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;060C8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010ER \u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=060?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bM\u0010AR \u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=060C8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010E"}, d2 = {"LlambdaenableTorch1androidxcameracamera2internalTorchControl;", "Landroidx/lifecycle/ViewModel;", "LacquireBuffer;", "p0", "LManagedActivityResultLauncher;", "p1", "<init>", "(LacquireBuffer;LManagedActivityResultLauncher;)V", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipEducationListRequest;", "", "b", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipEducationListRequest;)V", "", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipFmRequest;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;Lcom/bpjstku/data/scholarship/model/request/ScholarshipFmRequest;)V", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipFmBeginRequest;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipFmBeginRequest;)V", "()V", "p2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", "", "Ljava/io/File;", "(Landroid/content/Context;)Ljava/util/List;", "onCleared", "g", "LacquireBuffer;", "INotificationSideChannelStub", "LManagedActivityResultLauncher;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bpjstku/domain/scholarship/model/ScholarPerson;", "onTransact", "Landroidx/lifecycle/MutableLiveData;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/domain/scholarship/model/ScholarPersonDetail;", "INotificationSideChannelDefault", "Lcom/bpjstku/domain/scholarship/model/ScholarInsertResult;", "cancel", "", "Lcom/bpjstku/domain/scholarship/model/ScholarDocument;", "d", "Lcom/bpjstku/data/scholarship/model/request/Penerima;", "notify", "INotificationSideChannel", "asInterface", "Lid/vida/liveness/dto/VidaLivenessResponse;", "read", "asBinder", "a", "RemoteActionCompatParcelizer", "cancelAll", "LVirtualCameraAdapter1;", "Lcom/bpjstku/domain/scholarship/model/ScholarBenefit;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipEducationListResponse;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipVerificationResponse;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipFmResponse;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipDocumentResponse;", "write", "Lcom/bpjstku/data/scholarship/model/response/ConfirmResponse;", "getInterfaceDescriptor", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "IconCompatParcelizer", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "INotificationSideChannelStubProxy", "LstopMediaCodec;", "sendCustomAction", "LstopMediaCodec;", "connect", "getServiceComponent", "getExtras", "MediaBrowserCompat", "getItem", "getNotifyChildrenChangedOptions", "disconnect", "getRoot", "getSessionToken"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lambdaenableTorch1androidxcameracamera2internalTorchControl extends ViewModel {

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public final MutableLiveData<String> asInterface;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    public final MutableLiveData<ScholarPersonDetail> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    public final ManagedActivityResultLauncher b;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    public final stopMediaCodec<VirtualCameraAdapter1<ConfirmResponse>> sendCustomAction;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final lambdastop3androidxcameravideointernalencoderEncoderImpl<VirtualCameraAdapter1<ScholarPersonDetail>> INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    public final stopMediaCodec<VirtualCameraAdapter1<ScholarshipDocumentResponse>> getRoot;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public final MutableLiveData<String> cancelAll;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final MutableLiveData<String> a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final stopMediaCodec<VirtualCameraAdapter1<List<ScholarshipEducationListResponse>>> MediaBrowserCompat;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<ScholarPersonDetail>> notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<List<ScholarBenefit>>> INotificationSideChannel;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<ScholarshipVerificationResponse>> cancel;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final stopMediaCodec<VirtualCameraAdapter1<ScholarshipFmResponse>> getExtras;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<ScholarshipFmResponse>> INotificationSideChannelStub;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<List<ScholarshipEducationListResponse>>> onTransact;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public final MutableLiveData<ScholarInsertResult> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public final stopMediaCodec<VirtualCameraAdapter1<ScholarshipVerificationResponse>> getItem;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    private final lambdastop3androidxcameravideointernalencoderEncoderImpl<VirtualCameraAdapter1<List<ScholarBenefit>>> IconCompatParcelizer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final MutableLiveData<Map<String, List<ScholarDocument>>> g;

    /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
    private final lambdastop3androidxcameravideointernalencoderEncoderImpl<VirtualCameraAdapter1<ScholarshipDocumentResponse>> getNotifyChildrenChangedOptions;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: getExtras, reason: from kotlin metadata */
    private final lambdastop3androidxcameravideointernalencoderEncoderImpl<VirtualCameraAdapter1<List<ScholarshipEducationListResponse>>> read;
    public final MutableLiveData<VirtualCameraAdapter1<ConfirmResponse>> getInterfaceDescriptor;

    /* JADX INFO: renamed from: getItem, reason: from kotlin metadata */
    private final lambdastop3androidxcameravideointernalencoderEncoderImpl<VirtualCameraAdapter1<ScholarshipVerificationResponse>> connect;

    /* JADX INFO: renamed from: getNotifyChildrenChangedOptions, reason: from kotlin metadata */
    private final lambdastop3androidxcameravideointernalencoderEncoderImpl<VirtualCameraAdapter1<ScholarshipFmResponse>> disconnect;

    /* JADX INFO: renamed from: getRoot, reason: from kotlin metadata */
    private final lambdastop3androidxcameravideointernalencoderEncoderImpl<VirtualCameraAdapter1<ConfirmResponse>> getSessionToken;

    /* JADX INFO: renamed from: getServiceComponent, reason: from kotlin metadata */
    private final stopMediaCodec<VirtualCameraAdapter1<List<ScholarBenefit>>> write;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public final MutableLiveData<List<Penerima>> d;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public final MutableLiveData<ScholarPerson> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public final MutableLiveData<VidaLivenessResponse> asBinder;

    /* JADX INFO: renamed from: sendCustomAction, reason: from kotlin metadata */
    private final stopMediaCodec<VirtualCameraAdapter1<ScholarPersonDetail>> INotificationSideChannelDefault;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<ScholarshipDocumentResponse>> RemoteActionCompatParcelizer;
    private static final byte[] $$c = {119, -102, -34, -3};
    private static final int $$f = 96;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {31, -3, -46, 11, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 60, -4, -4, -5, 8, -24, 20, -16, 7, -13, 3, -4, -18, 4, -8, -1, -1, -58, 73, -3, -24, -5, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -68};
    private static final int $$e = 125;
    private static final byte[] $$a = {55, -64, 35, -71, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 58;
    private static int search = 0;
    private static int isConnected = 1;
    private static char[] getSessionToken = {59676, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59757, 59756, 59746, 59750, 59740, 59731, 59746, 59751, 59768, 59773, 59757, 59723, 59739, 59770, 59774, 59877, 59879, 59877, 59900, 59897, 59873, 59882, 59882, 59874, 59879, 59901, 59903, 59898, 59876, 59838, 59826, 59853, 59831, 59811, 59846, 59843, 59830, 59841, 59830, 59843, 59836, 59806, 59785, 59855, 59855, 59838, 59785, 59827, 59830, 59848, 59853, 59827, 59849, 59838, 59827, 59706, 59751, 59768, 59769, 59744, 59746, 59770, 59729, 59731, 59771, 59749, 59745, 59757, 59753, 59745, 59749, 59751, 59749, 59768, 59773, 59749, 59766, 59767, 59785, 59735, 59708, 59771, 59772, 59745, 59774, 59708, 59745, 59764, 59745, 59736, 59830, 59846, 59843, 59840, 59841, 59843, 59846, 59870, 59865, 59865, 59857, 59855, 59827, 59845, 59866};

    static final /* synthetic */ class TuitionPaymentFragmentbindingInflater1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 b;

        TuitionPaymentFragmentbindingInflater1(Function1 function1) {
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

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = i2 | i9;
        int i11 = ~i2;
        int i12 = i9 | (~(i11 | i));
        int i13 = (~(i4 | i7 | i2)) | (~(i8 | i11 | i7));
        int i14 = i + i2 + i3 + ((-619979367) * i6) + (68302741 * i5);
        int i15 = i14 * i14;
        int i16 = (i * 561304900) + 382271488 + (561304900 * i2) + ((-1585293958) * i10) + (792646979 * i12) + ((-792646979) * i13) + ((-231342080) * i3) + (1615200256 * i6) + ((-1821507584) * i5) + (428933120 * i15);
        int i17 = ((i * (-96142684)) - 56799437) + (i2 * (-96142684)) + (i10 * 1642) + (i12 * (-821)) + (i13 * 821) + (i3 * (-96141863)) + (i6 * (-1380774991)) + (i5 * (-1175232947)) + (i15 * (-118947840));
        switch (i16 + (i17 * i17 * (-1369505792))) {
            case 1:
                return TuitionPaymentFragmentbindingInflater1(objArr);
            case 2:
                return b(objArr);
            case 3:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 4:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            case 5:
                return a(objArr);
            case 6:
                return d(objArr);
            default:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 52
            int r7 = 55 - r7
            int r6 = 103 - r6
            int r8 = r8 * 52
            int r0 = 53 - r8
            byte[] r1 = defpackage.lambdaenableTorch1androidxcameracamera2internalTorchControl.$$a
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r7 = r7 + 1
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2e:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdaenableTorch1androidxcameracamera2internalTorchControl.c(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 15
            int r7 = r7 + 84
            int r6 = r6 * 53
            int r6 = 56 - r6
            byte[] r0 = defpackage.lambdaenableTorch1androidxcameracamera2internalTorchControl.$$d
            int r1 = r5 + 53
            byte[] r1 = new byte[r1]
            int r5 = r5 + 52
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r1[r3] = r4
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2a:
            int r7 = r7 + r4
            int r7 = r7 + 3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdaenableTorch1androidxcameracamera2internalTorchControl.f(int, int, short, java.lang.Object[]):void");
    }

    public lambdaenableTorch1androidxcameracamera2internalTorchControl(acquireBuffer acquirebuffer, ManagedActivityResultLauncher managedActivityResultLauncher) {
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        Intrinsics.checkNotNullParameter(managedActivityResultLauncher, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = acquirebuffer;
        this.b = managedActivityResultLauncher;
        this.TuitionPaymentFragmentbindingInflater1 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new MutableLiveData<>();
        this.g = new MutableLiveData<>(MapsKt.emptyMap());
        this.d = new MutableLiveData<>(CollectionsKt.emptyList());
        this.asInterface = new MutableLiveData<>();
        this.asBinder = new MutableLiveData<>();
        this.a = new MutableLiveData<>();
        this.cancelAll = new MutableLiveData<>();
        MutableLiveData<VirtualCameraAdapter1<ScholarPersonDetail>> mutableLiveData = new MutableLiveData<>();
        this.notify = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<List<ScholarBenefit>>> mutableLiveData2 = new MutableLiveData<>();
        this.INotificationSideChannel = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<List<ScholarshipEducationListResponse>>> mutableLiveData3 = new MutableLiveData<>();
        this.onTransact = mutableLiveData3;
        MutableLiveData<VirtualCameraAdapter1<ScholarshipVerificationResponse>> mutableLiveData4 = new MutableLiveData<>();
        this.cancel = mutableLiveData4;
        MutableLiveData<VirtualCameraAdapter1<ScholarshipFmResponse>> mutableLiveData5 = new MutableLiveData<>();
        this.INotificationSideChannelStub = mutableLiveData5;
        MutableLiveData<VirtualCameraAdapter1<ScholarshipDocumentResponse>> mutableLiveData6 = new MutableLiveData<>();
        this.RemoteActionCompatParcelizer = mutableLiveData6;
        MutableLiveData<VirtualCameraAdapter1<ConfirmResponse>> mutableLiveData7 = new MutableLiveData<>();
        this.getInterfaceDescriptor = mutableLiveData7;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        lambdastop3androidxcameravideointernalencoderEncoderImpl<VirtualCameraAdapter1<ScholarPersonDetail>> lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        this.INotificationSideChannelStubProxy = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.INotificationSideChannelDefault = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        lambdastop3androidxcameravideointernalencoderEncoderImpl<VirtualCameraAdapter1<List<ScholarBenefit>>> lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault3 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        this.IconCompatParcelizer = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.write = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
        lambdastop3androidxcameravideointernalencoderEncoderImpl<VirtualCameraAdapter1<List<ScholarshipEducationListResponse>>> lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault4 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        this.read = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        this.MediaBrowserCompat = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        VirtualCameraAdapter1.Companion companion4 = VirtualCameraAdapter1.INSTANCE;
        lambdastop3androidxcameravideointernalencoderEncoderImpl<VirtualCameraAdapter1<ScholarshipVerificationResponse>> lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault5 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        this.connect = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        this.getItem = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        VirtualCameraAdapter1.Companion companion5 = VirtualCameraAdapter1.INSTANCE;
        lambdastop3androidxcameravideointernalencoderEncoderImpl<VirtualCameraAdapter1<ScholarshipFmResponse>> lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault6 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        this.disconnect = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        this.getExtras = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        VirtualCameraAdapter1.Companion companion6 = VirtualCameraAdapter1.INSTANCE;
        lambdastop3androidxcameravideointernalencoderEncoderImpl<VirtualCameraAdapter1<ScholarshipDocumentResponse>> lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault7 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        this.getNotifyChildrenChangedOptions = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        this.getRoot = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        VirtualCameraAdapter1.Companion companion7 = VirtualCameraAdapter1.INSTANCE;
        lambdastop3androidxcameravideointernalencoderEncoderImpl<VirtualCameraAdapter1<ConfirmResponse>> lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault8 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        this.getSessionToken = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        this.sendCustomAction = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        VirtualCameraAdapter1.Companion companion8 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion9 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion10 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion11 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData4.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion12 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData5.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        mutableLiveData2.observeForever(new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: VideoUsageControlExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                return (Unit) lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(-947896810, 947896812, objArr, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
        }));
        mutableLiveData.observeForever(new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: VideoUsageControlExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        mutableLiveData3.observeForever(new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: TorchControlExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdaenableTorch1androidxcameracamera2internalTorchControl.g(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        mutableLiveData4.observeForever(new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: decrementUsagelambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        mutableLiveData5.observeForever(new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: VideoUsageControlKt
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        mutableLiveData6.observeForever(new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: createZoomImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdaenableTorch1androidxcameracamera2internalTorchControl.asBinder(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        mutableLiveData7.observeForever(new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: ZoomControl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdaenableTorch1androidxcameracamera2internalTorchControl.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
    }

    private static void e(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = getSessionToken;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i2] = Integer.valueOf(cArr[i7]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) i2;
                        byte b2 = (byte) (b + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 1271, 18 - (Process.myPid() >> 22), 407021364, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i4) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i8 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.argb(0, 0, 0, 0), Color.alpha(0) + 3225, 13 - (ViewConfiguration.getScrollBarSize() >> 8), 2133916302, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i9 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29944), 1755 - View.getDefaultSize(0, 0), 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 387247676, false, $$g(b5, b6, (byte) (b6 - 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 1705, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 22, -1434471773, false, $$g(b7, (byte) (b7 | 6), b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i10 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i10, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i10);
        }
        if (z) {
            int i11 = $10 + 19;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr6 = new char[i4];
            setvideostabilizationmode.b = 0;
            int i13 = $10 + 5;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            while (setvideostabilizationmode.b < i4) {
                cArr6[setvideostabilizationmode.b] = cArr3[(i4 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i15 = 0;
            loop3: while (true) {
                setvideostabilizationmode.b = i15;
                while (true) {
                    if (setvideostabilizationmode.b >= i4) {
                        break loop3;
                    }
                    int i16 = $11 + 45;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] << iArr[5]);
                        setvideostabilizationmode.b--;
                    }
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i15 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public final void b(ScholarshipEducationListRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        MutableLiveData<VirtualCameraAdapter1<List<ScholarshipEducationListResponse>>> mutableLiveData = this.onTransact;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.b.b(p0)));
        final Function1 function1 = new Function1() { // from class: r8lambdaVqnrtq704RDT2IwKgNqufDXYKI
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: r8lambdavZd_a_42SY2St1GrzXtMFzBmnSc
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                lambdaenableTorch1androidxcameracamera2internalTorchControl.d(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: r8lambdacELyRvvkaOWFPSfqrX6n8V4n_8s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: resetlambda2
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                Object[] objArr = {function2, obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(-452031684, 452031684, objArr, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i2 = search + 103;
        isConnected = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0, ScholarshipFmRequest p1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        MutableLiveData<VirtualCameraAdapter1<ScholarshipVerificationResponse>> mutableLiveData = this.cancel;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.b.b(p0, p1)));
        final Function1 function1 = new Function1() { // from class: VideoUsageControlExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (ScholarshipVerificationResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: incrementUsage
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentbindingInflater1(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getUsage
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdaenableTorch1androidxcameracamera2internalTorchControl.b(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: decrementUsage
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                Object[] objArr = {function2, obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(-918578102, 918578103, objArr, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i2 = search + 83;
        isConnected = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ScholarshipFmBeginRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        MutableLiveData<VirtualCameraAdapter1<ScholarshipFmResponse>> mutableLiveData = this.INotificationSideChannelStub;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0)));
        final Function1 function1 = new Function1() { // from class: lambdaenableTorch2androidxcameracamera2internalTorchControl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (ScholarshipFmResponse) obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                return (Unit) lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(-426772285, 426772289, objArr, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
        };
        logToString logtostring = new logToString() { // from class: TorchControlExternalSyntheticLambda1
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: TorchControlExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: VideoUsageControl
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                Object[] objArr = {function2, obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1439529266, 1439529272, objArr, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i2 = isConnected + 59;
        search = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 88 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x020a  */
    private static /* synthetic */ Object a(Object[] objArr) throws Throwable {
        Object[] objArr2;
        lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol = (lambdaenableTorch1androidxcameracamera2internalTorchControl) objArr[0];
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
            int i2 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 875;
            int i3 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10;
            byte[] bArr = $$a;
            byte b = (byte) (bArr[19] - 1);
            byte b2 = bArr[5];
            Object[] objArr3 = new Object[1];
            c(b, b2, b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, i2, i3, 252381699, false, (String) objArr3[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new int[]{0, 22, 0, 8}, true, new byte[]{0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new int[]{22, 15, 134, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cArgb = (char) Color.argb(0, 0, 0, 0);
            int iMyPid = (Process.myPid() >> 22) + 876;
            int threadPriority = 10 - ((Process.getThreadPriority(0) + 20) >> 6);
            byte[] bArr2 = $$a;
            Object[] objArr6 = new Object[1];
            c(bArr2[10], bArr2[5], bArr2[7], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cArgb, iMyPid, threadPriority, 2009631821, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = search + 39;
            isConnected = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 877;
                int i6 = 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                byte[] bArr3 = $$a;
                byte b3 = bArr3[7];
                Object[] objArr7 = new Object[1];
                c(b3, b3, bArr3[5], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, iIndexOf, i6, 256017550, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int i7 = ~((int) Runtime.getRuntime().totalMemory());
            int i8 = (-682875204) + (((-826605609) | i7) * 494) + (((~(i7 | (-928902185))) | 244903381) * 494) + 283137667;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr2[1])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(new int[]{37, 26, 84, 25}, true, null, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new int[]{63, 18, 0, 0}, false, new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i11 = isConnected;
                int i12 = i11 + 77;
                search = i12 % 128;
                int i13 = i12 % 2;
                if (!(applicationContext instanceof ContextWrapper)) {
                    applicationContext = applicationContext.getApplicationContext();
                } else {
                    int i14 = i11 + 21;
                    search = i14 % 128;
                    if (i14 % 2 != 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        obj.hashCode();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                }
            }
            Object[] objArr11 = new Object[1];
            e(new int[]{81, 16, 9, 1}, true, null, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            e(new int[]{97, 16, 100, 4}, false, new byte[]{1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1}, objArr12);
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, lambdaenabletorch1androidxcameracamera2internaltorchcontrol)).intValue()), 283137667};
                byte[] bArr4 = $$d;
                byte b4 = (byte) (-bArr4[50]);
                byte b5 = b4;
                Object[] objArr14 = new Object[1];
                f(b4, b5, b5, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b6 = (byte) (bArr4[50] + 1);
                byte b7 = b6;
                Object[] objArr15 = new Object[1];
                f(b6, b7, b7, objArr15);
                objArr2 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                if (applicationContext != null) {
                    int i15 = isConnected + 53;
                    search = i15 % 128;
                    int i16 = i15 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int iResolveSize = View.resolveSize(0, 0) + 876;
                        int iResolveSizeAndState = 10 - View.resolveSizeAndState(0, 0, 0);
                        byte[] bArr5 = $$a;
                        byte b8 = bArr5[7];
                        Object[] objArr16 = new Object[1];
                        c(b8, b8, bArr5[5], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(touchSlop, iResolveSize, iResolveSizeAndState, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr2);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(new int[]{0, 22, 0, 8}, true, new byte[]{0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e(new int[]{22, 15, 134, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cMyTid = (char) (Process.myTid() >> 22);
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 876;
                            int i17 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9;
                            byte[] bArr6 = $$a;
                            Object[] objArr19 = new Object[1];
                            c(bArr6[10], bArr6[5], bArr6[7], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyTid, iMakeMeasureSpec, i17, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int iIndexOf2 = 875 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 10;
                            byte[] bArr7 = $$a;
                            byte b9 = (byte) (bArr7[19] - 1);
                            byte b10 = bArr7[5];
                            Object[] objArr20 = new Object[1];
                            c(b9, b10, b10, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iIndexOf2, windowTouchSlop, 252381699, false, (String) objArr20[0], null);
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
        int i18 = ((int[]) objArr2[2])[0];
        int i19 = ((int[]) objArr2[0])[0];
        if (i19 != i18) {
            throw new RuntimeException(String.valueOf(i19));
        }
        int i20 = ((int[]) objArr2[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i21 = ~startUptimeMillis;
        int i22 = i20 + 1534784672 + (((~((-197286417) | i21)) | 156976187) * (-865)) + ((~(startUptimeMillis | 197286416)) * 865) + (((~(156976187 | i21)) | (~(i21 | 197286416))) * 865);
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        ((int[]) objArr21[1])[0] = i24 ^ (i24 << 5);
        MutableLiveData<VirtualCameraAdapter1<ConfirmResponse>> mutableLiveData = lambdaenabletorch1androidxcameracamera2internaltorchcontrol.getInterfaceDescriptor;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        return null;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0, String p1, String p2) {
        ArrayList arrayList;
        Penerima penerima;
        String str = p2;
        int i = 2 % 2;
        int i2 = search + 87;
        isConnected = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            this.d.getValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(str, "");
        List<Penerima> value = this.d.getValue();
        if (value == null) {
            return;
        }
        List<Penerima> list = value;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i3 = isConnected + 59;
        search = i3 % 128;
        int i4 = i3 % 2;
        for (Penerima penerima2 : list) {
            if (Intrinsics.areEqual(penerima2.getNikPenerima(), str)) {
                int i5 = search + 41;
                isConnected = i5 % 128;
                int i6 = i5 % 2;
                Penerima penerimaCopy$default = Penerima.copy$default(penerima2, null, null, null, null, null, null, null, null, null, p0, null, null, null, null, null, null, p1, 65023, null);
                int i7 = search + 89;
                isConnected = i7 % 128;
                int i8 = i7 % 2;
                penerima = penerimaCopy$default;
                arrayList = arrayList2;
            } else {
                arrayList = arrayList2;
                penerima = penerima2;
            }
            arrayList.add(penerima);
            str = p2;
            arrayList2 = arrayList;
        }
        this.d.setValue(arrayList2);
    }

    public final List<File> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        ArrayList arrayList = new ArrayList();
        VidaLivenessResponse value = this.asBinder.getValue();
        if (value != null) {
            byte[] imageBytes = value.getImageBytes();
            if (imageBytes != null) {
                int i2 = isConnected + 27;
                search = i2 % 128;
                int i3 = i2 % 2;
                arrayList.add(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(imageBytes, p0));
                int i4 = search + 1;
                isConnected = i4 % 128;
                int i5 = i4 % 2;
            }
            List<byte[]> additionalImages = value.getAdditionalImages();
            if (additionalImages != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = additionalImages.iterator();
                int i6 = isConnected + 105;
                search = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 3 / 2;
                }
                while (it.hasNext()) {
                    int i8 = search + 89;
                    isConnected = i8 % 128;
                    if (i8 % 2 == 0) {
                        byte[] bArr = (byte[]) it.next();
                        Intrinsics.checkNotNull(bArr);
                        arrayList2.add(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr, p0));
                        int i9 = 49 / 0;
                    } else {
                        byte[] bArr2 = (byte[]) it.next();
                        Intrinsics.checkNotNull(bArr2);
                        arrayList2.add(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr2, p0));
                    }
                }
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    public final void b() {
        int i = 2 % 2;
        int i2 = isConnected + 121;
        search = i2 % 128;
        int i3 = i2 % 2;
        this.g.setValue(MapsKt.emptyMap());
        this.d.setValue(CollectionsKt.emptyList());
        this.asInterface.setValue("");
        this.asBinder.setValue(null);
        int i4 = search + 103;
        isConnected = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        int i = 2 % 2;
        int i2 = search + 119;
        isConnected = i2 % 128;
        int i3 = i2 % 2;
        super.onCleared();
        if (!(!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isDisposed())) {
            return;
        }
        int i4 = isConnected + 3;
        search = i4 % 128;
        int i5 = i4 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
        if (i5 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = search + 9;
        isConnected = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke(obj);
            return null;
        }
        function1.invoke(obj);
        int i3 = 42 / 0;
        return null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, ConfirmResponse confirmResponse) {
        int i = 2 % 2;
        int i2 = isConnected + 55;
        search = i2 % 128;
        if (i2 % 2 != 0) {
            MutableLiveData<VirtualCameraAdapter1<ConfirmResponse>> mutableLiveData = lambdaenabletorch1androidxcameracamera2internaltorchcontrol.getInterfaceDescriptor;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(confirmResponse));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        MutableLiveData<VirtualCameraAdapter1<ConfirmResponse>> mutableLiveData2 = lambdaenabletorch1androidxcameracamera2internaltorchcontrol.getInterfaceDescriptor;
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(confirmResponse));
        Unit unit2 = Unit.INSTANCE;
        int i3 = isConnected + 39;
        search = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static /* synthetic */ Unit b(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = isConnected + 67;
        search = i2 % 128;
        int i3 = i2 % 2;
        lambdaenabletorch1androidxcameracamera2internaltorchcontrol.getSessionToken.b(virtualCameraAdapter1);
        Unit unit = Unit.INSTANCE;
        int i4 = isConnected + 39;
        search = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit b(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, Throwable th) {
        int i = 2 % 2;
        int i2 = isConnected + 33;
        search = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(th);
            setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, lambdaenabletorch1androidxcameracamera2internaltorchcontrol.cancel);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, lambdaenabletorch1androidxcameracamera2internaltorchcontrol.cancel);
        int i3 = 17 / 0;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isConnected + 83;
        search = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke(obj);
        } else {
            function1.invoke(obj);
            int i3 = 0 / 0;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isConnected + 43;
        search = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke(obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        function1.invoke(obj);
        int i3 = search + 19;
        isConnected = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = isConnected + 47;
        search = i2 % 128;
        if (i2 % 2 == 0) {
            lambdaenabletorch1androidxcameracamera2internaltorchcontrol.connect.b(virtualCameraAdapter1);
            return Unit.INSTANCE;
        }
        lambdaenabletorch1androidxcameracamera2internaltorchcontrol.connect.b(virtualCameraAdapter1);
        int i3 = 84 / 0;
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = isConnected + 7;
        search = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke(obj);
            throw null;
        }
        function1.invoke(obj);
        int i3 = isConnected + 117;
        search = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 35 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = isConnected + 91;
        search = i2 % 128;
        int i3 = i2 % 2;
        lambdaenabletorch1androidxcameracamera2internaltorchcontrol.INotificationSideChannelStubProxy.b(virtualCameraAdapter1);
        Unit unit = Unit.INSTANCE;
        int i4 = isConnected + 75;
        search = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, ScholarshipVerificationResponse scholarshipVerificationResponse) {
        int i = 2 % 2;
        int i2 = isConnected + 47;
        search = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<VirtualCameraAdapter1<ScholarshipVerificationResponse>> mutableLiveData = lambdaenabletorch1androidxcameracamera2internaltorchcontrol.cancel;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(scholarshipVerificationResponse));
        Unit unit = Unit.INSTANCE;
        int i4 = isConnected + 125;
        search = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = isConnected + 27;
        search = i2 % 128;
        if (i2 % 2 == 0) {
            lambdaenabletorch1androidxcameracamera2internaltorchcontrol.disconnect.b(virtualCameraAdapter1);
            return Unit.INSTANCE;
        }
        lambdaenabletorch1androidxcameracamera2internaltorchcontrol.disconnect.b(virtualCameraAdapter1);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = search + 123;
        isConnected = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = search + 11;
        isConnected = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, Throwable th) {
        int i = 2 % 2;
        int i2 = search + 109;
        isConnected = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, lambdaenabletorch1androidxcameracamera2internaltorchcontrol.INotificationSideChannelStub);
        Unit unit = Unit.INSTANCE;
        int i4 = isConnected + 49;
        search = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void g(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = search + 19;
        isConnected = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke(obj);
            return;
        }
        function1.invoke(obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, Throwable th) {
        int i = 2 % 2;
        int i2 = isConnected + 9;
        search = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(th);
            setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, lambdaenabletorch1androidxcameracamera2internaltorchcontrol.RemoteActionCompatParcelizer);
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, lambdaenabletorch1androidxcameracamera2internaltorchcontrol.RemoteActionCompatParcelizer);
        Unit unit2 = Unit.INSTANCE;
        int i3 = search + 37;
        isConnected = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol = (lambdaenableTorch1androidxcameracamera2internalTorchControl) objArr[0];
        VirtualCameraAdapter1<List<ScholarBenefit>> virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        int i2 = isConnected + 19;
        search = i2 % 128;
        if (i2 % 2 != 0) {
            lambdaenabletorch1androidxcameracamera2internaltorchcontrol.IconCompatParcelizer.b(virtualCameraAdapter1);
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        lambdaenabletorch1androidxcameracamera2internaltorchcontrol.IconCompatParcelizer.b(virtualCameraAdapter1);
        Unit unit2 = Unit.INSTANCE;
        int i3 = isConnected + 47;
        search = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static /* synthetic */ Unit asBinder(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, VirtualCameraAdapter1 virtualCameraAdapter1) {
        Unit unit;
        int i = 2 % 2;
        int i2 = search + 55;
        isConnected = i2 % 128;
        if (i2 % 2 == 0) {
            lambdaenabletorch1androidxcameracamera2internaltorchcontrol.getNotifyChildrenChangedOptions.b(virtualCameraAdapter1);
            unit = Unit.INSTANCE;
            int i3 = 76 / 0;
        } else {
            lambdaenabletorch1androidxcameracamera2internaltorchcontrol.getNotifyChildrenChangedOptions.b(virtualCameraAdapter1);
            unit = Unit.INSTANCE;
        }
        int i4 = isConnected + 73;
        search = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = isConnected + 105;
        search = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke(obj);
            return null;
        }
        function1.invoke(obj);
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, Throwable th) {
        int i = 2 % 2;
        int i2 = search + 99;
        isConnected = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(th);
            setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, lambdaenabletorch1androidxcameracamera2internaltorchcontrol.getInterfaceDescriptor);
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, lambdaenabletorch1androidxcameracamera2internaltorchcontrol.getInterfaceDescriptor);
        Unit unit2 = Unit.INSTANCE;
        int i3 = search + 33;
        isConnected = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, ScholarshipDocumentResponse scholarshipDocumentResponse) {
        int i = 2 % 2;
        int i2 = isConnected + 55;
        search = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<VirtualCameraAdapter1<ScholarshipDocumentResponse>> mutableLiveData = lambdaenabletorch1androidxcameracamera2internaltorchcontrol.RemoteActionCompatParcelizer;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(scholarshipDocumentResponse));
        Unit unit = Unit.INSTANCE;
        int i4 = search + 113;
        isConnected = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol = (lambdaenableTorch1androidxcameracamera2internalTorchControl) objArr[0];
        ScholarshipFmResponse scholarshipFmResponse = (ScholarshipFmResponse) objArr[1];
        int i = 2 % 2;
        int i2 = isConnected + 37;
        search = i2 % 128;
        if (i2 % 2 != 0) {
            MutableLiveData<VirtualCameraAdapter1<ScholarshipFmResponse>> mutableLiveData = lambdaenabletorch1androidxcameracamera2internaltorchcontrol.INotificationSideChannelStub;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(scholarshipFmResponse));
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MutableLiveData<VirtualCameraAdapter1<ScholarshipFmResponse>> mutableLiveData2 = lambdaenabletorch1androidxcameracamera2internaltorchcontrol.INotificationSideChannelStub;
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(scholarshipFmResponse));
        Unit unit2 = Unit.INSTANCE;
        int i3 = search + 111;
        isConnected = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static /* synthetic */ Unit g(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = isConnected + 9;
        search = i2 % 128;
        int i3 = i2 % 2;
        lambdaenabletorch1androidxcameracamera2internaltorchcontrol.read.b(virtualCameraAdapter1);
        Unit unit = Unit.INSTANCE;
        int i4 = search + 41;
        isConnected = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, List list) {
        int i = 2 % 2;
        int i2 = isConnected + 63;
        search = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<VirtualCameraAdapter1<List<ScholarshipEducationListResponse>>> mutableLiveData = lambdaenabletorch1androidxcameracamera2internaltorchcontrol.onTransact;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        Unit unit = Unit.INSTANCE;
        int i4 = search + 91;
        isConnected = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void d(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isConnected + 101;
        search = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = search + 87;
        isConnected = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, Throwable th) {
        int i = 2 % 2;
        int i2 = isConnected + 53;
        search = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(th);
            setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, lambdaenabletorch1androidxcameracamera2internaltorchcontrol.onTransact);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, lambdaenabletorch1androidxcameracamera2internaltorchcontrol.onTransact);
        int i3 = 92 / 0;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void a(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isConnected + 93;
        search = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke(obj);
            throw null;
        }
        function1.invoke(obj);
        int i3 = isConnected + 31;
        search = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = search + 71;
        isConnected = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            function1.invoke(obj);
            return null;
        }
        function1.invoke(obj);
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1439529266, 1439529272, new Object[]{function1, obj}, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    public static /* synthetic */ void b(Function1 function1, Object obj) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(1033106560, -1033106557, new Object[]{function1, obj}, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(-947896810, 947896812, new Object[]{lambdaenabletorch1androidxcameracamera2internaltorchcontrol, virtualCameraAdapter1}, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(-452031684, 452031684, new Object[]{function1, obj}, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, ScholarshipFmResponse scholarshipFmResponse) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(-426772285, 426772289, new Object[]{lambdaenabletorch1androidxcameracamera2internaltorchcontrol, scholarshipFmResponse}, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(-918578102, 918578103, new Object[]{function1, obj}, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(410001568, -410001563, new Object[]{this}, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, short r7, int r8) {
        /*
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r7 = r7 + 99
            int r8 = r8 * 3
            int r0 = 1 - r8
            byte[] r1 = defpackage.lambdaenableTorch1androidxcameracamera2internalTorchControl.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdaenableTorch1androidxcameracamera2internalTorchControl.$$g(byte, short, int):java.lang.String");
    }
}
