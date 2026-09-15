package com.bpjstku.presentation.vocational;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.user.model.response.ForgotPasswordItem;
import com.bpjstku.databinding.ActivityVocationalRegistrationBinding;
import com.bpjstku.databinding.ItemProgramChosenBinding;
import com.bpjstku.databinding.LayoutRegistrationProgressBinding;
import com.bpjstku.presentation.vocational.VocationalRegistrationActivity;
import com.bpjstku.presentation.vocational.model.VocationRegistrationStep;
import com.bpjstku.presentation.vocational.model.VocationalRegistration;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.mlkit_common.zzin;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.CameraUseCaseAdapter;
import defpackage.ViewPortBuilder;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.getExcludedSizes;
import defpackage.getIncrementalScaleFactor;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.isMotoE5Play;
import defpackage.isPositivoTwist2Pro;
import defpackage.lambdanew0androidxcameracamera2internalcompatworkaroundRequestMonitorRequestCompleteListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0007\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0004R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\u001c8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0016\u0010\b\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u00198UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010 R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00020!8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010#R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0007\u0010%"}, d2 = {"Lcom/bpjstku/presentation/vocational/VocationalRegistrationActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityVocationalRegistrationBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asInterface", "asBinder", "a", "Lcom/bpjstku/presentation/vocational/model/VocationRegistrationStep;", "p0", "(Lcom/bpjstku/presentation/vocational/model/VocationRegistrationStep;)V", "Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;", "p1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/bpjstku/presentation/vocational/model/VocationRegistrationStep;Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;)V", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onBackPressed", "INotificationSideChannel", "", "I", "TuitionPaymentFragmentbindingInflater1", "Llambdanew0androidxcameracamera2internalcompatworkaroundRequestMonitorRequestCompleteListener;", "Llambdanew0androidxcameracamera2internalcompatworkaroundRequestMonitorRequestCompleteListener;", "Lcom/bpjstku/presentation/vocational/model/VocationRegistrationStep;", "Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "Lcom/bpjstku/databinding/LayoutRegistrationProgressBinding;", "Lcom/bpjstku/databinding/LayoutRegistrationProgressBinding;", "g"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VocationalRegistrationActivity extends BindingBaseActivity<ActivityVocationalRegistrationBinding> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long g;
    private static int notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private lambdanew0androidxcameracamera2internalcompatworkaroundRequestMonitorRequestCompleteListener b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private LayoutRegistrationProgressBinding g;
    private static final byte[] $$a = {101, 89, 94, -73, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 158;
    private static int asInterface = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f657a = 0;
    private static int d = 1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private int TuitionPaymentFragmentbindingInflater1 = 3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private VocationRegistrationStep TuitionPaymentFragmentspecialinlinedviewModeldefault2 = VocationRegistrationStep.STEP_1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private VocationalRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new VocationalRegistration(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ViewCompat.MEASURED_SIZE_MASK, null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VocationRegistrationStep.values().length];
            try {
                iArr[VocationRegistrationStep.STEP_2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VocationRegistrationStep.STEP_3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VocationRegistrationStep.STEP_1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws IllegalAccessException {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~i2;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i6 | i5);
        int i12 = i2 | i11;
        int i13 = (~(i2 | i5)) | (~(i7 | i8 | i9)) | i11 | (~(i6 | i2));
        int i14 = i6 + i5 + i3 + (1272450877 * i4) + ((-51365948) * i);
        int i15 = i14 * i14;
        int i16 = ((-261444822) * i6) + 922746880 + ((-1437248296) * i5) + ((-1175803474) * i10) + (i12 * 587901737) + (587901737 * i13) + ((-849346560) * i3) + ((-1881145344) * i4) + ((-578813952) * i) + ((-124846080) * i15);
        int i17 = (i6 * 1187242746) + 1002376400 + (i5 * 1187242392) + (i10 * (-354)) + (i12 * 177) + (i13 * 177) + (i3 * 1187242569) + (i4 * (-1484311963)) + (1141305060 * i) + (i15 * 516358144);
        int i18 = i16 + (i17 * i17 * (-861863936));
        if (i18 != 1) {
            if (i18 != 2) {
                return i18 != 3 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            }
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        VocationalRegistrationActivity vocationalRegistrationActivity = (VocationalRegistrationActivity) objArr[0];
        int i19 = 2 % 2;
        int i20 = f657a + 37;
        d = i20 % 128;
        if (i20 % 2 == 0) {
            int i21 = ((Field) CameraUseCaseAdapter.b[1]).getInt(null);
            int i22 = ~(10744687 | i);
            if (i21 != 433137493 + (((-851443568) | i22) * (-814)) + ((i22 | (~((~i) | 840732230)) | 33350) * 407) + (((~((-10744688) | i)) | 33350 | (~((-840732231) | i))) * 407)) {
                throw null;
            }
        } else {
            int i23 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
            int i24 = ~i;
            int i25 = (~((-91642772) | i24)) | 17828241;
            int i26 = ~((-847815785) | i);
            if (i23 != (-470145154) + ((i25 | i26) * (-502)) + (((~(i24 | (-73814531))) | i26) * TypedValues.PositionType.TYPE_DRAWPATH)) {
                throw null;
            }
        }
        int i27 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i28 = ~i;
        if (i27 != 479161148 + (((~(i28 | (-1218445329))) | (~((-285620803) | i28))) * (-184)) + ((537494917 | (~((-823115720) | i28)) | (~((-1755940246) | i28))) * 184) + 1985077896) {
            int i29 = 1095811308 % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i30 = d + 105;
        f657a = i30 % 128;
        int i31 = i30 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.vocational.VocationalRegistrationActivity.$$a
            int r8 = 145 - r8
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2c
        L12:
            r3 = r2
        L13:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r8 = r8 + 1
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalRegistrationActivity.c(byte, int, short, java.lang.Object[]):void");
    }

    public static final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(VocationalRegistrationActivity vocationalRegistrationActivity, VocationRegistrationStep vocationRegistrationStep, VocationalRegistration vocationalRegistration) {
        int i = 2 % 2;
        int i2 = d + 103;
        f657a = i2 % 128;
        int i3 = i2 % 2;
        vocationalRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(vocationRegistrationStep, vocationalRegistration);
        int i4 = d + 77;
        f657a = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.vocational.VocationalRegistrationActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lcom/bpjstku/presentation/vocational/VocationalRegistrationActivity$Companion;", "", "<init>", "()V", "start", "", "context", "Landroid/content/Context;", "registrationData", "Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context, VocationalRegistrationActivity.class, new Pair[]{TuplesKt.to("vocation_registration_data", null)});
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, VocationalRegistration vocationalRegistration) {
            Intrinsics.checkNotNullParameter(context, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context, VocationalRegistrationActivity.class, new Pair[]{TuplesKt.to("vocation_registration_data", vocationalRegistration)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityVocationalRegistrationBinding> TuitionPaymentFragmentbindingInflater1() {
        VocationalRegistrationActivity$bindingInflater$1 vocationalRegistrationActivity$bindingInflater$1;
        int i = 2 % 2;
        int i2 = d + 33;
        f657a = i2 % 128;
        if (i2 % 2 != 0) {
            vocationalRegistrationActivity$bindingInflater$1 = VocationalRegistrationActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = 32 / 0;
        } else {
            vocationalRegistrationActivity$bindingInflater$1 = VocationalRegistrationActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int i4 = f657a + 93;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return vocationalRegistrationActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        final VocationalRegistrationActivity vocationalRegistrationActivity = (VocationalRegistrationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = d + 49;
        int i3 = i2 % 128;
        f657a = i3;
        int i4 = i2 % 2;
        LayoutRegistrationProgressBinding layoutRegistrationProgressBinding = vocationalRegistrationActivity.g;
        if (layoutRegistrationProgressBinding == null) {
            int i5 = i3 + 115;
            d = i5 % 128;
            if (i5 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            layoutRegistrationProgressBinding = null;
        }
        layoutRegistrationProgressBinding.sbRegisterProgression.setOnTouchListener(new View.OnTouchListener() { // from class: InvalidVideoProfilesQuirk
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return VocationalRegistrationActivity.g();
            }
        });
        ((ActivityVocationalRegistrationBinding) ((ViewBinding) vocationalRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: isAPI33
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VocationalRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
        return null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        VocationalRegistrationActivity vocationalRegistrationActivity = (VocationalRegistrationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = f657a + 17;
        d = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        VocationalRegistration vocationalRegistration = (VocationalRegistration) vocationalRegistrationActivity.getIntent().getParcelableExtra("vocation_registration_data");
        if (vocationalRegistration != null) {
            int i3 = d + 31;
            f657a = i3 % 128;
            int i4 = i3 % 2;
            vocationalRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = vocationalRegistration;
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
        }
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = f657a + 85;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.g = LayoutRegistrationProgressBinding.bind(((ActivityVocationalRegistrationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).getRoot());
        VocationalRegistrationActivity vocationalRegistrationActivity = this;
        Intrinsics.checkNotNullParameter(vocationalRegistrationActivity, "");
        vocationalRegistrationActivity.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivityVocationalRegistrationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = getString(R.string.title_vocational_program);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(VocationRegistrationStep.STEP_1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        int i4 = f657a + 39;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - Color.blue(0)), TextUtils.lastIndexOf("", '0') + 2625, View.MeasureSpec.makeMeasureSpec(0, 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (g ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.blue(0) + 39422), AndroidCharacter.getMirror('0') + 433, ((Process.getThreadPriority(0) + 20) >> 6) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i4 = $10 + 45;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - Color.green(0)), 480 - ExpandableListView.getPackedPositionChild(0L), 37 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i5 = 66 / 0;
            } else {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 39422), (ViewConfiguration.getTapTimeout() >> 16) + 481, 37 - (ViewConfiguration.getEdgeSlop() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        objArr[0] = new String(cArr2);
        int i6 = $11 + 105;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 85 / 0;
        }
    }

    private final void b(VocationRegistrationStep p0) {
        int i = 2 % 2;
        int i2 = d + 5;
        f657a = i2 % 128;
        LayoutRegistrationProgressBinding layoutRegistrationProgressBinding = null;
        if (i2 % 2 != 0) {
            layoutRegistrationProgressBinding.hashCode();
            throw null;
        }
        LayoutRegistrationProgressBinding layoutRegistrationProgressBinding2 = this.g;
        if (layoutRegistrationProgressBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            layoutRegistrationProgressBinding = layoutRegistrationProgressBinding2;
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
        if (i3 != 1) {
            int i4 = f657a + 35;
            int i5 = i4 % 128;
            d = i5;
            int i6 = i4 % 2;
            if (i3 != 2) {
                int i7 = i5 + 41;
                f657a = i7 % 128;
                int i8 = i7 % 2;
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                layoutRegistrationProgressBinding.sbRegisterProgression.setProgress(33);
                layoutRegistrationProgressBinding.tvRegistrationStep.setText(getString(R.string.label_fill_in_participant_data));
                int i9 = f657a + 67;
                d = i9 % 128;
                int i10 = i9 % 2;
            } else {
                layoutRegistrationProgressBinding.sbRegisterProgression.setProgress(100);
                layoutRegistrationProgressBinding.tvRegistrationStep.setText(getString(R.string.label_choose_training));
            }
        } else {
            layoutRegistrationProgressBinding.sbRegisterProgression.setProgress(66);
            layoutRegistrationProgressBinding.tvRegistrationStep.setText(getString(R.string.label_region_and_filed_of_training));
        }
        TextView textView = layoutRegistrationProgressBinding.tvStepNumber;
        int stepNumber = p0.getStepNumber();
        int i11 = this.TuitionPaymentFragmentbindingInflater1;
        StringBuilder sb = new StringBuilder();
        sb.append(stepNumber);
        sb.append("/");
        sb.append(i11);
        textView.setText(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028 A[DONT_INVERT, PHI: r6
  0x0028: PHI (r6v3 int) = (r6v2 int), (r6v16 int) binds: [B:8:0x0026, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(VocationRegistrationStep p0, VocationalRegistration p1) {
        int i;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f657a + 95;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = p1;
            i = WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
            if (i == 1) {
                isPositivoTwist2Pro.Companion bVar = isPositivoTwist2Pro.INSTANCE;
                isPositivoTwist2Pro ispositivotwist2proTuitionPaymentFragmentspecialinlinedviewModeldefault1 = isPositivoTwist2Pro.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                ispositivotwist2proTuitionPaymentFragmentspecialinlinedviewModeldefault1.g = new VocationalRegistrationActivity$onStepChanged$replacementFragment$2$1(this);
                obj = ispositivotwist2proTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            } else if (i != 2) {
                getExcludedSizes.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = getExcludedSizes.INSTANCE;
                getExcludedSizes getexcludedsizesTuitionPaymentFragmentbindingInflater1 = getExcludedSizes.Companion.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                getexcludedsizesTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 = new VocationalRegistrationActivity$onStepChanged$replacementFragment$3$1(this);
                obj = getexcludedsizesTuitionPaymentFragmentbindingInflater1;
            } else {
                if (i == 3) {
                    throw new NoWhenBranchMatchedException();
                }
                isMotoE5Play.Companion tuitionPaymentFragmentbindingInflater1 = isMotoE5Play.INSTANCE;
                isMotoE5Play ismotoe5playB = isMotoE5Play.Companion.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                ismotoe5playB.asBinder = new VocationalRegistrationActivity$onStepChanged$replacementFragment$1$1(this);
                int i4 = d + 71;
                f657a = i4 % 128;
                int i5 = i4 % 2;
                obj = ismotoe5playB;
            }
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = p1;
            i = WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
            if (i == 1) {
                isPositivoTwist2Pro.Companion bVar2 = isPositivoTwist2Pro.INSTANCE;
                isPositivoTwist2Pro ispositivotwist2proTuitionPaymentFragmentspecialinlinedviewModeldefault2 = isPositivoTwist2Pro.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                ispositivotwist2proTuitionPaymentFragmentspecialinlinedviewModeldefault2.g = new VocationalRegistrationActivity$onStepChanged$replacementFragment$2$1(this);
                obj = ispositivotwist2proTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else if (i != 2) {
                getExcludedSizes.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = getExcludedSizes.INSTANCE;
                getExcludedSizes getexcludedsizesTuitionPaymentFragmentbindingInflater2 = getExcludedSizes.Companion.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                getexcludedsizesTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentbindingInflater1 = new VocationalRegistrationActivity$onStepChanged$replacementFragment$3$1(this);
                obj = getexcludedsizesTuitionPaymentFragmentbindingInflater2;
            } else {
                if (i == 3) {
                    throw new NoWhenBranchMatchedException();
                }
                isMotoE5Play.Companion tuitionPaymentFragmentbindingInflater2 = isMotoE5Play.INSTANCE;
                isMotoE5Play ismotoe5playB2 = isMotoE5Play.Companion.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                ismotoe5playB2.asBinder = new VocationalRegistrationActivity$onStepChanged$replacementFragment$1$1(this);
                int i6 = d + 71;
                f657a = i6 % 128;
                int i7 = i6 % 2;
                obj = ismotoe5playB2;
            }
        }
        Intrinsics.checkNotNull(obj, "");
        Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, R.id.vocationalRegistrationContainer, (Fragment) obj, true);
        this.b = (lambdanew0androidxcameracamera2internalcompatworkaroundRequestMonitorRequestCompleteListener) obj;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = p0;
        b(p0);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = f657a + 81;
        d = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i3 = d + 107;
                f657a = i3 % 128;
                if (i3 % 2 != 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    int i4 = 33 / 0;
                } else {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i5 = d + 51;
            f657a = i5 % 128;
            int i6 = i5 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = f657a + 87;
        d = i2 % 128;
        int i3 = i2 % 2;
        INotificationSideChannel();
        int i4 = d + 11;
        f657a = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void INotificationSideChannel() {
        int i = 2 % 2;
        int i2 = f657a + 51;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getStepNumber() <= 1) {
            d_();
            return;
        }
        lambdanew0androidxcameracamera2internalcompatworkaroundRequestMonitorRequestCompleteListener lambdanew0androidxcameracamera2internalcompatworkaroundrequestmonitorrequestcompletelistener = this.b;
        if (lambdanew0androidxcameracamera2internalcompatworkaroundrequestmonitorrequestcompletelistener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            lambdanew0androidxcameracamera2internalcompatworkaroundrequestmonitorrequestcompletelistener = null;
        }
        lambdanew0androidxcameracamera2internalcompatworkaroundrequestmonitorrequestcompletelistener.TuitionPaymentFragmentbindingInflater1();
        int i4 = f657a + 29;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrB$5f1425da;
        int i = 2 % 2;
        int i2 = d + 125;
        f657a = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1031;
            int packedPositionGroup = 15 - ExpandableListView.getPackedPositionGroup(0L);
            Object[] objArr2 = new Object[1];
            c($$a[132], (byte) 52, (short) 141, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, longPressTimeout, packedPositionGroup, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{46111, 19341, 19232, 19163, 19045, 18950, 18868, 18715, 18681, 18568, 18546, 20370, 20315, 20212, 20124, 20008, 19907, 19792, 19736, 19638, 19545, 17396}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 65321, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{46107, 24867, 7805, 52125, 57545, 40430, 19260, 24699, 7571, 51878, 59384, 40209, 19035, 26478, 7349}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message).substring(0, 25).codePointAt(21) + 54473, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
            int capsMode = 1031 - TextUtils.getCapsMode("", 0, 0);
            int iIndexOf = 15 - TextUtils.indexOf("", "", 0);
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            c(bArr[132], (byte) 52, bArr[1], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionGroup2, capsMode, iIndexOf, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int jumpTapTimeout = 1031 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int iMyTid = 15 - (Process.myTid() >> 22);
                byte b = $$a[7];
                byte b2 = b;
                Object[] objArr6 = new Object[1];
                c(b, b2, (short) (b2 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumDrawingCacheSize, jumpTapTimeout, iMyTid, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[3])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
            int i7 = (-565164578) + (((~((-538405741) | i6)) | (~((-294125571) | i6))) * 69) + (((~(i6 | (-401084548))) | (~((-645364718) | i6)) | 106958977) * (-69)) + 1771666385;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{46100, 41106, 40210, 35256, 58980, 53971, 53073, 15307, 4209, 3237, 31151, 22024, 17041, 48931, 43949, 32848}, 5262 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{46103, 60819, 1801, 47243, 53806, 3002, 44348, 50872, 30846, 37326, 52055, 27893, 34385, 16356, 20836, 35612}, View.MeasureSpec.getSize(0) + 22921, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1702479928};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.resolveSize(0, 0) + 46038), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1134, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -2122980479, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int keyRepeatDelay = 1031 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 15;
                    Object[] objArr12 = new Object[1];
                    c($$a[132], (byte) 52, (short) 141, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(doubleTapTimeout, keyRepeatDelay, edgeSlop, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf("", "", 0) + 45993), View.MeasureSpec.getSize(0) + 1117, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                    int capsMode2 = 1031 - TextUtils.getCapsMode("", 0, 0);
                    int defaultSize = 15 - View.getDefaultSize(0, 0);
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr13 = new Object[1];
                    c(b3, b4, (short) (b4 | 37), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMakeMeasureSpec, capsMode2, defaultSize, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{46111, 19341, 19232, 19163, 19045, 18950, 18868, 18715, 18681, 18568, 18546, 20370, 20315, 20212, 20124, 20008, 19907, 19792, 19736, 19638, 19545, 17396}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.failed_to_get_bank_point).substring(1, 2).length() + 65436, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{46107, 24867, 7805, 52125, 57545, 40430, 19260, 24699, 7571, 51878, 59384, 40209, 19035, 26478, 7349}, 54577 - Color.alpha(0), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1031;
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 15;
                        byte[] bArr2 = $$a;
                        short s = bArr2[1];
                        Object[] objArr16 = new Object[1];
                        c(bArr2[132], (byte) 52, s, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(absoluteGravity, scrollBarFadeDuration, iKeyCodeFromString, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                        int iMyTid2 = (Process.myTid() >> 22) + 1031;
                        int absoluteGravity2 = 15 - Gravity.getAbsoluteGravity(0, 0);
                        Object[] objArr17 = new Object[1];
                        c($$a[132], (byte) 52, (short) 141, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cLastIndexOf, iMyTid2, absoluteGravity2, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        int i10 = ((int[]) objArr[1])[0];
        int i11 = ((int[]) objArr[3])[0];
        if (i11 == i10) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i12 = ((int[]) objArr[2])[0];
            int i13 = ((int[]) objArr[3])[0];
            int i14 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i15 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1361436535);
            int i16 = i12 + (-1753597967) + (((~(i15 | 385087471)) | (~((-67273474) | i15))) * (-184)) + ((281047084 | (~((-348320558) | i15)) | (~(104040387 | i15))) * 184) + 1824822232;
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr18[2])[0] = i18 ^ (i18 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i19 = d + 21;
                f657a = i19 % 128;
                int i20 = 2;
                int i21 = i19 % 2;
                int i22 = 0;
                while (i22 < strArr3.length) {
                    int i23 = d + 113;
                    f657a = i23 % 128;
                    int i24 = i23 % i20;
                    arrayList.add(strArr3[i22]);
                    i22++;
                    i20 = 2;
                }
            }
            Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i25 = ((int[]) objArr[2])[0];
            int i26 = ((int[]) objArr[3])[0];
            int i27 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i28 = i25 + 1972551637 + ((~((~iIdentityHashCode) | (-303178243))) * (-116)) + ((749313533 | iIdentityHashCode) * 116) + (((~(iIdentityHashCode | 505033363)) | 547458412) * 116);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr19[2])[0] = i30 ^ (i30 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c = (char) (29944 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
            int iResolveSize = View.resolveSize(0, 0) + 1755;
            int i31 = 22 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            byte b5 = $$a[132];
            byte b6 = (byte) (b5 | 36);
            Object[] objArr20 = new Object[1];
            c(b5, b6, b6, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c, iResolveSize, i31, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i32 = d + 23;
            f657a = i32 % 128;
            int i33 = i32 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c2 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1756;
                int i34 = 24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                byte[] bArr3 = $$a;
                Object[] objArr21 = new Object[1];
                c(bArr3[132], (byte) 52, bArr3[1], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c2, bitsPerPixel, i34, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i35 = ((int[]) objArr22[0])[0];
            objArrB$5f1425da = new Object[]{new int[]{i35}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i36 = ((((~(iIdentityHashCode2 | 74302949)) * TypedValues.CycleType.TYPE_EASING) + 137055233) + (((~((~iIdentityHashCode2) | 74302949)) | 2900036) * TypedValues.CycleType.TYPE_EASING)) - 764502123;
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i38 ^ (i38 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{46100, 41106, 40210, 35256, 58980, 53971, 53073, 15307, 4209, 3237, 31151, 22024, 17041, 48931, 43949, 32848}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_4).substring(6, 7).codePointAt(0) + 5164, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{46103, 60819, 1801, 47243, 53806, 3002, 44348, 50872, 30846, 37326, 52055, 27893, 34385, 16356, 20836, 35612}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_with_instalments).substring(4, 5).length() + 22920, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {1702479928};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 42049), 1726 - TextUtils.indexOf("", "", 0), 29 - TextUtils.getTrimmedLength(""), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$5f1425da = ItemProgramChosenBinding.b$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -764502123);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cMyPid = (char) ((Process.myPid() >> 22) + 29944);
                int deadChar = KeyEvent.getDeadChar(0, 0) + 1755;
                int defaultSize2 = 23 - View.getDefaultSize(0, 0);
                byte[] bArr4 = $$a;
                Object[] objArr26 = new Object[1];
                c(bArr4[132], (byte) 52, bArr4[1], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cMyPid, deadChar, defaultSize2, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{46111, 19341, 19232, 19163, 19045, 18950, 18868, 18715, 18681, 18568, 18546, 20370, 20315, 20212, 20124, 20008, 19907, 19792, 19736, 19638, 19545, 17396}, Color.blue(0) + 65437, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{46107, 24867, 7805, 52125, 57545, 40430, 19260, 24699, 7571, 51878, 59384, 40209, 19035, 26478, 7349}, 54577 - Gravity.getAbsoluteGravity(0, 0), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char gidForName = (char) (Process.getGidForName("") + 29945);
                    int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 1755;
                    int gidForName2 = 22 - Process.getGidForName("");
                    byte[] bArr5 = $$a;
                    Object[] objArr29 = new Object[1];
                    c(bArr5[132], (byte) 52, bArr5[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(gidForName, edgeSlop2, gidForName2, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c3 = (char) (29945 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int i39 = 1756 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int jumpTapTimeout2 = 23 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    byte b7 = $$a[132];
                    byte b8 = (byte) (b7 | 36);
                    Object[] objArr30 = new Object[1];
                    c(b7, b8, b8, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, i39, jumpTapTimeout2, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i40 = ((int[]) objArrB$5f1425da[1])[0];
        int i41 = ((int[]) objArrB$5f1425da[0])[0];
        if (i41 == i40) {
            int i42 = d + 39;
            f657a = i42 % 128;
            int i43 = i42 % 2;
            int i44 = ((int[]) objArrB$5f1425da[3])[0];
            int i45 = ((int[]) objArrB$5f1425da[0])[0];
            Object[] objArr31 = {new int[]{i45}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
            int i46 = ~Process.myTid();
            int i47 = i44 + (-251538111) + (((~(i46 | 905376590)) | (~((-2228485) | i46))) * (-184)) + ((557875266 | (~((-560103751) | i46)) | (~(347501324 | i46))) * 184) + 894306696;
            int i48 = (i47 << 13) ^ i47;
            int i49 = i48 ^ (i48 >>> 17);
            ((int[]) objArr31[3])[0] = i49 ^ (i49 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrB$5f1425da[4];
        if (strArr5 != null) {
            int i50 = 0;
            while (i50 < strArr5.length) {
                int i51 = f657a + 103;
                d = i51 % 128;
                int i52 = i51 % 2;
                arrayList2.add(strArr5[i50]);
                i50++;
                int i53 = f657a + 123;
                d = i53 % 128;
                int i54 = i53 % 2;
            }
        }
        Toast.makeText((Context) null, i41 / (((i41 - 1) * i41) % 2), 0).show();
        int i55 = ((int[]) objArrB$5f1425da[3])[0];
        int i56 = ((int[]) objArrB$5f1425da[0])[0];
        Object[] objArr32 = {new int[]{i56}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i57 = ~iIdentityHashCode3;
        int i58 = i55 + 2144037045 + (((~(657313141 | i57)) | (-869915568) | (~((-657313142) | iIdentityHashCode3))) * (-564)) + ((~(iIdentityHashCode3 | (-587843878))) * 1128) + (((~((-869915568) | i57)) | 69469264) * 564);
        int i59 = (i58 << 13) ^ i58;
        int i60 = i59 ^ (i59 >>> 17);
        ((int[]) objArr32[3])[0] = i60 ^ (i60 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -636001751
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalRegistrationActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = f657a + 77;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != (((-1134047304) + (((~iIdentityHashCode) | 536880681) * 1324)) + (((~(iIdentityHashCode | (-1576655125))) | (~(746667581 | iIdentityHashCode))) * (-1324))) - 1856358044) {
            int[] iArr = new int[1903375988];
            iArr[1903375987] = 1;
            int i5 = (-296096228) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i6 = f657a + 119;
            d = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 / 4;
            }
        }
        int i8 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1981197957;
        if (i8 != ((((~(length | 754466040)) | 1824589924) * 56) - 810061676) + (((~((~length) | 1824589924)) | 754466040) * 56)) {
            int i9 = (-1310120262) % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(VocationalRegistrationActivity vocationalRegistrationActivity, View view) {
        int i = 2 % 2;
        int i2 = d + 57;
        f657a = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                vocationalRegistrationActivity.INotificationSideChannel();
                ViewPortBuilder.b();
            } else {
                vocationalRegistrationActivity.INotificationSideChannel();
                ViewPortBuilder.b();
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ boolean g() {
        int i = 2 % 2;
        int i2 = f657a + 3;
        d = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }

    static {
        notify = 1;
        cancelAll();
        INSTANCE = new Companion(null);
        int i = asInterface + 67;
        notify = i % 128;
        if (i % 2 == 0) {
            int i2 = 11 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentbindingInflater1 = ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int length = 1752330045 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault2(ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{this}, length, -1648547853, 1648547856)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws IllegalAccessException {
        int iTuitionPaymentFragmentbindingInflater1 = ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentbindingInflater2, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -2047564311, 2047564311);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault5, 1045648537, -1045648535);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = f657a + 93;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = f657a + 35;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = f657a + 117;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int iTuitionPaymentFragmentbindingInflater1 = ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1();
        int i = 137483534 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentbindingInflater2, new Object[]{this}, i, -1031780527, 1031780528);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = d + 39;
        f657a = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = d + 33;
        f657a = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void cancelAll() {
        g = -6314030983095181979L;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        int i2 = f657a;
        int i3 = i2 + 57;
        d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 49;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return Integer.valueOf(R.layout.activity_vocational_registration);
        }
        throw null;
    }
}
