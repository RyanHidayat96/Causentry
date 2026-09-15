package com.bpjstku.presentation.membership.payment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda16;
import com.bpjstku.data.payment.model.request.CreateCustomerObjectRequest;
import com.bpjstku.data.payment.model.request.GetCustomerObjectRequest;
import com.bpjstku.data.payment.model.request.GetListPaymentMethodRequest;
import com.bpjstku.data.payment.model.response.ActionLinkingStatus;
import com.bpjstku.data.payment.model.response.CustomerObjectItem;
import com.bpjstku.data.payment.model.response.PaymentMethodItem;
import com.bpjstku.data.payment.model.response.PaymentMethodResult;
import com.bpjstku.databinding.ActivityRegisterAutoDebetBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$sharedViewModel$default$1;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity;
import com.bpjstku.presentation.membership.payment.model.UrlAuthentication;
import com.bpjstku.presentation.tuition.model.CustomerObject;
import com.bpjstku.presentation.tuition.model.LinkedAccountDirectDebit;
import com.bpjstku.presentation.tuition.model.LinkedAccountEwallet;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.chip.Chip;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ListPopupWindow2;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.onCaptureSessionEnd;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import defpackage.setRelative;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0013\u0010\u0004J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0015\u0010\u000e\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0006\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0015\u0010\u001a\u001a\u00020\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0017\u0010!\u001a\u0004\u0018\u00010\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0016\u0010#\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001bR\u0016\u0010\u0011\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u0016\u0010\u0012\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001bR\u0016\u0010\u0013\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001bR\u0016\u0010(\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001bR\u0016\u0010*\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001bR\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0018\u00102\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u00101R\u0018\u0010.\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u00101R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u00101R\u0018\u00104\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u00101R\u0016\u00105\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00106R\u0016\u00109\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u00106R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u00106R\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00106R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u00106R\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u00106R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00106R\u0016\u0010$\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u00108R\u0016\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u00108R\u0016\u0010'\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u00108R\u0016\u0010=\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u00108R \u0010 \u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00020>8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010@R\u0014\u0010C\u001a\u00020A8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010B"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/RegisterAutoDebetActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityRegisterAutoDebetBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "", "Lcom/bpjstku/data/payment/model/response/PaymentMethodItem;", "p0", "", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "INotificationSideChannelStubProxy", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "Z", "LListPopupWindow2;", "write", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lcom/bpjstku/domain/user/model/User;", "getSessionToken", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "disconnect", "d", "getNotifyChildrenChangedOptions", FirebaseAnalytics.Event.SEARCH, "getItem", "getExtras", "g", "getRoot", "onTransact", "Lcom/bpjstku/presentation/tuition/model/LinkedAccountDirectDebit;", "Lcom/bpjstku/presentation/tuition/model/LinkedAccountDirectDebit;", "INotificationSideChannel", "cancel", "notify", "Lcom/bpjstku/presentation/tuition/model/LinkedAccountEwallet;", "Lcom/bpjstku/presentation/tuition/model/LinkedAccountEwallet;", "cancelAll", "getInterfaceDescriptor", "INotificationSideChannelStub", "INotificationSideChannelDefault", "Ljava/util/List;", "IconCompatParcelizer", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "MediaBrowserCompat", "connect", "read", "isConnected", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I", "getServiceComponent"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RegisterAutoDebetActivity extends BindingBaseActivity<ActivityRegisterAutoDebetBinding> {
    private static int MediaBrowserCompatConnectionCallback;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char getServiceComponent;
    private static char handleMessage;
    private static char sendCustomAction;
    private static char setCallbacksMessenger;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private LinkedAccountEwallet cancelAll;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private boolean b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private LinkedAccountEwallet getInterfaceDescriptor;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private LinkedAccountDirectDebit INotificationSideChannel;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private boolean INotificationSideChannelDefault;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private LinkedAccountDirectDebit notify;

    /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
    private boolean d;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private LinkedAccountEwallet INotificationSideChannelStub;

    /* JADX INFO: renamed from: getExtras, reason: from kotlin metadata */
    private boolean g;

    /* JADX INFO: renamed from: getItem, reason: from kotlin metadata */
    private boolean asBinder;

    /* JADX INFO: renamed from: getNotifyChildrenChangedOptions, reason: from kotlin metadata */
    private boolean a;

    /* JADX INFO: renamed from: getRoot, reason: from kotlin metadata */
    private boolean onTransact;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private LinkedAccountEwallet cancel;

    /* JADX INFO: renamed from: search, reason: from kotlin metadata */
    private boolean asInterface;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {77, -106, 83, 4};
    private static final int $$f = 149;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {68, 104, -93, -37, 14, -15, 32, -17, -19, 4, 46, -47, 1, -1, 3, 13};
    private static final int $$k = 90;
    private static final byte[] $$a = {ByteCompanionObject.MAX_VALUE, 43, -39, -37, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 196;
    private static int subscribe = 0;
    private static int unsubscribe = 0;
    private static int MediaBrowserCompatCallbackHandler = 1;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: performCollapse
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RegisterAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: getSessionToken, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: animateToTab
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RegisterAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private List<PaymentMethodItem> INotificationSideChannelStubProxy = new ArrayList();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer = "";

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private List<PaymentMethodItem> MediaBrowserCompat = new ArrayList();

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private List<PaymentMethodItem> write = new ArrayList();

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private List<PaymentMethodItem> connect = new ArrayList();
    private List<PaymentMethodItem> read = new ArrayList();

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    private List<PaymentMethodItem> IconCompatParcelizer = new ArrayList();

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private List<PaymentMethodItem> disconnect = new ArrayList();

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private List<PaymentMethodItem> getRoot = new ArrayList();

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    private String getNotifyChildrenChangedOptions = "";

    /* JADX INFO: renamed from: isConnected, reason: from kotlin metadata */
    private String getItem = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String getExtras = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String isConnected = "";

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = ~(i7 | i8 | i4);
        int i10 = ~i4;
        int i11 = (~(i7 | i10)) | (~(i8 | i2 | i4));
        int i12 = (~(i4 | i7)) | (~(i8 | i10));
        int i13 = i2 + i5 + i + ((-1255669517) * i6) + (533247121 * i3);
        int i14 = i13 * i13;
        int i15 = ((i2 * (-122328301)) - 2132886715) + (i5 * (-122328301)) + (i9 * 272) + (i11 * 272) + (i12 * 272) + ((-122328029) * i) + ((-1196579527) * i6) + (656595923 * i3) + (i14 * 138215424);
        switch (((i2 * (-1895547823)) - 858849280) + ((-1895547823) * i5) + (i9 * (-204618832)) + (i11 * (-204618832)) + ((-204618832) * i12) + ((-2100166656) * i) + (760610816 * i6) + ((-1057882112) * i3) + (1344208896 * i14) + (i15 * i15 * (-833028096))) {
            case 1:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 2:
                return TuitionPaymentFragmentbindingInflater1(objArr);
            case 3:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 4:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            case 5:
                return b(objArr);
            case 6:
                RegisterAutoDebetActivity registerAutoDebetActivity = (RegisterAutoDebetActivity) objArr[0];
                int i16 = 2 % 2;
                Intrinsics.checkNotNullParameter((View) objArr[1], "");
                if (!(!registerAutoDebetActivity.b)) {
                    registerAutoDebetActivity.getItem = "BRI";
                    String strValueOf = registerAutoDebetActivity.d ^ true ? "" : String.valueOf(registerAutoDebetActivity.write.get(0).getPaymentMethodId());
                    CustomerObject customerObject = (CustomerObject) registerAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    String str = registerAutoDebetActivity.getItem;
                    String str2 = registerAutoDebetActivity.isConnected;
                    boolean z = registerAutoDebetActivity.d;
                    boolean z2 = registerAutoDebetActivity.a;
                    boolean z3 = registerAutoDebetActivity.asInterface;
                    boolean z4 = registerAutoDebetActivity.asBinder;
                    boolean z5 = registerAutoDebetActivity.g;
                    boolean z6 = registerAutoDebetActivity.onTransact;
                    CustomerObject customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CustomerObject.TuitionPaymentFragmentspecialinlinedviewModeldefault2(customerObject, null, null, null, null, null, null, null, null, strValueOf, null, str2, str, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, Boolean.valueOf(z), registerAutoDebetActivity.INotificationSideChannel, Boolean.valueOf(z6), registerAutoDebetActivity.notify, Boolean.valueOf(z2), registerAutoDebetActivity.cancelAll, Boolean.valueOf(z3), registerAutoDebetActivity.cancel, Boolean.valueOf(z4), registerAutoDebetActivity.getInterfaceDescriptor, Boolean.valueOf(z5), registerAutoDebetActivity.INotificationSideChannelStub, null, null, 536867583, 1536);
                    if (!registerAutoDebetActivity.d) {
                        TermsConditionRecurringActivity.Companion tuitionPaymentFragmentbindingInflater1 = TermsConditionRecurringActivity.INSTANCE;
                        TermsConditionRecurringActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registerAutoDebetActivity, customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    } else {
                        int i17 = unsubscribe + 43;
                        MediaBrowserCompatCallbackHandler = i17 % 128;
                        int i18 = i17 % 2;
                        LinkingAccountPaymentActivity.Companion tuitionPaymentFragmentbindingInflater2 = LinkingAccountPaymentActivity.INSTANCE;
                        LinkingAccountPaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registerAutoDebetActivity, customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i19 = unsubscribe + 55;
                MediaBrowserCompatCallbackHandler = i19 % 128;
                int i20 = i19 % 2;
                return unit;
            default:
                RegisterAutoDebetActivity registerAutoDebetActivity2 = (RegisterAutoDebetActivity) objArr[0];
                int i21 = 2 % 2;
                int i22 = unsubscribe + 119;
                MediaBrowserCompatCallbackHandler = i22 % 128;
                int i23 = i22 % 2;
                RegisterAutoDebetActivity registerAutoDebetActivity3 = registerAutoDebetActivity2;
                Intrinsics.checkNotNullParameter(registerAutoDebetActivity3, "");
                registerAutoDebetActivity3.getWindow().addFlags(8192);
                registerAutoDebetActivity2.TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityRegisterAutoDebetBinding) ((ViewBinding) registerAutoDebetActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
                ((ActivityRegisterAutoDebetBinding) ((ViewBinding) registerAutoDebetActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(registerAutoDebetActivity2.getString(R.string.action_register_recurring_plan));
                int i24 = MediaBrowserCompatCallbackHandler + 9;
                unsubscribe = i24 % 128;
                int i25 = i24 % 2;
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r0 = r5 + 1
            byte[] r1 = com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity.$$a
            int r6 = 144 - r6
            int r7 = 103 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L11
            r3 = r7
            r4 = r2
            r7 = r5
            goto L25
        L11:
            r3 = r2
        L12:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L23:
            r3 = r1[r6]
        L25:
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity.c(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 12
            int r7 = r7 + 1
            int r9 = r9 * 12
            int r9 = 15 - r9
            byte[] r0 = com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity.$$j
            int r8 = r8 * 17
            int r8 = r8 + 98
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r5 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            int r9 = r9 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2d:
            int r9 = -r9
            int r8 = r8 + r9
            r9 = r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity.f(int, byte, short, java.lang.Object[]):void");
    }

    public RegisterAutoDebetActivity() {
        final RegisterAutoDebetActivity registerAutoDebetActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<ListPopupWindow2>() { // from class: com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ListPopupWindow2, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ListPopupWindow2 invoke() {
                LifecycleOwner lifecycleOwner = registerAutoDebetActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListPopupWindow2.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = registerAutoDebetActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/RegisterAutoDebetActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Lcom/bpjstku/presentation/tuition/model/CustomerObject;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, CustomerObject p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) RegisterAutoDebetActivity.class);
            intent.putExtra("customer_object_recurring", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityRegisterAutoDebetBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = unsubscribe + 125;
        MediaBrowserCompatCallbackHandler = i2 % 128;
        int i3 = i2 % 2;
        RegisterAutoDebetActivity$bindingInflater$1 registerAutoDebetActivity$bindingInflater$1 = RegisterAutoDebetActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i4 = unsubscribe + 67;
        MediaBrowserCompatCallbackHandler = i4 % 128;
        int i5 = i4 % 2;
        return registerAutoDebetActivity$bindingInflater$1;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < cArr.length) {
            int i3 = $10 + 89;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                int i7 = $10 + 109;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i5) ^ ((c2 << 4) + ((char) (((long) handleMessage) ^ 8611973335120459638L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(setCallbacksMessenger)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (47772 - TextUtils.lastIndexOf("", '0', 0, 0)), View.MeasureSpec.getMode(0) + 468, Color.green(0) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) getServiceComponent) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(sendCustomAction)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - View.MeasureSpec.makeMeasureSpec(0, 0)), Color.alpha(0) + 468, (-16777203) - Color.rgb(0, 0, 0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr3[0] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b = (byte) 0;
                byte b2 = (byte) (b - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), Color.green(0) + 2323, 45 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1312321721, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i9 = $11 + 39;
            $10 = i9 % 128;
            int i10 = i9 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ActivityRegisterAutoDebetBinding activityRegisterAutoDebetBinding = (ActivityRegisterAutoDebetBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityRegisterAutoDebetBinding.srlPaymentMethodAutoDebit.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: RtlSpacingHelper
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                RegisterAutoDebetActivity.b(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
        LinearLayout linearLayout = activityRegisterAutoDebetBinding.llBankBni;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getStart
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegisterAutoDebetActivity.b(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
        LinearLayout linearLayout2 = activityRegisterAutoDebetBinding.llBankBriDD;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setAbsolute
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                return (Unit) RegisterAutoDebetActivity.TuitionPaymentFragmentbindingInflater1(AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -69730004, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 69730010, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        }));
        LinearLayout linearLayout3 = activityRegisterAutoDebetBinding.llDana;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
        linearLayout3.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: ScrollingTabContainerView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                return (Unit) RegisterAutoDebetActivity.TuitionPaymentFragmentbindingInflater1(AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 965774782, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -965774778, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        }));
        LinearLayout linearLayout4 = activityRegisterAutoDebetBinding.llBankMandiri;
        Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
        linearLayout4.setOnClickListener(new LifecycleCameraRepositoryKey(new setRelative(this)));
        LinearLayout linearLayout5 = activityRegisterAutoDebetBinding.llLinkaja;
        Intrinsics.checkNotNullExpressionValue(linearLayout5, "");
        linearLayout5.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: createTabLayout
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1, (View) obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                return (Unit) RegisterAutoDebetActivity.TuitionPaymentFragmentbindingInflater1(AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 501723067, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -501723062, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        }));
        LinearLayout linearLayout6 = activityRegisterAutoDebetBinding.llShopee;
        Intrinsics.checkNotNullExpressionValue(linearLayout6, "");
        linearLayout6.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: createTabView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegisterAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        LinearLayout linearLayout7 = activityRegisterAutoDebetBinding.llOvo;
        Intrinsics.checkNotNullExpressionValue(linearLayout7, "");
        linearLayout7.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: performExpand
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegisterAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        int i2 = unsubscribe + 65;
        MediaBrowserCompatCallbackHandler = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static List<PaymentMethodItem> TuitionPaymentFragmentspecialinlinedviewModeldefault3(List<PaymentMethodItem> p0, String p1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        ArrayList arrayList = new ArrayList();
        int size = p0.size();
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = MediaBrowserCompatCallbackHandler + 41;
            unsubscribe = i3 % 128;
            int i4 = i3 % 2;
            if (Intrinsics.areEqual(p0.get(i2).getChannelCode(), p1)) {
                int i5 = unsubscribe + 31;
                MediaBrowserCompatCallbackHandler = i5 % 128;
                if (i5 % 2 == 0) {
                    arrayList.add(p0.get(i2));
                    int i6 = 20 / 0;
                } else {
                    arrayList.add(p0.get(i2));
                }
            }
        }
        int i7 = unsubscribe + 103;
        MediaBrowserCompatCallbackHandler = i7 % 128;
        if (i7 % 2 != 0) {
            return arrayList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        ActivityRegisterAutoDebetBinding activityRegisterAutoDebetBinding = (ActivityRegisterAutoDebetBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        List<PaymentMethodItem> listTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.INotificationSideChannelStubProxy, "LINKAJA");
        this.getRoot = listTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (listTuitionPaymentFragmentspecialinlinedviewModeldefault3.size() > 0) {
            activityRegisterAutoDebetBinding.tvStatusLinkaja.setText("Terhubung");
            this.g = true;
            this.INotificationSideChannelStub = new LinkedAccountEwallet(this.getRoot.get(0).getEwallet().getEwalletAccount().getName(), this.getRoot.get(0).getEwallet().getEwalletAccount().getAccountDetails(), Integer.valueOf(this.getRoot.get(0).getEwallet().getEwalletAccount().getBalance()), Integer.valueOf(this.getRoot.get(0).getEwallet().getEwalletAccount().getPointBalance()));
        } else {
            this.g = false;
            activityRegisterAutoDebetBinding.tvStatusLinkaja.setText("");
            int i2 = unsubscribe + 87;
            MediaBrowserCompatCallbackHandler = i2 % 128;
            int i3 = i2 % 2;
        }
        List<PaymentMethodItem> listTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.INotificationSideChannelStubProxy, "BRI");
        this.write = listTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        if (listTuitionPaymentFragmentspecialinlinedviewModeldefault4.size() > 0) {
            activityRegisterAutoDebetBinding.tvStatusBri.setText("Terhubung");
            this.d = true;
            this.INotificationSideChannel = new LinkedAccountDirectDebit(this.write.get(0).getDirectDebit().getDirectDebitInfo().getCardExpiry(), this.write.get(0).getDirectDebit().getDirectDebitInfo().getCardLastFour(), this.write.get(0).getDirectDebit().getDirectDebitInfo().getEmail(), this.write.get(0).getDirectDebit().getDirectDebitInfo().getMobileNumber());
        } else {
            this.d = false;
            activityRegisterAutoDebetBinding.tvStatusBri.setText("");
        }
        List<PaymentMethodItem> listTuitionPaymentFragmentspecialinlinedviewModeldefault5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.INotificationSideChannelStubProxy, "MANDIRI");
        this.connect = listTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        if (listTuitionPaymentFragmentspecialinlinedviewModeldefault5.size() > 0) {
            activityRegisterAutoDebetBinding.tvStatusMandiri.setText("Terhubung");
            this.onTransact = true;
            this.notify = new LinkedAccountDirectDebit(this.connect.get(0).getDirectDebit().getDirectDebitInfo().getCardExpiry(), this.connect.get(0).getDirectDebit().getDirectDebitInfo().getCardLastFour(), this.connect.get(0).getDirectDebit().getDirectDebitInfo().getEmail(), this.connect.get(0).getDirectDebit().getDirectDebitInfo().getMobileNumber());
        } else {
            this.onTransact = false;
            activityRegisterAutoDebetBinding.tvStatusMandiri.setText("");
        }
        List<PaymentMethodItem> listTuitionPaymentFragmentspecialinlinedviewModeldefault6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.INotificationSideChannelStubProxy, "OVO");
        this.read = listTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        if (listTuitionPaymentFragmentspecialinlinedviewModeldefault6.size() > 0) {
            activityRegisterAutoDebetBinding.tvStatusOvo.setText("Terhubung");
            this.a = true;
            this.cancelAll = new LinkedAccountEwallet(this.read.get(0).getEwallet().getEwalletAccount().getName(), this.read.get(0).getEwallet().getEwalletAccount().getAccountDetails(), Integer.valueOf(this.read.get(0).getEwallet().getEwalletAccount().getBalance()), Integer.valueOf(this.read.get(0).getEwallet().getEwalletAccount().getPointBalance()));
        } else {
            this.a = false;
            activityRegisterAutoDebetBinding.tvStatusOvo.setText("");
        }
        List<PaymentMethodItem> listTuitionPaymentFragmentspecialinlinedviewModeldefault7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.INotificationSideChannelStubProxy, "DANA");
        this.disconnect = listTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        if (listTuitionPaymentFragmentspecialinlinedviewModeldefault7.size() > 0) {
            activityRegisterAutoDebetBinding.tvStatusDana.setText("Terhubung");
            this.asBinder = true;
            this.getInterfaceDescriptor = new LinkedAccountEwallet(this.disconnect.get(0).getEwallet().getEwalletAccount().getName(), this.disconnect.get(0).getEwallet().getEwalletAccount().getAccountDetails(), Integer.valueOf(this.disconnect.get(0).getEwallet().getEwalletAccount().getBalance()), Integer.valueOf(this.disconnect.get(0).getEwallet().getEwalletAccount().getPointBalance()));
            int i4 = MediaBrowserCompatCallbackHandler + 5;
            unsubscribe = i4 % 128;
            int i5 = i4 % 2;
        } else {
            this.asBinder = false;
            activityRegisterAutoDebetBinding.tvStatusDana.setText("");
        }
        List<PaymentMethodItem> listTuitionPaymentFragmentspecialinlinedviewModeldefault8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.INotificationSideChannelStubProxy, "SHOPEEPAY");
        this.IconCompatParcelizer = listTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        if (listTuitionPaymentFragmentspecialinlinedviewModeldefault8.size() > 0) {
            activityRegisterAutoDebetBinding.tvStatusShopee.setText("Terhubung");
            this.asInterface = true;
            this.cancel = new LinkedAccountEwallet(this.IconCompatParcelizer.get(0).getEwallet().getEwalletAccount().getName(), this.IconCompatParcelizer.get(0).getEwallet().getEwalletAccount().getAccountDetails(), Integer.valueOf(this.IconCompatParcelizer.get(0).getEwallet().getEwalletAccount().getBalance()), Integer.valueOf(this.IconCompatParcelizer.get(0).getEwallet().getEwalletAccount().getPointBalance()));
        } else {
            this.asInterface = false;
            activityRegisterAutoDebetBinding.tvStatusShopee.setText("");
            int i6 = unsubscribe + 119;
            MediaBrowserCompatCallbackHandler = i6 % 128;
            int i7 = i6 % 2;
        }
        this.b = true;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        RegisterAutoDebetActivity registerAutoDebetActivity = this;
        ((ListPopupWindow2) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).cancelAll.observe(registerAutoDebetActivity, new Observer() { // from class: ScrollingTabContainerViewTabAdapter
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegisterAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        ((ListPopupWindow2) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).f164a.observe(registerAutoDebetActivity, new Observer() { // from class: ScrollingTabContainerViewTabClickListener
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegisterAutoDebetActivity.asBinder(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        ((ListPopupWindow2) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).notify.observe(registerAutoDebetActivity, new Observer() { // from class: updateTab
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegisterAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        ((ListPopupWindow2) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).asBinder.observe(registerAutoDebetActivity, new Observer() { // from class: setTabSelected
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                Object[] objArr = {this.b, (VirtualCameraAdapter1) obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                RegisterAutoDebetActivity.TuitionPaymentFragmentbindingInflater1(AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -621411807, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 621411808, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        });
        ((ListPopupWindow2) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).d.observe(registerAutoDebetActivity, new Observer() { // from class: openRawResource
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegisterAutoDebetActivity.b(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        ((ListPopupWindow2) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1.observe(registerAutoDebetActivity, new Observer() { // from class: parseBundleExtras
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegisterAutoDebetActivity.asInterface(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        ((ListPopupWindow2) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).INotificationSideChannel.observe(registerAutoDebetActivity, new Observer() { // from class: obtainTypedArray
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegisterAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = MediaBrowserCompatCallbackHandler + 33;
        unsubscribe = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() throws Throwable {
        String str;
        Object[] objArr;
        Object[] objArr2;
        String str2;
        int i = 2 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        Object obj = null;
        if (userAsBinder != null) {
            str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i2 = unsubscribe + 115;
            MediaBrowserCompatCallbackHandler = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 / 5;
            }
        } else {
            str = null;
        }
        String str3 = str;
        if ((str3 == null || str3.length() == 0) && Intrinsics.areEqual(((CustomerObject) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).write, "cross_selling")) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Login session habis", 0).show();
            LoginActivity.Companion companion = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, null, false, 6);
            d_();
            int i4 = MediaBrowserCompatCallbackHandler + 15;
            unsubscribe = i4 % 128;
            int i5 = i4 % 2;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
            int i6 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 875;
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 10;
            byte b = $$a[7];
            short s = (short) (b | 141);
            Object[] objArr3 = new Object[1];
            c(b, s, (byte) (s & 23), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, i6, tapTimeout, 252381699, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{60056, 35243, 58463, 23942, 43486, 31706, 55393, 24025, 13928, 16981, 64393, 33332, 18434, 40230, 23992, 51502, 44565, 33632, 13628, 11102, 25974, 48819, 25024, 51946}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_bank_name).substring(1, 2).codePointAt(0) - 75, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{33901, 37108, 61733, 13254, 60525, 15634, 15369, 64692, 50855, 26342, 9339, 22526, 16299, 30697, 27778, 55441, 21986, 43002}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 91, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveSize = (char) View.resolveSize(0, 0);
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 876;
            int i7 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9;
            Object[] objArr6 = new Object[1];
            c((byte) 52, (short) 141, $$a[54], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize, scrollDefaultDelay, i7, 2009631821, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cRed = (char) Color.red(0);
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 876;
                int i8 = 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr7 = new Object[1];
                c(b3, (short) (b3 | 89), b2, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRed, maximumFlingVelocity, i8, 256017550, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i9 = ~iIdentityHashCode;
            int i10 = ((((-1951189216) + ((iIdentityHashCode | 806912448) * 988)) + (((~(884984261 | i9)) | (-922745846)) * (-1976))) + ((((~(iIdentityHashCode | 844674032)) | 806912448) | (~((-844674033) | i9))) * 988)) - 371329401;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[1])[0] = i12 ^ (i12 << 5);
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr9 = new Object[1];
                e(new char[]{49780, 48596, 1523, 31191, 12205, 59163, 6301, 34379, 24489, 64337, 5561, 44083, 55547, 2725, 2894, 64971, 681, 20964, 40675, 64512, 40866, 35968, 38784, 42630, 16781, 12369, 32389, 5093}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 72, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                e(new char[]{24464, 15781, 38034, 43362, 5573, 32944, 47812, 15610, 11829, 7009, 39840, 22245, 34157, 16513, 10940, 44344, 14781, 21607, 15445, 60247}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18, objArr10);
                baseContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            e(new char[]{47110, 10638, 13834, 25367, 35217, 6122, 599, 46985, 42521, 61926, 11707, 47590, 5329, 64280, 5968, 29895, 41217, 39659}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 16, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            e(new char[]{27801, 34759, 40690, 38242, 63937, 19712, 64752, 27854, 55842, 58881, 27648, 11341, 2944, 58790, 65071, 58956, 50883, 51394}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step1).substring(14, 15).codePointAt(0) - 94, objArr12);
            try {
                Object[] objArr13 = {baseContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), -371329401};
                byte[] bArr = $$j;
                byte b4 = bArr[12];
                byte b5 = b4;
                Object[] objArr14 = new Object[1];
                f(b4, b5, b5, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b6 = (byte) (bArr[12] - 1);
                byte b7 = b6;
                Object[] objArr15 = new Object[1];
                f(b6, b7, b7, objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                if (baseContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int doubleTapTimeout = 876 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int gidForName = 9 - Process.getGidForName("");
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr17 = new Object[1];
                        c(b9, (short) (b9 | 89), b8, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, doubleTapTimeout, gidForName, 256017550, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                    try {
                        Object[] objArr18 = new Object[1];
                        e(new char[]{60056, 35243, 58463, 23942, 43486, 31706, 55393, 24025, 13928, 16981, 64393, 33332, 18434, 40230, 23992, 51502, 44565, 33632, 13628, 11102, 25974, 48819, 25024, 51946}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_internet_instruction_step5).substring(1, 7).codePointAt(3) - 83, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        e(new char[]{33901, 37108, 61733, 13254, 60525, 15634, 15369, 64692, 50855, 26342, 9339, 22526, 16299, 30697, 27778, 55441, 21986, 43002}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 94, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int iBlue = 876 - Color.blue(0);
                            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10;
                            Object[] objArr20 = new Object[1];
                            c((byte) 52, (short) 141, $$a[54], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, iBlue, keyRepeatTimeout, 2009631821, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 877;
                            int iRgb = (-16777206) - Color.rgb(0, 0, 0);
                            byte b10 = $$a[7];
                            short s2 = (short) (b10 | 141);
                            Object[] objArr21 = new Object[1];
                            c(b10, s2, (byte) (s2 & 23), objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, modifierMetaStateMask, iRgb, 252381699, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr16;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i13 = ((int[]) objArr[2])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i16 = ~startElapsedRealtime;
            int i17 = i15 + 400299292 + (((~(976728282 | i16)) | (~((-1017038512) | startElapsedRealtime))) * 1900) + (((~(i16 | 1017038511)) | (~(startElapsedRealtime | (-976728283)))) * (-950)) + (((~(startElapsedRealtime | 1017038511)) | (~(i16 | (-976728283)))) * 950);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr2[1])[0] = i19 ^ (i19 << 5);
        } else {
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            int i20 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i21 = (int) Runtime.getRuntime().totalMemory();
            int i22 = i20 + (-208210156) + (((~((-896345061) | i21)) | 73998816) * 1504) + ((~(i21 | (-822346245))) * (-1504)) + 623450816;
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr2[1])[0] = i24 ^ (i24 << 5);
        }
        int i25 = ((int[]) objArr2[1])[0];
        int i26 = i25 * i25;
        int i27 = -(2010764331 * i25);
        int i28 = (((i26 & i27) + (i26 | i27)) - (~(-(i25 * (-348602495))))) - 1;
        int i29 = (i28 ^ 139968228) + ((139968228 & i28) << 1);
        int i30 = i29 >> 20;
        int i31 = ((i30 ^ (-8191)) + ((i30 & (-8191)) << 1)) / 4096;
        int i32 = ((i31 | 1) << 1) - (i31 ^ 1);
        int i33 = (i29 ^ i32) + ((i32 & i29) << 1);
        int i34 = ((i29 >> 23) - 1023) / 512;
        int i35 = -(i33 ^ ((i34 ^ 1) + ((i34 & 1) << 1)));
        int i36 = ((i35 | 4) << 1) - (i35 ^ 4);
        int i37 = i36 >> 21;
        int i38 = (((i37 | (-4095)) << 1) - (i37 ^ (-4095))) / 2048;
        int i39 = ((i38 | 1) << 1) - (i38 ^ 1);
        this.INotificationSideChannelDefault = 0 / (((-((i39 & 1) + (i39 | 1))) & i36) * 583);
        this.getNotifyChildrenChangedOptions = ((CustomerObject) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.toString();
        ListPopupWindow2 listPopupWindow2 = (ListPopupWindow2) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        User user = (User) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        if (user != null) {
            int i40 = MediaBrowserCompatCallbackHandler + 59;
            unsubscribe = i40 % 128;
            if (i40 % 2 != 0) {
                String str4 = user.b;
                obj.hashCode();
                throw null;
            }
            str2 = user.b;
        } else {
            str2 = null;
        }
        listPopupWindow2.b(new GetCustomerObjectRequest(String.valueOf(str2)));
        int i41 = MediaBrowserCompatCallbackHandler + 71;
        unsubscribe = i41 % 128;
        if (i41 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = unsubscribe + 5;
        MediaBrowserCompatCallbackHandler = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i4 = unsubscribe + 5;
                MediaBrowserCompatCallbackHandler = i4 % 128;
                if (i4 % 2 == 0) {
                    onBackPressed();
                    throw null;
                }
                onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:17:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:19:0x0189  */
    /* JADX WARN: Code duplicated, block: B:22:0x0232 A[Catch: all -> 0x0a87, TryCatch #1 {all -> 0x0a87, blocks: (B:20:0x021e, B:22:0x0232, B:23:0x0264, B:59:0x0726, B:61:0x073a, B:62:0x076c, B:64:0x079e, B:65:0x0812), top: B:101:0x021e }] */
    /* JADX WARN: Code duplicated, block: B:26:0x027a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0323  */
    /* JADX WARN: Code duplicated, block: B:34:0x0376  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCallbackHandler + 51;
        unsubscribe = i2 % 128;
        if (i2 % 2 != 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 29944);
                int packedPositionGroup = 1755 - ExpandableListView.getPackedPositionGroup(0L);
                int gidForName = Process.getGidForName("") + 24;
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                c((byte) (-bArr[3]), (short) 89, bArr[54], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(threadPriority, packedPositionGroup, gidForName, 986134021, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
            int i3 = 53 / 0;
            if (j != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 29944);
                    int iGreen = 1755 - Color.green(0);
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 23;
                    byte b = (byte) 52;
                    Object[] objArr3 = new Object[1];
                    c(b, b, $$a[54], objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter, iGreen, touchSlop, 1599039318, false, (String) objArr3[0], null);
                }
                Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i4 = 1634522183 + (((~((-449018717) | iElapsedRealtime)) | 167995648 | (~((-236416291) | iElapsedRealtime))) * (-754));
                int i5 = ~((-167995649) | iElapsedRealtime);
                int i6 = ~iElapsedRealtime;
                int i7 = i4 + ((i5 | (~((-68420643) | i6))) * (-754)) + ((i6 | (-449018717)) * 754) + 1161631716;
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i9 ^ (i9 << 5);
            } else {
                Object[] objArr5 = new Object[1];
                e(new char[]{47110, 10638, 13834, 25367, 35217, 6122, 599, 46985, 42521, 61926, 11707, 47590, 5329, 64280, 5968, 29895, 41217, 39659}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_email_invalid_optional).substring(30, 31).length() + 15, objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                e(new char[]{27801, 34759, 40690, 38242, 63937, 19712, 64752, 27854, 55842, 58881, 27648, 11341, 2944, 58790, 65071, 58956, 50883, 51394}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_bni_transfer).substring(0, 8).codePointAt(0) - 50, objArr6);
                int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr7 = {935201046};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (42049 - (Process.myPid() >> 22)), 1727 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrTuitionPaymentFragmentbindingInflater1$5f1425da = com.google.firebase.abt.R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr7), 1161631716);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29944);
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1755;
                        int deadChar = 23 - KeyEvent.getDeadChar(0, 0);
                        byte b2 = (byte) 52;
                        Object[] objArr8 = new Object[1];
                        c(b2, b2, $$a[54], objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, pressedStateDuration, deadChar, 1599039318, false, (String) objArr8[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                    try {
                        Object[] objArr9 = new Object[1];
                        e(new char[]{60056, 35243, 58463, 23942, 43486, 31706, 55393, 24025, 13928, 16981, 64393, 33332, 18434, 40230, 23992, 51502, 44565, 33632, 13628, 11102, 25974, 48819, 25024, 51946}, ExpandableListView.getPackedPositionChild(0L) + 23, objArr9);
                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        e(new char[]{33901, 37108, 61733, 13254, 60525, 15634, 15369, 64692, 50855, 26342, 9339, 22526, 16299, 30697, 27778, 55441, 21986, 43002}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, objArr10);
                        long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29943);
                            int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0, 0);
                            int i10 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22;
                            Object[] objArr11 = new Object[1];
                            c((byte) 52, (short) 141, $$a[54], objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iLastIndexOf, i10, 1596667560, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29944);
                            int doubleTapTimeout = 1755 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int trimmedLength = 23 - TextUtils.getTrimmedLength("");
                            byte[] bArr2 = $$a;
                            Object[] objArr12 = new Object[1];
                            c((byte) (-bArr2[3]), (short) 89, bArr2[54], objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity, doubleTapTimeout, trimmedLength, 986134021, false, (String) objArr12[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        } else {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 29944);
                int edgeSlop = 1755 - (ViewConfiguration.getEdgeSlop() >> 16);
                int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 23;
                byte[] bArr3 = $$a;
                Object[] objArr13 = new Object[1];
                c((byte) (-bArr3[3]), (short) 89, bArr3[54], objArr13);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollBarSize, edgeSlop, offsetAfter2, 986134021, false, (String) objArr13[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char offsetAfter3 = (char) (TextUtils.getOffsetAfter("", 0) + 29944);
                    int iGreen2 = 1755 - Color.green(0);
                    int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 23;
                    byte b3 = (byte) 52;
                    Object[] objArr14 = new Object[1];
                    c(b3, b3, $$a[54], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter3, iGreen2, touchSlop2, 1599039318, false, (String) objArr14[0], null);
                }
                Object[] objArr15 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr15[0])[0]}, new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[1], (String[]) objArr15[4]};
                int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                int i11 = 1634522183 + (((~((-449018717) | iElapsedRealtime2)) | 167995648 | (~((-236416291) | iElapsedRealtime2))) * (-754));
                int i12 = ~((-167995649) | iElapsedRealtime2);
                int i13 = ~iElapsedRealtime2;
                int i14 = i11 + ((i12 | (~((-68420643) | i13))) * (-754)) + ((i13 | (-449018717)) * 754) + 1161631716;
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i16 ^ (i16 << 5);
            } else {
                Object[] objArr16 = new Object[1];
                e(new char[]{47110, 10638, 13834, 25367, 35217, 6122, 599, 46985, 42521, 61926, 11707, 47590, 5329, 64280, 5968, 29895, 41217, 39659}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_email_invalid_optional).substring(30, 31).length() + 15, objArr16);
                Class<?> cls3 = Class.forName((String) objArr16[0]);
                Object[] objArr17 = new Object[1];
                e(new char[]{27801, 34759, 40690, 38242, 63937, 19712, 64752, 27854, 55842, 58881, 27648, 11341, 2944, 58790, 65071, 58956, 50883, 51394}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_bni_transfer).substring(0, 8).codePointAt(0) - 50, objArr17);
                int iIntValue2 = ((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr18 = {935201046};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (42049 - (Process.myPid() >> 22)), 1727 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = com.google.firebase.abt.R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr18), 1161631716);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char maximumFlingVelocity2 = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29944);
                    int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 1755;
                    int deadChar2 = 23 - KeyEvent.getDeadChar(0, 0);
                    byte b4 = (byte) 52;
                    Object[] objArr19 = new Object[1];
                    c(b4, b4, $$a[54], objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity2, pressedStateDuration2, deadChar2, 1599039318, false, (String) objArr19[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                Object[] objArr20 = new Object[1];
                e(new char[]{60056, 35243, 58463, 23942, 43486, 31706, 55393, 24025, 13928, 16981, 64393, 33332, 18434, 40230, 23992, 51502, 44565, 33632, 13628, 11102, 25974, 48819, 25024, 51946}, ExpandableListView.getPackedPositionChild(0L) + 23, objArr20);
                Class<?> cls4 = Class.forName((String) objArr20[0]);
                Object[] objArr110 = new Object[1];
                e(new char[]{33901, 37108, 61733, 13254, 60525, 15634, 15369, 64692, 50855, 26342, 9339, 22526, 16299, 30697, 27778, 55441, 21986, 43002}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, objArr110);
                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr110[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29943);
                    int iLastIndexOf2 = 1754 - TextUtils.lastIndexOf("", '0', 0, 0);
                    int i17 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22;
                    Object[] objArr111 = new Object[1];
                    c((byte) 52, (short) 141, $$a[54], objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iLastIndexOf2, i17, 1596667560, false, (String) objArr111[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char minimumFlingVelocity2 = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29944);
                    int doubleTapTimeout2 = 1755 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int trimmedLength2 = 23 - TextUtils.getTrimmedLength("");
                    byte[] bArr4 = $$a;
                    Object[] objArr112 = new Object[1];
                    c((byte) (-bArr4[3]), (short) 89, bArr4[54], objArr112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity2, doubleTapTimeout2, trimmedLength2, 986134021, false, (String) objArr112[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf4);
            }
        }
        int i18 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
        int i19 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        if (i19 == i18) {
            int i20 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr21 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int iMyPid = Process.myPid();
            int i21 = i20 + 370336724 + (((-545865753) | iMyPid) * (-627)) + (((~(702370846 | iMyPid)) | 914973272) * (-627)) + (((~(iMyPid | 914973272)) | (~((~iMyPid) | (-702370847)))) * 627);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr21[3])[0] = i23 ^ (i23 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr != null) {
                for (String str : strArr) {
                    int i24 = MediaBrowserCompatCallbackHandler + 105;
                    unsubscribe = i24 % 128;
                    int i25 = i24 % 2;
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i19 / (((i19 - 1) * i19) % 2), 0).show();
            int i26 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr22 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int i27 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i28 = i26 + 2957387 + (((~((-597803093) | i27)) | 536985604) * (-140)) + ((~((-60817489) | i27)) * 70) + (((~(i27 | 810405518)) | (-334237403)) * 70);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr22[3])[0] = i30 ^ (i30 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0);
            int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 15;
            byte[] bArr5 = $$a;
            Object[] objArr23 = new Object[1];
            c((byte) 52, bArr5[7], bArr5[54], objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cCombineMeasuredStates, iIndexOf, edgeSlop2, 1357589585, false, (String) objArr23[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr24 = new Object[1];
        e(new char[]{60056, 35243, 58463, 23942, 43486, 31706, 55393, 24025, 13928, 16981, 64393, 33332, 18434, 40230, 23992, 51502, 44565, 33632, 13628, 11102, 25974, 48819, 25024, 51946}, View.getDefaultSize(0, 0) + 22, objArr24);
        Class<?> cls5 = Class.forName((String) objArr24[0]);
        Object[] objArr25 = new Object[1];
        e(new char[]{33901, 37108, 61733, 13254, 60525, 15634, 15369, 64692, 50855, 26342, 9339, 22526, 16299, 30697, 27778, 55441, 21986, 43002}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_cvv).substring(18, 28).codePointAt(5) - 90, objArr25);
        long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr25[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
            int mode = View.MeasureSpec.getMode(0) + 1031;
            int pressedStateDuration3 = 15 - (ViewConfiguration.getPressedStateDuration() >> 16);
            byte b5 = (byte) 52;
            Object[] objArr26 = new Object[1];
            c(b5, b5, $$a[54], objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(mirror, mode, pressedStateDuration3, 1344079056, false, (String) objArr26[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1031;
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 15;
                byte b6 = $$a[7];
                short s = (short) (b6 | 141);
                Object[] objArr27 = new Object[1];
                c(b6, s, (byte) (s & 23), objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(bitsPerPixel, iNormalizeMetaState, maxKeyCode, 632103528, false, (String) objArr27[0], null);
            }
            Object[] objArr28 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i31 = ((int[]) objArr28[3])[0];
            int i32 = ((int[]) objArr28[1])[0];
            String[] strArr2 = (String[]) objArr28[0];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i33 = 661002781 + (((~(742976362 | iMaxMemory)) | (-987256533)) * (-948)) + ((~((~iMaxMemory) | (-311432341))) * (-948)) + 8420267;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr[2])[0] = i35 ^ (i35 << 5);
        } else {
            Object[] objArr29 = new Object[1];
            e(new char[]{47110, 10638, 13834, 25367, 35217, 6122, 599, 46985, 42521, 61926, 11707, 47590, 5329, 64280, 5968, 29895, 41217, 39659}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr29);
            Class<?> cls6 = Class.forName((String) objArr29[0]);
            Object[] objArr30 = new Object[1];
            e(new char[]{27801, 34759, 40690, 38242, 63937, 19712, 64752, 27854, 55842, 58881, 27648, 11341, 2944, 58790, 65071, 58956, 50883, 51394}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr30);
            int iIntValue3 = ((Integer) cls6.getMethod((String) objArr30[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr31 = {935201046};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 46039), AndroidCharacter.getMirror('0') + 1086, (ViewConfiguration.getFadingEdgeLength() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr32 = {Integer.valueOf(iIntValue3), 0, 1156350739, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr31), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                int iAxisFromString = 1030 - MotionEvent.axisFromString("");
                int i36 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15;
                byte[] bArr6 = $$a;
                Object[] objArr33 = new Object[1];
                c((byte) 52, bArr6[7], bArr6[54], objArr33);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf, iAxisFromString, i36, 1298546779, false, (String) objArr33[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (MotionEvent.axisFromString("") + 45994), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1117, 17 - (ViewConfiguration.getFadingEdgeLength() >> 16)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr32);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char doubleTapTimeout3 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int i37 = 1032 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int doubleTapTimeout4 = 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte b7 = $$a[7];
                short s2 = (short) (b7 | 141);
                Object[] objArr34 = new Object[1];
                c(b7, s2, (byte) (s2 & 23), objArr34);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(doubleTapTimeout3, i37, doubleTapTimeout4, 632103528, false, (String) objArr34[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr35 = new Object[1];
                e(new char[]{60056, 35243, 58463, 23942, 43486, 31706, 55393, 24025, 13928, 16981, 64393, 33332, 18434, 40230, 23992, 51502, 44565, 33632, 13628, 11102, 25974, 48819, 25024, 51946}, TextUtils.lastIndexOf("", '0', 0, 0) + 23, objArr35);
                Class<?> cls7 = Class.forName((String) objArr35[0]);
                Object[] objArr36 = new Object[1];
                e(new char[]{33901, 37108, 61733, 13254, 60525, 15634, 15369, 64692, 50855, 26342, 9339, 22526, 16299, 30697, 27778, 55441, 21986, 43002}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.status_rba_unsuccessful).substring(0, 1).codePointAt(0) - 65, objArr36);
                long jLongValue4 = ((Long) cls7.getDeclaredMethod((String) objArr36[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c3 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1031;
                    int iArgb = 15 - Color.argb(0, 0, 0, 0);
                    byte b8 = (byte) 52;
                    Object[] objArr37 = new Object[1];
                    c(b8, b8, $$a[54], objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, offsetBefore, iArgb, 1344079056, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char touchSlop3 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1031;
                    int deadChar3 = 15 - KeyEvent.getDeadChar(0, 0);
                    byte[] bArr7 = $$a;
                    Object[] objArr38 = new Object[1];
                    c((byte) 52, bArr7[7], bArr7[54], objArr38);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(touchSlop3, fadingEdgeLength, deadChar3, 1357589585, false, (String) objArr38[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf6);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i38 = ((int[]) objArr[1])[0];
        int i39 = ((int[]) objArr[3])[0];
        if (i39 != i38) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str2 : strArr3) {
                    arrayList2.add(str2);
                }
            }
            int[] iArr = new int[i39];
            int i40 = i39 - 1;
            iArr[i40] = 1;
            Toast.makeText((Context) null, iArr[((i39 * i40) % 2) - 1], 1).show();
            Object[] objArr39 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i41 = ((int[]) objArr[2])[0];
            int i42 = ((int[]) objArr[3])[0];
            int i43 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i44 = i41 + (-739211511) + (((~(655951182 | iIdentityHashCode)) | 900231352) * (-366)) + (((~(iIdentityHashCode | 934901246)) | 621281288) * 366);
            int i45 = (i44 << 13) ^ i44;
            int i46 = i45 ^ (i45 >>> 17);
            ((int[]) objArr39[2])[0] = i46 ^ (i46 << 5);
            return;
        }
        int i47 = MediaBrowserCompatCallbackHandler + 77;
        unsubscribe = i47 % 128;
        int i48 = i47 % 2;
        Object[] objArr40 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i49 = ((int[]) objArr[2])[0];
        int i50 = ((int[]) objArr[3])[0];
        int i51 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i52 = i49 + ((((-622512422) + (((-224919553) | iFreeMemory) * (-381))) + (((~((~iFreeMemory) | (-527188041))) | 848817146) * 381)) - 204996608);
        int i53 = i52 ^ (i52 << 13);
        int i54 = i53 ^ (i53 >>> 17);
        ((int[]) objArr40[2])[0] = i54 ^ (i54 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1849735726
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity.onResume():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00e3, code lost:
    
        if (r1 != (((645208060 + (((~(1916334877 | r2)) | 163711074) * 104)) + ((~((~r2) | (-1879622406))) * (-104))) + ((r2 | 200423546) * 104))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00e5, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity.MediaBrowserCompatCallbackHandler + 13;
        com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity.unsubscribe = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00f1, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f5, code lost:
    
        r1 = (-1231569142) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00fe, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ff, code lost:
    
        r1 = 1281166988 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0108, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0058, code lost:
    
        if (r1 == ((((-1842015878) + (((~((-344024010) | r6)) | 1174011552) * (-933))) + (((~(r6 | 1174011552)) | (-1442447338)) * 933)) - 1668218720)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0097, code lost:
    
        if (r1 == ((r9 + ((r8 | r6) * (-1040))) + ((r6 | ((~(r7 | (-693195313))) | (-2077884216))) * 520))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0099, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 520608444;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity.onStart():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00eb, code lost:
    
        if (r1 == (((354095053 + (((~((-1809779978) | r4)) | 1107625224) * 98)) + ((((~(r4 | (-769275988))) | (-1809779978)) | (~(769275987 | r2))) * (-49))) + (((~(r2 | (-1809779978))) | (-1876901212)) * 49))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ed, code lost:
    
        r1 = com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity.MediaBrowserCompatCallbackHandler + 55;
        com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity.unsubscribe = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fe, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0100, code lost:
    
        r1 = new int[761968470];
        r1[761968469(0x2d6ab755, float:1.3342068E-11)] = 1;
        android.widget.Toast.makeText((android.content.Context) null, r1[-1], 1).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x010e, code lost:
    
        r1 = new int[761968470];
        r1[761968469(0x2d6ab755, float:1.3342068E-11)] = 1;
        r4 = 1696160142 % 2;
        android.widget.Toast.makeText((android.content.Context) null, r1[-1], 1).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x011f, code lost:
    
        super.onCreate(r10);
        r10 = com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity.unsubscribe + 71;
        com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity.MediaBrowserCompatCallbackHandler = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x012b, code lost:
    
        if ((r10 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x012d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x012e, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0131, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0139, code lost:
    
        throw new java.lang.RuntimeException("1368764640");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0052, code lost:
    
        if (r1 == ((r8 + ((r4 | r5) * (-84))) + ((1107337960 | r5) * 84))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00b2, code lost:
    
        if (r1 == (((1307956776 + ((r5 | (-1756098440)) * 764)) + (((~(r4 | (-1756098440))) | 539182208) * (-1528))) + (((-1603844920) | r5) * 764))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b4, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r9);
        r4 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegisterAutoDebetActivity registerAutoDebetActivity) {
        int i = 2 % 2;
        int i2 = unsubscribe + 61;
        MediaBrowserCompatCallbackHandler = i2 % 128;
        int i3 = i2 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) registerAutoDebetActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i4 = MediaBrowserCompatCallbackHandler + 123;
        unsubscribe = i4 % 128;
        int i5 = i4 % 2;
        return userAsBinder;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(RegisterAutoDebetActivity registerAutoDebetActivity, View view) {
        int i = 2 % 2;
        String strValueOf = "";
        Intrinsics.checkNotNullParameter(view, "");
        if (registerAutoDebetActivity.b) {
            registerAutoDebetActivity.getItem = "OVO";
            if (registerAutoDebetActivity.a) {
                int i2 = MediaBrowserCompatCallbackHandler + 65;
                unsubscribe = i2 % 128;
                int i3 = i2 % 2;
                strValueOf = String.valueOf(registerAutoDebetActivity.read.get(0).getPaymentMethodId());
                int i4 = unsubscribe + 9;
                MediaBrowserCompatCallbackHandler = i4 % 128;
                int i5 = i4 % 2;
            }
            String str = strValueOf;
            CustomerObject customerObject = (CustomerObject) registerAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            String str2 = registerAutoDebetActivity.getItem;
            String str3 = registerAutoDebetActivity.isConnected;
            boolean z = registerAutoDebetActivity.d;
            boolean z2 = registerAutoDebetActivity.a;
            boolean z3 = registerAutoDebetActivity.asInterface;
            boolean z4 = registerAutoDebetActivity.asBinder;
            LinkedAccountDirectDebit linkedAccountDirectDebit = registerAutoDebetActivity.INotificationSideChannel;
            LinkedAccountEwallet linkedAccountEwallet = registerAutoDebetActivity.getInterfaceDescriptor;
            LinkedAccountEwallet linkedAccountEwallet2 = registerAutoDebetActivity.cancelAll;
            LinkedAccountEwallet linkedAccountEwallet3 = registerAutoDebetActivity.cancel;
            boolean z5 = registerAutoDebetActivity.g;
            boolean z6 = registerAutoDebetActivity.onTransact;
            CustomerObject customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CustomerObject.TuitionPaymentFragmentspecialinlinedviewModeldefault2(customerObject, null, null, null, null, null, null, null, null, str, null, str3, str2, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, Boolean.valueOf(z), linkedAccountDirectDebit, Boolean.valueOf(z6), registerAutoDebetActivity.notify, Boolean.valueOf(z2), linkedAccountEwallet2, Boolean.valueOf(z3), linkedAccountEwallet3, Boolean.valueOf(z4), linkedAccountEwallet, Boolean.valueOf(z5), registerAutoDebetActivity.INotificationSideChannelStub, null, null, 536867583, 1536);
            if (registerAutoDebetActivity.a) {
                LinkingAccountPaymentActivity.Companion tuitionPaymentFragmentbindingInflater1 = LinkingAccountPaymentActivity.INSTANCE;
                LinkingAccountPaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registerAutoDebetActivity, customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            } else {
                TermsConditionRecurringActivity.Companion tuitionPaymentFragmentbindingInflater2 = TermsConditionRecurringActivity.INSTANCE;
                TermsConditionRecurringActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registerAutoDebetActivity, customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        }
        Unit unit = Unit.INSTANCE;
        int i6 = unsubscribe + 27;
        MediaBrowserCompatCallbackHandler = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if ((r4 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r48.MediaBrowserCompat();
        r0 = 64 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r48.MediaBrowserCompat();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if ((r49 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        r48.IconCompatParcelizer();
        defpackage.retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r48, java.lang.String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r49).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new defpackage.obtainAttributes());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if ((!(r49 instanceof VirtualCameraAdapter1.asBinder)) == true) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        r4 = r4 + 1;
        com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity.MediaBrowserCompatCallbackHandler = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if ((r4 % 2) == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        r48.IconCompatParcelizer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r48.getItem, "BRI") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        r1 = com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity.unsubscribe + 83;
        com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity.MediaBrowserCompatCallbackHandler = r1 % 128;
        r1 = r1 % 2;
        r1 = com.bpjstku.presentation.tuition.model.CustomerObject.TuitionPaymentFragmentspecialinlinedviewModeldefault2((com.bpjstku.presentation.tuition.model.CustomerObject) r48.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue(), null, null, null, null, null, null, null, null, null, null, r48.isConnected, "BRI", null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -3073, 2047);
        r2 = com.bpjstku.presentation.membership.payment.TermsConditionRecurringActivity.TuitionPaymentFragmentbindingInflater1;
        com.bpjstku.presentation.membership.payment.TermsConditionRecurringActivity.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r48, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00df, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r48.getItem, "MANDIRI") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e1, code lost:
    
        ((defpackage.ListPopupWindow2) r48.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).b(new com.bpjstku.data.payment.model.request.CreatePaymentMethodGeneralRequest(r48.getItem, r48.isConnected));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f6, code lost:
    
        r1 = com.bpjstku.presentation.tuition.model.CustomerObject.TuitionPaymentFragmentspecialinlinedviewModeldefault2((com.bpjstku.presentation.tuition.model.CustomerObject) r48.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue(), null, null, null, null, null, null, null, null, null, null, r48.isConnected, r48.getItem, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -3073, 2047);
        r2 = com.bpjstku.presentation.membership.payment.TermsConditionRecurringActivity.TuitionPaymentFragmentbindingInflater1;
        com.bpjstku.presentation.membership.payment.TermsConditionRecurringActivity.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r48, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x015a, code lost:
    
        r48.IconCompatParcelizer();
        kotlin.jvm.internal.Intrinsics.areEqual(r48.getItem, "BRI");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0163, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0164, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if ((r49 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if ((!(r49 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r4 = r4 + 71;
        com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity.MediaBrowserCompatCallbackHandler = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity r48, defpackage.VirtualCameraAdapter1 r49) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity, VirtualCameraAdapter1):void");
    }

    public static /* synthetic */ void b(final RegisterAutoDebetActivity registerAutoDebetActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCallbackHandler + 11;
        int i3 = i2 % 128;
        unsubscribe = i3;
        int i4 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            registerAutoDebetActivity.MediaBrowserCompat();
            str = "loading_create_mandiri_dd";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i5 = i3 + 47;
            MediaBrowserCompatCallbackHandler = i5 % 128;
            int i6 = i5 % 2;
            registerAutoDebetActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            if (Intrinsics.areEqual(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "Duplicate Payment Method")) {
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_email, "Duplikat Metode Pembayaran", "Teridentifikasi duplikasi metode pembayaran", "Coba kembali", new Function0() { // from class: parseBundleExtra
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RegisterAutoDebetActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    }
                }, 96);
                FragmentManager supportFragmentManager = registerAutoDebetActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    int i7 = unsubscribe + 59;
                    MediaBrowserCompatCallbackHandler = i7 % 128;
                    int i8 = i7 % 2;
                    getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
                int i9 = MediaBrowserCompatCallbackHandler + 109;
                unsubscribe = i9 % 128;
                int i10 = i9 % 2;
            } else {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registerAutoDebetActivity, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: openRawResourceFd
                    private static int $10 = 0;
                    private static int $11 = 1;
                    private static final byte[] $$a = {86, -48, ByteCompanionObject.MIN_VALUE, 88};
                    private static final int $$b = 238;
                    private static int b = 0;
                    private static int TuitionPaymentFragmentbindingInflater1 = 1;
                    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 3614462262923266843L;

                    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
                    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static void c(int r6, int r7, byte r8, java.lang.Object[] r9) {
                        /*
                            int r8 = r8 + 4
                            int r7 = r7 * 3
                            int r0 = 1 - r7
                            int r6 = r6 * 4
                            int r6 = r6 + 98
                            byte[] r1 = defpackage.openRawResourceFd.$$a
                            byte[] r0 = new byte[r0]
                            r2 = 0
                            int r7 = 0 - r7
                            if (r1 != 0) goto L17
                            r4 = r7
                            r6 = r8
                            r3 = r2
                            goto L2e
                        L17:
                            r3 = r2
                        L18:
                            int r8 = r8 + 1
                            byte r4 = (byte) r6
                            r0[r3] = r4
                            if (r3 != r7) goto L27
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r0, r2)
                            r9[r2] = r6
                            return
                        L27:
                            int r3 = r3 + 1
                            r4 = r1[r8]
                            r5 = r8
                            r8 = r6
                            r6 = r5
                        L2e:
                            int r4 = -r4
                            int r8 = r8 + r4
                            r5 = r8
                            r8 = r6
                            r6 = r5
                            goto L18
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.openRawResourceFd.c(int, int, byte, java.lang.Object[]):void");
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i11 = 2 % 2;
                        int i12 = b + 33;
                        TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                        if (i12 % 2 != 0) {
                            return RegisterAutoDebetActivity.d();
                        }
                        RegisterAutoDebetActivity.d();
                        throw null;
                    }

                    private static void a(char[] cArr, int i11, Object[] objArr) throws Throwable {
                        int i12 = 2 % 2;
                        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11;
                        int length = cArr.length;
                        long[] jArr = new long[length];
                        getrealtimecapturelatency.b = 0;
                        while (getrealtimecapturelatency.b < cArr.length) {
                            int i13 = $11 + 13;
                            $10 = i13 % 128;
                            int i14 = i13 % 2;
                            int i15 = getrealtimecapturelatency.b;
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - Color.red(0)), 2624 - KeyEvent.getDeadChar(0, 0), 13 - ExpandableListView.getPackedPositionType(0L), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                                }
                                jArr[i15] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 9053247990562531611L);
                                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - View.getDefaultSize(0, 0)), 481 - KeyEvent.normalizeMetaState(0), 37 - (Process.myTid() >> 22), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                                int i16 = $11 + 15;
                                $10 = i16 % 128;
                                if (i16 % 2 != 0) {
                                    int i17 = 5 % 3;
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        char[] cArr2 = new char[length];
                        getrealtimecapturelatency.b = 0;
                        while (getrealtimecapturelatency.b < cArr.length) {
                            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - Color.alpha(0)), 481 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        }
                        objArr[0] = new String(cArr2);
                    }

                    /* JADX WARN: Code duplicated, block: B:52:0x02da  */
                    /* JADX WARN: Code duplicated, block: B:54:0x02e9  */
                    /* JADX WARN: Code duplicated, block: B:60:0x02f2 A[Catch: Exception -> 0x0370, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0370, blocks: (B:38:0x0299, B:41:0x02c5, B:43:0x02cc, B:60:0x02f2, B:63:0x034f, B:64:0x0357, B:67:0x0369, B:68:0x036f, B:55:0x02ec, B:49:0x02d3, B:61:0x02fc), top: B:124:0x0299, inners: #7 }] */
                    /* JADX WARN: Code duplicated, block: B:63:0x034f A[Catch: Exception -> 0x0370, TRY_ENTER, TryCatch #1 {Exception -> 0x0370, blocks: (B:38:0x0299, B:41:0x02c5, B:43:0x02cc, B:60:0x02f2, B:63:0x034f, B:64:0x0357, B:67:0x0369, B:68:0x036f, B:55:0x02ec, B:49:0x02d3, B:61:0x02fc), top: B:124:0x0299, inners: #7 }] */
                    /* JADX WARN: Code duplicated, block: B:64:0x0357 A[Catch: Exception -> 0x0370, TRY_LEAVE, TryCatch #1 {Exception -> 0x0370, blocks: (B:38:0x0299, B:41:0x02c5, B:43:0x02cc, B:60:0x02f2, B:63:0x034f, B:64:0x0357, B:67:0x0369, B:68:0x036f, B:55:0x02ec, B:49:0x02d3, B:61:0x02fc), top: B:124:0x0299, inners: #7 }] */
                    public static Object[] TuitionPaymentFragmentbindingInflater1(int i11, int i12) throws Throwable {
                        int i13;
                        int i14;
                        int i15;
                        String str2;
                        Object[] objArr;
                        char c;
                        String line;
                        char[] cArr;
                        int iIndexOf;
                        int i16;
                        boolean zEquals;
                        char c2;
                        int i17;
                        int i18;
                        FileReader fileReader;
                        BufferedReader bufferedReader;
                        String line2;
                        Object[] objArr2;
                        Object obj;
                        int i19 = 2 % 2;
                        try {
                            String[] strArr = new String[2];
                            char[] cArr2 = {8809, 15020, 5114, 26872, 16670, 24110, 46941, 35966, 58525, 64933, 56053, 13306, 2074, 24893, 32343, 22386, 44932, 33962, 40394};
                            Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                            int i20 = windowTouchSlop * (-300);
                            int i21 = (i20 ^ 1922834) + ((i20 & 1922834) << 1);
                            int i22 = (windowTouchSlop ^ 6367) | (windowTouchSlop & 6367);
                            int i23 = -(-((~((i22 & i11) | (i22 ^ i11))) * (-301)));
                            int i24 = (i21 & i23) + (i23 | i21);
                            int i25 = ~((-6368) | i11);
                            int i26 = ~i11;
                            int i27 = ~((i26 & windowTouchSlop) | (i26 ^ windowTouchSlop));
                            int i28 = ((i25 & i27) | (i25 ^ i27)) * (-301);
                            int i29 = (i24 ^ i28) + ((i24 & i28) << 1);
                            int i30 = b + 85;
                            TuitionPaymentFragmentbindingInflater1 = i30 % 128;
                            int i31 = i30 % 2;
                            int i32 = ~windowTouchSlop;
                            if (i31 == 0) {
                                int i33 = ~((i32 & i11) | (i32 ^ i11));
                                int i34 = 301 / ((i33 & (-6368)) | ((-6368) ^ i33));
                                Object[] objArr3 = new Object[1];
                                a(cArr2, (i29 & i34) + (i29 | i34), objArr3);
                                obj = objArr3[0];
                            } else {
                                int i35 = (i29 - (~(((~((i32 & i11) | (i32 ^ i11))) | (-6368)) * 301))) - 1;
                                Object[] objArr4 = new Object[1];
                                a(cArr2, i35, objArr4);
                                obj = objArr4[0];
                            }
                            String str3 = (String) obj;
                            int i36 = TuitionPaymentFragmentbindingInflater1;
                            int i37 = ((i36 | 91) << 1) - (i36 ^ 91);
                            b = i37 % 128;
                            int i38 = i37 % 2;
                            strArr[0] = str3;
                            Object[] objArr5 = new Object[1];
                            a(new char[]{8823, 27892, 48963, 51659, 6205, 43655, 62745, 1109, 22215, 57679, 13206, 16898, 35998, 57316, 28225, 47324, 52021, 5527}, 20116 - (~(-(-(ViewConfiguration.getTapTimeout() >> 16)))), objArr5);
                            String str4 = (String) objArr5[0];
                            Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            strArr[1] = str4;
                            int i39 = 0;
                            while (true) {
                                if (i39 >= 2) {
                                    i13 = i11;
                                    break;
                                }
                                String str5 = strArr[i39];
                                int i40 = -TextUtils.lastIndexOf("", '0', 0);
                                int i41 = ((i40 | 50176) << 1) - (i40 ^ 50176);
                                Object[] objArr6 = new Object[1];
                                a(new char[]{8801, 58991, 43622, 28273, 12907, 63084, 47714, 32297, 615, 50810, 35364, 20047, 4713, 54895, 39547, 24168}, i41, objArr6);
                                Class<?> cls = Class.forName((String) objArr6[0]);
                                int i42 = TuitionPaymentFragmentbindingInflater1;
                                int i43 = ((i42 | 121) << 1) - (i42 ^ 121);
                                b = i43 % 128;
                                int i44 = i43 % 2;
                                if (((Boolean) cls.getMethod(str5, new Class[0]).invoke(cls, null)).booleanValue()) {
                                    i13 = i11 ^ 1;
                                    break;
                                }
                                int i45 = ((i39 | 69) << 1) - (i39 ^ 69);
                                i39 = (i45 & (-68)) + (i45 | (-68));
                                int i46 = TuitionPaymentFragmentbindingInflater1;
                                int i47 = (i46 ^ 43) + ((i46 & 43) << 1);
                                b = i47 % 128;
                                int i48 = i47 % 2;
                            }
                        } catch (Exception unused) {
                            i13 = (~(i11 & 2)) & (i11 | 2);
                        }
                        try {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 2420);
                                int iArgb = 2845 - Color.argb(0, 0, 0, 0);
                                int iIndexOf2 = 5 - TextUtils.indexOf("", "", 0);
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                Object[] objArr7 = new Object[1];
                                c(b2, b3, (byte) (b3 - 1), objArr7);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString, iArgb, iIndexOf2, -501222268, false, (String) objArr7[0], new Class[0]);
                            }
                            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                            long j = -331076927;
                            long j2 = -496;
                            long j3 = (j2 * j) + (j2 * jLongValue);
                            long j4 = 497;
                            long j5 = -1;
                            long j6 = j ^ j5;
                            long j7 = jLongValue ^ j5;
                            long j8 = j6 | j7;
                            long j9 = i11;
                            long j10 = j9 ^ j5;
                            long j11 = j3 + ((j8 ^ j5) * j4) + ((((j8 | j9) ^ j5) | (((j7 | j10) | j) ^ j5)) * j4) + (j4 * (((j9 | (j7 | j)) ^ j5) | ((j6 | j10) ^ j5) | ((j6 | jLongValue) ^ j5))) + ((long) (-828109759));
                            int i49 = (int) (j11 >> 32);
                            int i50 = TuitionPaymentFragmentbindingInflater1;
                            int i51 = (i50 ^ 115) + ((i50 & 115) << 1);
                            b = i51 % 128;
                            if (i51 % 2 != 0) {
                                int i52 = i49 & ((-2072279902) + ((~((~i11) | 753544190)) * (-116)) + ((684338110 | i11) * 116) + (((~((-752888301) | i11)) | 683682220) * 116));
                                int i53 = ~new Random().nextInt();
                                int i54 = ((int) j11) & ((-942081987) + ((2147220414 | i53) * 184) + (((~(i53 | 391224206)) | 2074766006) * 184));
                                i14 = (i52 & i54) | (i52 ^ i54);
                                i15 = i11 ^ 33;
                            } else {
                                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                                int i55 = ~startUptimeMillis;
                                int i56 = i49 & (691243864 + (((~(i55 | (-1248661670))) | 1248333989 | (~(1609406895 | startUptimeMillis))) * 717) + (((~(startUptimeMillis | (-1248661670))) | (~(i55 | 1609406895)) | 1248333989) * 717));
                                int i57 = ~((int) Process.getStartUptimeMillis());
                                i14 = i56 | (((int) j11) & ((((-1754753727) + (((~(i57 | 1609819635)) | 1247921250) * (-828))) + ((i57 | 1609819635) * (-828))) - 1490796848));
                                i15 = (i11 & (-11)) | ((~i11) & 10);
                            }
                            int i58 = (i14 | 1) & (~(i14 & 1));
                            int i59 = -i58;
                            int i60 = ((i58 & i59) | (i58 ^ i59)) >> 31;
                            int i61 = b;
                            int i62 = (i61 ^ 11) + ((i61 & 11) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i62 % 128;
                            if (i62 % 2 == 0) {
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            int i63 = i15 & (~i60);
                            int i64 = i60 & i11;
                            int i65 = (i64 & i63) | (i63 ^ i64);
                            int i66 = (~i13) & i11;
                            int i67 = ~i11;
                            int i68 = i66 | (i13 & i67);
                            int i69 = ((i61 | 45) << 1) - (i61 ^ 45);
                            TuitionPaymentFragmentbindingInflater1 = i69 % 128;
                            int i70 = i69 % 2;
                            int i71 = -i68;
                            int i72 = ((i68 & i71) | (i68 ^ i71)) >> 31;
                            int i73 = i65 & (~i72);
                            int i74 = i13 & i72;
                            int i75 = (i73 ^ i74) | (i74 & i73);
                            try {
                                Object[] objArr8 = new Object[1];
                                a(new char[]{8751, 29082, 34219, 55752, 28043, 33254, 54547, 26925, 48422, 53588, 25974, 47404, 52360, 24752, 46300, 51410, 7415, 45142, 50198, 6201, 44117, 49278, 5231, 43905, 65471, 5102, 42953, 64486, 3854, 41751, 63275, 2905, 24404, 62294, 1670, 23209, 61093, 718, 22259, 59917}, 21481 - KeyEvent.getDeadChar(0, 0), objArr8);
                                File file = new File((String) objArr8[0]);
                                int i76 = TuitionPaymentFragmentbindingInflater1;
                                int i77 = ((i76 | 77) << 1) - (i76 ^ 77);
                                b = i77 % 128;
                                if (i77 % 2 != 0) {
                                    int i78 = 46 / 0;
                                    if (file.canRead()) {
                                        fileReader = new FileReader(file);
                                        bufferedReader = new BufferedReader(fileReader);
                                        try {
                                            line2 = bufferedReader.readLine();
                                            int iGreen = Color.green(0);
                                            int i79 = (iGreen * (-159)) - 411969;
                                            int i80 = ((~iGreen) | 2591) * 160;
                                            int i81 = (i79 & i80) + (i79 | i80);
                                            int i82 = ~i11;
                                            int i83 = ~((i82 ^ iGreen) | (i82 & iGreen));
                                            int i84 = ~((iGreen & 2591) | (iGreen ^ 2591));
                                            int i85 = (i81 - (~(((i84 & i83) | (i83 ^ i84)) * (-160)))) - 1;
                                            int i86 = ~(((-2592) & i82) | ((-2592) ^ i82));
                                            int i87 = (i85 - (~(((i86 & iGreen) | (iGreen ^ i86)) * 160))) - 1;
                                            objArr2 = new Object[1];
                                            a(new char[]{8814, 10352, 13902}, i87, objArr2);
                                            if (line2.equals((String) objArr2[0])) {
                                                fileReader.close();
                                                bufferedReader.close();
                                                int i88 = TuitionPaymentFragmentbindingInflater1 + 51;
                                                b = i88 % 128;
                                                int i89 = i88 % 2;
                                            } else {
                                                fileReader.close();
                                                bufferedReader.close();
                                                str2 = line2;
                                            }
                                        } catch (Throwable th) {
                                            fileReader.close();
                                            bufferedReader.close();
                                            throw th;
                                        }
                                    } else {
                                        int i90 = TuitionPaymentFragmentbindingInflater1;
                                        i18 = (i90 & 81) + (i90 | 81);
                                        b = i18 % 128;
                                        if (i18 % 2 != 0) {
                                            int i91 = 44 / 0;
                                        }
                                    }
                                    str2 = null;
                                } else {
                                    if (!file.canRead()) {
                                        int i92 = TuitionPaymentFragmentbindingInflater1;
                                        i18 = (i92 & 81) + (i92 | 81);
                                        b = i18 % 128;
                                        if (i18 % 2 != 0) {
                                            int i93 = 44 / 0;
                                        }
                                    } else {
                                        fileReader = new FileReader(file);
                                        bufferedReader = new BufferedReader(fileReader);
                                        line2 = bufferedReader.readLine();
                                        int iGreen2 = Color.green(0);
                                        int i710 = (iGreen2 * (-159)) - 411969;
                                        int i810 = ((~iGreen2) | 2591) * 160;
                                        int i811 = (i710 & i810) + (i710 | i810);
                                        int i812 = ~i11;
                                        int i813 = ~((i812 ^ iGreen2) | (i812 & iGreen2));
                                        int i814 = ~((iGreen2 & 2591) | (iGreen2 ^ 2591));
                                        int i815 = (i811 - (~(((i814 & i813) | (i813 ^ i814)) * (-160)))) - 1;
                                        int i816 = ~(((-2592) & i812) | ((-2592) ^ i812));
                                        int i817 = (i815 - (~(((i816 & iGreen2) | (iGreen2 ^ i816)) * 160))) - 1;
                                        objArr2 = new Object[1];
                                        a(new char[]{8814, 10352, 13902}, i817, objArr2);
                                        if (line2.equals((String) objArr2[0])) {
                                            fileReader.close();
                                            bufferedReader.close();
                                            str2 = line2;
                                        } else {
                                            fileReader.close();
                                            bufferedReader.close();
                                            int i818 = TuitionPaymentFragmentbindingInflater1 + 51;
                                            b = i818 % 128;
                                            int i819 = i818 % 2;
                                        }
                                    }
                                    str2 = null;
                                }
                            } catch (Exception unused2) {
                            }
                            try {
                                char[] cArr3 = {8751, 20437, 63800, 27264, 38135, 1558, 45997, 56826, 20315, 63714, 27161, 38002, 462, 45839, 56675, 20167, 63615, 26003, 38894, 333, 45701, 56554, 20043, 64396, 25885, 38771, Typography.pound, 45573, 56416, 18900, 64306};
                                int iResolveSize = View.resolveSize(0, 0);
                                int i94 = (iResolveSize & 28069) + (iResolveSize | 28069);
                                Object[] objArr9 = new Object[1];
                                a(cArr3, i94, objArr9);
                                File file2 = new File((String) objArr9[0]);
                                if (file2.canRead()) {
                                    FileReader fileReader2 = new FileReader(file2);
                                    BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
                                    int i95 = b + 87;
                                    TuitionPaymentFragmentbindingInflater1 = i95 % 128;
                                    try {
                                        if (i95 % 2 == 0) {
                                            line = bufferedReader2.readLine();
                                            cArr = new char[]{8753};
                                            iIndexOf = TextUtils.indexOf("", "");
                                            i16 = 4348;
                                        } else {
                                            line = bufferedReader2.readLine();
                                            cArr = new char[]{8753};
                                            iIndexOf = TextUtils.indexOf("", "");
                                            i16 = 2309;
                                        }
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i96 = iIndexOf * (-167);
                                        int i97 = i16 * (-167);
                                        int i98 = ((i96 | i97) << 1) - (i97 ^ i96);
                                        int i99 = b;
                                        int i100 = i99 + 115;
                                        TuitionPaymentFragmentbindingInflater1 = i100 % 128;
                                        int i101 = i100 % 2;
                                        int i102 = ~iIndexOf;
                                        int i103 = ~i16;
                                        int i104 = ~(i102 | i103);
                                        int i105 = ~((i103 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i103 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                        int i106 = i98 + (((i104 ^ i105) | (i105 & i104)) * 336);
                                        int i107 = ~((iIndexOf ^ i16) | (iIndexOf & i16));
                                        int i108 = ~((iIndexOf ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (iIndexOf & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                        int i109 = -(-(((i107 & i108) | (i107 ^ i108)) * (-168)));
                                        int i110 = (i106 ^ i109) + ((i106 & i109) << 1);
                                        int i111 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i112 = i99 + 41;
                                        TuitionPaymentFragmentbindingInflater1 = i112 % 128;
                                        int i113 = i112 % 2;
                                        int i114 = i110 + (168 * ((~(i111 | iIndexOf)) | i103));
                                        Object[] objArr10 = new Object[1];
                                        a(cArr, i114, objArr10);
                                        boolean zEquals2 = line.equals((String) objArr10[0]);
                                        fileReader2.close();
                                        bufferedReader2.close();
                                        if (zEquals2) {
                                            try {
                                                Object[] objArr11 = new Object[1];
                                                a(new char[]{8751, 65490, 39227, 47760, 21675, 30286, 5027, 11541, 53094, 59596, 35366, 42948, 16872, 25416, 15532, 56858, 63607, 38302, 46886, 20609, 29429, 3158, 10687, 51993, 58751, 34454, 41006, 32137, 8189, 14686, 55991, 62481, 38471, 45982, 19725, 28525}, 56735 - (~(-TextUtils.indexOf((CharSequence) "", '0', 0, 0))), objArr11);
                                                File file3 = new File((String) objArr11[0]);
                                                int i115 = b;
                                                int i116 = (i115 ^ 79) + ((i115 & 79) << 1);
                                                TuitionPaymentFragmentbindingInflater1 = i116 % 128;
                                                int i117 = i116 % 2;
                                                if (file3.canRead()) {
                                                    FileReader fileReader3 = new FileReader(file3);
                                                    BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                                    try {
                                                        String line3 = bufferedReader3.readLine();
                                                        char[] cArr4 = {8753};
                                                        int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                        int i118 = jumpTapTimeout * 934;
                                                        int i119 = (i118 & (-2151988)) + (i118 | (-2151988));
                                                        int i120 = ~jumpTapTimeout;
                                                        int i121 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                        int i122 = ~(i120 | i121);
                                                        int i123 = -(-(((i122 & (-2310)) | ((-2310) ^ i122)) * (-933)));
                                                        int i124 = ((i119 | i123) << 1) - (i123 ^ i119);
                                                        int i125 = ~((i121 & (-2310)) | ((-2310) ^ i121));
                                                        int i126 = b + 119;
                                                        TuitionPaymentFragmentbindingInflater1 = i126 % 128;
                                                        int i127 = i126 % 2;
                                                        int i128 = i124 + (933 * (i125 | (~(((-2310) ^ jumpTapTimeout) | ((-2310) & jumpTapTimeout))))) + ((~(jumpTapTimeout | 2309)) * 933);
                                                        Object[] objArr12 = new Object[1];
                                                        a(cArr4, i128, objArr12);
                                                        zEquals = line3.equals((String) objArr12[0]);
                                                        fileReader3.close();
                                                        bufferedReader3.close();
                                                    } catch (Throwable th2) {
                                                        fileReader3.close();
                                                        bufferedReader3.close();
                                                        throw th2;
                                                    }
                                                } else {
                                                    int i129 = TuitionPaymentFragmentbindingInflater1 + 21;
                                                    b = i129 % 128;
                                                    int i130 = i129 % 2;
                                                    zEquals = false;
                                                }
                                            } catch (Exception unused3) {
                                            }
                                            if (zEquals) {
                                                int i131 = TuitionPaymentFragmentbindingInflater1;
                                                int i132 = ((i131 | 71) << 1) - (i131 ^ 71);
                                                b = i132 % 128;
                                                int i133 = i132 % 2;
                                                if (str2 != null) {
                                                    int i134 = ((i131 | 7) << 1) - (i131 ^ 7);
                                                    int i135 = i134 % 128;
                                                    b = i135;
                                                    if (i134 % 2 != 0) {
                                                        objArr = new Object[3];
                                                        c2 = 0;
                                                        objArr[0] = new int[1];
                                                        i17 = 75;
                                                    } else {
                                                        c2 = 0;
                                                        objArr = new Object[2];
                                                        objArr[0] = new int[1];
                                                        i17 = 20;
                                                    }
                                                    int[] iArr = (int[]) objArr[c2];
                                                    int i136 = (i135 ^ 107) + ((i135 & 107) << 1);
                                                    TuitionPaymentFragmentbindingInflater1 = i136 % 128;
                                                    int i137 = i136 % 2;
                                                    iArr[0] = i17 ^ i11;
                                                    objArr[1] = new String[]{str2};
                                                    c = 0;
                                                }
                                            }
                                        }
                                        int i138 = ((int[]) objArr[c])[c];
                                        int i139 = ((~i75) & i11) | (i75 & i67);
                                        int i140 = -i139;
                                        int i141 = ((i139 & i140) | (i139 ^ i140)) >> 31;
                                        int i142 = (~i141) & i138;
                                        int i143 = b + 67;
                                        int i144 = i143 % 128;
                                        TuitionPaymentFragmentbindingInflater1 = i144;
                                        int i145 = i143 % 2;
                                        int i146 = i141 & i75;
                                        int i147 = (i146 & i142) | (i142 ^ i146);
                                        String[] strArr2 = (String[]) objArr[1];
                                        Object[] objArr13 = new Object[2];
                                        int i148 = (i138 | i11) & (~(i11 & i138));
                                        int i149 = ((i148 | (-i148)) >> 31) & 1;
                                        int i150 = -i149;
                                        int i151 = (~(((i150 & i149) | (i149 ^ i150)) >> 31)) & 1;
                                        objArr13[i149] = null;
                                        objArr13[i151] = strArr2;
                                        String[] strArr3 = (String[]) objArr13[0];
                                        int i152 = (i144 & 109) + (i144 | 109);
                                        b = i152 % 128;
                                        int i153 = i152 % 2;
                                        int i154 = ((~i147) & i11) | (i147 & i67);
                                        int i155 = ((i154 | (-i154)) >> 31) & 16;
                                        Object[] objArr14 = {new int[]{i11}, new int[1], new int[]{i147}, strArr3};
                                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                        int i156 = ~elapsedCpuTime;
                                        int i157 = ~(105195985 | i156);
                                        int i158 = (-798805788) + (((-132070398) | i157) * (-712)) + (((~(elapsedCpuTime | (-26874413))) | (~(i156 | 132070397))) * (-712)) + ((64885756 | i157) * 712);
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i159 = i155 * (-209);
                                        int i160 = -(-(i158 * (-209)));
                                        int i161 = (i159 & i160) + (i159 | i160);
                                        int i162 = ~i155;
                                        int i163 = -(-((~((~i158) | i162)) * 210));
                                        int i164 = (i161 ^ i163) + ((i163 & i161) << 1);
                                        int i165 = ~i158;
                                        int i166 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i167 = ~((i165 ^ i166) | (i165 & i166));
                                        int i168 = ~((i162 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i162 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                        int i169 = i164 + (((i168 & i167) | (i167 ^ i168)) * 210);
                                        int i170 = (~i155) | i166;
                                        int i171 = ((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault3 | i165 | i155)) | (~((i170 & i158) | (i170 ^ i158)))) * 210;
                                        int i172 = (i169 & i171) + (i171 | i169);
                                        int i173 = (i12 & i172) + (i12 | i172);
                                        int i174 = i173 ^ (i173 << 13);
                                        int i175 = i174 >>> 17;
                                        int i176 = ((~i174) & i175) | ((~i175) & i174);
                                        int i177 = i176 << 5;
                                        ((int[]) objArr14[1])[0] = (i176 | i177) & (~(i176 & i177));
                                        return objArr14;
                                    } catch (Throwable th3) {
                                        fileReader2.close();
                                        bufferedReader2.close();
                                        throw th3;
                                    }
                                }
                                int i178 = TuitionPaymentFragmentbindingInflater1;
                                int i179 = ((i178 | 93) << 1) - (i178 ^ 93);
                                b = i179 % 128;
                                int i180 = i179 % 2;
                            } catch (Exception unused4) {
                            }
                            int i181 = TuitionPaymentFragmentbindingInflater1;
                            int i182 = ((i181 | 69) << 1) - (i181 ^ 69);
                            b = i182 % 128;
                            int i183 = i182 % 2;
                            c = 0;
                            objArr = new Object[]{new int[]{i11}, new String[0]};
                            int i1310 = ((int[]) objArr[c])[c];
                            int i1311 = ((~i75) & i11) | (i75 & i67);
                            int i1410 = -i1311;
                            int i1411 = ((i1311 & i1410) | (i1311 ^ i1410)) >> 31;
                            int i1412 = (~i1411) & i1310;
                            int i1413 = b + 67;
                            int i1414 = i1413 % 128;
                            TuitionPaymentFragmentbindingInflater1 = i1414;
                            int i1415 = i1413 % 2;
                            int i1416 = i1411 & i75;
                            int i1417 = (i1416 & i1412) | (i1412 ^ i1416);
                            String[] strArr4 = (String[]) objArr[1];
                            Object[] objArr15 = new Object[2];
                            int i1418 = (i1310 | i11) & (~(i11 & i1310));
                            int i1419 = ((i1418 | (-i1418)) >> 31) & 1;
                            int i1510 = -i1419;
                            int i1511 = (~(((i1510 & i1419) | (i1419 ^ i1510)) >> 31)) & 1;
                            objArr15[i1419] = null;
                            objArr15[i1511] = strArr4;
                            String[] strArr5 = (String[]) objArr15[0];
                            int i1512 = (i1414 & 109) + (i1414 | 109);
                            b = i1512 % 128;
                            int i1513 = i1512 % 2;
                            int i1514 = ((~i1417) & i11) | (i1417 & i67);
                            int i1515 = ((i1514 | (-i1514)) >> 31) & 16;
                            Object[] objArr16 = {new int[]{i11}, new int[1], new int[]{i1417}, strArr5};
                            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                            int i1516 = ~elapsedCpuTime2;
                            int i1517 = ~(105195985 | i1516);
                            int i1518 = (-798805788) + (((-132070398) | i1517) * (-712)) + (((~(elapsedCpuTime2 | (-26874413))) | (~(i1516 | 132070397))) * (-712)) + ((64885756 | i1517) * 712);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i1519 = i1515 * (-209);
                            int i1610 = -(-(i1518 * (-209)));
                            int i1611 = (i1519 & i1610) + (i1519 | i1610);
                            int i1612 = ~i1515;
                            int i1613 = -(-((~((~i1518) | i1612)) * 210));
                            int i1614 = (i1611 ^ i1613) + ((i1613 & i1611) << 1);
                            int i1615 = ~i1518;
                            int i1616 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                            int i1617 = ~((i1615 ^ i1616) | (i1615 & i1616));
                            int i1618 = ~((i1612 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i1612 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                            int i1619 = i1614 + (((i1618 & i1617) | (i1617 ^ i1618)) * 210);
                            int i1710 = (~i1515) | i1616;
                            int i1711 = ((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault4 | i1615 | i1515)) | (~((i1710 & i1518) | (i1710 ^ i1518)))) * 210;
                            int i1712 = (i1619 & i1711) + (i1711 | i1619);
                            int i1713 = (i12 & i1712) + (i12 | i1712);
                            int i1714 = i1713 ^ (i1713 << 13);
                            int i1715 = i1714 >>> 17;
                            int i1716 = ((~i1714) & i1715) | ((~i1715) & i1714);
                            int i1717 = i1716 << 5;
                            ((int[]) objArr16[1])[0] = (i1716 | i1717) & (~(i1716 & i1717));
                            return objArr16;
                        } catch (Throwable th4) {
                            Throwable cause = th4.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th4;
                        }
                    }
                });
            }
            str = "failure_create_mandiri_dd";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            registerAutoDebetActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            if (Intrinsics.areEqual(((PaymentMethodResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getStatus(), "REQUIRES_ACTION")) {
                CustomerObject customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CustomerObject.TuitionPaymentFragmentspecialinlinedviewModeldefault2((CustomerObject) registerAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue(), null, null, null, null, null, ((PaymentMethodResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getReferenceId(), null, null, ((PaymentMethodResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getPmId(), null, registerAutoDebetActivity.isConnected, registerAutoDebetActivity.getItem, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -3361, 2047);
                PaymentAuthenticationActivity.Companion bVar = PaymentAuthenticationActivity.INSTANCE;
                List<ActionLinkingStatus> actionsPmLinking = ((PaymentMethodResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getActionsPmLinking();
                Intrinsics.checkNotNull(actionsPmLinking);
                PaymentAuthenticationActivity.Companion.TuitionPaymentFragmentbindingInflater1(registerAutoDebetActivity, new UrlAuthentication(actionsPmLinking.get(0).getUrl().toString(), ((PaymentMethodResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDirectDebitInfo().getDirectDebitChannelProperties().getSuccessReturnUrl(), ((PaymentMethodResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDirectDebitInfo().getDirectDebitChannelProperties().getFailureReturnUrl()), customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                int i11 = unsubscribe + 31;
                MediaBrowserCompatCallbackHandler = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 5 % 2;
                }
            } else {
                ((PaymentMethodResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getStatus();
            }
            str = "success_create_mandiri_dd";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_tuition_payment", str));
        Intrinsics.checkNotNullParameter(registerAutoDebetActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        int i13 = MediaBrowserCompatCallbackHandler + 49;
        unsubscribe = i13 % 128;
        int i14 = i13 % 2;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(RegisterAutoDebetActivity registerAutoDebetActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        int i2 = unsubscribe + 43;
        int i3 = i2 % 128;
        MediaBrowserCompatCallbackHandler = i3;
        if (i2 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            ((ActivityRegisterAutoDebetBinding) ((ViewBinding) registerAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).srlPaymentMethodAutoDebit.setRefreshing(false);
            int i4 = MediaBrowserCompatCallbackHandler + 77;
            unsubscribe = i4 % 128;
            int i5 = i4 % 2;
            str = "loading_get_list_payment_method_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ((ActivityRegisterAutoDebetBinding) ((ViewBinding) registerAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).srlPaymentMethodAutoDebit.setRefreshing(false);
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registerAutoDebetActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: getRight
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RegisterAutoDebetActivity.getInterfaceDescriptor();
                }
            });
            str = "failure_get_list_payment_method_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i6 = i3 + 119;
            unsubscribe = i6 % 128;
            int i7 = i6 % 2;
            ((ActivityRegisterAutoDebetBinding) ((ViewBinding) registerAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).srlPaymentMethodAutoDebit.setRefreshing(false);
            registerAutoDebetActivity.INotificationSideChannelStubProxy = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            registerAutoDebetActivity.INotificationSideChannelStubProxy();
            int i8 = unsubscribe + 33;
            MediaBrowserCompatCallbackHandler = i8 % 128;
            int i9 = i8 % 2;
            str = "success_get_list_payment_method_result";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_get_list_payment_method", str));
        Intrinsics.checkNotNullParameter(registerAutoDebetActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ CustomerObject TuitionPaymentFragmentspecialinlinedviewModeldefault2(RegisterAutoDebetActivity registerAutoDebetActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCallbackHandler + 13;
        unsubscribe = i2 % 128;
        if (i2 % 2 != 0) {
            Parcelable parcelableExtra = registerAutoDebetActivity.getIntent().getParcelableExtra("customer_object_recurring");
            Intrinsics.checkNotNull(parcelableExtra);
            throw null;
        }
        Parcelable parcelableExtra2 = registerAutoDebetActivity.getIntent().getParcelableExtra("customer_object_recurring");
        Intrinsics.checkNotNull(parcelableExtra2);
        CustomerObject customerObject = (CustomerObject) parcelableExtra2;
        int i3 = MediaBrowserCompatCallbackHandler + 63;
        unsubscribe = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 29 / 0;
        }
        return customerObject;
    }

    public static /* synthetic */ Unit d() {
        int i = 2 % 2;
        int i2 = unsubscribe + 23;
        MediaBrowserCompatCallbackHandler = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompatCallbackHandler + 109;
        unsubscribe = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        RegisterAutoDebetActivity registerAutoDebetActivity = (RegisterAutoDebetActivity) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[1], "");
        if (registerAutoDebetActivity.b) {
            int i2 = MediaBrowserCompatCallbackHandler + 61;
            unsubscribe = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                registerAutoDebetActivity.getItem = "LINKAJA";
                boolean z = registerAutoDebetActivity.g;
                obj.hashCode();
                throw null;
            }
            registerAutoDebetActivity.getItem = "LINKAJA";
            String strValueOf = registerAutoDebetActivity.g ? String.valueOf(registerAutoDebetActivity.getRoot.get(0).getPaymentMethodId()) : "";
            CustomerObject customerObject = (CustomerObject) registerAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            String str = registerAutoDebetActivity.getItem;
            String str2 = registerAutoDebetActivity.isConnected;
            boolean z2 = registerAutoDebetActivity.d;
            boolean z3 = registerAutoDebetActivity.a;
            boolean z4 = registerAutoDebetActivity.asInterface;
            boolean z5 = registerAutoDebetActivity.asBinder;
            LinkedAccountDirectDebit linkedAccountDirectDebit = registerAutoDebetActivity.INotificationSideChannel;
            LinkedAccountEwallet linkedAccountEwallet = registerAutoDebetActivity.getInterfaceDescriptor;
            LinkedAccountEwallet linkedAccountEwallet2 = registerAutoDebetActivity.cancelAll;
            LinkedAccountEwallet linkedAccountEwallet3 = registerAutoDebetActivity.cancel;
            boolean z6 = registerAutoDebetActivity.g;
            CustomerObject customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CustomerObject.TuitionPaymentFragmentspecialinlinedviewModeldefault2(customerObject, null, null, null, null, null, null, null, null, strValueOf, null, str2, str, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, Boolean.valueOf(z2), linkedAccountDirectDebit, Boolean.valueOf(registerAutoDebetActivity.onTransact), registerAutoDebetActivity.notify, Boolean.valueOf(z3), linkedAccountEwallet2, Boolean.valueOf(z4), linkedAccountEwallet3, Boolean.valueOf(z5), linkedAccountEwallet, Boolean.valueOf(z6), registerAutoDebetActivity.INotificationSideChannelStub, null, null, 536867583, 1536);
            if (registerAutoDebetActivity.g) {
                int i3 = MediaBrowserCompatCallbackHandler + 33;
                unsubscribe = i3 % 128;
                if (i3 % 2 != 0) {
                    LinkingAccountPaymentActivity.Companion tuitionPaymentFragmentbindingInflater1 = LinkingAccountPaymentActivity.INSTANCE;
                    LinkingAccountPaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registerAutoDebetActivity, customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    obj.hashCode();
                    throw null;
                }
                LinkingAccountPaymentActivity.Companion tuitionPaymentFragmentbindingInflater2 = LinkingAccountPaymentActivity.INSTANCE;
                LinkingAccountPaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registerAutoDebetActivity, customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            } else {
                TermsConditionRecurringActivity.Companion tuitionPaymentFragmentbindingInflater3 = TermsConditionRecurringActivity.INSTANCE;
                TermsConditionRecurringActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registerAutoDebetActivity, customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit g() {
        Unit unit;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCallbackHandler + 125;
        unsubscribe = i2 % 128;
        if (i2 % 2 != 0) {
            unit = Unit.INSTANCE;
            int i3 = 36 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = MediaBrowserCompatCallbackHandler + 97;
        unsubscribe = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(RegisterAutoDebetActivity registerAutoDebetActivity, View view) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCallbackHandler + 33;
        unsubscribe = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (registerAutoDebetActivity.b) {
            int i4 = unsubscribe + 73;
            MediaBrowserCompatCallbackHandler = i4 % 128;
            if (i4 % 2 == 0) {
                registerAutoDebetActivity.getItem = "SHOPEEPAY";
                boolean z = registerAutoDebetActivity.asInterface;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            registerAutoDebetActivity.getItem = "SHOPEEPAY";
            String strValueOf = registerAutoDebetActivity.asInterface ? String.valueOf(registerAutoDebetActivity.IconCompatParcelizer.get(0).getPaymentMethodId()) : "";
            CustomerObject customerObject = (CustomerObject) registerAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            String str = registerAutoDebetActivity.getItem;
            String str2 = registerAutoDebetActivity.isConnected;
            boolean z2 = registerAutoDebetActivity.d;
            boolean z3 = registerAutoDebetActivity.a;
            boolean z4 = registerAutoDebetActivity.asInterface;
            boolean z5 = registerAutoDebetActivity.asBinder;
            LinkedAccountDirectDebit linkedAccountDirectDebit = registerAutoDebetActivity.INotificationSideChannel;
            LinkedAccountEwallet linkedAccountEwallet = registerAutoDebetActivity.getInterfaceDescriptor;
            LinkedAccountEwallet linkedAccountEwallet2 = registerAutoDebetActivity.cancelAll;
            LinkedAccountEwallet linkedAccountEwallet3 = registerAutoDebetActivity.cancel;
            boolean z6 = registerAutoDebetActivity.g;
            CustomerObject customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CustomerObject.TuitionPaymentFragmentspecialinlinedviewModeldefault2(customerObject, null, null, null, null, null, null, null, null, strValueOf, null, str2, str, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, Boolean.valueOf(z2), linkedAccountDirectDebit, Boolean.valueOf(registerAutoDebetActivity.onTransact), registerAutoDebetActivity.notify, Boolean.valueOf(z3), linkedAccountEwallet2, Boolean.valueOf(z4), linkedAccountEwallet3, Boolean.valueOf(z5), linkedAccountEwallet, Boolean.valueOf(z6), registerAutoDebetActivity.INotificationSideChannelStub, null, null, 536867583, 1536);
            if (registerAutoDebetActivity.asInterface) {
                int i5 = MediaBrowserCompatCallbackHandler + 75;
                unsubscribe = i5 % 128;
                if (i5 % 2 != 0) {
                    LinkingAccountPaymentActivity.Companion tuitionPaymentFragmentbindingInflater1 = LinkingAccountPaymentActivity.INSTANCE;
                    LinkingAccountPaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registerAutoDebetActivity, customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    int i6 = 43 / 0;
                } else {
                    LinkingAccountPaymentActivity.Companion tuitionPaymentFragmentbindingInflater2 = LinkingAccountPaymentActivity.INSTANCE;
                    LinkingAccountPaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registerAutoDebetActivity, customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            } else {
                TermsConditionRecurringActivity.Companion tuitionPaymentFragmentbindingInflater3 = TermsConditionRecurringActivity.INSTANCE;
                TermsConditionRecurringActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registerAutoDebetActivity, customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        int i2 = unsubscribe + 21;
        MediaBrowserCompatCallbackHandler = i2 % 128;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = MediaBrowserCompatCallbackHandler + 81;
        unsubscribe = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static /* synthetic */ Unit b(RegisterAutoDebetActivity registerAutoDebetActivity, View view) {
        int i = 2 % 2;
        int i2 = unsubscribe + 107;
        MediaBrowserCompatCallbackHandler = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        CustomerObject customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CustomerObject.TuitionPaymentFragmentspecialinlinedviewModeldefault2((CustomerObject) registerAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue(), null, null, null, null, null, null, null, null, null, null, null, "BNI", null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2049, 2047);
        TermsConditionRecurringActivity.Companion tuitionPaymentFragmentbindingInflater1 = TermsConditionRecurringActivity.INSTANCE;
        TermsConditionRecurringActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registerAutoDebetActivity, customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompatCallbackHandler + 45;
        unsubscribe = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(RegisterAutoDebetActivity registerAutoDebetActivity) {
        int i = 2 % 2;
        String string = registerAutoDebetActivity.isConnected.toString();
        Intrinsics.checkNotNullParameter(string, "");
        ((ListPopupWindow2) registerAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new GetListPaymentMethodRequest(string));
        Unit unit = Unit.INSTANCE;
        int i2 = MediaBrowserCompatCallbackHandler + 39;
        unsubscribe = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static /* synthetic */ void b(RegisterAutoDebetActivity registerAutoDebetActivity) {
        int i = 2 % 2;
        ViewPortBuilder.g();
        try {
            registerAutoDebetActivity.b = false;
            String str = registerAutoDebetActivity.isConnected;
            Intrinsics.checkNotNullParameter(str, "");
            ((ListPopupWindow2) registerAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new GetListPaymentMethodRequest(str));
            ViewPortBuilder.asBinder();
            int i2 = MediaBrowserCompatCallbackHandler + 117;
            unsubscribe = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.asBinder();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        RegisterAutoDebetActivity registerAutoDebetActivity = (RegisterAutoDebetActivity) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[1], "");
        if (registerAutoDebetActivity.b) {
            int i2 = MediaBrowserCompatCallbackHandler + 109;
            unsubscribe = i2 % 128;
            int i3 = i2 % 2;
            registerAutoDebetActivity.getItem = "DANA";
            String strValueOf = registerAutoDebetActivity.asBinder ? String.valueOf(registerAutoDebetActivity.disconnect.get(0).getPaymentMethodId()) : "";
            CustomerObject customerObject = (CustomerObject) registerAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            String str = registerAutoDebetActivity.getItem;
            String str2 = registerAutoDebetActivity.isConnected;
            boolean z = registerAutoDebetActivity.d;
            boolean z2 = registerAutoDebetActivity.a;
            boolean z3 = registerAutoDebetActivity.asInterface;
            boolean z4 = registerAutoDebetActivity.asBinder;
            LinkedAccountDirectDebit linkedAccountDirectDebit = registerAutoDebetActivity.INotificationSideChannel;
            LinkedAccountEwallet linkedAccountEwallet = registerAutoDebetActivity.getInterfaceDescriptor;
            LinkedAccountEwallet linkedAccountEwallet2 = registerAutoDebetActivity.cancelAll;
            boolean z5 = registerAutoDebetActivity.g;
            CustomerObject customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CustomerObject.TuitionPaymentFragmentspecialinlinedviewModeldefault2(customerObject, null, null, null, null, null, null, null, null, strValueOf, null, str2, str, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, Boolean.valueOf(z), linkedAccountDirectDebit, Boolean.valueOf(registerAutoDebetActivity.onTransact), registerAutoDebetActivity.notify, Boolean.valueOf(z2), linkedAccountEwallet2, Boolean.valueOf(z3), null, Boolean.valueOf(z4), linkedAccountEwallet, Boolean.valueOf(z5), registerAutoDebetActivity.INotificationSideChannelStub, null, null, 536867583, 1552);
            if (registerAutoDebetActivity.asBinder) {
                int i4 = MediaBrowserCompatCallbackHandler + 21;
                unsubscribe = i4 % 128;
                if (i4 % 2 != 0) {
                    LinkingAccountPaymentActivity.Companion tuitionPaymentFragmentbindingInflater1 = LinkingAccountPaymentActivity.INSTANCE;
                    LinkingAccountPaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registerAutoDebetActivity, customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    int i5 = 17 / 0;
                } else {
                    LinkingAccountPaymentActivity.Companion tuitionPaymentFragmentbindingInflater2 = LinkingAccountPaymentActivity.INSTANCE;
                    LinkingAccountPaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registerAutoDebetActivity, customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
                int i6 = MediaBrowserCompatCallbackHandler + 19;
                unsubscribe = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 4 % 3;
                }
            } else {
                TermsConditionRecurringActivity.Companion tuitionPaymentFragmentbindingInflater3 = TermsConditionRecurringActivity.INSTANCE;
                TermsConditionRecurringActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registerAutoDebetActivity, customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(RegisterAutoDebetActivity registerAutoDebetActivity, View view) {
        int i = 2 % 2;
        int i2 = unsubscribe + 45;
        MediaBrowserCompatCallbackHandler = i2 % 128;
        int i3 = i2 % 2;
        String strValueOf = "";
        Intrinsics.checkNotNullParameter(view, "");
        if (registerAutoDebetActivity.b) {
            registerAutoDebetActivity.getItem = "MANDIRI";
            if (registerAutoDebetActivity.onTransact) {
                int i4 = MediaBrowserCompatCallbackHandler + 49;
                unsubscribe = i4 % 128;
                strValueOf = i4 % 2 != 0 ? String.valueOf(registerAutoDebetActivity.connect.get(1).getPaymentMethodId()) : String.valueOf(registerAutoDebetActivity.connect.get(0).getPaymentMethodId());
            }
            String str = strValueOf;
            CustomerObject customerObject = (CustomerObject) registerAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            String str2 = registerAutoDebetActivity.getItem;
            String str3 = registerAutoDebetActivity.isConnected;
            boolean z = registerAutoDebetActivity.d;
            boolean z2 = registerAutoDebetActivity.a;
            boolean z3 = registerAutoDebetActivity.asInterface;
            boolean z4 = registerAutoDebetActivity.asBinder;
            LinkedAccountDirectDebit linkedAccountDirectDebit = registerAutoDebetActivity.INotificationSideChannel;
            LinkedAccountEwallet linkedAccountEwallet = registerAutoDebetActivity.getInterfaceDescriptor;
            LinkedAccountEwallet linkedAccountEwallet2 = registerAutoDebetActivity.cancelAll;
            LinkedAccountEwallet linkedAccountEwallet3 = registerAutoDebetActivity.cancel;
            boolean z5 = registerAutoDebetActivity.g;
            CustomerObject customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CustomerObject.TuitionPaymentFragmentspecialinlinedviewModeldefault2(customerObject, null, null, null, null, null, null, null, null, str, null, str3, str2, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, Boolean.valueOf(z), linkedAccountDirectDebit, Boolean.valueOf(registerAutoDebetActivity.onTransact), registerAutoDebetActivity.notify, Boolean.valueOf(z2), linkedAccountEwallet2, Boolean.valueOf(z3), linkedAccountEwallet3, Boolean.valueOf(z4), linkedAccountEwallet, Boolean.valueOf(z5), registerAutoDebetActivity.INotificationSideChannelStub, null, null, 536867583, 1536);
            if (registerAutoDebetActivity.onTransact) {
                LinkingAccountPaymentActivity.Companion tuitionPaymentFragmentbindingInflater1 = LinkingAccountPaymentActivity.INSTANCE;
                LinkingAccountPaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registerAutoDebetActivity, customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            } else {
                TermsConditionRecurringActivity.Companion tuitionPaymentFragmentbindingInflater2 = TermsConditionRecurringActivity.INSTANCE;
                TermsConditionRecurringActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registerAutoDebetActivity, customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void asBinder(RegisterAutoDebetActivity registerAutoDebetActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            int i2 = MediaBrowserCompatCallbackHandler + 93;
            unsubscribe = i2 % 128;
            if (i2 % 2 == 0) {
                registerAutoDebetActivity.MediaBrowserCompat();
                return;
            } else {
                registerAutoDebetActivity.MediaBrowserCompat();
                throw null;
            }
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            registerAutoDebetActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registerAutoDebetActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: getLeft
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    return (Unit) RegisterAutoDebetActivity.TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 243228736, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[0], iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -243228734, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                }
            });
            int i3 = MediaBrowserCompatCallbackHandler + 101;
            unsubscribe = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            return;
        }
        registerAutoDebetActivity.IconCompatParcelizer();
        RegisterRecurringSuccessActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = RegisterRecurringSuccessActivity.INSTANCE;
        RegisterRecurringSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registerAutoDebetActivity, (CustomerObject) registerAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Proses pendaftaran autodebit berhasil", 0).show();
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = unsubscribe + 7;
        MediaBrowserCompatCallbackHandler = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = unsubscribe + 9;
        MediaBrowserCompatCallbackHandler = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        RegisterAutoDebetActivity registerAutoDebetActivity = (RegisterAutoDebetActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCallbackHandler + 49;
        unsubscribe = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            obj.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            registerAutoDebetActivity.MediaBrowserCompat();
            return null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            registerAutoDebetActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registerAutoDebetActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: updateConfiguration
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RegisterAutoDebetActivity.INotificationSideChannel();
                }
            });
            return null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            registerAutoDebetActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            if (Intrinsics.areEqual(((PaymentMethodItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getStatus(), "REQUIRES_ACTION")) {
                CustomerObject customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CustomerObject.TuitionPaymentFragmentspecialinlinedviewModeldefault2((CustomerObject) registerAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue(), null, null, null, null, null, ((PaymentMethodItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getReferenceId().toString(), null, null, ((PaymentMethodItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getPaymentMethodId(), null, registerAutoDebetActivity.isConnected.toString(), registerAutoDebetActivity.getItem, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -3361, 2047);
                registerAutoDebetActivity.INotificationSideChannelStubProxy.add((PaymentMethodItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                registerAutoDebetActivity.INotificationSideChannelStubProxy();
                PaymentAuthenticationActivity.Companion bVar = PaymentAuthenticationActivity.INSTANCE;
                List<ActionLinkingStatus> actionLinkingStatus = ((PaymentMethodItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getActionLinkingStatus();
                Intrinsics.checkNotNull(actionLinkingStatus);
                PaymentAuthenticationActivity.Companion.TuitionPaymentFragmentbindingInflater1(registerAutoDebetActivity, new UrlAuthentication(actionLinkingStatus.get(0).getUrl(), ((PaymentMethodItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getEwallet().getEwalletChannelProperties().getSuccessReturnUrl(), ((PaymentMethodItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getEwallet().getEwalletChannelProperties().getFailureReturnUrl()), customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                return null;
            }
            ((PaymentMethodItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getStatus();
        }
        int i3 = unsubscribe + 39;
        MediaBrowserCompatCallbackHandler = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public static /* synthetic */ Unit INotificationSideChannel() {
        Unit unit;
        int i = 2 % 2;
        int i2 = unsubscribe + 5;
        MediaBrowserCompatCallbackHandler = i2 % 128;
        if (i2 % 2 == 0) {
            unit = Unit.INSTANCE;
            int i3 = 38 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = unsubscribe + 97;
        MediaBrowserCompatCallbackHandler = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = unsubscribe + 87;
        MediaBrowserCompatCallbackHandler = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = unsubscribe + 69;
        MediaBrowserCompatCallbackHandler = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegisterAutoDebetActivity registerAutoDebetActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        String str2;
        String str3;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            registerAutoDebetActivity.MediaBrowserCompat();
            str = "loading_get_customer_object";
            int i2 = unsubscribe + 101;
            MediaBrowserCompatCallbackHandler = i2 % 128;
            int i3 = i2 % 2;
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            registerAutoDebetActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registerAutoDebetActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: setAllowCollapse
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RegisterAutoDebetActivity.g();
                }
            });
            str = "failure_get_customer_object";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i4 = MediaBrowserCompatCallbackHandler + 45;
            unsubscribe = i4 % 128;
            int i5 = i4 % 2;
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            if (((List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).size() > 0) {
                registerAutoDebetActivity.isConnected = String.valueOf(((CustomerObjectItem) ((List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).get(0)).getCustomerId());
                String strValueOf = String.valueOf(((CustomerObjectItem) ((List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).get(0)).getCustomerId());
                Intrinsics.checkNotNullParameter(strValueOf, "");
                ((ListPopupWindow2) registerAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new GetListPaymentMethodRequest(strValueOf));
            } else {
                ListPopupWindow2 listPopupWindow2 = (ListPopupWindow2) registerAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                User user = (User) registerAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                String strValueOf2 = String.valueOf(user != null ? user.b : null);
                User user2 = (User) registerAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                if (user2 != null) {
                    int i6 = MediaBrowserCompatCallbackHandler + 113;
                    unsubscribe = i6 % 128;
                    int i7 = i6 % 2;
                    str2 = user2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                } else {
                    str2 = null;
                }
                String strValueOf3 = String.valueOf(str2);
                User user3 = (User) registerAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                if (user3 != null) {
                    int i8 = MediaBrowserCompatCallbackHandler + 69;
                    unsubscribe = i8 % 128;
                    int i9 = i8 % 2;
                    str3 = user3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                } else {
                    str3 = null;
                }
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(str3));
                User user4 = (User) registerAutoDebetActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                listPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new CreateCustomerObjectRequest(strValueOf2, strValueOf3, strTuitionPaymentFragmentspecialinlinedviewModeldefault3, String.valueOf(user4 != null ? user4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null), " "));
                int i10 = MediaBrowserCompatCallbackHandler + 45;
                unsubscribe = i10 % 128;
                int i11 = i10 % 2;
            }
            registerAutoDebetActivity.IconCompatParcelizer();
            str = "success_get_customer_object";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_tuition_payment", str));
        Intrinsics.checkNotNullParameter(registerAutoDebetActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ Unit onTransact() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCallbackHandler + 123;
        unsubscribe = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = unsubscribe + 21;
        MediaBrowserCompatCallbackHandler = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void asInterface(RegisterAutoDebetActivity registerAutoDebetActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            int i2 = MediaBrowserCompatCallbackHandler + 31;
            unsubscribe = i2 % 128;
            int i3 = i2 % 2;
            registerAutoDebetActivity.MediaBrowserCompat();
            str = "loading_create_customer_object";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            registerAutoDebetActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registerAutoDebetActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: getEnd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RegisterAutoDebetActivity.onTransact();
                }
            });
            str = "failure_create_customer_object";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i4 = MediaBrowserCompatCallbackHandler + 41;
            unsubscribe = i4 % 128;
            int i5 = i4 % 2;
            registerAutoDebetActivity.IconCompatParcelizer();
            registerAutoDebetActivity.isConnected = String.valueOf(((CustomerObjectItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCustomerId());
            str = "success_create_customer_object";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_tuition_payment", str));
        Intrinsics.checkNotNullParameter(registerAutoDebetActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(RegisterAutoDebetActivity registerAutoDebetActivity, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 501723067, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{registerAutoDebetActivity, view}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -501723062, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    public static /* synthetic */ Unit cancelAll() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -335128066, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[0], iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 335128069, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(RegisterAutoDebetActivity registerAutoDebetActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -621411807, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{registerAutoDebetActivity, virtualCameraAdapter1}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 621411808, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegisterAutoDebetActivity registerAutoDebetActivity, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 965774782, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{registerAutoDebetActivity, view}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -965774778, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    public static /* synthetic */ Unit g(RegisterAutoDebetActivity registerAutoDebetActivity, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -69730004, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{registerAutoDebetActivity, view}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 69730010, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    public static /* synthetic */ Unit INotificationSideChannelDefault() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 243228736, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[0], iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -243228734, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    static {
        MediaBrowserCompatConnectionCallback = 1;
        RemoteActionCompatParcelizer();
        INSTANCE = new Companion(null);
        int i = subscribe + 21;
        MediaBrowserCompatConnectionCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = unsubscribe + 35;
        int i3 = i2 % 128;
        MediaBrowserCompatCallbackHandler = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 93;
        unsubscribe = i5 % 128;
        if (i5 % 2 == 0) {
            return R.layout.activity_register_auto_debet;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCallbackHandler + 83;
        unsubscribe = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_indosat_dompetku).substring(0, 16).codePointAt(13) + 958901037;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iB = SalariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$sharedViewModel$default$1.b();
        TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 1899385623, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this}, iCodePointAt, -1899385623, iB);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = unsubscribe + 17;
        MediaBrowserCompatCallbackHandler = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = unsubscribe + 77;
        MediaBrowserCompatCallbackHandler = i4 % 128;
        int i5 = i4 % 2;
    }

    static void RemoteActionCompatParcelizer() {
        getServiceComponent = (char) 65135;
        sendCustomAction = (char) 52248;
        handleMessage = (char) 45416;
        setCallbacksMessenger = (char) 42278;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, short r7, int r8) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r8 = r8 + 108
            int r6 = r6 * 4
            int r6 = 1 - r6
            byte[] r0 = com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity.$$c
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r7 = r7 + 1
            int r3 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r4 = r0[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity.$$i(byte, short, int):java.lang.String");
    }
}
