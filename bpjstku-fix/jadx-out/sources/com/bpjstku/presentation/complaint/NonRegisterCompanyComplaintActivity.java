package com.bpjstku.presentation.complaint;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.FileProvider;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.LifecycleOwnerKt;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import com.bpjstku.R;
import com.bpjstku.data.report.model.request.ReportUnregisteredCompanyRequest;
import com.bpjstku.databinding.ActivityNonRegisterCompanyComplaintBinding;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.complaint.NonRegisterCompanyComplaintActivity;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.esafirm.imagepicker.features.ImagePickerActivity;
import com.esafirm.imagepicker.features.ImagePickerSavePath;
import com.esafirm.imagepicker.features.ReturnMode;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.material.textfield.TextInputLayout;
import com.rtchagas.pingplacepicker.ui.PlacePickerActivity;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.AnyRes;
import defpackage.AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder;
import defpackage.AutoValue_FileOutputOptions_FileOutputOptionsInternalBuilder;
import defpackage.AutoValue_LifecycleCameraRepository_Key;
import defpackage.AutoValue_MediaSpec;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.Camera2CameraControlImplCameraCaptureCallbackSetExternalSyntheticLambda0;
import defpackage.ExperimentalCamera2Interop;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.TargetAspectRatio;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorCompanion;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accessconfigureInstanceInternal;
import defpackage.accesssetAnchoredZoomStartXp;
import defpackage.acquireBuffer;
import defpackage.cacheInteropConfig;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.containsZslUseCase;
import defpackage.deriveCodec;
import defpackage.generateCameraId;
import defpackage.getAudioSpec;
import defpackage.getCaptureNode;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getFocusX;
import defpackage.getIncrementalScaleFactor;
import defpackage.getStringOrNull;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.isLenovoTablet;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.onScroll;
import defpackage.outputFormatToAudioProfile;
import defpackage.outputFormatToAudioProfile.AnonymousClass4;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import defpackage.unregisterLifecycle;
import defpackage.updateFileExif;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.reflect.KClass;
import kotlinx.coroutines.b;
import org.koin.core.logger.Level;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0015\u0010\b\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0015\u0010\u001d\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0016\u0010\u001c\u001a\u00020!8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0015\u0010\u0006\u001a\u00020#8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0015\u0010\n\u001a\u00020$8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0016\u0010\u0007\u001a\u00020%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00150'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010)R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00020,8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010.R\u0014\u0010(\u001a\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b \u0010/R\u0018\u0010+\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u00101R\u0015\u00103\u001a\u0002028CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b*\u0010\u001a"}, d2 = {"Lcom/bpjstku/presentation/complaint/NonRegisterCompanyComplaintActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityNonRegisterCompanyComplaintBinding;", "<init>", "()V", "", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "LcontainsZslUseCase;", "Lkotlin/Lazy;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/io/File;", "Ljava/io/File;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/google/android/libraries/places/api/model/Place;", "Lcom/google/android/libraries/places/api/model/Place;", "LoutputFormatToAudioProfile;", "LacquireBuffer;", "", "Ljava/lang/String;", "Landroidx/activity/result/ActivityResultLauncher;", "notify", "Landroidx/activity/result/ActivityResultLauncher;", "g", "onTransact", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "()I", "LgetStringOrNull;", "LgetStringOrNull;", "LAnyRes;", "cancel"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NonRegisterCompanyComplaintActivity extends BindingReactiveFormActivity<ActivityNonRegisterCompanyComplaintBinding> {
    private static boolean INotificationSideChannel;
    private static boolean INotificationSideChannelStub;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] cancel;
    private static int cancelAll;
    private static int getInterfaceDescriptor;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private Place TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private getStringOrNull onTransact;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private File TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {101, 89, 94, -73};
    private static final int $$f = 176;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {42, -104, -68, 105, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 149;
    private static int INotificationSideChannelStubProxy = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int INotificationSideChannelDefault = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: getMinimumHeight
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NonRegisterCompanyComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private String asBinder = "";

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final ActivityResultLauncher<Intent> g = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: getOutline
        @Override // androidx.view.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            NonRegisterCompanyComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (ActivityResult) obj);
        }
    });

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final ActivityResultLauncher<Intent> asInterface = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: getOpacity
        @Override // androidx.view.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            NonRegisterCompanyComplaintActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (ActivityResult) obj);
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy cancel = LazyKt.lazy(new Function0() { // from class: onLayoutDirectionChanged
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NonRegisterCompanyComplaintActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1) {
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

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~((~i2) | i7);
        int i9 = i | i8 | (~(i5 | i2));
        int i10 = (~(i2 | i)) | (~(i7 | i2)) | (~(i7 | i));
        int i11 = i + i5 + i4 + (1351532378 * i3) + (1237199896 * i6);
        int i12 = i11 * i11;
        int i13 = ((-211156802) * i) + 1314914304 + ((-491389116) * i5) + (2007367491 * i9) + (i10 * (-2007367491)) + ((-2007367491) * i8) + (1796210688 * i4) + ((-1818230784) * i3) + ((-914358272) * i6) + ((-2051670016) * i12);
        int i14 = ((i * 406040238) - 634933780) + (i5 * 406038884) + (i9 * (-677)) + (i10 * 677) + (i8 * 677) + (i4 * 406039561) + (i3 * 1283666474) + (i6 * 1712827608) + (i12 * (-77201408));
        int i15 = i13 + (i14 * i14 * 1831469056);
        if (i15 != 1) {
            if (i15 == 2) {
                return TuitionPaymentFragmentbindingInflater1(objArr);
            }
            if (i15 == 3) {
                return b(objArr);
            }
            if (i15 != 4) {
                return i15 != 5 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            }
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity = (NonRegisterCompanyComplaintActivity) objArr[0];
        int i16 = 2 % 2;
        int i17 = INotificationSideChannelDefault + 63;
        RemoteActionCompatParcelizer = i17 % 128;
        int i18 = i17 % 2;
        if (Build.VERSION.SDK_INT >= 33) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType("image/*");
            nonRegisterCompanyComplaintActivity.g.launch(intent);
            int i19 = INotificationSideChannelDefault + 79;
            RemoteActionCompatParcelizer = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = 3 / 5;
            }
        } else {
            getCaptureNode.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new getCaptureNode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(nonRegisterCompanyComplaintActivity);
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancelAll = ReturnMode.GALLERY_ONLY;
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b = true;
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "Pilih Foto";
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStub = new ImagePickerSavePath(Environment.DIRECTORY_PICTURES, false);
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStub = new ImagePickerSavePath(Environment.getExternalStorageDirectory().getPath(), true);
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel = 1;
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel = false;
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 14
            int r6 = r6 + 84
            int r8 = r8 + 1
            byte[] r0 = com.bpjstku.presentation.complaint.NonRegisterCompanyComplaintActivity.$$a
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r3 + 1
            int r7 = r7 + (-11)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.complaint.NonRegisterCompanyComplaintActivity.c(short, short, short, java.lang.Object[]):void");
    }

    public static final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity, File file) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 43;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        nonRegisterCompanyComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = file;
        int i5 = i2 + 101;
        RemoteActionCompatParcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
    }

    public static final /* synthetic */ void b(NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity, File file) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 13;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityNonRegisterCompanyComplaintBinding activityNonRegisterCompanyComplaintBindingINotificationSideChannelStub = nonRegisterCompanyComplaintActivity.INotificationSideChannelStub();
        activityNonRegisterCompanyComplaintBindingINotificationSideChannelStub.btnTakeCompanyPhoto.setImageBitmap(BitmapFactory.decodeFile(file.getPath()));
        TextView textView = activityNonRegisterCompanyComplaintBindingINotificationSideChannelStub.tvCompanyPhotoError;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        TextView textView2 = activityNonRegisterCompanyComplaintBindingINotificationSideChannelStub.tvTakePhoto;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
        ImageView imageView = activityNonRegisterCompanyComplaintBindingINotificationSideChannelStub.imgCamera;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
        int i4 = RemoteActionCompatParcelizer + 75;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
    }

    public NonRegisterCompanyComplaintActivity() {
        final NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<containsZslUseCase>() { // from class: com.bpjstku.presentation.complaint.NonRegisterCompanyComplaintActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, containsZslUseCase] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ containsZslUseCase invoke() {
                LifecycleOwner lifecycleOwner = nonRegisterCompanyComplaintActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(containsZslUseCase.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.complaint.NonRegisterCompanyComplaintActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = nonRegisterCompanyComplaintActivity;
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
        final NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity2 = this;
        this.a = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.complaint.NonRegisterCompanyComplaintActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = nonRegisterCompanyComplaintActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.complaint.NonRegisterCompanyComplaintActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/complaint/NonRegisterCompanyComplaintActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, NonRegisterCompanyComplaintActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        NonRegisterCompanyComplaintActivity$bindingInflater$1 nonRegisterCompanyComplaintActivity$bindingInflater$1 = NonRegisterCompanyComplaintActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i3 != 0) {
            return nonRegisterCompanyComplaintActivity$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        TuitionPaymentFragmentbindingInflater1((Toolbar) INotificationSideChannelStub().layoutToolbar.toolbar, true);
        INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_complaint_nonregistered_company));
        NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity = this;
        Intrinsics.checkNotNullParameter(nonRegisterCompanyComplaintActivity, "");
        nonRegisterCompanyComplaintActivity.getWindow().addFlags(8192);
        if (Build.VERSION.SDK_INT >= 33) {
            outputFormatToAudioProfile outputformattoaudioprofile = (outputFormatToAudioProfile) this.b.getValue();
            SpreadBuilder spreadBuilder = new SpreadBuilder(3);
            spreadBuilder.addSpread(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            spreadBuilder.add("android.permission.ACCESS_FINE_LOCATION");
            spreadBuilder.add("android.permission.ACCESS_COARSE_LOCATION");
            VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(outputformattoaudioprofile.new AnonymousClass4((String[]) spreadBuilder.toArray(new String[spreadBuilder.size()])));
            final Function1 function1 = new Function1() { // from class: setAutoMirrored
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NonRegisterCompanyComplaintActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Boolean) obj);
                }
            };
            BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartCompose.subscribe(new logToString() { // from class: selectDrawable
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    NonRegisterCompanyComplaintActivity.TuitionPaymentFragmentbindingInflater1(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
            ((acquireBuffer) this.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
            int i2 = INotificationSideChannelDefault + 61;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = RemoteActionCompatParcelizer + 107;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityNonRegisterCompanyComplaintBinding activityNonRegisterCompanyComplaintBindingINotificationSideChannelStub = INotificationSideChannelStub();
        ImageButton imageButton = activityNonRegisterCompanyComplaintBindingINotificationSideChannelStub.btnTakeCompanyPhoto;
        Intrinsics.checkNotNullExpressionValue(imageButton, "");
        imageButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getMinimumWidth
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NonRegisterCompanyComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
        EditText editText = activityNonRegisterCompanyComplaintBindingINotificationSideChannelStub.tilCompanyLocation.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: invalidateDrawable
                private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                private static int[] asBinder;
                private static short[] d;
                private static final byte[] $$c = {102, -96, -78, -55};
                private static final int $$f = 60;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$d = {88, 99, -94, -58, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
                private static final int $$e = 154;
                private static final byte[] $$a = {38, 31, -70, -1, -6, 24, -18, -48, 72, -11, 1, 21, 0, -6, 14, 8, -72, 56, 5, 16, 5, -67, 45, -32, -2, 12, 13, 37, 16, 5, -8, 0, 6, -3, 1, 22, -12, 1, 18, -44, 54, -1, -12, 12, 8, -7, 9, 2, -21, 14, 14, 12, -13};
                private static final int $$b = 218;
                private static int g = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f1204a = 1;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -706696073;
                private static int b = -1934795646;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1776387763;

                /* JADX WARN: Code duplicated, block: B:10:0x0025  */
                /* JADX WARN: Code duplicated, block: B:8:0x001d  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void f(short r6, byte r7, int r8, java.lang.Object[] r9) {
                    /*
                        byte[] r0 = defpackage.invalidateDrawable.$$d
                        int r7 = r7 + 4
                        int r6 = r6 + 84
                        int r1 = 53 - r8
                        byte[] r1 = new byte[r1]
                        int r8 = 52 - r8
                        r2 = 0
                        if (r0 != 0) goto L13
                        r3 = r7
                        r6 = r8
                        r4 = r2
                        goto L2a
                    L13:
                        r3 = r2
                    L14:
                        int r7 = r7 + 1
                        byte r4 = (byte) r6
                        r1[r3] = r4
                        int r4 = r3 + 1
                        if (r3 != r8) goto L25
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        r9[r2] = r6
                        return
                    L25:
                        r3 = r0[r7]
                        r5 = r3
                        r3 = r7
                        r7 = r5
                    L2a:
                        int r7 = -r7
                        int r6 = r6 + r7
                        int r6 = r6 + (-11)
                        r7 = r3
                        r3 = r4
                        goto L14
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.invalidateDrawable.f(short, byte, int, java.lang.Object[]):void");
                }

                /* JADX WARN: Code duplicated, block: B:10:0x002b  */
                /* JADX WARN: Code duplicated, block: B:8:0x0023  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void h(int r6, short r7, short r8, java.lang.Object[] r9) {
                    /*
                        int r8 = r8 * 3
                        int r8 = r8 + 103
                        int r6 = r6 * 17
                        int r0 = 34 - r6
                        byte[] r1 = defpackage.invalidateDrawable.$$a
                        int r7 = r7 * 33
                        int r7 = 36 - r7
                        byte[] r0 = new byte[r0]
                        int r6 = 33 - r6
                        r2 = 0
                        if (r1 != 0) goto L19
                        r3 = r8
                        r4 = r2
                        r8 = r7
                        goto L30
                    L19:
                        r3 = r2
                    L1a:
                        int r7 = r7 + 1
                        byte r4 = (byte) r8
                        r0[r3] = r4
                        int r4 = r3 + 1
                        if (r3 != r6) goto L2b
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r0, r2)
                        r9[r2] = r6
                        return
                    L2b:
                        r3 = r1[r7]
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L30:
                        int r7 = r7 + r3
                        int r7 = r7 + (-3)
                        r3 = r4
                        r5 = r8
                        r8 = r7
                        r7 = r5
                        goto L1a
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.invalidateDrawable.h(int, short, short, java.lang.Object[]):void");
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = 2 % 2;
                    int i3 = g + 59;
                    f1204a = i3 % 128;
                    int i4 = i3 % 2;
                    NonRegisterCompanyComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, view);
                    if (i4 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                private static void e(int[] iArr, int i2, Object[] objArr) throws Throwable {
                    int i3 = 2;
                    int i4 = 2 % 2;
                    SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length * 2];
                    int[] iArr2 = asBinder;
                    long j = 0;
                    int i5 = -1870535734;
                    int i6 = 1;
                    int i7 = 0;
                    if (iArr2 != null) {
                        int length = iArr2.length;
                        int[] iArr3 = new int[length];
                        int i8 = 0;
                        while (i8 < length) {
                            int i9 = $10 + 43;
                            $11 = i9 % 128;
                            if (i9 % i3 == 0) {
                                try {
                                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        byte b2 = (byte) (-1);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1))), 3291 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 'O' - AndroidCharacter.getMirror('0'), 1948206109, false, $$g((byte) ($$f - 4), b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                                    }
                                    iArr3[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            } else {
                                Object[] objArr3 = {Integer.valueOf(iArr2[i8])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b3 = (byte) (-1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 3290 - ImageFormat.getBitsPerPixel(0), (-16777185) - Color.rgb(0, 0, 0), 1948206109, false, $$g((byte) ($$f - 4), b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                                }
                                iArr3[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                                i8++;
                            }
                            i3 = 2;
                            j = 0;
                            i5 = -1870535734;
                        }
                        iArr2 = iArr3;
                    }
                    int length2 = iArr2.length;
                    int[] iArr4 = new int[length2];
                    int[] iArr5 = asBinder;
                    int i10 = 17;
                    if (iArr5 != null) {
                        int length3 = iArr5.length;
                        int[] iArr6 = new int[length3];
                        int i11 = 0;
                        while (i11 < length3) {
                            int i12 = $11 + i10;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                            Object[] objArr4 = new Object[i6];
                            objArr4[i7] = Integer.valueOf(iArr5[i11]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b4 = (byte) (-1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', i7, i7)), TextUtils.getCapsMode("", i7, i7) + 3291, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 30, 1948206109, false, $$g((byte) ($$f - 4), b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                            }
                            iArr6[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                            i11++;
                            iArr5 = iArr5;
                            i10 = 17;
                            i6 = 1;
                            i7 = 0;
                        }
                        iArr5 = iArr6;
                    }
                    int i14 = i7;
                    System.arraycopy(iArr5, i14, iArr4, i14, length2);
                    sessionConfigValidatingBuilder.b = 2;
                    while (sessionConfigValidatingBuilder.b < iArr.length) {
                        cArr[i14] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                        cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                        cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                        cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                        int i15 = 17;
                        for (int i16 = 1; i15 > i16; i16 = 1) {
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                            Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = (byte) (b5 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), TextUtils.indexOf("", "", 0) + 2559, 30 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 683220507, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                            i15--;
                        }
                        int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                        int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        Object[] objArr6 = {sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 28878), 348 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 24 - TextUtils.lastIndexOf("", '0', 0), -30507727, false, "G", new Class[]{Object.class});
                        }
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
                        cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                        cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                        cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                        cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                        cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                        cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                        cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                        sessionConfigValidatingBuilder.b += 2;
                        i14 = 0;
                    }
                    objArr[0] = new String(cArr2, 0, i2);
                }

                private static void c(int i2, int i3, short s, byte b2, int i4, Object[] objArr) throws Throwable {
                    long j;
                    boolean z;
                    int i5 = 2 % 2;
                    SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                    StringBuilder sb = new StringBuilder();
                    try {
                        Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(b)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b3 = (byte) (-1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (MotionEvent.axisFromString("") + 1), 2267 - (ViewConfiguration.getTouchSlop() >> 8), 33 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1387473586, false, $$g((byte) 5, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        int i6 = iIntValue == -1 ? 1 : 0;
                        if ((i6 ^ 1) == 0) {
                            byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            if (bArr != null) {
                                int length = bArr.length;
                                byte[] bArr2 = new byte[length];
                                for (int i7 = 0; i7 < length; i7++) {
                                    try {
                                        Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            byte b4 = (byte) 1;
                                            byte b5 = (byte) (-b4);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), KeyEvent.normalizeMetaState(0) + 3358, 18 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1054011043, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                                        }
                                        bArr2[i7] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                }
                                bArr = bArr2;
                            }
                            if (bArr != null) {
                                byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                Object[] objArr4 = {Integer.valueOf(i4), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b6 = (byte) (-1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.combineMeasuredStates(0, 0) + 2267, 33 - KeyEvent.getDeadChar(0, 0), 1387473586, false, $$g((byte) 5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                                int i8 = $10 + 69;
                                $11 = i8 % 128;
                                int i9 = i8 % 2;
                                j = 3046761265686732006L;
                            } else {
                                j = 3046761265686732006L;
                                iIntValue = (short) (((short) (((long) d[i4 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                            }
                        } else {
                            j = 3046761265686732006L;
                        }
                        if (iIntValue > 0) {
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i4 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ j)) + i6;
                            Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 55905);
                                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2855;
                                int deadChar = KeyEvent.getDeadChar(0, 0) + 13;
                                byte length2 = (byte) $$c.length;
                                byte b7 = (byte) (length2 - 5);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAxisFromString, fadingEdgeLength, deadChar, -1529949196, false, $$g(length2, b7, (byte) (b7 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                            }
                            ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            if (bArr4 != null) {
                                int length3 = bArr4.length;
                                byte[] bArr5 = new byte[length3];
                                for (int i10 = 0; i10 < length3; i10++) {
                                    bArr5[i10] = (byte) (((long) bArr4[i10]) ^ 3046761265686732006L);
                                }
                                bArr4 = bArr5;
                            }
                            if (bArr4 != null) {
                                int i11 = $11 + 95;
                                $10 = i11 % 128;
                                int i12 = i11 % 2;
                                z = true;
                            } else {
                                z = false;
                            }
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                            while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                                if (z) {
                                    int i13 = $10 + 39;
                                    $11 = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i14 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i14;
                                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i14]) & 3046761265686732006L)) >> s)) ^ b2));
                                    } else {
                                        byte[] bArr7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i15 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i15 - 1;
                                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i15]) ^ 3046761265686732006L)) + s)) ^ b2));
                                    }
                                } else {
                                    short[] sArr = d;
                                    int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i16]) ^ 3046761265686732006L)) + s)) ^ b2));
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

                /*  JADX ERROR: Type inference failed
                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 282281. Try increasing type updates limit count.
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                    */
                public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(android.content.Context r67, java.lang.String[] r68, int r69, int r70, int r71) {
                    /*
                        Method dump skipped, instruction units count: 28228
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.invalidateDrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(android.content.Context, java.lang.String[], int, int, int):java.lang.Object[]");
                }

                static {
                    byte[] bArr = new byte[571];
                    System.arraycopy("\u0018ªï¼þÖ´ªÎ\rjå¶/Ø\u0086\u0010²g\u0092\u000ev\u0098\u0017\u0090\rk\u009ajbH\u0083}CDÜlr\u009ed{g\u009b,´\u0092|\u009eá^á·c\u0092\u008f\u009c\u00adÑRWU\u0014C\u0010ägj\u0002~\u0012n\u0014\u0099\u0015t\u000e\u000es\u0016\u0007\u001dg\fHgjbÚª\u001a\blb\u0003gcÚRh\nl+-/\u00063?EÍuÑsÉ\u007fn«\u007f|w©hjc\u000b{}ÉÃrÎÒ;³ÝkÉ;\fÿ[Ò÷\tòþ9óë\u0006\u0003&Å\u0005ò\u0085¹Á«\u0086¡ÛË©ÊÎ¹Ï×\u0086¿f·\u000e\u0086¿\u0086\u0097\u0017\u0087±ÕÏ¶ÊÖGÿÑ·Õb\u0018l\u0015l0H\u0012c2\u00143?\u0004>6\u0007\u000eçS2\u0014 \u000e(\n3R _®l\u0082®¤hKàY¤\u001f\u0092´J¨æ\u0006*=ï\u0006é+Ãáï[Á\b/Þ£ß¡¦û\u0085ÍÇ\u0083¥}{\u008f\u009d}\u0081x\u0090£O{Ì\u0004\u0080\u0097\u007f\u0080y\u008a³TED{\u0088p\u008b´GÜ\u008dhMS\u008fkSÈYü='ß/ÉÓÀ\u0005Ö's§Ú@i¡q£\u00adØ\u0097¦i\u009bI\u0098QDA¢\u007fngVO\u009d\b\u0089gS\u009b.\u0093u{\u0099éýê÷íõåÔ\u0001ûèV¹L\u0086N¾oXÇZ»\u0082CJ¼\u0001\u0080\u0082V¾{\u0096´^°þð.áÇÆ\n\b\u001cÙ\bùåXZ\bIà$â_ãBÄÄ3âUõ\"\u0019&,Ä4òøÍ\u0018=!¸`Äõ-Ä/þé0# !ü4ñHµ\u0087CUµA¸°ELüüY\u001füDìBLZ_©yK÷ñPüð¹\u0001ëI÷\u0002\u001a2\u0010\u0012\u0018[\u0015\u0002Þ¬\u0092§ÌÝûÚ£ËÑ®Í\u0011cÈÈ·¤:\u009dÞÈµÉ;a¡ÍÉÍ·×§\ftË¥ÖÕ\rb§Ùù¤Ý®ûßÁíRææææææææææææææææææææææææææææææææææ".getBytes("ISO-8859-1"), 0, bArr, 0, 571);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bArr;
                    asBinder = new int[]{271140536, -312433845, 1504350212, 1546766833, 1920188131, 393578749, 246104120, -721904759, 226774654, -1515579232, 1456490847, -379535222, 344862223, -1188031639, -739580889, 36383716, 966641569, 566780414};
                }

                private static String $$g(byte b2, byte b3, short s) {
                    int i2 = s * 4;
                    int i3 = 122 - b2;
                    byte[] bArr = $$c;
                    int i4 = b3 + 4;
                    byte[] bArr2 = new byte[1 - i2];
                    int i5 = 0 - i2;
                    int i6 = -1;
                    if (bArr == null) {
                        i3 += -i4;
                        i4 = i4;
                        i6 = -1;
                    }
                    while (true) {
                        int i7 = i6 + 1;
                        bArr2[i7] = (byte) i3;
                        if (i7 == i5) {
                            return new String(bArr2, 0);
                        }
                        int i8 = i4 + 1;
                        i3 += -bArr[i8];
                        i4 = i8;
                        i6 = i7;
                    }
                }
            });
            int i2 = RemoteActionCompatParcelizer + 97;
            INotificationSideChannelDefault = i2 % 128;
            int i3 = i2 % 2;
        }
        Button button = activityNonRegisterCompanyComplaintBindingINotificationSideChannelStub.btnSendComplaintNonRegisteredCompany;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: onBoundsChange
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.b, activityNonRegisterCompanyComplaintBindingINotificationSideChannelStub, (View) obj};
                return (Unit) NonRegisterCompanyComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1179884253, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1179884249, objArr, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        }));
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 69;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1119079443, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 1100130912, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 680426487, 1119079443, new Object[]{this}, Camera2CameraControlImplCameraCaptureCallbackSetExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1119079443, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 1100130912, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 680426487, 1119079443, new Object[]{this}, Camera2CameraControlImplCameraCaptureCallbackSetExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        int i3 = 48 / 0;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        final NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity = (NonRegisterCompanyComplaintActivity) objArr[0];
        int i = 2 % 2;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        ((containsZslUseCase) nonRegisterCompanyComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).f879a.observe(nonRegisterCompanyComplaintActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: scheduleDrawable
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NonRegisterCompanyComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objectRef, nonRegisterCompanyComplaintActivity, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = RemoteActionCompatParcelizer + 77;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        char[] cArr3;
        int length;
        char[] cArr4;
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr5 = cancel;
        if (cArr5 != null) {
            int i4 = $10 + 11;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr5.length;
                cArr4 = new char[length];
            } else {
                length = cArr5.length;
                cArr4 = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 9;
                $10 = i6 % 128;
                int i7 = i6 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr5[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 1;
                        byte b2 = (byte) (b - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - (ViewConfiguration.getEdgeSlop() >> 16)), (ViewConfiguration.getTapTimeout() >> 16) + 2994, (KeyEvent.getMaxKeyCode() >> 16) + 17, 1182129903, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr4[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr5 = cArr4;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(cancelAll)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            char c = '0';
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.keyCodeFromString("") + 43325), 253 - (ViewConfiguration.getTapTimeout() >> 16), 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            int i8 = 1687675375;
            if (!INotificationSideChannelStub) {
                if (!INotificationSideChannel) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                    char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr5[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                    }
                    objArr[0] = new String(cArr6);
                    return;
                }
                int i9 = $11 + 5;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
                } else {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                }
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr5[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (AndroidCharacter.getMirror(c) + 33554), 3085 - TextUtils.indexOf("", "", 0, 0), 26 - (ViewConfiguration.getLongPressTimeout() >> 16), -2146875848, false, $$i(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    c = '0';
                }
                objArr[0] = new String(cArr2);
                return;
            }
            int i10 = $10 + 97;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                cArr3 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            } else {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                cArr3 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            }
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i11 = $10 + 79;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr3[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr5[bArr[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 / getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] * i] >>> iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33603 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 3085 - View.MeasureSpec.makeMeasureSpec(0, 0), Process.getGidForName("") + 27, -2146875848, false, $$i(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                } else {
                    cArr3[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr5[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33602 - (ViewConfiguration.getJumpTapTimeout() >> 16)), Color.rgb(0, 0, 0) + 16780301, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25, -2146875848, false, $$i(b7, b8, b8), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                }
                i8 = 1687675375;
            }
            objArr[0] = new String(cArr3);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements getStringOrNull.b {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            NonRegisterCompanyComplaintActivity.this.d_();
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        Button button = INotificationSideChannelStub().btnSendComplaintNonRegisteredCompany;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(false);
        int i4 = INotificationSideChannelDefault + 53;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 75;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Button button = INotificationSideChannelStub().btnSendComplaintNonRegisteredCompany;
            Intrinsics.checkNotNullExpressionValue(button, "");
            Button button2 = button;
            Intrinsics.checkNotNullParameter(button2, "");
            button2.setEnabled(true);
            return;
        }
        Button button3 = INotificationSideChannelStub().btnSendComplaintNonRegisteredCompany;
        Intrinsics.checkNotNullExpressionValue(button3, "");
        Button button4 = button3;
        Intrinsics.checkNotNullParameter(button4, "");
        button4.setEnabled(true);
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int i = 2 % 2;
        ActivityNonRegisterCompanyComplaintBinding activityNonRegisterCompanyComplaintBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputLayout textInputLayout = activityNonRegisterCompanyComplaintBindingINotificationSideChannelStub.tilCompanyName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_company_name_empty);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        TextInputLayout textInputLayout2 = activityNonRegisterCompanyComplaintBindingINotificationSideChannelStub.tilCompanyLocation;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string2 = getString(R.string.error_choose_company_location);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string2))));
        TextInputLayout textInputLayout3 = activityNonRegisterCompanyComplaintBindingINotificationSideChannelStub.tilCompanyAddress;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string3 = getString(R.string.error_company_address_empty);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string3))));
        int i2 = RemoteActionCompatParcelizer + 87;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 43;
        RemoteActionCompatParcelizer = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i3 = INotificationSideChannelDefault + 17;
            RemoteActionCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int p0, int p1, Intent p2) {
        int i = 2 % 2;
        if (p0 == 239 && p1 == -1) {
            AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.Companion companion = AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.INSTANCE;
            Intrinsics.checkNotNull(p2);
            Place placeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p2);
            if (placeTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                this.TuitionPaymentFragmentbindingInflater1 = placeTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                EditText editText = INotificationSideChannelStub().tilCompanyLocation.getEditText();
                if (editText != null) {
                    editText.setText(placeTuitionPaymentFragmentspecialinlinedviewModeldefault3.getName());
                    int i2 = INotificationSideChannelDefault + 71;
                    RemoteActionCompatParcelizer = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 4 / 3;
                    }
                }
            }
        } else if (p1 == -1 && p0 == 553 && p2 != null) {
            int i4 = INotificationSideChannelDefault + 1;
            RemoteActionCompatParcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                String str = getCaptureNode.b(p2).TuitionPaymentFragmentbindingInflater1;
                Intrinsics.checkNotNullExpressionValue(str, "");
                b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(this), null, null, new NonRegisterCompanyComplaintActivity$compressAndShowImage$1(this, str, null), 3, null);
            }
        }
        super.onActivityResult(p0, p1, p2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:17:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:19:0x0189  */
    /* JADX WARN: Code duplicated, block: B:22:0x01e8 A[Catch: all -> 0x09f3, TryCatch #1 {all -> 0x09f3, blocks: (B:20:0x01d4, B:22:0x01e8, B:23:0x0216, B:59:0x0719, B:61:0x072d, B:62:0x0755, B:64:0x0787, B:65:0x07f2), top: B:100:0x01d4 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0230  */
    /* JADX WARN: Code duplicated, block: B:31:0x0300  */
    /* JADX WARN: Code duplicated, block: B:34:0x034c  */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object[] objArrB$7879113;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 == 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29944);
                int i3 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1754;
                int iIndexOf = 23 - TextUtils.indexOf("", "", 0);
                byte b = $$a[7];
                short s = b;
                Object[] objArr2 = new Object[1];
                c(b, s, (byte) (s | 37), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(edgeSlop, i3, iIndexOf, 986134021, false, (String) objArr2[0], null);
            }
            int i4 = 28 / 0;
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null) != -1) {
                int i5 = INotificationSideChannelDefault + 85;
                RemoteActionCompatParcelizer = i5 % 128;
                int i6 = i5 % 2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char minimumFlingVelocity = (char) (29944 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    int iKeyCodeFromString = 1755 - KeyEvent.keyCodeFromString("");
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 23;
                    byte b2 = $$a[7];
                    Object[] objArr3 = new Object[1];
                    c(b2, (short) (b2 | 37), (byte) 52, objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(minimumFlingVelocity, iKeyCodeFromString, offsetBefore, 1599039318, false, (String) objArr3[0], null);
                }
                Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrB$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
                int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
                int i8 = 28695712 + (((-671247490) | i7) * (-381)) + (((~((~i7) | (-728133258))) | 326373962) * 381) + 1276557018;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArrB$7879113[3])[0] = i10 ^ (i10 << 5);
            } else {
                Object[] objArr5 = new Object[1];
                e(null, null, 128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new byte[]{-115, -116, -117, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                e(null, null, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new byte[]{-116, -113, -109, -110, -111, -118, -126, -112, -119, -117, -114, -117, -122, -116, -113, -114}, objArr6);
                int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr7 = {-1543242704};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (42049 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), Color.rgb(0, 0, 0) + 16778942, Process.getGidForName("") + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrB$7879113 = onScroll.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr7), -1065665827, false, true);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char minimumFlingVelocity2 = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29944);
                        int iRed = 1755 - Color.red(0);
                        int absoluteGravity = 23 - Gravity.getAbsoluteGravity(0, 0);
                        byte b3 = $$a[7];
                        Object[] objArr8 = new Object[1];
                        c(b3, (short) (b3 | 37), (byte) 52, objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity2, iRed, absoluteGravity, 1599039318, false, (String) objArr8[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrB$7879113);
                    try {
                        Object[] objArr9 = new Object[1];
                        e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr9);
                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_expiration_message).substring(3, 4).codePointAt(0) + 30, new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr10);
                        long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c = (char) (29945 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                            int i11 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1754;
                            int packedPositionGroup = 23 - ExpandableListView.getPackedPositionGroup(0L);
                            byte b4 = $$a[7];
                            Object[] objArr11 = new Object[1];
                            c(b4, (short) (b4 | 89), (byte) 52, objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, i11, packedPositionGroup, 1596667560, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 29944);
                            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1755;
                            int i12 = 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            byte b5 = $$a[7];
                            short s2 = b5;
                            Object[] objArr12 = new Object[1];
                            c(b5, s2, (byte) (s2 | 37), objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates, offsetAfter, i12, 986134021, false, (String) objArr12[0], null);
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
                char c2 = (char) (29944 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                int iRgb = Color.rgb(0, 0, 0) + 16778971;
                int i13 = 24 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                byte b6 = $$a[7];
                short s3 = b6;
                Object[] objArr13 = new Object[1];
                c(b6, s3, (byte) (s3 | 37), objArr13);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, iRgb, i13, 986134021, false, (String) objArr13[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
                int i14 = INotificationSideChannelDefault + 85;
                RemoteActionCompatParcelizer = i14 % 128;
                int i15 = i14 % 2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char minimumFlingVelocity3 = (char) (29944 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    int iKeyCodeFromString2 = 1755 - KeyEvent.keyCodeFromString("");
                    int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 23;
                    byte b7 = $$a[7];
                    Object[] objArr14 = new Object[1];
                    c(b7, (short) (b7 | 37), (byte) 52, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(minimumFlingVelocity3, iKeyCodeFromString2, offsetBefore2, 1599039318, false, (String) objArr14[0], null);
                }
                Object[] objArr15 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrB$7879113 = new Object[]{new int[]{((int[]) objArr15[0])[0]}, new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[1], (String[]) objArr15[4]};
                int i16 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
                int i17 = 28695712 + (((-671247490) | i16) * (-381)) + (((~((~i16) | (-728133258))) | 326373962) * 381) + 1276557018;
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArrB$7879113[3])[0] = i19 ^ (i19 << 5);
            } else {
                Object[] objArr16 = new Object[1];
                e(null, null, 128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new byte[]{-115, -116, -117, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr16);
                Class<?> cls3 = Class.forName((String) objArr16[0]);
                Object[] objArr17 = new Object[1];
                e(null, null, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new byte[]{-116, -113, -109, -110, -111, -118, -126, -112, -119, -117, -114, -117, -122, -116, -113, -114}, objArr17);
                int iIntValue2 = ((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr18 = {-1543242704};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (42049 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), Color.rgb(0, 0, 0) + 16778942, Process.getGidForName("") + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = onScroll.b$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr18), -1065665827, false, true);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char minimumFlingVelocity4 = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29944);
                    int iRed2 = 1755 - Color.red(0);
                    int absoluteGravity2 = 23 - Gravity.getAbsoluteGravity(0, 0);
                    byte b8 = $$a[7];
                    Object[] objArr19 = new Object[1];
                    c(b8, (short) (b8 | 37), (byte) 52, objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity4, iRed2, absoluteGravity2, 1599039318, false, (String) objArr19[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrB$7879113);
                Object[] objArr20 = new Object[1];
                e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr20);
                Class<?> cls4 = Class.forName((String) objArr20[0]);
                Object[] objArr110 = new Object[1];
                e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_expiration_message).substring(3, 4).codePointAt(0) + 30, new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr110);
                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr110[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c3 = (char) (29945 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int i110 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1754;
                    int packedPositionGroup2 = 23 - ExpandableListView.getPackedPositionGroup(0L);
                    byte b9 = $$a[7];
                    Object[] objArr111 = new Object[1];
                    c(b9, (short) (b9 | 89), (byte) 52, objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, i110, packedPositionGroup2, 1596667560, false, (String) objArr111[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cCombineMeasuredStates2 = (char) (View.combineMeasuredStates(0, 0) + 29944);
                    int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 1755;
                    int i111 = 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    byte b10 = $$a[7];
                    short s4 = b10;
                    Object[] objArr112 = new Object[1];
                    c(b10, s4, (byte) (s4 | 37), objArr112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates2, offsetAfter2, i111, 986134021, false, (String) objArr112[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf4);
            }
        }
        int i20 = ((int[]) objArrB$7879113[1])[0];
        int i21 = ((int[]) objArrB$7879113[0])[0];
        if (i21 == i20) {
            int i22 = RemoteActionCompatParcelizer + 1;
            INotificationSideChannelDefault = i22 % 128;
            int i23 = i22 % 2;
            int i24 = ((int[]) objArrB$7879113[3])[0];
            Object[] objArr21 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i25 = ~(696593835 | iIdentityHashCode);
            int i26 = ~iIdentityHashCode;
            int i27 = i24 + 1096852035 + ((i25 | (~((-159646731) | i26))) * (-406)) + ((~(1068842991 | i26)) * (-406)) + (((~(iIdentityHashCode | (-909196262))) | (~((-696593836) | i26))) * 406);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr21[3])[0] = i29 ^ (i29 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$7879113[4];
            if (strArr != null) {
                for (String str : strArr) {
                    int i30 = INotificationSideChannelDefault + 103;
                    RemoteActionCompatParcelizer = i30 % 128;
                    int i31 = i30 % 2;
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i21 / (((i21 - 1) * i21) % 2), 0).show();
            int i32 = ((int[]) objArrB$7879113[3])[0];
            Object[] objArr22 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i33 = ~iIdentityHashCode2;
            int i34 = i32 + (-1758010711) + (((~(i33 | 381869558)) | (~(169267132 | i33)) | (-517398527)) * 464) + (((-348131395) | iIdentityHashCode2) * (-464)) + (((~(iIdentityHashCode2 | 381869558)) | (-517398527)) * 464);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr22[3])[0] = i36 ^ (i36 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char minimumFlingVelocity5 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int i37 = 1031 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            byte b11 = $$a[7];
            Object[] objArr23 = new Object[1];
            c(b11, (short) (b11 | 141), (byte) 52, objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(minimumFlingVelocity5, i37, scrollBarFadeDuration, 1357589585, false, (String) objArr23[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr24 = new Object[1];
        e(null, null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr24);
        Class<?> cls5 = Class.forName((String) objArr24[0]);
        Object[] objArr25 = new Object[1];
        e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.empty_challenge_token).substring(3, 4).codePointAt(0) + 30, new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr25);
        long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr25[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char absoluteGravity3 = (char) Gravity.getAbsoluteGravity(0, 0);
            int iIndexOf2 = 1031 - TextUtils.indexOf("", "", 0, 0);
            int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0', 0);
            byte b12 = $$a[7];
            Object[] objArr26 = new Object[1];
            c(b12, (short) (b12 | 37), (byte) 52, objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(absoluteGravity3, iIndexOf2, iLastIndexOf, 1344079056, false, (String) objArr26[0], null);
        }
        if (j == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                int i38 = 1030 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int gidForName = 14 - Process.getGidForName("");
                byte[] bArr = $$a;
                byte b13 = bArr[5];
                Object[] objArr27 = new Object[1];
                c(b13, (short) (b13 | 192), bArr[7], objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cNormalizeMetaState, i38, gidForName, 632103528, false, (String) objArr27[0], null);
            }
            Object[] objArr28 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i39 = ((int[]) objArr28[3])[0];
            int i40 = ((int[]) objArr28[1])[0];
            String[] strArr2 = (String[]) objArr28[0];
            int i41 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 830497420;
            int i42 = ~i41;
            int i43 = (((1807211044 + ((528839724 | i42) * (-757))) + ((~(536313070 | i41)) * 1514)) + (((~(i41 | (-7473347))) | ((~(i42 | 284559554)) | 251753516)) * 757)) - 532773752;
            int i44 = (i43 << 13) ^ i43;
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArr[2])[0] = i45 ^ (i45 << 5);
        } else {
            Object[] objArr29 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_gross_amount_required).substring(5, 6).codePointAt(0) + 95, new byte[]{-115, -116, -117, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr29);
            Class<?> cls6 = Class.forName((String) objArr29[0]);
            Object[] objArr30 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 116, new byte[]{-116, -113, -109, -110, -111, -118, -126, -112, -119, -117, -114, -117, -122, -116, -113, -114}, objArr30);
            int iIntValue3 = ((Integer) cls6.getMethod((String) objArr30[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr31 = {-1543242704};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 46038), 1134 - View.MeasureSpec.getSize(0), ImageFormat.getBitsPerPixel(0) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr32 = {Integer.valueOf(iIntValue3), 0, -532773752, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr31), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char size = (char) View.MeasureSpec.getSize(0);
                int iMakeMeasureSpec = 1031 - View.MeasureSpec.makeMeasureSpec(0, 0);
                int iAxisFromString = 14 - MotionEvent.axisFromString("");
                byte b14 = $$a[7];
                Object[] objArr33 = new Object[1];
                c(b14, (short) (b14 | 141), (byte) 52, objArr33);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(size, iMakeMeasureSpec, iAxisFromString, 1298546779, false, (String) objArr33[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - View.MeasureSpec.getMode(0)), (ViewConfiguration.getTapTimeout() >> 16) + 1117, Color.rgb(0, 0, 0) + 16777233), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr32);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char trimmedLength = (char) TextUtils.getTrimmedLength("");
                int i46 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1030;
                int i47 = 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                byte[] bArr2 = $$a;
                byte b15 = bArr2[5];
                Object[] objArr34 = new Object[1];
                c(b15, (short) (b15 | 192), bArr2[7], objArr34);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(trimmedLength, i46, i47, 632103528, false, (String) objArr34[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr35 = new Object[1];
                e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.maintenance_message).substring(0, 38).length() + 89, new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr35);
                Class<?> cls7 = Class.forName((String) objArr35[0]);
                Object[] objArr36 = new Object[1];
                e(null, null, View.MeasureSpec.getMode(0) + 127, new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr36);
                long jLongValue4 = ((Long) cls7.getDeclaredMethod((String) objArr36[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int iIndexOf3 = TextUtils.indexOf("", "") + 1031;
                    int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0) + 16;
                    byte b16 = $$a[7];
                    Object[] objArr37 = new Object[1];
                    c(b16, (short) (b16 | 37), (byte) 52, objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(keyRepeatTimeout, iIndexOf3, iIndexOf4, 1344079056, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int minimumFlingVelocity6 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1031;
                    int iLastIndexOf2 = 14 - TextUtils.lastIndexOf("", '0', 0);
                    byte b17 = $$a[7];
                    Object[] objArr38 = new Object[1];
                    c(b17, (short) (b17 | 141), (byte) 52, objArr38);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cIndexOf, minimumFlingVelocity6, iLastIndexOf2, 1357589585, false, (String) objArr38[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf6);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 == null) {
                throw null;
            }
            int i48 = INotificationSideChannelDefault + 97;
            RemoteActionCompatParcelizer = i48 % 128;
            int i49 = i48 % 2;
            for (String str2 : strArr3) {
                arrayList2.add(str2);
            }
            throw null;
        }
        Object[] objArr39 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i50 = ((int[]) objArr[2])[0];
        int i51 = ((int[]) objArr[3])[0];
        int i52 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i53 = (~((-28795129) | iIdentityHashCode3)) | 9437296;
        int i54 = ~iIdentityHashCode3;
        int i55 = i50 + 89003845 + ((i53 | (~(234842873 | i54))) * 886) + (((~(i54 | 28795128)) | 215485041) * (-1772)) + ((~(i54 | 215485041)) * 886);
        int i56 = (i55 << 13) ^ i55;
        int i57 = i56 ^ (i56 >>> 17);
        ((int[]) objArr39[2])[0] = i57 ^ (i57 << 5);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws IllegalAccessException {
        NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity = (NonRegisterCompanyComplaintActivity) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 33;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i5 = ~iMaxMemory;
        if (i4 != (-574903270) + (((~(i5 | (-963444573))) | 133457029) * (-1042)) + (((-963444573) | iMaxMemory) * 521) + (((~(iMaxMemory | (-133457030))) | 110100609 | (~(i5 | (-940088153)))) * 521)) {
            throw null;
        }
        int i6 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = ~((int) SystemClock.elapsedRealtime());
        if (i6 != 1899619900 + (((~(i7 | 606155146)) | (-1975071707)) * (-160)) + (((~(i7 | (-1972900819))) | 606155146) * 160)) {
            throw new RuntimeException("-1512966256");
        }
        super.onResume();
        int i8 = RemoteActionCompatParcelizer + 69;
        INotificationSideChannelDefault = i8 % 128;
        if (i8 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            if (i3 != (-971593580) + (((~((-658507850) | elapsedCpuTime)) | (~((~elapsedCpuTime) | (-1488495393)))) * (-318)) + (((~(658970703 | elapsedCpuTime)) | (-2147466096)) * (-318)) + (((~(elapsedCpuTime | (-658970704))) | 1488958246) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) {
                throw null;
            }
        } else {
            int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.second).substring(1, 2).codePointAt(0) - 267010348;
            int i5 = ~((-1051966011) | iCodePointAt);
            int i6 = ~iCodePointAt;
            if (i4 != 1438476680 + ((i5 | (~((-1881953554) | i6))) * (-1808)) + (((~((-244558379) | iCodePointAt)) | (~(i6 | (-1074545922)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iCodePointAt | 1881953553)) | 807407632 | (~(1051966010 | i6))) * TypedValues.Custom.TYPE_BOOLEAN)) {
                throw null;
            }
        }
        int i7 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i8 = (int) Runtime.getRuntime().totalMemory();
        int i9 = 110604700 + (((~((-498623092) | i8)) | 469787233 | (~((-2080432874) | i8))) * (-880));
        int i10 = (~((-498623092) | (~i8))) | 2080432873;
        int i11 = ~(i8 | 498623091);
        if (i7 != i9 + ((i10 | i11) * (-880)) + (i11 * 880)) {
            throw new RuntimeException("1259812093");
        }
        super.onStart();
        int i12 = INotificationSideChannelDefault + 59;
        RemoteActionCompatParcelizer = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != 1725060192 + (((~(iIdentityHashCode | 832592214)) | 1662579757) * (-668)) + ((832592214 | (~(1662579757 | iIdentityHashCode))) * 1336) + ((iIdentityHashCode | 1941503359) * 668)) {
            throw null;
        }
        int i5 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1040196518;
        int i7 = ~i6;
        int i8 = (~((-1849195466) | i7)) | 1144533576 | (~(729860499 | i7));
        if (i5 != 1561722320 + (((~(i6 | (-25198611))) | i8) * 590) + (i8 * (-1180)) + (((~((-729860500) | i7)) | (~(i7 | 1849195465))) * 590)) {
            int i9 = (-1244153292) % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i10 = RemoteActionCompatParcelizer + 97;
        INotificationSideChannelDefault = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (i3 == 0) {
            activityResult.getResultCode();
            throw null;
        }
        if (activityResult.getResultCode() == -1) {
            b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(nonRegisterCompanyComplaintActivity), null, null, new NonRegisterCompanyComplaintActivity$compressAndShowImage$1(nonRegisterCompanyComplaintActivity, nonRegisterCompanyComplaintActivity.asBinder, null), 3, null);
        }
        int i4 = RemoteActionCompatParcelizer + 87;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        Editable text;
        double d;
        NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity = (NonRegisterCompanyComplaintActivity) objArr[0];
        ActivityNonRegisterCompanyComplaintBinding activityNonRegisterCompanyComplaintBinding = (ActivityNonRegisterCompanyComplaintBinding) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[2], "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_non_registered_company_complaint", "submit_non_registered_company_complaint"));
        Intrinsics.checkNotNullParameter(nonRegisterCompanyComplaintActivity, "");
        Intrinsics.checkNotNullParameter("submit_non_registered_company_complaint", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("submit_non_registered_company_complaint", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("submit_non_registered_company_complaint", mapMutableMapOf);
        if (nonRegisterCompanyComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            int i2 = RemoteActionCompatParcelizer + 81;
            INotificationSideChannelDefault = i2 % 128;
            int i3 = i2 % 2;
            TextView textView = activityNonRegisterCompanyComplaintBinding.tvCompanyPhotoError;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
        } else {
            TextView textView2 = activityNonRegisterCompanyComplaintBinding.tvCompanyPhotoError;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
            EditText editText = nonRegisterCompanyComplaintActivity.INotificationSideChannelStub().tilCompanyName.getEditText();
            String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
            EditText editText2 = nonRegisterCompanyComplaintActivity.INotificationSideChannelStub().tilCompanyAddress.getEditText();
            if (editText2 != null) {
                int i4 = INotificationSideChannelDefault + 103;
                RemoteActionCompatParcelizer = i4 % 128;
                if (i4 % 2 != 0) {
                    text = editText2.getText();
                    int i5 = 12 / 0;
                } else {
                    text = editText2.getText();
                }
            } else {
                text = null;
            }
            String strValueOf2 = String.valueOf(text);
            Place place = nonRegisterCompanyComplaintActivity.TuitionPaymentFragmentbindingInflater1;
            if (place == null) {
                int i6 = RemoteActionCompatParcelizer + 113;
                INotificationSideChannelDefault = i6 % 128;
                if (i6 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                place = null;
            }
            LatLng latLng = place.getLatLng();
            if (latLng != null) {
                int i7 = RemoteActionCompatParcelizer + 25;
                INotificationSideChannelDefault = i7 % 128;
                int i8 = i7 % 2;
                d = latLng.latitude;
            } else {
                d = 0.0d;
            }
            Place place2 = nonRegisterCompanyComplaintActivity.TuitionPaymentFragmentbindingInflater1;
            if (place2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                place2 = null;
            }
            LatLng latLng2 = place2.getLatLng();
            double d2 = latLng2 != null ? latLng2.longitude : 0.0d;
            User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) nonRegisterCompanyComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            String str = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null;
            if (str == null) {
                str = "";
            }
            File file = nonRegisterCompanyComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (file == null) {
                int i9 = INotificationSideChannelDefault + 87;
                RemoteActionCompatParcelizer = i9 % 128;
                if (i9 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                file = null;
            }
            ReportUnregisteredCompanyRequest reportUnregisteredCompanyRequest = new ReportUnregisteredCompanyRequest(strValueOf, d, d2, strValueOf2, str, file);
            final containsZslUseCase containszslusecase = (containsZslUseCase) nonRegisterCompanyComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            Intrinsics.checkNotNullParameter(reportUnregisteredCompanyRequest, "");
            MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = containszslusecase.f879a;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(containszslusecase.asBinder.TuitionPaymentFragmentbindingInflater1(reportUnregisteredCompanyRequest)));
            final Function1 function1 = new Function1() { // from class: areStreamUseCasesAvailable
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return containsZslUseCase.TuitionPaymentFragmentspecialinlinedviewModeldefault1(containszslusecase, (BaseModel) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: isEligibleCaptureType
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: isStreamUseCaseSupported
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return containsZslUseCase.TuitionPaymentFragmentspecialinlinedviewModeldefault1(containszslusecase, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: isValidCamera2InteropOverride
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            containszslusecase.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(Ref.ObjectRef objectRef, NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 73;
        INotificationSideChannelDefault = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            objectRef.element = "loading_request_non_registered_company_result";
            nonRegisterCompanyComplaintActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            objectRef.element = "success_request_non_registered_company_result";
            nonRegisterCompanyComplaintActivity.IconCompatParcelizer();
            getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
            String string = nonRegisterCompanyComplaintActivity.getString(R.string.label_success);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = nonRegisterCompanyComplaintActivity.getString(R.string.label_complaint_sent);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String string3 = nonRegisterCompanyComplaintActivity.getString(R.string.action_ok_thanks);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_success, string, string2, string3, null, 112);
            nonRegisterCompanyComplaintActivity.onTransact = getstringornullB;
            if (getstringornullB != null) {
                FragmentManager supportFragmentManager = nonRegisterCompanyComplaintActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    int i4 = RemoteActionCompatParcelizer + 19;
                    INotificationSideChannelDefault = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
            getStringOrNull getstringornull = nonRegisterCompanyComplaintActivity.onTransact;
            if (getstringornull != null) {
                getstringornull.INotificationSideChannel = nonRegisterCompanyComplaintActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i6 = i2 + 111;
            INotificationSideChannelDefault = i6 % 128;
            int i7 = i6 % 2;
            objectRef.element = "failure_request_non_registered_company_result";
            nonRegisterCompanyComplaintActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        }
        String str = (String) objectRef.element;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("param_menu_complaint_non_registered_company", objectRef.element));
        Intrinsics.checkNotNullParameter(nonRegisterCompanyComplaintActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity = (NonRegisterCompanyComplaintActivity) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT >= 33) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.resolveActivity(nonRegisterCompanyComplaintActivity.getPackageManager());
            Application application = nonRegisterCompanyComplaintActivity.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "");
            File fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(application);
            Uri uriForFile = FileProvider.getUriForFile(nonRegisterCompanyComplaintActivity, "com.bpjstku.provider", fileTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            Intrinsics.checkNotNullExpressionValue(uriForFile, "");
            nonRegisterCompanyComplaintActivity.asBinder = fileTuitionPaymentFragmentspecialinlinedviewModeldefault1.getAbsolutePath();
            intent.putExtra("output", uriForFile);
            nonRegisterCompanyComplaintActivity.asInterface.launch(intent);
        } else {
            updateFileExif updatefileexif = new updateFileExif();
            NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity2 = nonRegisterCompanyComplaintActivity;
            Intent intent2 = new Intent(nonRegisterCompanyComplaintActivity2, (Class<?>) ImagePickerActivity.class);
            intent2.putExtra("CameraOnlyConfig", updatefileexif.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            nonRegisterCompanyComplaintActivity2.startActivityForResult(intent2, 553);
            int i4 = RemoteActionCompatParcelizer + 95;
            INotificationSideChannelDefault = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ outputFormatToAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault2(NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity) {
        int i = 2 % 2;
        outputFormatToAudioProfile outputformattoaudioprofile = new outputFormatToAudioProfile(nonRegisterCompanyComplaintActivity);
        int i2 = RemoteActionCompatParcelizer + 103;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        return outputformattoaudioprofile;
    }

    public static /* synthetic */ Unit b(NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity, Boolean bool) {
        int i = 2 % 2;
        if (!bool.booleanValue()) {
            int i2 = INotificationSideChannelDefault + 109;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            AutoValue_LifecycleCameraRepository_Key.b(nonRegisterCompanyComplaintActivity, "Izin akses lokasi atau gallery tidak diberikan");
        }
        Unit unit = Unit.INSTANCE;
        int i4 = INotificationSideChannelDefault + 53;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity, View view) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 73;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity2 = nonRegisterCompanyComplaintActivity;
            Intrinsics.checkNotNullParameter(nonRegisterCompanyComplaintActivity2, "");
            ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
            if (!ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                AutoValue_LifecycleCameraRepository_Key.b(nonRegisterCompanyComplaintActivity2, "Aktifkan lokasi untuk mencari lokasi perusahaan Anda.");
                int i4 = INotificationSideChannelDefault + 117;
                RemoteActionCompatParcelizer = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 % 2;
                }
            } else {
                AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                String string = nonRegisterCompanyComplaintActivity.getString(R.string.android_api_key);
                Intrinsics.checkNotNullExpressionValue(string, "");
                AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.Companion companion = AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.INSTANCE;
                AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.Companion.TuitionPaymentFragmentbindingInflater1(string);
                String string2 = nonRegisterCompanyComplaintActivity.getString(R.string.maps_api_key);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.Companion companion2 = AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.INSTANCE;
                AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(string2);
                try {
                    NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity3 = nonRegisterCompanyComplaintActivity;
                    final Application application = nonRegisterCompanyComplaintActivity3.getApplication();
                    Intrinsics.checkExpressionValueIsNotNull(application, "");
                    getAudioSpec getaudiospec = getAudioSpec.INSTANCE;
                    Function1<getFocusX, Unit> function1 = new Function1<getFocusX, Unit>() { // from class: com.rtchagas.pingplacepicker.PingPlacePicker$IntentBuilder$initKoin$1
                        private static final byte[] $$c = {114, -59, 10, 31};
                        private static final int $$f = 209;
                        private static int $10 = 0;
                        private static int $11 = 1;
                        private static final byte[] $$d = {30, 17, -35, 104, -6, 23, -41, 38, 20, 0, 21, -9, -19, 35, 10, 25, 3, 11, 15, -33, 42, 5, 15, -5, 3, 9, 21, -70, 70, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -57};
                        private static final int $$e = 142;
                        private static final byte[] $$a = {67, -127, -109, 9, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
                        private static final int $$b = 0;
                        private static int $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                        private static int $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -83722298;

                        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
                        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            */
                        private static void a(int r6, byte r7, short r8, java.lang.Object[] r9) {
                            /*
                                byte[] r0 = com.rtchagas.pingplacepicker.PingPlacePicker$IntentBuilder$initKoin$1.$$a
                                int r6 = r6 + 1
                                int r8 = r8 * 14
                                int r8 = r8 + 84
                                int r7 = r7 * 52
                                int r7 = 55 - r7
                                byte[] r1 = new byte[r6]
                                r2 = 0
                                if (r0 != 0) goto L15
                                r3 = r8
                                r4 = r2
                                r8 = r6
                                goto L29
                            L15:
                                r3 = r2
                            L16:
                                int r4 = r3 + 1
                                byte r5 = (byte) r8
                                r1[r3] = r5
                                int r7 = r7 + 1
                                if (r4 != r6) goto L27
                                java.lang.String r6 = new java.lang.String
                                r6.<init>(r1, r2)
                                r9[r2] = r6
                                return
                            L27:
                                r3 = r0[r7]
                            L29:
                                int r8 = r8 + r3
                                int r8 = r8 + (-10)
                                r3 = r4
                                goto L16
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.rtchagas.pingplacepicker.PingPlacePicker$IntentBuilder$initKoin$1.a(int, byte, short, java.lang.Object[]):void");
                        }

                        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
                        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            */
                        private static void c(byte r5, byte r6, int r7, java.lang.Object[] r8) {
                            /*
                                int r5 = r5 * 27
                                int r0 = 53 - r5
                                int r6 = r6 * 31
                                int r6 = 115 - r6
                                int r7 = r7 + 4
                                byte[] r1 = com.rtchagas.pingplacepicker.PingPlacePicker$IntentBuilder$initKoin$1.$$d
                                byte[] r0 = new byte[r0]
                                int r5 = 52 - r5
                                r2 = 0
                                if (r1 != 0) goto L17
                                r4 = r6
                                r3 = r2
                                r6 = r5
                                goto L2b
                            L17:
                                r3 = r2
                            L18:
                                int r7 = r7 + 1
                                byte r4 = (byte) r6
                                r0[r3] = r4
                                if (r3 != r5) goto L27
                                java.lang.String r5 = new java.lang.String
                                r5.<init>(r0, r2)
                                r8[r2] = r5
                                return
                            L27:
                                int r3 = r3 + 1
                                r4 = r1[r7]
                            L2b:
                                int r6 = r6 + r4
                                int r6 = r6 + (-8)
                                goto L18
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.rtchagas.pingplacepicker.PingPlacePicker$IntentBuilder$initKoin$1.c(byte, byte, int, java.lang.Object[]):void");
                        }

                        /* JADX WARN: Code duplicated, block: B:48:0x01e0  */
                        /* JADX WARN: Code duplicated, block: B:49:0x01e1  */
                        private static void b(boolean z, int i6, int i7, int i8, char[] cArr, Object[] objArr) throws Throwable {
                            long j;
                            long j2;
                            Throwable cause;
                            int i9 = 2 % 2;
                            setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                            char[] cArr2 = new char[i7];
                            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                            while (true) {
                                j = 0;
                                if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i7) {
                                    break;
                                }
                                int i10 = $11 + 29;
                                $10 = i10 % 128;
                                int i11 = i10 % 2;
                                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i6 + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                int i12 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                try {
                                    Object[] objArr2 = {Integer.valueOf(cArr2[i12]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        byte b = (byte) 0;
                                        byte b2 = (byte) (b + 1);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 3290 - TextUtils.indexOf((CharSequence) "", '0', 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 30, 1199271174, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    cArr2[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        byte b3 = (byte) 0;
                                        byte b4 = b3;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 650 - TextUtils.lastIndexOf("", '0', 0), 44 - TextUtils.indexOf("", "", 0), -450685997, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
                                    }
                                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                                } catch (Throwable th) {
                                    cause = th.getCause();
                                    if (cause != null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                                cause = th.getCause();
                                if (cause != null) {
                                    throw th;
                                }
                                throw cause;
                            }
                            if (i8 > 0) {
                                int i13 = $10 + 21;
                                $11 = i13 % 128;
                                int i14 = i13 % 2;
                                setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i8;
                                char[] cArr3 = new char[i7];
                                System.arraycopy(cArr2, 0, cArr3, 0, i7);
                                System.arraycopy(cArr3, 0, cArr2, i7 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                                System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i7 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                            }
                            if (z) {
                                char[] cArr4 = new char[i7];
                                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i7) {
                                    int i15 = $11 + 19;
                                    $10 = i15 % 128;
                                    if (i15 % 2 != 0) {
                                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * i7];
                                        try {
                                            Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                byte b5 = (byte) 0;
                                                byte b6 = b5;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) - 1), 651 - Color.blue(0), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 43, -450685997, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                                            }
                                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                                            j = 0;
                                        } catch (Throwable th2) {
                                            Throwable cause2 = th2.getCause();
                                            if (cause2 == null) {
                                                throw th2;
                                            }
                                            throw cause2;
                                        }
                                    } else {
                                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i7 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                                        Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            j2 = 0;
                                            byte b7 = (byte) 0;
                                            byte b8 = b7;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 1), TextUtils.getOffsetBefore("", 0) + 651, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43, -450685997, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class});
                                        } else {
                                            j2 = 0;
                                        }
                                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                                        j = j2;
                                    }
                                }
                                cArr2 = cArr4;
                            }
                            objArr[0] = new String(cArr2);
                        }

                        /* JADX WARN: Code duplicated, block: B:26:0x0267  */
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(getFocusX getfocusx) throws Throwable {
                            Object[] objArr;
                            int i6 = 2 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0));
                                int i7 = 920 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                int gidForName = 27 - Process.getGidForName("");
                                byte b = (byte) $$b;
                                byte b2 = $$a[37];
                                Object[] objArr2 = new Object[1];
                                a(b, b2, b2, objArr2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i7, gidForName, -1048449946, false, (String) objArr2[0], null);
                            }
                            Object obj = null;
                            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                            Object[] objArr3 = new Object[1];
                            b(false, TextUtils.lastIndexOf("", '0', 0) + 264, ExpandableListView.getPackedPositionType(0L) + 22, (ViewConfiguration.getFadingEdgeLength() >> 16) + 2, new char[]{0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f'}, objArr3);
                            Class<?> cls = Class.forName((String) objArr3[0]);
                            Object[] objArr4 = new Object[1];
                            b(false, 267 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15, TextUtils.indexOf((CharSequence) "", '0', 0) + 8, new char[]{65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515}, objArr4);
                            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cMyPid = (char) (31533 - (Process.myPid() >> 22));
                                int keyRepeatTimeout = 921 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                int iAxisFromString = 27 - MotionEvent.axisFromString("");
                                int i8 = $$b;
                                Object[] objArr5 = new Object[1];
                                a((byte) (i8 | 52), $$a[37], (byte) i8, objArr5);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, keyRepeatTimeout, iAxisFromString, -778300370, false, (String) objArr5[0], null);
                            }
                            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                                int i9 = $TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
                                $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                                int i10 = i9 % 2;
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char tapTimeout = (char) (31533 - (ViewConfiguration.getTapTimeout() >> 16));
                                    int iRed = Color.red(0) + 921;
                                    int i11 = 27 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                    int i12 = $$b;
                                    byte b3 = (byte) (i12 | 37);
                                    byte b4 = (byte) i12;
                                    Object[] objArr6 = new Object[1];
                                    a(b3, b4, b4, objArr6);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, iRed, i11, -1142834547, false, (String) objArr6[0], null);
                                }
                                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                                int i13 = ((int[]) objArr7[3])[0];
                                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i13}, (String[]) objArr7[4]};
                                int i14 = ~((~System.identityHashCode(this)) | 761553505);
                                int i15 = ((((19137089 | i14) * (-970)) + 272801701) + ((i14 | 742416416) * 970)) - 9804179;
                                int i16 = (i15 << 13) ^ i15;
                                int i17 = i16 ^ (i16 >>> 17);
                                ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                            } else {
                                Object[] objArr8 = new Object[1];
                                b(true, ExpandableListView.getPackedPositionType(0L) + 263, (-16777190) - Color.rgb(0, 0, 0), 15 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{0, 65502, 65483, '\r', '\r', 65534, 65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6, 19, 6, 17}, objArr8);
                                Class<?> cls2 = Class.forName((String) objArr8[0]);
                                Object[] objArr9 = new Object[1];
                                b(false, ExpandableListView.getPackedPositionChild(0L) + 271, KeyEvent.keyCodeFromString("") + 18, 15 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b'}, objArr9);
                                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                                if (applicationContext != null) {
                                    if (!(!(applicationContext instanceof ContextWrapper))) {
                                        int i18 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
                                        $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                                        if (i18 % 2 == 0) {
                                            ((ContextWrapper) applicationContext).getBaseContext();
                                            obj.hashCode();
                                            throw null;
                                        }
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
                                b(true, 262 - Gravity.getAbsoluteGravity(0, 0), Color.red(0) + 16, (ViewConfiguration.getEdgeSlop() >> 16) + 8, new char[]{'\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5}, objArr10);
                                Class<?> cls3 = Class.forName((String) objArr10[0]);
                                Object[] objArr11 = new Object[1];
                                b(false, 266 - (ViewConfiguration.getPressedStateDuration() >> 16), '@' - AndroidCharacter.getMirror('0'), TextUtils.indexOf("", "", 0, 0) + 3, new char[]{'\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501}, objArr11);
                                try {
                                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -9804179};
                                    byte[] bArr = $$d;
                                    byte b5 = bArr[62];
                                    Object[] objArr13 = new Object[1];
                                    c((byte) (-b5), bArr[9], b5, objArr13);
                                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                                    Object[] objArr14 = new Object[1];
                                    c(bArr[9], (byte) (-bArr[62]), (byte) (bArr[15] - 1), objArr14);
                                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        char c = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                                        int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0', 0);
                                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 28;
                                        int i19 = $$b;
                                        byte b6 = (byte) (i19 | 37);
                                        byte b7 = (byte) i19;
                                        Object[] objArr16 = new Object[1];
                                        a(b6, b7, b7, objArr16);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iLastIndexOf, iResolveOpacity, -1142834547, false, (String) objArr16[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                                    try {
                                        Object[] objArr17 = new Object[1];
                                        b(false, 263 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 21 - ImageFormat.getBitsPerPixel(0), 2 - View.resolveSize(0, 0), new char[]{0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f'}, objArr17);
                                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                                        Object[] objArr18 = new Object[1];
                                        b(false, ExpandableListView.getPackedPositionGroup(0L) + 267, View.combineMeasuredStates(0, 0) + 15, 7 - Color.alpha(0), new char[]{65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515}, objArr18);
                                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                        Long lValueOf = Long.valueOf(jLongValue2);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                            char cBlue = (char) (Color.blue(0) + 31533);
                                            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 922;
                                            int i20 = 29 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                            int i21 = $$b;
                                            Object[] objArr19 = new Object[1];
                                            a((byte) (i21 | 52), $$a[37], (byte) i21, objArr19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cBlue, modifierMetaStateMask, i20, -778300370, false, (String) objArr19[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                            char keyRepeatTimeout2 = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31533);
                                            int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 922;
                                            int i22 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27;
                                            byte b8 = (byte) $$b;
                                            byte b9 = $$a[37];
                                            Object[] objArr20 = new Object[1];
                                            a(b8, b9, b9, objArr20);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatTimeout2, modifierMetaStateMask2, i22, -1048449946, false, (String) objArr20[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                        int i23 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                        $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 % 128;
                                        int i24 = i23 % 2;
                                        objArr = objArr15;
                                    } catch (Exception unused) {
                                        throw new RuntimeException();
                                    }
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            }
                            int i25 = ((int[]) objArr[1])[0];
                            int i26 = ((int[]) objArr[3])[0];
                            if (i26 == i25) {
                                int i27 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
                                $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i27 % 128;
                                int i28 = i27 % 2;
                                int i29 = ((int[]) objArr[0])[0];
                                int i30 = ((int[]) objArr[3])[0];
                                Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i30}, (String[]) objArr[4]};
                                int i31 = ~((int) SystemClock.uptimeMillis());
                                int i32 = i29 + ((((~((-987174760) | i31)) | 717690660) * (-241)) - 856889233) + (((~(i31 | (-269484100))) | 69214224) * 241);
                                int i33 = (i32 << 13) ^ i32;
                                int i34 = i33 ^ (i33 >>> 17);
                                ((int[]) objArr21[0])[0] = i34 ^ (i34 << 5);
                                int i35 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
                                $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i35 % 128;
                                int i36 = i35 % 2;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                String[] strArr = (String[]) objArr[4];
                                if (strArr != null) {
                                    int i37 = $TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
                                    $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i37 % 128;
                                    int i38 = 2;
                                    int i39 = i37 % 2;
                                    int i40 = 0;
                                    while (i40 < strArr.length) {
                                        int i41 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
                                        $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i41 % 128;
                                        if (i41 % i38 == 0) {
                                            arrayList.add(strArr[i40]);
                                            i40 += 118;
                                        } else {
                                            arrayList.add(strArr[i40]);
                                            i40++;
                                        }
                                        i38 = 2;
                                    }
                                }
                                Toast.makeText((Context) null, i26 / (((i26 - 1) * i26) % 2), 0).show();
                                int i42 = ((int[]) objArr[0])[0];
                                int i43 = ((int[]) objArr[3])[0];
                                Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i43}, (String[]) objArr[4]};
                                int iIdentityHashCode = System.identityHashCode(this);
                                int i44 = ~iIdentityHashCode;
                                int i45 = (-1340025807) + (((~(1034173080 | i44)) | 1704963) * (-1188));
                                int i46 = (~(iIdentityHashCode | (-1034173081))) | 1704963;
                                int i47 = ~(739906563 | i44);
                                int i48 = i42 + i45 + ((i46 | i47) * 594) + (((~((-1034173081) | i44)) | 295971480 | i47) * 594);
                                int i49 = (i48 << 13) ^ i48;
                                int i50 = i49 ^ (i49 >>> 17);
                                ((int[]) objArr22[0])[0] = i50 ^ (i50 << 5);
                            }
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3(getfocusx);
                            Unit unit = Unit.INSTANCE;
                            int i51 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
                            $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i51 % 128;
                            if (i51 % 2 != 0) {
                                return unit;
                            }
                            throw null;
                        }

                        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(getFocusX getfocusx) {
                            int i6 = 2 % 2;
                            Level level = Level.INFO;
                            getFocusX.Companion companion3 = getFocusX.INSTANCE;
                            getFocusX.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ZoomGestureDetectorCompanion(level));
                            accesssetAnchoredZoomStartXp.b(getfocusx, application);
                            getfocusx.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CollectionsKt.listOf((Object[]) new isLenovoTablet[]{AutoValue_MediaSpec.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), AutoValue_FileOutputOptions_FileOutputOptionsInternalBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2()}));
                            int i7 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
                            $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                            int i8 = i7 % 2;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
                        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            */
                        private static java.lang.String $$g(byte r6, int r7, short r8) {
                            /*
                                byte[] r0 = com.rtchagas.pingplacepicker.PingPlacePicker$IntentBuilder$initKoin$1.$$c
                                int r6 = r6 * 3
                                int r6 = 3 - r6
                                int r7 = r7 + 119
                                int r8 = r8 * 4
                                int r1 = 1 - r8
                                byte[] r1 = new byte[r1]
                                r2 = 0
                                int r8 = 0 - r8
                                r3 = -1
                                if (r0 != 0) goto L17
                                r7 = r6
                                r4 = r8
                                goto L2b
                            L17:
                                r5 = r7
                                r7 = r6
                                r6 = r5
                            L1a:
                                int r3 = r3 + 1
                                byte r4 = (byte) r6
                                r1[r3] = r4
                                if (r3 != r8) goto L27
                                java.lang.String r6 = new java.lang.String
                                r6.<init>(r1, r2)
                                return r6
                            L27:
                                int r7 = r7 + 1
                                r4 = r0[r7]
                            L2b:
                                int r4 = -r4
                                int r6 = r6 + r4
                                goto L1a
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.rtchagas.pingplacepicker.PingPlacePicker$IntentBuilder$initKoin$1.$$g(byte, int, short):java.lang.String");
                        }
                    };
                    getFocusX.Companion companion3 = getFocusX.INSTANCE;
                    getFocusX getfocusxTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getFocusX.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    function1.invoke(getfocusxTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    getAudioSpec.b(getfocusxTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity4 = nonRegisterCompanyComplaintActivity3;
                    int iIsGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(nonRegisterCompanyComplaintActivity4);
                    if (iIsGooglePlayServicesAvailable != 0) {
                        throw new GooglePlayServicesNotAvailableException(iIsGooglePlayServicesAvailable);
                    }
                    AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.Companion companion4 = AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.INSTANCE;
                    AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(nonRegisterCompanyComplaintActivity3.getResources().getBoolean(R.bool.enable_nearby_search));
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setClass(nonRegisterCompanyComplaintActivity4, PlacePickerActivity.class);
                    Intent intent = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i6 = RemoteActionCompatParcelizer + 3;
                    INotificationSideChannelDefault = i6 % 128;
                    if (i6 % 2 == 0) {
                        nonRegisterCompanyComplaintActivity.startActivityForResult(intent, 15594);
                    } else {
                        nonRegisterCompanyComplaintActivity.startActivityForResult(intent, 239);
                    }
                } catch (Exception unused) {
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Google Play Services is not Available", 0).show();
                }
            }
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 103;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = INotificationSideChannelDefault + 69;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
    }

    public static /* synthetic */ AnyRes TuitionPaymentFragmentbindingInflater1(final NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity) {
        int i = 2 % 2;
        AnyRes.Companion companion = AnyRes.INSTANCE;
        AnyRes anyResTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AnyRes.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function0() { // from class: isAutoMirrored
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault3};
                return (Unit) NonRegisterCompanyComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2023931292, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -2023931290, objArr, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        }, new Function0() { // from class: onLevelChange
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1};
                return (Unit) NonRegisterCompanyComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(527453066, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -527453065, objArr, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        });
        int i2 = INotificationSideChannelDefault + 111;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            return anyResTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activityResult, "");
        Intent data = activityResult.getData();
        if (data != null) {
            int i4 = INotificationSideChannelDefault + 113;
            RemoteActionCompatParcelizer = i4 % 128;
            if (i4 % 2 != 0) {
                data.getData();
                throw null;
            }
            Uri data2 = data.getData();
            if (data2 != null) {
                b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(nonRegisterCompanyComplaintActivity), null, null, new NonRegisterCompanyComplaintActivity$compressAndShowImage$1(nonRegisterCompanyComplaintActivity, String.valueOf(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(nonRegisterCompanyComplaintActivity, data2)), null), 3, null);
            }
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity, View view) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        AnyRes anyRes = (AnyRes) nonRegisterCompanyComplaintActivity.cancel.getValue();
        FragmentManager supportFragmentManager = nonRegisterCompanyComplaintActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(anyRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            anyRes.show(supportFragmentManager, anyRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = INotificationSideChannelDefault + 95;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity, ActivityNonRegisterCompanyComplaintBinding activityNonRegisterCompanyComplaintBinding, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(1179884253, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1179884249, new Object[]{nonRegisterCompanyComplaintActivity, activityNonRegisterCompanyComplaintBinding, view}, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(2023931292, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -2023931290, new Object[]{nonRegisterCompanyComplaintActivity}, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(NonRegisterCompanyComplaintActivity nonRegisterCompanyComplaintActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(527453066, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -527453065, new Object[]{nonRegisterCompanyComplaintActivity}, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    static {
        getInterfaceDescriptor = 1;
        g();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannelStubProxy + 25;
        getInterfaceDescriptor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityNonRegisterCompanyComplaintBinding> TuitionPaymentFragmentbindingInflater1() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlImplCameraCaptureCallbackSetExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Function1) TuitionPaymentFragmentspecialinlinedviewModeldefault3(1524954557, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, (-1081265535) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_internet_instruction_step2).substring(4, 5).length(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1524954554, new Object[]{this}, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 123;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 49;
        RemoteActionCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_non_register_company_complaint;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 109;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1119079443, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 1100130912, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 680426487, 1119079443, new Object[]{this}, Camera2CameraControlImplCameraCaptureCallbackSetExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2CameraControlImplCameraCaptureCallbackSetExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlImplCameraCaptureCallbackSetExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(580745037, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, Camera2CameraControlImplCameraCaptureCallbackSetExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -580745032, new Object[]{this}, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 73;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = INotificationSideChannelDefault + 61;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        cancel = new char[]{47200, 47209, 47252, 47196, 47262, 47260, 47203, 47223, 47249, 47255, 47254, 47205, 47261, 47201, 47206, 47170, 47202, 47175, 47259, 47256, 47207, 47263, 47258, 47224};
        cancelAll = 2047719434;
        INotificationSideChannel = true;
        INotificationSideChannelStub = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r5, byte r6, int r7) {
        /*
            int r5 = r5 + 67
            byte[] r0 = com.bpjstku.presentation.complaint.NonRegisterCompanyComplaintActivity.$$c
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            r4 = r0[r6]
        L26:
            int r4 = -r4
            int r5 = r5 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.complaint.NonRegisterCompanyComplaintActivity.$$i(int, byte, int):java.lang.String");
    }
}
