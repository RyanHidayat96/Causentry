package defpackage;

import android.app.DatePickerDialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelStoreOwner;
import com.bpjstku.R;
import com.bpjstku.data.jht.model.request.ClaimEmployeeDataRequest;
import com.bpjstku.data.jht.model.response.JhtClaimEmployeeDataItem;
import com.bpjstku.databinding.FragmentClaimOldDaySecurityPersonalDataBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.main.MainActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityPersonalDataFragment$bindingInflater$1;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.model.IndividualDataClaim;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.midtrans.sdk.corekit.core.Constants;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.Camera2CameraControlImplExternalSyntheticLambda4;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.getExtendedConfig;
import defpackage.getFocusY;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004R\u0015\u0010\u0011\u001a\u00020\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0015\u0010\u001e\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u0010R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0015\u0010\u001d\u001a\u00020!8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0017\u0010\u000b\u001a\u0004\u0018\u00010\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\u000f\u001a\u00020#8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010$R.\u0010\u0013\u001a\u001c\u0012\u0004\u0012\u00020&\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00020%8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010)R\u0014\u0010\r\u001a\u00020*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010+"}, d2 = {"LreopenCameraAfterError;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentClaimOldDaySecurityPersonalDataBinding;", "<init>", "()V", "", "INotificationSideChannelDefault", "cancelAll", "onTransact", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "g", "cancel", "INotificationSideChannel", "LgetExtendedConfig;", "asInterface", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/model/IndividualDataClaim;", "asBinder", "b", "Lcom/bpjstku/data/jht/model/response/JhtClaimEmployeeDataItem;", "d", "Lcom/bpjstku/data/jht/model/response/JhtClaimEmployeeDataItem;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LgetStringOrNull;", "LgetStringOrNull;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LCamera2CameraControlImplExternalSyntheticLambda4;", "a", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LgetCameraState;", "LgetCameraState;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lcom/bpjstku/domain/user/model/User;", "", "()I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;", "Ljava/util/Calendar;", "Ljava/util/Calendar;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class reopenCameraAfterError extends AutoValue_ImmutableImageInfo<FragmentClaimOldDaySecurityPersonalDataBinding> {
    private static int INotificationSideChannel;
    private static short[] INotificationSideChannelDefault;
    private static int INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static byte[] cancel;
    private static int notify;
    private static int onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private getStringOrNull TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Calendar INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private getCameraState d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final Lazy g;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private JhtClaimEmployeeDataItem TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {49, -45, -112, 57};
    private static final int $$d = 30;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {87, -91, 60, 112, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 204;
    private static int RemoteActionCompatParcelizer = 0;
    private static int INotificationSideChannelStub = 0;
    private static int getInterfaceDescriptor = 1;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1) {
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

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = ~i2;
        int i10 = (~(i7 | i8 | i9)) | (~(i4 | i5));
        int i11 = ~(i2 | i5);
        int i12 = i10 | i11;
        int i13 = ~(i7 | i5);
        int i14 = i11 | i7 | (~(i8 | i9));
        int i15 = i4 + i5 + i + (1349231875 * i3) + (1735201104 * i6);
        int i16 = i15 * i15;
        int i17 = ((-413510627) * i4) + 1558183936 + (237349861 * i5) + (i12 * 325430244) + (325430244 * i13) + ((-325430244) * i14) + ((-88080384) * i) + ((-1337982976) * i3) + (469762048 * i6) + (1272971264 * i16);
        int i18 = ((i4 * 236314795) - 374860141) + (i5 * 236313123) + (i12 * (-836)) + (i13 * (-836)) + (i14 * 836) + (i * 236313959) + (i3 * (-66979019)) + (i6 * (-1872492752)) + (i16 * (-417333248));
        int i19 = i17 + (i18 * i18 * 639631360);
        if (i19 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i19 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i19 != 3) {
            return b(objArr);
        }
        final reopenCameraAfterError reopencameraaftererror = (reopenCameraAfterError) objArr[0];
        int i20 = 2 % 2;
        ((Camera2CameraControlImplExternalSyntheticLambda4) reopencameraaftererror.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).f101a.observe(reopencameraaftererror, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: canScheduleCameraReopen
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return reopenCameraAfterError.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        int i21 = getInterfaceDescriptor + 1;
        INotificationSideChannelStub = i21 % 128;
        int i22 = i21 % 2;
        return null;
    }

    private static void c(byte b, int i, byte b2, Object[] objArr) {
        int i2 = b * 15;
        int i3 = 84 - (b2 * 3);
        int i4 = 92 - i;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[53 - i2];
        int i5 = 52 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3 = (i4 + (-i5)) - 11;
            i4 = i4;
        }
        while (true) {
            i6++;
            int i7 = i4 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = (i3 + (-bArr[i7])) - 11;
                i4 = i7;
            }
        }
    }

    public reopenCameraAfterError() {
        final reopenCameraAfterError reopencameraaftererror = this;
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityPersonalDataFragment$special$$inlined$sharedViewModel$default$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner invoke() {
                FragmentActivity activity = reopencameraaftererror.getActivity();
                if (activity != null) {
                    return activity;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
            }

            {
                super(0);
            }
        };
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<getExtendedConfig>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityPersonalDataFragment$special$$inlined$sharedViewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, getExtendedConfig] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getExtendedConfig invoke() {
                return getFocusY.b(reopencameraaftererror, Reflection.getOrCreateKotlinClass(getExtendedConfig.class), this.$qualifier, function0, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.b = LazyKt.lazy(new Function0() { // from class: handleErrorOnOpen
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return reopenCameraAfterError.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b);
            }
        });
        final reopenCameraAfterError reopencameraaftererror2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<Camera2CameraControlImplExternalSyntheticLambda4>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityPersonalDataFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [Camera2CameraControlImplExternalSyntheticLambda4, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Camera2CameraControlImplExternalSyntheticLambda4 invoke() {
                LifecycleOwner lifecycleOwner = reopencameraaftererror2;
                mapPoint mappoint = this.$qualifier;
                Function0 function1 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Camera2CameraControlImplExternalSyntheticLambda4.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function1, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
        final reopenCameraAfterError reopencameraaftererror3 = this;
        this.a = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityPersonalDataFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = reopencameraaftererror3;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.g = LazyKt.lazy(new Function0() { // from class: Camera2CameraImplStateCallback
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object[] objArr = {this.b};
                return (User) reopenCameraAfterError.TuitionPaymentFragmentbindingInflater1(getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -475759576, objArr, 475759577, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        });
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        this.INotificationSideChannel = calendar;
    }

    /* JADX INFO: renamed from: reopenCameraAfterError$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LreopenCameraAfterError$b;", "", "<init>", "()V", "LreopenCameraAfterError;", "TuitionPaymentFragmentbindingInflater1", "()LreopenCameraAfterError;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static reopenCameraAfterError TuitionPaymentFragmentbindingInflater1() {
            return new reopenCameraAfterError();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentClaimOldDaySecurityPersonalDataBinding> d() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 49;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ClaimOldDaySecurityPersonalDataFragment$bindingInflater$1 claimOldDaySecurityPersonalDataFragment$bindingInflater$1 = ClaimOldDaySecurityPersonalDataFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = INotificationSideChannelStub + 57;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return claimOldDaySecurityPersonalDataFragment$bindingInflater$1;
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        int i = 2 % 2;
        FragmentClaimOldDaySecurityPersonalDataBinding fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputLayout textInputLayout = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.tilIdNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.error_field_nik);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string2, 16, 16)})));
        TextInputLayout textInputLayout2 = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.tilKPJNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string3 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = getString(R.string.error_bpjamsostek_number);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        String string5 = getString(R.string.error_bpjs_number_alphanumeric);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string3), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string4, 10, 16), Camera2CameraControlExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string5)})));
        TextInputLayout textInputLayout3 = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.tilFullName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string6 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string6))));
        TextInputLayout textInputLayout4 = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.tilBirthDate;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        String string7 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string7, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout4, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string7))));
        TextInputLayout textInputLayout5 = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.tilPhoneNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout5, "");
        String string8 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string8, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout5, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string8))));
        TextInputLayout textInputLayout6 = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.tilEmail;
        Intrinsics.checkNotNullExpressionValue(textInputLayout6, "");
        String string9 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string9, "");
        accessconfigureInstanceInternal accessconfigureinstanceinternal = new accessconfigureInstanceInternal("^.{1,}$", string9);
        String string10 = getString(R.string.error_email_invalid);
        Intrinsics.checkNotNullExpressionValue(string10, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout6, CollectionsKt.listOf((Object[]) new accessconfigureInstanceInternal[]{accessconfigureinstanceinternal, new accessconfigureInstanceInternal(Constants.EMAIL_PATTERN, string10)})));
        int i2 = getInterfaceDescriptor + 55;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (29945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 1755;
            int absoluteGravity = 23 - Gravity.getAbsoluteGravity(0, 0);
            byte[] bArr = $$a;
            byte b = bArr[5];
            Object[] objArr2 = new Object[1];
            c(b, (byte) (b | 88), bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, capsMode, absoluteGravity, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(TextUtils.getOffsetAfter("", 0) - 1132761765, 19 - ExpandableListView.getPackedPositionChild(0L), (short) ExpandableListView.getPackedPositionGroup(0L), (byte) TextUtils.getTrimmedLength(""), TextUtils.lastIndexOf("", '0', 0, 0) + 1074253799, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e((-1132761761) - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 13, (short) (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) View.MeasureSpec.getMode(0), 1074253819 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 29944);
            int longPressTimeout = 1755 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int iResolveSize = View.resolveSize(0, 0) + 23;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr5 = new Object[1];
            c(b3, (byte) (b3 | 52), b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, longPressTimeout, iResolveSize, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char gidForName = (char) (Process.getGidForName("") + 29945);
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1755;
                int iAlpha = Color.alpha(0) + 23;
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                c(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(gidForName, maximumDrawingCacheSize, iAlpha, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i2 = ~iIdentityHashCode;
            int i3 = (~((-905922350) | i2)) | 346834700;
            int i4 = ~(iIdentityHashCode | (-134232275));
            int i5 = (-1770037311) + ((i3 | i4) * (-502)) + ((i4 | (~(i2 | (-559087650)))) * TypedValues.PositionType.TYPE_DRAWPATH) + 460119432;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[3])[0] = i7 ^ (i7 << 5);
            int i8 = getInterfaceDescriptor + 109;
            INotificationSideChannelStub = i8 % 128;
            int i9 = i8 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            e((-1132761757) - TextUtils.indexOf((CharSequence) "", '0'), (-16777202) - Color.rgb(0, 0, 0), (short) Color.argb(0, 0, 0, 0), (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 1074253833 - View.resolveSize(0, 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e((-1132761757) - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14, (short) (ViewConfiguration.getPressedStateDuration() >> 16), (byte) (Process.myTid() >> 22), View.MeasureSpec.getMode(0) + 1074253848, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1507860170};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 42049), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1726, (ViewConfiguration.getPressedStateDuration() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), 460119432, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cGreen = (char) (29944 - Color.green(0));
                    int size = View.MeasureSpec.getSize(0) + 1755;
                    int i10 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                    byte b6 = $$a[7];
                    byte b7 = b6;
                    Object[] objArr11 = new Object[1];
                    c(b6, b7, b7, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cGreen, size, i10, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr12 = new Object[1];
                    e((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 1132761765, 20 - View.combineMeasuredStates(0, 0), (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1074253798 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    e((-1132761761) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 13 - KeyEvent.getDeadChar(0, 0), (short) Gravity.getAbsoluteGravity(0, 0), (byte) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), Color.alpha(0) + 1074253819, objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 29945);
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1755;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 24;
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr14 = new Object[1];
                        c(b9, (byte) (b9 | 52), b8, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAxisFromString, pressedStateDuration, iIndexOf, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c2 = (char) (29945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int pressedStateDuration2 = 1755 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 23;
                        byte[] bArr2 = $$a;
                        byte b10 = bArr2[5];
                        Object[] objArr15 = new Object[1];
                        c(b10, (byte) (b10 | 88), bArr2[7], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, pressedStateDuration2, threadPriority, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    objArr = objArrTuitionPaymentFragmentbindingInflater1$7879113;
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
        int i11 = ((int[]) objArr[1])[0];
        int i12 = ((int[]) objArr[0])[0];
        if (i12 == i11) {
            int i13 = ((int[]) objArr[3])[0];
            Object[] objArr16 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i14 = i13 + (-1144866607) + (((~(687230060 | elapsedCpuTime)) | 352326274) * 336) + (((~(elapsedCpuTime | 899832486)) | 139723848) * (-168)) + (((~((~elapsedCpuTime) | 899832486)) | 687230060) * 168);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr16[3])[0] = i16 ^ (i16 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i17 = INotificationSideChannelStub + 15;
                getInterfaceDescriptor = i17 % 128;
                int i18 = i17 % 2 == 0 ? 1 : 0;
                while (i18 < strArr.length) {
                    arrayList.add(strArr[i18]);
                    i18++;
                    int i19 = getInterfaceDescriptor + 37;
                    INotificationSideChannelStub = i19 % 128;
                    int i20 = i19 % 2;
                }
            }
            int[] iArr = new int[i12];
            int i21 = i12 - 1;
            iArr[i21] = 1;
            Toast.makeText((Context) null, iArr[((i12 * i21) % 2) - 1], 1).show();
            int i22 = ((int[]) objArr[3])[0];
            Object[] objArr17 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i23 = ~(760214262 | iElapsedRealtime);
            int i24 = ~iElapsedRealtime;
            int i25 = i23 | (~(972816688 | i24));
            int i26 = ~((-760214263) | i24);
            int i27 = i22 + (-678170723) + ((i25 | i26) * (-516)) + (((~(iElapsedRealtime | (-279970049))) | (~((-692846641) | i24))) * 516) + ((692846640 | i26) * 516);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr17[3])[0] = i29 ^ (i29 << 5);
        }
        EditText editText = INotificationSideChannelStub().tilKPJNumber.getEditText();
        if (editText != null) {
            int i30 = INotificationSideChannelStub + 37;
            getInterfaceDescriptor = i30 % 128;
            if (i30 % 2 == 0) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault3(editText);
                throw null;
            }
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault3(editText);
        }
        EditText editText2 = INotificationSideChannelStub().tilFullName.getEditText();
        if (editText2 != null) {
            Intrinsics.checkNotNullParameter(editText2, "");
            editText2.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 39;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 != 0) {
            MaterialButton materialButton = INotificationSideChannelStub().btnYes;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(false);
            return;
        }
        MaterialButton materialButton3 = INotificationSideChannelStub().btnYes;
        Intrinsics.checkNotNullExpressionValue(materialButton3, "");
        MaterialButton materialButton4 = materialButton3;
        Intrinsics.checkNotNullParameter(materialButton4, "");
        materialButton4.setEnabled(true);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnYes;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
        int i4 = INotificationSideChannelStub + 91;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements getCameraState.TuitionPaymentFragmentbindingInflater1 {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // getCameraState.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            MainActivity.Companion companion = MainActivity.INSTANCE;
            Context contextRequireContext = reopenCameraAfterError.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contextRequireContext, null, null, 6);
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        int i = 2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnYes;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: shouldActiveResume
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return reopenCameraAfterError.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        MaterialButton materialButton2 = INotificationSideChannelStub().btnNo;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: resetReopenMonitor
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1, (View) obj};
                return (Unit) reopenCameraAfterError.TuitionPaymentFragmentbindingInflater1(getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1734923157, objArr, -1734923157, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        }));
        EditText editText = INotificationSideChannelStub().tilBirthDate.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: scheduleCameraReopen
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1, view};
                    reopenCameraAfterError.TuitionPaymentFragmentbindingInflater1(getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 192443616, objArr, -192443614, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                }
            });
            int i2 = INotificationSideChannelStub + 93;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x027b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0287 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0289  */
    /* JADX WARN: Code duplicated, block: B:70:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:97:0x02da A[SYNTHETIC] */
    private static void e(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i4;
        boolean z2;
        int i5;
        int length;
        byte[] bArr;
        int i6;
        int i7 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(onTransact)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            int i8 = -1;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b2 = (byte) (-1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 2267, TextUtils.getTrimmedLength("") + 33, 1387473586, false, $$e(b2, (byte) (b2 + 1), (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i9 = $11 + 7;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                z = true;
            } else {
                z = false;
            }
            long j2 = 0;
            if (z) {
                byte[] bArr2 = cancel;
                if (bArr2 != null) {
                    int i11 = $11 + 97;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i6 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i6 = 0;
                    }
                    while (i6 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i6])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                                int doubleTapTimeout = 3358 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int i12 = (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1)) + 18;
                                byte b3 = (byte) i8;
                                byte b4 = (byte) (b3 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, doubleTapTimeout, i12, -1054011043, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            bArr[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i6++;
                            i8 = -1;
                            j2 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = cancel;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(INotificationSideChannel)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) (-1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf("", "", 0) + 2267, (ViewConfiguration.getPressedStateDuration() >> 16) + 33, 1387473586, false, $$e(b5, (byte) (b5 + 1), (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) onTransact) ^ 3046761265686732006L)));
                    j = 3046761265686732006L;
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) INotificationSideChannelDefault[i3 + ((int) (((long) INotificationSideChannel) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) onTransact) ^ 3046761265686732006L)));
                }
            } else {
                j = 3046761265686732006L;
            }
            if (iIntValue > 0) {
                int i13 = ((i3 + iIntValue) - 2) + ((int) (((long) INotificationSideChannel) ^ j));
                if (z) {
                    int i14 = $10 + 7;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i13 + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(notify), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-16721312) - Color.rgb(0, 0, 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2855, 14 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1529949196, false, $$e(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = cancel;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i16 = 0;
                    while (i16 < length2) {
                        bArr5[i16] = (byte) (((long) bArr4[i16]) ^ 3046761265686732006L);
                        i16++;
                        int i17 = $11 + 125;
                        $10 = i17 % 128;
                        if (i17 % 2 != 0) {
                            int i18 = 4 / 4;
                        }
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i19 = $10 + 25;
                    $11 = i19 % 128;
                    if (i19 % 2 != 0) {
                        z2 = true;
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        i5 = $11 + 47;
                        $10 = i5 % 128;
                        if (i5 % 2 == 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (z2) {
                            byte[] bArr6 = cancel;
                            int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i20]) ^ 3046761265686732006L)) + s)) ^ b));
                        } else {
                            short[] sArr = INotificationSideChannelDefault;
                            int i21 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i21 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i21]) ^ 3046761265686732006L)) + s)) ^ b));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                } else {
                    int i22 = $10 + 103;
                    $11 = i22 % 128;
                    int i23 = i22 % 2;
                }
                z2 = false;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    i5 = $11 + 47;
                    $10 = i5 % 128;
                    if (i5 % 2 == 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (z2) {
                        byte[] bArr7 = cancel;
                        int i24 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i24 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i24]) ^ 3046761265686732006L)) + s)) ^ b));
                    } else {
                        short[] sArr2 = INotificationSideChannelDefault;
                        int i25 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i25 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr2[i25]) ^ 3046761265686732006L)) + s)) ^ b));
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

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        String str;
        int i = 2 % 2;
        IndividualDataClaim individualDataClaim = (IndividualDataClaim) this.b.getValue();
        if (individualDataClaim != null) {
            final Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4 = (Camera2CameraControlImplExternalSyntheticLambda4) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            Intrinsics.checkNotNullParameter(individualDataClaim, "");
            MutableLiveData<VirtualCameraAdapter1<JhtClaimEmployeeDataItem>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.f101a;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            User userAsBinder = camera2CameraControlImplExternalSyntheticLambda4.IconCompatParcelizer.asBinder();
            if (userAsBinder != null) {
                int i2 = INotificationSideChannelStub + 1;
                getInterfaceDescriptor = i2 % 128;
                if (i2 % 2 == 0) {
                    str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i3 = 66 / 0;
                } else {
                    str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                }
            } else {
                int i4 = getInterfaceDescriptor + 61;
                INotificationSideChannelStub = i4 % 128;
                int i5 = i4 % 2;
                str = null;
            }
            if (str == null) {
                int i6 = getInterfaceDescriptor + 13;
                INotificationSideChannelStub = i6 % 128;
                int i7 = i6 % 2;
                str = "";
            }
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelDefault.b(new ClaimEmployeeDataRequest(str, individualDataClaim.getItem))));
            final Function1 function1 = new Function1() { // from class: Camera2CameraControlImplExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(camera2CameraControlImplExternalSyntheticLambda4, (JhtClaimEmployeeDataItem) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: lambdaonCaptureCancelled2
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final addCaptureCallback addcapturecallback = new addCaptureCallback(camera2CameraControlImplExternalSyntheticLambda4);
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: Camera2CameraControlImplCaptureResultListener
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    addcapturecallback.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(reopenCameraAfterError reopencameraaftererror, int i, int i2, int i3) {
        int i4 = 2 % 2;
        reopencameraaftererror.INotificationSideChannel.set(1, i);
        reopencameraaftererror.INotificationSideChannel.set(2, i2);
        reopencameraaftererror.INotificationSideChannel.set(5, i3);
        reopencameraaftererror.INotificationSideChannelStub().edtBirthDate.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(reopencameraaftererror.INotificationSideChannel.getTime()));
        int i5 = getInterfaceDescriptor + 13;
        INotificationSideChannelStub = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041 A[PHI: r5
  0x0041: PHI (r5v6 android.widget.EditText) = (r5v5 android.widget.EditText), (r5v32 android.widget.EditText) binds: [B:14:0x003f, B:11:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(final reopenCameraAfterError reopencameraaftererror, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        EditText editText;
        String identityNumber;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str2;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            reopencameraaftererror.IconCompatParcelizer();
            str = "loading_claim_jht_step_first_employee_data_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            reopencameraaftererror.write();
            JhtClaimEmployeeDataItem jhtClaimEmployeeDataItem = (JhtClaimEmployeeDataItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            reopencameraaftererror.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = jhtClaimEmployeeDataItem;
            FragmentClaimOldDaySecurityPersonalDataBinding fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub = reopencameraaftererror.INotificationSideChannelStub();
            if (jhtClaimEmployeeDataItem != null) {
                int i2 = getInterfaceDescriptor + 111;
                INotificationSideChannelStub = i2 % 128;
                if (i2 % 2 != 0) {
                    editText = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                    int i3 = 38 / 0;
                    if (editText != null) {
                        identityNumber = jhtClaimEmployeeDataItem.getIdentityNumber();
                        if (identityNumber == null) {
                            int i4 = INotificationSideChannelStub + 69;
                            getInterfaceDescriptor = i4 % 128;
                            int i5 = i4 % 2;
                            identityNumber = "";
                        }
                        editText.setText(identityNumber);
                    }
                } else {
                    editText = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                    if (editText != null) {
                        identityNumber = jhtClaimEmployeeDataItem.getIdentityNumber();
                        if (identityNumber == null) {
                            int i6 = INotificationSideChannelStub + 69;
                            getInterfaceDescriptor = i6 % 128;
                            int i7 = i6 % 2;
                            identityNumber = "";
                        }
                        editText.setText(identityNumber);
                    }
                }
                EditText editText2 = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.tilKPJNumber.getEditText();
                if (editText2 != null) {
                    editText2.setText(jhtClaimEmployeeDataItem.getKpj());
                }
                EditText editText3 = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.tilFullName.getEditText();
                if (editText3 != null) {
                    editText3.setText(jhtClaimEmployeeDataItem.getFullName());
                }
                EditText editText4 = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.tilBirthDate.getEditText();
                if (editText4 != null) {
                    int i8 = getInterfaceDescriptor + 83;
                    INotificationSideChannelStub = i8 % 128;
                    int i9 = i8 % 2;
                    editText4.setText(jhtClaimEmployeeDataItem.getBirthDate());
                }
                EditText editText5 = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.tilPhoneNumber.getEditText();
                Object obj = null;
                if (editText5 != null) {
                    try {
                        User user = (User) reopencameraaftererror.g.getValue();
                        strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.valueOf(user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null));
                    } catch (Exception unused) {
                        strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = "-";
                    }
                    editText5.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
                EditText editText6 = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.tilEmail.getEditText();
                if (editText6 != null) {
                    User user2 = (User) reopencameraaftererror.g.getValue();
                    editText6.setText(user2 != null ? user2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
                }
                EditText editText7 = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.tilGender.getEditText();
                if (editText7 != null) {
                    int i10 = getInterfaceDescriptor + 81;
                    INotificationSideChannelStub = i10 % 128;
                    if (i10 % 2 != 0) {
                        Intrinsics.areEqual(jhtClaimEmployeeDataItem.getGender(), "L");
                        obj.hashCode();
                        throw null;
                    }
                    if (!(!Intrinsics.areEqual(jhtClaimEmployeeDataItem.getGender(), "L"))) {
                        str2 = "LAKI-LAKI";
                    } else {
                        int i11 = INotificationSideChannelStub + 33;
                        getInterfaceDescriptor = i11 % 128;
                        int i12 = i11 % 2;
                        str2 = "PEREMPUAN";
                    }
                    editText7.setText(str2);
                }
                if (Intrinsics.areEqual(jhtClaimEmployeeDataItem.getFlagSipp(), "0")) {
                    int i13 = getInterfaceDescriptor + 121;
                    INotificationSideChannelStub = i13 % 128;
                    int i14 = i13 % 2;
                    TextView textView = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.tvReminderNoSipp;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    textView.setVisibility(8);
                    AppCompatCheckBox appCompatCheckBox = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.cbAgreeTermCondition;
                    Intrinsics.checkNotNullExpressionValue(appCompatCheckBox, "");
                    appCompatCheckBox.setVisibility(0);
                    fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.cbAgreeTermCondition.setChecked(false);
                } else {
                    TextView textView2 = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.tvReminderNoSipp;
                    Intrinsics.checkNotNullExpressionValue(textView2, "");
                    textView2.setVisibility(8);
                    AppCompatCheckBox appCompatCheckBox2 = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.cbAgreeTermCondition;
                    Intrinsics.checkNotNullExpressionValue(appCompatCheckBox2, "");
                    appCompatCheckBox2.setVisibility(0);
                    fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.cbAgreeTermCondition.setChecked(true);
                }
            }
            str = "success_claim_jht_step_first_employee_data_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            reopencameraaftererror.write();
            reopenCameraAfterError reopencameraaftererror2 = reopencameraaftererror;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Function0 function0 = new Function0() { // from class: Camera2CameraImplStateCallbackCameraReopenMonitor
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return reopenCameraAfterError.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
                }
            };
            Intrinsics.checkNotNullParameter(reopencameraaftererror2, "");
            Intrinsics.checkNotNullParameter(strValueOf, "");
            BaseActivity baseActivity = (BaseActivity) reopencameraaftererror2.getContext();
            if (baseActivity != null) {
                int i15 = INotificationSideChannelStub + 51;
                getInterfaceDescriptor = i15 % 128;
                int i16 = i15 % 2;
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, function0);
            }
            str = "failure_claim_jht_step_first_employee_data_result";
        } else {
            str = "";
        }
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_claim_jht_step_first", str));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(reopenCameraAfterError reopencameraaftererror) {
        Editable text;
        Editable text2;
        Editable text3;
        String flagSipp;
        String str;
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 57;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        FragmentClaimOldDaySecurityPersonalDataBinding fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub = reopencameraaftererror.INotificationSideChannelStub();
        IndividualDataClaim individualDataClaim = (IndividualDataClaim) reopencameraaftererror.b.getValue();
        IndividualDataClaim individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        if (individualDataClaim != null) {
            EditText editText = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.tilIdNumber.getEditText();
            if (editText != null) {
                int i4 = INotificationSideChannelStub + 79;
                getInterfaceDescriptor = i4 % 128;
                if (i4 % 2 == 0) {
                    editText.getText();
                    individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
                    throw null;
                }
                text = editText.getText();
            } else {
                text = null;
            }
            String strValueOf = String.valueOf(text);
            EditText editText2 = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.tilKPJNumber.getEditText();
            String strValueOf2 = String.valueOf(editText2 != null ? editText2.getText() : null);
            EditText editText3 = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.tilFullName.getEditText();
            if (editText3 != null) {
                int i5 = INotificationSideChannelStub + 119;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                text2 = editText3.getText();
            } else {
                text2 = null;
            }
            String strValueOf3 = String.valueOf(text2);
            EditText editText4 = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.tilBirthDate.getEditText();
            if (editText4 != null) {
                text3 = editText4.getText();
            } else {
                int i7 = INotificationSideChannelStub + 99;
                getInterfaceDescriptor = i7 % 128;
                int i8 = i7 % 2;
                text3 = null;
            }
            String strValueOf4 = String.valueOf(text3);
            EditText editText5 = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.tilPhoneNumber.getEditText();
            String strValueOf5 = String.valueOf(editText5 != null ? editText5.getText() : null);
            EditText editText6 = fragmentClaimOldDaySecurityPersonalDataBindingINotificationSideChannelStub.tilEmail.getEditText();
            String strValueOf6 = String.valueOf(editText6 != null ? editText6.getText() : null);
            JhtClaimEmployeeDataItem jhtClaimEmployeeDataItem = reopencameraaftererror.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (jhtClaimEmployeeDataItem != null) {
                flagSipp = jhtClaimEmployeeDataItem.getFlagSipp();
                int i9 = INotificationSideChannelStub + 59;
                getInterfaceDescriptor = i9 % 128;
                int i10 = i9 % 2;
            } else {
                flagSipp = null;
            }
            if (Intrinsics.areEqual(flagSipp, "0")) {
                int i11 = getInterfaceDescriptor + 25;
                INotificationSideChannelStub = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 76 / 0;
                }
                str = "Y";
            } else {
                str = ExifInterface.GPS_DIRECTION_TRUE;
            }
            individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim, strValueOf, strValueOf3, strValueOf4, null, null, strValueOf2, null, null, strValueOf5, strValueOf6, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -808, -3, 127, null);
        }
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
        lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol = new lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1, false, 2, 0);
        Intrinsics.checkNotNullParameter(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol, "");
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        reopenCameraAfterError reopencameraaftererror = (reopenCameraAfterError) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[1], "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_step_first_claim_jht", "claim_jht_step_first_employee_data_confirm_no"));
        Intrinsics.checkNotNullParameter("claim_jht_step_first_employee_data_confirm_no", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("claim_jht_step_first_employee_data_confirm_no", mapMutableMapOf);
        getCameraState.Companion companion = getCameraState.INSTANCE;
        String string = reopencameraaftererror.getString(R.string.label_not_correct);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = reopencameraaftererror.getString(R.string.label_reminder_claim_to_branch_office);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = reopencameraaftererror.getString(R.string.label_back_to_homescreen);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_blue, string, string2, string3);
        reopencameraaftererror.d = getcamerastateB;
        FragmentManager childFragmentManager = reopencameraaftererror.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i2 = INotificationSideChannelStub + 49;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                throw null;
            }
            getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        getCameraState getcamerastate = reopencameraaftererror.d;
        if (getcamerastate != null) {
            getcamerastate.g = reopencameraaftererror.new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int i3 = INotificationSideChannelStub + 19;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 % 5;
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        reopenCameraAfterError reopencameraaftererror = (reopenCameraAfterError) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 45;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return ((ActivityResultContractsPickVisualMediaMediaCapabilities) reopencameraaftererror.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
        int i3 = 69 / 0;
        return ((ActivityResultContractsPickVisualMediaMediaCapabilities) reopencameraaftererror.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(final reopenCameraAfterError reopencameraaftererror, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 101;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            reopencameraaftererror.INotificationSideChannelStub().cbAgreeTermCondition.isChecked();
            throw null;
        }
        if (reopencameraaftererror.INotificationSideChannelStub().cbAgreeTermCondition.isChecked()) {
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_step_first_claim_jht", "claim_jht_step_first_employee_data_confirm_yes"));
            Intrinsics.checkNotNullParameter("claim_jht_step_first_employee_data_confirm_yes", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("claim_jht_step_first_employee_data_confirm_yes", mapMutableMapOf);
            getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
            User user = (User) reopencameraaftererror.g.getValue();
            String strConcat = "Pastikan email yang terdaftar untuk pengajuan klaim JHT pada Aplikasi JMO aktif. Email terdaftar Anda adalah ".concat(String.valueOf(user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null));
            String string = reopencameraaftererror.getString(R.string.action_ok_continue);
            Intrinsics.checkNotNullExpressionValue(string, "");
            getStringOrNull getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(R.drawable.ic_info_blue, "Konfirmasi", strConcat, string, new Function0() { // from class: reset
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return reopenCameraAfterError.b(this.TuitionPaymentFragmentbindingInflater1);
                }
            }, reopencameraaftererror.getString(R.string.action_return), new Function0() { // from class: getElapsedTime
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return reopenCameraAfterError.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
            });
            reopencameraaftererror.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            FragmentManager childFragmentManager = reopencameraaftererror.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(childFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i4 = getInterfaceDescriptor + 77;
                INotificationSideChannelStub = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            String string2 = reopencameraaftererror.getString(R.string.message_agreed_tnc);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string2, 0).show();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 3;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = INotificationSideChannelStub + 57;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ IndividualDataClaim TuitionPaymentFragmentspecialinlinedviewModeldefault1(reopenCameraAfterError reopencameraaftererror) {
        IndividualDataClaim value;
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 67;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            value = ((getExtendedConfig) reopencameraaftererror.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            int i3 = 1 / 0;
        } else {
            value = ((getExtendedConfig) reopencameraaftererror.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        }
        int i4 = getInterfaceDescriptor + 49;
        INotificationSideChannelStub = i4 % 128;
        if (i4 % 2 == 0) {
            return value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        final reopenCameraAfterError reopencameraaftererror = (reopenCameraAfterError) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: Camera2CameraImplStateCallbackScheduledReopen
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                    reopenCameraAfterError.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, i2, i3, i4);
                }
            }, reopencameraaftererror.INotificationSideChannel.get(1), reopencameraaftererror.INotificationSideChannel.get(2), reopencameraaftererror.INotificationSideChannel.get(5)).show();
            ViewPortBuilder.b();
            int i2 = getInterfaceDescriptor + 55;
            INotificationSideChannelStub = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:9:0x001a A[PHI: r4
  0x001a: PHI (r4v2 com.nbs.nucleosnucleo.presentation.BaseActivity) = (r4v1 com.nbs.nucleosnucleo.presentation.BaseActivity), (r4v5 com.nbs.nucleosnucleo.presentation.BaseActivity) binds: [B:8:0x0018, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(reopenCameraAfterError reopencameraaftererror) {
        BaseActivity baseActivity;
        int i;
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 49;
        INotificationSideChannelStub = i3 % 128;
        if (i3 % 2 != 0) {
            baseActivity = reopencameraaftererror.TuitionPaymentFragmentbindingInflater1;
            int i4 = 49 / 0;
            if (baseActivity != null) {
                i = getInterfaceDescriptor + 49;
                INotificationSideChannelStub = i % 128;
                if (i % 2 == 0) {
                    baseActivity.d_();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                baseActivity.d_();
            }
        } else {
            baseActivity = reopencameraaftererror.TuitionPaymentFragmentbindingInflater1;
            if (baseActivity != null) {
                i = getInterfaceDescriptor + 49;
                INotificationSideChannelStub = i % 128;
                if (i % 2 == 0) {
                    baseActivity.d_();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                baseActivity.d_();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(reopenCameraAfterError reopencameraaftererror, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentbindingInflater1(getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1734923157, new Object[]{reopencameraaftererror, view}, -1734923157, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault2(reopenCameraAfterError reopencameraaftererror) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (User) TuitionPaymentFragmentbindingInflater1(getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -475759576, new Object[]{reopencameraaftererror}, 475759577, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    public static /* synthetic */ void b(reopenCameraAfterError reopencameraaftererror, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 192443616, new Object[]{reopencameraaftererror, view}, -192443614, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    static {
        INotificationSideChannelStubProxy = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        INSTANCE = new Companion(null);
        int i = RemoteActionCompatParcelizer + 41;
        INotificationSideChannelStubProxy = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getCancel() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        int i3 = i2 % 128;
        INotificationSideChannelStub = i3;
        if (i2 % 2 != 0) {
            int i4 = 78 / 0;
        }
        int i5 = i3 + 71;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.fragment_claim_old_day_security_personal_data;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 75;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 80 / 0;
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1243055391, new Object[]{this}, 1243055394, getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        INotificationSideChannel = 861236476;
        onTransact = -1934795548;
        notify = -819343392;
        cancel = new byte[]{-18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29, -26, -26, -26, -26};
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
    private static java.lang.String $$e(int r6, byte r7, int r8) {
        /*
            byte[] r0 = defpackage.reopenCameraAfterError.$$c
            int r8 = 121 - r8
            int r7 = r7 * 2
            int r1 = 1 - r7
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L15
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.reopenCameraAfterError.$$e(int, byte, int):java.lang.String");
    }
}
