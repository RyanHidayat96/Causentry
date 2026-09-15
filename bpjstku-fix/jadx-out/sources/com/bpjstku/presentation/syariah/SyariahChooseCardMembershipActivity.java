package com.bpjstku.presentation.syariah;

import android.content.ComponentCallbacks;
import android.content.Context;
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
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.asik.model.request.CheckSubmissionRequest;
import com.bpjstku.data.point.PointDataStore;
import com.bpjstku.data.promo.model.response.ProvinceItem;
import com.bpjstku.databinding.ActivitySyariahChooseCardMembershipBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.asik.active.AsikActiveParticipantSubmissionCheckActivity;
import com.bpjstku.presentation.syariah.SyariahChooseCardMembershipActivity;
import com.bpjstku.presentation.syariah.model.SyariahChooseKpjModel;
import com.bpjstku.util.constant.AsikPointer;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.libraries.places.internal.zzapt;
import com.google.android.material.button.MaterialButton;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.AutoValue_MediaSpec1;
import defpackage.CameraCharacteristicsApi28Impl;
import defpackage.CameraUseCaseAdapter;
import defpackage.EncoderImplExternalSyntheticLambda6;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.SessionProcessor;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.select;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0015\u0010\u0011\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\u0004\u0018\u00010\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0015\u0010\n\u001a\u00020#8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u001a"}, d2 = {"Lcom/bpjstku/presentation/syariah/SyariahChooseCardMembershipActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivitySyariahChooseCardMembershipBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "LgetStringOrNull;", "LgetStringOrNull;", "Lselect;", "Lkotlin/Lazy;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "onTransact", "()LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lcom/bpjstku/domain/user/model/User;", "g", "Lcom/bpjstku/presentation/syariah/model/SyariahChooseKpjModel;", "Lcom/bpjstku/presentation/syariah/model/SyariahChooseKpjModel;", "LCameraCharacteristicsApi28Impl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SyariahChooseCardMembershipActivity extends BindingBaseActivity<ActivitySyariahChooseCardMembershipBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int asInterface;
    private static int cancelAll;
    private static long d;
    private static char g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private getStringOrNull b;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private SyariahChooseKpjModel asInterface;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {77, -106, 83, 4};
    private static final int $$f = 33;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {39, 27, 2, 54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 167;
    private static int onTransact = 0;
    private static int notify = 0;
    private static int INotificationSideChannel = 1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy g = LazyKt.lazy(new Function0() { // from class: CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SyariahChooseCardMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy asBinder = LazyKt.lazy(new Function0() { // from class: getPhysicalCameraIds
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SyariahChooseCardMembershipActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~(i | i4);
        int i8 = ~(i4 | i3);
        int i9 = i7 | i8;
        int i10 = ~i;
        int i11 = ~i4;
        int i12 = (~(i10 | i3)) | (~(i10 | i11)) | (~(i11 | i3));
        int i13 = ~i3;
        int i14 = i12 | (~(i13 | i | i4));
        int i15 = (~(i13 | i11)) | i | i8;
        int i16 = i + i4 + i2 + (1962400304 * i5) + (1167700406 * i6);
        int i17 = i16 * i16;
        int i18 = ((i * (-1019457937)) - 559939584) + ((-1019457937) * i4) + (2001489518 * i9) + (i14 * (-2001489518)) + ((-2001489518) * i15) + (1274019840 * i2) + ((-1660944384) * i5) + ((-325058560) * i6) + (867827712 * i17);
        int i19 = ((i * (-1629562239)) - 1134582380) + (i4 * (-1629562239)) + (i9 * (-910)) + (i14 * 910) + (i15 * 910) + (i2 * (-1629561329)) + (i5 * (-1621399344)) + (i6 * (-873382486)) + (i17 * 1407582208);
        int i20 = i18 + (i19 * i19 * (-1895432192));
        if (i20 == 1) {
            return b(objArr);
        }
        if (i20 != 2) {
            return i20 != 3 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.syariah.SyariahChooseCardMembershipActivity.$$a
            int r1 = r7 + 1
            int r6 = 145 - r6
            int r5 = r5 * 14
            int r5 = r5 + 84
            byte[] r1 = new byte[r1]
            r2 = -1
            if (r0 != 0) goto L12
            r5 = r6
            r3 = r7
            goto L27
        L12:
            r4 = r6
            r6 = r5
            r5 = r4
        L15:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r1[r2] = r3
            if (r2 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L25:
            r3 = r0[r5]
        L27:
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            int r5 = r5 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.SyariahChooseCardMembershipActivity.c(byte, int, byte, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        SyariahChooseCardMembershipActivity syariahChooseCardMembershipActivity = (SyariahChooseCardMembershipActivity) objArr[0];
        int i = 2 % 2;
        int i2 = notify;
        int i3 = i2 + 97;
        INotificationSideChannel = i3 % 128;
        int i4 = i3 % 2;
        getStringOrNull getstringornull = syariahChooseCardMembershipActivity.b;
        if (i4 == 0) {
            int i5 = 25 / 0;
        }
        int i6 = i2 + 31;
        INotificationSideChannel = i6 % 128;
        int i7 = i6 % 2;
        return getstringornull;
    }

    public SyariahChooseCardMembershipActivity() {
        final SyariahChooseCardMembershipActivity syariahChooseCardMembershipActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<select>() { // from class: com.bpjstku.presentation.syariah.SyariahChooseCardMembershipActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, select] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ select invoke() {
                LifecycleOwner lifecycleOwner = syariahChooseCardMembershipActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(select.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.syariah.SyariahChooseCardMembershipActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = syariahChooseCardMembershipActivity;
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
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivitySyariahChooseCardMembershipBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = notify + 47;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        SyariahChooseCardMembershipActivity$bindingInflater$1 syariahChooseCardMembershipActivity$bindingInflater$1 = SyariahChooseCardMembershipActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i4 = INotificationSideChannel + 83;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return syariahChooseCardMembershipActivity$bindingInflater$1;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.syariah.SyariahChooseCardMembershipActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/syariah/SyariahChooseCardMembershipActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, SyariahChooseCardMembershipActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = notify + 11;
        INotificationSideChannel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ((ActivitySyariahChooseCardMembershipBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilChooseKpj.getEditText();
            throw null;
        }
        EditText editText = ((ActivitySyariahChooseCardMembershipBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilChooseKpj.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SyariahChooseCardMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
                }
            });
        }
        MaterialButton materialButton = ((ActivitySyariahChooseCardMembershipBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(materialButton, new Function0() { // from class: CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (Unit) SyariahChooseCardMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2080997208, zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault2}, zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -2080997205, zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        });
        int i3 = notify + 21;
        INotificationSideChannel = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i5 = $10 + 93;
            $11 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(i4) + 8328);
                    int i7 = 1236 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int packedPositionType = 35 - ExpandableListView.getPackedPositionType(0L);
                    byte b = (byte) i4;
                    byte b2 = b;
                    String str$$i = $$i(b, b2, (byte) (b2 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, i7, packedPositionType, -653973969, false, str$$i, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cRgb = (char) (Color.rgb(i4, i4, i4) + 16777216);
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2764;
                    int i8 = 15 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte b3 = (byte) i2;
                    byte b4 = (byte) (b3 - 2);
                    String str$$i2 = $$i(b3, b4, (byte) (b4 - 1));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i4] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, fadingEdgeLength, i8, 1504416861, false, str$$i2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                int i9 = cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i9);
                objArr4[i4] = sessionProcessor;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', i4, i4) + 43326);
                    int edgeSlop = 253 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int iArgb = 22 - Color.argb(i4, i4, i4, i4);
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i4] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, edgeSlop, iArgb, -721491957, false, "j", clsArr3);
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i10 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i4] = Integer.valueOf(i10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 65199);
                    int offsetAfter = TextUtils.getOffsetAfter("", i4) + 2891;
                    int i11 = 18 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte b5 = (byte) ($$f & 7);
                    byte b6 = (byte) (b5 - 1);
                    String str$$i3 = $$i(b5, b6, (byte) (b6 - 1));
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i4] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, offsetAfter, i11, 2012627446, false, str$$i3, clsArr4);
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) ((((long) ((int) (((long) asInterface) ^ (-6377398940819159759L)))) ^ (((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (d ^ (-6377398940819159759L)))) ^ ((long) ((char) (((long) g) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i12 = $11 + 115;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 3 % 3;
                }
                i2 = 2;
                i4 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
        int i14 = $11 + 61;
        $10 = i14 % 128;
        int i15 = i14 % 2;
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements getStringOrNull.b {
        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            getStringOrNull getstringornull = (getStringOrNull) SyariahChooseCardMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1858353825, zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{SyariahChooseCardMembershipActivity.this}, zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1858353824, zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            Intrinsics.checkNotNull(getstringornull);
            getstringornull.dismiss();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws Throwable {
        Object[] objArr2;
        SyariahChooseCardMembershipActivity syariahChooseCardMembershipActivity = (SyariahChooseCardMembershipActivity) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 75;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char longPressTimeout = (char) (29944 - (ViewConfiguration.getLongPressTimeout() >> 16));
            int maximumDrawingCacheSize = 1755 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int gidForName = Process.getGidForName("") + 24;
            byte b = $$a[7];
            short s = (short) (b | 37);
            Object[] objArr3 = new Object[1];
            c(b, s, (byte) s, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, maximumDrawingCacheSize, gidForName, 986134021, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{26361, 16739, 2977, 21741}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{31091, 59919, 40052, 5784, 34038, 1909, 16027, 5544, 38445, 44094, 58070, 2643, 1403, 24329, 24244, 29109, 42831, 55337, 9704, 54130, 26668, 60017}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{37554, 10338, 56133, 20744}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.card_details).substring(8, 9).codePointAt(0) + 2170), 1160274577 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step3).substring(25, 26).length(), new char[]{59542, 46785, 34977, 56761, 20262, 64145, 5045, 17891, 60640, 64332, 30811, 46599, 10581, 52383, 56109}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char keyRepeatTimeout = (char) (29944 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
            int maxKeyCode = 1755 - (KeyEvent.getMaxKeyCode() >> 16);
            int iAxisFromString = 22 - MotionEvent.axisFromString("");
            byte b2 = $$a[7];
            short s2 = b2;
            Object[] objArr6 = new Object[1];
            c(b2, s2, (byte) (s2 | 52), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatTimeout, maxKeyCode, iAxisFromString, 1596667560, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char keyRepeatDelay = (char) (29944 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1755;
                int iBlue = Color.blue(0) + 23;
                byte b3 = $$a[7];
                Object[] objArr7 = new Object[1];
                c(b3, (short) (b3 | 89), (byte) 52, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatDelay, pressedStateDuration, iBlue, 1599039318, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[1], (String[]) objArr8[4]};
            int iNextInt = new Random().nextInt(1608870689);
            int i4 = ~iNextInt;
            int i5 = 1935580055 + (((~((-142196554) | i4)) | 2198785) * (-1188));
            int i6 = (~(iNextInt | 142196553)) | 2198785;
            int i7 = ~(354798979 | i4);
            int i8 = ((i5 + ((i6 | i7) * 594)) + ((((~(142196553 | i4)) | (-494796748)) | i7) * 594)) - 1287549173;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr2[3])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{53131, 36921, 3278, 46650}, (char) (14860 - TextUtils.getCapsMode("", 0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111, new char[]{59784, 6242, 61215, 64314, 30171, 45365, 60836, 23908, 44638, 35154, 30371, 11786, 36891, 27638, 44769, 30264}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{22960, 23073, 48838, 64733}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_billingcountry_empty).substring(10, 11).codePointAt(0) + 56665), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{39052, 32634, 45518, 20308, 36787, 39517, 50565, 62659, 27373, 26226, 681, 10282, 1548, 33664, 17041, 9474}, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, syariahChooseCardMembershipActivity)).intValue();
            try {
                Object[] objArr11 = {-1455695626};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 42049), 1725 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 29 - (Process.myPid() >> 22), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = ProvinceItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), -1287549173, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) (29944 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    int trimmedLength = TextUtils.getTrimmedLength("") + 1755;
                    int iAxisFromString2 = 22 - MotionEvent.axisFromString("");
                    byte b4 = $$a[7];
                    Object[] objArr12 = new Object[1];
                    c(b4, (short) (b4 | 89), (byte) 52, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, trimmedLength, iAxisFromString2, 1599039318, false, (String) objArr12[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    Object[] objArr13 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{26361, 16739, 2977, 21741}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.ef_content_desc_folder).substring(0, 6).length() - 6), TextUtils.lastIndexOf("", '0', 0) + 1, new char[]{31091, 59919, 40052, 5784, 34038, 1909, 16027, 5544, 38445, 44094, 58070, 2643, 1403, 24329, 24244, 29109, 42831, 55337, 9704, 54130, 26668, 60017}, objArr13);
                    Class<?> cls3 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{37554, 10338, 56133, 20744}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.place_photo_viewer_next_image_button_content_description).substring(0, 15).codePointAt(9) + 2235), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1160274542, new char[]{59542, 46785, 34977, 56761, 20262, 64145, 5045, 17891, 60640, 64332, 30811, 46599, 10581, 52383, 56109}, objArr14);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char keyRepeatTimeout2 = (char) (29944 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        int i11 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1754;
                        int i12 = 24 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        byte b5 = $$a[7];
                        short s3 = b5;
                        Object[] objArr15 = new Object[1];
                        c(b5, s3, (byte) (s3 | 52), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatTimeout2, i11, i12, 1596667560, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 29945);
                        int maximumDrawingCacheSize2 = 1755 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23;
                        byte b6 = $$a[7];
                        short s4 = (short) (b6 | 37);
                        Object[] objArr16 = new Object[1];
                        c(b6, s4, (byte) s4, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cAxisFromString, maximumDrawingCacheSize2, doubleTapTimeout, 986134021, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    objArr2 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
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
        int i13 = ((int[]) objArr2[1])[0];
        int i14 = ((int[]) objArr2[0])[0];
        if (i14 != i13) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr2[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            int i15 = ((int[]) objArr2[3])[0];
            Object[] objArr17 = {new int[]{((int[]) objArr2[0])[0]}, new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[1], (String[]) objArr2[4]};
            int i16 = ~new Random().nextInt(1750027891);
            int i17 = i15 + (-523905855) + ((~((-68165814) | i16)) * (-783)) + (((~(i16 | (-395322046))) | (-607924472)) * 783);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr17[3])[0] = i19 ^ (i19 << 5);
        } else {
            int i20 = INotificationSideChannel + 27;
            notify = i20 % 128;
            int i21 = i20 % 2;
            int i22 = ((int[]) objArr2[3])[0];
            Object[] objArr18 = {new int[]{((int[]) objArr2[0])[0]}, new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[1], (String[]) objArr2[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i23 = ~iFreeMemory;
            int i24 = i22 + 249640274 + (((~((-143491463) | i23)) | (~((-69110964) | iFreeMemory))) * 217) + (((~(iFreeMemory | (-143491463))) | 819330) * 217) + (((~((-69110964) | i23)) | 143491462) * 217);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr18[3])[0] = i26 ^ (i26 << 5);
        }
        return (ActivityResultContractsPickVisualMediaMediaCapabilities) syariahChooseCardMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((select) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).onTransact.observe(this, new Observer() { // from class: CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda6
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                SyariahChooseCardMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-829523970, zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj}, zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 829523970, zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        });
        int i2 = notify + 33;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = notify + 51;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        SyariahChooseCardMembershipActivity syariahChooseCardMembershipActivity = this;
        Intrinsics.checkNotNullParameter(syariahChooseCardMembershipActivity, "");
        syariahChooseCardMembershipActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivitySyariahChooseCardMembershipBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivitySyariahChooseCardMembershipBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.label_syariah_service));
        int i4 = INotificationSideChannel + 43;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i2 = notify + 87;
                INotificationSideChannel = i2 % 128;
                if (i2 % 2 == 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    throw null;
                }
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i3 = notify + 69;
            INotificationSideChannel = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 68 / 0;
            }
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSize = (char) View.resolveSize(0, 0);
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1031;
            int i3 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            byte b = $$a[7];
            Object[] objArr2 = new Object[1];
            c(b, (short) (b | 141), (byte) 52, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSize, windowTouchSlop, i3, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{26361, 16739, 2977, 21741}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1052).substring(0, 25).length() - 25), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{31091, 59919, 40052, 5784, 34038, 1909, 16027, 5544, 38445, 44094, 58070, 2643, 1403, 24329, 24244, 29109, 42831, 55337, 9704, 54130, 26668, 60017}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{37554, 10338, 56133, 20744}, (char) (2267 - TextUtils.getOffsetBefore("", 0)), 1160274578 - View.combineMeasuredStates(0, 0), new char[]{59542, 46785, 34977, 56761, 20262, 64145, 5045, 17891, 60640, 64332, 30811, 46599, 10581, 52383, 56109}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cArgb = (char) Color.argb(0, 0, 0, 0);
            int maximumDrawingCacheSize = 1031 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15;
            byte b2 = $$a[7];
            Object[] objArr5 = new Object[1];
            c(b2, (short) (b2 | 89), (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cArgb, maximumDrawingCacheSize, scrollBarFadeDuration, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = notify + 1;
            INotificationSideChannel = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                int packedPositionGroup = 1031 - ExpandableListView.getPackedPositionGroup(0L);
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 16;
                byte[] bArr = $$a;
                byte b3 = bArr[132];
                Object[] objArr6 = new Object[1];
                c(b3, (short) (b3 | 36), bArr[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, packedPositionGroup, bitsPerPixel, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr7[3])[0];
            int i7 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = ~iIdentityHashCode;
            int i9 = ~((-918747882) | i8);
            int i10 = ~(674467711 | iIdentityHashCode);
            int i11 = (((1517103762 + ((i9 | i10) * 1150)) + (((~((-674467712) | i8)) | i10) * (-575))) + (((~(iIdentityHashCode | (-918747882))) | (~(i8 | 918747881))) * 575)) - 812443997;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[2])[0] = i13 ^ (i13 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{53131, 36921, 3278, 46650}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 14824), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{59784, 6242, 61215, 64314, 30171, 45365, 60836, 23908, 44638, 35154, 30371, 11786, 36891, 27638, 44769, 30264}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{22960, 23073, 48838, 64733}, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 56766), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_4).substring(6, 7).length() - 1, new char[]{39052, 32634, 45518, 20308, 36787, 39517, 50565, 62659, 27373, 26226, 681, 10282, 1548, 33664, 17041, 9474}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1387311756};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 46038), (ViewConfiguration.getScrollBarSize() >> 8) + 1134, (Process.myPid() >> 22) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -812443997, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1031;
                    int iArgb = Color.argb(0, 0, 0, 0) + 15;
                    byte b4 = $$a[7];
                    Object[] objArr12 = new Object[1];
                    c(b4, (short) (b4 | 141), (byte) 52, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, scrollDefaultDelay, iArgb, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (View.MeasureSpec.getSize(0) + 45993), TextUtils.indexOf((CharSequence) "", '0', 0) + 1118, 17 - (ViewConfiguration.getTapTimeout() >> 16)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cResolveSize2 = (char) View.resolveSize(0, 0);
                    int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0');
                    int iBlue = Color.blue(0) + 15;
                    byte[] bArr2 = $$a;
                    byte b5 = bArr2[132];
                    Object[] objArr13 = new Object[1];
                    c(b5, (short) (b5 | 36), bArr2[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSize2, iIndexOf, iBlue, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{26361, 16739, 2977, 21741}, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellSiteTitle).substring(0, 4).length() - 4, new char[]{31091, 59919, 40052, 5784, 34038, 1909, 16027, 5544, 38445, 44094, 58070, 2643, 1403, 24329, 24244, 29109, 42831, 55337, 9704, 54130, 26668, 60017}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{37554, 10338, 56133, 20744}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 2221), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1160274567, new char[]{59542, 46785, 34977, 56761, 20262, 64145, 5045, 17891, 60640, 64332, 30811, 46599, 10581, 52383, 56109}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf3 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                        int gidForName = Process.getGidForName("") + 1032;
                        int defaultSize = View.getDefaultSize(0, 0) + 15;
                        byte b6 = $$a[7];
                        Object[] objArr16 = new Object[1];
                        c(b6, (short) (b6 | 89), (byte) 52, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf3, gidForName, defaultSize, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int i14 = 1032 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 15;
                        byte b7 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        c(b7, (short) (b7 | 141), (byte) 52, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(windowTouchSlop2, i14, iKeyCodeFromString, 1357589585, false, (String) objArr17[0], null);
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
        if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[3])[0];
            int i17 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i18 = ~System.identityHashCode(this);
            int i19 = i15 + 690218062 + ((~((-139264065) | i18)) * (-783)) + (((~(i18 | (-474859873))) | (-719140043)) * 783);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr18[2])[0] = i21 ^ (i21 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char scrollDefaultDelay2 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29944);
                int mirror = 1803 - AndroidCharacter.getMirror('0');
                int i22 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22;
                byte b8 = $$a[7];
                short s = (short) (b8 | 37);
                Object[] objArr19 = new Object[1];
                c(b8, s, (byte) s, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(scrollDefaultDelay2, mirror, i22, 986134021, false, (String) objArr19[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29944);
                    int i23 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1754;
                    int i24 = 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    byte b9 = $$a[7];
                    Object[] objArr20 = new Object[1];
                    c(b9, (short) (b9 | 89), (byte) 52, objArr20);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(minimumFlingVelocity, i23, i24, 1599039318, false, (String) objArr20[0], null);
                }
                Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i25 = ~iIdentityHashCode2;
                int i26 = (~(427041964 | i25)) | 637538882;
                int i27 = ~(iIdentityHashCode2 | (-424936457));
                int i28 = ((i26 | i27) * (-252)) + 1958610737 + ((i27 | (~(i25 | 1064580846))) * 252) + 889048225;
                int i29 = (i28 << 13) ^ i28;
                int i30 = i29 ^ (i29 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i30 ^ (i30 << 5);
            } else {
                Object[] objArr22 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{53131, 36921, 3278, 46650}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step3).substring(92, 93).codePointAt(0) + 14759), (-1) - ExpandableListView.getPackedPositionChild(0L), new char[]{59784, 6242, 61215, 64314, 30171, 45365, 60836, 23908, 44638, 35154, 30371, 11786, 36891, 27638, 44769, 30264}, objArr22);
                Class<?> cls4 = Class.forName((String) objArr22[0]);
                Object[] objArr23 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{22960, 23073, 48838, 64733}, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 56766), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 117, new char[]{39052, 32634, 45518, 20308, 36787, 39517, 50565, 62659, 27373, 26226, 681, 10282, 1548, 33664, 17041, 9474}, objArr23);
                int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr24 = {-1387311756};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42050 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 1725 - ImageFormat.getBitsPerPixel(0), 29 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 889048225, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char c = (char) (29943 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int deadChar = 1755 - KeyEvent.getDeadChar(0, 0);
                    int i31 = 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    byte b10 = $$a[7];
                    Object[] objArr25 = new Object[1];
                    c(b10, (short) (b10 | 89), (byte) 52, objArr25);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c, deadChar, i31, 1599039318, false, (String) objArr25[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                try {
                    Object[] objArr26 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{26361, 16739, 2977, 21741}, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), KeyEvent.normalizeMetaState(0), new char[]{31091, 59919, 40052, 5784, 34038, 1909, 16027, 5544, 38445, 44094, 58070, 2643, 1403, 24329, 24244, 29109, 42831, 55337, 9704, 54130, 26668, 60017}, objArr26);
                    Class<?> cls5 = Class.forName((String) objArr26[0]);
                    Object[] objArr27 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{37554, 10338, 56133, 20744}, (char) (TextUtils.indexOf("", "") + 2267), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.vida_preview_height) & (-865)) + 1160274450, new char[]{59542, 46785, 34977, 56761, 20262, 64145, 5045, 17891, 60640, 64332, 30811, 46599, 10581, 52383, 56109}, objArr27);
                    long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                        char cIndexOf4 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 29945);
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1755;
                        int i32 = 23 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        byte b11 = $$a[7];
                        short s2 = b11;
                        Object[] objArr28 = new Object[1];
                        c(b11, s2, (byte) (s2 | 52), objArr28);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf4, threadPriority, i32, 1596667560, false, (String) objArr28[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                        char c2 = (char) (29945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int windowTouchSlop3 = 1755 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int i33 = 23 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        byte b12 = $$a[7];
                        short s3 = (short) (b12 | 37);
                        Object[] objArr29 = new Object[1];
                        c(b12, s3, (byte) s3, objArr29);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c2, windowTouchSlop3, i33, 986134021, false, (String) objArr29[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            }
            int i34 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
            int i35 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
            if (i35 == i34) {
                int i36 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
                Object[] objArr30 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
                int i37 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
                int i38 = ~i37;
                int i39 = i36 + (-1061102753) + (((~((-743306034) | i38)) | (~(530703607 | i37))) * 217) + (((~(i37 | (-743306034))) | 541856512) * 217) + (((~(530703607 | i38)) | 743306033) * 217);
                int i40 = (i39 << 13) ^ i39;
                int i41 = i40 ^ (i40 >>> 17);
                ((int[]) objArr30[3])[0] = i41 ^ (i41 << 5);
                return;
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
            if (strArr3 != null) {
                int i42 = INotificationSideChannel + 1;
                notify = i42 % 128;
                int i43 = i42 % 2;
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i35];
            int i44 = i35 - 1;
            iArr[i44] = 1;
            Toast.makeText((Context) null, iArr[((i35 * i44) % 2) - 1], 1).show();
            int i45 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
            int i46 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            int i47 = ~i46;
            int i48 = 1936772197 + (((~((-629056591) | i47)) | 539664392) * (-1188));
            int i49 = (~(i46 | 629056590)) | 539664392;
            int i50 = ~(841659016 | i47);
            int i51 = i45 + i48 + ((i49 | i50) * 594) + (((~(629056590 | i47)) | (-931051215) | i50) * 594);
            int i52 = (i51 << 13) ^ i51;
            int i53 = i52 ^ (i52 >>> 17);
            ((int[]) objArr31[3])[0] = i53 ^ (i53 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 == null) {
            throw null;
        }
        int i54 = INotificationSideChannel + 119;
        notify = i54 % 128;
        while (true) {
            int i55 = i54 % 2;
            if (i2 >= strArr4.length) {
                throw null;
            }
            arrayList2.add(strArr4[i2]);
            i2++;
            i54 = notify + 51;
            INotificationSideChannel = i54 % 128;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = notify + 31;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        if (i4 != 2047873600 + (((~((-882545345) | iFreeMemory)) | 277385792) * 345) + (((~((-882545345) | (~iFreeMemory))) | (-1989918680)) * 345) + ((~(iFreeMemory | (-277385793))) * 345)) {
            int i5 = 881912096 % 2;
            throw new ArithmeticException();
        }
        int i6 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
        if (i6 != (-1205616388) + (((~(2021436859 | i7)) | 33640960) * 336) + (((~(i7 | 305525528)) | 1749552291) * (-168)) + (((~((~i7) | 305525528)) | 2021436859) * 168)) {
            int i8 = INotificationSideChannel + 125;
            notify = i8 % 128;
            if (i8 % 2 != 0) {
                int[] iArr = new int[1249772530];
                iArr[1249772529] = 0;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            } else {
                int[] iArr2 = new int[1249772530];
                iArr2[1249772529] = 1;
                int i9 = 2143915218 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        super.onResume();
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -58287939
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.SyariahChooseCardMembershipActivity.onStart():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c8, code lost:
    
        if (r1 == (((669516476 + ((r7 | (~(r8 | (-1111762001)))) * 920)) + (((~((-901486855) | r8)) | 565807110) * 920)) + (((~(r5 | (-1111762001))) | ((~((-565807111) | r8)) | (~((-335679745) | r5)))) * 920))) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ca, code lost:
    
        r1 = com.bpjstku.presentation.syariah.SyariahChooseCardMembershipActivity.notify + 111;
        com.bpjstku.presentation.syariah.SyariahChooseCardMembershipActivity.INotificationSideChannel = r1 % 128;
        r1 = r1 % 2;
        r1 = new int[1989588348];
        r1[1989588347(0x7696b57b, float:1.5283699E33)] = 1;
        r5 = 123854484 % 2;
        android.widget.Toast.makeText((android.content.Context) null, r1[-1], 1).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00eb, code lost:
    
        super.onCreate(r13);
        r13 = com.bpjstku.presentation.syariah.SyariahChooseCardMembershipActivity.INotificationSideChannel + 73;
        com.bpjstku.presentation.syariah.SyariahChooseCardMembershipActivity.notify = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f7, code lost:
    
        if ((r13 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f9, code lost:
    
        r13 = 20 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00fc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0104, code lost:
    
        throw new java.lang.RuntimeException("7393889");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
    
        if (r1 == ((((151258116 | r5) * (-374)) + 1193097396) + ((r5 | 42493970) * 374))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0069, code lost:
    
        if (r1 == ((((-1247165248) + (((~(1831012620 | r5)) | (-1001025078)) * (-948))) + ((~((~r5) | (-310928946))) * (-948))) - 958927388)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006b, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r6 = (java.lang.Object[]) null;
        r5 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1773424913;
        r7 = ~((-565807111) | r5);
        r8 = ~r5;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r13) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.SyariahChooseCardMembershipActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ CameraCharacteristicsApi28Impl TuitionPaymentFragmentbindingInflater1(final SyariahChooseCardMembershipActivity syariahChooseCardMembershipActivity) {
        int i = 2 % 2;
        CameraCharacteristicsApi28Impl.Companion companion = CameraCharacteristicsApi28Impl.INSTANCE;
        CameraCharacteristicsApi28Impl cameraCharacteristicsApi28ImplTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CameraCharacteristicsApi28Impl.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: lambdaonReady2androidxcameracamera2internalcompatCameraCaptureSessionCompatStateCallbackExecutorWrapper
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SyariahChooseCardMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (SyariahChooseKpjModel) obj);
            }
        }, syariahChooseCardMembershipActivity.asInterface);
        int i2 = INotificationSideChannel + 13;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            return cameraCharacteristicsApi28ImplTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit g() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 69;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = notify + 121;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        if (r14.TuitionPaymentFragmentbindingInflater1 == java.lang.Boolean.TRUE) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c0, code lost:
    
        if (r14.TuitionPaymentFragmentbindingInflater1 == java.lang.Boolean.TRUE) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c2, code lost:
    
        r14 = defpackage.getStringOrNull.INSTANCE;
        r8 = r1.getString(com.bpjstku.R.string.label_asik_program);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, "");
        r9 = r1.getString(com.bpjstku.R.string.label_asik_program_havent);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, "");
        r10 = r1.getString(com.bpjstku.R.string.label_asik_program);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, "");
        r14 = defpackage.getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(com.bpjstku.R.drawable.ic_failed, r8, r9, r10, new defpackage.CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda2(r1), r1.getString(com.bpjstku.R.string.action_return), new defpackage.CameraCaptureSessionCompatApi28Impl());
        r1.b = r14;
        r0 = r1.getSupportFragmentManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0109, code lost:
    
        if (r0.findFragmentByTag(r14.TuitionPaymentFragmentspecialinlinedviewModeldefault3) != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010b, code lost:
    
        r14.show(r0, r14.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0110, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0111, code lost:
    
        r14 = com.bpjstku.presentation.syariah.SyariahCheckEakadStatusActivity.INSTANCE;
        r0 = r1.asInterface;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
        com.bpjstku.presentation.syariah.SyariahCheckEakadStatusActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r1, r0.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0120, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object TuitionPaymentFragmentbindingInflater1(java.lang.Object[] r14) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.SyariahChooseCardMembershipActivity.TuitionPaymentFragmentbindingInflater1(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(SyariahChooseCardMembershipActivity syariahChooseCardMembershipActivity) {
        int i = 2 % 2;
        int i2 = notify + 125;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        AsikActiveParticipantSubmissionCheckActivity.Companion companion = AsikActiveParticipantSubmissionCheckActivity.INSTANCE;
        AsikActiveParticipantSubmissionCheckActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(syariahChooseCardMembershipActivity, AsikPointer.MENU.getType());
        Unit unit = Unit.INSTANCE;
        int i4 = notify + 105;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SyariahChooseCardMembershipActivity syariahChooseCardMembershipActivity, View view) {
        int i = 2 % 2;
        int i2 = notify + 115;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            CameraCharacteristicsApi28Impl cameraCharacteristicsApi28Impl = (CameraCharacteristicsApi28Impl) syariahChooseCardMembershipActivity.asBinder.getValue();
            FragmentManager supportFragmentManager = syariahChooseCardMembershipActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(cameraCharacteristicsApi28Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                cameraCharacteristicsApi28Impl.show(supportFragmentManager, cameraCharacteristicsApi28Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i4 = notify + 79;
                INotificationSideChannel = i4 % 128;
                int i5 = i4 % 2;
            }
            ViewPortBuilder.b();
            int i6 = INotificationSideChannel + 33;
            notify = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 73 / 0;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(SyariahChooseCardMembershipActivity syariahChooseCardMembershipActivity, SyariahChooseKpjModel syariahChooseKpjModel) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 123;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(syariahChooseKpjModel, "");
        if (i3 == 0) {
            ((ActivitySyariahChooseCardMembershipBinding) ((ViewBinding) syariahChooseCardMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).edtChooseKpj.setText(syariahChooseKpjModel.TuitionPaymentFragmentbindingInflater1);
            syariahChooseCardMembershipActivity.asInterface = syariahChooseKpjModel;
            return Unit.INSTANCE;
        }
        ((ActivitySyariahChooseCardMembershipBinding) ((ViewBinding) syariahChooseCardMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).edtChooseKpj.setText(syariahChooseKpjModel.TuitionPaymentFragmentbindingInflater1);
        syariahChooseCardMembershipActivity.asInterface = syariahChooseKpjModel;
        int i4 = 84 / 0;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault2(SyariahChooseCardMembershipActivity syariahChooseCardMembershipActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 79;
        notify = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = EncoderImplExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            ((ActivityResultContractsPickVisualMediaMediaCapabilities) TuitionPaymentFragmentspecialinlinedviewModeldefault3(606818094, EncoderImplExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{syariahChooseCardMembershipActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -606818092, zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2())).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            obj.hashCode();
            throw null;
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = EncoderImplExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) TuitionPaymentFragmentspecialinlinedviewModeldefault3(606818094, EncoderImplExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{syariahChooseCardMembershipActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -606818092, zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2())).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i3 = INotificationSideChannel + 5;
        notify = i3 % 128;
        if (i3 % 2 == 0) {
            return userAsBinder;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        SyariahChooseKpjModel syariahChooseKpjModel;
        SyariahChooseKpjModel syariahChooseKpjModel2;
        User user;
        String str;
        User user2;
        String str2;
        User user3;
        int i;
        SyariahChooseCardMembershipActivity syariahChooseCardMembershipActivity = (SyariahChooseCardMembershipActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = INotificationSideChannel + 119;
        notify = i3 % 128;
        String str3 = null;
        if (i3 % 2 != 0) {
            int i4 = 11 / 0;
            if (syariahChooseCardMembershipActivity.asInterface == null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(syariahChooseCardMembershipActivity, "Anda Belum Memilih KPJ", null);
            } else {
                syariahChooseKpjModel = syariahChooseCardMembershipActivity.asInterface;
                Intrinsics.checkNotNull(syariahChooseKpjModel);
                if (Intrinsics.areEqual(syariahChooseKpjModel.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "PU")) {
                    user = (User) syariahChooseCardMembershipActivity.g.getValue();
                    if (user != null) {
                        str = user.b;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        select selectVar = (select) syariahChooseCardMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                        user2 = (User) syariahChooseCardMembershipActivity.g.getValue();
                        if (user2 != null) {
                            i = notify + 89;
                            INotificationSideChannel = i % 128;
                            if (i % 2 != 0) {
                                String str4 = user2.b;
                                str3.hashCode();
                                throw null;
                            }
                            str2 = user2.b;
                        } else {
                            str2 = null;
                        }
                        String strValueOf = String.valueOf(str2);
                        user3 = (User) syariahChooseCardMembershipActivity.g.getValue();
                        if (user3 != null) {
                            int i5 = INotificationSideChannel + 89;
                            notify = i5 % 128;
                            int i6 = i5 % 2;
                            str3 = user3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        }
                        selectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CheckSubmissionRequest(strValueOf, String.valueOf(str3), null, 4, null));
                    }
                } else {
                    syariahChooseKpjModel2 = syariahChooseCardMembershipActivity.asInterface;
                    Intrinsics.checkNotNull(syariahChooseKpjModel2);
                    if (Intrinsics.areEqual(syariahChooseKpjModel2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "BPU")) {
                        SyariahCheckEakadStatusActivity.Companion companion = SyariahCheckEakadStatusActivity.INSTANCE;
                        SyariahChooseCardMembershipActivity syariahChooseCardMembershipActivity2 = syariahChooseCardMembershipActivity;
                        SyariahChooseKpjModel syariahChooseKpjModel3 = syariahChooseCardMembershipActivity.asInterface;
                        Intrinsics.checkNotNull(syariahChooseKpjModel3);
                        SyariahCheckEakadStatusActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(syariahChooseCardMembershipActivity2, syariahChooseKpjModel3.d);
                    } else {
                        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Maaf Kepesertaan PMI untuk saat ini belum dapat menggunakan layanan syariah", 0).show();
                    }
                }
            }
        } else if (syariahChooseCardMembershipActivity.asInterface == null) {
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(syariahChooseCardMembershipActivity, "Anda Belum Memilih KPJ", null);
        } else {
            syariahChooseKpjModel = syariahChooseCardMembershipActivity.asInterface;
            Intrinsics.checkNotNull(syariahChooseKpjModel);
            if (Intrinsics.areEqual(syariahChooseKpjModel.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "PU")) {
                user = (User) syariahChooseCardMembershipActivity.g.getValue();
                if (user != null) {
                    str = user.b;
                } else {
                    str = null;
                }
                if (str != null) {
                    select selectVar2 = (select) syariahChooseCardMembershipActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    user2 = (User) syariahChooseCardMembershipActivity.g.getValue();
                    if (user2 != null) {
                        i = notify + 89;
                        INotificationSideChannel = i % 128;
                        if (i % 2 != 0) {
                            String str5 = user2.b;
                            str3.hashCode();
                            throw null;
                        }
                        str2 = user2.b;
                    } else {
                        str2 = null;
                    }
                    String strValueOf2 = String.valueOf(str2);
                    user3 = (User) syariahChooseCardMembershipActivity.g.getValue();
                    if (user3 != null) {
                        int i7 = INotificationSideChannel + 89;
                        notify = i7 % 128;
                        int i8 = i7 % 2;
                        str3 = user3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    }
                    selectVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CheckSubmissionRequest(strValueOf2, String.valueOf(str3), null, 4, null));
                }
            } else {
                syariahChooseKpjModel2 = syariahChooseCardMembershipActivity.asInterface;
                Intrinsics.checkNotNull(syariahChooseKpjModel2);
                if (Intrinsics.areEqual(syariahChooseKpjModel2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "BPU")) {
                    SyariahCheckEakadStatusActivity.Companion companion2 = SyariahCheckEakadStatusActivity.INSTANCE;
                    SyariahChooseCardMembershipActivity syariahChooseCardMembershipActivity3 = syariahChooseCardMembershipActivity;
                    SyariahChooseKpjModel syariahChooseKpjModel4 = syariahChooseCardMembershipActivity.asInterface;
                    Intrinsics.checkNotNull(syariahChooseKpjModel4);
                    SyariahCheckEakadStatusActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(syariahChooseCardMembershipActivity3, syariahChooseKpjModel4.d);
                } else {
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Maaf Kepesertaan PMI untuk saat ini belum dapat menggunakan layanan syariah", 0).show();
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(SyariahChooseCardMembershipActivity syariahChooseCardMembershipActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(-829523970, zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{syariahChooseCardMembershipActivity, virtualCameraAdapter1}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 829523970, zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    public static /* synthetic */ Unit b(SyariahChooseCardMembershipActivity syariahChooseCardMembershipActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(2080997208, zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{syariahChooseCardMembershipActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -2080997205, zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    static {
        cancelAll = 1;
        INotificationSideChannel();
        INSTANCE = new Companion(null);
        int i = onTransact + 117;
        cancelAll = i % 128;
        int i2 = i % 2;
    }

    public static final /* synthetic */ getStringOrNull TuitionPaymentFragmentspecialinlinedviewModeldefault3(SyariahChooseCardMembershipActivity syariahChooseCardMembershipActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (getStringOrNull) TuitionPaymentFragmentspecialinlinedviewModeldefault3(1858353825, zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{syariahChooseCardMembershipActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1858353824, zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    private final ActivityResultContractsPickVisualMediaMediaCapabilities onTransact() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = EncoderImplExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (ActivityResultContractsPickVisualMediaMediaCapabilities) TuitionPaymentFragmentspecialinlinedviewModeldefault3(606818094, EncoderImplExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -606818092, zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 95;
        notify = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 45;
        notify = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_syariah_choose_card_membership;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 125;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = notify + 81;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 33 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = notify + 29;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = notify + 115;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void INotificationSideChannel() {
        d = -6377398940819159759L;
        asInterface = 394357477;
        g = (char) 34097;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r7, int r8, short r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r0 = com.bpjstku.presentation.syariah.SyariahChooseCardMembershipActivity.$$c
            int r7 = r7 + 102
            int r9 = r9 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r7 = r9
            r5 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L21:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r6
        L28:
            int r9 = r9 + r3
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.SyariahChooseCardMembershipActivity.$$i(short, int, short):java.lang.String");
    }
}
