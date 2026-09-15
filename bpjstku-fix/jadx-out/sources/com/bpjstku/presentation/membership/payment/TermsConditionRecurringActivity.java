package com.bpjstku.presentation.membership.payment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
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
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import androidx.work.WorkInfo;
import com.bpjstku.R;
import com.bpjstku.data.payment.model.request.CreatePaymentMethodGeneralRequest;
import com.bpjstku.data.payment.model.request.CreatePaymentMethodRequest;
import com.bpjstku.data.payment.model.response.ActionLinkingStatus;
import com.bpjstku.data.payment.model.response.CustomerObjectItem;
import com.bpjstku.data.payment.model.response.PaymentMethodItem;
import com.bpjstku.data.payment.model.response.PaymentMethodResult;
import com.bpjstku.databinding.ActivityTermsConditionRecurringBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.membership.payment.TermsConditionRecurringActivity;
import com.bpjstku.presentation.membership.payment.model.UrlAuthentication;
import com.bpjstku.presentation.tuition.model.CustomerObject;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.material.button.MaterialButton;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.CameraManagerCompatAvailabilityCallbackExecutorWrapper;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ListPopupWindow2;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0017\u0010\n\u001a\u0004\u0018\u00010\u00158BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u001b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0015\u0010\u001f\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u0015\u0010\f\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0016\u0010\u001e\u001a\u00020\b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0016\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001a\u0010!R\u0016\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0016\u0010\"\u001a\u00020\b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001f\u0010!"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/TermsConditionRecurringActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityTermsConditionRecurringBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "", "p0", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;)V", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lkotlin/Lazy;", "Lcom/bpjstku/domain/user/model/User;", "g", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "()I", "Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "d", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LListPopupWindow2;", "Ljava/lang/String;", "INotificationSideChannel"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TermsConditionRecurringActivity extends BindingBaseActivity<ActivityTermsConditionRecurringBinding> {
    private static int INotificationSideChannel;
    private static int INotificationSideChannelDefault;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static byte[] cancel;
    private static int cancelAll;
    private static int notify;
    private static short[] onTransact;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy a;
    private static final byte[] $$c = {39, 27, 2, 54};
    private static final int $$f = 187;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {67, -127, -109, 9, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 193;
    private static int getInterfaceDescriptor = 1;
    private static int INotificationSideChannelStub = 0;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: launchIntent
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TermsConditionRecurringActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: rewriteQueryFromSuggestion
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TermsConditionRecurringActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public String g = "";

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public String d = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public String asInterface = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public String asBinder = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public String INotificationSideChannel = "";

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -554459318
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int r6, int r7, int r8, java.lang.Object[] r9, int r10, int r11, int r12) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.TermsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(int, int, int, java.lang.Object[], int, int, int):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 4
            int r0 = 53 - r5
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r1 = com.bpjstku.presentation.membership.payment.TermsConditionRecurringActivity.$$a
            byte[] r0 = new byte[r0]
            int r5 = 52 - r5
            r2 = -1
            if (r1 != 0) goto L14
            r3 = r2
            r2 = r6
            goto L2f
        L14:
            r4 = r7
            r7 = r6
            r6 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r0[r2] = r3
            int r7 = r7 + 1
            if (r2 != r5) goto L29
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L29:
            r3 = r1[r7]
            r4 = r2
            r2 = r7
            r7 = r3
            r3 = r4
        L2f:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            r7 = r2
            r2 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.TermsConditionRecurringActivity.c(byte, short, byte, java.lang.Object[]):void");
    }

    public TermsConditionRecurringActivity() {
        final TermsConditionRecurringActivity termsConditionRecurringActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.membership.payment.TermsConditionRecurringActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = termsConditionRecurringActivity;
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
        this.a = LazyKt.lazy(new Function0<ListPopupWindow2>() { // from class: com.bpjstku.presentation.membership.payment.TermsConditionRecurringActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ListPopupWindow2, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ListPopupWindow2 invoke() {
                LifecycleOwner lifecycleOwner = termsConditionRecurringActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListPopupWindow2.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.payment.TermsConditionRecurringActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/TermsConditionRecurringActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;Lcom/bpjstku/presentation/tuition/model/CustomerObject;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0, CustomerObject p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) TermsConditionRecurringActivity.class);
            intent.putExtra("customer_object_recurring", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityTermsConditionRecurringBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 != 0) {
            TermsConditionRecurringActivity$bindingInflater$1 termsConditionRecurringActivity$bindingInflater$1 = TermsConditionRecurringActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TermsConditionRecurringActivity$bindingInflater$1 termsConditionRecurringActivity$bindingInflater$2 = TermsConditionRecurringActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = RemoteActionCompatParcelizer + 29;
        INotificationSideChannelStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 12 / 0;
        }
        return termsConditionRecurringActivity$bindingInflater$2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivityTermsConditionRecurringBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnBack;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: isLandscapeMode
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TermsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (View) obj);
            }
        }));
        MaterialButton materialButton2 = ((ActivityTermsConditionRecurringBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnConfirm;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: isSubmitAreaEnabled
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TermsConditionRecurringActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        int i2 = INotificationSideChannelStub + 95;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 62 / 0;
        }
    }

    private void TuitionPaymentFragmentbindingInflater1(String p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        ((ListPopupWindow2) this.a.getValue()).b(new CreatePaymentMethodRequest(String.valueOf(((CustomerObject) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).cancelAll), p0));
        int i2 = RemoteActionCompatParcelizer + 15;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        TermsConditionRecurringActivity termsConditionRecurringActivity = this;
        ((ListPopupWindow2) this.a.getValue()).d.observe(termsConditionRecurringActivity, new Observer() { // from class: updateSearchAutoComplete
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) throws IllegalAccessException {
                TermsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        ((ListPopupWindow2) this.a.getValue()).TuitionPaymentFragmentbindingInflater1.observe(termsConditionRecurringActivity, new Observer() { // from class: updateQueryHint
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                TermsConditionRecurringActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        ((ListPopupWindow2) this.a.getValue()).asBinder.observe(termsConditionRecurringActivity, new Observer() { // from class: setQuery
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                TermsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = RemoteActionCompatParcelizer + 1;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 84 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0080  */
    private static void e(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(cancelAll)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            int i6 = -1;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b2 = (byte) (-1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 2268 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 33 - View.getDefaultSize(0, 0), 1387473586, false, $$i(b2, (byte) (b2 + 1), (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 41;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = cancel;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b3 = (byte) i6;
                                byte b4 = (byte) (b3 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - MotionEvent.axisFromString("")), 3359 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), MotionEvent.axisFromString("") + 19, -1054011043, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i8++;
                            i6 = -1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i9 = $11 + 39;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    byte[] bArr3 = cancel;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(notify)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) (-1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.blue(0), 2267 - Gravity.getAbsoluteGravity(0, 0), 33 - (Process.myPid() >> 22), 1387473586, false, $$i(b5, (byte) (b5 + 1), (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) cancelAll) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) onTransact[i3 + ((int) (((long) notify) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) cancelAll) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i11 = ((i3 + iIntValue) - 2) + ((int) (((long) notify) ^ 3046761265686732006L));
                if (z) {
                    int i12 = $11 + 15;
                    int i13 = i12 % 128;
                    $10 = i13;
                    int i14 = i12 % 2;
                    int i15 = i13 + 49;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i11 + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(INotificationSideChannel), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55905 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2855, 13 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1529949196, false, $$i(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = cancel;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i17 = 0; i17 < length2; i17++) {
                        int i18 = $10 + 51;
                        $11 = i18 % 128;
                        int i19 = i18 % 2;
                        bArr5[i17] = (byte) (((long) bArr4[i17]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i20 = $10 + 71;
                    $11 = i20 % 128;
                    if (i20 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (z2) {
                        byte[] bArr6 = cancel;
                        int i21 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i21 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i21]) ^ 3046761265686732006L)) + s)) ^ b));
                    } else {
                        short[] sArr = onTransact;
                        int i22 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i22 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i22]) ^ 3046761265686732006L)) + s)) ^ b));
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

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        INotificationSideChannelStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            obj.hashCode();
            throw null;
        }
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        String str = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        if (str != null) {
            int i3 = RemoteActionCompatParcelizer + 105;
            INotificationSideChannelStub = i3 % 128;
            if (i3 % 2 != 0) {
                str.length();
                throw null;
            }
            if (str.length() != 0) {
                return;
            }
        }
        LoginActivity.Companion companion = LoginActivity.INSTANCE;
        LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, null, false, 6);
        d_();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 81;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityTermsConditionRecurringBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityTermsConditionRecurringBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_term_and_condition));
        int i4 = INotificationSideChannelStub + 21;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 87;
        INotificationSideChannelStub = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i3 = INotificationSideChannelStub + 17;
                RemoteActionCompatParcelizer = i3 % 128;
                if (i3 % 2 == 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    int i4 = 50 / 0;
                } else {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i5 = RemoteActionCompatParcelizer + 93;
            INotificationSideChannelStub = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 39 / 0;
            }
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrB$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarFadeDuration = (char) (29944 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
            int i3 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1756;
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 23;
            byte[] bArr = $$a;
            short s = bArr[28];
            byte b = bArr[5];
            Object[] objArr2 = new Object[1];
            c((byte) 15, s, b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, i3, iIndexOf, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 29944);
                int size = View.MeasureSpec.getSize(0) + 1755;
                int iIndexOf2 = 22 - TextUtils.indexOf((CharSequence) "", '0', 0);
                byte[] bArr2 = $$a;
                byte b2 = bArr2[7];
                Object[] objArr3 = new Object[1];
                c(b2, (short) (b2 | 36), bArr2[5], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetBefore, size, iIndexOf2, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i4 = ((int[]) objArr4[0])[0];
            objArrB$7879113 = new Object[]{new int[]{i4}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ((((-1631525586) + ((~(514801370 | iIdentityHashCode)) * 623)) + (((~iIdentityHashCode) | 33759232) * (-623))) + (((~(iIdentityHashCode | 380581514)) | ((~(167979088 | iIdentityHashCode)) | (-514801371))) * 623)) - 792683636;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_alfamart).substring(19, 20).codePointAt(0) - 1092776171, (-6) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.minute).substring(0, 1).codePointAt(0) - 109), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_dialog_screen_title_text).substring(12, 13).length() - 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 887068270, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1092776086, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 42, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellCategoryTitle).substring(0, 8).codePointAt(3) - 69), (byte) Color.argb(0, 0, 0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 887068280, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-591454257};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 42049), 1726 - View.resolveSize(0, 0), 29 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -792683636, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char offsetAfter = (char) (29944 - TextUtils.getOffsetAfter("", 0));
                    int iArgb = Color.argb(0, 0, 0, 0) + 1755;
                    int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0');
                    byte[] bArr3 = $$a;
                    byte b3 = bArr3[7];
                    Object[] objArr8 = new Object[1];
                    c(b3, (short) (b3 | 36), bArr3[5], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetAfter, iArgb, iLastIndexOf, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.fuel_price).substring(0, 8).length() - 1092776091, MotionEvent.axisFromString("") + 1, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_klikbca2).substring(15, 16).codePointAt(0) - 32), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step3).substring(14, 15).length() - 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_consent_screen_cta_text_continue_next_step).substring(2, 3).length() - 887068230, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e((-1092776080) - ((byte) KeyEvent.getModifierMetaStateMask()), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_hint_xl_order_id).substring(14, 15).codePointAt(0) - 39, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 109), (byte) ((Process.getThreadPriority(0) + 20) >> 6), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 887068323, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char touchSlop = (char) (29944 - (ViewConfiguration.getTouchSlop() >> 8));
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1755;
                        int iRgb = Color.rgb(0, 0, 0) + 16777239;
                        byte[] bArr4 = $$a;
                        byte b4 = bArr4[7];
                        Object[] objArr11 = new Object[1];
                        c(b4, (short) (b4 | 88), bArr4[5], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop, keyRepeatDelay, iRgb, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char size2 = (char) (View.MeasureSpec.getSize(0) + 29944);
                        int iAxisFromString = 1754 - MotionEvent.axisFromString("");
                        int iCombineMeasuredStates = 23 - View.combineMeasuredStates(0, 0);
                        byte[] bArr5 = $$a;
                        Object[] objArr12 = new Object[1];
                        c((byte) 15, bArr5[28], bArr5[5], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(size2, iAxisFromString, iCombineMeasuredStates, 986134021, false, (String) objArr12[0], null);
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
        int i8 = ((int[]) objArrB$7879113[1])[0];
        int i9 = ((int[]) objArrB$7879113[0])[0];
        if (i9 != i8) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$7879113[4];
            if (strArr != null) {
                int i10 = RemoteActionCompatParcelizer + 7;
                INotificationSideChannelStub = i10 % 128;
                int i11 = i10 % 2;
                while (i2 < strArr.length) {
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i9));
        }
        int i12 = ((int[]) objArrB$7879113[3])[0];
        int i13 = ((int[]) objArrB$7879113[0])[0];
        Object[] objArr13 = {new int[]{i13}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int i14 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1298218569);
        int i15 = i12 + (-1059252652) + (((~(303001399 | i14)) | (-515603826)) * (-983)) + (((~(i14 | (-515603826))) | 302738737) * 983);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr13[3])[0] = i17 ^ (i17 << 5);
        int i18 = INotificationSideChannelStub + 91;
        RemoteActionCompatParcelizer = i18 % 128;
        int i19 = i18 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char size3 = (char) View.MeasureSpec.getSize(0);
            int iRed = Color.red(0) + 1031;
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 16;
            byte[] bArr6 = $$a;
            byte b5 = bArr6[7];
            Object[] objArr14 = new Object[1];
            c(b5, (short) (b5 | 140), bArr6[5], objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(size3, iRed, bitsPerPixel, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e((ViewConfiguration.getLongPressTimeout() >> 16) - 1092776083, View.MeasureSpec.getMode(0), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 98), (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 887068265, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e((ViewConfiguration.getTapTimeout() >> 16) - 1092776079, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_gopay).substring(1, 3).codePointAt(1) + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_blink_smile_and_your_eyes).substring(0, 25).codePointAt(21) - 109), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step5).substring(1, 7).length() - 887068214, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
            int deadChar = KeyEvent.getDeadChar(0, 0) + 1031;
            int minimumFlingVelocity = 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            byte[] bArr7 = $$a;
            byte b6 = bArr7[7];
            Object[] objArr17 = new Object[1];
            c(b6, (short) (b6 | 36), bArr7[5], objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf, deadChar, minimumFlingVelocity, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i20 = INotificationSideChannelStub + 79;
            RemoteActionCompatParcelizer = i20 % 128;
            int i21 = i20 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cIndexOf2 = (char) TextUtils.indexOf("", "");
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1031;
                int jumpTapTimeout2 = 15 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                Object[] objArr18 = new Object[1];
                c((byte) 52, (short) ($$b - 1), $$a[7], objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf2, jumpTapTimeout, jumpTapTimeout2, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i22 = ((int[]) objArr19[3])[0];
            int i23 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i24 = ~elapsedCpuTime;
            int i25 = (~((-598272025) | i24)) | 17328136;
            int i26 = ~(elapsedCpuTime | 934935742);
            int i27 = (((603593128 + ((i25 | i26) * (-713))) + (i26 * 1426)) + ((~(353991854 | i24)) * 713)) - 546190055;
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr[2])[0] = i29 ^ (i29 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 1092776191, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 7, (short) Color.blue(0), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 116), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_app_instruction_2).substring(5, 6).codePointAt(0) - 887068291, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.place_photo_viewer_next_image_button_content_description).substring(0, 15).length() - 1092776090, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 42, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_shopeepay_qris).substring(0, 10).length() - 887068254, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {-591454257};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 1134 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -546190055, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char c = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int minimumFlingVelocity2 = 1031 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iMakeMeasureSpec = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte[] bArr8 = $$a;
                byte b7 = bArr8[7];
                Object[] objArr24 = new Object[1];
                c(b7, (short) (b7 | 140), bArr8[5], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c, minimumFlingVelocity2, iMakeMeasureSpec, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 45993), (ViewConfiguration.getPressedStateDuration() >> 16) + 1117, ExpandableListView.getPackedPositionGroup(0L) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 1032;
                int iRgb2 = (-16777201) - Color.rgb(0, 0, 0);
                Object[] objArr25 = new Object[1];
                c((byte) 52, (short) ($$b - 1), $$a[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c2, iLastIndexOf2, iRgb2, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_atm_instruction_7).substring(0, 1).length() - 1092776084, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_bni_internet).substring(0, 16).codePointAt(10) - 97, (short) KeyEvent.keyCodeFromString(""), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 887068265, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1092776079, (ViewConfiguration.getScrollDefaultDelay() >> 16) - 7, (short) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.place_photo_viewer_previous_image_button_content_description).substring(0, 19).codePointAt(15) - 109), (-887068208) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char touchSlop2 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                    int iResolveSize = View.resolveSize(0, 0) + 1031;
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 15;
                    byte[] bArr9 = $$a;
                    byte b8 = bArr9[7];
                    Object[] objArr28 = new Object[1];
                    c(b8, (short) (b8 | 36), bArr9[5], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(touchSlop2, iResolveSize, longPressTimeout, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cArgb = (char) Color.argb(0, 0, 0, 0);
                    int packedPositionType = 1031 - ExpandableListView.getPackedPositionType(0L);
                    int i30 = 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    byte[] bArr10 = $$a;
                    byte b9 = bArr10[7];
                    Object[] objArr29 = new Object[1];
                    c(b9, (short) (b9 | 140), bArr10[5], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cArgb, packedPositionType, i30, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
            Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i31 = ((int[]) objArr[2])[0];
            int i32 = ((int[]) objArr[3])[0];
            int i33 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i34 = ~((int) Runtime.getRuntime().maxMemory());
            int i35 = i31 + (((1006131096 + (((~((-674955735) | i34)) | 430675564) * (-933))) + (((~(i34 | 430675564)) | (-968595455)) * 933)) - 912048184);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr30[2])[0] = i37 ^ (i37 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 == null) {
            throw null;
        }
        int i38 = RemoteActionCompatParcelizer + 57;
        INotificationSideChannelStub = i38 % 128;
        int i39 = i38 % 2;
        while (i2 < strArr4.length) {
            arrayList2.add(strArr4[i2]);
            i2++;
        }
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[1]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
            int i5 = 400932156 + ((i4 | 152438022) * 988);
            int i6 = ~i4;
            if (i3 != i5 + (((~(463383831 | i6)) | (-1604317184)) * (-1976)) + (((~(i4 | 1293371374)) | 152438022 | (~((-1293371375) | i6))) * 988)) {
                throw null;
            }
        } else {
            int i7 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            if (i7 != 1855767312 + (((~(1464671261 | iIdentityHashCode)) | 1376328729) * (-502)) + ((~((~iIdentityHashCode) | 2011012447)) * (-502)) + (((~(iIdentityHashCode | (-634683719))) | 1464671261) * TypedValues.PositionType.TYPE_DRAWPATH)) {
                throw null;
            }
        }
        int i8 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
        if (i8 != (-1762620824) + ((~((-1763885220) | i9)) * (-301)) + (((~(2099435763 | i9)) | (~((~i9) | 383524432))) * (-301)) + (((~(i9 | (-383524433))) | 2099435763) * 301)) {
            int i10 = RemoteActionCompatParcelizer + 5;
            INotificationSideChannelStub = i10 % 128;
            int i11 = i10 % 2;
            int[] iArr = new int[160776911];
            iArr[160776910] = 1;
            int i12 = 1523589266 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i13 = INotificationSideChannelStub + 37;
            RemoteActionCompatParcelizer = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 2 % 3;
            }
        }
        super.onCreate(bundle);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:13:0x004e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    private static /* synthetic */ Object b(Object[] objArr) {
        String str;
        TermsConditionRecurringActivity termsConditionRecurringActivity = (TermsConditionRecurringActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 11;
        INotificationSideChannelStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 33 / 0;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                termsConditionRecurringActivity.MediaBrowserCompat();
                str = "loading_create_mandiri_dd";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i5 = i2 + 71;
                INotificationSideChannelStub = i5 % 128;
                int i6 = i5 % 2;
                termsConditionRecurringActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(termsConditionRecurringActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                str = "failure_create_mandiri_dd";
            } else {
                if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                    termsConditionRecurringActivity.IconCompatParcelizer();
                    CustomerObject customerObject = (CustomerObject) termsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                    String string = ((PaymentMethodResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getPmId().toString();
                    List<ActionLinkingStatus> actionsPmLinking = ((PaymentMethodResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getActionsPmLinking();
                    Intrinsics.checkNotNull(actionsPmLinking);
                    CustomerObject customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CustomerObject.TuitionPaymentFragmentspecialinlinedviewModeldefault2(customerObject, null, null, null, null, null, null, null, null, string, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, actionsPmLinking.get(0).getUrl().toString(), ((PaymentMethodResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDirectDebitInfo().getDirectDebitChannelProperties().getSuccessReturnUrl(), ((PaymentMethodResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDirectDebitInfo().getDirectDebitChannelProperties().getFailureReturnUrl(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -234881281, 2047);
                    PaymentAuthenticationActivity.Companion bVar = PaymentAuthenticationActivity.INSTANCE;
                    List<ActionLinkingStatus> actionsPmLinking2 = ((PaymentMethodResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getActionsPmLinking();
                    Intrinsics.checkNotNull(actionsPmLinking2);
                    PaymentAuthenticationActivity.Companion.TuitionPaymentFragmentbindingInflater1(termsConditionRecurringActivity, new UrlAuthentication(actionsPmLinking2.get(0).getUrl().toString(), ((PaymentMethodResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDirectDebitInfo().getDirectDebitChannelProperties().getSuccessReturnUrl(), ((PaymentMethodResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDirectDebitInfo().getDirectDebitChannelProperties().getFailureReturnUrl()), customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    termsConditionRecurringActivity.finish();
                }
                str = "";
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            termsConditionRecurringActivity.MediaBrowserCompat();
            str = "loading_create_mandiri_dd";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i7 = i2 + 71;
            INotificationSideChannelStub = i7 % 128;
            int i8 = i7 % 2;
            termsConditionRecurringActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(termsConditionRecurringActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            str = "failure_create_mandiri_dd";
        } else {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                termsConditionRecurringActivity.IconCompatParcelizer();
                CustomerObject customerObject2 = (CustomerObject) termsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                VirtualCameraAdapter1.asBinder asbinder2 = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                String string2 = ((PaymentMethodResult) asbinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getPmId().toString();
                List<ActionLinkingStatus> actionsPmLinking3 = ((PaymentMethodResult) asbinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getActionsPmLinking();
                Intrinsics.checkNotNull(actionsPmLinking3);
                CustomerObject customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault3 = CustomerObject.TuitionPaymentFragmentspecialinlinedviewModeldefault2(customerObject2, null, null, null, null, null, null, null, null, string2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, actionsPmLinking3.get(0).getUrl().toString(), ((PaymentMethodResult) asbinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDirectDebitInfo().getDirectDebitChannelProperties().getSuccessReturnUrl(), ((PaymentMethodResult) asbinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDirectDebitInfo().getDirectDebitChannelProperties().getFailureReturnUrl(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -234881281, 2047);
                PaymentAuthenticationActivity.Companion bVar2 = PaymentAuthenticationActivity.INSTANCE;
                List<ActionLinkingStatus> actionsPmLinking4 = ((PaymentMethodResult) asbinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getActionsPmLinking();
                Intrinsics.checkNotNull(actionsPmLinking4);
                PaymentAuthenticationActivity.Companion.TuitionPaymentFragmentbindingInflater1(termsConditionRecurringActivity, new UrlAuthentication(actionsPmLinking4.get(0).getUrl().toString(), ((PaymentMethodResult) asbinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDirectDebitInfo().getDirectDebitChannelProperties().getSuccessReturnUrl(), ((PaymentMethodResult) asbinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDirectDebitInfo().getDirectDebitChannelProperties().getFailureReturnUrl()), customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                termsConditionRecurringActivity.finish();
            }
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_tuition_payment", str));
        Intrinsics.checkNotNullParameter(termsConditionRecurringActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        int i9 = RemoteActionCompatParcelizer + 65;
        INotificationSideChannelStub = i9 % 128;
        int i10 = i9 % 2;
        return null;
    }

    public static /* synthetic */ CustomerObject TuitionPaymentFragmentbindingInflater1(TermsConditionRecurringActivity termsConditionRecurringActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 57;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Parcelable parcelableExtra = termsConditionRecurringActivity.getIntent().getParcelableExtra("customer_object_recurring");
        Intrinsics.checkNotNull(parcelableExtra);
        CustomerObject customerObject = (CustomerObject) parcelableExtra;
        int i4 = INotificationSideChannelStub + 107;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return customerObject;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(TermsConditionRecurringActivity termsConditionRecurringActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 53;
        int i3 = i2 % 128;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            int i5 = i3 + 15;
            INotificationSideChannelStub = i5 % 128;
            int i6 = i5 % 2;
            termsConditionRecurringActivity.MediaBrowserCompat();
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                termsConditionRecurringActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(termsConditionRecurringActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
            int i7 = RemoteActionCompatParcelizer + 39;
            INotificationSideChannelStub = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        termsConditionRecurringActivity.IconCompatParcelizer();
        String strValueOf = String.valueOf(((CustomerObjectItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCustomerId());
        termsConditionRecurringActivity.g = strValueOf;
        termsConditionRecurringActivity.TuitionPaymentFragmentbindingInflater1(strValueOf);
        int i9 = RemoteActionCompatParcelizer + 27;
        INotificationSideChannelStub = i9 % 128;
        int i10 = i9 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(TermsConditionRecurringActivity termsConditionRecurringActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        String str = ((CustomerObject) termsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).cancelAll;
        Object obj = null;
        if (str != null) {
            switch (str.hashCode()) {
                case 65917:
                    if (str.equals("BNI")) {
                        int i2 = RemoteActionCompatParcelizer + 99;
                        INotificationSideChannelStub = i2 % 128;
                        if (i2 % 2 != 0) {
                            RegisterBniAutodebetActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = RegisterBniAutodebetActivity.INSTANCE;
                            RegisterBniAutodebetActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(termsConditionRecurringActivity, (CustomerObject) termsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                            obj.hashCode();
                            throw null;
                        }
                        RegisterBniAutodebetActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = RegisterBniAutodebetActivity.INSTANCE;
                        RegisterBniAutodebetActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(termsConditionRecurringActivity, (CustomerObject) termsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                    }
                    break;
                case 66041:
                    if (str.equals("BRI")) {
                        int i3 = INotificationSideChannelStub + 31;
                        RemoteActionCompatParcelizer = i3 % 128;
                        if (i3 % 2 == 0) {
                            Intrinsics.areEqual(((CustomerObject) termsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getExtras, Boolean.TRUE);
                            throw null;
                        }
                        if (!Intrinsics.areEqual(((CustomerObject) termsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getExtras, Boolean.TRUE)) {
                            CustomerInformationDirectDebitActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = CustomerInformationDirectDebitActivity.INSTANCE;
                            CustomerInformationDirectDebitActivity.Companion.b(termsConditionRecurringActivity, (CustomerObject) termsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                            termsConditionRecurringActivity.finish();
                        }
                    }
                    break;
                case 78664:
                    if (str.equals("OVO") && !Intrinsics.areEqual(((CustomerObject) termsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).isConnected, Boolean.TRUE)) {
                        RegisterAutoDebetEwalletActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault4 = RegisterAutoDebetEwalletActivity.INSTANCE;
                        RegisterAutoDebetEwalletActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(termsConditionRecurringActivity, (CustomerObject) termsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                        termsConditionRecurringActivity.finish();
                    }
                    break;
                case 2090736:
                    if (str.equals("DANA") && !Intrinsics.areEqual(((CustomerObject) termsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).subscribe, Boolean.TRUE)) {
                        termsConditionRecurringActivity.TuitionPaymentFragmentbindingInflater1(String.valueOf(((CustomerObject) termsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).INotificationSideChannel));
                    }
                    break;
                case 687963826:
                    if (!(!str.equals("SHOPEEPAY")) && !Intrinsics.areEqual(((CustomerObject) termsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).setCallbacksMessenger, Boolean.TRUE)) {
                        termsConditionRecurringActivity.TuitionPaymentFragmentbindingInflater1(String.valueOf(((CustomerObject) termsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).INotificationSideChannel));
                    }
                    break;
                case 895064830:
                    if (str.equals("LINKAJA") && !Intrinsics.areEqual(((CustomerObject) termsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).handleMessage, Boolean.TRUE)) {
                        int i4 = INotificationSideChannelStub + 41;
                        RemoteActionCompatParcelizer = i4 % 128;
                        int i5 = i4 % 2;
                        termsConditionRecurringActivity.TuitionPaymentFragmentbindingInflater1(String.valueOf(((CustomerObject) termsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).INotificationSideChannel));
                    }
                    break;
                case 1553334710:
                    if (str.equals("MANDIRI") && !Intrinsics.areEqual(((CustomerObject) termsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).sendCustomAction, Boolean.TRUE)) {
                        ListPopupWindow2 listPopupWindow2 = (ListPopupWindow2) termsConditionRecurringActivity.a.getValue();
                        String str2 = ((CustomerObject) termsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).cancelAll;
                        Intrinsics.checkNotNull(str2);
                        listPopupWindow2.b(new CreatePaymentMethodGeneralRequest(str2, String.valueOf(((CustomerObject) termsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).INotificationSideChannel)));
                    }
                    break;
                default:
                    int i6 = RemoteActionCompatParcelizer + 111;
                    INotificationSideChannelStub = i6 % 128;
                    int i7 = i6 % 2;
                    break;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i8 = INotificationSideChannelStub + 31;
        RemoteActionCompatParcelizer = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(TermsConditionRecurringActivity termsConditionRecurringActivity, View view) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        termsConditionRecurringActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = RemoteActionCompatParcelizer + 121;
        INotificationSideChannelStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ User b(TermsConditionRecurringActivity termsConditionRecurringActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 65;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object value = termsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        if (i3 == 0) {
            ((ActivityResultContractsPickVisualMediaMediaCapabilities) value).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            throw null;
        }
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) value).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i4 = RemoteActionCompatParcelizer + 45;
        INotificationSideChannelStub = i4 % 128;
        int i5 = i4 % 2;
        return userAsBinder;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TermsConditionRecurringActivity termsConditionRecurringActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        Object obj = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = RemoteActionCompatParcelizer + 41;
            INotificationSideChannelStub = i2 % 128;
            if (i2 % 2 == 0) {
                termsConditionRecurringActivity.MediaBrowserCompat();
                return;
            } else {
                termsConditionRecurringActivity.MediaBrowserCompat();
                throw null;
            }
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                termsConditionRecurringActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(termsConditionRecurringActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                return;
            }
            return;
        }
        termsConditionRecurringActivity.IconCompatParcelizer();
        VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
        CustomerObject customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CustomerObject.TuitionPaymentFragmentspecialinlinedviewModeldefault2((CustomerObject) termsConditionRecurringActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue(), null, null, null, null, termsConditionRecurringActivity.asInterface, ((PaymentMethodItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getReferenceId(), null, null, String.valueOf(((PaymentMethodItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getPaymentMethodId()), null, String.valueOf(((PaymentMethodItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCustomerId()), null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1329, 2047);
        if (Intrinsics.areEqual(((PaymentMethodItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getStatus(), "REQUIRES_ACTION")) {
            PaymentAuthenticationActivity.Companion bVar = PaymentAuthenticationActivity.INSTANCE;
            List<ActionLinkingStatus> actionLinkingStatus = ((PaymentMethodItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getActionLinkingStatus();
            Intrinsics.checkNotNull(actionLinkingStatus);
            PaymentAuthenticationActivity.Companion.TuitionPaymentFragmentbindingInflater1(termsConditionRecurringActivity, new UrlAuthentication(actionLinkingStatus.get(0).getUrl(), ((PaymentMethodItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getEwallet().getEwalletChannelProperties().getSuccessReturnUrl(), ((PaymentMethodItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getEwallet().getEwalletChannelProperties().getFailureReturnUrl()), customerObjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            termsConditionRecurringActivity.d_();
            int i3 = INotificationSideChannelStub + 77;
            RemoteActionCompatParcelizer = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(TermsConditionRecurringActivity termsConditionRecurringActivity, VirtualCameraAdapter1 virtualCameraAdapter1) throws IllegalAccessException {
        int iTuitionPaymentFragmentbindingInflater1 = SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(), SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(), SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(), new Object[]{termsConditionRecurringActivity, virtualCameraAdapter1}, -461082070, iTuitionPaymentFragmentbindingInflater1, 461082070);
    }

    static {
        INotificationSideChannelDefault = 0;
        d();
        INSTANCE = new Companion(null);
        int i = getInterfaceDescriptor + 45;
        INotificationSideChannelDefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentbindingInflater1 = SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault3(SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(), CameraManagerCompatAvailabilityCallbackExecutorWrapper.TuitionPaymentFragmentbindingInflater1(), SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, 790266247, iTuitionPaymentFragmentbindingInflater1, -790266246)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 121;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int iCodePointAt = 656411127 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(CameraManagerCompatAvailabilityCallbackExecutorWrapper.TuitionPaymentFragmentbindingInflater1(), (-1031501472) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, -250931876, iCodePointAt, 250931878);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int iTuitionPaymentFragmentbindingInflater1 = CameraManagerCompatAvailabilityCallbackExecutorWrapper.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(), SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(), SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, 418067830, iTuitionPaymentFragmentbindingInflater1, -418067827);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 99;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
    }

    static void d() {
        notify = -1200436603;
        cancelAll = -1934795536;
        INotificationSideChannel = -846255086;
        cancel = new byte[]{-18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29, -18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, -26, -26, -26, -26};
    }

    private static String $$i(short s, short s2, int i) {
        byte[] bArr = $$c;
        int i2 = 121 - i;
        int i3 = s + 4;
        int i4 = s2 * 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i2 = i3 + i2;
            i3 = i3;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i3 + 1;
            i5 = i6;
            i2 = bArr[i7] + i2;
            i3 = i7;
        }
    }
}
