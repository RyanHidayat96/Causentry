package com.bpjstku.presentation.membership.accountactivation;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.registration.general.model.request.UpdateActivationRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipPhotoPersonForInsert;
import com.bpjstku.databinding.ActivityRegistrationActivationPasswordBinding;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.presentation.membership.accountactivation.RegistrationActivationPasswordActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.util.constant.Citizenship;
import com.bpjstku.util.viewbinding.BindingPassiveFormActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.messaging.FirebaseMessaging;
import com.nbs.utils.exts.ViewExtKt$onTextChange$2;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accessconfigureInstanceInternal;
import defpackage.accessgetMCameraInfoMapp;
import defpackage.captureSingleRequest;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.mapPoint;
import defpackage.onScroll;
import defpackage.r8lambda_rcqWHl69wN3lvwkykRzEOONbC0;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setInactive;
import defpackage.setSplitTrack;
import defpackage.suspendUseCases;
import defpackage.unregisterLifecycle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004R\u0015\u0010\u0006\u001a\u00020\r8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0015R\u0014\u0010\u0011\u001a\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0018"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/RegistrationActivationPasswordActivity;", "Lcom/bpjstku/util/viewbinding/BindingPassiveFormActivity;", "Lcom/bpjstku/databinding/ActivityRegistrationActivationPasswordBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "LsetSplitTrack;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RegistrationActivationPasswordActivity extends BindingPassiveFormActivity<ActivityRegistrationActivationPasswordBinding> {
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private RegisteredMemberRegistration TuitionPaymentFragmentbindingInflater1;
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: ActionMenuPresenterOverflowPopup
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RegistrationActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });
    private static final byte[] $$c = {25, 31, 20, 1};
    private static final int $$f = 112;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {65, -122, -65, 2, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 226;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f501a = 1;
    private static int asInterface = 0;
    private static int asBinder = 1;

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -352724485
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(java.lang.Object[] r7, int r8, int r9, int r10, int r11, int r12, int r13) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(java.lang.Object[], int, int, int, int, int, int):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.accountactivation.RegistrationActivationPasswordActivity.$$a
            int r8 = r8 + 4
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r9 = 53 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r8 = r9
            r5 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L29:
            int r3 = r3 + 1
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-11)
            r8 = r3
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationPasswordActivity.c(short, short, int, java.lang.Object[]):void");
    }

    public RegistrationActivationPasswordActivity() {
        final RegistrationActivationPasswordActivity registrationActivationPasswordActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationPasswordActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final setSplitTrack invoke() {
                ComponentCallbacks componentCallbacks = registrationActivationPasswordActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(setSplitTrack.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationPasswordActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/RegistrationActivationPasswordActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p1", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(Context p0, RegisteredMemberRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, RegistrationActivationPasswordActivity.class, new Pair[]{TuplesKt.to("registration_data", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity
    public final Function1<LayoutInflater, ActivityRegistrationActivationPasswordBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        RegistrationActivationPasswordActivity$bindingInflater$1 registrationActivationPasswordActivity$bindingInflater$1 = RegistrationActivationPasswordActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = asInterface + 33;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return registrationActivationPasswordActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityRegistrationActivationPasswordBinding activityRegistrationActivationPasswordBindingOnTransact = onTransact();
        activityRegistrationActivationPasswordBindingOnTransact.btnNext.setOnClickListener(new View.OnClickListener() { // from class: ActionMenuPresenterSavedState
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws IllegalAccessException {
                RegistrationActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this.TuitionPaymentFragmentbindingInflater1, activityRegistrationActivationPasswordBindingOnTransact, view}, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -687748769, 687748769, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        });
        TextInputLayout textInputLayout = activityRegistrationActivationPasswordBindingOnTransact.tilPassword;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        Function1 function1 = new Function1() { // from class: generateOverflowButtonLayoutParams
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1(activityRegistrationActivationPasswordBindingOnTransact, (String) obj);
            }
        };
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new ViewExtKt$onTextChange$2(function1)));
        }
        TextInputLayout textInputLayout2 = activityRegistrationActivationPasswordBindingOnTransact.tilConfirmedPassword;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        Function1 function2 = new Function1() { // from class: measureChildForCells
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationActivationPasswordActivity.b(activityRegistrationActivationPasswordBindingOnTransact, (String) obj);
            }
        };
        EditText editText2 = textInputLayout2.getEditText();
        if (editText2 != null) {
            editText2.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new ViewExtKt$onTextChange$2(function2)));
            int i2 = asBinder + 45;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 / 5;
            }
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(this, new Observer() { // from class: ActionMenuPresenterSavedState1
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegistrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = asInterface + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        TextInputLayout textInputLayout = onTransact().tilPassword;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Minimal harus 8 karakter", 8, null), new accessconfigureInstanceInternal("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[\\\\\\/%§\"&“|`´}{°><:.;#')(@_$\"!?*=^-]).{8,}$", "Harus terdiri dari 1 huruf besar, huruf kecil, angka, dan karakter khusus")})));
        TextInputLayout textInputLayout2 = onTransact().tilConfirmedPassword;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string2 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = getString(R.string.error_unmatch_password);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string2), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Minimal harus 8 karakter", 8, null), new r8lambda_rcqWHl69wN3lvwkykRzEOONbC0(new Function0() { // from class: ActionMenuPresenterPopupPresenterCallback
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(RegistrationActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            }
        }, string3)})));
        int i2 = asInterface + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        long j = 0;
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = $11 + 101;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 105;
                $10 = i10 % 128;
                int i11 = i10 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) ((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) - 1);
                        int iRed = 3291 - Color.red(0);
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 31;
                        byte b = $$c[3];
                        byte b2 = (byte) (b - 1);
                        byte b3 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iRed, windowTouchSlop, 1948206109, false, $$i(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i9++;
                    i2 = 2;
                    j = 0;
                    i4 = -1870535734;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i12 = $10 + 41;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 3 / 3;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i14 = 0;
            while (i14 < length3) {
                try {
                    Object[] objArr3 = new Object[i5];
                    objArr3[i6] = Integer.valueOf(iArr5[i14]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char defaultSize = (char) View.getDefaultSize(i6, i6);
                        int edgeSlop = 3291 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 31;
                        byte b4 = $$c[3];
                        byte b5 = (byte) (b4 - 1);
                        byte b6 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, edgeSlop, tapTimeout, 1948206109, false, $$i(b5, b6, (byte) (-b6)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i14] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i14++;
                    i5 = 1;
                    i6 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        int i15 = i6;
        System.arraycopy(iArr5, i15, iArr4, i15, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i16 = 17;
            for (int i17 = 1; i16 > i17; i17 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i16];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cArgb = (char) Color.argb(0, 0, 0, 0);
                    int longPressTimeout = 2559 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int keyRepeatDelay = 29 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    byte b7 = $$c[3];
                    byte b8 = (byte) (b7 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb, longPressTimeout, keyRepeatDelay, 683220507, false, $$i(b8, b8, (byte) (-b7)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i16--;
            }
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 28879), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 348, 25 - (ViewConfiguration.getEdgeSlop() >> 16), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
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

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrB$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1032;
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15;
            byte[] bArr = $$a;
            byte b = bArr[5];
            short s = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b, s, (byte) s, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iLastIndexOf, keyRepeatDelay, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{-1980650024, 566332504, -583882501, -1573090902, -2086568776, 1173289874, 1943767939, -1683084639, -30986008, 868174123, -1577052931, 1567957064, 1023984384, 1228108928}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_mandiri).substring(1, 3).codePointAt(1) - 99, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{-1282312271, -239551020, 775117400, 512165190, 1739433019, -1221501907, -846499880, -1632788652, 567767283, -541760152}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_credit_card_4).substring(1, 3).codePointAt(1) - 106, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1031;
            int i3 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(bArr2[5], (short) 52, b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, scrollDefaultDelay, i3, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                int trimmedLength = TextUtils.getTrimmedLength("") + 1031;
                int scrollBarSize = 15 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte b3 = $$a[7];
                short s2 = (short) (b3 | 104);
                Object[] objArr6 = new Object[1];
                c(b3, s2, (byte) (s2 >>> 1), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration, trimmedLength, scrollBarSize, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[3])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i6 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 902474010);
            int i7 = (((-1767977199) + ((800317438 | i6) * 184)) + (((~(i6 | 800278364)) | 244358318) * 184)) - 1218167076;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new int[]{1251036508, -1271877957, 514621733, -1776708054, 1605332167, -133931459, 1677761849, -1913684209, -1124541883, -1318934509}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.no_gojek_message).substring(35, 37).codePointAt(1) - 91, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new int[]{625479813, 1704455551, 149262259, -873797539, -715324130, 2080660364, 259133574, 498521631, 437596560, 1266506295}, 16 - KeyEvent.keyCodeFromString(""), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {2040780055};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.getDefaultSize(0, 0) + 46038), (KeyEvent.getMaxKeyCode() >> 16) + 1134, 18 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1218167076, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                    int iMyTid = 1031 - (Process.myTid() >> 22);
                    int iMyPid = (Process.myPid() >> 22) + 15;
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[5];
                    short s3 = bArr3[7];
                    Object[] objArr12 = new Object[1];
                    c(b4, s3, (byte) s3, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, iMyTid, iMyPid, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (View.resolveSizeAndState(0, 0, 0) + 45993), 1116 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                    int i10 = 1031 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int pressedStateDuration2 = 15 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte b5 = $$a[7];
                    short s4 = (short) (b5 | 104);
                    Object[] objArr13 = new Object[1];
                    c(b5, s4, (byte) (s4 >>> 1), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAxisFromString, i10, pressedStateDuration2, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new int[]{-1980650024, 566332504, -583882501, -1573090902, -2086568776, 1173289874, 1943767939, -1683084639, -30986008, 868174123, -1577052931, 1567957064, 1023984384, 1228108928}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new int[]{-1282312271, -239551020, 775117400, 512165190, 1739433019, -1221501907, -846499880, -1632788652, 567767283, -541760152}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto5).substring(8, 9).length() + 14, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char size = (char) View.MeasureSpec.getSize(0);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1032;
                        int iMyTid2 = 15 - (Process.myTid() >> 22);
                        byte[] bArr4 = $$a;
                        Object[] objArr16 = new Object[1];
                        c(bArr4[5], (short) 52, bArr4[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(size, iIndexOf, iMyTid2, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                        int iIndexOf2 = 1031 - TextUtils.indexOf("", "", 0);
                        int i11 = 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        byte[] bArr5 = $$a;
                        byte b6 = bArr5[5];
                        short s5 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        c(b6, s5, (byte) s5, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(deadChar, iIndexOf2, i11, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    int i12 = asInterface + 51;
                    asBinder = i12 % 128;
                    int i13 = i12 % 2;
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 == i14) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[3])[0];
            int i18 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i19 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            int i20 = i16 + 1272823593 + (((~(715862060 | i19)) | 286296978) * 576) + (((~((~i19) | 1002159038)) | 673845252) * 576) + 1698302080;
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr18[2])[0] = i22 ^ (i22 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i23 = ((int[]) objArr[2])[0];
            int i24 = ((int[]) objArr[3])[0];
            int i25 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i26 = ~iElapsedRealtime;
            int i27 = i23 + 106353603 + (((~(39577983 | i26)) | (~((-283858154) | iElapsedRealtime))) * 1900) + (((~(i26 | 283858153)) | (~(iElapsedRealtime | (-39577984)))) * (-950)) + (((~(iElapsedRealtime | 283858153)) | (~(i26 | (-39577984)))) * 950);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr19[2])[0] = i29 ^ (i29 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16807160);
            int iResolveSizeAndState = 1755 - View.resolveSizeAndState(0, 0, 0);
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 23;
            Object[] objArr20 = new Object[1];
            c($$a[5], (short) 104, (byte) 15, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cRgb, iResolveSizeAndState, maxKeyCode, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i30 = asBinder + 41;
            asInterface = i30 % 128;
            int i31 = i30 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cMyPid = (char) (29944 - (Process.myPid() >> 22));
                int iAxisFromString = 1754 - MotionEvent.axisFromString("");
                int capsMode = 23 - TextUtils.getCapsMode("", 0, 0);
                byte[] bArr6 = $$a;
                Object[] objArr21 = new Object[1];
                c(bArr6[5], (short) 52, bArr6[7], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cMyPid, iAxisFromString, capsMode, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrB$7879113 = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i32 = (-1457679845) + (((-1018558027) | elapsedCpuTime) * 614);
            int i33 = ~elapsedCpuTime;
            int i34 = i32 + (((~((-615580483) | i33)) | 256 | (~((-402978057) | i33))) * (-1228)) + (((~(i33 | (-402977801))) | (~((-615580227) | i33))) * 614) + 1076670718;
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i36 ^ (i36 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new int[]{1251036508, -1271877957, 514621733, -1776708054, 1605332167, -133931459, 1677761849, -1913684209, -1124541883, -1318934509}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new int[]{625479813, 1704455551, 149262259, -873797539, -715324130, 2080660364, 259133574, 498521631, 437596560, 1266506295}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {2040780055};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - Color.green(0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1725, 29 - ExpandableListView.getPackedPositionType(0L), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$7879113 = onScroll.b$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 1076670718, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char mode = (char) (29944 - View.MeasureSpec.getMode(0));
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1755;
                int maxKeyCode2 = 23 - (KeyEvent.getMaxKeyCode() >> 16);
                byte[] bArr7 = $$a;
                Object[] objArr26 = new Object[1];
                c(bArr7[5], (short) 52, bArr7[7], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(mode, scrollBarFadeDuration, maxKeyCode2, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(new int[]{-1980650024, 566332504, -583882501, -1573090902, -2086568776, 1173289874, 1943767939, -1683084639, -30986008, 868174123, -1577052931, 1567957064, 1023984384, 1228108928}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new int[]{-1282312271, -239551020, 775117400, 512165190, 1739433019, -1221501907, -846499880, -1632788652, 567767283, -541760152}, 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c2 = (char) (29945 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    int i37 = 1756 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int iResolveSizeAndState2 = 23 - View.resolveSizeAndState(0, 0, 0);
                    byte[] bArr8 = $$a;
                    byte b7 = bArr8[5];
                    Object[] objArr29 = new Object[1];
                    c(b7, (short) (b7 | 140), bArr8[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c2, i37, iResolveSizeAndState2, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char fadingEdgeLength = (char) (29944 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                    int touchSlop2 = 1755 - (ViewConfiguration.getTouchSlop() >> 8);
                    int iLastIndexOf2 = 22 - TextUtils.lastIndexOf("", '0');
                    Object[] objArr30 = new Object[1];
                    c($$a[5], (short) 104, (byte) 15, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(fadingEdgeLength, touchSlop2, iLastIndexOf2, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrB$7879113[0])[0] != ((int[]) objArrB$7879113[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrB$7879113[4];
            if (strArr5 == null) {
                throw null;
            }
            while (i2 < strArr5.length) {
                int i38 = asInterface + 51;
                asBinder = i38 % 128;
                if (i38 % 2 == 0) {
                    arrayList2.add(strArr5[i2]);
                    i2 += 111;
                } else {
                    arrayList2.add(strArr5[i2]);
                    i2++;
                }
            }
            throw null;
        }
        int i39 = asInterface + 49;
        asBinder = i39 % 128;
        int i40 = i39 % 2;
        int i41 = ((int[]) objArrB$7879113[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i42 = i41 + 803479586 + (((~((-273948737) | (~iIdentityHashCode))) | 61346310) * (-591)) + ((iIdentityHashCode | (-273948737)) * 591);
        int i43 = (i42 << 13) ^ i42;
        int i44 = i43 ^ (i43 >>> 17);
        ((int[]) objArr31[3])[0] = i44 ^ (i44 << 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00e5, code lost:
    
        if (r1 != (((((~((-1883097048) | r5)) | (~(r4 | 695958917))) * 959) - 2015043603) + (((~(r4 | (-1883097048))) | (~(r5 | 695958917))) * 959))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00e7, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.membership.accountactivation.RegistrationActivationPasswordActivity.asBinder + 5;
        com.bpjstku.presentation.membership.accountactivation.RegistrationActivationPasswordActivity.asInterface = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00f3, code lost:
    
        if ((r1 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f5, code lost:
    
        r0 = 47 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0101, code lost:
    
        throw new java.lang.RuntimeException("-1757494735");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004d, code lost:
    
        if (r1 == (((1284970612 + (((~(r4 | (-541458455))) | r6) * 590)) + (r6 * (-1180))) + (((~((-860784672) | r5)) | (~(r5 | (-1690772215)))) * 590))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0095, code lost:
    
        if (r1 == (((1430397288 + ((r5 | (~((-1261934448) | r6))) * (-1808))) + (((~((-277375121) | r4)) | (~(r6 | (-1107362664)))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN)) + ((((~(r4 | 1261934447)) | 154571784) | (~(431946904 | r6))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0097, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r5 = (java.lang.Object[]) null;
        r4 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 1251397280;
        r5 = ~r4;
     */
    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationPasswordActivity.onStart():void");
    }

    public static /* synthetic */ RegisteredMemberRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegistrationActivationPasswordActivity registrationActivationPasswordActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Parcelable parcelableExtra = registrationActivationPasswordActivity.getIntent().getParcelableExtra("registration_data");
            Intrinsics.checkNotNull(parcelableExtra);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Parcelable parcelableExtra2 = registrationActivationPasswordActivity.getIntent().getParcelableExtra("registration_data");
        Intrinsics.checkNotNull(parcelableExtra2);
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) parcelableExtra2;
        int i3 = asBinder + 119;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 75 / 0;
        }
        return registeredMemberRegistration;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    /* JADX WARN: Code duplicated, block: B:15:0x0072  */
    /* JADX WARN: Code duplicated, block: B:17:0x0083  */
    /* JADX WARN: Code duplicated, block: B:19:0x008e  */
    /* JADX WARN: Code duplicated, block: B:20:0x009a  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:31:0x0109  */
    /* JADX WARN: Code duplicated, block: B:33:0x011a  */
    /* JADX WARN: Code duplicated, block: B:34:0x011d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0154  */
    /* JADX WARN: Code duplicated, block: B:39:0x0169  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r3v31, types: [T, java.lang.String] */
    public static /* synthetic */ void b(RegistrationActivationPasswordActivity registrationActivationPasswordActivity, Task task) {
        CharSequence charSequence;
        List listSplit$default;
        final setSplitTrack setsplittrack;
        String str;
        String string;
        Citizenship citizenship;
        String strName;
        String str2;
        RegisteredMemberRegistration registeredMemberRegistration;
        String str3;
        final UpdateActivationRequest updateActivationRequest;
        final Ref.ObjectRef objectRef;
        RegisteredMemberRegistration registeredMemberRegistration2;
        String lowerCase;
        int i = 2 % 2;
        int i2 = asInterface + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(task, "");
        if (i3 == 0) {
            int i4 = 58 / 0;
            if (task.isSuccessful()) {
                charSequence = (CharSequence) task.getResult();
                if (charSequence != null) {
                    int i5 = asBinder + 87;
                    asInterface = i5 % 128;
                    int i6 = i5 % 2;
                    if (charSequence.length() != 0) {
                        int i7 = asBinder + 77;
                        asInterface = i7 % 128;
                        int i8 = i7 % 2;
                        RegisteredMemberRegistration registeredMemberRegistration3 = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                        Intrinsics.checkNotNull(registeredMemberRegistration3);
                        listSplit$default = StringsKt.split$default((CharSequence) String.valueOf(registeredMemberRegistration3.asInterface), new String[]{"#"}, false, 0, 6, (Object) null);
                        if (Intrinsics.areEqual(listSplit$default.get(1), ExifInterface.GPS_DIRECTION_TRUE)) {
                            setsplittrack = (setSplitTrack) registrationActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                            RegisteredMemberRegistration registeredMemberRegistration4 = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                            Intrinsics.checkNotNull(registeredMemberRegistration4);
                            str = registeredMemberRegistration4.TuitionPaymentFragmentbindingInflater1;
                            if (str != null) {
                                lowerCase = str.toLowerCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                                if (lowerCase != null) {
                                    string = StringsKt.trim((CharSequence) lowerCase).toString();
                                } else {
                                    string = null;
                                }
                            } else {
                                string = null;
                            }
                            RegisteredMemberRegistration registeredMemberRegistration5 = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                            Intrinsics.checkNotNull(registeredMemberRegistration5);
                            String str4 = registeredMemberRegistration5.d;
                            RegisteredMemberRegistration registeredMemberRegistration6 = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                            Intrinsics.checkNotNull(registeredMemberRegistration6);
                            String str5 = registeredMemberRegistration6.asBinder;
                            RegisteredMemberRegistration registeredMemberRegistration7 = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                            Intrinsics.checkNotNull(registeredMemberRegistration7);
                            citizenship = registeredMemberRegistration7.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            if (citizenship != null) {
                                strName = citizenship.name();
                            } else {
                                strName = null;
                            }
                            if (!(!Intrinsics.areEqual(strName, "WNI"))) {
                                str2 = (String) listSplit$default.get(0);
                            } else {
                                str2 = "-";
                            }
                            RegisteredMemberRegistration registeredMemberRegistration8 = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                            Intrinsics.checkNotNull(registeredMemberRegistration8);
                            String strValueOf = String.valueOf(registeredMemberRegistration8.g);
                            RegisteredMemberRegistration registeredMemberRegistration9 = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                            Intrinsics.checkNotNull(registeredMemberRegistration9);
                            String strValueOf2 = String.valueOf(registeredMemberRegistration9.cancelAll);
                            RegisteredMemberRegistration registeredMemberRegistration10 = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                            Intrinsics.checkNotNull(registeredMemberRegistration10);
                            String strValueOf3 = String.valueOf(registeredMemberRegistration10.notify);
                            RegisteredMemberRegistration registeredMemberRegistration11 = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                            Intrinsics.checkNotNull(registeredMemberRegistration11);
                            String strValueOf4 = String.valueOf(registeredMemberRegistration11.INotificationSideChannel);
                            registeredMemberRegistration = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                            Intrinsics.checkNotNull(registeredMemberRegistration);
                            if (Intrinsics.areEqual(String.valueOf(registeredMemberRegistration.a), "-")) {
                                str3 = "KTP";
                            } else {
                                registeredMemberRegistration2 = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                                Intrinsics.checkNotNull(registeredMemberRegistration2);
                                if (Intrinsics.areEqual(String.valueOf(registeredMemberRegistration2.a), "")) {
                                    str3 = "KTP";
                                } else {
                                    str3 = "PASSPORT";
                                }
                            }
                            RegisteredMemberRegistration registeredMemberRegistration12 = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                            Intrinsics.checkNotNull(registeredMemberRegistration12);
                            updateActivationRequest = new UpdateActivationRequest(str2, str4, str5, strValueOf3, string, strValueOf, strValueOf2, strValueOf4, str3, String.valueOf(registeredMemberRegistration12.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (String) task.getResult());
                            Intrinsics.checkNotNullParameter(updateActivationRequest, "");
                            objectRef = new Ref.ObjectRef();
                            objectRef.element = setsplittrack.connect.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            if (((CharSequence) objectRef.element).length() == 0) {
                                Intrinsics.checkNotNull(FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: getDisabledThemeAttrColor
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        setSplitTrack.TuitionPaymentFragmentbindingInflater1(objectRef, setsplittrack, updateActivationRequest, task2);
                                    }
                                }));
                                return;
                            }
                            setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1((String) objectRef.element, updateActivationRequest);
                        }
                    }
                }
            }
        } else if (task.isSuccessful()) {
            charSequence = (CharSequence) task.getResult();
            if (charSequence != null) {
                int i9 = asBinder + 87;
                asInterface = i9 % 128;
                int i10 = i9 % 2;
                if (charSequence.length() != 0) {
                    int i11 = asBinder + 77;
                    asInterface = i11 % 128;
                    int i12 = i11 % 2;
                    RegisteredMemberRegistration registeredMemberRegistration13 = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                    Intrinsics.checkNotNull(registeredMemberRegistration13);
                    listSplit$default = StringsKt.split$default((CharSequence) String.valueOf(registeredMemberRegistration13.asInterface), new String[]{"#"}, false, 0, 6, (Object) null);
                    if (Intrinsics.areEqual(listSplit$default.get(1), ExifInterface.GPS_DIRECTION_TRUE)) {
                        setsplittrack = (setSplitTrack) registrationActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                        RegisteredMemberRegistration registeredMemberRegistration14 = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                        Intrinsics.checkNotNull(registeredMemberRegistration14);
                        str = registeredMemberRegistration14.TuitionPaymentFragmentbindingInflater1;
                        if (str != null) {
                            lowerCase = str.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                            if (lowerCase != null) {
                                string = StringsKt.trim((CharSequence) lowerCase).toString();
                            } else {
                                string = null;
                            }
                        } else {
                            string = null;
                        }
                        RegisteredMemberRegistration registeredMemberRegistration15 = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                        Intrinsics.checkNotNull(registeredMemberRegistration15);
                        String str6 = registeredMemberRegistration15.d;
                        RegisteredMemberRegistration registeredMemberRegistration16 = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                        Intrinsics.checkNotNull(registeredMemberRegistration16);
                        String str7 = registeredMemberRegistration16.asBinder;
                        RegisteredMemberRegistration registeredMemberRegistration17 = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                        Intrinsics.checkNotNull(registeredMemberRegistration17);
                        citizenship = registeredMemberRegistration17.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (citizenship != null) {
                            strName = citizenship.name();
                        } else {
                            strName = null;
                        }
                        if (!(!Intrinsics.areEqual(strName, "WNI"))) {
                            str2 = (String) listSplit$default.get(0);
                        } else {
                            str2 = "-";
                        }
                        RegisteredMemberRegistration registeredMemberRegistration18 = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                        Intrinsics.checkNotNull(registeredMemberRegistration18);
                        String strValueOf5 = String.valueOf(registeredMemberRegistration18.g);
                        RegisteredMemberRegistration registeredMemberRegistration19 = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                        Intrinsics.checkNotNull(registeredMemberRegistration19);
                        String strValueOf6 = String.valueOf(registeredMemberRegistration19.cancelAll);
                        RegisteredMemberRegistration registeredMemberRegistration110 = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                        Intrinsics.checkNotNull(registeredMemberRegistration110);
                        String strValueOf7 = String.valueOf(registeredMemberRegistration110.notify);
                        RegisteredMemberRegistration registeredMemberRegistration111 = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                        Intrinsics.checkNotNull(registeredMemberRegistration111);
                        String strValueOf8 = String.valueOf(registeredMemberRegistration111.INotificationSideChannel);
                        registeredMemberRegistration = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                        Intrinsics.checkNotNull(registeredMemberRegistration);
                        if (Intrinsics.areEqual(String.valueOf(registeredMemberRegistration.a), "-")) {
                            registeredMemberRegistration2 = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                            Intrinsics.checkNotNull(registeredMemberRegistration2);
                            if (Intrinsics.areEqual(String.valueOf(registeredMemberRegistration2.a), "")) {
                                str3 = "PASSPORT";
                            } else {
                                str3 = "KTP";
                            }
                        } else {
                            str3 = "KTP";
                        }
                        RegisteredMemberRegistration registeredMemberRegistration112 = registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                        Intrinsics.checkNotNull(registeredMemberRegistration112);
                        updateActivationRequest = new UpdateActivationRequest(str2, str6, str7, strValueOf7, string, strValueOf5, strValueOf6, strValueOf8, str3, String.valueOf(registeredMemberRegistration112.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (String) task.getResult());
                        Intrinsics.checkNotNullParameter(updateActivationRequest, "");
                        objectRef = new Ref.ObjectRef();
                        objectRef.element = setsplittrack.connect.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        if (((CharSequence) objectRef.element).length() == 0) {
                            Intrinsics.checkNotNull(FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: getDisabledThemeAttrColor
                                @Override // com.google.android.gms.tasks.OnCompleteListener
                                public final void onComplete(Task task2) {
                                    setSplitTrack.TuitionPaymentFragmentbindingInflater1(objectRef, setsplittrack, updateActivationRequest, task2);
                                }
                            }));
                            return;
                        }
                        setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1((String) objectRef.element, updateActivationRequest);
                    }
                }
            }
        }
        int i13 = asBinder + 13;
        asInterface = i13 % 128;
        if (i13 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006c  */
    /* JADX WARN: Code duplicated, block: B:19:0x007c A[PHI: r8
  0x007c: PHI (r8v6 VirtualCameraAdapter1$asBinder) = (r8v1 VirtualCameraAdapter1$asBinder), (r8v11 VirtualCameraAdapter1$asBinder) binds: [B:17:0x006a, B:14:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(RegistrationActivationPasswordActivity registrationActivationPasswordActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        VirtualCameraAdapter1.asBinder asbinder;
        String str;
        int i = 2 % 2;
        int i2 = asInterface + 107;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            registrationActivationPasswordActivity.MediaBrowserCompat();
            str = "loading_registration_account_step_fifth_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i5 = i3 + 83;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                registrationActivationPasswordActivity.IconCompatParcelizer();
                asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                int i6 = 72 / 0;
                if (((BaseModel) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getB()) {
                    ActivationSuccessActivity.Companion companion = ActivationSuccessActivity.INSTANCE;
                    ActivationSuccessActivity.Companion.b(registrationActivationPasswordActivity, registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1);
                    registrationActivationPasswordActivity.d_();
                    str = "success_registration_account_step_fifth_result";
                } else {
                    registrationActivationPasswordActivity.IconCompatParcelizer();
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationActivationPasswordActivity, ((BaseModel) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getTuitionPaymentFragmentspecialinlinedviewModeldefault1(), null);
                    str = "failure_activation_account_step_fifth_result";
                }
            } else {
                registrationActivationPasswordActivity.IconCompatParcelizer();
                asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                if (((BaseModel) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getB()) {
                    ActivationSuccessActivity.Companion companion2 = ActivationSuccessActivity.INSTANCE;
                    ActivationSuccessActivity.Companion.b(registrationActivationPasswordActivity, registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1);
                    registrationActivationPasswordActivity.d_();
                    str = "success_registration_account_step_fifth_result";
                } else {
                    registrationActivationPasswordActivity.IconCompatParcelizer();
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationActivationPasswordActivity, ((BaseModel) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getTuitionPaymentFragmentspecialinlinedviewModeldefault1(), null);
                    str = "failure_activation_account_step_fifth_result";
                }
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i7 = i3 + 125;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            registrationActivationPasswordActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationActivationPasswordActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            str = "failure_registration_account_step_fifth_result";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_register_account", str));
        Intrinsics.checkNotNullParameter(registrationActivationPasswordActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        Editable text;
        final RegistrationActivationPasswordActivity registrationActivationPasswordActivity = (RegistrationActivationPasswordActivity) objArr[0];
        ActivityRegistrationActivationPasswordBinding activityRegistrationActivationPasswordBinding = (ActivityRegistrationActivationPasswordBinding) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Intrinsics.checkNotNull(view);
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, registrationActivationPasswordActivity);
            Object obj = null;
            if (registrationActivationPasswordActivity.INotificationSideChannel()) {
                int i2 = asBinder + 77;
                asInterface = i2 % 128;
                if (i2 % 2 != 0) {
                    activityRegistrationActivationPasswordBinding.tilPassword.getEditText();
                    obj.hashCode();
                    throw null;
                }
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) registrationActivationPasswordActivity.b.getValue();
                EditText editText = activityRegistrationActivationPasswordBinding.tilPassword.getEditText();
                if (editText != null) {
                    int i3 = asBinder + 89;
                    asInterface = i3 % 128;
                    if (i3 % 2 != 0) {
                        text = editText.getText();
                        int i4 = 99 / 0;
                    } else {
                        text = editText.getText();
                    }
                } else {
                    int i5 = asInterface + 107;
                    asBinder = i5 % 128;
                    int i6 = i5 % 2;
                    text = null;
                }
                registrationActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, null, null, StringsKt.trim((CharSequence) String.valueOf(text)).toString(), null, null, null, null, null, null, null, null, null, null, null, null, 8387583);
                FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: onForwardingStopped
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        RegistrationActivationPasswordActivity.b(this.b, task);
                    }
                });
            }
            ViewPortBuilder.b();
            return null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit b(ActivityRegistrationActivationPasswordBinding activityRegistrationActivationPasswordBinding, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        activityRegistrationActivationPasswordBinding.tilConfirmedPassword.setError(null);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 99;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(RegistrationActivationPasswordActivity registrationActivationPasswordActivity) {
        Editable text;
        int i = 2 % 2;
        int i2 = asInterface + 85;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        EditText editText = registrationActivationPasswordActivity.onTransact().tilPassword.getEditText();
        if (editText != null) {
            int i4 = asInterface + 115;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            text = editText.getText();
        } else {
            int i6 = asBinder + 85;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            text = null;
        }
        String strValueOf = String.valueOf(text);
        EditText editText2 = registrationActivationPasswordActivity.onTransact().tilConfirmedPassword.getEditText();
        return Intrinsics.areEqual(String.valueOf(editText2 != null ? editText2.getText() : null), strValueOf);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ActivityRegistrationActivationPasswordBinding activityRegistrationActivationPasswordBinding, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 == 0) {
            activityRegistrationActivationPasswordBinding.tilPassword.setError(null);
            return Unit.INSTANCE;
        }
        activityRegistrationActivationPasswordBinding.tilPassword.setError(null);
        Unit unit = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }

    static {
        g = 0;
        d();
        INSTANCE = new Companion(null);
        int i = f501a + 69;
        g = i % 128;
        if (i % 2 != 0) {
            int i2 = 80 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 113;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 43;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_registration_activation_password;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() throws IllegalAccessException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 154968693, -154968692, captureSingleRequest.b());
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        asInterface = i2 % 128;
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
        int i2 = asBinder + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, bundle}, captureSingleRequest.b(), captureSingleRequest.b(), captureSingleRequest.b(), -1913847813, 1913847815, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 959235621, captureSingleRequest.b(), captureSingleRequest.b(), 1156210342, -1156210339, captureSingleRequest.b());
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = asBinder + 71;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    static void d() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new int[]{624061444, -2116966819, 448434640, 1773408120, -586539085, -1870716862, -54528560, 1347809228, -1107632959, -2057894302, 2104421929, 2112263007, -1018981455, -253254837, -595919400, -1358503773, -1429375173, 2048260865};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, int r7, short r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.accountactivation.RegistrationActivationPasswordActivity.$$c
            int r6 = r6 * 4
            int r1 = 1 - r6
            int r8 = r8 + 4
            int r7 = r7 * 56
            int r7 = 122 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            int r8 = r8 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2d:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationPasswordActivity.$$i(short, int, short):java.lang.String");
    }
}
