package com.bpjstku.presentation.vocational;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.vocation.model.request.VocationProfileRequest;
import com.bpjstku.databinding.ActivityVocationalRegisteredParticipantBinding;
import com.bpjstku.domain.user.model.SubscribedProgram;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.domain.vocation.model.Bank;
import com.bpjstku.domain.vocation.model.VocationProfile;
import com.bpjstku.presentation.main.MainActivity;
import com.bpjstku.presentation.vocational.VocationalRegisteredParticipantActivity;
import com.bpjstku.presentation.vocational.model.VocationalRegistration;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.libraries.places.internal.zzrt;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.AutoValue_MediaSpec1;
import defpackage.CameraUseCaseAdapter;
import defpackage.EncoderImplByteBufferInput;
import defpackage.IncorrectCaptureStateQuirk;
import defpackage.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.applyCheckMarkTint;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.register;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0014\u001a\u00020\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0015\u0010\u0007\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0017\u0010\t\u001a\u0004\u0018\u00010\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00188\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00020\u001a8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001d8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001e"}, d2 = {"Lcom/bpjstku/presentation/vocational/VocationalRegisteredParticipantActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityVocationalRegisteredParticipantBinding;", "<init>", "()V", "", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "a", "asInterface", "onResume", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LPreviewDelayWhenVideoCaptureIsBoundQuirk;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lcom/bpjstku/domain/user/model/User;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/domain/vocation/model/VocationProfile;", "Lcom/bpjstku/domain/vocation/model/VocationProfile;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I", "g"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VocationalRegisteredParticipantActivity extends BindingBaseActivity<ActivityVocationalRegisteredParticipantBinding> {
    private static int INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f656a;
    private static int asBinder;
    private static short[] asInterface;
    private static int d;
    private static int g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: ImageCaptureWithFlashUnderexposureQuirk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private VocationProfile b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {49, 89, 41, 48};
    private static final int $$f = 9;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {46, 126, -84, 108, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 108;
    private static int notify = 0;
    private static int cancelAll = 0;
    private static int onTransact = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~((~i4) | i7);
        int i9 = i | i8 | (~(i5 | i4));
        int i10 = (~(i4 | i)) | (~(i7 | i4)) | (~(i7 | i));
        int i11 = i + i5 + i3 + (1351532378 * i2) + (1237199896 * i6);
        int i12 = i11 * i11;
        int i13 = ((-211156802) * i) + 1314914304 + ((-491389116) * i5) + (2007367491 * i9) + (i10 * (-2007367491)) + ((-2007367491) * i8) + (1796210688 * i3) + ((-1818230784) * i2) + ((-914358272) * i6) + ((-2051670016) * i12);
        int i14 = ((i * 406040238) - 634933780) + (i5 * 406038884) + (i9 * (-677)) + (i10 * 677) + (i8 * 677) + (i3 * 406039561) + (i2 * 1283666474) + (i6 * 1712827608) + (i12 * (-77201408));
        int i15 = i13 + (i14 * i14 * 1831469056);
        if (i15 != 1) {
            if (i15 != 2) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            }
            int i16 = 2 % 2;
            int i17 = cancelAll + 119;
            onTransact = i17 % 128;
            int i18 = i17 % 2;
            return null;
        }
        VocationalRegisteredParticipantActivity vocationalRegisteredParticipantActivity = (VocationalRegisteredParticipantActivity) objArr[0];
        int i19 = 2 % 2;
        int i20 = onTransact + 45;
        cancelAll = i20 % 128;
        int i21 = i20 % 2;
        VocationalRegisteredParticipantActivity vocationalRegisteredParticipantActivity2 = vocationalRegisteredParticipantActivity;
        Intrinsics.checkNotNullParameter(vocationalRegisteredParticipantActivity2, "");
        vocationalRegisteredParticipantActivity2.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = vocationalRegisteredParticipantActivity.getString(R.string.title_vocational_program);
        Intrinsics.checkNotNullExpressionValue(string, "");
        vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        int i22 = cancelAll + 75;
        onTransact = i22 % 128;
        int i23 = i22 % 2;
        return null;
    }

    private static void c(int i, byte b, int i2, Object[] objArr) {
        int i3 = (b * 14) + 84;
        int i4 = 196 - i;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[53 - i2];
        int i5 = 52 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3 = (i3 + (-i5)) - 11;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            i4++;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = (i3 + (-bArr[i4])) - 11;
        }
    }

    public static final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(VocationalRegisteredParticipantActivity vocationalRegisteredParticipantActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 113;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            MainActivity.Companion companion = MainActivity.INSTANCE;
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(vocationalRegisteredParticipantActivity, null, null, 101);
            vocationalRegisteredParticipantActivity.finish();
        } else {
            MainActivity.Companion companion2 = MainActivity.INSTANCE;
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(vocationalRegisteredParticipantActivity, null, null, 6);
            vocationalRegisteredParticipantActivity.finish();
        }
        int i3 = onTransact + 73;
        cancelAll = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(VocationalRegisteredParticipantActivity vocationalRegisteredParticipantActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        VocationalRatingActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = VocationalRatingActivity.INSTANCE;
        VocationalRegisteredParticipantActivity vocationalRegisteredParticipantActivity2 = vocationalRegisteredParticipantActivity;
        VocationProfile vocationProfile = vocationalRegisteredParticipantActivity.b;
        if (vocationProfile == null) {
            int i4 = onTransact + 41;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i6 = onTransact + 59;
            cancelAll = i6 % 128;
            int i7 = i6 % 2;
            vocationProfile = null;
        }
        VocationalRatingActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(vocationalRegisteredParticipantActivity2, vocationProfile);
        vocationalRegisteredParticipantActivity.finish();
    }

    public static final /* synthetic */ void b(VocationalRegisteredParticipantActivity vocationalRegisteredParticipantActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 73;
        onTransact = i2 % 128;
        VocationProfile vocationProfile = null;
        if (i2 % 2 == 0) {
            VocationalRegistrationActivity.Companion tuitionPaymentFragmentbindingInflater1 = VocationalRegistrationActivity.INSTANCE;
            VocationProfile vocationProfile2 = vocationalRegisteredParticipantActivity.b;
            vocationProfile.hashCode();
            throw null;
        }
        VocationalRegistrationActivity.Companion tuitionPaymentFragmentbindingInflater2 = VocationalRegistrationActivity.INSTANCE;
        VocationalRegisteredParticipantActivity vocationalRegisteredParticipantActivity2 = vocationalRegisteredParticipantActivity;
        VocationProfile vocationProfile3 = vocationalRegisteredParticipantActivity.b;
        if (vocationProfile3 == null) {
            int i3 = onTransact + 25;
            cancelAll = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = cancelAll + 55;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 3;
            }
        } else {
            vocationProfile = vocationProfile3;
        }
        Intrinsics.checkNotNullParameter(vocationProfile, "");
        String str = null;
        SubscribedProgram subscribedProgram = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        VocationalRegistrationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(vocationalRegisteredParticipantActivity2, new VocationalRegistration(str, vocationProfile.getInterfaceDescriptor, subscribedProgram, str2, vocationProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault1, str3, str4, vocationProfile.getRoot, vocationProfile.getItem, vocationProfile.com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH java.lang.String, new Bank(vocationProfile.b, "", vocationProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ""), vocationProfile.read, vocationProfile.getExtras, vocationProfile.MediaBrowserCompat, vocationProfile.subscribe, vocationProfile.getNotifyChildrenChangedOptions, vocationProfile.d, vocationProfile.a, null, null, null, null, null, null, 16515181, null));
        vocationalRegisteredParticipantActivity.finish();
    }

    public VocationalRegisteredParticipantActivity() {
        final VocationalRegisteredParticipantActivity vocationalRegisteredParticipantActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<PreviewDelayWhenVideoCaptureIsBoundQuirk>() { // from class: com.bpjstku.presentation.vocational.VocationalRegisteredParticipantActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [PreviewDelayWhenVideoCaptureIsBoundQuirk, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ PreviewDelayWhenVideoCaptureIsBoundQuirk invoke() {
                LifecycleOwner lifecycleOwner = vocationalRegisteredParticipantActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PreviewDelayWhenVideoCaptureIsBoundQuirk.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.vocational.VocationalRegisteredParticipantActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = vocationalRegisteredParticipantActivity;
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.vocational.VocationalRegisteredParticipantActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/vocational/VocationalRegisteredParticipantActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, VocationalRegisteredParticipantActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityVocationalRegisteredParticipantBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        VocationalRegisteredParticipantActivity$bindingInflater$1 vocationalRegisteredParticipantActivity$bindingInflater$1 = VocationalRegisteredParticipantActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = cancelAll + 47;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return vocationalRegisteredParticipantActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ((PreviewDelayWhenVideoCaptureIsBoundQuirk) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).onTransact.observe(this, new IncorrectCaptureStateQuirk(this));
        int i2 = cancelAll + 13;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 73 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((PreviewDelayWhenVideoCaptureIsBoundQuirk) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).onTransact.observe(this, new IncorrectCaptureStateQuirk(this));
        int i2 = onTransact + 23;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = cancelAll + 105;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Button button = ((ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnNext;
            Intrinsics.checkNotNullExpressionValue(button, "");
            Button button2 = button;
            Intrinsics.checkNotNullParameter(button2, "");
            button2.setEnabled(true);
            return;
        }
        Button button3 = ((ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnNext;
        Intrinsics.checkNotNullExpressionValue(button3, "");
        Button button4 = button3;
        Intrinsics.checkNotNullParameter(button4, "");
        button4.setEnabled(false);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        String str = null;
        int i2 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step1).substring(0, 4).length() + 488925050;
        int i3 = ~length;
        if (i2 != (-1234662064) + ((~(1866915975 | i3)) * 979) + ((length | 1036928432) * (-979)) + (((~(length | 1866915975)) | (~(i3 | 1036928432))) * 979)) {
            int[] iArr = new int[1071522646];
            iArr[1071522645] = 1;
            int i4 = 1646951822 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i5 = onTransact + 119;
            cancelAll = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i8 = ~System.identityHashCode(this);
        if (i7 != 768224263 + (((~(1968976189 | i8)) | (-253064859)) * (-983)) + (((~(i8 | (-253064859))) | 85209112) * 983)) {
            throw new RuntimeException("345211884");
        }
        super.onResume();
        User user = (User) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        if (user != null) {
            PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk = (PreviewDelayWhenVideoCaptureIsBoundQuirk) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            String str2 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str2 == null) {
                str2 = "";
            }
            SubscribedProgram subscribedProgramTuitionPaymentFragmentspecialinlinedviewModeldefault1 = register.TuitionPaymentFragmentspecialinlinedviewModeldefault1(user);
            if (subscribedProgramTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                int i9 = onTransact + 79;
                cancelAll = i9 % 128;
                if (i9 % 2 != 0) {
                    String str3 = subscribedProgramTuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
                    throw null;
                }
                str = subscribedProgramTuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
            } else {
                int i10 = onTransact + 103;
                cancelAll = i10 % 128;
                int i11 = i10 % 2;
            }
            previewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new VocationProfileRequest(str2, str != null ? str : ""));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #0 {all -> 0x0048, blocks: (B:5:0x0016, B:13:0x0040, B:11:0x0030, B:9:0x0027), top: B:18:0x0011 }] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        cancelAll = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                int i3 = 12 / 0;
                if (p0.getItemId() == 16908332) {
                    getOnBackPressedDispatcher().onBackPressed();
                    int i4 = cancelAll + 57;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                if (p0.getItemId() == 16908332) {
                    getOnBackPressedDispatcher().onBackPressed();
                    int i6 = cancelAll + 57;
                    onTransact = i6 % 128;
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

    /* JADX WARN: Code duplicated, block: B:53:0x01c8 A[PHI: r0
  0x01c8: PHI (r0v9 int) = (r0v8 int), (r0v42 int) binds: [B:52:0x01c6, B:49:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01ca A[PHI: r0
  0x01ca: PHI (r0v39 int) = (r0v8 int), (r0v42 int) binds: [B:52:0x01c6, B:49:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
    private static void e(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        int length;
        byte[] bArr;
        int i6 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(g)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                int i7 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2266;
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 34;
                byte length2 = (byte) $$c.length;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, i7, iIndexOf, 1387473586, false, $$i((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                int i8 = $10 + 85;
                int i9 = i8 % 128;
                $11 = i9;
                if (i8 % 2 == 0) {
                    throw null;
                }
                byte[] bArr2 = f656a;
                if (bArr2 != null) {
                    int i10 = i9 + 119;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    for (int i11 = 0; i11 < length; i11++) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i11])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) KeyEvent.getDeadChar(0, 0), View.MeasureSpec.getMode(0) + 3358, 17 - MotionEvent.axisFromString(""), -1054011043, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr[i11] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    int i12 = $10 + 79;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    byte[] bArr3 = f656a;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(asBinder)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2267;
                        int iResolveSizeAndState = 33 - View.resolveSizeAndState(0, 0, 0);
                        byte length3 = (byte) $$c.length;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetBefore, keyRepeatTimeout, iResolveSizeAndState, 1387473586, false, $$i((byte) 0, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) g) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) asInterface[i3 + ((int) (((long) asBinder) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) g) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i14 = $11 + 59;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    i4 = ((i3 / iIntValue) >>> 5) >>> ((int) (((long) asBinder) * 3046761265686732006L));
                    if (z) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                } else {
                    i4 = ((i3 + iIntValue) - 2) + ((int) (((long) asBinder) ^ 3046761265686732006L));
                    if (z) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i4 + i5;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(d), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 55904), Color.red(0) + 2855, 13 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1529949196, false, $$i(b4, b5, (byte) (b5 - 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = f656a;
                if (bArr4 != null) {
                    int length4 = bArr4.length;
                    byte[] bArr5 = new byte[length4];
                    for (int i15 = 0; i15 < length4; i15++) {
                        bArr5[i15] = (byte) (((long) bArr4[i15]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z2) {
                        int i16 = $11 + 109;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        byte[] bArr6 = f656a;
                        int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i18]) ^ 3046761265686732006L)) + s)) ^ b));
                    } else {
                        short[] sArr = asInterface;
                        int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i19]) ^ 3046761265686732006L)) + s)) ^ b));
                        int i20 = $11 + 57;
                        $10 = i20 % 128;
                        int i21 = i20 % 2;
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

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        Object[] objArr2;
        VocationalRegisteredParticipantActivity vocationalRegisteredParticipantActivity = (VocationalRegisteredParticipantActivity) objArr[0];
        int i = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
            int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0);
            int iArgb = Color.argb(0, 0, 0, 0) + 23;
            byte b = $$a[7];
            Object[] objArr3 = new Object[1];
            c((short) 193, b, (byte) (b | 15), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, iLastIndexOf, iArgb, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 29944);
                int i2 = 1755 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 23;
                byte b2 = $$a[7];
                Object[] objArr4 = new Object[1];
                c((short) 156, b2, b2, objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatDelay, i2, iCombineMeasuredStates, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i3 = (((~((~iFreeMemory) | 519925466)) * 130) - 2077534097) + (((~(iFreeMemory | 519925466)) | 306274432) * 130) + 617337700;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_card_alto).substring(45, 50).codePointAt(2) - 2020923657, View.resolveSize(0, 0) - 65, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.details_message_invalid).substring(0, 6).codePointAt(2) - 211), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_permission_screen_primary_cta_text).substring(0, 14).codePointAt(7) - 156), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 1852500890, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_consent_screen_cta_text_retake_selfie).substring(8, 13).length() - 2020923579, (ViewConfiguration.getEdgeSlop() >> 16) - 65, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step3).substring(1, 3).length() + 89), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 28), (-1852500768) - (Process.myTid() >> 22), objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, vocationalRegisteredParticipantActivity)).intValue();
            try {
                Object[] objArr8 = {541088202};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42048 - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.lastIndexOf("", '0', 0) + 1727, (ViewConfiguration.getPressedStateDuration() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = EncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr8), 617337700, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29944);
                    int iCombineMeasuredStates2 = 1755 - View.combineMeasuredStates(0, 0);
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
                    byte b3 = $$a[7];
                    Object[] objArr9 = new Object[1];
                    c((short) 156, b3, b3, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(edgeSlop, iCombineMeasuredStates2, iLastIndexOf2, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    Object[] objArr10 = new Object[1];
                    e((-2020923581) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 171, (short) ((-51) - View.MeasureSpec.getSize(0)), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 32), (-1852500752) - (ViewConfiguration.getScrollBarSize() >> 8), objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto6).substring(39, 40).codePointAt(0) - 2020923610, (ViewConfiguration.getTouchSlop() >> 8) - 65, (short) ((Process.myPid() >> 22) - 59), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step3).substring(92, 93).length() - 97), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1852500766, objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29944);
                        int scrollDefaultDelay2 = 1755 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int scrollDefaultDelay3 = 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        short s = (short) ($$b - 4);
                        byte b4 = $$a[7];
                        Object[] objArr12 = new Object[1];
                        c(s, b4, b4, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollDefaultDelay, scrollDefaultDelay2, scrollDefaultDelay3, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) (29945 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1755;
                        int iIndexOf = 23 - TextUtils.indexOf("", "");
                        byte b5 = $$a[7];
                        Object[] objArr13 = new Object[1];
                        c((short) 193, b5, (byte) (b5 | 15), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, threadPriority, iIndexOf, 986134021, false, (String) objArr13[0], null);
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
        int i6 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0];
        int i7 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        if (i7 != i6) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i7));
        }
        int i8 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
        Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
        int iNextInt = new Random().nextInt();
        int i9 = i8 + ((((~(536640254 | iNextInt)) | 188745920) * 449) - 1344203272) + (((~((~iNextInt) | 536640254)) | 188745920) * 449);
        int i10 = (i9 << 13) ^ i9;
        int i11 = i10 ^ (i10 >>> 17);
        ((int[]) objArr14[3])[0] = i11 ^ (i11 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char trimmedLength = (char) TextUtils.getTrimmedLength("");
            int iResolveOpacity = 1031 - Drawable.resolveOpacity(0, 0);
            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16;
            byte b6 = $$a[7];
            Object[] objArr15 = new Object[1];
            c((short) 52, b6, b6, objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(trimmedLength, iResolveOpacity, iIndexOf2, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 2020923618, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 101, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_bca_prima).substring(0, 9).length() - 60), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_save_card).substring(0, 1).length() + 42), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1852500763, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e((ViewConfiguration.getScrollBarSize() >> 8) - 2020923578, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 76, (short) ((-58) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 97), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_expiration_message).substring(3, 4).length() - 1852500731, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
            int iIndexOf3 = 1031 - TextUtils.indexOf("", "", 0, 0);
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 15;
            byte b7 = $$a[7];
            Object[] objArr18 = new Object[1];
            c((short) 156, b7, b7, objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(deadChar, iIndexOf3, offsetAfter, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i12 = cancelAll + 25;
            onTransact = i12 % 128;
            int i13 = i12 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1031;
                int i14 = 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                byte[] bArr = $$a;
                Object[] objArr19 = new Object[1];
                c(bArr[7], bArr[5], (byte) 52, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cLastIndexOf, maximumFlingVelocity, i14, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i15 = ((int[]) objArr20[3])[0];
            int i16 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i17 = ((((-1210876524) + (((-139329602) | iElapsedRealtime) * (-627))) + (((~((-94426533) | iElapsedRealtime)) | 149853637) * (-627))) + (((~(iElapsedRealtime | 149853637)) | (~((~iElapsedRealtime) | 94426532))) * 627)) - 1129731614;
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr2[2])[0] = i19 ^ (i19 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step7).substring(0, 3).codePointAt(1) - 2020923619, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_internet_instruction_1).substring(0, 3).length() - 68, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cancel_transaction).substring(1, 7).length() - 120), (byte) ((-123) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1852500795, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 2020923585, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.status_promo_amount).substring(4, 5).codePointAt(0) - 144, (short) (TextUtils.lastIndexOf("", '0') + 92), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step6).substring(0, 1).codePointAt(0) - 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1852500779, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, vocationalRegisteredParticipantActivity)).intValue();
            Object[] objArr23 = {541088202};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (Color.green(0) + 46038), 1134 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 18 - (ViewConfiguration.getScrollBarSize() >> 8), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -1129731614, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char trimmedLength2 = (char) TextUtils.getTrimmedLength("");
                int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0) + 1032;
                int i20 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                byte b8 = $$a[7];
                Object[] objArr25 = new Object[1];
                c((short) 52, b8, b8, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(trimmedLength2, iLastIndexOf3, i20, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 45993), 1117 - (ViewConfiguration.getScrollDefaultDelay() >> 16), Color.alpha(0) + 17), Boolean.TYPE});
            }
            objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int iBlue = 1031 - Color.blue(0);
                int packedPositionChild = 14 - ExpandableListView.getPackedPositionChild(0L);
                byte[] bArr2 = $$a;
                Object[] objArr26 = new Object[1];
                c(bArr2[7], bArr2[5], (byte) 52, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(threadPriority2, iBlue, packedPositionChild, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr2);
            try {
                Object[] objArr27 = new Object[1];
                e(TextUtils.indexOf("", "", 0) - 2020923582, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_instruction_step4).substring(0, 1).length() - 66, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto6_bni).substring(8, 9).codePointAt(0) - 83), (byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.vida_preview_height) & (-865)) - 85), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step7).substring(0, 3).length() - 1852500755, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto6_bni).substring(8, 9).length() - 2020923579, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.processing_payment).substring(6, 7).codePointAt(0) - 180, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 70), (byte) ((-95) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) - 1852500729, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                    int i21 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1031;
                    int iLastIndexOf4 = TextUtils.lastIndexOf("", '0') + 16;
                    byte b9 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c((short) 156, b9, b9, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(maxKeyCode, i21, iLastIndexOf4, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                    int i22 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1030;
                    int pressedStateDuration = 15 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte b10 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    c((short) 52, b10, b10, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c2, i22, pressedStateDuration, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i23 = ((int[]) objArr2[1])[0];
        int i24 = ((int[]) objArr2[3])[0];
        if (i24 == i23) {
            int i25 = cancelAll + 5;
            onTransact = i25 % 128;
            int i26 = i25 % 2;
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr2[2])[0];
            int i28 = ((int[]) objArr2[3])[0];
            int i29 = ((int[]) objArr2[1])[0];
            String[] strArr3 = (String[]) objArr2[0];
            int iNextInt2 = new Random().nextInt(377831551);
            int i30 = i27 + (((~((-16258057) | iNextInt2)) | 225395561) * 398) + 1754970349 + (((~((~iNextInt2) | (-16258057))) | 225395561) * 398);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr31[2])[0] = i32 ^ (i32 << 5);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr2[0];
        if (strArr4 != null) {
            for (String str2 : strArr4) {
                int i33 = onTransact + 65;
                cancelAll = i33 % 128;
                int i34 = i33 % 2;
                arrayList2.add(str2);
            }
        }
        int[] iArr = new int[i24];
        int i35 = i24 - 1;
        iArr[i35] = 1;
        Toast.makeText((Context) null, iArr[((i24 * i35) % 2) - 1], 1).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i36 = ((int[]) objArr2[2])[0];
        int i37 = ((int[]) objArr2[3])[0];
        int i38 = ((int[]) objArr2[1])[0];
        String[] strArr5 = (String[]) objArr2[0];
        int iNextInt3 = new Random().nextInt(22959741);
        int i39 = (~(391609003 | iNextInt3)) | 547390484;
        int i40 = ~iNextInt3;
        int i41 = i36 + 831689741 + ((i39 | (~((-303110315) | i40))) * 886) + (((~(i40 | (-391609004))) | 635889173) * (-1772)) + ((~(i40 | 635889173)) * 886);
        int i42 = (i41 << 13) ^ i41;
        int i43 = i42 ^ (i42 >>> 17);
        ((int[]) objArr32[2])[0] = i43 ^ (i43 << 5);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b7, code lost:
    
        if (r1 != ((((-1395971716) + ((((~((-358383762) | r4)) | 73171073) | (~(2074295092 | r4))) * (-1136))) + ((((~((-358383762) | r3)) | (~(2074295092 | r3))) | (~((-1789082405) | r4))) * (-568))) + (((~(r3 | (-73171074))) | ((~(r4 | (-2074295093))) | (~(358383761 | r4)))) * 568))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b9, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.vocational.VocationalRegisteredParticipantActivity.onTransact + 83;
        com.bpjstku.presentation.vocational.VocationalRegisteredParticipantActivity.cancelAll = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c5, code lost:
    
        if ((r1 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c7, code lost:
    
        r0 = 54 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ca, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d2, code lost:
    
        throw new java.lang.RuntimeException("-1020820083");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00da, code lost:
    
        throw new java.lang.RuntimeException("-822654142");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0047, code lost:
    
        if (r1 == (((1563865192 + (((~(r4 | 2140139487)) | (~((-201605769) | r4))) * (-184))) + (((554273088 | (~((-755878857) | r4))) | (~(1585866399 | r4))) * 184)) - 1300885824)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006c, code lost:
    
        if (r1 == (((-255055586) + (((~((~r4) | (-119638314))) | 949625856) * (-591))) + ((r4 | (-119638314)) * 591))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006e, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r3 = java.lang.System.identityHashCode(r9);
        r4 = ~r3;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalRegisteredParticipantActivity.onStart():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c7, code lost:
    
        if (r1 != (((-2001835462) + ((r5 | r2) * (-502))) + ((r2 | (~(r4 | (-293601315)))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_DRAWPATH))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c9, code lost:
    
        super.onCreate(r11);
        r11 = com.bpjstku.presentation.vocational.VocationalRegisteredParticipantActivity.cancelAll + 39;
        com.bpjstku.presentation.vocational.VocationalRegisteredParticipantActivity.onTransact = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d5, code lost:
    
        if ((r11 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e1, code lost:
    
        throw new java.lang.RuntimeException("977187060");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0043, code lost:
    
        if (r1 == (((1312266488 + (((~(1787804474 | r5)) | (~((-957816932) | r4))) * (-370))) + ((((~(r4 | 1787804474)) | (~(r5 | (-957816932)))) | 1116248856) * (-370))) + 695216304)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0075, code lost:
    
        if (r1 == (((654292452 + (((~((-1048139187) | r5)) | 1878126729) * (-865))) + ((~(r4 | 1048139186)) * 865)) + (((~(1878126729 | r5)) | (~(r5 | 1048139186))) * 865))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0077, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r4 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 1798755168;
        r4 = ~r2;
        r5 = (~((-327254592) | r4)) | 33653277;
        r2 = ~(r2 | (-1749564609));
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalRegisteredParticipantActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault3(VocationalRegisteredParticipantActivity vocationalRegisteredParticipantActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i4 = onTransact + 65;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            return userAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:36:0x0106  */
    /* JADX WARN: Code duplicated, block: B:38:0x0111  */
    /* JADX WARN: Code duplicated, block: B:40:0x0117  */
    /* JADX WARN: Code duplicated, block: B:44:0x0130  */
    /* JADX WARN: Code duplicated, block: B:47:0x019e  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x0206  */
    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(VocationalRegisteredParticipantActivity vocationalRegisteredParticipantActivity, VirtualCameraAdapter1 virtualCameraAdapter1) throws ParseException {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = onTransact + 75;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            vocationalRegisteredParticipantActivity.MediaBrowserCompat();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            vocationalRegisteredParticipantActivity.IconCompatParcelizer();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            vocationalRegisteredParticipantActivity.IconCompatParcelizer();
            VocationProfile vocationProfile = (VocationProfile) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            vocationalRegisteredParticipantActivity.b = vocationProfile;
            if (vocationProfile == null) {
                int i6 = onTransact + 13;
                cancelAll = i6 % 128;
                int i7 = i6 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                vocationProfile = null;
            }
            ActivityVocationalRegisteredParticipantBinding activityVocationalRegisteredParticipantBinding = (ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
            activityVocationalRegisteredParticipantBinding.tvFullName.setText(vocationProfile.INotificationSideChannelStub);
            activityVocationalRegisteredParticipantBinding.tvIdCard.setText(vocationProfile.write);
            activityVocationalRegisteredParticipantBinding.tvTraining.setText(vocationProfile.IconCompatParcelizer);
            activityVocationalRegisteredParticipantBinding.tvLpk.setText(vocationProfile.INotificationSideChannelDefault);
            if (vocationProfile.getSessionToken) {
                ActivityVocationalRegisteredParticipantBinding activityVocationalRegisteredParticipantBinding2 = (ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                activityVocationalRegisteredParticipantBinding2.clInfo.setBackgroundResource(R.drawable.border_green);
                activityVocationalRegisteredParticipantBinding2.tvRegisteredInformation.setText(vocationalRegisteredParticipantActivity.getString(R.string.label_registered_participant_information));
                activityVocationalRegisteredParticipantBinding2.imgInfo.setImageResource(R.drawable.ic_success);
                int i8 = (int) (24.0f / Resources.getSystem().getDisplayMetrics().density);
                activityVocationalRegisteredParticipantBinding2.clInfo.setPadding(i8, i8, i8, i8);
                TextView textView = activityVocationalRegisteredParticipantBinding2.tvRatingReminder;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(8);
                activityVocationalRegisteredParticipantBinding2.btnNext.setText(vocationalRegisteredParticipantActivity.getString(R.string.action_back));
                Button button = activityVocationalRegisteredParticipantBinding2.btnNext;
                Intrinsics.checkNotNullExpressionValue(button, "");
                AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button, new VocationalRegisteredParticipantActivity$showRegisteredAndHaveClassUI$1$1(vocationalRegisteredParticipantActivity));
            } else {
                Date date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).parse(vocationProfile.unsubscribe);
                Intrinsics.checkNotNull(date);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                calendar.add(5, -1);
                Date time = calendar.getTime();
                Intrinsics.checkNotNullExpressionValue(time, "");
                Date time2 = Calendar.getInstance().getTime();
                Calendar calendar2 = Calendar.getInstance();
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTime(time);
                if (calendar2.get(1) == calendar3.get(1)) {
                    int i9 = onTransact + 77;
                    cancelAll = i9 % 128;
                    if (i9 % 2 == 0 ? calendar2.get(2) != calendar3.get(2) : calendar2.get(4) != calendar3.get(3)) {
                        i = onTransact + 35;
                        cancelAll = i % 128;
                        if (i % 2 != 0) {
                            int i10 = 55 / 0;
                            if (time.before(time2)) {
                                ActivityVocationalRegisteredParticipantBinding activityVocationalRegisteredParticipantBinding3 = (ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                                activityVocationalRegisteredParticipantBinding3.clInfo.setBackgroundResource(R.drawable.border_green);
                                activityVocationalRegisteredParticipantBinding3.tvRegisteredInformation.setText(vocationalRegisteredParticipantActivity.getString(R.string.label_registered_participant_information));
                                activityVocationalRegisteredParticipantBinding3.imgInfo.setImageResource(R.drawable.ic_success);
                                int i11 = (int) (24.0f / Resources.getSystem().getDisplayMetrics().density);
                                activityVocationalRegisteredParticipantBinding3.clInfo.setPadding(i11, i11, i11, i11);
                                TextView textView2 = activityVocationalRegisteredParticipantBinding3.tvRatingReminder;
                                Intrinsics.checkNotNullExpressionValue(textView2, "");
                                textView2.setVisibility(0);
                                activityVocationalRegisteredParticipantBinding3.btnNext.setText(vocationalRegisteredParticipantActivity.getString(R.string.action_rate_training));
                                Button button2 = activityVocationalRegisteredParticipantBinding3.btnNext;
                                Intrinsics.checkNotNullExpressionValue(button2, "");
                                AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button2, new VocationalRegisteredParticipantActivity$showShouldRatingUI$1$1(vocationalRegisteredParticipantActivity));
                            } else {
                                i2 = onTransact + 89;
                                cancelAll = i2 % 128;
                                if (i2 % 2 == 0) {
                                    time.after(time2);
                                    throw null;
                                }
                                if (time.after(time2)) {
                                    int i12 = onTransact + 103;
                                    cancelAll = i12 % 128;
                                    int i13 = i12 % 2;
                                    if (vocationProfile.notify.length() <= 0) {
                                        ActivityVocationalRegisteredParticipantBinding activityVocationalRegisteredParticipantBinding4 = (ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                                        activityVocationalRegisteredParticipantBinding4.clInfo.setBackgroundResource(R.drawable.border_green);
                                        activityVocationalRegisteredParticipantBinding4.tvRegisteredInformation.setText(vocationalRegisteredParticipantActivity.getString(R.string.label_registered_participant_information));
                                        activityVocationalRegisteredParticipantBinding4.imgInfo.setImageResource(R.drawable.ic_success);
                                        int i14 = (int) (24.0f / Resources.getSystem().getDisplayMetrics().density);
                                        activityVocationalRegisteredParticipantBinding4.clInfo.setPadding(i14, i14, i14, i14);
                                        TextView textView3 = activityVocationalRegisteredParticipantBinding4.tvRatingReminder;
                                        Intrinsics.checkNotNullExpressionValue(textView3, "");
                                        textView3.setVisibility(8);
                                        activityVocationalRegisteredParticipantBinding4.btnNext.setText(vocationalRegisteredParticipantActivity.getString(R.string.action_back));
                                        Button button3 = activityVocationalRegisteredParticipantBinding4.btnNext;
                                        Intrinsics.checkNotNullExpressionValue(button3, "");
                                        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button3, new VocationalRegisteredParticipantActivity$showRegisteredAndHaveClassUI$1$1(vocationalRegisteredParticipantActivity));
                                    }
                                }
                                if (time.after(time2) && vocationProfile.notify.length() == 0) {
                                    ActivityVocationalRegisteredParticipantBinding activityVocationalRegisteredParticipantBinding5 = (ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                                    activityVocationalRegisteredParticipantBinding5.tvRegisteredInformation.setText(vocationalRegisteredParticipantActivity.getString(R.string.label_no_class_participant_information));
                                    activityVocationalRegisteredParticipantBinding5.imgInfo.setImageResource(R.drawable.ic_info_alert);
                                    activityVocationalRegisteredParticipantBinding5.clInfo.setBackgroundResource(R.drawable.border_mac_n_cheese);
                                    int i15 = (int) (24.0f / Resources.getSystem().getDisplayMetrics().density);
                                    activityVocationalRegisteredParticipantBinding5.clInfo.setPadding(i15, i15, i15, i15);
                                    TextView textView4 = activityVocationalRegisteredParticipantBinding5.tvRatingReminder;
                                    Intrinsics.checkNotNullExpressionValue(textView4, "");
                                    textView4.setVisibility(8);
                                    activityVocationalRegisteredParticipantBinding5.btnNext.setText(vocationalRegisteredParticipantActivity.getString(R.string.action_next));
                                    Button button4 = activityVocationalRegisteredParticipantBinding5.btnNext;
                                    Intrinsics.checkNotNullExpressionValue(button4, "");
                                    AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button4, new VocationalRegisteredParticipantActivity$showRegisteredHaveNoClassUI$1$1(vocationalRegisteredParticipantActivity));
                                }
                            }
                        } else if (!time.before(time2)) {
                            i2 = onTransact + 89;
                            cancelAll = i2 % 128;
                            if (i2 % 2 == 0) {
                                time.after(time2);
                                throw null;
                            }
                            if (time.after(time2)) {
                                int i16 = onTransact + 103;
                                cancelAll = i16 % 128;
                                int i17 = i16 % 2;
                                if (vocationProfile.notify.length() <= 0) {
                                    ActivityVocationalRegisteredParticipantBinding activityVocationalRegisteredParticipantBinding6 = (ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                                    activityVocationalRegisteredParticipantBinding6.clInfo.setBackgroundResource(R.drawable.border_green);
                                    activityVocationalRegisteredParticipantBinding6.tvRegisteredInformation.setText(vocationalRegisteredParticipantActivity.getString(R.string.label_registered_participant_information));
                                    activityVocationalRegisteredParticipantBinding6.imgInfo.setImageResource(R.drawable.ic_success);
                                    int i18 = (int) (24.0f / Resources.getSystem().getDisplayMetrics().density);
                                    activityVocationalRegisteredParticipantBinding6.clInfo.setPadding(i18, i18, i18, i18);
                                    TextView textView5 = activityVocationalRegisteredParticipantBinding6.tvRatingReminder;
                                    Intrinsics.checkNotNullExpressionValue(textView5, "");
                                    textView5.setVisibility(8);
                                    activityVocationalRegisteredParticipantBinding6.btnNext.setText(vocationalRegisteredParticipantActivity.getString(R.string.action_back));
                                    Button button5 = activityVocationalRegisteredParticipantBinding6.btnNext;
                                    Intrinsics.checkNotNullExpressionValue(button5, "");
                                    AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button5, new VocationalRegisteredParticipantActivity$showRegisteredAndHaveClassUI$1$1(vocationalRegisteredParticipantActivity));
                                }
                            }
                            if (time.after(time2)) {
                                ActivityVocationalRegisteredParticipantBinding activityVocationalRegisteredParticipantBinding7 = (ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                                activityVocationalRegisteredParticipantBinding7.tvRegisteredInformation.setText(vocationalRegisteredParticipantActivity.getString(R.string.label_no_class_participant_information));
                                activityVocationalRegisteredParticipantBinding7.imgInfo.setImageResource(R.drawable.ic_info_alert);
                                activityVocationalRegisteredParticipantBinding7.clInfo.setBackgroundResource(R.drawable.border_mac_n_cheese);
                                int i19 = (int) (24.0f / Resources.getSystem().getDisplayMetrics().density);
                                activityVocationalRegisteredParticipantBinding7.clInfo.setPadding(i19, i19, i19, i19);
                                TextView textView6 = activityVocationalRegisteredParticipantBinding7.tvRatingReminder;
                                Intrinsics.checkNotNullExpressionValue(textView6, "");
                                textView6.setVisibility(8);
                                activityVocationalRegisteredParticipantBinding7.btnNext.setText(vocationalRegisteredParticipantActivity.getString(R.string.action_next));
                                Button button6 = activityVocationalRegisteredParticipantBinding7.btnNext;
                                Intrinsics.checkNotNullExpressionValue(button6, "");
                                AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button6, new VocationalRegisteredParticipantActivity$showRegisteredHaveNoClassUI$1$1(vocationalRegisteredParticipantActivity));
                            }
                        } else {
                            ActivityVocationalRegisteredParticipantBinding activityVocationalRegisteredParticipantBinding8 = (ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                            activityVocationalRegisteredParticipantBinding8.clInfo.setBackgroundResource(R.drawable.border_green);
                            activityVocationalRegisteredParticipantBinding8.tvRegisteredInformation.setText(vocationalRegisteredParticipantActivity.getString(R.string.label_registered_participant_information));
                            activityVocationalRegisteredParticipantBinding8.imgInfo.setImageResource(R.drawable.ic_success);
                            int i110 = (int) (24.0f / Resources.getSystem().getDisplayMetrics().density);
                            activityVocationalRegisteredParticipantBinding8.clInfo.setPadding(i110, i110, i110, i110);
                            TextView textView7 = activityVocationalRegisteredParticipantBinding8.tvRatingReminder;
                            Intrinsics.checkNotNullExpressionValue(textView7, "");
                            textView7.setVisibility(0);
                            activityVocationalRegisteredParticipantBinding8.btnNext.setText(vocationalRegisteredParticipantActivity.getString(R.string.action_rate_training));
                            Button button7 = activityVocationalRegisteredParticipantBinding8.btnNext;
                            Intrinsics.checkNotNullExpressionValue(button7, "");
                            AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button7, new VocationalRegisteredParticipantActivity$showShouldRatingUI$1$1(vocationalRegisteredParticipantActivity));
                        }
                    } else if (calendar2.get(5) == calendar3.get(5)) {
                        ActivityVocationalRegisteredParticipantBinding activityVocationalRegisteredParticipantBinding9 = (ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                        activityVocationalRegisteredParticipantBinding9.clInfo.setBackgroundResource(R.drawable.border_green);
                        activityVocationalRegisteredParticipantBinding9.tvRegisteredInformation.setText(vocationalRegisteredParticipantActivity.getString(R.string.label_registered_participant_information));
                        activityVocationalRegisteredParticipantBinding9.imgInfo.setImageResource(R.drawable.ic_success);
                        int i111 = (int) (24.0f / Resources.getSystem().getDisplayMetrics().density);
                        activityVocationalRegisteredParticipantBinding9.clInfo.setPadding(i111, i111, i111, i111);
                        TextView textView8 = activityVocationalRegisteredParticipantBinding9.tvRatingReminder;
                        Intrinsics.checkNotNullExpressionValue(textView8, "");
                        textView8.setVisibility(0);
                        activityVocationalRegisteredParticipantBinding9.btnNext.setText(vocationalRegisteredParticipantActivity.getString(R.string.action_rate_training));
                        Button button8 = activityVocationalRegisteredParticipantBinding9.btnNext;
                        Intrinsics.checkNotNullExpressionValue(button8, "");
                        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button8, new VocationalRegisteredParticipantActivity$showShouldRatingUI$1$1(vocationalRegisteredParticipantActivity));
                    } else {
                        i = onTransact + 35;
                        cancelAll = i % 128;
                        if (i % 2 != 0) {
                            int i112 = 55 / 0;
                            if (time.before(time2)) {
                                i2 = onTransact + 89;
                                cancelAll = i2 % 128;
                                if (i2 % 2 == 0) {
                                    time.after(time2);
                                    throw null;
                                }
                                if (time.after(time2)) {
                                    int i113 = onTransact + 103;
                                    cancelAll = i113 % 128;
                                    int i114 = i113 % 2;
                                    if (vocationProfile.notify.length() <= 0) {
                                        ActivityVocationalRegisteredParticipantBinding activityVocationalRegisteredParticipantBinding10 = (ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                                        activityVocationalRegisteredParticipantBinding10.clInfo.setBackgroundResource(R.drawable.border_green);
                                        activityVocationalRegisteredParticipantBinding10.tvRegisteredInformation.setText(vocationalRegisteredParticipantActivity.getString(R.string.label_registered_participant_information));
                                        activityVocationalRegisteredParticipantBinding10.imgInfo.setImageResource(R.drawable.ic_success);
                                        int i115 = (int) (24.0f / Resources.getSystem().getDisplayMetrics().density);
                                        activityVocationalRegisteredParticipantBinding10.clInfo.setPadding(i115, i115, i115, i115);
                                        TextView textView9 = activityVocationalRegisteredParticipantBinding10.tvRatingReminder;
                                        Intrinsics.checkNotNullExpressionValue(textView9, "");
                                        textView9.setVisibility(8);
                                        activityVocationalRegisteredParticipantBinding10.btnNext.setText(vocationalRegisteredParticipantActivity.getString(R.string.action_back));
                                        Button button9 = activityVocationalRegisteredParticipantBinding10.btnNext;
                                        Intrinsics.checkNotNullExpressionValue(button9, "");
                                        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button9, new VocationalRegisteredParticipantActivity$showRegisteredAndHaveClassUI$1$1(vocationalRegisteredParticipantActivity));
                                    }
                                }
                                if (time.after(time2)) {
                                    ActivityVocationalRegisteredParticipantBinding activityVocationalRegisteredParticipantBinding11 = (ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                                    activityVocationalRegisteredParticipantBinding11.tvRegisteredInformation.setText(vocationalRegisteredParticipantActivity.getString(R.string.label_no_class_participant_information));
                                    activityVocationalRegisteredParticipantBinding11.imgInfo.setImageResource(R.drawable.ic_info_alert);
                                    activityVocationalRegisteredParticipantBinding11.clInfo.setBackgroundResource(R.drawable.border_mac_n_cheese);
                                    int i116 = (int) (24.0f / Resources.getSystem().getDisplayMetrics().density);
                                    activityVocationalRegisteredParticipantBinding11.clInfo.setPadding(i116, i116, i116, i116);
                                    TextView textView10 = activityVocationalRegisteredParticipantBinding11.tvRatingReminder;
                                    Intrinsics.checkNotNullExpressionValue(textView10, "");
                                    textView10.setVisibility(8);
                                    activityVocationalRegisteredParticipantBinding11.btnNext.setText(vocationalRegisteredParticipantActivity.getString(R.string.action_next));
                                    Button button10 = activityVocationalRegisteredParticipantBinding11.btnNext;
                                    Intrinsics.checkNotNullExpressionValue(button10, "");
                                    AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button10, new VocationalRegisteredParticipantActivity$showRegisteredHaveNoClassUI$1$1(vocationalRegisteredParticipantActivity));
                                }
                            } else {
                                ActivityVocationalRegisteredParticipantBinding activityVocationalRegisteredParticipantBinding12 = (ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                                activityVocationalRegisteredParticipantBinding12.clInfo.setBackgroundResource(R.drawable.border_green);
                                activityVocationalRegisteredParticipantBinding12.tvRegisteredInformation.setText(vocationalRegisteredParticipantActivity.getString(R.string.label_registered_participant_information));
                                activityVocationalRegisteredParticipantBinding12.imgInfo.setImageResource(R.drawable.ic_success);
                                int i117 = (int) (24.0f / Resources.getSystem().getDisplayMetrics().density);
                                activityVocationalRegisteredParticipantBinding12.clInfo.setPadding(i117, i117, i117, i117);
                                TextView textView11 = activityVocationalRegisteredParticipantBinding12.tvRatingReminder;
                                Intrinsics.checkNotNullExpressionValue(textView11, "");
                                textView11.setVisibility(0);
                                activityVocationalRegisteredParticipantBinding12.btnNext.setText(vocationalRegisteredParticipantActivity.getString(R.string.action_rate_training));
                                Button button11 = activityVocationalRegisteredParticipantBinding12.btnNext;
                                Intrinsics.checkNotNullExpressionValue(button11, "");
                                AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button11, new VocationalRegisteredParticipantActivity$showShouldRatingUI$1$1(vocationalRegisteredParticipantActivity));
                            }
                        } else if (!time.before(time2)) {
                            i2 = onTransact + 89;
                            cancelAll = i2 % 128;
                            if (i2 % 2 == 0) {
                                time.after(time2);
                                throw null;
                            }
                            if (time.after(time2)) {
                                int i118 = onTransact + 103;
                                cancelAll = i118 % 128;
                                int i119 = i118 % 2;
                                if (vocationProfile.notify.length() <= 0) {
                                    ActivityVocationalRegisteredParticipantBinding activityVocationalRegisteredParticipantBinding13 = (ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                                    activityVocationalRegisteredParticipantBinding13.clInfo.setBackgroundResource(R.drawable.border_green);
                                    activityVocationalRegisteredParticipantBinding13.tvRegisteredInformation.setText(vocationalRegisteredParticipantActivity.getString(R.string.label_registered_participant_information));
                                    activityVocationalRegisteredParticipantBinding13.imgInfo.setImageResource(R.drawable.ic_success);
                                    int i1110 = (int) (24.0f / Resources.getSystem().getDisplayMetrics().density);
                                    activityVocationalRegisteredParticipantBinding13.clInfo.setPadding(i1110, i1110, i1110, i1110);
                                    TextView textView12 = activityVocationalRegisteredParticipantBinding13.tvRatingReminder;
                                    Intrinsics.checkNotNullExpressionValue(textView12, "");
                                    textView12.setVisibility(8);
                                    activityVocationalRegisteredParticipantBinding13.btnNext.setText(vocationalRegisteredParticipantActivity.getString(R.string.action_back));
                                    Button button12 = activityVocationalRegisteredParticipantBinding13.btnNext;
                                    Intrinsics.checkNotNullExpressionValue(button12, "");
                                    AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button12, new VocationalRegisteredParticipantActivity$showRegisteredAndHaveClassUI$1$1(vocationalRegisteredParticipantActivity));
                                }
                            }
                            if (time.after(time2)) {
                                ActivityVocationalRegisteredParticipantBinding activityVocationalRegisteredParticipantBinding14 = (ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                                activityVocationalRegisteredParticipantBinding14.tvRegisteredInformation.setText(vocationalRegisteredParticipantActivity.getString(R.string.label_no_class_participant_information));
                                activityVocationalRegisteredParticipantBinding14.imgInfo.setImageResource(R.drawable.ic_info_alert);
                                activityVocationalRegisteredParticipantBinding14.clInfo.setBackgroundResource(R.drawable.border_mac_n_cheese);
                                int i1111 = (int) (24.0f / Resources.getSystem().getDisplayMetrics().density);
                                activityVocationalRegisteredParticipantBinding14.clInfo.setPadding(i1111, i1111, i1111, i1111);
                                TextView textView13 = activityVocationalRegisteredParticipantBinding14.tvRatingReminder;
                                Intrinsics.checkNotNullExpressionValue(textView13, "");
                                textView13.setVisibility(8);
                                activityVocationalRegisteredParticipantBinding14.btnNext.setText(vocationalRegisteredParticipantActivity.getString(R.string.action_next));
                                Button button13 = activityVocationalRegisteredParticipantBinding14.btnNext;
                                Intrinsics.checkNotNullExpressionValue(button13, "");
                                AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button13, new VocationalRegisteredParticipantActivity$showRegisteredHaveNoClassUI$1$1(vocationalRegisteredParticipantActivity));
                            }
                        } else {
                            ActivityVocationalRegisteredParticipantBinding activityVocationalRegisteredParticipantBinding15 = (ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                            activityVocationalRegisteredParticipantBinding15.clInfo.setBackgroundResource(R.drawable.border_green);
                            activityVocationalRegisteredParticipantBinding15.tvRegisteredInformation.setText(vocationalRegisteredParticipantActivity.getString(R.string.label_registered_participant_information));
                            activityVocationalRegisteredParticipantBinding15.imgInfo.setImageResource(R.drawable.ic_success);
                            int i1112 = (int) (24.0f / Resources.getSystem().getDisplayMetrics().density);
                            activityVocationalRegisteredParticipantBinding15.clInfo.setPadding(i1112, i1112, i1112, i1112);
                            TextView textView14 = activityVocationalRegisteredParticipantBinding15.tvRatingReminder;
                            Intrinsics.checkNotNullExpressionValue(textView14, "");
                            textView14.setVisibility(0);
                            activityVocationalRegisteredParticipantBinding15.btnNext.setText(vocationalRegisteredParticipantActivity.getString(R.string.action_rate_training));
                            Button button14 = activityVocationalRegisteredParticipantBinding15.btnNext;
                            Intrinsics.checkNotNullExpressionValue(button14, "");
                            AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button14, new VocationalRegisteredParticipantActivity$showShouldRatingUI$1$1(vocationalRegisteredParticipantActivity));
                        }
                    }
                } else {
                    i = onTransact + 35;
                    cancelAll = i % 128;
                    if (i % 2 != 0) {
                        int i1113 = 55 / 0;
                        if (time.before(time2)) {
                            i2 = onTransact + 89;
                            cancelAll = i2 % 128;
                            if (i2 % 2 == 0) {
                                time.after(time2);
                                throw null;
                            }
                            if (time.after(time2)) {
                                int i1114 = onTransact + 103;
                                cancelAll = i1114 % 128;
                                int i1115 = i1114 % 2;
                                if (vocationProfile.notify.length() <= 0) {
                                    ActivityVocationalRegisteredParticipantBinding activityVocationalRegisteredParticipantBinding16 = (ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                                    activityVocationalRegisteredParticipantBinding16.clInfo.setBackgroundResource(R.drawable.border_green);
                                    activityVocationalRegisteredParticipantBinding16.tvRegisteredInformation.setText(vocationalRegisteredParticipantActivity.getString(R.string.label_registered_participant_information));
                                    activityVocationalRegisteredParticipantBinding16.imgInfo.setImageResource(R.drawable.ic_success);
                                    int i1116 = (int) (24.0f / Resources.getSystem().getDisplayMetrics().density);
                                    activityVocationalRegisteredParticipantBinding16.clInfo.setPadding(i1116, i1116, i1116, i1116);
                                    TextView textView15 = activityVocationalRegisteredParticipantBinding16.tvRatingReminder;
                                    Intrinsics.checkNotNullExpressionValue(textView15, "");
                                    textView15.setVisibility(8);
                                    activityVocationalRegisteredParticipantBinding16.btnNext.setText(vocationalRegisteredParticipantActivity.getString(R.string.action_back));
                                    Button button15 = activityVocationalRegisteredParticipantBinding16.btnNext;
                                    Intrinsics.checkNotNullExpressionValue(button15, "");
                                    AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button15, new VocationalRegisteredParticipantActivity$showRegisteredAndHaveClassUI$1$1(vocationalRegisteredParticipantActivity));
                                }
                            }
                            if (time.after(time2)) {
                                ActivityVocationalRegisteredParticipantBinding activityVocationalRegisteredParticipantBinding17 = (ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                                activityVocationalRegisteredParticipantBinding17.tvRegisteredInformation.setText(vocationalRegisteredParticipantActivity.getString(R.string.label_no_class_participant_information));
                                activityVocationalRegisteredParticipantBinding17.imgInfo.setImageResource(R.drawable.ic_info_alert);
                                activityVocationalRegisteredParticipantBinding17.clInfo.setBackgroundResource(R.drawable.border_mac_n_cheese);
                                int i1117 = (int) (24.0f / Resources.getSystem().getDisplayMetrics().density);
                                activityVocationalRegisteredParticipantBinding17.clInfo.setPadding(i1117, i1117, i1117, i1117);
                                TextView textView16 = activityVocationalRegisteredParticipantBinding17.tvRatingReminder;
                                Intrinsics.checkNotNullExpressionValue(textView16, "");
                                textView16.setVisibility(8);
                                activityVocationalRegisteredParticipantBinding17.btnNext.setText(vocationalRegisteredParticipantActivity.getString(R.string.action_next));
                                Button button16 = activityVocationalRegisteredParticipantBinding17.btnNext;
                                Intrinsics.checkNotNullExpressionValue(button16, "");
                                AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button16, new VocationalRegisteredParticipantActivity$showRegisteredHaveNoClassUI$1$1(vocationalRegisteredParticipantActivity));
                            }
                        } else {
                            ActivityVocationalRegisteredParticipantBinding activityVocationalRegisteredParticipantBinding18 = (ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                            activityVocationalRegisteredParticipantBinding18.clInfo.setBackgroundResource(R.drawable.border_green);
                            activityVocationalRegisteredParticipantBinding18.tvRegisteredInformation.setText(vocationalRegisteredParticipantActivity.getString(R.string.label_registered_participant_information));
                            activityVocationalRegisteredParticipantBinding18.imgInfo.setImageResource(R.drawable.ic_success);
                            int i1118 = (int) (24.0f / Resources.getSystem().getDisplayMetrics().density);
                            activityVocationalRegisteredParticipantBinding18.clInfo.setPadding(i1118, i1118, i1118, i1118);
                            TextView textView17 = activityVocationalRegisteredParticipantBinding18.tvRatingReminder;
                            Intrinsics.checkNotNullExpressionValue(textView17, "");
                            textView17.setVisibility(0);
                            activityVocationalRegisteredParticipantBinding18.btnNext.setText(vocationalRegisteredParticipantActivity.getString(R.string.action_rate_training));
                            Button button17 = activityVocationalRegisteredParticipantBinding18.btnNext;
                            Intrinsics.checkNotNullExpressionValue(button17, "");
                            AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button17, new VocationalRegisteredParticipantActivity$showShouldRatingUI$1$1(vocationalRegisteredParticipantActivity));
                        }
                    } else if (!time.before(time2)) {
                        i2 = onTransact + 89;
                        cancelAll = i2 % 128;
                        if (i2 % 2 == 0) {
                            time.after(time2);
                            throw null;
                        }
                        if (time.after(time2)) {
                            int i1119 = onTransact + 103;
                            cancelAll = i1119 % 128;
                            int i11110 = i1119 % 2;
                            if (vocationProfile.notify.length() <= 0) {
                                ActivityVocationalRegisteredParticipantBinding activityVocationalRegisteredParticipantBinding19 = (ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                                activityVocationalRegisteredParticipantBinding19.clInfo.setBackgroundResource(R.drawable.border_green);
                                activityVocationalRegisteredParticipantBinding19.tvRegisteredInformation.setText(vocationalRegisteredParticipantActivity.getString(R.string.label_registered_participant_information));
                                activityVocationalRegisteredParticipantBinding19.imgInfo.setImageResource(R.drawable.ic_success);
                                int i11111 = (int) (24.0f / Resources.getSystem().getDisplayMetrics().density);
                                activityVocationalRegisteredParticipantBinding19.clInfo.setPadding(i11111, i11111, i11111, i11111);
                                TextView textView18 = activityVocationalRegisteredParticipantBinding19.tvRatingReminder;
                                Intrinsics.checkNotNullExpressionValue(textView18, "");
                                textView18.setVisibility(8);
                                activityVocationalRegisteredParticipantBinding19.btnNext.setText(vocationalRegisteredParticipantActivity.getString(R.string.action_back));
                                Button button18 = activityVocationalRegisteredParticipantBinding19.btnNext;
                                Intrinsics.checkNotNullExpressionValue(button18, "");
                                AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button18, new VocationalRegisteredParticipantActivity$showRegisteredAndHaveClassUI$1$1(vocationalRegisteredParticipantActivity));
                            }
                        }
                        if (time.after(time2)) {
                            ActivityVocationalRegisteredParticipantBinding activityVocationalRegisteredParticipantBinding110 = (ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                            activityVocationalRegisteredParticipantBinding110.tvRegisteredInformation.setText(vocationalRegisteredParticipantActivity.getString(R.string.label_no_class_participant_information));
                            activityVocationalRegisteredParticipantBinding110.imgInfo.setImageResource(R.drawable.ic_info_alert);
                            activityVocationalRegisteredParticipantBinding110.clInfo.setBackgroundResource(R.drawable.border_mac_n_cheese);
                            int i11112 = (int) (24.0f / Resources.getSystem().getDisplayMetrics().density);
                            activityVocationalRegisteredParticipantBinding110.clInfo.setPadding(i11112, i11112, i11112, i11112);
                            TextView textView19 = activityVocationalRegisteredParticipantBinding110.tvRatingReminder;
                            Intrinsics.checkNotNullExpressionValue(textView19, "");
                            textView19.setVisibility(8);
                            activityVocationalRegisteredParticipantBinding110.btnNext.setText(vocationalRegisteredParticipantActivity.getString(R.string.action_next));
                            Button button19 = activityVocationalRegisteredParticipantBinding110.btnNext;
                            Intrinsics.checkNotNullExpressionValue(button19, "");
                            AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button19, new VocationalRegisteredParticipantActivity$showRegisteredHaveNoClassUI$1$1(vocationalRegisteredParticipantActivity));
                        }
                    } else {
                        ActivityVocationalRegisteredParticipantBinding activityVocationalRegisteredParticipantBinding111 = (ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                        activityVocationalRegisteredParticipantBinding111.clInfo.setBackgroundResource(R.drawable.border_green);
                        activityVocationalRegisteredParticipantBinding111.tvRegisteredInformation.setText(vocationalRegisteredParticipantActivity.getString(R.string.label_registered_participant_information));
                        activityVocationalRegisteredParticipantBinding111.imgInfo.setImageResource(R.drawable.ic_success);
                        int i11113 = (int) (24.0f / Resources.getSystem().getDisplayMetrics().density);
                        activityVocationalRegisteredParticipantBinding111.clInfo.setPadding(i11113, i11113, i11113, i11113);
                        TextView textView110 = activityVocationalRegisteredParticipantBinding111.tvRatingReminder;
                        Intrinsics.checkNotNullExpressionValue(textView110, "");
                        textView110.setVisibility(0);
                        activityVocationalRegisteredParticipantBinding111.btnNext.setText(vocationalRegisteredParticipantActivity.getString(R.string.action_rate_training));
                        Button button110 = activityVocationalRegisteredParticipantBinding111.btnNext;
                        Intrinsics.checkNotNullExpressionValue(button110, "");
                        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button110, new VocationalRegisteredParticipantActivity$showShouldRatingUI$1$1(vocationalRegisteredParticipantActivity));
                    }
                }
            }
            ConstraintLayout constraintLayout = ((ActivityVocationalRegisteredParticipantBinding) ((ViewBinding) vocationalRegisteredParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).clInfo;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(0);
            Button button20 = activityVocationalRegisteredParticipantBinding.btnNext;
            Intrinsics.checkNotNullExpressionValue(button20, "");
            Button button21 = button20;
            Intrinsics.checkNotNullParameter(button21, "");
            button21.setEnabled(true);
        }
    }

    static {
        INotificationSideChannel = 1;
        g();
        INSTANCE = new Companion(null);
        int i = notify + 109;
        INotificationSideChannel = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancelAll + 11;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 37;
        cancelAll = i5 % 128;
        if (i5 % 2 == 0) {
            return R.layout.activity_vocational_registered_participant;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int length = 728715204 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.empty_transaction_response).substring(0, 1).length();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = applyCheckMarkTint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(-638866388, (-954244948) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step6).substring(0, 3).length(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, length, new Object[]{this}, 638866390, zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = cancelAll + 7;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = applyCheckMarkTint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(-390982010, zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, 390982011, applyCheckMarkTint.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = cancelAll + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = onTransact + 47;
        cancelAll = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = applyCheckMarkTint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = applyCheckMarkTint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(-79920821, zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this, context}, 79920821, applyCheckMarkTint.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    static void g() {
        asBinder = -490227754;
        g = -1934795610;
        d = -187070983;
        f656a = new byte[]{54, 24, 1, 17, 22, -14, -11, 83, 9, 29, 5, -54, 93, 7, -27, 3, 54, 0, -68, -9, -90, -68, 17, 24, -46, 12, 22, -68, 13, 8, 0, -122, 48, -80, -12, -67, -45, -42, -80, -21, -69, -30, -90, -89, 37, -124, 123, -14, -27, -30, -17, -66, -10, -65, 41, 117, 57, 118, 5, 0, 113, 8, 111, 124, 107, 56, 12, 118, 4};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, int r7, byte r8) {
        /*
            int r7 = 121 - r7
            int r8 = r8 * 2
            int r0 = r8 + 1
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r1 = com.bpjstku.presentation.vocational.VocationalRegisteredParticipantActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalRegisteredParticipantActivity.$$i(int, int, byte):java.lang.String");
    }
}
