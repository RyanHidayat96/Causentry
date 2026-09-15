package com.bpjstku.presentation.membership.devicebinding;

import android.app.DatePickerDialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.devicebinding.model.request.CheckMembershipRequest;
import com.bpjstku.data.devicebinding.model.response.CheckMembershipResponse;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.queueing.model.response.AntrianData;
import com.bpjstku.data.queueing.model.response.GetDataAntrianResponse;
import com.bpjstku.data.registration.general.model.request.OcrKtpRequest;
import com.bpjstku.data.registration.general.model.response.OcrKtpResponse;
import com.bpjstku.data.registration.general.model.response.ResultOcr;
import com.bpjstku.databinding.ActivityDeviceUnlinkingBiometricBinding;
import com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1;
import com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingBiometricActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.salariedworker.KtpCameraActivity;
import com.bpjstku.presentation.membership.registration.salariedworker.KtpGuidanceActivity;
import com.bpjstku.presentation.queueing.BookingAntreanFormActivity;
import com.bpjstku.presentation.queueing.BookingAntreanSuccessActivity;
import com.bpjstku.util.utils.LocationAddressInfo;
import com.bpjstku.util.utils.UserLocationComplete;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.tasks.zzu;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.AppCompatDelegateImplApi26Impl;
import defpackage.AppCompatSpinnerDropDownAdapter;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda4;
import defpackage.CameraUseCaseAdapter;
import defpackage.ExperimentalCamera2Interop;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.OutputConfigurationCompatApi33Impl;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.deriveCodec;
import defpackage.getActivitySideSheetRoundedCornersPosition;
import defpackage.getContentPaddingRight;
import defpackage.getEventTime;
import defpackage.getStreamUseCaseSupportedCombinationList;
import defpackage.getStringOrNull;
import defpackage.getUntrustedCreatorPackageName;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import defpackage.setSplitTrack;
import defpackage.share;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0006\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0015\u001a\u00020\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0015\u0010\u0010\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0015\u0010\u001c\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000b\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\b\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u0016\u0010\n\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010\t\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010!R\u0016\u0010&\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010!R\u0016\u0010)\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010!R\u0016\u0010'\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010!R\u0018\u0010+\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010!R\u0018\u0010,\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010!R\u0018\u0010-\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u00100\u001a\u00020.8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010/R\u0017\u00103\u001a\u0004\u0018\u0001018CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b2\u0010\u0014R\u001a\u00102\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u00106R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u00106R\u0014\u0010 \u001a\u0002078UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u00108R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u0002098UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010;R\u0015\u0010=\u001a\u00020<8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0015\u0010%\u001a\u00020\f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0017\u0010\u0017\u001a\u0004\u0018\u00010\f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b+\u0010\u0014R\u0017\u0010\u0013\u001a\u0004\u0018\u00010\f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b>\u0010\u0014R\u0017\u0010#\u001a\u0004\u0018\u00010\f8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b?\u0010\u0014R\u0017\u0010\u0019\u001a\u0004\u0018\u00010\f8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b3\u0010\u0014R\u0016\u0010@\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u0010!R\u0016\u0010A\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010!R\u0016\u0010B\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010!R\u0016\u0010?\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u0010!"}, d2 = {"Lcom/bpjstku/presentation/membership/devicebinding/DeviceUnlinkingBiometricActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityDeviceUnlinkingBiometricBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "g", "", "p0", "(Ljava/lang/String;)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Z)V", "LsetSplitTrack;", "getExtras", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/data/lib/PreferenceManager;", "disconnect", "LgetUntrustedCreatorPackageName;", "getItem", "LgetStreamUseCaseSupportedCombinationList;", "sendCustomAction", "TuitionPaymentFragmentbindingInflater1", "Ljava/io/File;", "cancelAll", "Ljava/io/File;", "write", "Ljava/lang/String;", "connect", "getNotifyChildrenChangedOptions", "IconCompatParcelizer", "read", "d", "notify", "Z", "onTransact", "cancel", "INotificationSideChannel", "INotificationSideChannelStubProxy", "INotificationSideChannelDefault", "Ljava/util/Calendar;", "Ljava/util/Calendar;", "RemoteActionCompatParcelizer", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "INotificationSideChannelStub", "getInterfaceDescriptor", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResultLauncher;", "", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "LAppCompatSpinnerDropDownAdapter;", "MediaBrowserCompat", "getSessionToken", FirebaseAnalytics.Event.SEARCH, "getRoot", "isConnected", "getServiceComponent"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeviceUnlinkingBiometricActivity extends BindingBaseActivity<ActivityDeviceUnlinkingBiometricBinding> {
    private static int MediaBrowserCompatCallbackHandler;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int[] getServiceComponent;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final Lazy disconnect;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private String isConnected;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private final Lazy getInterfaceDescriptor;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    private String search;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String getRoot;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String INotificationSideChannelDefault;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Calendar RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy read;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String INotificationSideChannel;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final ActivityResultLauncher<Intent> IconCompatParcelizer;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private File b;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String cancelAll;

    /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy MediaBrowserCompat;

    /* JADX INFO: renamed from: getExtras, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private final Lazy getItem;

    /* JADX INFO: renamed from: getItem, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: getRoot, reason: from kotlin metadata */
    private String getServiceComponent;

    /* JADX INFO: renamed from: getSessionToken, reason: from kotlin metadata */
    private final Lazy getExtras;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private boolean onTransact;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final ActivityResultLauncher<Intent> INotificationSideChannelStub;

    /* JADX INFO: renamed from: search, reason: from kotlin metadata */
    private final Lazy getNotifyChildrenChangedOptions;

    /* JADX INFO: renamed from: sendCustomAction, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {58, 66, -1, 15};
    private static final int $$f = 95;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {119, -103, 14, -22, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 166;
    private static int subscribe = 1;
    private static int isConnected = 0;
    private static int unsubscribe = 1;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private String g = "";

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    private String a = "";

    /* JADX INFO: renamed from: getNotifyChildrenChangedOptions, reason: from kotlin metadata */
    private String asBinder = "";

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private String asInterface = "";

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private String d = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String cancel = "0.0";

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String notify = "0.0";

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invoke(obj);
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = (~(i7 | i3)) | i;
        int i9 = ~i3;
        int i10 = ~i;
        int i11 = (~(i9 | i10)) | i4;
        int i12 = (~(i | i9 | i4)) | (~(i7 | i9 | i10)) | (~(i10 | i3 | i4));
        int i13 = i3 + i4 + i6 + ((-104759182) * i5) + ((-453318476) * i2);
        int i14 = i13 * i13;
        int i15 = (i3 * 1504131295) + 1805123584 + (1504131295 * i4) + (179255518 * i8) + ((-358511036) * i11) + ((-179255518) * i12) + (1324875776 * i6) + (711983104 * i5) + (1180696576 * i2) + (1022754816 * i14);
        int i16 = ((i3 * (-1431886989)) - 1507491630) + (i4 * (-1431886989)) + (i8 * (-122)) + (i11 * 244) + (i12 * 122) + (i6 * (-1431886867)) + (i5 * 722567050) + (i2 * (-1618605404)) + (i14 * 297664512);
        switch (i15 + (i16 * i16 * (-277217280))) {
            case 1:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            case 2:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 3:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 4:
                return b(objArr);
            case 5:
                return d(objArr);
            case 6:
                final DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity = (DeviceUnlinkingBiometricActivity) objArr[0];
                int i17 = 2 % 2;
                DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity2 = deviceUnlinkingBiometricActivity;
                ((AppCompatSpinnerDropDownAdapter) deviceUnlinkingBiometricActivity.MediaBrowserCompat.getValue()).b.observe(deviceUnlinkingBiometricActivity2, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: setSupportOverlapAnchor
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DeviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (VirtualCameraAdapter1) obj);
                    }
                }));
                ((getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(deviceUnlinkingBiometricActivity2, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: AppCompatProgressBarHelper
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DeviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
                    }
                }));
                int i18 = unsubscribe + 55;
                isConnected = i18 % 128;
                int i19 = i18 % 2;
                return null;
            default:
                return TuitionPaymentFragmentbindingInflater1(objArr);
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
    private static void c(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingBiometricActivity.$$a
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r6 = r6 + 4
            int r7 = 53 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r3 = r7
            r4 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r6]
        L25:
            int r6 = r6 + 1
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingBiometricActivity.c(short, int, int, java.lang.Object[]):void");
    }

    public DeviceUnlinkingBiometricActivity() {
        final DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingBiometricActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setSplitTrack invoke() {
                LifecycleOwner lifecycleOwner = deviceUnlinkingBiometricActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(setSplitTrack.class);
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
        final DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingBiometricActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = deviceUnlinkingBiometricActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<getUntrustedCreatorPackageName>() { // from class: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingBiometricActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getUntrustedCreatorPackageName] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getUntrustedCreatorPackageName invoke() {
                LifecycleOwner lifecycleOwner = deviceUnlinkingBiometricActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(getUntrustedCreatorPackageName.class);
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
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<getStreamUseCaseSupportedCombinationList>() { // from class: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingBiometricActivity$special$$inlined$viewModel$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getStreamUseCaseSupportedCombinationList] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getStreamUseCaseSupportedCombinationList invoke() {
                LifecycleOwner lifecycleOwner = deviceUnlinkingBiometricActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(getStreamUseCaseSupportedCombinationList.class);
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
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        this.RemoteActionCompatParcelizer = calendar;
        this.getInterfaceDescriptor = LazyKt.lazy(new Function0() { // from class: setImageURI
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceUnlinkingBiometricActivity.a(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
        this.INotificationSideChannelStub = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: obtainLevelFromDrawable
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                DeviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (ActivityResult) obj);
            }
        });
        this.IconCompatParcelizer = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: applySupportImageTint
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                DeviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (ActivityResult) obj);
            }
        });
        this.MediaBrowserCompat = LazyKt.lazy(new Function0<AppCompatSpinnerDropDownAdapter>() { // from class: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingBiometricActivity$special$$inlined$viewModel$default$4
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [AppCompatSpinnerDropDownAdapter, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ AppCompatSpinnerDropDownAdapter invoke() {
                LifecycleOwner lifecycleOwner = deviceUnlinkingBiometricActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AppCompatSpinnerDropDownAdapter.class);
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
        this.read = LazyKt.lazy(new Function0() { // from class: applyImageLevel
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        this.disconnect = LazyKt.lazy(new Function0() { // from class: AppCompatImageButtonInspectionCompanion
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceUnlinkingBiometricActivity.g(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
        this.getExtras = LazyKt.lazy(new Function0() { // from class: AppCompatImageHelper
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
        this.getNotifyChildrenChangedOptions = LazyKt.lazy(new Function0() { // from class: AppCompatImageViewInspectionCompanion
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
        this.getItem = LazyKt.lazy(new Function0() { // from class: setInternalImageTint
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceUnlinkingBiometricActivity.b(this.b);
            }
        });
        this.getRoot = "";
        this.isConnected = "";
        this.getServiceComponent = "";
        this.search = "";
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingBiometricActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/bpjstku/presentation/membership/devicebinding/DeviceUnlinkingBiometricActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "p3", "p4", "p5", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(Context p0, String p1, String p2, String p3, String p4, String p5) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intent intent = new Intent(p0, (Class<?>) DeviceUnlinkingBiometricActivity.class);
            intent.putExtra("email", p1);
            intent.putExtra("key_jenis_form", p2);
            intent.putExtra("key_transaction_id", p3);
            intent.putExtra("key_title_message", p4);
            intent.putExtra("key_message", p5);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityDeviceUnlinkingBiometricBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = isConnected + 63;
        unsubscribe = i2 % 128;
        int i3 = i2 % 2;
        DeviceUnlinkingBiometricActivity$bindingInflater$1 deviceUnlinkingBiometricActivity$bindingInflater$1 = DeviceUnlinkingBiometricActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = unsubscribe + 83;
        isConnected = i4 % 128;
        int i5 = i4 % 2;
        return deviceUnlinkingBiometricActivity$bindingInflater$1;
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        char c = 2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getServiceComponent;
        int i4 = -1870535734;
        char c2 = '0';
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int i7 = $11 + 99;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr2[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", c2, i6) + 1);
                        int iMyPid = 3291 - (Process.myPid() >> 22);
                        int threadPriority = ((Process.getThreadPriority(i6) + 20) >> 6) + 31;
                        byte b = $$c[c];
                        byte b2 = (byte) (b + 1);
                        byte b3 = (byte) (-b);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iMyPid, threadPriority, 1948206109, false, $$i(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i9++;
                    c = 2;
                    i4 = -1870535734;
                    c2 = '0';
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getServiceComponent;
        long j = 0;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                Object[] objArr3 = new Object[i5];
                objArr3[0] = Integer.valueOf(iArr5[i10]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) - 1);
                    int iGreen = Color.green(0) + 3291;
                    int iBlue = Color.blue(0) + 31;
                    byte b4 = $$c[2];
                    byte b5 = (byte) (b4 + 1);
                    byte b6 = (byte) (-b4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, iGreen, iBlue, 1948206109, false, $$i(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i10++;
                iArr5 = iArr5;
                j = 0;
                i5 = 1;
            }
            int i11 = $11 + 101;
            $10 = i11 % 128;
            i2 = 2;
            int i12 = i11 % 2;
            iArr5 = iArr6;
        } else {
            i2 = 2;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = i2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i13 = $10 + 103;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i15 = 17;
            for (int i16 = 1; i15 > i16; i16 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2559;
                    int i17 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 28;
                    byte b7 = (byte) ($$c[2] + 1);
                    byte b8 = b7;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(absoluteGravity, fadingEdgeLength, i17, 683220507, false, $$i(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i15--;
            }
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (28879 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 347 - TextUtils.indexOf((CharSequence) "", '0'), 24 - TextUtils.indexOf((CharSequence) "", '0', 0), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
        int i20 = $11 + 5;
        $10 = i20 % 128;
        int i21 = i20 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ActivityDeviceUnlinkingBiometricBinding activityDeviceUnlinkingBiometricBinding = (ActivityDeviceUnlinkingBiometricBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityDeviceUnlinkingBiometricBinding.layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: AppCompatMultiAutoCompleteTextView
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
        MaterialButton materialButton = activityDeviceUnlinkingBiometricBinding.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: AppCompatMultiAutoCompleteTextViewInspectionCompanion
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (View) obj);
            }
        }));
        TextInputEditText textInputEditText = activityDeviceUnlinkingBiometricBinding.etTanggalLahir;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        textInputEditText.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: AppCompatPopupWindow
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2((View) obj);
            }
        }));
        EditText editText = activityDeviceUnlinkingBiometricBinding.tilTanggalLahir.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: showAsDropDown
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view};
                    int iTuitionPaymentFragmentbindingInflater1 = AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1();
                    int iTuitionPaymentFragmentbindingInflater2 = AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1();
                    DeviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentbindingInflater1, objArr, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), -1815299747, 1815299751, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater2);
                }
            });
            int i2 = isConnected + 39;
            unsubscribe = i2 % 128;
            int i3 = i2 % 2;
        }
        CardView cardView = ((ActivityDeviceUnlinkingBiometricBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).cvFotoKtp;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        cardView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getDrawableShape
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj};
                int iTuitionPaymentFragmentbindingInflater1 = AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1();
                int iTuitionPaymentFragmentbindingInflater2 = AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1();
                return (Unit) DeviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentbindingInflater1, objArr, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), -865441922, 865441925, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater2);
            }
        }));
        int i4 = isConnected + 51;
        unsubscribe = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).INotificationSideChannelStubProxy.observe(this, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: setSupportImageTintMode
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = unsubscribe + 83;
        isConnected = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit TuitionPaymentFragmentbindingInflater1(DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        int i = 2 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            int i2 = unsubscribe + 61;
            isConnected = i2 % 128;
            int i3 = i2 % 2;
            deviceUnlinkingBiometricActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            deviceUnlinkingBiometricActivity.IconCompatParcelizer();
            ResultOcr data = ((OcrKtpResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData();
            RegisteredMemberRegistration registeredMemberRegistration = null;
            if (data != null) {
                String nik = data.getNik();
                if (nik != null) {
                    if (nik.length() <= 0) {
                        int i4 = isConnected + 39;
                        unsubscribe = i4 % 128;
                        if (i4 % 2 == 0) {
                            registeredMemberRegistration.hashCode();
                            throw null;
                        }
                        nik = null;
                    }
                    if (nik != null) {
                        EditText editText = ((ActivityDeviceUnlinkingBiometricBinding) ((ViewBinding) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilNik.getEditText();
                        if (editText != null) {
                            int i5 = isConnected + 123;
                            unsubscribe = i5 % 128;
                            if (i5 % 2 == 0) {
                                editText.setText(nik);
                                registeredMemberRegistration.hashCode();
                                throw null;
                            }
                            editText.setText(nik);
                            int i6 = unsubscribe + 85;
                            isConnected = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i7 = 4 % 5;
                            }
                        }
                        deviceUnlinkingBiometricActivity.g = nik;
                    }
                }
                String nama = data.getNama();
                if (nama != null) {
                    if (nama.length() <= 0) {
                        nama = null;
                    }
                    if (nama != null) {
                        EditText editText2 = ((ActivityDeviceUnlinkingBiometricBinding) ((ViewBinding) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilNamaLengkap.getEditText();
                        if (editText2 != null) {
                            editText2.setText(nama);
                        }
                        deviceUnlinkingBiometricActivity.a = nama;
                    }
                }
                String tglLahir = data.getTglLahir();
                if (tglLahir != null) {
                    if (tglLahir.length() <= 0) {
                        int i8 = isConnected + 69;
                        unsubscribe = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 60 / 0;
                        }
                        tglLahir = null;
                    }
                    if (tglLahir != null) {
                        int i10 = isConnected + 75;
                        unsubscribe = i10 % 128;
                        int i11 = i10 % 2;
                        EditText editText3 = ((ActivityDeviceUnlinkingBiometricBinding) ((ViewBinding) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilTanggalLahir.getEditText();
                        if (editText3 != null) {
                            int i12 = unsubscribe + 69;
                            isConnected = i12 % 128;
                            int i13 = i12 % 2;
                            editText3.setText(tglLahir);
                        }
                        deviceUnlinkingBiometricActivity.asBinder = tglLahir;
                        try {
                            Date date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).parse(tglLahir);
                            if (date != null) {
                                deviceUnlinkingBiometricActivity.RemoteActionCompatParcelizer.setTime(date);
                                Unit unit = Unit.INSTANCE;
                            }
                        } catch (Exception unused) {
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                }
                String tempatLahir = data.getTempatLahir();
                if (tempatLahir != null) {
                    if (tempatLahir.length() <= 0) {
                        int i14 = unsubscribe + 33;
                        isConnected = i14 % 128;
                        int i15 = i14 % 2;
                        tempatLahir = null;
                    }
                    if (tempatLahir != null) {
                        int i16 = isConnected + 59;
                        unsubscribe = i16 % 128;
                        if (i16 % 2 == 0) {
                            deviceUnlinkingBiometricActivity.asInterface = tempatLahir;
                            throw null;
                        }
                        deviceUnlinkingBiometricActivity.asInterface = tempatLahir;
                    }
                }
                String alamat = data.getAlamat();
                if (alamat != null) {
                    int i17 = isConnected + 73;
                    unsubscribe = i17 % 128;
                    int i18 = i17 % 2;
                    if (alamat.length() <= 0) {
                        alamat = null;
                    }
                    if (alamat != null) {
                        deviceUnlinkingBiometricActivity.d = alamat;
                    }
                }
            }
            File file = deviceUnlinkingBiometricActivity.b;
            if (file != null) {
                getUntrustedCreatorPackageName getuntrustedcreatorpackagename = (getUntrustedCreatorPackageName) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) deviceUnlinkingBiometricActivity.getInterfaceDescriptor.getValue();
                getuntrustedcreatorpackagename.b.setValue(registeredMemberRegistration2 != null ? RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, file, null, null, null, 7864319) : null);
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            deviceUnlinkingBiometricActivity.IconCompatParcelizer();
            Toast.makeText(deviceUnlinkingBiometricActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        }
        return Unit.INSTANCE;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() throws NoSuchMethodException {
        int i = 2 % 2;
        DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity = this;
        Intrinsics.checkNotNullParameter(deviceUnlinkingBiometricActivity, "");
        deviceUnlinkingBiometricActivity.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivityDeviceUnlinkingBiometricBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = getString(R.string.label_string_null);
        Intrinsics.checkNotNullExpressionValue(string, "");
        boolean z = true;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        ((ActivityDeviceUnlinkingBiometricBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvTitle.setText(getString(R.string.label_verify_identity_data));
        if (!Intrinsics.areEqual((String) this.disconnect.getValue(), "KTP_BIOMETRIK")) {
            ((ActivityDeviceUnlinkingBiometricBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilNomorPeserta.setVisibility(0);
        } else {
            int i2 = isConnected + 59;
            unsubscribe = i2 % 128;
            if (i2 % 2 == 0) {
                ((ActivityDeviceUnlinkingBiometricBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilNomorPeserta.setVisibility(43);
            } else {
                ((ActivityDeviceUnlinkingBiometricBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilNomorPeserta.setVisibility(8);
            }
        }
        ExperimentalCamera2Interop.INSTANCE.b(this, new Function1() { // from class: AppCompatImageView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (UserLocationComplete) obj);
            }
        }, new Function0() { // from class: setImageResource
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
        if (this.b == null) {
            int i3 = isConnected + 89;
            unsubscribe = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        Object[] objArr = {this, Boolean.valueOf(z)};
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_billingaddress_empty).substring(18, 19).codePointAt(0) - 2139353336, objArr, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), 349144939, -349144939, getActivitySideSheetRoundedCornersPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1());
    }

    private final void g() {
        int i = 2 % 2;
        int i2 = unsubscribe + 1;
        isConnected = i2 % 128;
        int i3 = i2 % 2;
        DeviceUnlinkingLivenessActivity.Companion companion = DeviceUnlinkingLivenessActivity.INSTANCE;
        DeviceUnlinkingLivenessActivity.Companion.TuitionPaymentFragmentbindingInflater1(this, (String) this.read.getValue(), this.getRoot, this.isConnected, this.getServiceComponent, (String) this.disconnect.getValue(), this.d, this.asInterface, this.cancel, this.notify, (String) this.getExtras.getValue());
        d_();
        int i4 = isConnected + 49;
        unsubscribe = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
        int i = 2 % 2;
        int i2 = unsubscribe + 17;
        isConnected = i2 % 128;
        int i3 = i2 % 2;
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_document_failed, "", p0, string, null, 112);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i4 = unsubscribe + 93;
            isConnected = i4 % 128;
            int i5 = i4 % 2;
            getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        int i6 = isConnected + 59;
        unsubscribe = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x003a  */
    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        boolean z;
        DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity = (DeviceUnlinkingBiometricActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        if (!Intrinsics.areEqual((String) deviceUnlinkingBiometricActivity.disconnect.getValue(), "KTP_BIOMETRIK_KPJ")) {
            int i2 = unsubscribe + 25;
            isConnected = i2 % 128;
            int i3 = i2 % 2;
            z = Intrinsics.areEqual((String) deviceUnlinkingBiometricActivity.disconnect.getValue(), "KTP_BIOMETRIK") ? zBooleanValue : true;
        }
        ActivityDeviceUnlinkingBiometricBinding activityDeviceUnlinkingBiometricBinding = (ActivityDeviceUnlinkingBiometricBinding) ((ViewBinding) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityDeviceUnlinkingBiometricBinding.tilNamaLengkap.setEnabled(z);
        activityDeviceUnlinkingBiometricBinding.tilNik.setEnabled(z);
        activityDeviceUnlinkingBiometricBinding.tilTanggalLahir.setEnabled(z);
        EditText editText = activityDeviceUnlinkingBiometricBinding.tilNamaLengkap.getEditText();
        if (editText != null) {
            int i4 = isConnected + 87;
            unsubscribe = i4 % 128;
            int i5 = i4 % 2;
            editText.setEnabled(z);
        }
        EditText editText2 = activityDeviceUnlinkingBiometricBinding.tilNik.getEditText();
        if (editText2 != null) {
            editText2.setEnabled(z);
        }
        EditText editText3 = activityDeviceUnlinkingBiometricBinding.tilTanggalLahir.getEditText();
        if (editText3 == null) {
            return null;
        }
        int i6 = unsubscribe + 21;
        isConnected = i6 % 128;
        int i7 = i6 % 2;
        editText3.setEnabled(z);
        if (i7 == 0) {
            return null;
        }
        int i8 = 87 / 0;
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char threadPriority = (char) (29944 - ((Process.getThreadPriority(0) + 20) >> 6));
            int iAxisFromString = 1754 - MotionEvent.axisFromString("");
            int iIndexOf = 23 - TextUtils.indexOf("", "", 0);
            byte b = $$a[7];
            short s = b;
            Object[] objArr2 = new Object[1];
            c(s, (byte) (s | 15), b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, iAxisFromString, iIndexOf, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) (29944 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                int mirror = AndroidCharacter.getMirror('0') + 1707;
                int pressedStateDuration = 23 - (ViewConfiguration.getPressedStateDuration() >> 16);
                byte b2 = $$a[7];
                Object[] objArr3 = new Object[1];
                c((short) 37, b2, b2, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, mirror, pressedStateDuration, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i2 = ((int[]) objArr4[0])[0];
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{i2}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i3 = ~startUptimeMillis;
            int i4 = (((103761587 + (((~((-103119920) | i3)) | (~((-109482507) | startUptimeMillis))) * 1900)) + (((~(startUptimeMillis | 103119919)) | (~(i3 | 109482506))) * (-950))) + (((~(i3 | 103119919)) | (~(startUptimeMillis | 109482506))) * 950)) - 1740116854;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new int[]{2023272286, 358953104, -523962458, 1296009727, -1155893510, -240275931, -1820409789, 1337477123, 1407282490, 1792779025}, 17 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new int[]{-2113932886, -433484236, 1072769434, 640583038, -1581449699, -2131995076, 1175192642, -1471797783, 547842191, -1119691890}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 15, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-876868570};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - TextUtils.indexOf("", "", 0)), (-16775490) - Color.rgb(0, 0, 0), TextUtils.getCapsMode("", 0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -1740116854, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29944);
                    int iIndexOf2 = 1755 - TextUtils.indexOf("", "", 0);
                    int i7 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22;
                    byte b3 = $$a[7];
                    Object[] objArr8 = new Object[1];
                    c((short) 37, b3, b3, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(doubleTapTimeout, iIndexOf2, i7, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new int[]{-1744492314, 1570217078, -1025080209, -1881687910, -563149011, -108700666, 250240972, -1501766878, 1259675790, 1701301499, 1609788213, 777305149, 333093441, 935722817}, 21 - ExpandableListView.getPackedPositionChild(0L), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new int[]{-439683781, -1194346007, -1059661827, -549858082, 2052567386, -2000307936, -930135484, 1586175603, -1926656551, 1032289349}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_tablet_step2).substring(0, 5).codePointAt(4) - 17, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 29945);
                        int i8 = 1756 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int i9 = 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        byte b4 = $$a[7];
                        Object[] objArr11 = new Object[1];
                        c((short) 89, b4, b4, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, i8, i9, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 29944);
                        int scrollDefaultDelay = 1755 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int threadPriority2 = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte b5 = $$a[7];
                        short s2 = b5;
                        Object[] objArr12 = new Object[1];
                        c(s2, (byte) (s2 | 15), b5, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, scrollDefaultDelay, threadPriority2, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i10 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            int i13 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
            Object[] objArr13 = {new int[]{i13}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i14 = ~iFreeMemory;
            int i15 = i12 + 336664198 + (((~((-396841812) | i14)) | 184239385) * (-865)) + ((~(iFreeMemory | 396841811)) * 865) + (((~(184239385 | i14)) | (~(i14 | 396841811))) * 865);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr13[3])[0] = i17 ^ (i17 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr != null) {
                int i18 = 0;
                while (i18 < strArr.length) {
                    int i19 = isConnected + 37;
                    unsubscribe = i19 % 128;
                    if (i19 % 2 == 0) {
                        arrayList.add(strArr[i18]);
                        i18 += 108;
                    } else {
                        arrayList.add(strArr[i18]);
                        i18++;
                    }
                }
            }
            Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
            int i20 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            int i21 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
            Object[] objArr14 = {new int[]{i21}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i22 = ~((-714273614) | (~iIdentityHashCode));
            int i23 = i20 + (((((-1073149792) | i22) | (~(714273613 | iIdentityHashCode))) * (-338)) - 1734774407) + (((~(iIdentityHashCode | (-358876179))) | i22) * 338);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr14[3])[0] = i25 ^ (i25 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1031;
            int minimumFlingVelocity = 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            byte b6 = $$a[7];
            Object[] objArr15 = new Object[1];
            c((short) 141, b6, b6, objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cCombineMeasuredStates, offsetBefore, minimumFlingVelocity, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new int[]{-1744492314, 1570217078, -1025080209, -1881687910, -563149011, -108700666, 250240972, -1501766878, 1259675790, 1701301499, 1609788213, 777305149, 333093441, 935722817}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new int[]{-439683781, -1194346007, -1059661827, -549858082, 2052567386, -2000307936, -930135484, 1586175603, -1926656551, 1032289349}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
            int threadPriority3 = 1031 - ((Process.getThreadPriority(0) + 20) >> 6);
            int gidForName = 14 - Process.getGidForName("");
            byte b7 = $$a[7];
            Object[] objArr18 = new Object[1];
            c((short) 37, b7, b7, objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cAxisFromString, threadPriority3, gidForName, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i26 = isConnected + 93;
            unsubscribe = i26 % 128;
            int i27 = i26 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1031;
                int i28 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14;
                Object[] objArr19 = new Object[1];
                c((short) 193, (byte) 52, $$a[28], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(longPressTimeout, jumpTapTimeout, i28, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i29 = ((int[]) objArr20[3])[0];
            int i30 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i31 = (((~((-957775804) | iIdentityHashCode2)) | 671486993) * (-283)) + 1296538164 + ((~(iIdentityHashCode2 | (-286288811))) * 283) + 2128474068;
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr[2])[0] = i33 ^ (i33 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new int[]{2023272286, 358953104, -523962458, 1296009727, -1155893510, -240275931, -1820409789, 1337477123, 1407282490, 1792779025}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new int[]{-2113932886, -433484236, 1072769434, 640583038, -1581449699, -2131995076, 1175192642, -1471797783, 547842191, -1119691890}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-876868570};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46037 - TextUtils.lastIndexOf("", '0')), 1134 - KeyEvent.normalizeMetaState(0), 17 - TextUtils.lastIndexOf("", '0'), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 2128474068, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int i34 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1032;
                int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 15;
                byte b8 = $$a[7];
                Object[] objArr25 = new Object[1];
                c((short) 141, b8, b8, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(maximumFlingVelocity, i34, pressedStateDuration2, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 45994), 1116 - TextUtils.lastIndexOf("", '0'), 17 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char size = (char) View.MeasureSpec.getSize(0);
                int iGreen = Color.green(0) + 1031;
                int i35 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14;
                Object[] objArr26 = new Object[1];
                c((short) 193, (byte) 52, $$a[28], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(size, iGreen, i35, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(new int[]{-1744492314, 1570217078, -1025080209, -1881687910, -563149011, -108700666, 250240972, -1501766878, 1259675790, 1701301499, 1609788213, 777305149, 333093441, 935722817}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 87, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new int[]{-439683781, -1194346007, -1059661827, -549858082, 2052567386, -2000307936, -930135484, 1586175603, -1926656551, 1032289349}, 15 - View.combineMeasuredStates(0, 0), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1032;
                    int iMyPid = (Process.myPid() >> 22) + 15;
                    byte b9 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c((short) 37, b9, b9, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf, bitsPerPixel, iMyPid, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1031;
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 16;
                    byte b10 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    c((short) 141, b10, b10, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c2, maxKeyCode, iLastIndexOf, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i36 = ((int[]) objArr[1])[0];
        int i37 = ((int[]) objArr[3])[0];
        if (i37 == i36) {
            int i38 = unsubscribe + 9;
            isConnected = i38 % 128;
            int i39 = i38 % 2;
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i40 = ((int[]) objArr[2])[0];
            int i41 = ((int[]) objArr[3])[0];
            int i42 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iMyUid = Process.myUid();
            int i43 = i40 + (-2140082559) + (((~((-187619839) | iMyUid)) | 52466026) * 336) + (((~(iMyUid | 56660331)) | (-191814144)) * (-168)) + (((~((~iMyUid) | 56660331)) | (-187619839)) * 168);
            int i44 = i43 ^ (i43 << 13);
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArr31[2])[0] = i45 ^ (i45 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i46 = 0;
            while (i46 < strArr4.length) {
                arrayList2.add(strArr4[i46]);
                i46++;
                int i47 = isConnected + 101;
                unsubscribe = i47 % 128;
                int i48 = i47 % 2;
            }
        }
        int[] iArr = new int[i37];
        int i49 = i37 - 1;
        iArr[i49] = 1;
        Toast.makeText((Context) null, iArr[((i37 * i49) % 2) - 1], 1).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i50 = ((int[]) objArr[2])[0];
        int i51 = ((int[]) objArr[3])[0];
        int i52 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int i53 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        int i54 = ~i53;
        int i55 = i50 + (-861776261) + (((~(425420897 | i54)) | (~((-669701068) | i53))) * 210) + (((~(i53 | 1073478635)) | (~(i54 | (-21643330)))) * 210);
        int i56 = (i55 << 13) ^ i55;
        int i57 = i56 ^ (i56 >>> 17);
        ((int[]) objArr32[2])[0] = i57 ^ (i57 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = unsubscribe + 121;
        isConnected = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
        int i6 = ~i5;
        int i7 = (-1829464504) + (((~((-339636877) | i6)) | 268989068 | (~(1169624419 | i6)) | (~((-1098976612) | i5))) * (-84));
        int i8 = (~(i5 | 1169624419)) | 339636876;
        int i9 = ~(i6 | (-1169624420));
        if (i4 != i7 + ((i8 | i9) * (-84)) + ((1098976611 | i9) * 84)) {
            throw new RuntimeException("886170500");
        }
        int i10 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i11 = ~iIdentityHashCode;
        if (i10 != 1080006174 + (((~(i11 | (-1808664299))) | 92752967) * (-1042)) + (((-1808664299) | iIdentityHashCode) * 521) + (((~(iIdentityHashCode | (-92752968))) | 67192837 | (~(i11 | (-1783104169)))) * 521)) {
            throw null;
        }
        super.onResume();
        int i12 = unsubscribe + 7;
        isConnected = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = unsubscribe + 123;
        isConnected = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
            if (i3 != (-1929125328) + (((~((-1107370017) | i4)) | 277382473) * (-756)) + (((~i4) | (-1107370017)) * 756)) {
                throw null;
            }
        } else {
            int i5 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
            if (i5 != 743968080 + (((~(1545628515 | i6)) | 715640972) * (-366)) + (((~(i6 | 2124938223)) | 136331264) * 366)) {
                throw null;
            }
        }
        int i7 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
        int i9 = ~i8;
        if (i7 != (-1205616388) + (((~((-2134946728) | i9)) | 440439205) * 168) + ((~((-440439206) | i8)) * 168) + (((~(i8 | (-1694507523))) | (~(i9 | (-444109238))) | 3670032) * 168)) {
            throw new RuntimeException("-721440366");
        }
        super.onStart();
        int i10 = unsubscribe + 43;
        isConnected = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ef, code lost:
    
        if (r1 != ((r5 + ((1851256317 | r2) * (-216))) + (((~(r2 | 68234741)) | (-1784146073)) * 216))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f1, code lost:
    
        super.onCreate(r13);
        r13 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingBiometricActivity.unsubscribe + 59;
        com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingBiometricActivity.isConnected = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0105, code lost:
    
        throw new java.lang.RuntimeException("884376977");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0106, code lost:
    
        r13 = 572790960 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x010f, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0073, code lost:
    
        if (r1 == (((38596652 + (((~((-1289485610) | r7)) | 138633216) * (-108))) + (((~(r7 | 459498066)) | ((~((-459498067) | r6)) | (-1610350460))) * 54)) + ((r6 | (-1610350460)) * 54))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a5, code lost:
    
        if (r1 == (((1517320978 + ((~((~r6) | (-268730375))) * 433)) + (((~(1354597094 | r6)) | (-524609552)) * (-433))) + (((~(r6 | (-524609552))) | 1085866720) * 433))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a7, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 878919776;
        r5 = (-1033614036) + ((~(r2 | 68234741)) * 216);
        r2 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r13) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingBiometricActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3(DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity) {
        int i = 2 % 2;
        int i2 = unsubscribe + 47;
        isConnected = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = deviceUnlinkingBiometricActivity.getIntent().getStringExtra("key_transaction_id");
        int i4 = unsubscribe + 9;
        isConnected = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return stringExtra;
    }

    public static /* synthetic */ String TuitionPaymentFragmentbindingInflater1(DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity) {
        int i = 2 % 2;
        String stringExtra = deviceUnlinkingBiometricActivity.getIntent().getStringExtra("email");
        if (stringExtra != null) {
            return stringExtra;
        }
        int i2 = isConnected;
        int i3 = i2 + 109;
        unsubscribe = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 77 / 0;
        }
        int i5 = i2 + 45;
        unsubscribe = i5 % 128;
        int i6 = i5 % 2;
        return "";
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(View view) {
        int i = 2 % 2;
        int i2 = unsubscribe + 99;
        isConnected = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 == 0) {
            return Unit.INSTANCE;
        }
        int i4 = 46 / 0;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = unsubscribe + 95;
        isConnected = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (i3 != 0) {
            activityResult.getResultCode();
            obj.hashCode();
            throw null;
        }
        if (activityResult.getResultCode() == -1) {
            deviceUnlinkingBiometricActivity.onTransact = true;
            ActivityResultLauncher<Intent> activityResultLauncher = deviceUnlinkingBiometricActivity.IconCompatParcelizer;
            KtpCameraActivity.Companion companion = KtpCameraActivity.INSTANCE;
            activityResultLauncher.launch(KtpCameraActivity.Companion.TuitionPaymentFragmentbindingInflater1(deviceUnlinkingBiometricActivity));
        }
        int i4 = unsubscribe + 121;
        isConnected = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity, View view) {
        int i = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(view, "");
        ActivityDeviceUnlinkingBiometricBinding activityDeviceUnlinkingBiometricBinding = (ActivityDeviceUnlinkingBiometricBinding) ((ViewBinding) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        deviceUnlinkingBiometricActivity.getRoot = StringsKt.trim((CharSequence) String.valueOf(activityDeviceUnlinkingBiometricBinding.etNik.getText())).toString();
        deviceUnlinkingBiometricActivity.isConnected = StringsKt.trim((CharSequence) String.valueOf(activityDeviceUnlinkingBiometricBinding.etNamaLengkap.getText())).toString();
        deviceUnlinkingBiometricActivity.getServiceComponent = StringsKt.trim((CharSequence) String.valueOf(activityDeviceUnlinkingBiometricBinding.etTanggalLahir.getText())).toString();
        deviceUnlinkingBiometricActivity.search = StringsKt.trim((CharSequence) String.valueOf(activityDeviceUnlinkingBiometricBinding.etNomorPeserta.getText())).toString();
        if (deviceUnlinkingBiometricActivity.getRoot.length() == 0) {
            activityDeviceUnlinkingBiometricBinding.tilNik.setError(deviceUnlinkingBiometricActivity.getString(R.string.error_nik_required));
        } else if (deviceUnlinkingBiometricActivity.getRoot.length() != 16) {
            activityDeviceUnlinkingBiometricBinding.tilNik.setError(deviceUnlinkingBiometricActivity.getString(R.string.error_nik_invalid));
            int i2 = unsubscribe + 25;
            isConnected = i2 % 128;
            int i3 = i2 % 2;
        } else if (deviceUnlinkingBiometricActivity.isConnected.length() == 0) {
            activityDeviceUnlinkingBiometricBinding.tilNamaLengkap.setError(deviceUnlinkingBiometricActivity.getString(R.string.error_name_required));
        } else if (deviceUnlinkingBiometricActivity.getServiceComponent.length() == 0) {
            activityDeviceUnlinkingBiometricBinding.tilTanggalLahir.setError(deviceUnlinkingBiometricActivity.getString(R.string.error_birthdate_required));
        } else {
            activityDeviceUnlinkingBiometricBinding.tilNik.setError(null);
            activityDeviceUnlinkingBiometricBinding.tilNamaLengkap.setError(null);
            activityDeviceUnlinkingBiometricBinding.tilTanggalLahir.setError(null);
            activityDeviceUnlinkingBiometricBinding.tilNomorPeserta.setError(null);
            int i4 = isConnected + 91;
            unsubscribe = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            String str2 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
            if (str2 != null) {
                int i5 = unsubscribe + 105;
                isConnected = i5 % 128;
                int i6 = i5 % 2;
                if (!(!Intrinsics.areEqual((String) deviceUnlinkingBiometricActivity.disconnect.getValue(), "KTP_BIOMETRIK_KPJ"))) {
                    String str3 = deviceUnlinkingBiometricActivity.search;
                    if (str3.length() != 0) {
                        int i7 = isConnected + 15;
                        unsubscribe = i7 % 128;
                        int i8 = i7 % 2;
                        str = str3;
                    }
                    str = str;
                }
                AppCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3(597578040, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{(AppCompatSpinnerDropDownAdapter) deviceUnlinkingBiometricActivity.MediaBrowserCompat.getValue(), str2, new CheckMembershipRequest(deviceUnlinkingBiometricActivity.getRoot, deviceUnlinkingBiometricActivity.isConnected, str, deviceUnlinkingBiometricActivity.getServiceComponent, deviceUnlinkingBiometricActivity.asInterface)}, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -597578038, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            } else {
                String string = deviceUnlinkingBiometricActivity.getString(R.string.error_transaction_id_missing);
                Intrinsics.checkNotNullExpressionValue(string, "");
                deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string);
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        final DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity = (DeviceUnlinkingBiometricActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: setSupportImageTintList
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                    DeviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, i2, i3, i4);
                }
            }, deviceUnlinkingBiometricActivity.RemoteActionCompatParcelizer.get(1), deviceUnlinkingBiometricActivity.RemoteActionCompatParcelizer.get(2), deviceUnlinkingBiometricActivity.RemoteActionCompatParcelizer.get(5)).show();
            ViewPortBuilder.b();
            int i2 = isConnected + 113;
            unsubscribe = i2 % 128;
            int i3 = i2 % 2;
            return null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity) throws IOException {
        int i;
        int i2 = 2 % 2;
        int i3 = isConnected + 57;
        unsubscribe = i3 % 128;
        if (i3 % 2 == 0) {
            ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
            ExperimentalCamera2Interop.b((PreferenceManager) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
        Camera2CameraControlExternalSyntheticLambda4 camera2CameraControlExternalSyntheticLambda4B = ExperimentalCamera2Interop.b((PreferenceManager) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
        if (camera2CameraControlExternalSyntheticLambda4B != null) {
            deviceUnlinkingBiometricActivity.cancel = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
            deviceUnlinkingBiometricActivity.notify = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            deviceUnlinkingBiometricActivity.INotificationSideChannel = camera2CameraControlExternalSyntheticLambda4B.b;
            deviceUnlinkingBiometricActivity.cancelAll = camera2CameraControlExternalSyntheticLambda4B.g;
            deviceUnlinkingBiometricActivity.INotificationSideChannelStubProxy = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            deviceUnlinkingBiometricActivity.INotificationSideChannelDefault = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str = deviceUnlinkingBiometricActivity.cancel;
            String str2 = deviceUnlinkingBiometricActivity.notify;
            StringBuilder sb = new StringBuilder("Location from cache: ");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
            i = isConnected + 55;
        } else {
            ExperimentalCamera2Interop experimentalCamera2Interop3 = ExperimentalCamera2Interop.INSTANCE;
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
            i = isConnected + 75;
        }
        unsubscribe = i % 128;
        int i4 = i % 2;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ String b(DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity) {
        int i = 2 % 2;
        int i2 = isConnected + 63;
        unsubscribe = i2 % 128;
        if (i2 % 2 != 0) {
            return deviceUnlinkingBiometricActivity.getIntent().getStringExtra("key_message");
        }
        deviceUnlinkingBiometricActivity.getIntent().getStringExtra("key_message");
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity, int i, int i2, int i3) {
        int i4 = 2 % 2;
        deviceUnlinkingBiometricActivity.RemoteActionCompatParcelizer.set(1, i);
        deviceUnlinkingBiometricActivity.RemoteActionCompatParcelizer.set(2, i2);
        deviceUnlinkingBiometricActivity.RemoteActionCompatParcelizer.set(5, i3);
        ((ActivityDeviceUnlinkingBiometricBinding) ((ViewBinding) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).etTanggalLahir.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(deviceUnlinkingBiometricActivity.RemoteActionCompatParcelizer.getTime()));
        int i5 = isConnected + 83;
        unsubscribe = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062 A[PHI: r3 r6
  0x0062: PHI (r3v43 com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingBiometricActivity) = 
  (r3v9 com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingBiometricActivity)
  (r3v46 com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingBiometricActivity)
 binds: [B:23:0x006f, B:19:0x005f] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r6v6 java.lang.String) = (r6v3 java.lang.String), (r6v8 java.lang.String) binds: [B:23:0x006f, B:19:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0071 A[PHI: r3
  0x0071: PHI (r3v10 com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingBiometricActivity) = 
  (r3v9 com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingBiometricActivity)
  (r3v46 com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingBiometricActivity)
 binds: [B:23:0x006f, B:19:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity2;
        String nomorIdentitas;
        DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i = 2 % 2;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            Object obj = null;
            String str9 = "";
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                deviceUnlinkingBiometricActivity.IconCompatParcelizer();
                GetDataAntrianResponse getDataAntrianResponse = (GetDataAntrianResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                AntrianData data = getDataAntrianResponse.getData();
                if (Intrinsics.areEqual(getDataAntrianResponse.isSuccessful(), Boolean.TRUE) && data != null) {
                    int i2 = unsubscribe + 89;
                    isConnected = i2 % 128;
                    if (i2 % 2 != 0) {
                        BookingAntreanSuccessActivity.Companion companion = BookingAntreanSuccessActivity.INSTANCE;
                        deviceUnlinkingBiometricActivity2 = deviceUnlinkingBiometricActivity;
                        nomorIdentitas = data.getNomorIdentitas();
                        int i3 = 72 / 0;
                        if (nomorIdentitas == null) {
                            deviceUnlinkingBiometricActivity3 = deviceUnlinkingBiometricActivity2;
                            str = "";
                        } else {
                            str = nomorIdentitas;
                            deviceUnlinkingBiometricActivity3 = deviceUnlinkingBiometricActivity2;
                        }
                    } else {
                        BookingAntreanSuccessActivity.Companion companion2 = BookingAntreanSuccessActivity.INSTANCE;
                        deviceUnlinkingBiometricActivity2 = deviceUnlinkingBiometricActivity;
                        nomorIdentitas = data.getNomorIdentitas();
                        if (nomorIdentitas == null) {
                            deviceUnlinkingBiometricActivity3 = deviceUnlinkingBiometricActivity2;
                            str = "";
                        } else {
                            str = nomorIdentitas;
                            deviceUnlinkingBiometricActivity3 = deviceUnlinkingBiometricActivity2;
                        }
                    }
                    String nama = data.getNama();
                    if (nama == null) {
                        int i4 = unsubscribe + 93;
                        isConnected = i4 % 128;
                        if (i4 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        str2 = "";
                    } else {
                        str2 = nama;
                    }
                    String handphone = data.getHandphone();
                    if (handphone == null) {
                        int i5 = isConnected + 53;
                        unsubscribe = i5 % 128;
                        if (i5 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        str3 = "";
                    } else {
                        str3 = handphone;
                    }
                    String email = data.getEmail();
                    if (email == null) {
                        int i6 = isConnected + 45;
                        unsubscribe = i6 % 128;
                        if (i6 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        str4 = "";
                    } else {
                        str4 = email;
                    }
                    String kodePengajuan = data.getKodePengajuan();
                    if (kodePengajuan == null) {
                        int i7 = unsubscribe + 111;
                        isConnected = i7 % 128;
                        int i8 = i7 % 2;
                        str5 = "";
                    } else {
                        str5 = kodePengajuan;
                    }
                    String layanan = data.getLayanan();
                    String str10 = layanan == null ? "" : layanan;
                    String layanan2 = data.getLayanan();
                    if (layanan2 == null) {
                        int i9 = unsubscribe + 9;
                        isConnected = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = 29 / 0;
                        }
                        str6 = "";
                    } else {
                        str6 = layanan2;
                    }
                    String namaKantorCabang = data.getNamaKantorCabang();
                    if (namaKantorCabang == null && (namaKantorCabang = data.getKantorCabang()) == null) {
                        int i11 = isConnected + 9;
                        unsubscribe = i11 % 128;
                        if (i11 % 2 == 0) {
                            throw null;
                        }
                        str7 = "";
                    } else {
                        str7 = namaKantorCabang;
                    }
                    String alamatKantor = data.getAlamatKantor();
                    String str11 = alamatKantor == null ? "" : alamatKantor;
                    String tanggalBooking = data.getTanggalBooking();
                    String str12 = tanggalBooking == null ? "" : tanggalBooking;
                    String tanggalBooking2 = data.getTanggalBooking();
                    String str13 = tanggalBooking2 == null ? "" : tanggalBooking2;
                    String namaShift = data.getNamaShift();
                    String str14 = namaShift == null ? "" : namaShift;
                    String qrCode = getDataAntrianResponse.getQrCode();
                    if (qrCode == null) {
                        int i12 = isConnected + 71;
                        unsubscribe = i12 % 128;
                        int i13 = i12 % 2;
                        str8 = "";
                    } else {
                        str8 = qrCode;
                    }
                    BookingAntreanSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(deviceUnlinkingBiometricActivity3, str, str2, str3, str4, str5, str10, str6, str7, str11, str12, str13, str14, "", "", str8, "903");
                } else {
                    DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity4 = deviceUnlinkingBiometricActivity;
                    String message = getDataAntrianResponse.getMessage();
                    if (message != null) {
                        int i14 = isConnected + 21;
                        unsubscribe = i14 % 128;
                        int i15 = i14 % 2;
                        str9 = message;
                    }
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(deviceUnlinkingBiometricActivity4, str9, null);
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                deviceUnlinkingBiometricActivity.IconCompatParcelizer();
                DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity5 = deviceUnlinkingBiometricActivity;
                String str15 = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(deviceUnlinkingBiometricActivity5, str15 != null ? str15 : "", null);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity) {
        int i = 2 % 2;
        int i2 = unsubscribe + 103;
        isConnected = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = deviceUnlinkingBiometricActivity.getIntent().getStringExtra("key_title_message");
        int i4 = unsubscribe + 45;
        isConnected = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    public static /* synthetic */ RegisteredMemberRegistration a(DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity) {
        int i = 2 % 2;
        int i2 = isConnected + 63;
        unsubscribe = i2 % 128;
        int i3 = i2 % 2;
        RegisteredMemberRegistration value = ((getUntrustedCreatorPackageName) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b.getValue();
        int i4 = unsubscribe + 59;
        isConnected = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return value;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity, ActivityResult activityResult) {
        String stringExtra;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1) {
            Intent data = activityResult.getData();
            if (data != null) {
                stringExtra = data.getStringExtra("extra_photo_path");
                int i2 = unsubscribe + 85;
                isConnected = i2 % 128;
                int i3 = i2 % 2;
            } else {
                stringExtra = null;
            }
            if (stringExtra != null) {
                File file = new File(stringExtra);
                if (file.exists()) {
                    deviceUnlinkingBiometricActivity.b = file;
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(stringExtra);
                    ((ActivityDeviceUnlinkingBiometricBinding) ((ViewBinding) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).imgKtpPhoto.setImageBitmap(bitmapDecodeFile);
                    ((ActivityDeviceUnlinkingBiometricBinding) ((ViewBinding) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).imgKtpPhoto.setVisibility(0);
                    ((ActivityDeviceUnlinkingBiometricBinding) ((ViewBinding) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).clKtpPlaceholder.setVisibility(8);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_billingaddress_empty).substring(18, 19).codePointAt(0) - 2139353336, new Object[]{deviceUnlinkingBiometricActivity, true}, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), 349144939, -349144939, getActivitySideSheetRoundedCornersPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1());
                    Intrinsics.checkNotNull(bitmapDecodeFile);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                    String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                    Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
                    final setSplitTrack setsplittrack = (setSplitTrack) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                    Intrinsics.checkNotNull(str);
                    OcrKtpRequest ocrKtpRequest = new OcrKtpRequest(UUID.randomUUID().toString(), strEncodeToString);
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(ocrKtpRequest, "");
                    MutableLiveData<VirtualCameraAdapter1<OcrKtpResponse>> mutableLiveData = setsplittrack.INotificationSideChannelStubProxy;
                    VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                    mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                    deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(setsplittrack.MediaBrowserCompat.b(str, ocrKtpRequest)));
                    final Function1 function1 = new Function1() { // from class: setThumbPosition
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(setsplittrack, (OcrKtpResponse) obj);
                        }
                    };
                    logToString logtostring = new logToString() { // from class: getFloat
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            function1.invoke(obj);
                        }
                    };
                    final Function1 function2 = new Function1() { // from class: getResourceId
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setsplittrack, (Throwable) obj);
                        }
                    };
                    BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: TintTypedArrayApi21Impl
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            function2.invoke(obj);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                    setsplittrack.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    int i4 = isConnected + 15;
                    unsubscribe = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity, UserLocationComplete userLocationComplete) throws IOException {
        String str;
        String str2;
        int i = 2 % 2;
        String str3 = "";
        Intrinsics.checkNotNullParameter(userLocationComplete, "");
        deviceUnlinkingBiometricActivity.cancel = String.valueOf(userLocationComplete.b);
        deviceUnlinkingBiometricActivity.notify = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        LocationAddressInfo locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo == null || (str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) {
            str = "";
        }
        deviceUnlinkingBiometricActivity.INotificationSideChannel = str;
        deviceUnlinkingBiometricActivity.cancelAll = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        LocationAddressInfo locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 == null || (str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            str2 = "";
        }
        deviceUnlinkingBiometricActivity.INotificationSideChannelStubProxy = str2;
        LocationAddressInfo locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 != null) {
            int i2 = unsubscribe + 123;
            isConnected = i2 % 128;
            int i3 = i2 % 2;
            String str4 = locationAddressInfo3.d;
            if (str4 != null) {
                int i4 = unsubscribe + 43;
                isConnected = i4 % 128;
                int i5 = i4 % 2;
                str3 = str4;
            }
        }
        deviceUnlinkingBiometricActivity.INotificationSideChannelDefault = str3;
        String str5 = deviceUnlinkingBiometricActivity.cancel;
        String str6 = deviceUnlinkingBiometricActivity.notify;
        String str7 = deviceUnlinkingBiometricActivity.INotificationSideChannel;
        String str8 = deviceUnlinkingBiometricActivity.cancelAll;
        String str9 = deviceUnlinkingBiometricActivity.INotificationSideChannelStubProxy;
        StringBuilder sb = new StringBuilder("Location from GPS: ");
        sb.append(str5);
        sb.append(", ");
        sb.append(str6);
        sb.append(", City: ");
        sb.append(str7);
        sb.append(", Province: ");
        sb.append(str8);
        sb.append(", Country: ");
        sb.append(str9);
        getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity, View view) {
        int i = 2 % 2;
        int i2 = unsubscribe + 3;
        isConnected = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            deviceUnlinkingBiometricActivity.onBackPressed();
            ViewPortBuilder.b();
            int i4 = unsubscribe + 27;
            isConnected = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ String g(DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity) {
        int i = 2 % 2;
        int i2 = isConnected + 99;
        unsubscribe = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = deviceUnlinkingBiometricActivity.getIntent().getStringExtra("key_jenis_form");
        int i4 = isConnected + 31;
        unsubscribe = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity = (DeviceUnlinkingBiometricActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = unsubscribe + 77;
        isConnected = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            boolean z = deviceUnlinkingBiometricActivity.onTransact;
            throw null;
        }
        if (deviceUnlinkingBiometricActivity.onTransact) {
            ActivityResultLauncher<Intent> activityResultLauncher = deviceUnlinkingBiometricActivity.IconCompatParcelizer;
            KtpCameraActivity.Companion companion = KtpCameraActivity.INSTANCE;
            activityResultLauncher.launch(KtpCameraActivity.Companion.TuitionPaymentFragmentbindingInflater1(deviceUnlinkingBiometricActivity));
        } else {
            int i4 = isConnected + 53;
            unsubscribe = i4 % 128;
            int i5 = i4 % 2;
            deviceUnlinkingBiometricActivity.INotificationSideChannelStub.launch(KtpGuidanceActivity.INSTANCE.TuitionPaymentFragmentbindingInflater1(deviceUnlinkingBiometricActivity));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:14:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:16:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:18:0x00be  */
    /* JADX WARN: Code duplicated, block: B:20:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:31:0x0106  */
    /* JADX WARN: Code duplicated, block: B:34:0x0111  */
    /* JADX WARN: Code duplicated, block: B:38:0x0126  */
    /* JADX WARN: Code duplicated, block: B:41:0x0135  */
    /* JADX WARN: Code duplicated, block: B:45:0x0149  */
    /* JADX WARN: Code duplicated, block: B:53:0x0171  */
    /* JADX WARN: Code duplicated, block: B:55:0x017c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0187  */
    /* JADX WARN: Code duplicated, block: B:62:0x019b  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0205  */
    /* JADX WARN: Code duplicated, block: B:77:0x0219  */
    /* JADX WARN: Code duplicated, block: B:79:0x0223  */
    /* JADX WARN: Code duplicated, block: B:83:0x0240  */
    /* JADX WARN: Code duplicated, block: B:86:0x0253  */
    /* JADX WARN: Code duplicated, block: B:89:0x0266  */
    /* JADX WARN: Code duplicated, block: B:90:0x026a  */
    /* JADX WARN: Code duplicated, block: B:92:0x026e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0277  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    /* JADX WARN: Instruction removed from duplicated block: B:10:0x0024, please report this as an issue */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(final DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String string;
        VirtualCameraAdapter1.asBinder asbinder;
        List listSplit$default;
        List listSplit$default2;
        List listSplit$default3;
        List listSplit$default4;
        List listSplit$default5;
        int i;
        OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB;
        FragmentManager supportFragmentManager;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = unsubscribe + 39;
        isConnected = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                deviceUnlinkingBiometricActivity.MediaBrowserCompat();
            } else {
                if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                    deviceUnlinkingBiometricActivity.IconCompatParcelizer();
                    asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                    listSplit$default = StringsKt.split$default((CharSequence) ((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isSuccessful(), new char[]{'#'}, false, 0, 6, (Object) null);
                    listSplit$default2 = StringsKt.split$default((CharSequence) ((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getHaveMembership(), new char[]{'#'}, false, 0, 6, (Object) null);
                    listSplit$default3 = StringsKt.split$default((CharSequence) ((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getHavePengajuan(), new char[]{'#'}, false, 0, 6, (Object) null);
                    listSplit$default4 = StringsKt.split$default((CharSequence) ((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isSuspend(), new char[]{'#'}, false, 0, 6, (Object) null);
                    listSplit$default5 = StringsKt.split$default((CharSequence) ((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isSuspendAntol(), new char[]{'#'}, false, 0, 6, (Object) null);
                    if (!Intrinsics.areEqual(listSplit$default.get(0), "true")) {
                        deviceUnlinkingBiometricActivity.g();
                    } else if (Intrinsics.areEqual(listSplit$default2.get(0), "true")) {
                        if (Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                            int i7 = unsubscribe + 103;
                            isConnected = i7 % 128;
                            int i8 = i7 % 2;
                            if (Intrinsics.areEqual(listSplit$default5.get(0), "false")) {
                                i3 = unsubscribe + 83;
                                isConnected = i3 % 128;
                                if (i3 % 2 != 0 ? Intrinsics.areEqual(listSplit$default3.get(0), "false") : Intrinsics.areEqual(listSplit$default3.get(1), "false")) {
                                    deviceUnlinkingBiometricActivity.g();
                                } else {
                                    if (Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                        i2 = unsubscribe + 73;
                                        isConnected = i2 % 128;
                                        if (i2 % 2 != 0 ? Intrinsics.areEqual(listSplit$default5.get(0), "true") : Intrinsics.areEqual(listSplit$default5.get(1), "true")) {
                                            if (!(!Intrinsics.areEqual(listSplit$default3.get(0), "false"))) {
                                                deviceUnlinkingBiometricActivity.g();
                                            }
                                        }
                                    }
                                    if ((!Intrinsics.areEqual(listSplit$default4.get(0), "false") && Intrinsics.areEqual(listSplit$default5.get(0), "false") && Intrinsics.areEqual(listSplit$default3.get(0), "true")) || (Intrinsics.areEqual(listSplit$default4.get(0), "true") && Intrinsics.areEqual(listSplit$default5.get(0), "false") && Intrinsics.areEqual(listSplit$default3.get(0), "true"))) {
                                        OutputConfigurationCompatApi33Impl.Companion companion = OutputConfigurationCompatApi33Impl.INSTANCE;
                                        String string2 = deviceUnlinkingBiometricActivity.getString(R.string.label_title_validation_account_dialog);
                                        Intrinsics.checkNotNullExpressionValue(string2, "");
                                        String string3 = deviceUnlinkingBiometricActivity.getString(R.string.action_booking_antrean_online);
                                        Intrinsics.checkNotNullExpressionValue(string3, "");
                                        outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.notfound, string2, "Agar proses pergantian perangkat JMO Anda dapat dilanjutkan, silakan Appointment Online ke Kantor Cabang terdekat.", string3, (128 & 16) != 0 ? null : new Function0() { // from class: getSampleTile
                                            private static short[] asBinder;
                                            private static final byte[] $$c = {70, -114, 113, 8};
                                            private static final int $$f = 88;
                                            private static int $10 = 0;
                                            private static int $11 = 1;
                                            private static final byte[] $$d = {ByteCompanionObject.MAX_VALUE, 43, -39, -37, 18, 4, -57, 69, 2, 1, 22, 4, -11, 19, 11, -63, 75, -9, 13, -55, 77, -6, 8, 4, 17, -64, 78, -7, 2, 24, 2, -63, 59, 21, -7, 5, 11, 17, -11, 4, 23, -8, -48, 60, 7, 21, -13, 14, 9, 13, -63, 27, 53, -7, 5, 11, 17, -43, 36, 23, -8, -26, 39, 21, -13, 14, 9, 13, -44, 40, 23, -5, 19, -7, 17, 11, -79, 24, 39, -6, 17, -5, 12, 5, -24, 23, 30, -6, -2, 15, 12, -40, 50, -11, 12, 12, -2, 15, 12, 5, 3, -5, 4, 12, -2, 17, 3, 11, 4, 3, 11, -3, 5, 24, -7, 2, 24, -36, 40, -5, 7, 13, -2, 7, 7, 1, 26, -3, 14, -59};
                                            private static final int $$e = 27;
                                            private static final byte[] $$a = {21, ByteCompanionObject.MAX_VALUE, 49, -115, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
                                            private static final int $$b = 253;
                                            private static int asInterface = 0;

                                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                                            private static int f974a = 1;
                                            private static int b = -1736658508;
                                            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1934795551;
                                            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1753505840;
                                            private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {-69, -81, -66, -104, -51, -69, -96, -80, -87, -99, -100, -10, -65, 112, -7, -74, -87, -76, -123, -83, -124, -10, -6, -21, -58, -59, -14, -51, -32, -15, -20, -3, -63, -21, -7, 89, 94, 73, 32, 54, 113, 39, 33, 73, 47, 87, 43, 56, 41, -100, 90, 45, 9, 96, 81, 80, 95, 44, 84, 47, -85, -78, -91, -121, -86, -82, -83, -84, -88, -101, -3, -78, -79, -89, -88, -83, -122, 1, 54, 6, 63, -29, -30, 64, 62, 10, 50, -5, 74, 44, 18, 48, -27, 17, -56, 59, 17, -14, -3, 55, -31, -21, 17, -18, -19, -27, 27, -26, -26, -26, -26, -26, -26};

                                            private static void c(byte b2, short s, short s2, Object[] objArr) {
                                                int i9 = 84 - (b2 * 4);
                                                byte[] bArr = $$a;
                                                int i10 = s2 * 15;
                                                int i11 = 92 - s;
                                                byte[] bArr2 = new byte[53 - i10];
                                                int i12 = 52 - i10;
                                                int i13 = -1;
                                                if (bArr == null) {
                                                    int i14 = (i11 + (-i12)) - 11;
                                                    i11 = i11;
                                                    i9 = i14;
                                                }
                                                while (true) {
                                                    i13++;
                                                    int i15 = i11 + 1;
                                                    bArr2[i13] = (byte) i9;
                                                    if (i13 == i12) {
                                                        objArr[0] = new String(bArr2, 0);
                                                        return;
                                                    }
                                                    i11 = i15;
                                                    i9 = (i9 + (-bArr[i15])) - 11;
                                                }
                                            }

                                            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
                                            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
                                            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                                                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                                */
                                            private static void e(int r6, short r7, short r8, java.lang.Object[] r9) {
                                                /*
                                                    int r8 = r8 * 22
                                                    int r0 = 75 - r8
                                                    int r6 = r6 * 15
                                                    int r6 = 99 - r6
                                                    int r7 = r7 * 74
                                                    int r7 = 78 - r7
                                                    byte[] r1 = defpackage.getSampleTile.$$d
                                                    byte[] r0 = new byte[r0]
                                                    int r8 = 74 - r8
                                                    r2 = 0
                                                    if (r1 != 0) goto L19
                                                    r6 = r7
                                                    r4 = r8
                                                    r3 = r2
                                                    goto L2e
                                                L19:
                                                    r3 = r2
                                                L1a:
                                                    byte r4 = (byte) r6
                                                    r0[r3] = r4
                                                    if (r3 != r8) goto L27
                                                    java.lang.String r6 = new java.lang.String
                                                    r6.<init>(r0, r2)
                                                    r9[r2] = r6
                                                    return
                                                L27:
                                                    int r3 = r3 + 1
                                                    r4 = r1[r7]
                                                    r5 = r7
                                                    r7 = r6
                                                    r6 = r5
                                                L2e:
                                                    int r7 = r7 + r4
                                                    int r6 = r6 + 1
                                                    int r7 = r7 + (-6)
                                                    r5 = r7
                                                    r7 = r6
                                                    r6 = r5
                                                    goto L1a
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: defpackage.getSampleTile.e(int, short, short, java.lang.Object[]):void");
                                            }

                                            /* JADX WARN: Code duplicated, block: B:22:0x027f  */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() throws Throwable {
                                                Object[] objArr;
                                                int i9 = 2 % 2;
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 877;
                                                    int jumpTapTimeout = 10 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                                    byte[] bArr = $$a;
                                                    byte b2 = bArr[7];
                                                    Object[] objArr2 = new Object[1];
                                                    c(b2, (byte) (b2 | 89), bArr[5], objArr2);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, iLastIndexOf, jumpTapTimeout, -1650998592, false, (String) objArr2[0], null);
                                                }
                                                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                                                Object[] objArr3 = new Object[1];
                                                d(467059595 - (KeyEvent.getMaxKeyCode() >> 16), 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (TextUtils.lastIndexOf("", '0') - 84), (byte) ((Process.getThreadPriority(0) + 20) >> 6), (-349302099) - TextUtils.lastIndexOf("", '0'), objArr3);
                                                Class<?> cls = Class.forName((String) objArr3[0]);
                                                Object[] objArr4 = new Object[1];
                                                d(TextUtils.getOffsetBefore("", 0) + 467059599, (ViewConfiguration.getScrollBarSize() >> 8) + 8, (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 25), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (ViewConfiguration.getScrollBarSize() >> 8) - 349302077, objArr4);
                                                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                                                    int iGreen = Color.green(0) + 876;
                                                    int i10 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
                                                    byte b3 = $$a[7];
                                                    byte b4 = b3;
                                                    Object[] objArr5 = new Object[1];
                                                    c(b4, (byte) (b4 | 52), b3, objArr5);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(bitsPerPixel, iGreen, i10, 2012020043, false, (String) objArr5[0], null);
                                                }
                                                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                                                    int i11 = asInterface + 57;
                                                    f974a = i11 % 128;
                                                    int i12 = i11 % 2;
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 876;
                                                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 10;
                                                        byte b5 = $$a[7];
                                                        byte b6 = b5;
                                                        Object[] objArr6 = new Object[1];
                                                        c(b5, b6, b6, objArr6);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, minimumFlingVelocity, tapTimeout, 2012931276, false, (String) objArr6[0], null);
                                                    }
                                                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                                                    objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                                                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                                                    int i13 = (-944343232) + (((~((-134817830) | startElapsedRealtime)) | (~((~startElapsedRealtime) | (-94507601)))) * (-318)) + (((~(710518821 | startElapsedRealtime)) | (-805026422)) * (-318)) + (((~(startElapsedRealtime | (-710518822))) | 670208592) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 1805273919;
                                                    int i14 = (i13 << 13) ^ i13;
                                                    int i15 = i14 ^ (i14 >>> 17);
                                                    ((int[]) objArr[1])[0] = i15 ^ (i15 << 5);
                                                } else {
                                                    Object[] objArr8 = new Object[1];
                                                    d(467059595 - ((Process.getThreadPriority(0) + 20) >> 6), ExpandableListView.getPackedPositionGroup(0L) + 19, (short) (68 - View.combineMeasuredStates(0, 0)), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-349302063) - TextUtils.getOffsetAfter("", 0), objArr8);
                                                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                                                    Object[] objArr9 = new Object[1];
                                                    d(467059597 - KeyEvent.normalizeMetaState(0), 11 - Color.alpha(0), (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 77), (byte) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 349302039, objArr9);
                                                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                                                    if (applicationContext != null) {
                                                        if (applicationContext instanceof ContextWrapper) {
                                                            int i16 = asInterface + 19;
                                                            f974a = i16 % 128;
                                                            int i17 = i16 % 2;
                                                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                                                applicationContext = applicationContext.getApplicationContext();
                                                            } else {
                                                                applicationContext = null;
                                                            }
                                                        } else {
                                                            applicationContext = applicationContext.getApplicationContext();
                                                        }
                                                    }
                                                    Object[] objArr10 = new Object[1];
                                                    d(467059604 - TextUtils.getOffsetAfter("", 0), 9 - KeyEvent.keyCodeFromString(""), (short) (34 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (byte) View.resolveSizeAndState(0, 0, 0), (KeyEvent.getMaxKeyCode() >> 16) - 349302021, objArr10);
                                                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                                                    Object[] objArr11 = new Object[1];
                                                    d((ViewConfiguration.getWindowTouchSlop() >> 8) + 467059603, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 9, (short) (TextUtils.getOffsetBefore("", 0) - 2), (byte) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 349302007, objArr11);
                                                    try {
                                                        Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1805273919};
                                                        byte[] bArr2 = $$d;
                                                        byte b7 = bArr2[9];
                                                        byte b8 = (byte) (b7 - 1);
                                                        byte b9 = b7;
                                                        Object[] objArr13 = new Object[1];
                                                        e(b8, b9, (byte) (b9 - 1), objArr13);
                                                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                                                        byte b10 = bArr2[9];
                                                        byte b11 = b10;
                                                        Object[] objArr14 = new Object[1];
                                                        e(b11, (byte) (b11 - 1), b10, objArr14);
                                                        Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                                                        if (applicationContext != null) {
                                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                                char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                                                                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 876;
                                                                int minimumFlingVelocity2 = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                                byte b12 = $$a[7];
                                                                byte b13 = b12;
                                                                Object[] objArr16 = new Object[1];
                                                                c(b12, b13, b13, objArr16);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, keyRepeatTimeout, minimumFlingVelocity2, 2012931276, false, (String) objArr16[0], null);
                                                            }
                                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                                                            try {
                                                                Object[] objArr17 = new Object[1];
                                                                d((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 467059595, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, (short) (View.resolveSize(0, 0) - 85), (byte) View.MeasureSpec.getSize(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 349302098, objArr17);
                                                                Class<?> cls5 = Class.forName((String) objArr17[0]);
                                                                Object[] objArr18 = new Object[1];
                                                                d(TextUtils.getOffsetBefore("", 0) + 467059599, 8 - View.MeasureSpec.makeMeasureSpec(0, 0), (short) (ExpandableListView.getPackedPositionType(0L) - 24), (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), TextUtils.indexOf((CharSequence) "", '0') - 349302076, objArr18);
                                                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                                                Long lValueOf = Long.valueOf(jLongValue2);
                                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                                                                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 876;
                                                                    int iMyPid = (Process.myPid() >> 22) + 10;
                                                                    byte b14 = $$a[7];
                                                                    byte b15 = b14;
                                                                    Object[] objArr19 = new Object[1];
                                                                    c(b15, (byte) (b15 | 52), b14, objArr19);
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates, offsetBefore, iMyPid, 2012020043, false, (String) objArr19[0], null);
                                                                }
                                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                                    char mode = (char) View.MeasureSpec.getMode(0);
                                                                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 876;
                                                                    int windowTouchSlop = 10 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                                    byte[] bArr3 = $$a;
                                                                    byte b16 = bArr3[7];
                                                                    Object[] objArr20 = new Object[1];
                                                                    c(b16, (byte) (b16 | 89), bArr3[5], objArr20);
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode, packedPositionType, windowTouchSlop, -1650998592, false, (String) objArr20[0], null);
                                                                }
                                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                                            } catch (Exception unused) {
                                                                throw new RuntimeException();
                                                            }
                                                        }
                                                        objArr = objArr15;
                                                    } catch (Throwable th) {
                                                        Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                int i18 = ((int[]) objArr[2])[0];
                                                int i19 = ((int[]) objArr[0])[0];
                                                if (i19 == i18) {
                                                    int i20 = ((int[]) objArr[1])[0];
                                                    Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                                                    int i21 = ~System.identityHashCode(this);
                                                    int i22 = ~(570919774 | i21);
                                                    int i23 = i20 + 1453888012 + ((i22 | (-530609546)) * 764) + (((~(i21 | (-530609546))) | 33554696) * (-1528)) + (((-1034419928) | i22) * 764);
                                                    int i24 = (i23 << 13) ^ i23;
                                                    int i25 = i24 ^ (i24 >>> 17);
                                                    ((int[]) objArr21[1])[0] = i25 ^ (i25 << 5);
                                                } else {
                                                    int[] iArr = new int[i19];
                                                    int i26 = i19 - 1;
                                                    iArr[i26] = 1;
                                                    Toast.makeText((Context) null, iArr[((i19 * i26) % 2) - 1], 1).show();
                                                    int i27 = ((int[]) objArr[1])[0];
                                                    Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                                                    int i28 = ~(((int) Process.getElapsedCpuTime()) | (-100410639));
                                                    int i29 = i27 + (-714351656) + (((-140720868) | i28) * (-220)) + ((i28 | 94110988) * 220) + 631261116;
                                                    int i30 = (i29 << 13) ^ i29;
                                                    int i31 = i30 ^ (i30 >>> 17);
                                                    ((int[]) objArr22[1])[0] = i31 ^ (i31 << 5);
                                                }
                                                return (Unit) DeviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), new Object[]{this.TuitionPaymentFragmentbindingInflater1}, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), 2027421462, -2027421461, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1());
                                            }

                                            /* JADX WARN: Code duplicated, block: B:54:0x021d A[PHI: r0
  0x021d: PHI (r0v9 int) = (r0v8 int), (r0v38 int) binds: [B:53:0x021b, B:50:0x0209] A[DONT_GENERATE, DONT_INLINE]] */
                                            /* JADX WARN: Code duplicated, block: B:55:0x021f A[PHI: r0
  0x021f: PHI (r0v35 int) = (r0v8 int), (r0v38 int) binds: [B:53:0x021b, B:50:0x0209] A[DONT_GENERATE, DONT_INLINE]] */
                                            private static void d(int i9, int i10, short s, byte b2, int i11, Object[] objArr) throws Throwable {
                                                boolean z;
                                                int i12;
                                                int i13;
                                                int i14 = 2;
                                                int i15 = 2 % 2;
                                                SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                                                StringBuilder sb = new StringBuilder();
                                                try {
                                                    Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                        byte b3 = (byte) 0;
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 2266 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 32, 1387473586, false, $$g(b3, b3, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                                                    }
                                                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                                                    if (iIntValue == -1) {
                                                        int i16 = $10 + 115;
                                                        $11 = i16 % 128;
                                                        int i17 = i16 % 2;
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (z) {
                                                        byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                        if (bArr != null) {
                                                            int i18 = $11 + 111;
                                                            int i19 = i18 % 128;
                                                            $10 = i19;
                                                            int i20 = i18 % 2;
                                                            int length = bArr.length;
                                                            byte[] bArr2 = new byte[length];
                                                            int i21 = i19 + 51;
                                                            $11 = i21 % 128;
                                                            int i22 = i21 % 2;
                                                            int i23 = 0;
                                                            while (i23 < length) {
                                                                int i24 = $11 + 7;
                                                                $10 = i24 % 128;
                                                                if (i24 % i14 != 0) {
                                                                    try {
                                                                        Object[] objArr3 = {Integer.valueOf(bArr[i23])};
                                                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                                            byte b4 = (byte) 0;
                                                                            byte b5 = b4;
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", ""), TextUtils.getOffsetAfter("", 0) + 3358, TextUtils.indexOf("", "") + 18, -1054011043, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                                                                        }
                                                                        bArr2[i23] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                                                        i23 >>= 1;
                                                                    } catch (Throwable th) {
                                                                        Throwable cause = th.getCause();
                                                                        if (cause == null) {
                                                                            throw th;
                                                                        }
                                                                        throw cause;
                                                                    }
                                                                } else {
                                                                    Object[] objArr4 = {Integer.valueOf(bArr[i23])};
                                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                                        byte b6 = (byte) 0;
                                                                        byte b7 = b6;
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.indexOf("", "", 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3358, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 18, -1054011043, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE});
                                                                    }
                                                                    bArr2[i23] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                                                                    i23++;
                                                                }
                                                                i14 = 2;
                                                            }
                                                            bArr = bArr2;
                                                        }
                                                        if (bArr != null) {
                                                            byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                            Object[] objArr5 = {Integer.valueOf(i11), Integer.valueOf(b)};
                                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                                byte b8 = (byte) 0;
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.lastIndexOf("", '0', 0) + 2268, (Process.myPid() >> 22) + 33, 1387473586, false, $$g(b8, b8, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                                                            }
                                                            iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                                                        } else {
                                                            iIntValue = (short) (((short) (((long) asBinder[i11 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                                                        }
                                                    }
                                                    if (iIntValue > 0) {
                                                        int i25 = $10 + 33;
                                                        $11 = i25 % 128;
                                                        if (i25 % 2 == 0) {
                                                            i12 = ((i11 % iIntValue) << 3) * ((int) (((long) b) % 3046761265686732006L));
                                                            if (z) {
                                                                i13 = 1;
                                                            } else {
                                                                i13 = 0;
                                                            }
                                                        } else {
                                                            i12 = ((i11 + iIntValue) - 2) + ((int) (((long) b) ^ 3046761265686732006L));
                                                            if (z) {
                                                                i13 = 1;
                                                            } else {
                                                                i13 = 0;
                                                            }
                                                        }
                                                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i12 + i13;
                                                        Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i9), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), sb};
                                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                            byte b9 = (byte) 0;
                                                            byte b10 = b9;
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (55905 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 2855, 12 - TextUtils.indexOf((CharSequence) "", '0'), -1529949196, false, $$g(b9, b10, (byte) (b10 + 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                                                        }
                                                        ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                        byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                        if (bArr4 != null) {
                                                            int length2 = bArr4.length;
                                                            byte[] bArr5 = new byte[length2];
                                                            for (int i26 = 0; i26 < length2; i26++) {
                                                                bArr5[i26] = (byte) (((long) bArr4[i26]) ^ 3046761265686732006L);
                                                            }
                                                            bArr4 = bArr5;
                                                        }
                                                        boolean z2 = bArr4 != null;
                                                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                                                        while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                                                            if (z2) {
                                                                byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                int i27 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i27 - 1;
                                                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i27]) ^ 3046761265686732006L)) + s)) ^ b2));
                                                            } else {
                                                                short[] sArr = asBinder;
                                                                int i28 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i28 - 1;
                                                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i28]) ^ 3046761265686732006L)) + s)) ^ b2));
                                                            }
                                                            sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                                                        }
                                                    }
                                                    objArr[0] = sb.toString();
                                                } catch (Throwable th2) {
                                                    Throwable cause2 = th2.getCause();
                                                    if (cause2 == null) {
                                                        throw th2;
                                                    }
                                                    throw cause2;
                                                }
                                            }

                                            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
                                            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
                                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
                                            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                                                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                                */
                                            private static java.lang.String $$g(short r7, int r8, byte r9) {
                                                /*
                                                    byte[] r0 = defpackage.getSampleTile.$$c
                                                    int r9 = 121 - r9
                                                    int r8 = r8 * 3
                                                    int r8 = 1 - r8
                                                    int r7 = r7 * 3
                                                    int r7 = 3 - r7
                                                    byte[] r1 = new byte[r8]
                                                    r2 = 0
                                                    if (r0 != 0) goto L15
                                                    r9 = r7
                                                    r3 = r8
                                                    r4 = r2
                                                    goto L2a
                                                L15:
                                                    r3 = r2
                                                L16:
                                                    int r4 = r3 + 1
                                                    byte r5 = (byte) r9
                                                    r1[r3] = r5
                                                    if (r4 != r8) goto L23
                                                    java.lang.String r7 = new java.lang.String
                                                    r7.<init>(r1, r2)
                                                    return r7
                                                L23:
                                                    int r7 = r7 + 1
                                                    r3 = r0[r7]
                                                    r6 = r9
                                                    r9 = r7
                                                    r7 = r6
                                                L2a:
                                                    int r7 = r7 + r3
                                                    r3 = r4
                                                    r6 = r9
                                                    r9 = r7
                                                    r7 = r6
                                                    goto L16
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: defpackage.getSampleTile.$$g(short, int, byte):java.lang.String");
                                            }
                                        }, (128 & 32) != 0 ? null : null, (128 & 64) != 0 ? null : null, (128 & 128) != 0 ? false : false);
                                        supportFragmentManager = deviceUnlinkingBiometricActivity.getSupportFragmentManager();
                                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                                        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                                        if (supportFragmentManager.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                            outputConfigurationCompatApi33ImplB.show(supportFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                        }
                                    } else if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                        i = isConnected + 117;
                                        unsubscribe = i % 128;
                                        if (i % 2 == 0 ? !Intrinsics.areEqual(listSplit$default5.get(0), "false") : !Intrinsics.areEqual(listSplit$default5.get(1), "false")) {
                                            if (!Intrinsics.areEqual(listSplit$default4.get(0), "true") && Intrinsics.areEqual(listSplit$default5.get(0), "true") && Intrinsics.areEqual(listSplit$default3.get(0), "false")) {
                                                OutputConfigurationCompatApi33Impl.Companion companion2 = OutputConfigurationCompatApi33Impl.INSTANCE;
                                                String string4 = deviceUnlinkingBiometricActivity.getString(R.string.label_title_validation_account_dialog);
                                                Intrinsics.checkNotNullExpressionValue(string4, "");
                                                String string5 = deviceUnlinkingBiometricActivity.getString(R.string.action_booking_antrean_online);
                                                Intrinsics.checkNotNullExpressionValue(string5, "");
                                                outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.notfound, string4, "Agar proses pergantian perangkat JMO Anda dapat dilanjutkan, silakan Appointment Online ke Kantor Cabang terdekat.", string5, (128 & 16) != 0 ? null : new Function0() { // from class: getSampleTile
                                                    private static short[] asBinder;
                                                    private static final byte[] $$c = {70, -114, 113, 8};
                                                    private static final int $$f = 88;
                                                    private static int $10 = 0;
                                                    private static int $11 = 1;
                                                    private static final byte[] $$d = {ByteCompanionObject.MAX_VALUE, 43, -39, -37, 18, 4, -57, 69, 2, 1, 22, 4, -11, 19, 11, -63, 75, -9, 13, -55, 77, -6, 8, 4, 17, -64, 78, -7, 2, 24, 2, -63, 59, 21, -7, 5, 11, 17, -11, 4, 23, -8, -48, 60, 7, 21, -13, 14, 9, 13, -63, 27, 53, -7, 5, 11, 17, -43, 36, 23, -8, -26, 39, 21, -13, 14, 9, 13, -44, 40, 23, -5, 19, -7, 17, 11, -79, 24, 39, -6, 17, -5, 12, 5, -24, 23, 30, -6, -2, 15, 12, -40, 50, -11, 12, 12, -2, 15, 12, 5, 3, -5, 4, 12, -2, 17, 3, 11, 4, 3, 11, -3, 5, 24, -7, 2, 24, -36, 40, -5, 7, 13, -2, 7, 7, 1, 26, -3, 14, -59};
                                                    private static final int $$e = 27;
                                                    private static final byte[] $$a = {21, ByteCompanionObject.MAX_VALUE, 49, -115, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
                                                    private static final int $$b = 253;
                                                    private static int asInterface = 0;

                                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                                    private static int f974a = 1;
                                                    private static int b = -1736658508;
                                                    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1934795551;
                                                    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1753505840;
                                                    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {-69, -81, -66, -104, -51, -69, -96, -80, -87, -99, -100, -10, -65, 112, -7, -74, -87, -76, -123, -83, -124, -10, -6, -21, -58, -59, -14, -51, -32, -15, -20, -3, -63, -21, -7, 89, 94, 73, 32, 54, 113, 39, 33, 73, 47, 87, 43, 56, 41, -100, 90, 45, 9, 96, 81, 80, 95, 44, 84, 47, -85, -78, -91, -121, -86, -82, -83, -84, -88, -101, -3, -78, -79, -89, -88, -83, -122, 1, 54, 6, 63, -29, -30, 64, 62, 10, 50, -5, 74, 44, 18, 48, -27, 17, -56, 59, 17, -14, -3, 55, -31, -21, 17, -18, -19, -27, 27, -26, -26, -26, -26, -26, -26};

                                                    private static void c(byte b2, short s, short s2, Object[] objArr) {
                                                        int i9 = 84 - (b2 * 4);
                                                        byte[] bArr = $$a;
                                                        int i10 = s2 * 15;
                                                        int i11 = 92 - s;
                                                        byte[] bArr2 = new byte[53 - i10];
                                                        int i12 = 52 - i10;
                                                        int i13 = -1;
                                                        if (bArr == null) {
                                                            int i14 = (i11 + (-i12)) - 11;
                                                            i11 = i11;
                                                            i9 = i14;
                                                        }
                                                        while (true) {
                                                            i13++;
                                                            int i15 = i11 + 1;
                                                            bArr2[i13] = (byte) i9;
                                                            if (i13 == i12) {
                                                                objArr[0] = new String(bArr2, 0);
                                                                return;
                                                            }
                                                            i11 = i15;
                                                            i9 = (i9 + (-bArr[i15])) - 11;
                                                        }
                                                    }

                                                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                                                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                                        */
                                                    private static void e(int r6, short r7, short r8, java.lang.Object[] r9) {
                                                        /*
                                                            int r8 = r8 * 22
                                                            int r0 = 75 - r8
                                                            int r6 = r6 * 15
                                                            int r6 = 99 - r6
                                                            int r7 = r7 * 74
                                                            int r7 = 78 - r7
                                                            byte[] r1 = defpackage.getSampleTile.$$d
                                                            byte[] r0 = new byte[r0]
                                                            int r8 = 74 - r8
                                                            r2 = 0
                                                            if (r1 != 0) goto L19
                                                            r6 = r7
                                                            r4 = r8
                                                            r3 = r2
                                                            goto L2e
                                                        L19:
                                                            r3 = r2
                                                        L1a:
                                                            byte r4 = (byte) r6
                                                            r0[r3] = r4
                                                            if (r3 != r8) goto L27
                                                            java.lang.String r6 = new java.lang.String
                                                            r6.<init>(r0, r2)
                                                            r9[r2] = r6
                                                            return
                                                        L27:
                                                            int r3 = r3 + 1
                                                            r4 = r1[r7]
                                                            r5 = r7
                                                            r7 = r6
                                                            r6 = r5
                                                        L2e:
                                                            int r7 = r7 + r4
                                                            int r6 = r6 + 1
                                                            int r7 = r7 + (-6)
                                                            r5 = r7
                                                            r7 = r6
                                                            r6 = r5
                                                            goto L1a
                                                        */
                                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.getSampleTile.e(int, short, short, java.lang.Object[]):void");
                                                    }

                                                    /* JADX WARN: Code duplicated, block: B:22:0x027f  */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() throws Throwable {
                                                        Object[] objArr;
                                                        int i9 = 2 % 2;
                                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                                            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 877;
                                                            int jumpTapTimeout = 10 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                                            byte[] bArr = $$a;
                                                            byte b2 = bArr[7];
                                                            Object[] objArr2 = new Object[1];
                                                            c(b2, (byte) (b2 | 89), bArr[5], objArr2);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, iLastIndexOf, jumpTapTimeout, -1650998592, false, (String) objArr2[0], null);
                                                        }
                                                        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                                                        Object[] objArr3 = new Object[1];
                                                        d(467059595 - (KeyEvent.getMaxKeyCode() >> 16), 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (TextUtils.lastIndexOf("", '0') - 84), (byte) ((Process.getThreadPriority(0) + 20) >> 6), (-349302099) - TextUtils.lastIndexOf("", '0'), objArr3);
                                                        Class<?> cls = Class.forName((String) objArr3[0]);
                                                        Object[] objArr4 = new Object[1];
                                                        d(TextUtils.getOffsetBefore("", 0) + 467059599, (ViewConfiguration.getScrollBarSize() >> 8) + 8, (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 25), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (ViewConfiguration.getScrollBarSize() >> 8) - 349302077, objArr4);
                                                        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                                                            int iGreen = Color.green(0) + 876;
                                                            int i10 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
                                                            byte b3 = $$a[7];
                                                            byte b4 = b3;
                                                            Object[] objArr5 = new Object[1];
                                                            c(b4, (byte) (b4 | 52), b3, objArr5);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(bitsPerPixel, iGreen, i10, 2012020043, false, (String) objArr5[0], null);
                                                        }
                                                        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                                                            int i11 = asInterface + 57;
                                                            f974a = i11 % 128;
                                                            int i12 = i11 % 2;
                                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 876;
                                                                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 10;
                                                                byte b5 = $$a[7];
                                                                byte b6 = b5;
                                                                Object[] objArr6 = new Object[1];
                                                                c(b5, b6, b6, objArr6);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, minimumFlingVelocity, tapTimeout, 2012931276, false, (String) objArr6[0], null);
                                                            }
                                                            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                                                            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                                                            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                                                            int i13 = (-944343232) + (((~((-134817830) | startElapsedRealtime)) | (~((~startElapsedRealtime) | (-94507601)))) * (-318)) + (((~(710518821 | startElapsedRealtime)) | (-805026422)) * (-318)) + (((~(startElapsedRealtime | (-710518822))) | 670208592) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 1805273919;
                                                            int i14 = (i13 << 13) ^ i13;
                                                            int i15 = i14 ^ (i14 >>> 17);
                                                            ((int[]) objArr[1])[0] = i15 ^ (i15 << 5);
                                                        } else {
                                                            Object[] objArr8 = new Object[1];
                                                            d(467059595 - ((Process.getThreadPriority(0) + 20) >> 6), ExpandableListView.getPackedPositionGroup(0L) + 19, (short) (68 - View.combineMeasuredStates(0, 0)), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-349302063) - TextUtils.getOffsetAfter("", 0), objArr8);
                                                            Class<?> cls2 = Class.forName((String) objArr8[0]);
                                                            Object[] objArr9 = new Object[1];
                                                            d(467059597 - KeyEvent.normalizeMetaState(0), 11 - Color.alpha(0), (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 77), (byte) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 349302039, objArr9);
                                                            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                                                            if (applicationContext != null) {
                                                                if (applicationContext instanceof ContextWrapper) {
                                                                    int i16 = asInterface + 19;
                                                                    f974a = i16 % 128;
                                                                    int i17 = i16 % 2;
                                                                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                                                        applicationContext = applicationContext.getApplicationContext();
                                                                    } else {
                                                                        applicationContext = null;
                                                                    }
                                                                } else {
                                                                    applicationContext = applicationContext.getApplicationContext();
                                                                }
                                                            }
                                                            Object[] objArr10 = new Object[1];
                                                            d(467059604 - TextUtils.getOffsetAfter("", 0), 9 - KeyEvent.keyCodeFromString(""), (short) (34 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (byte) View.resolveSizeAndState(0, 0, 0), (KeyEvent.getMaxKeyCode() >> 16) - 349302021, objArr10);
                                                            Class<?> cls3 = Class.forName((String) objArr10[0]);
                                                            Object[] objArr11 = new Object[1];
                                                            d((ViewConfiguration.getWindowTouchSlop() >> 8) + 467059603, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 9, (short) (TextUtils.getOffsetBefore("", 0) - 2), (byte) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 349302007, objArr11);
                                                            try {
                                                                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1805273919};
                                                                byte[] bArr2 = $$d;
                                                                byte b7 = bArr2[9];
                                                                byte b8 = (byte) (b7 - 1);
                                                                byte b9 = b7;
                                                                Object[] objArr13 = new Object[1];
                                                                e(b8, b9, (byte) (b9 - 1), objArr13);
                                                                Class<?> cls4 = Class.forName((String) objArr13[0]);
                                                                byte b10 = bArr2[9];
                                                                byte b11 = b10;
                                                                Object[] objArr14 = new Object[1];
                                                                e(b11, (byte) (b11 - 1), b10, objArr14);
                                                                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                                                                if (applicationContext != null) {
                                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                                        char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                                                                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 876;
                                                                        int minimumFlingVelocity2 = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                                        byte b12 = $$a[7];
                                                                        byte b13 = b12;
                                                                        Object[] objArr16 = new Object[1];
                                                                        c(b12, b13, b13, objArr16);
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, keyRepeatTimeout, minimumFlingVelocity2, 2012931276, false, (String) objArr16[0], null);
                                                                    }
                                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                                                                    try {
                                                                        Object[] objArr17 = new Object[1];
                                                                        d((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 467059595, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, (short) (View.resolveSize(0, 0) - 85), (byte) View.MeasureSpec.getSize(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 349302098, objArr17);
                                                                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                                                                        Object[] objArr18 = new Object[1];
                                                                        d(TextUtils.getOffsetBefore("", 0) + 467059599, 8 - View.MeasureSpec.makeMeasureSpec(0, 0), (short) (ExpandableListView.getPackedPositionType(0L) - 24), (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), TextUtils.indexOf((CharSequence) "", '0') - 349302076, objArr18);
                                                                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                                                        Long lValueOf = Long.valueOf(jLongValue2);
                                                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                                            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                                                                            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 876;
                                                                            int iMyPid = (Process.myPid() >> 22) + 10;
                                                                            byte b14 = $$a[7];
                                                                            byte b15 = b14;
                                                                            Object[] objArr19 = new Object[1];
                                                                            c(b15, (byte) (b15 | 52), b14, objArr19);
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates, offsetBefore, iMyPid, 2012020043, false, (String) objArr19[0], null);
                                                                        }
                                                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                                                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                                            char mode = (char) View.MeasureSpec.getMode(0);
                                                                            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 876;
                                                                            int windowTouchSlop = 10 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                                            byte[] bArr3 = $$a;
                                                                            byte b16 = bArr3[7];
                                                                            Object[] objArr20 = new Object[1];
                                                                            c(b16, (byte) (b16 | 89), bArr3[5], objArr20);
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode, packedPositionType, windowTouchSlop, -1650998592, false, (String) objArr20[0], null);
                                                                        }
                                                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                                                    } catch (Exception unused) {
                                                                        throw new RuntimeException();
                                                                    }
                                                                }
                                                                objArr = objArr15;
                                                            } catch (Throwable th) {
                                                                Throwable cause = th.getCause();
                                                                if (cause != null) {
                                                                    throw cause;
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        int i18 = ((int[]) objArr[2])[0];
                                                        int i19 = ((int[]) objArr[0])[0];
                                                        if (i19 == i18) {
                                                            int i20 = ((int[]) objArr[1])[0];
                                                            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                                                            int i21 = ~System.identityHashCode(this);
                                                            int i22 = ~(570919774 | i21);
                                                            int i23 = i20 + 1453888012 + ((i22 | (-530609546)) * 764) + (((~(i21 | (-530609546))) | 33554696) * (-1528)) + (((-1034419928) | i22) * 764);
                                                            int i24 = (i23 << 13) ^ i23;
                                                            int i25 = i24 ^ (i24 >>> 17);
                                                            ((int[]) objArr21[1])[0] = i25 ^ (i25 << 5);
                                                        } else {
                                                            int[] iArr = new int[i19];
                                                            int i26 = i19 - 1;
                                                            iArr[i26] = 1;
                                                            Toast.makeText((Context) null, iArr[((i19 * i26) % 2) - 1], 1).show();
                                                            int i27 = ((int[]) objArr[1])[0];
                                                            Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                                                            int i28 = ~(((int) Process.getElapsedCpuTime()) | (-100410639));
                                                            int i29 = i27 + (-714351656) + (((-140720868) | i28) * (-220)) + ((i28 | 94110988) * 220) + 631261116;
                                                            int i30 = (i29 << 13) ^ i29;
                                                            int i31 = i30 ^ (i30 >>> 17);
                                                            ((int[]) objArr22[1])[0] = i31 ^ (i31 << 5);
                                                        }
                                                        return (Unit) DeviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), new Object[]{this.TuitionPaymentFragmentbindingInflater1}, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), 2027421462, -2027421461, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1());
                                                    }

                                                    /* JADX WARN: Code duplicated, block: B:54:0x021d A[PHI: r0
  0x021d: PHI (r0v9 int) = (r0v8 int), (r0v38 int) binds: [B:53:0x021b, B:50:0x0209] A[DONT_GENERATE, DONT_INLINE]] */
                                                    /* JADX WARN: Code duplicated, block: B:55:0x021f A[PHI: r0
  0x021f: PHI (r0v35 int) = (r0v8 int), (r0v38 int) binds: [B:53:0x021b, B:50:0x0209] A[DONT_GENERATE, DONT_INLINE]] */
                                                    private static void d(int i9, int i10, short s, byte b2, int i11, Object[] objArr) throws Throwable {
                                                        boolean z;
                                                        int i12;
                                                        int i13;
                                                        int i14 = 2;
                                                        int i15 = 2 % 2;
                                                        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                                                        StringBuilder sb = new StringBuilder();
                                                        try {
                                                            Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                                byte b3 = (byte) 0;
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 2266 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 32, 1387473586, false, $$g(b3, b3, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                                                            }
                                                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                                                            if (iIntValue == -1) {
                                                                int i16 = $10 + 115;
                                                                $11 = i16 % 128;
                                                                int i17 = i16 % 2;
                                                                z = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                            if (z) {
                                                                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                if (bArr != null) {
                                                                    int i18 = $11 + 111;
                                                                    int i19 = i18 % 128;
                                                                    $10 = i19;
                                                                    int i20 = i18 % 2;
                                                                    int length = bArr.length;
                                                                    byte[] bArr2 = new byte[length];
                                                                    int i21 = i19 + 51;
                                                                    $11 = i21 % 128;
                                                                    int i22 = i21 % 2;
                                                                    int i23 = 0;
                                                                    while (i23 < length) {
                                                                        int i24 = $11 + 7;
                                                                        $10 = i24 % 128;
                                                                        if (i24 % i14 != 0) {
                                                                            try {
                                                                                Object[] objArr3 = {Integer.valueOf(bArr[i23])};
                                                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                                                    byte b4 = (byte) 0;
                                                                                    byte b5 = b4;
                                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", ""), TextUtils.getOffsetAfter("", 0) + 3358, TextUtils.indexOf("", "") + 18, -1054011043, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                                                                                }
                                                                                bArr2[i23] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                                                                i23 >>= 1;
                                                                            } catch (Throwable th) {
                                                                                Throwable cause = th.getCause();
                                                                                if (cause == null) {
                                                                                    throw th;
                                                                                }
                                                                                throw cause;
                                                                            }
                                                                        } else {
                                                                            Object[] objArr4 = {Integer.valueOf(bArr[i23])};
                                                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                                                byte b6 = (byte) 0;
                                                                                byte b7 = b6;
                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.indexOf("", "", 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3358, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 18, -1054011043, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE});
                                                                            }
                                                                            bArr2[i23] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                                                                            i23++;
                                                                        }
                                                                        i14 = 2;
                                                                    }
                                                                    bArr = bArr2;
                                                                }
                                                                if (bArr != null) {
                                                                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                    Object[] objArr5 = {Integer.valueOf(i11), Integer.valueOf(b)};
                                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                                        byte b8 = (byte) 0;
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.lastIndexOf("", '0', 0) + 2268, (Process.myPid() >> 22) + 33, 1387473586, false, $$g(b8, b8, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                                                                    }
                                                                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                                                                } else {
                                                                    iIntValue = (short) (((short) (((long) asBinder[i11 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                                                                }
                                                            }
                                                            if (iIntValue > 0) {
                                                                int i25 = $10 + 33;
                                                                $11 = i25 % 128;
                                                                if (i25 % 2 == 0) {
                                                                    i12 = ((i11 % iIntValue) << 3) * ((int) (((long) b) % 3046761265686732006L));
                                                                    if (z) {
                                                                        i13 = 1;
                                                                    } else {
                                                                        i13 = 0;
                                                                    }
                                                                } else {
                                                                    i12 = ((i11 + iIntValue) - 2) + ((int) (((long) b) ^ 3046761265686732006L));
                                                                    if (z) {
                                                                        i13 = 1;
                                                                    } else {
                                                                        i13 = 0;
                                                                    }
                                                                }
                                                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i12 + i13;
                                                                Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i9), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), sb};
                                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                                    byte b9 = (byte) 0;
                                                                    byte b10 = b9;
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (55905 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 2855, 12 - TextUtils.indexOf((CharSequence) "", '0'), -1529949196, false, $$g(b9, b10, (byte) (b10 + 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                                                                }
                                                                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                if (bArr4 != null) {
                                                                    int length2 = bArr4.length;
                                                                    byte[] bArr5 = new byte[length2];
                                                                    for (int i26 = 0; i26 < length2; i26++) {
                                                                        bArr5[i26] = (byte) (((long) bArr4[i26]) ^ 3046761265686732006L);
                                                                    }
                                                                    bArr4 = bArr5;
                                                                }
                                                                boolean z2 = bArr4 != null;
                                                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                                                                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                                                                    if (z2) {
                                                                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                        int i27 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                                                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i27 - 1;
                                                                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i27]) ^ 3046761265686732006L)) + s)) ^ b2));
                                                                    } else {
                                                                        short[] sArr = asBinder;
                                                                        int i28 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                                                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i28 - 1;
                                                                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i28]) ^ 3046761265686732006L)) + s)) ^ b2));
                                                                    }
                                                                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                                                                }
                                                            }
                                                            objArr[0] = sb.toString();
                                                        } catch (Throwable th2) {
                                                            Throwable cause2 = th2.getCause();
                                                            if (cause2 == null) {
                                                                throw th2;
                                                            }
                                                            throw cause2;
                                                        }
                                                    }

                                                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                                                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                                        */
                                                    private static java.lang.String $$g(short r7, int r8, byte r9) {
                                                        /*
                                                            byte[] r0 = defpackage.getSampleTile.$$c
                                                            int r9 = 121 - r9
                                                            int r8 = r8 * 3
                                                            int r8 = 1 - r8
                                                            int r7 = r7 * 3
                                                            int r7 = 3 - r7
                                                            byte[] r1 = new byte[r8]
                                                            r2 = 0
                                                            if (r0 != 0) goto L15
                                                            r9 = r7
                                                            r3 = r8
                                                            r4 = r2
                                                            goto L2a
                                                        L15:
                                                            r3 = r2
                                                        L16:
                                                            int r4 = r3 + 1
                                                            byte r5 = (byte) r9
                                                            r1[r3] = r5
                                                            if (r4 != r8) goto L23
                                                            java.lang.String r7 = new java.lang.String
                                                            r7.<init>(r1, r2)
                                                            return r7
                                                        L23:
                                                            int r7 = r7 + 1
                                                            r3 = r0[r7]
                                                            r6 = r9
                                                            r9 = r7
                                                            r7 = r6
                                                        L2a:
                                                            int r7 = r7 + r3
                                                            r3 = r4
                                                            r6 = r9
                                                            r9 = r7
                                                            r7 = r6
                                                            goto L16
                                                        */
                                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.getSampleTile.$$g(short, int, byte):java.lang.String");
                                                    }
                                                }, (128 & 32) != 0 ? null : null, (128 & 64) != 0 ? null : null, (128 & 128) != 0 ? false : false);
                                                supportFragmentManager = deviceUnlinkingBiometricActivity.getSupportFragmentManager();
                                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                                                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                                                if (supportFragmentManager.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                                    outputConfigurationCompatApi33ImplB.show(supportFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                                }
                                            } else if (!Intrinsics.areEqual(listSplit$default4.get(0), "false") && Intrinsics.areEqual(listSplit$default5.get(0), "true") && Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                                getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                                String str = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                                getstreamusecasesupportedcombinationlist.TuitionPaymentFragmentbindingInflater1(str != null ? str : "", deviceUnlinkingBiometricActivity.getRoot);
                                            } else {
                                                if (Intrinsics.areEqual(listSplit$default4.get(0), "true") && Intrinsics.areEqual(listSplit$default5.get(0), "true")) {
                                                    int i9 = unsubscribe + 73;
                                                    isConnected = i9 % 128;
                                                    int i10 = i9 % 2;
                                                    if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                                        getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist2 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                                        String str2 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                                        getstreamusecasesupportedcombinationlist2.TuitionPaymentFragmentbindingInflater1(str2 != null ? str2 : "", deviceUnlinkingBiometricActivity.getRoot);
                                                    }
                                                }
                                                deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                            }
                                        } else if (!Intrinsics.areEqual(listSplit$default3.get(0), "false")) {
                                            if (!Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                            }
                                            if (!Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                                if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                                    int i11 = unsubscribe + 73;
                                                    isConnected = i11 % 128;
                                                    int i12 = i11 % 2;
                                                    if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                                        getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist3 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                                        String str3 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                                        getstreamusecasesupportedcombinationlist3.TuitionPaymentFragmentbindingInflater1(str3 != null ? str3 : "", deviceUnlinkingBiometricActivity.getRoot);
                                                    }
                                                }
                                                deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                            } else {
                                                if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                                    int i13 = unsubscribe + 73;
                                                    isConnected = i13 % 128;
                                                    int i14 = i13 % 2;
                                                    if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                                        getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist4 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                                        String str4 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                                        getstreamusecasesupportedcombinationlist4.TuitionPaymentFragmentbindingInflater1(str4 != null ? str4 : "", deviceUnlinkingBiometricActivity.getRoot);
                                                    }
                                                }
                                                deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                            }
                                        } else {
                                            OutputConfigurationCompatApi33Impl.Companion companion3 = OutputConfigurationCompatApi33Impl.INSTANCE;
                                            String string6 = deviceUnlinkingBiometricActivity.getString(R.string.label_title_validation_account_dialog);
                                            Intrinsics.checkNotNullExpressionValue(string6, "");
                                            String string7 = deviceUnlinkingBiometricActivity.getString(R.string.action_booking_antrean_online);
                                            Intrinsics.checkNotNullExpressionValue(string7, "");
                                            outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.notfound, string6, "Agar proses pergantian perangkat JMO Anda dapat dilanjutkan, silakan Appointment Online ke Kantor Cabang terdekat.", string7, (128 & 16) != 0 ? null : new Function0() { // from class: getSampleTile
                                                private static short[] asBinder;
                                                private static final byte[] $$c = {70, -114, 113, 8};
                                                private static final int $$f = 88;
                                                private static int $10 = 0;
                                                private static int $11 = 1;
                                                private static final byte[] $$d = {ByteCompanionObject.MAX_VALUE, 43, -39, -37, 18, 4, -57, 69, 2, 1, 22, 4, -11, 19, 11, -63, 75, -9, 13, -55, 77, -6, 8, 4, 17, -64, 78, -7, 2, 24, 2, -63, 59, 21, -7, 5, 11, 17, -11, 4, 23, -8, -48, 60, 7, 21, -13, 14, 9, 13, -63, 27, 53, -7, 5, 11, 17, -43, 36, 23, -8, -26, 39, 21, -13, 14, 9, 13, -44, 40, 23, -5, 19, -7, 17, 11, -79, 24, 39, -6, 17, -5, 12, 5, -24, 23, 30, -6, -2, 15, 12, -40, 50, -11, 12, 12, -2, 15, 12, 5, 3, -5, 4, 12, -2, 17, 3, 11, 4, 3, 11, -3, 5, 24, -7, 2, 24, -36, 40, -5, 7, 13, -2, 7, 7, 1, 26, -3, 14, -59};
                                                private static final int $$e = 27;
                                                private static final byte[] $$a = {21, ByteCompanionObject.MAX_VALUE, 49, -115, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
                                                private static final int $$b = 253;
                                                private static int asInterface = 0;

                                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                                private static int f974a = 1;
                                                private static int b = -1736658508;
                                                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1934795551;
                                                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1753505840;
                                                private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {-69, -81, -66, -104, -51, -69, -96, -80, -87, -99, -100, -10, -65, 112, -7, -74, -87, -76, -123, -83, -124, -10, -6, -21, -58, -59, -14, -51, -32, -15, -20, -3, -63, -21, -7, 89, 94, 73, 32, 54, 113, 39, 33, 73, 47, 87, 43, 56, 41, -100, 90, 45, 9, 96, 81, 80, 95, 44, 84, 47, -85, -78, -91, -121, -86, -82, -83, -84, -88, -101, -3, -78, -79, -89, -88, -83, -122, 1, 54, 6, 63, -29, -30, 64, 62, 10, 50, -5, 74, 44, 18, 48, -27, 17, -56, 59, 17, -14, -3, 55, -31, -21, 17, -18, -19, -27, 27, -26, -26, -26, -26, -26, -26};

                                                private static void c(byte b2, short s, short s2, Object[] objArr) {
                                                    int i15 = 84 - (b2 * 4);
                                                    byte[] bArr = $$a;
                                                    int i16 = s2 * 15;
                                                    int i17 = 92 - s;
                                                    byte[] bArr2 = new byte[53 - i16];
                                                    int i18 = 52 - i16;
                                                    int i19 = -1;
                                                    if (bArr == null) {
                                                        int i110 = (i17 + (-i18)) - 11;
                                                        i17 = i17;
                                                        i15 = i110;
                                                    }
                                                    while (true) {
                                                        i19++;
                                                        int i111 = i17 + 1;
                                                        bArr2[i19] = (byte) i15;
                                                        if (i19 == i18) {
                                                            objArr[0] = new String(bArr2, 0);
                                                            return;
                                                        }
                                                        i17 = i111;
                                                        i15 = (i15 + (-bArr[i111])) - 11;
                                                    }
                                                }

                                                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                                                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                                    */
                                                private static void e(int r6, short r7, short r8, java.lang.Object[] r9) {
                                                    /*
                                                        int r8 = r8 * 22
                                                        int r0 = 75 - r8
                                                        int r6 = r6 * 15
                                                        int r6 = 99 - r6
                                                        int r7 = r7 * 74
                                                        int r7 = 78 - r7
                                                        byte[] r1 = defpackage.getSampleTile.$$d
                                                        byte[] r0 = new byte[r0]
                                                        int r8 = 74 - r8
                                                        r2 = 0
                                                        if (r1 != 0) goto L19
                                                        r6 = r7
                                                        r4 = r8
                                                        r3 = r2
                                                        goto L2e
                                                    L19:
                                                        r3 = r2
                                                    L1a:
                                                        byte r4 = (byte) r6
                                                        r0[r3] = r4
                                                        if (r3 != r8) goto L27
                                                        java.lang.String r6 = new java.lang.String
                                                        r6.<init>(r0, r2)
                                                        r9[r2] = r6
                                                        return
                                                    L27:
                                                        int r3 = r3 + 1
                                                        r4 = r1[r7]
                                                        r5 = r7
                                                        r7 = r6
                                                        r6 = r5
                                                    L2e:
                                                        int r7 = r7 + r4
                                                        int r6 = r6 + 1
                                                        int r7 = r7 + (-6)
                                                        r5 = r7
                                                        r7 = r6
                                                        r6 = r5
                                                        goto L1a
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.getSampleTile.e(int, short, short, java.lang.Object[]):void");
                                                }

                                                /* JADX WARN: Code duplicated, block: B:22:0x027f  */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() throws Throwable {
                                                    Object[] objArr;
                                                    int i15 = 2 % 2;
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                        char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 877;
                                                        int jumpTapTimeout = 10 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                                        byte[] bArr = $$a;
                                                        byte b2 = bArr[7];
                                                        Object[] objArr2 = new Object[1];
                                                        c(b2, (byte) (b2 | 89), bArr[5], objArr2);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, iLastIndexOf, jumpTapTimeout, -1650998592, false, (String) objArr2[0], null);
                                                    }
                                                    long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                                                    Object[] objArr3 = new Object[1];
                                                    d(467059595 - (KeyEvent.getMaxKeyCode() >> 16), 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (TextUtils.lastIndexOf("", '0') - 84), (byte) ((Process.getThreadPriority(0) + 20) >> 6), (-349302099) - TextUtils.lastIndexOf("", '0'), objArr3);
                                                    Class<?> cls = Class.forName((String) objArr3[0]);
                                                    Object[] objArr4 = new Object[1];
                                                    d(TextUtils.getOffsetBefore("", 0) + 467059599, (ViewConfiguration.getScrollBarSize() >> 8) + 8, (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 25), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (ViewConfiguration.getScrollBarSize() >> 8) - 349302077, objArr4);
                                                    long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                                                        int iGreen = Color.green(0) + 876;
                                                        int i16 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
                                                        byte b3 = $$a[7];
                                                        byte b4 = b3;
                                                        Object[] objArr5 = new Object[1];
                                                        c(b4, (byte) (b4 | 52), b3, objArr5);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(bitsPerPixel, iGreen, i16, 2012020043, false, (String) objArr5[0], null);
                                                    }
                                                    if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                                                        int i17 = asInterface + 57;
                                                        f974a = i17 % 128;
                                                        int i18 = i17 % 2;
                                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 876;
                                                            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 10;
                                                            byte b5 = $$a[7];
                                                            byte b6 = b5;
                                                            Object[] objArr6 = new Object[1];
                                                            c(b5, b6, b6, objArr6);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, minimumFlingVelocity, tapTimeout, 2012931276, false, (String) objArr6[0], null);
                                                        }
                                                        Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                                                        objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                                                        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                                                        int i19 = (-944343232) + (((~((-134817830) | startElapsedRealtime)) | (~((~startElapsedRealtime) | (-94507601)))) * (-318)) + (((~(710518821 | startElapsedRealtime)) | (-805026422)) * (-318)) + (((~(startElapsedRealtime | (-710518822))) | 670208592) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 1805273919;
                                                        int i110 = (i19 << 13) ^ i19;
                                                        int i111 = i110 ^ (i110 >>> 17);
                                                        ((int[]) objArr[1])[0] = i111 ^ (i111 << 5);
                                                    } else {
                                                        Object[] objArr8 = new Object[1];
                                                        d(467059595 - ((Process.getThreadPriority(0) + 20) >> 6), ExpandableListView.getPackedPositionGroup(0L) + 19, (short) (68 - View.combineMeasuredStates(0, 0)), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-349302063) - TextUtils.getOffsetAfter("", 0), objArr8);
                                                        Class<?> cls2 = Class.forName((String) objArr8[0]);
                                                        Object[] objArr9 = new Object[1];
                                                        d(467059597 - KeyEvent.normalizeMetaState(0), 11 - Color.alpha(0), (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 77), (byte) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 349302039, objArr9);
                                                        Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                                                        if (applicationContext != null) {
                                                            if (applicationContext instanceof ContextWrapper) {
                                                                int i112 = asInterface + 19;
                                                                f974a = i112 % 128;
                                                                int i113 = i112 % 2;
                                                                if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                                                    applicationContext = applicationContext.getApplicationContext();
                                                                } else {
                                                                    applicationContext = null;
                                                                }
                                                            } else {
                                                                applicationContext = applicationContext.getApplicationContext();
                                                            }
                                                        }
                                                        Object[] objArr10 = new Object[1];
                                                        d(467059604 - TextUtils.getOffsetAfter("", 0), 9 - KeyEvent.keyCodeFromString(""), (short) (34 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (byte) View.resolveSizeAndState(0, 0, 0), (KeyEvent.getMaxKeyCode() >> 16) - 349302021, objArr10);
                                                        Class<?> cls3 = Class.forName((String) objArr10[0]);
                                                        Object[] objArr11 = new Object[1];
                                                        d((ViewConfiguration.getWindowTouchSlop() >> 8) + 467059603, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 9, (short) (TextUtils.getOffsetBefore("", 0) - 2), (byte) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 349302007, objArr11);
                                                        try {
                                                            Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1805273919};
                                                            byte[] bArr2 = $$d;
                                                            byte b7 = bArr2[9];
                                                            byte b8 = (byte) (b7 - 1);
                                                            byte b9 = b7;
                                                            Object[] objArr13 = new Object[1];
                                                            e(b8, b9, (byte) (b9 - 1), objArr13);
                                                            Class<?> cls4 = Class.forName((String) objArr13[0]);
                                                            byte b10 = bArr2[9];
                                                            byte b11 = b10;
                                                            Object[] objArr14 = new Object[1];
                                                            e(b11, (byte) (b11 - 1), b10, objArr14);
                                                            Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                                                            if (applicationContext != null) {
                                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                                    char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                                                                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 876;
                                                                    int minimumFlingVelocity2 = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                                    byte b12 = $$a[7];
                                                                    byte b13 = b12;
                                                                    Object[] objArr16 = new Object[1];
                                                                    c(b12, b13, b13, objArr16);
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, keyRepeatTimeout, minimumFlingVelocity2, 2012931276, false, (String) objArr16[0], null);
                                                                }
                                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                                                                try {
                                                                    Object[] objArr17 = new Object[1];
                                                                    d((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 467059595, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, (short) (View.resolveSize(0, 0) - 85), (byte) View.MeasureSpec.getSize(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 349302098, objArr17);
                                                                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                                                                    Object[] objArr18 = new Object[1];
                                                                    d(TextUtils.getOffsetBefore("", 0) + 467059599, 8 - View.MeasureSpec.makeMeasureSpec(0, 0), (short) (ExpandableListView.getPackedPositionType(0L) - 24), (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), TextUtils.indexOf((CharSequence) "", '0') - 349302076, objArr18);
                                                                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                                                    Long lValueOf = Long.valueOf(jLongValue2);
                                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                                                                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 876;
                                                                        int iMyPid = (Process.myPid() >> 22) + 10;
                                                                        byte b14 = $$a[7];
                                                                        byte b15 = b14;
                                                                        Object[] objArr19 = new Object[1];
                                                                        c(b15, (byte) (b15 | 52), b14, objArr19);
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates, offsetBefore, iMyPid, 2012020043, false, (String) objArr19[0], null);
                                                                    }
                                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                                                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                                        char mode = (char) View.MeasureSpec.getMode(0);
                                                                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 876;
                                                                        int windowTouchSlop = 10 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                                        byte[] bArr3 = $$a;
                                                                        byte b16 = bArr3[7];
                                                                        Object[] objArr20 = new Object[1];
                                                                        c(b16, (byte) (b16 | 89), bArr3[5], objArr20);
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode, packedPositionType, windowTouchSlop, -1650998592, false, (String) objArr20[0], null);
                                                                    }
                                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                                                } catch (Exception unused) {
                                                                    throw new RuntimeException();
                                                                }
                                                            }
                                                            objArr = objArr15;
                                                        } catch (Throwable th) {
                                                            Throwable cause = th.getCause();
                                                            if (cause != null) {
                                                                throw cause;
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    int i114 = ((int[]) objArr[2])[0];
                                                    int i115 = ((int[]) objArr[0])[0];
                                                    if (i115 == i114) {
                                                        int i20 = ((int[]) objArr[1])[0];
                                                        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                                                        int i21 = ~System.identityHashCode(this);
                                                        int i22 = ~(570919774 | i21);
                                                        int i23 = i20 + 1453888012 + ((i22 | (-530609546)) * 764) + (((~(i21 | (-530609546))) | 33554696) * (-1528)) + (((-1034419928) | i22) * 764);
                                                        int i24 = (i23 << 13) ^ i23;
                                                        int i25 = i24 ^ (i24 >>> 17);
                                                        ((int[]) objArr21[1])[0] = i25 ^ (i25 << 5);
                                                    } else {
                                                        int[] iArr = new int[i115];
                                                        int i26 = i115 - 1;
                                                        iArr[i26] = 1;
                                                        Toast.makeText((Context) null, iArr[((i115 * i26) % 2) - 1], 1).show();
                                                        int i27 = ((int[]) objArr[1])[0];
                                                        Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                                                        int i28 = ~(((int) Process.getElapsedCpuTime()) | (-100410639));
                                                        int i29 = i27 + (-714351656) + (((-140720868) | i28) * (-220)) + ((i28 | 94110988) * 220) + 631261116;
                                                        int i30 = (i29 << 13) ^ i29;
                                                        int i31 = i30 ^ (i30 >>> 17);
                                                        ((int[]) objArr22[1])[0] = i31 ^ (i31 << 5);
                                                    }
                                                    return (Unit) DeviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), new Object[]{this.TuitionPaymentFragmentbindingInflater1}, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), 2027421462, -2027421461, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1());
                                                }

                                                /* JADX WARN: Code duplicated, block: B:54:0x021d A[PHI: r0
  0x021d: PHI (r0v9 int) = (r0v8 int), (r0v38 int) binds: [B:53:0x021b, B:50:0x0209] A[DONT_GENERATE, DONT_INLINE]] */
                                                /* JADX WARN: Code duplicated, block: B:55:0x021f A[PHI: r0
  0x021f: PHI (r0v35 int) = (r0v8 int), (r0v38 int) binds: [B:53:0x021b, B:50:0x0209] A[DONT_GENERATE, DONT_INLINE]] */
                                                private static void d(int i15, int i16, short s, byte b2, int i17, Object[] objArr) throws Throwable {
                                                    boolean z;
                                                    int i18;
                                                    int i19;
                                                    int i110 = 2;
                                                    int i111 = 2 % 2;
                                                    SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                                                    StringBuilder sb = new StringBuilder();
                                                    try {
                                                        Object[] objArr2 = {Integer.valueOf(i16), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                            byte b3 = (byte) 0;
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 2266 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 32, 1387473586, false, $$g(b3, b3, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                                                        }
                                                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                                                        if (iIntValue == -1) {
                                                            int i112 = $10 + 115;
                                                            $11 = i112 % 128;
                                                            int i113 = i112 % 2;
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        if (z) {
                                                            byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                            if (bArr != null) {
                                                                int i114 = $11 + 111;
                                                                int i115 = i114 % 128;
                                                                $10 = i115;
                                                                int i20 = i114 % 2;
                                                                int length = bArr.length;
                                                                byte[] bArr2 = new byte[length];
                                                                int i21 = i115 + 51;
                                                                $11 = i21 % 128;
                                                                int i22 = i21 % 2;
                                                                int i23 = 0;
                                                                while (i23 < length) {
                                                                    int i24 = $11 + 7;
                                                                    $10 = i24 % 128;
                                                                    if (i24 % i110 != 0) {
                                                                        try {
                                                                            Object[] objArr3 = {Integer.valueOf(bArr[i23])};
                                                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                                                byte b4 = (byte) 0;
                                                                                byte b5 = b4;
                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", ""), TextUtils.getOffsetAfter("", 0) + 3358, TextUtils.indexOf("", "") + 18, -1054011043, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                                                                            }
                                                                            bArr2[i23] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                                                            i23 >>= 1;
                                                                        } catch (Throwable th) {
                                                                            Throwable cause = th.getCause();
                                                                            if (cause == null) {
                                                                                throw th;
                                                                            }
                                                                            throw cause;
                                                                        }
                                                                    } else {
                                                                        Object[] objArr4 = {Integer.valueOf(bArr[i23])};
                                                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                                            byte b6 = (byte) 0;
                                                                            byte b7 = b6;
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.indexOf("", "", 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3358, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 18, -1054011043, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE});
                                                                        }
                                                                        bArr2[i23] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                                                                        i23++;
                                                                    }
                                                                    i110 = 2;
                                                                }
                                                                bArr = bArr2;
                                                            }
                                                            if (bArr != null) {
                                                                byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                Object[] objArr5 = {Integer.valueOf(i17), Integer.valueOf(b)};
                                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                                    byte b8 = (byte) 0;
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.lastIndexOf("", '0', 0) + 2268, (Process.myPid() >> 22) + 33, 1387473586, false, $$g(b8, b8, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                                                                }
                                                                iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                                                            } else {
                                                                iIntValue = (short) (((short) (((long) asBinder[i17 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                                                            }
                                                        }
                                                        if (iIntValue > 0) {
                                                            int i25 = $10 + 33;
                                                            $11 = i25 % 128;
                                                            if (i25 % 2 == 0) {
                                                                i18 = ((i17 % iIntValue) << 3) * ((int) (((long) b) % 3046761265686732006L));
                                                                if (z) {
                                                                    i19 = 1;
                                                                } else {
                                                                    i19 = 0;
                                                                }
                                                            } else {
                                                                i18 = ((i17 + iIntValue) - 2) + ((int) (((long) b) ^ 3046761265686732006L));
                                                                if (z) {
                                                                    i19 = 1;
                                                                } else {
                                                                    i19 = 0;
                                                                }
                                                            }
                                                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 + i19;
                                                            Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i15), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), sb};
                                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                                byte b9 = (byte) 0;
                                                                byte b10 = b9;
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (55905 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 2855, 12 - TextUtils.indexOf((CharSequence) "", '0'), -1529949196, false, $$g(b9, b10, (byte) (b10 + 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                                                            }
                                                            ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                            byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                            if (bArr4 != null) {
                                                                int length2 = bArr4.length;
                                                                byte[] bArr5 = new byte[length2];
                                                                for (int i26 = 0; i26 < length2; i26++) {
                                                                    bArr5[i26] = (byte) (((long) bArr4[i26]) ^ 3046761265686732006L);
                                                                }
                                                                bArr4 = bArr5;
                                                            }
                                                            boolean z2 = bArr4 != null;
                                                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                                                            while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                                                                if (z2) {
                                                                    byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                    int i27 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i27 - 1;
                                                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i27]) ^ 3046761265686732006L)) + s)) ^ b2));
                                                                } else {
                                                                    short[] sArr = asBinder;
                                                                    int i28 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i28 - 1;
                                                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i28]) ^ 3046761265686732006L)) + s)) ^ b2));
                                                                }
                                                                sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                                                            }
                                                        }
                                                        objArr[0] = sb.toString();
                                                    } catch (Throwable th2) {
                                                        Throwable cause2 = th2.getCause();
                                                        if (cause2 == null) {
                                                            throw th2;
                                                        }
                                                        throw cause2;
                                                    }
                                                }

                                                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                                                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                                    */
                                                private static java.lang.String $$g(short r7, int r8, byte r9) {
                                                    /*
                                                        byte[] r0 = defpackage.getSampleTile.$$c
                                                        int r9 = 121 - r9
                                                        int r8 = r8 * 3
                                                        int r8 = 1 - r8
                                                        int r7 = r7 * 3
                                                        int r7 = 3 - r7
                                                        byte[] r1 = new byte[r8]
                                                        r2 = 0
                                                        if (r0 != 0) goto L15
                                                        r9 = r7
                                                        r3 = r8
                                                        r4 = r2
                                                        goto L2a
                                                    L15:
                                                        r3 = r2
                                                    L16:
                                                        int r4 = r3 + 1
                                                        byte r5 = (byte) r9
                                                        r1[r3] = r5
                                                        if (r4 != r8) goto L23
                                                        java.lang.String r7 = new java.lang.String
                                                        r7.<init>(r1, r2)
                                                        return r7
                                                    L23:
                                                        int r7 = r7 + 1
                                                        r3 = r0[r7]
                                                        r6 = r9
                                                        r9 = r7
                                                        r7 = r6
                                                    L2a:
                                                        int r7 = r7 + r3
                                                        r3 = r4
                                                        r6 = r9
                                                        r9 = r7
                                                        r7 = r6
                                                        goto L16
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.getSampleTile.$$g(short, int, byte):java.lang.String");
                                                }
                                            }, (128 & 32) != 0 ? null : null, (128 & 64) != 0 ? null : null, (128 & 128) != 0 ? false : false);
                                            supportFragmentManager = deviceUnlinkingBiometricActivity.getSupportFragmentManager();
                                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                                            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                                            if (supportFragmentManager.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                                outputConfigurationCompatApi33ImplB.show(supportFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                            }
                                        }
                                    } else {
                                        if (!Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                        }
                                        if (!Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                            if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                                int i15 = unsubscribe + 73;
                                                isConnected = i15 % 128;
                                                int i16 = i15 % 2;
                                                if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                                    getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist5 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                                    String str5 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                                    getstreamusecasesupportedcombinationlist5.TuitionPaymentFragmentbindingInflater1(str5 != null ? str5 : "", deviceUnlinkingBiometricActivity.getRoot);
                                                }
                                            }
                                            deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                        } else {
                                            if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                                int i17 = unsubscribe + 73;
                                                isConnected = i17 % 128;
                                                int i18 = i17 % 2;
                                                if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                                    getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist6 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                                    String str6 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                                    getstreamusecasesupportedcombinationlist6.TuitionPaymentFragmentbindingInflater1(str6 != null ? str6 : "", deviceUnlinkingBiometricActivity.getRoot);
                                                }
                                            }
                                            deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                        }
                                    }
                                }
                            } else {
                                if (Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                    i2 = unsubscribe + 73;
                                    isConnected = i2 % 128;
                                    if (i2 % 2 != 0) {
                                        if (!(!Intrinsics.areEqual(listSplit$default3.get(0), "false"))) {
                                            deviceUnlinkingBiometricActivity.g();
                                        }
                                    } else if (!(!Intrinsics.areEqual(listSplit$default3.get(0), "false"))) {
                                        deviceUnlinkingBiometricActivity.g();
                                    }
                                }
                                if (!Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                    if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                        i = isConnected + 117;
                                        unsubscribe = i % 128;
                                        if (i % 2 == 0) {
                                        }
                                        if (!Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                        }
                                        if (!Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                            if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                                int i19 = unsubscribe + 73;
                                                isConnected = i19 % 128;
                                                int i110 = i19 % 2;
                                                if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                                    getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist7 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                                    String str7 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                                    getstreamusecasesupportedcombinationlist7.TuitionPaymentFragmentbindingInflater1(str7 != null ? str7 : "", deviceUnlinkingBiometricActivity.getRoot);
                                                }
                                            }
                                            deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                        } else {
                                            if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                                int i111 = unsubscribe + 73;
                                                isConnected = i111 % 128;
                                                int i112 = i111 % 2;
                                                if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                                    getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist8 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                                    String str8 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                                    getstreamusecasesupportedcombinationlist8.TuitionPaymentFragmentbindingInflater1(str8 != null ? str8 : "", deviceUnlinkingBiometricActivity.getRoot);
                                                }
                                            }
                                            deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                        }
                                    } else {
                                        if (!Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                        }
                                        if (!Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                            if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                                int i113 = unsubscribe + 73;
                                                isConnected = i113 % 128;
                                                int i114 = i113 % 2;
                                                if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                                    getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist9 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                                    String str9 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                                    getstreamusecasesupportedcombinationlist9.TuitionPaymentFragmentbindingInflater1(str9 != null ? str9 : "", deviceUnlinkingBiometricActivity.getRoot);
                                                }
                                            }
                                            deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                        } else {
                                            if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                                int i115 = unsubscribe + 73;
                                                isConnected = i115 % 128;
                                                int i116 = i115 % 2;
                                                if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                                    getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist10 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                                    String str10 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                                    getstreamusecasesupportedcombinationlist10.TuitionPaymentFragmentbindingInflater1(str10 != null ? str10 : "", deviceUnlinkingBiometricActivity.getRoot);
                                                }
                                            }
                                            deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                        }
                                    }
                                } else if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                    i = isConnected + 117;
                                    unsubscribe = i % 128;
                                    if (i % 2 == 0) {
                                    }
                                    if (!Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                    }
                                    if (!Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                        if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                            int i117 = unsubscribe + 73;
                                            isConnected = i117 % 128;
                                            int i118 = i117 % 2;
                                            if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                                getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist11 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                                String str11 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                                getstreamusecasesupportedcombinationlist11.TuitionPaymentFragmentbindingInflater1(str11 != null ? str11 : "", deviceUnlinkingBiometricActivity.getRoot);
                                            }
                                        }
                                        deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                    } else {
                                        if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                            int i119 = unsubscribe + 73;
                                            isConnected = i119 % 128;
                                            int i1110 = i119 % 2;
                                            if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                                getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist12 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                                String str12 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                                getstreamusecasesupportedcombinationlist12.TuitionPaymentFragmentbindingInflater1(str12 != null ? str12 : "", deviceUnlinkingBiometricActivity.getRoot);
                                            }
                                        }
                                        deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                    }
                                } else {
                                    if (!Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                    }
                                    if (!Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                        if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                            int i1111 = unsubscribe + 73;
                                            isConnected = i1111 % 128;
                                            int i1112 = i1111 % 2;
                                            if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                                getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist13 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                                String str13 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                                getstreamusecasesupportedcombinationlist13.TuitionPaymentFragmentbindingInflater1(str13 != null ? str13 : "", deviceUnlinkingBiometricActivity.getRoot);
                                            }
                                        }
                                        deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                    } else {
                                        if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                            int i1113 = unsubscribe + 73;
                                            isConnected = i1113 % 128;
                                            int i1114 = i1113 % 2;
                                            if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                                getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist14 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                                String str14 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                                getstreamusecasesupportedcombinationlist14.TuitionPaymentFragmentbindingInflater1(str14 != null ? str14 : "", deviceUnlinkingBiometricActivity.getRoot);
                                            }
                                        }
                                        deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                    }
                                }
                            }
                        } else {
                            if (Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                i2 = unsubscribe + 73;
                                isConnected = i2 % 128;
                                if (i2 % 2 != 0) {
                                    if (!(!Intrinsics.areEqual(listSplit$default3.get(0), "false"))) {
                                        deviceUnlinkingBiometricActivity.g();
                                    }
                                } else if (!(!Intrinsics.areEqual(listSplit$default3.get(0), "false"))) {
                                    deviceUnlinkingBiometricActivity.g();
                                }
                            }
                            if (!Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                    i = isConnected + 117;
                                    unsubscribe = i % 128;
                                    if (i % 2 == 0) {
                                    }
                                    if (!Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                    }
                                    if (!Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                        if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                            int i1115 = unsubscribe + 73;
                                            isConnected = i1115 % 128;
                                            int i1116 = i1115 % 2;
                                            if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                                getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist15 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                                String str15 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                                getstreamusecasesupportedcombinationlist15.TuitionPaymentFragmentbindingInflater1(str15 != null ? str15 : "", deviceUnlinkingBiometricActivity.getRoot);
                                            }
                                        }
                                        deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                    } else {
                                        if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                            int i1117 = unsubscribe + 73;
                                            isConnected = i1117 % 128;
                                            int i1118 = i1117 % 2;
                                            if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                                getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist16 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                                String str16 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                                getstreamusecasesupportedcombinationlist16.TuitionPaymentFragmentbindingInflater1(str16 != null ? str16 : "", deviceUnlinkingBiometricActivity.getRoot);
                                            }
                                        }
                                        deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                    }
                                } else {
                                    if (!Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                    }
                                    if (!Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                        if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                            int i1119 = unsubscribe + 73;
                                            isConnected = i1119 % 128;
                                            int i11110 = i1119 % 2;
                                            if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                                getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist17 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                                String str17 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                                getstreamusecasesupportedcombinationlist17.TuitionPaymentFragmentbindingInflater1(str17 != null ? str17 : "", deviceUnlinkingBiometricActivity.getRoot);
                                            }
                                        }
                                        deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                    } else {
                                        if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                            int i11111 = unsubscribe + 73;
                                            isConnected = i11111 % 128;
                                            int i11112 = i11111 % 2;
                                            if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                                getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist18 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                                String str18 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                                getstreamusecasesupportedcombinationlist18.TuitionPaymentFragmentbindingInflater1(str18 != null ? str18 : "", deviceUnlinkingBiometricActivity.getRoot);
                                            }
                                        }
                                        deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                    }
                                }
                            } else if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                i = isConnected + 117;
                                unsubscribe = i % 128;
                                if (i % 2 == 0) {
                                }
                                if (!Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                }
                                if (!Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                    if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                        int i11113 = unsubscribe + 73;
                                        isConnected = i11113 % 128;
                                        int i11114 = i11113 % 2;
                                        if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                            getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist19 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                            String str19 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                            getstreamusecasesupportedcombinationlist19.TuitionPaymentFragmentbindingInflater1(str19 != null ? str19 : "", deviceUnlinkingBiometricActivity.getRoot);
                                        }
                                    }
                                    deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                } else {
                                    if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                        int i11115 = unsubscribe + 73;
                                        isConnected = i11115 % 128;
                                        int i11116 = i11115 % 2;
                                        if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                            getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist110 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                            String str110 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                            getstreamusecasesupportedcombinationlist110.TuitionPaymentFragmentbindingInflater1(str110 != null ? str110 : "", deviceUnlinkingBiometricActivity.getRoot);
                                        }
                                    }
                                    deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                }
                            } else {
                                if (!Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                }
                                if (!Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                    if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                        int i11117 = unsubscribe + 73;
                                        isConnected = i11117 % 128;
                                        int i11118 = i11117 % 2;
                                        if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                            getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist111 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                            String str111 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                            getstreamusecasesupportedcombinationlist111.TuitionPaymentFragmentbindingInflater1(str111 != null ? str111 : "", deviceUnlinkingBiometricActivity.getRoot);
                                        }
                                    }
                                    deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                } else {
                                    if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                        int i11119 = unsubscribe + 73;
                                        isConnected = i11119 % 128;
                                        int i111110 = i11119 % 2;
                                        if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                            getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist112 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                            String str112 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                            getstreamusecasesupportedcombinationlist112.TuitionPaymentFragmentbindingInflater1(str112 != null ? str112 : "", deviceUnlinkingBiometricActivity.getRoot);
                                        }
                                    }
                                    deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                }
                            }
                        }
                    }
                } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    deviceUnlinkingBiometricActivity.IconCompatParcelizer();
                    string = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (string == null) {
                        string = deviceUnlinkingBiometricActivity.getString(R.string.error_general);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                    }
                    deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string);
                }
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            deviceUnlinkingBiometricActivity.MediaBrowserCompat();
        } else {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                deviceUnlinkingBiometricActivity.IconCompatParcelizer();
                asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                listSplit$default = StringsKt.split$default((CharSequence) ((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isSuccessful(), new char[]{'#'}, false, 0, 6, (Object) null);
                listSplit$default2 = StringsKt.split$default((CharSequence) ((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getHaveMembership(), new char[]{'#'}, false, 0, 6, (Object) null);
                listSplit$default3 = StringsKt.split$default((CharSequence) ((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getHavePengajuan(), new char[]{'#'}, false, 0, 6, (Object) null);
                listSplit$default4 = StringsKt.split$default((CharSequence) ((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isSuspend(), new char[]{'#'}, false, 0, 6, (Object) null);
                listSplit$default5 = StringsKt.split$default((CharSequence) ((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isSuspendAntol(), new char[]{'#'}, false, 0, 6, (Object) null);
                if (!Intrinsics.areEqual(listSplit$default.get(0), "true")) {
                    deviceUnlinkingBiometricActivity.g();
                } else if (Intrinsics.areEqual(listSplit$default2.get(0), "true")) {
                    if (Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                        int i20 = unsubscribe + 103;
                        isConnected = i20 % 128;
                        int i21 = i20 % 2;
                        if (Intrinsics.areEqual(listSplit$default5.get(0), "false")) {
                            i3 = unsubscribe + 83;
                            isConnected = i3 % 128;
                            if (i3 % 2 != 0) {
                            }
                            deviceUnlinkingBiometricActivity.g();
                        } else {
                            if (Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                i2 = unsubscribe + 73;
                                isConnected = i2 % 128;
                                if (i2 % 2 != 0) {
                                    if (!(!Intrinsics.areEqual(listSplit$default3.get(0), "false"))) {
                                        deviceUnlinkingBiometricActivity.g();
                                    }
                                } else if (!(!Intrinsics.areEqual(listSplit$default3.get(0), "false"))) {
                                    deviceUnlinkingBiometricActivity.g();
                                }
                            }
                            if (!Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                    i = isConnected + 117;
                                    unsubscribe = i % 128;
                                    if (i % 2 == 0) {
                                    }
                                    if (!Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                    }
                                    if (!Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                        if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                            int i111111 = unsubscribe + 73;
                                            isConnected = i111111 % 128;
                                            int i111112 = i111111 % 2;
                                            if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                                getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist113 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                                String str113 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                                getstreamusecasesupportedcombinationlist113.TuitionPaymentFragmentbindingInflater1(str113 != null ? str113 : "", deviceUnlinkingBiometricActivity.getRoot);
                                            }
                                        }
                                        deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                    } else {
                                        if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                            int i111113 = unsubscribe + 73;
                                            isConnected = i111113 % 128;
                                            int i111114 = i111113 % 2;
                                            if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                                getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist114 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                                String str114 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                                getstreamusecasesupportedcombinationlist114.TuitionPaymentFragmentbindingInflater1(str114 != null ? str114 : "", deviceUnlinkingBiometricActivity.getRoot);
                                            }
                                        }
                                        deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                    }
                                } else {
                                    if (!Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                    }
                                    if (!Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                        if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                            int i111115 = unsubscribe + 73;
                                            isConnected = i111115 % 128;
                                            int i111116 = i111115 % 2;
                                            if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                                getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist115 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                                String str115 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                                getstreamusecasesupportedcombinationlist115.TuitionPaymentFragmentbindingInflater1(str115 != null ? str115 : "", deviceUnlinkingBiometricActivity.getRoot);
                                            }
                                        }
                                        deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                    } else {
                                        if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                            int i111117 = unsubscribe + 73;
                                            isConnected = i111117 % 128;
                                            int i111118 = i111117 % 2;
                                            if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                                getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist116 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                                String str116 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                                getstreamusecasesupportedcombinationlist116.TuitionPaymentFragmentbindingInflater1(str116 != null ? str116 : "", deviceUnlinkingBiometricActivity.getRoot);
                                            }
                                        }
                                        deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                    }
                                }
                            } else if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                i = isConnected + 117;
                                unsubscribe = i % 128;
                                if (i % 2 == 0) {
                                }
                                if (!Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                }
                                if (!Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                    if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                        int i111119 = unsubscribe + 73;
                                        isConnected = i111119 % 128;
                                        int i1111110 = i111119 % 2;
                                        if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                            getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist117 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                            String str117 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                            getstreamusecasesupportedcombinationlist117.TuitionPaymentFragmentbindingInflater1(str117 != null ? str117 : "", deviceUnlinkingBiometricActivity.getRoot);
                                        }
                                    }
                                    deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                } else {
                                    if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                        int i1111111 = unsubscribe + 73;
                                        isConnected = i1111111 % 128;
                                        int i1111112 = i1111111 % 2;
                                        if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                            getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist118 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                            String str118 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                            getstreamusecasesupportedcombinationlist118.TuitionPaymentFragmentbindingInflater1(str118 != null ? str118 : "", deviceUnlinkingBiometricActivity.getRoot);
                                        }
                                    }
                                    deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                }
                            } else {
                                if (!Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                }
                                if (!Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                    if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                        int i1111113 = unsubscribe + 73;
                                        isConnected = i1111113 % 128;
                                        int i1111114 = i1111113 % 2;
                                        if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                            getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist119 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                            String str119 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                            getstreamusecasesupportedcombinationlist119.TuitionPaymentFragmentbindingInflater1(str119 != null ? str119 : "", deviceUnlinkingBiometricActivity.getRoot);
                                        }
                                    }
                                    deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                } else {
                                    if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                        int i1111115 = unsubscribe + 73;
                                        isConnected = i1111115 % 128;
                                        int i1111116 = i1111115 % 2;
                                        if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                            getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist1110 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                            String str1110 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                            getstreamusecasesupportedcombinationlist1110.TuitionPaymentFragmentbindingInflater1(str1110 != null ? str1110 : "", deviceUnlinkingBiometricActivity.getRoot);
                                        }
                                    }
                                    deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                }
                            }
                        }
                    } else {
                        if (Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                            i2 = unsubscribe + 73;
                            isConnected = i2 % 128;
                            if (i2 % 2 != 0) {
                                if (!(!Intrinsics.areEqual(listSplit$default3.get(0), "false"))) {
                                    deviceUnlinkingBiometricActivity.g();
                                }
                            } else if (!(!Intrinsics.areEqual(listSplit$default3.get(0), "false"))) {
                                deviceUnlinkingBiometricActivity.g();
                            }
                        }
                        if (!Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                            if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                i = isConnected + 117;
                                unsubscribe = i % 128;
                                if (i % 2 == 0) {
                                }
                                if (!Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                }
                                if (!Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                    if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                        int i1111117 = unsubscribe + 73;
                                        isConnected = i1111117 % 128;
                                        int i1111118 = i1111117 % 2;
                                        if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                            getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist1111 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                            String str1111 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                            getstreamusecasesupportedcombinationlist1111.TuitionPaymentFragmentbindingInflater1(str1111 != null ? str1111 : "", deviceUnlinkingBiometricActivity.getRoot);
                                        }
                                    }
                                    deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                } else {
                                    if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                        int i1111119 = unsubscribe + 73;
                                        isConnected = i1111119 % 128;
                                        int i11111110 = i1111119 % 2;
                                        if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                            getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist1112 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                            String str1112 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                            getstreamusecasesupportedcombinationlist1112.TuitionPaymentFragmentbindingInflater1(str1112 != null ? str1112 : "", deviceUnlinkingBiometricActivity.getRoot);
                                        }
                                    }
                                    deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                }
                            } else {
                                if (!Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                }
                                if (!Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                    if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                        int i11111111 = unsubscribe + 73;
                                        isConnected = i11111111 % 128;
                                        int i11111112 = i11111111 % 2;
                                        if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                            getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist1113 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                            String str1113 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                            getstreamusecasesupportedcombinationlist1113.TuitionPaymentFragmentbindingInflater1(str1113 != null ? str1113 : "", deviceUnlinkingBiometricActivity.getRoot);
                                        }
                                    }
                                    deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                } else {
                                    if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                        int i11111113 = unsubscribe + 73;
                                        isConnected = i11111113 % 128;
                                        int i11111114 = i11111113 % 2;
                                        if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                            getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist1114 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                            String str1114 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                            getstreamusecasesupportedcombinationlist1114.TuitionPaymentFragmentbindingInflater1(str1114 != null ? str1114 : "", deviceUnlinkingBiometricActivity.getRoot);
                                        }
                                    }
                                    deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                                }
                            }
                        } else if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                            i = isConnected + 117;
                            unsubscribe = i % 128;
                            if (i % 2 == 0) {
                            }
                            if (!Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                            }
                            if (!Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                    int i11111115 = unsubscribe + 73;
                                    isConnected = i11111115 % 128;
                                    int i11111116 = i11111115 % 2;
                                    if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                        getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist1115 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                        String str1115 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                        getstreamusecasesupportedcombinationlist1115.TuitionPaymentFragmentbindingInflater1(str1115 != null ? str1115 : "", deviceUnlinkingBiometricActivity.getRoot);
                                    }
                                }
                                deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                            } else {
                                if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                    int i11111117 = unsubscribe + 73;
                                    isConnected = i11111117 % 128;
                                    int i11111118 = i11111117 % 2;
                                    if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                        getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist1116 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                        String str1116 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                        getstreamusecasesupportedcombinationlist1116.TuitionPaymentFragmentbindingInflater1(str1116 != null ? str1116 : "", deviceUnlinkingBiometricActivity.getRoot);
                                    }
                                }
                                deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                            }
                        } else {
                            if (!Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                            }
                            if (!Intrinsics.areEqual(listSplit$default4.get(0), "false")) {
                                if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                    int i11111119 = unsubscribe + 73;
                                    isConnected = i11111119 % 128;
                                    int i111111110 = i11111119 % 2;
                                    if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                        getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist1117 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                        String str1117 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                        getstreamusecasesupportedcombinationlist1117.TuitionPaymentFragmentbindingInflater1(str1117 != null ? str1117 : "", deviceUnlinkingBiometricActivity.getRoot);
                                    }
                                }
                                deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                            } else {
                                if (Intrinsics.areEqual(listSplit$default4.get(0), "true")) {
                                    int i111111111 = unsubscribe + 73;
                                    isConnected = i111111111 % 128;
                                    int i111111112 = i111111111 % 2;
                                    if (Intrinsics.areEqual(listSplit$default3.get(0), "true")) {
                                        getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist1118 = (getStreamUseCaseSupportedCombinationList) deviceUnlinkingBiometricActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                        String str1118 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
                                        getstreamusecasesupportedcombinationlist1118.TuitionPaymentFragmentbindingInflater1(str1118 != null ? str1118 : "", deviceUnlinkingBiometricActivity.getRoot);
                                    }
                                }
                                deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((CheckMembershipResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage());
                            }
                        }
                    }
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                deviceUnlinkingBiometricActivity.IconCompatParcelizer();
                string = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (string == null) {
                    string = deviceUnlinkingBiometricActivity.getString(R.string.error_general);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                }
                deviceUnlinkingBiometricActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string);
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        String str;
        DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity = (DeviceUnlinkingBiometricActivity) objArr[0];
        int i = 2 % 2;
        int i2 = isConnected + 123;
        unsubscribe = i2 % 128;
        int i3 = i2 % 2;
        BookingAntreanFormActivity.Companion companion = BookingAntreanFormActivity.INSTANCE;
        DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity2 = deviceUnlinkingBiometricActivity;
        String str2 = deviceUnlinkingBiometricActivity.getRoot;
        String str3 = deviceUnlinkingBiometricActivity.isConnected;
        String str4 = deviceUnlinkingBiometricActivity.getServiceComponent;
        String str5 = deviceUnlinkingBiometricActivity.asInterface;
        String str6 = deviceUnlinkingBiometricActivity.d;
        String string = deviceUnlinkingBiometricActivity.cancel.toString();
        String string2 = deviceUnlinkingBiometricActivity.notify.toString();
        if (!Intrinsics.areEqual((String) deviceUnlinkingBiometricActivity.disconnect.getValue(), "KTP_BIOMETRIK_KPJ")) {
            str = "BPU";
        } else {
            int i4 = isConnected + 55;
            unsubscribe = i4 % 128;
            int i5 = i4 % 2;
            str = "PU";
        }
        String str7 = str;
        String str8 = (String) deviceUnlinkingBiometricActivity.getExtras.getValue();
        if (str8 == null) {
            str8 = "";
        }
        BookingAntreanFormActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(deviceUnlinkingBiometricActivity2, str2, str3, str4, str5, str6, string, string2, "DEVBIND", str7, str8);
        Unit unit = Unit.INSTANCE;
        int i6 = unsubscribe + 115;
        isConnected = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 62 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity, View view) {
        int iTuitionPaymentFragmentbindingInflater1 = AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentbindingInflater1, new Object[]{deviceUnlinkingBiometricActivity, view}, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), -1815299747, 1815299751, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater2);
    }

    public static /* synthetic */ Unit d(DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity) {
        int iTuitionPaymentFragmentbindingInflater1 = AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentbindingInflater1, new Object[]{deviceUnlinkingBiometricActivity}, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), 2027421462, -2027421461, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater2);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        int i = 2 % 2;
        int i2 = isConnected + 49;
        unsubscribe = i2 % 128;
        int i3 = i2 % 2;
        Unit unitTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(deviceUnlinkingBiometricActivity, virtualCameraAdapter1);
        int i4 = unsubscribe + 113;
        isConnected = i4 % 128;
        int i5 = i4 % 2;
        return unitTuitionPaymentFragmentbindingInflater1;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity, View view) {
        int iTuitionPaymentFragmentbindingInflater1 = AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentbindingInflater1, new Object[]{deviceUnlinkingBiometricActivity, view}, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), -865441922, 865441925, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater2);
    }

    static {
        MediaBrowserCompatCallbackHandler = 0;
        d();
        INSTANCE = new Companion(null);
        int i = subscribe + 109;
        MediaBrowserCompatCallbackHandler = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(boolean p0) {
        Object[] objArr = {this, Boolean.valueOf(p0)};
        int iCodePointAt = (-2139353336) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_billingaddress_empty).substring(18, 19).codePointAt(0);
        int iTuitionPaymentFragmentbindingInflater1 = AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(iCodePointAt, objArr, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), 349144939, -349144939, getActivitySideSheetRoundedCornersPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentbindingInflater1);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault1(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 1306502668, new Object[]{this}, getActivitySideSheetRoundedCornersPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -127731144, 127731146, getActivitySideSheetRoundedCornersPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1138052623)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = isConnected + 53;
        unsubscribe = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(getActivitySideSheetRoundedCornersPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 1881624401, 638599711, -638599705, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), 773444366 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5));
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_title).substring(18, 19).length() + 1532300320;
        int iTuitionPaymentFragmentbindingInflater1 = AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(length, new Object[]{this}, (-902190124) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), 1240738054, -1240738049, AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1);
    }

    static void d() {
        getServiceComponent = new int[]{22661480, 337819602, -2008323037, 982845968, 216960249, -2108993169, -904005160, -1371499957, -666417797, 161776887, 961258124, 1626232423, 2015081273, -1686508962, -696887740, -36899266, 95624970, -2069953452};
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = isConnected + 87;
        int i3 = i2 % 128;
        unsubscribe = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 123;
        isConnected = i5 % 128;
        if (i5 % 2 == 0) {
            return Integer.valueOf(R.layout.activity_device_unlinking_biometric);
        }
        int i6 = 29 / 0;
        return Integer.valueOf(R.layout.activity_device_unlinking_biometric);
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        DeviceUnlinkingBiometricActivity deviceUnlinkingBiometricActivity = (DeviceUnlinkingBiometricActivity) objArr[0];
        int i = 2 % 2;
        int i2 = unsubscribe + 19;
        isConnected = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, short r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r0 = 1 - r6
            int r7 = r7 * 56
            int r7 = 122 - r7
            int r8 = r8 * 2
            int r8 = r8 + 4
            byte[] r1 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingBiometricActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2d
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            r3 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2d:
            int r7 = -r7
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingBiometricActivity.$$i(byte, short, byte):java.lang.String");
    }
}
