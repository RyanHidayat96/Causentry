package defpackage;

import android.app.DatePickerDialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.AndroidCharacter;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelStoreOwner;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import androidx.work.WorkInfo;
import com.bpjstku.R;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.queueing.model.response.AntrianData;
import com.bpjstku.data.queueing.model.response.GetDataAntrianResponse;
import com.bpjstku.data.registration.general.model.request.MembershipCheckRequest;
import com.bpjstku.data.registration.general.model.request.OcrKtpRequest;
import com.bpjstku.data.registration.general.model.response.MembershipCheckItem;
import com.bpjstku.data.registration.general.model.response.OcrKtpResponse;
import com.bpjstku.data.registration.general.model.response.ResultOcr;
import com.bpjstku.databinding.FragmentSalariedWorkerPersonalDataBinding;
import com.bpjstku.domain.registration.general.model.MembershipCheckNew;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.salariedworker.KtpCameraActivity;
import com.bpjstku.presentation.membership.registration.salariedworker.KtpGuidanceActivity;
import com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerPersonalDataFragment$bindingInflater$1;
import com.bpjstku.presentation.queueing.BookingAntreanFormActivity;
import com.bpjstku.presentation.queueing.BookingAntreanSuccessActivity;
import com.bpjstku.util.constant.Citizenship;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.utils.LocationAddressInfo;
import com.bpjstku.util.utils.UserLocationComplete;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.getFocusY;
import defpackage.getStreamUseCaseSupportedCombinationList;
import defpackage.getUntrustedCreatorPackageName;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import defpackage.setSplitTrack;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0015\u001a\u00020\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0010\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0015\u0010\u001a\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0015\u0010\u001d\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u001a\u0010\"\u001a\u00020\u001e8\u0015X\u0095D¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R.\u0010(\u001a\u001c\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020#8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0017\u0010&\u001a\u0004\u0018\u00010)8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0014\u0010 \u001a\u00020*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010+R\u0018\u0010\b\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010-R\u0016\u0010/\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u0018\u00102\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0016\u0010\t\u001a\u00020,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u0010-R\u0016\u0010\n\u001a\u00020,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010-R\u0016\u0010\u0007\u001a\u00020,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u0010-R\u0016\u0010\u0006\u001a\u00020,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u0010-R\u0016\u0010\u000b\u001a\u00020,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010-R\u0016\u00103\u001a\u00020,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010-R\u0016\u00105\u001a\u00020,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010-R\u0018\u0010\f\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010-R\u0018\u0010\r\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010-R\u0018\u0010\u0013\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010-R\u0018\u00106\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u0018\u00104\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u0010-R\u001e\u0010\u0017\u001a\f\u0012\b\u0012\u0006*\u00020808078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u00109R\u001e\u0010\u0019\u001a\f\u0012\b\u0012\u0006*\u00020808078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00109"}, d2 = {"LsetSecondaryToolbarSwipeUpGesture;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentSalariedWorkerPersonalDataBinding;", "<init>", "()V", "", "cancelAll", "onTransact", "g", "cancel", "INotificationSideChannel", "INotificationSideChannelDefault", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "", "p0", "b", "(Z)V", "Lcom/bpjstku/data/lib/PreferenceManager;", "write", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LsetSplitTrack;", "IconCompatParcelizer", "LgetUntrustedCreatorPackageName;", "MediaBrowserCompat", "TuitionPaymentFragmentbindingInflater1", "LgetStreamUseCaseSupportedCombinationList;", "disconnect", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "I", "asBinder", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "d", "()Lkotlin/jvm/functions/Function3;", "asInterface", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Ljava/util/Calendar;", "Ljava/util/Calendar;", "", "Ljava/lang/String;", "Z", "a", "Ljava/io/File;", "Ljava/io/File;", "notify", "INotificationSideChannelStub", "connect", "RemoteActionCompatParcelizer", "read", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResultLauncher;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setSecondaryToolbarSwipeUpGesture extends AutoValue_ImmutableImageInfo<FragmentSalariedWorkerPersonalDataBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final ActivityResultLauncher<Intent> IconCompatParcelizer;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private final Lazy d;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private String cancel;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    private String INotificationSideChannelDefault;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String cancelAll;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String write;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Calendar asBinder;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String read;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String getInterfaceDescriptor;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private boolean a;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    private String onTransact;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String INotificationSideChannelStub;

    /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private String INotificationSideChannel;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final ActivityResultLauncher<Intent> MediaBrowserCompat;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private File notify;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private String connect;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1) {
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

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    /* JADX INFO: renamed from: setSecondaryToolbarSwipeUpGesture$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LsetSecondaryToolbarSwipeUpGesture$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "LsetSecondaryToolbarSwipeUpGesture;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()LsetSecondaryToolbarSwipeUpGesture;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static setSecondaryToolbarSwipeUpGesture TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return new setSecondaryToolbarSwipeUpGesture();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public setSecondaryToolbarSwipeUpGesture() {
        final setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerPersonalDataFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = setsecondarytoolbarswipeupgesture;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture2 = this;
        this.b = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerPersonalDataFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setSplitTrack invoke() {
                LifecycleOwner lifecycleOwner = setsecondarytoolbarswipeupgesture2;
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
        final setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture3 = this;
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerPersonalDataFragment$special$$inlined$sharedViewModel$default$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner invoke() {
                FragmentActivity activity = setsecondarytoolbarswipeupgesture3.getActivity();
                if (activity != null) {
                    return activity;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
            }

            {
                super(0);
            }
        };
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<getUntrustedCreatorPackageName>() { // from class: com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerPersonalDataFragment$special$$inlined$sharedViewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, getUntrustedCreatorPackageName] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getUntrustedCreatorPackageName invoke() {
                return getFocusY.b(setsecondarytoolbarswipeupgesture3, Reflection.getOrCreateKotlinClass(getUntrustedCreatorPackageName.class), this.$qualifier, function0, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<getStreamUseCaseSupportedCombinationList>() { // from class: com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerPersonalDataFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getStreamUseCaseSupportedCombinationList] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getStreamUseCaseSupportedCombinationList invoke() {
                LifecycleOwner lifecycleOwner = setsecondarytoolbarswipeupgesture2;
                mapPoint mappoint = this.$qualifier;
                Function0 function1 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(getStreamUseCaseSupportedCombinationList.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = R.layout.fragment_salaried_worker_personal_data;
        this.d = LazyKt.lazy(new Function0() { // from class: setSecondaryToolbarViews
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.getValue()).b.getValue();
            }
        });
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        this.asBinder = calendar;
        this.g = "";
        this.cancel = "";
        this.INotificationSideChannel = "";
        this.onTransact = "";
        this.cancelAll = "";
        this.INotificationSideChannelDefault = "";
        this.INotificationSideChannelStub = "0.0";
        this.RemoteActionCompatParcelizer = "0.0";
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: setTranslateLocale
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                setSecondaryToolbarSwipeUpGesture.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.IconCompatParcelizer = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: CustomTabsIntentShareState
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                setSecondaryToolbarSwipeUpGesture.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.MediaBrowserCompat = activityResultLauncherRegisterForActivityResult2;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getCancel() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentSalariedWorkerPersonalDataBinding> d() {
        return SalariedWorkerPersonalDataFragment$bindingInflater$1.b;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        EditText editText;
        EditText editText2;
        Citizenship citizenship;
        Citizenship citizenship2;
        EditText editText3 = INotificationSideChannelStub().tilFullName.getEditText();
        if (editText3 != null) {
            Intrinsics.checkNotNullParameter(editText3, "");
            editText3.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        FragmentSalariedWorkerPersonalDataBinding fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub = INotificationSideChannelStub();
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) this.d.getValue();
        String str = null;
        this.g = String.valueOf((registeredMemberRegistration == null || (citizenship2 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) ? null : citizenship2.name());
        RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) this.d.getValue();
        if (Intrinsics.areEqual((registeredMemberRegistration2 == null || (citizenship = registeredMemberRegistration2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) ? null : citizenship.name(), "WNA")) {
            fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.cvFotoKtp.setVisibility(8);
            fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tvFotoKtpLabel.setVisibility(8);
            fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tvPageTitle.setVisibility(8);
            fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tvPageSubtitle.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilIdNumber.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.endToEnd = 0;
            layoutParams2.startToStart = 0;
            layoutParams2.setMarginStart(getResources().getDimensionPixelSize(R.dimen.dimen_20dp));
            layoutParams2.setMarginEnd(getResources().getDimensionPixelSize(R.dimen.dimen_20dp));
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = getResources().getDimensionPixelSize(R.dimen.dimen_5dp);
            fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilIdNumber.setLayoutParams(layoutParams2);
            fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilIdNumber.setHint(getString(R.string.label_passport_no));
            fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.edtIdNumber.setInputType(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.edtIdNumber.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(20)});
        } else {
            fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.cvFotoKtp.setVisibility(0);
            fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tvFotoKtpLabel.setVisibility(0);
            fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tvPageTitle.setVisibility(0);
            fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tvPageSubtitle.setVisibility(0);
            fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilIdNumber.setHint(getString(R.string.hint_id_number));
            fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.edtIdNumber.setInputType(3);
            fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.edtIdNumber.setKeyListener(DigitsKeyListener.getInstance("0123456789"));
            fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.edtIdNumber.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
        }
        RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) this.d.getValue();
        if (registeredMemberRegistration3 != null) {
            FragmentSalariedWorkerPersonalDataBinding fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub2 = INotificationSideChannelStub();
            String str2 = registeredMemberRegistration3.asInterface;
            if (str2 == null || str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub2.edtIdNumber.setText(str2);
            }
            String str3 = registeredMemberRegistration3.d;
            if (str3 == null || str3.length() <= 0) {
                str3 = null;
            }
            if (str3 != null && (editText2 = fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub2.tilJamsostekIdNumber.getEditText()) != null) {
                editText2.setText(str3);
            }
            String str4 = registeredMemberRegistration3.asBinder;
            if (str4 == null || str4.length() <= 0) {
                str4 = null;
            }
            if (str4 != null && (editText = fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub2.tilFullName.getEditText()) != null) {
                editText.setText(str4);
            }
            String str5 = registeredMemberRegistration3.notify;
            if (str5 != null && str5.length() > 0) {
                str = str5;
            }
            if (str != null) {
                EditText editText4 = fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub2.tilBirthDate.getEditText();
                if (editText4 != null) {
                    editText4.setText(str);
                }
                try {
                    Date date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).parse(str);
                    if (date != null) {
                        this.asBinder.setTime(date);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Exception unused) {
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        experimentalCamera2Interop.b(contextRequireContext, new Function1() { // from class: getSessionIdFromBundle
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSecondaryToolbarSwipeUpGesture.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (UserLocationComplete) obj);
            }
        }, new Function0() { // from class: setEngagementSignalsCallback
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return setSecondaryToolbarSwipeUpGesture.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        });
        b(this.notify != null);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        CardView cardView = INotificationSideChannelStub().cvFotoKtp;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        cardView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setShareState
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSecondaryToolbarSwipeUpGesture.b(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: cleanUpSession
            private static final byte[] $$a = {68, -119, -76, 97};
            private static final int $$b = 238;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int asInterface = 0;
            private static int d = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {59704, 59751, 59746, 59752, 59760, 59782, 59780, 59807, 59803, 59777, 59757, 59741, 59763, 59788, 59780, 59801, 59750, 59754, 59745, 59752, 59760, 59782, 59780, 59807, 59803, 59777, 59751, 59728, 59759, 59750, 59763, 59778, 59399, 59895, 59893, 59392, 59394, 59392, 59399, 59404, 59894, 59404, 59418, 59392, 59418, 59419, 59392, 59394, 59704, 59757, 59751, 59753, 59731, 59753, 59756, 59757, 59759, 59757, 59730, 59740, 59756, 59746, 59698, 59751, 59744, 59768, 59775, 59745, 59756, 59745, 59747, 59749, 59709, 59755, 59722, 59699, 59702, 59705, 59751, 59745, 59753, 59757, 59756, 59756, 59749, 59768, 59744, 59743, 59743, 59751, 59745, 59746, 59744, 59746, 59746, 59757};
            private static char[] b = {47498, 47507, 47550, 47548, 47430, 47489, 47503, 47505, 47551, 47490, 47499, 47488, 47547, 47500, 47487, 47428, 47516, 47460, 47494, 47492, 47496, 47473, 47479, 47519, 47457, 47432, 47461, 47475, 47504, 47493, 47462, 47444, 47472, 47506, 47501, 47495, 47497, 47463, 47467, 47502, 47470, 47474, 47483};
            private static int TuitionPaymentFragmentbindingInflater1 = 2047719732;
            private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static boolean f356a = true;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = asInterface + 55;
                d = i2 % 128;
                int i3 = i2 % 2;
                Unit unitTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setSecondaryToolbarSwipeUpGesture.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
                int i4 = asInterface + 99;
                d = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
                throw null;
            }

            private static void e(int i, char[] cArr, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
                char[] cArr2 = b;
                if (cArr2 != null) {
                    int i3 = $11 + 49;
                    $10 = i3 % 128;
                    int i4 = i3 % 2;
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    for (int i5 = 0; i5 < length; i5++) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = (byte) (b2 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 31339), 2994 - Color.red(0), 17 - View.MeasureSpec.getSize(0), 1182129903, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                            }
                            cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                try {
                    Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43326 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 254, View.resolveSize(0, 0) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    int i6 = 33602;
                    int i7 = 1687675375;
                    if (f356a) {
                        int i8 = $11 + 109;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                        char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                            int i10 = $11 + 115;
                            $10 = i10 % 128;
                            int i11 = i10 % 2;
                            cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                            Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i7);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (i6 - (ViewConfiguration.getPressedStateDuration() >> 16)), 3084 - TextUtils.lastIndexOf("", '0', 0), Color.red(0) + 26, -2146875848, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            i6 = 33602;
                            i7 = 1687675375;
                        }
                        objArr[0] = new String(cArr4);
                        return;
                    }
                    if (!TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                        char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                            int i12 = $11 + 89;
                            $10 = i12 % 128;
                            if (i12 % 2 != 0) {
                                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 / getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] >> i] % iIntValue);
                                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            } else {
                                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                            }
                        }
                        objArr[0] = new String(cArr5);
                        return;
                    }
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - TextUtils.getOffsetAfter("", 0)), 3085 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 26, -2146875848, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                    objArr[0] = new String(cArr6);
                    int i13 = $11 + 19;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }

            /* JADX WARN: Code duplicated, block: B:68:0x020e  */
            /* JADX WARN: Code duplicated, block: B:71:0x0229  */
            /* JADX WARN: Code duplicated, block: B:83:0x021a A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x021a -> B:63:0x0204). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(int[] r23, boolean r24, byte[] r25, java.lang.Object[] r26) {
                /*
                    Method dump skipped, instruction units count: 579
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cleanUpSession.c(int[], boolean, byte[], java.lang.Object[]):void");
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v0 */
            /* JADX WARN: Type inference failed for: r6v82 */
            public static Object[] b(Context context, int i, int i2) {
                Object[] objArr;
                int doubleTapTimeout;
                int minimumFlingVelocity;
                byte[] bArr;
                Object[] objArr2;
                int capsMode;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i3;
                int i4;
                int i5;
                String str;
                Class<?> cls;
                int[] iArr;
                byte[] bArr2;
                int i6 = 2;
                int i7 = 2 % 2;
                int i8 = 1;
                if (context != null) {
                    try {
                        Object[] objArr3 = new Object[1];
                        c(new int[]{0, 31, 36, 0}, false, new byte[]{1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0}, objArr3);
                        String str2 = (String) objArr3[0];
                        int i9 = asInterface;
                        int i10 = (i9 & 73) + (i9 | 73);
                        d = i10 % 128;
                        try {
                            if (i10 % 2 == 0) {
                                objArr = new Object[0];
                                objArr[0] = str2;
                                doubleTapTimeout = 98 << (ViewConfiguration.getDoubleTapTimeout() % 29);
                            } else {
                                objArr = new Object[]{str2};
                                int i11 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                doubleTapTimeout = ((i11 & 127) << 1) + (i11 ^ 127);
                            }
                            Object[] objArr4 = new Object[1];
                            e(doubleTapTimeout, null, null, new byte[]{-107, -126, -108, -117, -120, -109, -117, -118, -110, -112, -112, -113, -111, -123, -112, -112, -113, -124, -123, -114, -116, -119, -126, -123, -115, -116, -117, -118, -119, -120, -121, -122, -123, -124, -126, -125, -126, -127}, objArr4);
                            Constructor<?> declaredConstructor = Class.forName((String) objArr4[0]).getDeclaredConstructor(String.class);
                            int i12 = d;
                            int i13 = ((i12 | 51) << 1) - (i12 ^ 51);
                            asInterface = i13 % 128;
                            int i14 = i13 % 2;
                            Object objNewInstance = declaredConstructor.newInstance(objArr);
                            int i15 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i16 = i15 * 165;
                            int i17 = ((i16 | (-20864)) << 1) - (i16 ^ (-20864));
                            int i18 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i19 = ~((i18 ^ 128) | (i18 & 128));
                            int i20 = -(-(((i19 & i15) | (i15 ^ i19)) * (-328)));
                            int i21 = (i17 ^ i20) + ((i17 & i20) << 1);
                            int i22 = asInterface;
                            int i23 = (i22 ^ 41) + ((i22 & 41) << 1);
                            d = i23 % 128;
                            int i24 = i23 % 2;
                            int i25 = -(-(164 * ((i15 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i15 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2))));
                            int i26 = (~(iTuitionPaymentFragmentspecialinlinedviewModeldefault2 | (-129))) | (~((~i15) | (-129)));
                            int i27 = (i15 & i18) | (i18 ^ i15);
                            int i28 = ~((i27 & 128) | (i27 ^ 128));
                            int i29 = (i21 ^ i25) + ((i25 & i21) << 1) + (((i28 & i26) | (i26 ^ i28)) * 164);
                            Object[] objArr5 = new Object[1];
                            e(i29, null, null, new byte[]{-93, -119, -94, -121, -95, -96, -99, -117, -98, -118, -99, -109, -100, -105, -97, -106, -102, -99, -117, -98, -118, -99, -109, -100, -105, -101, -102, -103, -104, -105, -106}, objArr5);
                            try {
                                Object[] objArr6 = {(String) objArr5[0]};
                                int i30 = d;
                                int i31 = (i30 ^ 13) + ((i30 & 13) << 1);
                                asInterface = i31 % 128;
                                if (i31 % 2 != 0) {
                                    TextUtils.lastIndexOf("", '0', 0);
                                    Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }
                                int i32 = -TextUtils.lastIndexOf("", '0', 0);
                                int i33 = i32 * (-464);
                                int i34 = (i33 & (-117054)) + (i33 | (-117054));
                                int i35 = asInterface + 119;
                                int i36 = i35 % 128;
                                d = i36;
                                int i37 = i35 % 2;
                                int i38 = (i34 - (~((-465) * ((~i32) | (~((126 ^ i) | (126 & i))))))) - 1;
                                int i39 = ((i36 | 79) << 1) - (i36 ^ 79);
                                asInterface = i39 % 128;
                                int i40 = i39 % 2;
                                int i41 = ~i32;
                                int i42 = ~((i41 ^ i) | (i41 & i));
                                int i43 = -(-(930 * ((126 & i42) | (126 ^ i42))));
                                int i44 = (i38 & i43) + (i43 | i38);
                                int i45 = i | 126;
                                int i46 = -(-(((i41 & i45) | (i45 ^ i41)) * 465));
                                int i47 = (i44 ^ i46) + ((i46 & i44) << 1);
                                Object[] objArr7 = new Object[1];
                                e(i47, null, null, new byte[]{-107, -126, -108, -117, -120, -109, -117, -118, -110, -112, -112, -113, -111, -123, -112, -112, -113, -124, -123, -114, -116, -119, -126, -123, -115, -116, -117, -118, -119, -120, -121, -122, -123, -124, -126, -125, -126, -127}, objArr7);
                                Object objNewInstance2 = Class.forName((String) objArr7[0]).getDeclaredConstructor(String.class).newInstance(objArr6);
                                int i48 = asInterface + 57;
                                d = i48 % 128;
                                try {
                                    if (i48 % 2 == 0) {
                                        minimumFlingVelocity = 93 >> (ViewConfiguration.getMinimumFlingVelocity() >>> 86);
                                        bArr = new byte[23];
                                    } else {
                                        int i49 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                        minimumFlingVelocity = ((i49 | 127) << 1) - (i49 ^ 127);
                                        bArr = new byte[23];
                                    }
                                    // fill-array-data instruction
                                    bArr[0] = -116;
                                    bArr[1] = -124;
                                    bArr[2] = -121;
                                    bArr[3] = -116;
                                    bArr[4] = -109;
                                    bArr[5] = -98;
                                    bArr[6] = -106;
                                    bArr[7] = -123;
                                    bArr[8] = -116;
                                    bArr[9] = -109;
                                    bArr[10] = -121;
                                    bArr[11] = -116;
                                    bArr[12] = -109;
                                    bArr[13] = -98;
                                    bArr[14] = -120;
                                    bArr[15] = -123;
                                    bArr[16] = -99;
                                    bArr[17] = -117;
                                    bArr[18] = -98;
                                    bArr[19] = -118;
                                    bArr[20] = -99;
                                    bArr[21] = -109;
                                    bArr[22] = -126;
                                    Object[] objArr8 = new Object[1];
                                    e(minimumFlingVelocity, null, null, bArr, objArr8);
                                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                                    Object[] objArr9 = new Object[1];
                                    c(new int[]{31, 17, 165, 13}, true, new byte[]{1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0}, objArr9);
                                    String str3 = (String) objArr9[0];
                                    int i50 = d;
                                    int i51 = ((i50 | 75) << 1) - (i50 ^ 75);
                                    asInterface = i51 % 128;
                                    int i52 = i51 % 2;
                                    Object objInvoke = cls2.getMethod(str3, null).invoke(context, null);
                                    int i53 = d;
                                    int i54 = (i53 & 77) + (i53 | 77);
                                    asInterface = i54 % 128;
                                    int i55 = i54 % 2;
                                    try {
                                        int i56 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                        Object[] objArr10 = new Object[1];
                                        e(((i56 | 128) << 1) - (i56 ^ 128), null, null, new byte[]{-116, -124, -121, -116, -109, -98, -106, -123, -116, -109, -121, -116, -109, -98, -120, -123, -99, -117, -98, -118, -99, -109, -126}, objArr10);
                                        Class<?> cls3 = Class.forName((String) objArr10[0]);
                                        Object[] objArr11 = new Object[1];
                                        c(new int[]{48, 14, 0, 14}, false, new byte[]{1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0}, objArr11);
                                        Object objInvoke2 = cls3.getMethod((String) objArr11[0], null).invoke(context, null);
                                        int i57 = asInterface + 109;
                                        d = i57 % 128;
                                        try {
                                            if (i57 % 2 == 0) {
                                                objArr2 = new Object[3];
                                                objArr2[1] = 64;
                                                objArr2[0] = objInvoke2;
                                                capsMode = TextUtils.getCapsMode("", 0, 0);
                                                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                i3 = 74;
                                            } else {
                                                objArr2 = new Object[]{objInvoke2, 64};
                                                capsMode = TextUtils.getCapsMode("", 0, 0);
                                                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                i3 = 127;
                                            }
                                            int i58 = 85 * capsMode;
                                            int i59 = i3 * 85;
                                            int i60 = (i58 ^ i59) + ((i58 & i59) << 1);
                                            int i61 = ~capsMode;
                                            int i62 = ~i3;
                                            int i63 = ~((i61 ^ i62) | (i61 & i62));
                                            int i64 = ~capsMode;
                                            int i65 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            int i66 = ~((i64 ^ i65) | (i64 & i65));
                                            int i67 = (i63 ^ i66) | (i66 & i63);
                                            int i68 = ~i3;
                                            int i69 = i67 | (~((i68 ^ i65) | (i68 & i65)));
                                            int i70 = capsMode | i3;
                                            int i71 = (i69 | (~((i70 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i70 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1)))) * (-84);
                                            int i72 = (i60 & i71) + (i60 | i71);
                                            int i73 = (~((i62 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i62 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1))) | capsMode;
                                            int i74 = asInterface + 13;
                                            d = i74 % 128;
                                            int i75 = i74 % 2;
                                            int i76 = ~(i65 | i3);
                                            int i77 = -(-((-84) * ((i76 & i73) | (i73 ^ i76))));
                                            int i78 = (i72 & i77) + (i77 | i72);
                                            int i79 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            int i80 = ~((i79 & i3) | (i79 ^ i3));
                                            int i81 = ~((capsMode & i3) | (capsMode ^ i3));
                                            int i82 = ((i81 & i80) | (i80 ^ i81)) * 84;
                                            int i83 = (i78 ^ i82) + ((i82 & i78) << 1);
                                            Object[] objArr12 = new Object[1];
                                            e(i83, null, null, new byte[]{-118, -121, -93, -126, -109, -126, -90, -121, -93, -126, -91, -120, -126, -110, -123, -92, -108, -123, -116, -109, -121, -116, -109, -98, -120, -123, -99, -117, -98, -118, -99, -109, -126}, objArr12);
                                            Class<?> cls4 = Class.forName((String) objArr12[0]);
                                            int capsMode2 = TextUtils.getCapsMode("", 0, 0);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i84 = (capsMode2 * (-159)) - 20193;
                                            int i85 = ~capsMode2;
                                            int i86 = ((i85 & 127) | (i85 ^ 127)) * 160;
                                            int i87 = d + 11;
                                            int i88 = i87 % 128;
                                            asInterface = i88;
                                            if (i87 % 2 != 0) {
                                                int i89 = i84 / i86;
                                                i4 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                int i90 = -(-((~(i4 | capsMode2)) | (~((capsMode2 ^ 127) | (capsMode2 & 127)))));
                                                i5 = i89 + (((i90 | (-160)) << 1) - (i90 ^ (-160)));
                                            } else {
                                                int i91 = (i84 & i86) + (i84 | i86);
                                                i4 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                int i92 = ~((i4 ^ capsMode2) | (i4 & capsMode2));
                                                int i93 = ~((capsMode2 ^ 127) | (capsMode2 & 127));
                                                i5 = (i91 - (~(-(-(((i92 & i93) | (i92 ^ i93)) * (-160)))))) - 1;
                                            }
                                            int i94 = ~((i4 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | ((-128) ^ i4));
                                            int i95 = (i94 & capsMode2) | (capsMode2 ^ i94);
                                            int i96 = ((i88 | 111) << 1) - (i88 ^ 111);
                                            d = i96 % 128;
                                            int i97 = i96 % 2;
                                            int i98 = 160 * i95;
                                            int i99 = (i5 & i98) + (i98 | i5);
                                            Object[] objArr13 = new Object[1];
                                            e(i99, null, null, new byte[]{-98, -88, -109, -89, -121, -93, -126, -91, -120, -126, -110, -116, -121, -93}, objArr13);
                                            Object objInvoke3 = cls4.getMethod((String) objArr13[0], String.class, Integer.TYPE).invoke(objInvoke, objArr2);
                                            int i100 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                                            int i101 = ((i100 | 127) << 1) - (i100 ^ 127);
                                            int i102 = asInterface + 109;
                                            d = i102 % 128;
                                            int i103 = i102 % 2;
                                            Object[] objArr14 = new Object[1];
                                            e(i101, null, null, new byte[]{-98, -88, -109, -89, -121, -93, -126, -91, -120, -126, -110, -123, -92, -108, -123, -116, -109, -121, -116, -109, -98, -120, -123, -99, -117, -98, -118, -99, -109, -126}, objArr14);
                                            Class<?> cls5 = Class.forName((String) objArr14[0]);
                                            Object[] objArr15 = new Object[1];
                                            c(new int[]{62, 10, 0, 0}, true, new byte[]{1, 0, 1, 1, 1, 1, 1, 1, 0, 0}, objArr15);
                                            Object[] objArr16 = (Object[]) cls5.getField((String) objArr15[0]).get(objInvoke3);
                                            int length = objArr16.length;
                                            int i104 = 0;
                                            while (i104 < length) {
                                                int i105 = d;
                                                int i106 = (i105 & 5) + (i105 | 5);
                                                asInterface = i106 % 128;
                                                int i107 = i106 % i6;
                                                Object obj2 = objArr16[i104];
                                                Object[] objArr17 = new Object[i8];
                                                c(new int[]{72, 5, 8, i6}, i8, null, objArr17);
                                                try {
                                                    Object[] objArr18 = {(String) objArr17[0]};
                                                    int i108 = asInterface + 81;
                                                    d = i108 % 128;
                                                    if (i108 % i6 == 0) {
                                                        Object[] objArr19 = new Object[i8];
                                                        e(Color.red(0) * 127, null, null, new byte[]{-115, -118, -98, -116, -120, -126, -87, -121, -116, -126, -120, -117, -88, -117, -116, -118, -121, -106, -123, -116, -118, -121, -120, -123, -115, -116, -117, -118, -119, -120, -121, -122, -123, -126, -125, -126, -127}, objArr19);
                                                        str = (String) objArr19[0];
                                                    } else {
                                                        Object[] objArr20 = new Object[i8];
                                                        e(127 - Color.red(0), null, null, new byte[]{-115, -118, -98, -116, -120, -126, -87, -121, -116, -126, -120, -117, -88, -117, -116, -118, -121, -106, -123, -116, -118, -121, -120, -123, -115, -116, -117, -118, -119, -120, -121, -122, -123, -126, -125, -126, -127}, objArr20);
                                                        str = (String) objArr20[0];
                                                    }
                                                    Class<?> cls6 = Class.forName(str);
                                                    int i109 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                    Object[] objArr21 = new Object[i8];
                                                    e((i109 & 128) + (i109 | 128), null, null, new byte[]{-121, -120, -109, -126, -116, -122, -109, -89, -116, -121, -93}, objArr21);
                                                    String str4 = (String) objArr21[0];
                                                    Class<?>[] clsArr = new Class[i8];
                                                    clsArr[0] = String.class;
                                                    Object objInvoke4 = cls6.getMethod(str4, clsArr).invoke(null, objArr18);
                                                    try {
                                                        Object[] objArr22 = new Object[i8];
                                                        e(KeyEvent.keyCodeFromString("") + 127, null, null, new byte[]{-121, -118, -119, -116, -126, -109, -93, -117, -103, -123, -92, -108, -123, -116, -109, -121, -116, -109, -98, -120, -123, -99, -117, -98, -118, -99, -109, -126}, objArr22);
                                                        Class<?> cls7 = Class.forName((String) objArr22[0]);
                                                        Object[] objArr23 = new Object[i8];
                                                        e(127 - KeyEvent.getDeadChar(0, 0), null, null, new byte[]{-115, -126, -118, -118, -100, -121, -116, -115, -86, -98, -116}, objArr23);
                                                        try {
                                                            Object[] objArr24 = {new ByteArrayInputStream((byte[]) cls7.getMethod((String) objArr23[0], null).invoke(obj2, null))};
                                                            int i110 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                            int i111 = ((i110 | 127) << i8) - (i110 ^ 127);
                                                            byte[] bArr3 = {-115, -118, -98, -116, -120, -126, -87, -121, -116, -126, -120, -117, -88, -117, -116, -118, -121, -106, -123, -116, -118, -121, -120, -123, -115, -116, -117, -118, -119, -120, -121, -122, -123, -126, -125, -126, -127};
                                                            int i112 = asInterface;
                                                            int i113 = (i112 ^ 85) + ((i112 & 85) << i8);
                                                            d = i113 % 128;
                                                            if (i113 % 2 == 0) {
                                                                Object[] objArr25 = new Object[i8];
                                                                e(i111, null, null, bArr3, objArr25);
                                                                cls = Class.forName((String) objArr25[0]);
                                                                iArr = new int[]{77, 19, 0, 0};
                                                                bArr2 = new byte[19];
                                                            } else {
                                                                Object[] objArr26 = new Object[i8];
                                                                e(i111, null, null, bArr3, objArr26);
                                                                cls = Class.forName((String) objArr26[0]);
                                                                iArr = new int[]{77, 19, 0, 0};
                                                                bArr2 = new byte[19];
                                                            }
                                                            // fill-array-data instruction
                                                            bArr2[0] = 1;
                                                            bArr2[1] = 1;
                                                            bArr2[2] = 1;
                                                            bArr2[3] = 0;
                                                            bArr2[4] = 0;
                                                            bArr2[5] = 1;
                                                            bArr2[6] = 1;
                                                            bArr2[7] = 1;
                                                            bArr2[8] = 0;
                                                            bArr2[9] = 1;
                                                            bArr2[10] = 0;
                                                            bArr2[11] = 0;
                                                            bArr2[12] = 1;
                                                            bArr2[13] = 1;
                                                            bArr2[14] = 1;
                                                            bArr2[15] = 1;
                                                            bArr2[16] = 1;
                                                            bArr2[17] = 1;
                                                            bArr2[18] = 0;
                                                            Object[] objArr27 = new Object[i8];
                                                            c(iArr, i8, bArr2, objArr27);
                                                            String str5 = (String) objArr27[0];
                                                            Class<?>[] clsArr2 = new Class[i8];
                                                            clsArr2[0] = InputStream.class;
                                                            Object objInvoke5 = cls.getMethod(str5, clsArr2).invoke(objInvoke4, objArr24);
                                                            try {
                                                                int i114 = -(-View.combineMeasuredStates(0, 0));
                                                                Object[] objArr28 = new Object[i8];
                                                                e(((i114 | 127) << i8) - (i114 ^ 127), null, null, new byte[]{-121, -116, -126, -120, -117, -88, -117, -116, -118, -121, -106, -85, -112, -113, -111, -123, -116, -118, -121, -120, -123, -115, -116, -117, -118, -119, -120, -121, -122, -123, -126, -125, -126, -127}, objArr28);
                                                                Class<?> cls8 = Class.forName((String) objArr28[0]);
                                                                int i115 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                int i116 = i115 * 624;
                                                                int i117 = (i116 & (-79616)) + (i116 | (-79616));
                                                                int i118 = ((-129) ^ i115) | ((-129) & i115);
                                                                int i119 = i117 + ((~((i118 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i118 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4))) * 623);
                                                                int i120 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                                                int i121 = ~i115;
                                                                int i122 = (i119 - (~(-(-(((~((i121 ^ 128) | (i121 & 128))) | i120) * (-623)))))) - i8;
                                                                int i123 = ~(((-129) ^ i115) | ((-129) & i115));
                                                                int i124 = ~(((-129) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-129) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                                                int i125 = (i123 ^ i124) | (i124 & i123);
                                                                int i126 = ~((i115 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i115 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                                                int i127 = -(-(((i126 & i125) | (i125 ^ i126)) * 623));
                                                                Object[] objArr29 = new Object[i8];
                                                                e(((i122 | i127) << i8) - (i127 ^ i122), null, null, new byte[]{-107, -126, -108, -117, -120, -109, -117, -118, -110, -112, -112, -113, -111, -116, -120, -121, -127, -94, -119, -103, -116, -121, -93}, objArr29);
                                                                if (((objNewInstance.equals(cls8.getMethod((String) objArr29[0], null).invoke(objInvoke5, null)) ? 1 : 0) ^ i8) == i8) {
                                                                    try {
                                                                        int i128 = -Color.rgb(0, 0, 0);
                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                        int i129 = i128 * (-432);
                                                                        int i130 = (i129 & 1308677966) + (i129 | 1308677966);
                                                                        int i131 = ~i128;
                                                                        int i132 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                                                        int i133 = (i132 & i131) | (i131 ^ i132);
                                                                        int i134 = i130 + ((~((i133 ^ (-16777089)) | (i133 & (-16777089)))) * 433);
                                                                        int i135 = asInterface + 61;
                                                                        d = i135 % 128;
                                                                        int i136 = i135 % 2;
                                                                        int i137 = ~((16777088 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (16777088 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                                                        int i138 = i134 + ((-433) * ((i131 & i137) | (i131 ^ i137)));
                                                                        int i139 = ~i128;
                                                                        int i140 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & i139) | (i139 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                                                        int i141 = ~(i128 | (-16777089));
                                                                        int i142 = i138 + (((i141 & i140) | (i140 ^ i141)) * 433);
                                                                        Object[] objArr30 = new Object[i8];
                                                                        e(i142, null, null, new byte[]{-121, -116, -126, -120, -117, -88, -117, -116, -118, -121, -106, -85, -112, -113, -111, -123, -116, -118, -121, -120, -123, -115, -116, -117, -118, -119, -120, -121, -122, -123, -126, -125, -126, -127}, objArr30);
                                                                        Class<?> cls9 = Class.forName((String) objArr30[0]);
                                                                        int i143 = -AndroidCharacter.getMirror('0');
                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = isAssociatedWith.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                        int i144 = i143 * (-495);
                                                                        int i145 = (i144 ^ (-86625)) + ((i144 & (-86625)) << i8);
                                                                        int i146 = ~i143;
                                                                        int i147 = ~(i146 | (-176));
                                                                        int i148 = d + 25;
                                                                        asInterface = i148 % 128;
                                                                        int i149 = i148 % 2;
                                                                        int i150 = ~((i146 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i146 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                                                        int i151 = (i145 - (~(-(-(992 * ((i150 & i147) | (i147 ^ i150))))))) - 1;
                                                                        int i152 = ~((i146 ^ (-176)) | (i146 & (-176)));
                                                                        int i153 = ~((i146 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i146 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                                                        int i154 = (i152 & i153) | (i152 ^ i153);
                                                                        int i155 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                                        int i156 = (i143 & i155) | (i155 ^ i143);
                                                                        int i157 = ~((i156 & 175) | (i156 ^ 175));
                                                                        int i158 = i151 + (((i154 & i157) | (i154 ^ i157)) * (-496));
                                                                        int i159 = ((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 ^ 175) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & 175)) * 496;
                                                                        Object[] objArr31 = new Object[1];
                                                                        e((i158 ^ i159) + ((i159 & i158) << 1), null, null, new byte[]{-107, -126, -108, -117, -120, -109, -117, -118, -110, -112, -112, -113, -111, -116, -120, -121, -127, -94, -119, -103, -116, -121, -93}, objArr31);
                                                                        if (!objNewInstance2.equals(cls9.getMethod((String) objArr31[0], null).invoke(objInvoke5, null))) {
                                                                            i104++;
                                                                            i6 = 2;
                                                                            i8 = 1;
                                                                        }
                                                                    } catch (Throwable th) {
                                                                        Throwable cause = th.getCause();
                                                                        if (cause != null) {
                                                                            throw cause;
                                                                        }
                                                                        throw th;
                                                                    }
                                                                }
                                                                int i160 = ~i;
                                                                int[] iArr2 = new int[1];
                                                                Object[] objArr32 = {new int[]{i}, iArr2, new int[]{(i & (-2)) | (i160 & 1)}, null};
                                                                int i161 = (-981816544) + (((~((-859298027) | i)) | 52893930) * 345) + (((~((-859298027) | i160)) | (-871881728)) * 345) + ((~((-52893931) | i)) * 345);
                                                                int i162 = 879 - (~(-(-(i161 * (-107)))));
                                                                int i163 = ~(((-17) ^ i161) | ((-17) & i161));
                                                                int i164 = ~((i160 ^ i161) | (i160 & i161));
                                                                int i165 = i162 + (((i163 & i164) | (i163 ^ i164)) * (-108));
                                                                int i166 = ~(((-17) & i) | ((-17) ^ i));
                                                                int i167 = ~i161;
                                                                int i168 = ~((i167 & 16) | (i167 ^ 16));
                                                                int i169 = (i166 & i168) | (i166 ^ i168);
                                                                int i170 = ~(i160 | 16);
                                                                int i171 = ((i165 + (((i169 & i170) | (i169 ^ i170)) * 54)) - (~(-(-((i | i168) * 54))))) - 1;
                                                                int i172 = i171 * (-716);
                                                                int i173 = i2 * 1435;
                                                                int i174 = ((i172 | i173) << 1) - (i172 ^ i173);
                                                                int i175 = ~i171;
                                                                int i176 = (i2 | i175) * (-1434);
                                                                int i177 = (i174 & i176) + (i176 | i174);
                                                                int i178 = ~((i160 ^ i2) | (i160 & i2));
                                                                int i179 = ~((i171 & i2) | (i171 ^ i2));
                                                                int i180 = (i178 & i179) | (i178 ^ i179);
                                                                int i181 = ~i2;
                                                                int i182 = i175 | i181;
                                                                int i183 = ~((i182 & i) | (i182 ^ i));
                                                                int i184 = (i177 - (~(((i180 & i183) | (i180 ^ i183)) * 717))) - 1;
                                                                int i185 = (i175 & i181) | (i175 ^ i181);
                                                                int i186 = ~((i160 & i185) | (i185 ^ i160));
                                                                int i187 = (i179 & i186) | (i186 ^ i179);
                                                                int i188 = ~(i2 | i);
                                                                int i189 = (i184 - (~(((i187 & i188) | (i187 ^ i188)) * 717))) - 1;
                                                                int i190 = i189 << 13;
                                                                int i191 = (i190 & (~i189)) | ((~i190) & i189);
                                                                int i192 = i191 ^ (i191 >>> 17);
                                                                int i193 = i192 << 5;
                                                                iArr2[0] = ((~i192) & i193) | ((~i193) & i192);
                                                                return objArr32;
                                                            } catch (Throwable th2) {
                                                                Throwable cause2 = th2.getCause();
                                                                if (cause2 != null) {
                                                                    throw cause2;
                                                                }
                                                                throw th2;
                                                            }
                                                        } catch (Throwable th3) {
                                                            Throwable cause3 = th3.getCause();
                                                            if (cause3 != null) {
                                                                throw cause3;
                                                            }
                                                            throw th3;
                                                        }
                                                    } catch (Throwable th4) {
                                                        Throwable cause4 = th4.getCause();
                                                        if (cause4 != null) {
                                                            throw cause4;
                                                        }
                                                        throw th4;
                                                    }
                                                } catch (Throwable th5) {
                                                    Throwable cause5 = th5.getCause();
                                                    if (cause5 != null) {
                                                        throw cause5;
                                                    }
                                                    throw th5;
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            Throwable cause6 = th6.getCause();
                                            if (cause6 != null) {
                                                throw cause6;
                                            }
                                            throw th6;
                                        }
                                    } catch (Throwable th7) {
                                        Throwable cause7 = th7.getCause();
                                        if (cause7 != null) {
                                            throw cause7;
                                        }
                                        throw th7;
                                    }
                                } catch (Throwable th8) {
                                    Throwable cause8 = th8.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th8;
                                }
                            } catch (Throwable th9) {
                                Throwable cause9 = th9.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th9;
                            }
                        } catch (Throwable th10) {
                            Throwable cause10 = th10.getCause();
                            if (cause10 != null) {
                                throw cause10;
                            }
                            throw th10;
                        }
                    } catch (Throwable unused) {
                    }
                }
                Object[] objArr33 = new Object[4];
                int[] iArr3 = new int[1];
                objArr33[0] = iArr3;
                objArr33[1] = new int[1];
                int[] iArr4 = new int[1];
                objArr33[2] = iArr4;
                int i194 = asInterface;
                int i195 = i194 + 89;
                d = i195 % 128;
                int i196 = i195 % 2 == 0 ? 1 : 0;
                int i197 = i194 + 29;
                int i198 = i197 % 128;
                d = i198;
                int i199 = i197 % 2;
                iArr3[0] = i;
                iArr4[0] = i;
                int i200 = i198 + 105;
                asInterface = i200 % 128;
                int i201 = i200 % 2;
                objArr33[3] = null;
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i202 = 684059482 + (((~(450473090 | startUptimeMillis)) | 490783319) * (-366)) + (((~(startUptimeMillis | 534376151)) | 406880258) * 366);
                int i203 = asInterface;
                int i204 = (i203 ^ 91) + ((i203 & 91) << 1);
                int i205 = i204 % 128;
                d = i205;
                int i206 = i204 % 2;
                int i207 = ~i196;
                int i208 = ~i202;
                int i209 = ~(i207 | i208);
                int i210 = ~i196;
                int i211 = ~((i210 ^ i) | (i210 & i));
                int i212 = (i209 & i211) | (i209 ^ i211);
                int i213 = ~((i208 & i) | (i208 ^ i));
                int i214 = (i196 * 881) + (i202 * 881) + (((i212 & i213) | (i212 ^ i213)) * (-880));
                int i215 = i205 + 31;
                asInterface = i215 % 128;
                int i216 = i215 % 2;
                int i217 = ~i;
                int i218 = ~((i217 & i210) | (i210 ^ i217));
                int i219 = (-880) * ((i202 & i218) | (i202 ^ i218) | (~(i196 | i)));
                int i220 = (i214 & i219) + (i214 | i219);
                int i221 = (~((i & i196) | (i196 ^ i))) * 880;
                int i222 = (i205 & 21) + (i205 | 21);
                asInterface = i222 % 128;
                if (i222 % 2 != 0) {
                    int i223 = -(i220 >> i221);
                    int i224 = (i2 & i223) + (i223 | i2);
                    int i225 = (i224 >>> 117) ^ i224;
                    int i226 = ((i225 | 13) << 1) - (i225 ^ 13);
                    int i227 = (i225 | i226) & (~(i225 & i226));
                    int i228 = i227 / 4;
                    ((int[]) objArr33[0])[0] = (i227 | i228) & (~(i227 & i228));
                    return objArr33;
                }
                int i229 = (i2 - (~((i220 - (~i221)) - 1))) - 1;
                int i230 = i229 << 13;
                int i231 = (i230 & (~i229)) | ((~i230) & i229);
                int i232 = i231 >>> 17;
                int i233 = ((~i231) & i232) | ((~i232) & i231);
                int i234 = i233 << 5;
                ((int[]) objArr33[1])[0] = ((~i233) & i234) | ((~i234) & i233);
                return objArr33;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$c(int r6, short r7, short r8) {
                /*
                    int r8 = r8 * 3
                    int r0 = r8 + 1
                    int r6 = r6 * 4
                    int r6 = r6 + 4
                    int r7 = r7 + 67
                    byte[] r1 = defpackage.cleanUpSession.$$a
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L15
                    r7 = r6
                    r3 = r8
                    r4 = r2
                    goto L29
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r8) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L23:
                    r3 = r1[r6]
                    r5 = r7
                    r7 = r6
                    r6 = r3
                    r3 = r5
                L29:
                    int r6 = r6 + r3
                    int r7 = r7 + 1
                    r3 = r4
                    r5 = r7
                    r7 = r6
                    r6 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cleanUpSession.$$c(int, short, short):java.lang.String");
            }
        }));
        EditText editText = INotificationSideChannelStub().tilBirthDate.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: CustomTabsService
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    setSecondaryToolbarSwipeUpGesture.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            setsecondarytoolbarswipeupgesture.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            setsecondarytoolbarswipeupgesture.write();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            String transactionId = ((OcrKtpResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getTransactionId();
            if (transactionId != null) {
                ((PreferenceManager) setsecondarytoolbarswipeupgesture.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).saveString("OCR_TRANSACTION_ID", transactionId);
            }
            ResultOcr data = ((OcrKtpResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData();
            RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            if (data != null) {
                String nik = data.getNik();
                if (nik != null) {
                    if (nik.length() <= 0) {
                        nik = null;
                    }
                    if (nik != null) {
                        EditText editText = setsecondarytoolbarswipeupgesture.INotificationSideChannelStub().tilIdNumber.getEditText();
                        if (editText != null) {
                            editText.setText(nik);
                        }
                        setsecondarytoolbarswipeupgesture.cancel = nik;
                    }
                }
                String nama = data.getNama();
                if (nama != null) {
                    if (nama.length() <= 0) {
                        nama = null;
                    }
                    if (nama != null) {
                        EditText editText2 = setsecondarytoolbarswipeupgesture.INotificationSideChannelStub().tilFullName.getEditText();
                        if (editText2 != null) {
                            editText2.setText(nama);
                        }
                        setsecondarytoolbarswipeupgesture.INotificationSideChannel = nama;
                    }
                }
                String tglLahir = data.getTglLahir();
                if (tglLahir != null) {
                    if (tglLahir.length() <= 0) {
                        tglLahir = null;
                    }
                    if (tglLahir != null) {
                        EditText editText3 = setsecondarytoolbarswipeupgesture.INotificationSideChannelStub().tilBirthDate.getEditText();
                        if (editText3 != null) {
                            editText3.setText(tglLahir);
                        }
                        setsecondarytoolbarswipeupgesture.onTransact = tglLahir;
                        try {
                            Date date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).parse(tglLahir);
                            if (date != null) {
                                setsecondarytoolbarswipeupgesture.asBinder.setTime(date);
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
                        tempatLahir = null;
                    }
                    if (tempatLahir != null) {
                        setsecondarytoolbarswipeupgesture.cancelAll = tempatLahir;
                    }
                }
                String alamat = data.getAlamat();
                if (alamat != null) {
                    if (alamat.length() <= 0) {
                        alamat = null;
                    }
                    if (alamat != null) {
                        setsecondarytoolbarswipeupgesture.INotificationSideChannelDefault = alamat;
                    }
                }
            }
            File file = setsecondarytoolbarswipeupgesture.notify;
            if (file != null) {
                getUntrustedCreatorPackageName getuntrustedcreatorpackagename = (getUntrustedCreatorPackageName) setsecondarytoolbarswipeupgesture.TuitionPaymentFragmentbindingInflater1.getValue();
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) setsecondarytoolbarswipeupgesture.d.getValue();
                if (registeredMemberRegistration != null) {
                    getuntrustedcreatorpackagename = getuntrustedcreatorpackagename;
                    registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, file, null, null, null, 7864319);
                }
                getuntrustedcreatorpackagename.b.setValue(registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            setsecondarytoolbarswipeupgesture.write();
            Toast.makeText(setsecondarytoolbarswipeupgesture.requireContext(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        Citizenship citizenship;
        Citizenship citizenship2;
        Bundle arguments = getArguments();
        String strName = null;
        RegisteredMemberRegistration registeredMemberRegistration = arguments != null ? (RegisteredMemberRegistration) arguments.getParcelable("registration_data") : null;
        String string = getString(Intrinsics.areEqual((registeredMemberRegistration == null || (citizenship2 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) ? null : citizenship2.name(), "WNA") ? R.string.label_min_identity_number : R.string.error_field_nik);
        Intrinsics.checkNotNull(string);
        String string2 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        List listMutableListOf = CollectionsKt.mutableListOf(new accessconfigureInstanceInternal("^.{1,}$", string2), new r8lambda_rcqWHl69wN3lvwkykRzEOONbC0(new Function0() { // from class: newSessionWithExtras
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(setSecondaryToolbarSwipeUpGesture.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1));
            }
        }, string));
        RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) this.d.getValue();
        if (registeredMemberRegistration2 != null && (citizenship = registeredMemberRegistration2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != null) {
            strName = citizenship.name();
        }
        if (Intrinsics.areEqual(strName, "WNI")) {
            String string3 = getString(R.string.error_invalid_field);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            listMutableListOf.add(new accessconfigureInstanceInternal("^[0-9]{0,}$", string3));
        }
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilIdNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, listMutableListOf));
        TextInputLayout textInputLayout2 = INotificationSideChannelStub().tilFullName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string4 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string4))));
        TextInputLayout textInputLayout3 = INotificationSideChannelStub().tilJamsostekIdNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string5 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        String string6 = getString(R.string.error_field_kpj_max_length);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string5), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string6, 11, 11)})));
        TextInputLayout textInputLayout4 = INotificationSideChannelStub().tilBirthDate;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        String string7 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string7, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout4, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string7))));
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture) {
        LoginActivity.Companion companion = LoginActivity.INSTANCE;
        Context contextRequireContext = setsecondarytoolbarswipeupgesture.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, null, false, 6);
        FragmentActivity activity = setsecondarytoolbarswipeupgesture.getActivity();
        if (activity != null) {
            activity.finishAffinity();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            setsecondarytoolbarswipeupgesture.IconCompatParcelizer();
            str = "loading_registration_account_step_first_result";
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                FragmentSalariedWorkerPersonalDataBinding fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub = setsecondarytoolbarswipeupgesture.INotificationSideChannelStub();
                setsecondarytoolbarswipeupgesture.write();
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) setsecondarytoolbarswipeupgesture.d.getValue();
                if (registeredMemberRegistration != null) {
                    Context contextRequireContext = setsecondarytoolbarswipeupgesture.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    String string = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
                    Intrinsics.checkExpressionValueIsNotNull(string, "");
                    EditText editText = fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilJamsostekIdNumber.getEditText();
                    String string2 = StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString();
                    EditText editText2 = fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilBirthDate.getEditText();
                    String string3 = StringsKt.trim((CharSequence) String.valueOf(editText2 != null ? editText2.getText() : null)).toString();
                    EditText editText3 = fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                    String string4 = StringsKt.trim((CharSequence) String.valueOf(editText3 != null ? editText3.getText() : null)).toString();
                    EditText editText4 = fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilFullName.getEditText();
                    VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, string, null, null, null, MembershipType.PU, string2, StringsKt.trim((CharSequence) String.valueOf(editText4 != null ? editText4.getText() : null)).toString(), string4, null, null, null, null, string3, String.valueOf(((MembershipCheckItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum()), null, String.valueOf(((MembershipCheckItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getSignature()), null, null, null, null, null, null, null, 8343310);
                }
                ((getUntrustedCreatorPackageName) setsecondarytoolbarswipeupgesture.TuitionPaymentFragmentbindingInflater1.getValue()).b.setValue((RegisteredMemberRegistration) objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                ((getUntrustedCreatorPackageName) setsecondarytoolbarswipeupgesture.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                str = "success_registration_account_step_first_result";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                setsecondarytoolbarswipeupgesture.write();
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                String string5 = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
                String string6 = setsecondarytoolbarswipeupgesture.getString(R.string.error_data_membership_not_found);
                Intrinsics.checkNotNullExpressionValue(string6, "");
                if (StringsKt.contains$default((CharSequence) string5, (CharSequence) string6, false, 2, (Object) null)) {
                    getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                    String string7 = setsecondarytoolbarswipeupgesture.getString(R.string.title_data_membership_not_found);
                    Intrinsics.checkNotNullExpressionValue(string7, "");
                    String string8 = setsecondarytoolbarswipeupgesture.getString(R.string.message_membership_not_found);
                    Intrinsics.checkNotNullExpressionValue(string8, "");
                    String string9 = setsecondarytoolbarswipeupgesture.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string9, "");
                    getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_information, string7, string8, string9, new Function0() { // from class: setUrlBarHidingEnabled
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    }, 96);
                    FragmentManager childFragmentManager = setsecondarytoolbarswipeupgesture.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager, "");
                    if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else {
                    String string10 = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
                    String string11 = setsecondarytoolbarswipeupgesture.getString(R.string.error_data_membership_already_registered);
                    Intrinsics.checkNotNullExpressionValue(string11, "");
                    if (StringsKt.contains$default((CharSequence) string10, (CharSequence) string11, false, 2, (Object) null)) {
                        getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
                        String string12 = setsecondarytoolbarswipeupgesture.getString(R.string.tittle_already_registered);
                        Intrinsics.checkNotNullExpressionValue(string12, "");
                        String string13 = setsecondarytoolbarswipeupgesture.getString(R.string.message_already_registered);
                        Intrinsics.checkNotNullExpressionValue(string13, "");
                        String string14 = setsecondarytoolbarswipeupgesture.getString(R.string.action_ok);
                        Intrinsics.checkNotNullExpressionValue(string14, "");
                        getStringOrNull getstringornullB2 = getStringOrNull.Companion.b(R.drawable.ic_information, string12, string13, string14, new Function0() { // from class: setToolbarCornerRadiusDp
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        }, 96);
                        FragmentManager childFragmentManager2 = setsecondarytoolbarswipeupgesture.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                        Intrinsics.checkNotNullParameter(childFragmentManager2, "");
                        if (childFragmentManager2.findFragmentByTag(getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                            getstringornullB2.show(childFragmentManager2, getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    } else {
                        setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture2 = setsecondarytoolbarswipeupgesture;
                        String strValueOf = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        Intrinsics.checkNotNullParameter(setsecondarytoolbarswipeupgesture2, "");
                        Intrinsics.checkNotNullParameter(strValueOf, "");
                        BaseActivity baseActivity = (BaseActivity) setsecondarytoolbarswipeupgesture2.getContext();
                        if (baseActivity != null) {
                            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, null);
                        }
                    }
                }
                str = "failure_registration_account_step_first_result";
            } else {
                str = "";
            }
        }
        FragmentActivity activity = setsecondarytoolbarswipeupgesture.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_register_account", str));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture, View view) {
        String str;
        Citizenship citizenship;
        Citizenship citizenship2;
        Citizenship citizenship3;
        String str2;
        Citizenship citizenship4;
        Citizenship citizenship5;
        Citizenship citizenship6;
        Citizenship citizenship7;
        Citizenship citizenship8;
        Citizenship citizenship9;
        Intrinsics.checkNotNullParameter(view, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, setsecondarytoolbarswipeupgesture.requireContext());
        setsecondarytoolbarswipeupgesture.INotificationSideChannelStub().salariedWorkerPersonalDataContainer.requestFocus();
        if (setsecondarytoolbarswipeupgesture.notify == null) {
            RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) setsecondarytoolbarswipeupgesture.d.getValue();
            if (Intrinsics.areEqual((registeredMemberRegistration == null || (citizenship9 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) ? null : citizenship9.name(), "WNI")) {
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                String string = setsecondarytoolbarswipeupgesture.getString(R.string.error_field_required);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = setsecondarytoolbarswipeupgesture.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string, "Anda wajib mengambil foto KTP terlebih dahulu", string2, new Function0() { // from class: CustomTabsIntentColorScheme
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                }, 96);
                FragmentManager childFragmentManager = setsecondarytoolbarswipeupgesture.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                Intrinsics.checkNotNullParameter(childFragmentManager, "");
                if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
                return Unit.INSTANCE;
            }
        }
        RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) setsecondarytoolbarswipeupgesture.d.getValue();
        if (Intrinsics.areEqual((registeredMemberRegistration2 == null || (citizenship8 = registeredMemberRegistration2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) ? null : citizenship8.name(), "WNI") && ((PreferenceManager) setsecondarytoolbarswipeupgesture.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).getString("OCR_TRANSACTION_ID", "").length() == 0) {
            String string3 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "");
            ((PreferenceManager) setsecondarytoolbarswipeupgesture.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).saveString("OCR_TRANSACTION_ID", string3);
        }
        RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) setsecondarytoolbarswipeupgesture.d.getValue();
        String upperCase = "-";
        if (Intrinsics.areEqual((registeredMemberRegistration3 == null || (citizenship7 = registeredMemberRegistration3.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) ? null : citizenship7.name(), "WNI")) {
            setSplitTrack setsplittrack = (setSplitTrack) setsecondarytoolbarswipeupgesture.b.getValue();
            String string4 = ((PreferenceManager) setsecondarytoolbarswipeupgesture.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).getString("OCR_TRANSACTION_ID", "");
            Context contextRequireContext = setsecondarytoolbarswipeupgesture.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            String string5 = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
            Intrinsics.checkExpressionValueIsNotNull(string5, "");
            EditText editText = setsecondarytoolbarswipeupgesture.INotificationSideChannelStub().tilBirthDate.getEditText();
            String string6 = StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString();
            RegisteredMemberRegistration registeredMemberRegistration4 = (RegisteredMemberRegistration) setsecondarytoolbarswipeupgesture.d.getValue();
            if (Intrinsics.areEqual((registeredMemberRegistration4 == null || (citizenship6 = registeredMemberRegistration4.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) ? null : citizenship6.name(), "WNI")) {
                EditText editText2 = setsecondarytoolbarswipeupgesture.INotificationSideChannelStub().tilIdNumber.getEditText();
                upperCase = StringsKt.trim((CharSequence) String.valueOf(editText2 != null ? editText2.getText() : null)).toString().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
            }
            String str3 = upperCase;
            EditText editText3 = setsecondarytoolbarswipeupgesture.INotificationSideChannelStub().tilJamsostekIdNumber.getEditText();
            String string7 = StringsKt.trim((CharSequence) String.valueOf(editText3 != null ? editText3.getText() : null)).toString();
            RegisteredMemberRegistration registeredMemberRegistration5 = (RegisteredMemberRegistration) setsecondarytoolbarswipeupgesture.d.getValue();
            String strName = (registeredMemberRegistration5 == null || (citizenship5 = registeredMemberRegistration5.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) ? null : citizenship5.name();
            EditText editText4 = setsecondarytoolbarswipeupgesture.INotificationSideChannelStub().tilFullName.getEditText();
            String string8 = StringsKt.trim((CharSequence) String.valueOf(editText4 != null ? editText4.getText() : null)).toString();
            RegisteredMemberRegistration registeredMemberRegistration6 = (RegisteredMemberRegistration) setsecondarytoolbarswipeupgesture.d.getValue();
            if (Intrinsics.areEqual((registeredMemberRegistration6 == null || (citizenship4 = registeredMemberRegistration6.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) ? null : citizenship4.name(), "WNA")) {
                EditText editText5 = setsecondarytoolbarswipeupgesture.INotificationSideChannelStub().tilIdNumber.getEditText();
                String upperCase2 = StringsKt.trim((CharSequence) String.valueOf(editText5 != null ? editText5.getText() : null)).toString().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                str2 = upperCase2;
            } else {
                str2 = "";
            }
            setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string4, new MembershipCheckRequest(string5, strName, "PU", string7, string8, str3, str2, string6));
        } else {
            setSplitTrack setsplittrack2 = (setSplitTrack) setsecondarytoolbarswipeupgesture.b.getValue();
            Context contextRequireContext2 = setsecondarytoolbarswipeupgesture.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            String string9 = Settings.Secure.getString(contextRequireContext2.getContentResolver(), "android_id");
            Intrinsics.checkExpressionValueIsNotNull(string9, "");
            EditText editText6 = setsecondarytoolbarswipeupgesture.INotificationSideChannelStub().tilBirthDate.getEditText();
            String string10 = StringsKt.trim((CharSequence) String.valueOf(editText6 != null ? editText6.getText() : null)).toString();
            RegisteredMemberRegistration registeredMemberRegistration7 = (RegisteredMemberRegistration) setsecondarytoolbarswipeupgesture.d.getValue();
            if (Intrinsics.areEqual((registeredMemberRegistration7 == null || (citizenship3 = registeredMemberRegistration7.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) ? null : citizenship3.name(), "WNI")) {
                EditText editText7 = setsecondarytoolbarswipeupgesture.INotificationSideChannelStub().tilIdNumber.getEditText();
                upperCase = StringsKt.trim((CharSequence) String.valueOf(editText7 != null ? editText7.getText() : null)).toString().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
            }
            String str4 = upperCase;
            EditText editText8 = setsecondarytoolbarswipeupgesture.INotificationSideChannelStub().tilJamsostekIdNumber.getEditText();
            String string11 = StringsKt.trim((CharSequence) String.valueOf(editText8 != null ? editText8.getText() : null)).toString();
            RegisteredMemberRegistration registeredMemberRegistration8 = (RegisteredMemberRegistration) setsecondarytoolbarswipeupgesture.d.getValue();
            String strName2 = (registeredMemberRegistration8 == null || (citizenship2 = registeredMemberRegistration8.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) ? null : citizenship2.name();
            EditText editText9 = setsecondarytoolbarswipeupgesture.INotificationSideChannelStub().tilFullName.getEditText();
            String string12 = StringsKt.trim((CharSequence) String.valueOf(editText9 != null ? editText9.getText() : null)).toString();
            RegisteredMemberRegistration registeredMemberRegistration9 = (RegisteredMemberRegistration) setsecondarytoolbarswipeupgesture.d.getValue();
            if (Intrinsics.areEqual((registeredMemberRegistration9 == null || (citizenship = registeredMemberRegistration9.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) ? null : citizenship.name(), "WNA")) {
                EditText editText10 = setsecondarytoolbarswipeupgesture.INotificationSideChannelStub().tilIdNumber.getEditText();
                String upperCase3 = StringsKt.trim((CharSequence) String.valueOf(editText10 != null ? editText10.getText() : null)).toString().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase3, "");
                str = upperCase3;
            } else {
                str = "";
            }
            setsplittrack2.b(new MembershipCheckRequest(string9, strName2, "PU", string11, string12, str4, str, string10));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture, FragmentSalariedWorkerPersonalDataBinding fragmentSalariedWorkerPersonalDataBinding) {
        String string = ((PreferenceManager) setsecondarytoolbarswipeupgesture.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).getString("OCR_TRANSACTION_ID", "");
        getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist = (getStreamUseCaseSupportedCombinationList) setsecondarytoolbarswipeupgesture.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        EditText editText = fragmentSalariedWorkerPersonalDataBinding.tilIdNumber.getEditText();
        getstreamusecasesupportedcombinationlist.TuitionPaymentFragmentbindingInflater1(string, StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: mayLaunchUrl
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    setSecondaryToolbarSwipeUpGesture.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, i, i2, i3);
                }
            }, setsecondarytoolbarswipeupgesture.asBinder.get(1), setsecondarytoolbarswipeupgesture.asBinder.get(2), setsecondarytoolbarswipeupgesture.asBinder.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture) {
        Citizenship citizenship;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) setsecondarytoolbarswipeupgesture.d.getValue();
        if (Intrinsics.areEqual((registeredMemberRegistration == null || (citizenship = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) ? null : citizenship.name(), "WNI")) {
            EditText editText = setsecondarytoolbarswipeupgesture.INotificationSideChannelStub().tilIdNumber.getEditText();
            return String.valueOf(editText != null ? editText.getText() : null).length() == 16;
        }
        EditText editText2 = setsecondarytoolbarswipeupgesture.INotificationSideChannelStub().tilIdNumber.getEditText();
        int length = String.valueOf(editText2 != null ? editText2.getText() : null).length();
        return 6 <= length && length < 21;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1) {
            setsecondarytoolbarswipeupgesture.a = true;
            ActivityResultLauncher<Intent> activityResultLauncher = setsecondarytoolbarswipeupgesture.MediaBrowserCompat;
            KtpCameraActivity.Companion companion = KtpCameraActivity.INSTANCE;
            Context contextRequireContext = setsecondarytoolbarswipeupgesture.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            activityResultLauncher.launch(KtpCameraActivity.Companion.TuitionPaymentFragmentbindingInflater1(contextRequireContext));
        }
    }

    public static /* synthetic */ Unit b(setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (setsecondarytoolbarswipeupgesture.a) {
            ActivityResultLauncher<Intent> activityResultLauncher = setsecondarytoolbarswipeupgesture.MediaBrowserCompat;
            KtpCameraActivity.Companion companion = KtpCameraActivity.INSTANCE;
            Context contextRequireContext = setsecondarytoolbarswipeupgesture.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            activityResultLauncher.launch(KtpCameraActivity.Companion.TuitionPaymentFragmentbindingInflater1(contextRequireContext));
        } else {
            ActivityResultLauncher<Intent> activityResultLauncher2 = setsecondarytoolbarswipeupgesture.IconCompatParcelizer;
            KtpGuidanceActivity.Companion companion2 = KtpGuidanceActivity.INSTANCE;
            Context contextRequireContext2 = setsecondarytoolbarswipeupgesture.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            activityResultLauncher2.launch(companion2.TuitionPaymentFragmentbindingInflater1(contextRequireContext2));
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        ((setSplitTrack) this.b.getValue()).INotificationSideChannelStubProxy.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: updateVisuals
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSecondaryToolbarSwipeUpGesture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) this.b.getValue()).TuitionPaymentFragmentbindingInflater1.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: CustomTabsService1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSecondaryToolbarSwipeUpGesture.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) this.b.getValue()).d.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: lambdanewSessionInternal0androidxbrowsercustomtabsCustomTabsService1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSecondaryToolbarSwipeUpGesture.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((getStreamUseCaseSupportedCombinationList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(this, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: CustomTabsService1ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSecondaryToolbarSwipeUpGesture.b(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
    }

    private final void b(boolean p0) {
        Citizenship citizenship;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) this.d.getValue();
        if (!Intrinsics.areEqual((registeredMemberRegistration == null || (citizenship = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) ? null : citizenship.name(), "WNI")) {
            p0 = true;
        }
        FragmentSalariedWorkerPersonalDataBinding fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub = INotificationSideChannelStub();
        fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilFullName.setEnabled(p0);
        fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilIdNumber.setEnabled(p0);
        fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilBirthDate.setEnabled(p0);
        EditText editText = fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilFullName.getEditText();
        if (editText != null) {
            editText.setEnabled(p0);
        }
        EditText editText2 = fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilIdNumber.getEditText();
        if (editText2 != null) {
            editText2.setEnabled(p0);
        }
        EditText editText3 = fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilBirthDate.getEditText();
        if (editText3 != null) {
            editText3.setEnabled(p0);
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1) {
            Intent data = activityResult.getData();
            String stringExtra = data != null ? data.getStringExtra("extra_photo_path") : null;
            if (stringExtra != null) {
                File file = new File(stringExtra);
                if (file.exists()) {
                    setsecondarytoolbarswipeupgesture.notify = file;
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(stringExtra);
                    setsecondarytoolbarswipeupgesture.INotificationSideChannelStub().imgKtpPhoto.setImageBitmap(bitmapDecodeFile);
                    setsecondarytoolbarswipeupgesture.INotificationSideChannelStub().imgKtpPhoto.setVisibility(0);
                    setsecondarytoolbarswipeupgesture.INotificationSideChannelStub().clKtpPlaceholder.setVisibility(8);
                    setsecondarytoolbarswipeupgesture.b(true);
                    Intrinsics.checkNotNull(bitmapDecodeFile);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                    String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                    Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
                    ((setSplitTrack) setsecondarytoolbarswipeupgesture.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(new OcrKtpRequest(UUID.randomUUID().toString(), strEncodeToString));
                }
            }
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture, int i, int i2, int i3) {
        setsecondarytoolbarswipeupgesture.asBinder.set(1, i);
        setsecondarytoolbarswipeupgesture.asBinder.set(2, i2);
        setsecondarytoolbarswipeupgesture.asBinder.set(5, i3);
        setsecondarytoolbarswipeupgesture.INotificationSideChannelStub().edtBirthDate.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(setsecondarytoolbarswipeupgesture.asBinder.getTime()));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(final setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            setsecondarytoolbarswipeupgesture.IconCompatParcelizer();
            str = "loading_registration_account_step_first_result";
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                final FragmentSalariedWorkerPersonalDataBinding fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub = setsecondarytoolbarswipeupgesture.INotificationSideChannelStub();
                setsecondarytoolbarswipeupgesture.write();
                VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                String str2 = ((MembershipCheckNew) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1;
                if (str2 == null) {
                    str2 = null;
                } else if (str2 == null) {
                    str2 = "";
                }
                setsecondarytoolbarswipeupgesture.connect = str2;
                if (Intrinsics.areEqual(str2, "900")) {
                    RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) setsecondarytoolbarswipeupgesture.d.getValue();
                    if (registeredMemberRegistration != null) {
                        Context contextRequireContext = setsecondarytoolbarswipeupgesture.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                        String string = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
                        Intrinsics.checkExpressionValueIsNotNull(string, "");
                        EditText editText = fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilJamsostekIdNumber.getEditText();
                        String string2 = StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString();
                        EditText editText2 = fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilBirthDate.getEditText();
                        String string3 = StringsKt.trim((CharSequence) String.valueOf(editText2 != null ? editText2.getText() : null)).toString();
                        EditText editText3 = fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                        String string4 = StringsKt.trim((CharSequence) String.valueOf(editText3 != null ? editText3.getText() : null)).toString();
                        EditText editText4 = fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilFullName.getEditText();
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, string, null, null, null, MembershipType.PU, string2, StringsKt.trim((CharSequence) String.valueOf(editText4 != null ? editText4.getText() : null)).toString(), string4, null, null, null, null, string3, String.valueOf(((MembershipCheckNew) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), String.valueOf(((MembershipCheckNew) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), String.valueOf(((MembershipCheckNew) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b), null, null, null, setsecondarytoolbarswipeupgesture.notify, null, setsecondarytoolbarswipeupgesture.cancelAll, setsecondarytoolbarswipeupgesture.INotificationSideChannelDefault, 1511182);
                    }
                    ((getUntrustedCreatorPackageName) setsecondarytoolbarswipeupgesture.TuitionPaymentFragmentbindingInflater1.getValue()).b.setValue((RegisteredMemberRegistration) objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    ((getUntrustedCreatorPackageName) setsecondarytoolbarswipeupgesture.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                } else if (Intrinsics.areEqual(setsecondarytoolbarswipeupgesture.connect, "901")) {
                    RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) setsecondarytoolbarswipeupgesture.d.getValue();
                    if (registeredMemberRegistration2 != null) {
                        Context contextRequireContext2 = setsecondarytoolbarswipeupgesture.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                        String string5 = Settings.Secure.getString(contextRequireContext2.getContentResolver(), "android_id");
                        Intrinsics.checkExpressionValueIsNotNull(string5, "");
                        EditText editText5 = fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilJamsostekIdNumber.getEditText();
                        String string6 = StringsKt.trim((CharSequence) String.valueOf(editText5 != null ? editText5.getText() : null)).toString();
                        EditText editText6 = fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilBirthDate.getEditText();
                        String string7 = StringsKt.trim((CharSequence) String.valueOf(editText6 != null ? editText6.getText() : null)).toString();
                        EditText editText7 = fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                        String string8 = StringsKt.trim((CharSequence) String.valueOf(editText7 != null ? editText7.getText() : null)).toString();
                        EditText editText8 = fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilFullName.getEditText();
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration2, string5, null, null, null, MembershipType.PU, string6, StringsKt.trim((CharSequence) String.valueOf(editText8 != null ? editText8.getText() : null)).toString(), string8, null, null, null, null, string7, String.valueOf(((MembershipCheckNew) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), String.valueOf(((MembershipCheckNew) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), String.valueOf(((MembershipCheckNew) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b), null, null, null, setsecondarytoolbarswipeupgesture.notify, null, setsecondarytoolbarswipeupgesture.cancelAll, setsecondarytoolbarswipeupgesture.INotificationSideChannelDefault, 1511182);
                    }
                    ((getUntrustedCreatorPackageName) setsecondarytoolbarswipeupgesture.TuitionPaymentFragmentbindingInflater1.getValue()).b.setValue((RegisteredMemberRegistration) objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    ((getUntrustedCreatorPackageName) setsecondarytoolbarswipeupgesture.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                } else if (Intrinsics.areEqual(setsecondarytoolbarswipeupgesture.connect, "902")) {
                    OutputConfigurationCompatApi33Impl.Companion companion = OutputConfigurationCompatApi33Impl.INSTANCE;
                    String string9 = setsecondarytoolbarswipeupgesture.getString(R.string.label_title_validation_account_dialog);
                    Intrinsics.checkNotNullExpressionValue(string9, "");
                    String string10 = setsecondarytoolbarswipeupgesture.getString(R.string.label_message_validation_account_dialog);
                    Intrinsics.checkNotNullExpressionValue(string10, "");
                    String string11 = setsecondarytoolbarswipeupgesture.getString(R.string.action_booking_antrean_online);
                    Intrinsics.checkNotNullExpressionValue(string11, "");
                    OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.notfound, string9, string10, string11, (128 & 16) != 0 ? null : new Function0() { // from class: CustomTabsIntentCloseButtonPosition
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return setSecondaryToolbarSwipeUpGesture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub);
                        }
                    }, (128 & 32) != 0 ? null : setsecondarytoolbarswipeupgesture.getString(R.string.action_halaman_awal), (128 & 64) != 0 ? null : new Function0() { // from class: receiveFile
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return setSecondaryToolbarSwipeUpGesture.b(this.TuitionPaymentFragmentbindingInflater1);
                        }
                    }, (128 & 128) != 0 ? false : false);
                    FragmentManager childFragmentManager = setsecondarytoolbarswipeupgesture.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager, "");
                    if (childFragmentManager.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        outputConfigurationCompatApi33ImplB.show(childFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else if (Intrinsics.areEqual(setsecondarytoolbarswipeupgesture.connect, "903")) {
                    OutputConfigurationCompatApi33Impl.Companion companion2 = OutputConfigurationCompatApi33Impl.INSTANCE;
                    String string12 = setsecondarytoolbarswipeupgesture.getString(R.string.label_verification_added);
                    Intrinsics.checkNotNullExpressionValue(string12, "");
                    String string13 = setsecondarytoolbarswipeupgesture.getString(R.string.label_message_verification_added);
                    Intrinsics.checkNotNullExpressionValue(string13, "");
                    String string14 = setsecondarytoolbarswipeupgesture.getString(R.string.action_view_schedule);
                    Intrinsics.checkNotNullExpressionValue(string14, "");
                    OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB2 = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.notfound, string12, string13, string14, (128 & 16) != 0 ? null : new Function0() { // from class: postMessage
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return setSecondaryToolbarSwipeUpGesture.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, fragmentSalariedWorkerPersonalDataBindingINotificationSideChannelStub);
                        }
                    }, (128 & 32) != 0 ? null : setsecondarytoolbarswipeupgesture.getString(R.string.action_halaman_awal), (128 & 64) != 0 ? null : new Function0() { // from class: isEngagementSignalsApiAvailable
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return setSecondaryToolbarSwipeUpGesture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        }
                    }, (128 & 128) != 0 ? false : false);
                    FragmentManager childFragmentManager2 = setsecondarytoolbarswipeupgesture.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager2, "");
                    if (childFragmentManager2.findFragmentByTag(outputConfigurationCompatApi33ImplB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        outputConfigurationCompatApi33ImplB2.show(childFragmentManager2, outputConfigurationCompatApi33ImplB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else {
                    getStringOrNull.Companion companion3 = getStringOrNull.INSTANCE;
                    String string15 = setsecondarytoolbarswipeupgesture.getString(R.string.title_data_membership_not_found);
                    Intrinsics.checkNotNullExpressionValue(string15, "");
                    String string16 = setsecondarytoolbarswipeupgesture.getString(R.string.message_membership_not_found);
                    Intrinsics.checkNotNullExpressionValue(string16, "");
                    String string17 = setsecondarytoolbarswipeupgesture.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string17, "");
                    getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_information, string15, string16, string17, new Function0() { // from class: requestPostMessageChannel
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    }, 96);
                    FragmentManager childFragmentManager3 = setsecondarytoolbarswipeupgesture.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager3, "");
                    if (childFragmentManager3.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB.show(childFragmentManager3, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
                str = "success_registration_account_step_first_result";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                setsecondarytoolbarswipeupgesture.write();
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                String string18 = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
                String string19 = setsecondarytoolbarswipeupgesture.getString(R.string.error_data_membership_not_found);
                Intrinsics.checkNotNullExpressionValue(string19, "");
                if (StringsKt.contains$default((CharSequence) string18, (CharSequence) string19, false, 2, (Object) null)) {
                    getStringOrNull.Companion companion4 = getStringOrNull.INSTANCE;
                    String string20 = setsecondarytoolbarswipeupgesture.getString(R.string.title_data_membership_not_found);
                    Intrinsics.checkNotNullExpressionValue(string20, "");
                    String string21 = setsecondarytoolbarswipeupgesture.getString(R.string.message_membership_not_found);
                    Intrinsics.checkNotNullExpressionValue(string21, "");
                    String string22 = setsecondarytoolbarswipeupgesture.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string22, "");
                    getStringOrNull getstringornullB2 = getStringOrNull.Companion.b(R.drawable.ic_information, string20, string21, string22, new Function0() { // from class: validateRelationship
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    }, 96);
                    FragmentManager childFragmentManager4 = setsecondarytoolbarswipeupgesture.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager4, "");
                    if (childFragmentManager4.findFragmentByTag(getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB2.show(childFragmentManager4, getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else {
                    String string23 = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
                    String string24 = setsecondarytoolbarswipeupgesture.getString(R.string.error_data_membership_already_registered);
                    Intrinsics.checkNotNullExpressionValue(string24, "");
                    if (StringsKt.contains$default((CharSequence) string23, (CharSequence) string24, false, 2, (Object) null)) {
                        getStringOrNull.Companion companion5 = getStringOrNull.INSTANCE;
                        String string25 = setsecondarytoolbarswipeupgesture.getString(R.string.tittle_already_registered);
                        Intrinsics.checkNotNullExpressionValue(string25, "");
                        String string26 = setsecondarytoolbarswipeupgesture.getString(R.string.message_already_registered);
                        Intrinsics.checkNotNullExpressionValue(string26, "");
                        String string27 = setsecondarytoolbarswipeupgesture.getString(R.string.action_ok);
                        Intrinsics.checkNotNullExpressionValue(string27, "");
                        getStringOrNull getstringornullB3 = getStringOrNull.Companion.b(R.drawable.ic_information, string25, string26, string27, new Function0() { // from class: setStartAnimations
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        }, 96);
                        FragmentManager childFragmentManager5 = setsecondarytoolbarswipeupgesture.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager5, "");
                        Intrinsics.checkNotNullParameter(childFragmentManager5, "");
                        if (childFragmentManager5.findFragmentByTag(getstringornullB3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                            getstringornullB3.show(childFragmentManager5, getstringornullB3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    } else {
                        setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture2 = setsecondarytoolbarswipeupgesture;
                        String strValueOf = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        Intrinsics.checkNotNullParameter(setsecondarytoolbarswipeupgesture2, "");
                        Intrinsics.checkNotNullParameter(strValueOf, "");
                        BaseActivity baseActivity = (BaseActivity) setsecondarytoolbarswipeupgesture2.getContext();
                        if (baseActivity != null) {
                            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, null);
                        }
                    }
                }
                str = "failure_registration_account_step_first_result";
            } else {
                str = "";
            }
        }
        FragmentActivity activity = setsecondarytoolbarswipeupgesture.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_register_account", str));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture) {
        LoginActivity.Companion companion = LoginActivity.INSTANCE;
        Context contextRequireContext = setsecondarytoolbarswipeupgesture.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, null, false, 6);
        FragmentActivity activity = setsecondarytoolbarswipeupgesture.getActivity();
        if (activity != null) {
            activity.finishAffinity();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture, FragmentSalariedWorkerPersonalDataBinding fragmentSalariedWorkerPersonalDataBinding) {
        BookingAntreanFormActivity.Companion companion = BookingAntreanFormActivity.INSTANCE;
        Context contextRequireContext = setsecondarytoolbarswipeupgesture.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        EditText editText = fragmentSalariedWorkerPersonalDataBinding.tilIdNumber.getEditText();
        String string = StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString();
        EditText editText2 = fragmentSalariedWorkerPersonalDataBinding.tilFullName.getEditText();
        String string2 = StringsKt.trim((CharSequence) String.valueOf(editText2 != null ? editText2.getText() : null)).toString();
        EditText editText3 = fragmentSalariedWorkerPersonalDataBinding.tilBirthDate.getEditText();
        BookingAntreanFormActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, string, string2, StringsKt.trim((CharSequence) String.valueOf(editText3 != null ? editText3.getText() : null)).toString(), setsecondarytoolbarswipeupgesture.cancelAll, setsecondarytoolbarswipeupgesture.INotificationSideChannelDefault, setsecondarytoolbarswipeupgesture.INotificationSideChannelStub, setsecondarytoolbarswipeupgesture.RemoteActionCompatParcelizer, "REG", "PU", ((PreferenceManager) setsecondarytoolbarswipeupgesture.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).getString("OCR_TRANSACTION_ID", ""));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                setsecondarytoolbarswipeupgesture.write();
                GetDataAntrianResponse getDataAntrianResponse = (GetDataAntrianResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                AntrianData data = getDataAntrianResponse.getData();
                if (Intrinsics.areEqual(getDataAntrianResponse.isSuccessful(), Boolean.TRUE) && data != null) {
                    BookingAntreanSuccessActivity.Companion companion = BookingAntreanSuccessActivity.INSTANCE;
                    Context contextRequireContext = setsecondarytoolbarswipeupgesture.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    String nomorIdentitas = data.getNomorIdentitas();
                    String str = nomorIdentitas == null ? "" : nomorIdentitas;
                    String nama = data.getNama();
                    String str2 = nama == null ? "" : nama;
                    String handphone = data.getHandphone();
                    String str3 = handphone == null ? "" : handphone;
                    String email = data.getEmail();
                    String str4 = email == null ? "" : email;
                    String kodePengajuan = data.getKodePengajuan();
                    String str5 = kodePengajuan == null ? "" : kodePengajuan;
                    String layanan = data.getLayanan();
                    String str6 = layanan == null ? "" : layanan;
                    String layanan2 = data.getLayanan();
                    String str7 = layanan2 == null ? "" : layanan2;
                    String namaKantorCabang = data.getNamaKantorCabang();
                    String str8 = (namaKantorCabang == null && (namaKantorCabang = data.getKantorCabang()) == null) ? "" : namaKantorCabang;
                    String alamatKantor = data.getAlamatKantor();
                    String str9 = alamatKantor == null ? "" : alamatKantor;
                    String tanggalBooking = data.getTanggalBooking();
                    String str10 = tanggalBooking == null ? "" : tanggalBooking;
                    String tanggalBooking2 = data.getTanggalBooking();
                    String str11 = tanggalBooking2 == null ? "" : tanggalBooking2;
                    String namaShift = data.getNamaShift();
                    String str12 = namaShift == null ? "" : namaShift;
                    String qrCode = getDataAntrianResponse.getQrCode();
                    String str13 = qrCode == null ? "" : qrCode;
                    String str14 = setsecondarytoolbarswipeupgesture.connect;
                    Intrinsics.checkNotNull(str14);
                    BookingAntreanSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, "", "", str13, str14);
                } else {
                    setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture2 = setsecondarytoolbarswipeupgesture;
                    String message = getDataAntrianResponse.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    Intrinsics.checkNotNullParameter(setsecondarytoolbarswipeupgesture2, "");
                    Intrinsics.checkNotNullParameter(message, "");
                    BaseActivity baseActivity = (BaseActivity) setsecondarytoolbarswipeupgesture2.getContext();
                    if (baseActivity != null) {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, message, null);
                    }
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                setsecondarytoolbarswipeupgesture.write();
                setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture3 = setsecondarytoolbarswipeupgesture;
                String str15 = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str15 == null) {
                    str15 = "";
                }
                Intrinsics.checkNotNullParameter(setsecondarytoolbarswipeupgesture3, "");
                Intrinsics.checkNotNullParameter(str15, "");
                BaseActivity baseActivity2 = (BaseActivity) setsecondarytoolbarswipeupgesture3.getContext();
                if (baseActivity2 != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity2, str15, null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture, UserLocationComplete userLocationComplete) throws IOException {
        String str;
        String str2;
        String str3;
        String str4 = "";
        Intrinsics.checkNotNullParameter(userLocationComplete, "");
        setsecondarytoolbarswipeupgesture.INotificationSideChannelStub = String.valueOf(userLocationComplete.b);
        setsecondarytoolbarswipeupgesture.RemoteActionCompatParcelizer = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        LocationAddressInfo locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo == null || (str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) {
            str = "";
        }
        setsecondarytoolbarswipeupgesture.INotificationSideChannelStubProxy = str;
        setsecondarytoolbarswipeupgesture.getInterfaceDescriptor = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        LocationAddressInfo locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 == null || (str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            str2 = "";
        }
        setsecondarytoolbarswipeupgesture.write = str2;
        LocationAddressInfo locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 != null && (str3 = locationAddressInfo3.d) != null) {
            str4 = str3;
        }
        setsecondarytoolbarswipeupgesture.read = str4;
        String str5 = setsecondarytoolbarswipeupgesture.INotificationSideChannelStub;
        String str6 = setsecondarytoolbarswipeupgesture.RemoteActionCompatParcelizer;
        String str7 = setsecondarytoolbarswipeupgesture.INotificationSideChannelStubProxy;
        String str8 = setsecondarytoolbarswipeupgesture.getInterfaceDescriptor;
        String str9 = setsecondarytoolbarswipeupgesture.write;
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

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(setSecondaryToolbarSwipeUpGesture setsecondarytoolbarswipeupgesture) throws IOException {
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Camera2CameraControlExternalSyntheticLambda4 camera2CameraControlExternalSyntheticLambda4B = ExperimentalCamera2Interop.b((PreferenceManager) setsecondarytoolbarswipeupgesture.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
        if (camera2CameraControlExternalSyntheticLambda4B != null && camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            setsecondarytoolbarswipeupgesture.INotificationSideChannelStub = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
            setsecondarytoolbarswipeupgesture.RemoteActionCompatParcelizer = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            setsecondarytoolbarswipeupgesture.INotificationSideChannelStubProxy = camera2CameraControlExternalSyntheticLambda4B.b;
            setsecondarytoolbarswipeupgesture.getInterfaceDescriptor = camera2CameraControlExternalSyntheticLambda4B.g;
            setsecondarytoolbarswipeupgesture.write = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            setsecondarytoolbarswipeupgesture.read = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str = setsecondarytoolbarswipeupgesture.INotificationSideChannelStub;
            String str2 = setsecondarytoolbarswipeupgesture.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("Location from cache: ");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
        } else {
            setsecondarytoolbarswipeupgesture.INotificationSideChannelStub = "0.0";
            setsecondarytoolbarswipeupgesture.RemoteActionCompatParcelizer = "0.0";
            ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
        }
        return Unit.INSTANCE;
    }
}
