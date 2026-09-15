package com.bpjstku.presentation.membership.registration;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
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
import com.bpjstku.data.registration.general.model.request.RegisterRequest;
import com.bpjstku.databinding.ActivityRegistrationPasswordBinding;
import com.bpjstku.domain.registration.general.model.ValidationType;
import com.bpjstku.presentation.membership.registration.RegistrationPasswordActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.util.constant.Citizenship;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.utils.LocationAddressInfo;
import com.bpjstku.util.utils.UserLocationComplete;
import com.bpjstku.util.viewbinding.BindingPassiveFormActivity;
import com.google.android.libraries.places.internal.zzrf;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.Camera2CameraControlExternalSyntheticLambda4;
import defpackage.DelegatingImageCapturedCallback;
import defpackage.ExperimentalCamera2Interop;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accessconfigureInstanceInternal;
import defpackage.accessgetMCameraInfoMapp;
import defpackage.cacheInteropConfig;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.generateCameraId;
import defpackage.getConfigs;
import defpackage.getContentPaddingRight;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.mapPoint;
import defpackage.r8lambda_rcqWHl69wN3lvwkykRzEOONbC0;
import defpackage.setInactive;
import defpackage.setSplitTrack;
import defpackage.unregisterLifecycle;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0013\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0007\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0015\u0010\u0016\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0012R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u001b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001cR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001e"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/RegistrationPasswordActivity;", "Lcom/bpjstku/util/viewbinding/BindingPassiveFormActivity;", "Lcom/bpjstku/databinding/ActivityRegistrationPasswordBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "asInterface", "asBinder", "a", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "", "g", "()Z", "LsetSplitTrack;", "d", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/data/lib/PreferenceManager;", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "", "()I", "", "Ljava/lang/String;", "cancel"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RegistrationPasswordActivity extends BindingPassiveFormActivity<ActivityRegistrationPasswordBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int[] cancel;
    private static int cancelAll;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String cancel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String d;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: storeInIconCache
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b);
        }
    });

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String asInterface;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String asBinder;
    private static final byte[] $$c = {91, -9, 99, 11};
    private static final int $$f = 208;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {15, -9, 64, -81, -17, -13, -10, -5, 5, 9, -21, -9, -25, 38, -59, 7, -18, -9, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 59};
    private static final int $$n = 63;
    private static final byte[] $$a = {94, 6, -99, -107, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 94;
    private static int INotificationSideChannel = 0;
    private static int notify = 0;
    private static int onTransact = 1;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1) {
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
    }

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

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = (~(i7 | i8)) | (~(i8 | i));
        int i10 = ~i;
        int i11 = i9 | (~(i10 | i3 | i6));
        int i12 = i8 | i3;
        int i13 = (~(i | i3)) | (~i12);
        int i14 = i12 | i10;
        int i15 = i3 + i6 + i4 + ((-1468046718) * i2) + (327422179 * i5);
        int i16 = i15 * i15;
        int i17 = (677926197 * i3) + 1810235392 + (1154460365 * i6) + (i11 * (-238267084)) + ((-238267084) * i13) + (238267084 * i14) + (916193280 * i4) + (1933049856 * i2) + (743702528 * i5) + (286654464 * i16);
        int i18 = (i3 * (-645773371)) + 280972133 + (i6 * (-645772067)) + (i11 * (-652)) + (i13 * (-652)) + (i14 * 652) + (i4 * (-645772719)) + (i2 * 1523302178) + (i5 * 1475409363) + (i16 * (-1007288320));
        int i19 = i17 + (i18 * i18 * (-492175360));
        if (i19 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i19 == 2) {
            return b(objArr);
        }
        if (i19 != 3) {
            return i19 != 4 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        final RegistrationPasswordActivity registrationPasswordActivity = (RegistrationPasswordActivity) objArr[0];
        int i20 = 2 % 2;
        RegistrationPasswordActivity registrationPasswordActivity2 = registrationPasswordActivity;
        ((setSplitTrack) registrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).write.observe(registrationPasswordActivity2, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: getDrawableFromResourceUri
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) registrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).INotificationSideChannelStub.observe(registrationPasswordActivity2, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: notifyDataSetInvalidated
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Map) obj);
            }
        }));
        ((setSplitTrack) registrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).asBinder.observe(registrationPasswordActivity2, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: getSearchManagerSuggestions
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Boolean) obj);
            }
        }));
        ((setSplitTrack) registrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).cancel.observe(registrationPasswordActivity2, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: setQueryRefinement
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (Boolean) obj);
            }
        }));
        int i21 = notify + 19;
        onTransact = i21 % 128;
        int i22 = i21 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 + 1
            int r8 = 214 - r8
            byte[] r1 = com.bpjstku.presentation.membership.registration.RegistrationPasswordActivity.$$a
            int r6 = r6 + 84
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L29
        L10:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L14:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L29:
            int r6 = -r6
            int r8 = r8 + r6
            int r8 = r8 + (-11)
            int r6 = r3 + 1
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.RegistrationPasswordActivity.c(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.registration.RegistrationPasswordActivity.$$m
            int r7 = r7 * 14
            int r7 = 17 - r7
            int r8 = r8 * 17
            int r8 = r8 + 84
            int r6 = r6 * 38
            int r1 = r6 + 15
            byte[] r1 = new byte[r1]
            int r6 = r6 + 14
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L32
        L19:
            r3 = r2
        L1a:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L32:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-8)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.RegistrationPasswordActivity.f(byte, int, short, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        RegistrationPasswordActivity registrationPasswordActivity = (RegistrationPasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 119;
        notify = i2 % 128;
        int i3 = i2 % 2;
        ActivityRegistrationPasswordBinding activityRegistrationPasswordBindingOnTransact = registrationPasswordActivity.onTransact();
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        int i5 = onTransact + 111;
        notify = i5 % 128;
        int i6 = i5 % 2;
        return activityRegistrationPasswordBindingOnTransact;
    }

    public static final /* synthetic */ setSplitTrack b(RegistrationPasswordActivity registrationPasswordActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        notify = i2 % 128;
        int i3 = i2 % 2;
        setSplitTrack setsplittrack = (setSplitTrack) registrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        int i4 = onTransact + 5;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            return setsplittrack;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RegistrationPasswordActivity() {
        final RegistrationPasswordActivity registrationPasswordActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.registration.RegistrationPasswordActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final setSplitTrack invoke() {
                ComponentCallbacks componentCallbacks = registrationPasswordActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(setSplitTrack.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.b = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.registration.RegistrationPasswordActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = registrationPasswordActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.registration.RegistrationPasswordActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/RegistrationPasswordActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, RegisteredMemberRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, RegistrationPasswordActivity.class, new Pair[]{TuplesKt.to("registration_data", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity
    public final Function1<LayoutInflater, ActivityRegistrationPasswordBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = notify + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        RegistrationPasswordActivity$bindingInflater$1 registrationPasswordActivity$bindingInflater$1 = RegistrationPasswordActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i4 = notify + 61;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return registrationPasswordActivity$bindingInflater$1;
        }
        throw null;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String strValueOf = String.valueOf(charSequence);
            setSplitTrack setsplittrackB = RegistrationPasswordActivity.b(RegistrationPasswordActivity.this);
            Intrinsics.checkNotNullParameter(strValueOf, "");
            setsplittrackB.b.setValue(strValueOf);
            setsplittrackB.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strValueOf));
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
            EditText editText = ((ActivityRegistrationPasswordBinding) RegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzrf.b(), new Object[]{RegistrationPasswordActivity.this}, zzrf.b(), -1605159750, zzrf.b(), zzrf.b(), 1605159750)).tilPassword.getEditText();
            RegistrationPasswordActivity.b(RegistrationPasswordActivity.this).TuitionPaymentFragmentspecialinlinedviewModeldefault2(StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString(), string);
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        onTransact().btnNext.setOnClickListener(new View.OnClickListener() { // from class: setViewDrawable
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
        EditText editText = onTransact().tilPassword.getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            int i2 = notify + 83;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
        }
        EditText editText2 = onTransact().tilConfirmedPassword.getEditText();
        if (editText2 != null) {
            editText2.addTextChangedListener(new TuitionPaymentFragmentbindingInflater1());
        }
        int i4 = onTransact + 93;
        notify = i4 % 128;
        int i5 = i4 % 2;
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
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Minimal harus 8 karakter", 8, null), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Maksimal harus 20 karakter", null, 20), new r8lambda_rcqWHl69wN3lvwkykRzEOONbC0(new Function0() { // from class: setViewText
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(RegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
            }
        }, string2)})));
        int i2 = notify + 23;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        RegistrationPasswordActivity registrationPasswordActivity = this;
        Intrinsics.checkNotNullParameter(registrationPasswordActivity, "");
        registrationPasswordActivity.getWindow().addFlags(8192);
        ExperimentalCamera2Interop.INSTANCE.b(this, new Function1() { // from class: convertToString
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationPasswordActivity.TuitionPaymentFragmentbindingInflater1(this.b, (UserLocationComplete) obj);
            }
        }, new Function0() { // from class: getQueryRefinement
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RegistrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
        int i2 = notify + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        int i4 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = cancel;
        int i5 = -1870535734;
        int i6 = 1;
        int i7 = 0;
        if (iArr2 != null) {
            int i8 = $11 + 105;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i10])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0')), 3291 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 31 - Color.green(0), 1948206109, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i10++;
                    i5 = -1870535734;
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
        int[] iArr5 = cancel;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                Object[] objArr3 = new Object[i6];
                objArr3[i7] = Integer.valueOf(iArr5[i11]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) i7;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.red(i7), 3290 - ((byte) KeyEvent.getModifierMetaStateMask()), 31 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1948206109, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i11++;
                i6 = 1;
                i7 = 0;
            }
            int i12 = $10 + 117;
            $11 = i12 % 128;
            i2 = 2;
            if (i12 % 2 == 0) {
                int i13 = 2 / 3;
            }
            iArr5 = iArr6;
            i3 = 0;
        } else {
            i2 = 2;
            i3 = 0;
        }
        System.arraycopy(iArr5, i3, iArr4, i3, length2);
        sessionConfigValidatingBuilder.b = i2;
        int i14 = $10 + 61;
        $11 = i14 % 128;
        int i15 = i14 % i2;
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
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.combineMeasuredStates(0, 0), 2559 - View.MeasureSpec.getMode(0), 29 - (ViewConfiguration.getPressedStateDuration() >> 16), 683220507, false, $$i(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
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
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 28879), 348 - (ViewConfiguration.getLongPressTimeout() >> 16), 25 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -30507727, false, "G", new Class[]{Object.class});
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

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        Editable text;
        RegistrationPasswordActivity registrationPasswordActivity = (RegistrationPasswordActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 69;
        notify = i2 % 128;
        Editable text2 = null;
        if (i2 % 2 != 0) {
            registrationPasswordActivity.onTransact().tilPassword.getEditText();
            throw null;
        }
        EditText editText = registrationPasswordActivity.onTransact().tilPassword.getEditText();
        if (editText != null) {
            text = editText.getText();
            int i3 = onTransact + 123;
            notify = i3 % 128;
            int i4 = i3 % 2;
        } else {
            text = null;
        }
        String strValueOf = String.valueOf(text);
        EditText editText2 = registrationPasswordActivity.onTransact().tilConfirmedPassword.getEditText();
        if (editText2 != null) {
            int i5 = onTransact + 77;
            notify = i5 % 128;
            if (i5 % 2 != 0) {
                editText2.getText();
                throw null;
            }
            text2 = editText2.getText();
        }
        return Boolean.valueOf(Intrinsics.areEqual(String.valueOf(text2), strValueOf));
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrB$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 29944);
            int pressedStateDuration = 1755 - (ViewConfiguration.getPressedStateDuration() >> 16);
            int iIndexOf = TextUtils.indexOf("", "") + 23;
            byte b = $$a[24];
            Object[] objArr2 = new Object[1];
            c(b, (byte) (b | 37), (short) 193, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState, pressedStateDuration, iIndexOf, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i3 = onTransact + 23;
            notify = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char fadingEdgeLength = (char) (29944 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1755;
                int iGreen = 23 - Color.green(0);
                byte b2 = $$a[24];
                Object[] objArr3 = new Object[1];
                c(b2, (byte) (b2 | 52), (short) 156, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, minimumFlingVelocity, iGreen, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i5 = ((int[]) objArr4[0])[0];
            objArrB$7879113 = new Object[]{new int[]{i5}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            int i7 = (((((~(666191855 | i6)) | (~(iIdentityHashCode | 878794281))) * 959) + 90591647) + (((~(iIdentityHashCode | 666191855)) | (~(i6 | 878794281))) * 959)) - 992931679;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new int[]{1973659995, -2038009816, -1992182150, 1762898800, 258355625, 755256844, 204184525, 291357810, 520178362, -839859306}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_bri_epay).substring(0, 9).codePointAt(7) - 66, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new int[]{1407963961, 1458204101, -366906442, 1465128332, -886510214, -1971546206, -421782783, -36742067, -186112532, -901479532}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-1562494701};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - ((Process.getThreadPriority(0) + 20) >> 6)), 1726 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -992931679, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29944);
                    int iGreen2 = Color.green(0) + 1755;
                    int scrollBarFadeDuration = 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte b3 = $$a[24];
                    Object[] objArr8 = new Object[1];
                    c(b3, (byte) (b3 | 52), (short) 156, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(doubleTapTimeout, iGreen2, scrollBarFadeDuration, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new int[]{855290539, 311968368, 1958596895, -1725553178, -1110043479, 427628101, 870514714, 1466223195, -108484346, 994334699, -411303439, 519013799, -1147455638, -557577938}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new int[]{29292794, -717437064, -2027655722, -1812956010, 1673804598, 84724622, -617931306, 1926653905, 1062083929, 215156429}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.copied_company_code).substring(1, 2).codePointAt(0) - 96, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char minimumFlingVelocity2 = (char) (29944 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 1755;
                        int i10 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                        byte b4 = $$a[24];
                        byte b5 = (byte) (b4 | 52);
                        Object[] objArr11 = new Object[1];
                        c(b4, b5, (short) (b5 << 1), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity2, pressedStateDuration2, i10, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char modifierMetaStateMask = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
                        int capsMode = 1755 - TextUtils.getCapsMode("", 0, 0);
                        int size = View.MeasureSpec.getSize(0) + 23;
                        byte b6 = $$a[24];
                        Object[] objArr12 = new Object[1];
                        c(b6, (byte) (b6 | 37), (short) 193, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(modifierMetaStateMask, capsMode, size, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i11 = notify + 89;
                    onTransact = i11 % 128;
                    int i12 = i11 % 2;
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
        int i13 = ((int[]) objArrB$7879113[1])[0];
        int i14 = ((int[]) objArrB$7879113[0])[0];
        if (i14 != i13) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$7879113[4];
            if (strArr != null) {
                while (i2 < strArr.length) {
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }
        int i15 = onTransact + 69;
        notify = i15 % 128;
        int i16 = i15 % 2;
        int i17 = ((int[]) objArrB$7879113[3])[0];
        int i18 = ((int[]) objArrB$7879113[0])[0];
        Object[] objArr13 = {new int[]{i18}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int i19 = (int) Runtime.getRuntime().totalMemory();
        int i20 = ~i19;
        int i21 = i17 + (-861613627) + ((i19 | 1842344) * 140) + (((~(1842344 | i20)) | 209969425) * (-280)) + (((~(i19 | (-209969426))) | (~(210760081 | i20)) | 1051688) * 140);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr13[3])[0] = i23 ^ (i23 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int iAlpha = 1031 - Color.alpha(0);
            int iMakeMeasureSpec = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte b7 = $$a[24];
            byte b8 = (byte) (b7 | 52);
            Object[] objArr14 = new Object[1];
            c(b7, b8, b8, objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cCombineMeasuredStates, iAlpha, iMakeMeasureSpec, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new int[]{855290539, 311968368, 1958596895, -1725553178, -1110043479, 427628101, 870514714, 1466223195, -108484346, 994334699, -411303439, 519013799, -1147455638, -557577938}, MotionEvent.axisFromString("") + 23, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new int[]{29292794, -717437064, -2027655722, -1812956010, 1673804598, 84724622, -617931306, 1926653905, 1062083929, 215156429}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
            int i24 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1031;
            int iMyTid = 15 - (Process.myTid() >> 22);
            byte b9 = $$a[24];
            Object[] objArr17 = new Object[1];
            c(b9, (byte) (b9 | 52), (short) 156, objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(deadChar, i24, iMyTid, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cRed = (char) Color.red(0);
                int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1031;
                int packedPositionType = 15 - ExpandableListView.getPackedPositionType(0L);
                byte b10 = (byte) ($$b & 47);
                byte b11 = $$a[24];
                Object[] objArr18 = new Object[1];
                c(b10, b11, b11, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cRed, minimumFlingVelocity3, packedPositionType, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i25 = ((int[]) objArr19[3])[0];
            int i26 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int i27 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp | 75155603);
            int i28 = (((-1502371169) + (((-169124567) | i27) * (-220))) + ((i27 | (-243198680)) * 220)) - 11714972;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr[2])[0] = i30 ^ (i30 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(new int[]{1973659995, -2038009816, -1992182150, 1762898800, 258355625, 755256844, 204184525, 291357810, 520178362, -839859306}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new int[]{1407963961, 1458204101, -366906442, 1465128332, -886510214, -1971546206, -421782783, -36742067, -186112532, -901479532}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 30, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {-1562494701};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46037 - TextUtils.lastIndexOf("", '0', 0, 0)), 1134 - (ViewConfiguration.getFadingEdgeLength() >> 16), View.MeasureSpec.getMode(0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -874801986, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1031;
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 15;
                byte b12 = $$a[24];
                byte b13 = (byte) (b12 | 52);
                Object[] objArr24 = new Object[1];
                c(b12, b13, b13, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(offsetAfter, maxKeyCode, jumpTapTimeout, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.getDeadChar(0, 0) + 45993), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1117, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16), Boolean.TYPE});
            }
            Object[] objArr25 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cMyPid = (char) (Process.myPid() >> 22);
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 1032;
                int i31 = 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                byte b14 = (byte) ($$b & 47);
                byte b15 = $$a[24];
                Object[] objArr26 = new Object[1];
                c(b14, b15, b15, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cMyPid, iIndexOf2, i31, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr25);
            try {
                Object[] objArr27 = new Object[1];
                e(new int[]{855290539, 311968368, 1958596895, -1725553178, -1110043479, 427628101, 870514714, 1466223195, -108484346, 994334699, -411303439, 519013799, -1147455638, -557577938}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_order_id_required).substring(0, 9).length() + 13, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new int[]{29292794, -717437064, -2027655722, -1812956010, 1673804598, 84724622, -617931306, 1926653905, 1062083929, 215156429}, 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int mirror = 1079 - AndroidCharacter.getMirror('0');
                    int deadChar2 = KeyEvent.getDeadChar(0, 0) + 15;
                    byte b16 = $$a[24];
                    Object[] objArr29 = new Object[1];
                    c(b16, (byte) (b16 | 52), (short) 156, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c, mirror, deadChar2, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0') + 1032;
                    int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 15;
                    byte b17 = $$a[24];
                    byte b18 = (byte) (b17 | 52);
                    Object[] objArr30 = new Object[1];
                    c(b17, b18, b18, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(doubleTapTimeout2, iIndexOf3, packedPositionType2, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr = objArr25;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                while (i2 < strArr3.length) {
                    int i32 = onTransact + 109;
                    notify = i32 % 128;
                    int i33 = i32 % 2;
                    arrayList2.add(strArr3[i2]);
                    i2++;
                }
            }
            throw null;
        }
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i34 = ((int[]) objArr[2])[0];
        int i35 = ((int[]) objArr[3])[0];
        int i36 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i37 = ~iIdentityHashCode2;
        int i38 = i34 + 1809309244 + ((~(328336587 | i37)) * 979) + ((iIdentityHashCode2 | 572616757) * (-979)) + (((~(iIdentityHashCode2 | 328336587)) | (~(i37 | 572616757))) * 979);
        int i39 = (i38 << 13) ^ i38;
        int i40 = i39 ^ (i39 >>> 17);
        ((int[]) objArr31[2])[0] = i40 ^ (i40 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        notify = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = ((Field) cacheInteropConfig.b[1]).getInt(null);
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellResolutionTitle).substring(0, 10).codePointAt(7) - 1922443168;
            if (i3 != (((~(1257668399 | iCodePointAt)) | (-1401658232)) * 262) + 1620069608 + (((~((~iCodePointAt) | 1257668399)) | (-1401658232)) * 262)) {
                throw null;
            }
        } else {
            int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int iNextInt = new Random().nextInt();
            int i5 = ~iNextInt;
            if (i4 != 2102863022 + (((~(i5 | (-1439727732))) | 1367343203 | (~((-537355661) | iNextInt))) * 717) + (((~(iNextInt | (-1439727732))) | (~(i5 | (-537355661))) | 1367343203) * 717)) {
                throw null;
            }
        }
        int i6 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i6 != (-646222860) + (((~((~iIdentityHashCode) | (-285254809))) | (~(2006775036 | iIdentityHashCode))) * (-302)) + ((~((-285254809) | iIdentityHashCode)) * (-604)) + (((~(iIdentityHashCode | 1721520228)) | 1149239300) * 302)) {
            throw null;
        }
        super.onResume();
        int i7 = notify + 57;
        onTransact = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -577483530
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.reflect.Member[] r1 = defpackage.calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            java.util.Random r4 = new java.util.Random
            r4.<init>()
            int r4 = r4.nextInt()
            int r4 = ~r4
            r5 = 299264942(0x11d66bae, float:3.382961E-28)
            r4 = r4 | r5
            int r5 = r4 * 495
            r6 = -951316767(0xffffffffc74c0ee1, float:-52238.88)
            int r6 = r6 + r5
            r5 = 277899562(0x1090692a, float:5.6960016E-29)
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = r4 * 495
            int r6 = r6 + r4
            r4 = -1
            r5 = 1
            if (r1 == r6) goto L5f
            int r1 = com.bpjstku.presentation.membership.registration.RegistrationPasswordActivity.onTransact
            int r1 = r1 + 103
            int r6 = r1 % 128
            com.bpjstku.presentation.membership.registration.RegistrationPasswordActivity.notify = r6
            int r1 = r1 % r0
            r6 = -577483531(0xffffffffdd944cf5, float:-1.3357732E18)
            r7 = -577483530(0xffffffffdd944cf6, float:-1.3357733E18)
            if (r1 == 0) goto L4e
            int[] r1 = new int[r7]
            r1[r6] = r5
            r1 = r1[r4]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r5)
            r1.show()
            goto L5f
        L4e:
            int[] r1 = new int[r7]
            r1[r6] = r5
            r6 = -234967186(0xfffffffff1feaf6e, float:-2.5222808E30)
            int r6 = r6 % r0
            r1 = r1[r4]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r5)
            r1.show()
        L5f:
            java.lang.reflect.Member[] r1 = defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r2 = java.lang.System.identityHashCode(r11)
            r6 = 2104950062(0x7d76fd2e, float:2.0519042E37)
            r6 = r6 | r2
            int r6 = ~r6
            int r6 = r6 * (-301)
            r7 = -615901604(0xffffffffdb4a165c, float:-5.688253E16)
            int r7 = r7 + r6
            r6 = -2104687919(0xffffffff828d02d1, float:-2.0719704E-37)
            r8 = r6 | r2
            int r8 = ~r8
            int r9 = ~r2
            r10 = 474368046(0x1c46482e, float:6.5605995E-22)
            r9 = r9 | r10
            int r9 = ~r9
            r8 = r8 | r9
            int r8 = r8 * (-301)
            int r7 = r7 + r8
            r8 = -474368047(0xffffffffe3b9b7d1, float:-6.851786E21)
            r2 = r2 | r8
            int r2 = ~r2
            r2 = r2 | r6
            int r2 = r2 * 301
            int r7 = r7 + r2
            if (r1 == r7) goto Laa
            r1 = -1084933687(0xffffffffbf5539c9, float:-0.832913)
            int[] r1 = new int[r1]
            r2 = -1084933688(0xffffffffbf5539c8, float:-0.8329129)
            r1[r2] = r5
            r2 = -1691359736(0xffffffff9b2fe608, float:-1.4549988E-22)
            int r2 = r2 % r0
            r1 = r1[r4]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r5)
            r1.show()
        Laa:
            super.onStart()
            int r1 = com.bpjstku.presentation.membership.registration.RegistrationPasswordActivity.onTransact
            int r1 = r1 + 123
            int r2 = r1 % 128
            com.bpjstku.presentation.membership.registration.RegistrationPasswordActivity.notify = r2
            int r1 = r1 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.RegistrationPasswordActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = notify + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = (int) Runtime.getRuntime().totalMemory();
        if (i4 != (((~(1223189037 | i5)) | (-1602725244)) * 398) + 178040124 + (((~((~i5) | 1223189037)) | (-1602725244)) * 398)) {
            int i6 = 1552853110 % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i8 = ~System.identityHashCode(this);
        if (i7 != (-1262851860) + ((2127167463 | i8) * 184) + (((~(i8 | 243385540)) | 2051652515) * 184)) {
            int i9 = notify + 65;
            onTransact = i9 % 128;
            if (i9 % 2 == 0) {
                int[] iArr = new int[1349660666];
                iArr[1349660665] = 1;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            } else {
                int[] iArr2 = new int[1349660666];
                iArr2[1349660665] = 1;
                int i10 = (-1288466390) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        super.onCreate(bundle);
        int i11 = notify + 21;
        onTransact = i11 % 128;
        if (i11 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegistrationPasswordActivity registrationPasswordActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            registrationPasswordActivity.onTransact().btnNext.setEnabled(bool.booleanValue());
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        registrationPasswordActivity.onTransact().btnNext.setEnabled(bool.booleanValue());
        Unit unit2 = Unit.INSTANCE;
        int i3 = notify + 51;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a A[SYNTHETIC] */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegistrationPasswordActivity registrationPasswordActivity, Map map) {
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 89;
        notify = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNull(map);
        ActivityRegistrationPasswordBinding activityRegistrationPasswordBindingOnTransact = registrationPasswordActivity.onTransact();
        for (Map.Entry entry : map.entrySet()) {
            ValidationType validationType = (ValidationType) entry.getKey();
            RegistrationPasswordActivity registrationPasswordActivity2 = registrationPasswordActivity;
            if (((Boolean) entry.getValue()).booleanValue()) {
                i = R.drawable.ic_check_active;
            } else {
                int i5 = notify + 39;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                i = R.drawable.ic_check_inactive;
            }
            Drawable drawable = ContextCompat.getDrawable(registrationPasswordActivity2, i);
            int i7 = WhenMappings.$EnumSwitchMapping$0[validationType.ordinal()];
            if (i7 == 1) {
                activityRegistrationPasswordBindingOnTransact.tvLengthValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                int i8 = onTransact + 63;
                notify = i8 % 128;
                int i9 = i8 % 2;
            } else if (i7 != 2) {
                int i10 = notify + 83;
                onTransact = i10 % 128;
                if (i10 % 2 == 0) {
                    if (i7 == 4) {
                        activityRegistrationPasswordBindingOnTransact.tvDigitValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    } else {
                        if (i7 == 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        activityRegistrationPasswordBindingOnTransact.tvSpecialCharValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                } else if (i7 == 3) {
                    activityRegistrationPasswordBindingOnTransact.tvDigitValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    if (i7 == 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    activityRegistrationPasswordBindingOnTransact.tvSpecialCharValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                }
            } else {
                activityRegistrationPasswordBindingOnTransact.tvUpperLowerValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ RegisteredMemberRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegistrationPasswordActivity registrationPasswordActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Parcelable parcelableExtra = registrationPasswordActivity.getIntent().getParcelableExtra("registration_data");
        Intrinsics.checkNotNull(parcelableExtra);
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) parcelableExtra;
        int i4 = onTransact + 91;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return registeredMemberRegistration;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(RegistrationPasswordActivity registrationPasswordActivity, UserLocationComplete userLocationComplete) throws IOException {
        String str;
        String str2;
        String str3;
        int i = 2 % 2;
        String str4 = "";
        Intrinsics.checkNotNullParameter(userLocationComplete, "");
        registrationPasswordActivity.g = String.valueOf(userLocationComplete.b);
        registrationPasswordActivity.d = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        LocationAddressInfo locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo != null) {
            int i2 = onTransact + 87;
            notify = i2 % 128;
            int i3 = i2 % 2;
            str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        registrationPasswordActivity.asInterface = str;
        registrationPasswordActivity.asBinder = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        LocationAddressInfo locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 != null) {
            int i4 = notify + 75;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                String str5 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str2 == null) {
                str2 = "";
            }
        } else {
            str2 = "";
        }
        registrationPasswordActivity.a = str2;
        LocationAddressInfo locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 != null && (str3 = locationAddressInfo3.d) != null) {
            str4 = str3;
        }
        registrationPasswordActivity.cancel = str4;
        String str6 = registrationPasswordActivity.g;
        String str7 = registrationPasswordActivity.d;
        String str8 = registrationPasswordActivity.asInterface;
        String str9 = registrationPasswordActivity.asBinder;
        String str10 = registrationPasswordActivity.a;
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

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(RegistrationPasswordActivity registrationPasswordActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        notify = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault2(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 1173166270, new Object[]{registrationPasswordActivity}, DelegatingImageCapturedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1217893562, zzrf.b(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 466253842, 1217893563)).booleanValue();
        int i4 = notify + 75;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(RegistrationPasswordActivity registrationPasswordActivity, Boolean bool) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Intrinsics.checkNotNull(bool);
        boolean zBooleanValue = bool.booleanValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int defaultSize = View.getDefaultSize(0, 0) + 876;
            int mirror = AndroidCharacter.getMirror('0') - '&';
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) (-bArr[12]), (byte) (-bArr[26]), (short) 210, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec, defaultSize, mirror, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{855290539, 311968368, 1958596895, -1725553178, -1110043479, 427628101, 870514714, 1466223195, -108484346, 994334699, -411303439, 519013799, -1147455638, -557577938}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{29292794, -717437064, -2027655722, -1812956010, 1673804598, 84724622, -617931306, 1926653905, 1062083929, 215156429}, 14 - TextUtils.lastIndexOf("", '0', 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
            int keyRepeatDelay = 876 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int offsetBefore = 10 - TextUtils.getOffsetBefore("", 0);
            byte[] bArr2 = $$a;
            byte b = (byte) (-bArr2[17]);
            byte b2 = bArr2[24];
            Object[] objArr5 = new Object[1];
            c(b, b2, (short) (b2 | 200), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(bitsPerPixel, keyRepeatDelay, offsetBefore, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 876;
                int iMyPid = 10 + (Process.myPid() >> 22);
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                c((byte) (-bArr3[12]), bArr3[42], (short) 200, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, maximumFlingVelocity, iMyPid, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i2 = ~Process.myPid();
            int i3 = ((1163938084 + ((267124731 | i2) * 184)) + (((~(i2 | 266990968)) | 40577755) * 184)) - 2052065221;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new int[]{1973659995, -2038009816, -1992182150, 1762898800, 258355625, 755256844, 204184525, 291357810, 520178362, -839859306}, (ViewConfiguration.getPressedStateDuration() >> 16) + 16, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new int[]{1407963961, 1458204101, -366906442, 1465128332, -886510214, -1971546206, -421782783, -36742067, -186112532, -901479532}, View.resolveSize(0, 0) + 16, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, registrationPasswordActivity)).intValue();
            int i6 = notify + 15;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr10 = {Integer.valueOf(iIntValue), -2052065221};
                byte[] bArr4 = $$m;
                byte b3 = bArr4[28];
                byte b4 = bArr4[51];
                Object[] objArr11 = new Object[1];
                f(b3, b4, b4, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b5 = bArr4[51];
                byte b6 = bArr4[28];
                Object[] objArr12 = new Object[1];
                f(b5, b6, b6, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 876;
                    int iBlue = 10 - Color.blue(0);
                    byte[] bArr5 = $$a;
                    Object[] objArr14 = new Object[1];
                    c((byte) (-bArr5[12]), bArr5[42], (short) 200, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarSize, scrollDefaultDelay, iBlue, 1324201839, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new int[]{855290539, 311968368, 1958596895, -1725553178, -1110043479, 427628101, 870514714, 1466223195, -108484346, 994334699, -411303439, 519013799, -1147455638, -557577938}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new int[]{29292794, -717437064, -2027655722, -1812956010, 1673804598, 84724622, -617931306, 1926653905, 1062083929, 215156429}, 15 - Gravity.getAbsoluteGravity(0, 0), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int maximumFlingVelocity2 = 876 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int i8 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9;
                        byte[] bArr6 = $$a;
                        byte b7 = (byte) (-bArr6[17]);
                        byte b8 = bArr6[24];
                        Object[] objArr17 = new Object[1];
                        c(b7, b8, (short) (b8 | 200), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop, maximumFlingVelocity2, i8, 254769921, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cMyTid = (char) (Process.myTid() >> 22);
                        int iBlue2 = 876 - Color.blue(0);
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 10;
                        byte[] bArr7 = $$a;
                        Object[] objArr18 = new Object[1];
                        c((byte) (-bArr7[12]), (byte) (-bArr7[26]), (short) 210, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyTid, iBlue2, offsetAfter, -1199417970, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
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
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr == null) {
                throw null;
            }
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i9 = notify + 63;
        onTransact = i9 % 128;
        int i10 = i9 % 2;
        int i11 = ((int[]) objArr[1])[0];
        Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i12 = ~(238709527 | startUptimeMillis);
        int i13 = ~startUptimeMillis;
        int i14 = i12 | (~(279019756 | i13));
        int i15 = ~((-238709528) | i13);
        int i16 = i11 + (-820027964) + ((i14 | i15) * (-516)) + (((~(startUptimeMillis | (-276922601))) | (~((-2097157) | i13))) * 516) + ((2097156 | i15) * 516);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr19[1])[0] = i18 ^ (i18 << 5);
        if (zBooleanValue) {
            registrationPasswordActivity.onTransact().tilConfirmedPassword.setError(null);
            registrationPasswordActivity.onTransact().tilConfirmedPassword.setErrorIconDrawable((Drawable) null);
        } else {
            int i19 = notify + 95;
            onTransact = i19 % 128;
            int i20 = i19 % 2;
            registrationPasswordActivity.onTransact().tilConfirmedPassword.setError(registrationPasswordActivity.getString(R.string.error_unmatch_password));
            registrationPasswordActivity.onTransact().tilConfirmedPassword.setErrorIconDrawable((Drawable) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x016f A[Catch: all -> 0x020b, TryCatch #0 {all -> 0x020b, blocks: (B:4:0x0023, B:50:0x0203, B:7:0x009b, B:9:0x00b2, B:11:0x00b8, B:15:0x00fd, B:18:0x0102, B:20:0x010b, B:24:0x011e, B:26:0x0126, B:27:0x013b, B:29:0x0141, B:31:0x0150, B:32:0x0154, B:42:0x019b, B:44:0x01c2, B:46:0x01cb, B:48:0x01d1, B:49:0x01d5, B:33:0x016f, B:35:0x0176, B:52:0x0207, B:53:0x020a, B:56:0x020d, B:57:0x0281), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0176 A[Catch: all -> 0x020b, TRY_LEAVE, TryCatch #0 {all -> 0x020b, blocks: (B:4:0x0023, B:50:0x0203, B:7:0x009b, B:9:0x00b2, B:11:0x00b8, B:15:0x00fd, B:18:0x0102, B:20:0x010b, B:24:0x011e, B:26:0x0126, B:27:0x013b, B:29:0x0141, B:31:0x0150, B:32:0x0154, B:42:0x019b, B:44:0x01c2, B:46:0x01cb, B:48:0x01d1, B:49:0x01d5, B:33:0x016f, B:35:0x0176, B:52:0x0207, B:53:0x020a, B:56:0x020d, B:57:0x0281), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x017f  */
    /* JADX WARN: Code duplicated, block: B:38:0x018b  */
    /* JADX WARN: Code duplicated, block: B:39:0x018e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0207 A[Catch: all -> 0x020b, TryCatch #0 {all -> 0x020b, blocks: (B:4:0x0023, B:50:0x0203, B:7:0x009b, B:9:0x00b2, B:11:0x00b8, B:15:0x00fd, B:18:0x0102, B:20:0x010b, B:24:0x011e, B:26:0x0126, B:27:0x013b, B:29:0x0141, B:31:0x0150, B:32:0x0154, B:42:0x019b, B:44:0x01c2, B:46:0x01cb, B:48:0x01d1, B:49:0x01d5, B:33:0x016f, B:35:0x0176, B:52:0x0207, B:53:0x020a, B:56:0x020d, B:57:0x0281), top: B:60:0x0021 }] */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(RegistrationPasswordActivity registrationPasswordActivity, View view) {
        int i;
        String str;
        int i2 = 2 % 2;
        int i3 = onTransact + 57;
        notify = i3 % 128;
        int i4 = i3 % 2;
        String str2 = null;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i4 != 0) {
                Intrinsics.checkNotNull(view);
                VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, registrationPasswordActivity);
                registrationPasswordActivity.onTransact().passwordContainer.requestFocus();
                ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault2(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 1173166270, new Object[]{registrationPasswordActivity}, DelegatingImageCapturedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1217893562, zzrf.b(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 466253842, 1217893563)).booleanValue();
                str2.hashCode();
                throw null;
            }
            Intrinsics.checkNotNull(view);
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, registrationPasswordActivity);
            registrationPasswordActivity.onTransact().passwordContainer.requestFocus();
            if (!(!((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault2(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 1173166270, new Object[]{registrationPasswordActivity}, DelegatingImageCapturedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1217893562, zzrf.b(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 466253842, 1217893563)).booleanValue())) {
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) registrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                EditText editText = registrationPasswordActivity.onTransact().tilPassword.getEditText();
                RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, null, null, StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString(), null, null, null, null, null, null, null, null, null, null, null, null, 8387583);
                String strJoinToString$default = registrationPasswordActivity.asInterface;
                if (strJoinToString$default == null) {
                    strJoinToString$default = "";
                }
                String str3 = registrationPasswordActivity.a;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = strJoinToString$default;
                if (!StringsKt.isBlank(str4) && (!StringsKt.isBlank(str3))) {
                    int i5 = onTransact + 119;
                    notify = i5 % 128;
                    int i6 = i5 % 2;
                    if (!StringsKt.equals(str3, "Indonesia", true)) {
                        List listListOf = CollectionsKt.listOf((Object[]) new String[]{strJoinToString$default, str3});
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listListOf) {
                            if (!StringsKt.isBlank((String) obj)) {
                                arrayList.add(obj);
                            }
                        }
                        strJoinToString$default = CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
                    } else if (!(!StringsKt.isBlank(str4))) {
                        i = notify + 79;
                        onTransact = i % 128;
                        if (i % 2 == 0) {
                            str2.hashCode();
                            throw null;
                        }
                    } else if (StringsKt.isBlank(str3)) {
                        str = "";
                    } else {
                        int i7 = onTransact + 93;
                        notify = i7 % 128;
                        int i8 = i7 % 2;
                        str = str3;
                    }
                    str = strJoinToString$default;
                } else if (!(!StringsKt.isBlank(str4))) {
                    i = notify + 79;
                    onTransact = i % 128;
                    if (i % 2 == 0) {
                        str2.hashCode();
                        throw null;
                    }
                    str = strJoinToString$default;
                } else if (StringsKt.isBlank(str3)) {
                    int i9 = onTransact + 93;
                    notify = i9 % 128;
                    int i10 = i9 % 2;
                    str = str3;
                } else {
                    str = "";
                }
                setSplitTrack setsplittrack = (setSplitTrack) registrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                String string = Settings.Secure.getString(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getContentResolver(), "android_id");
                Intrinsics.checkExpressionValueIsNotNull(string, "");
                String str5 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
                String str6 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.notify;
                String str7 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.a;
                String str8 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface;
                String str9 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.d;
                MembershipType membershipType = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                String strName = membershipType != null ? membershipType.name() : null;
                String str10 = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.cancelAll;
                Citizenship citizenship = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new RegisterRequest(string, str5, citizenship != null ? citizenship.name() : null, strName, str9, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder, str8, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.g, str7, str10, "fcmid997797656579", str6, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel, String.valueOf(registrationPasswordActivity.g), String.valueOf(registrationPasswordActivity.d), str));
            }
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(RegistrationPasswordActivity registrationPasswordActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        Editable text;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = onTransact + 13;
            notify = i2 % 128;
            int i3 = i2 % 2;
            registrationPasswordActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            registrationPasswordActivity.IconCompatParcelizer();
            RegistrationSuccessActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationSuccessActivity.INSTANCE;
            RegistrationPasswordActivity registrationPasswordActivity2 = registrationPasswordActivity;
            RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) registrationPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            EditText editText = registrationPasswordActivity.onTransact().tilPassword.getEditText();
            if (editText != null) {
                text = editText.getText();
            } else {
                int i4 = onTransact + 19;
                notify = i4 % 128;
                int i5 = i4 % 2;
                text = null;
            }
            RegistrationSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationPasswordActivity2, RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, null, null, StringsKt.trim((CharSequence) String.valueOf(text)).toString(), null, null, null, null, null, null, null, null, null, null, null, null, 8387583));
            registrationPasswordActivity.d_();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i6 = notify + 21;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                registrationPasswordActivity.IconCompatParcelizer();
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 1).show();
            } else {
                registrationPasswordActivity.IconCompatParcelizer();
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x005b  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(RegistrationPasswordActivity registrationPasswordActivity) throws IOException {
        int i = 2 % 2;
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Camera2CameraControlExternalSyntheticLambda4 camera2CameraControlExternalSyntheticLambda4B = ExperimentalCamera2Interop.b((PreferenceManager) registrationPasswordActivity.b.getValue());
        if (camera2CameraControlExternalSyntheticLambda4B != null) {
            int i2 = onTransact + 81;
            notify = i2 % 128;
            int i3 = i2 % 2;
            if (camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                registrationPasswordActivity.g = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
                registrationPasswordActivity.d = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                registrationPasswordActivity.asInterface = camera2CameraControlExternalSyntheticLambda4B.b;
                registrationPasswordActivity.asBinder = camera2CameraControlExternalSyntheticLambda4B.g;
                registrationPasswordActivity.a = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                registrationPasswordActivity.cancel = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                String str = registrationPasswordActivity.g;
                String str2 = registrationPasswordActivity.d;
                StringBuilder sb = new StringBuilder("Location from cache: ");
                sb.append(str);
                sb.append(", ");
                sb.append(str2);
                getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
            } else {
                registrationPasswordActivity.g = "0.0";
                registrationPasswordActivity.d = "0.0";
                ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
                getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
            }
        } else {
            registrationPasswordActivity.g = "0.0";
            registrationPasswordActivity.d = "0.0";
            ExperimentalCamera2Interop experimentalCamera2Interop3 = ExperimentalCamera2Interop.INSTANCE;
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = notify + 25;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        cancelAll = 1;
        d();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannel + 91;
        cancelAll = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ ActivityRegistrationPasswordBinding TuitionPaymentFragmentbindingInflater1(RegistrationPasswordActivity registrationPasswordActivity) {
        return (ActivityRegistrationPasswordBinding) TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzrf.b(), new Object[]{registrationPasswordActivity}, zzrf.b(), -1605159750, zzrf.b(), zzrf.b(), 1605159750);
    }

    private final boolean g() {
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault2(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 1173166270, new Object[]{this}, DelegatingImageCapturedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1217893562, zzrf.b(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 466253842, 1217893563)).booleanValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        int i3 = i2 % 128;
        notify = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 21;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return R.layout.activity_registration_password;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 79 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzrf.b(), new Object[]{this}, DelegatingImageCapturedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 421859800, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1041).substring(0, 25).length() + 331468001, zzrf.b(), -421859797);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(DelegatingImageCapturedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this}, DelegatingImageCapturedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 95969051, 977081213 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 1652308819, -95969047);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzrf.b(), new Object[]{this}, DelegatingImageCapturedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1825846224, zzrf.b(), 1017002165 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_confirm_button).substring(1, 3).length(), -1825846222);
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        notify = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = notify + 51;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
    }

    static void d() {
        cancel = new int[]{1196456740, 1566848690, -44900189, -1366066470, 1786716232, -192116874, -1857716963, 1850493593, -54254323, -959495571, -1956929068, 103065917, 775487723, 746983355, -1332183046, 1706545519, 2018529172, 2050574622};
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = notify + 23;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        notify = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, byte r7, int r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r0 = com.bpjstku.presentation.membership.registration.RegistrationPasswordActivity.$$c
            int r8 = r8 * 56
            int r8 = 122 - r8
            int r7 = r7 * 4
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L19
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2f:
            int r6 = r6 + 1
            int r4 = -r4
            int r8 = r8 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.RegistrationPasswordActivity.$$i(short, byte, int):java.lang.String");
    }
}
