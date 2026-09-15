package com.bpjstku.presentation.membership.registration.registeredmember;

import android.app.DatePickerDialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.registration.general.model.request.MembershipCheckRequest;
import com.bpjstku.data.registration.general.model.response.MembershipCheckItem;
import com.bpjstku.databinding.ActivityIndonesianMigrantWorkerRegistrationBinding;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity$special$$inlined$inject$default$2;
import com.bpjstku.presentation.membership.registration.EmailVerificationActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.registeredmember.IndonesianMigrantWorkerRegistrationActivity;
import com.bpjstku.util.constant.Citizenship;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.constant.ProgramType;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.ClockHandView$$ExternalSyntheticLambda0;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accessconfigureInstanceInternal;
import defpackage.accessgetMCameraInfoMapp;
import defpackage.calculateCameraUseCases;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.createExtraPreview;
import defpackage.deInitSession;
import defpackage.generateArrangements;
import defpackage.getElementsArrangements;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.mapPoint;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setInactive;
import defpackage.setSplitTrack;
import defpackage.unregisterLifecycle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0015\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0015\u0010\u0006\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00178\u0015X\u0095D¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00020\u001c8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001eR\u0014\u0010\b\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0016\u0010\u0007\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0016\u0010\r\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\t\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010$"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/registeredmember/IndonesianMigrantWorkerRegistrationActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityIndonesianMigrantWorkerRegistrationBinding;", "<init>", "()V", "", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LsetSplitTrack;", "", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "Ljava/util/Calendar;", "Ljava/util/Calendar;", "Z", "", "g", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IndonesianMigrantWorkerRegistrationActivity extends BindingReactiveFormActivity<ActivityIndonesianMigrantWorkerRegistrationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char asBinder;
    private static char[] asInterface;
    private static int cancel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private boolean asBinder;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Calendar TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String asInterface;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String d;
    private static final byte[] $$c = {88, ByteCompanionObject.MAX_VALUE, -112, -47};
    private static final int $$f = 38;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {46, 47, -18, 64, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 21;
    private static int INotificationSideChannel = 1;
    private static int onTransact = 0;
    private static int notify = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: getColorSchemeParams
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IndonesianMigrantWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentbindingInflater1 = R.layout.activity_indonesian_migrant_worker_registration;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invoke(obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bf, code lost:
    
        if (r0 == ((((-588737688) + ((687867136 | r2) * (-476))) + (r2 * 952)) + ((~(2073690095 | (~r8))) * 476))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00fa, code lost:
    
        if (r0 == (((1678457332 + ((~(1943793135 | r1)) * 623)) + (((~r1) | 38813700) * (-623))) + (((~(r1 | 576309646)) | ((~(1406297189 | r1)) | (-1943793136))) * 623))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00fc, code lost:
    
        r10 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r0 = ~r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0128, code lost:
    
        if (r10 == (((((~((-1090560515) | r0)) | (~(2107438071 | r8))) * 988) + 129725688) + ((((~(r8 | (-1562178408))) | 471617893) | (~(r0 | 2107438071))) * 988))) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x012a, code lost:
    
        r8 = com.bpjstku.presentation.membership.registration.registeredmember.IndonesianMigrantWorkerRegistrationActivity.onTransact + 59;
        com.bpjstku.presentation.membership.registration.registeredmember.IndonesianMigrantWorkerRegistrationActivity.notify = r8 % 128;
        r8 = r8 % 2;
        r8 = new int[515522661];
        r8[515522660(0x1eba4064, float:1.9720147E-20)] = 1;
        r10 = 809265012 % 2;
        android.widget.Toast.makeText((android.content.Context) null, r8[-1], 1).show();
        r8 = com.bpjstku.presentation.membership.registration.registeredmember.IndonesianMigrantWorkerRegistrationActivity.notify + 39;
        com.bpjstku.presentation.membership.registration.registeredmember.IndonesianMigrantWorkerRegistrationActivity.onTransact = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0154, code lost:
    
        if ((r8 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0156, code lost:
    
        r8 = 4 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0159, code lost:
    
        super.onCreate(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x015d, code lost:
    
        r7 = 1841302166 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0166, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object TuitionPaymentFragmentbindingInflater1(java.lang.Object[] r7, int r8, int r9, int r10, int r11, int r12, int r13) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.registeredmember.IndonesianMigrantWorkerRegistrationActivity.TuitionPaymentFragmentbindingInflater1(java.lang.Object[], int, int, int, int, int, int):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = 53 - r5
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r1 = com.bpjstku.presentation.membership.registration.registeredmember.IndonesianMigrantWorkerRegistrationActivity.$$a
            int r7 = 145 - r7
            byte[] r0 = new byte[r0]
            int r5 = 52 - r5
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r6
            r4 = r2
            r6 = r5
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            r3 = r1[r7]
        L27:
            int r7 = r7 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.registeredmember.IndonesianMigrantWorkerRegistrationActivity.c(short, int, int, java.lang.Object[]):void");
    }

    public IndonesianMigrantWorkerRegistrationActivity() {
        final IndonesianMigrantWorkerRegistrationActivity indonesianMigrantWorkerRegistrationActivity = this;
        this.b = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.registration.registeredmember.IndonesianMigrantWorkerRegistrationActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final setSplitTrack invoke() {
                ComponentCallbacks componentCallbacks = indonesianMigrantWorkerRegistrationActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(setSplitTrack.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = calendar;
        this.d = "";
        this.asInterface = "";
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.registration.registeredmember.IndonesianMigrantWorkerRegistrationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/registeredmember/IndonesianMigrantWorkerRegistrationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0, RegisteredMemberRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, IndonesianMigrantWorkerRegistrationActivity.class, new Pair[]{TuplesKt.to("registration_data", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            getElementsArrangements.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0] = generateArrangements.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0];
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            return this.TuitionPaymentFragmentbindingInflater1;
        }
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityIndonesianMigrantWorkerRegistrationBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = notify + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IndonesianMigrantWorkerRegistrationActivity$bindingInflater$1 indonesianMigrantWorkerRegistrationActivity$bindingInflater$1 = IndonesianMigrantWorkerRegistrationActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = onTransact + 31;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            return indonesianMigrantWorkerRegistrationActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = notify + 75;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IndonesianMigrantWorkerRegistrationActivity indonesianMigrantWorkerRegistrationActivity = this;
        Intrinsics.checkNotNullParameter(indonesianMigrantWorkerRegistrationActivity, "");
        indonesianMigrantWorkerRegistrationActivity.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = INotificationSideChannelStub().layoutToolbar.toolbar;
        String string = getString(R.string.title_registration_jmo);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        EditText editText = INotificationSideChannelStub().tilFullName.getEditText();
        if (editText != null) {
            Intrinsics.checkNotNullParameter(editText, "");
            editText.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText2 = INotificationSideChannelStub().tilIdPassport.getEditText();
        if (editText2 != null) {
            Intrinsics.checkNotNullParameter(editText2, "");
            editText2.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        int i4 = onTransact + 71;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityIndonesianMigrantWorkerRegistrationBinding activityIndonesianMigrantWorkerRegistrationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        activityIndonesianMigrantWorkerRegistrationBindingINotificationSideChannelStub.btnNext.setOnClickListener(new View.OnClickListener() { // from class: getLocaleForLanguageTag
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws IllegalAccessException {
                IndonesianMigrantWorkerRegistrationActivity.b(this.b, activityIndonesianMigrantWorkerRegistrationBindingINotificationSideChannelStub, view);
            }
        });
        EditText editText = activityIndonesianMigrantWorkerRegistrationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: isActivitySideSheetMaximizationEnabled
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IndonesianMigrantWorkerRegistrationActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
                }
            });
            int i2 = notify + 111;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
        }
        activityIndonesianMigrantWorkerRegistrationBindingINotificationSideChannelStub.rgChooseIdentity.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: getToolbarCornerRadiusDp
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i4) {
                IndonesianMigrantWorkerRegistrationActivity.TuitionPaymentFragmentbindingInflater1(activityIndonesianMigrantWorkerRegistrationBindingINotificationSideChannelStub, this, radioGroup, i4);
            }
        });
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((setSplitTrack) this.b.getValue()).TuitionPaymentFragmentbindingInflater1.observe(this, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: getInitialActivityHeightPx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndonesianMigrantWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = notify + 89;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            INotificationSideChannelStub();
            throw null;
        }
        ActivityIndonesianMigrantWorkerRegistrationBinding activityIndonesianMigrantWorkerRegistrationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        if (this.asBinder) {
            TextInputLayout textInputLayout = activityIndonesianMigrantWorkerRegistrationBindingINotificationSideChannelStub.tilIdPassport;
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
            String string = getString(R.string.error_field_required);
            Intrinsics.checkNotNullExpressionValue(string, "");
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Paspor Minimal 6 Karakter", 6, null)})));
        } else {
            TextInputLayout textInputLayout2 = activityIndonesianMigrantWorkerRegistrationBindingINotificationSideChannelStub.tilIdentityNumber;
            Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
            String string2 = getString(R.string.error_field_required);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String string3 = getString(R.string.error_field_nik);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string2), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string3, 16, 16)})));
            int i3 = notify + 93;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
        }
        TextInputLayout textInputLayout3 = activityIndonesianMigrantWorkerRegistrationBindingINotificationSideChannelStub.tilFullName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string4 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string4))));
        TextInputLayout textInputLayout4 = activityIndonesianMigrantWorkerRegistrationBindingINotificationSideChannelStub.tilBirthDate;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        String string5 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout4, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string5))));
        int i5 = onTransact + 29;
        notify = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 29 / 0;
        }
    }

    private static void e(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr3 = asInterface;
        int i4 = 1770390596;
        Object obj2 = null;
        if (cArr3 != null) {
            int i5 = $10 + 111;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.myTid() >> 22), 2267 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 33, -1927765101, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    int i7 = $11 + 51;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    i4 = 1770390596;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(asBinder)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                byte b4 = (byte) 0;
                byte b5 = b4;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - Process.getGidForName("")), ExpandableListView.getPackedPositionGroup(0L) + 2267, (ViewConfiguration.getWindowTouchSlop() >> 8) + 33, -1927765101, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i9 = $11 + 71;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    int i11 = $10 + 81;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 3261 - Color.red(0), View.combineMeasuredStates(0, 0) + 30, -127612708, false, $$i(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - Color.alpha(0)), 594 - (ViewConfiguration.getJumpTapTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 17, 1570859318, false, $$i(b8, b9, (byte) (b9 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i13];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i14 = $10 + 89;
                                $11 = i14 % 128;
                                int i15 = i14 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i16];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i17];
                            } else {
                                int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i18];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i19];
                            }
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    obj2 = obj;
                }
            }
            int i20 = 0;
            while (i20 < i) {
                int i21 = $10;
                int i22 = i21 + 5;
                $11 = i22 % 128;
                int i23 = i22 % 2;
                cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                i20++;
                int i24 = i21 + 87;
                $11 = i24 % 128;
                int i25 = i24 % 2;
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = notify + 55;
        onTransact = i2 % 128;
        Object obj = null;
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
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i3 = onTransact + 83;
            notify = i3 % 128;
            if (i3 % 2 != 0) {
                return zOnOptionsItemSelected;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        Object[] objArr2;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        IndonesianMigrantWorkerRegistrationActivity indonesianMigrantWorkerRegistrationActivity = (IndonesianMigrantWorkerRegistrationActivity) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 97;
        notify = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
            int i4 = 1032 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int iIndexOf = TextUtils.indexOf("", "") + 15;
            byte[] bArr = $$a;
            byte b = bArr[7];
            byte b2 = bArr[132];
            Object[] objArr3 = new Object[1];
            c(b, b2, (short) (b2 | 140), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, i4, iIndexOf, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{2, 0, 1, 7, 2, 17, 1, '\f', 23, 7, '\r', 21, 23, 5, 15, 18, 6, 22, 2, 23, '\n', '\b'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_permission).substring(0, 77).length() + 42), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{18, 2, 4, 6, 7, 18, 3, 17, 16, 2, 4, 18, 17, '\f', 13868}, (byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.vida_preview_width) & (-865)) - 83), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 83, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int iKeyCodeFromString = 1031 - KeyEvent.keyCodeFromString("");
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 15;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            byte b4 = bArr2[132];
            Object[] objArr6 = new Object[1];
            c(b3, b4, (short) (b4 | 88), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iKeyCodeFromString, touchSlop, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                int i5 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1030;
                int iAlpha = 15 - Color.alpha(0);
                byte b5 = $$a[7];
                Object[] objArr7 = new Object[1];
                c((byte) 52, b5, (short) (b5 | 37), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, i5, iAlpha, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr8[3])[0];
            int i7 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i8 = 1866967784 + (((~((-38612994) | iElapsedRealtime)) | 4206592) * 345) + (((~((-38612994) | (~iElapsedRealtime))) | 201460584) * 345) + ((~(iElapsedRealtime | (-4206593))) * 345) + 743264250;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr2[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{16, 0, 1, 2, '\r', 1, 2, 0, 21, 14, 24, 21, '\t', 18, 22, '\f'}, (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 50), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{17, 7, 19, 2, 17, 14, 15, 24, 11, 0, '\t', '\r', 22, 23, 7, 22}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 65), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_giftcard_number).substring(1, 2).length() + 15, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, indonesianMigrantWorkerRegistrationActivity)).intValue();
            try {
                Object[] objArr11 = {-1550937943};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46037 - TextUtils.lastIndexOf("", '0', 0)), AndroidCharacter.getMirror('0') + 1086, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, 743264250, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                    int scrollBarFadeDuration = 1031 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int iNormalizeMetaState = 15 - KeyEvent.normalizeMetaState(0);
                    byte[] bArr3 = $$a;
                    byte b6 = bArr3[7];
                    byte b7 = bArr3[132];
                    Object[] objArr13 = new Object[1];
                    c(b6, b7, (short) (b7 | 140), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf2, scrollBarFadeDuration, iNormalizeMetaState, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 45993), 1117 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 18), Boolean.TYPE});
                }
                objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                    int iLastIndexOf = 1030 - TextUtils.lastIndexOf("", '0', 0);
                    int jumpTapTimeout = 15 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    byte b8 = $$a[7];
                    Object[] objArr14 = new Object[1];
                    c((byte) 52, b8, (short) (b8 | 37), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, iLastIndexOf, jumpTapTimeout, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr2);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{2, 0, 1, 7, 2, 17, 1, '\f', 23, 7, '\r', 21, 23, 5, 15, 18, 6, 22, 2, 23, '\n', '\b'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 83), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{18, 2, 4, 6, 7, 18, 3, 17, 16, 2, 4, 18, 17, '\f', 13868}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 9), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                        int scrollDefaultDelay = 1031 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int mode = 15 - View.MeasureSpec.getMode(0);
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[7];
                        byte b10 = bArr4[132];
                        Object[] objArr17 = new Object[1];
                        c(b9, b10, (short) (b10 | 88), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(deadChar, scrollDefaultDelay, mode, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c2 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 1032;
                        int iIndexOf2 = 15 - TextUtils.indexOf("", "");
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[7];
                        byte b12 = bArr5[132];
                        Object[] objArr18 = new Object[1];
                        c(b11, b12, (short) (b12 | 140), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, iLastIndexOf2, iIndexOf2, 1357589585, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        int i11 = ((int[]) objArr2[1])[0];
        int i12 = ((int[]) objArr2[3])[0];
        if (i12 == i11) {
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i13 = ((int[]) objArr2[2])[0];
            int i14 = ((int[]) objArr2[3])[0];
            int i15 = ((int[]) objArr2[1])[0];
            String[] strArr2 = (String[]) objArr2[0];
            int iMyTid = Process.myTid();
            int i16 = ~((-415259241) | (~iMyTid));
            int i17 = i13 + (((-452001535) | i16 | (~(415259240 | iMyTid))) * (-338)) + 2086583995 + (((~(iMyTid | (-36742295))) | i16) * 338);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr19[2])[0] = i19 ^ (i19 << 5);
            int i20 = notify + 91;
            onTransact = i20 % 128;
            int i21 = i20 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr2[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i12];
            int i22 = i12 - 1;
            iArr[i22] = 1;
            Toast.makeText((Context) null, iArr[((i12 * i22) % 2) - 1], 1).show();
            Object[] objArr20 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i23 = ((int[]) objArr2[2])[0];
            int i24 = ((int[]) objArr2[3])[0];
            int i25 = ((int[]) objArr2[1])[0];
            String[] strArr4 = (String[]) objArr2[0];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i26 = i23 + (-981027964) + (((~((~iFreeMemory) | (-804474178))) | (-560194008)) * (-235)) + (((~((-804474178) | iFreeMemory)) | (-560194008)) * (-470)) + (((~(iFreeMemory | (-560152898))) | (-804515288)) * 235);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr20[2])[0] = i28 ^ (i28 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cIndexOf2 = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
            int iLastIndexOf3 = 1754 - TextUtils.lastIndexOf("", '0', 0, 0);
            int i29 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22;
            byte[] bArr6 = $$a;
            byte b13 = (byte) (bArr6[33] - 1);
            byte b14 = bArr6[132];
            Object[] objArr21 = new Object[1];
            c(b13, b14, (short) (b14 | 36), objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf2, iLastIndexOf3, i29, 986134021, false, (String) objArr21[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29943);
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1755;
                int maximumFlingVelocity = 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                byte[] bArr7 = $$a;
                byte b15 = bArr7[7];
                byte b16 = bArr7[132];
                Object[] objArr22 = new Object[1];
                c(b15, b16, (short) (b16 | 88), objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c3, pressedStateDuration, maximumFlingVelocity, 1599039318, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr23[0])[0]}, new int[]{((int[]) objArr23[1])[0]}, (Object[]) objArr23[2], new int[1], (String[]) objArr23[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i30 = ((((-326614260) + ((~((~startUptimeMillis) | (-84226))) * 433)) + (((~((-194950399) | startUptimeMillis)) | (-17652028)) * (-433))) + (((~(startUptimeMillis | (-17652028))) | (-195034624)) * 433)) - 311694382;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i32 ^ (i32 << 5);
        } else {
            Object[] objArr24 = new Object[1];
            e(new char[]{16, 0, 1, 2, '\r', 1, 2, 0, 21, 14, 24, 21, '\t', 18, 22, '\f'}, (byte) (50 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr24);
            Class<?> cls4 = Class.forName((String) objArr24[0]);
            Object[] objArr25 = new Object[1];
            e(new char[]{17, 7, 19, 2, 17, 14, 15, 24, 11, 0, '\t', '\r', 22, 23, 7, 22}, (byte) (75 - MotionEvent.axisFromString("")), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.company_code).substring(1, 2).length() + 15, objArr25);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr25[0], Object.class).invoke(null, indonesianMigrantWorkerRegistrationActivity)).intValue();
            Object[] objArr26 = {-1550937943};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - (ViewConfiguration.getEdgeSlop() >> 16)), 1726 - (Process.myTid() >> 22), 28 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = ClockHandView$$ExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr26), -311694382, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c4 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29944);
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1755;
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 23;
                byte[] bArr8 = $$a;
                byte b17 = bArr8[7];
                byte b18 = bArr8[132];
                Object[] objArr27 = new Object[1];
                c(b17, b18, (short) (b18 | 88), objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c4, minimumFlingVelocity, offsetAfter, 1599039318, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr28 = new Object[1];
                e(new char[]{2, 0, 1, 7, 2, 17, 1, '\f', 23, 7, '\r', 21, 23, 5, 15, 18, 6, 22, 2, 23, '\n', '\b'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step5).substring(17, 18).length() + 118), TextUtils.indexOf((CharSequence) "", '0', 0) + 23, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(new char[]{18, 2, 4, 6, 7, 18, 3, 17, 16, 2, 4, 18, 17, '\f', 13868}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 34), Color.blue(0) + 15, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
                    int i33 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1754;
                    int packedPositionChild = 22 - ExpandableListView.getPackedPositionChild(0L);
                    byte[] bArr9 = $$a;
                    byte b19 = bArr9[7];
                    Object[] objArr30 = new Object[1];
                    c(b19, bArr9[132], b19, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cMyTid, i33, packedPositionChild, 1596667560, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 29944);
                    int size = 1755 - View.MeasureSpec.getSize(0);
                    int tapTimeout = 23 - (ViewConfiguration.getTapTimeout() >> 16);
                    byte[] bArr10 = $$a;
                    byte b20 = (byte) (bArr10[33] - 1);
                    byte b21 = bArr10[132];
                    Object[] objArr31 = new Object[1];
                    c(b20, b21, (short) (b21 | 36), objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cResolveOpacity, size, tapTimeout, 986134021, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i34 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i35 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i35 == i34) {
            int i36 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr32 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i37 = i36 + (-1478798065) + (((~((-101978179) | iUptimeMillis)) | (~((~iUptimeMillis) | 110624247))) * (-318)) + (((~(102207554 | iUptimeMillis)) | 8416693) * (-318)) + (((~(iUptimeMillis | (-102207555))) | (-110394872)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr32[3])[0] = i39 ^ (i39 << 5);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
        if (strArr5 != null) {
            int i40 = onTransact + 121;
            notify = i40 % 128;
            int i41 = i40 % 2;
            int i42 = 0;
            while (i42 < strArr5.length) {
                arrayList2.add(strArr5[i42]);
                i42++;
                int i43 = onTransact + 1;
                notify = i43 % 128;
                int i44 = i43 % 2;
            }
        }
        Toast.makeText((Context) null, i35 / (((i35 - 1) * i35) % 2), 0).show();
        int i45 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr33 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
        int i46 = ~startUptimeMillis2;
        int i47 = i45 + 908140102 + ((startUptimeMillis2 | 496703096) * (-859)) + (((~(startUptimeMillis2 | (-219158081))) | (~(496703096 | i46))) * 859) + (((~(284100670 | i46)) | (-503258751)) * 859);
        int i48 = (i47 << 13) ^ i47;
        int i49 = i48 ^ (i48 >>> 17);
        ((int[]) objArr33[3])[0] = i49 ^ (i49 << 5);
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = notify + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ~((~System.identityHashCode(this)) | 932209340);
        if (i4 != ((553672848 | i5) * (-374)) + 246500160 + ((i5 | 378536492) * 374)) {
            int i6 = 1936761960 % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iNextInt = new Random().nextInt(824003542);
        if (i7 != 1765849072 + (((~((-1663356458) | iNextInt)) | (-915699508)) * (-964)) + (((~((~iNextInt) | (-1663356458))) | 1092651016) * (-964))) {
            throw new RuntimeException("1563678516");
        }
        super.onResume();
        int i8 = notify + 55;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i3 = ~((int) Runtime.getRuntime().maxMemory());
        if (i2 != 1188971296 + ((~((-1108935009) | i3)) * 52) + (((~(887121561 | i3)) | (~(1717109104 | i3)) | (-1996056570)) * (-52)) + (((~(i3 | (-887121562))) | 608174096) * 52)) {
            int i4 = (-257646898) % 2;
            throw new ArithmeticException();
        }
        int i5 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i5 != (-1228363390) + (((~((-1666895256) | iIdentityHashCode)) | 912160709) * (-366)) + (((~(iIdentityHashCode | (-1090553875))) | 335819328) * 366)) {
            int i6 = notify + 7;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            int[] iArr = new int[1526744042];
            iArr[1526744041] = 1;
            int i8 = 319032826 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        super.onStart();
        int i9 = notify + 117;
        onTransact = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0227 A[Catch: all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:3:0x0014, B:8:0x0028, B:12:0x0043, B:16:0x0050, B:26:0x00b0, B:50:0x0119, B:52:0x011d, B:56:0x0140, B:72:0x0180, B:76:0x0193, B:80:0x01a0, B:82:0x01ba, B:84:0x01c0, B:113:0x028d, B:114:0x029c, B:93:0x01e0, B:96:0x0211, B:98:0x0217, B:100:0x0227, B:102:0x022d, B:105:0x0244, B:107:0x024a, B:110:0x026d, B:112:0x0273, B:77:0x0198, B:78:0x019e, B:59:0x014d, B:62:0x0157, B:63:0x015b, B:65:0x0161, B:67:0x016d, B:69:0x0173, B:29:0x00b7, B:33:0x00da, B:36:0x00e4, B:37:0x00ec, B:38:0x00ed, B:39:0x00f1, B:41:0x00f7, B:43:0x0103, B:45:0x0109, B:13:0x0048, B:14:0x004e, B:17:0x006a, B:18:0x0077, B:19:0x0078, B:21:0x0086, B:24:0x0095), top: B:119:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:101:0x022c  */
    /* JADX WARN: Code duplicated, block: B:104:0x023b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0249  */
    /* JADX WARN: Code duplicated, block: B:109:0x0264  */
    /* JADX WARN: Code duplicated, block: B:111:0x0272  */
    /* JADX WARN: Code duplicated, block: B:121:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[LOOP:0: B:63:0x015b->B:122:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ed A[Catch: all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:3:0x0014, B:8:0x0028, B:12:0x0043, B:16:0x0050, B:26:0x00b0, B:50:0x0119, B:52:0x011d, B:56:0x0140, B:72:0x0180, B:76:0x0193, B:80:0x01a0, B:82:0x01ba, B:84:0x01c0, B:113:0x028d, B:114:0x029c, B:93:0x01e0, B:96:0x0211, B:98:0x0217, B:100:0x0227, B:102:0x022d, B:105:0x0244, B:107:0x024a, B:110:0x026d, B:112:0x0273, B:77:0x0198, B:78:0x019e, B:59:0x014d, B:62:0x0157, B:63:0x015b, B:65:0x0161, B:67:0x016d, B:69:0x0173, B:29:0x00b7, B:33:0x00da, B:36:0x00e4, B:37:0x00ec, B:38:0x00ed, B:39:0x00f1, B:41:0x00f7, B:43:0x0103, B:45:0x0109, B:13:0x0048, B:14:0x004e, B:17:0x006a, B:18:0x0077, B:19:0x0078, B:21:0x0086, B:24:0x0095), top: B:119:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7 A[Catch: all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:3:0x0014, B:8:0x0028, B:12:0x0043, B:16:0x0050, B:26:0x00b0, B:50:0x0119, B:52:0x011d, B:56:0x0140, B:72:0x0180, B:76:0x0193, B:80:0x01a0, B:82:0x01ba, B:84:0x01c0, B:113:0x028d, B:114:0x029c, B:93:0x01e0, B:96:0x0211, B:98:0x0217, B:100:0x0227, B:102:0x022d, B:105:0x0244, B:107:0x024a, B:110:0x026d, B:112:0x0273, B:77:0x0198, B:78:0x019e, B:59:0x014d, B:62:0x0157, B:63:0x015b, B:65:0x0161, B:67:0x016d, B:69:0x0173, B:29:0x00b7, B:33:0x00da, B:36:0x00e4, B:37:0x00ec, B:38:0x00ed, B:39:0x00f1, B:41:0x00f7, B:43:0x0103, B:45:0x0109, B:13:0x0048, B:14:0x004e, B:17:0x006a, B:18:0x0077, B:19:0x0078, B:21:0x0086, B:24:0x0095), top: B:119:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0103 A[Catch: all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:3:0x0014, B:8:0x0028, B:12:0x0043, B:16:0x0050, B:26:0x00b0, B:50:0x0119, B:52:0x011d, B:56:0x0140, B:72:0x0180, B:76:0x0193, B:80:0x01a0, B:82:0x01ba, B:84:0x01c0, B:113:0x028d, B:114:0x029c, B:93:0x01e0, B:96:0x0211, B:98:0x0217, B:100:0x0227, B:102:0x022d, B:105:0x0244, B:107:0x024a, B:110:0x026d, B:112:0x0273, B:77:0x0198, B:78:0x019e, B:59:0x014d, B:62:0x0157, B:63:0x015b, B:65:0x0161, B:67:0x016d, B:69:0x0173, B:29:0x00b7, B:33:0x00da, B:36:0x00e4, B:37:0x00ec, B:38:0x00ed, B:39:0x00f1, B:41:0x00f7, B:43:0x0103, B:45:0x0109, B:13:0x0048, B:14:0x004e, B:17:0x006a, B:18:0x0077, B:19:0x0078, B:21:0x0086, B:24:0x0095), top: B:119:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0108  */
    /* JADX WARN: Code duplicated, block: B:47:0x0115 A[LOOP:1: B:39:0x00f1->B:47:0x0115, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x011d A[Catch: all -> 0x02a0, TRY_LEAVE, TryCatch #0 {all -> 0x02a0, blocks: (B:3:0x0014, B:8:0x0028, B:12:0x0043, B:16:0x0050, B:26:0x00b0, B:50:0x0119, B:52:0x011d, B:56:0x0140, B:72:0x0180, B:76:0x0193, B:80:0x01a0, B:82:0x01ba, B:84:0x01c0, B:113:0x028d, B:114:0x029c, B:93:0x01e0, B:96:0x0211, B:98:0x0217, B:100:0x0227, B:102:0x022d, B:105:0x0244, B:107:0x024a, B:110:0x026d, B:112:0x0273, B:77:0x0198, B:78:0x019e, B:59:0x014d, B:62:0x0157, B:63:0x015b, B:65:0x0161, B:67:0x016d, B:69:0x0173, B:29:0x00b7, B:33:0x00da, B:36:0x00e4, B:37:0x00ec, B:38:0x00ed, B:39:0x00f1, B:41:0x00f7, B:43:0x0103, B:45:0x0109, B:13:0x0048, B:14:0x004e, B:17:0x006a, B:18:0x0077, B:19:0x0078, B:21:0x0086, B:24:0x0095), top: B:119:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0135  */
    /* JADX WARN: Code duplicated, block: B:56:0x0140 A[Catch: all -> 0x02a0, TRY_ENTER, TryCatch #0 {all -> 0x02a0, blocks: (B:3:0x0014, B:8:0x0028, B:12:0x0043, B:16:0x0050, B:26:0x00b0, B:50:0x0119, B:52:0x011d, B:56:0x0140, B:72:0x0180, B:76:0x0193, B:80:0x01a0, B:82:0x01ba, B:84:0x01c0, B:113:0x028d, B:114:0x029c, B:93:0x01e0, B:96:0x0211, B:98:0x0217, B:100:0x0227, B:102:0x022d, B:105:0x0244, B:107:0x024a, B:110:0x026d, B:112:0x0273, B:77:0x0198, B:78:0x019e, B:59:0x014d, B:62:0x0157, B:63:0x015b, B:65:0x0161, B:67:0x016d, B:69:0x0173, B:29:0x00b7, B:33:0x00da, B:36:0x00e4, B:37:0x00ec, B:38:0x00ed, B:39:0x00f1, B:41:0x00f7, B:43:0x0103, B:45:0x0109, B:13:0x0048, B:14:0x004e, B:17:0x006a, B:18:0x0077, B:19:0x0078, B:21:0x0086, B:24:0x0095), top: B:119:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x014c  */
    /* JADX WARN: Code duplicated, block: B:59:0x014d A[Catch: all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:3:0x0014, B:8:0x0028, B:12:0x0043, B:16:0x0050, B:26:0x00b0, B:50:0x0119, B:52:0x011d, B:56:0x0140, B:72:0x0180, B:76:0x0193, B:80:0x01a0, B:82:0x01ba, B:84:0x01c0, B:113:0x028d, B:114:0x029c, B:93:0x01e0, B:96:0x0211, B:98:0x0217, B:100:0x0227, B:102:0x022d, B:105:0x0244, B:107:0x024a, B:110:0x026d, B:112:0x0273, B:77:0x0198, B:78:0x019e, B:59:0x014d, B:62:0x0157, B:63:0x015b, B:65:0x0161, B:67:0x016d, B:69:0x0173, B:29:0x00b7, B:33:0x00da, B:36:0x00e4, B:37:0x00ec, B:38:0x00ed, B:39:0x00f1, B:41:0x00f7, B:43:0x0103, B:45:0x0109, B:13:0x0048, B:14:0x004e, B:17:0x006a, B:18:0x0077, B:19:0x0078, B:21:0x0086, B:24:0x0095), top: B:119:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0156  */
    /* JADX WARN: Code duplicated, block: B:62:0x0157 A[Catch: all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:3:0x0014, B:8:0x0028, B:12:0x0043, B:16:0x0050, B:26:0x00b0, B:50:0x0119, B:52:0x011d, B:56:0x0140, B:72:0x0180, B:76:0x0193, B:80:0x01a0, B:82:0x01ba, B:84:0x01c0, B:113:0x028d, B:114:0x029c, B:93:0x01e0, B:96:0x0211, B:98:0x0217, B:100:0x0227, B:102:0x022d, B:105:0x0244, B:107:0x024a, B:110:0x026d, B:112:0x0273, B:77:0x0198, B:78:0x019e, B:59:0x014d, B:62:0x0157, B:63:0x015b, B:65:0x0161, B:67:0x016d, B:69:0x0173, B:29:0x00b7, B:33:0x00da, B:36:0x00e4, B:37:0x00ec, B:38:0x00ed, B:39:0x00f1, B:41:0x00f7, B:43:0x0103, B:45:0x0109, B:13:0x0048, B:14:0x004e, B:17:0x006a, B:18:0x0077, B:19:0x0078, B:21:0x0086, B:24:0x0095), top: B:119:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0161 A[Catch: all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:3:0x0014, B:8:0x0028, B:12:0x0043, B:16:0x0050, B:26:0x00b0, B:50:0x0119, B:52:0x011d, B:56:0x0140, B:72:0x0180, B:76:0x0193, B:80:0x01a0, B:82:0x01ba, B:84:0x01c0, B:113:0x028d, B:114:0x029c, B:93:0x01e0, B:96:0x0211, B:98:0x0217, B:100:0x0227, B:102:0x022d, B:105:0x0244, B:107:0x024a, B:110:0x026d, B:112:0x0273, B:77:0x0198, B:78:0x019e, B:59:0x014d, B:62:0x0157, B:63:0x015b, B:65:0x0161, B:67:0x016d, B:69:0x0173, B:29:0x00b7, B:33:0x00da, B:36:0x00e4, B:37:0x00ec, B:38:0x00ed, B:39:0x00f1, B:41:0x00f7, B:43:0x0103, B:45:0x0109, B:13:0x0048, B:14:0x004e, B:17:0x006a, B:18:0x0077, B:19:0x0078, B:21:0x0086, B:24:0x0095), top: B:119:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x016d A[Catch: all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:3:0x0014, B:8:0x0028, B:12:0x0043, B:16:0x0050, B:26:0x00b0, B:50:0x0119, B:52:0x011d, B:56:0x0140, B:72:0x0180, B:76:0x0193, B:80:0x01a0, B:82:0x01ba, B:84:0x01c0, B:113:0x028d, B:114:0x029c, B:93:0x01e0, B:96:0x0211, B:98:0x0217, B:100:0x0227, B:102:0x022d, B:105:0x0244, B:107:0x024a, B:110:0x026d, B:112:0x0273, B:77:0x0198, B:78:0x019e, B:59:0x014d, B:62:0x0157, B:63:0x015b, B:65:0x0161, B:67:0x016d, B:69:0x0173, B:29:0x00b7, B:33:0x00da, B:36:0x00e4, B:37:0x00ec, B:38:0x00ed, B:39:0x00f1, B:41:0x00f7, B:43:0x0103, B:45:0x0109, B:13:0x0048, B:14:0x004e, B:17:0x006a, B:18:0x0077, B:19:0x0078, B:21:0x0086, B:24:0x0095), top: B:119:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0172  */
    /* JADX WARN: Code duplicated, block: B:71:0x017f A[EDGE_INSN: B:71:0x017f->B:72:0x0180 BREAK  A[LOOP:0: B:63:0x015b->B:122:?]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0188  */
    /* JADX WARN: Code duplicated, block: B:76:0x0193 A[Catch: all -> 0x02a0, TRY_ENTER, TryCatch #0 {all -> 0x02a0, blocks: (B:3:0x0014, B:8:0x0028, B:12:0x0043, B:16:0x0050, B:26:0x00b0, B:50:0x0119, B:52:0x011d, B:56:0x0140, B:72:0x0180, B:76:0x0193, B:80:0x01a0, B:82:0x01ba, B:84:0x01c0, B:113:0x028d, B:114:0x029c, B:93:0x01e0, B:96:0x0211, B:98:0x0217, B:100:0x0227, B:102:0x022d, B:105:0x0244, B:107:0x024a, B:110:0x026d, B:112:0x0273, B:77:0x0198, B:78:0x019e, B:59:0x014d, B:62:0x0157, B:63:0x015b, B:65:0x0161, B:67:0x016d, B:69:0x0173, B:29:0x00b7, B:33:0x00da, B:36:0x00e4, B:37:0x00ec, B:38:0x00ed, B:39:0x00f1, B:41:0x00f7, B:43:0x0103, B:45:0x0109, B:13:0x0048, B:14:0x004e, B:17:0x006a, B:18:0x0077, B:19:0x0078, B:21:0x0086, B:24:0x0095), top: B:119:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0198 A[Catch: all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:3:0x0014, B:8:0x0028, B:12:0x0043, B:16:0x0050, B:26:0x00b0, B:50:0x0119, B:52:0x011d, B:56:0x0140, B:72:0x0180, B:76:0x0193, B:80:0x01a0, B:82:0x01ba, B:84:0x01c0, B:113:0x028d, B:114:0x029c, B:93:0x01e0, B:96:0x0211, B:98:0x0217, B:100:0x0227, B:102:0x022d, B:105:0x0244, B:107:0x024a, B:110:0x026d, B:112:0x0273, B:77:0x0198, B:78:0x019e, B:59:0x014d, B:62:0x0157, B:63:0x015b, B:65:0x0161, B:67:0x016d, B:69:0x0173, B:29:0x00b7, B:33:0x00da, B:36:0x00e4, B:37:0x00ec, B:38:0x00ed, B:39:0x00f1, B:41:0x00f7, B:43:0x0103, B:45:0x0109, B:13:0x0048, B:14:0x004e, B:17:0x006a, B:18:0x0077, B:19:0x0078, B:21:0x0086, B:24:0x0095), top: B:119:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x019f  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ba A[Catch: all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:3:0x0014, B:8:0x0028, B:12:0x0043, B:16:0x0050, B:26:0x00b0, B:50:0x0119, B:52:0x011d, B:56:0x0140, B:72:0x0180, B:76:0x0193, B:80:0x01a0, B:82:0x01ba, B:84:0x01c0, B:113:0x028d, B:114:0x029c, B:93:0x01e0, B:96:0x0211, B:98:0x0217, B:100:0x0227, B:102:0x022d, B:105:0x0244, B:107:0x024a, B:110:0x026d, B:112:0x0273, B:77:0x0198, B:78:0x019e, B:59:0x014d, B:62:0x0157, B:63:0x015b, B:65:0x0161, B:67:0x016d, B:69:0x0173, B:29:0x00b7, B:33:0x00da, B:36:0x00e4, B:37:0x00ec, B:38:0x00ed, B:39:0x00f1, B:41:0x00f7, B:43:0x0103, B:45:0x0109, B:13:0x0048, B:14:0x004e, B:17:0x006a, B:18:0x0077, B:19:0x0078, B:21:0x0086, B:24:0x0095), top: B:119:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:95:0x0208  */
    /* JADX WARN: Code duplicated, block: B:97:0x0216  */
    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        Editable text;
        Iterator it;
        EditText editText;
        Editable text2;
        boolean z;
        EditText editText2;
        Editable text3;
        int length;
        EditText editText3;
        Editable text4;
        Citizenship citizenship;
        String strName;
        MembershipType membershipType;
        String strName2;
        EditText editText4;
        Editable text5;
        EditText editText5;
        Editable text6;
        int i;
        List listListOf;
        Iterator it2;
        EditText editText6;
        Editable text7;
        int i2;
        Editable text8;
        IndonesianMigrantWorkerRegistrationActivity indonesianMigrantWorkerRegistrationActivity = (IndonesianMigrantWorkerRegistrationActivity) objArr[0];
        boolean z2 = true;
        ActivityIndonesianMigrantWorkerRegistrationBinding activityIndonesianMigrantWorkerRegistrationBinding = (ActivityIndonesianMigrantWorkerRegistrationBinding) objArr[1];
        int i3 = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3((View) objArr[2]);
        try {
            Object obj = null;
            if (indonesianMigrantWorkerRegistrationActivity.asBinder) {
                int i4 = notify + 99;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    indonesianMigrantWorkerRegistrationActivity.d = "-";
                    indonesianMigrantWorkerRegistrationActivity.INotificationSideChannelStub().tilIdPassport.getEditText();
                    throw null;
                }
                indonesianMigrantWorkerRegistrationActivity.d = "-";
                EditText editText7 = indonesianMigrantWorkerRegistrationActivity.INotificationSideChannelStub().tilIdPassport.getEditText();
                if (editText7 != null) {
                    int i5 = notify + 79;
                    onTransact = i5 % 128;
                    if (i5 % 2 != 0) {
                        editText7.getText();
                        obj.hashCode();
                        throw null;
                    }
                    text8 = editText7.getText();
                } else {
                    text8 = null;
                }
                String upperCase = StringsKt.trim((CharSequence) String.valueOf(text8)).toString().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                indonesianMigrantWorkerRegistrationActivity.asInterface = upperCase;
            } else {
                EditText editText8 = indonesianMigrantWorkerRegistrationActivity.INotificationSideChannelStub().tilIdentityNumber.getEditText();
                if (editText8 != null) {
                    text = editText8.getText();
                    int i6 = notify + 55;
                    onTransact = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    text = null;
                }
                indonesianMigrantWorkerRegistrationActivity.d = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
                indonesianMigrantWorkerRegistrationActivity.asInterface = "-";
                int i8 = notify + 55;
                onTransact = i8 % 128;
                int i9 = i8 % 2;
            }
            if (!indonesianMigrantWorkerRegistrationActivity.asBinder) {
                List listListOf2 = CollectionsKt.listOf((Object[]) new TextInputLayout[]{activityIndonesianMigrantWorkerRegistrationBinding.tilIdentityNumber, activityIndonesianMigrantWorkerRegistrationBinding.tilFullName, activityIndonesianMigrantWorkerRegistrationBinding.tilBirthDate});
                if (listListOf2 instanceof Collection) {
                    int i10 = onTransact + 15;
                    notify = i10 % 128;
                    if (i10 % 2 == 0) {
                        listListOf2.isEmpty();
                        obj.hashCode();
                        throw null;
                    }
                    if (!listListOf2.isEmpty()) {
                        it = listListOf2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                editText = ((TextInputLayout) it.next()).getEditText();
                                if (editText != null) {
                                    text2 = editText.getText();
                                } else {
                                    text2 = null;
                                }
                                if (String.valueOf(text2).length() > 0) {
                                }
                            }
                        }
                    }
                } else {
                    it = listListOf2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            editText = ((TextInputLayout) it.next()).getEditText();
                            if (editText != null) {
                                text2 = editText.getText();
                            } else {
                                text2 = null;
                            }
                            if (String.valueOf(text2).length() > 0) {
                            }
                        }
                    }
                }
                z = true;
                if (indonesianMigrantWorkerRegistrationActivity.asBinder) {
                    z2 = false;
                    break;
                }
                listListOf = CollectionsKt.listOf((Object[]) new TextInputLayout[]{activityIndonesianMigrantWorkerRegistrationBinding.tilIdPassport, activityIndonesianMigrantWorkerRegistrationBinding.tilFullName, activityIndonesianMigrantWorkerRegistrationBinding.tilBirthDate});
                if (listListOf instanceof Collection) {
                    i2 = notify + 113;
                    onTransact = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i11 = 23 / 0;
                        if (listListOf.isEmpty()) {
                            it2 = listListOf.iterator();
                            while (it2.hasNext()) {
                                editText6 = ((TextInputLayout) it2.next()).getEditText();
                                if (editText6 != null) {
                                    text7 = editText6.getText();
                                } else {
                                    text7 = null;
                                }
                                if (String.valueOf(text7).length() <= 0) {
                                    z2 = false;
                                    break;
                                }
                            }
                        }
                    } else if (listListOf.isEmpty()) {
                        it2 = listListOf.iterator();
                        while (it2.hasNext()) {
                            editText6 = ((TextInputLayout) it2.next()).getEditText();
                            if (editText6 != null) {
                                text7 = editText6.getText();
                            } else {
                                text7 = null;
                            }
                            if (String.valueOf(text7).length() <= 0) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                } else {
                    it2 = listListOf.iterator();
                    while (it2.hasNext()) {
                        editText6 = ((TextInputLayout) it2.next()).getEditText();
                        if (editText6 != null) {
                            text7 = editText6.getText();
                        } else {
                            text7 = null;
                        }
                        if (String.valueOf(text7).length() <= 0) {
                            z2 = false;
                            break;
                        }
                    }
                }
                editText2 = activityIndonesianMigrantWorkerRegistrationBinding.tilIdPassport.getEditText();
                if (editText2 != null) {
                    i = notify + 81;
                    onTransact = i % 128;
                    if (i % 2 == 0) {
                        editText2.getText();
                        obj.hashCode();
                        throw null;
                    }
                    text3 = editText2.getText();
                } else {
                    text3 = null;
                }
                length = StringsKt.trim((CharSequence) String.valueOf(text3)).toString().length();
                editText3 = activityIndonesianMigrantWorkerRegistrationBinding.tilIdentityNumber.getEditText();
                if (editText3 != null) {
                    text4 = editText3.getText();
                } else {
                    text4 = null;
                }
                int length2 = StringsKt.trim((CharSequence) String.valueOf(text4)).toString().length();
                if (!z && !z2) {
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Silakan lengkapi data diri anda terlebih dahulu.", 0).show();
                } else if (length < 6 || length2 == 16) {
                    setSplitTrack setsplittrack = (setSplitTrack) indonesianMigrantWorkerRegistrationActivity.b.getValue();
                    Context applicationContext = indonesianMigrantWorkerRegistrationActivity.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                    String string = Settings.Secure.getString(applicationContext.getContentResolver(), "android_id");
                    Intrinsics.checkExpressionValueIsNotNull(string, "");
                    citizenship = ((RegisteredMemberRegistration) indonesianMigrantWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (citizenship != null) {
                        int i12 = onTransact + 11;
                        notify = i12 % 128;
                        int i13 = i12 % 2;
                        strName = citizenship.name();
                    } else {
                        strName = null;
                    }
                    String strValueOf = String.valueOf(strName);
                    membershipType = ((RegisteredMemberRegistration) indonesianMigrantWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (membershipType != null) {
                        strName2 = membershipType.name();
                    } else {
                        strName2 = null;
                    }
                    String strValueOf2 = String.valueOf(strName2);
                    editText4 = activityIndonesianMigrantWorkerRegistrationBinding.tilFullName.getEditText();
                    if (editText4 != null) {
                        int i14 = onTransact + 17;
                        notify = i14 % 128;
                        int i15 = i14 % 2;
                        text5 = editText4.getText();
                    } else {
                        text5 = null;
                    }
                    String string2 = StringsKt.trim((CharSequence) String.valueOf(text5)).toString();
                    String str = indonesianMigrantWorkerRegistrationActivity.d;
                    String str2 = indonesianMigrantWorkerRegistrationActivity.asInterface;
                    editText5 = activityIndonesianMigrantWorkerRegistrationBinding.tilBirthDate.getEditText();
                    if (editText5 != null) {
                        int i16 = onTransact + 125;
                        notify = i16 % 128;
                        int i17 = i16 % 2;
                        text6 = editText5.getText();
                    } else {
                        text6 = null;
                    }
                    setsplittrack.b(new MembershipCheckRequest(string, strValueOf, strValueOf2, "", string2, str, str2, StringsKt.trim((CharSequence) String.valueOf(text6)).toString()));
                } else {
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Silakan lengkapi data diri anda terlebih dahulu.", 0).show();
                }
                ViewPortBuilder.b();
                return null;
            }
            z = false;
            if (indonesianMigrantWorkerRegistrationActivity.asBinder) {
                z2 = false;
                break;
            }
            listListOf = CollectionsKt.listOf((Object[]) new TextInputLayout[]{activityIndonesianMigrantWorkerRegistrationBinding.tilIdPassport, activityIndonesianMigrantWorkerRegistrationBinding.tilFullName, activityIndonesianMigrantWorkerRegistrationBinding.tilBirthDate});
            if (listListOf instanceof Collection) {
                i2 = notify + 113;
                onTransact = i2 % 128;
                if (i2 % 2 != 0) {
                    int i18 = 23 / 0;
                    if (listListOf.isEmpty()) {
                        it2 = listListOf.iterator();
                        while (it2.hasNext()) {
                            editText6 = ((TextInputLayout) it2.next()).getEditText();
                            if (editText6 != null) {
                                text7 = editText6.getText();
                            } else {
                                text7 = null;
                            }
                            if (String.valueOf(text7).length() <= 0) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                } else if (listListOf.isEmpty()) {
                    it2 = listListOf.iterator();
                    while (it2.hasNext()) {
                        editText6 = ((TextInputLayout) it2.next()).getEditText();
                        if (editText6 != null) {
                            text7 = editText6.getText();
                        } else {
                            text7 = null;
                        }
                        if (String.valueOf(text7).length() <= 0) {
                            z2 = false;
                            break;
                        }
                    }
                }
            } else {
                it2 = listListOf.iterator();
                while (it2.hasNext()) {
                    editText6 = ((TextInputLayout) it2.next()).getEditText();
                    if (editText6 != null) {
                        text7 = editText6.getText();
                    } else {
                        text7 = null;
                    }
                    if (String.valueOf(text7).length() <= 0) {
                        z2 = false;
                        break;
                    }
                }
            }
            editText2 = activityIndonesianMigrantWorkerRegistrationBinding.tilIdPassport.getEditText();
            if (editText2 != null) {
                i = notify + 81;
                onTransact = i % 128;
                if (i % 2 == 0) {
                    editText2.getText();
                    obj.hashCode();
                    throw null;
                }
                text3 = editText2.getText();
            } else {
                text3 = null;
            }
            length = StringsKt.trim((CharSequence) String.valueOf(text3)).toString().length();
            editText3 = activityIndonesianMigrantWorkerRegistrationBinding.tilIdentityNumber.getEditText();
            if (editText3 != null) {
                text4 = editText3.getText();
            } else {
                text4 = null;
            }
            int length3 = StringsKt.trim((CharSequence) String.valueOf(text4)).toString().length();
            if (!z) {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Silakan lengkapi data diri anda terlebih dahulu.", 0).show();
                ViewPortBuilder.b();
                return null;
            }
            if (length < 6) {
            }
            setSplitTrack setsplittrack2 = (setSplitTrack) indonesianMigrantWorkerRegistrationActivity.b.getValue();
            Context applicationContext2 = indonesianMigrantWorkerRegistrationActivity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
            String string3 = Settings.Secure.getString(applicationContext2.getContentResolver(), "android_id");
            Intrinsics.checkExpressionValueIsNotNull(string3, "");
            citizenship = ((RegisteredMemberRegistration) indonesianMigrantWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (citizenship != null) {
                int i19 = onTransact + 11;
                notify = i19 % 128;
                int i110 = i19 % 2;
                strName = citizenship.name();
            } else {
                strName = null;
            }
            String strValueOf3 = String.valueOf(strName);
            membershipType = ((RegisteredMemberRegistration) indonesianMigrantWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (membershipType != null) {
                strName2 = membershipType.name();
            } else {
                strName2 = null;
            }
            String strValueOf4 = String.valueOf(strName2);
            editText4 = activityIndonesianMigrantWorkerRegistrationBinding.tilFullName.getEditText();
            if (editText4 != null) {
                int i111 = onTransact + 17;
                notify = i111 % 128;
                int i112 = i111 % 2;
                text5 = editText4.getText();
            } else {
                text5 = null;
            }
            String string4 = StringsKt.trim((CharSequence) String.valueOf(text5)).toString();
            String str3 = indonesianMigrantWorkerRegistrationActivity.d;
            String str4 = indonesianMigrantWorkerRegistrationActivity.asInterface;
            editText5 = activityIndonesianMigrantWorkerRegistrationBinding.tilBirthDate.getEditText();
            if (editText5 != null) {
                int i113 = onTransact + 125;
                notify = i113 % 128;
                int i114 = i113 % 2;
                text6 = editText5.getText();
            } else {
                text6 = null;
            }
            setsplittrack2.b(new MembershipCheckRequest(string3, strValueOf3, strValueOf4, "", string4, str3, str4, StringsKt.trim((CharSequence) String.valueOf(text6)).toString()));
            ViewPortBuilder.b();
            return null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit g() {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 53;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ RegisteredMemberRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault2(IndonesianMigrantWorkerRegistrationActivity indonesianMigrantWorkerRegistrationActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Parcelable parcelableExtra = indonesianMigrantWorkerRegistrationActivity.getIntent().getParcelableExtra("registration_data");
        Intrinsics.checkNotNull(parcelableExtra);
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) parcelableExtra;
        int i4 = notify + 3;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return registeredMemberRegistration;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(ActivityIndonesianMigrantWorkerRegistrationBinding activityIndonesianMigrantWorkerRegistrationBinding, IndonesianMigrantWorkerRegistrationActivity indonesianMigrantWorkerRegistrationActivity, RadioGroup radioGroup, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(radioGroup, "");
        if (i != activityIndonesianMigrantWorkerRegistrationBinding.rbNIK.getId()) {
            if (i == activityIndonesianMigrantWorkerRegistrationBinding.rbPaspor.getId()) {
                activityIndonesianMigrantWorkerRegistrationBinding.tilIdPassport.setVisibility(0);
                activityIndonesianMigrantWorkerRegistrationBinding.tilIdentityNumber.setVisibility(8);
                indonesianMigrantWorkerRegistrationActivity.asBinder = true;
                indonesianMigrantWorkerRegistrationActivity.d = "";
                indonesianMigrantWorkerRegistrationActivity.asInterface = "";
                EditText editText = activityIndonesianMigrantWorkerRegistrationBinding.tilIdPassport.getEditText();
                if (editText != null) {
                    int i3 = onTransact + 39;
                    notify = i3 % 128;
                    if (i3 % 2 == 0) {
                        editText.requestFocus();
                        int i4 = 57 / 0;
                    } else {
                        editText.requestFocus();
                    }
                }
                indonesianMigrantWorkerRegistrationActivity.d();
                return;
            }
            return;
        }
        activityIndonesianMigrantWorkerRegistrationBinding.tilIdPassport.setVisibility(8);
        activityIndonesianMigrantWorkerRegistrationBinding.tilIdentityNumber.setVisibility(0);
        indonesianMigrantWorkerRegistrationActivity.asBinder = false;
        indonesianMigrantWorkerRegistrationActivity.d = "";
        indonesianMigrantWorkerRegistrationActivity.asInterface = "";
        EditText editText2 = activityIndonesianMigrantWorkerRegistrationBinding.tilIdentityNumber.getEditText();
        if (editText2 != null) {
            int i5 = notify + 5;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                editText2.requestFocus();
                throw null;
            }
            editText2.requestFocus();
            int i6 = onTransact + 15;
            notify = i6 % 128;
            int i7 = i6 % 2;
        }
        indonesianMigrantWorkerRegistrationActivity.d();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(IndonesianMigrantWorkerRegistrationActivity indonesianMigrantWorkerRegistrationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i;
        int i2 = 2 % 2;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                indonesianMigrantWorkerRegistrationActivity.IconCompatParcelizer();
                MembershipCheckItem membershipCheckItem = (MembershipCheckItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) indonesianMigrantWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                String str = indonesianMigrantWorkerRegistrationActivity.d;
                String str2 = indonesianMigrantWorkerRegistrationActivity.asInterface;
                EditText editText = indonesianMigrantWorkerRegistrationActivity.INotificationSideChannelStub().tilFullName.getEditText();
                String string = StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString();
                EditText editText2 = indonesianMigrantWorkerRegistrationActivity.INotificationSideChannelStub().tilBirthDate.getEditText();
                RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, "", string, str, null, str2, null, null, StringsKt.trim((CharSequence) String.valueOf(editText2 != null ? editText2.getText() : null)).toString(), membershipCheckItem.getCheckSum(), null, membershipCheckItem.getSignature(), null, null, null, null, null, null, null, 8342815);
                EmailVerificationActivity.Companion companion = EmailVerificationActivity.INSTANCE;
                EmailVerificationActivity.Companion.b(indonesianMigrantWorkerRegistrationActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i3 = onTransact + 121;
                notify = i3 % 128;
                int i4 = i3 % 2;
                indonesianMigrantWorkerRegistrationActivity.IconCompatParcelizer();
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                String string2 = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
                String string3 = indonesianMigrantWorkerRegistrationActivity.getString(R.string.error_data_membership_not_found);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                if (StringsKt.contains$default((CharSequence) string2, (CharSequence) string3, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString(), (CharSequence) "Data Kepesertaan tidak ditemukan", false, 2, (Object) null)) {
                    getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
                    String string4 = indonesianMigrantWorkerRegistrationActivity.getString(R.string.title_data_membership_not_found);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    String string5 = indonesianMigrantWorkerRegistrationActivity.getString(R.string.message_membership_not_found);
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    String string6 = indonesianMigrantWorkerRegistrationActivity.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string6, "");
                    getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string4, string5, string6, new Function0() { // from class: getCloseButtonPosition
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IndonesianMigrantWorkerRegistrationActivity.g();
                        }
                    }, 96);
                    FragmentManager supportFragmentManager = indonesianMigrantWorkerRegistrationActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                    if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        i = notify + 45;
                    }
                } else {
                    int i5 = notify + 19;
                    onTransact = i5 % 128;
                    int i6 = i5 % 2;
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(indonesianMigrantWorkerRegistrationActivity, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                    i = notify + 43;
                }
                onTransact = i % 128;
                int i7 = i % 2;
            }
        } else {
            int i8 = onTransact + 95;
            notify = i8 % 128;
            int i9 = i8 % 2;
            indonesianMigrantWorkerRegistrationActivity.MediaBrowserCompat();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(IndonesianMigrantWorkerRegistrationActivity indonesianMigrantWorkerRegistrationActivity, int i, int i2, int i3) {
        int i4 = 2 % 2;
        indonesianMigrantWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.set(1, i);
        indonesianMigrantWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.set(2, i2);
        indonesianMigrantWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.set(5, i3);
        indonesianMigrantWorkerRegistrationActivity.INotificationSideChannelStub().edtBirthDate.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(indonesianMigrantWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getTime()));
        int i5 = onTransact + 41;
        notify = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 56 / 0;
        }
    }

    public static /* synthetic */ void b(final IndonesianMigrantWorkerRegistrationActivity indonesianMigrantWorkerRegistrationActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: getInitialActivityWidthPx
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                    IndonesianMigrantWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, i2, i3, i4);
                }
            }, indonesianMigrantWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(1), indonesianMigrantWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(2), indonesianMigrantWorkerRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(5)).show();
            ViewPortBuilder.b();
            int i2 = onTransact + 93;
            notify = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void b(IndonesianMigrantWorkerRegistrationActivity indonesianMigrantWorkerRegistrationActivity, ActivityIndonesianMigrantWorkerRegistrationBinding activityIndonesianMigrantWorkerRegistrationBinding, View view) throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(new Object[]{indonesianMigrantWorkerRegistrationActivity, activityIndonesianMigrantWorkerRegistrationBinding, view}, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 775847877, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -775847877);
    }

    static {
        cancel = 0;
        INotificationSideChannel();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannel + 27;
        cancel = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = notify + 57;
        onTransact = i2 % 128;
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
        int i2 = notify + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 61 / 0;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(new Object[]{this}, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 70090839 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), 1596529444, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1596529442);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int iTuitionPaymentFragmentbindingInflater1 = ProgramType.b.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = ProgramType.b.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentbindingInflater1(new Object[]{this, bundle}, ProgramType.b.TuitionPaymentFragmentbindingInflater1(), NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 986760339, iTuitionPaymentFragmentbindingInflater2, iTuitionPaymentFragmentbindingInflater1, -986760336);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = notify + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
        int i4 = notify + 35;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws IllegalAccessException {
        int iCodePointAt = 1291408746 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_mandiri_clickpay).substring(1, 3).codePointAt(0);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(new Object[]{this, context}, 1260798313 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_tablet_step5).substring(28, 29).codePointAt(0), ProgramType.b.TuitionPaymentFragmentbindingInflater1(), 1204272054, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iCodePointAt, -1204272053);
    }

    static void INotificationSideChannel() {
        asInterface = new char[]{60045, 60058, 60063, 60055, 60053, 60048, 60041, 60054, 60040, 60043, 60083, 60117, 60050, 60056, 60051, 60049, 60044, 60062, 60073, 60047, 60034, 60088, 60052, 60072, 60060};
        asBinder = (char) 57188;
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
    private static java.lang.String $$i(byte r6, int r7, int r8) {
        /*
            int r8 = r8 + 113
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = com.bpjstku.presentation.membership.registration.registeredmember.IndonesianMigrantWorkerRegistrationActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r6
            r8 = r7
            r3 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L28:
            int r7 = r7 + r4
            int r8 = r8 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.registeredmember.IndonesianMigrantWorkerRegistrationActivity.$$i(byte, int, int):java.lang.String");
    }
}
