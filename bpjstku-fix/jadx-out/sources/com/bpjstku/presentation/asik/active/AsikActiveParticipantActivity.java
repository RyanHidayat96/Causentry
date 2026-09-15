package com.bpjstku.presentation.asik.active;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityAsikActiveParticipantBinding;
import com.bpjstku.databinding.LayoutRegistrationProgressBinding;
import com.bpjstku.presentation.asik.active.AsikActiveParticipantActivity;
import com.bpjstku.presentation.asik.active.model.AsikActiveParticipant;
import com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpFromEmail;
import com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpFromPhone;
import com.bpjstku.util.enums.VerificationActionType;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.measurement.internal.zzny;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.AlertDialogBuilder;
import defpackage.BufferProviderState;
import defpackage.CameraUseCaseAdapter;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.TargetAspectRatio;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.attachToWindow;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.dumpAudioCapabilities;
import defpackage.findQualityInTargetQualities;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getTheme;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl;
import defpackage.lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import defpackage.localeListForLanguageTags;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.readableMs;
import defpackage.setDefaultNightMode;
import defpackage.setQuickZoomEnabled;
import defpackage.setTabListener;
import defpackage.shouldWrapException;
import defpackage.supportRequestWindowFeature;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0007\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J)\u0010\u0017\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0019\u0010\u0004J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u0004R\u0015\u0010!\u001a\u00020\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0007\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0006\u001a\u00020\f8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\n\u0010'R\u0014\u0010*\u001a\u00020(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0016\u0010\u001f\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010'R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00020+8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u0010-R\u0016\u0010\t\u001a\u00020/8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b!\u00100R\u001a\u0010\b\u001a\u00020\f8\u0015X\u0095D¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b!\u00101"}, d2 = {"Lcom/bpjstku/presentation/asik/active/AsikActiveParticipantActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityAsikActiveParticipantBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "asInterface", "asBinder", "a", "INotificationSideChannel", "", "p0", "(I)V", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onBackPressed", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "onDestroy", "Landroid/view/MotionEvent;", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTransact", "LsetTabListener;", "d", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "Ljava/lang/String;", "LBufferProviderState;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LBufferProviderState;", "I", "Landroidx/fragment/app/FragmentManager;", "Landroidx/fragment/app/FragmentManager;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "g", "Lcom/bpjstku/databinding/LayoutRegistrationProgressBinding;", "Lcom/bpjstku/databinding/LayoutRegistrationProgressBinding;", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AsikActiveParticipantActivity extends BindingBaseActivity<ActivityAsikActiveParticipantBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int[] g;
    private static int onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private int d;
    private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private LayoutRegistrationProgressBinding asBinder;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final int asInterface;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FragmentManager TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {67, -127, -109, 9};
    private static final int $$f = 233;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {108, -26, -110, 50, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 102;
    private static int cancelAll = 1;
    private static int notify = 0;
    private static int cancel = 1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String b = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 6;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationActionType.values().length];
            try {
                iArr[VerificationActionType.EMAIL_VERIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationActionType.PHONE_VERIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws IllegalAccessException {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i4);
        int i11 = (~i4) | i7;
        int i12 = i10 | (~(i11 | i2));
        int i13 = (~(i4 | i7)) | (~i9);
        int i14 = (~i11) | (~(i8 | i5));
        int i15 = i5 + i2 + i3 + (783392123 * i) + ((-786872706) * i6);
        int i16 = i15 * i15;
        int i17 = ((-1525980173) * i5) + 1729888256 + (218870266 * i2) + (i12 * 1744850439) + ((-805266418) * i13) + (1744850439 * i14) + (1963720704 * i3) + ((-1731985408) * i) + ((-471334912) * i6) + ((-600899584) * i16);
        int i18 = (i5 * 375823119) + 1642083618 + (i2 * 375823682) + (i12 * 563) + (i13 * 1126) + (i14 * 563) + (i3 * 375824245) + ((-117547465) * i) + (i6 * 763984278) + (i16 * (-763691008));
        int i19 = i17 + (i18 * i18 * 1830354944);
        if (i19 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i19 != 2) {
            return i19 != 3 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : b(objArr);
        }
        AsikActiveParticipantActivity asikActiveParticipantActivity = (AsikActiveParticipantActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i20 = 2 % 2;
        int i21 = cancel + 85;
        notify = i21 % 128;
        if (i21 % 2 == 0 ? ((Field) CameraUseCaseAdapter.b[0]).getInt(null) != (-1212757380) + (((~(1647099416 | i)) | (-817111874)) * (-964)) + (((~(1647099416 | (~i))) | (-1924972378)) * (-964)) : ((Field) CameraUseCaseAdapter.b[1]).getInt(null) != (((~(1545170813 | i)) | (-1991883740)) * 262) + 1650460268 + (((~(1545170813 | (~i))) | (-1991883740)) * 262)) {
            int i22 = cancel + 25;
            notify = i22 % 128;
            int i23 = i22 % 2;
            int[] iArr = new int[1587964483];
            iArr[1587964482] = 1;
            int i24 = (-799464634) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i25 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i26 = ~i;
        if (i25 != (-1329854332) + (((~((-2138963944) | i26)) | (-440092022) | (~(2138963943 | i))) * (-564)) + ((~(i | (-131089))) * 1128) + (((~((-440092022) | i26)) | (-2139095032)) * 564)) {
            throw null;
        }
        super.onCreate(bundle);
        return null;
    }

    private static void c(short s, short s2, int i, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = s + 4;
        int i3 = 98 - (s2 * 14);
        byte[] bArr2 = new byte[53 - i];
        int i4 = 52 - i;
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i3 = (i3 + i2) - 11;
            i2 = i2;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i2 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5 = i6;
            i3 = (i3 + bArr[i7]) - 11;
            i2 = i7;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> implements findQualityInTargetQualities {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3<>();

        @Override // defpackage.findQualityInTargetQualities
        public final boolean b(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return obj instanceof lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl;
        }
    }

    public static final class b<T, R> implements readableMs {
        public static final b<T, R> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new b<>();

        @Override // defpackage.readableMs
        public final T apply(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (T) ((lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl) obj);
        }
    }

    public AsikActiveParticipantActivity() {
        final AsikActiveParticipantActivity asikActiveParticipantActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<setTabListener>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setTabListener] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setTabListener invoke() {
                LifecycleOwner lifecycleOwner = asikActiveParticipantActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(setTabListener.class);
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
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        this.TuitionPaymentFragmentbindingInflater1 = supportFragmentManager;
        this.d = 1;
        this.asInterface = R.layout.activity_asik_active_participant;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.asik.active.AsikActiveParticipantActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/asik/active/AsikActiveParticipantActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, AsikActiveParticipantActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = cancel + 35;
        notify = i2 % 128;
        int i3 = i2 % 2;
        AsikActiveParticipantActivity$bindingInflater$1 asikActiveParticipantActivity$bindingInflater$1 = AsikActiveParticipantActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = cancel + 115;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return asikActiveParticipantActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancel + 3;
        int i3 = i2 % 128;
        notify = i3;
        int i4 = i2 % 2;
        int i5 = this.asInterface;
        int i6 = i3 + 93;
        cancel = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = notify + 5;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        LayoutRegistrationProgressBinding layoutRegistrationProgressBinding = this.asBinder;
        if (layoutRegistrationProgressBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            layoutRegistrationProgressBinding = null;
        }
        layoutRegistrationProgressBinding.sbRegisterProgression.setOnTouchListener(new View.OnTouchListener() { // from class: getItemId
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AsikActiveParticipantActivity.g();
            }
        });
        INotificationSideChannel();
        ((ActivityAsikActiveParticipantBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: setIconAttribute
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AsikActiveParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
        int i4 = notify + 119;
        cancel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
        VideoRecordEventStart<R> map = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().filter(TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1).map(b.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Intrinsics.checkNotNullExpressionValue(map, "");
        VideoRecordEventStart videoRecordEventStartObserveOn = map.observeOn(dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1());
        final Function1 function1 = new Function1() { // from class: setHasDecor
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikActiveParticipantActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl) obj);
            }
        };
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = videoRecordEventStartObserveOn.subscribe(new logToString() { // from class: AlertDialog
            @Override // defpackage.logToString
            public final void accept(Object obj) throws IllegalAccessException {
                AsikActiveParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, obj);
            }
        });
        int i2 = cancel + 15;
        notify = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = notify + 37;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder = LayoutRegistrationProgressBinding.bind(((ActivityAsikActiveParticipantBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).getRoot());
        AsikActiveParticipantActivity asikActiveParticipantActivity = this;
        Intrinsics.checkNotNullParameter(asikActiveParticipantActivity, "");
        asikActiveParticipantActivity.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivityAsikActiveParticipantBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = getString(R.string.title_digital_service);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        int i4 = cancel + 125;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = g;
        int i3 = -1870535734;
        int i4 = 1;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = $10 + 45;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 3291 - Color.green(0), View.resolveSize(0, 0) + 31, 1948206109, false, $$i(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i8++;
                    i3 = -1870535734;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = g;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                int i10 = $10 + 57;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                Object[] objArr3 = new Object[i4];
                objArr3[i5] = Integer.valueOf(iArr5[i9]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int edgeSlop = 3291 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int iArgb = Color.argb(i5, i5, i5, i5) + 31;
                    byte b4 = (byte) i5;
                    byte b5 = (byte) (b4 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, edgeSlop, iArgb, 1948206109, false, $$i(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i9++;
                i4 = 1;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        int i12 = i5;
        System.arraycopy(iArr5, i12, iArr4, i12, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i13 = 17;
            while (i13 > 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i13];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getPressedStateDuration() >> 16) + 2559, (-16777187) - Color.rgb(0, 0, 0), 683220507, false, $$i(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i13--;
                int i14 = $11 + 63;
                $10 = i14 % 128;
                int i15 = i14 % 2;
            }
            int i16 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 28880), 348 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private final void INotificationSideChannel() throws IllegalAccessException {
        AlertDialogBuilder alertDialogBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i = 2 % 2;
        int i2 = notify + 75;
        int i3 = i2 % 128;
        cancel = i3;
        int i4 = i2 % 2;
        int i5 = this.d;
        if (i5 == 2) {
            this.b = "asik_step_second_ekyc";
            AlertDialogBuilder.Companion companion = AlertDialogBuilder.INSTANCE;
            alertDialogBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AlertDialogBuilder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        } else if (i5 != 3) {
            int i6 = i3 + 23;
            notify = i6 % 128;
            if (i6 % 2 == 0 ? i5 == 4 : i5 == 5) {
                this.b = "asik_step_fourth_fill_family_data";
                attachToWindow.Companion companion2 = attachToWindow.INSTANCE;
                alertDialogBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault1 = attachToWindow.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            } else if (i5 == 5) {
                this.b = "asik_step_fifth_fill_emergency_contact";
                setDefaultNightMode.Companion companion3 = setDefaultNightMode.INSTANCE;
                alertDialogBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault1 = setDefaultNightMode.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            } else if (i5 != 6) {
                int i7 = i3 + 125;
                notify = i7 % 128;
                int i8 = i7 % 2;
                this.b = "asik_step_first_verify_membership_data";
                localeListForLanguageTags.Companion companion4 = localeListForLanguageTags.INSTANCE;
                alertDialogBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault1 = localeListForLanguageTags.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            } else {
                this.b = "asik_step_sixth_confirmation";
                supportRequestWindowFeature.Companion companion5 = supportRequestWindowFeature.INSTANCE;
                alertDialogBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault1 = supportRequestWindowFeature.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        } else {
            this.b = "asik_step_third_fill_npwp_bank_account";
            shouldWrapException.Companion companion6 = shouldWrapException.INSTANCE;
            shouldWrapException shouldwrapexceptionTuitionPaymentFragmentbindingInflater1 = shouldWrapException.Companion.TuitionPaymentFragmentbindingInflater1();
            int i9 = notify + 11;
            cancel = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 4 % 2;
            }
            alertDialogBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault1 = shouldwrapexceptionTuitionPaymentFragmentbindingInflater1;
        }
        String str = this.b;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_step_asik", this.b));
        Intrinsics.checkNotNullParameter(this, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        this.TuitionPaymentFragmentbindingInflater1.beginTransaction().add(R.id.DataVerifyContainer, alertDialogBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault1).addToBackStack(null).commitAllowingStateLoss();
        TuitionPaymentFragmentbindingInflater1(zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 2083938740, new Object[]{this, Integer.valueOf(this.d)}, getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -2083938737, getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    private static /* synthetic */ Object b(Object[] objArr) {
        LayoutRegistrationProgressBinding layoutRegistrationProgressBinding;
        AsikActiveParticipantActivity asikActiveParticipantActivity = (AsikActiveParticipantActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = notify + 55;
        int i3 = i2 % 128;
        cancel = i3;
        if (i2 % 2 == 0) {
            layoutRegistrationProgressBinding = asikActiveParticipantActivity.asBinder;
            int i4 = 91 / 0;
            if (layoutRegistrationProgressBinding == null) {
                int i5 = i3 + 13;
                notify = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                layoutRegistrationProgressBinding = null;
            }
        } else {
            layoutRegistrationProgressBinding = asikActiveParticipantActivity.asBinder;
            if (layoutRegistrationProgressBinding == null) {
                int i7 = i3 + 13;
                notify = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                layoutRegistrationProgressBinding = null;
            }
        }
        layoutRegistrationProgressBinding.sbRegisterProgression.setProgress((100 / asikActiveParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2) * iIntValue);
        TextView textView = layoutRegistrationProgressBinding.tvStepNumber;
        int i9 = asikActiveParticipantActivity.d;
        int i10 = asikActiveParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StringBuilder sb = new StringBuilder();
        sb.append(i9);
        sb.append("/");
        sb.append(i10);
        textView.setText(sb.toString());
        if (iIntValue == 2) {
            layoutRegistrationProgressBinding.tvRegistrationStep.setText(asikActiveParticipantActivity.getResources().getString(R.string.label_asik_data_biometric));
            return null;
        }
        int i11 = cancel + 105;
        notify = i11 % 128;
        if (i11 % 2 == 0 ? iIntValue == 3 : iIntValue == 5) {
            layoutRegistrationProgressBinding.tvRegistrationStep.setText(asikActiveParticipantActivity.getResources().getString(R.string.label_contact_data));
            return null;
        }
        if (iIntValue == 4) {
            layoutRegistrationProgressBinding.tvRegistrationStep.setText(asikActiveParticipantActivity.getResources().getString(R.string.label_asik_data_citizenship_document));
            return null;
        }
        if (iIntValue == 5) {
            layoutRegistrationProgressBinding.tvRegistrationStep.setText(asikActiveParticipantActivity.getResources().getString(R.string.label_asik_data_emergency_contact));
            return null;
        }
        if (iIntValue == 6) {
            layoutRegistrationProgressBinding.tvRegistrationStep.setText(asikActiveParticipantActivity.getResources().getString(R.string.label_asik_data_confirmation));
            return null;
        }
        layoutRegistrationProgressBinding.tvRegistrationStep.setText(asikActiveParticipantActivity.getResources().getString(R.string.label_asik_data_membership));
        int i12 = cancel + 3;
        notify = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i2 = notify + 17;
                cancel = i2 % 128;
                if (i2 % 2 == 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    int i3 = 1 / 0;
                } else {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = notify + 55;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = cancel + 51;
        notify = i2 % 128;
        int i3 = i2 % 2;
        onTransact();
        int i4 = notify + 111;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int p0, int p1, Intent p2) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = notify + 113;
        cancel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.onActivityResult(p0, p1, p2);
            throw null;
        }
        super.onActivityResult(p0, p1, p2);
        if (p1 == -1 && (p0 == 100 || p0 == 101)) {
            this.d = 4;
            INotificationSideChannel();
        }
        int i3 = notify + 55;
        cancel = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        BufferProviderState bufferProviderState = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (bufferProviderState == null) {
            int i2 = notify + 27;
            cancel = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            bufferProviderState = null;
        }
        if (!bufferProviderState.isDisposed()) {
            BufferProviderState bufferProviderState2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (bufferProviderState2 == null) {
                int i4 = cancel + 23;
                notify = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                bufferProviderState2 = null;
            }
            bufferProviderState2.dispose();
        }
        super.onDestroy();
        int i6 = notify + 61;
        cancel = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent p0) {
        View currentFocus;
        Rect rect;
        EditText editText;
        int i = 2 % 2;
        int i2 = cancel + 19;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            int i3 = 21 / 0;
            if (p0.getAction() == 0) {
                int i4 = cancel + 113;
                notify = i4 % 128;
                int i5 = i4 % 2;
                currentFocus = getCurrentFocus();
                if (currentFocus instanceof EditText) {
                    rect = new Rect();
                    editText = (EditText) currentFocus;
                    editText.getGlobalVisibleRect(rect);
                    if (!rect.contains((int) p0.getRawX(), (int) p0.getRawY())) {
                        editText.clearFocus();
                        Object systemService = getSystemService("input_method");
                        Intrinsics.checkNotNull(systemService, "");
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
                    }
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getAction() == 0) {
                int i6 = cancel + 113;
                notify = i6 % 128;
                int i7 = i6 % 2;
                currentFocus = getCurrentFocus();
                if (currentFocus instanceof EditText) {
                    rect = new Rect();
                    editText = (EditText) currentFocus;
                    editText.getGlobalVisibleRect(rect);
                    if (!rect.contains((int) p0.getRawX(), (int) p0.getRawY())) {
                        editText.clearFocus();
                        Object systemService2 = getSystemService("input_method");
                        Intrinsics.checkNotNull(systemService2, "");
                        ((InputMethodManager) systemService2).hideSoftInputFromWindow(editText.getWindowToken(), 0);
                    }
                }
            }
        }
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(p0);
        int i8 = notify + 99;
        cancel = i8 % 128;
        if (i8 % 2 != 0) {
            return zDispatchTouchEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onTransact() throws IllegalAccessException {
        int i = 2 % 2;
        if (this.d <= 1) {
            d_();
            return;
        }
        int i2 = cancel + 109;
        notify = i2 % 128;
        int i3 = i2 % 2;
        this.TuitionPaymentFragmentbindingInflater1.popBackStack();
        int i4 = this.d - 1;
        this.d = i4;
        Object[] objArr = {this, Integer.valueOf(i4)};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 2083938740, objArr, getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -2083938737, getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        int i5 = notify + 49;
        cancel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = cancel + 37;
        notify = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 29945);
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1755;
            int bitsPerPixel = 22 - ImageFormat.getBitsPerPixel(0);
            byte[] bArr = $$a;
            short s = bArr[5];
            byte b2 = bArr[28];
            Object[] objArr2 = new Object[1];
            c(s, b2, (byte) (b2 | 14), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString, keyRepeatDelay, bitsPerPixel, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i4 = cancel + 97;
            notify = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 29945);
                int iGreen = Color.green(0) + 1755;
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 24;
                short s2 = (short) ($$b & 189);
                byte[] bArr2 = $$a;
                Object[] objArr3 = new Object[1];
                c(s2, bArr2[28], bArr2[7], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iGreen, iLastIndexOf, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i6 = ~System.identityHashCode(this);
            int i7 = 1150436421 + ((~(200015669 | i6)) * 52) + (((~(14688053 | i6)) | (~((-197914373) | i6)) | 185327616) * (-52)) + (((~(i6 | (-14688054))) | 2101297) * 52) + 1317077867;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new int[]{1013393722, 356672446, 1785910488, -1993588912, -880562479, -1666136816, 906880701, -756475024, 540734302, 934353715}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new int[]{-1888322599, -434951655, -1882609809, -39928109, 675176499, 1117062762, 730179514, 502536979, 136943905, 121477112}, 16 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {469093913};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 42049), 1726 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 1317077867, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0, 0));
                    int packedPositionGroup = 1755 - ExpandableListView.getPackedPositionGroup(0L);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23;
                    short s3 = (short) ($$b & 189);
                    byte[] bArr3 = $$a;
                    Object[] objArr8 = new Object[1];
                    c(s3, bArr3[28], bArr3[7], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, packedPositionGroup, scrollBarFadeDuration, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new int[]{-1047520013, -357659250, 626566059, -1196675581, 874658911, 1448081038, -1088609429, 346776707, 43355669, -64086403, -1585841018, -1663625560, -790574153, 1237273913}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new int[]{-271752342, 887231003, 205274407, 582391426, -234741276, -1252104471, -372752190, -1754078909, -1817310867, 1338298145}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_credit_card).substring(10, 12).length() + 13, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf2 = (char) (TextUtils.indexOf("", "", 0) + 29944);
                        int i10 = 1755 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 24;
                        byte[] bArr4 = $$a;
                        Object[] objArr11 = new Object[1];
                        c((short) 88, bArr4[28], bArr4[7], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, i10, iIndexOf, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 29945);
                        int i11 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1754;
                        int iIndexOf2 = 22 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        byte[] bArr5 = $$a;
                        short s4 = bArr5[5];
                        byte b3 = bArr5[28];
                        Object[] objArr12 = new Object[1];
                        c(s4, b3, (byte) (b3 | 14), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf2, i11, iIndexOf2, 986134021, false, (String) objArr12[0], null);
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
        int i12 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i13 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i13 == i12) {
            int i14 = notify + 83;
            cancel = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int i17 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i18 = i16 + (((~(364669039 | i17)) | (-936648391)) * 398) + 1687733757 + (((~((~i17) | 364669039)) | (-936648391)) * 398);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr13[3])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i13];
            int i21 = i13 - 1;
            iArr[i21] = 1;
            Toast.makeText((Context) null, iArr[((i13 * i21) % 2) - 1], 1).show();
            int i22 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i23 = ~elapsedCpuTime;
            int i24 = i22 + (-1766207579) + (((~((-70987605) | i23)) | 283590030) * (-328)) + ((elapsedCpuTime | 283590030) * 164) + (((~(elapsedCpuTime | 70987604)) | 281284746 | (~(i23 | (-68682321)))) * 164);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr14[3])[0] = i26 ^ (i26 << 5);
            int i27 = cancel + 47;
            notify = i27 % 128;
            int i28 = i27 % 2;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int i29 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1031;
            int i30 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14;
            byte[] bArr6 = $$a;
            Object[] objArr15 = new Object[1];
            c((short) 140, bArr6[28], bArr6[7], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cResolveOpacity, i29, i30, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new int[]{-1047520013, -357659250, 626566059, -1196675581, 874658911, 1448081038, -1088609429, 346776707, 43355669, -64086403, -1585841018, -1663625560, -790574153, 1237273913}, 23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new int[]{-271752342, 887231003, 205274407, 582391426, -234741276, -1252104471, -372752190, -1754078909, -1817310867, 1338298145}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.title_shipping_billing_address).substring(0, 26).length() - 11, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1031;
            int iMyPid = (Process.myPid() >> 22) + 15;
            short s5 = (short) ($$b & 189);
            byte[] bArr7 = $$a;
            Object[] objArr18 = new Object[1];
            c(s5, bArr7[28], bArr7[7], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(minimumFlingVelocity, minimumFlingVelocity2, iMyPid, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1031;
                int i31 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14;
                short s6 = (short) DerHeader.TAG_CLASS_PRIVATE;
                byte b4 = $$a[7];
                Object[] objArr19 = new Object[1];
                c(s6, b4, (byte) (b4 | 52), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c, iResolveSizeAndState, i31, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i32 = ((int[]) objArr20[3])[0];
            int i33 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int i34 = ~Process.myPid();
            int i35 = (-140157143) + (((~(i34 | 376617786)) | 25248960) * (-160)) + (((~(i34 | 132337616)) | 376617786) * 160) + 645866822;
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr[2])[0] = i37 ^ (i37 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new int[]{1013393722, 356672446, 1785910488, -1993588912, -880562479, -1666136816, 906880701, -756475024, 540734302, 934353715}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_liveliness_invalid_gesture_combination).substring(0, 99).codePointAt(4) - 83, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new int[]{-1888322599, -434951655, -1882609809, -39928109, 675176499, 1117062762, 730179514, 502536979, 136943905, 121477112}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.input_2).substring(3, 4).length() + 15, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {469093913};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - (ViewConfiguration.getTouchSlop() >> 8)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1134, (-16777198) - Color.rgb(0, 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 645866822, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int iRed = Color.red(0) + 1031;
                int iResolveSize = 15 - View.resolveSize(0, 0);
                byte[] bArr8 = $$a;
                Object[] objArr25 = new Object[1];
                c((short) 140, bArr8[28], bArr8[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cMakeMeasureSpec, iRed, iResolveSize, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.getOffsetAfter("", 0) + 45993), 1117 - TextUtils.indexOf("", "", 0, 0), TextUtils.indexOf("", "", 0) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cAlpha = (char) Color.alpha(0);
                int iRgb = (-16776185) - Color.rgb(0, 0, 0);
                int touchSlop = 15 - (ViewConfiguration.getTouchSlop() >> 8);
                short s7 = (short) DerHeader.TAG_CLASS_PRIVATE;
                byte b5 = $$a[7];
                Object[] objArr26 = new Object[1];
                c(s7, b5, (byte) (b5 | 52), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cAlpha, iRgb, touchSlop, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(new int[]{-1047520013, -357659250, 626566059, -1196675581, 874658911, 1448081038, -1088609429, 346776707, 43355669, -64086403, -1585841018, -1663625560, -790574153, 1237273913}, TextUtils.indexOf((CharSequence) "", '0', 0) + 23, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new int[]{-271752342, 887231003, 205274407, 582391426, -234741276, -1252104471, -372752190, -1754078909, -1817310867, 1338298145}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.offer_not_applied).substring(8, 9).codePointAt(0) - 85, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                    int i38 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1031;
                    int gidForName = 14 - Process.getGidForName("");
                    short s8 = (short) ($$b & 189);
                    byte[] bArr9 = $$a;
                    Object[] objArr29 = new Object[1];
                    c(s8, bArr9[28], bArr9[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(mirror, i38, gidForName, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1031;
                    int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 15;
                    byte[] bArr10 = $$a;
                    Object[] objArr30 = new Object[1];
                    c((short) 140, bArr10[28], bArr10[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cResolveSizeAndState, keyRepeatDelay2, iResolveSizeAndState2, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i39 = ((int[]) objArr[1])[0];
        int i40 = ((int[]) objArr[3])[0];
        if (i40 == i39) {
            int i41 = notify + 81;
            cancel = i41 % 128;
            int i42 = i41 % 2;
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i43 = ((int[]) objArr[2])[0];
            int i44 = ((int[]) objArr[3])[0];
            int i45 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i46 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1014214946);
            int i47 = i43 + (((644797189 + (((~(233694941 | i46)) | 10585228) * (-828))) + ((i46 | 233694941) * (-828))) - 225883656);
            int i48 = i47 ^ (i47 << 13);
            int i49 = i48 ^ (i48 >>> 17);
            ((int[]) objArr31[2])[0] = i49 ^ (i49 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str2 : strArr4) {
                arrayList2.add(str2);
            }
        }
        int[] iArr2 = new int[i40];
        int i50 = i40 - 1;
        iArr2[i50] = 1;
        Toast.makeText((Context) null, iArr2[((i40 * i50) % 2) - 1], 1).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i51 = ((int[]) objArr[2])[0];
        int i52 = ((int[]) objArr[3])[0];
        int i53 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int i54 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
        int i55 = ~i54;
        int i56 = i51 + (-1983075958) + (((~((-548311748) | i55)) | (-304031578)) * 519) + (((~(i55 | (-918082))) | (~((-303113497) | i54))) * (-519)) + (((~(i54 | (-304031578))) | 548311747) * 519);
        int i57 = (i56 << 13) ^ i56;
        int i58 = i57 ^ (i57 >>> 17);
        ((int[]) objArr32[2])[0] = i58 ^ (i58 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = cancel + 107;
        notify = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
        if (i4 != (-1530004804) + (((~((-1790518851) | i5)) | 671089218) * (-140)) + ((~((-1119429633) | i5)) * 70) + (((~(i5 | 960531307)) | (-1408871722)) * 70)) {
            throw new RuntimeException("306389278");
        }
        int i6 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
        int i8 = ~i7;
        int i9 = ~((-398296107) | i8);
        int i10 = ~(2114207437 | i7);
        if (i6 != 1385593784 + ((i9 | i10) * 1150) + (((~((-2114207438) | i8)) | i10) * (-575)) + (((~(i7 | (-398296107))) | (~(i8 | 398296106))) * 575)) {
            int i11 = (-1117623964) % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i12 = notify + 85;
        cancel = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 25 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ef, code lost:
    
        if (r1 != (((((1629491266 | r3) | (~(479784717 | r2))) * (-338)) - 703677312) + (((~(r2 | 2109275983)) | r3) * 338))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f1, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.asik.active.AsikActiveParticipantActivity.notify + 111;
        com.bpjstku.presentation.asik.active.AsikActiveParticipantActivity.cancel = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fd, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ff, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0100, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0101, code lost:
    
        r1 = 1744929448 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x010a, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0112, code lost:
    
        throw new java.lang.RuntimeException("-1659612275");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0072, code lost:
    
        if (r1 == ((1849034920 + ((((~(r7 | (-1689002838))) | 1150034689) | (~((-320047147) | r6))) * 717)) + (((~(r6 | (-1689002838))) | ((~(r7 | (-320047147))) | 1150034689)) * 717))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a7, code lost:
    
        if (r1 == ((((((-2076179244) | r7) | (~(960483371 | r6))) * (-338)) + 1796064528) + (((~(r6 | (-1115695873))) | r7) * 338))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a9, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
        r3 = ~((-479784718) | (~r2));
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.active.AsikActiveParticipantActivity.onStart():void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = cancel + 11;
        notify = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = cancel + 95;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(AsikActiveParticipantActivity asikActiveParticipantActivity, lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol) throws IllegalAccessException {
        int i;
        int i2 = 2 % 2;
        AsikActiveParticipant asikActiveParticipant = lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (asikActiveParticipant != null) {
            setTabListener settablistener = (setTabListener) asikActiveParticipantActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            Intrinsics.checkNotNullParameter(asikActiveParticipant, "");
            settablistener.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setValue(asikActiveParticipant);
            int i3 = notify + 21;
            cancel = i3 % 128;
            int i4 = i3 % 2;
        }
        VerificationActionType verificationActionType = lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol.b;
        if (verificationActionType == null) {
            int i5 = notify + 15;
            cancel = i5 % 128;
            int i6 = i5 % 2;
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[verificationActionType.ordinal()];
        }
        if (i != 1) {
            int i7 = notify + 87;
            cancel = i7 % 128;
            if (i7 % 2 != 0 ? i == 2 : i == 2) {
                AsikVerifyOtpFromPhone.Companion companion = AsikVerifyOtpFromPhone.INSTANCE;
                AsikVerifyOtpFromPhone.Companion.TuitionPaymentFragmentbindingInflater1(asikActiveParticipantActivity, lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i8 = cancel + 75;
                notify = i8 % 128;
                int i9 = i8 % 2;
            } else {
                asikActiveParticipantActivity.d++;
                asikActiveParticipantActivity.INotificationSideChannel();
            }
        } else {
            AsikVerifyOtpFromEmail.Companion companion2 = AsikVerifyOtpFromEmail.INSTANCE;
            AsikVerifyOtpFromEmail.Companion.TuitionPaymentFragmentbindingInflater1(asikActiveParticipantActivity, lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(AsikActiveParticipantActivity asikActiveParticipantActivity, View view) {
        int i = 2 % 2;
        int i2 = cancel + 49;
        notify = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                asikActiveParticipantActivity.onTransact();
                ViewPortBuilder.b();
            } else {
                asikActiveParticipantActivity.onTransact();
                ViewPortBuilder.b();
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1791013843, new Object[]{function1, obj}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1791013842, zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    public static /* synthetic */ boolean g() {
        int i = 2 % 2;
        int i2 = notify + 57;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }

    static {
        onTransact = 0;
        d();
        INSTANCE = new Companion(null);
        int i = cancelAll + 29;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    private final void b(int p0) throws IllegalAccessException {
        Object[] objArr = {this, Integer.valueOf(p0)};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 2083938740, objArr, getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -2083938737, getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityAsikActiveParticipantBinding> TuitionPaymentFragmentbindingInflater1() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Function1) TuitionPaymentFragmentbindingInflater1(getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1743542808, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1743542808, zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = cancel + 47;
        notify = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = notify + 13;
        cancel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 2 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int length = 1867945603 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step4).substring(89, 91).length();
        TuitionPaymentFragmentbindingInflater1(zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 671557260, new Object[]{this, bundle}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redirecting_to_gopay).substring(1, 2).codePointAt(0) + 261134001, length, -671557258, zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = cancel + 117;
        notify = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
    }

    static void d() {
        g = new int[]{1747483261, -1320746218, -1112626908, 1334151062, 1991178511, -526070013, -1104789721, -1950785695, -861641648, 456210848, -951346344, 908222070, -335528680, -1484542668, 1700035855, 1755311294, -168194346, 26431978};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, short r7, short r8) {
        /*
            int r7 = r7 * 56
            int r7 = 122 - r7
            int r8 = r8 * 2
            int r0 = 1 - r8
            byte[] r1 = com.bpjstku.presentation.asik.active.AsikActiveParticipantActivity.$$c
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L19
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.active.AsikActiveParticipantActivity.$$i(int, short, short):java.lang.String");
    }
}
