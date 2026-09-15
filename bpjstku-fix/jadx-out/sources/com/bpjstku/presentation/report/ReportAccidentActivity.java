package com.bpjstku.presentation.report;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import com.bpjstku.data.report.model.request.NearestHealthcareRequest;
import com.bpjstku.data.report.model.request.ReportWorkAccidentRequest;
import com.bpjstku.data.vocation.model.request.VocationProfileRequest;
import com.bpjstku.databinding.ActivityReportingAccidentBinding;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.report.model.Healthcare;
import com.bpjstku.domain.report.model.ReportStatus;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.report.ReportAccidentActivity;
import com.bpjstku.util.utils.UserLocation;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.esafirm.imagepicker.features.ImagePickerActivity;
import com.esafirm.imagepicker.features.ImagePickerSavePath;
import com.esafirm.imagepicker.features.ReturnMode;
import com.google.android.material.textfield.TextInputLayout;
import com.google.gson.internal.bind.TypeAdapters;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.AnyRes;
import defpackage.AutoValue_LifecycleCameraRepository_Key;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.ExperimentalCamera2Interop;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.TargetAspectRatio;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.abortCapture;
import defpackage.accessconfigureInstanceInternal;
import defpackage.accessgetMCameraInfoMapp;
import defpackage.acquireBuffer;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.containsZslUseCase;
import defpackage.deriveCodec;
import defpackage.getCaptureNode;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getStringOrNull;
import defpackage.hasPreviewSurface;
import defpackage.initSession;
import defpackage.isImageAnalysis;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onOptionMatched;
import defpackage.onResume;
import defpackage.outputFormatToAudioProfile;
import defpackage.outputFormatToAudioProfile.AnonymousClass4;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setInactive;
import defpackage.setQuickZoomEnabled;
import defpackage.setSessionStateCallback;
import defpackage.share;
import defpackage.unregisterLifecycle;
import defpackage.updateFileExif;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.b;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0015\u0010\u001b\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0015\u0010\u001d\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0015\u0010\b\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\n\u001a\u00020%8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\r\u0010&R\u0018\u0010\r\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010\u0007\u001a\u00020\u00138\u0015X\u0095D¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u001b\u0010,R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00020-8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010/R\u0015\u0010\t\u001a\u0002008CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0017\u0010(\u001a\u0004\u0018\u0001018CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b2\u0010\u001aR\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0015\u00107\u001a\u0002068CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u0016\u00102\u001a\u0002088\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u00109R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00150:8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00150:8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u0010<"}, d2 = {"Lcom/bpjstku/presentation/report/ReportAccidentActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityReportingAccidentBinding;", "<init>", "()V", "", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "a", "asInterface", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "LcontainsZslUseCase;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentbindingInflater1", "LoutputFormatToAudioProfile;", "LoutputFormatToAudioProfile;", "LacquireBuffer;", "Lcom/bpjstku/util/utils/UserLocation;", "INotificationSideChannelDefault", "Lcom/bpjstku/util/utils/UserLocation;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/io/File;", "Ljava/io/File;", "Lcom/bpjstku/domain/report/model/Healthcare;", "onTransact", "Lcom/bpjstku/domain/report/model/Healthcare;", "g", "I", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "LisImageAnalysis;", "Lcom/bpjstku/domain/user/model/User;", "cancelAll", "LgetStringOrNull;", "cancel", "LgetStringOrNull;", "LhasPreviewSurface;", "notify", "", "Ljava/lang/String;", "Landroidx/activity/result/ActivityResultLauncher;", "INotificationSideChannel", "Landroidx/activity/result/ActivityResultLauncher;", "INotificationSideChannelStub"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReportAccidentActivity extends BindingReactiveFormActivity<ActivityReportingAccidentBinding> {
    private static long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int write;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private UserLocation TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private getStringOrNull cancel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private File asInterface;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private Healthcare d;
    private static final byte[] $$c = {32, 1, 70, -122};
    private static final int $$f = 70;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {111, 40, 23, -13, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 189;
    private static int INotificationSideChannelStubProxy = 0;
    private static int INotificationSideChannelStub = 0;
    private static int getInterfaceDescriptor = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final outputFormatToAudioProfile b = new outputFormatToAudioProfile(this);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int asBinder = R.layout.activity_reporting_accident;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy a = LazyKt.lazy(new Function0() { // from class: ProcessingCaptureSessionExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReportAccidentActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final Lazy onTransact = LazyKt.lazy(new Function0() { // from class: isTemplateTypeForStillCapture
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy notify = LazyKt.lazy(new Function0() { // from class: ProcessingCaptureSessionExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String cancelAll = "";
    private final ActivityResultLauncher<Intent> INotificationSideChannel = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: ProcessingCaptureSessionCaptureCallbackAdapter
        @Override // androidx.view.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            ReportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (ActivityResult) obj);
        }
    });

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final ActivityResultLauncher<Intent> INotificationSideChannelStub = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: onCaptureProcessProgressed
        @Override // androidx.view.result.ActivityResultCallback
        public final void onActivityResult(Object obj) throws IllegalAccessException {
            ReportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (ActivityResult) obj);
        }
    });

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws IllegalAccessException {
        int i7 = ~i2;
        int i8 = ~i6;
        int i9 = ~i3;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i3 | i6);
        int i12 = i10 | i11;
        int i13 = (~(i7 | i6)) | (~(i7 | i9)) | (~(i9 | i6));
        int i14 = i6 + i2 + i + (669352129 * i5) + (266941808 * i4);
        int i15 = i14 * i14;
        int i16 = (720661947 * i6) + 1572077568 + ((-1243901369) * i2) + (1165201990 * i12) + (i11 * (-1165201990)) + ((-1165201990) * i13) + (1885863936 * i) + ((-1100480512) * i5) + ((-1249902592) * i4) + ((-491520000) * i15);
        int i17 = (i6 * 1617402437) + 56426783 + (i2 * 1617401273) + (i12 * (-582)) + (i11 * 582) + (i13 * 582) + (1617401855 * i) + (i5 * 1244927807) + (i4 * (-404665712)) + (i15 * (-45350912));
        switch (i16 + (i17 * i17 * 1565261824)) {
            case 1:
                ReportAccidentActivity reportAccidentActivity = (ReportAccidentActivity) objArr[0];
                Bundle bundle = (Bundle) objArr[1];
                int i18 = 2 % 2;
                int i19 = INotificationSideChannelStub + 33;
                getInterfaceDescriptor = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
                    int i21 = (int) Runtime.getRuntime().totalMemory();
                    int i22 = ~i21;
                    if (i20 != (-1633526786) + (((~((-1464748867) | i22)) | 88342594) * (-108)) + (((~(i22 | 634761323)) | (~((-634761324) | i21)) | (-2011167596)) * 54) + ((i21 | (-2011167596)) * 54)) {
                        throw null;
                    }
                } else {
                    int i23 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
                    int iMyPid = Process.myPid();
                    int i24 = ~iMyPid;
                    int i25 = (~(1516389398 | i24)) | 545892649;
                    int i26 = ~(iMyPid | (-1375880193));
                    if (i23 != (((i25 | i26) * (-252)) - 703993468) + ((i26 | (~(i24 | 2062282047))) * 252)) {
                        throw null;
                    }
                }
                if (((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null) != (((~(i | 1965383369)) * TypedValues.CycleType.TYPE_EASING) - 1192157920) + (((~((~i) | 1965383369)) | 604063361) * TypedValues.CycleType.TYPE_EASING)) {
                    throw null;
                }
                super.onCreate(bundle);
                int i27 = getInterfaceDescriptor + 3;
                INotificationSideChannelStub = i27 % 128;
                int i28 = i27 % 2;
                return null;
            case 2:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 3:
                return b(objArr);
            case 4:
                return TuitionPaymentFragmentbindingInflater1(objArr);
            case 5:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 6:
                return d(objArr);
            default:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
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
    private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 197 - r6
            int r0 = 53 - r7
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r1 = com.bpjstku.presentation.report.ReportAccidentActivity.$$a
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.report.ReportAccidentActivity.c(short, short, short, java.lang.Object[]):void");
    }

    public ReportAccidentActivity() {
        final ReportAccidentActivity reportAccidentActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<containsZslUseCase>() { // from class: com.bpjstku.presentation.report.ReportAccidentActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, containsZslUseCase] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ containsZslUseCase invoke() {
                LifecycleOwner lifecycleOwner = reportAccidentActivity;
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
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.report.ReportAccidentActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = reportAccidentActivity;
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
        final ReportAccidentActivity reportAccidentActivity2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.report.ReportAccidentActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = reportAccidentActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    public static final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(ReportAccidentActivity reportAccidentActivity, File file) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 51;
        int i3 = i2 % 128;
        INotificationSideChannelStub = i3;
        int i4 = i2 % 2;
        reportAccidentActivity.asInterface = file;
        int i5 = i3 + 19;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ReportAccidentActivity reportAccidentActivity, File file) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 27;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ActivityReportingAccidentBinding activityReportingAccidentBindingINotificationSideChannelStub = reportAccidentActivity.INotificationSideChannelStub();
        activityReportingAccidentBindingINotificationSideChannelStub.btnTakeAccidentPhoto.setImageBitmap(BitmapFactory.decodeFile(file.getPath()));
        TextView textView = activityReportingAccidentBindingINotificationSideChannelStub.tvPhotoError;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        TextView textView2 = activityReportingAccidentBindingINotificationSideChannelStub.tvTakeAccidentPhotoLabel;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
        ImageView imageView = activityReportingAccidentBindingINotificationSideChannelStub.imgTakeAccidentPhoto;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
        int i4 = INotificationSideChannelStub + 25;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(RemoteActionCompatParcelizer ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $11 + 75;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(RemoteActionCompatParcelizer)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 64838);
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1356;
                    int iNormalizeMetaState = 38 - KeyEvent.normalizeMetaState(0);
                    byte b = (byte) ($$c[1] - 1);
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, iResolveSizeAndState, iNormalizeMetaState, 894276454, false, $$i(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 47773), 516 - AndroidCharacter.getMirror('0'), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12, 896083767, false, "n", new Class[]{Object.class, Object.class});
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
        int i6 = $11 + 101;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 4 / 0;
        }
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.report.ReportAccidentActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/report/ReportAccidentActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, ReportAccidentActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        ReportAccidentActivity reportAccidentActivity = (ReportAccidentActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 35;
        INotificationSideChannelStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = reportAccidentActivity.asBinder;
        if (i4 != 0) {
            throw null;
        }
        int i6 = i2 + 53;
        INotificationSideChannelStub = i6 % 128;
        int i7 = i6 % 2;
        return Integer.valueOf(i5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityReportingAccidentBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 25;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ReportAccidentActivity$bindingInflater$1 reportAccidentActivity$bindingInflater$1 = ReportAccidentActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = getInterfaceDescriptor + 103;
        INotificationSideChannelStub = i4 % 128;
        int i5 = i4 % 2;
        return reportAccidentActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 109;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ReportAccidentActivity reportAccidentActivity = this;
        Intrinsics.checkNotNullParameter(reportAccidentActivity, "");
        reportAccidentActivity.getWindow().addFlags(8192);
        String string = getString(R.string.title_work_accident_reporting);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentbindingInflater1((Toolbar) INotificationSideChannelStub().layoutToolbar.toolbar, true);
        INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText(string);
        int i4 = INotificationSideChannelStub + 21;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityReportingAccidentBinding activityReportingAccidentBindingINotificationSideChannelStub = INotificationSideChannelStub();
        ImageButton imageButton = activityReportingAccidentBindingINotificationSideChannelStub.btnTakeAccidentPhoto;
        Intrinsics.checkNotNullExpressionValue(imageButton, "");
        imageButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: ProcessingCaptureSessionSessionProcessorCaptureCallback
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
        EditText editText = activityReportingAccidentBindingINotificationSideChannelStub.tilChooseNearestPLKK.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: areStreamUseCasesAvailableForSurfaceConfigs
                public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -888081856;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ReportAccidentActivity.b(this.TuitionPaymentFragmentbindingInflater1, view);
                }
            });
            int i2 = INotificationSideChannelStub + 51;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
        }
        EditText editText2 = activityReportingAccidentBindingINotificationSideChannelStub.tilReporting.getEditText();
        if (editText2 != null) {
            editText2.setOnClickListener(new View.OnClickListener() { // from class: StreamUseCaseUtil
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ReportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, view);
                }
            });
            int i4 = getInterfaceDescriptor + 37;
            INotificationSideChannelStub = i4 % 128;
            int i5 = i4 % 2;
        }
        Button button = activityReportingAccidentBindingINotificationSideChannelStub.btnSendReport;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: lambdaopen1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReportAccidentActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, activityReportingAccidentBindingINotificationSideChannelStub, (View) obj);
            }
        }));
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ReportAccidentActivity reportAccidentActivity = this;
        ((containsZslUseCase) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(reportAccidentActivity, new Observer() { // from class: updateParameters
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                ReportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        ((containsZslUseCase) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(reportAccidentActivity, new Observer() { // from class: lambdaopen3androidxcameracamera2internalProcessingCaptureSession
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                ReportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = getInterfaceDescriptor + 49;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 40 / 0;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements getStringOrNull.b {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            ReportAccidentActivity.this.d_();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(this.b.new AnonymousClass4(new String[]{"android.permission.ACCESS_FINE_LOCATION"}));
        final Function1 function1 = new Function1() { // from class: ProcessingCaptureSessionProcessorState
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Boolean) obj);
            }
        };
        BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartCompose.subscribe(new logToString() { // from class: onCaptureProcessStarted
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                ReportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
        ((acquireBuffer) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
        int i2 = getInterfaceDescriptor + 45;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 11;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        Button button = INotificationSideChannelStub().btnSendReport;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(false);
        int i4 = INotificationSideChannelStub + 31;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        ReportAccidentActivity reportAccidentActivity = (ReportAccidentActivity) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 65;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ActivityReportingAccidentBinding activityReportingAccidentBindingINotificationSideChannelStub = reportAccidentActivity.INotificationSideChannelStub();
        if (i3 == 0) {
            Button button = activityReportingAccidentBindingINotificationSideChannelStub.btnSendReport;
            Intrinsics.checkNotNullExpressionValue(button, "");
            Button button2 = button;
            Intrinsics.checkNotNullParameter(button2, "");
            button2.setEnabled(false);
        } else {
            Button button3 = activityReportingAccidentBindingINotificationSideChannelStub.btnSendReport;
            Intrinsics.checkNotNullExpressionValue(button3, "");
            Button button4 = button3;
            Intrinsics.checkNotNullParameter(button4, "");
            button4.setEnabled(true);
        }
        int i4 = INotificationSideChannelStub + 99;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return null;
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int i = 2 % 2;
        ActivityReportingAccidentBinding activityReportingAccidentBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputLayout textInputLayout = activityReportingAccidentBindingINotificationSideChannelStub.tilIdNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.error_field_nik);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = getString(R.string.error_invalid_field);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string2, 16, 16), new accessconfigureInstanceInternal("^[0-9]{0,}$", string3)})));
        TextInputLayout textInputLayout2 = activityReportingAccidentBindingINotificationSideChannelStub.tilEmployeeName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string4 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string4))));
        TextInputLayout textInputLayout3 = activityReportingAccidentBindingINotificationSideChannelStub.tilChooseNearestPLKK;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string5 = getString(R.string.error_plkk_required);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string5))));
        TextInputLayout textInputLayout4 = activityReportingAccidentBindingINotificationSideChannelStub.tilReporting;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        String string6 = getString(R.string.error_reporting_required);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout4, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string6))));
        int i2 = INotificationSideChannelStub + 91;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 29;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                onBackPressed();
                int i4 = INotificationSideChannelStub + 59;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
            }
            return super.onOptionsItemSelected(p0);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int p0, int p1, Intent p2) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub;
        int i3 = i2 + 57;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        if (p1 == -1 && p0 == 553) {
            int i5 = i2 + 83;
            getInterfaceDescriptor = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (p2 != null) {
                String str = getCaptureNode.b(p2).TuitionPaymentFragmentbindingInflater1;
                Intrinsics.checkNotNullExpressionValue(str, "");
                b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ReportAccidentActivity$compressAndShowImage$1(this, str, null), 3, null);
            } else {
                int i6 = getInterfaceDescriptor + 65;
                INotificationSideChannelStub = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            int i8 = getInterfaceDescriptor + 65;
            INotificationSideChannelStub = i8 % 128;
            int i9 = i8 % 2;
        }
        super.onActivityResult(p0, p1, p2);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr2;
        ReportAccidentActivity reportAccidentActivity = (ReportAccidentActivity) objArr[0];
        int i = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 29945);
            int i2 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1755;
            int size = View.MeasureSpec.getSize(0) + 23;
            short s = (short) ($$b + 4);
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c(s, (byte) (bArr[27] - 1), bArr[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, i2, size, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cIndexOf = (char) (29944 - TextUtils.indexOf("", ""));
                int iResolveSize = View.resolveSize(0, 0) + 1755;
                int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                short s2 = (short) ($$b & 990);
                byte b = $$a[7];
                Object[] objArr4 = new Object[1];
                c(s2, b, b, objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iResolveSize, iIndexOf, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i3 = ((int[]) objArr5[0])[0];
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{i3}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int iNextInt = new Random().nextInt();
            int i4 = ~iNextInt;
            int i5 = (-180600055) + ((~(624349237 | i4)) * (-560)) + ((~(iNextInt | 1035915775)) * (-560)) + (((~((-411746812) | i4)) | 180273) * 560) + 907306855;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            e(new char[]{15855, 13496, 60583, 16252, 15749, 15721, 65457, 8717, 6913, 1188, 55014, 31938, 28680, 25510, 35860, 21909, 18908, 18748, 27490, 44609}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 109, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(new char[]{33174, 42003, 12745, 15475, 33279, 44487, 8908, 8461, 42786, 37898, 2973, 32730, 52318, 62274, 20826, 22155, 62869, 55692, 46605, 44358}, Color.rgb(0, 0, 0) + 16777216, objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, reportAccidentActivity)).intValue();
            try {
                Object[] objArr8 = {444311884};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 42049), TextUtils.indexOf("", "") + 1726, View.MeasureSpec.makeMeasureSpec(0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr8), 907306855, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29943);
                    int minimumFlingVelocity = 1755 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int i8 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22;
                    short s3 = (short) ($$b & 990);
                    byte b2 = $$a[7];
                    Object[] objArr9 = new Object[1];
                    c(s3, b2, b2, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, minimumFlingVelocity, i8, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr10 = new Object[1];
                    e(new char[]{18398, 28306, 35454, 19930, 18367, 26444, 39290, 20664, 24945, 24203, 45114, 3620, 2609, 14801, 60080, 10009, 13287, 4881, 3498, 56559, 56499, 51809, 9330, 62885, 34429, 42377}, KeyEvent.keyCodeFromString(""), objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(new char[]{2436, 58793, 21310, 54936, 2529, 60533, 16447, 52216, 12087, 54716, 27002, 38170, 17505, 45816, 13234, 48252, 32173, 38964, 54523}, TextUtils.indexOf((CharSequence) "", '0') + 1, objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
                        int maximumFlingVelocity = 1755 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int size2 = 23 - View.MeasureSpec.getSize(0);
                        byte b3 = $$a[7];
                        Object[] objArr12 = new Object[1];
                        c((short) 104, b3, b3, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(pressedStateDuration, maximumFlingVelocity, size2, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char offsetBefore = (char) (29944 - TextUtils.getOffsetBefore("", 0));
                        int capsMode = 1755 - TextUtils.getCapsMode("", 0, 0);
                        int i9 = 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        short s4 = (short) ($$b + 4);
                        byte[] bArr2 = $$a;
                        Object[] objArr13 = new Object[1];
                        c(s4, (byte) (bArr2[27] - 1), bArr2[7], objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetBefore, capsMode, i9, 986134021, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i10 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i11 == i10) {
            int i12 = getInterfaceDescriptor + 77;
            INotificationSideChannelStub = i12 % 128;
            int i13 = i12 % 2;
            int i14 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            int i15 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
            Object[] objArr14 = {new int[]{i15}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iNextInt2 = new Random().nextInt(1888478429);
            int i16 = i14 + 1320524901 + ((~((~iNextInt2) | (-68419657))) * (-116)) + ((1005146018 | iNextInt2) * 116) + (((~(iNextInt2 | 792543592)) | 281022082) * 116);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr14[3])[0] = i18 ^ (i18 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr != null) {
                int i19 = 0;
                while (i19 < strArr.length) {
                    arrayList.add(strArr[i19]);
                    i19++;
                    int i20 = getInterfaceDescriptor + 59;
                    INotificationSideChannelStub = i20 % 128;
                    int i21 = i20 % 2;
                }
            }
            int[] iArr = new int[i11];
            int i22 = i11 - 1;
            iArr[i22] = 1;
            Toast.makeText((Context) null, iArr[((i11 * i22) % 2) - 1], 1).show();
            int i23 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            int i24 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
            Object[] objArr15 = {new int[]{i24}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int i25 = ~((int) Process.getStartElapsedRealtime());
            int i26 = i23 + 1465814884 + (((~((-891851621) | i25)) | 679249194) * (-933)) + (((~(i25 | 679249194)) | (-1031575407)) * 933) + 1513273458;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr15[3])[0] = i28 ^ (i28 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c2 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15;
            short s5 = (short) ($$b & 118);
            byte b4 = $$a[7];
            Object[] objArr16 = new Object[1];
            c(s5, b4, b4, objArr16);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, doubleTapTimeout, keyRepeatDelay, 1357589585, false, (String) objArr16[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr17 = new Object[1];
        e(new char[]{18398, 28306, 35454, 19930, 18367, 26444, 39290, 20664, 24945, 24203, 45114, 3620, 2609, 14801, 60080, 10009, 13287, 4881, 3498, 56559, 56499, 51809, 9330, 62885, 34429, 42377}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_instruction_step3).substring(3, 4).length() - 1, objArr17);
        Class<?> cls3 = Class.forName((String) objArr17[0]);
        Object[] objArr18 = new Object[1];
        e(new char[]{2436, 58793, 21310, 54936, 2529, 60533, 16447, 52216, 12087, 54716, 27002, 38170, 17505, 45816, 13234, 48252, 32173, 38964, 54523}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr18);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c3 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
            int trimmedLength = TextUtils.getTrimmedLength("") + 1031;
            int i29 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15;
            short s6 = (short) ($$b & 990);
            byte b5 = $$a[7];
            Object[] objArr19 = new Object[1];
            c(s6, b5, b5, objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, trimmedLength, i29, 1344079056, false, (String) objArr19[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i30 = getInterfaceDescriptor + 17;
            INotificationSideChannelStub = i30 % 128;
            int i31 = i30 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c4 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1032;
                int windowTouchSlop = 15 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte[] bArr3 = $$a;
                short s7 = bArr3[7];
                Object[] objArr20 = new Object[1];
                c(s7, (byte) (s7 | 52), bArr3[28], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c4, iLastIndexOf, windowTouchSlop, 632103528, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i32 = ((int[]) objArr21[3])[0];
            int i33 = ((int[]) objArr21[1])[0];
            String[] strArr2 = (String[]) objArr21[0];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i34 = ~iElapsedRealtime;
            int i35 = (((-1476164479) + ((((~(i34 | 38241013)) | (-239594230)) | (~((-4685941) | iElapsedRealtime))) * 717)) + (((~(iElapsedRealtime | 38241013)) | ((~(i34 | (-4685941))) | (-239594230))) * 717)) - 298771350;
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr2[2])[0] = i37 ^ (i37 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(new char[]{15855, 13496, 60583, 16252, 15749, 15721, 65457, 8717, 6913, 1188, 55014, 31938, 28680, 25510, 35860, 21909, 18908, 18748, 27490, 44609}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notification_gojek_app).substring(4, 5).length() - 1, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(new char[]{33174, 42003, 12745, 15475, 33279, 44487, 8908, 8461, 42786, 37898, 2973, 32730, 52318, 62274, 20826, 22155, 62869, 55692, 46605, 44358}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, reportAccidentActivity)).intValue();
            Object[] objArr24 = {444311884};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 46038), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1134, (Process.myTid() >> 22) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr25 = {Integer.valueOf(iIntValue2), 0, -298771350, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr24), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char gidForName = (char) ((-1) - Process.getGidForName(""));
                int touchSlop = 1031 - (ViewConfiguration.getTouchSlop() >> 8);
                int tapTimeout = 15 - (ViewConfiguration.getTapTimeout() >> 16);
                short s8 = (short) ($$b & 118);
                byte b6 = $$a[7];
                Object[] objArr26 = new Object[1];
                c(s8, b6, b6, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(gidForName, touchSlop, tapTimeout, 1298546779, false, (String) objArr26[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getPressedStateDuration() >> 16) + 1117, 18 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Boolean.TYPE});
            }
            objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr25);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c5 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int iIndexOf2 = 1030 - TextUtils.indexOf((CharSequence) "", '0');
                int mirror = '?' - AndroidCharacter.getMirror('0');
                byte[] bArr4 = $$a;
                short s9 = bArr4[7];
                Object[] objArr27 = new Object[1];
                c(s9, (byte) (s9 | 52), bArr4[28], objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c5, iIndexOf2, mirror, 632103528, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr2);
            try {
                Object[] objArr28 = new Object[1];
                e(new char[]{18398, 28306, 35454, 19930, 18367, 26444, 39290, 20664, 24945, 24203, 45114, 3620, 2609, 14801, 60080, 10009, 13287, 4881, 3498, 56559, 56499, 51809, 9330, 62885, 34429, 42377}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 98, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(new char[]{2436, 58793, 21310, 54936, 2529, 60533, 16447, 52216, 12087, 54716, 27002, 38170, 17505, 45816, 13234, 48252, 32173, 38964, 54523}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                    int size3 = 1031 - View.MeasureSpec.getSize(0);
                    int iResolveSize2 = 15 - View.resolveSize(0, 0);
                    short s10 = (short) ($$b & 990);
                    byte b7 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    c(s10, b7, b7, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cRgb, size3, iResolveSize2, 1344079056, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c6 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int scrollDefaultDelay = 1031 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int absoluteGravity = 15 - Gravity.getAbsoluteGravity(0, 0);
                    short s11 = (short) ($$b & 118);
                    byte b8 = $$a[7];
                    Object[] objArr31 = new Object[1];
                    c(s11, b8, b8, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c6, scrollDefaultDelay, absoluteGravity, 1357589585, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i38 = getInterfaceDescriptor + 37;
                INotificationSideChannelStub = i38 % 128;
                int i39 = i38 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i40 = ((int[]) objArr2[1])[0];
        int i41 = ((int[]) objArr2[3])[0];
        if (i41 == i40) {
            Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i42 = ((int[]) objArr2[2])[0];
            int i43 = ((int[]) objArr2[3])[0];
            int i44 = ((int[]) objArr2[1])[0];
            String[] strArr3 = (String[]) objArr2[0];
            int iMyTid = Process.myTid();
            int i45 = ~iMyTid;
            int i46 = i42 + (-98567639) + ((208479232 | i45) * (-192)) + (((~(242072640 | i45)) | 277873578) * (-384)) + (((~(iMyTid | (-33593409))) | (~(i45 | 519946218)) | (~((-277873579) | iMyTid))) * DerHeader.TAG_CLASS_PRIVATE);
            int i47 = (i46 << 13) ^ i46;
            int i48 = i47 ^ (i47 >>> 17);
            ((int[]) objArr32[2])[0] = i48 ^ (i48 << 5);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr2[0];
        if (strArr4 != null) {
            int i49 = 0;
            while (i49 < strArr4.length) {
                int i50 = getInterfaceDescriptor + 41;
                INotificationSideChannelStub = i50 % 128;
                if (i50 % 2 != 0) {
                    arrayList2.add(strArr4[i49]);
                    i49 += 86;
                } else {
                    arrayList2.add(strArr4[i49]);
                    i49++;
                }
            }
        }
        int[] iArr2 = new int[i41];
        int i51 = i41 - 1;
        iArr2[i51] = 1;
        Toast.makeText((Context) null, iArr2[((i41 * i51) % 2) - 1], 1).show();
        Object[] objArr33 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i52 = ((int[]) objArr2[2])[0];
        int i53 = ((int[]) objArr2[3])[0];
        int i54 = ((int[]) objArr2[1])[0];
        String[] strArr5 = (String[]) objArr2[0];
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i55 = ~((-163649603) | iMaxMemory);
        int i56 = ~iMaxMemory;
        int i57 = i52 + (-2015923519) + ((i55 | (~(80630567 | i56))) * (-1808)) + (((~((-12587011) | iMaxMemory)) | (~(i56 | 231693159))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iMaxMemory | (-80630568))) | 151062592 | (~(163649602 | i56))) * TypedValues.Custom.TYPE_BOOLEAN);
        int i58 = (i57 << 13) ^ i57;
        int i59 = i58 ^ (i58 >>> 17);
        ((int[]) objArr33[2])[0] = i59 ^ (i59 << 5);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00e9, code lost:
    
        if (r1 != ((r6 + ((r3 | (~(r4 | 2104966874))) * androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_PIVOT_TARGET)) + (((~(r2 | 2104966874)) | (~((-1093734425) | r4))) * androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_PIVOT_TARGET))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00eb, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.report.ReportAccidentActivity.getInterfaceDescriptor + 49;
        com.bpjstku.presentation.report.ReportAccidentActivity.INotificationSideChannelStub = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00f7, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00fa, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00fd, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0105, code lost:
    
        throw new java.lang.RuntimeException("1317532466");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x010d, code lost:
    
        throw new java.lang.RuntimeException("-799997688");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0062, code lost:
    
        if (r1 == ((r7 + (((~(r2 | (-1359244946))) | (~((-529257403) | r3))) * (-672))) + (((~(1359244945 | r3)) | (-1603272636)) * 672))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00b1, code lost:
    
        if (r1 == ((r7 + (((~(r2 | (-230721))) | (~(75745248 | r6))) * 859)) + (((~(905732791 | r6)) | (-905963512)) * 859))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b3, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = android.os.Process.myTid();
        r6 = 1676756748 + (((~((-1011232451) | r2)) | (-1567823515)) * (-318));
        r3 = ~((-1567823515) | r2);
        r4 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.report.ReportAccidentActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        if (i2 != 738006416 + (((-71631361) | layoutDirection) * (-381)) + (((~((~layoutDirection) | (-1179491880))) | 1385733495) * 381) + 1521744384) {
            int i3 = getInterfaceDescriptor + 89;
            INotificationSideChannelStub = i3 % 128;
            int i4 = i3 % 2;
            int[] iArr = new int[2044741684];
            iArr[2044741683] = 1;
            int i5 = 494731868 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i6 = getInterfaceDescriptor + 63;
            INotificationSideChannelStub = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
        if (i8 != ((((~(i9 | 613926037)) | 1965129927) * 56) - 1184552836) + (((~((~i9) | 1965129927)) | 613926037) * 56)) {
            throw null;
        }
        super.onStart();
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 103;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = INotificationSideChannelStub + 49;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ hasPreviewSurface TuitionPaymentFragmentspecialinlinedviewModeldefault2(final ReportAccidentActivity reportAccidentActivity) {
        int i = 2 % 2;
        hasPreviewSurface.Companion companion = hasPreviewSurface.INSTANCE;
        hasPreviewSurface haspreviewsurfaceTuitionPaymentFragmentspecialinlinedviewModeldefault3 = hasPreviewSurface.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: ProcessingCaptureSessionExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReportAccidentActivity.b(this.TuitionPaymentFragmentbindingInflater1, (ReportStatus) obj);
            }
        });
        int i2 = INotificationSideChannelStub + 39;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 84 / 0;
        }
        return haspreviewsurfaceTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ReportAccidentActivity reportAccidentActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT >= 33) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.resolveActivity(reportAccidentActivity.getPackageManager());
            Application application = reportAccidentActivity.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "");
            File fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(application);
            Uri uriForFile = FileProvider.getUriForFile(reportAccidentActivity, "com.bpjstku.provider", fileTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            Intrinsics.checkNotNullExpressionValue(uriForFile, "");
            reportAccidentActivity.cancelAll = fileTuitionPaymentFragmentspecialinlinedviewModeldefault1.getAbsolutePath();
            intent.putExtra("output", uriForFile);
            reportAccidentActivity.INotificationSideChannelStub.launch(intent);
            int i4 = getInterfaceDescriptor + 113;
            INotificationSideChannelStub = i4 % 128;
            int i5 = i4 % 2;
        } else {
            updateFileExif updatefileexif = new updateFileExif();
            ReportAccidentActivity reportAccidentActivity2 = reportAccidentActivity;
            Intent intent2 = new Intent(reportAccidentActivity2, (Class<?>) ImagePickerActivity.class);
            intent2.putExtra("CameraOnlyConfig", updatefileexif.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            reportAccidentActivity2.startActivityForResult(intent2, 553);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault1(ReportAccidentActivity reportAccidentActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 35;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) reportAccidentActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i4 = getInterfaceDescriptor + 117;
        INotificationSideChannelStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return userAsBinder;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(final ReportAccidentActivity reportAccidentActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        outputFormatToAudioProfile outputformattoaudioprofile = reportAccidentActivity.b;
        String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(outputformattoaudioprofile.new AnonymousClass4((String[]) Arrays.copyOf(strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length)));
        final Function1 function1 = new Function1() { // from class: ProcessingCaptureSessionExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (Boolean) obj);
            }
        };
        BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartCompose.subscribe(new logToString() { // from class: ProcessingCaptureSession1
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                ReportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
        ((acquireBuffer) reportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
        Unit unit = Unit.INSTANCE;
        int i2 = INotificationSideChannelStub + 73;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ReportAccidentActivity reportAccidentActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_choose_reason_reporting", "choose_reason_reporting"));
            Intrinsics.checkNotNullParameter(reportAccidentActivity, "");
            Intrinsics.checkNotNullParameter("choose_reason_reporting", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("choose_reason_reporting", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("choose_reason_reporting", mapMutableMapOf);
            hasPreviewSurface haspreviewsurface = (hasPreviewSurface) reportAccidentActivity.notify.getValue();
            FragmentManager supportFragmentManager = reportAccidentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(haspreviewsurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                haspreviewsurface.show(supportFragmentManager, haspreviewsurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i2 = INotificationSideChannelStub + 5;
                getInterfaceDescriptor = i2 % 128;
                int i3 = i2 % 2;
            }
            ViewPortBuilder.b();
            int i4 = INotificationSideChannelStub + 65;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 33;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke(obj);
            return;
        }
        function1.invoke(obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(final ReportAccidentActivity reportAccidentActivity, Boolean bool) {
        int i = 2 % 2;
        if (bool.booleanValue()) {
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_take_accident_photo", "take_accident_photo"));
            Intrinsics.checkNotNullParameter(reportAccidentActivity, "");
            Intrinsics.checkNotNullParameter("take_accident_photo", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("take_accident_photo", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("take_accident_photo", mapMutableMapOf);
            AnyRes.Companion companion = AnyRes.INSTANCE;
            AnyRes anyResTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AnyRes.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function0() { // from class: lambdaopen2androidxcameracamera2internalProcessingCaptureSession
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ReportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1);
                }
            }, new Function0() { // from class: lambdaopen0androidxcameracamera2internalProcessingCaptureSession
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ReportAccidentActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            });
            FragmentManager supportFragmentManager = reportAccidentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(anyResTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i2 = getInterfaceDescriptor + 91;
                INotificationSideChannelStub = i2 % 128;
                if (i2 % 2 != 0) {
                    anyResTuitionPaymentFragmentspecialinlinedviewModeldefault3.show(supportFragmentManager, anyResTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                anyResTuitionPaymentFragmentspecialinlinedviewModeldefault3.show(supportFragmentManager, anyResTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            int i3 = INotificationSideChannelStub + 63;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
        } else {
            ReportAccidentActivity reportAccidentActivity2 = reportAccidentActivity;
            String string = reportAccidentActivity.getString(R.string.message_camera_storage_permission_required);
            Intrinsics.checkNotNullExpressionValue(string, "");
            AutoValue_LifecycleCameraRepository_Key.b(reportAccidentActivity2, string);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[LOOP:0: B:12:0x0053->B:14:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:16:0x006f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    /* JADX WARN: Code duplicated, block: B:19:0x0079  */
    /* JADX WARN: Code duplicated, block: B:20:0x007b  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ReportAccidentActivity reportAccidentActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        ArrayList arrayList;
        Iterator it;
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 41;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 24 / 0;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                reportAccidentActivity.MediaBrowserCompat();
                str = "loading_get_nearest_health_care";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                reportAccidentActivity.IconCompatParcelizer();
                isImageAnalysis isimageanalysis = (isImageAnalysis) reportAccidentActivity.a.getValue();
                List list = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Intrinsics.checkNotNullParameter(list, "");
                List list2 = list;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                it = list2.iterator();
                int i4 = INotificationSideChannelStub + 21;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                while (it.hasNext()) {
                    arrayList.add(new lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy((Healthcare) it.next()));
                }
                isimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = arrayList;
                str = "success_get_nearest_health_care";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                reportAccidentActivity.IconCompatParcelizer();
                str = "failure_get_nearest_health_care";
            } else {
                str = "";
            }
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            reportAccidentActivity.MediaBrowserCompat();
            str = "loading_get_nearest_health_care";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            reportAccidentActivity.IconCompatParcelizer();
            isImageAnalysis isimageanalysis2 = (isImageAnalysis) reportAccidentActivity.a.getValue();
            List list3 = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Intrinsics.checkNotNullParameter(list3, "");
            List list4 = list3;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            it = list4.iterator();
            int i6 = INotificationSideChannelStub + 21;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            while (it.hasNext()) {
                arrayList.add(new lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy((Healthcare) it.next()));
            }
            isimageanalysis2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = arrayList;
            str = "success_get_nearest_health_care";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            reportAccidentActivity.IconCompatParcelizer();
            str = "failure_get_nearest_health_care";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_get_nearest_health_care", str));
        Intrinsics.checkNotNullParameter(reportAccidentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        int i8 = INotificationSideChannelStub + 43;
        getInterfaceDescriptor = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    private static /* synthetic */ Object d(Object[] objArr) {
        ReportAccidentActivity reportAccidentActivity = (ReportAccidentActivity) objArr[0];
        ActivityResult activityResult = (ActivityResult) objArr[1];
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 61;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (i3 == 0) {
            int i4 = 52 / 0;
            if (activityResult.getResultCode() == -1) {
                b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(reportAccidentActivity), null, null, new ReportAccidentActivity$compressAndShowImage$1(reportAccidentActivity, reportAccidentActivity.cancelAll, null), 3, null);
                int i5 = INotificationSideChannelStub + 69;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
            }
        } else if (activityResult.getResultCode() == -1) {
            b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(reportAccidentActivity), null, null, new ReportAccidentActivity$compressAndShowImage$1(reportAccidentActivity, reportAccidentActivity.cancelAll, null), 3, null);
            int i7 = INotificationSideChannelStub + 69;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
        }
        return null;
    }

    public static /* synthetic */ void b(ReportAccidentActivity reportAccidentActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_get_nearest_health_care", "get_nearest_health_care"));
            Intrinsics.checkNotNullParameter(reportAccidentActivity, "");
            Intrinsics.checkNotNullParameter("get_nearest_health_care", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("get_nearest_health_care", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("get_nearest_health_care", mapMutableMapOf);
            isImageAnalysis isimageanalysis = (isImageAnalysis) reportAccidentActivity.a.getValue();
            FragmentManager supportFragmentManager = reportAccidentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(isimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i2 = getInterfaceDescriptor + 7;
                INotificationSideChannelStub = i2 % 128;
                if (i2 % 2 != 0) {
                    isimageanalysis.show(supportFragmentManager, isimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    int i3 = 86 / 0;
                } else {
                    isimageanalysis.show(supportFragmentManager, isimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
            ViewPortBuilder.b();
            int i4 = INotificationSideChannelStub + 27;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ReportAccidentActivity reportAccidentActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = getInterfaceDescriptor + 67;
            INotificationSideChannelStub = i2 % 128;
            int i3 = i2 % 2;
            reportAccidentActivity.MediaBrowserCompat();
            str = "loading_submit_work_accident_reporting";
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
            reportAccidentActivity.IconCompatParcelizer();
            getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
            String string = reportAccidentActivity.getString(R.string.label_success);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = reportAccidentActivity.getString(R.string.label_complaint_sent);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String string3 = reportAccidentActivity.getString(R.string.action_ok_thanks);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_success, string, string2, string3, null, 112);
            reportAccidentActivity.cancel = getstringornullB;
            if (getstringornullB != null) {
                FragmentManager supportFragmentManager = reportAccidentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    int i4 = getInterfaceDescriptor + 77;
                    INotificationSideChannelStub = i4 % 128;
                    int i5 = i4 % 2;
                    getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    int i6 = INotificationSideChannelStub + 57;
                    getInterfaceDescriptor = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            getStringOrNull getstringornull = reportAccidentActivity.cancel;
            if (getstringornull != null) {
                getstringornull.INotificationSideChannel = reportAccidentActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
            str = "success_submit_work_accident_reporting";
        } else if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            str = "";
        } else {
            reportAccidentActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(reportAccidentActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            int i8 = INotificationSideChannelStub + 19;
            getInterfaceDescriptor = i8 % 128;
            int i9 = i8 % 2;
            str = "failure_submit_work_accident_reporting";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_submit_work_accident_reporting_result", str));
        Intrinsics.checkNotNullParameter(reportAccidentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        ReportAccidentActivity reportAccidentActivity = (ReportAccidentActivity) objArr[0];
        ReportStatus reportStatus = (ReportStatus) objArr[1];
        int i = 2 % 2;
        String str = reportStatus != null ? reportStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null;
        Intrinsics.checkNotNull(str);
        EditText editText = reportAccidentActivity.INotificationSideChannelStub().tilReporting.getEditText();
        if (editText != null) {
            int i2 = INotificationSideChannelStub + 17;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            editText.setText(str);
            int i4 = getInterfaceDescriptor + 81;
            INotificationSideChannelStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 2;
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        ReportAccidentActivity reportAccidentActivity = (ReportAccidentActivity) objArr[0];
        Healthcare healthcare = (Healthcare) objArr[1];
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 47;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(healthcare, "");
        reportAccidentActivity.d = healthcare;
        TextInputLayout textInputLayout = reportAccidentActivity.INotificationSideChannelStub().tilChooseNearestPLKK;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        retrieveConcurrentCameraIds.b(textInputLayout, healthcare.b);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 27;
        INotificationSideChannelStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ReportAccidentActivity reportAccidentActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activityResult, "");
        Intent data = activityResult.getData();
        Object obj = null;
        if (data != null) {
            int i2 = getInterfaceDescriptor + 3;
            INotificationSideChannelStub = i2 % 128;
            if (i2 % 2 != 0) {
                data.getData();
                obj.hashCode();
                throw null;
            }
            Uri data2 = data.getData();
            if (data2 != null) {
                b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(reportAccidentActivity), null, null, new ReportAccidentActivity$compressAndShowImage$1(reportAccidentActivity, String.valueOf(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(reportAccidentActivity, data2)), null), 3, null);
            }
        }
        int i3 = getInterfaceDescriptor + 83;
        INotificationSideChannelStub = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ isImageAnalysis b(final ReportAccidentActivity reportAccidentActivity) {
        int i = 2 % 2;
        isImageAnalysis.Companion companion = isImageAnalysis.INSTANCE;
        isImageAnalysis isimageanalysisTuitionPaymentFragmentspecialinlinedviewModeldefault2 = isImageAnalysis.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: ProcessingCaptureSessionExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReportAccidentActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Healthcare) obj);
            }
        });
        int i2 = INotificationSideChannelStub + 77;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return isimageanalysisTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ReportAccidentActivity reportAccidentActivity, ActivityReportingAccidentBinding activityReportingAccidentBinding, View view) {
        Editable text;
        String str;
        File file;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (reportAccidentActivity.asInterface == null) {
            int i2 = getInterfaceDescriptor + 81;
            INotificationSideChannelStub = i2 % 128;
            int i3 = i2 % 2;
            TextView textView = activityReportingAccidentBinding.tvPhotoError;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
        } else {
            TextView textView2 = activityReportingAccidentBinding.tvPhotoError;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
            ActivityReportingAccidentBinding activityReportingAccidentBindingINotificationSideChannelStub = reportAccidentActivity.INotificationSideChannelStub();
            if (reportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                TextInputLayout textInputLayout = activityReportingAccidentBindingINotificationSideChannelStub.tilIdNumber;
                Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputLayout);
                TextInputLayout textInputLayout2 = activityReportingAccidentBindingINotificationSideChannelStub.tilEmployeeName;
                Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputLayout2);
                UserLocation userLocation = reportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (userLocation == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    userLocation = null;
                }
                double d = userLocation.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                UserLocation userLocation2 = reportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (userLocation2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    userLocation2 = null;
                }
                double d2 = userLocation2.b;
                Healthcare healthcare = reportAccidentActivity.d;
                String str2 = healthcare != null ? healthcare.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
                String str3 = str2 == null ? "" : str2;
                EditText editText = activityReportingAccidentBindingINotificationSideChannelStub.tilReporting.getEditText();
                if (editText != null) {
                    text = editText.getText();
                } else {
                    int i4 = getInterfaceDescriptor + 109;
                    INotificationSideChannelStub = i4 % 128;
                    int i5 = i4 % 2;
                    text = null;
                }
                String str4 = Intrinsics.areEqual(StringsKt.trim((CharSequence) String.valueOf(text)).toString(), "Kecelakaan Kerja") ? "JKK" : "JKM";
                User user = (User) reportAccidentActivity.onTransact.getValue();
                if (user != null) {
                    int i6 = getInterfaceDescriptor + 115;
                    INotificationSideChannelStub = i6 % 128;
                    int i7 = i6 % 2;
                    str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                } else {
                    str = null;
                }
                String str5 = str == null ? "" : str;
                File file2 = reportAccidentActivity.asInterface;
                if (file2 == null) {
                    int i8 = getInterfaceDescriptor + 53;
                    INotificationSideChannelStub = i8 % 128;
                    int i9 = i8 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    file = null;
                } else {
                    file = file2;
                }
                ReportWorkAccidentRequest reportWorkAccidentRequest = new ReportWorkAccidentRequest(strTuitionPaymentFragmentspecialinlinedviewModeldefault2, strTuitionPaymentFragmentspecialinlinedviewModeldefault3, String.valueOf(d), String.valueOf(d2), setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), str3, str4, str5, file);
                final containsZslUseCase containszslusecase = (containsZslUseCase) reportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                Intrinsics.checkNotNullParameter(reportWorkAccidentRequest, "");
                MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = containszslusecase.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(containszslusecase.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(reportWorkAccidentRequest)));
                final Function1 function1 = new Function1() { // from class: generate10BitSupportedCombinationList
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return containsZslUseCase.TuitionPaymentFragmentbindingInflater1(containszslusecase, (BaseModel) obj);
                    }
                };
                logToString logtostring = new logToString() { // from class: filterSupportedSizes
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function1.invoke(obj);
                    }
                };
                final Function1 function2 = new Function1() { // from class: generatePreviewStabilizationSupportedCombinationList
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return containsZslUseCase.TuitionPaymentFragmentspecialinlinedviewModeldefault3(containszslusecase, (Throwable) obj);
                    }
                };
                BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getUpdatedImplementationOptionsWithUseCaseStreamSpecOption
                    private static final byte[] $$c = {43, 23, 22, -14};
                    private static final int $$f = 5;
                    private static int $10 = 0;
                    private static int $11 = 1;
                    private static final byte[] $$d = {27, 65, -33, 120, -12, -13, 0, -5, -13, 56, -61, -20, -5, -8, -1, -6, -25, 3, -14, -7, -13, Base64.padSymbol, -60, -27, 4, -11, 0, -9, -21, -9, Base64.padSymbol, -39, -28, -23, 38, -59, 4, -11, 0, -9, -21, 37, -49, -14, -6, 1, -4, -22, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 58};
                    private static final int $$e = 224;
                    private static final byte[] $$a = {42, -104, -68, 105, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
                    private static final int $$b = 39;
                    private static int TuitionPaymentFragmentbindingInflater1 = 0;
                    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -83722404;

                    private static void a(int i10, byte b, short s, Object[] objArr) {
                        int i11 = 103 - i10;
                        byte[] bArr = $$a;
                        int i12 = s * 52;
                        int i13 = 56 - (b * 52);
                        byte[] bArr2 = new byte[53 - i12];
                        int i14 = 52 - i12;
                        int i15 = -1;
                        if (bArr == null) {
                            i13++;
                            i11 = (i13 + (-i11)) - 11;
                            i15 = -1;
                        }
                        while (true) {
                            int i16 = i15 + 1;
                            bArr2[i16] = (byte) i11;
                            if (i16 == i14) {
                                objArr[0] = new String(bArr2, 0);
                                return;
                            }
                            byte b2 = bArr[i13];
                            i13++;
                            i11 = (i11 + (-b2)) - 11;
                            i15 = i16;
                        }
                    }

                    private static void d(int i10, int i11, short s, Object[] objArr) {
                        byte[] bArr = $$d;
                        int i12 = i11 * 8;
                        int i13 = 107 - (s * 23);
                        int i14 = 47 - (i10 * 44);
                        byte[] bArr2 = new byte[i12 + 45];
                        int i15 = i12 + 44;
                        int i16 = -1;
                        if (bArr == null) {
                            i16 = -1;
                            i13 = (i13 + (-i14)) - 8;
                            i14 = i14;
                        }
                        while (true) {
                            int i17 = i16 + 1;
                            int i18 = i14 + 1;
                            bArr2[i17] = (byte) i13;
                            if (i17 == i15) {
                                objArr[0] = new String(bArr2, 0);
                                return;
                            }
                            i16 = i17;
                            i13 = (i13 + (-bArr[i18])) - 8;
                            i14 = i18;
                        }
                    }

                    private static void c(boolean z, int i10, int i11, int i12, char[] cArr, Object[] objArr) throws Throwable {
                        int i13 = 2 % 2;
                        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                        char[] cArr2 = new char[i11];
                        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                        int i14 = $10 + 5;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i11) {
                            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i10 + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            int i16 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr2[i16]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                                    int i17 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3290;
                                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 31;
                                    byte b = (byte) ($$f - 5);
                                    byte b2 = b;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, i17, capsMode, 1199271174, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr2[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 651;
                                    int offsetAfter = 44 - TextUtils.getOffsetAfter("", 0);
                                    byte b3 = (byte) ($$f - 5);
                                    byte b4 = (byte) (b3 + 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, absoluteGravity, offsetAfter, -450685997, false, $$g(b3, b4, (byte) (-b4)), new Class[]{Object.class, Object.class});
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
                        if (i12 > 0) {
                            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i12;
                            char[] cArr3 = new char[i11];
                            System.arraycopy(cArr2, 0, cArr3, 0, i11);
                            System.arraycopy(cArr3, 0, cArr2, i11 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i11 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                        }
                        if (!(!z)) {
                            int i18 = $10 + 99;
                            $11 = i18 % 128;
                            int i19 = i18 % 2;
                            char[] cArr4 = new char[i11];
                            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i11) {
                                int i20 = $10 + 107;
                                $11 = i20 % 128;
                                int i21 = i20 % 2;
                                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i11 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char cGreen = (char) Color.green(0);
                                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 651;
                                    int size = 44 - View.MeasureSpec.getSize(0);
                                    byte b5 = (byte) ($$f - 5);
                                    byte b6 = (byte) (b5 + 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cGreen, iResolveOpacity, size, -450685997, false, $$g(b5, b6, (byte) (-b6)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            }
                            cArr2 = cArr4;
                        }
                        objArr[0] = new String(cArr2);
                    }

                    @Override // defpackage.logToString
                    public final void accept(Object obj) throws Throwable {
                        Object[] objArr;
                        int i10 = 2 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                            int keyRepeatDelay = 876 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int mirror = ':' - AndroidCharacter.getMirror('0');
                            byte b = (byte) ($$b & 29);
                            byte b2 = $$a[5];
                            Object[] objArr2 = new Object[1];
                            a(b, b2, b2, objArr2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, keyRepeatDelay, mirror, 252381699, false, (String) objArr2[0], null);
                        }
                        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                        Object[] objArr3 = new Object[1];
                        c(false, View.getDefaultSize(0, 0) + 161, 22 - KeyEvent.normalizeMetaState(0), View.MeasureSpec.getMode(0) + 10, new char[]{22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520}, objArr3);
                        Class<?> cls = Class.forName((String) objArr3[0]);
                        Object[] objArr4 = new Object[1];
                        c(false, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 165, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15, 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534}, objArr4);
                        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cArgb = (char) Color.argb(0, 0, 0, 0);
                            int iCombineMeasuredStates = 876 - View.combineMeasuredStates(0, 0);
                            int deadChar = 10 - KeyEvent.getDeadChar(0, 0);
                            byte[] bArr = $$a;
                            Object[] objArr5 = new Object[1];
                            a(bArr[10], bArr[5], bArr[7], objArr5);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cArgb, iCombineMeasuredStates, deadChar, 2009631821, false, (String) objArr5[0], null);
                        }
                        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                int bitsPerPixel = 875 - ImageFormat.getBitsPerPixel(0);
                                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10;
                                byte[] bArr2 = $$a;
                                byte b3 = bArr2[7];
                                Object[] objArr6 = new Object[1];
                                a(b3, b3, bArr2[5], objArr6);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, bitsPerPixel, scrollDefaultDelay, 256017550, false, (String) objArr6[0], null);
                            }
                            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                            int i11 = ~((-50331675) | iElapsedRealtime);
                            int i12 = ~iElapsedRealtime;
                            int i13 = (((1609606132 + ((i11 | (~(200867807 | i12))) * 920)) + (((~((-190846363) | i12)) | 50331674) * 920)) + (((~(iElapsedRealtime | 200867807)) | ((~((-50331675) | i12)) | (~((-140514689) | iElapsedRealtime)))) * 920)) - 1921680213;
                            int i14 = (i13 << 13) ^ i13;
                            int i15 = i14 ^ (i14 >>> 17);
                            ((int[]) objArr[1])[0] = i15 ^ (i15 << 5);
                        } else {
                            Object[] objArr8 = new Object[1];
                            c(true, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 160, TextUtils.getCapsMode("", 0, 0) + 26, (ViewConfiguration.getPressedStateDuration() >> 16) + 3, new char[]{1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, '\r', '\r', 65534, 65483, 1, 6, '\f', 15}, objArr8);
                            Class<?> cls2 = Class.forName((String) objArr8[0]);
                            Object[] objArr9 = new Object[1];
                            c(true, 168 - View.resolveSizeAndState(0, 0, 0), 19 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 10, new char[]{6, 65495, '\n', 4, 65531, '\b', '\b', 11, 65529, 4, 5, 65535, '\n', 65527, 65529, 65535, 2, 6}, objArr9);
                            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                            if (applicationContext != null) {
                                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                            }
                            Object[] objArr10 = new Object[1];
                            c(true, 159 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 16, Process.getGidForName("") + 11, new char[]{65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521}, objArr10);
                            Class<?> cls3 = Class.forName((String) objArr10[0]);
                            Object[] objArr11 = new Object[1];
                            c(true, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 164, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 16, (ViewConfiguration.getWindowTouchSlop() >> 8) + 16, new char[]{65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3}, objArr11);
                            try {
                                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), -1921680213};
                                byte[] bArr3 = $$d;
                                byte b4 = bArr3[45];
                                byte b5 = bArr3[6];
                                Object[] objArr13 = new Object[1];
                                d(b4, b5, b5, objArr13);
                                Class<?> cls4 = Class.forName((String) objArr13[0]);
                                byte b6 = bArr3[6];
                                byte b7 = bArr3[45];
                                Object[] objArr14 = new Object[1];
                                d(b6, b7, b7, objArr14);
                                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                                if (applicationContext != null) {
                                    int i16 = TuitionPaymentFragmentbindingInflater1 + 49;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 % 128;
                                    int i17 = i16 % 2;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 876;
                                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 10;
                                        byte[] bArr4 = $$a;
                                        byte b8 = bArr4[7];
                                        Object[] objArr16 = new Object[1];
                                        a(b8, b8, bArr4[5], objArr16);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, packedPositionGroup, touchSlop, 256017550, false, (String) objArr16[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                                    try {
                                        Object[] objArr17 = new Object[1];
                                        c(false, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 161, 21 - ImageFormat.getBitsPerPixel(0), TextUtils.getCapsMode("", 0, 0) + 10, new char[]{22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520}, objArr17);
                                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                                        Object[] objArr18 = new Object[1];
                                        c(false, 165 - (ViewConfiguration.getJumpTapTimeout() >> 16), View.resolveSize(0, 0) + 15, 15 - (ViewConfiguration.getTapTimeout() >> 16), new char[]{65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534}, objArr18);
                                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                        Long lValueOf = Long.valueOf(jLongValue2);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                            char c = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                            int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 876;
                                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 11;
                                            byte[] bArr5 = $$a;
                                            Object[] objArr19 = new Object[1];
                                            a(bArr5[10], bArr5[5], bArr5[7], objArr19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, touchSlop2, iLastIndexOf, 2009631821, false, (String) objArr19[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                            char cRed = (char) Color.red(0);
                                            int size = 876 - View.MeasureSpec.getSize(0);
                                            int iArgb = 10 - Color.argb(0, 0, 0, 0);
                                            byte b9 = (byte) ($$b & 29);
                                            byte b10 = $$a[5];
                                            Object[] objArr20 = new Object[1];
                                            a(b9, b10, b10, objArr20);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed, size, iArgb, 252381699, false, (String) objArr20[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                        int i18 = TuitionPaymentFragmentbindingInflater1 + 25;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                                        int i19 = i18 % 2;
                                    } catch (Exception unused) {
                                        throw new RuntimeException();
                                    }
                                }
                                objArr = objArr15;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        int i20 = ((int[]) objArr[2])[0];
                        int i21 = ((int[]) objArr[0])[0];
                        if (i21 == i20) {
                            int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
                            TuitionPaymentFragmentbindingInflater1 = i22 % 128;
                            int i23 = i22 % 2;
                            int i24 = ((int[]) objArr[1])[0];
                            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                            int i25 = i24 + ((((~((-833238685) | iFreeMemory)) | 553787524) * (-566)) - 48563796) + ((~(iFreeMemory | (-279451161))) * 566);
                            int i26 = (i25 << 13) ^ i25;
                            int i27 = i26 ^ (i26 >>> 17);
                            ((int[]) objArr21[1])[0] = i27 ^ (i27 << 5);
                        } else {
                            int[] iArr = new int[i21];
                            int i28 = i21 - 1;
                            iArr[i28] = 1;
                            Toast.makeText((Context) null, iArr[((i21 * i28) % 2) - 1], 1).show();
                            int i29 = ((int[]) objArr[1])[0];
                            Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                            int i30 = ~(System.identityHashCode(this) | 442670802);
                            int i31 = i29 + (((-228136496) | i30) * (-658)) + 1135262836 + ((i30 | (-536583936)) * 658);
                            int i32 = (i31 << 13) ^ i31;
                            int i33 = i32 ^ (i32 >>> 17);
                            ((int[]) objArr22[1])[0] = i33 ^ (i33 << 5);
                        }
                        function2.invoke(obj);
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
                    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static java.lang.String $$g(short r5, short r6, short r7) {
                        /*
                            int r7 = r7 + 4
                            int r6 = 120 - r6
                            byte[] r0 = defpackage.getUpdatedImplementationOptionsWithUseCaseStreamSpecOption.$$c
                            int r5 = r5 * 4
                            int r1 = 1 - r5
                            byte[] r1 = new byte[r1]
                            r2 = 0
                            int r5 = 0 - r5
                            if (r0 != 0) goto L15
                            r4 = r6
                            r3 = r2
                            r6 = r5
                            goto L27
                        L15:
                            r3 = r2
                        L16:
                            int r7 = r7 + 1
                            byte r4 = (byte) r6
                            r1[r3] = r4
                            if (r3 != r5) goto L23
                            java.lang.String r5 = new java.lang.String
                            r5.<init>(r1, r2)
                            return r5
                        L23:
                            int r3 = r3 + 1
                            r4 = r0[r7]
                        L27:
                            int r6 = r6 + r4
                            goto L16
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.getUpdatedImplementationOptionsWithUseCaseStreamSpecOption.$$g(short, short, short):java.lang.String");
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                containszslusecase.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i10 = getInterfaceDescriptor + 39;
                INotificationSideChannelStub = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 3 % 5;
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ReportAccidentActivity reportAccidentActivity, UserLocation userLocation) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 51;
        int i3 = i2 % 128;
        INotificationSideChannelStub = i3;
        int i4 = i2 % 2;
        if (userLocation != null) {
            int i5 = i3 + 3;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            reportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = userLocation;
        } else {
            reportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new UserLocation(0.0d, 0.0d);
        }
        final containsZslUseCase containszslusecase = (containsZslUseCase) reportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        UserLocation userLocation2 = reportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (userLocation2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            userLocation2 = null;
        }
        double d = userLocation2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        UserLocation userLocation3 = reportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (userLocation3 == null) {
            int i7 = INotificationSideChannelStub + 73;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            userLocation3 = null;
        }
        double d2 = userLocation3.b;
        MutableLiveData<VirtualCameraAdapter1<List<Healthcare>>> mutableLiveData = containszslusecase.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(containszslusecase.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new NearestHealthcareRequest(String.valueOf(d), String.valueOf(d2)))));
        final Function1 function1 = new Function1() { // from class: compareIntersectingRanges
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return containsZslUseCase.TuitionPaymentFragmentspecialinlinedviewModeldefault1(containszslusecase, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: SupportedSurfaceCombination
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: checkCustomization
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return containsZslUseCase.TuitionPaymentFragmentspecialinlinedviewModeldefault2(containszslusecase, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: createFeatureSettings
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        containszslusecase.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Unit unit = Unit.INSTANCE;
        int i9 = INotificationSideChannelStub + 5;
        getInterfaceDescriptor = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 23 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(final ReportAccidentActivity reportAccidentActivity, Boolean bool) throws IOException {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 47;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        if (bool.booleanValue()) {
            ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
            ReportAccidentActivity reportAccidentActivity2 = reportAccidentActivity;
            Function1 function1 = new Function1() { // from class: lambdarelease4androidxcameracamera2internalProcessingCaptureSession
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ReportAccidentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (UserLocation) obj);
                }
            };
            Intrinsics.checkNotNullParameter(reportAccidentActivity2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            ExperimentalCamera2Interop.b(reportAccidentActivity2, new onOptionMatched(function1));
            int i4 = INotificationSideChannelStub + 45;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        } else {
            ReportAccidentActivity reportAccidentActivity3 = reportAccidentActivity;
            String string = reportAccidentActivity.getString(R.string.message_location_permission_required);
            Intrinsics.checkNotNullExpressionValue(string, "");
            AutoValue_LifecycleCameraRepository_Key.b(reportAccidentActivity3, string);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ReportAccidentActivity reportAccidentActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 == 0 ? Build.VERSION.SDK_INT < 33 : Build.VERSION.SDK_INT < 97) {
            getCaptureNode.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new getCaptureNode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(reportAccidentActivity);
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancelAll = ReturnMode.GALLERY_ONLY;
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b = true;
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "Pilih Foto";
            String str = Environment.DIRECTORY_PICTURES;
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStub = new ImagePickerSavePath(str, false);
            String path = Environment.getExternalStorageDirectory().getPath();
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStub = new ImagePickerSavePath(path, true);
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel = 1;
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel = false;
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
        } else {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType("image/*");
            reportAccidentActivity.INotificationSideChannel.launch(intent);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = INotificationSideChannelStub + 41;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ReportAccidentActivity reportAccidentActivity, ActivityResult activityResult) throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 1978311849, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1978311843, new Object[]{reportAccidentActivity, activityResult});
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ReportAccidentActivity reportAccidentActivity, Healthcare healthcare) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -251287285, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 251287289, new Object[]{reportAccidentActivity, healthcare});
    }

    public static /* synthetic */ Unit b(ReportAccidentActivity reportAccidentActivity, ReportStatus reportStatus) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -78914247, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 78914252, new Object[]{reportAccidentActivity, reportStatus});
    }

    static {
        write = 1;
        g();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannelStubProxy + 7;
        write = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault3(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_failed).substring(0, 1).length() + 717958624, -1003223291, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, VocationProfileRequest.TuitionPaymentFragmentbindingInflater1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redeem_bni_details).substring(34, 36).length() - 336716547, 1003223294, new Object[]{this})).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() throws IllegalAccessException {
        int iTuitionPaymentFragmentbindingInflater1 = VocationProfileRequest.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentbindingInflater2 = VocationProfileRequest.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -60711662, iTuitionPaymentFragmentbindingInflater1, TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentbindingInflater2, 60711664, new Object[]{this});
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 111877083;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentbindingInflater1 = VocationProfileRequest.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1626750158, length, TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentbindingInflater1, 1626750159, new Object[]{this, bundle});
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 79;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws IllegalAccessException {
        int iTuitionPaymentFragmentbindingInflater1 = VocationProfileRequest.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1556923514, iTuitionPaymentFragmentbindingInflater1, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1223954173, VocationProfileRequest.TuitionPaymentFragmentbindingInflater1(), -1556923514, new Object[]{this, context});
    }

    static void g() {
        RemoteActionCompatParcelizer = 430783359667463126L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r5, byte r6, int r7) {
        /*
            int r7 = r7 * 4
            int r7 = 107 - r7
            int r6 = r6 * 3
            int r6 = 1 - r6
            int r5 = r5 * 3
            int r5 = 3 - r5
            byte[] r0 = com.bpjstku.presentation.report.ReportAccidentActivity.$$c
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r6
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r5 = r5 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L27:
            r4 = r0[r5]
        L29:
            int r7 = r7 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.report.ReportAccidentActivity.$$i(short, byte, int):java.lang.String");
    }
}
