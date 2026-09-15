package com.bpjstku.presentation.membership.accountactivation.salariedworker;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
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
import android.widget.ExpandableListView;
import android.widget.SeekBar;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivitySalariedWorkerActivationBinding;
import com.bpjstku.databinding.LayoutRegistrationProgressBinding;
import com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyEmailOtpActivity;
import com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerActivationActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.auth.zzgx;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.AspectRatioUtil;
import defpackage.ViewPortBuilder;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateCameraUseCases;
import defpackage.createExtraPreview;
import defpackage.getActiveConcurrentCameraInfos;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getSelectedTab;
import defpackage.getUntrustedCreatorPackageName;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.mapPoint;
import defpackage.orNull;
import defpackage.registerAvailabilityCallback;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0004J)\u0010\u0014\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u0004R\u0015\u0010\u0006\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\b\u001a\u00020\u00108\u0002X\u0083D¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010'R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00020(8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b!\u0010*R\u0016\u0010\u000f\u001a\u00020+8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b%\u0010,R\u001a\u0010\"\u001a\u00020\u00108\u0015X\u0095D¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b%\u0010-"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/salariedworker/SalariedWorkerActivationActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivitySalariedWorkerActivationBinding;", "<init>", "()V", "", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Landroid/os/Bundle;", "p0", "onCreate", "(Landroid/os/Bundle;)V", "onSaveInstanceState", "asInterface", "a", "", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onBackPressed", "onDestroy", "g", "LgetUntrustedCreatorPackageName;", "Lkotlin/Lazy;", "Landroidx/fragment/app/FragmentManager;", "Landroidx/fragment/app/FragmentManager;", "TuitionPaymentFragmentbindingInflater1", "d", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "Lcom/bpjstku/databinding/LayoutRegistrationProgressBinding;", "Lcom/bpjstku/databinding/LayoutRegistrationProgressBinding;", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SalariedWorkerActivationActivity extends BindingBaseActivity<ActivitySalariedWorkerActivationBinding> {
    private static int INotificationSideChannel;
    private static char[] asInterface;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final int d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final FragmentManager TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private LayoutRegistrationProgressBinding a;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private RegisteredMemberRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {39, 27, 2, 54};
    private static final int $$f = 28;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {117, 50, 102, 124, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 149;
    private static int cancelAll = 0;
    private static int cancel = 0;
    private static int onTransact = 1;

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

        public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1() {
            AspectRatioUtil.TuitionPaymentFragmentbindingInflater1[0] = orNull.b[0];
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1489826333
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static /* synthetic */ java.lang.Object b(int r6, int r7, java.lang.Object[] r8, int r9, int r10, int r11, int r12) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerActivationActivity.b(int, int, java.lang.Object[], int, int, int, int):java.lang.Object");
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
    private static void c(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = 197 - r6
            byte[] r0 = com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerActivationActivity.$$a
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerActivationActivity.c(int, short, byte, java.lang.Object[]):void");
    }

    public SalariedWorkerActivationActivity() {
        final SalariedWorkerActivationActivity salariedWorkerActivationActivity = this;
        this.b = LazyKt.lazy(new Function0<getUntrustedCreatorPackageName>() { // from class: com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerActivationActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getUntrustedCreatorPackageName] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getUntrustedCreatorPackageName invoke() {
                LifecycleOwner lifecycleOwner = salariedWorkerActivationActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(getUntrustedCreatorPackageName.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 5;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        this.d = R.layout.activity_salaried_worker_activation;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerActivationActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/salariedworker/SalariedWorkerActivationActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0, RegisteredMemberRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, SalariedWorkerActivationActivity.class, new Pair[]{TuplesKt.to("registration_data", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivitySalariedWorkerActivationBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        SalariedWorkerActivationActivity$bindingInflater$1 salariedWorkerActivationActivity$bindingInflater$1 = SalariedWorkerActivationActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
        return salariedWorkerActivationActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancel;
        int i3 = i2 + 1;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.d;
        int i6 = i2 + 119;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = cancel + 65;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (RegisteredMemberRegistration) getIntent().getParcelableExtra("registration_data");
            throw null;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (RegisteredMemberRegistration) getIntent().getParcelableExtra("registration_data");
        int i3 = onTransact + 71;
        cancel = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 26 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = cancel + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.a = LayoutRegistrationProgressBinding.bind(((ActivitySalariedWorkerActivationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).getRoot());
        SalariedWorkerActivationActivity salariedWorkerActivationActivity = this;
        Intrinsics.checkNotNullParameter(salariedWorkerActivationActivity, "");
        salariedWorkerActivationActivity.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivitySalariedWorkerActivationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = getString(R.string.action_account_activation);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        int i4 = onTransact + 29;
        cancel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i4 = $11 + 65;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(asInterface[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 2186 - ExpandableListView.getPackedPositionChild(0L), 40 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 841711447, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(g), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char packedPositionChild = (char) (33016 - ExpandableListView.getPackedPositionChild(0L));
                    int iBlue = 3011 - Color.blue(0);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 26;
                    byte b3 = $$c[2];
                    byte b4 = (byte) (b3 - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild, iBlue, threadPriority, 321985076, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char mirror = (char) (36553 - AndroidCharacter.getMirror('0'));
                    int i7 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3376;
                    int iRgb = (-16777199) - Color.rgb(0, 0, 0);
                    byte b5 = (byte) ($$c[2] - 1);
                    byte b6 = (byte) (-b5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, i7, iRgb, -968507904, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i8 = $10 + 101;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i10 = $10 + 17;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 36505);
                int iBlue2 = Color.blue(0) + 3376;
                int gidForName = 16 - Process.getGidForName("");
                byte b7 = (byte) ($$c[2] - 1);
                byte b8 = (byte) (-b7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iBlue2, gidForName, -968507904, false, $$i(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            int i12 = $10 + 15;
            $11 = i12 % 128;
            int i13 = i12 % 2;
        }
        objArr[0] = new String(cArr);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        LayoutRegistrationProgressBinding layoutRegistrationProgressBinding = this.a;
        if (layoutRegistrationProgressBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = onTransact + 105;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            layoutRegistrationProgressBinding = null;
        }
        SeekBar seekBar = layoutRegistrationProgressBinding.sbRegisterProgression;
        Intrinsics.checkNotNullExpressionValue(seekBar, "");
        Intrinsics.checkNotNullParameter(seekBar, "");
        seekBar.setOnTouchListener(new getActiveConcurrentCameraInfos());
        ((ActivitySalariedWorkerActivationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: AppCompatCheckBoxInspectionCompanion
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SalariedWorkerActivationActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
            }
        });
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle p0) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = cancel + 83;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i5 = ~iUptimeMillis;
        if (i4 != (-574864624) + (((~(iUptimeMillis | (-1711675993))) | (~((-277439874) | i5)) | 1107427416) * (-68)) + ((~((-604248577) | i5)) * (-68)) + (((~(1711675992 | i5)) | (-881688450)) * 68)) {
            throw new RuntimeException("510675355");
        }
        int i6 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
        if (i6 != 261929233 + (((~(i7 | 2036767987)) | 542287977) * 191) + (((~((~i7) | 2036767987)) | 1056776) * 191)) {
            throw new RuntimeException("1131545003");
        }
        super.onCreate(p0);
        if (p0 == null) {
            RegisteredMemberRegistration registeredMemberRegistration = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (registeredMemberRegistration != null) {
                ((getUntrustedCreatorPackageName) this.b.getValue()).b.setValue(registeredMemberRegistration);
                int i8 = onTransact + 57;
                cancel = i8 % 128;
                int i9 = i8 % 2;
                return;
            }
            return;
        }
        getUntrustedCreatorPackageName getuntrustedcreatorpackagename = (getUntrustedCreatorPackageName) this.b.getValue();
        getuntrustedcreatorpackagename.b.setValue((RegisteredMemberRegistration) p0.getParcelable("key_membership_data"));
        ((getUntrustedCreatorPackageName) this.b.getValue()).TuitionPaymentFragmentbindingInflater1.setValue(Integer.valueOf(p0.getInt("key_current_step")));
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle p0) {
        int iIntValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        super.onSaveInstanceState(p0);
        p0.putParcelable("key_membership_data", ((getUntrustedCreatorPackageName) this.b.getValue()).b.getValue());
        Integer value = ((getUntrustedCreatorPackageName) this.b.getValue()).TuitionPaymentFragmentbindingInflater1.getValue();
        if (value != null) {
            int i2 = cancel + 49;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            iIntValue = value.intValue();
            if (i3 == 0) {
                int i4 = 37 / 0;
            }
            int i5 = onTransact + 79;
            cancel = i5 % 128;
            int i6 = i5 % 2;
        } else {
            iIntValue = 1;
        }
        p0.putInt("key_current_step", iIntValue);
        int i7 = onTransact + 47;
        cancel = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        final SalariedWorkerActivationActivity salariedWorkerActivationActivity = (SalariedWorkerActivationActivity) objArr[0];
        int i = 2 % 2;
        ((getUntrustedCreatorPackageName) salariedWorkerActivationActivity.b.getValue()).TuitionPaymentFragmentbindingInflater1.observe(salariedWorkerActivationActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: AppCompatCheckedTextView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SalariedWorkerActivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Integer) obj);
            }
        }));
        int i2 = onTransact + 37;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int p0, int p1, Intent p2) {
        int i = 2 % 2;
        int i2 = cancel + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onActivityResult(p0, p1, p2);
        if (p1 == -1) {
            RegistrationActivationVerifyEmailOtpActivity.Companion companion = RegistrationActivationVerifyEmailOtpActivity.INSTANCE;
            if (p0 == RegistrationActivationVerifyEmailOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                int i4 = cancel + 51;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                ((getUntrustedCreatorPackageName) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                return;
            }
            if (p0 == 101) {
                ((getUntrustedCreatorPackageName) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i6 = onTransact + 99;
                cancel = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 3 / 3;
                }
            }
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                onBackPressed();
                int i4 = cancel + 115;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
            }
            return super.onOptionsItemSelected(p0);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = cancel + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        g();
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = cancel + 7;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            ((getUntrustedCreatorPackageName) this.b.getValue()).TuitionPaymentFragmentbindingInflater1.removeObservers(this);
            super.onDestroy();
        } else {
            ((getUntrustedCreatorPackageName) this.b.getValue()).TuitionPaymentFragmentbindingInflater1.removeObservers(this);
            super.onDestroy();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void g() {
        int i = 2 % 2;
        int i2 = onTransact + 99;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Integer value = ((getUntrustedCreatorPackageName) this.b.getValue()).TuitionPaymentFragmentbindingInflater1.getValue();
        if (value != null) {
            int i4 = onTransact + 35;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            if (value.intValue() == 1) {
                d_();
                return;
            }
        }
        ((getUntrustedCreatorPackageName) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i6 = cancel + 97;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = cancel + 107;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (29945 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            int i4 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1755;
            int iAxisFromString = MotionEvent.axisFromString("") + 24;
            Object[] objArr2 = new Object[1];
            c((short) 193, (byte) ($$b >>> 2), $$a[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i4, iAxisFromString, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) == -1) {
            Object[] objArr3 = new Object[1];
            e(ViewConfiguration.getPressedStateDuration() >> 16, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_copied_to_clipboard).substring(13, 14).codePointAt(0) - 96, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_gopay).substring(1, 3).length() + 24448), objArr4);
            int iIntValue = ((Integer) cls.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr5 = {-1836703272};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 42049), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1726, TextUtils.indexOf((CharSequence) "", '0', 0) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = zzgx.TuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), 1417182587);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 29944);
                    int offsetBefore = 1755 - TextUtils.getOffsetBefore("", 0);
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 23;
                    Object[] objArr6 = new Object[1];
                    c((short) 156, (byte) 52, $$a[7], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatDelay, offsetBefore, jumpTapTimeout, 1599039318, false, (String) objArr6[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da);
                try {
                    Object[] objArr7 = new Object[1];
                    e(32 - (ViewConfiguration.getLongPressTimeout() >> 16), (Process.myPid() >> 22) + 22, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 16950), objArr7);
                    Class<?> cls2 = Class.forName((String) objArr7[0]);
                    Object[] objArr8 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 18, 15 - (ViewConfiguration.getTouchSlop() >> 8), (char) ExpandableListView.getPackedPositionType(0L), objArr8);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr8[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 29945);
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1755;
                        int iRgb = (-16777193) - Color.rgb(0, 0, 0);
                        short s = (short) 104;
                        Object[] objArr9 = new Object[1];
                        c(s, (byte) (s >>> 1), $$a[7], objArr9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, windowTouchSlop, iRgb, 1596667560, false, (String) objArr9[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 29944);
                        int i5 = 1756 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int scrollBarFadeDuration = 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        Object[] objArr10 = new Object[1];
                        c((short) 193, (byte) ($$b >>> 2), $$a[7], objArr10);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cNormalizeMetaState, i5, scrollBarFadeDuration, 986134021, false, (String) objArr10[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
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
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 29945);
                int i6 = 1756 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int i7 = 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                Object[] objArr11 = new Object[1];
                c((short) 156, (byte) 52, $$a[7], objArr11);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, i6, i7, 1599039318, false, (String) objArr11[0], null);
            }
            Object[] objArr12 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = new Object[]{new int[]{((int[]) objArr12[0])[0]}, new int[]{((int[]) objArr12[1])[0]}, (Object[]) objArr12[2], new int[1], (String[]) objArr12[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step3).substring(97, 99).length() + 2100350541;
            int i8 = ~length;
            int i9 = (-1673615645) + (((~((-129586354) | i8)) | 69288097) * (-108)) + (((~(i8 | 342188779)) | (~((-342188780) | length)) | (-402487036)) * 54) + ((length | (-402487036)) * 54) + 1417182587;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0] = i11 ^ (i11 << 5);
        }
        int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0];
        int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0];
        if (i13 == i12) {
            int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
            int i15 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
            int i16 = i14 + (-541298277) + (((~(519016641 | i15)) | 342097920) * (-502)) + ((~((~i15) | 1073716987)) * (-502)) + (((~(i15 | (-731619068))) | 519016641) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr13[3])[0] = i18 ^ (i18 << 5);
            int i19 = onTransact + 51;
            cancel = i19 % 128;
            int i20 = i19 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i13];
            int i21 = i13 - 1;
            iArr[i21] = 1;
            Toast.makeText((Context) null, iArr[((i13 * i21) % 2) - 1], 1).show();
            int i22 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
            int length2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_1).substring(26, 27).length() + 1327686499;
            int i23 = ~length2;
            int i24 = i22 + (-1947582007) + ((~(886692771 | i23)) * (-560)) + ((~(length2 | 1023270891)) * (-560)) + (((~((-674090346) | i23)) | 537512225) * 560);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr14[3])[0] = i26 ^ (i26 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char defaultSize = (char) View.getDefaultSize(0, 0);
            int iCombineMeasuredStates = 1031 - View.combineMeasuredStates(0, 0);
            int defaultSize2 = 15 - View.getDefaultSize(0, 0);
            short s2 = (short) 52;
            Object[] objArr15 = new Object[1];
            c(s2, (byte) s2, $$a[7], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(defaultSize, iCombineMeasuredStates, defaultSize2, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto3_bni).substring(12, 18).codePointAt(5), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, (char) (KeyEvent.keyCodeFromString("") + 16961), objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_alfamart).substring(0, 8).length() + 46, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_gross_amount_not_equal).substring(5, 6).length() - 1), objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cMyTid = (char) (Process.myTid() >> 22);
            int iIndexOf = TextUtils.indexOf("", "") + 1031;
            int i27 = 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            Object[] objArr18 = new Object[1];
            c((short) 156, (byte) 52, $$a[7], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cMyTid, iIndexOf, i27, 1344079056, false, (String) objArr18[0], null);
        }
        if (j != ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object[] objArr19 = new Object[1];
            e(ViewConfiguration.getMinimumFlingVelocity() >> 16, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, (char) (ViewConfiguration.getTapTimeout() >> 16), objArr19);
            Class<?> cls4 = Class.forName((String) objArr19[0]);
            Object[] objArr20 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, ExpandableListView.getPackedPositionChild(0L) + 17, (char) (TextUtils.getOffsetAfter("", 0) + 24450), objArr20);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr20[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr21 = {-1836703272};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) (46038 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 1133 - TextUtils.lastIndexOf("", '0', 0), MotionEvent.axisFromString("") + 19, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr22 = {Integer.valueOf(iIntValue2), 0, 431790743, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).newInstance(objArr21), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cMyTid2 = (char) (Process.myTid() >> 22);
                int iLastIndexOf = 1030 - TextUtils.lastIndexOf("", '0', 0);
                int i28 = 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                short s3 = (short) 52;
                Object[] objArr23 = new Object[1];
                c(s3, (byte) s3, $$a[7], objArr23);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cMyTid2, iLastIndexOf, i28, 1298546779, false, (String) objArr23[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), TextUtils.getOffsetBefore("", 0) + 1117, 16 - ExpandableListView.getPackedPositionChild(0L)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr22);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                int i29 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1030;
                int iResolveSizeAndState = 15 - View.resolveSizeAndState(0, 0, 0);
                byte[] bArr = $$a;
                short s4 = bArr[7];
                Object[] objArr24 = new Object[1];
                c(s4, (byte) s4, bArr[28], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cLastIndexOf, i29, iResolveSizeAndState, 632103528, false, (String) objArr24[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, objArr);
            try {
                Object[] objArr25 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 80, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_address).substring(0, 6).codePointAt(1) - 86, (char) (16960 - TextUtils.indexOf((CharSequence) "", '0')), objArr25);
                Class<?> cls5 = Class.forName((String) objArr25[0]);
                Object[] objArr26 = new Object[1];
                e(TextUtils.indexOf((CharSequence) "", '0') + 55, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_tablet_step5).substring(28, 29).length() + 14, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_face_too_far).substring(0, 25).length() - 25), objArr26);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr26[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int i30 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1030;
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 16;
                    Object[] objArr27 = new Object[1];
                    c((short) 156, (byte) 52, $$a[7], objArr27);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c2, i30, iLastIndexOf2, 1344079056, false, (String) objArr27[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cIndexOf3 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                    int scrollDefaultDelay = 1031 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int offsetBefore2 = 15 - TextUtils.getOffsetBefore("", 0);
                    short s5 = (short) 52;
                    Object[] objArr28 = new Object[1];
                    c(s5, (byte) s5, $$a[7], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf3, scrollDefaultDelay, offsetBefore2, 1357589585, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                int scrollDefaultDelay2 = 1031 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 15;
                byte[] bArr2 = $$a;
                short s6 = bArr2[7];
                Object[] objArr29 = new Object[1];
                c(s6, (byte) s6, bArr2[28], objArr29);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cKeyCodeFromString, scrollDefaultDelay2, iCombineMeasuredStates2, 632103528, false, (String) objArr29[0], null);
            }
            Object[] objArr30 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i31 = ((int[]) objArr30[3])[0];
            int i32 = ((int[]) objArr30[1])[0];
            String[] strArr2 = (String[]) objArr30[0];
            int i33 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i34 = 1454446845 + ((~((-294687911) | i33)) * 52) + (((~(606077016 | i33)) | (~(361796846 | i33)) | (-900764927)) * (-52)) + (((~(i33 | (-606077017))) | 67108936) * 52) + 431790743;
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr[2])[0] = i36 ^ (i36 << 5);
        }
        int i37 = ((int[]) objArr[1])[0];
        int i38 = ((int[]) objArr[3])[0];
        if (i38 == i37) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i39 = ((int[]) objArr[2])[0];
            int i40 = ((int[]) objArr[3])[0];
            int i41 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i42 = ~(((int) SystemClock.elapsedRealtime()) | 30029299);
            int i43 = i39 + (((219086981 | i42) * (-658)) - 1169901829) + ((i42 | 201654276) * 658);
            int i44 = (i43 << 13) ^ i43;
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArr31[2])[0] = i45 ^ (i45 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str2 : strArr4) {
                arrayList2.add(str2);
            }
        }
        Toast.makeText((Context) null, i38 / (((i38 - 1) * i38) % 2), 0).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i46 = ((int[]) objArr[2])[0];
        int i47 = ((int[]) objArr[3])[0];
        int i48 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int i49 = ~System.identityHashCode(this);
        int i50 = i46 + (-1399126359) + (((~(i49 | 231863958)) | (-234747608)) * (-160)) + (((~(i49 | (-12416212))) | 231863958) * 160);
        int i51 = i50 ^ (i50 << 13);
        int i52 = i51 ^ (i51 >>> 17);
        ((int[]) objArr32[2])[0] = i52 ^ (i52 << 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ca, code lost:
    
        if (r1 != ((((1143489024 | r2) * (-196)) - 1886744868) + ((r2 | 574620064) * 196))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00cc, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerActivationActivity.cancel + 121;
        com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerActivationActivity.onTransact = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e0, code lost:
    
        throw new java.lang.RuntimeException("-1487442065");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e1, code lost:
    
        r1 = 433160726 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ea, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005a, code lost:
    
        if (r1 == ((((-410628888) + (((~(1811241371 | r2)) | 269002308) * 104)) + ((~((~r2) | (-1098989852))) * (-104))) + ((r2 | 981253828) * 104))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a3, code lost:
    
        if (r1 == ((((r6 | r2) * (-252)) + 1870759204) + ((r2 | (~(r3 | 985640829))) * 252))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a5, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r2 = ~(((int) android.os.Process.getStartElapsedRealtime()) | 1718109088);
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerActivationActivity.onResume():void");
    }

    public static /* synthetic */ void b(SalariedWorkerActivationActivity salariedWorkerActivationActivity, View view) {
        int i = 2 % 2;
        int i2 = cancel + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                salariedWorkerActivationActivity.g();
                ViewPortBuilder.b();
                int i4 = 29 / 0;
            } else {
                salariedWorkerActivationActivity.g();
                ViewPortBuilder.b();
            }
            int i5 = cancel + 91;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(SalariedWorkerActivationActivity salariedWorkerActivationActivity, Integer num) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) b(2062090378, -2062090376, new Object[]{salariedWorkerActivationActivity, num}, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    static {
        INotificationSideChannel = 1;
        d();
        INSTANCE = new Companion(null);
        int i = cancelAll + 75;
        INotificationSideChannel = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = cancel + 39;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(-1474963302, 1474963302, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), registerAvailabilityCallback.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int iTuitionPaymentFragmentbindingInflater1 = registerAvailabilityCallback.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = registerAvailabilityCallback.TuitionPaymentFragmentbindingInflater1();
        b(533269870, -533269869, new Object[]{this}, iTuitionPaymentFragmentbindingInflater1, getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentbindingInflater2);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = cancel + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
        int i5 = onTransact + 31;
        cancel = i5 % 128;
        int i6 = i5 % 2;
    }

    static void d() {
        asInterface = new char[]{45558, 31650, 9556, 61152, 39118, 16939, 4039, 14699, 58115, 44261, 22137, 1008, 52635, 63291, 41163, 27232, 61047, 9253, 31429, 45421, 50966, 7596, 20560, 26366, 48302, 62248, 2523, 23651, 37417, 43170, 65352, 13802, 62396, 14828, 26375, 44210, 56014, 'o', 19843, 31594, 41290, 61177, 5189, 16795, 36816, 46461, 58011, 10281, 22080, 33745, 51487, 63167, 15570, 27261, 45561, 31663, 9539, 61169, 39059, 16930, 4034, 14679, 58113, 44202, 22086, 1021, 52609, 63266, 41163};
        g = -7355467943818593341L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r7, short r8, int r9) {
        /*
            int r9 = r9 * 3
            int r9 = 1 - r9
            int r7 = r7 * 3
            int r7 = r7 + 109
            byte[] r0 = com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerActivationActivity.$$c
            int r8 = r8 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r5 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L29:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerActivationActivity.$$i(int, short, int):java.lang.String");
    }
}
