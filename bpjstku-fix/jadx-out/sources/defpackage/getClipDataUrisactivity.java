package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import com.appsflyer.internal.AFg1xSDK;
import com.bpjstku.R;
import com.bpjstku.data.menu.model.response.AvailabilityMenuItem;
import com.bpjstku.data.point.model.request.PointRequest;
import com.bpjstku.data.point.model.response.PointResponse;
import com.bpjstku.data.user.model.request.UserRequest;
import com.bpjstku.databinding.FragmentAccountBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.account.AccountFragment$bindingInflater$1;
import com.bpjstku.presentation.account.setting.EditProfileActivity;
import com.bpjstku.presentation.account.setting.NonactiveAutodebetActivity;
import com.bpjstku.presentation.digitalcard.DigitalCardActivity;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.point.PointWebViewActivity;
import com.bpjstku.presentation.program.model.ProgramInfo;
import com.bpjstku.presentation.util.WebviewFaqCustomActivity;
import com.bpjstku.util.custom.CircleImageView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.firebase.FirebaseException;
import com.nbs.nucleo.utils.exception.ApiException;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.access000;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setCaptureRequestOption;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004R\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0011\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0014\u001a\u00020\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0015\u0010\f\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR.\u0010\u0013\u001a\u001c\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u001c8\u0015X\u0095D¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"LgetClipDataUrisactivity;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentAccountBinding;", "<init>", "()V", "", "g", "cancelAll", "INotificationSideChannel", "cancel", "onTransact", "onResume", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LsetCurrentRunnable;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Lazy;", "Laccess000;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentbindingInflater1", "b", "LsetCaptureRequestOption;", "d", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;", "", "I", "asBinder", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getClipDataUrisactivity extends AutoValue_CameraState_StateError<FragmentAccountBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy b;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: isSystemPickerAvailableactivity
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((access000) this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final int asBinder = R.layout.fragment_account;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.invoke(obj);
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    public getClipDataUrisactivity() {
        final getClipDataUrisactivity getclipdataurisactivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<access000>() { // from class: com.bpjstku.presentation.account.AccountFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [access000, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final access000 invoke() {
                ComponentCallbacks componentCallbacks = getclipdataurisactivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(access000.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.b = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.account.AccountFragment$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = getclipdataurisactivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final getClipDataUrisactivity getclipdataurisactivity2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<setCaptureRequestOption>() { // from class: com.bpjstku.presentation.account.AccountFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setCaptureRequestOption] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setCaptureRequestOption invoke() {
                LifecycleOwner lifecycleOwner = getclipdataurisactivity2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(setCaptureRequestOption.class);
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

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentAccountBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return AccountFragment$bindingInflater$1.b;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getCancel() {
        return this.asBinder;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        TextView textView = asInterface().tvNonactiveAutodebet;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textView, new Function0() { // from class: ActivityResultContractsGetMultipleContentsCompanion
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return getClipDataUrisactivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        });
        TextView textView2 = asInterface().tvEditProfile;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        TextView textView3 = textView2;
        Function1 function1 = new Function1() { // from class: setSupportedHdrTypesactivity
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getClipDataUrisactivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(textView3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        textView3.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        asInterface().tvLogout.setOnClickListener(new View.OnClickListener() { // from class: ActivityResultContractsPickVisualMedia
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getClipDataUrisactivity.asInterface(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
        asInterface().tvDigitalCard.setOnClickListener(new View.OnClickListener() { // from class: ActivityResultContractsPickMultipleVisualMediaCompanion
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getClipDataUrisactivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, view);
            }
        });
        TextView textView4 = asInterface().tvTermsConditions;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        TextView textView5 = textView4;
        Function1 function2 = new Function1() { // from class: ActivityResultContractsPickContact
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getClipDataUrisactivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(textView5, "");
        Intrinsics.checkNotNullParameter(function2, "");
        textView5.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function2));
        TextView textView6 = asInterface().tvAboutApp;
        Intrinsics.checkNotNullExpressionValue(textView6, "");
        TextView textView7 = textView6;
        Function1 function3 = new Function1() { // from class: ActivityResultContractsPickMultipleVisualMedia
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getClipDataUrisactivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(textView7, "");
        Intrinsics.checkNotNullParameter(function3, "");
        textView7.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function3));
        TextView textView8 = asInterface().tvPrivacyPolicy;
        Intrinsics.checkNotNullExpressionValue(textView8, "");
        TextView textView9 = textView8;
        Function1 function4 = new Function1() { // from class: getMaxItemsactivity
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getClipDataUrisactivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(textView9, "");
        Intrinsics.checkNotNullParameter(function4, "");
        textView9.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function4));
        asInterface().tvMyPoint.setOnClickListener(new View.OnClickListener() { // from class: ActivityResultContractsPickVisualMediaCompanion
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getClipDataUrisactivity.asBinder(this.b, view);
            }
        });
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        requireActivity().findViewById(R.id.layoutMainToolbar).setVisibility(8);
        MaterialToolbar materialToolbar = asInterface().toolbarCenter.toolbar;
        BaseActivity baseActivity = this.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity != null) {
            baseActivity.TuitionPaymentFragmentbindingInflater1(materialToolbar, false);
        }
        asInterface().toolbarCenter.tvToolbarTitle.setText(getString(R.string.title_my_profile));
        FragmentAccountBinding fragmentAccountBindingAsInterface = asInterface();
        try {
            fragmentAccountBindingAsInterface.tvVersion.setText("4.17.8");
        } catch (FirebaseException unused) {
            fragmentAccountBindingAsInterface.tvVersion.setText("");
        } catch (Exception unused2) {
            fragmentAccountBindingAsInterface.tvVersion.setText("");
        }
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (Intrinsics.areEqual(userAsBinder != null ? userAsBinder.RemoteActionCompatParcelizer : null, "Y")) {
            User userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            if (Intrinsics.areEqual(userAsBinder2 != null ? userAsBinder2.INotificationSideChannelStubProxy : null, ExifInterface.GPS_DIRECTION_TRUE)) {
                FragmentAccountBinding fragmentAccountBindingAsInterface2 = asInterface();
                fragmentAccountBindingAsInterface2.tvDigitalCard.setVisibility(8);
                fragmentAccountBindingAsInterface2.tvNonactiveAutodebet.setVisibility(8);
                ViewGroup.LayoutParams layoutParams = fragmentAccountBindingAsInterface2.tvTermsConditions.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.endToEnd = R.id.tvEditProfile;
                layoutParams2.startToStart = R.id.tvEditProfile;
                fragmentAccountBindingAsInterface2.tvTermsConditions.setLayoutParams(layoutParams2);
                return;
            }
        }
        FragmentAccountBinding fragmentAccountBindingAsInterface3 = asInterface();
        fragmentAccountBindingAsInterface3.tvDigitalCard.setVisibility(0);
        ViewGroup.LayoutParams layoutParams3 = fragmentAccountBindingAsInterface3.tvTermsConditions.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams3, "");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.endToEnd = R.id.tvDigitalCard;
        layoutParams4.startToStart = R.id.tvDigitalCard;
        fragmentAccountBindingAsInterface3.tvTermsConditions.setLayoutParams(layoutParams4);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() throws Throwable {
        super.onResume();
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        String str = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        if (str == null) {
            str = "";
        }
        if (str.length() > 0) {
            final ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities = (ActivityResultContractsPickVisualMediaMediaCapabilities) this.b.getValue();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            String string = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
            Intrinsics.checkExpressionValueIsNotNull(string, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(string, "");
            MutableLiveData<VirtualCameraAdapter1<User>> mutableLiveData = activityResultContractsPickVisualMediaMediaCapabilities.asInterface;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(new UserRequest(str, string))));
            final Function1 function1 = new Function1() { // from class: ActivityResultContractsPickVisualMediaMediaCapabilitiesBuilder
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ActivityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityResultContractsPickVisualMediaMediaCapabilities, (User) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: ActivityResultContractsPickVisualMediaMediaCapabilitiesCompanion
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: addSupportedHdrType
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ActivityResultContractsPickVisualMediaMediaCapabilities.b(activityResultContractsPickVisualMediaMediaCapabilities, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getMimeType
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            activityResultContractsPickVisualMediaMediaCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(getClipDataUrisactivity getclipdataurisactivity, DialogInterface dialogInterface) {
        ((ActivityResultContractsPickVisualMediaMediaCapabilities) getclipdataurisactivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        dialogInterface.dismiss();
    }

    public static /* synthetic */ Unit b(getClipDataUrisactivity getclipdataurisactivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        Drawable drawable;
        if ((virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) && (drawable = ContextCompat.getDrawable(getclipdataurisactivity.requireContext(), R.drawable.ic_placeholder)) != null) {
            CircleImageView circleImageView = getclipdataurisactivity.asInterface().civProfile;
            Intrinsics.checkNotNullExpressionValue(circleImageView, "");
            Context contextRequireContext = getclipdataurisactivity.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            lambdacreateCameraSelectorById0.b(circleImageView, contextRequireContext, (Bitmap) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, drawable, drawable);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(getClipDataUrisactivity getclipdataurisactivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getclipdataurisactivity.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            getclipdataurisactivity.write();
            PointWebViewActivity.Companion tuitionPaymentFragmentbindingInflater1 = PointWebViewActivity.INSTANCE;
            Context contextRequireContext = getclipdataurisactivity.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            getMaxImages getmaximages = getMaxImages.INSTANCE;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            PointWebViewActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contextRequireContext, (String) getMaxImages.b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[0], 73776925, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -73776919), String.valueOf(((PointResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getKey()));
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            getclipdataurisactivity.write();
            getClipDataUrisactivity getclipdataurisactivity2 = getclipdataurisactivity;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Intrinsics.checkNotNullParameter(getclipdataurisactivity2, "");
            Intrinsics.checkNotNullParameter(strValueOf, "");
            BaseActivity baseActivity = (BaseActivity) getclipdataurisactivity2.getContext();
            if (baseActivity != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, null);
            }
        } else {
            getclipdataurisactivity.write();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getClipDataUrisactivity getclipdataurisactivity, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("menu_name", "view_privacy_and_policy"));
        Intrinsics.checkNotNullParameter("view_privacy_and_policy", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("view_privacy_and_policy", mapMutableMapOf);
        Context contextRequireContext = getclipdataurisactivity.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        Intrinsics.checkNotNullParameter(contextRequireContext, "");
        Intrinsics.checkNotNullParameter("https://www.bpjsketenagakerjaan.go.id/jmo/kebijakan-privasi.html", "");
        WebviewFaqCustomActivity.Companion companion = WebviewFaqCustomActivity.INSTANCE;
        WebviewFaqCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contextRequireContext, "https://www.bpjsketenagakerjaan.go.id/jmo/kebijakan-privasi.html", "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(getClipDataUrisactivity getclipdataurisactivity, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("menu_name", "view_terms_condition"));
        Intrinsics.checkNotNullParameter("view_terms_condition", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("view_terms_condition", mapMutableMapOf);
        Context contextRequireContext = getclipdataurisactivity.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        Intrinsics.checkNotNullParameter(contextRequireContext, "");
        Intrinsics.checkNotNullParameter("https://www.bpjsketenagakerjaan.go.id/jmo/syarat-ketentuan.html", "");
        WebviewFaqCustomActivity.Companion companion = WebviewFaqCustomActivity.INSTANCE;
        WebviewFaqCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contextRequireContext, "https://www.bpjsketenagakerjaan.go.id/jmo/syarat-ketentuan.html", "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(getClipDataUrisactivity getclipdataurisactivity, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("menu_name", "view_edit_profile"));
        Intrinsics.checkNotNullParameter("view_edit_profile", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("view_edit_profile", mapMutableMapOf);
        EditProfileActivity.Companion bVar = EditProfileActivity.INSTANCE;
        Context contextRequireContext = getclipdataurisactivity.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        EditProfileActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contextRequireContext);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(getClipDataUrisactivity getclipdataurisactivity, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getclipdataurisactivity.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            getclipdataurisactivity.write();
            getclipdataurisactivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            getclipdataurisactivity.write();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ CharSequence TuitionPaymentFragmentspecialinlinedviewModeldefault2(ProgramInfo programInfo) {
        Intrinsics.checkNotNullParameter(programInfo, "");
        return programInfo.b;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(getClipDataUrisactivity getclipdataurisactivity, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("menu_name", "view_about_app"));
        Intrinsics.checkNotNullParameter("view_about_app", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("view_about_app", mapMutableMapOf);
        Context contextRequireContext = getclipdataurisactivity.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        Intrinsics.checkNotNullParameter(contextRequireContext, "");
        Intrinsics.checkNotNullParameter("https://www.bpjsketenagakerjaan.go.id/jmo/tentang-aplikasi.html", "");
        WebviewFaqCustomActivity.Companion companion = WebviewFaqCustomActivity.INSTANCE;
        WebviewFaqCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contextRequireContext, "https://www.bpjsketenagakerjaan.go.id/jmo/tentang-aplikasi.html", "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getClipDataUrisactivity getclipdataurisactivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getclipdataurisactivity.IconCompatParcelizer();
            str = "loading_logout_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            getclipdataurisactivity.write();
            LoginActivity.Companion companion = LoginActivity.INSTANCE;
            Context contextRequireContext = getclipdataurisactivity.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, null, false, 6);
            BaseActivity baseActivity = getclipdataurisactivity.TuitionPaymentFragmentbindingInflater1;
            if (baseActivity != null) {
                baseActivity.d_();
            }
            str = "success_logout_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            getclipdataurisactivity.write();
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            if (!(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof ApiException)) {
                getClipDataUrisactivity getclipdataurisactivity2 = getclipdataurisactivity;
                String strValueOf = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                Intrinsics.checkNotNullParameter(getclipdataurisactivity2, "");
                Intrinsics.checkNotNullParameter(strValueOf, "");
                BaseActivity baseActivity2 = (BaseActivity) getclipdataurisactivity2.getContext();
                if (baseActivity2 != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity2, strValueOf, null);
                }
            } else {
                Throwable th = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Intrinsics.checkNotNull(th, "");
                if (((ApiException) th).getApiError().getTuitionPaymentFragmentspecialinlinedviewModeldefault1() != 401) {
                    getClipDataUrisactivity getclipdataurisactivity3 = getclipdataurisactivity;
                    String strValueOf2 = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    Intrinsics.checkNotNullParameter(getclipdataurisactivity3, "");
                    Intrinsics.checkNotNullParameter(strValueOf2, "");
                    BaseActivity baseActivity3 = (BaseActivity) getclipdataurisactivity3.getContext();
                    if (baseActivity3 != null) {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity3, strValueOf2, null);
                    }
                }
            }
            str = "failure_logout_result";
        } else {
            getclipdataurisactivity.write();
            str = "";
        }
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_logout_result", str));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getClipDataUrisactivity getclipdataurisactivity, View view) {
        AvailabilityMenuItem availabilityMenuItem;
        List<AvailabilityMenuItem> list;
        Object next;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("menu_name", "view_digital_card"));
            Intrinsics.checkNotNullParameter("view_digital_card", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("view_digital_card", mapMutableMapOf);
            setCurrentRunnable setcurrentrunnable = (setCurrentRunnable) getclipdataurisactivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            if (setcurrentrunnable == null || (list = setcurrentrunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                availabilityMenuItem = null;
            } else {
                Iterator<T> it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((AvailabilityMenuItem) next).getMenuCode(), "JM004"));
                availabilityMenuItem = (AvailabilityMenuItem) next;
            }
            if (Intrinsics.areEqual(availabilityMenuItem != null ? availabilityMenuItem.getActive() : null, "Y")) {
                DigitalCardActivity.Companion companion = DigitalCardActivity.INSTANCE;
                Context contextRequireContext = getclipdataurisactivity.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                DigitalCardActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext);
            } else {
                if (Intrinsics.areEqual(availabilityMenuItem != null ? availabilityMenuItem.getImageUrl() : null, "")) {
                    getClipDataUrisactivity getclipdataurisactivity2 = getclipdataurisactivity;
                    String informationMessage = availabilityMenuItem.getInformationMessage();
                    Intrinsics.checkNotNullParameter(getclipdataurisactivity2, "");
                    Intrinsics.checkNotNullParameter(informationMessage, "");
                    BaseActivity baseActivity = (BaseActivity) getclipdataurisactivity2.getContext();
                    if (baseActivity != null) {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, informationMessage, null);
                    }
                } else {
                    String strValueOf = String.valueOf(availabilityMenuItem != null ? availabilityMenuItem.getImageUrl() : null);
                    onNestedPreScroll.Companion companion2 = onNestedPreScroll.INSTANCE;
                    onNestedPreScroll onnestedprescrollTuitionPaymentFragmentbindingInflater1 = onNestedPreScroll.Companion.TuitionPaymentFragmentbindingInflater1(strValueOf, new Function0() { // from class: ActivityResultContractsOpenDocumentTree
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    }, new Function0() { // from class: isSystemFallbackPickerAvailableactivity
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    });
                    FragmentManager childFragmentManager = getclipdataurisactivity.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager, "");
                    if (childFragmentManager.findFragmentByTag(onnestedprescrollTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        onnestedprescrollTuitionPaymentFragmentbindingInflater1.show(childFragmentManager, onnestedprescrollTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void asInterface(final getClipDataUrisactivity getclipdataurisactivity, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("menu_name", "view_logout"));
            Intrinsics.checkNotNullParameter("view_logout", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("view_logout", mapMutableMapOf);
            Context contextRequireContext = getclipdataurisactivity.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            String string = getclipdataurisactivity.getString(R.string.dialog_title_logout);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = getclipdataurisactivity.getString(R.string.dialog_message_logout);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String string3 = getclipdataurisactivity.getString(R.string.action_dialog_yes);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: isPhotoPickerAvailable
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    getClipDataUrisactivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, dialogInterface);
                }
            };
            String string4 = getclipdataurisactivity.getString(R.string.action_dialog_cancel);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            new AlertDialog.Builder(contextRequireContext).setTitle(string).setMessage(string2).setPositiveButton(string3, onClickListener).setNegativeButton(string4, new DialogInterface.OnClickListener() { // from class: ActivityResultContractsPickVisualMediaDefaultTabPhotosTab
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void asBinder(getClipDataUrisactivity getclipdataurisactivity, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            final setCaptureRequestOption setcapturerequestoption = (setCaptureRequestOption) getclipdataurisactivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            MutableLiveData<VirtualCameraAdapter1<PointResponse>> mutableLiveData = setcapturerequestoption.TuitionPaymentFragmentbindingInflater1;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            User userAsBinder = setcapturerequestoption.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder();
            dispatchOnBackStarted dispatchonbackstarted = setcapturerequestoption.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str = userAsBinder != null ? userAsBinder.b : null;
            if (str == null) {
                str = "";
            }
            String str2 = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
            if (str2 == null) {
                str2 = "";
            }
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(dispatchonbackstarted.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new PointRequest(str, str2))));
            final Function1 function1 = new Function1() { // from class: setCaptureRequestOptionWithPriority
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return setCaptureRequestOption.TuitionPaymentFragmentbindingInflater1(setcapturerequestoption, (PointResponse) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: addRequestOption
                private static final byte[] $$c = {19, 78, 114, 113};
                private static final int $$d = 74;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$a = {88, 99, -94, -58, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
                private static final int $$b = 199;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                private static int d = 1;
                private static long TuitionPaymentFragmentbindingInflater1 = -6377398940819159759L;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -981105359;
                private static char b = 51037;

                /* JADX WARN: Code duplicated, block: B:10:0x0025  */
                /* JADX WARN: Code duplicated, block: B:8:0x001d  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
                    /*
                        byte[] r0 = defpackage.addRequestOption.$$a
                        int r7 = r7 * 2
                        int r7 = r7 + 84
                        int r8 = r8 + 4
                        int r6 = r6 * 15
                        int r1 = 53 - r6
                        byte[] r1 = new byte[r1]
                        int r6 = 52 - r6
                        r2 = 0
                        if (r0 != 0) goto L17
                        r4 = r6
                        r7 = r8
                        r3 = r2
                        goto L2c
                    L17:
                        r3 = r2
                    L18:
                        byte r4 = (byte) r7
                        r1[r3] = r4
                        if (r3 != r6) goto L25
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        r9[r2] = r6
                        return
                    L25:
                        int r3 = r3 + 1
                        r4 = r0[r8]
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L2c:
                        int r4 = -r4
                        int r8 = r8 + r4
                        int r7 = r7 + 1
                        int r8 = r8 + (-11)
                        r5 = r8
                        r8 = r7
                        r7 = r5
                        goto L18
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.addRequestOption.a(int, byte, byte, java.lang.Object[]):void");
                }

                private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
                    int i2;
                    int i3 = 2;
                    int i4 = 2 % 2;
                    SessionProcessor sessionProcessor = new SessionProcessor();
                    int length = cArr2.length;
                    char[] cArr4 = new char[length];
                    int length2 = cArr.length;
                    char[] cArr5 = new char[length2];
                    int i5 = 0;
                    System.arraycopy(cArr2, 0, cArr4, 0, length);
                    System.arraycopy(cArr, 0, cArr5, 0, length2);
                    cArr4[0] = (char) (cArr4[0] ^ c);
                    cArr5[2] = (char) (cArr5[2] + ((char) i));
                    int length3 = cArr3.length;
                    char[] cArr6 = new char[length3];
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                    while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                        int i6 = $10 + 115;
                        $11 = i6 % 128;
                        int i7 = i6 % i3;
                        try {
                            Object[] objArr2 = {sessionProcessor};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 8328);
                                int iMyTid = 1235 - (Process.myTid() >> 22);
                                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 35;
                                byte b2 = (byte) i5;
                                byte b3 = b2;
                                String str$$e = $$e(b2, b3, b3);
                                Class[] clsArr = new Class[1];
                                clsArr[i5] = Object.class;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, iMyTid, longPressTimeout, -653973969, false, str$$e, clsArr);
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            Object[] objArr3 = {sessionProcessor};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                                int windowTouchSlop = 2764 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                int i8 = 14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                byte b4 = (byte) i5;
                                byte b5 = b4;
                                String str$$e2 = $$e(b4, b5, (byte) (b5 + 2));
                                Class[] clsArr2 = new Class[1];
                                clsArr2[i5] = Object.class;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionGroup, windowTouchSlop, i8, 1504416861, false, str$$e2, clsArr2);
                            }
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            int i9 = cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718;
                            Object[] objArr4 = new Object[3];
                            objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                            objArr4[1] = Integer.valueOf(i9);
                            objArr4[i5] = sessionProcessor;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char cMyPid = (char) (43325 - (Process.myPid() >> 22));
                                int iRgb = (-16776963) - Color.rgb(i5, i5, i5);
                                int tapTimeout = 22 - (ViewConfiguration.getTapTimeout() >> 16);
                                Class[] clsArr3 = new Class[3];
                                clsArr3[i5] = Object.class;
                                clsArr3[1] = Integer.TYPE;
                                clsArr3[2] = Integer.TYPE;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyPid, iRgb, tapTimeout, -721491957, false, "j", clsArr3);
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            int i10 = cArr4[iIntValue2] * 32718;
                            Object[] objArr5 = new Object[2];
                            objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                            objArr5[i5] = Integer.valueOf(i10);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 65199);
                                int i11 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2890;
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i5) + 18;
                                byte b6 = (byte) i5;
                                byte b7 = b6;
                                String str$$e3 = $$e(b6, b7, (byte) (b7 + 1));
                                i2 = 2;
                                Class[] clsArr4 = new Class[2];
                                clsArr4[i5] = Integer.TYPE;
                                clsArr4[1] = Integer.TYPE;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, i11, iIndexOf, 2012627446, false, str$$e3, clsArr4);
                            } else {
                                i2 = 2;
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = sessionProcessor.b;
                            cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) ((((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))) ^ (((long) (cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (TuitionPaymentFragmentbindingInflater1 ^ (-6377398940819159759L)))) ^ ((long) ((char) (((long) b) ^ (-6377398940819159759L)))));
                            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                            int i12 = $10 + 39;
                            $11 = i12 % 128;
                            int i13 = i12 % 2;
                            i3 = i2;
                            i5 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    objArr[0] = new String(cArr6);
                }

                @Override // defpackage.logToString
                public final void accept(Object obj) throws Throwable {
                    Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
                    int i = 2 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char keyRepeatDelay = (char) (29944 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                        int edgeSlop = 1755 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int iResolveSizeAndState = 23 - View.resolveSizeAndState(0, 0, 0);
                        byte[] bArr = $$a;
                        byte b2 = bArr[5];
                        byte b3 = bArr[7];
                        Object[] objArr = new Object[1];
                        a(b2, b3, b3, objArr);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, edgeSlop, iResolveSizeAndState, 986134021, false, (String) objArr[0], null);
                    }
                    Object obj2 = null;
                    long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                    Object[] objArr2 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{20120, 21218, 29867, 44122}, (char) KeyEvent.keyCodeFromString(""), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{36737, 3402, 23070, 10425, 42944, 64605, 19006, 23783, 9494, 40541, 45147, 55114, 14923, 41326, 17826, 28819, 37401, 65456, 60091, 34061, 44240, 1437}, objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    Object[] objArr3 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{57213, 37570, 14, 60006}, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 26112), TextUtils.lastIndexOf("", '0', 0) + 244499168, new char[]{10009, 22119, 7147, 64644, 52231, 37472, 28078, 61727, 53432, 21059, 1800, 30828, 28752, 45603, 63651}, objArr3);
                    long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char minimumFlingVelocity = (char) (29944 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int scrollBarFadeDuration = 1755 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int i2 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                        byte b4 = $$a[7];
                        byte b5 = b4;
                        Object[] objArr4 = new Object[1];
                        a(b4, b5, (byte) (b5 | 37), objArr4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity, scrollBarFadeDuration, i2, 1596667560, false, (String) objArr4[0], null);
                    }
                    if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29944);
                            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1755;
                            int iIndexOf = TextUtils.indexOf("", "", 0) + 23;
                            byte b6 = $$a[7];
                            byte b7 = b6;
                            Object[] objArr5 = new Object[1];
                            a(b6, b7, (byte) (b7 | 89), objArr5);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, maximumDrawingCacheSize, iIndexOf, 1599039318, false, (String) objArr5[0], null);
                        }
                        Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                        objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
                        int iIdentityHashCode = System.identityHashCode(this);
                        int i3 = ~iIdentityHashCode;
                        int i4 = 1826450533 + (((~((-75497481) | i3)) | 288099906) * 220) + (((~(i3 | (-209727882))) | 422330307) * (-440)) + ((iIdentityHashCode | (-75497481)) * 220) + 1411822953;
                        int i5 = (i4 << 13) ^ i4;
                        int i6 = i5 ^ (i5 >>> 17);
                        ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i6 ^ (i6 << 5);
                    } else {
                        Object[] objArr7 = new Object[1];
                        c(new char[]{0, 0, 0, 0}, new char[]{53904, 39507, 64788, 12688}, (char) (Color.red(0) + 37117), ViewConfiguration.getScrollBarFadeDuration() >> 16, new char[]{58841, 33694, 29568, 5441, 53765, 65150, 15724, 61678, 64280, 25839, 34666, 46162, 7367, 63048, 46701, 18863}, objArr7);
                        Class<?> cls2 = Class.forName((String) objArr7[0]);
                        Object[] objArr8 = new Object[1];
                        c(new char[]{0, 0, 0, 0}, new char[]{40326, 42552, 8081, 62717}, (char) (ImageFormat.getBitsPerPixel(0) + 64800), ExpandableListView.getPackedPositionGroup(0L), new char[]{36946, 5203, 55203, 25859, 40704, 14979, 25212, 51324, 34652, 26888, 47836, 41812, 12726, 35506, 50782, 57356}, objArr8);
                        int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
                        try {
                            Object[] objArr9 = {1536278154};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - Drawable.resolveOpacity(0, 0)), KeyEvent.getDeadChar(0, 0) + 1726, 29 - TextUtils.getOffsetBefore("", 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                            }
                            objArrTuitionPaymentFragmentbindingInflater1$7879113 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), 1411822953, false, true);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 29945);
                                int scrollBarFadeDuration2 = 1755 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                int i7 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24;
                                byte b8 = $$a[7];
                                byte b9 = b8;
                                Object[] objArr10 = new Object[1];
                                a(b8, b9, (byte) (b9 | 89), objArr10);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, scrollBarFadeDuration2, i7, 1599039318, false, (String) objArr10[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                            try {
                                Object[] objArr11 = new Object[1];
                                c(new char[]{0, 0, 0, 0}, new char[]{20120, 21218, 29867, 44122}, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (Process.getThreadPriority(0) + 20) >> 6, new char[]{36737, 3402, 23070, 10425, 42944, 64605, 19006, 23783, 9494, 40541, 45147, 55114, 14923, 41326, 17826, 28819, 37401, 65456, 60091, 34061, 44240, 1437}, objArr11);
                                Class<?> cls3 = Class.forName((String) objArr11[0]);
                                Object[] objArr12 = new Object[1];
                                c(new char[]{0, 0, 0, 0}, new char[]{57213, 37570, 14, 60006}, (char) (26112 - TextUtils.indexOf("", "", 0, 0)), 244499167 - View.MeasureSpec.getMode(0), new char[]{10009, 22119, 7147, 64644, 52231, 37472, 28078, 61727, 53432, 21059, 1800, 30828, 28752, 45603, 63651}, objArr12);
                                long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0, 0));
                                    int i8 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1754;
                                    int iResolveSize = View.resolveSize(0, 0) + 23;
                                    byte b10 = $$a[7];
                                    byte b11 = b10;
                                    Object[] objArr13 = new Object[1];
                                    a(b10, b11, (byte) (b11 | 37), objArr13);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, i8, iResolveSize, 1596667560, false, (String) objArr13[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                    char scrollBarFadeDuration3 = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944);
                                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1756;
                                    int iIndexOf2 = 23 - TextUtils.indexOf("", "");
                                    byte[] bArr2 = $$a;
                                    byte b12 = bArr2[5];
                                    byte b13 = bArr2[7];
                                    Object[] objArr14 = new Object[1];
                                    a(b12, b13, b13, objArr14);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollBarFadeDuration3, iLastIndexOf, iIndexOf2, 986134021, false, (String) objArr14[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
                    int i9 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
                    int i10 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
                    if (i10 == i9) {
                        int i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
                        Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
                        int startUptimeMillis = (int) Process.getStartUptimeMillis();
                        int i12 = ~startUptimeMillis;
                        int i13 = i11 + 1028454406 + (((~(291177193 | i12)) | (~((-22545097) | startUptimeMillis))) * (-831)) + ((~(526324715 | startUptimeMillis)) * (-1662)) + (((~(startUptimeMillis | (-291177194))) | (~(i12 | (-503779620))) | (~(503779619 | startUptimeMillis))) * 831);
                        int i14 = (i13 << 13) ^ i13;
                        int i15 = i14 ^ (i14 >>> 17);
                        ((int[]) objArr15[3])[0] = i15 ^ (i15 << 5);
                        int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
                        d = i16 % 128;
                        if (i16 % 2 != 0) {
                            function1.invoke(obj);
                            return;
                        } else {
                            function1.invoke(obj);
                            obj2.hashCode();
                            throw null;
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
                    if (strArr != null) {
                        int i17 = d + 85;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
                        for (int i18 = i17 % 2 == 0 ? 0 : 1; i18 < strArr.length; i18++) {
                            arrayList.add(strArr[i18]);
                        }
                    }
                    throw new RuntimeException(String.valueOf(i10));
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
                private static java.lang.String $$e(byte r7, int r8, int r9) {
                    /*
                        int r8 = r8 * 4
                        int r8 = 4 - r8
                        int r9 = r9 + 102
                        byte[] r0 = defpackage.addRequestOption.$$c
                        int r7 = r7 * 4
                        int r7 = 1 - r7
                        byte[] r1 = new byte[r7]
                        r2 = 0
                        if (r0 != 0) goto L15
                        r3 = r9
                        r4 = r2
                        r9 = r8
                        goto L29
                    L15:
                        r3 = r2
                    L16:
                        int r4 = r3 + 1
                        byte r5 = (byte) r9
                        r1[r3] = r5
                        if (r4 != r7) goto L23
                        java.lang.String r7 = new java.lang.String
                        r7.<init>(r1, r2)
                        return r7
                    L23:
                        r3 = r0[r8]
                        r6 = r9
                        r9 = r8
                        r8 = r3
                        r3 = r6
                    L29:
                        int r8 = -r8
                        int r8 = r8 + r3
                        int r9 = r9 + 1
                        r3 = r4
                        r6 = r9
                        r9 = r8
                        r8 = r6
                        goto L16
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.addRequestOption.$$e(byte, int, int):java.lang.String");
                }
            };
            final Function1 function2 = new Function1() { // from class: AndroidRZoomImpl
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return setCaptureRequestOption.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setcapturerequestoption, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: packageinfo
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            setcapturerequestoption.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } finally {
            ViewPortBuilder.b();
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
        String strJoinToString$default;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        FragmentAccountBinding fragmentAccountBindingAsInterface = asInterface();
        if (userAsBinder != null) {
            String str = userAsBinder.TuitionPaymentFragmentbindingInflater1;
            if (str != null) {
                if (str.length() > 0) {
                    CircleImageView circleImageView = fragmentAccountBindingAsInterface.civProfile;
                    Intrinsics.checkNotNullExpressionValue(circleImageView, "");
                    Context contextRequireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    Drawable drawable = getResources().getDrawable(R.drawable.ic_placeholder);
                    Intrinsics.checkNotNullExpressionValue(drawable, "");
                    Drawable drawable2 = getResources().getDrawable(R.drawable.ic_placeholder);
                    Intrinsics.checkNotNullExpressionValue(drawable2, "");
                    lambdacreateCameraSelectorById0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(circleImageView, contextRequireContext, str, drawable, drawable2);
                    String str2 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (str2 != null) {
                        ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, str);
                    }
                }
            } else {
                fragmentAccountBindingAsInterface.civProfile.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.ic_placeholder));
            }
            TextView textView = fragmentAccountBindingAsInterface.tvUserName;
            String str3 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            textView.setText(str3 != null ? str3 : "");
            TextView textView2 = fragmentAccountBindingAsInterface.tvUserCategory;
            List<ProgramInfo> list = userAsBinder.INotificationSideChannelStub;
            if (list != null && !list.isEmpty()) {
                strJoinToString$default = CollectionsKt.joinToString$default(userAsBinder.INotificationSideChannelStub, null, null, null, 0, null, new Function1() { // from class: getSystemFallbackPickeractivity
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return getClipDataUrisactivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2((ProgramInfo) obj);
                    }
                }, 31, null);
            }
            textView2.setText(strJoinToString$default);
            fragmentAccountBindingAsInterface.tvUserIdCard.setText(userAsBinder.b);
            String strValueOf = String.valueOf(userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            if (strValueOf != null && strValueOf.length() != 0 && !Intrinsics.areEqual(String.valueOf(userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3), "-")) {
                fragmentAccountBindingAsInterface.tvUserPhoneNumber.setText(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.valueOf(userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3)));
            } else {
                fragmentAccountBindingAsInterface.tvUserPhoneNumber.setText(String.valueOf(userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
            }
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(getClipDataUrisactivity getclipdataurisactivity) {
        NonactiveAutodebetActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = NonactiveAutodebetActivity.INSTANCE;
        Context contextRequireContext = getclipdataurisactivity.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        NonactiveAutodebetActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext);
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        getClipDataUrisactivity getclipdataurisactivity = this;
        ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(getclipdataurisactivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: getVisualMimeTypeactivity
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getClipDataUrisactivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(getclipdataurisactivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: ActivityResultContractsPickVisualMediaDefaultTab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getClipDataUrisactivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setCaptureRequestOption) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentbindingInflater1.observe(getclipdataurisactivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: ActivityResultContractsPickVisualMediaDefaultTabAlbumsTab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getClipDataUrisactivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.b.getValue()).asInterface.observe(getclipdataurisactivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: ActivityResultContractsPickVisualMediaImageAndVideo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getClipDataUrisactivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        String str = userAsBinder != null ? userAsBinder.b : null;
        if (str == null || str.length() == 0) {
            LoginActivity.Companion companion = LoginActivity.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, null, false, 6);
            BaseActivity baseActivity = this.TuitionPaymentFragmentbindingInflater1;
            if (baseActivity != null) {
                baseActivity.d_();
            }
        }
    }
}
