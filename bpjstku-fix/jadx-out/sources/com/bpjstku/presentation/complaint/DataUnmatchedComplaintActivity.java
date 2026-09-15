package com.bpjstku.presentation.complaint;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.promo.model.response.ProvinceItem;
import com.bpjstku.data.report.model.request.DataCorrectionRequest;
import com.bpjstku.data.report.model.request.PreloadDataRequest;
import com.bpjstku.data.report.model.response.PreloadDataResponse;
import com.bpjstku.databinding.ActivityDataUnmatchedComplaintBinding;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.user.model.SubscribedProgram;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.complaint.DataUnmatchedComplaintActivity;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.gms.dynamite.zzk;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.mlkit.common.MlKitException;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.BufferProviderState;
import defpackage.CameraUseCaseAdapter;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.TargetAspectRatio;
import defpackage.TemplateParamsOverride;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.ZoomGestureDetectorZoomEvent;
import defpackage.accessconfigureInstanceInternal;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.containsZslUseCase;
import defpackage.createExtraImageCapture;
import defpackage.deriveCodec;
import defpackage.getCameraOperatingMode;
import defpackage.getCurrentIndex;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getRealtimeCaptureLatency;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.r8lambda_rcqWHl69wN3lvwkykRzEOONbC0;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setButtonPanelLayoutHint;
import defpackage.setInactive;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import defpackage.unregisterLifecycle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0014\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0016\u0010\u0017\u001a\u00020\u001e8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0017\u0010!\u001a\u0004\u0018\u00010 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0015\u0010\t\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u0018\u0010#\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001dR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00020$8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010&R\u0014\u0010\u0007\u001a\u00020'8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010("}, d2 = {"Lcom/bpjstku/presentation/complaint/DataUnmatchedComplaintActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityDataUnmatchedComplaintBinding;", "<init>", "()V", "", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)Z", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "LcontainsZslUseCase;", "cancelAll", "()LcontainsZslUseCase;", "LgetStringOrNull;", "LgetStringOrNull;", "Lcom/bpjstku/domain/user/model/SubscribedProgram;", "Lcom/bpjstku/domain/user/model/SubscribedProgram;", "Lcom/bpjstku/domain/user/model/User;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LgetCurrentIndex;", "g", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DataUnmatchedComplaintActivity extends BindingReactiveFormActivity<ActivityDataUnmatchedComplaintBinding> {
    private static int INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f477a;
    private static byte[] cancel;
    private static int d;
    private static int getInterfaceDescriptor;
    private static short[] onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private SubscribedProgram TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private getStringOrNull TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private getStringOrNull g;
    private static final byte[] $$c = {83, ByteCompanionObject.MIN_VALUE, -37, -48};
    private static final int $$f = 72;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {81, -102, -70, -91, 12, -2, -63, 57, 8, 0, -8, 5, -7, -55, 51, 13, -10, 14, -3, -6, -5, -54, 57, 6, 6, -69, 51, 20, -1, -12, -58, 51, 15, -7, -59, 69, -10, -2, 7, -5, 5, -64, 36, 19, 17, -7, -12, -2, 19, -11, 6, -1, -44, 45, 6, -7, -10, -17, 18, 13, 4, -13, -6, 2, 33, -12, 11, -11, 6, -1, -30, 17, 24, -12, -8, 9, 6, -46, 44, -17, 6, 6, -8, 9, 6, -1, -3, -11, -2, 6, -8, 11, -3, 5, -2, -3, 5, -9, -1, 18, -13, -4, 18, -42, 34, -11, 1, 7, -8, 1, 1, -5, 20, -9, 8, -67, -2, 15, -38, 39, -8, -30, 23, -37, 51, 0, -15, 8, 3, 4, -1};
    private static final int $$n = 198;
    private static final byte[] $$a = {49, -45, -112, 57, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 51;
    private static int INotificationSideChannelDefault = 0;
    private static int notify = 0;
    private static int cancelAll = 1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: AnimatedStateListDrawableCompatFrameInterpolator
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1};
            return (User) DataUnmatchedComplaintActivity.b(setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1826865619, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr, -1826865615, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy asInterface = LazyKt.lazy(new Function0() { // from class: getTotalDuration
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DataUnmatchedComplaintActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    public static /* synthetic */ Object b(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = i5 | i9;
        int i11 = ~i5;
        int i12 = i9 | (~(i11 | i3));
        int i13 = (~(i2 | i7 | i5)) | (~(i8 | i11 | i7));
        int i14 = i3 + i5 + i4 + ((-619979367) * i6) + (68302741 * i);
        int i15 = i14 * i14;
        int i16 = (i3 * 561304900) + 382271488 + (561304900 * i5) + ((-1585293958) * i10) + (792646979 * i12) + ((-792646979) * i13) + ((-231342080) * i4) + (1615200256 * i6) + ((-1821507584) * i) + (428933120 * i15);
        int i17 = ((i3 * (-96142684)) - 56799437) + (i5 * (-96142684)) + (i10 * 1642) + (i12 * (-821)) + (i13 * 821) + (i4 * (-96141863)) + (i6 * (-1380774991)) + (i * (-1175232947)) + (i15 * (-118947840));
        int i18 = i16 + (i17 * i17 * (-1369505792));
        if (i18 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i18 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i18 != 3) {
            return i18 != 4 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
        }
        return b(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.presentation.complaint.DataUnmatchedComplaintActivity.$$a
            int r9 = 144 - r9
            int r8 = 53 - r8
            int r7 = 103 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r9
            r4 = r2
            goto L27
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r9 = r9 + 1
            if (r4 != r8) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r9 = -r9
            int r7 = r7 + r9
            int r7 = r7 + (-11)
            r9 = r3
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.complaint.DataUnmatchedComplaintActivity.c(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 84
            int r7 = r7 + 4
            int r0 = r6 + 1
            byte[] r1 = com.bpjstku.presentation.complaint.DataUnmatchedComplaintActivity.$$m
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L11
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2a
        L11:
            r3 = r2
        L12:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.complaint.DataUnmatchedComplaintActivity.f(short, int, short, java.lang.Object[]):void");
    }

    public static final /* synthetic */ getStringOrNull TuitionPaymentFragmentspecialinlinedviewModeldefault2(DataUnmatchedComplaintActivity dataUnmatchedComplaintActivity) {
        int i = 2 % 2;
        int i2 = notify + 45;
        int i3 = i2 % 128;
        cancelAll = i3;
        int i4 = i2 % 2;
        getStringOrNull getstringornull = dataUnmatchedComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i5 = i3 + 79;
        notify = i5 % 128;
        int i6 = i5 % 2;
        return getstringornull;
    }

    public DataUnmatchedComplaintActivity() {
        final DataUnmatchedComplaintActivity dataUnmatchedComplaintActivity = this;
        this.b = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.complaint.DataUnmatchedComplaintActivity$special$$inlined$viewModel$default$1
            private static final byte[] $$c = {59, -124, -78, 46};
            private static final int $$d = 74;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {57, -56, 23, -36, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
            private static final int $$b = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -83722453;
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(int r6, short r7, int r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 4
                    int r6 = r6 + 84
                    int r8 = r8 * 2
                    int r8 = r8 + 4
                    byte[] r0 = com.bpjstku.presentation.complaint.DataUnmatchedComplaintActivity$special$$inlined$viewModel$default$1.$$a
                    int r7 = r7 * 2
                    int r1 = 53 - r7
                    byte[] r1 = new byte[r1]
                    int r7 = 52 - r7
                    r2 = 0
                    if (r0 != 0) goto L18
                    r3 = r8
                    r4 = r2
                    goto L2e
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r7) goto L28
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L28:
                    r3 = r0[r8]
                    r5 = r8
                    r8 = r6
                    r6 = r3
                    r3 = r5
                L2e:
                    int r8 = r8 + r6
                    int r6 = r8 + (-11)
                    int r8 = r3 + 1
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.complaint.DataUnmatchedComplaintActivity$special$$inlined$viewModel$default$1.c(int, short, int, java.lang.Object[]):void");
            }

            private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
                int i4 = 2 % 2;
                setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                char[] cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    int i5 = $10 + 9;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 3292 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 31 - KeyEvent.normalizeMetaState(0), 1199271174, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 650, TextUtils.lastIndexOf("", '0', 0, 0) + 45, -450685997, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
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
                if (i3 > 0) {
                    setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr2, 0, cArr3, 0, i2);
                    System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        int i8 = $10 + 25;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), MotionEvent.axisFromString("") + 652, KeyEvent.getDeadChar(0, 0) + 44, -450685997, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new String(cArr2);
            }

            /* JADX WARN: Type inference failed for: r0v39, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() throws Throwable {
                int i = 2;
                int i2 = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 46400), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 39, 19 - TextUtils.getCapsMode("", 0, 0), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                Object[] objArr = new Object[1];
                a(true, View.getDefaultSize(0, 0) + 172, 23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 16777220 + Color.rgb(0, 0, 0), new char[]{15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f'}, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                a(false, 175 - TextUtils.indexOf((CharSequence) "", '0'), 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 15 - Color.alpha(0), new char[]{65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534}, objArr2);
                long j = 367;
                long j2 = (j * 701290954552373754L) + (j * 1395966220189585233L);
                long j3 = -366;
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
                long j4 = -1;
                long j5 = j4 ^ 1395966220189585233L;
                long j6 = (int) Runtime.getRuntime().totalMemory();
                long j7 = j2 + (2017471800393990139L * j3) + (j3 * (((j5 | j6) ^ j4) | 701290954552373754L)) + (((long) 366) * ((((j4 ^ 701290954552373754L) | 1395966220189585233L) ^ j4) | (((j5 | 701290954552373754L) | j6) ^ j4)));
                int i4 = 0;
                while (true) {
                    if (i4 == 10) {
                        Object[] objArr3 = new Object[1];
                        a(true, TextUtils.indexOf("", "", 0, 0) + 171, 16 - Color.green(0), 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521}, objArr3);
                        Class<?> cls2 = Class.forName((String) objArr3[0]);
                        Object[] objArr4 = new Object[1];
                        a(true, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 175, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16, 2 - View.getDefaultSize(0, 0), new char[]{65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535}, objArr4);
                        int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                        try {
                            Object[] objArr5 = {1785014208};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 46039), ((Process.getThreadPriority(0) + 20) >> 6) + 1134, 18 - TextUtils.indexOf("", "", 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                            }
                            Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 2046311346, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), false};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 1031;
                                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 15;
                                byte b2 = $$a[7];
                                byte b3 = b2;
                                Object[] objArr7 = new Object[1];
                                c(b2, b3, b3, objArr7);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(doubleTapTimeout, iIndexOf, iMakeMeasureSpec, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Color.rgb(0, 0, 0) + 16823209), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1117, TextUtils.indexOf((CharSequence) "", '0', 0) + 18), Boolean.TYPE});
                            }
                            Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr6);
                            int i5 = ((int[]) objArr8[1])[0];
                            int i6 = ((int[]) objArr8[3])[0];
                            if (i6 == i5) {
                                break;
                            }
                            ArrayList arrayList = new ArrayList();
                            String[] strArr = (String[]) objArr8[0];
                            if (strArr != null) {
                                for (String str : strArr) {
                                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
                                    TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                                    int i8 = i7 % 2;
                                    arrayList.add(str);
                                }
                            }
                            throw new RuntimeException(String.valueOf(i6));
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                    int i9 = 8;
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (37836 - Color.alpha(0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 59, 18 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    int i10 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
                    int i11 = 0;
                    long j8 = jLongValue;
                    while (true) {
                        int i12 = 0;
                        while (i12 != i9) {
                            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
                            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                            int i14 = i13 % i;
                            i10 = (((((int) (j8 >> i12)) & 255) + (i10 << 6)) + (i10 << 16)) - i10;
                            i12++;
                            i = 2;
                            i9 = 8;
                        }
                        if (i11 != 0) {
                            break;
                        }
                        i11++;
                        j8 = j7;
                        i = 2;
                        i9 = 8;
                    }
                    if (i10 == i3) {
                        break;
                    }
                    jLongValue -= 1024;
                    i4++;
                    i = 2;
                }
                LifecycleOwner lifecycleOwner = dataUnmatchedComplaintActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class);
                if (lifecycleOwner == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
                }
                ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                ?? B = isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                int i15 = TuitionPaymentFragmentbindingInflater1 + 71;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                if (i15 % 2 == 0) {
                    int i16 = 25 / 0;
                }
                return B;
            }

            {
                super(0);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(int r7, short r8, int r9) {
                /*
                    int r7 = r7 * 4
                    int r7 = 1 - r7
                    byte[] r0 = com.bpjstku.presentation.complaint.DataUnmatchedComplaintActivity$special$$inlined$viewModel$default$1.$$c
                    int r8 = 120 - r8
                    int r9 = r9 * 2
                    int r9 = 4 - r9
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r8 = r7
                    r3 = r9
                    r4 = r2
                    goto L28
                L15:
                    r3 = r2
                L16:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r7) goto L23
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L23:
                    r3 = r0[r9]
                    r6 = r3
                    r3 = r9
                    r9 = r6
                L28:
                    int r8 = r8 + r9
                    int r9 = r3 + 1
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.complaint.DataUnmatchedComplaintActivity$special$$inlined$viewModel$default$1.$$e(int, short, int):java.lang.String");
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<containsZslUseCase>() { // from class: com.bpjstku.presentation.complaint.DataUnmatchedComplaintActivity$special$$inlined$viewModel$default$2
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {17, 104, 102, -28, 45, 28, 0, 17, 10, -33, 42, 28, -24, 50, -6, 24, 5, 0, 35, -34, 32, 35, 1, 17, 10, -27, 44, -17, 49, 5, 12, -4, 19, -13, 31, -18, 32, 35, 1, 17, 10, -35, 49, 0, 17, -6, 30, 7, 29, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
            private static final int $$e = 42;
            private static final byte[] $$a = {88, ByteCompanionObject.MAX_VALUE, -112, -47, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 106;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static long TuitionPaymentFragmentbindingInflater1 = 612625056037307348L;
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            private static void a(short s, int i, byte b2, Object[] objArr) {
                int i2 = 107 - (b2 * 52);
                int i3 = (i * 2) + 84;
                byte[] bArr = $$a;
                int i4 = s * 15;
                byte[] bArr2 = new byte[i4 + 38];
                int i5 = i4 + 37;
                int i6 = -1;
                if (bArr == null) {
                    i3 = (i5 + (-i2)) - 11;
                    i2 = i2;
                    i6 = -1;
                }
                while (true) {
                    int i7 = i6 + 1;
                    int i8 = i2 + 1;
                    bArr2[i7] = (byte) i3;
                    if (i7 == i5) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    } else {
                        i3 = (i3 + (-bArr[i8])) - 11;
                        i2 = i8;
                        i6 = i7;
                    }
                }
            }

            private static void c(byte b2, int i, byte b3, Object[] objArr) {
                int i2 = (b3 * 19) + 65;
                int i3 = b2 * 7;
                int i4 = 49 - (i * 45);
                byte[] bArr = $$d;
                byte[] bArr2 = new byte[i3 + 46];
                int i5 = i3 + 45;
                int i6 = -1;
                if (bArr == null) {
                    i2 = (i4 + i5) - 11;
                    i4++;
                }
                while (true) {
                    i6++;
                    bArr2[i6] = (byte) i2;
                    if (i6 == i5) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    int i7 = i2;
                    i2 = (i7 + bArr[i4]) - 11;
                    i4++;
                }
            }

            private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i3 = $10 + 123;
                    $11 = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19472), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2624, 13 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 39423), 481 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 37 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i6 = $10 + 91;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                        Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 39423), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 482, 37 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        int i7 = 88 / 0;
                    } else {
                        cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                        Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 39423), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 481, 38 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                }
                objArr[0] = new String(cArr2);
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, containsZslUseCase] */
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ containsZslUseCase invoke() throws Throwable {
                Object[] objArr;
                ZoomGestureDetectorZoomEvent koin;
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iMyPid = 2267 - (Process.myPid() >> 22);
                    int bitsPerPixel = 32 - ImageFormat.getBitsPerPixel(0);
                    byte[] bArr = $$a;
                    Object[] objArr2 = new Object[1];
                    a(bArr[5], bArr[7], bArr[40], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, iMyPid, bitsPerPixel, -887667012, false, (String) objArr2[0], null);
                }
                Object obj = null;
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                b(new char[]{10926, 22742, 52805, 32216, 58236, 5877, 33889, 2976, 47384, 11411, 21063, 49537, 30498, 64183, 26681, 40531, 3538, 45931, 9981, 21621, 56288, 18791}, TextUtils.indexOf("", "", 0, 0) + 29303, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                b(new char[]{10922, 17498, 63324, 26196, 37208, 'w', 45949, 8786, 23906, 52335, 32537, 60936, 6410, 34823, 15156}, 28409 - TextUtils.getTrimmedLength(""), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int iIndexOf = 2267 - TextUtils.indexOf("", "");
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 33;
                    byte[] bArr2 = $$a;
                    byte b2 = bArr2[5];
                    Object[] objArr5 = new Object[1];
                    a(b2, bArr2[7], b2, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iIndexOf, jumpTapTimeout, -874156483, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 1);
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 2268;
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 33;
                        byte b3 = $$a[7];
                        byte b4 = b3;
                        Object[] objArr6 = new Object[1];
                        a(b3, b4, b4, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(gidForName, modifierMetaStateMask, fadingEdgeLength, -654680577, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                    int i4 = ((int[]) objArr7[0])[0];
                    int i5 = ((int[]) objArr7[3])[0];
                    String[] strArr = (String[]) objArr7[1];
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i6 = ~iIdentityHashCode;
                    int i7 = 1017819187 + ((~(373491618 | i6)) * (-560)) + ((~(iIdentityHashCode | (-162590786))) * (-560)) + (((~(435221697 | i6)) | 100860706) * 560) + 131867649;
                    int i8 = (i7 << 13) ^ i7;
                    int i9 = i8 ^ (i8 >>> 17);
                    ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    b(new char[]{10926, 60966, 41893, 26408, 14524, 64517, 45441, 30032, 3734, 49664, 34809, 23340, 7386, 53367, 38361, 43343, 25289, 9809, 64453, 48307, 28695, 13748, 51495, 33419, 17926, 7044}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 50311, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    b(new char[]{10924, 18497, 61259, 588, 41286, 50246, 31577, 40531, 15719, 20588, 63341, 27247, 35176, 11281, 17153, 58899, 1296, 47114}, 25339 - (Process.myPid() >> 22), objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        applicationContext = (((applicationContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) applicationContext).getBaseContext() != null) ? applicationContext.getApplicationContext() : null;
                    }
                    Object[] objArr10 = new Object[1];
                    b(new char[]{10917, 6061, 20671, 40359, 57069, 7084, 17596, 33204, 49840, 4090, 18562, 46487, 63128, 13212, 31872, 47503}, 15619 - ExpandableListView.getPackedPositionGroup(0L), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b(new char[]{10918, 39444, 19412, 14492, 59463, 22813, 3777, 65423, 44927, 7193, 52682, 45714, 25208, 54035, 32985, 29083}, KeyEvent.keyCodeFromString("") + 45247, objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                    int i11 = i10 % 2;
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 131867649};
                        byte[] bArr3 = $$d;
                        byte b5 = bArr3[6];
                        Object[] objArr13 = new Object[1];
                        c(b5, bArr3[22], b5, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b6 = bArr3[22];
                        Object[] objArr14 = new Object[1];
                        c(b6, bArr3[6], b6, objArr14);
                        objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        if (applicationContext != null) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                int capsMode = TextUtils.getCapsMode("", 0, 0) + 2267;
                                int iGreen = 33 - Color.green(0);
                                byte b7 = $$a[7];
                                byte b8 = b7;
                                Object[] objArr15 = new Object[1];
                                a(b7, b8, b8, objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatTimeout, capsMode, iGreen, -654680577, false, (String) objArr15[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                            try {
                                Object[] objArr16 = new Object[1];
                                b(new char[]{10926, 22742, 52805, 32216, 58236, 5877, 33889, 2976, 47384, 11411, 21063, 49537, 30498, 64183, 26681, 40531, 3538, 45931, 9981, 21621, 56288, 18791}, Color.argb(0, 0, 0, 0) + 29303, objArr16);
                                Class<?> cls5 = Class.forName((String) objArr16[0]);
                                Object[] objArr17 = new Object[1];
                                b(new char[]{10922, 17498, 63324, 26196, 37208, 'w', 45949, 8786, 23906, 52335, 32537, 60936, 6410, 34823, 15156}, View.getDefaultSize(0, 0) + 28409, objArr17);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2267;
                                    int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 33;
                                    byte[] bArr4 = $$a;
                                    byte b9 = bArr4[5];
                                    Object[] objArr18 = new Object[1];
                                    a(b9, bArr4[7], b9, objArr18);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionType, maximumFlingVelocity, jumpTapTimeout2, -874156483, false, (String) objArr18[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char cGreen = (char) Color.green(0);
                                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 2267;
                                    int i12 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 32;
                                    byte[] bArr5 = $$a;
                                    Object[] objArr19 = new Object[1];
                                    a(bArr5[5], bArr5[7], bArr5[40], objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cGreen, iResolveSizeAndState, i12, -887667012, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i13 = ((int[]) objArr[3])[0];
                int i14 = ((int[]) objArr[0])[0];
                if (i14 == i13) {
                    int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                    int i16 = i15 % 2;
                    Object[] objArr20 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                    int i17 = ((int[]) objArr[2])[0];
                    int i18 = ((int[]) objArr[0])[0];
                    int i19 = ((int[]) objArr[3])[0];
                    String[] strArr2 = (String[]) objArr[1];
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i20 = ~elapsedCpuTime;
                    int i21 = i17 + 1993297838 + (((~((-377184877) | i20)) | 431528439) * 519) + (((~(i20 | (-105079305))) | (~(536607743 | elapsedCpuTime))) * (-519)) + (((~(elapsedCpuTime | 431528439)) | 377184876) * 519);
                    int i22 = i21 ^ (i21 << 13);
                    int i23 = i22 ^ (i22 >>> 17);
                    ((int[]) objArr20[2])[0] = i23 ^ (i23 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr3 = (String[]) objArr[1];
                    if (strArr3 != null) {
                        for (String str : strArr3) {
                            arrayList.add(str);
                        }
                    }
                    Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
                    Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                    int i24 = ((int[]) objArr[2])[0];
                    int i25 = ((int[]) objArr[0])[0];
                    int i26 = ((int[]) objArr[3])[0];
                    String[] strArr4 = (String[]) objArr[1];
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i27 = i24 + 1712758157 + (((~(459255870 | iIdentityHashCode2)) | 75516929) * (-140)) + ((~(534772799 | iIdentityHashCode2)) * 70) + (((~(iIdentityHashCode2 | 349457445)) | 260832283) * 70);
                    int i28 = (i27 << 13) ^ i27;
                    int i29 = i28 ^ (i28 >>> 17);
                    ((int[]) objArr21[2])[0] = i29 ^ (i29 << 5);
                }
                LifecycleOwner lifecycleOwner = dataUnmatchedComplaintActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(containsZslUseCase.class);
                if (lifecycleOwner == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
                }
                ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                if (componentCallbacks instanceof getEventTime) {
                    int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i30 % 128;
                    if (i30 % 2 == 0) {
                        ((getEventTime) componentCallbacks).getKoin();
                        obj.hashCode();
                        throw null;
                    }
                    koin = ((getEventTime) componentCallbacks).getKoin();
                } else {
                    koin = ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b;
                }
                return isQuickZoomEnabled.b(koin, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
            }

            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.complaint.DataUnmatchedComplaintActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/complaint/DataUnmatchedComplaintActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, DataUnmatchedComplaintActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements getStringOrNull.b {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            DataUnmatchedComplaintActivity.this.d_();
        }
    }

    public static final class b implements getStringOrNull.b {
        b() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            getStringOrNull getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = DataUnmatchedComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(DataUnmatchedComplaintActivity.this);
            if (getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.dismiss();
            }
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements getStringOrNull.b {
        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            getStringOrNull getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = DataUnmatchedComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(DataUnmatchedComplaintActivity.this);
            if (getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.dismiss();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x023b  */
    /* JADX WARN: Code duplicated, block: B:57:0x025f  */
    private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(f477a)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 2266 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 33 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1387473586, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 == 0) {
                j = 3046761265686732006L;
            } else {
                byte[] bArr = cancel;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                            int iAlpha = 3358 - Color.alpha(0);
                            int iRed = 18 - Color.red(0);
                            byte length2 = (byte) $$c.length;
                            byte b5 = (byte) (length2 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode, iAlpha, iRed, -1054011043, false, $$i(length2, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr2[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = cancel;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(d)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), Color.rgb(0, 0, 0) + 16779483, 32 - ExpandableListView.getPackedPositionChild(0L), 1387473586, false, $$i(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) f477a) ^ 3046761265686732006L)));
                    j = 3046761265686732006L;
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) onTransact[i3 + ((int) (((long) d) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) f477a) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) d) ^ j)) + i5;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(INotificationSideChannel), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 1;
                    byte b9 = (byte) (b8 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "") + 55904), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2855, 13 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1529949196, false, $$i(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = cancel;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i7 = 0; i7 < length3; i7++) {
                        int i8 = $11 + 47;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                        bArr5[i7] = (byte) (((long) bArr4[i7]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i10 = $10 + 119;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 6 / 0;
                        if (z) {
                            byte[] bArr6 = cancel;
                            int i12 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i12 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i12]) ^ 3046761265686732006L)) + s)) ^ b2));
                        } else {
                            short[] sArr = onTransact;
                            int i13 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i13 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i13]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                    } else if (z) {
                        byte[] bArr7 = cancel;
                        int i14 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i14 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i14]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr2 = onTransact;
                        int i15 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i15 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr2[i15]) ^ 3046761265686732006L)) + s)) ^ b2));
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

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements getStringOrNull.b {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            DataUnmatchedComplaintActivity.this.d_();
        }
    }

    private final containsZslUseCase cancelAll() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = cancelAll + 119;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cArgb = (char) (31533 - Color.argb(0, 0, 0, 0));
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 921;
            int size = View.MeasureSpec.getSize(0) + 28;
            Object[] objArr3 = new Object[1];
            c((byte) ($$a[19] - 1), (byte) ($$b + 1), (short) 141, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, iResolveSizeAndState, size, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 875846925, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_bank_transfer).substring(1, 3).length() - 43, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.installment_required).substring(16, 18).codePointAt(1) - 109), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 46), AndroidCharacter.getMirror('0') + 64866, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 875846904, (-42) - ImageFormat.getBitsPerPixel(0), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_confirm_button).substring(1, 3).length() - 2), (byte) Color.red(0), Process.getGidForName("") + 624098729, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 31533);
            int iRgb = Color.rgb(0, 0, 0) + 16778137;
            int i4 = 29 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            byte[] bArr = $$a;
            byte b2 = bArr[10];
            byte b3 = bArr[7];
            Object[] objArr6 = new Object[1];
            c(b2, b3, (short) (b3 | 141), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(trimmedLength, iRgb, i4, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31532);
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 921;
                int deadChar = 28 - KeyEvent.getDeadChar(0, 0);
                byte b4 = $$a[10];
                Object[] objArr7 = new Object[1];
                c(b4, (byte) (b4 - 4), (short) 89, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, maximumDrawingCacheSize, deadChar, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int i5 = ~((~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen) | 1010107847);
            int i6 = (((271844611 | i5) * (-374)) - 867794267) + ((i5 | 738263236) * 374) + 1514201510;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr9 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 875846838, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 77, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_web_instruction_1).substring(1, 3).length() + 624098741, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                e(875846938 - TextUtils.indexOf("", ""), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_permission_screen_title_text).substring(0, 20).length() - 61, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_billingcity_empty).substring(15, 16).length() - 1), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_message_status_code_400).substring(21, 22).length() + 624098768, objArr10);
                baseContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i9 = cancelAll + 63;
                notify = i9 % 128;
                int i10 = i9 % 2;
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.fuel_price).substring(0, 8).length() + 875846937, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_status_title).substring(15, 18).length() - 44, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_instruction_step1).substring(28, 30).length() - 2), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_indomaret).substring(1, 3).codePointAt(0) - 97), 624098787 - Color.red(0), objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 875846908, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima4_permata).substring(19, 20).length() - 42, (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (byte) View.MeasureSpec.getSize(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 624098767, objArr12);
            try {
                Object[] objArr13 = {baseContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, 1514201510};
                byte[] bArr2 = $$m;
                Object[] objArr14 = new Object[1];
                f((byte) 60, bArr2[28], bArr2[32], objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                Object[] objArr15 = new Object[1];
                f((byte) (bArr2[14] + 1), (byte) (-bArr2[34]), bArr2[9], objArr15);
                objArr = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 31533);
                    int i11 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 921;
                    int i12 = 29 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    byte b5 = $$a[10];
                    Object[] objArr16 = new Object[1];
                    c(b5, (byte) (b5 - 4), (short) 89, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode, i11, i12, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr17 = new Object[1];
                    e(875846936 - ExpandableListView.getPackedPositionType(0L), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.show_instruction).substring(1, 2).codePointAt(0) - 146, (short) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.confirm_gopay_qr_scan_tablet).substring(12, 17).length() - 5), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 624098670, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_kioson).substring(1, 3).length() + 875846938, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 77, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_with_atm_bersama).substring(1, 3).length() - 2), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_email).substring(0, 5).length() + 624098723, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cResolveSize = (char) (31533 - View.resolveSize(0, 0));
                        int offsetBefore = 921 - TextUtils.getOffsetBefore("", 0);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28;
                        byte[] bArr3 = $$a;
                        byte b6 = bArr3[10];
                        byte b7 = bArr3[7];
                        Object[] objArr19 = new Object[1];
                        c(b6, b7, (short) (b7 | 141), objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSize, offsetBefore, keyRepeatTimeout, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) (31533 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 921;
                        int i13 = 29 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        Object[] objArr20 = new Object[1];
                        c((byte) ($$a[19] - 1), (byte) ($$b + 1), (short) 141, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, scrollDefaultDelay, i13, -1048449946, false, (String) objArr20[0], null);
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 == i14) {
            int i16 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i17 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
            int i18 = i16 + (-1210804278) + (((~((-512565232) | i17)) | (-1261514413)) * (-933)) + (((~(i17 | (-1261514413))) | 1093672960) * 933) + 323353168;
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr21[0])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
            int i21 = ((int[]) objArr[0])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i22 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i23 = (-403930261) + (((~((-180462758) | i22)) | 180396196 | (~((-1593616887) | i22))) * (-880));
            int i24 = (~((-180462758) | (~i22))) | 1593616886;
            int i25 = ~(i22 | 180462757);
            int i26 = i21 + i23 + ((i24 | i25) * (-880)) + (i25 * 880);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr22[0])[0] = i28 ^ (i28 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int offsetBefore2 = 876 - TextUtils.getOffsetBefore("", 0);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 10;
            Object[] objArr23 = new Object[1];
            c((byte) ($$a[19] - 1), (byte) ($$b + 1), (short) 141, objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(minimumFlingVelocity, offsetBefore2, longPressTimeout, 252381699, false, (String) objArr23[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr24 = new Object[1];
        e((Process.myTid() >> 22) + 875846936, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 77, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 112), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 112), (ViewConfiguration.getFadingEdgeLength() >> 16) + 624098706, objArr24);
        Class<?> cls6 = Class.forName((String) objArr24[0]);
        Object[] objArr25 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 875846904, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 157, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 115), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step0).substring(40, 43).length() - 3), 624098728 - Color.green(0), objArr25);
        long jLongValue3 = ((Long) cls6.getDeclaredMethod((String) objArr25[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 877;
            int iBlue = Color.blue(0) + 10;
            byte[] bArr4 = $$a;
            byte b8 = bArr4[10];
            byte b9 = bArr4[7];
            Object[] objArr26 = new Object[1];
            c(b8, b9, (short) (b9 | 52), objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(edgeSlop, bitsPerPixel, iBlue, 2009631821, false, (String) objArr26[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i29 = cancelAll + 67;
            notify = i29 % 128;
            int i30 = i29 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int modifierMetaStateMask = 875 - ((byte) KeyEvent.getModifierMetaStateMask());
                int iMyTid = (Process.myTid() >> 22) + 10;
                byte b10 = $$a[7];
                byte b11 = b10;
                Object[] objArr27 = new Object[1];
                c(b11, (byte) (b11 | 52), b10, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c3, modifierMetaStateMask, iMyTid, 256017550, false, (String) objArr27[0], null);
            }
            Object[] objArr28 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr28[0])[0]}, new int[1], new int[]{((int[]) objArr28[2])[0]}, (String[]) objArr28[3]};
            int i31 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
            int i32 = (-1032648998) + (((~(i31 | (-462881274))) | (-503191503)) * (-465)) + (((-462881274) | (~((-503191503) | i31))) * 930) + ((i31 | (-429261257)) * 465) + 565408248;
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr2[1])[0] = i34 ^ (i34 << 5);
            int i35 = notify + 85;
            cancelAll = i35 % 128;
            int i36 = i35 % 2;
        } else {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                Object[] objArr29 = new Object[1];
                e(875846936 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_instruction_text).substring(0, 32).codePointAt(16) - 142, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_blink_smile_and_your_eyes).substring(0, 25).length() + 624098718, objArr29);
                Class<?> cls7 = Class.forName((String) objArr29[0]);
                Object[] objArr30 = new Object[1];
                e((ViewConfiguration.getJumpTapTimeout() >> 16) + 875846938, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step3).substring(97, 99).codePointAt(1) - 73, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 624098671, objArr30);
                baseContext2 = (Context) cls7.getMethod((String) objArr30[0], new Class[0]).invoke(null, null);
            }
            if (baseContext2 != null) {
                baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
            }
            Object[] objArr31 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_7).substring(0, 2).length() + 875846943, (ViewConfiguration.getPressedStateDuration() >> 16) - 41, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_2).substring(24, 25).length() - 1), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step4).substring(60, 62).codePointAt(1) - 110), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_card_atm_bersama).substring(52, 57).length() + 624098782, objArr31);
            Class<?> cls8 = Class.forName((String) objArr31[0]);
            Object[] objArr32 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 875846908, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 52, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step3).substring(1, 3).length() - 2), (byte) TextUtils.getOffsetAfter("", 0), 624098803 - Color.blue(0), objArr32);
            Object[] objArr33 = {baseContext2, Integer.valueOf(((Integer) cls8.getMethod((String) objArr32[0], Object.class).invoke(null, this)).intValue()), 565408248};
            byte[] bArr5 = $$m;
            byte b12 = bArr5[32];
            Object[] objArr34 = new Object[1];
            f(b12, (byte) (b12 | 96), bArr5[43], objArr34);
            Class<?> cls9 = Class.forName((String) objArr34[0]);
            byte b13 = bArr5[9];
            Object[] objArr35 = new Object[1];
            f(b13, (byte) (b13 | 126), bArr5[17], objArr35);
            objArr2 = (Object[]) cls9.getMethod((String) objArr35[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr33);
            if (baseContext2 != null) {
                int i37 = cancelAll + 27;
                notify = i37 % 128;
                int i38 = i37 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char maximumDrawingCacheSize2 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int i39 = 877 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int iRed = Color.red(0) + 10;
                    byte b14 = $$a[7];
                    byte b15 = b14;
                    Object[] objArr36 = new Object[1];
                    c(b15, (byte) (b15 | 52), b14, objArr36);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(maximumDrawingCacheSize2, i39, iRed, 256017550, false, (String) objArr36[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, objArr2);
                try {
                    Object[] objArr37 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 875846821, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 152, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlTrustedGoBackButtonTitle).substring(0, 7).length() + 624098699, objArr37);
                    Class<?> cls10 = Class.forName((String) objArr37[0]);
                    Object[] objArr38 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto5_bni).substring(12, 13).length() + 875846939, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_consent_screen_cta_text_continue_next_step).substring(2, 3).codePointAt(0) - 151, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_bersama7).substring(105, 113).length() - 8), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_cvv).substring(18, 28).codePointAt(1) - 54), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_permission_screen_description_text).substring(0, 43).length() + 624098685, objArr38);
                    long jLongValue4 = ((Long) cls10.getDeclaredMethod((String) objArr38[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue4);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int jumpTapTimeout = 876 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int iArgb = 10 - Color.argb(0, 0, 0, 0);
                        byte[] bArr6 = $$a;
                        byte b16 = bArr6[10];
                        byte b17 = bArr6[7];
                        Object[] objArr39 = new Object[1];
                        c(b16, b17, (short) (b17 | 52), objArr39);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(keyRepeatTimeout2, jumpTapTimeout, iArgb, 2009631821, false, (String) objArr39[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                        char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                        int offsetAfter = 876 - TextUtils.getOffsetAfter("", 0);
                        int i40 = 10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        Object[] objArr40 = new Object[1];
                        c((byte) ($$a[19] - 1), (byte) ($$b + 1), (short) 141, objArr40);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(bitsPerPixel2, offsetAfter, i40, 252381699, false, (String) objArr40[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            }
        }
        int i41 = ((int[]) objArr2[2])[0];
        int i42 = ((int[]) objArr2[0])[0];
        if (i42 == i41) {
            int i43 = ((int[]) objArr2[1])[0];
            Object[] objArr41 = {new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
            int i44 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            int i45 = (-1103594932) + (((~((~i44) | 551919945)) | (-602781536)) * (-245));
            int i46 = ~(i44 | 551919945);
            int i47 = i43 + i45 + (i46 * (-245)) + ((i46 | 592230174) * 245);
            int i48 = (i47 << 13) ^ i47;
            int i49 = i48 ^ (i48 >>> 17);
            ((int[]) objArr41[1])[0] = i49 ^ (i49 << 5);
        } else {
            Toast.makeText((Context) null, i42 / (((i42 - 1) * i42) % 2), 0).show();
            int i50 = ((int[]) objArr2[1])[0];
            Object[] objArr42 = {new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
            int i51 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1950770633;
            int i52 = ~i51;
            int i53 = i50 + 767486964 + (((~((-886585101) | i52)) | (~(846274871 | i51))) * 217) + (((~(i51 | (-886585101))) | 76027400) * 217) + (((~(846274871 | i52)) | 886585100) * 217);
            int i54 = (i53 << 13) ^ i53;
            int i55 = i54 ^ (i54 >>> 17);
            ((int[]) objArr42[1])[0] = i55 ^ (i55 << 5);
        }
        return (containsZslUseCase) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityDataUnmatchedComplaintBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = cancelAll + 95;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            DataUnmatchedComplaintActivity$bindingInflater$1 dataUnmatchedComplaintActivity$bindingInflater$1 = DataUnmatchedComplaintActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DataUnmatchedComplaintActivity$bindingInflater$1 dataUnmatchedComplaintActivity$bindingInflater$2 = DataUnmatchedComplaintActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i3 = cancelAll + 89;
        notify = i3 % 128;
        int i4 = i3 % 2;
        return dataUnmatchedComplaintActivity$bindingInflater$2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        DataUnmatchedComplaintActivity dataUnmatchedComplaintActivity = this;
        Intrinsics.checkNotNullParameter(dataUnmatchedComplaintActivity, "");
        dataUnmatchedComplaintActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(INotificationSideChannelStub().layoutToolbar.toolbar, true);
        INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_complaint_unmatched_data));
        ActivityDataUnmatchedComplaintBinding activityDataUnmatchedComplaintBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputEditText textInputEditText = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtActualWage;
        TextInputEditText textInputEditText2 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtActualWage;
        Intrinsics.checkNotNullExpressionValue(textInputEditText2, "");
        textInputEditText.addTextChangedListener(new TemplateParamsOverride(textInputEditText2, "", new Locale("id", "ID")));
        TextInputEditText textInputEditText3 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtReportedWage;
        TextInputEditText textInputEditText4 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtReportedWage;
        Intrinsics.checkNotNullExpressionValue(textInputEditText4, "");
        textInputEditText3.addTextChangedListener(new TemplateParamsOverride(textInputEditText4, "", new Locale("id", "ID")));
        TextInputEditText textInputEditText5 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtActualTotalEmployee;
        TextInputEditText textInputEditText6 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtActualTotalEmployee;
        Intrinsics.checkNotNullExpressionValue(textInputEditText6, "");
        textInputEditText5.addTextChangedListener(new TemplateParamsOverride(textInputEditText6, "", new Locale("id", "ID")));
        int i2 = cancelAll + 73;
        notify = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = notify + 49;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        final ActivityDataUnmatchedComplaintBinding activityDataUnmatchedComplaintBindingINotificationSideChannelStub = INotificationSideChannelStub();
        EditText editText = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.tilChooseJamsostekIdNumber.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: getInterpolation
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DataUnmatchedComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
                }
            });
            int i4 = notify + 3;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
        }
        MaterialButton materialButton = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.btnSendComplaintDataUnMatched;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: AnimatedStateListDrawableCompatTransition
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DataUnmatchedComplaintActivity.b(this.b, activityDataUnmatchedComplaintBindingINotificationSideChannelStub, (View) obj);
            }
        }));
        activityDataUnmatchedComplaintBindingINotificationSideChannelStub.rgWagesStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: updateFrames
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i6) {
                Object[] objArr = {activityDataUnmatchedComplaintBindingINotificationSideChannelStub, radioGroup, Integer.valueOf(i6)};
                DataUnmatchedComplaintActivity.b(setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1902770049, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr, -1902770048, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        });
        activityDataUnmatchedComplaintBindingINotificationSideChannelStub.rgTotalEmployeeStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: resolveDensity
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i6) {
                DataUnmatchedComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(activityDataUnmatchedComplaintBindingINotificationSideChannelStub, radioGroup, i6);
            }
        });
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = cancelAll + 95;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        a();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = notify + 109;
        cancelAll = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        DataUnmatchedComplaintActivity dataUnmatchedComplaintActivity = this;
        cancelAll().TuitionPaymentFragmentbindingInflater1.observe(dataUnmatchedComplaintActivity, new Observer() { // from class: transitionHasReversibleFlag
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                DataUnmatchedComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        cancelAll().TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(dataUnmatchedComplaintActivity, new Observer() { // from class: canReverse
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                DataUnmatchedComplaintActivity.b(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = cancelAll + 125;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = cancelAll + 125;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            MaterialButton materialButton = INotificationSideChannelStub().btnSendComplaintDataUnMatched;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(true);
        } else {
            MaterialButton materialButton3 = INotificationSideChannelStub().btnSendComplaintDataUnMatched;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(true);
        }
        int i3 = notify + 109;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int i = 2 % 2;
        ActivityDataUnmatchedComplaintBinding activityDataUnmatchedComplaintBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputEditText textInputEditText = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtChooseJamsostekIdNumber;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        String string = getString(R.string.error_choose_kpj_number);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputEditText, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        TextInputLayout textInputLayout = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.tilActualWage;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string2 = getString(R.string.error_empty_actual_wage);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string2), new r8lambda_rcqWHl69wN3lvwkykRzEOONbC0(new Function0() { // from class: needsMirroring
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(DataUnmatchedComplaintActivity.TuitionPaymentFragmentbindingInflater1(this.b));
            }
        }, "Upah tidak boleh kurang dari Rp 100.000")})));
        TextInputLayout textInputLayout2 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.tilReportedWage;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string3 = getString(R.string.error_empty_reported_wage);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string3))));
        TextInputLayout textInputLayout3 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.tilActualTotalEmployee;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string4 = getString(R.string.error_empty_actual_total_employee);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string4), new r8lambda_rcqWHl69wN3lvwkykRzEOONbC0(new Function0() { // from class: AnimatedStateListDrawableCompatAnimationDrawableTransition
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(DataUnmatchedComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1));
            }
        }, "Data Jumlah Tenaga Kerja tidak boleh 0")})));
        TextInputLayout textInputLayout4 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.tilReportedTotalEmployee;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        String string5 = getString(R.string.error_empty_reported_total_employee);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout4, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string5))));
        int i2 = cancelAll + 3;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = cancelAll + 107;
        notify = i2 % 128;
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
                int i3 = cancelAll + 29;
                notify = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 4 / 5;
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

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        DataUnmatchedComplaintActivity dataUnmatchedComplaintActivity = (DataUnmatchedComplaintActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = notify + 59;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            dataUnmatchedComplaintActivity.INotificationSideChannelStub();
            Intrinsics.areEqual(str, "e");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        ActivityDataUnmatchedComplaintBinding activityDataUnmatchedComplaintBindingINotificationSideChannelStub = dataUnmatchedComplaintActivity.INotificationSideChannelStub();
        if (Intrinsics.areEqual(str, "e")) {
            int i3 = notify + 65;
            cancelAll = i3 % 128;
            int i4 = i3 % 2;
            if (activityDataUnmatchedComplaintBindingINotificationSideChannelStub.rgTotalEmployeeStatus.getCheckedRadioButtonId() != activityDataUnmatchedComplaintBindingINotificationSideChannelStub.rbCorrectTotalEmployee.getId()) {
                TextInputLayout textInputLayout = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.tilActualTotalEmployee;
                Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
                return Integer.parseInt(String.valueOf(Long.parseLong(StringsKt.trim((CharSequence) StringsKt.replace$default(StringsKt.trim((CharSequence) retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputLayout)).toString(), ".", "", false, 4, (Object) null)).toString()))) > 0;
            }
            int i5 = cancelAll + 119;
            notify = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (activityDataUnmatchedComplaintBindingINotificationSideChannelStub.rgWagesStatus.getCheckedRadioButtonId() == activityDataUnmatchedComplaintBindingINotificationSideChannelStub.rbCorrectWages.getId()) {
            int i7 = notify + 113;
            cancelAll = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        TextInputLayout textInputLayout2 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.tilActualWage;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        if (Integer.parseInt(String.valueOf(Long.parseLong(StringsKt.trim((CharSequence) StringsKt.replace$default(StringsKt.trim((CharSequence) retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputLayout2)).toString(), ".", "", false, 4, (Object) null)).toString()))) >= 100000) {
            return true;
        }
        int i9 = cancelAll + 39;
        notify = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
            int iLastIndexOf = 1030 - TextUtils.lastIndexOf("", '0', 0);
            int iIndexOf = 15 - TextUtils.indexOf("", "", 0, 0);
            byte[] bArr = $$a;
            byte b2 = bArr[10];
            byte b3 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, iLastIndexOf, iIndexOf, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e((ViewConfiguration.getScrollDefaultDelay() >> 16) + 875846936, TextUtils.getOffsetAfter("", 0) - 41, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 106), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), 624098706 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 875846904, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 139, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_5).substring(3, 4).codePointAt(0) - 117), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.expand_link_alto).substring(1, 2).codePointAt(0) - 105), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step2).substring(32, 33).length() + 624098727, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
            int i2 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1031;
            int size = 15 - View.MeasureSpec.getSize(0);
            byte[] bArr2 = $$a;
            byte b4 = bArr2[10];
            byte b5 = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(b4, b5, (short) (b5 | 141), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild, i2, size, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int i3 = 1031 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iMyTid = (Process.myTid() >> 22) + 15;
                Object[] objArr6 = new Object[1];
                c((byte) ($$a[19] - 1), (byte) ($$b + 1), (short) 141, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i3, iMyTid, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[3])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
            int i7 = ~i6;
            int i8 = (-2140082559) + (((~(467490534 | i7)) | 539000848) * 168) + ((~((-539000849) | i6)) * 168) + (((~(i6 | 1006491382)) | (~(i7 | (-711770705))) | 172769856) * 168) + 1175359102;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 875846909, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 77, (short) KeyEvent.normalizeMetaState(0), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), View.MeasureSpec.makeMeasureSpec(0, 0) + 624098787, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 875846833, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_day_of_week_column_header).substring(0, 4).codePointAt(2) - 77, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.card_detail_title).substring(8, 9).length() - 1), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), 624098803 - View.MeasureSpec.getSize(0), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1590108996};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1134, ((byte) KeyEvent.getModifierMetaStateMask()) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1175359102, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1031;
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 15;
                    byte[] bArr3 = $$a;
                    byte b6 = bArr3[10];
                    byte b7 = bArr3[7];
                    Object[] objArr12 = new Object[1];
                    c(b6, b7, b7, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumDrawingCacheSize, scrollBarFadeDuration, maxKeyCode, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.getOffsetAfter("", 0) + 45993), 1117 - TextUtils.indexOf("", ""), ((Process.getThreadPriority(0) + 20) >> 6) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int iRgb = Color.rgb(0, 0, 0) + 16778247;
                    int i11 = 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    Object[] objArr13 = new Object[1];
                    c((byte) ($$a[19] - 1), (byte) ($$b + 1), (short) 141, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iRgb, i11, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_bersama4_bni).substring(14, 15).codePointAt(0) + 875846829, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 41, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tesla_ev_connector_type).substring(1, 5).length() - 4), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 624098670, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 875846904, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 52, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_permata_alto).substring(0, 12).codePointAt(2) - 114), (byte) ExpandableListView.getPackedPositionGroup(0L), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_user_canceled_liveness).substring(3, 4).length() + 624098727, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                        int i12 = 1032 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int i13 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                        byte[] bArr4 = $$a;
                        byte b8 = bArr4[10];
                        byte b9 = bArr4[7];
                        Object[] objArr16 = new Object[1];
                        c(b8, b9, (short) (b9 | 141), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, i12, i13, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                        int i14 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1031;
                        int iAxisFromString = MotionEvent.axisFromString("") + 16;
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[10];
                        byte b11 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        c(b10, b11, b11, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cMakeMeasureSpec, i14, iAxisFromString, 1357589585, false, (String) objArr17[0], null);
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 == null) {
                throw null;
            }
            for (String str : strArr2) {
                arrayList.add(str);
            }
            throw null;
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i15 = ((int[]) objArr[2])[0];
        int i16 = ((int[]) objArr[3])[0];
        int i17 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i18 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        int i19 = i15 + 644797189 + (((~(201288423 | i18)) | 42991746) * (-828)) + ((i18 | 201288423) * (-828)) + 836909472;
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr18[2])[0] = i21 ^ (i21 << 5);
        int i22 = cancelAll + 65;
        notify = i22 % 128;
        int i23 = i22 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0') + 29945);
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1755;
            int i24 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24;
            byte b12 = $$a[10];
            Object[] objArr19 = new Object[1];
            c(b12, (byte) (b12 - 4), (short) 89, objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cLastIndexOf2, edgeSlop, i24, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i25 = cancelAll + 25;
            notify = i25 % 128;
            int i26 = i25 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29944);
                int mirror = 1803 - AndroidCharacter.getMirror('0');
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 23;
                byte[] bArr6 = $$a;
                byte b13 = bArr6[10];
                byte b14 = bArr6[7];
                Object[] objArr20 = new Object[1];
                c(b13, b14, (short) (b14 | 141), objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(minimumFlingVelocity, mirror, touchSlop, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 594454151;
            int i27 = (-490591815) + (((~(72407862 | length)) | 285010288) * (-366)) + (((~(length | 352123766)) | 5294384) * 366) + 1189173553;
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i29 ^ (i29 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_atm_instruction_6).substring(17, 19).length() + 875846943, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 77, (short) TextUtils.getCapsMode("", 0, 0), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_save_card).substring(0, 1).codePointAt(0) - 83), Color.alpha(0) + 624098787, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step2).substring(1, 2).length() + 875846943, (-40) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) KeyEvent.getDeadChar(0, 0), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_permission).substring(0, 77).codePointAt(8) - 111), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_phone_no_invalid).substring(28, 30).length() + 624098801, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {1590108996};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - ExpandableListView.getPackedPositionType(0L)), 1726 - TextUtils.getTrimmedLength(""), KeyEvent.keyCodeFromString("") + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = ProvinceItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 1189173553, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c3 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29944);
                int bitsPerPixel = 1754 - ImageFormat.getBitsPerPixel(0);
                int iCombineMeasuredStates = 23 - View.combineMeasuredStates(0, 0);
                byte[] bArr7 = $$a;
                byte b15 = bArr7[10];
                byte b16 = bArr7[7];
                Object[] objArr25 = new Object[1];
                c(b15, b16, (short) (b16 | 141), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, bitsPerPixel, iCombineMeasuredStates, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
            try {
                Object[] objArr26 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellResolutionDescription).substring(0, 60).length() + 875846876, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 157, (short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step6).substring(0, 3).length() - 3), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notification_token_message).substring(1, 2).length() + 624098705, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e((ViewConfiguration.getDoubleTapTimeout() >> 16) + 875846940, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 77, (short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 624098616, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char size2 = (char) (View.MeasureSpec.getSize(0) + 29944);
                    int i30 = 1756 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int iArgb = Color.argb(0, 0, 0, 0) + 23;
                    byte[] bArr8 = $$a;
                    byte b17 = bArr8[10];
                    byte b18 = bArr8[7];
                    Object[] objArr28 = new Object[1];
                    c(b17, b18, (short) (b18 | 52), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(size2, i30, iArgb, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cIndexOf2 = (char) (TextUtils.indexOf("", "") + 29944);
                    int touchSlop2 = 1755 - (ViewConfiguration.getTouchSlop() >> 8);
                    int iRgb2 = (-16777193) - Color.rgb(0, 0, 0);
                    byte b19 = $$a[10];
                    Object[] objArr29 = new Object[1];
                    c(b19, (byte) (b19 - 4), (short) 89, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf2, touchSlop2, iRgb2, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i31 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0];
        int i32 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        if (i32 == i31) {
            int i33 = notify + 65;
            cancelAll = i33 % 128;
            int i34 = i33 % 2;
            int i35 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
            Object[] objArr30 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
            int length2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.valid_date).substring(0, 24).length() + 1856665205;
            int i36 = ~length2;
            int i37 = i35 + (-1251328024) + ((length2 | 1027942075) * (-859)) + (((~(length2 | (-222570043))) | (~(1027942075 | i36))) * 859) + (((~(815339649 | i36)) | (-1037909692)) * 859);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr30[3])[0] = i39 ^ (i39 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
        if (strArr4 != null) {
            int i40 = cancelAll + 113;
            notify = i40 % 128;
            for (int i41 = i40 % 2 != 0 ? 1 : 0; i41 < strArr4.length; i41++) {
                int i42 = cancelAll + 27;
                notify = i42 % 128;
                int i43 = i42 % 2;
                arrayList2.add(strArr4[i41]);
            }
        }
        Toast.makeText((Context) null, i32 / (((i32 - 1) * i32) % 2), 0).show();
        int i44 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
        int i45 = ~System.identityHashCode(this);
        int i46 = i44 + 557336661 + ((~((-135528657) | i45)) * 52) + (((~(350773035 | i45)) | (~(138170609 | i45)) | (-486301692)) * (-52)) + (((~(i45 | (-350773036))) | 2641953) * 52);
        int i47 = (i46 << 13) ^ i46;
        int i48 = i47 ^ (i47 >>> 17);
        ((int[]) objArr31[3])[0] = i48 ^ (i48 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iNextInt = new Random().nextInt();
        int i3 = ~iNextInt;
        if (i2 != 436818192 + (((~((-290087905) | i3)) | (-1120075448)) * 519) + (((~(i3 | (-4350625))) | (~((-1115724824) | iNextInt))) * (-519)) + (((~(iNextInt | (-1120075448))) | 290087904) * 519)) {
            int i4 = 1295332042 % 2;
            throw new ArithmeticException();
        }
        int i5 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i6 = ~elapsedCpuTime;
        if (i5 != (-833391044) + ((1051816798 | i6) * (-757)) + ((~((-1090945185) | elapsedCpuTime)) * 1514) + (((~(elapsedCpuTime | 2142761982)) | (~(i6 | (-1527239167))) | 436293982) * 757)) {
            int i7 = cancelAll + 47;
            notify = i7 % 128;
            int i8 = i7 % 2;
            int[] iArr = new int[1202577487];
            iArr[1202577486] = 1;
            int i9 = 2040690706 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        super.onResume();
        int i10 = notify + 91;
        cancelAll = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = notify + 123;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null);
            int i4 = ~System.identityHashCode(this);
            if (i3 != 410738336 + ((~((-1367350273) | i4)) * 52) + (((~(605520233 | i4)) | (~(1435507776 | i4)) | (-1972870506)) * (-52)) + (((~(i4 | (-605520234))) | 68157504) * 52)) {
                throw null;
            }
        } else {
            int i5 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = (-1074585944) + (((~((-913733706) | iIdentityHashCode)) | 269510729 | (~(1743721248 | iIdentityHashCode))) * (-880));
            int i7 = (~((-913733706) | (~iIdentityHashCode))) | (-1743721249);
            int i8 = ~(iIdentityHashCode | 913733705);
            if (i5 != i6 + ((i7 | i8) * (-880)) + (i8 * 880)) {
                throw null;
            }
        }
        int i9 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iMyUid = Process.myUid();
        int i10 = ~iMyUid;
        if (i9 != 1394889852 + (((~(1894938849 | i10)) | (~((-1884307650) | iMyUid))) * (-831)) + ((~(2063335167 | iMyUid)) * (-1662)) + (((~(iMyUid | (-1894938850))) | (~(i10 | (-179027519))) | (~(179027518 | iMyUid))) * 831)) {
            throw null;
        }
        super.onStart();
        int i11 = notify + 103;
        cancelAll = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 0 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00fa, code lost:
    
        if (r1 != ((r6 + ((r4 | r2) * (-880))) + (r2 * 880))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00fc, code lost:
    
        super.onCreate(r11);
        r11 = com.bpjstku.presentation.complaint.DataUnmatchedComplaintActivity.notify + 41;
        com.bpjstku.presentation.complaint.DataUnmatchedComplaintActivity.cancelAll = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0108, code lost:
    
        if ((r11 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x010a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x010b, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x010e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x010f, code lost:
    
        r11 = (-13617394) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0118, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0119, code lost:
    
        r11 = 645234972 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0122, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0089, code lost:
    
        if (r1 == (((183490024 + ((((~((-323687078) | r5)) | 319296129) | (~(1153674620 | r5))) * (-1136))) + ((((~((-323687078) | r4)) | (~(1153674620 | r4))) | (~((-1149283673) | r5))) * (-568))) + (((~(r4 | (-319296130))) | ((~(r5 | (-1153674621))) | (~(323687077 | r5)))) * 568))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00c1, code lost:
    
        if (r1 == ((r7 + (((~(r4 | (-901685133))) | (~((-71697590) | r5))) * (-672))) + (((~(901685132 | r5)) | (-905879486)) * 672))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00c3, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r2 = android.os.Process.myPid();
        r6 = 110604700 + ((((~((-816464283) | r2)) | 537526658) | (~((-1762591683) | r2))) * (-880));
        r4 = (~((-816464283) | (~r2))) | 1762591682;
        r2 = ~(r2 | 816464282);
     */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.complaint.DataUnmatchedComplaintActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ void b(DataUnmatchedComplaintActivity dataUnmatchedComplaintActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = notify + 103;
            cancelAll = i2 % 128;
            if (i2 % 2 == 0) {
                dataUnmatchedComplaintActivity.MediaBrowserCompat();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            dataUnmatchedComplaintActivity.MediaBrowserCompat();
            str = "loading_request_data_unmatched_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i3 = cancelAll + 67;
            notify = i3 % 128;
            int i4 = i3 % 2;
            dataUnmatchedComplaintActivity.IconCompatParcelizer();
            getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
            String string = dataUnmatchedComplaintActivity.getString(R.string.label_success);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = dataUnmatchedComplaintActivity.getString(R.string.label_complaint_sent);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String string3 = dataUnmatchedComplaintActivity.getString(R.string.action_ok_thanks);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_success, string, string2, string3, null, 112);
            dataUnmatchedComplaintActivity.g = getstringornullB;
            if (getstringornullB != null) {
                FragmentManager supportFragmentManager = dataUnmatchedComplaintActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
            getStringOrNull getstringornull = dataUnmatchedComplaintActivity.g;
            if (getstringornull != null) {
                getstringornull.INotificationSideChannel = dataUnmatchedComplaintActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i5 = cancelAll + 97;
                notify = i5 % 128;
                int i6 = i5 % 2;
            }
            str = "success_request_data_unmatched_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i7 = notify + 21;
            cancelAll = i7 % 128;
            if (i7 % 2 == 0) {
                dataUnmatchedComplaintActivity.IconCompatParcelizer();
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            } else {
                dataUnmatchedComplaintActivity.IconCompatParcelizer();
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            }
            str = "failure_request_data_unmatched_result";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("param_menu_complaint_data_unmatched", str));
        Intrinsics.checkNotNullParameter(dataUnmatchedComplaintActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(DataUnmatchedComplaintActivity dataUnmatchedComplaintActivity, View view) {
        int i = 2 % 2;
        int i2 = cancelAll + 45;
        notify = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            getCurrentIndex getcurrentindex = (getCurrentIndex) dataUnmatchedComplaintActivity.asInterface.getValue();
            FragmentManager supportFragmentManager = dataUnmatchedComplaintActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getcurrentindex.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getcurrentindex.show(supportFragmentManager, getcurrentindex.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i4 = notify + 95;
                cancelAll = i4 % 128;
                int i5 = i4 % 2;
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityDataUnmatchedComplaintBinding activityDataUnmatchedComplaintBinding, RadioGroup radioGroup, int i) {
        int i2 = 2 % 2;
        int i3 = notify + 123;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(radioGroup, "");
        if (i != activityDataUnmatchedComplaintBinding.rbCorrectTotalEmployee.getId()) {
            LinearLayout linearLayout = activityDataUnmatchedComplaintBinding.totalEmployeeCorrectionContainer;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(0);
            int i5 = notify + 41;
            cancelAll = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 11 / 0;
                return;
            }
            return;
        }
        int i7 = notify + 99;
        cancelAll = i7 % 128;
        if (i7 % 2 == 0) {
            LinearLayout linearLayout2 = activityDataUnmatchedComplaintBinding.totalEmployeeCorrectionContainer;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(13);
        } else {
            LinearLayout linearLayout3 = activityDataUnmatchedComplaintBinding.totalEmployeeCorrectionContainer;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
            linearLayout3.setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x040b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0456  */
    /* JADX WARN: Code duplicated, block: B:106:0x045e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0461  */
    /* JADX WARN: Code duplicated, block: B:110:0x046e  */
    /* JADX WARN: Code duplicated, block: B:113:0x047a  */
    /* JADX WARN: Code duplicated, block: B:114:0x047d  */
    /* JADX WARN: Code duplicated, block: B:117:0x048a  */
    /* JADX WARN: Code duplicated, block: B:118:0x048d  */
    /* JADX WARN: Code duplicated, block: B:121:0x049a  */
    /* JADX WARN: Code duplicated, block: B:122:0x049d  */
    /* JADX WARN: Code duplicated, block: B:124:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:65:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:75:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x02df  */
    /* JADX WARN: Code duplicated, block: B:85:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:88:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:89:0x0300  */
    /* JADX WARN: Code duplicated, block: B:92:0x0357  */
    /* JADX WARN: Code duplicated, block: B:93:0x0359  */
    /* JADX WARN: Code duplicated, block: B:96:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:97:0x03b3  */
    public static /* synthetic */ Unit b(DataUnmatchedComplaintActivity dataUnmatchedComplaintActivity, ActivityDataUnmatchedComplaintBinding activityDataUnmatchedComplaintBinding, View view) throws Throwable {
        ActivityDataUnmatchedComplaintBinding activityDataUnmatchedComplaintBindingINotificationSideChannelStub;
        User user;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        TextInputEditText textInputEditText;
        String strValueOf;
        TextInputEditText textInputEditText2;
        String strValueOf2;
        TextInputEditText textInputEditText3;
        String strValueOf3;
        TextInputEditText textInputEditText4;
        SubscribedProgram subscribedProgram;
        String str9;
        String str10;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("param_menu_complaint", "submit_data_unmatched_complaint"));
        Intrinsics.checkNotNullParameter(dataUnmatchedComplaintActivity, "");
        Intrinsics.checkNotNullParameter("submit_data_unmatched_complaint", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("submit_data_unmatched_complaint", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("submit_data_unmatched_complaint", mapMutableMapOf);
        Object obj = null;
        if (activityDataUnmatchedComplaintBinding.rgTotalEmployeeStatus.getCheckedRadioButtonId() == activityDataUnmatchedComplaintBinding.rbCorrectTotalEmployee.getId() && activityDataUnmatchedComplaintBinding.rgWagesStatus.getCheckedRadioButtonId() == activityDataUnmatchedComplaintBinding.rbCorrectWages.getId() && activityDataUnmatchedComplaintBinding.rgMembershipStatus.getCheckedRadioButtonId() == activityDataUnmatchedComplaintBinding.rbActiveMembership.getId()) {
            int i4 = cancelAll + 43;
            notify = i4 % 128;
            int i5 = i4 % 2;
            TextInputLayout textInputLayout = activityDataUnmatchedComplaintBinding.tilChooseJamsostekIdNumber;
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
            if (retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputLayout).length() == 0) {
                dataUnmatchedComplaintActivity.RemoteActionCompatParcelizer();
            } else {
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                String string = dataUnmatchedComplaintActivity.getString(R.string.label_success);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = dataUnmatchedComplaintActivity.getString(R.string.action_ok_thanks);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_success, string, "Data Anda Sudah Sesuai", string2, null, 112);
                dataUnmatchedComplaintActivity.g = getstringornullB;
                if (getstringornullB != null) {
                    int i6 = cancelAll + 79;
                    notify = i6 % 128;
                    if (i6 % 2 != 0) {
                        FragmentManager supportFragmentManager = dataUnmatchedComplaintActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                        supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        obj.hashCode();
                        throw null;
                    }
                    FragmentManager supportFragmentManager2 = dataUnmatchedComplaintActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager2, "");
                    if (supportFragmentManager2.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB.show(supportFragmentManager2, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
                getStringOrNull getstringornull = dataUnmatchedComplaintActivity.g;
                if (getstringornull != null) {
                    getstringornull.INotificationSideChannel = dataUnmatchedComplaintActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
            }
        } else {
            String strValueOf4 = "0";
            if (activityDataUnmatchedComplaintBinding.rgWagesStatus.getCheckedRadioButtonId() == activityDataUnmatchedComplaintBinding.rbInCorrectWages.getId() && activityDataUnmatchedComplaintBinding.rgTotalEmployeeStatus.getCheckedRadioButtonId() == activityDataUnmatchedComplaintBinding.rbCorrectTotalEmployee.getId()) {
                TextInputEditText textInputEditText5 = activityDataUnmatchedComplaintBinding.edtActualWage;
                Intrinsics.checkNotNullExpressionValue(textInputEditText5, "");
                TextInputEditText textInputEditText6 = textInputEditText5;
                Intrinsics.checkNotNullParameter(textInputEditText6, "");
                String string3 = textInputEditText6.getText().toString();
                TextInputEditText textInputEditText7 = activityDataUnmatchedComplaintBinding.edtReportedWage;
                Intrinsics.checkNotNullExpressionValue(textInputEditText7, "");
                TextInputEditText textInputEditText8 = textInputEditText7;
                Intrinsics.checkNotNullParameter(textInputEditText8, "");
                if (Intrinsics.areEqual(string3, textInputEditText8.getText().toString())) {
                    int i7 = notify + 69;
                    cancelAll = i7 % 128;
                    int i8 = i7 % 2;
                    getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
                    String string4 = dataUnmatchedComplaintActivity.getString(R.string.message_sorry);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    String string5 = dataUnmatchedComplaintActivity.getString(R.string.action_back);
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    getStringOrNull getstringornullB2 = getStringOrNull.Companion.b(R.drawable.ic_failed, string4, "Data Upah dan Data yang Dilaporkan tidak boleh sama/kosong", string5, null, 112);
                    dataUnmatchedComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getstringornullB2;
                    if (getstringornullB2 != null) {
                        FragmentManager supportFragmentManager3 = dataUnmatchedComplaintActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "");
                        Intrinsics.checkNotNullParameter(supportFragmentManager3, "");
                        if (supportFragmentManager3.findFragmentByTag(getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                            getstringornullB2.show(supportFragmentManager3, getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    }
                    getStringOrNull getstringornull2 = dataUnmatchedComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (getstringornull2 != null) {
                        getstringornull2.INotificationSideChannel = dataUnmatchedComplaintActivity.new b();
                    }
                } else {
                    activityDataUnmatchedComplaintBinding.edtActualTotalEmployee.setText("0");
                    activityDataUnmatchedComplaintBinding.edtReportedTotalEmployee.setText("0");
                    activityDataUnmatchedComplaintBindingINotificationSideChannelStub = dataUnmatchedComplaintActivity.INotificationSideChannelStub();
                    if (dataUnmatchedComplaintActivity.RemoteActionCompatParcelizer()) {
                        user = (User) dataUnmatchedComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                        if (user != null) {
                            str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            if (str == null) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            str3 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            if (str3 == null) {
                                i2 = notify + 19;
                                cancelAll = i2 % 128;
                                if (i2 % 2 == 0) {
                                    int i9 = 65 / 0;
                                }
                                str4 = "";
                            } else {
                                str4 = str3;
                            }
                            str5 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            if (str5 == null) {
                                str6 = "";
                            } else {
                                str6 = str5;
                            }
                            str7 = user.b;
                            if (str7 == null) {
                                str8 = "";
                            } else {
                                str8 = str7;
                            }
                            TextInputEditText textInputEditText9 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtActualTotalEmployee;
                            Intrinsics.checkNotNullExpressionValue(textInputEditText9, "");
                            textInputEditText = textInputEditText9;
                            Intrinsics.checkNotNullParameter(textInputEditText, "");
                            if (textInputEditText.getText().toString().length() == 0) {
                                strValueOf = "0";
                            } else {
                                TextInputEditText textInputEditText10 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtActualTotalEmployee;
                                Intrinsics.checkNotNullExpressionValue(textInputEditText10, "");
                                TextInputEditText textInputEditText11 = textInputEditText10;
                                Intrinsics.checkNotNullParameter(textInputEditText11, "");
                                strValueOf = String.valueOf(Long.parseLong(StringsKt.trim((CharSequence) StringsKt.replace$default(StringsKt.trim((CharSequence) textInputEditText11.getText().toString()).toString(), ".", "", false, 4, (Object) null)).toString()));
                            }
                            TextInputEditText textInputEditText12 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtReportedTotalEmployee;
                            Intrinsics.checkNotNullExpressionValue(textInputEditText12, "");
                            textInputEditText2 = textInputEditText12;
                            Intrinsics.checkNotNullParameter(textInputEditText2, "");
                            if (textInputEditText2.getText().toString().length() == 0) {
                                strValueOf2 = "0";
                            } else {
                                TextInputEditText textInputEditText13 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtReportedTotalEmployee;
                                Intrinsics.checkNotNullExpressionValue(textInputEditText13, "");
                                TextInputEditText textInputEditText14 = textInputEditText13;
                                Intrinsics.checkNotNullParameter(textInputEditText14, "");
                                strValueOf2 = String.valueOf(Long.parseLong(StringsKt.trim((CharSequence) StringsKt.replace$default(StringsKt.trim((CharSequence) textInputEditText14.getText().toString()).toString(), ".", "", false, 4, (Object) null)).toString()));
                            }
                            TextInputEditText textInputEditText15 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtActualWage;
                            Intrinsics.checkNotNullExpressionValue(textInputEditText15, "");
                            textInputEditText3 = textInputEditText15;
                            Intrinsics.checkNotNullParameter(textInputEditText3, "");
                            if (textInputEditText3.getText().toString().length() == 0) {
                                strValueOf3 = "0";
                            } else {
                                TextInputEditText textInputEditText16 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtActualWage;
                                Intrinsics.checkNotNullExpressionValue(textInputEditText16, "");
                                TextInputEditText textInputEditText17 = textInputEditText16;
                                Intrinsics.checkNotNullParameter(textInputEditText17, "");
                                strValueOf3 = String.valueOf(Long.parseLong(StringsKt.trim((CharSequence) StringsKt.replace$default(StringsKt.trim((CharSequence) textInputEditText17.getText().toString()).toString(), ".", "", false, 4, (Object) null)).toString()));
                            }
                            TextInputEditText textInputEditText18 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtReportedWage;
                            Intrinsics.checkNotNullExpressionValue(textInputEditText18, "");
                            textInputEditText4 = textInputEditText18;
                            Intrinsics.checkNotNullParameter(textInputEditText4, "");
                            if (textInputEditText4.getText().toString().length() != 0) {
                                int i10 = cancelAll + 117;
                                notify = i10 % 128;
                                int i11 = i10 % 2;
                                TextInputEditText textInputEditText19 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtReportedWage;
                                Intrinsics.checkNotNullExpressionValue(textInputEditText19, "");
                                TextInputEditText textInputEditText20 = textInputEditText19;
                                Intrinsics.checkNotNullParameter(textInputEditText20, "");
                                strValueOf4 = String.valueOf(Long.parseLong(StringsKt.trim((CharSequence) StringsKt.replace$default(StringsKt.trim((CharSequence) textInputEditText20.getText().toString()).toString(), ".", "", false, 4, (Object) null)).toString()));
                            }
                            String str11 = strValueOf4;
                            subscribedProgram = dataUnmatchedComplaintActivity.TuitionPaymentFragmentbindingInflater1;
                            if (subscribedProgram == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                                subscribedProgram = null;
                            }
                            str9 = subscribedProgram.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            if (str9 == null) {
                                str10 = "";
                            } else {
                                str10 = str9;
                            }
                            if (activityDataUnmatchedComplaintBindingINotificationSideChannelStub.rgMembershipStatus.getCheckedRadioButtonId() == R.id.rbActiveMembership) {
                                i = cancelAll + 45;
                                notify = i % 128;
                                if (i % 2 != 0) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                            } else {
                                z = false;
                            }
                            if (activityDataUnmatchedComplaintBindingINotificationSideChannelStub.rgWagesStatus.getCheckedRadioButtonId() == R.id.rbCorrectWages) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (activityDataUnmatchedComplaintBindingINotificationSideChannelStub.rgTotalEmployeeStatus.getCheckedRadioButtonId() == R.id.rbCorrectTotalEmployee) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            DataCorrectionRequest dataCorrectionRequest = new DataCorrectionRequest(str2, strValueOf, strValueOf2, str10, str4, str6, str8, z3, z, z2, strValueOf3, str11);
                            final containsZslUseCase containszslusecaseCancelAll = dataUnmatchedComplaintActivity.cancelAll();
                            Intrinsics.checkNotNullParameter(dataCorrectionRequest, "");
                            MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = containszslusecaseCancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
                            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(containszslusecaseCancelAll.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(dataCorrectionRequest)));
                            final Function1 function1 = new Function1() { // from class: shouldUseStreamUseCase
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return containsZslUseCase.b(containszslusecaseCancelAll, (BaseModel) obj2);
                                }
                            };
                            logToString logtostring = new logToString() { // from class: populateSurfaceToStreamUseCaseMapping
                                @Override // defpackage.logToString
                                public final void accept(Object obj2) {
                                    function1.invoke(obj2);
                                }
                            };
                            final Function1 function2 = new Function1() { // from class: areCaptureTypesEligible
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return containsZslUseCase.b(containszslusecaseCancelAll, (Throwable) obj2);
                                }
                            };
                            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: throwInvalidCamera2InteropOverrideException
                                @Override // defpackage.logToString
                                public final void accept(Object obj2) {
                                    function2.invoke(obj2);
                                }
                            });
                            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                            containszslusecaseCancelAll.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    } else {
                        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "semua field harus diisi", 0).show();
                    }
                }
            } else {
                if (activityDataUnmatchedComplaintBinding.rgWagesStatus.getCheckedRadioButtonId() == activityDataUnmatchedComplaintBinding.rbCorrectWages.getId() && activityDataUnmatchedComplaintBinding.rgTotalEmployeeStatus.getCheckedRadioButtonId() == activityDataUnmatchedComplaintBinding.rbInCorrectTotalEmployee.getId()) {
                    int i12 = notify + 5;
                    cancelAll = i12 % 128;
                    int i13 = i12 % 2;
                    TextInputEditText textInputEditText21 = activityDataUnmatchedComplaintBinding.edtActualTotalEmployee;
                    Intrinsics.checkNotNullExpressionValue(textInputEditText21, "");
                    TextInputEditText textInputEditText22 = textInputEditText21;
                    Intrinsics.checkNotNullParameter(textInputEditText22, "");
                    String string6 = textInputEditText22.getText().toString();
                    TextInputEditText textInputEditText23 = activityDataUnmatchedComplaintBinding.edtReportedTotalEmployee;
                    Intrinsics.checkNotNullExpressionValue(textInputEditText23, "");
                    TextInputEditText textInputEditText24 = textInputEditText23;
                    Intrinsics.checkNotNullParameter(textInputEditText24, "");
                    if (Intrinsics.areEqual(string6, textInputEditText24.getText().toString())) {
                        getStringOrNull.Companion companion4 = getStringOrNull.INSTANCE;
                        String string7 = dataUnmatchedComplaintActivity.getString(R.string.message_sorry);
                        Intrinsics.checkNotNullExpressionValue(string7, "");
                        String string8 = dataUnmatchedComplaintActivity.getString(R.string.action_back);
                        Intrinsics.checkNotNullExpressionValue(string8, "");
                        getStringOrNull getstringornullB3 = getStringOrNull.Companion.b(R.drawable.ic_failed, string7, "Data Jumlah Tenaga Kerja yang diinputkan dan Data yang Dilaporkan tidak boleh sama/kosong", string8, null, 112);
                        dataUnmatchedComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getstringornullB3;
                        if (getstringornullB3 != null) {
                            FragmentManager supportFragmentManager4 = dataUnmatchedComplaintActivity.getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager4, "");
                            Intrinsics.checkNotNullParameter(supportFragmentManager4, "");
                            if (supportFragmentManager4.findFragmentByTag(getstringornullB3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                getstringornullB3.show(supportFragmentManager4, getstringornullB3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            }
                        }
                        getStringOrNull getstringornull3 = dataUnmatchedComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        if (getstringornull3 != null) {
                            getstringornull3.INotificationSideChannel = dataUnmatchedComplaintActivity.new TuitionPaymentFragmentbindingInflater1();
                        }
                    } else {
                        activityDataUnmatchedComplaintBinding.edtActualWage.setText("0");
                        activityDataUnmatchedComplaintBinding.edtReportedWage.setText("0");
                    }
                } else {
                    if (activityDataUnmatchedComplaintBinding.rgTotalEmployeeStatus.getCheckedRadioButtonId() == activityDataUnmatchedComplaintBinding.rbCorrectTotalEmployee.getId()) {
                        int i14 = notify + 87;
                        cancelAll = i14 % 128;
                        if (i14 % 2 == 0) {
                            activityDataUnmatchedComplaintBinding.edtActualTotalEmployee.setText("0");
                            activityDataUnmatchedComplaintBinding.edtReportedTotalEmployee.setText("0");
                            throw null;
                        }
                        activityDataUnmatchedComplaintBinding.edtActualTotalEmployee.setText("0");
                        activityDataUnmatchedComplaintBinding.edtReportedTotalEmployee.setText("0");
                    }
                    if (activityDataUnmatchedComplaintBinding.rgWagesStatus.getCheckedRadioButtonId() == activityDataUnmatchedComplaintBinding.rbCorrectWages.getId()) {
                        activityDataUnmatchedComplaintBinding.edtActualWage.setText("0");
                        activityDataUnmatchedComplaintBinding.edtReportedWage.setText("0");
                    }
                }
                activityDataUnmatchedComplaintBindingINotificationSideChannelStub = dataUnmatchedComplaintActivity.INotificationSideChannelStub();
                if (dataUnmatchedComplaintActivity.RemoteActionCompatParcelizer()) {
                    user = (User) dataUnmatchedComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    if (user != null) {
                        str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (str == null) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        str3 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if (str3 == null) {
                            i2 = notify + 19;
                            cancelAll = i2 % 128;
                            if (i2 % 2 == 0) {
                                int i15 = 65 / 0;
                            }
                            str4 = "";
                        } else {
                            str4 = str3;
                        }
                        str5 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        if (str5 == null) {
                            str6 = "";
                        } else {
                            str6 = str5;
                        }
                        str7 = user.b;
                        if (str7 == null) {
                            str8 = "";
                        } else {
                            str8 = str7;
                        }
                        TextInputEditText textInputEditText25 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtActualTotalEmployee;
                        Intrinsics.checkNotNullExpressionValue(textInputEditText25, "");
                        textInputEditText = textInputEditText25;
                        Intrinsics.checkNotNullParameter(textInputEditText, "");
                        if (textInputEditText.getText().toString().length() == 0) {
                            strValueOf = "0";
                        } else {
                            TextInputEditText textInputEditText110 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtActualTotalEmployee;
                            Intrinsics.checkNotNullExpressionValue(textInputEditText110, "");
                            TextInputEditText textInputEditText111 = textInputEditText110;
                            Intrinsics.checkNotNullParameter(textInputEditText111, "");
                            strValueOf = String.valueOf(Long.parseLong(StringsKt.trim((CharSequence) StringsKt.replace$default(StringsKt.trim((CharSequence) textInputEditText111.getText().toString()).toString(), ".", "", false, 4, (Object) null)).toString()));
                        }
                        TextInputEditText textInputEditText112 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtReportedTotalEmployee;
                        Intrinsics.checkNotNullExpressionValue(textInputEditText112, "");
                        textInputEditText2 = textInputEditText112;
                        Intrinsics.checkNotNullParameter(textInputEditText2, "");
                        if (textInputEditText2.getText().toString().length() == 0) {
                            strValueOf2 = "0";
                        } else {
                            TextInputEditText textInputEditText113 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtReportedTotalEmployee;
                            Intrinsics.checkNotNullExpressionValue(textInputEditText113, "");
                            TextInputEditText textInputEditText114 = textInputEditText113;
                            Intrinsics.checkNotNullParameter(textInputEditText114, "");
                            strValueOf2 = String.valueOf(Long.parseLong(StringsKt.trim((CharSequence) StringsKt.replace$default(StringsKt.trim((CharSequence) textInputEditText114.getText().toString()).toString(), ".", "", false, 4, (Object) null)).toString()));
                        }
                        TextInputEditText textInputEditText115 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtActualWage;
                        Intrinsics.checkNotNullExpressionValue(textInputEditText115, "");
                        textInputEditText3 = textInputEditText115;
                        Intrinsics.checkNotNullParameter(textInputEditText3, "");
                        if (textInputEditText3.getText().toString().length() == 0) {
                            strValueOf3 = "0";
                        } else {
                            TextInputEditText textInputEditText116 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtActualWage;
                            Intrinsics.checkNotNullExpressionValue(textInputEditText116, "");
                            TextInputEditText textInputEditText117 = textInputEditText116;
                            Intrinsics.checkNotNullParameter(textInputEditText117, "");
                            strValueOf3 = String.valueOf(Long.parseLong(StringsKt.trim((CharSequence) StringsKt.replace$default(StringsKt.trim((CharSequence) textInputEditText117.getText().toString()).toString(), ".", "", false, 4, (Object) null)).toString()));
                        }
                        TextInputEditText textInputEditText118 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtReportedWage;
                        Intrinsics.checkNotNullExpressionValue(textInputEditText118, "");
                        textInputEditText4 = textInputEditText118;
                        Intrinsics.checkNotNullParameter(textInputEditText4, "");
                        if (textInputEditText4.getText().toString().length() != 0) {
                            int i16 = cancelAll + 117;
                            notify = i16 % 128;
                            int i17 = i16 % 2;
                            TextInputEditText textInputEditText119 = activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtReportedWage;
                            Intrinsics.checkNotNullExpressionValue(textInputEditText119, "");
                            TextInputEditText textInputEditText26 = textInputEditText119;
                            Intrinsics.checkNotNullParameter(textInputEditText26, "");
                            strValueOf4 = String.valueOf(Long.parseLong(StringsKt.trim((CharSequence) StringsKt.replace$default(StringsKt.trim((CharSequence) textInputEditText26.getText().toString()).toString(), ".", "", false, 4, (Object) null)).toString()));
                        }
                        String str12 = strValueOf4;
                        subscribedProgram = dataUnmatchedComplaintActivity.TuitionPaymentFragmentbindingInflater1;
                        if (subscribedProgram == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            subscribedProgram = null;
                        }
                        str9 = subscribedProgram.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        if (str9 == null) {
                            str10 = "";
                        } else {
                            str10 = str9;
                        }
                        if (activityDataUnmatchedComplaintBindingINotificationSideChannelStub.rgMembershipStatus.getCheckedRadioButtonId() == R.id.rbActiveMembership) {
                            i = cancelAll + 45;
                            notify = i % 128;
                            if (i % 2 != 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        if (activityDataUnmatchedComplaintBindingINotificationSideChannelStub.rgWagesStatus.getCheckedRadioButtonId() == R.id.rbCorrectWages) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (activityDataUnmatchedComplaintBindingINotificationSideChannelStub.rgTotalEmployeeStatus.getCheckedRadioButtonId() == R.id.rbCorrectTotalEmployee) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        DataCorrectionRequest dataCorrectionRequest2 = new DataCorrectionRequest(str2, strValueOf, strValueOf2, str10, str4, str6, str8, z3, z, z2, strValueOf3, str12);
                        final containsZslUseCase containszslusecaseCancelAll2 = dataUnmatchedComplaintActivity.cancelAll();
                        Intrinsics.checkNotNullParameter(dataCorrectionRequest2, "");
                        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData2 = containszslusecaseCancelAll2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        VirtualCameraAdapter1.Companion companion5 = VirtualCameraAdapter1.INSTANCE;
                        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                        deriveCodec derivecodecB2 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(containszslusecaseCancelAll2.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(dataCorrectionRequest2)));
                        final Function1 function3 = new Function1() { // from class: shouldUseStreamUseCase
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return containsZslUseCase.b(containszslusecaseCancelAll2, (BaseModel) obj2);
                            }
                        };
                        logToString logtostring2 = new logToString() { // from class: populateSurfaceToStreamUseCaseMapping
                            @Override // defpackage.logToString
                            public final void accept(Object obj2) {
                                function3.invoke(obj2);
                            }
                        };
                        final Function1 function4 = new Function1() { // from class: areCaptureTypesEligible
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return containsZslUseCase.b(containszslusecaseCancelAll2, (Throwable) obj2);
                            }
                        };
                        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4 = derivecodecB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring2, new logToString() { // from class: throwInvalidCamera2InteropOverrideException
                            @Override // defpackage.logToString
                            public final void accept(Object obj2) {
                                function4.invoke(obj2);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
                        containszslusecaseCancelAll2.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                    }
                } else {
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "semua field harus diisi", 0).show();
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ getCurrentIndex b(final DataUnmatchedComplaintActivity dataUnmatchedComplaintActivity) {
        List<SubscribedProgram> listEmptyList;
        int i = 2 % 2;
        getCurrentIndex.Companion companion = getCurrentIndex.INSTANCE;
        User user = (User) dataUnmatchedComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        Object obj = null;
        if (user != null) {
            listEmptyList = user.INotificationSideChannel;
        } else {
            int i2 = notify + 99;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            int i4 = notify + 55;
            cancelAll = i4 % 128;
            if (i4 % 2 == 0) {
                CollectionsKt.emptyList();
                obj.hashCode();
                throw null;
            }
            listEmptyList = CollectionsKt.emptyList();
        }
        return getCurrentIndex.Companion.TuitionPaymentFragmentbindingInflater1(listEmptyList, new Function1() { // from class: AnimatedStateListDrawableCompatAnimatedVectorDrawableTransition
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (SubscribedProgram) obj2};
                return (Unit) DataUnmatchedComplaintActivity.b(setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -397319365, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr, 397319368, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        });
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        DataUnmatchedComplaintActivity dataUnmatchedComplaintActivity = (DataUnmatchedComplaintActivity) objArr[0];
        int i = 2 % 2;
        int i2 = notify + 39;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            return ((ActivityResultContractsPickVisualMediaMediaCapabilities) dataUnmatchedComplaintActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
        int i3 = 90 / 0;
        return ((ActivityResultContractsPickVisualMediaMediaCapabilities) dataUnmatchedComplaintActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        String str;
        String str2;
        DataUnmatchedComplaintActivity dataUnmatchedComplaintActivity = (DataUnmatchedComplaintActivity) objArr[0];
        SubscribedProgram subscribedProgram = (SubscribedProgram) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(subscribedProgram, "");
        dataUnmatchedComplaintActivity.INotificationSideChannelStub().edtChooseJamsostekIdNumber.setText(subscribedProgram.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        dataUnmatchedComplaintActivity.TuitionPaymentFragmentbindingInflater1 = subscribedProgram;
        String str3 = subscribedProgram.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        User user = (User) dataUnmatchedComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        if (user != null) {
            int i2 = notify + 93;
            cancelAll = i2 % 128;
            if (i2 % 2 == 0) {
                str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i3 = 52 / 0;
            } else {
                str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
        } else {
            str = null;
        }
        String strValueOf = String.valueOf(str);
        Intrinsics.checkNotNull(str3);
        User user2 = (User) dataUnmatchedComplaintActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        if (user2 != null) {
            int i4 = notify + 77;
            cancelAll = i4 % 128;
            if (i4 % 2 == 0) {
                String str4 = user2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                throw null;
            }
            str2 = user2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } else {
            str2 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("#");
        sb.append(str3);
        PreloadDataRequest preloadDataRequest = new PreloadDataRequest(strValueOf, "PU", str3, sb.toString());
        final containsZslUseCase containszslusecaseCancelAll = dataUnmatchedComplaintActivity.cancelAll();
        Intrinsics.checkNotNullParameter(preloadDataRequest, "");
        MutableLiveData<VirtualCameraAdapter1<PreloadDataResponse>> mutableLiveData = containszslusecaseCancelAll.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(containszslusecaseCancelAll.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(preloadDataRequest)));
        final Function1 function1 = new Function1() { // from class: getStreamSpecImplementationOptions
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return containsZslUseCase.TuitionPaymentFragmentspecialinlinedviewModeldefault3(containszslusecaseCancelAll, (PreloadDataResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: populateStreamUseCaseStreamSpecOptionWithInteropOverride
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: isZslUseCase
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return containsZslUseCase.TuitionPaymentFragmentbindingInflater1(containszslusecaseCancelAll, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: populateStreamUseCaseStreamSpecOptionWithSupportedSurfaceConfigs
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        containszslusecaseCancelAll.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        ActivityDataUnmatchedComplaintBinding activityDataUnmatchedComplaintBinding = (ActivityDataUnmatchedComplaintBinding) objArr[0];
        RadioGroup radioGroup = (RadioGroup) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = cancelAll + 3;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(radioGroup, "");
        if (i3 != 0) {
            activityDataUnmatchedComplaintBinding.rbCorrectWages.getId();
            throw null;
        }
        if (iIntValue != activityDataUnmatchedComplaintBinding.rbCorrectWages.getId()) {
            LinearLayout linearLayout = activityDataUnmatchedComplaintBinding.wageCorrectionContainer;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(0);
            return null;
        }
        LinearLayout linearLayout2 = activityDataUnmatchedComplaintBinding.wageCorrectionContainer;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setVisibility(8);
        int i4 = cancelAll + 69;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(DataUnmatchedComplaintActivity dataUnmatchedComplaintActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            dataUnmatchedComplaintActivity.MediaBrowserCompat();
            str = "loading_request_data_unmatched_preload_data_result";
            int i2 = cancelAll + 21;
            notify = i2 % 128;
            int i3 = i2 % 2;
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i4 = notify + 51;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
            dataUnmatchedComplaintActivity.IconCompatParcelizer();
            PreloadDataResponse preloadDataResponse = (PreloadDataResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Intrinsics.checkNotNullParameter(preloadDataResponse, "");
            ActivityDataUnmatchedComplaintBinding activityDataUnmatchedComplaintBindingINotificationSideChannelStub = dataUnmatchedComplaintActivity.INotificationSideChannelStub();
            activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtReportedWage.setText(getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(preloadDataResponse.getSalary()));
            activityDataUnmatchedComplaintBindingINotificationSideChannelStub.edtReportedTotalEmployee.setText(getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(preloadDataResponse.getTotalEmployee()));
            str = "success_request_data_unmatched_preload_data_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            dataUnmatchedComplaintActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            str = "failure_request_data_unmatched_preload_data_result";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("param_menu_complaint_data_unmatched", str));
        Intrinsics.checkNotNullParameter(dataUnmatchedComplaintActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(DataUnmatchedComplaintActivity dataUnmatchedComplaintActivity) throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = notify + 5;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int iCodePointAt = (-1696379824) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzk.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        boolean zBooleanValue = ((Boolean) b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_xl_tunai).substring(1, 3).length() + 173829322, iCodePointAt, 529519784, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{dataUnmatchedComplaintActivity, "w"}, -529519782, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2())).booleanValue();
        int i4 = notify + 77;
        cancelAll = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(DataUnmatchedComplaintActivity dataUnmatchedComplaintActivity) throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = cancelAll + 107;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            ((Boolean) b(173829322 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_xl_tunai).substring(1, 3).length(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 1696379824, 529519784, zzk.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{dataUnmatchedComplaintActivity, "e"}, -529519782, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2())).booleanValue();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_xl_tunai).substring(1, 3).length() + 173829322, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 1696379824, 529519784, zzk.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{dataUnmatchedComplaintActivity, "e"}, -529519782, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2())).booleanValue();
        int i3 = notify + 103;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        return zBooleanValue;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(ActivityDataUnmatchedComplaintBinding activityDataUnmatchedComplaintBinding, RadioGroup radioGroup, int i) {
        Object[] objArr = {activityDataUnmatchedComplaintBinding, radioGroup, Integer.valueOf(i)};
        b(setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1902770049, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr, -1902770048, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    public static /* synthetic */ Unit b(DataUnmatchedComplaintActivity dataUnmatchedComplaintActivity, SubscribedProgram subscribedProgram) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) b(setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -397319365, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{dataUnmatchedComplaintActivity, subscribedProgram}, 397319368, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault3(DataUnmatchedComplaintActivity dataUnmatchedComplaintActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (User) b(setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 1826865619, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{dataUnmatchedComplaintActivity}, -1826865615, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    static {
        getInterfaceDescriptor = 1;
        g();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannelDefault + 81;
        getInterfaceDescriptor = i % 128;
        if (i % 2 == 0) {
            int i2 = 81 / 0;
        }
    }

    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
        Object[] objArr = {this, p0};
        return ((Boolean) b(173829322 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_xl_tunai).substring(1, 3).length(), (-1696379824) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6), 529519784, zzk.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr, -529519782, setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2())).booleanValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancelAll + 61;
        int i3 = i2 % 128;
        notify = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 23;
        cancelAll = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_data_unmatched_complaint;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = notify + 121;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = cancelAll + 47;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        b(setButtonPanelLayoutHint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 813159950, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{this}, -813159950, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    static void g() {
        d = 1449156232;
        f477a = -1934795570;
        INotificationSideChannel = 1197932463;
        cancel = new byte[]{8, -18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 1, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, 20, -27, 26, 21, -20, -14, Base64.padSymbol, -29, -19, 21, -21, 19, -9, -60, -11, 88, -26, -23, -43, 44, 29, 28, 27, -24, 16, -21, 12, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, 43, -32, -17, 21, -26, 27, -12, 14, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, 14, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29};
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        DataUnmatchedComplaintActivity dataUnmatchedComplaintActivity = (DataUnmatchedComplaintActivity) objArr[0];
        int i = 2 % 2;
        int i2 = notify + 63;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        int i5 = notify + 111;
        cancelAll = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return null;
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
    private static java.lang.String $$i(int r5, byte r6, short r7) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.presentation.complaint.DataUnmatchedComplaintActivity.$$c
            int r5 = r5 + 117
            int r6 = r6 * 2
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r4 = r5
            r5 = r6
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
        L27:
            int r5 = r5 + r4
            int r7 = r7 + 1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.complaint.DataUnmatchedComplaintActivity.$$i(int, byte, short):java.lang.String");
    }
}
