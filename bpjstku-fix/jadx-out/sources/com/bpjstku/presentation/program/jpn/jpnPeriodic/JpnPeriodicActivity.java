package com.bpjstku.presentation.program.jpn.jpnPeriodic;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.jp.model.request.JpVerificationLivenessBegin;
import com.bpjstku.data.jp.model.request.JpVerificationLivenessEnd;
import com.bpjstku.data.jp.model.response.JpVerificationResponse;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.setting.model.request.KeyRequest;
import com.bpjstku.data.setting.model.response.KeyResponse;
import com.bpjstku.databinding.ActivityJpnPeriodicBinding;
import com.bpjstku.domain.jp.model.CheckEligibleJp;
import com.bpjstku.domain.jp.model.JpDataTk;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicActivity;
import com.bpjstku.util.custom.CircleImageView;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.datadog.android.rum.internal.domain.scope.RumViewScope$onStopView$1;
import com.datadog.android.rum.model.LongTaskEvent;
import com.google.android.material.button.MaterialButton;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.AutoValue_LifecycleCameraRepository_Key;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.Camera2CameraCoordinatorExternalSyntheticLambda0;
import defpackage.CaptureSession1;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.IntegerRes;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ToolbarActionBarActionMenuPresenterCallback;
import defpackage.TwilightManager;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.acquireBuffer;
import defpackage.calculateCameraUseCases;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.createExtraPreview;
import defpackage.deriveCodec;
import defpackage.getCameraState;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getRealtimeCaptureLatency;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdacreateCameraSelectorById0;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.outputFormatToAudioProfile;
import defpackage.outputFormatToAudioProfile.AnonymousClass4;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import defpackage.stopRepeating;
import defpackage.unregisterMediaButtonEventReceiver;
import id.vida.liveness.dto.VidaLivenessResponse;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u0019\u0010\r\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0010J)\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0015\u0010\b\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0015\u0010\u001e\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0015\u0010\u000b\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0015\u0010\"\u001a\u00020!8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0015\u0010\r\u001a\u00020#8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010\n\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010)R\u0014\u0010\f\u001a\u00020\u00118\u0002X\u0083D¢\u0006\u0006\n\u0004\b\r\u0010*R\u0016\u0010-\u001a\u00020\u00058\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0018\u0010+\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u0010,R\u0018\u00102\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u0010,R\u0016\u0010.\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00100\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0017\u0010/\u001a\u0004\u0018\u0001058CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b'\u0010\u001cR\u0017\u0010 \u001a\u0004\u0018\u0001068CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b7\u0010\u001cR\u0017\u00109\u001a\u0004\u0018\u0001088CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0015\u00103\u001a\u00020:8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b2\u0010\u001cR\u0015\u0010<\u001a\u00020;8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b<\u0010\u001cR\u0014\u0010>\u001a\u00020\u00118UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010=R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u00020?8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010A"}, d2 = {"Lcom/bpjstku/presentation/program/jpn/jpnPeriodic/JpnPeriodicActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityJpnPeriodicBinding;", "<init>", "()V", "", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)V", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "b", "a", "Lid/vida/liveness/dto/VidaLivenessResponse;", "(Lid/vida/liveness/dto/VidaLivenessResponse;)V", "", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LstopRepeating;", "Lkotlin/Lazy;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LIntegerRes;", "INotificationSideChannelStub", "LacquireBuffer;", "TuitionPaymentFragmentbindingInflater1", "LToolbarActionBarActionMenuPresenterCallback;", "LgetCameraState;", "read", "LgetCameraState;", "g", "LgetStringOrNull;", "LgetStringOrNull;", "I", "notify", "Ljava/lang/String;", "d", "INotificationSideChannel", "getInterfaceDescriptor", "cancelAll", "cancel", "onTransact", "INotificationSideChannelDefault", "Z", "Lcom/bpjstku/domain/jp/model/JpDataTk;", "Lcom/bpjstku/domain/user/model/User;", "write", "Lcom/bpjstku/domain/jp/model/CheckEligibleJp;", "INotificationSideChannelStubProxy", "LoutputFormatToAudioProfile;", "LCaptureSession1;", "RemoteActionCompatParcelizer", "()I", "MediaBrowserCompat", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "connect"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JpnPeriodicActivity extends BindingBaseActivity<ActivityJpnPeriodicBinding> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long MediaBrowserCompat;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int getNotifyChildrenChangedOptions;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private String a;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private boolean INotificationSideChannel;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private getStringOrNull asBinder;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private String onTransact;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private String cancel;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private String notify;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private String d;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private getCameraState g;
    private static final byte[] $$a = {48, -119, -71, 110, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 216;
    private static int getExtras = 1;
    private static int connect = 0;
    private static int IconCompatParcelizer = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int asInterface = 1001;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String cancelAll = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy getInterfaceDescriptor = LazyKt.lazy(new Function0() { // from class: CaptureCallbackContainer
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Lazy INotificationSideChannelStub = LazyKt.lazy(new Function0() { // from class: decideSkippedCameraIdByHeuristic
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1};
            return (User) JpnPeriodicActivity.TuitionPaymentFragmentbindingInflater1(LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1860114047, LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1860114045, objArr);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy INotificationSideChannelStubProxy = LazyKt.lazy(new Function0() { // from class: getCaptureConfigId
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JpnPeriodicActivity.d(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final Lazy INotificationSideChannelDefault = LazyKt.lazy(new Function0() { // from class: CaptureCallbackConverter
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JpnPeriodicActivity.a(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });
    private final Lazy RemoteActionCompatParcelizer = LazyKt.lazy(new Function0() { // from class: getCaptureCallback
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JpnPeriodicActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Observer, FunctionAdapter {
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

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = (~(i7 | i6)) | i3;
        int i9 = ~i6;
        int i10 = ~i3;
        int i11 = (~(i9 | i10)) | i4;
        int i12 = (~(i3 | i9 | i4)) | (~(i7 | i9 | i10)) | (~(i10 | i6 | i4));
        int i13 = i6 + i4 + i + ((-104759182) * i2) + ((-453318476) * i5);
        int i14 = i13 * i13;
        int i15 = (i6 * 1504131295) + 1805123584 + (1504131295 * i4) + (179255518 * i8) + ((-358511036) * i11) + ((-179255518) * i12) + (1324875776 * i) + (711983104 * i2) + (1180696576 * i5) + (1022754816 * i14);
        int i16 = ((i6 * (-1431886989)) - 1507491630) + (i4 * (-1431886989)) + (i8 * (-122)) + (i11 * 244) + (i12 * 122) + (i * (-1431886867)) + (i2 * 722567050) + (i5 * (-1618605404)) + (i14 * 297664512);
        int i17 = i15 + (i16 * i16 * (-277217280));
        if (i17 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i17 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i17 != 3) {
            if (i17 != 4) {
                return i17 != 5 ? TuitionPaymentFragmentbindingInflater1(objArr) : b(objArr);
            }
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        final JpnPeriodicActivity jpnPeriodicActivity = (JpnPeriodicActivity) objArr[0];
        int i18 = 2 % 2;
        JpnPeriodicActivity jpnPeriodicActivity2 = jpnPeriodicActivity;
        ((ActivityResultContractsPickVisualMediaMediaCapabilities) jpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(jpnPeriodicActivity2, new Observer() { // from class: getOutputConfigurationCompat
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                JpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        ((IntegerRes) jpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).MediaBrowserCompat.observe(jpnPeriodicActivity2, new Observer() { // from class: createCamera2CaptureCallback
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                JpnPeriodicActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        ((IntegerRes) jpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).b.observe(jpnPeriodicActivity2, new Observer() { // from class: CameraStateMachine
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                Object[] objArr2 = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj};
                JpnPeriodicActivity.TuitionPaymentFragmentbindingInflater1(LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1592610888, LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1592610884, objArr2);
            }
        });
        ((stopRepeating) jpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).d.observe(jpnPeriodicActivity2, new Observer() { // from class: createFrom
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                JpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        ((stopRepeating) jpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).asInterface.observe(jpnPeriodicActivity2, new Observer() { // from class: CameraUnavailableExceptionHelper
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                JpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        ((ToolbarActionBarActionMenuPresenterCallback) jpnPeriodicActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(jpnPeriodicActivity2, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: getStateLiveData
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (TwilightManager) obj);
            }
        }));
        int i19 = IconCompatParcelizer + 71;
        connect = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 197 - r6
            byte[] r0 = com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicActivity.$$a
            int r8 = r8 * 14
            int r8 = 98 - r8
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L2b:
            int r6 = r6 + 1
            int r8 = r8 + r4
            int r8 = r8 + (-11)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicActivity.c(int, short, short, java.lang.Object[]):void");
    }

    public JpnPeriodicActivity() {
        final JpnPeriodicActivity jpnPeriodicActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<stopRepeating>() { // from class: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, stopRepeating] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ stopRepeating invoke() {
                LifecycleOwner lifecycleOwner = jpnPeriodicActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(stopRepeating.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = jpnPeriodicActivity;
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
        final JpnPeriodicActivity jpnPeriodicActivity2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = jpnPeriodicActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = jpnPeriodicActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.b = LazyKt.lazy(new Function0<ToolbarActionBarActionMenuPresenterCallback>() { // from class: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicActivity$special$$inlined$viewModel$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ToolbarActionBarActionMenuPresenterCallback, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ToolbarActionBarActionMenuPresenterCallback invoke() {
                LifecycleOwner lifecycleOwner = jpnPeriodicActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ToolbarActionBarActionMenuPresenterCallback.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/program/jpn/jpnPeriodic/JpnPeriodicActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/domain/jp/model/JpDataTk;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Lcom/bpjstku/domain/jp/model/JpDataTk;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, JpDataTk p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, JpnPeriodicActivity.class, new Pair[]{TuplesKt.to("jp_info", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19473 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 2624, 13 - (KeyEvent.getMaxKeyCode() >> 16), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (MediaBrowserCompat ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39423 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 481 - (Process.myTid() >> 22), (ViewConfiguration.getJumpTapTimeout() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i4 = $10 + 61;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $11 + 31;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - Color.alpha(0)), 481 - TextUtils.indexOf("", "", 0), Process.getGidForName("") + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        JpnPeriodicActivity jpnPeriodicActivity = (JpnPeriodicActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        getCameraState.Companion companion = getCameraState.INSTANCE;
        String string = jpnPeriodicActivity.getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string, "");
        getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_warning_blue, "", str, string);
        jpnPeriodicActivity.g = getcamerastateB;
        FragmentManager supportFragmentManager = jpnPeriodicActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            getcamerastateB.show(supportFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int i2 = IconCompatParcelizer + 71;
            connect = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = IconCompatParcelizer + 13;
        connect = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return null;
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements getCameraState.TuitionPaymentFragmentbindingInflater1 {
        private /* synthetic */ unregisterMediaButtonEventReceiver TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentbindingInflater1(unregisterMediaButtonEventReceiver unregistermediabuttoneventreceiver) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = unregistermediabuttoneventreceiver;
        }

        @Override // getCameraState.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dismiss();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityJpnPeriodicBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        connect = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            JpnPeriodicActivity$bindingInflater$1 jpnPeriodicActivity$bindingInflater$1 = JpnPeriodicActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
            obj.hashCode();
            throw null;
        }
        JpnPeriodicActivity$bindingInflater$1 jpnPeriodicActivity$bindingInflater$2 = JpnPeriodicActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i3 = IconCompatParcelizer + 23;
        connect = i3 % 128;
        if (i3 % 2 == 0) {
            return jpnPeriodicActivity$bindingInflater$2;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        JpnPeriodicActivity jpnPeriodicActivity = (JpnPeriodicActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 29;
        connect = i2 % 128;
        int i3 = i2 % 2;
        JpnPeriodicActivity jpnPeriodicActivity2 = jpnPeriodicActivity;
        Intrinsics.checkNotNullParameter(jpnPeriodicActivity2, "");
        jpnPeriodicActivity2.getWindow().addFlags(8192);
        jpnPeriodicActivity.TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityJpnPeriodicBinding) ((ViewBinding) jpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityJpnPeriodicBinding) ((ViewBinding) jpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(jpnPeriodicActivity.getString(R.string.title_jp_periodically_confirmation));
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) jpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder != null) {
            String str = userAsBinder.TuitionPaymentFragmentbindingInflater1;
            if (str != null) {
                int i4 = IconCompatParcelizer + 33;
                connect = i4 % 128;
                if (i4 % 2 != 0) {
                    str.length();
                    throw null;
                }
                if (str.length() > 0) {
                    CircleImageView circleImageView = ((ActivityJpnPeriodicBinding) ((ViewBinding) jpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).civProfile;
                    Intrinsics.checkNotNullExpressionValue(circleImageView, "");
                    Drawable drawable = jpnPeriodicActivity.getResources().getDrawable(R.drawable.ic_placeholder);
                    Intrinsics.checkNotNullExpressionValue(drawable, "");
                    Drawable drawable2 = jpnPeriodicActivity.getResources().getDrawable(R.drawable.ic_placeholder);
                    Intrinsics.checkNotNullExpressionValue(drawable2, "");
                    lambdacreateCameraSelectorById0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(circleImageView, jpnPeriodicActivity, str, drawable, drawable2);
                    String str2 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (str2 != null) {
                        ((ActivityResultContractsPickVisualMediaMediaCapabilities) jpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, str);
                    }
                }
            } else {
                ((ActivityJpnPeriodicBinding) ((ViewBinding) jpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).civProfile.setImageDrawable(ContextCompat.getDrawable(jpnPeriodicActivity, R.drawable.ic_placeholder));
            }
            ((ActivityJpnPeriodicBinding) ((ViewBinding) jpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvNamesWorker.setText(String.valueOf(userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        }
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivityJpnPeriodicBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnConfirmation;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: CameraSelectionOptimizer
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JpnPeriodicActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        int i2 = IconCompatParcelizer + 33;
        connect = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements getStringOrNull.b {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            JpnPeriodicActivity.this.d_();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    private final void b(VidaLivenessResponse p0) {
        byte[] imageBytes;
        String strEncodeToString;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 19;
        connect = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 8 / 0;
            if (p0 != null) {
                imageBytes = p0.getImageBytes();
                if (imageBytes != null) {
                    Intrinsics.checkNotNullParameter(imageBytes, "");
                    strEncodeToString = Base64.encodeToString(imageBytes, 2);
                    Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
                } else {
                    strEncodeToString = null;
                }
                this.a = strEncodeToString;
                this.notify = p0.getTransactionId();
                this.cancel = String.valueOf(p0.getLivenessScore());
                this.onTransact = String.valueOf(p0.getManipulationScore());
                int i4 = IconCompatParcelizer + 53;
                connect = i4 % 128;
                int i5 = i4 % 2;
            }
        } else if (p0 != null) {
            imageBytes = p0.getImageBytes();
            if (imageBytes != null) {
                Intrinsics.checkNotNullParameter(imageBytes, "");
                strEncodeToString = Base64.encodeToString(imageBytes, 2);
                Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
            } else {
                strEncodeToString = null;
            }
            this.a = strEncodeToString;
            this.notify = p0.getTransactionId();
            this.cancel = String.valueOf(p0.getLivenessScore());
            this.onTransact = String.valueOf(p0.getManipulationScore());
            int i6 = IconCompatParcelizer + 53;
            connect = i6 % 128;
            int i7 = i6 % 2;
        }
        this.INotificationSideChannel = true;
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int p0, int p1, Intent p2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 23;
        connect = i2 % 128;
        int i3 = i2 % 2;
        super.onActivityResult(p0, p1, p2);
        if (this.asInterface == p0) {
            int i4 = connect + 29;
            IconCompatParcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (p1 == 0) {
                if (p2 == null || p2.getStringExtra("result_info") == null) {
                    return;
                }
                int i5 = connect + 81;
                IconCompatParcelizer = i5 % 128;
                int i6 = i5 % 2;
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "verifikasi biometrik dibatalkan", 0).show();
                return;
            }
            if (p2 == null || p2.getStringExtra("result_info") == null) {
                return;
            }
            int i7 = connect + 63;
            IconCompatParcelizer = i7 % 128;
            if (i7 % 2 == 0) {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "silakan mencoba kembali", 1).show();
            } else {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "silakan mencoba kembali", 0).show();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:5:0x0016, B:15:0x0042, B:13:0x0032, B:11:0x0029), top: B:19:0x0011 }] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = connect + 7;
        IconCompatParcelizer = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                int i3 = 25 / 0;
                if (p0.getItemId() == 16908332) {
                    getOnBackPressedDispatcher().onBackPressed();
                    int i4 = IconCompatParcelizer + 113;
                    connect = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                if (p0.getItemId() == 16908332) {
                    getOnBackPressedDispatcher().onBackPressed();
                    int i6 = IconCompatParcelizer + 113;
                    connect = i6 % 128;
                    int i7 = i6 % 2;
                }
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
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char fadingEdgeLength = (char) (29944 - (ViewConfiguration.getFadingEdgeLength() >> 16));
            int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0');
            int i3 = 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            Object[] objArr2 = new Object[1];
            c((short) 193, (byte) 37, $$a[28], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength, iLastIndexOf, i3, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i4 = connect + 63;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char touchSlop = (char) (29944 - (ViewConfiguration.getTouchSlop() >> 8));
                int i6 = 1755 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int keyRepeatTimeout = 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                Object[] objArr3 = new Object[1];
                c((short) 156, (byte) 52, $$a[28], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, i6, keyRepeatTimeout, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_bank_transfer).substring(0, 3).codePointAt(0) - 891449366;
            int i7 = ~iCodePointAt;
            int i8 = (((-285026313) + (((~(63836695 | i7)) | (~((-276439122) | iCodePointAt))) * 210)) + (((~(iCodePointAt | 335426135)) | (~(i7 | (-4849682)))) * 210)) - 200594835;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{22944, 22996, 22850, 22742, 22552, 23517, 23377, 23261, 23125, 23955, 23919, 23750, 23629, 24525, 24413, 24278}, 127 - View.MeasureSpec.getMode(0), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{22947, 40631, 55197, 3311, 17882, 47838, 62248, 10268, 24906, 42570, 40771, 55217, 3237, 17888, 47856, 62424}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 50933, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {1036894237};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.resolveSizeAndState(0, 0, 0) + 42049), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1726, 29 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = RumViewScope$onStopView$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -200594835);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (29944 - TextUtils.indexOf("", ""));
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1755;
                    int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0');
                    Object[] objArr8 = new Object[1];
                    c((short) 156, (byte) 52, $$a[28], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, windowTouchSlop, iIndexOf, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{22955, 38589, 51100, 13555, 26049, 21214, 33592, 61515, 8557, 7768, 20254, 49034, 60575, 56828, 2784, 31704, 43063, 39200, 54884, 1918, 29789, 42156}, TextUtils.getOffsetBefore("", 0) + 53017, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{22959, 24669, 10845, 62539, 48725, 30792, 588, 52293, 38519, 20600, 6760, 9335, 61031, 43032, 29205}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 14832, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cResolveSize = (char) (View.resolveSize(0, 0) + 29944);
                        int iAlpha = 1755 - Color.alpha(0);
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 23;
                        short s = (short) 104;
                        Object[] objArr11 = new Object[1];
                        c(s, (byte) (s >>> 1), $$a[28], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSize, iAlpha, longPressTimeout, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0));
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1755;
                        int defaultSize = View.getDefaultSize(0, 0) + 23;
                        Object[] objArr12 = new Object[1];
                        c((short) 193, (byte) 37, $$a[28], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, packedPositionGroup, defaultSize, 986134021, false, (String) objArr12[0], null);
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
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr == null) {
                throw null;
            }
            int i11 = connect + 63;
            IconCompatParcelizer = i11 % 128;
            int i12 = i11 % 2;
            while (i2 < strArr.length) {
                int i13 = connect + 13;
                IconCompatParcelizer = i13 % 128;
                if (i13 % 2 == 0) {
                    arrayList.add(strArr[i2]);
                    i2 += 116;
                } else {
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
            throw null;
        }
        int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i15 = ~iIdentityHashCode;
        int i16 = i14 + ((((~(804689392 | i15)) | (~(iIdentityHashCode | 1017291818))) * 959) - 559104739) + (((~(iIdentityHashCode | 804689392)) | (~(i15 | 1017291818))) * 959);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr13[3])[0] = i18 ^ (i18 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
            int iResolveOpacity = 1031 - Drawable.resolveOpacity(0, 0);
            int size = 15 - View.MeasureSpec.getSize(0);
            short s2 = (short) 52;
            Object[] objArr14 = new Object[1];
            c(s2, (byte) s2, $$a[28], objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, iResolveOpacity, size, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new char[]{22955, 38589, 51100, 13555, 26049, 21214, 33592, 61515, 8557, 7768, 20254, 49034, 60575, 56828, 2784, 31704, 43063, 39200, 54884, 1918, 29789, 42156}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 52981, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new char[]{22959, 24669, 10845, 62539, 48725, 30792, 588, 52293, 38519, 20600, 6760, 9335, 61031, 43032, 29205}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_failed).substring(0, 1).length() + 14842, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
            int i19 = 1032 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int trimmedLength = TextUtils.getTrimmedLength("") + 15;
            Object[] objArr17 = new Object[1];
            c((short) 156, (byte) 52, $$a[28], objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionType, i19, trimmedLength, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                int i20 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1030;
                int iMyTid = 15 - (Process.myTid() >> 22);
                short s3 = $$a[7];
                byte b = (byte) s3;
                Object[] objArr18 = new Object[1];
                c(s3, b, b, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, i20, iMyTid, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i21 = ((int[]) objArr19[3])[0];
            int i22 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i23 = ~((-588739435) | iIdentityHashCode2);
            int i24 = ~iIdentityHashCode2;
            int i25 = (((-358156966) + ((i23 | (~(937393146 | i24))) * 497)) + (((~(iIdentityHashCode2 | 937393146)) | ((~((-592933883) | i24)) | 4194448)) * 497)) - 2083368766;
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr[2])[0] = i27 ^ (i27 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(new char[]{22944, 22996, 22850, 22742, 22552, 23517, 23377, 23261, 23125, 23955, 23919, 23750, 23629, 24525, 24413, 24278}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new char[]{22947, 40631, 55197, 3311, 17882, 47838, 62248, 10268, 24906, 42570, 40771, 55217, 3237, 17888, 47856, 62424}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 50969, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {1036894237};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1133, 18 - KeyEvent.normalizeMetaState(0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -2083368766, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                int iRgb = Color.rgb(0, 0, 0) + 16778247;
                int doubleTapTimeout = 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                short s4 = (short) 52;
                Object[] objArr24 = new Object[1];
                c(s4, (byte) s4, $$a[28], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cNormalizeMetaState, iRgb, doubleTapTimeout, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-16731223) - Color.rgb(0, 0, 0)), TextUtils.getOffsetAfter("", 0) + 1117, (Process.myPid() >> 22) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c3 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int i28 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1030;
                int iRed = 15 - Color.red(0);
                short s5 = $$a[7];
                byte b2 = (byte) s5;
                Object[] objArr25 = new Object[1];
                c(s5, b2, b2, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, i28, iRed, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{22955, 38589, 51100, 13555, 26049, 21214, 33592, 61515, 8557, 7768, 20254, 49034, 60575, 56828, 2784, 31704, 43063, 39200, 54884, 1918, 29789, 42156}, 53017 - TextUtils.getOffsetBefore("", 0), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{22959, 24669, 10845, 62539, 48725, 30792, 588, 52293, 38519, 20600, 6760, 9335, 61031, 43032, 29205}, 14843 - ExpandableListView.getPackedPositionGroup(0L), objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1031;
                    int maximumDrawingCacheSize = 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    Object[] objArr28 = new Object[1];
                    c((short) 156, (byte) 52, $$a[28], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(scrollDefaultDelay, iCombineMeasuredStates, maximumDrawingCacheSize, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int longPressTimeout2 = 1031 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 16;
                    short s6 = (short) 52;
                    Object[] objArr29 = new Object[1];
                    c(s6, (byte) s6, $$a[28], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(doubleTapTimeout2, longPressTimeout2, iLastIndexOf2, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i29 = ((int[]) objArr[1])[0];
        int i30 = ((int[]) objArr[3])[0];
        if (i30 == i29) {
            int i31 = connect + 37;
            IconCompatParcelizer = i31 % 128;
            int i32 = i31 % 2;
            Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i33 = ((int[]) objArr[2])[0];
            int i34 = ((int[]) objArr[3])[0];
            int i35 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i36 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
            int i37 = ~i36;
            int i38 = (~(411079496 | i37)) | (-1066401787) | (~(655359666 | i37));
            int i39 = i33 + (-1889600785) + (((~(i36 | (-37377))) | i38) * 590) + (i38 * (-1180)) + (((~((-655359667) | i37)) | (~(i37 | (-411079497)))) * 590);
            int i40 = i39 ^ (i39 << 13);
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr30[2])[0] = i41 ^ (i41 << 5);
            int i42 = connect + 45;
            IconCompatParcelizer = i42 % 128;
            int i43 = i42 % 2;
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str : strArr4) {
                arrayList2.add(str);
            }
        }
        Toast.makeText((Context) null, i30 / (((i30 - 1) * i30) % 2), 0).show();
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i44 = ((int[]) objArr[2])[0];
        int i45 = ((int[]) objArr[3])[0];
        int i46 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int i47 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
        int i48 = ~i47;
        int i49 = i44 + (-582492756) + ((555629664 | i48) * (-757)) + ((~(866057462 | i47)) * 1514) + (((~(i47 | (-310427799))) | (~(i48 | 311349494)) | 554707968) * 757);
        int i50 = (i49 << 13) ^ i49;
        int i51 = i50 ^ (i50 >>> 17);
        ((int[]) objArr31[2])[0] = i51 ^ (i51 << 5);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0093  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = connect + 55;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null);
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            if (i3 != 908208826 + ((~((-838867673) | iElapsedRealtime)) * (-301)) + (((~(975731678 | iElapsedRealtime)) | (~((~iElapsedRealtime) | 145744135))) * (-301)) + (((~(iElapsedRealtime | (-145744136))) | 975731678) * 301)) {
                int i4 = connect + 27;
                IconCompatParcelizer = i4 % 128;
                int i5 = i4 % 2;
                int[] iArr = new int[657146352];
                iArr[657146351] = 1;
                int i6 = 812678928 % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            }
        } else {
            int i7 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 1857246643;
            if (i7 != (((~((-577048896) | iCodePointAt)) | 38076438) * (-283)) + 1355709818 + ((~(iCodePointAt | (-538972458))) * 283)) {
                int i8 = connect + 27;
                IconCompatParcelizer = i8 % 128;
                int i9 = i8 % 2;
                int[] iArr2 = new int[657146352];
                iArr2[657146351] = 1;
                int i10 = 812678928 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i11 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i12 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
        if (i11 != (-1205616388) + (((~(1844648056 | i12)) | 34358661) * 336) + (((~(i12 | 128736725)) | 1750269992) * (-168)) + (((~((~i12) | 128736725)) | 1844648056) * 168)) {
            int i13 = 415079740 % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i14 = connect + 67;
        IconCompatParcelizer = i14 % 128;
        int i15 = i14 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00df, code lost:
    
        if (r1 != ((1100061850 + (((~((~r2) | 491658851)) | (-2104442620)) * 529)) + (((~(r2 | 491658851)) | (-2087397114)) * 529))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00e1, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicActivity.IconCompatParcelizer + 121;
        com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicActivity.connect = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ed, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ef, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f0, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00fb, code lost:
    
        throw new java.lang.RuntimeException("-1128376544");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0103, code lost:
    
        throw new java.lang.RuntimeException("70826559");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0049, code lost:
    
        if (r1 == ((((-328519600) + ((r9 | r10) * 1150)) + (((~((-1551277635) | r7)) | r10) * (-575))) + (((~(r6 | (-721290092))) | (~(r7 | 721290091))) * 575))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x009d, code lost:
    
        if (r1 == (((1313074152 + (((~(r6 | (-1662396612))) | ((~((-277447981) | r7)) | 1107435523)) * (-68))) + ((~((-554961089) | r7)) * (-68))) + (((~(1662396611 | r7)) | (-832409069)) * 68))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009f, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 65;
        connect = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[1]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            if (i3 != ((((~(i4 | (-1137018421))) | ((~((-307030878) | i4)) | 38044180)) * (-397)) - 991704178) + ((iIdentityHashCode | (-1367960938)) * 397)) {
                throw null;
            }
        } else {
            int i5 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode2;
            if (i5 != (-1273806040) + ((560152592 | i6) * (-192)) + (((~(1701044275 | i6)) | 310904140) * (-384)) + (((~(iIdentityHashCode2 | (-1140891684))) | (~(i6 | 2011948415)) | (~((-310904141) | iIdentityHashCode2))) * DerHeader.TAG_CLASS_PRIVATE)) {
                throw null;
            }
        }
        int i7 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 1493716384;
        int i8 = ~((-549543951) | iCodePointAt);
        int i9 = ~iCodePointAt;
        if (i7 != 669516476 + ((i8 | (~(i9 | (-1477837889)))) * 920) + (((~((-551674127) | i9)) | 549543950) * 920) + (((~(iCodePointAt | (-1477837889))) | (~((-549543951) | i9)) | (~((-2130177) | iCodePointAt))) * 920)) {
            int i10 = connect + 125;
            IconCompatParcelizer = i10 % 128;
            if (i10 % 2 == 0) {
                int[] iArr = new int[729387248];
                iArr[729387247] = 1;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            } else {
                int[] iArr2 = new int[729387248];
                iArr2[729387247] = 1;
                int i11 = (-915058672) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        super.onCreate(bundle);
        int i12 = connect + 63;
        IconCompatParcelizer = i12 % 128;
        if (i12 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ JpDataTk TuitionPaymentFragmentspecialinlinedviewModeldefault1(JpnPeriodicActivity jpnPeriodicActivity) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        connect = i2 % 128;
        int i3 = i2 % 2;
        JpDataTk jpDataTk = (JpDataTk) jpnPeriodicActivity.getIntent().getParcelableExtra("jp_info");
        int i4 = connect + 7;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return jpDataTk;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008b  */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final JpnPeriodicActivity jpnPeriodicActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        List listSplit$default;
        int i = 2 % 2;
        int i2 = connect + 45;
        int i3 = i2 % 128;
        IconCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            int i4 = 23 / 0;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                return;
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return;
        }
        int i5 = i3 + 85;
        connect = i5 % 128;
        String str = null;
        if (i5 % 2 != 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder;
            str.hashCode();
            throw null;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                jpnPeriodicActivity.IconCompatParcelizer();
                TuitionPaymentFragmentbindingInflater1(MapTypeAdapterFactory.Adapter.b(), MapTypeAdapterFactory.Adapter.b(), LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 2092519348, LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -2092519348, new Object[]{jpnPeriodicActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2)});
                return;
            }
            return;
        }
        jpnPeriodicActivity.IconCompatParcelizer();
        VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
        List listSplit$default2 = StringsKt.split$default((CharSequence) ((JpVerificationResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isSuccessful(), new String[]{"#"}, false, 0, 6, (Object) null);
        StringsKt.split$default((CharSequence) ((JpVerificationResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isSuspend(), new String[]{"#"}, false, 0, 6, (Object) null);
        CheckEligibleJp checkEligibleJp = (CheckEligibleJp) jpnPeriodicActivity.INotificationSideChannelStubProxy.getValue();
        if (checkEligibleJp != null) {
            int i6 = connect + 41;
            IconCompatParcelizer = i6 % 128;
            if (i6 % 2 == 0) {
                String str2 = checkEligibleJp.TuitionPaymentFragmentbindingInflater1;
                str.hashCode();
                throw null;
            }
            String str3 = checkEligibleJp.TuitionPaymentFragmentbindingInflater1;
            if (str3 != null) {
                listSplit$default = StringsKt.split$default((CharSequence) str3, new String[]{"#"}, false, 0, 6, (Object) null);
            } else {
                listSplit$default = null;
            }
        } else {
            listSplit$default = null;
        }
        if (!Intrinsics.areEqual(listSplit$default2.get(2), listSplit$default != null ? (String) listSplit$default.get(2) : null)) {
            TuitionPaymentFragmentbindingInflater1(MapTypeAdapterFactory.Adapter.b(), MapTypeAdapterFactory.Adapter.b(), LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 2092519348, LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -2092519348, new Object[]{jpnPeriodicActivity, "Permintaan Ditolak"});
            return;
        }
        outputFormatToAudioProfile outputformattoaudioprofile = (outputFormatToAudioProfile) jpnPeriodicActivity.INotificationSideChannelDefault.getValue();
        String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(outputformattoaudioprofile.new AnonymousClass4((String[]) Arrays.copyOf(strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length)));
        final Function1 function1 = new Function1() { // from class: toCaptureCallback
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JpnPeriodicActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Boolean) obj);
            }
        };
        BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartCompose.subscribe(new logToString() { // from class: createInstancesForMultiResolutionOutput
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                JpnPeriodicActivity.b(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
        ((acquireBuffer) jpnPeriodicActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(JpnPeriodicActivity jpnPeriodicActivity) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 21;
        connect = i2 % 128;
        if (i2 % 2 != 0) {
            JpnPeriodicInformationVerifiedActivity.Companion companion = JpnPeriodicInformationVerifiedActivity.INSTANCE;
            JpnPeriodicInformationVerifiedActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jpnPeriodicActivity, (JpDataTk) jpnPeriodicActivity.getInterfaceDescriptor.getValue(), false);
            jpnPeriodicActivity.d_();
            return Unit.INSTANCE;
        }
        JpnPeriodicInformationVerifiedActivity.Companion companion2 = JpnPeriodicInformationVerifiedActivity.INSTANCE;
        JpnPeriodicInformationVerifiedActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jpnPeriodicActivity, (JpDataTk) jpnPeriodicActivity.getInterfaceDescriptor.getValue(), true);
        jpnPeriodicActivity.d_();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(JpnPeriodicActivity jpnPeriodicActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        String str2;
        String str3;
        String str4;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = connect + 101;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            jpnPeriodicActivity.MediaBrowserCompat();
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                jpnPeriodicActivity.IconCompatParcelizer();
                TuitionPaymentFragmentbindingInflater1(MapTypeAdapterFactory.Adapter.b(), MapTypeAdapterFactory.Adapter.b(), LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 2092519348, LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -2092519348, new Object[]{jpnPeriodicActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2)});
                return;
            }
            return;
        }
        int i4 = IconCompatParcelizer + 79;
        connect = i4 % 128;
        int i5 = i4 % 2;
        String checkSum = ((KeyResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum();
        jpnPeriodicActivity.cancelAll = checkSum;
        List listSplit$default = StringsKt.split$default((CharSequence) checkSum, new String[]{"#"}, false, 0, 6, (Object) null);
        User user = (User) jpnPeriodicActivity.INotificationSideChannelStub.getValue();
        Object obj = null;
        if (user != null) {
            int i6 = IconCompatParcelizer + 7;
            connect = i6 % 128;
            int i7 = i6 % 2;
            str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } else {
            str = null;
        }
        if (!Intrinsics.areEqual(String.valueOf(str), listSplit$default.get(0))) {
            jpnPeriodicActivity.IconCompatParcelizer();
            String string = jpnPeriodicActivity.getString(R.string.message_integrity_data);
            Intrinsics.checkNotNullExpressionValue(string, "");
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jpnPeriodicActivity, string, null);
            int i8 = connect + 37;
            IconCompatParcelizer = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 81 / 0;
                return;
            }
            return;
        }
        int i10 = connect + 113;
        IconCompatParcelizer = i10 % 128;
        int i11 = i10 % 2;
        final stopRepeating stoprepeating = (stopRepeating) jpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        User user2 = (User) jpnPeriodicActivity.INotificationSideChannelStub.getValue();
        if (user2 != null) {
            int i12 = IconCompatParcelizer + 91;
            connect = i12 % 128;
            int i13 = i12 % 2;
            str2 = user2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } else {
            str2 = null;
        }
        String strValueOf = String.valueOf(str2);
        String str5 = jpnPeriodicActivity.d;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str5 = null;
        }
        Object obj2 = listSplit$default.get(2);
        StringBuilder sb = new StringBuilder("JMO#");
        sb.append(str5);
        sb.append("#true#70#");
        sb.append(obj2);
        String string2 = sb.toString();
        String str6 = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(str6, "");
        String string3 = Settings.Secure.getString(jpnPeriodicActivity.getContentResolver(), "android_id");
        Intrinsics.checkExpressionValueIsNotNull(string3, "");
        String str7 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str7, "");
        String strValueOf2 = String.valueOf(Build.VERSION.SDK_INT);
        String str8 = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(str8, "");
        String str9 = jpnPeriodicActivity.a;
        JpDataTk jpDataTk = (JpDataTk) jpnPeriodicActivity.getInterfaceDescriptor.getValue();
        String str10 = jpDataTk != null ? jpDataTk.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
        JpDataTk jpDataTk2 = (JpDataTk) jpnPeriodicActivity.getInterfaceDescriptor.getValue();
        if (jpDataTk2 != null) {
            int i14 = IconCompatParcelizer + 1;
            connect = i14 % 128;
            if (i14 % 2 != 0) {
                String str11 = jpDataTk2.TuitionPaymentFragmentbindingInflater1;
                obj.hashCode();
                throw null;
            }
            str3 = jpDataTk2.TuitionPaymentFragmentbindingInflater1;
        } else {
            str3 = null;
        }
        CheckEligibleJp checkEligibleJp = (CheckEligibleJp) jpnPeriodicActivity.INotificationSideChannelStubProxy.getValue();
        String str12 = checkEligibleJp != null ? checkEligibleJp.TuitionPaymentFragmentbindingInflater1 : null;
        String str13 = jpnPeriodicActivity.notify;
        String str14 = str13 == null ? "" : str13;
        String str15 = jpnPeriodicActivity.cancel;
        String str16 = str15 == null ? "" : str15;
        String str17 = jpnPeriodicActivity.onTransact;
        if (str17 == null) {
            int i15 = IconCompatParcelizer + 107;
            connect = i15 % 128;
            int i16 = i15 % 2;
            str4 = "";
        } else {
            str4 = str17;
        }
        JpVerificationLivenessEnd jpVerificationLivenessEnd = new JpVerificationLivenessEnd(strValueOf, string2, str6, string3, str7, strValueOf2, str8, str9, str10, str3, str12, str14, str16, str4);
        Intrinsics.checkNotNullParameter(jpVerificationLivenessEnd, "");
        MutableLiveData<VirtualCameraAdapter1<JpVerificationResponse>> mutableLiveData = stoprepeating.asInterface;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(stoprepeating.TuitionPaymentFragmentbindingInflater1.b(jpVerificationLivenessEnd)));
        final Function1 function1 = new Function1() { // from class: CameraCaptureSessionStateCallbacksComboSessionStateCallback
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return stopRepeating.TuitionPaymentFragmentbindingInflater1(stoprepeating, (JpVerificationResponse) obj3);
            }
        };
        logToString logtostring = new logToString() { // from class: onCaptureQueueEmpty
            @Override // defpackage.logToString
            public final void accept(Object obj3) {
                function1.invoke(obj3);
            }
        };
        final Function1 function2 = new Function1() { // from class: onConfigureFailed
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return stopRepeating.TuitionPaymentFragmentspecialinlinedviewModeldefault1(stoprepeating, (Throwable) obj3);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: CameraCaptureSessionStateCallbacksNoOpSessionStateCallback
            @Override // defpackage.logToString
            public final void accept(Object obj3) {
                function2.invoke(obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        stoprepeating.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ Unit b(JpnPeriodicActivity jpnPeriodicActivity, unregisterMediaButtonEventReceiver unregistermediabuttoneventreceiver) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 63;
        connect = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(unregistermediabuttoneventreceiver, "");
        getCameraState.Companion companion = getCameraState.INSTANCE;
        String string = jpnPeriodicActivity.getString(R.string.label_success);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = jpnPeriodicActivity.getString(R.string.message_success_jp);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = jpnPeriodicActivity.getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_success, string, string2, string3);
        FragmentManager childFragmentManager = unregistermediabuttoneventreceiver.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i4 = connect + 21;
            IconCompatParcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        getcamerastateB.g = new TuitionPaymentFragmentbindingInflater1(unregistermediabuttoneventreceiver);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(JpnPeriodicActivity jpnPeriodicActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        connect = i2 % 128;
        if (i2 % 2 != 0) {
            bool.booleanValue();
            throw null;
        }
        if (bool.booleanValue()) {
            ((ToolbarActionBarActionMenuPresenterCallback) jpnPeriodicActivity.b.getValue()).TuitionPaymentFragmentbindingInflater1(jpnPeriodicActivity);
            int i3 = IconCompatParcelizer + 43;
            connect = i3 % 128;
            int i4 = i3 % 2;
        } else {
            JpnPeriodicActivity jpnPeriodicActivity2 = jpnPeriodicActivity;
            String string = jpnPeriodicActivity.getString(R.string.message_camera_storage_permission_required);
            Intrinsics.checkNotNullExpressionValue(string, "");
            AutoValue_LifecycleCameraRepository_Key.b(jpnPeriodicActivity2, string);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(JpnPeriodicActivity jpnPeriodicActivity, TwilightManager twilightManager) {
        int i = 2 % 2;
        if (twilightManager instanceof TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = connect + 77;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1) twilightManager;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.getImageBytes() != null) {
                jpnPeriodicActivity.b(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1);
            }
        } else {
            if (!(twilightManager instanceof TwilightManager.TuitionPaymentFragmentbindingInflater1)) {
                throw new NoWhenBranchMatchedException();
            }
            int i4 = IconCompatParcelizer + 97;
            connect = i4 % 128;
            int i5 = i4 % 2;
            TwilightManager.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TwilightManager.TuitionPaymentFragmentbindingInflater1) twilightManager;
            if (tuitionPaymentFragmentbindingInflater1.b.getImageBytes() != null) {
                jpnPeriodicActivity.b(tuitionPaymentFragmentbindingInflater1.b);
                jpnPeriodicActivity.INotificationSideChannel = true;
                ((IntegerRes) jpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
            int i6 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder();
            sb.append(i6);
            sb.append(": ");
            sb.append(str);
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), sb.toString(), 0).show();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        JpnPeriodicActivity jpnPeriodicActivity = (JpnPeriodicActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 115;
        connect = i2 % 128;
        if (i2 % 2 == 0) {
            return ((ActivityResultContractsPickVisualMediaMediaCapabilities) jpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
        ((ActivityResultContractsPickVisualMediaMediaCapabilities) jpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(JpnPeriodicActivity jpnPeriodicActivity) {
        int i = 2 % 2;
        int i2 = connect + 23;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            ((IntegerRes) jpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        ((IntegerRes) jpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Unit unit2 = Unit.INSTANCE;
        int i3 = connect + 103;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static /* synthetic */ CheckEligibleJp d(JpnPeriodicActivity jpnPeriodicActivity) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        connect = i2 % 128;
        int i3 = i2 % 2;
        CheckEligibleJp checkEligibleJpB = ((stopRepeating) jpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.b();
        int i4 = connect + 5;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return checkEligibleJpB;
    }

    public static /* synthetic */ Unit b(JpnPeriodicActivity jpnPeriodicActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        CaptureSession1 captureSession1 = (CaptureSession1) jpnPeriodicActivity.RemoteActionCompatParcelizer.getValue();
        FragmentManager supportFragmentManager = jpnPeriodicActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(captureSession1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i2 = connect + 39;
            IconCompatParcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                captureSession1.show(supportFragmentManager, captureSession1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i3 = 42 / 0;
            } else {
                captureSession1.show(supportFragmentManager, captureSession1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            int i4 = connect + 31;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i6 = connect + 37;
        IconCompatParcelizer = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 96 / 0;
        }
        return unit;
    }

    public static /* synthetic */ outputFormatToAudioProfile a(JpnPeriodicActivity jpnPeriodicActivity) {
        int i = 2 % 2;
        outputFormatToAudioProfile outputformattoaudioprofile = new outputFormatToAudioProfile(jpnPeriodicActivity);
        int i2 = connect + 65;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        return outputformattoaudioprofile;
    }

    public static /* synthetic */ CaptureSession1 b(final JpnPeriodicActivity jpnPeriodicActivity) {
        int i = 2 % 2;
        CaptureSession1.Companion companion = CaptureSession1.INSTANCE;
        CaptureSession1 captureSession1TuitionPaymentFragmentspecialinlinedviewModeldefault2 = CaptureSession1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function0() { // from class: CaptureCallbackAdapter
            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 809798723;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }, new Function2() { // from class: CameraStateMachine1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return JpnPeriodicActivity.b(this.TuitionPaymentFragmentbindingInflater1, (unregisterMediaButtonEventReceiver) obj);
            }
        }, (JpDataTk) jpnPeriodicActivity.getInterfaceDescriptor.getValue());
        int i2 = connect + 35;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return captureSession1TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(JpnPeriodicActivity jpnPeriodicActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i2 = IconCompatParcelizer + 61;
            connect = i2 % 128;
            int i3 = i2 % 2;
            CircleImageView circleImageView = ((ActivityJpnPeriodicBinding) ((ViewBinding) jpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).civProfile;
            Intrinsics.checkNotNullExpressionValue(circleImageView, "");
            JpnPeriodicActivity jpnPeriodicActivity2 = jpnPeriodicActivity;
            Bitmap bitmap = (Bitmap) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Drawable drawable = jpnPeriodicActivity.getResources().getDrawable(R.drawable.ic_placeholder);
            Intrinsics.checkNotNullExpressionValue(drawable, "");
            Drawable drawable2 = jpnPeriodicActivity.getResources().getDrawable(R.drawable.ic_placeholder);
            Intrinsics.checkNotNullExpressionValue(drawable2, "");
            lambdacreateCameraSelectorById0.b(circleImageView, jpnPeriodicActivity2, bitmap, drawable, drawable2);
            int i4 = IconCompatParcelizer + 53;
            connect = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006f A[PHI: r2 r14
  0x006f: PHI (r2v6 com.bpjstku.domain.user.model.User) = (r2v5 com.bpjstku.domain.user.model.User), (r2v24 com.bpjstku.domain.user.model.User) binds: [B:16:0x006d, B:13:0x0059] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r14v24 stopRepeating) = (r14v23 stopRepeating), (r14v31 stopRepeating) binds: [B:16:0x006d, B:13:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0072 A[PHI: r14
  0x0072: PHI (r14v28 stopRepeating) = (r14v23 stopRepeating), (r14v31 stopRepeating) binds: [B:16:0x006d, B:13:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        String str;
        final stopRepeating stoprepeating;
        User user;
        String str2;
        String str3;
        String str4;
        JpnPeriodicActivity jpnPeriodicActivity = (JpnPeriodicActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        int i2 = connect + 45;
        int i3 = i2 % 128;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            jpnPeriodicActivity.MediaBrowserCompat();
            return null;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                jpnPeriodicActivity.IconCompatParcelizer();
                TuitionPaymentFragmentbindingInflater1(MapTypeAdapterFactory.Adapter.b(), MapTypeAdapterFactory.Adapter.b(), LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 2092519348, LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -2092519348, new Object[]{jpnPeriodicActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2)});
                int i5 = IconCompatParcelizer + 13;
                connect = i5 % 128;
                int i6 = i5 % 2;
            }
            return null;
        }
        int i7 = i3 + 103;
        connect = i7 % 128;
        int i8 = i7 % 2;
        jpnPeriodicActivity.d = ((BaseItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage();
        if (!(!jpnPeriodicActivity.INotificationSideChannel)) {
            jpnPeriodicActivity.IconCompatParcelizer();
            IntegerRes integerRes = (IntegerRes) jpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            User user2 = (User) jpnPeriodicActivity.INotificationSideChannelStub.getValue();
            if (user2 != null) {
                int i9 = IconCompatParcelizer + 77;
                connect = i9 % 128;
                int i10 = i9 % 2;
                str = user2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            } else {
                str = null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("#claimjp");
            integerRes.b(new KeyRequest(sb.toString()));
            return null;
        }
        int i11 = IconCompatParcelizer + 87;
        connect = i11 % 128;
        if (i11 % 2 != 0) {
            stoprepeating = (stopRepeating) jpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            user = (User) jpnPeriodicActivity.INotificationSideChannelStub.getValue();
            int i12 = 22 / 0;
            if (user != null) {
                str2 = user.b;
            } else {
                str2 = null;
            }
        } else {
            stoprepeating = (stopRepeating) jpnPeriodicActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            user = (User) jpnPeriodicActivity.INotificationSideChannelStub.getValue();
            if (user != null) {
                str2 = user.b;
            } else {
                str2 = null;
            }
        }
        String strValueOf = String.valueOf(str2);
        User user3 = (User) jpnPeriodicActivity.INotificationSideChannelStub.getValue();
        if (user3 != null) {
            int i13 = IconCompatParcelizer + 97;
            connect = i13 % 128;
            if (i13 % 2 != 0) {
                String str5 = user3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                throw null;
            }
            str3 = user3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } else {
            str3 = null;
        }
        String strValueOf2 = String.valueOf(str3);
        CheckEligibleJp checkEligibleJp = (CheckEligibleJp) jpnPeriodicActivity.INotificationSideChannelStubProxy.getValue();
        if (checkEligibleJp != null) {
            str4 = checkEligibleJp.TuitionPaymentFragmentbindingInflater1;
            int i14 = connect + 91;
            IconCompatParcelizer = i14 % 128;
            int i15 = i14 % 2;
        } else {
            str4 = null;
        }
        JpVerificationLivenessBegin jpVerificationLivenessBegin = new JpVerificationLivenessBegin(strValueOf, strValueOf2, str4);
        Intrinsics.checkNotNullParameter(jpVerificationLivenessBegin, "");
        MutableLiveData<VirtualCameraAdapter1<JpVerificationResponse>> mutableLiveData = stoprepeating.d;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(stoprepeating.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jpVerificationLivenessBegin)));
        final Function1 function1 = new Function1() { // from class: onConfigured
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return stopRepeating.TuitionPaymentFragmentspecialinlinedviewModeldefault2(stoprepeating, (JpVerificationResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: CameraDeviceId
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: onSurfacePrepared
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return stopRepeating.TuitionPaymentFragmentspecialinlinedviewModeldefault3(stoprepeating, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: Camera2RequestProcessorCamera2CallbackWrapper
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        stoprepeating.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final JpnPeriodicActivity jpnPeriodicActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = connect + 63;
        IconCompatParcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            obj.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                return;
            }
            jpnPeriodicActivity.IconCompatParcelizer();
            jpnPeriodicActivity.a = null;
            File fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2CameraCoordinatorExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            if (fileTuitionPaymentFragmentspecialinlinedviewModeldefault1.exists()) {
                FilesKt.deleteRecursively(fileTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            jpnPeriodicActivity.INotificationSideChannel = false;
            TuitionPaymentFragmentbindingInflater1(MapTypeAdapterFactory.Adapter.b(), MapTypeAdapterFactory.Adapter.b(), LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 2092519348, LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -2092519348, new Object[]{jpnPeriodicActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2)});
            return;
        }
        jpnPeriodicActivity.IconCompatParcelizer();
        VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
        List listSplit$default = StringsKt.split$default((CharSequence) ((JpVerificationResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isSuccessful(), new String[]{"#"}, false, 0, 6, (Object) null);
        if (Intrinsics.areEqual(StringsKt.split$default((CharSequence) ((JpVerificationResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isSuspend(), new String[]{"#"}, false, 0, 6, (Object) null).get(0), "false")) {
            int i3 = IconCompatParcelizer + 9;
            connect = i3 % 128;
            if (i3 % 2 == 0 ? Intrinsics.areEqual(listSplit$default.get(0), "true") : Intrinsics.areEqual(listSplit$default.get(0), "true")) {
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                String string = jpnPeriodicActivity.getString(R.string.title_jp_periodically_confirmation);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = jpnPeriodicActivity.getString(R.string.message_success_jp);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                String string3 = jpnPeriodicActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_success, string, string2, string3, new Function0() { // from class: CaptureSession
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return JpnPeriodicActivity.TuitionPaymentFragmentbindingInflater1(this.b);
                    }
                }, 96);
                jpnPeriodicActivity.asBinder = getstringornullB;
                if (getstringornullB != null) {
                    FragmentManager supportFragmentManager = jpnPeriodicActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                    if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
        String string4 = jpnPeriodicActivity.getString(R.string.message_sorry);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        String string5 = jpnPeriodicActivity.getString(R.string.message_integrity_data);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        String string6 = jpnPeriodicActivity.getString(R.string.action_back);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        getStringOrNull getstringornullB2 = getStringOrNull.Companion.b(R.drawable.ic_warning_blue, string4, string5, string6, null, 112);
        FragmentManager supportFragmentManager2 = jpnPeriodicActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager2, "");
        if (supportFragmentManager2.findFragmentByTag(getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i4 = IconCompatParcelizer + 49;
            connect = i4 % 128;
            int i5 = i4 % 2;
            getstringornullB2.show(supportFragmentManager2, getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        getstringornullB2.INotificationSideChannel = jpnPeriodicActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public static /* synthetic */ void b(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 125;
        connect = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = connect + 45;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault3(JpnPeriodicActivity jpnPeriodicActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (User) TuitionPaymentFragmentbindingInflater1(LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1860114047, LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1860114045, new Object[]{jpnPeriodicActivity});
    }

    public static /* synthetic */ void b(JpnPeriodicActivity jpnPeriodicActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentbindingInflater1(LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1592610888, LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1592610884, new Object[]{jpnPeriodicActivity, virtualCameraAdapter1});
    }

    static {
        getNotifyChildrenChangedOptions = 0;
        g();
        INSTANCE = new Companion(null);
        int i = getExtras + 35;
        getNotifyChildrenChangedOptions = i % 128;
        if (i % 2 != 0) {
            int i2 = 49 / 0;
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentbindingInflater1(MapTypeAdapterFactory.Adapter.b(), MapTypeAdapterFactory.Adapter.b(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 2092519348, LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -2092519348, new Object[]{this, p0});
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iB = MapTypeAdapterFactory.Adapter.b();
        return ((Integer) TuitionPaymentFragmentbindingInflater1(LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iB, -1235235226, MapTypeAdapterFactory.Adapter.b(), 1235235227, new Object[]{this})).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 25;
        connect = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 72 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 678598590;
        TuitionPaymentFragmentbindingInflater1(LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), MapTypeAdapterFactory.Adapter.b(), i, -1130255902, LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1130255905, new Object[]{this});
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 123;
        connect = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        TuitionPaymentFragmentbindingInflater1(LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 1859122974, LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1093663848, (-1273724868) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_internet_instruction_1).substring(0, 3).length(), 1093663853, new Object[]{this});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = connect + 113;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = IconCompatParcelizer + 121;
        connect = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void g() {
        MediaBrowserCompat = -6512632470980595503L;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        int i2 = connect + 115;
        int i3 = i2 % 128;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 59;
        connect = i5 % 128;
        if (i5 % 2 == 0) {
            return Integer.valueOf(R.layout.activity_jpn_periodic);
        }
        throw null;
    }
}
