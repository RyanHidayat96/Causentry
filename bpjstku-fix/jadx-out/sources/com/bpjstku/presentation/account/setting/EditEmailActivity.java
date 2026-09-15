package com.bpjstku.presentation.account.setting;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.setting.model.request.ChangeEmailVerificationRequest;
import com.bpjstku.databinding.ActivityEditEmailBinding;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.account.setting.EditEmailActivity;
import com.bpjstku.presentation.account.verify.AccountVerificationActivity;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.gms.internal.auth.zzgx;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.messaging.WithinAppServiceConnection$BindRequest$$ExternalSyntheticLambda0;
import com.midtrans.sdk.corekit.core.Constants;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.IntegerRes;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.TargetAspectRatio;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accessconfigureInstanceInternal;
import defpackage.calculateCameraUseCases;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.createExtraPreview;
import defpackage.deInitSession;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.mapPoint;
import defpackage.onCaptureSessionEnd;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.unregisterLifecycle;
import id.vida.liveness.R0$$ExternalSyntheticLambda0;
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
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0016\u0010\t\u001a\u00020\u000e8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0015\u0010\b\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0015\u0010\u0011\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u001b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001c"}, d2 = {"Lcom/bpjstku/presentation/account/setting/EditEmailActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityEditEmailBinding;", "<init>", "()V", "", "asBinder", "asInterface", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/domain/user/model/User;", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "LIntegerRes;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "g", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EditEmailActivity extends BindingReactiveFormActivity<ActivityEditEmailBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f453a;
    private static int cancelAll;
    private static char[] d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private String b;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: ColorRes
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EditEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {117, -15, -81, 1};
    private static final int $$f = 239;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {1, 115, -83, 116, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 17;
    private static int notify = 0;
    private static int g = 0;
    private static int asBinder = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i);
        int i9 = ~i6;
        int i10 = ~i;
        int i11 = (~(i10 | i7)) | i9;
        int i12 = (~(i4 | i)) | (~(i7 | i9 | i10));
        int i13 = i6 + i + i5 + ((-1136091917) * i3) + (376669458 * i2);
        int i14 = i13 * i13;
        int i15 = ((-905468225) * i6) + 1718550528 + ((-1748215485) * i) + (i8 * (-421373630)) + (421373630 * i11) + ((-421373630) * i12) + ((-1326841856) * i5) + ((-2044854272) * i3) + (41156608 * i2) + (1721171968 * i14);
        int i16 = ((i6 * (-924404593)) - 1636593565) + (i * (-924403757)) + (i8 * 418) + (i11 * (-418)) + (i12 * 418) + (i5 * (-924404175)) + (i3 * (-2083730301)) + (i2 * 182666354) + (i14 * (-51970048));
        int i17 = i15 + (i16 * i16 * (-653721600));
        if (i17 != 1) {
            return i17 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : b(objArr);
        }
        return TuitionPaymentFragmentbindingInflater1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.account.setting.EditEmailActivity.$$a
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r1 = r7 + 1
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r3 = r7
            r4 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L28:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.setting.EditEmailActivity.c(short, byte, int, java.lang.Object[]):void");
    }

    public EditEmailActivity() {
        final EditEmailActivity editEmailActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.account.setting.EditEmailActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = editEmailActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.account.setting.EditEmailActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = editEmailActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.account.setting.EditEmailActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/account/setting/EditEmailActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, EditEmailActivity.class, new Pair[]{TuplesKt.to("check_sum", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityEditEmailBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g + 75;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            EditEmailActivity$bindingInflater$1 editEmailActivity$bindingInflater$1 = EditEmailActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            obj.hashCode();
            throw null;
        }
        EditEmailActivity$bindingInflater$1 editEmailActivity$bindingInflater$2 = EditEmailActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = g + 75;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return editEmailActivity$bindingInflater$2;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        g = i2 % 128;
        int i3 = i2 % 2;
        EditEmailActivity editEmailActivity = this;
        Intrinsics.checkNotNullParameter(editEmailActivity, "");
        editEmailActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(INotificationSideChannelStub().layoutToolbar.toolbar, true);
        INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_edit_email));
        TextInputEditText textInputEditText = INotificationSideChannelStub().edtEmail;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputEditText, this);
        int i4 = asBinder + 63;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        String str = this.b;
        if (str == null) {
            int i2 = asBinder + 61;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        if (str.length() == 0) {
            int i3 = asBinder + 109;
            g = i3 % 128;
            int i4 = i3 % 2;
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Terjadi perbedaan integritas data", 0).show();
            ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        Button button = INotificationSideChannelStub().btnSaveEmail;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: ContentView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                return (Unit) EditEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr, -1865651413, R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, 1865651414);
            }
        }));
        int i2 = asBinder + 109;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 85 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        String stringExtra = getIntent().getStringExtra("check_sum");
        if (stringExtra == null) {
            int i2 = g;
            int i3 = i2 + 37;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 65 / 0;
            }
            int i5 = i2 + 55;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            stringExtra = "";
        }
        this.b = stringExtra;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        final EditEmailActivity editEmailActivity = (EditEmailActivity) objArr[0];
        int i = 2 % 2;
        ((IntegerRes) editEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).INotificationSideChannelDefault.observe(editEmailActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: ColorInt
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = g + 107;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 86 / 0;
        }
        return null;
    }

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private static final byte[] $$c = {25, 31, 20, 1};
        private static final int $$f = 16;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {14, 70, 6, -35, 9, 2, 7, 6, 10, 9, -40, 58, 3, 5, -10, -14, 32, 24, -10, 14, -50, 23, 51, 6, -1, 10, 5, 21, 4, -10, 26, -4, 13, 6, 12, -25, 21, 19, 13, 9, 0, 0, -28, 40, 24, -6, 1, 9, 40, -5, 18, -4, 13, 6, -23, 24, 31, -5, -1, 16, 13, -39, 51, -10, 13, 13, -1, 16, 13, 6, 4, -4, 5, 13, -1, 18, 4, 12, 5, 4, 12, -2, 6, 25, -6, 3, 25, -35, 41, -4, 8, 14, -1, 8, 8, 2, 27, -2, 15, -59};
        private static final int $$e = 112;
        private static final byte[] $$a = {70, -114, 113, 8, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 136;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f454a = 0;
        private static int asInterface = 1;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 47601;
        private static char b = 4593;
        private static char TuitionPaymentFragmentbindingInflater1 = 52611;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 60976;

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r5, short r6, byte r7, java.lang.Object[] r8) {
            /*
                int r6 = r6 * 4
                int r6 = r6 + 84
                int r7 = r7 + 4
                int r5 = r5 * 15
                int r0 = r5 + 38
                byte[] r1 = com.bpjstku.presentation.account.setting.EditEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$a
                byte[] r0 = new byte[r0]
                int r5 = r5 + 37
                r2 = 0
                if (r1 != 0) goto L16
                r3 = r5
                r4 = r2
                goto L2a
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r5) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L26:
                int r7 = r7 + 1
                r3 = r1[r7]
            L2a:
                int r6 = r6 + r3
                int r6 = r6 + (-11)
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.setting.EditEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.c(short, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(int r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 8
                int r8 = r8 + 45
                int r6 = r6 * 31
                int r6 = 115 - r6
                int r7 = r7 * 44
                int r7 = 48 - r7
                byte[] r0 = com.bpjstku.presentation.account.setting.EditEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$d
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r6 = r7
                r3 = r8
                r4 = r2
                goto L29
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r6
                r1[r3] = r5
                if (r4 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                r3 = r0[r7]
            L29:
                int r7 = r7 + 1
                int r6 = r6 + r3
                int r6 = r6 + (-7)
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.setting.EditEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.e(int, int, int, java.lang.Object[]):void");
        }

        private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
            char[] cArr2 = new char[cArr.length - 2];
            oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
            char[] cArr3 = new char[2];
            int i5 = $10 + 15;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            while (true) {
                char c = 0;
                if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                    objArr[0] = new String(cArr2, 0, i);
                    return;
                }
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                int i7 = 58224;
                int i8 = 0;
                while (i8 < 16) {
                    int i9 = $10 + 71;
                    $11 = i9 % 128;
                    int i10 = i9 % i3;
                    char c2 = cArr3[1];
                    char c3 = cArr3[c];
                    int i11 = i8;
                    int i12 = (c3 + i7) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)));
                    int i13 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        objArr2[i3] = Integer.valueOf(i13);
                        objArr2[1] = Integer.valueOf(i12);
                        objArr2[0] = Integer.valueOf(c2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char offsetAfter = (char) (47773 - TextUtils.getOffsetAfter("", 0));
                            int iMyPid = 468 - (Process.myPid() >> 22);
                            int offsetBefore = 13 - TextUtils.getOffsetBefore("", 0);
                            Class[] clsArr = new Class[4];
                            clsArr[0] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[i3] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter, iMyPid, offsetBefore, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        onCaptureSessionEnd oncapturesessionend2 = oncapturesessionend;
                        Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(b)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 47774), 468 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 13 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i7 -= 40503;
                        i8 = i11 + 1;
                        oncapturesessionend = oncapturesessionend2;
                        i3 = 2;
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
                    char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int threadPriority2 = 2323 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int mirror = AndroidCharacter.getMirror('0') - 4;
                    byte b2 = (byte) ($$c[3] - 1);
                    byte b3 = b2;
                    String str$$g = $$g(b2, b3, b3);
                    i2 = 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority, threadPriority2, mirror, -1312321721, false, str$$g, new Class[]{Object.class, Object.class});
                } else {
                    i2 = 2;
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                oncapturesessionend = oncapturesessionend3;
                i3 = i2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:22:0x01e3  */
        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                int deadChar = 2267 - KeyEvent.getDeadChar(0, 0);
                int touchSlop = 33 - (ViewConfiguration.getTouchSlop() >> 8);
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                c(bArr[132], bArr[7], bArr[5], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, deadChar, touchSlop, -887667012, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            d(new char[]{38058, 2733, 12625, 44453, 40358, 64873, 19772, 34725, 46934, 30711, 42697, 10388, 28484, 44800, 63239, 18250, 60984, 51253, 25607, 23692, 12955, 43725, 63048, 29108}, (ViewConfiguration.getEdgeSlop() >> 16) + 22, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d(new char[]{50703, 7733, 33361, 41390, 44276, 30376, 10783, 16598, 55935, 50366, 28563, 14783, 6345, 46800, 51645, 42794, 2079, 180}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 15, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 2267;
                int iAlpha = Color.alpha(0) + 33;
                byte[] bArr2 = $$a;
                byte b2 = bArr2[132];
                byte b3 = bArr2[7];
                Object[] objArr5 = new Object[1];
                c(b2, b3, (byte) (b3 | 51), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, offsetBefore, iAlpha, -874156483, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 2267;
                    int iRed = Color.red(0) + 33;
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr6 = new Object[1];
                    c(b4, b5, (byte) (b5 | 103), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, packedPositionGroup, iRed, -654680577, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i2 = ((int[]) objArr7[0])[0];
                int i3 = ((int[]) objArr7[3])[0];
                String[] strArr = (String[]) objArr7[1];
                int iIdentityHashCode = System.identityHashCode(this);
                int i4 = ~((-672276828) | iIdentityHashCode);
                int i5 = (-312447185) + ((2216448 | i4) * (-476)) + (i4 * 952) + ((~((~iIdentityHashCode) | (-672276828))) * 476) + 55341405;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr[2])[0] = i7 ^ (i7 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                d(new char[]{8472, 695, 23388, 37169, 21126, 22384, 54473, 42315, 65463, 39574, 18071, 57456, 27633, 10643, 24725, 27840, 24767, 10630, 31608, 31469, 21765, 5496, 57950, 23348, 21929, 15079, 46429, 8939}, 26 - Gravity.getAbsoluteGravity(0, 0), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                d(new char[]{26574, 18395, 32894, 9939, 8312, 7387, 17857, 31021, 52608, 54197, 64245, 62886, 49062, 38641, 37777, 46817, 26480, 50460, 39663, 63629}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if (applicationContext instanceof ContextWrapper) {
                        int i8 = f454a + 89;
                        asInterface = i8 % 128;
                        int i9 = i8 % 2;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                    }
                }
                Object[] objArr10 = new Object[1];
                d(new char[]{49898, 15330, 15964, 17682, 28084, 62581, 36593, 1410, 15470, 11117, 916, 15695, 32767, 19172, 27420, 28209, 50341, 12143}, 16 - TextUtils.getCapsMode("", 0, 0), objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                d(new char[]{35526, 53289, 58696, 16798, 23126, 42323, 32130, 8065, 63417, 11240, 23735, 27445, 20494, 41760, 10848, 35238, 36415, 36986}, 16 - View.resolveSize(0, 0), objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 55341405};
                    byte[] bArr3 = $$d;
                    byte b6 = bArr3[40];
                    Object[] objArr13 = new Object[1];
                    e(b6, bArr3[46], b6, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b7 = bArr3[46];
                    Object[] objArr14 = new Object[1];
                    e(b7, bArr3[40], b7, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        int i10 = f454a + 47;
                        asInterface = i10 % 128;
                        int i11 = i10 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2268;
                            int doubleTapTimeout3 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 33;
                            byte b8 = $$a[7];
                            byte b9 = b8;
                            Object[] objArr16 = new Object[1];
                            c(b8, b9, (byte) (b9 | 103), objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(doubleTapTimeout2, iIndexOf, doubleTapTimeout3, -654680577, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            d(new char[]{38058, 2733, 12625, 44453, 40358, 64873, 19772, 34725, 46934, 30711, 42697, 10388, 28484, 44800, 63239, 18250, 60984, 51253, 25607, 23692, 12955, 43725, 63048, 29108}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            d(new char[]{50703, 7733, 33361, 41390, 44276, 30376, 10783, 16598, 55935, 50366, 28563, 14783, 6345, 46800, 51645, 42794, 2079, 180}, KeyEvent.getDeadChar(0, 0) + 15, objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char trimmedLength = (char) TextUtils.getTrimmedLength("");
                                int i12 = 2268 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                int mirror = 'Q' - AndroidCharacter.getMirror('0');
                                byte[] bArr4 = $$a;
                                byte b10 = bArr4[132];
                                byte b11 = bArr4[7];
                                Object[] objArr19 = new Object[1];
                                c(b10, b11, (byte) (b11 | 51), objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, i12, mirror, -874156483, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                                int pressedStateDuration = 2267 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                int i13 = 34 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                byte[] bArr5 = $$a;
                                Object[] objArr20 = new Object[1];
                                c(bArr5[132], bArr5[7], bArr5[5], objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, pressedStateDuration, i13, -887667012, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr15;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i14 = ((int[]) objArr[3])[0];
            int i15 = ((int[]) objArr[0])[0];
            if (i15 != i14) {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr[1];
                if (strArr2 != null) {
                    for (String str : strArr2) {
                        int i16 = asInterface + 63;
                        f454a = i16 % 128;
                        int i17 = i16 % 2;
                        arrayList.add(str);
                    }
                }
                throw new RuntimeException(String.valueOf(i15));
            }
            int i18 = asInterface + 67;
            f454a = i18 % 128;
            int i19 = i18 % 2;
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[0])[0];
            int i22 = ((int[]) objArr[3])[0];
            String[] strArr3 = (String[]) objArr[1];
            int iNextInt = new Random().nextInt();
            int i23 = i20 + (-1471996599) + (((~(iNextInt | (-55652969))) | (-864366285)) * (-465)) + (((-55652969) | (~((-864366285) | iNextInt))) * 930) + ((iNextInt | (-50405961)) * 465);
            int i24 = i23 ^ (i23 << 13);
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr21[2])[0] = i25 ^ (i25 << 5);
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = f454a;
            int i3 = i2 + 93;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i5 = i2 + 119;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            if (i6 == 0) {
                int i7 = 5 / 0;
            }
            return zAreEqual;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = asInterface + 17;
            f454a = i2 % 128;
            int i3 = i2 % 2;
            Function<?> functionDelegate = getFunctionDelegate();
            if (i3 == 0) {
                return functionDelegate.hashCode();
            }
            functionDelegate.hashCode();
            throw null;
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = asInterface + 113;
            f454a = i2 % 128;
            int i3 = i2 % 2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(obj);
            if (i3 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r5, int r6, short r7) {
            /*
                int r5 = r5 * 4
                int r5 = r5 + 108
                int r7 = r7 * 4
                int r7 = 4 - r7
                int r6 = r6 * 3
                int r6 = r6 + 1
                byte[] r0 = com.bpjstku.presentation.account.setting.EditEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$c
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L16
                r4 = r7
                r3 = r2
                goto L26
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r5
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L24:
                r4 = r0[r7]
            L26:
                int r7 = r7 + 1
                int r5 = r5 + r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.setting.EditEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$g(byte, int, short):java.lang.String");
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        g = i2 % 128;
        int i3 = i2 % 2;
        Button button = INotificationSideChannelStub().btnSaveEmail;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(false);
        int i4 = g + 29;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        g = i2 % 128;
        int i3 = i2 % 2;
        Button button = INotificationSideChannelStub().btnSaveEmail;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(true);
        int i4 = asBinder + 71;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int i = 2 % 2;
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilEmail;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        accessconfigureInstanceInternal accessconfigureinstanceinternal = new accessconfigureInstanceInternal("^.{1,}$", string);
        String string2 = getString(R.string.error_email_invalid);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new accessconfigureInstanceInternal[]{accessconfigureinstanceinternal, new accessconfigureInstanceInternal(Constants.EMAIL_PATTERN, string2)})));
        int i2 = g + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char defaultSize = (char) View.getDefaultSize(0, 0);
            int i3 = 1031 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int iMyPid = (Process.myPid() >> 22) + 15;
            byte b = $$a[7];
            short s = b;
            Object[] objArr2 = new Object[1];
            c(s, (byte) (s | 52), b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, i3, iMyPid, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{'\b', 19, '\n', 5, 18, 1, 7, 20, 21, 11, 24, 17, 1, 7, 24, 1, '\n', 24, 16, 17, 16, 2}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 30), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{0, 19, 5, '\t', '\t', 1, '\n', 15, '\t', 14, 16, 20, 4, '\r', 13882}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 23), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.status_order_id).substring(0, 8).codePointAt(3) - 54, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1031;
            int i4 = 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            short s2 = (short) 52;
            Object[] objArr5 = new Object[1];
            c(s2, (byte) s2, $$a[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, maximumDrawingCacheSize, i4, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = asBinder + 123;
            g = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char defaultSize2 = (char) View.getDefaultSize(0, 0);
                int defaultSize3 = 1031 - View.getDefaultSize(0, 0);
                int scrollBarSize = 15 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte[] bArr = $$a;
                Object[] objArr6 = new Object[1];
                c((short) 104, bArr[7], bArr[0], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize2, defaultSize3, scrollBarSize, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i7 = ((int[]) objArr7[3])[0];
            int i8 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i9 = ((((-1410750159) + ((1049722218 | iIdentityHashCode) * 376)) + (((~((~iIdentityHashCode) | 650016506)) | 402721024) * (-376))) + (((~(iIdentityHashCode | (-650016507))) | (-405736337)) * 376)) - 1455929402;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
            int i12 = g + 27;
            asBinder = i12 % 128;
            int i13 = i12 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{4, 14, 14, '\b', 20, 17, '\b', 19, '\f', 21, 17, 4, 11, 1, '\t', 19}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_via_xl_tunai).substring(19, 20).codePointAt(0) - 83), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.status_promo_amount).substring(4, 5).length() + 15, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{0, '\b', 3, 19, 23, 1, 22, 1, '\b', 5, 7, 11, 21, 15, '\t', 0}, (byte) (106 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notification_token_message).substring(1, 2).codePointAt(0) - 85, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1931555681};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "") + 46038), 1134 - TextUtils.getOffsetBefore("", 0), Color.argb(0, 0, 0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1455929402, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int threadPriority = 1031 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 15;
                    byte b2 = $$a[7];
                    short s3 = b2;
                    Object[] objArr12 = new Object[1];
                    c(s3, (byte) (s3 | 52), b2, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(longPressTimeout, threadPriority, tapTimeout, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1117, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 18), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1031;
                    int iIndexOf = 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    byte[] bArr2 = $$a;
                    Object[] objArr13 = new Object[1];
                    c((short) 104, bArr2[7], bArr2[0], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarSize2, iCombineMeasuredStates, iIndexOf, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{'\b', 19, '\n', 5, 18, 1, 7, 20, 21, 11, 24, 17, 1, 7, 24, 1, '\n', 24, 16, 17, 16, 2}, (byte) (41 - TextUtils.getOffsetAfter("", 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{0, 19, 5, '\t', '\t', 1, '\n', 15, '\t', 14, 16, 20, 4, '\r', 13882}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_bca_prima).substring(0, 9).length() + 50), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1065).substring(0, 62).codePointAt(37) - 96, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 1031;
                        int i14 = 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        short s4 = (short) 52;
                        Object[] objArr16 = new Object[1];
                        c(s4, (byte) s4, $$a[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionType, threadPriority2, i14, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int mode = 1031 - View.MeasureSpec.getMode(0);
                        int iResolveSize = View.resolveSize(0, 0) + 15;
                        byte b3 = $$a[7];
                        short s5 = b3;
                        Object[] objArr17 = new Object[1];
                        c(s5, (byte) (s5 | 52), b3, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(minimumFlingVelocity, mode, iResolveSize, 1357589585, false, (String) objArr17[0], null);
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
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[3])[0];
        if (i16 == i15) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i17 = ((int[]) objArr[2])[0];
            int i18 = ((int[]) objArr[3])[0];
            int i19 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i20 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
            int i21 = i17 + 1739565539 + (((~i20) | 42996096) * 1324) + (((~(i20 | 60576225)) | (~(183703944 | i20))) * (-1324)) + 1707425670;
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr18[2])[0] = i23 ^ (i23 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i24 = g + 19;
                asBinder = i24 % 128;
                int i25 = 2;
                int i26 = i24 % 2;
                int i27 = 0;
                while (i27 < strArr3.length) {
                    int i28 = asBinder + 37;
                    g = i28 % 128;
                    if (i28 % i25 != 0) {
                        arrayList.add(strArr3[i27]);
                        i27 += 78;
                    } else {
                        arrayList.add(strArr3[i27]);
                        i27++;
                    }
                    i25 = 2;
                }
            }
            Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i29 = ((int[]) objArr[2])[0];
            int i30 = ((int[]) objArr[3])[0];
            int i31 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i32 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
            int i33 = 242592073 + (((~(135156887 | i32)) | 109123282) * 672);
            int i34 = ~i32;
            int i35 = i29 + i33 + (((~(i32 | 109123282)) | (~((-135156888) | i34))) * (-672)) + (((~((-109123283) | i34)) | 109118016) * 672);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr19[2])[0] = i37 ^ (i37 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 29944);
            int gidForName = 1754 - Process.getGidForName("");
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23;
            Object[] objArr20 = new Object[1];
            c((short) 104, (byte) 37, $$a[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf, gidForName, scrollBarFadeDuration, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i38 = g + 101;
            asBinder = i38 % 128;
            int i39 = i38 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char scrollBarFadeDuration2 = (char) (29944 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                int packedPositionType2 = 1755 - ExpandableListView.getPackedPositionType(0L);
                int i40 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 23;
                short s6 = (short) 52;
                Object[] objArr21 = new Object[1];
                c(s6, (byte) s6, $$a[7], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(scrollBarFadeDuration2, packedPositionType2, i40, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i41 = ((int[]) objArr22[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = new Object[]{new int[]{i41}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 402661352;
            int i42 = ~length;
            int i43 = (((711695537 + ((((~((-637940326) | i42)) | 637801028) | (~(425337899 | i42))) * (-1136))) + ((((~((-637940326) | length)) | (~(425337899 | length))) | (~((-425198603) | i42))) * (-568))) + (((~(length | (-637801029))) | ((~(i42 | (-425337900))) | (~(637940325 | i42)))) * 568)) - 1890441389;
            int i44 = (i43 << 13) ^ i43;
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0] = i45 ^ (i45 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{4, 14, 14, '\b', 20, 17, '\b', 19, '\f', 21, 17, 4, 11, 1, '\t', 19}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step5).substring(17, 18).length() + 13), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_successful).substring(0, 1).length() + 15, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{0, '\b', 3, 19, 23, 1, 22, 1, '\b', 5, 7, 11, 21, 15, '\t', 0}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_face_not_straight).substring(0, 31).length() + 75), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {1931555681};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 42049), 1726 - Color.green(0), 30 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = zzgx.TuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -1890441389);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 29945);
                int i46 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1754;
                int iCombineMeasuredStates2 = 23 - View.combineMeasuredStates(0, 0);
                short s7 = (short) 52;
                Object[] objArr26 = new Object[1];
                c(s7, (byte) s7, $$a[7], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(packedPositionChild, i46, iCombineMeasuredStates2, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{'\b', 19, '\n', 5, 18, 1, 7, 20, 21, 11, 24, 17, 1, 7, 24, 1, '\n', 24, 16, 17, 16, 2}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 5), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_frame_your_face_out_of_box).substring(15, 16).codePointAt(0) - 10, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{0, 19, 5, '\t', '\t', 1, '\n', 15, '\t', 14, 16, 20, 4, '\r', 13882}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step7).substring(0, 3).codePointAt(1) + 13), 15 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cResolveSize = (char) (29944 - View.resolveSize(0, 0));
                    int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0');
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 23;
                    Object[] objArr29 = new Object[1];
                    c((short) 141, (byte) 52, $$a[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cResolveSize, iLastIndexOf, edgeSlop, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 29944);
                    int scrollDefaultDelay = 1755 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int i47 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22;
                    Object[] objArr30 = new Object[1];
                    c((short) 104, (byte) 37, $$a[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(trimmedLength, scrollDefaultDelay, i47, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4];
            if (strArr5 != null) {
                int i48 = g + 107;
                while (true) {
                    asBinder = i48 % 128;
                    int i49 = i48 % 2;
                    if (i2 >= strArr5.length) {
                        break;
                    }
                    arrayList2.add(strArr5[i2]);
                    i2++;
                    i48 = g + 75;
                }
            }
            throw null;
        }
        int i50 = asBinder + 81;
        g = i50 % 128;
        int i51 = i50 % 2;
        int i52 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
        int i53 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0];
        Object[] objArr31 = {new int[]{i53}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i54 = ~iIdentityHashCode2;
        int i55 = i52 + 449324020 + (((~(i54 | (-733258508))) | 60031498 | (~((-272633925) | iIdentityHashCode2))) * 717) + (((~(iIdentityHashCode2 | (-733258508))) | (~(i54 | (-272633925))) | 60031498) * 717);
        int i56 = (i55 << 13) ^ i55;
        int i57 = i56 ^ (i56 >>> 17);
        ((int[]) objArr31[3])[0] = i57 ^ (i57 << 5);
    }

    private static void e(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = d;
        long j = 0;
        int i4 = 1770390596;
        float f = 0.0f;
        char c = 3;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c2 = (char) (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1));
                        int i6 = 2268 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1));
                        int offsetAfter = 33 - TextUtils.getOffsetAfter("", 0);
                        byte b2 = (byte) ($$c[c] - 1);
                        byte b3 = (byte) (b2 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, i6, offsetAfter, -1927765101, false, $$i(b2, b3, (byte) (b3 - 3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
                    j = 0;
                    i4 = 1770390596;
                    f = 0.0f;
                    c = 3;
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
        Object[] objArr3 = {Integer.valueOf(f453a)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c3 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 2267;
            int i7 = 33 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte b4 = (byte) ($$c[3] - 1);
            byte b5 = (byte) (b4 + 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, offsetBefore, i7, -1927765101, false, $$i(b4, b5, (byte) (b5 - 3)), new Class[]{Integer.TYPE});
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
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i8 = $10 + 1;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i10 = $10 + 21;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b >> b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >> 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >> b);
                    } else {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                    }
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 49268);
                        int scrollBarFadeDuration = 3261 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 30;
                        byte b6 = (byte) ($$c[3] - 1);
                        byte b7 = (byte) (b6 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, scrollBarFadeDuration, offsetAfter2, -127612708, false, $$i(b6, b7, (byte) (b7 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cResolveSize = (char) (View.resolveSize(0, 0) + 22878);
                            int iRed = 594 - Color.red(0);
                            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 17;
                            byte b8 = (byte) ($$c[3] - 1);
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSize, iRed, edgeSlop, 1570859318, false, $$i(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                        int i12 = $10 + 39;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                    } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                        int i14 = $11 + 77;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                        int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                        int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                    } else {
                        int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                        int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
            }
        }
        for (int i20 = 0; i20 < i; i20++) {
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != 687058102 + (((~((-244344106) | iIdentityHashCode)) | (~((-1074331649) | iIdentityHashCode))) * 69) + (((~(iIdentityHashCode | (-1359675399))) | (~((-529687856) | iIdentityHashCode)) | 285343750) * (-69)) + 991803920) {
            throw null;
        }
        int i5 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i6 = 110604700 + (((~((-712981287) | iElapsedRealtime)) | 708446758 | (~((-1866074679) | iElapsedRealtime))) * (-880));
        int i7 = (~((-712981287) | (~iElapsedRealtime))) | 1866074678;
        int i8 = ~(iElapsedRealtime | 712981286);
        if (i5 != i6 + ((i7 | i8) * (-880)) + (i8 * 880)) {
            throw null;
        }
        super.onResume();
        int i9 = g + 33;
        asBinder = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00e6, code lost:
    
        if (r1 != (((((~(r3 | 1756906074)) | ((~((-822149891) | r3)) | 285278464)) * (-397)) - 738362140) + ((r2 | 1505313112) * 397))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00e8, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.account.setting.EditEmailActivity.asBinder + 29;
        com.bpjstku.presentation.account.setting.EditEmailActivity.g = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00f4, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0100, code lost:
    
        throw new java.lang.RuntimeException("1107185313");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0046, code lost:
    
        if (r1 == ((((-259418225) + (((~((~r6) | (-786642140))) | (-1616629683)) * (-235))) + (((~((-786642140) | r6)) | (-1616629683)) * (-470))) + (((~(r6 | (-541262995))) | (-1862008828)) * 235))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a0, code lost:
    
        if (r1 == (((((~(r7 | (-972061906))) | ((~((-142074363) | r7)) | 141582544)) * (-397)) - 1273215756) + ((r6 | (-830971180)) * 397))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a2, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
        r3 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.setting.EditEmailActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int i4 = (int) Runtime.getRuntime().totalMemory();
            int i5 = ~i4;
            if (i3 != 2042802662 + (((~((-904175095) | i5)) | 73662742) * (-108)) + (((~(i5 | 74187551)) | (~((-74187552) | i4)) | (-904699904)) * 54) + ((i4 | (-904699904)) * 54)) {
                throw null;
            }
        } else {
            int i6 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_gopay).substring(0, 5).codePointAt(1) - 1624282317;
            int i7 = ~iCodePointAt;
            if (i6 != 183490024 + (((~((-360313164) | i7)) | 285831497 | (~(1190300706 | i7))) * (-1136)) + (((~((-360313164) | iCodePointAt)) | (~(1190300706 | iCodePointAt)) | (~((-1115819041) | i7))) * (-568)) + (((~(iCodePointAt | (-285831498))) | (~(i7 | (-1190300707))) | (~(360313163 | i7))) * 568)) {
                throw null;
            }
        }
        int i8 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 1962204746;
        if (i8 != 444474800 + (((-18911505) | iCodePointAt2) * (-627)) + (((~((-2023123528) | iCodePointAt2)) | 555932437) * (-627)) + (((~(iCodePointAt2 | 555932437)) | (~((~iCodePointAt2) | 2023123527))) * 627)) {
            throw new RuntimeException("545012517");
        }
        super.onCreate(bundle);
        int i9 = asBinder + 37;
        g = i9 % 128;
        int i10 = i9 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(EditEmailActivity editEmailActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        String str2;
        int i = 2 % 2;
        String str3 = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = asBinder + 33;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                editEmailActivity.MediaBrowserCompat();
                str3.hashCode();
                throw null;
            }
            editEmailActivity.MediaBrowserCompat();
            str2 = "loading_new_email_verification";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            editEmailActivity.IconCompatParcelizer();
            AccountVerificationActivity.b bVar = AccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            EditEmailActivity editEmailActivity2 = editEmailActivity;
            String str4 = editEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str4 == null) {
                int i3 = asBinder + 71;
                g = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                str = null;
            } else {
                str = str4;
            }
            User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) editEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            if (userAsBinder != null) {
                int i5 = asBinder + 15;
                g = i5 % 128;
                int i6 = i5 % 2;
                str3 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            AccountVerificationActivity.b.b(editEmailActivity2, str, str3 == null ? "" : str3, 4, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1.toString(), null, 32);
            str2 = "success_new_email_verification";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            editEmailActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            str2 = "failure_new_email_verification";
        } else {
            editEmailActivity.IconCompatParcelizer();
            int i7 = g + 55;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            str2 = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_save_new_email_result", str2));
        Intrinsics.checkNotNullParameter(editEmailActivity, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault3(EditEmailActivity editEmailActivity) {
        User userAsBinder;
        int i = 2 % 2;
        int i2 = g + 119;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) editEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            int i3 = 66 / 0;
        } else {
            userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) editEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
        int i4 = g + 7;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return userAsBinder;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        Editable text;
        EditEmailActivity editEmailActivity = (EditEmailActivity) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[1], "");
        EditEmailActivity editEmailActivity2 = editEmailActivity;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_save_new_email", "save_new_email"));
        Intrinsics.checkNotNullParameter(editEmailActivity2, "");
        Intrinsics.checkNotNullParameter("save_new_email", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("save_new_email", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("save_new_email", mapMutableMapOf);
        EditText editText = editEmailActivity.INotificationSideChannelStub().tilEmail.getEditText();
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        User user = (User) editEmailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        Intrinsics.checkNotNull(user);
        if (Intrinsics.areEqual(strValueOf, String.valueOf(user.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(editEmailActivity2, "Anda masih input email lama Anda. Silahkan Input Email Baru", null);
            int i2 = asBinder + 25;
            g = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = g + 89;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            EditText editText2 = editEmailActivity.INotificationSideChannelStub().tilEmail.getEditText();
            if (editText2 != null) {
                int i6 = asBinder + 41;
                g = i6 % 128;
                if (i6 % 2 != 0) {
                    editText2.getText();
                    throw null;
                }
                text = editText2.getText();
            } else {
                text = null;
            }
            String lowerCase = String.valueOf(text).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            editEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = StringsKt.trim((CharSequence) lowerCase).toString();
            IntegerRes integerRes = (IntegerRes) editEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            String str = editEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str == null) {
                int i7 = g + 115;
                asBinder = i7 % 128;
                if (i7 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i8 = 46 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                str = null;
            }
            User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) editEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            String strValueOf2 = String.valueOf(userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
            String string = Settings.Secure.getString(editEmailActivity.getContentResolver(), "android_id");
            Intrinsics.checkExpressionValueIsNotNull(string, "");
            integerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ChangeEmailVerificationRequest(str, strValueOf2, string));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(EditEmailActivity editEmailActivity, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{editEmailActivity, view}, -1865651413, R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, 1865651414);
    }

    static {
        cancelAll = 1;
        g();
        INSTANCE = new Companion(null);
        int i = notify + 107;
        cancelAll = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentbindingInflater1 = WithinAppServiceConnection$BindRequest$$ExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{this}, -2125125300, R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), WithinAppServiceConnection$BindRequest$$ExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 2125125300)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_web_instruction_6).substring(13, 14).codePointAt(0) + 1775917168;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{this}, 858155059, R0$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), WithinAppServiceConnection$BindRequest$$ExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iCodePointAt, -858155057);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = g + 5;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = g + 51;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        d = new char[]{60041, 60048, 60034, 60050, 60062, 60063, 60040, 60083, 60043, 60058, 60073, 60060, 60051, 60045, 60054, 60055, 60052, 60056, 60053, 60072, 60088, 60047, 60117, 60042, 60049};
        f453a = (char) 57188;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 91;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 53;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return Integer.valueOf(R.layout.activity_edit_email);
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, int r7, short r8) {
        /*
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r0 = com.bpjstku.presentation.account.setting.EditEmailActivity.$$c
            int r8 = r8 * 2
            int r1 = 1 - r8
            int r7 = 116 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r7 = r7 + 1
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.setting.EditEmailActivity.$$i(short, int, short):java.lang.String");
    }
}
