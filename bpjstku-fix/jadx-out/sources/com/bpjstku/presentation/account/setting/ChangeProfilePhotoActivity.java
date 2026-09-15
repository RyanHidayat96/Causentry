package com.bpjstku.presentation.account.setting;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwnerKt;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.setting.model.request.ChangeProfilePictureRequest;
import com.bpjstku.databinding.ActivityChangePhotoBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.account.setting.ChangeProfilePhotoActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.esafirm.imagepicker.features.ImagePickerActivity;
import com.esafirm.imagepicker.features.ImagePickerSavePath;
import com.esafirm.imagepicker.features.ReturnMode;
import com.esafirm.imagepicker.model.Image;
import com.google.android.gms.cloudmessaging.zzu;
import com.google.android.material.button.MaterialButton;
import com.google.mlkit.common.MlKitException;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.AnyRes;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.CaptureSession1;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.IntegerRes;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.acquireBuffer;
import defpackage.calculateCameraUseCases;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.createExtraPreview;
import defpackage.deriveCodec;
import defpackage.getCaptureNode;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.outputFormatToAudioProfile;
import defpackage.share;
import defpackage.updateFileExif;
import io.reactivex.internal.operators.observable.ObservableRetryWhen;
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
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J)\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0015\u0010\u001a\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0018\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0015\u0010\b\u001a\u00020\u001f8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0015\u0010!\u001a\u00020 8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00020\"8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010$R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000f0%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0015\u0010(\u001a\u00020)8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\f8\u0015X\u0095D¢\u0006\f\n\u0004\b\u001a\u0010*\u001a\u0004\b\u001a\u0010+"}, d2 = {"Lcom/bpjstku/presentation/account/setting/ChangeProfilePhotoActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityChangePhotoBinding;", "<init>", "()V", "", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "onTransact", "a", "", "p0", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LIntegerRes;", "Ljava/io/File;", "d", "Ljava/io/File;", "LoutputFormatToAudioProfile;", "LacquireBuffer;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/ActivityResultLauncher;", "Ljava/lang/Void;", "g", "LAnyRes;", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChangeProfilePhotoActivity extends BindingBaseActivity<ActivityChangePhotoBinding> {
    private static byte[] INotificationSideChannel;
    private static int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int cancel;
    private static short[] cancelAll;
    private static int notify;
    private static int onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private File b;
    private static final byte[] $$c = {94, -1, 37, -59};
    private static final int $$f = 171;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {63, 56, -36, -117, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 202;
    private static int INotificationSideChannelStub = 0;
    private static int INotificationSideChannelDefault = 0;
    private static int getInterfaceDescriptor = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: lambda
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChangeProfilePhotoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final ActivityResultLauncher<Intent> asBinder = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: codename
        @Override // androidx.view.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            ChangeProfilePhotoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (ActivityResult) obj);
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final ActivityResultLauncher<Void> asInterface = registerForActivityResult(new ActivityResultContracts.TakePicturePreview(), new ActivityResultCallback() { // from class: api
        @Override // androidx.view.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            ChangeProfilePhotoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Bitmap) obj);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy g = LazyKt.lazy(new Function0() { // from class: ChecksSdkIntAtLeast
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChangeProfilePhotoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final int d = R.layout.activity_change_photo;

    static final /* synthetic */ class TuitionPaymentFragmentbindingInflater1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentbindingInflater1(Function1 function1) {
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

    public static /* synthetic */ Object b(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = (~(i8 | i4)) | i7;
        int i10 = ~i4;
        int i11 = ~(i8 | i10 | i2);
        int i12 = (~(i4 | i7)) | i8 | (~(i10 | i2));
        int i13 = i2 + i5 + i3 + (325770565 * i6) + ((-1284996642) * i);
        int i14 = i13 * i13;
        int i15 = ((789042555 * i2) - 1205338112) + ((-1364710777) * i5) + (i9 * 1076876666) + (1076876666 * i11) + ((-1076876666) * i12) + ((-287834112) * i3) + ((-667418624) * i6) + ((-145752064) * i) + (1116340224 * i14);
        int i16 = (i2 * (-1991011123)) + 595473426 + (i5 * (-1991009311)) + (i9 * (-906)) + (i11 * (-906)) + (i12 * TypedValues.Custom.TYPE_REFERENCE) + (i3 * (-1991010217)) + (i6 * (-1223611789)) + (i * (-291900814)) + (i14 * (-1931083776));
        int i17 = i15 + (i16 * i16 * (-1558839296));
        if (i17 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i17 == 2) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i17 == 3) {
            return b(objArr);
        }
        if (i17 != 4) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        ChangeProfilePhotoActivity changeProfilePhotoActivity = (ChangeProfilePhotoActivity) objArr[0];
        int i18 = 2 % 2;
        int i19 = getInterfaceDescriptor + 67;
        INotificationSideChannelDefault = i19 % 128;
        if (i19 % 2 == 0 ? Build.VERSION.SDK_INT < 33 : Build.VERSION.SDK_INT < 85) {
            getCaptureNode.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new getCaptureNode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(changeProfilePhotoActivity);
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancelAll = ReturnMode.GALLERY_ONLY;
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b = true;
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "Pilih Foto";
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStub = new ImagePickerSavePath(Environment.DIRECTORY_PICTURES, false);
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStub = new ImagePickerSavePath(Environment.getExternalStorageDirectory().getPath(), true);
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel = 1;
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel = false;
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
        } else {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType("image/*");
            changeProfilePhotoActivity.asBinder.launch(intent);
            int i20 = getInterfaceDescriptor + 109;
            INotificationSideChannelDefault = i20 % 128;
            int i21 = i20 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.presentation.account.setting.ChangeProfilePhotoActivity.$$a
            int r1 = r6 + 1
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.setting.ChangeProfilePhotoActivity.c(short, int, int, java.lang.Object[]):void");
    }

    public ChangeProfilePhotoActivity() {
        final ChangeProfilePhotoActivity changeProfilePhotoActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.account.setting.ChangeProfilePhotoActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = changeProfilePhotoActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.account.setting.ChangeProfilePhotoActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = changeProfilePhotoActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.account.setting.ChangeProfilePhotoActivity$special$$inlined$inject$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = changeProfilePhotoActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        ChangeProfilePhotoActivity changeProfilePhotoActivity = (ChangeProfilePhotoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 53;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        File file = changeProfilePhotoActivity.b;
        if (i3 != 0) {
            return file;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ChangeProfilePhotoActivity changeProfilePhotoActivity, File file) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        int i3 = i2 % 128;
        INotificationSideChannelDefault = i3;
        int i4 = i2 % 2;
        changeProfilePhotoActivity.b = file;
        int i5 = i3 + 27;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ ActivityChangePhotoBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3(ChangeProfilePhotoActivity changeProfilePhotoActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ActivityChangePhotoBinding activityChangePhotoBinding = (ActivityChangePhotoBinding) ((ViewBinding) changeProfilePhotoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        int i3 = getInterfaceDescriptor + 73;
        INotificationSideChannelDefault = i3 % 128;
        int i4 = i3 % 2;
        return activityChangePhotoBinding;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.account.setting.ChangeProfilePhotoActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/account/setting/ChangeProfilePhotoActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, ChangeProfilePhotoActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityChangePhotoBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 115;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        ChangeProfilePhotoActivity$bindingInflater$1 changeProfilePhotoActivity$bindingInflater$1 = ChangeProfilePhotoActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = getInterfaceDescriptor + 17;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return changeProfilePhotoActivity$bindingInflater$1;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        ChangeProfilePhotoActivity changeProfilePhotoActivity = (ChangeProfilePhotoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 87;
        int i3 = i2 % 128;
        INotificationSideChannelDefault = i3;
        int i4 = i2 % 2;
        int i5 = changeProfilePhotoActivity.d;
        if (i4 != 0) {
            int i6 = 91 / 0;
        }
        int i7 = i3 + 121;
        getInterfaceDescriptor = i7 % 128;
        int i8 = i7 % 2;
        return Integer.valueOf(i5);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 51;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        ChangeProfilePhotoActivity changeProfilePhotoActivity = this;
        Intrinsics.checkNotNullParameter(changeProfilePhotoActivity, "");
        changeProfilePhotoActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityChangePhotoBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityChangePhotoBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.label_change_profile_photo));
        int i4 = getInterfaceDescriptor + 89;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivityChangePhotoBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnUploadAnotherPhoto;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: AnimatorRes
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChangeProfilePhotoActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        ((ActivityChangePhotoBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnSaveChange.setOnClickListener(new View.OnClickListener() { // from class: CallSuper
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeProfilePhotoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
        int i2 = INotificationSideChannelDefault + 31;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        b(zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 982822428, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_4).substring(6, 7).length() - 612452705, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -982822425, new Object[]{this}, zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        b(zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 426509756, ObservableRetryWhen.RepeatWhenObserver.InnerRepeatObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, -426509754, new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.xl_instruction_step5).substring(3, 4).length() - 1055675741);
        int i4 = INotificationSideChannelDefault + 53;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        String str;
        ChangeProfilePhotoActivity changeProfilePhotoActivity = (ChangeProfilePhotoActivity) objArr[0];
        int i = 2 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) changeProfilePhotoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities = (ActivityResultContractsPickVisualMediaMediaCapabilities) changeProfilePhotoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        Object obj = null;
        if (userAsBinder != null) {
            str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i2 = getInterfaceDescriptor + 21;
            INotificationSideChannelDefault = i2 % 128;
            int i3 = i2 % 2;
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            int i4 = INotificationSideChannelDefault + 69;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            str = "";
        }
        String str3 = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentbindingInflater1 : null;
        if (str3 == null) {
            int i6 = INotificationSideChannelDefault + 81;
            getInterfaceDescriptor = i6 % 128;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            str2 = str3;
        }
        activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, str2);
        return null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        final ChangeProfilePhotoActivity changeProfilePhotoActivity = (ChangeProfilePhotoActivity) objArr[0];
        int i = 2 % 2;
        ChangeProfilePhotoActivity changeProfilePhotoActivity2 = changeProfilePhotoActivity;
        ((ActivityResultContractsPickVisualMediaMediaCapabilities) changeProfilePhotoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(changeProfilePhotoActivity2, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: BinderThread
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChangeProfilePhotoActivity.TuitionPaymentFragmentbindingInflater1(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) changeProfilePhotoActivity.TuitionPaymentFragmentbindingInflater1.getValue()).notify.observe(changeProfilePhotoActivity2, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: suggest
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChangeProfilePhotoActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = getInterfaceDescriptor + 65;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.account.setting.ChangeProfilePhotoActivity$onActivityResult$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.bpjstku.presentation.account.setting.ChangeProfilePhotoActivity$onActivityResult$1", f = "ChangeProfilePhotoActivity.kt", i = {}, l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Image $image;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ChangeProfilePhotoActivity changeProfilePhotoActivity = ChangeProfilePhotoActivity.this;
                String str = this.$image.TuitionPaymentFragmentbindingInflater1;
                Intrinsics.checkNotNullExpressionValue(str, "");
                final ChangeProfilePhotoActivity changeProfilePhotoActivity2 = ChangeProfilePhotoActivity.this;
                this.label = 1;
                if (Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(changeProfilePhotoActivity, str, new Function1() { // from class: extension
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ChangeProfilePhotoActivity.AnonymousClass1.TuitionPaymentFragmentbindingInflater1(changeProfilePhotoActivity2, (File) obj2);
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ChangeProfilePhotoActivity changeProfilePhotoActivity, File file) {
            ChangeProfilePhotoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(changeProfilePhotoActivity, file);
            Button button = ChangeProfilePhotoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(changeProfilePhotoActivity).btnSaveChange;
            Intrinsics.checkNotNullExpressionValue(button, "");
            Button button2 = button;
            Intrinsics.checkNotNullParameter(button2, "");
            button2.setEnabled(true);
            RequestManager requestManagerWith = Glide.with(changeProfilePhotoActivity);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            requestManagerWith.b((File) ChangeProfilePhotoActivity.b(zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1810433865, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1810433865, new Object[]{changeProfilePhotoActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault5)).into(ChangeProfilePhotoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(changeProfilePhotoActivity).civProfilePhoto);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Image image, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$image = image;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChangeProfilePhotoActivity.this.new AnonymousClass1(this.$image, continuation);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int p0, int p1, Intent p2) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 23;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        if (p1 == -1) {
            int i5 = i2 + 55;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0 ? p0 == 553 : p0 == 15328) {
                if (p2 != null) {
                    int i6 = i2 + 43;
                    getInterfaceDescriptor = i6 % 128;
                    boolean z = i6 % 2 != 0;
                    int i7 = i2 + 57;
                    getInterfaceDescriptor = i7 % 128;
                    int i8 = i7 % 2;
                    if (z) {
                        b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(getCaptureNode.b(p2), null), 3, null);
                    }
                }
            }
        }
        super.onActivityResult(p0, p1, p2);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x019a  */
    private static void e(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        int i5;
        boolean z;
        int length;
        byte[] bArr;
        int i6 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(notify)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int deadChar = 2267 - KeyEvent.getDeadChar(0, 0);
                int maxKeyCode = 33 - (KeyEvent.getMaxKeyCode() >> 16);
                byte b2 = (byte) ($$c[1] + 1);
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, deadChar, maxKeyCode, 1387473586, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr2 = INotificationSideChannel;
                long j2 = 0;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i7 = 0;
                    while (i7 < length2) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cAlpha = (char) Color.alpha(0);
                            int i8 = 3357 - (ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1));
                            int size = View.MeasureSpec.getSize(0) + 18;
                            byte[] bArr4 = $$c;
                            byte b4 = (byte) (bArr4[1] + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha, i8, size, -1054011043, false, $$i(b4, b4, (byte) bArr4.length), new Class[]{Integer.TYPE});
                        }
                        bArr3[i7] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i7++;
                        j2 = 0;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr5 = INotificationSideChannel;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(cancel)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2267;
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 33;
                        byte b5 = (byte) ($$c[1] + 1);
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, keyRepeatTimeout, iKeyCodeFromString, 1387473586, false, $$i(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr5[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) notify) ^ 3046761265686732006L)));
                    j = 3046761265686732006L;
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) cancelAll[i3 + ((int) (((long) cancel) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) notify) ^ 3046761265686732006L)));
                }
            } else {
                j = 3046761265686732006L;
            }
            if (iIntValue > 0) {
                int i9 = ((i3 + iIntValue) - 2) + ((int) (((long) cancel) ^ j));
                if (z2) {
                    int i10 = $10 + 81;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 1;
                    }
                } else {
                    i4 = 0;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i9 + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(onTransact), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cMyTid = (char) ((Process.myTid() >> 22) + 55904);
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 2855;
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 13;
                    byte b7 = $$c[1];
                    byte b8 = (byte) (b7 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyTid, scrollBarSize, keyRepeatDelay, -1529949196, false, $$i(b8, b8, (byte) (-b7)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr6 = INotificationSideChannel;
                if (bArr6 != null) {
                    int i11 = $10 + 23;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        length = bArr6.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr6.length;
                        bArr = new byte[length];
                    }
                    for (int i12 = 0; i12 < length; i12++) {
                        bArr[i12] = (byte) (((long) bArr6[i12]) ^ 3046761265686732006L);
                    }
                    int i13 = $10 + 63;
                    $11 = i13 % 128;
                    i5 = 2;
                    int i14 = i13 % 2;
                    bArr6 = bArr;
                } else {
                    i5 = 2;
                }
                if (bArr6 != null) {
                    int i15 = $10 + 31;
                    $11 = i15 % 128;
                    int i16 = i15 % i5;
                    z = true;
                } else {
                    z = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i17 = $11;
                    int i18 = i17 + 37;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                    if (z) {
                        int i20 = i17 + 71;
                        $10 = i20 % 128;
                        if (i20 % 2 != 0) {
                            byte[] bArr7 = INotificationSideChannel;
                            int i21 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i21;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % (((byte) (((byte) (((long) bArr7[i21]) * 3046761265686732006L)) % s)) ^ b));
                        } else {
                            byte[] bArr8 = INotificationSideChannel;
                            int i22 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i22 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr8[i22]) ^ 3046761265686732006L)) + s)) ^ b));
                        }
                    } else {
                        short[] sArr = cancelAll;
                        int i23 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i23 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i23]) ^ 3046761265686732006L)) + s)) ^ b));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i4 = getInterfaceDescriptor + 117;
                INotificationSideChannelDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 121;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
            int i4 = 1031 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int mirror = '?' - AndroidCharacter.getMirror('0');
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) 52, bArr[132], bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i4, mirror, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 781042075, (-14) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_dialog_screen_warning_text_head_movement).substring(21, 23).codePointAt(1) - 57), (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.getCapsMode("", 0, 0) - 2094116634, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 781042001, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 25, (short) (TextUtils.indexOf((CharSequence) "", '0', 0) + 27), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (-2094116612) - View.resolveSize(0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char mode = (char) View.MeasureSpec.getMode(0);
            int maximumFlingVelocity = 1031 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int bitsPerPixel = 14 - ImageFormat.getBitsPerPixel(0);
            byte b = (byte) 52;
            Object[] objArr5 = new Object[1];
            c(b, (short) (b - 1), $$a[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode, maximumFlingVelocity, bitsPerPixel, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = INotificationSideChannelDefault + 45;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                int doubleTapTimeout = 1031 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int doubleTapTimeout2 = 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                c(b3, (short) (b3 | 103), b2, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar, doubleTapTimeout, doubleTapTimeout2, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i7 = ((int[]) objArr7[3])[0];
            int i8 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i9 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 36794541);
            int i10 = ((360764651 + (((-17302018) | i9) * 494)) + (((~(i9 | (-421047114))) | 1051770362) * 494)) - 1902910790;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1054).substring(0, 34).codePointAt(14) - 781041992, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redirecting_to_gopay).substring(1, 2).length() - 15, (short) (View.MeasureSpec.makeMeasureSpec(0, 0) + 32), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_canceled).substring(13, 14).codePointAt(0) - 2094116713, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_eye_occlude).substring(0, 28).length() - 781041989, (-15) - TextUtils.lastIndexOf("", '0', 0), (short) (46 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (byte) View.resolveSizeAndState(0, 0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 2094116617, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-2071748074};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 46039), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1134, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1902910790, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                    int i13 = 1032 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int iArgb = 15 - Color.argb(0, 0, 0, 0);
                    byte[] bArr2 = $$a;
                    Object[] objArr12 = new Object[1];
                    c((byte) 52, bArr2[132], bArr2[5], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, i13, iArgb, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ExpandableListView.getPackedPositionChild(0L) + 45994), 1117 - (ViewConfiguration.getTouchSlop() >> 8), 17 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char trimmedLength = (char) TextUtils.getTrimmedLength("");
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1031;
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 15;
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr13 = new Object[1];
                    c(b5, (short) (b5 | 103), b4, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(trimmedLength, threadPriority, iIndexOf, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e((ViewConfiguration.getFadingEdgeLength() >> 16) - 781041969, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_bni_internet).substring(0, 16).length() - 30, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.orderId).substring(0, 8).codePointAt(6) - 98), (byte) (MotionEvent.axisFromString("") + 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_mandiri).substring(0, 19).length() - 2094116653, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri__e_cash_instruction_step6).substring(38, 43).codePointAt(4) - 781041997, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 50, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 15), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellSiteTitle).substring(0, 4).length() - 4), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_instruction_step2).substring(8, 9).length() - 2094116613, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int i14 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1031;
                        int jumpTapTimeout = 15 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        byte b6 = (byte) 52;
                        Object[] objArr16 = new Object[1];
                        c(b6, (short) (b6 - 1), $$a[5], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(touchSlop, i14, jumpTapTimeout, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                        int threadPriority2 = 1031 - ((Process.getThreadPriority(0) + 20) >> 6);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15;
                        byte[] bArr3 = $$a;
                        Object[] objArr17 = new Object[1];
                        c((byte) 52, bArr3[132], bArr3[5], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cRgb, threadPriority2, maximumDrawingCacheSize, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[3])[0];
        if (i16 != i15) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i16));
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[3])[0];
        int i19 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i20 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        int i21 = ~i20;
        int i22 = i17 + 537117024 + ((1010262674 | i21) * (-757)) + ((~(1035466682 | i20)) * 1514) + (((~(i20 | (-25204009))) | (~(i21 | 765982504)) | 269484178) * 757);
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        ((int[]) objArr18[2])[0] = i24 ^ (i24 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cGreen = (char) (29944 - Color.green(0));
            int i25 = 1755 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int i26 = 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            byte b7 = (byte) 37;
            Object[] objArr19 = new Object[1];
            c(b7, (short) (b7 | 66), $$a[5], objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cGreen, i25, i26, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i27 = getInterfaceDescriptor + 37;
            INotificationSideChannelDefault = i27 % 128;
            int i28 = i27 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29944);
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1755;
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 24;
                byte b8 = (byte) 52;
                Object[] objArr20 = new Object[1];
                c(b8, (short) (b8 - 1), $$a[5], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(longPressTimeout, tapTimeout, iIndexOf2, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i29 = ~(129985712 | iIdentityHashCode);
            int i30 = ~iIdentityHashCode;
            int i31 = i29 | (~(342588138 | i30));
            int i32 = ~((-129985713) | i30);
            int i33 = (((1177631181 + ((i31 | i32) * (-516))) + (((~(iIdentityHashCode | (-272634443))) | (~((-69953697) | i30))) * 516)) + ((69953696 | i32) * 516)) - 866640272;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i35 ^ (i35 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e((-781041960) - ((Process.getThreadPriority(0) + 20) >> 6), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_kioson).substring(0, 6).codePointAt(3) - 129, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tesla_ev_connector_type).substring(1, 5).length() + 28), (byte) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_code).substring(4, 5).length() - 2094116598, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(Color.rgb(0, 0, 0) - 764264745, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_kioson).substring(0, 6).codePointAt(3) - 129, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step3).substring(25, 26).codePointAt(0) - 68), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_credit_card).substring(1, 3).codePointAt(1) - 121), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.company_code).substring(1, 2).codePointAt(0) - 2094116692, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {-2071748074};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 42048), View.getDefaultSize(0, 0) + 1726, 30 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), -866640272);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c2 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                int scrollBarSize = 1755 - (ViewConfiguration.getScrollBarSize() >> 8);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 23;
                byte b9 = (byte) 52;
                Object[] objArr25 = new Object[1];
                c(b9, (short) (b9 - 1), $$a[5], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c2, scrollBarSize, iMakeMeasureSpec, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
            try {
                Object[] objArr26 = new Object[1];
                e((-781041968) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), Color.blue(0) - 14, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 61), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 2094116670, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_4).substring(4, 5).codePointAt(0) - 781041997, (-13) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_wearing_scarf_text).substring(0, 4).length() + 22), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 2094116648, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cIndexOf2 = (char) (29944 - TextUtils.indexOf("", ""));
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1755;
                    int edgeSlop = 23 - (ViewConfiguration.getEdgeSlop() >> 16);
                    Object[] objArr28 = new Object[1];
                    c((byte) 52, (short) 140, $$a[5], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf2, windowTouchSlop, edgeSlop, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char size = (char) (29944 - View.MeasureSpec.getSize(0));
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1755;
                    int i36 = 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    byte b10 = (byte) 37;
                    Object[] objArr29 = new Object[1];
                    c(b10, (short) (b10 | 66), $$a[5], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(size, iCombineMeasuredStates, i36, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i37 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
        int i38 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        if (i38 == i37) {
            int i39 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr30 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i40 = i39 + (-843798773) + (((~((-36966401) | iIdentityHashCode2)) | (~((~iIdentityHashCode2) | 175636025))) * (-318)) + (((~(175493153 | iIdentityHashCode2)) | 142872) * (-318)) + (((~(iIdentityHashCode2 | (-175493154))) | (-37109273)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArr30[3])[0] = i42 ^ (i42 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
        if (strArr4 != null) {
            int i43 = INotificationSideChannelDefault + 63;
            getInterfaceDescriptor = i43 % 128;
            int i44 = i43 % 2;
            for (String str2 : strArr4) {
                arrayList2.add(str2);
            }
        }
        int[] iArr = new int[i38];
        int i45 = i38 - 1;
        iArr[i45] = 1;
        Toast.makeText((Context) null, iArr[((i38 * i45) % 2) - 1], 1).show();
        int i46 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i47 = ~iIdentityHashCode3;
        int i48 = i46 + (-1276628859) + (((~((-672725367) | i47)) | (-460122941)) * (-602)) + (((~(iIdentityHashCode3 | (-672725367))) | 537923650 | (~((-325321225) | i47))) * (-301)) + ((~(i47 | (-460122941))) * 301);
        int i49 = (i48 << 13) ^ i48;
        int i50 = i49 ^ (i49 >>> 17);
        ((int[]) objArr31[3])[0] = i50 ^ (i50 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 95;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
        int i6 = ~(1039193579 | i5);
        if (i4 != (-1172509207) + (((-2147087852) | i6) * (-814)) + ((i6 | (~((~i5) | 1869181122)) | 761286850) * 407) + (((~(i5 | (-1869181123))) | (~((-1039193580) | i5)) | 761286850) * 407)) {
            int i7 = (-1787339680) % 2;
            throw new ArithmeticException();
        }
        int i8 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iMyUid = Process.myUid();
        if (i8 != 619967928 + (((~((~iMyUid) | (-550240801))) | (-2028815165)) * (-591)) + ((iMyUid | (-550240801)) * 591)) {
            throw new RuntimeException("-966406220");
        }
        super.onResume();
        int i9 = INotificationSideChannelDefault + 111;
        getInterfaceDescriptor = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 117;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = 2079944100 + (((~((-28394732) | iIdentityHashCode)) | 18957506 | (~((-858382275) | iIdentityHashCode))) * (-754));
            int i5 = ~((-18957507) | iIdentityHashCode);
            int i6 = ~iIdentityHashCode;
            if (i3 != i4 + ((i5 | (~((-839424769) | i6))) * (-754)) + ((i6 | (-28394732)) * 754)) {
                throw null;
            }
        } else {
            int i7 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iIdentityHashCode2 = System.identityHashCode(this);
            if (i7 != (-260898716) + ((~((~iIdentityHashCode2) | (-134479877))) * 433) + (((~(1520315501 | iIdentityHashCode2)) | (-690327959)) * (-433)) + (((~(iIdentityHashCode2 | (-690327959))) | 1385835625) * 433)) {
                throw null;
            }
        }
        int i8 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        if (i8 != (((-945406086) + (((-413172755) | iUptimeMillis) * (-381))) + (((~((~iUptimeMillis) | 1628725545)) | (-1504740635)) * 381)) - 1494970678) {
            throw null;
        }
        super.onStart();
        int i9 = getInterfaceDescriptor + 65;
        INotificationSideChannelDefault = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d0, code lost:
    
        if (r1 != (((669516476 + ((r5 | (~(r6 | 2128606717))) * 920)) + (((~((-374142458) | r6)) | 38552929) * 920)) + (((~(r2 | 2128606717)) | ((~((-38552930) | r6)) | (~((-335589529) | r2)))) * 920))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d2, code lost:
    
        super.onCreate(r11);
        r11 = com.bpjstku.presentation.account.setting.ChangeProfilePhotoActivity.INotificationSideChannelDefault + 85;
        com.bpjstku.presentation.account.setting.ChangeProfilePhotoActivity.getInterfaceDescriptor = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00de, code lost:
    
        if ((r11 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e1, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ec, code lost:
    
        throw new java.lang.RuntimeException("-1898944362");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ed, code lost:
    
        r11 = (-1781476902) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f6, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005d, code lost:
    
        if (r1 == ((((((-933076864) | r5) | (~(94175844 | r4))) * (-338)) + 1617612328) + (((~(r4 | (-838901020))) | r5) * 338))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0092, code lost:
    
        if (r1 == ((((r6 | r4) * (-252)) - 1698000856) + ((r4 | (~(r5 | 1404676055))) * 252))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0094, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r10);
        r5 = ~((-38552930) | r2);
        r6 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.setting.ChangeProfilePhotoActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ChangeProfilePhotoActivity changeProfilePhotoActivity, Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (bitmap == null) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Gagal mengambil gambar", 0).show();
            return;
        }
        changeProfilePhotoActivity.b = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(changeProfilePhotoActivity, bitmap, false);
        Button button = ((ActivityChangePhotoBinding) ((ViewBinding) changeProfilePhotoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnSaveChange;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(true);
        Glide.with(changeProfilePhotoActivity).b(changeProfilePhotoActivity.b).into(((ActivityChangePhotoBinding) ((ViewBinding) changeProfilePhotoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).civProfilePhoto);
        int i3 = getInterfaceDescriptor + 3;
        INotificationSideChannelDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 22 / 0;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ChangeProfilePhotoActivity changeProfilePhotoActivity, View view) {
        String str;
        String str2;
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_save_another_photo", "save_another_photo"));
            Intrinsics.checkNotNullParameter(changeProfilePhotoActivity, "");
            Intrinsics.checkNotNullParameter("save_another_photo", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("save_another_photo", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("save_another_photo", mapMutableMapOf);
            File file = changeProfilePhotoActivity.b;
            if (file != null) {
                final IntegerRes integerRes = (IntegerRes) changeProfilePhotoActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) changeProfilePhotoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                if (userAsBinder != null) {
                    str = userAsBinder.TuitionPaymentFragmentbindingInflater1;
                    int i2 = INotificationSideChannelDefault + 123;
                    getInterfaceDescriptor = i2 % 128;
                    int i3 = i2 % 2;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                User userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) changeProfilePhotoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                if (userAsBinder2 != null) {
                    int i4 = INotificationSideChannelDefault + 73;
                    getInterfaceDescriptor = i4 % 128;
                    int i5 = i4 % 2;
                    str2 = userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i6 = INotificationSideChannelDefault + 53;
                    getInterfaceDescriptor = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                ChangeProfilePictureRequest changeProfilePictureRequest = new ChangeProfilePictureRequest(str, str2, file);
                Intrinsics.checkNotNullParameter(changeProfilePictureRequest, "");
                MutableLiveData<VirtualCameraAdapter1<String>> mutableLiveData = integerRes.notify;
                VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(integerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(changeProfilePictureRequest)));
                final Function1 function1 = new Function1() { // from class: newTab
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return IntegerRes.b(integerRes, (String) obj);
                    }
                };
                logToString logtostring = new logToString() { // from class: LayoutRes
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function1.invoke(obj);
                    }
                };
                final Function1 function2 = new Function1() { // from class: RawRes
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return IntegerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(integerRes, (Throwable) obj);
                    }
                };
                BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: version
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function2.invoke(obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                integerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit b(ChangeProfilePhotoActivity changeProfilePhotoActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            changeProfilePhotoActivity.MediaBrowserCompat();
            str = "loading_change_profile_picture";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i2 = getInterfaceDescriptor + 123;
            INotificationSideChannelDefault = i2 % 128;
            int i3 = i2 % 2;
            changeProfilePhotoActivity.IconCompatParcelizer();
            b(zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 426509756, ObservableRetryWhen.RepeatWhenObserver.InnerRepeatObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -426509754, new Object[]{changeProfilePhotoActivity}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.xl_instruction_step5).substring(3, 4).length() - 1055675741);
            String string = changeProfilePhotoActivity.getString(R.string.message_profile_picture_successfully_changed);
            Intrinsics.checkNotNullExpressionValue(string, "");
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string, 0).show();
            changeProfilePhotoActivity.d_();
            str = "success_change_profile_picture";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            changeProfilePhotoActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            int i4 = INotificationSideChannelDefault + 91;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            str = "failure_change_profile_picture";
        } else {
            changeProfilePhotoActivity.IconCompatParcelizer();
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_change_profile_picture_result", str));
        Intrinsics.checkNotNullParameter(changeProfilePhotoActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        Unit unit = Unit.INSTANCE;
        int i6 = getInterfaceDescriptor + 73;
        INotificationSideChannelDefault = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ outputFormatToAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault2(ChangeProfilePhotoActivity changeProfilePhotoActivity) {
        int i = 2 % 2;
        outputFormatToAudioProfile outputformattoaudioprofile = new outputFormatToAudioProfile(changeProfilePhotoActivity);
        int i2 = INotificationSideChannelDefault + 23;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 75 / 0;
        }
        return outputformattoaudioprofile;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ChangeProfilePhotoActivity changeProfilePhotoActivity) {
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT >= 33) {
            int i2 = getInterfaceDescriptor + 87;
            INotificationSideChannelDefault = i2 % 128;
            int i3 = i2 % 2;
            changeProfilePhotoActivity.asInterface.launch(null);
        } else {
            updateFileExif updatefileexif = new updateFileExif();
            ChangeProfilePhotoActivity changeProfilePhotoActivity2 = changeProfilePhotoActivity;
            Intent intent = new Intent(changeProfilePhotoActivity2, (Class<?>) ImagePickerActivity.class);
            intent.putExtra("CameraOnlyConfig", updatefileexif.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            changeProfilePhotoActivity2.startActivityForResult(intent, 553);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 37;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ChangeProfilePhotoActivity changeProfilePhotoActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activityResult, "");
        Intent data = activityResult.getData();
        if (data != null) {
            int i2 = getInterfaceDescriptor + 3;
            INotificationSideChannelDefault = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                data.getData();
                obj.hashCode();
                throw null;
            }
            Uri data2 = data.getData();
            if (data2 != null) {
                b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(changeProfilePhotoActivity), null, null, new ChangeProfilePhotoActivity$takePictureGallery$1$1$1(changeProfilePhotoActivity, data2, null), 3, null);
                int i3 = INotificationSideChannelDefault + 39;
                getInterfaceDescriptor = i3 % 128;
                int i4 = i3 % 2;
            }
        }
    }

    public static /* synthetic */ AnyRes TuitionPaymentFragmentspecialinlinedviewModeldefault1(final ChangeProfilePhotoActivity changeProfilePhotoActivity) {
        int i = 2 % 2;
        AnyRes.Companion companion = AnyRes.INSTANCE;
        AnyRes anyResTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AnyRes.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function0() { // from class: CheckResult
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChangeProfilePhotoActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        }, new Function0() { // from class: BoolRes
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                return (Unit) ChangeProfilePhotoActivity.b(zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1345381725, zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1345381721, objArr, zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
        });
        int i2 = getInterfaceDescriptor + 19;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return anyResTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        throw null;
    }

    public static /* synthetic */ Unit b(ChangeProfilePhotoActivity changeProfilePhotoActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_upload_another_photo", "upload_another_photo"));
        Intrinsics.checkNotNullParameter(changeProfilePhotoActivity, "");
        Intrinsics.checkNotNullParameter("upload_another_photo", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("upload_another_photo", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("upload_another_photo", mapMutableMapOf);
        AnyRes anyRes = (AnyRes) changeProfilePhotoActivity.g.getValue();
        FragmentManager supportFragmentManager = changeProfilePhotoActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(anyRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            anyRes.show(supportFragmentManager, anyRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int i2 = INotificationSideChannelDefault + 75;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 89;
        INotificationSideChannelDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ChangeProfilePhotoActivity changeProfilePhotoActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 31;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder;
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i4 = i3 + 33;
            INotificationSideChannelDefault = i4 % 128;
            if (i4 % 2 != 0) {
                ((ActivityChangePhotoBinding) ((ViewBinding) changeProfilePhotoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).civProfilePhoto.setImageBitmap((Bitmap) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                obj.hashCode();
                throw null;
            }
            ((ActivityChangePhotoBinding) ((ViewBinding) changeProfilePhotoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).civProfilePhoto.setImageBitmap((Bitmap) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(ChangeProfilePhotoActivity changeProfilePhotoActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (Unit) b(zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1345381725, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1345381721, new Object[]{changeProfilePhotoActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
    }

    static {
        RemoteActionCompatParcelizer = 1;
        g();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannelStub + 9;
        RemoteActionCompatParcelizer = i % 128;
        if (i % 2 == 0) {
            int i2 = 54 / 0;
        }
    }

    public static final /* synthetic */ File a(ChangeProfilePhotoActivity changeProfilePhotoActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (File) b(zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1810433865, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1810433865, new Object[]{changeProfilePhotoActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
    }

    private final void onTransact() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        b(zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 426509756, ObservableRetryWhen.RepeatWhenObserver.InnerRepeatObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -426509754, new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.xl_instruction_step5).substring(3, 4).length() - 1055675741);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ObservableRetryWhen.RepeatWhenObserver.InnerRepeatObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = ObservableRetryWhen.RepeatWhenObserver.InnerRepeatObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return ((Integer) b(zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -320796388, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 320796389, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault5)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 23;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        b(zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 982822428, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_4).substring(6, 7).length() - 612452705, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -982822425, new Object[]{this}, zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 75;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        int i5 = INotificationSideChannelDefault + 59;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    static void g() {
        cancel = -260246532;
        notify = -1934795541;
        onTransact = -1574920844;
        INotificationSideChannel = new byte[]{-17, -57, -21, -6, -92, 9, -57, -20, -4, -11, -39, -40, 50, -5, -68, 5, -14, -11, -16, -63, -23, -64, -28, 56, 12, Base64.padSymbol, 8, 23, 4, 31, 50, 3, 62, 15, 19, Base64.padSymbol, 11, -27, 14, 55, 7, 60, -32, -29, 65, 63, 11, 51, -8, 75, 45, 19, 49, -27, 53, 33, 24, 75, 33, 2, 13, 71, 49, 59, 33, 62, Base64.padSymbol, 53, 43};
    }

    private static String $$i(byte b, int i, int i2) {
        int i3 = b * 3;
        int i4 = i2 + 117;
        byte[] bArr = $$c;
        int i5 = 4 - (i * 3);
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        int i7 = -1;
        if (bArr == null) {
            i4 = i5 + (-i4);
            i5++;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            int i8 = i4;
            int i9 = i5 + 1;
            i4 = i8 + (-bArr[i5]);
            i5 = i9;
        }
    }
}
