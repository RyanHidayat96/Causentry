package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelStoreOwner;
import com.bpjstku.R;
import com.bpjstku.data.jht.model.request.JhtInstantClaimRequest;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.databinding.FragmentClaimOldDataSecurityConfirmationBinding;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.jht.model.JhtClaimEligibility;
import com.bpjstku.presentation.main.MainActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDataSecurityConfirmationFragment$bindingInflater$1;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.model.IndividualDataClaim;
import com.bpjstku.util.utils.LocationAddressInfo;
import com.bpjstku.util.utils.UserLocationComplete;
import com.google.android.material.button.MaterialButton;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.Camera2CameraControlImplExternalSyntheticLambda4;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.getExtendedConfig;
import defpackage.getFocusY;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.io.File;
import java.io.IOException;
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
import kotlin.io.FilesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0013B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u0005R\u0015\u0010\f\u001a\u00020\u000f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0013\u001a\u00020\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0015\u0010\u0015\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0017\u0010\n\u001a\u0004\u0018\u00010\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\u001d8\u0015X\u0095D¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR.\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00020 8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010$"}, d2 = {"LlambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentClaimOldDataSecurityConfirmationBinding;", "LgetStringOrNull$b;", "<init>", "()V", "", "cancelAll", "b_", "onTransact", "g", "cancel", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "INotificationSideChannel", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LCamera2CameraControlImplExternalSyntheticLambda4;", "a", "Lkotlin/Lazy;", "Lcom/bpjstku/data/lib/PreferenceManager;", "TuitionPaymentFragmentbindingInflater1", "LgetExtendedConfig;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "Ljava/lang/String;", "b", "asInterface", "asBinder", "d", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/model/IndividualDataClaim;", "", "I", "()I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl extends AutoValue_CameraState_StateError<FragmentClaimOldDataSecurityConfirmationBinding> implements getStringOrNull.b {
    private static final byte[] $$a = {30, 17, -35, 104, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 134;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private String asBinder;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String a;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String asInterface;
    private final int cancel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy g;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    private static void c(int i, short s, int i2, Object[] objArr) {
        int i3 = s * 4;
        int i4 = (i2 * 4) + 4;
        int i5 = 84 - (i * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 53];
        int i6 = i3 + 52;
        int i7 = -1;
        if (bArr == null) {
            i4++;
            i5 = (i5 + (-i6)) - 11;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i4++;
                i5 = (i5 + (-bArr[i4])) - 11;
            }
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void b_() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    public lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl() {
        final lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<Camera2CameraControlImplExternalSyntheticLambda4>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDataSecurityConfirmationFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [Camera2CameraControlImplExternalSyntheticLambda4, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Camera2CameraControlImplExternalSyntheticLambda4 invoke() {
                LifecycleOwner lifecycleOwner = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Camera2CameraControlImplExternalSyntheticLambda4.class);
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
        final lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl2 = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDataSecurityConfirmationFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl3 = this;
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDataSecurityConfirmationFragment$special$$inlined$sharedViewModel$default$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner invoke() {
                FragmentActivity activity = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl3.getActivity();
                if (activity != null) {
                    return activity;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
            }

            {
                super(0);
            }
        };
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<getExtendedConfig>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDataSecurityConfirmationFragment$special$$inlined$sharedViewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, getExtendedConfig] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getExtendedConfig invoke() {
                return getFocusY.b(lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl3, Reflection.getOrCreateKotlinClass(getExtendedConfig.class), this.$qualifier, function0, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.g = LazyKt.lazy(new Function0() { // from class: onUseCaseActive
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((getExtendedConfig) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            }
        });
        this.cancel = R.layout.fragment_claim_old_data_security_confirmation;
    }

    public static final /* synthetic */ FragmentClaimOldDataSecurityConfirmationBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl) {
        return lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.asInterface();
    }

    /* JADX INFO: renamed from: lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LlambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "LlambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()LlambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return new lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getCancel() {
        return this.cancel;
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentClaimOldDataSecurityConfirmationBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return ClaimOldDataSecurityConfirmationFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements getCameraState.TuitionPaymentFragmentbindingInflater1 {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {63, 56, -36, -117, -27, -9, 11, -10, 20, 27, -24, 18, -28, 14, 0};
        private static final int $$e = 90;
        private static final byte[] $$a = {29, -5, -24, -13, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
        private static final int $$b = 139;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int b = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 5323277270355944256L;

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 14
                int r7 = r7 + 84
                int r8 = r8 * 52
                int r0 = 53 - r8
                int r6 = r6 * 52
                int r6 = 55 - r6
                byte[] r1 = lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$a
                byte[] r0 = new byte[r0]
                int r8 = 52 - r8
                r2 = 0
                if (r1 != 0) goto L19
                r3 = r7
                r4 = r2
                r7 = r6
                goto L32
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r7
                int r6 = r6 + 1
                r0[r3] = r4
                if (r3 != r8) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L29:
                int r3 = r3 + 1
                r4 = r1[r6]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L32:
                int r3 = r3 + r6
                int r6 = r3 + (-11)
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1.a(int, byte, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(byte r5, byte r6, byte r7, java.lang.Object[] r8) {
            /*
                int r6 = r6 * 11
                int r6 = r6 + 1
                int r5 = r5 * 31
                int r5 = 98 - r5
                int r7 = r7 * 11
                int r7 = r7 + 4
                byte[] r0 = lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$d
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L16
                r4 = r6
                r3 = r2
                goto L28
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r5
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L26:
                r4 = r0[r7]
            L28:
                int r4 = -r4
                int r7 = r7 + 1
                int r5 = r5 + r4
                int r5 = r5 + 3
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1.d(byte, byte, byte, java.lang.Object[]):void");
        }

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
            getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i3 = $10 + 17;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-16757744) - Color.rgb(0, 0, 0)), (ViewConfiguration.getTouchSlop() >> 8) + 2624, 13 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() * (9053247990562531611L | TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-16737794) - Color.rgb(0, 0, 0)), (Process.myPid() >> 22) + 481, (Process.myPid() >> 22) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i5 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19472 - (KeyEvent.getMaxKeyCode() >> 16)), 2624 - Gravity.getAbsoluteGravity(0, 0), TextUtils.lastIndexOf("", '0', 0) + 14, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                        Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - Drawable.resolveOpacity(0, 0)), (ViewConfiguration.getTapTimeout() >> 16) + 481, 37 - (ViewConfiguration.getEdgeSlop() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            char[] cArr2 = new char[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i6 = $11 + 73;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 39422), 481 - KeyEvent.getDeadChar(0, 0), 37 - View.MeasureSpec.getMode(0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    throw null;
                }
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr7 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (39422 - Color.green(0)), 481 - KeyEvent.keyCodeFromString(""), 37 - Color.blue(0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
            objArr[0] = new String(cArr2);
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // getCameraState.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char offsetAfter = (char) (37567 - TextUtils.getOffsetAfter("", 0));
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 625;
                int i2 = 14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                byte b2 = (byte) (-$$a[5]);
                byte b3 = b2;
                Object[] objArr2 = new Object[1];
                a(b2, b3, b3, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter, edgeSlop, i2, -477065106, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{35386, 4668, 47661, 16946, 59920, 29215, 6665, 41546, 19068, 53881, 31279, 619, 43598, 12893, 55889, 25273, 2726, 37505, 14997, 49823, 27276, 62093}, 38921 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{35390, 41418, 56768, 2524, 9692, 20943, 36305, 47586, 54742, 479, 15829, 27120, 34286, 45551, 60904}, TextUtils.getCapsMode("", 0, 0) + 11261, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char gidForName = (char) (Process.getGidForName("") + 37568);
                int iIndexOf = TextUtils.indexOf("", "") + 625;
                int iLastIndexOf = 13 - TextUtils.lastIndexOf("", '0', 0, 0);
                byte[] bArr = $$a;
                byte b4 = (byte) (-bArr[5]);
                byte b5 = bArr[7];
                Object[] objArr5 = new Object[1];
                a(b4, b5, b5, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName, iIndexOf, iLastIndexOf, -976899241, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 37567);
                    int iArgb = Color.argb(0, 0, 0, 0) + 625;
                    int minimumFlingVelocity = 14 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte b6 = $$a[7];
                    byte b7 = b6;
                    Object[] objArr6 = new Object[1];
                    a(b6, b7, b7, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatDelay, iArgb, minimumFlingVelocity, -973632554, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i3 = ((int[]) objArr7[2])[0];
                int i4 = ((int[]) objArr7[0])[0];
                String[] strArr = (String[]) objArr7[3];
                int iIdentityHashCode = System.identityHashCode(this);
                int i5 = ~iIdentityHashCode;
                int i6 = (((196458960 + (((~((-916581978) | i5)) | 907156143) * 519)) + (((~(i5 | (-10609745))) | (~(917765887 | iIdentityHashCode))) * (-519))) + (((~(iIdentityHashCode | 907156143)) | 916581977) * 519)) - 1115693888;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
                objArr = new Object[]{new int[]{i4}, new int[1], new int[]{i3}, strArr};
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{35386, 31266, 27153, 23148, 19048, 14913, 10933, 6868, 2690, 64228, 60109, 55944, 51982, 47891, 43885, 39787, 35677, 31669, 27569, 23447, 19395, 15312, 11219, 6191, 2066, 63488}, 61463 - Color.red(0), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{35384, 35275, 36323, 33158, 34218, 39244, 40305, 37209, 38147, 43302, 44229, 41189, 42116, 47259, 48297, 45145, 46180, 51200}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 997, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                c(new char[]{35377, 7685, 41555, 13959, 55945, 28428, 62272, 34700, 11204, 48194, 16510, 54423, 30940, 3356, 37196, 9607}, 37952 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new char[]{35378, 5322, 47060, 22250, 61947, 37115, 13201, 53905, 32187, 7335, 49082, 24244, 63844, 38981, 15193, 55909}, 40693 - Color.argb(0, 0, 0, 0), objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr12 = new Object[1];
                c(new char[]{35433, 33897, 38547, 41279, 45926, 52618, 56375, 60940, 63706, 2866, 1371, 6099, 9770, 12373, 17144, 23927, 28444, 31149, 34931, 39499, 38050, 42831, 45334, 50152, 53782, 60435, 65263, 2375, 7148, 5604, 9309, 14059, 16514, 21261, 28135, 32647, 36438, 39161, 43657, 42363, 47013, 49537, 53289, 58110, 64713, 3957, 6602, 11159, 14954, 13516, 18077, 20847, 25539, 29280, 35891, 40584, 43370, 47932, 46553, 50228, 54877, 57478, 62331, 3408}, 3671 - (Process.myPid() >> 22), objArr12);
                String str = (String) objArr12[0];
                Object[] objArr13 = new Object[1];
                c(new char[]{35384, 22245, 13185, 7408, 63767, 55861, 42755, 32885, 27846, 18922, 10973, 63404, 53322, 48442, 40463, 31614, 18329, 8359, 3523, 61157, 51970, 37927, 28951, 21092, 16081, 7080, 58527, 49639, 41484, 36641, 26688, 13666, 4482, 62086, 57328, 47127, 34099, 26117, 17184, 12176, 2225, 54665, 46763, 37656, 31800, 22876, 14970, 1689, 58290, 52375, 43500, 35343, 22389, 12356, 7522, 63872, 56048, 42906, 33007, 27914, 20094, 11080, 62575, 53468}, 56542 - Process.getGidForName(""), objArr13);
                String[] strArr2 = {str, (String) objArr13[0]};
                int i9 = b + 23;
                TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, -1115693888};
                    byte[] bArr2 = $$d;
                    byte b8 = bArr2[14];
                    byte b9 = (byte) (b8 + 1);
                    Object[] objArr15 = new Object[1];
                    d(b9, b9, b8, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    byte b10 = bArr2[14];
                    byte b11 = b10;
                    Object[] objArr16 = new Object[1];
                    d(b10, b11, (byte) (b11 + 1), objArr16);
                    Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                    int i11 = ((int[]) objArr17[0])[0];
                    int i12 = ((int[]) objArr17[2])[0];
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cBlue = (char) (Color.blue(0) + 37567);
                            int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 625;
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 14;
                            byte b12 = $$a[7];
                            byte b13 = b12;
                            Object[] objArr18 = new Object[1];
                            a(b12, b13, b13, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cBlue, offsetAfter2, longPressTimeout, -973632554, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                        try {
                            Object[] objArr19 = new Object[1];
                            c(new char[]{35386, 4668, 47661, 16946, 59920, 29215, 6665, 41546, 19068, 53881, 31279, 619, 43598, 12893, 55889, 25273, 2726, 37505, 14997, 49823, 27276, 62093}, 38920 - TextUtils.indexOf((CharSequence) "", '0'), objArr19);
                            Class<?> cls5 = Class.forName((String) objArr19[0]);
                            Object[] objArr20 = new Object[1];
                            c(new char[]{35390, 41418, 56768, 2524, 9692, 20943, 36305, 47586, 54742, 479, 15829, 27120, 34286, 45551, 60904}, 11262 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr20);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c = (char) (37568 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                int mode = View.MeasureSpec.getMode(0) + 625;
                                int i13 = 14 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                byte[] bArr3 = $$a;
                                byte b14 = (byte) (-bArr3[5]);
                                byte b15 = bArr3[7];
                                Object[] objArr21 = new Object[1];
                                a(b14, b15, b15, objArr21);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, mode, i13, -976899241, false, (String) objArr21[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 37567);
                                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 625;
                                int iBlue = Color.blue(0) + 14;
                                byte b16 = (byte) (-$$a[5]);
                                byte b17 = b16;
                                Object[] objArr22 = new Object[1];
                                a(b16, b17, b17, objArr22);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(jumpTapTimeout, keyRepeatTimeout, iBlue, -477065106, false, (String) objArr22[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr17;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i14 = ((int[]) objArr[0])[0];
            int i15 = ((int[]) objArr[2])[0];
            if (i15 == i14) {
                int i16 = ((int[]) objArr[1])[0];
                int i17 = ((int[]) objArr[2])[0];
                int i18 = ((int[]) objArr[0])[0];
                String[] strArr3 = (String[]) objArr[3];
                int[] iArr = {i17};
                int iNextInt = new Random().nextInt(196337090);
                int i19 = ~iNextInt;
                int i20 = i16 + 74980736 + (((-1109581829) | iNextInt) * (-676)) + (((~(634198267 | i19)) | 1109581828) * 676) + (((~(iNextInt | 1743780095)) | (~(i19 | (-1189539854))) | 79958025) * 676);
                int i21 = (i20 << 13) ^ i20;
                int i22 = i21 ^ (i21 >>> 17);
                ((int[]) objArr[1])[0] = i22 ^ (i22 << 5);
                Object[] objArr23 = {new int[]{i18}, new int[1], iArr, strArr3};
                int i23 = b;
                int i24 = i23 + 55;
                TuitionPaymentFragmentbindingInflater1 = i24 % 128;
                int i25 = i24 % 2;
                int i26 = i23 + 35;
                TuitionPaymentFragmentbindingInflater1 = i26 % 128;
                if (i26 % 2 == 0) {
                    lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl.TuitionPaymentFragmentbindingInflater1(lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl.this);
                    return;
                } else {
                    lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl.TuitionPaymentFragmentbindingInflater1(lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl.this);
                    int i27 = 76 / 0;
                    return;
                }
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr4 = (String[]) objArr[3];
            if (strArr4 != null) {
                for (String str2 : strArr4) {
                    arrayList.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i15));
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        final FragmentClaimOldDataSecurityConfirmationBinding fragmentClaimOldDataSecurityConfirmationBindingAsInterface = asInterface();
        MaterialButton materialButton = fragmentClaimOldDataSecurityConfirmationBindingAsInterface.btnConfirmation;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new isBound(new Function1() { // from class: resetCaptureSession
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(fragmentClaimOldDataSecurityConfirmationBindingAsInterface, this, (View) obj);
            }
        }));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        FragmentClaimOldDataSecurityConfirmationBinding fragmentClaimOldDataSecurityConfirmationBindingAsInterface = asInterface();
        IndividualDataClaim individualDataClaim = (IndividualDataClaim) this.g.getValue();
        if (individualDataClaim != null) {
            EditText editText = fragmentClaimOldDataSecurityConfirmationBindingAsInterface.tilClaim.getEditText();
            if (editText != null) {
                editText.setText(individualDataClaim.getServiceComponent);
            }
            EditText editText2 = fragmentClaimOldDataSecurityConfirmationBindingAsInterface.tilFullName.getEditText();
            if (editText2 != null) {
                String str = individualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Locale locale = Locale.ENGLISH;
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String upperCase = str.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                editText2.setText(upperCase);
            }
            EditText editText3 = fragmentClaimOldDataSecurityConfirmationBindingAsInterface.tilIdentityNumber.getEditText();
            if (editText3 != null) {
                editText3.setText(individualDataClaim.b);
            }
            EditText editText4 = fragmentClaimOldDataSecurityConfirmationBindingAsInterface.tilIdKpj.getEditText();
            if (editText4 != null) {
                editText4.setText(individualDataClaim.asBinder);
            }
            EditText editText5 = fragmentClaimOldDataSecurityConfirmationBindingAsInterface.tilNPWP.getEditText();
            if (editText5 != null) {
                editText5.setText(individualDataClaim.a);
            }
            EditText editText6 = fragmentClaimOldDataSecurityConfirmationBindingAsInterface.tilEmail.getEditText();
            if (editText6 != null) {
                editText6.setText(individualDataClaim.asInterface);
            }
            EditText editText7 = fragmentClaimOldDataSecurityConfirmationBindingAsInterface.tilPhoneNumber.getEditText();
            if (editText7 != null) {
                try {
                    strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(individualDataClaim.d);
                } catch (Exception unused) {
                    strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = "-";
                }
                editText7.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            fragmentClaimOldDataSecurityConfirmationBindingAsInterface.tvTransferVia.setText(getString(R.string.label_transfer_via_selected_new));
            EditText editText8 = fragmentClaimOldDataSecurityConfirmationBindingAsInterface.tilBankName.getEditText();
            if (editText8 != null) {
                String str2 = individualDataClaim.onTransact;
                Locale locale2 = Locale.ENGLISH;
                Intrinsics.checkNotNullExpressionValue(locale2, "");
                String upperCase2 = str2.toUpperCase(locale2);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                editText8.setText(upperCase2);
            }
            EditText editText9 = fragmentClaimOldDataSecurityConfirmationBindingAsInterface.tilBankAccountName.getEditText();
            if (editText9 != null) {
                String str3 = individualDataClaim.RemoteActionCompatParcelizer;
                Locale locale3 = Locale.ENGLISH;
                Intrinsics.checkNotNullExpressionValue(locale3, "");
                String upperCase3 = str3.toUpperCase(locale3);
                Intrinsics.checkNotNullExpressionValue(upperCase3, "");
                editText9.setText(upperCase3);
            }
            EditText editText10 = fragmentClaimOldDataSecurityConfirmationBindingAsInterface.tilBankAccountNumber.getEditText();
            if (editText10 != null) {
                editText10.setText(individualDataClaim.cancelAll);
            }
            EditText editText11 = fragmentClaimOldDataSecurityConfirmationBindingAsInterface.tilFinalBalance.getEditText();
            if (editText11 != null) {
                editText11.setText("Rp ".concat(String.valueOf(individualDataClaim.getSessionToken)));
            }
            if (Intrinsics.areEqual(individualDataClaim.run, "Y")) {
                fragmentClaimOldDataSecurityConfirmationBindingAsInterface.gbReactivation.setVisibility(0);
                EditText editText12 = fragmentClaimOldDataSecurityConfirmationBindingAsInterface.tilOccupationFirst.getEditText();
                if (editText12 != null) {
                    editText12.setText(individualDataClaim.onReceiveResult);
                }
                EditText editText13 = fragmentClaimOldDataSecurityConfirmationBindingAsInterface.tilOccupationSecond.getEditText();
                if (editText13 != null) {
                    editText13.setText(Intrinsics.areEqual(individualDataClaim.MediaBrowserCompatItemCallback, "null") ? "-" : individualDataClaim.MediaBrowserCompatItemCallback);
                }
                EditText editText14 = fragmentClaimOldDataSecurityConfirmationBindingAsInterface.tilCompanyLocation.getEditText();
                if (editText14 != null) {
                    editText14.setText(individualDataClaim.onItemLoaded);
                }
                EditText editText15 = fragmentClaimOldDataSecurityConfirmationBindingAsInterface.tilBpuFee.getEditText();
                if (editText15 != null) {
                    editText15.setText(individualDataClaim.MediaBrowserCompatMediaBrowserImpl);
                }
                EditText editText16 = fragmentClaimOldDataSecurityConfirmationBindingAsInterface.tilFamilyCardNumber.getEditText();
                if (editText16 != null) {
                    editText16.setText(individualDataClaim.onLoadChildren);
                    return;
                }
                return;
            }
            fragmentClaimOldDataSecurityConfirmationBindingAsInterface.gbReactivation.setVisibility(8);
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements getCameraState.TuitionPaymentFragmentbindingInflater1 {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // getCameraState.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            MaterialButton materialButton = lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl.this).btnConfirmation;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(true);
            File fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2CameraCoordinatorExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            if (fileTuitionPaymentFragmentspecialinlinedviewModeldefault1.exists()) {
                FilesKt.deleteRecursively(fileTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            MainActivity.Companion companion = MainActivity.INSTANCE;
            Context contextRequireContext = lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contextRequireContext, "CLAIM_JHT", null, 4);
        }
    }

    public static final class b implements getCameraState.TuitionPaymentFragmentbindingInflater1 {
        b() {
        }

        @Override // getCameraState.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
            Context contextRequireContext = lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0466  */
    /* JADX WARN: Code duplicated, block: B:103:0x0472  */
    /* JADX WARN: Code duplicated, block: B:104:0x0475  */
    /* JADX WARN: Code duplicated, block: B:107:0x0481  */
    /* JADX WARN: Code duplicated, block: B:108:0x0484  */
    /* JADX WARN: Code duplicated, block: B:111:0x0498  */
    /* JADX WARN: Code duplicated, block: B:112:0x049b  */
    /* JADX WARN: Code duplicated, block: B:115:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:116:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:119:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:120:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:147:0x03f2 A[EDGE_INSN: B:147:0x03f2->B:87:0x03f2 BREAK  A[LOOP:1: B:56:0x024f->B:69:0x02b0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x02b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x02ae A[EDGE_INSN: B:149:0x02ae->B:68:0x02ae BREAK  A[LOOP:2: B:62:0x0293->B:67:0x02aa], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:47:0x0105  */
    /* JADX WARN: Code duplicated, block: B:51:0x010f  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:58:0x0256  */
    /* JADX WARN: Code duplicated, block: B:60:0x025f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0298 A[LOOP:3: B:63:0x0294->B:65:0x0298, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x02aa A[LOOP:2: B:62:0x0293->B:67:0x02aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x02b0 A[LOOP:1: B:56:0x024f->B:69:0x02b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x02ed A[Catch: all -> 0x053b, TryCatch #0 {all -> 0x053b, blocks: (B:71:0x02d9, B:73:0x02ed, B:74:0x0319, B:76:0x034a, B:77:0x03bb), top: B:140:0x02d9 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x034a A[Catch: all -> 0x053b, TryCatch #0 {all -> 0x053b, blocks: (B:71:0x02d9, B:73:0x02ed, B:74:0x0319, B:76:0x034a, B:77:0x03bb), top: B:140:0x02d9 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x03dd A[LOOP:4: B:82:0x03dd->B:84:0x03e0, LOOP_START, PHI: r3
  0x03dd: PHI (r3v4 int) = (r3v0 int), (r3v5 int) binds: [B:81:0x03db, B:84:0x03e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x03e0 A[LOOP:4: B:82:0x03dd->B:84:0x03e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x040b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0417  */
    /* JADX WARN: Code duplicated, block: B:96:0x043b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0463  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(FragmentClaimOldDataSecurityConfirmationBinding fragmentClaimOldDataSecurityConfirmationBinding, lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl, View view) throws Throwable {
        String str;
        String str2;
        String str3;
        String str4;
        IndividualDataClaim individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i;
        long jLongValue;
        long j;
        int i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object[] objArr;
        int i3;
        int i4;
        ArrayList arrayList;
        String[] strArr;
        byte[] bArr;
        String strEncodeToString;
        JhtClaimEligibility jhtClaimEligibilityTuitionPaymentFragmentbindingInflater1;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        int i5;
        int i6;
        long j2;
        int i7;
        Intrinsics.checkNotNullParameter(view, "");
        if (fragmentClaimOldDataSecurityConfirmationBinding.cbAgreeTermCondition.isChecked()) {
            IndividualDataClaim individualDataClaim = (IndividualDataClaim) lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.g.getValue();
            if (individualDataClaim != null) {
                ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
                Context contextRequireContext = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                Intrinsics.checkNotNullParameter(contextRequireContext, "");
                if (!ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault3() || !ExperimentalCamera2Interop.b(contextRequireContext)) {
                    ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
                    if (ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                        getCameraState.Companion companion = getCameraState.INSTANCE;
                        String string = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.getString(R.string.action_information);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_blue, string, "Silakan berikan izin akses lokasi untuk melanjutkan pengajuan. Lokasi Anda diperlukan untuk verifikasi.", "Berikan Izin");
                        FragmentManager childFragmentManager = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                        Intrinsics.checkNotNullParameter(childFragmentManager, "");
                        if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                            getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                        getcamerastateB.g = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    } else {
                        getCameraState.Companion companion2 = getCameraState.INSTANCE;
                        String string2 = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.getString(R.string.action_information);
                        Intrinsics.checkNotNullExpressionValue(string2, "");
                        getCameraState getcamerastateB2 = getCameraState.Companion.b(R.drawable.ic_info_blue, string2, "Silakan aktifkan GPS/Location Services untuk melanjutkan pengajuan. Lokasi Anda diperlukan untuk verifikasi.", "Aktifkan GPS");
                        FragmentManager childFragmentManager2 = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                        Intrinsics.checkNotNullParameter(childFragmentManager2, "");
                        if (childFragmentManager2.findFragmentByTag(getcamerastateB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                            getcamerastateB2.show(childFragmentManager2, getcamerastateB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                        getcamerastateB2.g = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.new b();
                    }
                } else if (individualDataClaim.IconCompatParcelizer == null) {
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Mohon lakukan verifikasi biometrik kembali", 0).show();
                } else {
                    TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
                    Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_claim_jht_step_fifth_", "submit_claim_jht_step_fifth_confirmation"));
                    Intrinsics.checkNotNullParameter("submit_claim_jht_step_fifth_confirmation", "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                    TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("submit_claim_jht_step_fifth_confirmation", mapMutableMapOf);
                    String strJoinToString$default = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.asInterface;
                    if (strJoinToString$default == null) {
                        strJoinToString$default = "";
                    }
                    String str12 = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.d;
                    if (str12 == null) {
                        str12 = "";
                    }
                    String str13 = strJoinToString$default;
                    if (StringsKt.isBlank(str13) || StringsKt.isBlank(str12) || StringsKt.equals(str12, "Indonesia", true)) {
                        if (StringsKt.isBlank(str13)) {
                            str = !StringsKt.isBlank(str12) ? str12 : "";
                        }
                        str2 = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        str3 = str2;
                        if (str3.length() == 0) {
                            str3 = "0.0";
                        }
                        String str14 = str3;
                        str4 = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String str15 = str4;
                        individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, str14, str15.length() != 0 ? str15 : "0.0", str, -1, -1, 15, null);
                        camera2CameraControlImplExternalSyntheticLambda4 = (Camera2CameraControlImplExternalSyntheticLambda4) lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                        Intrinsics.checkNotNullParameter(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 39, View.getDefaultSize(0, 0) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                        }
                        i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                        long j3 = -167;
                        long j4 = -1;
                        long j5 = j4 ^ (-1635717240668441837L);
                        jLongValue = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
                        long jNextInt = new Random().nextInt();
                        j = (j3 * 3732974415410400824L) + (j3 * (-1635717240668441837L)) + (((long) 336) * ((((j4 ^ 3732974415410400824L) | j5) ^ j4) | ((j5 | jNextInt) ^ j4))) + (((long) (-168)) * (((-302035878929645765L) ^ j4) | ((jNextInt | 3732974415410400824L) ^ j4))) + (((long) 168) * (j5 | (j4 ^ ((jNextInt ^ j4) | 3732974415410400824L))));
                        i2 = 0;
                        while (true) {
                            if (i2 != 10) {
                                int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, camera2CameraControlImplExternalSyntheticLambda4)).intValue();
                                try {
                                    Object[] objArr2 = {825985617};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46038 - TextUtils.getCapsMode("", 0, 0)), 1134 - Color.argb(0, 0, 0, 0), 17 - ImageFormat.getBitsPerPixel(0), 807763283, false, null, new Class[]{Integer.TYPE});
                                    }
                                    Object[] objArr3 = {Integer.valueOf(iIntValue), 0, -296468479, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr2), false};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                                        int i8 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1030;
                                        int iMyTid = (Process.myTid() >> 22) + 15;
                                        byte b2 = $$a[7];
                                        byte b3 = b2;
                                        Object[] objArr4 = new Object[1];
                                        c(b2, b3, b3, objArr4);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, i8, iMyTid, 1298546779, false, (String) objArr4[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - View.getDefaultSize(0, 0)), 1118 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), Color.blue(0) + 17), Boolean.TYPE});
                                    }
                                    objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3);
                                    i3 = ((int[]) objArr[1])[0];
                                    i4 = ((int[]) objArr[3])[0];
                                    if (i4 != i3) {
                                        break;
                                    }
                                    arrayList = new ArrayList();
                                    strArr = (String[]) objArr[0];
                                    if (strArr != null) {
                                        for (String str16 : strArr) {
                                            arrayList.add(str16);
                                        }
                                    }
                                    throw new RuntimeException(String.valueOf(i4));
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            }
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (37835 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 59 - Drawable.resolveOpacity(0, 0), 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                            }
                            i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
                            i6 = 0;
                            j2 = jLongValue;
                            while (true) {
                                for (i7 = 0; i7 != 8; i7++) {
                                    i5 = (((((int) (j2 >> i7)) & 255) + (i5 << 6)) + (i5 << 16)) - i5;
                                }
                                if (i6 == 0) {
                                    break;
                                }
                                i6++;
                                j2 = j;
                            }
                            if (i5 != i) {
                                break;
                            }
                            jLongValue -= 1024;
                            i2++;
                        }
                        String strB = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.write;
                        VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
                        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                        removeOnPictureInPictureUiStateChangedListener removeonpictureinpictureuistatechangedlistener = camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelDefault;
                        bArr = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.IconCompatParcelizer;
                        if (bArr != null) {
                            Intrinsics.checkNotNullParameter(bArr, "");
                            strEncodeToString = Base64.encodeToString(bArr, 2);
                            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
                        } else {
                            strEncodeToString = null;
                        }
                        String strValueOf = String.valueOf(strEncodeToString);
                        String str17 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.asInterface;
                        String str18 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.a;
                        String str19 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.isConnected;
                        String str20 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.getItem;
                        String str21 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.sendCustomAction;
                        jhtClaimEligibilityTuitionPaymentFragmentbindingInflater1 = camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelDefault.TuitionPaymentFragmentbindingInflater1();
                        if (jhtClaimEligibilityTuitionPaymentFragmentbindingInflater1 != null || (str11 = jhtClaimEligibilityTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) {
                            strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                        } else {
                            strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, str11, strB);
                        }
                        String str22 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.onConnected;
                        String str23 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.onConnectionSuspended;
                        String str24 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.setInternalConnectionCallback;
                        String str25 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.onConnectionFailed;
                        String strB2 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.b();
                        String str26 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal;
                        String str27 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.onProgressUpdate;
                        String str28 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatConnectionCallbackStubApi21;
                        String str29 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.onServiceConnected;
                        if (Intrinsics.areEqual(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatCustomActionCallback, "null")) {
                            str5 = "";
                        } else {
                            str5 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatCustomActionCallback;
                        }
                        if (Intrinsics.areEqual(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatCustomActionResultReceiver, "null")) {
                            str6 = "";
                        } else {
                            str6 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatCustomActionResultReceiver;
                        }
                        if (Intrinsics.areEqual(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.onResult, "null")) {
                            str7 = "";
                        } else {
                            str7 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.onResult;
                        }
                        String str30 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.onLoadChildren;
                        if (Intrinsics.areEqual(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.onServiceConnected, "Y")) {
                            str8 = "";
                        } else {
                            str8 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImplApi21;
                        }
                        if (Intrinsics.areEqual(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.onServiceConnected, "Y")) {
                            str9 = "";
                        } else {
                            str9 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatItemReceiver;
                        }
                        String str31 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatItemCallbackStubApi23;
                        if (Intrinsics.areEqual(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImplApi213, "null")) {
                            str10 = "";
                        } else {
                            str10 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImplApi213;
                        }
                        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(removeonpictureinpictureuistatechangedlistener.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new JhtInstantClaimRequest(strValueOf, str17, str18, str19, str20, str21, strTuitionPaymentFragmentspecialinlinedviewModeldefault1, str22, str23, str24, str25, strB2, str26, str27, str28, str29, str5, str6, str7, str30, str8, str9, str31, str10, individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.run, individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImplApi216, individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImplApi23, individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImplApi217, individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImplApi215, individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.getStateLabel))));
                        final Function1 function1 = new Function1() { // from class: getCameraInfo
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Camera2CameraControlImplExternalSyntheticLambda4.b(camera2CameraControlImplExternalSyntheticLambda4, (BaseModel) obj);
                            }
                        };
                        logToString logtostring = new logToString() { // from class: getMeteringRepeatingId
                            @Override // defpackage.logToString
                            public final void accept(Object obj) {
                                function1.invoke(obj);
                            }
                        };
                        final Function1 function2 = new Function1() { // from class: lambdapostSurfaceClosedError19
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Camera2CameraControlImplExternalSyntheticLambda4.getInterfaceDescriptor(camera2CameraControlImplExternalSyntheticLambda4, (Throwable) obj);
                            }
                        };
                        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: toUseCaseInfos
                            @Override // defpackage.logToString
                            public final void accept(Object obj) {
                                function2.invoke(obj);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                        camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    } else {
                        List listListOf = CollectionsKt.listOf((Object[]) new String[]{strJoinToString$default, str12});
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : listListOf) {
                            if (!StringsKt.isBlank((String) obj)) {
                                arrayList2.add(obj);
                            }
                        }
                        strJoinToString$default = CollectionsKt.joinToString$default(arrayList2, ", ", null, null, 0, null, null, 62, null);
                    }
                    str = strJoinToString$default;
                    str2 = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    str3 = str2;
                    if (str3.length() == 0) {
                        str3 = "0.0";
                    }
                    String str110 = str3;
                    str4 = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str111 = str4;
                    individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, str110, str111.length() != 0 ? str111 : "0.0", str, -1, -1, 15, null);
                    camera2CameraControlImplExternalSyntheticLambda4 = (Camera2CameraControlImplExternalSyntheticLambda4) lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    Intrinsics.checkNotNullParameter(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 39, View.getDefaultSize(0, 0) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                    long j6 = -167;
                    long j7 = -1;
                    long j8 = j7 ^ (-1635717240668441837L);
                    jLongValue = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
                    long jNextInt2 = new Random().nextInt();
                    j = (j6 * 3732974415410400824L) + (j6 * (-1635717240668441837L)) + (((long) 336) * ((((j7 ^ 3732974415410400824L) | j8) ^ j7) | ((j8 | jNextInt2) ^ j7))) + (((long) (-168)) * (((-302035878929645765L) ^ j7) | ((jNextInt2 | 3732974415410400824L) ^ j7))) + (((long) 168) * (j8 | (j7 ^ ((jNextInt2 ^ j7) | 3732974415410400824L))));
                    i2 = 0;
                    while (true) {
                        if (i2 != 10) {
                            int iIntValue2 = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, camera2CameraControlImplExternalSyntheticLambda4)).intValue();
                            Object[] objArr5 = {825985617};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46038 - TextUtils.getCapsMode("", 0, 0)), 1134 - Color.argb(0, 0, 0, 0), 17 - ImageFormat.getBitsPerPixel(0), 807763283, false, null, new Class[]{Integer.TYPE});
                            }
                            Object[] objArr6 = {Integer.valueOf(iIntValue2), 0, -296468479, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), false};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                                int i9 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1030;
                                int iMyTid2 = (Process.myTid() >> 22) + 15;
                                byte b4 = $$a[7];
                                byte b5 = b4;
                                Object[] objArr7 = new Object[1];
                                c(b4, b5, b5, objArr7);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf2, i9, iMyTid2, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - View.getDefaultSize(0, 0)), 1118 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), Color.blue(0) + 17), Boolean.TYPE});
                            }
                            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr6);
                            i3 = ((int[]) objArr[1])[0];
                            i4 = ((int[]) objArr[3])[0];
                            if (i4 != i3) {
                                break;
                            }
                            arrayList = new ArrayList();
                            strArr = (String[]) objArr[0];
                            if (strArr != null) {
                                while (i < strArr.length) {
                                    arrayList.add(str16);
                                }
                            }
                            throw new RuntimeException(String.valueOf(i4));
                        }
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (37835 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 59 - Drawable.resolveOpacity(0, 0), 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                        }
                        i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
                        i6 = 0;
                        j2 = jLongValue;
                        while (true) {
                            while (i7 != 8) {
                                i5 = (((((int) (j2 >> i7)) & 255) + (i5 << 6)) + (i5 << 16)) - i5;
                            }
                            if (i6 == 0) {
                                break;
                                break;
                            }
                            i6++;
                            j2 = j;
                        }
                        if (i5 != i) {
                            break;
                            break;
                        }
                        jLongValue -= 1024;
                        i2++;
                    }
                    String strB3 = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                    MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData2 = camera2CameraControlImplExternalSyntheticLambda4.write;
                    VirtualCameraAdapter1.Companion companion4 = VirtualCameraAdapter1.INSTANCE;
                    mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                    removeOnPictureInPictureUiStateChangedListener removeonpictureinpictureuistatechangedlistener2 = camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelDefault;
                    bArr = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.IconCompatParcelizer;
                    if (bArr != null) {
                        Intrinsics.checkNotNullParameter(bArr, "");
                        strEncodeToString = Base64.encodeToString(bArr, 2);
                        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
                    } else {
                        strEncodeToString = null;
                    }
                    String strValueOf2 = String.valueOf(strEncodeToString);
                    String str112 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.asInterface;
                    String str113 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.a;
                    String str114 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.isConnected;
                    String str210 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.getItem;
                    String str211 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.sendCustomAction;
                    jhtClaimEligibilityTuitionPaymentFragmentbindingInflater1 = camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelDefault.TuitionPaymentFragmentbindingInflater1();
                    if (jhtClaimEligibilityTuitionPaymentFragmentbindingInflater1 != null) {
                        strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    } else {
                        strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    }
                    String str212 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.onConnected;
                    String str213 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.onConnectionSuspended;
                    String str214 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.setInternalConnectionCallback;
                    String str215 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.onConnectionFailed;
                    String strB4 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.b();
                    String str216 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal;
                    String str217 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.onProgressUpdate;
                    String str218 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatConnectionCallbackStubApi21;
                    String str219 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.onServiceConnected;
                    if (Intrinsics.areEqual(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatCustomActionCallback, "null")) {
                        str5 = "";
                    } else {
                        str5 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatCustomActionCallback;
                    }
                    if (Intrinsics.areEqual(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatCustomActionResultReceiver, "null")) {
                        str6 = "";
                    } else {
                        str6 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatCustomActionResultReceiver;
                    }
                    if (Intrinsics.areEqual(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.onResult, "null")) {
                        str7 = "";
                    } else {
                        str7 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.onResult;
                    }
                    String str32 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.onLoadChildren;
                    if (Intrinsics.areEqual(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.onServiceConnected, "Y")) {
                        str8 = "";
                    } else {
                        str8 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImplApi21;
                    }
                    if (Intrinsics.areEqual(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.onServiceConnected, "Y")) {
                        str9 = "";
                    } else {
                        str9 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatItemReceiver;
                    }
                    String str33 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatItemCallbackStubApi23;
                    if (Intrinsics.areEqual(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImplApi213, "null")) {
                        str10 = individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImplApi213;
                    } else {
                        str10 = "";
                    }
                    deriveCodec derivecodecB2 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(removeonpictureinpictureuistatechangedlistener2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new JhtInstantClaimRequest(strValueOf2, str112, str113, str114, str210, str211, strTuitionPaymentFragmentspecialinlinedviewModeldefault1, str212, str213, str214, str215, strB4, str216, str217, str218, str219, str5, str6, str7, str32, str8, str9, str33, str10, individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.run, individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImplApi216, individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImplApi23, individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImplApi217, individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompatMediaBrowserImplApi215, individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1.getStateLabel))));
                    final Function1 function3 = new Function1() { // from class: getCameraInfo
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Camera2CameraControlImplExternalSyntheticLambda4.b(camera2CameraControlImplExternalSyntheticLambda4, (BaseModel) obj2);
                        }
                    };
                    logToString logtostring2 = new logToString() { // from class: getMeteringRepeatingId
                        @Override // defpackage.logToString
                        public final void accept(Object obj2) {
                            function3.invoke(obj2);
                        }
                    };
                    final Function1 function4 = new Function1() { // from class: lambdapostSurfaceClosedError19
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Camera2CameraControlImplExternalSyntheticLambda4.getInterfaceDescriptor(camera2CameraControlImplExternalSyntheticLambda4, (Throwable) obj2);
                        }
                    };
                    BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4 = derivecodecB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring2, new logToString() { // from class: toUseCaseInfos
                        @Override // defpackage.logToString
                        public final void accept(Object obj2) {
                            function4.invoke(obj2);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
                    camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                }
            }
        } else {
            String string3 = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.getString(R.string.message_agreed_tnc);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string3, 0).show();
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).write.observe(this, new Observer() { // from class: releaseSession
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (VirtualCameraAdapter1) obj);
            }
        });
    }

    @Override // getStringOrNull.b
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        BaseActivity baseActivity = this.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity != null) {
            baseActivity.d_();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.IconCompatParcelizer();
            MaterialButton materialButton = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.asInterface().btnConfirmation;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(false);
            str = "loading_claim_jht_step_fifth_confirmation_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.write();
            BaseModel baseModel = (BaseModel) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (baseModel.getB()) {
                TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
                Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_claim_jht_step_fifth_", "claim_jht_success"));
                Intrinsics.checkNotNullParameter("claim_jht_success", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("claim_jht_success", mapMutableMapOf);
                Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4 = (Camera2CameraControlImplExternalSyntheticLambda4) lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                Intrinsics.checkNotNullParameter("Y", "");
                camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new setContentView("Y", null, 2, null));
                getCameraState.Companion companion = getCameraState.INSTANCE;
                String string = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.getString(R.string.label_success);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.getString(R.string.label_message_claim_successfully_submitted);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                String string3 = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.getString(R.string.action_ok_thanks);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_success, string, string2, string3);
                FragmentManager childFragmentManager = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                Intrinsics.checkNotNullParameter(childFragmentManager, "");
                if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
                getcamerastateB.g = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            } else {
                TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
                Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_claim_jht_step_fifth_", "claim_jht_failed"));
                Intrinsics.checkNotNullParameter("claim_jht_failed", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("claim_jht_failed", mapMutableMapOf2);
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), baseModel.getTuitionPaymentFragmentspecialinlinedviewModeldefault1(), 0).show();
            }
            str = "success_claim_jht_step_fifth_confirmation_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.write();
            MaterialButton materialButton3 = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.asInterface().btnConfirmation;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(true);
            getCameraState.Companion companion2 = getCameraState.INSTANCE;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string4 = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            getCameraState getcamerastateB2 = getCameraState.Companion.b(R.drawable.ic_info_blue, "", strValueOf, string4);
            FragmentManager childFragmentManager2 = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
            Intrinsics.checkNotNullParameter(childFragmentManager2, "");
            if (childFragmentManager2.findFragmentByTag(getcamerastateB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getcamerastateB2.show(childFragmentManager2, getcamerastateB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            str = "failure_claim_jht_step_fifth_confirmation_result";
        } else {
            str = "";
        }
        TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_claim_jht_step_fifth_", str));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf3);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl) throws IOException {
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Camera2CameraControlExternalSyntheticLambda4 camera2CameraControlExternalSyntheticLambda4B = ExperimentalCamera2Interop.b((PreferenceManager) lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.TuitionPaymentFragmentbindingInflater1.getValue());
        if (camera2CameraControlExternalSyntheticLambda4B != null && camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.b = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
            lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.asInterface = camera2CameraControlExternalSyntheticLambda4B.b;
            lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.a = camera2CameraControlExternalSyntheticLambda4B.g;
            lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.d = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.asBinder = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.b;
            String str2 = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("Location from cache: ");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
        } else {
            lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.b = "0.0";
            lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "0.0";
            ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        experimentalCamera2Interop.b(contextRequireContext, new Function1() { // from class: postSurfaceClosedError
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (UserLocationComplete) obj);
            }
        }, new Function0() { // from class: onUseCaseUpdated
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public static final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl) {
        ActivityCompat.requestPermissions(lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.requireActivity(), new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 100);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaresetUseCase10androidxcameracamera2internalCamera2CameraImpl lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl, UserLocationComplete userLocationComplete) throws IOException {
        String str;
        String str2;
        String str3;
        String str4 = "";
        Intrinsics.checkNotNullParameter(userLocationComplete, "");
        lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.b = String.valueOf(userLocationComplete.b);
        lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        LocationAddressInfo locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo == null || (str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) {
            str = "";
        }
        lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.asInterface = str;
        lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.a = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        LocationAddressInfo locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 == null || (str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            str2 = "";
        }
        lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.d = str2;
        LocationAddressInfo locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 != null && (str3 = locationAddressInfo3.d) != null) {
            str4 = str3;
        }
        lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.asBinder = str4;
        String str5 = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.b;
        String str6 = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str7 = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.asInterface;
        String str8 = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.a;
        String str9 = lambdaresetusecase10androidxcameracamera2internalcamera2cameraimpl.d;
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
}
