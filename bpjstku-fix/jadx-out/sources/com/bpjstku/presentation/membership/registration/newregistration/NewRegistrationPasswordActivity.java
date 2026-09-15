package com.bpjstku.presentation.membership.registration.newregistration;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import androidx.core.content.ContextCompat;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.registration.general.model.request.NewRegisterRequest;
import com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda7;
import com.bpjstku.databinding.ActivityRegistrationPasswordBinding;
import com.bpjstku.domain.registration.general.model.ValidationType;
import com.bpjstku.presentation.membership.registration.RegistrationSuccessActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationPasswordActivity;
import com.bpjstku.util.constant.Citizenship;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.utils.LocationAddressInfo;
import com.bpjstku.util.utils.UserLocationComplete;
import com.bpjstku.util.viewbinding.BindingPassiveFormActivity;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.Camera2CameraControlExternalSyntheticLambda4;
import defpackage.ExperimentalCamera2Interop;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accessconfigureInstanceInternal;
import defpackage.accessgetMCameraInfoMapp;
import defpackage.calculateCameraUseCases;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.createExtraPreview;
import defpackage.getContentPaddingRight;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.mapPoint;
import defpackage.r8lambda_rcqWHl69wN3lvwkykRzEOONbC0;
import defpackage.setInactive;
import defpackage.setSplitTrack;
import defpackage.unregisterLifecycle;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0015\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0017\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0014\u0010\u001a\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00020\u001b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001dR\u0014\u0010\t\u001a\u00020\u001e8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0018\u0010 \u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/newregistration/NewRegistrationPasswordActivity;", "Lcom/bpjstku/util/viewbinding/BindingPassiveFormActivity;", "Lcom/bpjstku/databinding/ActivityRegistrationPasswordBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "", "g", "()Z", "LsetSplitTrack;", "notify", "Lkotlin/Lazy;", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "d", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/data/lib/PreferenceManager;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I", "cancelAll"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NewRegistrationPasswordActivity extends BindingPassiveFormActivity<ActivityRegistrationPasswordBinding> {
    private static char[] INotificationSideChannel;
    private static int INotificationSideChannelDefault;
    private static long cancelAll;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String asBinder;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String cancelAll;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private String notify;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String d;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String a;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: SafeIterableMapIteratorWithAdditions
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewRegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {115, 98, 19, 9};
    private static final int $$f = 108;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {111, 40, 23, -13, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 40;
    private static int getInterfaceDescriptor = 1;
    private static int onTransact = 0;
    private static int cancel = 1;

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

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1) {
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

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = ~((~i4) | i8);
        int i10 = i4 | i8;
        int i11 = i + i5 + i6 + ((-189913888) * i3) + ((-1809372279) * i2);
        int i12 = i11 * i11;
        int i13 = (((-554582804) * i) - 1671495680) + (10634006 * i5) + (i7 * 282608405) + (282608405 * i9) + ((-282608405) * i10) + ((-271974400) * i6) + (952107008 * i3) + (1092222976 * i2) + ((-70844416) * i12);
        int i14 = (i * 986545540) + 223666697 + (i5 * 986543778) + (i7 * (-881)) + (i9 * (-881)) + (i10 * 881) + (i6 * 986544659) + (i3 * 1843362976) + (i2 * (-1872984789)) + (i12 * (-2050686976));
        int i15 = i13 + (i14 * i14 * 1179713536);
        if (i15 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i15 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i15 != 3) {
            return i15 != 4 ? b(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
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
    private static void c(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r0 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationPasswordActivity.$$a
            int r9 = r9 + 1
            int r8 = r8 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r5 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L28:
            int r8 = r8 + r7
            int r7 = r8 + (-11)
            int r8 = r3 + 1
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationPasswordActivity.c(int, short, int, java.lang.Object[]):void");
    }

    public static final /* synthetic */ setSplitTrack TuitionPaymentFragmentbindingInflater1(NewRegistrationPasswordActivity newRegistrationPasswordActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            return (setSplitTrack) newRegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        }
        int i3 = 24 / 0;
        return (setSplitTrack) newRegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        NewRegistrationPasswordActivity newRegistrationPasswordActivity = (NewRegistrationPasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = cancel + 59;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ActivityRegistrationPasswordBinding activityRegistrationPasswordBindingOnTransact = newRegistrationPasswordActivity.onTransact();
        if (i3 == 0) {
            return activityRegistrationPasswordBindingOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public NewRegistrationPasswordActivity() {
        final NewRegistrationPasswordActivity newRegistrationPasswordActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationPasswordActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final setSplitTrack invoke() {
                ComponentCallbacks componentCallbacks = newRegistrationPasswordActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(setSplitTrack.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        Lazy lazy = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationPasswordActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = newRegistrationPasswordActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lazy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ((PreferenceManager) lazy.getValue()).getString("OCR_TRANSACTION_ID", "");
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity
    public final Function1<LayoutInflater, ActivityRegistrationPasswordBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = cancel + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        NewRegistrationPasswordActivity$bindingInflater$1 newRegistrationPasswordActivity$bindingInflater$1 = NewRegistrationPasswordActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i4 = onTransact + 85;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        return newRegistrationPasswordActivity$bindingInflater$1;
    }

    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i4 = $11 + 51;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 % 3;
        }
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(INotificationSideChannel[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", ""), View.getDefaultSize(0, 0) + 2187, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 40, 841711447, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(cancelAll), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33018 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), Color.alpha(0) + 3011, TextUtils.getTrimmedLength("") + 26, 321985076, false, $$i(b3, b4, (byte) (b4 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 36504), 3376 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, -968507904, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $10 + 39;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                try {
                    Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - (Process.myPid() >> 22)), (ViewConfiguration.getPressedStateDuration() >> 16) + 3376, Color.green(0) + 17, -968507904, false, $$i(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
                    }
                    Object obj = null;
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    obj.hashCode();
                    throw null;
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            try {
                Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.getTrimmedLength("") + 36505), 3376 - (ViewConfiguration.getEdgeSlop() >> 16), 17 - View.MeasureSpec.getMode(0), -968507904, false, $$i(b9, b10, (byte) (b10 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            } catch (Throwable th5) {
                Throwable cause5 = th5.getCause();
                if (cause5 == null) {
                    throw th5;
                }
                throw cause5;
            }
        }
        objArr[0] = new String(cArr);
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
            setSplitTrack setsplittrackTuitionPaymentFragmentbindingInflater1 = NewRegistrationPasswordActivity.TuitionPaymentFragmentbindingInflater1(NewRegistrationPasswordActivity.this);
            Intrinsics.checkNotNullParameter(strValueOf, "");
            setsplittrackTuitionPaymentFragmentbindingInflater1.b.setValue(strValueOf);
            setsplittrackTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strValueOf));
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String string = StringsKt.trim((CharSequence) String.valueOf(editable)).toString();
            EditText editText = ((ActivityRegistrationPasswordBinding) NewRegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-528818584, MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{NewRegistrationPasswordActivity.this}, MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 528818587, MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).tilPassword.getEditText();
            NewRegistrationPasswordActivity.TuitionPaymentFragmentbindingInflater1(NewRegistrationPasswordActivity.this).TuitionPaymentFragmentspecialinlinedviewModeldefault2(StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString(), string);
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        onTransact().btnNext.setOnClickListener(new View.OnClickListener() { // from class: newest
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewRegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
        EditText editText = onTransact().tilPassword.getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        }
        EditText editText2 = onTransact().tilConfirmedPassword.getEditText();
        if (editText2 != null) {
            editText2.addTextChangedListener(new TuitionPaymentFragmentbindingInflater1());
            int i2 = onTransact + 65;
            cancel = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        NewRegistrationPasswordActivity newRegistrationPasswordActivity = this;
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).cancelAll.observe(newRegistrationPasswordActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: SafeIterableMapAscendingIterator
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewRegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).INotificationSideChannelStub.observe(newRegistrationPasswordActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: backward
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewRegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Map) obj);
            }
        }));
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).asBinder.observe(newRegistrationPasswordActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: SafeIterableMapDescendingIterator
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewRegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Boolean) obj);
            }
        }));
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).cancel.observe(newRegistrationPasswordActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: SafeIterableMapEntry
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewRegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (Boolean) obj);
            }
        }));
        int i2 = onTransact + 55;
        cancel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        TextInputLayout textInputLayout = onTransact().tilConfirmedPassword;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object obj = null;
        String string2 = getString(R.string.error_unmatch_password);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Minimal harus 8 karakter", 8, null), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Maksimal harus 20 karakter", null, 20), new r8lambda_rcqWHl69wN3lvwkykRzEOONbC0(new Function0() { // from class: forward
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(NewRegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
            }
        }, string2)})));
        int i2 = onTransact + 41;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        ExperimentalCamera2Interop.INSTANCE.b(this, new Function1() { // from class: hasNext
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewRegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (UserLocationComplete) obj);
            }
        }, new Function0() { // from class: getKey
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewRegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        NewRegistrationPasswordActivity newRegistrationPasswordActivity = this;
        Intrinsics.checkNotNullParameter(newRegistrationPasswordActivity, "");
        newRegistrationPasswordActivity.getWindow().addFlags(8192);
        int i2 = cancel + 105;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean g() {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        EditText editText = onTransact().tilPassword.getEditText();
        Editable text = null;
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        EditText editText2 = onTransact().tilConfirmedPassword.getEditText();
        if (editText2 != null) {
            text = editText2.getText();
            int i4 = onTransact + 25;
            cancel = i4 % 128;
            int i5 = i4 % 2;
        }
        return Intrinsics.areEqual(String.valueOf(text), strValueOf);
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrB$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = onTransact + 35;
        cancel = i2 % 128;
        Object obj = null;
        int i3 = 0;
        if (i2 % 2 == 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29944);
                int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 23;
                byte[] bArr = $$a;
                byte b = bArr[28];
                short s = bArr[7];
                Object[] objArr2 = new Object[1];
                c(b, s, (byte) (s | 37), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iLastIndexOf, iMakeMeasureSpec, 986134021, false, (String) objArr2[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            obj.hashCode();
            throw null;
        }
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 29944);
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 1755;
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 23;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[28];
            short s2 = bArr2[7];
            Object[] objArr3 = new Object[1];
            c(b2, s2, (byte) (s2 | 37), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(tapTimeout, capsMode, fadingEdgeLength, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char size = (char) (View.MeasureSpec.getSize(0) + 29944);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1756;
                int iRed = Color.red(0) + 23;
                byte b3 = $$a[28];
                Object[] objArr4 = new Object[1];
                c(b3, (short) (b3 | 36), (byte) 52, objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size, iIndexOf, iRed, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrB$5f1425da = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int iNextInt = new Random().nextInt();
            int i4 = ~iNextInt;
            int i5 = ((1509612971 + (((~((-175291649) | i4)) | (~(iNextInt | 37310777))) * 333)) + (((~(iNextInt | (-175291649))) | (~(i4 | 37310777))) * 333)) - 881321321;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i7 ^ (i7 << 5);
            int i8 = onTransact + 75;
            cancel = i8 % 128;
            int i9 = i8 % 2;
        } else {
            Object[] objArr6 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_bca_transfer).substring(0, 8).codePointAt(7) - 65, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto4).substring(12, 13).length() + 15, (char) (View.getDefaultSize(0, 0) + 32224), objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.save_time_save_credit).substring(12, 14).codePointAt(1) - 85, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 30, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14578), objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr8 = {732853963};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 42049), TextUtils.lastIndexOf("", '0') + 1727, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$5f1425da = PMIRegistrationDataStore$$ExternalSyntheticLambda7.b$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr8), -881321321);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char capsMode2 = (char) (TextUtils.getCapsMode("", 0, 0) + 29944);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1755;
                    int iAxisFromString = MotionEvent.axisFromString("") + 24;
                    byte b4 = $$a[28];
                    Object[] objArr9 = new Object[1];
                    c(b4, (short) (b4 | 36), (byte) 52, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(capsMode2, iResolveOpacity, iAxisFromString, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrB$5f1425da);
                try {
                    Object[] objArr10 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_indosat_dompetku).substring(0, 16).codePointAt(8) - 36, ExpandableListView.getPackedPositionType(0L) + 22, (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 18, 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) Drawable.resolveOpacity(0, 0), objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cBlue = (char) (29944 - Color.blue(0));
                        int absoluteGravity = 1755 - Gravity.getAbsoluteGravity(0, 0);
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 23;
                        byte b5 = $$a[28];
                        Object[] objArr12 = new Object[1];
                        c(b5, (short) (b5 | 88), (byte) 52, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cBlue, absoluteGravity, iNormalizeMetaState, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf = (char) (29944 - TextUtils.indexOf("", "", 0, 0));
                        int iMyPid = 1755 - (Process.myPid() >> 22);
                        int iMakeMeasureSpec2 = 23 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        byte[] bArr3 = $$a;
                        byte b6 = bArr3[28];
                        short s3 = bArr3[7];
                        Object[] objArr13 = new Object[1];
                        c(b6, s3, (byte) (s3 | 37), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, iMyPid, iMakeMeasureSpec2, 986134021, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i10 = ((int[]) objArrB$5f1425da[1])[0];
        int i11 = ((int[]) objArrB$5f1425da[0])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArrB$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrB$5f1425da[0])[0]}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i13 = i12 + 1720818683 + (((~(iMaxMemory | (-834690651))) | (-1047293077)) * (-465)) + (((-834690651) | (~((-1047293077) | iMaxMemory))) * 930) + ((iMaxMemory | (-809520145)) * 465);
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr14[3])[0] = i15 ^ (i15 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$5f1425da[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
            int i16 = ((int[]) objArrB$5f1425da[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrB$5f1425da[0])[0]}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 258422532;
            int i17 = ~length;
            int i18 = i16 + 711695537 + (((~((-662105863) | i17)) | 624168706 | (~(449503436 | i17))) * (-1136)) + (((~((-662105863) | length)) | (~(449503436 | length)) | (~((-411566281) | i17))) * (-568)) + (((~(length | (-624168707))) | (~(i17 | (-449503437))) | (~(662105862 | i17))) * 568);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr15[3])[0] = i20 ^ (i20 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
            int i21 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1030;
            int iRed2 = 15 - Color.red(0);
            byte b7 = $$a[28];
            Object[] objArr16 = new Object[1];
            c(b7, (short) (b7 | 140), (byte) 52, objArr16);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionGroup, i21, iRed2, 1357589585, false, (String) objArr16[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr17 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 21, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, (char) (Process.getGidForName("") + 1), objArr17);
        Class<?> cls3 = Class.forName((String) objArr17[0]);
        Object[] objArr18 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_gopay_qris).substring(0, 5).length() + 49, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 96, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr18);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c2 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int defaultSize = 1031 - View.getDefaultSize(0, 0);
            int i22 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15;
            byte b8 = $$a[28];
            Object[] objArr19 = new Object[1];
            c(b8, (short) (b8 | 36), (byte) 52, objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, defaultSize, i22, 1344079056, false, (String) objArr19[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1031;
                int modifierMetaStateMask = 14 - ((byte) KeyEvent.getModifierMetaStateMask());
                byte b9 = $$a[7];
                byte b10 = b9;
                Object[] objArr20 = new Object[1];
                c(b10, (short) (b10 | 193), b9, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cIndexOf2, iResolveSizeAndState, modifierMetaStateMask, 632103528, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i23 = ((int[]) objArr21[3])[0];
            int i24 = ((int[]) objArr21[1])[0];
            String[] strArr2 = (String[]) objArr21[0];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i25 = ~iFreeMemory;
            int i26 = ((((-669774655) + (((~((-102094789) | i25)) | 67453700) * 184)) + ((iFreeMemory | (-381016047)) * (-184))) + ((~((-346374959) | i25)) * 184)) - 1549699217;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr[2])[0] = i28 ^ (i28 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_bri_epay).substring(0, 9).codePointAt(2) - 80, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notificationOpenAppToActivateBody).substring(0, 65).codePointAt(64) - 30, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_with_prima).substring(1, 3).codePointAt(1) + 32103), objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto6).substring(39, 40).codePointAt(0) - 16, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 14567), objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {732853963};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (46037 - Process.getGidForName("")), 1134 - (KeyEvent.getMaxKeyCode() >> 16), 18 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr25 = {Integer.valueOf(iIntValue2), 0, -1549699217, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int size2 = 1031 - View.MeasureSpec.getSize(0);
                int mirror = AndroidCharacter.getMirror('0') - '!';
                byte b11 = $$a[28];
                Object[] objArr26 = new Object[1];
                c(b11, (short) (b11 | 140), (byte) 52, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(scrollBarFadeDuration, size2, mirror, 1298546779, false, (String) objArr26[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.indexOf((CharSequence) "", '0') + 1118, 16 - Process.getGidForName("")), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr25);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cBlue2 = (char) Color.blue(0);
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1031;
                int keyRepeatTimeout = 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                byte b12 = $$a[7];
                byte b13 = b12;
                Object[] objArr27 = new Object[1];
                c(b13, (short) (b13 | 193), b12, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cBlue2, scrollBarSize, keyRepeatTimeout, 632103528, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr28 = new Object[1];
                e(32 - Color.argb(0, 0, 0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.xl_tunai_payment_instruction).substring(12, 13).codePointAt(0) - 109), objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.preview_atm_bersama).substring(1, 3).length() + 52, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_order_id_required).substring(0, 9).length() + 6, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iAlpha = Color.alpha(0) + 1031;
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 16;
                    byte b14 = $$a[28];
                    Object[] objArr30 = new Object[1];
                    c(b14, (short) (b14 | 36), (byte) 52, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(maximumFlingVelocity, iAlpha, bitsPerPixel, 1344079056, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i29 = 1032 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int mode = View.MeasureSpec.getMode(0) + 15;
                    byte b15 = $$a[28];
                    Object[] objArr31 = new Object[1];
                    c(b15, (short) (b15 | 140), (byte) 52, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(fadingEdgeLength2, i29, mode, 1357589585, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i30 = ((int[]) objArr[1])[0];
        int i31 = ((int[]) objArr[3])[0];
        if (i31 != i30) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i32 = cancel + 23;
                onTransact = i32 % 128;
                int i33 = i32 % 2;
                while (i3 < strArr3.length) {
                    int i34 = onTransact + 9;
                    cancel = i34 % 128;
                    if (i34 % 2 == 0) {
                        arrayList2.add(strArr3[i3]);
                        i3 += 58;
                    } else {
                        arrayList2.add(strArr3[i3]);
                        i3++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i31));
        }
        int i35 = cancel + 5;
        onTransact = i35 % 128;
        int i36 = i35 % 2;
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i37 = ((int[]) objArr[2])[0];
        int i38 = ((int[]) objArr[3])[0];
        int i39 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i40 = ~((-240739849) | startElapsedRealtime);
        int i41 = ~startElapsedRealtime;
        int i42 = i37 + 2058007619 + ((i40 | (~(243230569 | i41))) * (-406)) + ((~((-239690249) | i41)) * (-406)) + (((~(startElapsedRealtime | (-3540322))) | (~(240739848 | i41))) * 406);
        int i43 = i42 ^ (i42 << 13);
        int i44 = i43 ^ (i43 >>> 17);
        ((int[]) objArr32[2])[0] = i44 ^ (i44 << 5);
        int i45 = onTransact + 81;
        cancel = i45 % 128;
        int i46 = i45 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws IllegalAccessException {
        NewRegistrationPasswordActivity newRegistrationPasswordActivity = (NewRegistrationPasswordActivity) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        int i2 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i3 = (-703756664) + (((-1367075696) | elapsedCpuTime) * 614);
        int i4 = ~elapsedCpuTime;
        if (i2 != i3 + (((~((-302102749) | i4)) | 33558672 | (~((-1132090292) | i4))) * (-1228)) + (((~(i4 | (-1098531620))) | (~((-268544077) | i4))) * 614)) {
            throw null;
        }
        int i5 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i6 = (int) Runtime.getRuntime().totalMemory();
        if (i5 != 653082408 + (((~(i6 | 831510863)) | (-1747545102)) * (-668)) + ((831510863 | (~((-1747545102) | i6))) * 1336) + ((i6 | (-1210065921)) * 668)) {
            int i7 = cancel + 15;
            onTransact = i7 % 128;
            if (i7 % 2 != 0) {
                int[] iArr = new int[1926043296];
                iArr[1926043295] = 1;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            } else {
                int[] iArr2 = new int[1926043296];
                iArr2[1926043295] = 1;
                int i8 = 1265814880 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        super.onResume();
        int i9 = onTransact + 103;
        cancel = i9 % 128;
        if (i9 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) throws IllegalAccessException {
        NewRegistrationPasswordActivity newRegistrationPasswordActivity = (NewRegistrationPasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = cancel + 59;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[1]).getInt(null);
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            if (i3 != (-122578515) + (((~(iElapsedRealtime | (-1813169565))) | (-983182022)) * (-465)) + (((-1813169565) | (~((-983182022) | iElapsedRealtime))) * 930) + ((iElapsedRealtime | (-672268421)) * 465)) {
                throw null;
            }
        } else {
            int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int iMyTid = Process.myTid();
            int i5 = ~iMyTid;
            if (i4 != ((1312266488 + (((~(939449472 | i5)) | (~((-109461930) | iMyTid))) * (-370))) + ((((~(iMyTid | 939449472)) | (~(i5 | (-109461930)))) | 829987840) * (-370))) - 2142144512) {
                throw null;
            }
        }
        int i6 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i7 = ~((~Process.myTid()) | 2074686207);
        if (i6 != ((1638473890 | i7) * (-970)) + 541677262 + ((i7 | 436212317) * 970)) {
            throw new RuntimeException("2043194617");
        }
        super.onStart();
        int i8 = cancel + 39;
        onTransact = i8 % 128;
        if (i8 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = cancel + 1;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int iNextInt = new Random().nextInt(776113494);
            int i4 = ~iNextInt;
            if (i3 != (-1974341758) + ((188496109 | i4) * (-757)) + ((~(1069349869 | iNextInt)) * 1514) + (((~(iNextInt | (-880853761))) | (~(i4 | 1018483652)) | 50866217) * 757)) {
                throw null;
            }
        } else {
            int i5 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            if (i5 != 1243156338 + (((~(iIdentityHashCode | (-957113170))) | (-127125627)) * (-465)) + (((-957113170) | (~((-127125627) | iIdentityHashCode))) * 930) + ((iIdentityHashCode | (-16793681)) * 465)) {
                throw null;
            }
        }
        int i6 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_gross_amount_not_equal).substring(5, 6).codePointAt(0) - 2146775145;
        int i7 = ~iCodePointAt;
        if (i6 != 1100313097 + (((~((-868057400) | i7)) | 1710998565) * (-602)) + (((~(iCodePointAt | (-868057400))) | 565805093 | (~(2013250871 | i7))) * (-301)) + ((~(i7 | 1710998565)) * 301)) {
            int i8 = cancel + 79;
            onTransact = i8 % 128;
            if (i8 % 2 != 0) {
                int[] iArr = new int[1153295443];
                iArr[1153295442] = 1;
                int i9 = (-1049358698) % 4;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            } else {
                int[] iArr2 = new int[1153295443];
                iArr2[1153295442] = 1;
                int i10 = (-1049358698) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
            int i11 = onTransact + 101;
            cancel = i11 % 128;
            int i12 = i11 % 2;
        }
        super.onCreate(bundle);
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewRegistrationPasswordActivity newRegistrationPasswordActivity) {
        int i = 2 % 2;
        int i2 = cancel + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zG = newRegistrationPasswordActivity.g();
        int i4 = cancel + 71;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return zG;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewRegistrationPasswordActivity newRegistrationPasswordActivity, View view) {
        String str;
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Intrinsics.checkNotNull(view);
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, newRegistrationPasswordActivity);
            newRegistrationPasswordActivity.onTransact().passwordContainer.requestFocus();
            if (newRegistrationPasswordActivity.g()) {
                int i2 = onTransact + 55;
                cancel = i2 % 128;
                String strName = null;
                if (i2 % 2 == 0) {
                    newRegistrationPasswordActivity.onTransact().tilPassword.getEditText();
                    strName.hashCode();
                    throw null;
                }
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) newRegistrationPasswordActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                EditText editText = newRegistrationPasswordActivity.onTransact().tilPassword.getEditText();
                RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, null, null, StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString(), null, null, null, null, null, null, null, null, null, null, null, null, 8387583);
                setSplitTrack setsplittrack = (setSplitTrack) newRegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                String str2 = newRegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                String string = Settings.Secure.getString(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getContentResolver(), "android_id");
                Intrinsics.checkExpressionValueIsNotNull(string, "");
                String str3 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
                String str4 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.notify;
                String str5 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.a;
                String str6 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface;
                String str7 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.d;
                MembershipType membershipType = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (membershipType != null) {
                    int i3 = onTransact + 43;
                    cancel = i3 % 128;
                    if (i3 % 2 == 0) {
                        membershipType.name();
                        throw null;
                    }
                    String strName2 = membershipType.name();
                    int i4 = onTransact + 125;
                    cancel = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 5 % 5;
                    }
                    str = strName2;
                } else {
                    str = null;
                }
                String str8 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.cancelAll;
                Citizenship citizenship = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                strName = citizenship != null ? citizenship.name() : null;
                String str9 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder;
                String str10 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.g;
                String str11 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel;
                File file = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStubProxy;
                File file2 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStub;
                File file3 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.RemoteActionCompatParcelizer;
                File fileTuitionPaymentFragmentbindingInflater1 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
                String strValueOf = String.valueOf(newRegistrationPasswordActivity.asBinder);
                String strValueOf2 = String.valueOf(newRegistrationPasswordActivity.d);
                String str12 = newRegistrationPasswordActivity.g;
                String str13 = Build.BRAND;
                Intrinsics.checkNotNullExpressionValue(str13, "");
                String str14 = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(str14, "");
                setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, new NewRegisterRequest(string, str3, strName, str, str7, str9, str6, str10, str5, str8, "fcmid997797656579", str4, str11, "Y", file, file2, file3, fileTuitionPaymentFragmentbindingInflater1, strValueOf, strValueOf2, str12, str13, str14));
                int i6 = onTransact + 67;
                cancel = i6 % 128;
                int i7 = i6 % 2;
            }
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ RegisteredMemberRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault3(NewRegistrationPasswordActivity newRegistrationPasswordActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Parcelable parcelableExtra = newRegistrationPasswordActivity.getIntent().getParcelableExtra("registration_data");
        Intrinsics.checkNotNull(parcelableExtra);
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) parcelableExtra;
        int i4 = onTransact + 83;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return registeredMemberRegistration;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewRegistrationPasswordActivity newRegistrationPasswordActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = cancel + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(bool);
        if (!(!bool.booleanValue())) {
            newRegistrationPasswordActivity.onTransact().tilConfirmedPassword.setError(null);
            newRegistrationPasswordActivity.onTransact().tilConfirmedPassword.setErrorIconDrawable((Drawable) null);
            int i4 = onTransact + 39;
            cancel = i4 % 128;
            int i5 = i4 % 2;
        } else {
            newRegistrationPasswordActivity.onTransact().tilConfirmedPassword.setError(newRegistrationPasswordActivity.getString(R.string.error_unmatch_password));
            newRegistrationPasswordActivity.onTransact().tilConfirmedPassword.setErrorIconDrawable((Drawable) null);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = cancel + 109;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewRegistrationPasswordActivity newRegistrationPasswordActivity) throws IOException {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Camera2CameraControlExternalSyntheticLambda4 camera2CameraControlExternalSyntheticLambda4B = ExperimentalCamera2Interop.b((PreferenceManager) newRegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
        if (camera2CameraControlExternalSyntheticLambda4B == null || !camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            newRegistrationPasswordActivity.asBinder = "0.0";
            newRegistrationPasswordActivity.d = "0.0";
            ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
            int i4 = onTransact + 27;
            cancel = i4 % 128;
            int i5 = i4 % 2;
        } else {
            newRegistrationPasswordActivity.asBinder = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
            newRegistrationPasswordActivity.d = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            newRegistrationPasswordActivity.g = camera2CameraControlExternalSyntheticLambda4B.b;
            newRegistrationPasswordActivity.a = camera2CameraControlExternalSyntheticLambda4B.g;
            newRegistrationPasswordActivity.cancelAll = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            newRegistrationPasswordActivity.notify = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str = newRegistrationPasswordActivity.asBinder;
            String str2 = newRegistrationPasswordActivity.d;
            StringBuilder sb = new StringBuilder("Location from cache: ");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewRegistrationPasswordActivity newRegistrationPasswordActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = cancel + 107;
        int i3 = i2 % 128;
        onTransact = i3;
        Editable text = null;
        if (i2 % 2 != 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            text.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            newRegistrationPasswordActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i4 = i3 + 25;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            newRegistrationPasswordActivity.IconCompatParcelizer();
            RegistrationSuccessActivity.Companion companion = RegistrationSuccessActivity.INSTANCE;
            NewRegistrationPasswordActivity newRegistrationPasswordActivity2 = newRegistrationPasswordActivity;
            RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) newRegistrationPasswordActivity.TuitionPaymentFragmentbindingInflater1.getValue();
            EditText editText = newRegistrationPasswordActivity.onTransact().tilPassword.getEditText();
            if (editText != null) {
                int i6 = cancel + 67;
                onTransact = i6 % 128;
                if (i6 % 2 != 0) {
                    editText.getText();
                    throw null;
                }
                text = editText.getText();
            }
            RegistrationSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newRegistrationPasswordActivity2, RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, null, null, StringsKt.trim((CharSequence) String.valueOf(text)).toString(), null, null, null, null, null, null, null, null, null, null, null, null, 8387583));
            newRegistrationPasswordActivity.d_();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            newRegistrationPasswordActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = cancel + 109;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(NewRegistrationPasswordActivity newRegistrationPasswordActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = cancel + 9;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            newRegistrationPasswordActivity.onTransact().btnNext.setEnabled(bool.booleanValue());
            return Unit.INSTANCE;
        }
        newRegistrationPasswordActivity.onTransact().btnNext.setEnabled(bool.booleanValue());
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewRegistrationPasswordActivity newRegistrationPasswordActivity, Map map) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = onTransact + 81;
        cancel = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNull(map);
        ActivityRegistrationPasswordBinding activityRegistrationPasswordBindingOnTransact = newRegistrationPasswordActivity.onTransact();
        for (Map.Entry entry : map.entrySet()) {
            ValidationType validationType = (ValidationType) entry.getKey();
            NewRegistrationPasswordActivity newRegistrationPasswordActivity2 = newRegistrationPasswordActivity;
            if (!((Boolean) entry.getValue()).booleanValue()) {
                int i6 = onTransact + 1;
                cancel = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 / 3;
                }
                i = R.drawable.ic_check_inactive;
            } else {
                i = R.drawable.ic_check_active;
            }
            Drawable drawable = ContextCompat.getDrawable(newRegistrationPasswordActivity2, i);
            int i8 = WhenMappings.$EnumSwitchMapping$0[validationType.ordinal()];
            if (i8 == 1) {
                activityRegistrationPasswordBindingOnTransact.tvLengthValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            } else if (i8 != 2) {
                int i9 = cancel + 97;
                onTransact = i9 % 128;
                if (i9 % 2 == 0 ? i8 == 3 : i8 == 4) {
                    activityRegistrationPasswordBindingOnTransact.tvDigitValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    i2 = cancel + 41;
                    onTransact = i2 % 128;
                } else {
                    if (i8 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    activityRegistrationPasswordBindingOnTransact.tvSpecialCharValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    i2 = onTransact + 63;
                    cancel = i2 % 128;
                }
                int i10 = i2 % 2;
            } else {
                activityRegistrationPasswordBindingOnTransact.tvUpperLowerValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(NewRegistrationPasswordActivity newRegistrationPasswordActivity, UserLocationComplete userLocationComplete) throws IOException {
        String str;
        String str2;
        int i = 2 % 2;
        String str3 = "";
        Intrinsics.checkNotNullParameter(userLocationComplete, "");
        newRegistrationPasswordActivity.asBinder = String.valueOf(userLocationComplete.b);
        newRegistrationPasswordActivity.d = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        LocationAddressInfo locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo != null) {
            int i2 = cancel + 23;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        newRegistrationPasswordActivity.g = str;
        newRegistrationPasswordActivity.a = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        LocationAddressInfo locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 != null) {
            int i4 = cancel + 87;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                String str4 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                throw null;
            }
            str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str2 == null) {
                int i5 = onTransact + 123;
                cancel = i5 % 128;
                int i6 = i5 % 2;
                str2 = "";
            }
        } else {
            int i7 = onTransact + 123;
            cancel = i7 % 128;
            int i8 = i7 % 2;
            str2 = "";
        }
        newRegistrationPasswordActivity.cancelAll = str2;
        LocationAddressInfo locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 != null) {
            int i9 = cancel + 53;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
            String str5 = locationAddressInfo3.d;
            if (str5 != null) {
                int i11 = onTransact + 69;
                cancel = i11 % 128;
                int i12 = i11 % 2;
                str3 = str5;
            }
        }
        newRegistrationPasswordActivity.notify = str3;
        String str6 = newRegistrationPasswordActivity.asBinder;
        String str7 = newRegistrationPasswordActivity.d;
        String str8 = newRegistrationPasswordActivity.g;
        String str9 = newRegistrationPasswordActivity.a;
        String str10 = newRegistrationPasswordActivity.cancelAll;
        StringBuilder sb = new StringBuilder("Location from GPS: ");
        sb.append(str6);
        sb.append(", ");
        sb.append(str7);
        sb.append(", City: ");
        sb.append(str8);
        sb.append(", Province: ");
        sb.append(str9);
        sb.append(", Country: ");
        sb.append(str10);
        getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
        return Unit.INSTANCE;
    }

    static {
        INotificationSideChannelDefault = 0;
        d();
        INSTANCE = new Companion(null);
        int i = getInterfaceDescriptor + 55;
        INotificationSideChannelDefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 91 / 0;
        }
    }

    public static final /* synthetic */ ActivityRegistrationPasswordBinding b(NewRegistrationPasswordActivity newRegistrationPasswordActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (ActivityRegistrationPasswordBinding) TuitionPaymentFragmentspecialinlinedviewModeldefault2(-528818584, MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{newRegistrationPasswordActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 528818587, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 47;
        cancel = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 3;
        cancel = i5 % 128;
        if (i5 % 2 != 0) {
            return R.layout.activity_registration_password;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AbstractList.IteratorImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AbstractList.IteratorImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(1429288257, AbstractList.IteratorImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1429288253, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        cancel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 79 / 0;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int length = 1654416740 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto5_bni).substring(12, 13).length();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AbstractList.IteratorImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1292216013, AbstractList.IteratorImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1156934339, length, 1292216013, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AbstractList.IteratorImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AbstractList.IteratorImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(-818606838, MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 818606839, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AbstractList.IteratorImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AbstractList.IteratorImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(1124077086, AbstractList.IteratorImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1124077084, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = cancel + 15;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    static void d() {
        INotificationSideChannel = new char[]{52246, 25531, 37702, 49903, 29386, 41518, 53753, 408, 45355, 57476, 4179, 16423, 63431, 10086, 22285, 34475, 35079, 9900, 54855, 34802, 14210, 59193, 38142, 17565, 62486, 42457, 21857, 1316, 45797, 25199, 4638, 50097, 45565, 7764, 61108, 48924, 3947, 57291, 44060, 31800, 52419, 40249, 28110, 15853, 35373, 23169, 11004, 64323, 19345, 7129, 59484, 47265, 2311, 55657, 45561, 7766, 61105, 48926, 3959, 57287, 44060, 31812, 52425, 40235, 28044, 15818, 35389, 23199, 10989};
        cancelAll = -3533339066037297606L;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = cancel + 51;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        cancel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r5, byte r6, int r7) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationPasswordActivity.$$c
            int r7 = r7 * 3
            int r7 = r7 + 109
            int r6 = r6 * 3
            int r1 = 1 - r6
            int r5 = r5 * 3
            int r5 = 4 - r5
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r3 = r7
            r4 = r2
            r7 = r6
            goto L29
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L27:
            r3 = r0[r5]
        L29:
            int r7 = r7 + r3
            int r5 = r5 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationPasswordActivity.$$i(int, byte, int):java.lang.String");
    }
}
