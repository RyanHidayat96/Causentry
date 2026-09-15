package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityClaimSubmissionBinding;
import com.bpjstku.databinding.LayoutRegistrationProgressBinding;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimSubmissionActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.model.IndividualDataClaim;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.mlkit_vision_face.zzee;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraImplExternalSyntheticLambda16;
import defpackage.Camera2CameraImplExternalSyntheticLambda3;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.LifecycleCameraRepository;
import defpackage.TargetAspectRatio;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.dumpAudioCapabilities;
import defpackage.findQualityInTargetQualities;
import defpackage.generateCameraId;
import defpackage.getEventTime;
import defpackage.getExposureState;
import defpackage.getExtendedConfig;
import defpackage.getIncrementalScaleFactor;
import defpackage.getSessionConfigTemplateType;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl;
import defpackage.lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl;
import defpackage.lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.onCaptureSessionEnd;
import defpackage.openCaptureSession;
import defpackage.readableMs;
import defpackage.reopenCameraAfterError;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0011\u0010\u0004J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0017\u0010\u0004J\r\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0016\u0010\b\u001a\u00020\u001b8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0016\u0010!\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0006\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0015\u0010$\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0014\u0010\u001f\u001a\u00020\r8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010%R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00020&8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b!\u0010(R\u0016\u0010\u000b\u001a\u00020)8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u000f\u0010*"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/claim/ClaimSubmissionActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityClaimSubmissionBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asInterface", "asBinder", "a", "INotificationSideChannel", "", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(I)V", "onTransact", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onBackPressed", "onDestroy", "RemoteActionCompatParcelizer", "Landroidx/fragment/app/FragmentManager;", "Landroidx/fragment/app/FragmentManager;", "LBufferProviderState;", "LBufferProviderState;", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/model/IndividualDataClaim;", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/model/IndividualDataClaim;", "g", "I", "TuitionPaymentFragmentbindingInflater1", "LgetExtendedConfig;", "Lkotlin/Lazy;", "d", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "Lcom/bpjstku/databinding/LayoutRegistrationProgressBinding;", "Lcom/bpjstku/databinding/LayoutRegistrationProgressBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClaimSubmissionActivity extends BindingBaseActivity<ActivityClaimSubmissionBinding> {
    private static char asBinder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int cancelAll;
    private static char d;
    private static char notify;
    private static char onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final FragmentManager b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private LayoutRegistrationProgressBinding a;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy d;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private IndividualDataClaim TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {110, -73, -111, 99};
    private static final int $$f = 100;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {6, -86, -9, -124, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 178;
    private static int RemoteActionCompatParcelizer = 1;
    private static int INotificationSideChannel = 0;
    private static int cancel = 1;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c5, code lost:
    
        if (r9 == ((939609886 + (((~((~r15) | (-545785386))) | 1375772928) * (-591))) + ((r15 | (-545785386)) * 591))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0100, code lost:
    
        if (r9 == (((1101004576 + ((~(1608048511 | r15)) * 623)) + (((~r15) | 22037000) * (-623))) + (((~(r15 | 400048984)) | ((~(1230036527 | r15)) | (-1608048512))) * 623))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0102, code lost:
    
        r9 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r11 = android.os.Process.myPid();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0126, code lost:
    
        if (r9 != ((((~(r11 | 1777274397)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) - 696621312) + (((~((~r11) | 1777274397)) | 701105693) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0128, code lost:
    
        super.onCreate(r10);
        r9 = com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimSubmissionActivity.cancel + 55;
        com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimSubmissionActivity.INotificationSideChannel = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0135, code lost:
    
        r9 = 1132464818 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x013e, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x013f, code lost:
    
        r9 = 592614574 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0148, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int r9, java.lang.Object[] r10, int r11, int r12, int r13, int r14, int r15) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimSubmissionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(int, java.lang.Object[], int, int, int, int, int):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 4
            int r0 = r6 + 1
            byte[] r1 = com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimSubmissionActivity.$$a
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L20:
            int r3 = r3 + 1
            r4 = r1[r5]
        L24:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            int r5 = r5 + 1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimSubmissionActivity.c(int, short, short, java.lang.Object[]):void");
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> implements findQualityInTargetQualities {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> TuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2<>();

        @Override // defpackage.findQualityInTargetQualities
        public final boolean b(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return obj instanceof lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T, R> implements readableMs {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault3<T, R> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3<>();

        @Override // defpackage.readableMs
        public final T apply(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (T) ((lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl) obj);
        }
    }

    public ClaimSubmissionActivity() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        this.b = supportFragmentManager;
        this.TuitionPaymentFragmentbindingInflater1 = 5;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        final ClaimSubmissionActivity claimSubmissionActivity = this;
        this.d = LazyKt.lazy(new Function0<getExtendedConfig>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimSubmissionActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getExtendedConfig] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getExtendedConfig invoke() {
                LifecycleOwner lifecycleOwner = claimSubmissionActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(getExtendedConfig.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimSubmissionActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/claim/ClaimSubmissionActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/model/IndividualDataClaim;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/model/IndividualDataClaim;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0, IndividualDataClaim p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, ClaimSubmissionActivity.class, new Pair[]{TuplesKt.to("individual_claim_data", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityClaimSubmissionBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 17;
        cancel = i2 % 128;
        if (i2 % 2 == 0) {
            ClaimSubmissionActivity$bindingInflater$1 claimSubmissionActivity$bindingInflater$1 = ClaimSubmissionActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        ClaimSubmissionActivity$bindingInflater$1 claimSubmissionActivity$bindingInflater$2 = ClaimSubmissionActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = INotificationSideChannel + 79;
        cancel = i3 % 128;
        if (i3 % 2 != 0) {
            return claimSubmissionActivity$bindingInflater$2;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 73;
        int i3 = i2 % 128;
        cancel = i3;
        int i4 = i2 % 2;
        LayoutRegistrationProgressBinding layoutRegistrationProgressBinding = this.a;
        if (layoutRegistrationProgressBinding == null) {
            int i5 = i3 + 49;
            INotificationSideChannel = i5 % 128;
            if (i5 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = 6 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            layoutRegistrationProgressBinding = null;
        }
        layoutRegistrationProgressBinding.sbRegisterProgression.setOnTouchListener(new View.OnTouchListener() { // from class: lambdainvokePostCapture1androidxcameracamera2internalCamera2CapturePipelineCameraCapturePipelineImpl
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ClaimSubmissionActivity.g();
            }
        });
        INotificationSideChannel();
        ((ActivityClaimSubmissionBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: Camera2CapturePipelineCameraCapturePipelineImplExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClaimSubmissionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020 A[PHI: r1
  0x0020: PHI (r1v5 android.content.Intent) = (r1v4 android.content.Intent), (r1v13 android.content.Intent) binds: [B:8:0x001e, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        Intent intent;
        IndividualDataClaim individualDataClaim;
        int i = 2 % 2;
        int i2 = cancel + 11;
        INotificationSideChannel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            intent = getIntent();
            int i3 = 78 / 0;
            if (intent != null) {
                individualDataClaim = (IndividualDataClaim) intent.getParcelableExtra("individual_claim_data");
            } else {
                individualDataClaim = null;
            }
        } else {
            intent = getIntent();
            if (intent != null) {
                individualDataClaim = (IndividualDataClaim) intent.getParcelableExtra("individual_claim_data");
            } else {
                individualDataClaim = null;
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = individualDataClaim;
        int i4 = INotificationSideChannel + 101;
        cancel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = cancel + 85;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        IndividualDataClaim individualDataClaim = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (individualDataClaim != null) {
            getExtendedConfig getextendedconfig = (getExtendedConfig) this.d.getValue();
            Intrinsics.checkNotNullParameter(individualDataClaim, "");
            getextendedconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setValue(individualDataClaim);
            int i4 = INotificationSideChannel + 81;
            cancel = i4 % 128;
            int i5 = i4 % 2;
        }
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
        VideoRecordEventStart<R> map = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().filter(TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1).map(TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Intrinsics.checkNotNullExpressionValue(map, "");
        VideoRecordEventStart videoRecordEventStartObserveOn = map.observeOn(dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1());
        final Function1 function1 = new Function1() { // from class: invokePreCapture
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClaimSubmissionActivity.b(this.TuitionPaymentFragmentbindingInflater1, (lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl) obj);
            }
        };
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = videoRecordEventStartObserveOn.subscribe(new logToString() { // from class: Camera2CapturePipelineCameraCapturePipelineImplExternalSyntheticLambda0
            @Override // defpackage.logToString
            public final void accept(Object obj) throws IllegalAccessException {
                ClaimSubmissionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        });
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 7;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        this.a = LayoutRegistrationProgressBinding.bind(((ActivityClaimSubmissionBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).getRoot());
        ClaimSubmissionActivity claimSubmissionActivity = this;
        Intrinsics.checkNotNullParameter(claimSubmissionActivity, "");
        claimSubmissionActivity.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivityClaimSubmissionBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = getString(R.string.title_claim_old_day_security);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        int i4 = cancel + 51;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i4 = 58224;
            int i5 = 0;
            while (i5 < 16) {
                int i6 = $11 + 101;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (((long) onTransact) ^ 8611973335120459638L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(notify);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c3 = (char) (47774 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int iAlpha = 468 - Color.alpha(i3);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, iAlpha, maximumDrawingCacheSize, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i10 = i5;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) d) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asBinder)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 47773), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 468, 13 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5 = i10 + 1;
                    int i11 = $11 + 13;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b = (byte) 0;
                byte b2 = b;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2323, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 44, -1312321721, false, $$i(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    private final void INotificationSideChannel() {
        String str;
        Pair pair;
        int i = 2 % 2;
        IndividualDataClaim individualDataClaim = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (individualDataClaim != null) {
            int i2 = cancel + 17;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
            str = individualDataClaim.MediaBrowserCompatMediaBrowserImplApi211;
        } else {
            int i4 = INotificationSideChannel + 47;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            str = null;
        }
        if (Intrinsics.areEqual(str, "Y")) {
            int i6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (i6 == 2) {
                Camera2CameraImplExternalSyntheticLambda3.Companion companion = Camera2CameraImplExternalSyntheticLambda3.INSTANCE;
                pair = TuplesKt.to("claim_step_second_ekyc", Camera2CameraImplExternalSyntheticLambda3.Companion.TuitionPaymentFragmentbindingInflater1());
            } else if (i6 != 3) {
                int i7 = cancel + 59;
                INotificationSideChannel = i7 % 128;
                int i8 = i7 % 2;
                if (i6 == 4) {
                    getExposureState.Companion bVar = getExposureState.INSTANCE;
                    pair = TuplesKt.to("claim_step_fourth_reactivation_bpu", getExposureState.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                } else if (i6 == 5) {
                    Camera2CameraImplExternalSyntheticLambda16.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraImplExternalSyntheticLambda16.INSTANCE;
                    pair = TuplesKt.to("claim_step_fifth_info_benefit_detail", Camera2CameraImplExternalSyntheticLambda16.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                } else if (i6 != 6) {
                    reopenCameraAfterError.Companion bVar2 = reopenCameraAfterError.INSTANCE;
                    reopenCameraAfterError reopencameraaftererrorTuitionPaymentFragmentbindingInflater1 = reopenCameraAfterError.Companion.TuitionPaymentFragmentbindingInflater1();
                    onTransact();
                    pair = TuplesKt.to("claim_step_first_verify_data_primer", reopencameraaftererrorTuitionPaymentFragmentbindingInflater1);
                } else {
                    lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl.Companion tuitionPaymentFragmentbindingInflater1 = lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl.INSTANCE;
                    pair = TuplesKt.to("claim_step_sixth_confirmation", lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                }
            } else {
                openCaptureSession.Companion companion2 = openCaptureSession.INSTANCE;
                pair = TuplesKt.to("claim_step_third_fill_npwp_bank_account", openCaptureSession.Companion.TuitionPaymentFragmentbindingInflater1());
            }
        } else {
            int i9 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (i9 == 2) {
                Camera2CameraImplExternalSyntheticLambda3.Companion companion3 = Camera2CameraImplExternalSyntheticLambda3.INSTANCE;
                pair = TuplesKt.to("claim_step_second_ekyc", Camera2CameraImplExternalSyntheticLambda3.Companion.TuitionPaymentFragmentbindingInflater1());
            } else if (i9 != 3) {
                int i10 = cancel;
                int i11 = i10 + 97;
                INotificationSideChannel = i11 % 128;
                if (i11 % 2 == 0 ? i9 == 4 : i9 == 2) {
                    Camera2CameraImplExternalSyntheticLambda16.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2CameraImplExternalSyntheticLambda16.INSTANCE;
                    pair = TuplesKt.to("claim_step_fourth_info_benefit_detail", Camera2CameraImplExternalSyntheticLambda16.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                } else if (i9 != 5) {
                    int i12 = i10 + 97;
                    INotificationSideChannel = i12 % 128;
                    int i13 = i12 % 2;
                    reopenCameraAfterError.Companion bVar3 = reopenCameraAfterError.INSTANCE;
                    reopenCameraAfterError reopencameraaftererrorTuitionPaymentFragmentbindingInflater2 = reopenCameraAfterError.Companion.TuitionPaymentFragmentbindingInflater1();
                    onTransact();
                    pair = TuplesKt.to("claim_step_first_verify_data_primer", reopencameraaftererrorTuitionPaymentFragmentbindingInflater2);
                } else {
                    lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl.Companion tuitionPaymentFragmentbindingInflater2 = lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl.INSTANCE;
                    pair = TuplesKt.to("claim_step_fifth_confirmation", lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                }
            } else {
                openCaptureSession.Companion companion4 = openCaptureSession.INSTANCE;
                pair = TuplesKt.to("claim_step_third_fill_npwp_bank_account", openCaptureSession.Companion.TuitionPaymentFragmentbindingInflater1());
            }
        }
        String str2 = (String) pair.component1();
        LifecycleCameraRepository lifecycleCameraRepository = (LifecycleCameraRepository) pair.component2();
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("params_step_claim_jht", str2));
        Intrinsics.checkNotNullParameter(this, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, mapMutableMapOf);
        this.b.beginTransaction().add(R.id.claimSubmissionContainer, lifecycleCameraRepository).addToBackStack(null).commit();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int p0) {
        String str;
        Map mapMapOf;
        int i = 2 % 2;
        int i2 = cancel;
        int i3 = i2 + 13;
        INotificationSideChannel = i3 % 128;
        int i4 = i3 % 2;
        IndividualDataClaim individualDataClaim = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object obj = null;
        if (individualDataClaim == null) {
            int i5 = i2 + 117;
            INotificationSideChannel = i5 % 128;
            int i6 = i5 % 2;
            str = null;
        } else {
            str = individualDataClaim.MediaBrowserCompatMediaBrowserImplApi211;
        }
        if (Intrinsics.areEqual(str, "Y")) {
            this.TuitionPaymentFragmentbindingInflater1 = 6;
            mapMapOf = MapsKt.mapOf(TuplesKt.to(2, getString(R.string.label_member_verification_biometric)), TuplesKt.to(3, getString(R.string.label_claim_fund_process)), TuplesKt.to(4, getString(R.string.title_reactivation)), TuplesKt.to(5, getString(R.string.label_member_balance)), TuplesKt.to(6, getString(R.string.label_old_day_security_claim_confirmation)));
        } else {
            this.TuitionPaymentFragmentbindingInflater1 = 5;
            mapMapOf = MapsKt.mapOf(TuplesKt.to(2, getString(R.string.label_member_verification_biometric)), TuplesKt.to(3, getString(R.string.label_claim_fund_process)), TuplesKt.to(4, getString(R.string.label_member_balance)), TuplesKt.to(5, getString(R.string.label_old_day_security_claim_confirmation)));
        }
        LayoutRegistrationProgressBinding layoutRegistrationProgressBinding = this.a;
        if (layoutRegistrationProgressBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            layoutRegistrationProgressBinding = null;
        }
        layoutRegistrationProgressBinding.sbRegisterProgression.setProgress((100 / this.TuitionPaymentFragmentbindingInflater1) * p0);
        TextView textView = layoutRegistrationProgressBinding.tvStepNumber;
        int i7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i8 = this.TuitionPaymentFragmentbindingInflater1;
        StringBuilder sb = new StringBuilder();
        sb.append(i7);
        sb.append("/");
        sb.append(i8);
        textView.setText(sb.toString());
        TextView textView2 = layoutRegistrationProgressBinding.tvRegistrationStep;
        String string = (String) mapMapOf.get(Integer.valueOf(p0));
        if (string == null) {
            int i9 = INotificationSideChannel + 55;
            cancel = i9 % 128;
            if (i9 % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(getString(R.string.label_asik_data_membership), "");
                obj.hashCode();
                throw null;
            }
            string = getString(R.string.label_asik_data_membership);
            Intrinsics.checkNotNullExpressionValue(string, "");
        }
        textView2.setText(string);
    }

    private final void onTransact() {
        IndividualDataClaim individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i = 2 % 2;
        IndividualDataClaim individualDataClaim = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (individualDataClaim != null) {
            int i2 = INotificationSideChannel + 15;
            cancel = i2 % 128;
            int i3 = i2 % 2;
            String string = Settings.Secure.getString(getContentResolver(), "android_id");
            Intrinsics.checkNotNullExpressionValue(string, "");
            individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, string, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -1, -257, 127, null);
            int i4 = cancel + 79;
            INotificationSideChannel = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 3;
            }
        } else {
            individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        }
        if (individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            int i6 = INotificationSideChannel + 71;
            cancel = i6 % 128;
            int i7 = i6 % 2;
            getExtendedConfig getextendedconfig = (getExtendedConfig) this.d.getValue();
            Intrinsics.checkNotNullParameter(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
            getextendedconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setValue(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i8 = INotificationSideChannel + 75;
            cancel = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i2 = INotificationSideChannel + 19;
                cancel = i2 % 128;
                if (i2 % 2 == 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    throw null;
                }
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i3 = cancel + 75;
            INotificationSideChannel = i3 % 128;
            int i4 = i3 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = cancel + 71;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        int iB = getSessionConfigTemplateType.b();
        int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1609378667;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(iB, new Object[]{this}, -259879576, zzee.b(), getSessionConfigTemplateType.b(), 259879576, i4);
        int i5 = cancel + 65;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        BufferProviderState bufferProviderState = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (bufferProviderState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bufferProviderState = null;
        }
        if (!bufferProviderState.isDisposed()) {
            BufferProviderState bufferProviderState2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (bufferProviderState2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                bufferProviderState2 = null;
            }
            bufferProviderState2.dispose();
            int i2 = cancel + 123;
            INotificationSideChannel = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 % 2;
            }
        }
        super.onDestroy();
        int i4 = cancel + 67;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        ClaimSubmissionActivity claimSubmissionActivity = (ClaimSubmissionActivity) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 15;
        cancel = i2 % 128;
        if (i2 % 2 != 0 ? claimSubmissionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 1 : claimSubmissionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 0) {
            claimSubmissionActivity.b.popBackStack();
            int i3 = claimSubmissionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - 1;
            claimSubmissionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
            claimSubmissionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
            return null;
        }
        claimSubmissionActivity.d_();
        int i4 = cancel + 29;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 37;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
            int size = View.MeasureSpec.getSize(0) + 1031;
            int i4 = 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            byte b = $$a[7];
            short s = b;
            Object[] objArr2 = new Object[1];
            c(s, (byte) (s | 52), b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, size, i4, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{23422, 25344, 29874, 29850, 51894, 25498, 23293, 27554, 64783, 23490, 21910, 46716, 53417, 39427, 39116, 48750, 13356, 35961, 46933, 42782, 41579, 17695, 28874, 65255}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.add_card_message).substring(14, 16).length() + 20, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{22732, 21560, 32523, 60628, 62020, 27343, 35469, 45894, 28867, 21161, 60418, 30992, 19474, 46642, 25542, 51978, 58139, 24237}, 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
            int i5 = 1032 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int packedPositionGroup = 15 - ExpandableListView.getPackedPositionGroup(0L);
            short s2 = (short) 52;
            Object[] objArr5 = new Object[1];
            c(s2, (byte) s2, $$a[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask, i5, packedPositionGroup, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = INotificationSideChannel + 13;
            cancel = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int scrollBarFadeDuration = 1031 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 15;
                byte[] bArr = $$a;
                Object[] objArr6 = new Object[1];
                c((short) 104, bArr[7], bArr[132], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, scrollBarFadeDuration, iIndexOf, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i8 = ((int[]) objArr7[3])[0];
            int i9 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i10 = (((-32342713) + (((~iElapsedRealtime) | 531862906) * 1444)) + (((~(iElapsedRealtime | (-680940814))) | ((~(925220983 | iElapsedRealtime)) | 143791368)) * (-1444))) - 1795543398;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
            int i13 = cancel + 49;
            INotificationSideChannel = i13 % 128;
            int i14 = i13 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{8378, 26, 51340, 62348, 55551, 51248, 64921, 51231, 59924, 28890, 58001, 32706, 2156, 15195, 64923, 32204, 33682, 45148}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 96, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{55296, 40191, 4522, 41260, 61586, 42285, 9951, 60993, 62279, 3055, 52661, 3862, 57149, 29093, 55580, 42147, 40220, 59473}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.failed_to_get_bank_point).substring(1, 2).codePointAt(0) - 81, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {27799049};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 46039), 1134 - (ViewConfiguration.getJumpTapTimeout() >> 16), 18 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -42613888, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1031;
                    int iKeyCodeFromString = 15 - KeyEvent.keyCodeFromString("");
                    byte b2 = $$a[7];
                    short s3 = b2;
                    Object[] objArr12 = new Object[1];
                    c(s3, (byte) (s3 | 52), b2, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(doubleTapTimeout, touchSlop, iKeyCodeFromString, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 45993), View.MeasureSpec.getSize(0) + 1117, TextUtils.lastIndexOf("", '0', 0) + 18), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                    int i15 = 1032 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int i16 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14;
                    byte[] bArr2 = $$a;
                    Object[] objArr13 = new Object[1];
                    c((short) 104, bArr2[7], bArr2[132], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetAfter, i15, i16, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{23422, 25344, 29874, 29850, 51894, 25498, 23293, 27554, 64783, 23490, 21910, 46716, 53417, 39427, 39116, 48750, 13356, 35961, 46933, 42782, 41579, 17695, 28874, 65255}, 22 - TextUtils.getCapsMode("", 0, 0), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{22732, 21560, 32523, 60628, 62020, 27343, 35469, 45894, 28867, 21161, 60418, 30992, 19474, 46642, 25542, 51978, 58139, 24237}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_delete_message).substring(1, 2).length() + 14, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1031;
                        int i17 = 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        short s4 = (short) 52;
                        Object[] objArr16 = new Object[1];
                        c(s4, (byte) s4, $$a[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf2, scrollDefaultDelay, i17, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c2 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1031;
                        int i18 = 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte b3 = $$a[7];
                        short s5 = b3;
                        Object[] objArr17 = new Object[1];
                        c(s5, (byte) (s5 | 52), b3, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, offsetBefore, i18, 1357589585, false, (String) objArr17[0], null);
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
        int i19 = ((int[]) objArr[1])[0];
        int i20 = ((int[]) objArr[3])[0];
        if (i20 == i19) {
            int i21 = cancel + 119;
            INotificationSideChannel = i21 % 128;
            int i22 = i21 % 2;
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i23 = ((int[]) objArr[2])[0];
            int i24 = ((int[]) objArr[3])[0];
            int i25 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i26 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 1809173561);
            int i27 = i23 + 1035448836 + (((~((-1664657) | i26)) | (-242615514)) * (-983)) + (((~(i26 | (-242615514))) | 241565769) * 983);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr18[2])[0] = i29 ^ (i29 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i30 = cancel + 99;
                INotificationSideChannel = i30 % 128;
                int i31 = i30 % 2;
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i20];
            int i32 = i20 - 1;
            iArr[i32] = 1;
            Toast.makeText((Context) null, iArr[((i20 * i32) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i33 = ((int[]) objArr[2])[0];
            int i34 = ((int[]) objArr[3])[0];
            int i35 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 89388043;
            int i36 = (-535829503) + ((~(iCodePointAt | 130276329)) * 216);
            int i37 = ~iCodePointAt;
            int i38 = i33 + i36 + (((-525313) | i37) * (-216)) + (((~(i37 | 130276329)) | 114003840) * 216);
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr19[2])[0] = i40 ^ (i40 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char fadingEdgeLength = (char) (29944 - (ViewConfiguration.getFadingEdgeLength() >> 16));
            int scrollBarFadeDuration2 = 1755 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int scrollBarFadeDuration3 = 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            Object[] objArr20 = new Object[1];
            c((short) 104, (byte) 37, $$a[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(fadingEdgeLength, scrollBarFadeDuration2, scrollBarFadeDuration3, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i41 = cancel + 71;
            INotificationSideChannel = i41 % 128;
            int i42 = i41 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0));
                int iResolveSizeAndState = 1755 - View.resolveSizeAndState(0, 0, 0);
                int i43 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                short s6 = (short) 52;
                Object[] objArr21 = new Object[1];
                c(s6, (byte) s6, $$a[7], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cLastIndexOf, iResolveSizeAndState, i43, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iMyPid = Process.myPid();
            int i44 = ~iMyPid;
            int i45 = (((((~(638411809 | i44)) | (~((-851014236) | iMyPid))) | (~(i44 | 851014235))) * 959) - 1994960174) + (((~(iMyPid | 851014235)) | (~(i44 | (-851014236))) | (~(638411809 | iMyPid))) * 959) + 39008021;
            int i46 = (i45 << 13) ^ i45;
            int i47 = i46 ^ (i46 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i47 ^ (i47 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{8378, 26, 51340, 62348, 55551, 51248, 64921, 51231, 59924, 28890, 58001, 32706, 2156, 15195, 64923, 32204, 33682, 45148}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{55296, 40191, 4522, 41260, 61586, 42285, 9951, 60993, 62279, 3055, 52661, 3862, 57149, 29093, 55580, 42147, 40220, 59473}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {27799049};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (Color.red(0) + 42049), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1726, 29 - TextUtils.getTrimmedLength(""), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = MediaSessionCompat.MediaSessionImplBase.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 39008021);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0') + 29945);
                int iRgb = Color.rgb(0, 0, 0) + 16778971;
                int packedPositionGroup2 = 23 - ExpandableListView.getPackedPositionGroup(0L);
                short s7 = (short) 52;
                Object[] objArr26 = new Object[1];
                c(s7, (byte) s7, $$a[7], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cLastIndexOf2, iRgb, packedPositionGroup2, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{23422, 25344, 29874, 29850, 51894, 25498, 23293, 27554, 64783, 23490, 21910, 46716, 53417, 39427, 39116, 48750, 13356, 35961, 46933, 42782, 41579, 17695, 28874, 65255}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 85, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{22732, 21560, 32523, 60628, 62020, 27343, 35469, 45894, 28867, 21161, 60418, 30992, 19474, 46642, 25542, 51978, 58139, 24237}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 100, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c3 = (char) (29945 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 1756;
                    int i48 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22;
                    Object[] objArr29 = new Object[1];
                    c((short) 141, (byte) 52, $$a[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c3, modifierMetaStateMask2, i48, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char gidForName = (char) (29943 - Process.getGidForName(""));
                    int iIndexOf2 = TextUtils.indexOf("", "", 0) + 1755;
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 23;
                    Object[] objArr30 = new Object[1];
                    c((short) 104, (byte) 37, $$a[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(gidForName, iIndexOf2, packedPositionType, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i49 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i50 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i50 != i49) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr5 != null) {
                for (String str2 : strArr5) {
                    int i51 = cancel + 123;
                    INotificationSideChannel = i51 % 128;
                    int i52 = i51 % 2;
                    arrayList2.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i50));
        }
        int i53 = cancel + 29;
        INotificationSideChannel = i53 % 128;
        int i54 = i53 % 2;
        int i55 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i56 = ~iIdentityHashCode;
        int i57 = i55 + 810746350 + (((~(i56 | (-170436746))) | 383039171) * (-1042)) + (((-170436746) | iIdentityHashCode) * 521) + (((~(iIdentityHashCode | (-383039172))) | 349443650 | (~(i56 | (-136841225)))) * 521);
        int i58 = (i57 << 13) ^ i57;
        int i59 = i58 ^ (i58 >>> 17);
        ((int[]) objArr31[3])[0] = i59 ^ (i59 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 55;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        if (i4 != ((((~(i5 | 26907215)) | (-856894759)) * 56) - 1331206808) + (((~((~i5) | (-856894759))) | 26907215) * 56)) {
            throw null;
        }
        int i6 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        if (i6 != (-123785701) + (((~((~i7) | (-783263804))) | 1795792161) * (-235)) + (((~((-783263804) | i7)) | 1795792161) * (-470)) + (((~(i7 | (-77996059))) | 1090524416) * 235)) {
            throw new RuntimeException("1760159826");
        }
        super.onResume();
        int i8 = cancel + 13;
        INotificationSideChannel = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = cancel + 51;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        int i6 = (~((-797390370) | i5)) | 251667969;
        if (i4 != (-1473026136) + (i6 * 992) + ((i6 | (~((~i5) | (-1081655513)))) * (-496)) + ((i5 | (-1627377913)) * 496)) {
            int i7 = cancel + 103;
            INotificationSideChannel = i7 % 128;
            int i8 = i7 % 2;
            int[] iArr = new int[1784710383];
            iArr[1784710382] = 1;
            int i9 = 2045170226 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i10 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iNextInt = new Random().nextInt(996479804);
        int i11 = ~iNextInt;
        if (i10 != (-1395971716) + (((~((-1004112780) | i11)) | 433686913 | (~((-1574943186) | i11))) * (-1136)) + (((~((-1004112780) | iNextInt)) | (~((-1574943186) | iNextInt)) | (~(2145369051 | i11))) * (-568)) + (((~(iNextInt | (-433686914))) | (~(i11 | 1574943185)) | (~(1004112779 | i11))) * 568)) {
            throw null;
        }
        super.onStart();
        int i12 = cancel + 77;
        INotificationSideChannel = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 23 / 0;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ClaimSubmissionActivity claimSubmissionActivity, View view) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 97;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                Object[] objArr = {claimSubmissionActivity};
                int iB = getSessionConfigTemplateType.b();
                int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1609378667;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(iB, objArr, -259879576, zzee.b(), getSessionConfigTemplateType.b(), 259879576, i4);
                ViewPortBuilder.b();
                throw null;
            }
            Object[] objArr2 = {claimSubmissionActivity};
            int iB2 = getSessionConfigTemplateType.b();
            int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1609378667;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(iB2, objArr2, -259879576, zzee.b(), getSessionConfigTemplateType.b(), 259879576, i5);
            ViewPortBuilder.b();
            int i6 = cancel + 39;
            INotificationSideChannel = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public static /* synthetic */ Unit b(ClaimSubmissionActivity claimSubmissionActivity, lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = cancel + 49;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            if (lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                if (lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol.TuitionPaymentFragmentbindingInflater1 == null) {
                    int i3 = cancel + 93;
                    INotificationSideChannel = i3 % 128;
                    int i4 = i3 % 2;
                    int iB = getSessionConfigTemplateType.b();
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1(iB, new Object[]{claimSubmissionActivity}, -259879576, zzee.b(), getSessionConfigTemplateType.b(), 259879576, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1609378667);
                    int i5 = INotificationSideChannel + 67;
                    cancel = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
            return Unit.INSTANCE;
        }
        int i7 = 46 / 0;
        if (lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            if (lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol.TuitionPaymentFragmentbindingInflater1 == null) {
                int i8 = cancel + 93;
                INotificationSideChannel = i8 % 128;
                int i9 = i8 % 2;
                int iB2 = getSessionConfigTemplateType.b();
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(iB2, new Object[]{claimSubmissionActivity}, -259879576, zzee.b(), getSessionConfigTemplateType.b(), 259879576, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1609378667);
                int i10 = INotificationSideChannel + 67;
                cancel = i10 % 128;
                int i11 = i10 % 2;
            }
        }
        return Unit.INSTANCE;
        IndividualDataClaim individualDataClaim = lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol.TuitionPaymentFragmentbindingInflater1;
        if (individualDataClaim != null) {
            int i12 = INotificationSideChannel + 17;
            cancel = i12 % 128;
            int i13 = i12 % 2;
            getExtendedConfig getextendedconfig = (getExtendedConfig) claimSubmissionActivity.d.getValue();
            Intrinsics.checkNotNullParameter(individualDataClaim, "");
            getextendedconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setValue(individualDataClaim);
        }
        claimSubmissionActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
        claimSubmissionActivity.INotificationSideChannel();
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 15;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke(obj);
            return null;
        }
        function1.invoke(obj);
        throw null;
    }

    public static /* synthetic */ boolean g() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 81;
        cancel = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 117;
        cancel = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) throws IllegalAccessException {
        int iB = zzee.b();
        int iB2 = zzee.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(iB, new Object[]{function1, obj}, 1898289066, zzee.b(), zzee.b(), -1898289064, iB2);
    }

    static {
        cancelAll = 0;
        cancelAll();
        INSTANCE = new Companion(null);
        int i = RemoteActionCompatParcelizer + 55;
        cancelAll = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 35;
        int i3 = i2 % 128;
        cancel = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 117;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 == 0) {
            return R.layout.activity_claim_submission;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void RemoteActionCompatParcelizer() throws IllegalAccessException {
        int iB = getSessionConfigTemplateType.b();
        int i = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1609378667;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(iB, new Object[]{this}, -259879576, zzee.b(), getSessionConfigTemplateType.b(), 259879576, i);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 33;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = cancel + 37;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1450301419, new Object[]{this, bundle}, 1892365485, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto5).substring(8, 9).length() - 1915753622, getSessionConfigTemplateType.b(), -1892365482, (-655906817) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_at_atm).substring(4, 5).length());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() throws IllegalAccessException {
        int iB = getSessionConfigTemplateType.b();
        int iB2 = zzee.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(iB, new Object[]{this}, -2052708325, zzee.b(), zzee.b(), 2052708326, iB2);
    }

    static void cancelAll() {
        d = (char) 47167;
        asBinder = (char) 6374;
        onTransact = (char) 54238;
        notify = (char) 29412;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, short r7, byte r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimSubmissionActivity.$$c
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r1 = r7 + 1
            int r8 = r8 * 4
            int r8 = 108 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2a
        L17:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            int r3 = r3 + 1
            r4 = r0[r8]
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            int r8 = r8 + 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimSubmissionActivity.$$i(short, short, byte):java.lang.String");
    }
}
