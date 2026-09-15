package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwnerKt;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import com.appsflyer.internal.AFg1xSDK;
import com.bpjstku.R;
import com.bpjstku.data.payment.model.response.RecurringPlanResponse;
import com.bpjstku.databinding.ActivityClaimOldDaySecurityReactivationBinding;
import com.bpjstku.presentation.membership.registration.model.Job;
import com.bpjstku.presentation.membership.registration.model.WorkLocation;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityReactivationActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.model.IndividualDataClaim;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.esafirm.imagepicker.features.ImagePickerActivity;
import com.esafirm.imagepicker.model.Image;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.AutoValue_LifecycleCameraRepository_Key;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.acquireBuffer;
import defpackage.calculateCameraUseCases;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.createExtraPreview;
import defpackage.deInitSession;
import defpackage.getActivitySideSheetPosition;
import defpackage.getCaptureNode;
import defpackage.getEncoderProfilesProvider;
import defpackage.getEventTime;
import defpackage.getMaxImages;
import defpackage.initSession;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.outputFormatToAudioProfile;
import defpackage.outputFormatToAudioProfile.AnonymousClass4;
import defpackage.saveBitmap;
import defpackage.setVisibility;
import defpackage.updateFileExif;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.b;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\b\u0010\u0011J)\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\b\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010 R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010#R\u0014\u0010\u001f\u001a\u00020$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0015\u0010\t\u001a\u00020&8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0015\u0010\u0006\u001a\u00020(8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b)\u0010'R\u0015\u0010\r\u001a\u00020*8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\"\u0010'R\u0015\u0010\n\u001a\u00020*8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010'R\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010-R\u0014\u0010/\u001a\u00020\u00128UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010.R \u0010)\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0002008UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u00102"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/claim/ClaimOldDaySecurityReactivationActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityClaimOldDaySecurityReactivationBinding;", "<init>", "()V", "", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "INotificationSideChannel", "Ljava/io/File;", "p0", "(Ljava/io/File;)V", "", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/model/IndividualDataClaim;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/model/IndividualDataClaim;", "Lcom/bpjstku/presentation/membership/registration/model/WorkLocation;", "notify", "Lcom/bpjstku/presentation/membership/registration/model/WorkLocation;", "Lcom/bpjstku/presentation/membership/registration/model/Job;", "g", "Lcom/bpjstku/presentation/membership/registration/model/Job;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/io/File;", "LoutputFormatToAudioProfile;", "LoutputFormatToAudioProfile;", "LacquireBuffer;", "Lkotlin/Lazy;", "LgetActivitySideSheetPosition;", "cancel", "LsaveBitmap;", "Landroidx/activity/result/ActivityResultLauncher;", "Ljava/lang/Void;", "Landroidx/activity/result/ActivityResultLauncher;", "()I", "onTransact", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClaimOldDaySecurityReactivationActivity extends BindingReactiveFormActivity<ActivityClaimOldDaySecurityReactivationBinding> {
    private static int RemoteActionCompatParcelizer;
    private static char[] cancelAll;
    private static char onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private IndividualDataClaim TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Job TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private File TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Job TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private WorkLocation b;
    private static final byte[] $$c = {8, -36, 87, -65};
    private static final int $$f = 68;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {91, -9, 99, 11, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 167;
    private static int INotificationSideChannelDefault = 1;
    private static int INotificationSideChannel = 0;
    private static int INotificationSideChannelStubProxy = 1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final outputFormatToAudioProfile g = new outputFormatToAudioProfile(this);

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Lazy asBinder = LazyKt.lazy(new Function0() { // from class: logDeviceLevel
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ClaimOldDaySecurityReactivationActivity.b(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy d = LazyKt.lazy(new Function0() { // from class: getCameraCharacteristicsCompat
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ClaimOldDaySecurityReactivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy asInterface = LazyKt.lazy(new Function0() { // from class: getCameraCharacteristics
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ClaimOldDaySecurityReactivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ActivityResultLauncher<Void> INotificationSideChannel = registerForActivityResult(new ActivityResultContracts.TakePicturePreview(), new ActivityResultCallback() { // from class: addSessionCaptureCallback
        @Override // androidx.view.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            ClaimOldDaySecurityReactivationActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Bitmap) obj);
        }
    });

    public static /* synthetic */ Object b(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws IllegalAccessException {
        int i7 = ~i;
        int i8 = (~(i7 | i6)) | i4;
        int i9 = ~i4;
        int i10 = (~(i9 | i6)) | (~(i9 | i)) | (~(i6 | i));
        int i11 = (~((~i6) | i)) | i9;
        int i12 = i4 + i6 + i5 + ((-2137991558) * i2) + (111092868 * i3);
        int i13 = i12 * i12;
        int i14 = (((-431794203) * i4) - 566755328) + (427185167 * i6) + (i8 * 1717982222) + (1717982222 * i10) + ((-1717982222) * i11) + ((-1290797056) * i5) + ((-1247805440) * i2) + ((-1807745024) * i3) + ((-591921152) * i13);
        int i15 = (i4 * (-1469267343)) + 1003592187 + (i6 * (-1469268429)) + (i8 * (-362)) + (i10 * (-362)) + (i11 * 362) + (i5 * (-1469268067)) + (i2 * 1951436498) + (i3 * (-746069772)) + (i13 * (-1529348096));
        switch (i14 + (i15 * i15 * 1762131968)) {
            case 1:
                final ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity = (ClaimOldDaySecurityReactivationActivity) objArr[0];
                int i16 = 2 % 2;
                saveBitmap.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = saveBitmap.INSTANCE;
                saveBitmap savebitmapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = saveBitmap.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityReactivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3, new Function1() { // from class: getReopenDelayMs
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ClaimOldDaySecurityReactivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (Job) obj);
                    }
                });
                int i17 = INotificationSideChannel + 103;
                INotificationSideChannelStubProxy = i17 % 128;
                int i18 = i17 % 2;
                return savebitmapTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            case 2:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            case 3:
                return TuitionPaymentFragmentbindingInflater1(objArr);
            case 4:
                ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity2 = (ClaimOldDaySecurityReactivationActivity) objArr[0];
                Bundle bundle = (Bundle) objArr[1];
                int i19 = 2 % 2;
                int i20 = INotificationSideChannelStubProxy + 63;
                INotificationSideChannel = i20 % 128;
                int i21 = i20 % 2;
                int i22 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
                int iNextInt = new Random().nextInt();
                if (i22 != (((-1206545866) + (((-5771777) | iNextInt) * (-381))) + (((~((~iNextInt) | (-945313305))) | 1049095513) * 381)) - 2095920640) {
                    throw null;
                }
                if (((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null) != (-1645983431) + (((~(i7 | 2116853773)) | (-2142020944) | (~((-437035022) | i))) * 717) + (((~(i | 2116853773)) | (~((-437035022) | i7)) | (-2142020944)) * 717)) {
                    int i23 = 1875829302 % 2;
                    throw new ArithmeticException();
                }
                super.onCreate(bundle);
                int i24 = INotificationSideChannel + 11;
                INotificationSideChannelStubProxy = i24 % 128;
                int i25 = i24 % 2;
                return null;
            case 5:
                return b(objArr);
            case 6:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            default:
                ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity3 = (ClaimOldDaySecurityReactivationActivity) objArr[0];
                int i26 = 2 % 2;
                int i27 = INotificationSideChannel + 13;
                INotificationSideChannelStubProxy = i27 % 128;
                int i28 = i27 % 2;
                int i29 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i30 = ~iMaxMemory;
                if (i29 != 1455869095 + (((~((-315820918) | i30)) | (-1145808461)) * (-602)) + (((~(iMaxMemory | (-315820918))) | 311429425 | (~((-1141416969) | i30))) * (-301)) + ((~(i30 | (-1145808461))) * 301)) {
                    throw null;
                }
                int i31 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
                int iMyPid = Process.myPid();
                int i32 = ~iMyPid;
                if (i31 != ((((~(2054175711 | i32)) | (~(iMyPid | 338264380))) * 959) - 878398209) + (((~(iMyPid | 2054175711)) | (~(i32 | 338264380))) * 959)) {
                    int i33 = (-1736486530) % 2;
                    throw new ArithmeticException();
                }
                super.onStart();
                int i34 = INotificationSideChannelStubProxy + 105;
                INotificationSideChannel = i34 % 128;
                int i35 = i34 % 2;
                return null;
        }
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
    private static void c(byte r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            int r9 = 53 - r9
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityReactivationActivity.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2a:
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityReactivationActivity.c(byte, int, int, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity = (ClaimOldDaySecurityReactivationActivity) objArr[0];
        File file = (File) objArr[1];
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 81;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        claimOldDaySecurityReactivationActivity.b(file);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = INotificationSideChannel + 39;
        INotificationSideChannelStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity, File file) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 91;
        int i3 = i2 % 128;
        INotificationSideChannelStubProxy = i3;
        int i4 = i2 % 2;
        claimOldDaySecurityReactivationActivity.TuitionPaymentFragmentbindingInflater1 = file;
        int i5 = i3 + 111;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 64 / 0;
        }
    }

    public ClaimOldDaySecurityReactivationActivity() {
        final ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity = this;
        this.a = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityReactivationActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = claimOldDaySecurityReactivationActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityClaimOldDaySecurityReactivationBinding> TuitionPaymentFragmentbindingInflater1() {
        ClaimOldDaySecurityReactivationActivity$bindingInflater$1 claimOldDaySecurityReactivationActivity$bindingInflater$1;
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 71;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            claimOldDaySecurityReactivationActivity$bindingInflater$1 = ClaimOldDaySecurityReactivationActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
            int i3 = 97 / 0;
        } else {
            claimOldDaySecurityReactivationActivity$bindingInflater$1 = ClaimOldDaySecurityReactivationActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        }
        int i4 = INotificationSideChannelStubProxy + 91;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        return claimOldDaySecurityReactivationActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 11;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity = this;
        Intrinsics.checkNotNullParameter(claimOldDaySecurityReactivationActivity, "");
        claimOldDaySecurityReactivationActivity.getWindow().addFlags(8192);
        INotificationSideChannel();
        TuitionPaymentFragmentbindingInflater1((Toolbar) INotificationSideChannelStub().layoutToolbar, true);
        INotificationSideChannelStub().tvToolbarTitle.setText(getString(R.string.title_reactivation));
        RequestManager requestManagerWith = Glide.with(this);
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity2 = this;
        requestManagerWith.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getMaxImages.onError()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(ContextCompat.getDrawable(claimOldDaySecurityReactivationActivity2, R.drawable.ic_placeholder_wide)).TuitionPaymentFragmentbindingInflater1(ContextCompat.getDrawable(claimOldDaySecurityReactivationActivity2, R.drawable.ic_placeholder_wide)).into(INotificationSideChannelStub().imgBanner);
        INotificationSideChannelStub().rbNo.setChecked(true);
        int i4 = INotificationSideChannelStubProxy + 119;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ActivityClaimOldDaySecurityReactivationBinding activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        EditText editText = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tilChooseLocation.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new getEncoderProfilesProvider(this));
            int i2 = INotificationSideChannel + 15;
            INotificationSideChannelStubProxy = i2 % 128;
            int i3 = i2 % 2;
        }
        EditText editText2 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tilChooseJobFirst.getEditText();
        if (editText2 != null) {
            editText2.setOnClickListener(new View.OnClickListener() { // from class: Camera2CameraImplUseCaseInfo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ClaimOldDaySecurityReactivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
                }
            });
            int i4 = INotificationSideChannelStubProxy + 113;
            INotificationSideChannel = i4 % 128;
            int i5 = i4 % 2;
        }
        EditText editText3 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tilChooseJobSecond.getEditText();
        if (editText3 != null) {
            editText3.setOnClickListener(new View.OnClickListener() { // from class: lambdarun0androidxcameracamera2internalCamera2CameraImplStateCallbackScheduledReopen
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws IllegalAccessException {
                    ClaimOldDaySecurityReactivationActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
                }
            });
        }
        activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.imgSelfiePhoto.setOnClickListener(new View.OnClickListener() { // from class: Camera2CameraImplStateCallbackScheduledReopenExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClaimOldDaySecurityReactivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, view);
            }
        });
        activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.rgChooseIsBpu.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: Camera2CameraInfoImpl
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i6) {
                ClaimOldDaySecurityReactivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, radioGroup);
            }
        });
        MaterialButton materialButton = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: logDeviceInfo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClaimOldDaySecurityReactivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 3;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (IndividualDataClaim) getIntent().getParcelableExtra("activation_data");
        int i4 = INotificationSideChannel + 77;
        INotificationSideChannelStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void INotificationSideChannel() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 117;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        ActivityClaimOldDaySecurityReactivationBinding activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextView textView = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tvNumberTwo;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        TextView textView2 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tvQuestionWork;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
        TextInputLayout textInputLayout = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tilChooseJobFirst;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        textInputLayout.setVisibility(8);
        TextInputLayout textInputLayout2 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tilChooseJobSecond;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        textInputLayout2.setVisibility(8);
        TextView textView3 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tvNumberThree;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(8);
        TextView textView4 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tvWorkLocation;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setVisibility(8);
        TextInputLayout textInputLayout3 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tilChooseLocation;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        textInputLayout3.setVisibility(8);
        TextView textView5 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tvNumberFour;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        textView5.setVisibility(8);
        TextView textView6 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tvMonthlyFee;
        Intrinsics.checkNotNullExpressionValue(textView6, "");
        textView6.setVisibility(8);
        RadioGroup radioGroup = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.rgMonthlyFee;
        Intrinsics.checkNotNullExpressionValue(radioGroup, "");
        radioGroup.setVisibility(8);
        TextView textView7 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tvNumberFive;
        Intrinsics.checkNotNullExpressionValue(textView7, "");
        textView7.setVisibility(8);
        TextView textView8 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tvFamilyCardNumber;
        Intrinsics.checkNotNullExpressionValue(textView8, "");
        textView8.setVisibility(8);
        TextInputLayout textInputLayout4 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tilFamilyCardNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        textInputLayout4.setVisibility(8);
        TextView textView9 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tvNumberSix;
        Intrinsics.checkNotNullExpressionValue(textView9, "");
        textView9.setVisibility(8);
        TextView textView10 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tvCaptureImage;
        Intrinsics.checkNotNullExpressionValue(textView10, "");
        textView10.setVisibility(8);
        CardView cardView = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.cvCaptureImage;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        cardView.setVisibility(8);
        AppCompatCheckBox appCompatCheckBox = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.cbAgreeTermCondition;
        Intrinsics.checkNotNullExpressionValue(appCompatCheckBox, "");
        appCompatCheckBox.setVisibility(8);
        int i4 = INotificationSideChannel + 89;
        INotificationSideChannelStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void b(File p0) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 109;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Glide.with(this).b(p0).into(INotificationSideChannelStub().imgSelfiePhoto);
        INotificationSideChannelStub().imgCapture.setVisibility(8);
        INotificationSideChannelStub().tvCaptureLabel.setVisibility(8);
        int i4 = INotificationSideChannel + 103;
        INotificationSideChannelStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void e(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        char c;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = cancelAll;
        int i4 = 1770390596;
        long j = 0;
        int i5 = 3;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i5;
                        byte b3 = (byte) (b2 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 2268, 33 - TextUtils.indexOf("", ""), -1927765101, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    i4 = 1770390596;
                    j = 0;
                    i5 = 3;
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
        Object[] objArr3 = {Integer.valueOf(onTransact)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        char c2 = '\b';
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b4 = (byte) 3;
            byte b5 = (byte) (b4 - 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getTouchSlop() >> 8) + 2267, 33 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1927765101, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i7 = $11 + 21;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                i2 = i + 75;
                cArr4[i2] = (char) (cArr[i2] / b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        char c3 = 5;
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                    c = c2;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = deinitsession;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = deinitsession;
                    objArr4[9] = deinitsession;
                    objArr4[c2] = Integer.valueOf(cCharValue);
                    objArr4[7] = deinitsession;
                    objArr4[6] = deinitsession;
                    objArr4[c3] = Integer.valueOf(cCharValue);
                    objArr4[4] = deinitsession;
                    objArr4[3] = deinitsession;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[1] = deinitsession;
                    objArr4[0] = deinitsession;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 2;
                        byte b7 = (byte) (b6 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49268 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 3261 - (ViewConfiguration.getTapTimeout() >> 16), 30 - (ViewConfiguration.getEdgeSlop() >> 16), -127612708, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            c = '\b';
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.getMode(0) + 22878), Color.argb(0, 0, 0, 0) + 594, 17 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1570859318, false, $$i(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c = '\b';
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i8 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i8];
                    } else {
                        c = '\b';
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i9 = $11 + 95;
                            $10 = i9 % 128;
                            int i10 = i9 % 2;
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i11 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i11];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                        } else {
                            int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i13];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                c2 = c;
                c3 = 5;
            }
        }
        int i15 = 0;
        while (i15 < i) {
            cArr4[i15] = (char) (cArr4[i15] ^ 13722);
            i15++;
            int i16 = $11 + 105;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 4 / 5;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityReactivationActivity$onActivityResult$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityReactivationActivity$onActivityResult$1", f = "ClaimOldDaySecurityReactivationActivity.kt", i = {}, l = {377}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Image $image;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity = ClaimOldDaySecurityReactivationActivity.this;
                String str = this.$image.TuitionPaymentFragmentbindingInflater1;
                Intrinsics.checkNotNullExpressionValue(str, "");
                final ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity2 = ClaimOldDaySecurityReactivationActivity.this;
                this.label = 1;
                if (Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(claimOldDaySecurityReactivationActivity, str, new Function1() { // from class: getCameraCharacteristicsMap
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ClaimOldDaySecurityReactivationActivity.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(claimOldDaySecurityReactivationActivity2, (File) obj2);
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

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity, File file) throws IllegalAccessException {
            ClaimOldDaySecurityReactivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(claimOldDaySecurityReactivationActivity, file);
            ClaimOldDaySecurityReactivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(claimOldDaySecurityReactivationActivity, file);
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
            return ClaimOldDaySecurityReactivationActivity.this.new AnonymousClass1(this.$image, continuation);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int p0, int p1, Intent p2) {
        int i = 2 % 2;
        if (p1 == -1) {
            int i2 = INotificationSideChannelStubProxy;
            int i3 = i2 + 111;
            INotificationSideChannel = i3 % 128;
            int i4 = i3 % 2;
            if (p0 == 553 && p2 != null) {
                int i5 = i2 + 71;
                INotificationSideChannel = i5 % 128;
                int i6 = i5 % 2;
                b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(getCaptureNode.b(p2), null), 3, null);
            }
        }
        super.onActivityResult(p0, p1, p2);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (29945 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int iResolveSize = View.resolveSize(0, 0) + 1755;
            int bitsPerPixel = 22 - ImageFormat.getBitsPerPixel(0);
            byte[] bArr = $$a;
            byte b = bArr[7];
            short s = bArr[5];
            Object[] objArr2 = new Object[1];
            c(b, s, (byte) (s & 15), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iResolveSize, bitsPerPixel, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char gidForName = (char) (Process.getGidForName("") + 29945);
                int defaultSize = 1755 - View.getDefaultSize(0, 0);
                int i3 = 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr3 = new Object[1];
                c(b3, (short) (b3 | 36), b2, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName, defaultSize, i3, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i4 = ((int[]) objArr4[0])[0];
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{i4}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i5 = ~elapsedCpuTime;
            int i6 = (-564761038) + (((~(i5 | 8122852)) | 204479573) * (-1042)) + ((8122852 | elapsedCpuTime) * 521) + (((~(elapsedCpuTime | (-204479574))) | 3149892 | (~(i5 | 209452533))) * 521) + 1876316737;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{11, '\b', '\b', 7, '\f', '\n', 7, '\t', 6, 16, 2, 15, 4, 3, '\b', 24}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 111), 16 - KeyEvent.getDeadChar(0, 0), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{21, 17, 5, '\t', 7, 2, 7, 22, 16, '\t', 1, 23, 11, '\r', 19, 6}, (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 85), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_instruction_step4).substring(26, 27).length() + 15, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {689861419};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf("", "") + 42049), 1726 - Color.green(0), AndroidCharacter.getMirror('0') - 19, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 1876316737, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char keyRepeatDelay = (char) (29944 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1755;
                    int scrollBarSize = 23 - (ViewConfiguration.getScrollBarSize() >> 8);
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr8 = new Object[1];
                    c(b5, (short) (b5 | 36), b4, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatDelay, scrollBarFadeDuration, scrollBarSize, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{7, '\t', 19, 1, 17, 2, 21, 16, '\r', 2, '\n', 1, 18, 2, 4, 7, 20, '\r', '\n', '\r', '\b', 15}, (byte) (44 - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 22, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{14, 19, 5, 16, 4, '\b', 15, 21, 5, 7, '\f', 4, 23, 24, 13829}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 100), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 29944);
                        int mode = View.MeasureSpec.getMode(0) + 1755;
                        int scrollDefaultDelay = 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        byte b6 = $$a[7];
                        byte b7 = b6;
                        Object[] objArr11 = new Object[1];
                        c(b7, (short) (b7 | 88), b6, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cKeyCodeFromString, mode, scrollDefaultDelay, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char mode2 = (char) (29944 - View.MeasureSpec.getMode(0));
                        int maxKeyCode = 1755 - (KeyEvent.getMaxKeyCode() >> 16);
                        int iRgb = Color.rgb(0, 0, 0) + 16777239;
                        byte[] bArr2 = $$a;
                        byte b8 = bArr2[7];
                        short s2 = bArr2[5];
                        Object[] objArr12 = new Object[1];
                        c(b8, s2, (byte) (s2 & 15), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode2, maxKeyCode, iRgb, 986134021, false, (String) objArr12[0], null);
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
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr == null) {
                throw null;
            }
            while (i2 < strArr.length) {
                arrayList.add(strArr[i2]);
                i2++;
            }
            throw null;
        }
        int i9 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        int i10 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        Object[] objArr13 = {new int[]{i10}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i11 = ~iIdentityHashCode;
        int i12 = 891336941 + (((~((-1000481884) | i11)) | 285220954 | (~(787879457 | i11)) | (~((-72618529) | iIdentityHashCode))) * (-84));
        int i13 = (~(iIdentityHashCode | 787879457)) | 1000481883;
        int i14 = ~(i11 | (-787879458));
        int i15 = i9 + i12 + ((i13 | i14) * (-84)) + ((72618528 | i14) * 84);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr13[3])[0] = i17 ^ (i17 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1032;
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 15;
            byte b9 = $$a[7];
            byte b10 = b9;
            Object[] objArr14 = new Object[1];
            c(b10, (short) (b10 | 140), b9, objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, iLastIndexOf, iIndexOf, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new char[]{7, '\t', 19, 1, 17, 2, 21, 16, '\r', 2, '\n', 1, 18, 2, 4, 7, 20, '\r', '\n', '\r', '\b', 15}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.txt_checkout).substring(0, 15).length() + 30), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new char[]{14, 19, 5, 16, 4, '\b', 15, 21, 5, 7, '\f', 4, 23, 24, 13829}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step1).substring(2, 4).length() + 4), 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cMyPid = (char) (Process.myPid() >> 22);
            int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1031;
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 16;
            byte b11 = $$a[7];
            byte b12 = b11;
            Object[] objArr17 = new Object[1];
            c(b12, (short) (b12 | 36), b11, objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cMyPid, scrollDefaultDelay2, packedPositionChild, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i18 = INotificationSideChannel + 51;
            INotificationSideChannelStubProxy = i18 % 128;
            int i19 = i18 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char maxKeyCode2 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int size = 1031 - View.MeasureSpec.getSize(0);
                int gidForName2 = Process.getGidForName("") + 16;
                Object[] objArr18 = new Object[1];
                c($$a[28], (short) DerHeader.TAG_CLASS_PRIVATE, (byte) 52, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(maxKeyCode2, size, gidForName2, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i20 = ((int[]) objArr19[3])[0];
            int i21 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 947777615;
            int i22 = ~length;
            int i23 = (-1061121338) + ((~(331257682 | i22)) * 979) + ((length | 575537852) * (-979)) + (((~(length | 331257682)) | (~(i22 | 575537852))) * 979) + 846686934;
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr[2])[0] = i25 ^ (i25 << 5);
            int i26 = INotificationSideChannel + 89;
            INotificationSideChannelStubProxy = i26 % 128;
            int i27 = i26 % 2;
        } else {
            Object[] objArr20 = new Object[1];
            e(new char[]{11, '\b', '\b', 7, '\f', '\n', 7, '\t', 6, 16, 2, 15, 4, 3, '\b', 24}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.telkomsel_instruction_step3).substring(10, 11).length() + 3), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new char[]{21, 17, 5, '\t', 7, 2, 7, 22, 16, '\t', 1, 23, 11, '\r', 19, 6}, (byte) (85 - Color.green(0)), 16 - KeyEvent.keyCodeFromString(""), objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {689861419};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - (ViewConfiguration.getWindowTouchSlop() >> 8)), ExpandableListView.getPackedPositionType(0L) + 1134, 'B' - AndroidCharacter.getMirror('0'), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 846686934, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cResolveSize = (char) View.resolveSize(0, 0);
                int i28 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1030;
                int i29 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14;
                byte b13 = $$a[7];
                byte b14 = b13;
                Object[] objArr24 = new Object[1];
                c(b14, (short) (b14 | 140), b13, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cResolveSize, i28, i29, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - Color.alpha(0)), 1117 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 16 - TextUtils.lastIndexOf("", '0', 0)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                int trimmedLength = TextUtils.getTrimmedLength("") + 1031;
                int deadChar = KeyEvent.getDeadChar(0, 0) + 15;
                Object[] objArr25 = new Object[1];
                c($$a[28], (short) DerHeader.TAG_CLASS_PRIVATE, (byte) 52, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cResolveSizeAndState, trimmedLength, deadChar, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{7, '\t', 19, 1, 17, 2, 21, 16, '\r', 2, '\n', 1, 18, 2, 4, 7, 20, '\r', '\n', '\r', '\b', 15}, (byte) (TextUtils.getOffsetBefore("", 0) + 45), 22 - View.MeasureSpec.getSize(0), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{14, 19, 5, 16, 4, '\b', 15, 21, 5, 7, '\f', 4, 23, 24, 13829}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.copied_bill_code).substring(12, 13).codePointAt(0) - 26), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c3 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int i30 = 1032 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 15;
                    byte b15 = $$a[7];
                    byte b16 = b15;
                    Object[] objArr28 = new Object[1];
                    c(b16, (short) (b16 | 36), b15, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c3, i30, offsetAfter, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int iLastIndexOf2 = 1030 - TextUtils.lastIndexOf("", '0', 0);
                    int i31 = 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte b17 = $$a[7];
                    byte b18 = b17;
                    Object[] objArr29 = new Object[1];
                    c(b18, (short) (b18 | 140), b17, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(tapTimeout, iLastIndexOf2, i31, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i32 = ((int[]) objArr[1])[0];
        int i33 = ((int[]) objArr[3])[0];
        if (i33 != i32) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                while (i2 < strArr3.length) {
                    int i34 = INotificationSideChannel + 123;
                    INotificationSideChannelStubProxy = i34 % 128;
                    if (i34 % 2 == 0) {
                        arrayList2.add(strArr3[i2]);
                        i2 += 15;
                    } else {
                        arrayList2.add(strArr3[i2]);
                        i2++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i33));
        }
        Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i35 = ((int[]) objArr[2])[0];
        int i36 = ((int[]) objArr[3])[0];
        int i37 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i38 = ~iFreeMemory;
        int i39 = ~((-1037862492) | i38);
        int i40 = ~(793582321 | iFreeMemory);
        int i41 = i35 + 1517103762 + ((i39 | i40) * 1150) + (((~((-793582322) | i38)) | i40) * (-575)) + (((~(iFreeMemory | (-1037862492))) | (~(i38 | 1037862491))) * 575);
        int i42 = (i41 << 13) ^ i41;
        int i43 = i42 ^ (i42 >>> 17);
        ((int[]) objArr30[2])[0] = i43 ^ (i43 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 7;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
        int i6 = ~(603142495 | i5);
        if (i4 != (-1330080347) + (((-2013003136) | i6) * (-814)) + ((i6 | (~((~i5) | 1433130038)) | 23269398) * 407) + (((~(i5 | (-1433130039))) | (~((-603142496) | i5)) | 23269398) * 407)) {
            int i7 = (-1682265602) % 2;
            throw new ArithmeticException();
        }
        int i8 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i8 != 1544310324 + (((~(2096938999 | iIdentityHashCode)) | 482116965) * (-756)) + (((~iIdentityHashCode) | 2096938999) * 756)) {
            int i9 = (-35300684) % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i10 = INotificationSideChannel + 53;
        INotificationSideChannelStubProxy = i10 % 128;
        int i11 = i10 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity = (ClaimOldDaySecurityReactivationActivity) objArr[0];
        WorkLocation workLocation = (WorkLocation) objArr[1];
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 109;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(workLocation, "");
        if (i3 != 0) {
            claimOldDaySecurityReactivationActivity.b = workLocation;
            claimOldDaySecurityReactivationActivity.INotificationSideChannelStub().tilChooseLocation.getEditText();
            throw null;
        }
        claimOldDaySecurityReactivationActivity.b = workLocation;
        EditText editText = claimOldDaySecurityReactivationActivity.INotificationSideChannelStub().tilChooseLocation.getEditText();
        if (editText != null) {
            editText.setText(workLocation.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int i4 = INotificationSideChannelStubProxy + 27;
            INotificationSideChannel = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity, View view) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 77;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            saveBitmap savebitmap = (saveBitmap) claimOldDaySecurityReactivationActivity.d.getValue();
            FragmentManager supportFragmentManager = claimOldDaySecurityReactivationActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(savebitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i4 = INotificationSideChannel + 51;
                INotificationSideChannelStubProxy = i4 % 128;
                int i5 = i4 % 2;
                savebitmap.show(supportFragmentManager, savebitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ getActivitySideSheetPosition b(final ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity) {
        int i = 2 % 2;
        getActivitySideSheetPosition.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = getActivitySideSheetPosition.INSTANCE;
        getActivitySideSheetPosition getactivitysidesheetpositionTuitionPaymentFragmentbindingInflater1 = getActivitySideSheetPosition.Companion.TuitionPaymentFragmentbindingInflater1(claimOldDaySecurityReactivationActivity.b, new Function1() { // from class: getCamera2CameraInfo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClaimOldDaySecurityReactivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (WorkLocation) obj);
            }
        });
        int i2 = INotificationSideChannelStubProxy + 45;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        return getactivitysidesheetpositionTuitionPaymentFragmentbindingInflater1;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity, RadioGroup radioGroup) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 39;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(radioGroup, "");
        if (i3 == 0) {
            claimOldDaySecurityReactivationActivity.INotificationSideChannelStub().rgChooseIsBpu.getCheckedRadioButtonId();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int checkedRadioButtonId = claimOldDaySecurityReactivationActivity.INotificationSideChannelStub().rgChooseIsBpu.getCheckedRadioButtonId();
        if (checkedRadioButtonId == R.id.rbNo || checkedRadioButtonId != R.id.rbYes) {
            claimOldDaySecurityReactivationActivity.INotificationSideChannel();
            return;
        }
        int i4 = INotificationSideChannelStubProxy + 15;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        ActivityClaimOldDaySecurityReactivationBinding activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub = claimOldDaySecurityReactivationActivity.INotificationSideChannelStub();
        TextView textView = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tvNumberTwo;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        TextView textView2 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tvQuestionWork;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(0);
        TextInputLayout textInputLayout = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tilChooseJobFirst;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        textInputLayout.setVisibility(0);
        TextInputLayout textInputLayout2 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tilChooseJobSecond;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        textInputLayout2.setVisibility(0);
        TextView textView3 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tvNumberThree;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(0);
        TextView textView4 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tvWorkLocation;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setVisibility(0);
        TextInputLayout textInputLayout3 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tilChooseLocation;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        textInputLayout3.setVisibility(0);
        TextView textView5 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tvNumberFour;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        textView5.setVisibility(0);
        TextView textView6 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tvMonthlyFee;
        Intrinsics.checkNotNullExpressionValue(textView6, "");
        textView6.setVisibility(0);
        RadioGroup radioGroup2 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.rgMonthlyFee;
        Intrinsics.checkNotNullExpressionValue(radioGroup2, "");
        radioGroup2.setVisibility(0);
        TextView textView7 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tvNumberFive;
        Intrinsics.checkNotNullExpressionValue(textView7, "");
        textView7.setVisibility(0);
        TextView textView8 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tvFamilyCardNumber;
        Intrinsics.checkNotNullExpressionValue(textView8, "");
        textView8.setVisibility(0);
        TextInputLayout textInputLayout4 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tilFamilyCardNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        textInputLayout4.setVisibility(0);
        TextView textView9 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tvNumberSix;
        Intrinsics.checkNotNullExpressionValue(textView9, "");
        textView9.setVisibility(0);
        TextView textView10 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tvCaptureImage;
        Intrinsics.checkNotNullExpressionValue(textView10, "");
        textView10.setVisibility(0);
        CardView cardView = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.cvCaptureImage;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        cardView.setVisibility(0);
        AppCompatCheckBox appCompatCheckBox = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.cbAgreeTermCondition;
        Intrinsics.checkNotNullExpressionValue(appCompatCheckBox, "");
        appCompatCheckBox.setVisibility(0);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            outputFormatToAudioProfile outputformattoaudioprofile = claimOldDaySecurityReactivationActivity.g;
            String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(outputformattoaudioprofile.new AnonymousClass4((String[]) Arrays.copyOf(strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length)));
            final Function1 function1 = new Function1() { // from class: getCameraQuirks
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ClaimOldDaySecurityReactivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Boolean) obj);
                }
            };
            BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartCompose.subscribe(new logToString() { // from class: getImplementationType
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    ClaimOldDaySecurityReactivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
            ((acquireBuffer) claimOldDaySecurityReactivationActivity.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
            ViewPortBuilder.b();
            int i2 = INotificationSideChannel + 55;
            INotificationSideChannelStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
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

    private static /* synthetic */ Object b(Object[] objArr) {
        ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity = (ClaimOldDaySecurityReactivationActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 71;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            saveBitmap savebitmap = (saveBitmap) claimOldDaySecurityReactivationActivity.asInterface.getValue();
            FragmentManager supportFragmentManager = claimOldDaySecurityReactivationActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(savebitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i4 = INotificationSideChannel + 59;
                INotificationSideChannelStubProxy = i4 % 128;
                int i5 = i4 % 2;
                savebitmap.show(supportFragmentManager, savebitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            ViewPortBuilder.b();
            int i6 = INotificationSideChannel + 91;
            INotificationSideChannelStubProxy = i6 % 128;
            int i7 = i6 % 2;
            return null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity, Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 93;
        INotificationSideChannelStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (bitmap == null) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Gagal mengambil gambar", 0).show();
            return;
        }
        File fileTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityReactivationActivity, bitmap, false);
        claimOldDaySecurityReactivationActivity.TuitionPaymentFragmentbindingInflater1 = fileTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (fileTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            int i3 = INotificationSideChannelStubProxy + 23;
            INotificationSideChannel = i3 % 128;
            if (i3 % 2 == 0) {
                claimOldDaySecurityReactivationActivity.b(fileTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            } else {
                claimOldDaySecurityReactivationActivity.b(fileTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                throw null;
            }
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 113;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = INotificationSideChannel + 65;
        INotificationSideChannelStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity, Boolean bool) {
        int i = 2 % 2;
        if (bool.booleanValue()) {
            int i2 = INotificationSideChannel + 43;
            INotificationSideChannelStubProxy = i2 % 128;
            int i3 = i2 % 2;
            claimOldDaySecurityReactivationActivity.TuitionPaymentFragmentbindingInflater1 = null;
            claimOldDaySecurityReactivationActivity.INotificationSideChannelStub().imgSelfiePhoto.setImageResource(0);
            claimOldDaySecurityReactivationActivity.INotificationSideChannelStub().imgCapture.setVisibility(0);
            claimOldDaySecurityReactivationActivity.INotificationSideChannelStub().tvCaptureLabel.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 33) {
                claimOldDaySecurityReactivationActivity.INotificationSideChannel.launch(null);
            } else {
                updateFileExif updatefileexif = new updateFileExif();
                ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity2 = claimOldDaySecurityReactivationActivity;
                Intent intent = new Intent(claimOldDaySecurityReactivationActivity2, (Class<?>) ImagePickerActivity.class);
                intent.putExtra("CameraOnlyConfig", updatefileexif.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                claimOldDaySecurityReactivationActivity2.startActivityForResult(intent, 553);
            }
        } else {
            ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity3 = claimOldDaySecurityReactivationActivity;
            String string = claimOldDaySecurityReactivationActivity.getString(R.string.message_camera_storage_permission_required);
            Intrinsics.checkNotNullExpressionValue(string, "");
            AutoValue_LifecycleCameraRepository_Key.b(claimOldDaySecurityReactivationActivity3, string);
            int i4 = INotificationSideChannel + 51;
            INotificationSideChannelStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity, Job job) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 69;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(job, "");
        if (i3 != 0) {
            claimOldDaySecurityReactivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = job;
            claimOldDaySecurityReactivationActivity.INotificationSideChannelStub().tilChooseJobSecond.getEditText();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        claimOldDaySecurityReactivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = job;
        EditText editText = claimOldDaySecurityReactivationActivity.INotificationSideChannelStub().tilChooseJobSecond.getEditText();
        if (editText != null) {
            editText.setText(job.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = INotificationSideChannelStubProxy + 107;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity, View view) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 79;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            getActivitySideSheetPosition getactivitysidesheetposition = (getActivitySideSheetPosition) claimOldDaySecurityReactivationActivity.asBinder.getValue();
            FragmentManager supportFragmentManager = claimOldDaySecurityReactivationActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getactivitysidesheetposition.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i4 = INotificationSideChannelStubProxy + 37;
                INotificationSideChannel = i4 % 128;
                if (i4 % 2 != 0) {
                    getactivitysidesheetposition.show(supportFragmentManager, getactivitysidesheetposition.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    throw null;
                }
                getactivitysidesheetposition.show(supportFragmentManager, getactivitysidesheetposition.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit b(ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity, Job job) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 41;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(job, "");
        claimOldDaySecurityReactivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = job;
        EditText editText = claimOldDaySecurityReactivationActivity.INotificationSideChannelStub().tilChooseJobFirst.getEditText();
        if (editText != null) {
            int i4 = INotificationSideChannel + 125;
            INotificationSideChannelStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                editText.setText(job.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                throw null;
            }
            editText.setText(job.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        final ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity = (ClaimOldDaySecurityReactivationActivity) objArr[0];
        int i = 2 % 2;
        saveBitmap.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = saveBitmap.INSTANCE;
        saveBitmap savebitmapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = saveBitmap.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(claimOldDaySecurityReactivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1, new Function1() { // from class: getReopenLimitMs
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClaimOldDaySecurityReactivationActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Job) obj);
            }
        });
        int i2 = INotificationSideChannel + 73;
        INotificationSideChannelStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return savebitmapTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f5  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity, View view) {
        boolean z;
        String str;
        String str2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ActivityClaimOldDaySecurityReactivationBinding activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub = claimOldDaySecurityReactivationActivity.INotificationSideChannelStub();
        String str3 = null;
        if (activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.rgChooseIsBpu.getCheckedRadioButtonId() != R.id.rbNo) {
            if (activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.rgChooseIsBpu.getCheckedRadioButtonId() == -1) {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Pilih jawaban untuk pertanyaan pertama", 0).show();
                z = false;
            } else {
                z = true;
            }
            Editable text = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.edtChooseJobFirst.getText();
            if (text != null) {
                int i2 = INotificationSideChannel + 3;
                INotificationSideChannelStubProxy = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 44 / 0;
                    if (text.length() != 0) {
                        activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tilChooseJobFirst.setError(null);
                    } else {
                        activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tilChooseJobFirst.setError("Pekerjaan 1 harus diisi");
                        z = false;
                    }
                } else if (text.length() != 0) {
                    activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tilChooseJobFirst.setError(null);
                } else {
                    activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tilChooseJobFirst.setError("Pekerjaan 1 harus diisi");
                    z = false;
                }
            } else {
                activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tilChooseJobFirst.setError("Pekerjaan 1 harus diisi");
                z = false;
            }
            Editable text2 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.edtChooseLocation.getText();
            if (text2 == null || text2.length() == 0) {
                activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tilChooseLocation.setError("Lokasi pekerjaan harus diisi");
                int i4 = INotificationSideChannel + 37;
                INotificationSideChannelStubProxy = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            } else {
                activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tilChooseLocation.setError(null);
            }
            if (activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.rgMonthlyFee.getCheckedRadioButtonId() == -1) {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Pilih jumlah iuran yang akan dibayarkan", 0).show();
                z = false;
            }
            Editable text3 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.edtFamilyCardNumber.getText();
            if (text3 != null) {
                int i6 = INotificationSideChannel + 123;
                INotificationSideChannelStubProxy = i6 % 128;
                int i7 = i6 % 2;
                if (text3.length() != 0) {
                    int i8 = INotificationSideChannelStubProxy + 77;
                    INotificationSideChannel = i8 % 128;
                    int i9 = i8 % 2;
                    if (String.valueOf(activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.edtFamilyCardNumber.getText()).length() == 16) {
                        activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tilFamilyCardNumber.setError(null);
                    } else {
                        activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tilFamilyCardNumber.setError("Nomor Kartu Keluarga harus diisi dan terdiri dari 16 karakter");
                        z = false;
                    }
                } else {
                    activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tilFamilyCardNumber.setError("Nomor Kartu Keluarga harus diisi dan terdiri dari 16 karakter");
                    z = false;
                }
            } else {
                activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.tilFamilyCardNumber.setError("Nomor Kartu Keluarga harus diisi dan terdiri dari 16 karakter");
                z = false;
            }
            if (!activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub.cbAgreeTermCondition.isChecked()) {
                String string = claimOldDaySecurityReactivationActivity.getString(R.string.message_agreed_tnc);
                Intrinsics.checkNotNullExpressionValue(string, "");
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string, 0).show();
                z = false;
            }
            if (claimOldDaySecurityReactivationActivity.TuitionPaymentFragmentbindingInflater1 == null) {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Silahkan mengambil foto", 0).show();
            } else if (z) {
            }
            return Unit.INSTANCE;
        }
        int i10 = INotificationSideChannelStubProxy + 101;
        INotificationSideChannel = i10 % 128;
        int i11 = i10 % 2;
        ActivityClaimOldDaySecurityReactivationBinding activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub2 = claimOldDaySecurityReactivationActivity.INotificationSideChannelStub();
        if (activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub2.rgChooseIsBpu.getCheckedRadioButtonId() == R.id.rbYes) {
            IndividualDataClaim individualDataClaim = claimOldDaySecurityReactivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (individualDataClaim != null) {
                Job job = claimOldDaySecurityReactivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                String strValueOf = String.valueOf(job != null ? job.TuitionPaymentFragmentbindingInflater1 : null);
                Job job2 = claimOldDaySecurityReactivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                String strValueOf2 = String.valueOf(job2 != null ? job2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null);
                Job job3 = claimOldDaySecurityReactivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                String strValueOf3 = String.valueOf(job3 != null ? job3.TuitionPaymentFragmentbindingInflater1 : null);
                Job job4 = claimOldDaySecurityReactivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (job4 != null) {
                    int i12 = INotificationSideChannelStubProxy + 51;
                    INotificationSideChannel = i12 % 128;
                    if (i12 % 2 != 0) {
                        String str4 = job4.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        str3.hashCode();
                        throw null;
                    }
                    str = job4.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                } else {
                    str = null;
                }
                String strValueOf4 = String.valueOf(str);
                WorkLocation workLocation = claimOldDaySecurityReactivationActivity.b;
                String strValueOf5 = String.valueOf(workLocation != null ? workLocation.TuitionPaymentFragmentbindingInflater1 : null);
                WorkLocation workLocation2 = claimOldDaySecurityReactivationActivity.b;
                String strValueOf6 = String.valueOf(workLocation2 != null ? workLocation2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null);
                String strValueOf7 = String.valueOf(activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub2.edtFamilyCardNumber.getText());
                if (activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub2.rgMonthlyFee.getCheckedRadioButtonId() == R.id.rb50) {
                    int i13 = INotificationSideChannelStubProxy + 93;
                    INotificationSideChannel = i13 % 128;
                    if (i13 % 2 != 0) {
                        str3.hashCode();
                        throw null;
                    }
                    str2 = "IUR1";
                } else {
                    str2 = "IUR2";
                }
                String str5 = str2;
                String str6 = activityClaimOldDaySecurityReactivationBindingINotificationSideChannelStub2.rgMonthlyFee.getCheckedRadioButtonId() == R.id.rb50 ? "50400" : "100800";
                File file = claimOldDaySecurityReactivationActivity.TuitionPaymentFragmentbindingInflater1;
                IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "Y", strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strValueOf7, str5, str6, null, "", String.valueOf(file != null ? Camera2CameraControlExternalSyntheticLambda5.b(file) : null), "Y", null, false, null, null, null, null, null, null, null, -1, -1006567425, 127, null);
            }
        } else {
            IndividualDataClaim individualDataClaim2 = claimOldDaySecurityReactivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (individualDataClaim2 != null) {
                IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ExifInterface.GPS_DIRECTION_TRUE, "", null, "", null, "", "", "", "", "", null, "", "", ExifInterface.GPS_DIRECTION_TRUE, null, false, null, null, null, null, null, null, null, -1, -1005256705, 127, null);
            }
        }
        claimOldDaySecurityReactivationActivity.d_();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity, WorkLocation workLocation) {
        int iB = RecurringPlanResponse.b();
        int iB2 = RecurringPlanResponse.b();
        return (Unit) b(iB, RecurringPlanResponse.b(), RecurringPlanResponse.b(), -1659289524, new Object[]{claimOldDaySecurityReactivationActivity, workLocation}, iB2, 1659289526);
    }

    public static /* synthetic */ saveBitmap TuitionPaymentFragmentspecialinlinedviewModeldefault2(ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity) {
        int iB = RecurringPlanResponse.b();
        int iB2 = RecurringPlanResponse.b();
        return (saveBitmap) b(iB, RecurringPlanResponse.b(), RecurringPlanResponse.b(), 824783993, new Object[]{claimOldDaySecurityReactivationActivity}, iB2, -824783992);
    }

    public static /* synthetic */ void b(ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity, View view) throws IllegalAccessException {
        int iB = RecurringPlanResponse.b();
        int iB2 = RecurringPlanResponse.b();
        b(iB, RecurringPlanResponse.b(), RecurringPlanResponse.b(), 1392412818, new Object[]{claimOldDaySecurityReactivationActivity, view}, iB2, -1392412813);
    }

    public static /* synthetic */ saveBitmap TuitionPaymentFragmentspecialinlinedviewModeldefault3(ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity) {
        int iB = RecurringPlanResponse.b();
        int iB2 = RecurringPlanResponse.b();
        return (saveBitmap) b(iB, RecurringPlanResponse.b(), RecurringPlanResponse.b(), -741908873, new Object[]{claimOldDaySecurityReactivationActivity}, iB2, 741908876);
    }

    static {
        RemoteActionCompatParcelizer = 0;
        g();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannelDefault + 75;
        RemoteActionCompatParcelizer = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClaimOldDaySecurityReactivationActivity claimOldDaySecurityReactivationActivity, File file) throws IllegalAccessException {
        int iB = RecurringPlanResponse.b();
        int iB2 = RecurringPlanResponse.b();
        b(iB, RecurringPlanResponse.b(), RecurringPlanResponse.b(), -902081173, new Object[]{claimOldDaySecurityReactivationActivity, file}, iB2, 902081179);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 37;
        INotificationSideChannelStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return R.layout.activity_claim_old_day_security_reactivation;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 11;
        INotificationSideChannelStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 48 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 63;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 11;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 69 / 0;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 75;
        INotificationSideChannelStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 77;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int iB = setVisibility.b();
        int iB2 = RecurringPlanResponse.b();
        b(iB, setVisibility.b(), RecurringPlanResponse.b(), -728375907, new Object[]{this, bundle}, iB2, 728375911);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        b(RecurringPlanResponse.b(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_bank_transfer).substring(0, 3).length() - 624861898, RecurringPlanResponse.b(), 1902144415, new Object[]{this}, setVisibility.b(), -1902144415);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 117;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
        int i5 = INotificationSideChannel + 75;
        INotificationSideChannelStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
    }

    static void g() {
        cancelAll = new char[]{60072, 60060, 60047, 60040, 60041, 60056, 60058, 60045, 60053, 60062, 60088, 60117, 60052, 60049, 60055, 60043, 60063, 60034, 60048, 60083, 60073, 60051, 60050, 60054, 60075};
        onTransact = (char) 57188;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, byte r7, int r8) {
        /*
            int r8 = r8 * 3
            int r0 = r8 + 1
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r6 = 116 - r6
            byte[] r1 = com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityReactivationActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L29:
            int r7 = -r7
            int r3 = r3 + 1
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityReactivationActivity.$$i(byte, byte, int):java.lang.String");
    }
}
