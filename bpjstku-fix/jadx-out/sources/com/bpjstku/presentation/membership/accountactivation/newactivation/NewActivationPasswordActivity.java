package com.bpjstku.presentation.membership.accountactivation.newactivation;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.registration.general.model.request.NewActivationRequest;
import com.bpjstku.databinding.ActivityNewActivationPasswordBinding;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.registration.general.model.ValidationType;
import com.bpjstku.presentation.membership.accountactivation.ActivationSuccessActivity;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.utils.LocationAddressInfo;
import com.bpjstku.util.utils.UserLocationComplete;
import com.bpjstku.util.viewbinding.BindingPassiveFormActivity;
import com.google.android.gms.internal.auth.zzgx;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.Camera2CameraControlExternalSyntheticLambda4;
import defpackage.ExperimentalCamera2Interop;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accessconfigureInstanceInternal;
import defpackage.accessgetMCameraInfoMapp;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.getContentPaddingRight;
import defpackage.getEventTime;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.mapPoint;
import defpackage.onCaptureSessionEnd;
import defpackage.r8lambda_rcqWHl69wN3lvwkykRzEOONbC0;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setInactive;
import defpackage.setSplitTrack;
import defpackage.unregisterLifecycle;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.ReadAfterEOFException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0013\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0007\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0015\u0010\n\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00020\u001e8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010 R\u001a\u0010%\u001a\u00020\"8\u0015X\u0095D¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b\u0013\u0010$"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/newactivation/NewActivationPasswordActivity;", "Lcom/bpjstku/util/viewbinding/BindingPassiveFormActivity;", "Lcom/bpjstku/databinding/ActivityNewActivationPasswordBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "", "d", "()Z", "LsetSplitTrack;", "INotificationSideChannel", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/data/lib/PreferenceManager;", "cancel", "", "cancelAll", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "g", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "onTransact", "", "I", "()I", "notify"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NewActivationPasswordActivity extends BindingPassiveFormActivity<ActivityNewActivationPasswordBinding> {
    private static int INotificationSideChannelDefault;
    private static char INotificationSideChannelStub;
    private static char INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char notify;
    private static char onTransact;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private String g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy asBinder;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final int notify;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String asInterface;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String a;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private RegisteredMemberRegistration cancelAll;
    private static final byte[] $$c = {60, 80, 13, 34};
    private static final int $$f = 108;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {57, -50, -56, -93, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 90;
    private static int write = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int getInterfaceDescriptor = 1;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ValidationType.values().length];
            try {
                iArr[ValidationType.LENGTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValidationType.UPPER_LOWER_CASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValidationType.DIGIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ValidationType.SPECIAL_CHAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final /* synthetic */ class b implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        b(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(obj);
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1745431745
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static /* synthetic */ java.lang.Object TuitionPaymentFragmentbindingInflater1(int r7, int r8, int r9, java.lang.Object[] r10, int r11, int r12, int r13) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1(int, int, int, java.lang.Object[], int, int, int):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 197 - r7
            int r6 = r6 + 1
            byte[] r0 = com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity.$$a
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r4 = r0[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L28:
            int r8 = -r8
            int r7 = r7 + 1
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity.c(byte, int, byte, java.lang.Object[]):void");
    }

    public static final /* synthetic */ ActivityNewActivationPasswordBinding TuitionPaymentFragmentbindingInflater1(NewActivationPasswordActivity newActivationPasswordActivity) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ActivityNewActivationPasswordBinding activityNewActivationPasswordBindingOnTransact = newActivationPasswordActivity.onTransact();
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        int i5 = getInterfaceDescriptor + 101;
        RemoteActionCompatParcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 4 / 0;
        }
        return activityNewActivationPasswordBindingOnTransact;
    }

    public static final /* synthetic */ setSplitTrack TuitionPaymentFragmentspecialinlinedviewModeldefault3(NewActivationPasswordActivity newActivationPasswordActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        RemoteActionCompatParcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        setSplitTrack setsplittrack = (setSplitTrack) newActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        int i3 = RemoteActionCompatParcelizer + 11;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            return setsplittrack;
        }
        throw null;
    }

    public NewActivationPasswordActivity() {
        final NewActivationPasswordActivity newActivationPasswordActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final setSplitTrack invoke() {
                ComponentCallbacks componentCallbacks = newActivationPasswordActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(setSplitTrack.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        Lazy lazy = LazyKt.lazy(new NewActivationPasswordActivity$special$$inlined$inject$default$2(newActivationPasswordActivity));
        this.b = lazy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ((PreferenceManager) lazy.getValue()).getString("OCR_TRANSACTION_ID", "");
        this.asBinder = LazyKt.lazy(new Function0() { // from class: setShowDefaultActivity
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        });
        this.notify = R.layout.activity_new_activation_password;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/newactivation/NewActivationPasswordActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static int TuitionPaymentFragmentbindingInflater1;
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, RegisteredMemberRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) NewActivationPasswordActivity.class);
            intent.putExtra("registration_data", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            int i = TuitionPaymentFragmentbindingInflater1;
            int i2 = i % 8239190;
            TuitionPaymentFragmentbindingInflater1 = i + 1;
            if (i2 != 0) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iElapsedRealtime;
            return iElapsedRealtime;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity
    public final Function1<LayoutInflater, ActivityNewActivationPasswordBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        NewActivationPasswordActivity$bindingInflater$1 newActivationPasswordActivity$bindingInflater$1 = NewActivationPasswordActivity$bindingInflater$1.b;
        int i4 = RemoteActionCompatParcelizer + 21;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return newActivationPasswordActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        NewActivationPasswordActivity newActivationPasswordActivity = (NewActivationPasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 39;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int i4 = newActivationPasswordActivity.notify;
        if (i3 == 0) {
            int i5 = 19 / 0;
        }
        return Integer.valueOf(i4);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String strValueOf = String.valueOf(charSequence);
            setSplitTrack setsplittrackTuitionPaymentFragmentspecialinlinedviewModeldefault3 = NewActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(NewActivationPasswordActivity.this);
            Intrinsics.checkNotNullParameter(strValueOf, "");
            setsplittrackTuitionPaymentFragmentspecialinlinedviewModeldefault3.b.setValue(strValueOf);
            setsplittrackTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strValueOf));
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                break;
            }
            int i4 = $11 + 61;
            $10 = i4 % 128;
            int i5 = 58224;
            if (i4 % i2 != 0) {
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 1];
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            }
            int i6 = 0;
            while (i6 < 16) {
                int i7 = $10 + 3;
                $11 = i7 % 128;
                int i8 = i7 % i2;
                char c2 = cArr3[1];
                char c3 = cArr3[c];
                int i9 = (c3 + i5) ^ ((c3 << 4) + ((char) (((long) INotificationSideChannelStub) ^ 8611973335120459638L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(INotificationSideChannelStubProxy);
                    objArr2[i2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 47773);
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 468;
                        int iAlpha = 13 - Color.alpha(0);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, absoluteGravity, iAlpha, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    onCaptureSessionEnd oncapturesessionend2 = oncapturesessionend;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) onTransact) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(notify)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 47773), 467 - TextUtils.lastIndexOf("", '0', 0, 0), 12 - ((byte) KeyEvent.getModifierMetaStateMask()), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    int i11 = $11 + 125;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    oncapturesessionend = oncapturesessionend2;
                    i2 = 2;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            onCaptureSessionEnd oncapturesessionend3 = oncapturesessionend;
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend3, oncapturesessionend3};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), 2371 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44, -1312321721, false, $$i(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            oncapturesessionend = oncapturesessionend3;
            i2 = 2;
        }
        objArr[0] = new String(cArr2, 0, i);
        int i13 = $10 + 121;
        $11 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements TextWatcher {
        private static final byte[] $$c = {30, 17, -35, 104};
        private static final int $$f = 101;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {5, -91, 77, 46, 17, 3, -58, 59, 2, 24, -14, 8, 16, -3, -52, 56, 18, -5, 19, 2, -1, 0, -49, 73, 8, -3, -58, 64, 10, 11, -10, 18, 1, -8, 16, -57, 59, 16, 3, -7, 13, 10, -59, 74, -11, 17, 6, -6, -50, 41, 40, -3, -18, 24, 1, 23, -31, 21, 17, 6, -6, -60, 73, -2, 18, -5, 13, -2, -27, 54, -12, 14, 11, -75, 18};
        private static final int $$e = 28;
        private static final byte[] $$a = {43, 23, 22, -14, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 41;
        private static int asBinder = 0;
        private static int g = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {47487, 47474, 47484, 47470, 47473, 47479, 47410, 47469, 47437, 47463, 47468, 47483, 47475, 47453, 47476, 47485, 47477, 47472, 47438, 47455, 47466, 47436, 47480, 47467, 47478, 47481, 47448};
        private static int b = 2047719648;
        private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        private static boolean TuitionPaymentFragmentbindingInflater1 = true;

        /* JADX WARN: Code duplicated, block: B:10:0x002b  */
        /* JADX WARN: Code duplicated, block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 + 4
                int r8 = r8 * 3
                int r8 = 84 - r8
                byte[] r0 = com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$a
                int r7 = r7 * 15
                int r1 = 53 - r7
                byte[] r1 = new byte[r1]
                int r7 = 52 - r7
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r6
                r4 = r2
                goto L30
            L16:
                r3 = r2
                r5 = r8
                r8 = r6
                r6 = r5
            L1a:
                byte r4 = (byte) r6
                int r8 = r8 + 1
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L2b
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2b:
                r3 = r0[r8]
                r5 = r3
                r3 = r8
                r8 = r5
            L30:
                int r6 = r6 + r8
                int r6 = r6 + (-11)
                r8 = r3
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.a(int, byte, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(byte r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 71
                int r8 = 74 - r8
                byte[] r0 = com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$d
                int r7 = r7 * 71
                int r1 = r7 + 1
                int r6 = 99 - r6
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L2b
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L24:
                int r8 = r8 + 1
                r3 = r0[r8]
                r5 = r3
                r3 = r8
                r8 = r5
            L2b:
                int r6 = r6 + r8
                int r6 = r6 + (-5)
                r8 = r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d(byte, short, int, java.lang.Object[]):void");
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
            char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i3] = Integer.valueOf(cArr2[i4]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) i3;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - (ViewConfiguration.getEdgeSlop() >> 16)), 2994 - TextUtils.indexOf("", "", i3, i3), 17 - Color.red(i3), 1182129903, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i4++;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            float f = 0.0f;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 43325), View.MeasureSpec.getMode(0) + 253, 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            int i5 = 33602;
            int i6 = 1687675375;
            if (TuitionPaymentFragmentbindingInflater1) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cResolveOpacity = (char) (i5 - Drawable.resolveOpacity(0, 0));
                        int bitsPerPixel = 3084 - ImageFormat.getBitsPerPixel(0);
                        int i7 = (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 26;
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, bitsPerPixel, i7, -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    f = 0.0f;
                    i5 = 33602;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            int i8 = 0;
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i9 = $11 + 15;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 << 1) + getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] << i] - iIntValue);
                        Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3084, 26 - Color.red(0), -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    } else {
                        cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33602 - TextUtils.indexOf("", "", 0)), 3084 - MotionEvent.axisFromString(""), 26 - (ViewConfiguration.getLongPressTimeout() >> 16), -2146875848, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    }
                    i6 = 1687675375;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            while (true) {
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8;
                while (true) {
                    if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        objArr[0] = new String(cArr6);
                        return;
                    }
                    int i10 = $10 + 99;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 / 0) >>> getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] % i] * iIntValue);
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >>= 1;
                    }
                }
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                i8 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            }
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0210  */
        /* JADX WARN: Code duplicated, block: B:54:0x04c6 A[PHI: r3
  0x04c6: PHI (r3v74 android.widget.EditText) = (r3v73 android.widget.EditText), (r3v80 android.widget.EditText) binds: [B:53:0x04c4, B:50:0x04b5] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) throws Throwable {
            Object[] objArr;
            char c;
            EditText editText;
            int i = 2 % 2;
            String string = StringsKt.trim((CharSequence) String.valueOf(editable)).toString();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            int i2 = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char defaultSize = (char) View.getDefaultSize(0, 0);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 2268;
                int packedPositionGroup = 33 - ExpandableListView.getPackedPositionGroup(0L);
                byte[] bArr = $$a;
                byte b2 = bArr[5];
                byte b3 = bArr[7];
                Object[] objArr2 = new Object[1];
                a(b2, b3, b3, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, iLastIndexOf, packedPositionGroup, -887667012, false, (String) objArr2[0], null);
            }
            Editable text = null;
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(null, null, View.getDefaultSize(0, 0) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(null, null, (Process.myPid() >> 22) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 2267;
                int doubleTapTimeout = 33 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte b4 = $$a[7];
                Object[] objArr5 = new Object[1];
                a((byte) 51, b4, b4, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, touchSlop, doubleTapTimeout, -874156483, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char mode = (char) View.MeasureSpec.getMode(0);
                    int trimmedLength = 2267 - TextUtils.getTrimmedLength("");
                    int iRed = Color.red(0) + 33;
                    byte[] bArr2 = $$a;
                    byte b5 = bArr2[132];
                    byte b6 = bArr2[7];
                    Object[] objArr6 = new Object[1];
                    a((byte) 103, b5, b6, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mode, trimmedLength, iRed, -654680577, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i3 = ((int[]) objArr7[0])[0];
                int i4 = ((int[]) objArr7[3])[0];
                String[] strArr = (String[]) objArr7[1];
                int iNextInt = new Random().nextInt(1244241161);
                int i5 = ~iNextInt;
                int i6 = 1993297838 + (((~((-795249814) | i5)) | 13463502) * 519) + (((~(i5 | (-790790162))) | (~(804253663 | iNextInt))) * (-519)) + (((~(iNextInt | 13463502)) | 795249813) * 519) + 466816836;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
                c = 3;
            } else {
                Object[] objArr8 = new Object[1];
                c(null, null, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(null, null, Color.alpha(0) + 127, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i9 = g + 1;
                    int i10 = i9 % 128;
                    asBinder = i10;
                    int i11 = i9 % 2;
                    if (!(applicationContext instanceof ContextWrapper)) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        int i12 = i10 + 23;
                        g = i12 % 128;
                        if (i12 % 2 == 0) {
                            ((ContextWrapper) applicationContext).getBaseContext();
                            text.hashCode();
                            throw null;
                        }
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    }
                }
                Object[] objArr10 = new Object[1];
                c(null, null, (Process.myTid() >> 22) + 127, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(null, null, Color.red(0) + 127, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 466816836};
                    byte[] bArr3 = $$d;
                    byte b7 = bArr3[21];
                    byte b8 = bArr3[32];
                    Object[] objArr13 = new Object[1];
                    d(b7, b8, b8, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b9 = bArr3[32];
                    byte b10 = bArr3[21];
                    Object[] objArr14 = new Object[1];
                    d(b9, b10, b10, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                            int threadPriority = 2267 - ((Process.getThreadPriority(0) + 20) >> 6);
                            int touchSlop2 = 33 - (ViewConfiguration.getTouchSlop() >> 8);
                            byte[] bArr4 = $$a;
                            Object[] objArr16 = new Object[1];
                            a((byte) 103, bArr4[132], bArr4[7], objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, threadPriority, touchSlop2, -654680577, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            c(null, null, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(null, null, 127 - Color.argb(0, 0, 0, 0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c4 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int i13 = 2268 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                int absoluteGravity = 33 - Gravity.getAbsoluteGravity(0, 0);
                                byte b11 = $$a[7];
                                Object[] objArr19 = new Object[1];
                                a((byte) 51, b11, b11, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c4, i13, absoluteGravity, -874156483, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char c5 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                                int i14 = 2268 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 34;
                                byte[] bArr5 = $$a;
                                byte b12 = bArr5[5];
                                byte b13 = bArr5[7];
                                Object[] objArr20 = new Object[1];
                                a(b12, b13, b13, objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c5, i14, iIndexOf, -887667012, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr15;
                    c = 3;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            if (((int[]) objArr[0])[0] != ((int[]) objArr[c])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr[1];
                if (strArr2 == null) {
                    throw null;
                }
                while (i2 < strArr2.length) {
                    int i15 = asBinder + 55;
                    g = i15 % 128;
                    if (i15 % 2 == 0) {
                        arrayList.add(strArr2[i2]);
                        i2 += 55;
                    } else {
                        arrayList.add(strArr2[i2]);
                        i2++;
                    }
                }
                throw null;
            }
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[0])[0];
            int i18 = ((int[]) objArr[3])[0];
            String[] strArr3 = (String[]) objArr[1];
            int i19 = (int) Runtime.getRuntime().totalMemory();
            int i20 = ~((-374011838) | i19);
            int i21 = ~i19;
            int i22 = i16 + 1779852699 + ((i20 | (~(434701478 | i21))) * (-1808)) + (((~((-273155237) | i19)) | (~(i21 | 535558079))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(i19 | (-434701479))) | 100856601 | (~(374011837 | i21))) * TypedValues.Custom.TYPE_BOOLEAN);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr21[2])[0] = i24 ^ (i24 << 5);
            int i25 = asBinder + 115;
            g = i25 % 128;
            if (i25 % 2 == 0) {
                editText = NewActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1(NewActivationPasswordActivity.this).tilPassword.getEditText();
                int i26 = 48 / 0;
                if (editText != null) {
                    text = editText.getText();
                }
            } else {
                editText = NewActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1(NewActivationPasswordActivity.this).tilPassword.getEditText();
                if (editText != null) {
                    text = editText.getText();
                }
            }
            NewActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(NewActivationPasswordActivity.this).TuitionPaymentFragmentspecialinlinedviewModeldefault2(StringsKt.trim((CharSequence) String.valueOf(text)).toString(), string);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = asBinder + 1;
            g = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = asBinder + 49;
            g = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
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
        private static java.lang.String $$g(short r6, short r7, byte r8) {
            /*
                int r6 = r6 * 4
                int r0 = r6 + 1
                int r8 = r8 + 67
                int r7 = r7 * 4
                int r7 = 4 - r7
                byte[] r1 = com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L15
                r3 = r6
                r8 = r7
                r4 = r2
                goto L2a
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
                r7 = r4
                r4 = r3
                r3 = r5
            L2a:
                int r7 = r7 + r3
                int r8 = r8 + 1
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$g(short, short, byte):java.lang.String");
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        onTransact().btnNext.setOnClickListener(new View.OnClickListener() { // from class: notifyOnDismissListener
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, view);
            }
        });
        EditText editText = onTransact().tilPassword.getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            int i2 = RemoteActionCompatParcelizer + 27;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 % 5;
            }
        }
        EditText editText2 = onTransact().tilConfirmedPassword.getEditText();
        if (editText2 != null) {
            editText2.addTextChangedListener(new TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        final NewActivationPasswordActivity newActivationPasswordActivity = (NewActivationPasswordActivity) objArr[0];
        int i = 2 % 2;
        NewActivationPasswordActivity newActivationPasswordActivity2 = newActivationPasswordActivity;
        ((setSplitTrack) newActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).notify.observe(newActivationPasswordActivity2, new b(new Function1() { // from class: getViewTypeCount
            private static final byte[] $$c = {119, -103, 14, -22};
            private static final int $$d = 49;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {97, 58, 103, -72};
            private static final int $$b = 251;
            private static int asBinder = 0;
            private static int asInterface = 1;
            private static char[] TuitionPaymentFragmentbindingInflater1 = {47380, 47370, 47353, 47384, 47387, 47368, 47382, 47371, 47354, 47374, 47375, 47386, 47369, 47385, 47366, 47388, 47351, 47311, 47310, 47364, 47378, 47377, 47390, 47373, 47383, 47308};
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2047719613;
            private static boolean b = true;
            private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;

            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0033). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 * 4
                    int r0 = 1 - r8
                    byte[] r1 = defpackage.getViewTypeCount.$$a
                    int r6 = r6 * 3
                    int r6 = 3 - r6
                    int r7 = r7 * 2
                    int r7 = 98 - r7
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r8 = 0 - r8
                    if (r1 != 0) goto L18
                    r3 = r6
                    r4 = r2
                    goto L33
                L18:
                    r3 = r2
                    r5 = r7
                    r7 = r6
                    r6 = r5
                L1c:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r8) goto L29
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L29:
                    int r3 = r3 + 1
                    int r7 = r7 + 1
                    r4 = r1[r7]
                    r5 = r3
                    r3 = r7
                    r7 = r4
                    r4 = r5
                L33:
                    int r6 = r6 + r7
                    r7 = r3
                    r3 = r4
                    goto L1c
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.getViewTypeCount.c(short, short, short, java.lang.Object[]):void");
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = asInterface + 63;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                Unit unitTuitionPaymentFragmentbindingInflater1 = NewActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
                int i5 = asInterface + 75;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                return unitTuitionPaymentFragmentbindingInflater1;
            }

            private static void a(char[] cArr, int[] iArr, int i2, byte[] bArr, Object[] objArr2) throws Throwable {
                char[] cArr2;
                char[] cArr3;
                int i3 = 2 % 2;
                getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
                char[] cArr4 = TuitionPaymentFragmentbindingInflater1;
                int i4 = 0;
                if (cArr4 != null) {
                    int length = cArr4.length;
                    char[] cArr5 = new char[length];
                    int i5 = 0;
                    while (i5 < length) {
                        try {
                            Object[] objArr3 = new Object[1];
                            objArr3[i4] = Integer.valueOf(cArr4[i5]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char maximumDrawingCacheSize = (char) (31339 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                int iKeyCodeFromString = 2994 - KeyEvent.keyCodeFromString("");
                                int iResolveSize = View.resolveSize(i4, i4) + 17;
                                byte b2 = (byte) ($$d & 7);
                                byte b3 = (byte) (b2 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, iKeyCodeFromString, iResolveSize, 1182129903, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr5[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr3)).charValue();
                            i5++;
                            i4 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr4 = cArr5;
                }
                Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43324 - TextUtils.indexOf((CharSequence) "", '0', 0)), (Process.myPid() >> 22) + 253, 22 - ExpandableListView.getPackedPositionGroup(0L), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr4)).intValue();
                int i6 = 33602;
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i7 = $10 + 17;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                        cArr3 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
                    } else {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                        cArr3 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    }
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        int i8 = $11 + 27;
                        $10 = i8 % 128;
                        if (i8 % 2 != 0) {
                            cArr3[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 % 0) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i2] / iIntValue);
                            Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 33602), 3086 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 26, -2146875848, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr5);
                        } else {
                            cArr3[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i2] - iIntValue);
                            Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 33602), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3084, TextUtils.indexOf((CharSequence) "", '0') + 27, -2146875848, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6);
                        }
                    }
                    objArr2[0] = new String(cArr3);
                    return;
                }
                if (b) {
                    int i9 = $11 + 33;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                        cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
                    } else {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                        cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    }
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i2] - iIntValue);
                        Object[] objArr7 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (View.MeasureSpec.getMode(0) + i6), View.resolveSize(0, 0) + 3085, 26 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -2146875848, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr7);
                        i6 = 33602;
                    }
                    objArr2[0] = new String(cArr2);
                    return;
                }
                int i10 = 0;
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                while (true) {
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10;
                    if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        objArr2[0] = new String(cArr6);
                        return;
                    } else {
                        cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i2] - iIntValue);
                        i10 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                    }
                }
            }

            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(int r27, int r28) {
                /*
                    Method dump skipped, instruction units count: 1868
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.getViewTypeCount.TuitionPaymentFragmentbindingInflater1(int, int):java.lang.Object[]");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(short r6, byte r7, short r8) {
                /*
                    int r7 = r7 * 4
                    int r0 = 1 - r7
                    int r6 = r6 + 67
                    int r8 = r8 * 2
                    int r8 = 4 - r8
                    byte[] r1 = defpackage.getViewTypeCount.$$c
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r7 = 0 - r7
                    if (r1 != 0) goto L17
                    r6 = r7
                    r3 = r8
                    r4 = r2
                    goto L2b
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r7) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L23:
                    int r3 = r3 + 1
                    r4 = r1[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L2b:
                    int r6 = r6 + r8
                    int r8 = r3 + 1
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.getViewTypeCount.$$e(short, byte, short):java.lang.String");
            }
        }));
        ((setSplitTrack) newActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).INotificationSideChannelStub.observe(newActivationPasswordActivity2, new b(new Function1() { // from class: setMaxActivityCount
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1(this.b, (Map) obj);
            }
        }));
        ((setSplitTrack) newActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).asBinder.observe(newActivationPasswordActivity2, new b(new Function1() { // from class: measureContentWidth
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Boolean) obj);
            }
        }));
        ((setSplitTrack) newActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).cancel.observe(newActivationPasswordActivity2, new b(new Function1() { // from class: ActivityChooserViewInnerLayout
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (Boolean) obj);
            }
        }));
        int i2 = RemoteActionCompatParcelizer + 63;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        TextInputLayout textInputLayout = onTransact().tilConfirmedPassword;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.error_unmatch_password);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Minimal harus 8 karakter", 8, null), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Maksimal harus 20 karakter", null, 20), new r8lambda_rcqWHl69wN3lvwkykRzEOONbC0(new Function0() { // from class: setDataModel
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(NewActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
            }
        }, string2)})));
        int i2 = getInterfaceDescriptor + 41;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        NewActivationPasswordActivity newActivationPasswordActivity = this;
        Intrinsics.checkNotNullParameter(newActivationPasswordActivity, "");
        newActivationPasswordActivity.getWindow().addFlags(8192);
        ExperimentalCamera2Interop.INSTANCE.b(this, new Function1() { // from class: setShowFooterView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewActivationPasswordActivity.b(this.b, (UserLocationComplete) obj);
            }
        }, new Function0() { // from class: onLongClick
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewActivationPasswordActivity.b(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
        int i2 = RemoteActionCompatParcelizer + 95;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean d() {
        Editable text;
        int i = 2 % 2;
        EditText editText = onTransact().tilPassword.getEditText();
        Editable text2 = null;
        if (editText != null) {
            int i2 = RemoteActionCompatParcelizer + 83;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                editText.getText();
                throw null;
            }
            text = editText.getText();
        } else {
            text = null;
        }
        String strValueOf = String.valueOf(text);
        EditText editText2 = onTransact().tilConfirmedPassword.getEditText();
        if (editText2 != null) {
            int i3 = getInterfaceDescriptor + 67;
            RemoteActionCompatParcelizer = i3 % 128;
            if (i3 % 2 != 0) {
                text2 = editText2.getText();
                int i4 = 30 / 0;
            } else {
                text2 = editText2.getText();
            }
            int i5 = getInterfaceDescriptor + 47;
            RemoteActionCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
        }
        return Intrinsics.areEqual(strValueOf, String.valueOf(text2));
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da;
        Object[] objArr2;
        int i = 0;
        NewActivationPasswordActivity newActivationPasswordActivity = (NewActivationPasswordActivity) objArr[0];
        int i2 = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char deadChar = (char) (29944 - KeyEvent.getDeadChar(0, 0));
            int iNormalizeMetaState = 1755 - KeyEvent.normalizeMetaState(0);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 23;
            Object[] objArr3 = new Object[1];
            c((byte) 37, (short) 193, $$a[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, iNormalizeMetaState, iCombineMeasuredStates, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29944);
                int mode = View.MeasureSpec.getMode(0) + 1755;
                int windowTouchSlop = 23 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                Object[] objArr4 = new Object[1];
                c((byte) 52, (short) 156, $$a[7], objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumDrawingCacheSize, mode, windowTouchSlop, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i3 = ((int[]) objArr5[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = new Object[]{new int[]{i3}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i4 = (-118798613) + (((~((~startElapsedRealtime) | 134090987)) | 268439300) * 446) + (((~(startElapsedRealtime | 402530287)) | 78254113) * 446) + 64628697;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            e(new char[]{63566, 31400, 9655, 20553, 21091, 64719, 20263, 12605, 45806, 43500, 36340, 30886, 36384, 10805, 36849, 55321, 9171, 55152}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_left_eye_closed).substring(0, 14).codePointAt(3) - 81, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(new char[]{30241, 37463, 29232, 54076, 26013, 29951, 9685, 20769, 14289, 3660, 38854, 44931, 1204, 17642, 5512, 255, 4342, 63807}, 16 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, newActivationPasswordActivity)).intValue();
            try {
                Object[] objArr8 = {26500163};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - TextUtils.indexOf("", "", 0, 0)), 1725 - TextUtils.lastIndexOf("", '0', 0), TextUtils.getCapsMode("", 0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = zzgx.TuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr8), 599785185);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29944);
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1756;
                    int i7 = 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    Object[] objArr9 = new Object[1];
                    c((byte) 52, (short) 156, $$a[7], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(longPressTimeout, bitsPerPixel, i7, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da);
                try {
                    Object[] objArr10 = new Object[1];
                    e(new char[]{15694, 46384, 42671, 47198, 41361, 57606, 62100, 16914, 34392, 2716, 58632, 16904, 38741, 11682, 47688, 40251, 43439, 21300, 42885, 29944, 57763, 30275, 16853, 26803}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(new char[]{63670, 62054, 2703, 52053, 18237, 46873, 29382, 24493, 17277, 35156, 53913, 21911, 10519, 58983, 22740, 730, 51242, 1950}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_bad_response_server).substring(0, 24).codePointAt(10) - 97, objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
                        int size = 1755 - View.MeasureSpec.getSize(0);
                        int i8 = 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        byte b2 = (byte) 52;
                        Object[] objArr12 = new Object[1];
                        c(b2, (short) (b2 << 1), $$a[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyTid, size, i8, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char tapTimeout = (char) (29944 - (ViewConfiguration.getTapTimeout() >> 16));
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1755;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24;
                        Object[] objArr13 = new Object[1];
                        c((byte) 37, (short) 193, $$a[7], objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(tapTimeout, fadingEdgeLength, iIndexOf, 986134021, false, (String) objArr13[0], null);
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
        int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0];
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0];
        if (i10 != i9) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4];
            if (strArr != null) {
                while (i < strArr.length) {
                    arrayList.add(strArr[i]);
                    i++;
                    int i11 = RemoteActionCompatParcelizer + 25;
                    getInterfaceDescriptor = i11 % 128;
                    int i12 = i11 % 2;
                }
            }
            throw new RuntimeException(String.valueOf(i10));
        }
        int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
        int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0];
        Object[] objArr14 = {new int[]{i14}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
        int i15 = ~((~Process.myUid()) | (-542158078));
        int i16 = i13 + ((((-754761728) | i15) * (-970)) - 1828943707) + ((i15 | 212603650) * 970);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr14[3])[0] = i18 ^ (i18 << 5);
        int i19 = RemoteActionCompatParcelizer + 99;
        getInterfaceDescriptor = i19 % 128;
        int i20 = i19 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1031;
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 15;
            byte b3 = (byte) 52;
            Object[] objArr15 = new Object[1];
            c(b3, b3, $$a[7], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(edgeSlop, jumpTapTimeout, iKeyCodeFromString, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new char[]{15694, 46384, 42671, 47198, 41361, 57606, 62100, 16914, 34392, 2716, 58632, 16904, 38741, 11682, 47688, 40251, 43439, 21300, 42885, 29944, 57763, 30275, 16853, 26803}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_alfamart).substring(0, 8).codePointAt(7) - 94, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new char[]{63670, 62054, 2703, 52053, 18237, 46873, 29382, 24493, 17277, 35156, 53913, 21911, 10519, 58983, 22740, 730, 51242, 1950}, ((Process.getThreadPriority(0) + 20) >> 6) + 15, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            int iIndexOf2 = 1031 - TextUtils.indexOf("", "", 0, 0);
            int scrollBarSize = 15 - (ViewConfiguration.getScrollBarSize() >> 8);
            Object[] objArr18 = new Object[1];
            c((byte) 52, (short) 156, $$a[7], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c, iIndexOf2, scrollBarSize, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i21 = getInterfaceDescriptor + 5;
            RemoteActionCompatParcelizer = i21 % 128;
            int i22 = i21 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c2 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int iMakeMeasureSpec = 1031 - View.MeasureSpec.makeMeasureSpec(0, 0);
                int i23 = 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                byte[] bArr = $$a;
                byte b4 = bArr[7];
                Object[] objArr19 = new Object[1];
                c(b4, b4, bArr[5], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, iMakeMeasureSpec, i23, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr20[3])[0];
            int i25 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int i26 = (int) Runtime.getRuntime().totalMemory();
            int i27 = ~i26;
            int i28 = ((((-1983075958) + (((~((-670312276) | i27)) | (-426032106)) * 519)) + (((~(i27 | (-23339842))) | (~((-402692265) | i26))) * (-519))) + (((~(i26 | (-426032106))) | 670312275) * 519)) - 109450198;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr2[2])[0] = i30 ^ (i30 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new char[]{63566, 31400, 9655, 20553, 21091, 64719, 20263, 12605, 45806, 43500, 36340, 30886, 36384, 10805, 36849, 55321, 9171, 55152}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step6).substring(117, 120).length() + 13, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new char[]{30241, 37463, 29232, 54076, 26013, 29951, 9685, 20769, 14289, 3660, 38854, 44931, 1204, 17642, 5512, 255, 4342, 63807}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 82, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, newActivationPasswordActivity)).intValue();
            Object[] objArr23 = {26500163};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 46038), TextUtils.lastIndexOf("", '0') + 1135, 18 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -109450198, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cGreen = (char) Color.green(0);
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
                int fadingEdgeLength2 = 15 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                byte b5 = (byte) 52;
                Object[] objArr25 = new Object[1];
                c(b5, b5, $$a[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cGreen, keyRepeatTimeout, fadingEdgeLength2, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 1116 - TextUtils.lastIndexOf("", '0', 0), 17 - (ViewConfiguration.getFadingEdgeLength() >> 16)), Boolean.TYPE});
            }
            objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1031;
                int scrollBarSize2 = 15 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte[] bArr2 = $$a;
                byte b6 = bArr2[7];
                Object[] objArr26 = new Object[1];
                c(b6, b6, bArr2[5], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(maximumFlingVelocity, threadPriority, scrollBarSize2, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr2);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{15694, 46384, 42671, 47198, 41361, 57606, 62100, 16914, 34392, 2716, 58632, 16904, 38741, 11682, 47688, 40251, 43439, 21300, 42885, 29944, 57763, 30275, 16853, 26803}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_install_shopee_message).substring(0, 8).length() + 14, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{63670, 62054, 2703, 52053, 18237, 46873, 29382, 24493, 17277, 35156, 53913, 21911, 10519, 58983, 22740, 730, 51242, 1950}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 96, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int i31 = 1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0', 0);
                    Object[] objArr29 = new Object[1];
                    c((byte) 52, (short) 156, $$a[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(modifierMetaStateMask, i31, iLastIndexOf, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1031;
                    int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15;
                    byte b7 = (byte) 52;
                    Object[] objArr30 = new Object[1];
                    c(b7, b7, $$a[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf, iResolveSizeAndState, maximumFlingVelocity2, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i32 = ((int[]) objArr2[1])[0];
        int i33 = ((int[]) objArr2[3])[0];
        if (i33 == i32) {
            int i34 = RemoteActionCompatParcelizer + 13;
            getInterfaceDescriptor = i34 % 128;
            int i35 = i34 % 2;
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i36 = ((int[]) objArr2[2])[0];
            int i37 = ((int[]) objArr2[3])[0];
            int i38 = ((int[]) objArr2[1])[0];
            String[] strArr3 = (String[]) objArr2[0];
            int iMyPid = Process.myPid();
            int i39 = ~iMyPid;
            int i40 = i36 + 189349314 + (((-24641865) | i39) * (-369)) + (((~((-470285492) | i39)) | (-226005322)) * (-369)) + (((~(iMyPid | 470285491)) | (-494927356) | (~(i39 | (-201363458)))) * 369);
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArr31[2])[0] = i42 ^ (i42 << 5);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr2[0];
        if (strArr4 != null) {
            int i43 = getInterfaceDescriptor + 111;
            RemoteActionCompatParcelizer = i43 % 128;
            int i44 = 2;
            int i45 = i43 % 2;
            int i46 = 0;
            while (i46 < strArr4.length) {
                int i47 = RemoteActionCompatParcelizer + 73;
                getInterfaceDescriptor = i47 % 128;
                if (i47 % i44 == 0) {
                    arrayList2.add(strArr4[i46]);
                    i46 += 84;
                } else {
                    arrayList2.add(strArr4[i46]);
                    i46++;
                }
                i44 = 2;
            }
        }
        Toast.makeText((Context) null, i33 / (((i33 - 1) * i33) % 2), 0).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i48 = ((int[]) objArr2[2])[0];
        int i49 = ((int[]) objArr2[3])[0];
        int i50 = ((int[]) objArr2[1])[0];
        String[] strArr5 = (String[]) objArr2[0];
        int iNextInt = new Random().nextInt();
        int i51 = ~(24382701 | iNextInt);
        int i52 = ~iNextInt;
        int i53 = i48 + 1526861819 + ((i51 | (~((-24380585) | i52))) * (-406)) + ((~(293043455 | i52)) * (-406)) + (((~(iNextInt | (-268662872))) | (~((-24382702) | i52))) * 406);
        int i54 = (i53 << 13) ^ i53;
        int i55 = i54 ^ (i54 >>> 17);
        ((int[]) objArr32[2])[0] = i55 ^ (i55 << 5);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00cf, code lost:
    
        if (r1 != ((810169782 + (((~((-1640191682) | r3)) | (~((-938864284) | r2))) * 210)) + (((~(r2 | (-1073877057))) | (~(r3 | (-372549659)))) * 210))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d1, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity.RemoteActionCompatParcelizer + 9;
        com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity.getInterfaceDescriptor = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00dd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e5, code lost:
    
        throw new java.lang.RuntimeException("-1618410716");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e6, code lost:
    
        r1 = 1972798820 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ef, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0064, code lost:
    
        if (r1 == ((r7 + (((~(95884705 | r6)) | (-935310842)) * (-1976))) + ((((~(r4 | 925872248)) | 86446112) | (~((-925872249) | r6))) * 988))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x009f, code lost:
    
        if (r1 == ((((-1997342329) + (((~(1408202444 | r5)) | (-1946157054)) * 98)) + ((((~(r5 | (-578214902))) | 1408202444) | (~(578214901 | r4))) * (-49))) + (((~(r4 | 1408202444)) | 1367942152) * 49))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a1, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r10);
        r3 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        if (i4 != (-310999654) + ((~((-1107886121) | startUptimeMillis)) * (-301)) + (((~(1177522862 | startUptimeMillis)) | (~((~startUptimeMillis) | 347535319))) * (-301)) + (((~(startUptimeMillis | (-347535320))) | 1177522862) * 301)) {
            throw null;
        }
        int i5 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i6 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
        if (i5 != (-2068977156) + (((~(i6 | 985368615)) | (-2130689336)) * (-160)) + (((~(i6 | (-1593687350))) | 985368615) * 160)) {
            throw null;
        }
        super.onCreate(bundle);
        int i7 = getInterfaceDescriptor + 53;
        RemoteActionCompatParcelizer = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:12:0x0070  */
    public static /* synthetic */ Unit b(NewActivationPasswordActivity newActivationPasswordActivity) throws IOException {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Camera2CameraControlExternalSyntheticLambda4 camera2CameraControlExternalSyntheticLambda4B = ExperimentalCamera2Interop.b((PreferenceManager) newActivationPasswordActivity.b.getValue());
        if (camera2CameraControlExternalSyntheticLambda4B != null) {
            int i4 = RemoteActionCompatParcelizer + 85;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 38 / 0;
                if (camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                    newActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
                    newActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1 = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    newActivationPasswordActivity.d = camera2CameraControlExternalSyntheticLambda4B.b;
                    newActivationPasswordActivity.a = camera2CameraControlExternalSyntheticLambda4B.g;
                    newActivationPasswordActivity.g = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    newActivationPasswordActivity.asInterface = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    String str = newActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    String str2 = newActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                    StringBuilder sb = new StringBuilder("Location from cache: ");
                    sb.append(str);
                    sb.append(", ");
                    sb.append(str2);
                    getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
                } else {
                    newActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "0.0";
                    newActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1 = "0.0";
                    ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
                    getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
                }
            } else if (camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                newActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
                newActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1 = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                newActivationPasswordActivity.d = camera2CameraControlExternalSyntheticLambda4B.b;
                newActivationPasswordActivity.a = camera2CameraControlExternalSyntheticLambda4B.g;
                newActivationPasswordActivity.g = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                newActivationPasswordActivity.asInterface = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                String str3 = newActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                String str4 = newActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                StringBuilder sb2 = new StringBuilder("Location from cache: ");
                sb2.append(str3);
                sb2.append(", ");
                sb2.append(str4);
                getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb2.toString(), new Object[0]);
            } else {
                newActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "0.0";
                newActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1 = "0.0";
                ExperimentalCamera2Interop experimentalCamera2Interop3 = ExperimentalCamera2Interop.INSTANCE;
                getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
            }
        } else {
            newActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "0.0";
            newActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1 = "0.0";
            ExperimentalCamera2Interop experimentalCamera2Interop4 = ExperimentalCamera2Interop.INSTANCE;
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(NewActivationPasswordActivity newActivationPasswordActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            newActivationPasswordActivity.MediaBrowserCompat();
            str = "loading_activation_account_step_fifth_result";
            int i2 = getInterfaceDescriptor + 15;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
        } else {
            Object obj = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                int i4 = RemoteActionCompatParcelizer + 39;
                getInterfaceDescriptor = i4 % 128;
                if (i4 % 2 == 0) {
                    newActivationPasswordActivity.IconCompatParcelizer();
                    ((BaseModel) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getB();
                    obj.hashCode();
                    throw null;
                }
                newActivationPasswordActivity.IconCompatParcelizer();
                VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                if (!((BaseModel) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getB()) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newActivationPasswordActivity, ((BaseModel) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getTuitionPaymentFragmentspecialinlinedviewModeldefault1(), null);
                    int i5 = RemoteActionCompatParcelizer + 63;
                    getInterfaceDescriptor = i5 % 128;
                    int i6 = i5 % 2;
                    str = "failure_activation_account_step_fifth_result";
                } else {
                    ActivationSuccessActivity.Companion bVar = ActivationSuccessActivity.INSTANCE;
                    RegisteredMemberRegistration registeredMemberRegistration = newActivationPasswordActivity.cancelAll;
                    ActivationSuccessActivity.Companion.b(newActivationPasswordActivity, null);
                    newActivationPasswordActivity.d_();
                    str = "success_activation_account_step_fifth_result";
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                newActivationPasswordActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newActivationPasswordActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                int i7 = RemoteActionCompatParcelizer + 63;
                getInterfaceDescriptor = i7 % 128;
                int i8 = i7 % 2;
                str = "failure_activation_account_step_fifth_result";
            } else {
                str = "";
            }
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_register_account", str));
        Intrinsics.checkNotNullParameter(newActivationPasswordActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(NewActivationPasswordActivity newActivationPasswordActivity, Boolean bool) {
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 117;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNull(bool);
        Object obj = null;
        if (bool.booleanValue()) {
            newActivationPasswordActivity.onTransact().tilConfirmedPassword.setError(null);
            newActivationPasswordActivity.onTransact().tilConfirmedPassword.setErrorIconDrawable((Drawable) null);
            i = RemoteActionCompatParcelizer + 103;
        } else {
            int i5 = getInterfaceDescriptor + 47;
            RemoteActionCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
            newActivationPasswordActivity.onTransact().tilConfirmedPassword.setError(newActivationPasswordActivity.getString(R.string.error_unmatch_password));
            newActivationPasswordActivity.onTransact().tilConfirmedPassword.setErrorIconDrawable((Drawable) null);
            i = RemoteActionCompatParcelizer + 11;
        }
        getInterfaceDescriptor = i % 128;
        int i7 = i % 2;
        Unit unit = Unit.INSTANCE;
        int i8 = RemoteActionCompatParcelizer + 83;
        getInterfaceDescriptor = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(NewActivationPasswordActivity newActivationPasswordActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            newActivationPasswordActivity.onTransact().btnNext.setEnabled(bool.booleanValue());
            return Unit.INSTANCE;
        }
        newActivationPasswordActivity.onTransact().btnNext.setEnabled(bool.booleanValue());
        int i3 = 5 / 0;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewActivationPasswordActivity newActivationPasswordActivity, View view) {
        String str;
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Intrinsics.checkNotNull(view);
            NewActivationPasswordActivity newActivationPasswordActivity2 = newActivationPasswordActivity;
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, newActivationPasswordActivity2);
            newActivationPasswordActivity.onTransact().passwordContainer.requestFocus();
            if (newActivationPasswordActivity.d()) {
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) newActivationPasswordActivity.asBinder.getValue();
                EditText editText = newActivationPasswordActivity.onTransact().tilPassword.getEditText();
                String string = null;
                RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, null, null, StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString(), null, null, null, null, null, null, null, null, null, null, null, null, 8387583);
                setSplitTrack setsplittrack = (setSplitTrack) newActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                String str2 = newActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                String str3 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface;
                String str4 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.d;
                String str5 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder;
                String str6 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.notify;
                String str7 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.a;
                MembershipType membershipType = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                String strName = membershipType != null ? membershipType.name() : null;
                String strValueOf = String.valueOf(registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel);
                String str8 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.g;
                String str9 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.cancelAll;
                String str10 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
                if (str10 != null) {
                    str = str9;
                    String lowerCase = str10.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (lowerCase != null) {
                        int i2 = getInterfaceDescriptor + 39;
                        RemoteActionCompatParcelizer = i2 % 128;
                        if (i2 % 2 != 0) {
                            StringsKt.trim((CharSequence) lowerCase).toString();
                            throw null;
                        }
                        string = StringsKt.trim((CharSequence) lowerCase).toString();
                    }
                } else {
                    str = str9;
                }
                File file = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStubProxy;
                File file2 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStub;
                File file3 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.RemoteActionCompatParcelizer;
                File fileTuitionPaymentFragmentbindingInflater1 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
                String strValueOf2 = String.valueOf(newActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                String strValueOf3 = String.valueOf(newActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1);
                String strValueOf4 = String.valueOf(newActivationPasswordActivity.d);
                String str11 = Build.BRAND;
                Intrinsics.checkNotNullExpressionValue(str11, "");
                String str12 = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(str12, "");
                String string2 = Settings.Secure.getString(newActivationPasswordActivity2.getContentResolver(), "android_id");
                Intrinsics.checkExpressionValueIsNotNull(string2, "");
                setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str2, new NewActivationRequest(str3, str4, str5, str6, str7, strName, strValueOf, "fcmid997797656579", str8, str, string, file, file2, file3, strValueOf2, strValueOf3, strValueOf4, "Y", fileTuitionPaymentFragmentbindingInflater1, str11, str12, string2));
            }
            ViewPortBuilder.b();
            int i3 = RemoteActionCompatParcelizer + 97;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 17 / 0;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0098 A[SYNTHETIC] */
    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(NewActivationPasswordActivity newActivationPasswordActivity, Map map) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 55;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNull(map);
            newActivationPasswordActivity.onTransact();
            map.entrySet().iterator();
            throw null;
        }
        Intrinsics.checkNotNull(map);
        ActivityNewActivationPasswordBinding activityNewActivationPasswordBindingOnTransact = newActivationPasswordActivity.onTransact();
        for (Map.Entry entry : map.entrySet()) {
            int i5 = RemoteActionCompatParcelizer + 5;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            ValidationType validationType = (ValidationType) entry.getKey();
            NewActivationPasswordActivity newActivationPasswordActivity2 = newActivationPasswordActivity;
            if (((Boolean) entry.getValue()).booleanValue()) {
                int i7 = RemoteActionCompatParcelizer + 103;
                getInterfaceDescriptor = i7 % 128;
                int i8 = i7 % 2;
                i = R.drawable.ic_check_active;
            } else {
                i = R.drawable.ic_check_inactive;
            }
            Drawable drawable = ContextCompat.getDrawable(newActivationPasswordActivity2, i);
            int i9 = WhenMappings.$EnumSwitchMapping$0[validationType.ordinal()];
            if (i9 != 1) {
                int i10 = RemoteActionCompatParcelizer + 29;
                int i11 = i10 % 128;
                getInterfaceDescriptor = i11;
                int i12 = i10 % 2;
                if (i9 != 2) {
                    int i13 = i11 + 39;
                    RemoteActionCompatParcelizer = i13 % 128;
                    if (i13 % 2 != 0) {
                        if (i9 != 2) {
                            i2 = i11 + 77;
                            RemoteActionCompatParcelizer = i2 % 128;
                            if (i2 % 2 != 0) {
                                if (i9 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                activityNewActivationPasswordBindingOnTransact.tvSpecialCharValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                            } else {
                                if (i9 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                activityNewActivationPasswordBindingOnTransact.tvSpecialCharValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                            }
                        } else {
                            activityNewActivationPasswordBindingOnTransact.tvDigitValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                    } else if (i9 != 3) {
                        i2 = i11 + 77;
                        RemoteActionCompatParcelizer = i2 % 128;
                        if (i2 % 2 != 0) {
                            if (i9 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            activityNewActivationPasswordBindingOnTransact.tvSpecialCharValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                        } else {
                            if (i9 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            activityNewActivationPasswordBindingOnTransact.tvSpecialCharValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                    } else {
                        activityNewActivationPasswordBindingOnTransact.tvDigitValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                } else {
                    activityNewActivationPasswordBindingOnTransact.tvUpperLowerValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                }
            } else {
                activityNewActivationPasswordBindingOnTransact.tvLengthValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        NewActivationPasswordActivity newActivationPasswordActivity = (NewActivationPasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            Parcelable parcelableExtra = newActivationPasswordActivity.getIntent().getParcelableExtra("registration_data");
            Intrinsics.checkNotNull(parcelableExtra);
            return (RegisteredMemberRegistration) parcelableExtra;
        }
        Parcelable parcelableExtra2 = newActivationPasswordActivity.getIntent().getParcelableExtra("registration_data");
        Intrinsics.checkNotNull(parcelableExtra2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit b(NewActivationPasswordActivity newActivationPasswordActivity, UserLocationComplete userLocationComplete) throws IOException {
        String str;
        String str2;
        String str3;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String str4 = "";
        Intrinsics.checkNotNullParameter(userLocationComplete, "");
        if (i3 == 0) {
            newActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = String.valueOf(userLocationComplete.b);
            newActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1 = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            LocationAddressInfo locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            throw null;
        }
        newActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = String.valueOf(userLocationComplete.b);
        newActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1 = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        LocationAddressInfo locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 == null || (str = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) {
            str = "";
        } else {
            int i4 = getInterfaceDescriptor + 49;
            RemoteActionCompatParcelizer = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 17 / 0;
            }
        }
        newActivationPasswordActivity.d = str;
        newActivationPasswordActivity.a = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        LocationAddressInfo locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 == null || (str2 = locationAddressInfo3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            str2 = "";
        } else {
            int i6 = getInterfaceDescriptor;
            int i7 = i6 + 121;
            RemoteActionCompatParcelizer = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 57;
            RemoteActionCompatParcelizer = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 / 3;
            }
        }
        newActivationPasswordActivity.g = str2;
        LocationAddressInfo locationAddressInfo4 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo4 != null && (str3 = locationAddressInfo4.d) != null) {
            str4 = str3;
        }
        newActivationPasswordActivity.asInterface = str4;
        String str5 = newActivationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str6 = newActivationPasswordActivity.TuitionPaymentFragmentbindingInflater1;
        String str7 = newActivationPasswordActivity.d;
        String str8 = newActivationPasswordActivity.a;
        String str9 = newActivationPasswordActivity.g;
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

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewActivationPasswordActivity newActivationPasswordActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        boolean zD = newActivationPasswordActivity.d();
        int i4 = RemoteActionCompatParcelizer + 117;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return zD;
        }
        throw null;
    }

    public static /* synthetic */ RegisteredMemberRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewActivationPasswordActivity newActivationPasswordActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (RegisteredMemberRegistration) TuitionPaymentFragmentbindingInflater1(Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1306053732, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{newActivationPasswordActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1306053729);
    }

    static {
        INotificationSideChannelDefault = 0;
        g();
        INSTANCE = new Companion(null);
        int i = write + 91;
        INotificationSideChannelDefault = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2063749765;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ReadAfterEOFException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ReadAfterEOFException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return ((Integer) TuitionPaymentFragmentbindingInflater1(Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -856094743, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, i, 856094743)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 113;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ReadAfterEOFException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1059).substring(0, 54).length() - 980272302;
        TuitionPaymentFragmentbindingInflater1(ReadAfterEOFException.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -270378850, Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, length, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 270378851);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 47;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1856099746;
        TuitionPaymentFragmentbindingInflater1(Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1594899450, Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, i, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1594899446);
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ReadAfterEOFException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -213845632, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{this, context}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 213845634);
    }

    static void g() {
        onTransact = (char) 63092;
        notify = (char) 58267;
        INotificationSideChannelStub = (char) 51708;
        INotificationSideChannelStubProxy = (char) 6015;
    }

    private static String $$i(byte b2, byte b3, byte b4) {
        int i = b3 * 2;
        byte[] bArr = $$c;
        int i2 = 3 - (b2 * 3);
        int i3 = 108 - (b4 * 4);
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i3 = i2 + i3;
            i2 = i2;
        }
        while (true) {
            int i5 = i2 + 1;
            i4++;
            bArr2[i4] = (byte) i3;
            if (i4 == i) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i5];
            i2 = i5;
        }
    }
}
