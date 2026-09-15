package com.bpjstku.presentation.membership.forgotaccount.inputnik;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.user.model.response.ForgotPasswordItem;
import com.bpjstku.databinding.ActivityGetOtpMethodBinding;
import com.bpjstku.presentation.membership.forgotaccount.inputnik.GetOtpMethodActivity;
import com.bpjstku.presentation.membership.forgotaccount.verifyotp.VerifyOtpByPhoneActivity;
import com.bpjstku.presentation.membership.forgotpassword.verifyotp.VerifyOtpActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.mlkit_vision_face.zzee;
import com.google.android.material.card.MaterialCardView;
import com.google.mlkit.common.MlKitException;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.cacheInteropConfig;
import defpackage.cleanupAutoSizePresetSizes;
import defpackage.forLanguageTags;
import defpackage.generateCameraId;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getSessionConfigTemplateType;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import defpackage.mapPoint;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00108\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00108\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0015\u0010\u0016\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0015\u0010\u0011\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u00188UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001aR\u0014\u0010\n\u001a\u00020\u001c8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001d"}, d2 = {"Lcom/bpjstku/presentation/membership/forgotaccount/inputnik/GetOtpMethodActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityGetOtpMethodBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "LcleanupAutoSizePresetSizes;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LforLanguageTags;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "g", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetOtpMethodActivity extends BindingBaseActivity<ActivityGetOtpMethodBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int[] asInterface;
    private static int cancelAll;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private String b;
    private static final byte[] $$c = {1, 115, -83, 116};
    private static final int $$f = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {42, -104, -68, 105, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 123;
    private static int asBinder = 0;
    private static int g = 0;
    private static int d = 1;

    public static /* synthetic */ Object b(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~((~i2) | i7);
        int i9 = (~i) | (~(i7 | i2));
        int i10 = i2 | i | i7;
        int i11 = i + i6 + i3 + (1635157569 * i4) + ((-1141649966) * i5);
        int i12 = i11 * i11;
        int i13 = (((-1186836012) * i) - 711983104) + (488484398 * i6) + (i8 * 1309823443) + (1309823443 * i9) + ((-1309823443) * i10) + (1798307840 * i3) + (1462763520 * i4) + (1566572544 * i5) + (1631846400 * i12);
        int i14 = (i * 1521345644) + 2088555610 + (i6 * 1521346098) + (i8 * (-227)) + (i9 * (-227)) + (i10 * 227) + (i3 * 1521345871) + (i4 * (-1382509809)) + (i5 * 37969358) + (i12 * (-671350784));
        int i15 = i13 + (i14 * i14 * (-1069809664));
        if (i15 != 1) {
            return i15 != 2 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 197 - r7
            int r0 = 53 - r8
            byte[] r1 = com.bpjstku.presentation.membership.forgotaccount.inputnik.GetOtpMethodActivity.$$a
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2d:
            int r7 = r7 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.forgotaccount.inputnik.GetOtpMethodActivity.c(int, int, byte, java.lang.Object[]):void");
    }

    public GetOtpMethodActivity() {
        final GetOtpMethodActivity getOtpMethodActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<cleanupAutoSizePresetSizes>() { // from class: com.bpjstku.presentation.membership.forgotaccount.inputnik.GetOtpMethodActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, cleanupAutoSizePresetSizes] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ cleanupAutoSizePresetSizes invoke() {
                LifecycleOwner lifecycleOwner = getOtpMethodActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(cleanupAutoSizePresetSizes.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<forLanguageTags>() { // from class: com.bpjstku.presentation.membership.forgotaccount.inputnik.GetOtpMethodActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, forLanguageTags] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ forLanguageTags invoke() {
                LifecycleOwner lifecycleOwner = getOtpMethodActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(forLanguageTags.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.forgotaccount.inputnik.GetOtpMethodActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/bpjstku/presentation/membership/forgotaccount/inputnik/GetOtpMethodActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "p3", "", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0, String p1, String p2, String p3) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intrinsics.checkNotNullParameter(p3, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, GetOtpMethodActivity.class, new Pair[]{TuplesKt.to("email", p1), TuplesKt.to("phone_number", p2), TuplesKt.to("check_sum", p3)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityGetOtpMethodBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g + 83;
        d = i2 % 128;
        int i3 = i2 % 2;
        GetOtpMethodActivity$bindingInflater$1 getOtpMethodActivity$bindingInflater$1 = GetOtpMethodActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i3 != 0) {
            return getOtpMethodActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        String strD;
        final GetOtpMethodActivity getOtpMethodActivity = (GetOtpMethodActivity) objArr[0];
        int i = 2 % 2;
        ActivityGetOtpMethodBinding activityGetOtpMethodBinding = (ActivityGetOtpMethodBinding) ((ViewBinding) getOtpMethodActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        TextView textView = activityGetOtpMethodBinding.tvConfirmationAccountEmailInfo;
        String str = getOtpMethodActivity.TuitionPaymentFragmentbindingInflater1;
        if (str == null) {
            int i2 = d + 13;
            g = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        textView.setText(Camera2CameraControlExternalSyntheticLambda5.a(str));
        TextView textView2 = activityGetOtpMethodBinding.tvConfirmationAccountInfoPhone;
        try {
            String str2 = getOtpMethodActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str2 == null) {
                int i4 = d + 63;
                g = i4 % 128;
                if (i4 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                str2 = null;
            }
            strD = Camera2CameraControlExternalSyntheticLambda5.d(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2));
        } catch (Exception unused) {
        }
        textView2.setText(strD);
        MaterialCardView materialCardView = activityGetOtpMethodBinding.cvConfirmationByPhone;
        Intrinsics.checkNotNullExpressionValue(materialCardView, "");
        materialCardView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: access1101
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GetOtpMethodActivity.b(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
        MaterialCardView materialCardView2 = activityGetOtpMethodBinding.cvConfirmationByEmail;
        Intrinsics.checkNotNullExpressionValue(materialCardView2, "");
        materialCardView2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: access401
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GetOtpMethodActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (View) obj);
            }
        }));
        int i5 = g + 85;
        d = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        String stringExtra = getIntent().getStringExtra("email");
        if (stringExtra == null) {
            int i2 = d + 75;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            stringExtra = "";
        }
        this.TuitionPaymentFragmentbindingInflater1 = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("phone_number");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("check_sum");
        this.b = stringExtra3 != null ? stringExtra3 : "";
        int i3 = d + 35;
        g = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        GetOtpMethodActivity getOtpMethodActivity = this;
        ((cleanupAutoSizePresetSizes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(getOtpMethodActivity, new Observer() { // from class: access301
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                GetOtpMethodActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        ((forLanguageTags) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b.observe(getOtpMethodActivity, new Observer() { // from class: access801
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                GetOtpMethodActivity.b(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = g + 29;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = asInterface;
        int i5 = -1870535734;
        int i6 = 1;
        int i7 = 0;
        if (iArr3 != null) {
            int i8 = $10 + 29;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i9 = $11 + 89;
                $10 = i9 % 128;
                if (i9 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i2])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char mode = (char) View.MeasureSpec.getMode(0);
                            int absoluteGravity = 3291 - Gravity.getAbsoluteGravity(0, 0);
                            int doubleTapTimeout = 31 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            byte b = $$c[0];
                            byte b2 = b;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mode, absoluteGravity, doubleTapTimeout, 1948206109, false, $$i(b2, (byte) (b2 - 1), (byte) (-b)), new Class[]{Integer.TYPE});
                        }
                        iArr2[i2] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        i2 >>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr3[i2])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 3291;
                        int maximumDrawingCacheSize = 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        byte b3 = $$c[0];
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionGroup, iCombineMeasuredStates, maximumDrawingCacheSize, 1948206109, false, $$i(b4, (byte) (b4 - 1), (byte) (-b3)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i2++;
                }
                i3 = 2;
                i5 = -1870535734;
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = asInterface;
        if (iArr5 != null) {
            int i10 = $11 + 107;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                int i13 = $10 + 75;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    try {
                        Object[] objArr4 = new Object[i6];
                        objArr4[i7] = Integer.valueOf(iArr5[i12]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                            int bitsPerPixel = ImageFormat.getBitsPerPixel(i7) + 3292;
                            int iIndexOf = 31 - TextUtils.indexOf("", "");
                            byte b5 = $$c[i7];
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionType, bitsPerPixel, iIndexOf, 1948206109, false, $$i(b6, (byte) (b6 - 1), (byte) (-b5)), new Class[]{Integer.TYPE});
                        }
                        iArr6[i12] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    Object[] objArr5 = {Integer.valueOf(iArr5[i12])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                        int absoluteGravity2 = 3291 - Gravity.getAbsoluteGravity(0, 0);
                        int scrollBarFadeDuration = 31 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        byte b7 = $$c[0];
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, absoluteGravity2, scrollBarFadeDuration, 1948206109, false, $$i(b8, (byte) (b8 - 1), (byte) (-b7)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    i12++;
                }
                i6 = 1;
                i7 = 0;
            }
            iArr5 = iArr6;
        }
        int i14 = i7;
        System.arraycopy(iArr5, i14, iArr4, i14, length2);
        int i15 = 2;
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i16 = $11 + 15;
            $10 = i16 % 128;
            int i17 = i16 % i15;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i18 = 17;
            for (int i19 = 1; i18 > i19; i19 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i18];
                Object[] objArr6 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2559;
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 29;
                    byte b9 = $$c[0];
                    byte b10 = (byte) (b9 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(pressedStateDuration, doubleTapTimeout2, tapTimeout, 683220507, false, $$i(b10, b10, (byte) (-b9)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i18--;
            }
            int i20 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i21 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr7 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (28879 - Gravity.getAbsoluteGravity(0, 0)), KeyEvent.normalizeMetaState(0) + 348, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 24, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            i15 = 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        GetOtpMethodActivity getOtpMethodActivity = (GetOtpMethodActivity) objArr[0];
        int i = 2 % 2;
        int i2 = d + 95;
        g = i2 % 128;
        int i3 = i2 % 2;
        GetOtpMethodActivity getOtpMethodActivity2 = getOtpMethodActivity;
        Intrinsics.checkNotNullParameter(getOtpMethodActivity2, "");
        getOtpMethodActivity2.getWindow().addFlags(8192);
        getOtpMethodActivity.TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityGetOtpMethodBinding) ((ViewBinding) getOtpMethodActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityGetOtpMethodBinding) ((ViewBinding) getOtpMethodActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getOtpMethodActivity.getString(R.string.title_choose_otp_method));
        int i4 = d + 125;
        g = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = d + 53;
        g = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                getOnBackPressedDispatcher().onBackPressed();
                int i4 = d + 97;
                g = i4 % 128;
                int i5 = i4 % 2;
            }
            return super.onOptionsItemSelected(p0);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944);
            int modifierMetaStateMask = 1754 - ((byte) KeyEvent.getModifierMetaStateMask());
            int i2 = 23 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            byte[] bArr = $$a;
            byte b = bArr[28];
            Object[] objArr2 = new Object[1];
            c(b, (short) (b | 192), (byte) (bArr[27] - 1), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, modifierMetaStateMask, i2, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cIndexOf = (char) (29944 - TextUtils.indexOf("", "", 0));
                int i3 = 1756 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 23;
                byte[] bArr2 = $$a;
                Object[] objArr3 = new Object[1];
                c(bArr2[28], (short) 156, bArr2[7], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i3, maxKeyCode, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i4 = 631833220 + (((~(startElapsedRealtime | 311120999)) | 89391624) * 305) + (((~((~startElapsedRealtime) | 311120999)) | 98518573) * 305) + 1556292467;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new int[]{-75099038, 960960020, 1544879336, 1145660207, -1399231307, -980593684, 217328195, -274096725, 1771718998, 419430920}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new int[]{-677640868, -1495499143, -61162000, -1545353344, -1284258560, -1584680451, -409585131, 901287582, 1579654916, -863064190}, 16 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-1495355257};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 42049), TextUtils.indexOf((CharSequence) "", '0') + 1727, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 1556292467, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 29944);
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1755;
                    int i7 = 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte[] bArr3 = $$a;
                    Object[] objArr8 = new Object[1];
                    c(bArr3[28], (short) 156, bArr3[7], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState, packedPositionType, i7, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new int[]{-255438910, 1583861791, 213514101, -541623864, 992075569, 79722032, 1809906831, -2126135093, 1036452369, -573633410, 1105890166, -329811736, 486284647, -1351106766}, 21 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new int[]{803181470, -1450659839, -913100542, -1985235632, 1359099303, -1579033881, 1455208536, 1340199708, -1612512266, 426026613}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_shippingcountry_empty).substring(10, 11).codePointAt(0) - 86, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 29945);
                        int iGreen = Color.green(0) + 1755;
                        int i8 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23;
                        byte[] bArr4 = $$a;
                        Object[] objArr11 = new Object[1];
                        c(bArr4[28], (short) (-bArr4[1]), bArr4[7], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAxisFromString, iGreen, i8, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) (29944 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        int mirror = AndroidCharacter.getMirror('0') + 1707;
                        int i9 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22;
                        byte[] bArr5 = $$a;
                        byte b2 = bArr5[28];
                        Object[] objArr12 = new Object[1];
                        c(b2, (short) (b2 | 192), (byte) (bArr5[27] - 1), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, mirror, i9, 986134021, false, (String) objArr12[0], null);
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
        int i10 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i13 = i12 + 1320524901 + ((~((~iIdentityHashCode) | (-89393159))) * (-116)) + ((438892393 | iIdentityHashCode) * 116) + (((~(iIdentityHashCode | 226289967)) | 301995584) * 116);
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr13[3])[0] = i15 ^ (i15 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr != null) {
                int i16 = 0;
                while (i16 < strArr.length) {
                    int i17 = g + 41;
                    d = i17 % 128;
                    if (i17 % 2 == 0) {
                        arrayList.add(strArr[i16]);
                        i16 += 60;
                    } else {
                        arrayList.add(strArr[i16]);
                        i16++;
                    }
                    int i18 = g + 121;
                    d = i18 % 128;
                    int i19 = i18 % 2;
                }
            }
            Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
            int i20 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i21 = i20 + (-1469017163) + (((~((-528905) | iIdentityHashCode2)) | 213131330) * (-756)) + (((~iIdentityHashCode2) | (-528905)) * 756);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr14[3])[0] = i23 ^ (i23 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cBlue = (char) Color.blue(0);
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1031;
            int i24 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14;
            byte[] bArr6 = $$a;
            Object[] objArr15 = new Object[1];
            c(bArr6[28], (short) 52, bArr6[7], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cBlue, fadingEdgeLength, i24, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new int[]{-255438910, 1583861791, 213514101, -541623864, 992075569, 79722032, 1809906831, -2126135093, 1036452369, -573633410, 1105890166, -329811736, 486284647, -1351106766}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_canceled).substring(13, 14).length() + 21, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new int[]{803181470, -1450659839, -913100542, -1985235632, 1359099303, -1579033881, 1455208536, 1340199708, -1612512266, 426026613}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redeem_mandiri_title).substring(0, 18).codePointAt(1) - 82, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
            int packedPositionGroup = 1031 - ExpandableListView.getPackedPositionGroup(0L);
            int i25 = 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte[] bArr7 = $$a;
            Object[] objArr18 = new Object[1];
            c(bArr7[28], (short) 156, bArr7[7], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cRgb, packedPositionGroup, i25, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                int touchSlop = 1031 - (ViewConfiguration.getTouchSlop() >> 8);
                int iIndexOf = 14 - TextUtils.indexOf((CharSequence) "", '0', 0);
                byte b3 = $$a[7];
                short s = b3;
                Object[] objArr19 = new Object[1];
                c(b3, s, (byte) (s | 52), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(longPressTimeout, touchSlop, iIndexOf, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr20[3])[0];
            int i27 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int i28 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
            int i29 = 30194421 + (((~(775650181 | i28)) | 1019930351) * (-366)) + (((~(i28 | 1056702447)) | 738878085) * 366) + 368992872;
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr[2])[0] = i31 ^ (i31 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new int[]{-75099038, 960960020, 1544879336, 1145660207, -1399231307, -980593684, 217328195, -274096725, 1771718998, 419430920}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_challenge_token).substring(0, 15).length() + 1, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new int[]{-677640868, -1495499143, -61162000, -1545353344, -1284258560, -1584680451, -409585131, 901287582, 1579654916, -863064190}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-1495355257};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46039 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 1134 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), AndroidCharacter.getMirror('0') - 30, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 368992872, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char touchSlop2 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int trimmedLength = TextUtils.getTrimmedLength("") + 1031;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 15;
                byte[] bArr8 = $$a;
                Object[] objArr25 = new Object[1];
                c(bArr8[28], (short) 52, bArr8[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(touchSlop2, trimmedLength, iMakeMeasureSpec, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 1117 - TextUtils.indexOf("", ""), 17 - View.resolveSizeAndState(0, 0, 0)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char longPressTimeout2 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 1031;
                int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15;
                byte b4 = $$a[7];
                short s2 = b4;
                Object[] objArr26 = new Object[1];
                c(b4, s2, (byte) (s2 | 52), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(longPressTimeout2, iMakeMeasureSpec2, scrollBarFadeDuration2, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(new int[]{-255438910, 1583861791, 213514101, -541623864, 992075569, 79722032, 1809906831, -2126135093, 1036452369, -573633410, 1105890166, -329811736, 486284647, -1351106766}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_empty_tcash_token_field).substring(0, 6).codePointAt(1) - 89, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new int[]{803181470, -1450659839, -913100542, -1985235632, 1359099303, -1579033881, 1455208536, 1340199708, -1612512266, 426026613}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_internet_instruction_7).substring(0, 1).codePointAt(0) - 65, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cGreen = (char) Color.green(0);
                    int scrollBarFadeDuration3 = 1031 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int iMyTid = (Process.myTid() >> 22) + 15;
                    byte[] bArr9 = $$a;
                    Object[] objArr29 = new Object[1];
                    c(bArr9[28], (short) 156, bArr9[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cGreen, scrollBarFadeDuration3, iMyTid, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cResolveSize = (char) View.resolveSize(0, 0);
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1031;
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 15;
                    byte[] bArr10 = $$a;
                    Object[] objArr30 = new Object[1];
                    c(bArr10[28], (short) 52, bArr10[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cResolveSize, iResolveSizeAndState, doubleTapTimeout, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i32 = ((int[]) objArr[1])[0];
        int i33 = ((int[]) objArr[3])[0];
        if (i33 == i32) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i34 = ((int[]) objArr[2])[0];
            int i35 = ((int[]) objArr[3])[0];
            int i36 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tesla_ev_connector_type).substring(1, 5).length() - 1621735302;
            int i37 = ~length;
            int i38 = i34 + (-1589575152) + (((~(332369978 | i37)) | 576650148) * 226) + (((~(i37 | 870316990)) | (~((-576650149) | length)) | 38703136) * (-113)) + ((~(length | 332369978)) * 113);
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr31[2])[0] = i40 ^ (i40 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str : strArr4) {
                int i41 = g + 99;
                d = i41 % 128;
                int i42 = i41 % 2;
                arrayList2.add(str);
            }
        }
        Toast.makeText((Context) null, i33 / (((i33 - 1) * i33) % 2), 0).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i43 = ((int[]) objArr[2])[0];
        int i44 = ((int[]) objArr[3])[0];
        int i45 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int i46 = ~((~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen) | 685823687);
        int i47 = i43 + ((138428997 | i46) * (-374)) + 1909933643 + ((i46 | 547394690) * 374);
        int i48 = (i47 << 13) ^ i47;
        int i49 = i48 ^ (i48 >>> 17);
        ((int[]) objArr32[2])[0] = i49 ^ (i49 << 5);
        int i50 = g + 5;
        d = i50 % 128;
        if (i50 % 2 == 0) {
            int i51 = 79 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = d + 53;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        if (i4 != (((~(2109325247 | i5)) | (~((-1368958220) | iIdentityHashCode))) * 988) + 581113604 + (((~(iIdentityHashCode | 1570354571)) | 538970676 | (~(i5 | (-1368958220)))) * 988)) {
            throw new RuntimeException("1109059381");
        }
        int i6 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 297087507;
        if (i6 != (-648626699) + (((~((~i7) | (-913432366))) | 1665623599) * (-235)) + (((~((-913432366) | i7)) | 1665623599) * (-470)) + (((~(i7 | (-338729217))) | 1090920450) * 235)) {
            int[] iArr = new int[226453659];
            iArr[226453658] = 1;
            int i8 = (-1526143682) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i9 = d + 57;
            g = i9 % 128;
            int i10 = i9 % 2;
        }
        super.onResume();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d5, code lost:
    
        if (r1 != (((1862978656 + (((~((-890663940) | r2)) | 604131329) * 345)) + (((~((-890663940) | (~r2))) | 1084260696) * 345)) + ((~(r2 | (-604131330))) * 345))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d7, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.membership.forgotaccount.inputnik.GetOtpMethodActivity.g + 35;
        com.bpjstku.presentation.membership.forgotaccount.inputnik.GetOtpMethodActivity.d = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00eb, code lost:
    
        throw new java.lang.RuntimeException("873924217");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ec, code lost:
    
        r1 = 1099859372 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f5, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0046, code lost:
    
        if (r1 == (((389631894 + (((~((-903537083) | r5)) | (~(1733524625 | r4))) * 217)) + (((~(r4 | (-903537083))) | 277381418) * 217)) + (((~(1733524625 | r5)) | 903537082) * 217))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007e, code lost:
    
        if (r1 == ((r7 + (((~(r4 | (-1897677867))) | (~((-1067690324) | r5))) * (-672))) + (((~(1897677866 | r5)) | (-2143284604)) * 672))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0080, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r4 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 126002771;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.forgotaccount.inputnik.GetOtpMethodActivity.onStart():void");
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -25233831
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.forgotaccount.inputnik.GetOtpMethodActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ void b(GetOtpMethodActivity getOtpMethodActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 101;
        g = i3 % 128;
        int i4 = i3 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getOtpMethodActivity.MediaBrowserCompat();
            int i5 = d + 123;
            g = i5 % 128;
            int i6 = i5 % 2;
            str = "loading_otp_forgot_account_by_phone";
        } else {
            String str2 = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                getOtpMethodActivity.IconCompatParcelizer();
                VerifyOtpByPhoneActivity.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = VerifyOtpByPhoneActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                GetOtpMethodActivity getOtpMethodActivity2 = getOtpMethodActivity;
                VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                String strValueOf = String.valueOf(((ForgotPasswordItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getOtp());
                String str3 = getOtpMethodActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str3 = null;
                }
                String str4 = getOtpMethodActivity.b;
                if (str4 == null) {
                    int i7 = g + 69;
                    d = i7 % 128;
                    int i8 = i7 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    str2 = str4;
                }
                VerifyOtpByPhoneActivity.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getOtpMethodActivity2, strValueOf, str3, str2, String.valueOf(((ForgotPasswordItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum()));
                getOtpMethodActivity.d_();
                str = "success_otp_forgot_account_by_phone";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i9 = i2 + 9;
                g = i9 % 128;
                if (i9 % 2 != 0) {
                    getOtpMethodActivity.IconCompatParcelizer();
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getOtpMethodActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                    throw null;
                }
                getOtpMethodActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getOtpMethodActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                str = "failure_otp_forgot_account_by_phone";
            } else {
                str = "";
            }
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_request_otp_forgot_by_phone", str));
        Intrinsics.checkNotNullParameter(getOtpMethodActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        int i10 = g + 7;
        d = i10 % 128;
        int i11 = i10 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(GetOtpMethodActivity getOtpMethodActivity, View view) {
        int i = 2 % 2;
        int i2 = d + 99;
        g = i2 % 128;
        int i3 = i2 % 2;
        String str = null;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            String str2 = getOtpMethodActivity.TuitionPaymentFragmentbindingInflater1;
            throw null;
        }
        cleanupAutoSizePresetSizes cleanupautosizepresetsizes = (cleanupAutoSizePresetSizes) getOtpMethodActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        String str3 = getOtpMethodActivity.TuitionPaymentFragmentbindingInflater1;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str3 = null;
        }
        String str4 = getOtpMethodActivity.b;
        if (str4 == null) {
            int i4 = d + 95;
            g = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            int i6 = d + 75;
            g = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 / 2;
            }
            str = str4;
        }
        cleanupautosizepresetsizes.b(str3, str);
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_forgot_by_email", "select_verify_otp_by_email"));
        Intrinsics.checkNotNullParameter(getOtpMethodActivity, "");
        Intrinsics.checkNotNullParameter("forgot_account_by_email", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("forgot_account_by_email", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("forgot_account_by_email", mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(GetOtpMethodActivity getOtpMethodActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_forgot_by_phone", "select_verify_otp_by_phone"));
        Intrinsics.checkNotNullParameter(getOtpMethodActivity, "");
        Intrinsics.checkNotNullParameter("forgot_account_by_phone", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("forgot_account_by_phone", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("forgot_account_by_phone", mapMutableMapOf);
        forLanguageTags forlanguagetags = (forLanguageTags) getOtpMethodActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        String str = getOtpMethodActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (str == null) {
            int i2 = g + 85;
            d = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        String str2 = getOtpMethodActivity.b;
        if (str2 == null) {
            int i4 = g + 95;
            d = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            str2 = null;
        }
        forlanguagetags.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, str2);
        Unit unit = Unit.INSTANCE;
        int i6 = d + 73;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(GetOtpMethodActivity getOtpMethodActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        String str2;
        String str3;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = d + 29;
            g = i2 % 128;
            int i3 = i2 % 2;
            getOtpMethodActivity.MediaBrowserCompat();
            int i4 = g + 65;
            d = i4 % 128;
            int i5 = i4 % 2;
            str = "loading_otp_forgot_account_by_email";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            getOtpMethodActivity.IconCompatParcelizer();
            VerifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = VerifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            GetOtpMethodActivity getOtpMethodActivity2 = getOtpMethodActivity;
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            String strValueOf = String.valueOf(((ForgotPasswordItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getOtp());
            String str4 = getOtpMethodActivity.TuitionPaymentFragmentbindingInflater1;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str2 = null;
            } else {
                str2 = str4;
            }
            String str5 = getOtpMethodActivity.b;
            if (str5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str3 = null;
            } else {
                str3 = str5;
            }
            VerifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(getOtpMethodActivity2, strValueOf, str2, str3, String.valueOf(((ForgotPasswordItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum()), "forgot-account");
            getOtpMethodActivity.d_();
            str = "success_otp_forgot_account_by_email";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i6 = d + 27;
            g = i6 % 128;
            if (i6 % 2 != 0) {
                getOtpMethodActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getOtpMethodActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                int i7 = 32 / 0;
            } else {
                getOtpMethodActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getOtpMethodActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
            int i8 = d + 55;
            g = i8 % 128;
            int i9 = i8 % 2;
            str = "failure_otp_forgot_account_by_email";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_request_otp_forgot_by_email", str));
        Intrinsics.checkNotNullParameter(getOtpMethodActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        int i10 = d + 95;
        g = i10 % 128;
        int i11 = i10 % 2;
    }

    static {
        cancelAll = 1;
        d();
        INSTANCE = new Companion(null);
        int i = asBinder + 99;
        cancelAll = i % 128;
        if (i % 2 == 0) {
            int i2 = 20 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = g + 117;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 97;
        g = i4 % 128;
        int i5 = i4 % 2;
        return R.layout.activity_get_otp_method;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        b(-792786332, zzee.b(), new Object[]{this}, zzee.b(), (-690178544) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.amount_after_discount).substring(14, 15).length(), zzee.b(), 792786334);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = d + 17;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 70 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        b(-363318873, zzee.b(), new Object[]{this}, zzee.b(), zzee.b(), (-1247643398) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), 363318873);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        b(857796876, zzee.b(), new Object[]{this}, zzee.b(), getSessionConfigTemplateType.b(), zzee.b(), -857796875);
    }

    static void d() {
        asInterface = new int[]{214142477, 2104931583, 817338587, 1461727266, 1483382205, 777120700, -1335862116, 1447739492, -1181837078, -1633699640, -1881973169, -135992348, 2080090387, 812794128, 659902214, 370951208, -1256900488, -1836332634};
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        GetOtpMethodActivity getOtpMethodActivity = (GetOtpMethodActivity) objArr[0];
        int i = 2 % 2;
        int i2 = d + 85;
        g = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r7, byte r8, int r9) {
        /*
            int r7 = r7 * 56
            int r7 = 122 - r7
            int r9 = r9 + 4
            byte[] r0 = com.bpjstku.presentation.membership.forgotaccount.inputnik.GetOtpMethodActivity.$$c
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r6
        L2a:
            int r3 = -r3
            int r9 = r9 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.forgotaccount.inputnik.GetOtpMethodActivity.$$i(byte, byte, int):java.lang.String");
    }
}
