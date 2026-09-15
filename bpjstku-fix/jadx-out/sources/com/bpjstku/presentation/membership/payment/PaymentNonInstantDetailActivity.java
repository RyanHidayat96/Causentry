package com.bpjstku.presentation.membership.payment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityPaymentNonInstantNonSalariedWorkerBinding;
import com.bpjstku.domain.registration.general.model.Registration;
import com.bpjstku.presentation.main.MainActivity;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.membership.payment.PaymentNonInstantDetailActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityWorkTerminationParticipantActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import defpackage.CameraUseCaseAdapter;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.TargetAspectRatio;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.initSession;
import defpackage.lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0014\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u0017"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/PaymentNonInstantDetailActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityPaymentNonInstantNonSalariedWorkerBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lcom/bpjstku/domain/registration/general/model/Registration;", "Lkotlin/Lazy;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaymentNonInstantDetailActivity extends BindingBaseActivity<ActivityPaymentNonInstantNonSalariedWorkerBinding> {
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int asInterface;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: setOverlapAnchor
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaymentNonInstantDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });
    private static final byte[] $$c = {0, -94, -62, -97};
    private static final int $$f = 164;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {89, 92, -72, 43, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 33;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f533a = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i6) | i3 | i2);
        int i8 = ~((~i3) | i6);
        int i9 = ~i2;
        int i10 = i8 | (~(i9 | i6));
        int i11 = ~(i9 | i3);
        int i12 = i6 + i3 + i + ((-1568348280) * i5) + (1617068012 * i4);
        int i13 = i12 * i12;
        int i14 = (((-430874860) * i6) - 739508224) + (1544986862 * i3) + (i7 * 987930861) + ((-987930861) * i10) + (987930861 * i11) + (557056000 * i) + ((-1885339648) * i5) + (1743781888 * i4) + (858456064 * i13);
        int i15 = (i6 * (-973781596)) + 539565670 + (i3 * (-973779706)) + (i7 * 945) + (i10 * (-945)) + (i11 * 945) + (i * (-973780651)) + (i5 * 424585256) + (i4 * 537576796) + (i13 * 1078394880);
        int i16 = i14 + (i15 * i15 * 192741376);
        if (i16 != 1) {
            return i16 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        return b(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.presentation.membership.payment.PaymentNonInstantDetailActivity.$$a
            int r6 = r6 + 1
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2b:
            int r7 = r7 + 1
            int r8 = r8 + r4
            int r8 = r8 + (-11)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentNonInstantDetailActivity.c(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.payment.PaymentNonInstantDetailActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/PaymentNonInstantDetailActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/domain/registration/general/model/Registration;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;Lcom/bpjstku/domain/registration/general/model/Registration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, Registration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) PaymentNonInstantDetailActivity.class);
            intent.putExtra("successful_unregistered_registration_data", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityPaymentNonInstantNonSalariedWorkerBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        PaymentNonInstantDetailActivity$bindingInflater$1 paymentNonInstantDetailActivity$bindingInflater$1 = PaymentNonInstantDetailActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return paymentNonInstantDetailActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        Button button = ((ActivityPaymentNonInstantNonSalariedWorkerBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnOk;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setForceIgnoreOutsideTouch
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentNonInstantDetailActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        if (!Intrinsics.areEqual(((Registration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).getInterfaceDescriptor, "unregistered_member")) {
            ((ActivityPaymentNonInstantNonSalariedWorkerBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvDescriptionPayment.setText(getString(R.string.action_payment_non_instant_method));
            return;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        ((ActivityPaymentNonInstantNonSalariedWorkerBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvDescriptionPayment.setText(getString(R.string.description_registration_bpu_success));
        int i4 = TuitionPaymentFragmentbindingInflater1 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() throws NoSuchMethodException {
        int i = 2 % 2;
        Registration registration = (Registration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        if (!(!registration.getExtras)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 != 0) {
                TuitionPaymentFragmentbindingInflater1(lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), new Object[]{this, "pending_payment_sertakan_deeplink"}, -1194485200, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 335333319, lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), 1194485201);
                throw null;
            }
            TuitionPaymentFragmentbindingInflater1(lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), new Object[]{this, "pending_payment_sertakan_deeplink"}, -1194485200, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 335333319, lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), 1194485201);
        }
        if (registration.com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH java.lang.String) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            TuitionPaymentFragmentbindingInflater1(lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), new Object[]{this, "pending_payment_bpu_deeplink"}, -1194485200, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 335333319, lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), 1194485201);
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        PaymentNonInstantDetailActivity paymentNonInstantDetailActivity = (PaymentNonInstantDetailActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        String strValueOf = String.valueOf(((Registration) paymentNonInstantDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).g);
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("user_id", strValueOf));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int iNormalizeMetaState = 1031 - KeyEvent.normalizeMetaState(0);
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) 52, bArr[7], bArr[132], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(pressedStateDuration, iNormalizeMetaState, scrollBarFadeDuration, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{0, 22, 0, 16}, true, new byte[]{1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{22, 15, 0, 15}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int modifierMetaStateMask = 1030 - ((byte) KeyEvent.getModifierMetaStateMask());
            int maximumDrawingCacheSize = 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte b = (byte) 52;
            Object[] objArr5 = new Object[1];
            c(b, b, $$a[132], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, modifierMetaStateMask, maximumDrawingCacheSize, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char modifierMetaStateMask2 = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                int iGreen = Color.green(0) + 1031;
                int iMyPid = (Process.myPid() >> 22) + 15;
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                c(b3, (short) (b3 | 104), b2, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(modifierMetaStateMask2, iGreen, iMyPid, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i3 = ((int[]) objArr7[3])[0];
            int i4 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i6 = ~i5;
            int i7 = (~(509851467 | i6)) | (-1056159744) | (~(754131637 | i6));
            int i8 = (((1818557723 + (((~(i5 | (-207823362))) | i7) * 590)) + (i7 * (-1180))) + (((~((-754131638) | i6)) | (~(i6 | (-509851468)))) * 590)) - 1134264884;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new int[]{37, 16, 62, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new int[]{53, 16, 0, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1669148637};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 46038), ExpandableListView.getPackedPositionGroup(0L) + 1134, 18 - Drawable.resolveOpacity(0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1134264884, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                    int mirror = 1079 - AndroidCharacter.getMirror('0');
                    int i11 = 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte[] bArr2 = $$a;
                    Object[] objArr12 = new Object[1];
                    c((byte) 52, bArr2[7], bArr2[132], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMakeMeasureSpec, mirror, i11, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1117, (Process.myTid() >> 22) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                    int iIndexOf = 1031 - TextUtils.indexOf("", "", 0, 0);
                    int iIndexOf2 = 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr13 = new Object[1];
                    c(b5, (short) (b5 | 104), b4, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveOpacity, iIndexOf, iIndexOf2, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new int[]{0, 22, 0, 16}, true, new byte[]{1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new int[]{22, 15, 0, 15}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1031;
                        int i12 = 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte b6 = (byte) 52;
                        Object[] objArr16 = new Object[1];
                        c(b6, b6, $$a[132], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(jumpTapTimeout, jumpTapTimeout2, i12, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c2 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int i13 = 1032 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int longPressTimeout = 15 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte[] bArr3 = $$a;
                        Object[] objArr17 = new Object[1];
                        c((byte) 52, bArr3[7], bArr3[132], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, i13, longPressTimeout, 1357589585, false, (String) objArr17[0], null);
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 == i14) {
            int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
            TuitionPaymentFragmentbindingInflater1 = i16 % 128;
            int i17 = i16 % 2;
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[3])[0];
            int i20 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i21 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
            int i22 = ~i21;
            int i23 = i18 + ((((~(468958646 | i22)) | (~((-45129895) | i21))) * 988) - 94041275) + (((~(i21 | 179548582)) | 289410064 | (~(i22 | (-45129895)))) * 988);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr18[2])[0] = i25 ^ (i25 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    int i26 = TuitionPaymentFragmentbindingInflater1 + 119;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i26 % 128;
                    int i27 = i26 % 2;
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i15];
            int i28 = i15 - 1;
            iArr[i28] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i28) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i29 = ((int[]) objArr[2])[0];
            int i30 = ((int[]) objArr[3])[0];
            int i31 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i32 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
            int i33 = (-1934503757) + ((i32 | 358050283) * (-50));
            int i34 = ~((-286261611) | i32);
            int i35 = ~i32;
            int i36 = i29 + i33 + ((i34 | (~(400031723 | i35))) * 50) + (((~(i35 | 358050283)) | (~(113770113 | i35)) | (-400031724)) * 50);
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArr19[2])[0] = i38 ^ (i38 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cArgb = (char) (Color.argb(0, 0, 0, 0) + 29944);
            int scrollDefaultDelay = 1755 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int offsetAfter = 23 - TextUtils.getOffsetAfter("", 0);
            Object[] objArr20 = new Object[1];
            c((byte) ($$b + 4), (short) 104, $$a[132], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cArgb, scrollDefaultDelay, offsetAfter, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char jumpTapTimeout3 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
                int touchSlop = 1755 - (ViewConfiguration.getTouchSlop() >> 8);
                int i39 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22;
                byte b7 = (byte) 52;
                Object[] objArr21 = new Object[1];
                c(b7, b7, $$a[132], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(jumpTapTimeout3, touchSlop, i39, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int i40 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i41 = (-1987310087) + (((~(411012143 | i40)) | 620761664) * 576) + (((~((~i40) | 1031773807)) | 2852905) * 576) + 173753012;
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i43 ^ (i43 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new int[]{37, 16, 62, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new int[]{53, 16, 0, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-1669148637};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 42048), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1726, 29 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = MediaSessionCompat.MediaSessionImplBase.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -902679884);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 29944);
                int jumpTapTimeout4 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1755;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 23;
                byte b8 = (byte) 52;
                Object[] objArr26 = new Object[1];
                c(b8, b8, $$a[132], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(threadPriority, jumpTapTimeout4, iMakeMeasureSpec, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(new int[]{0, 22, 0, 16}, true, new byte[]{1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new int[]{22, 15, 0, 15}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c3 = (char) (29945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int iBlue = 1755 - Color.blue(0);
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23;
                    Object[] objArr29 = new Object[1];
                    c((byte) 52, (short) 141, $$a[132], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c3, iBlue, minimumFlingVelocity, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char packedPositionType = (char) (29944 - ExpandableListView.getPackedPositionType(0L));
                    int maxKeyCode = 1755 - (KeyEvent.getMaxKeyCode() >> 16);
                    int tapTimeout = 23 - (ViewConfiguration.getTapTimeout() >> 16);
                    Object[] objArr30 = new Object[1];
                    c((byte) ($$b + 4), (short) 104, $$a[132], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(packedPositionType, maxKeyCode, tapTimeout, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i44 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i45 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i45 == i44) {
            int i46 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i47 = i46 + (-774169745) + (((~((-40042104) | iMaxMemory)) | 33688625) * (-140)) + ((~((-6353479) | iMaxMemory)) * 70) + (((~(iMaxMemory | 252644529)) | (-225309383)) * 70);
            int i48 = (i47 << 13) ^ i47;
            int i49 = i48 ^ (i48 >>> 17);
            ((int[]) objArr31[3])[0] = i49 ^ (i49 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
        if (strArr5 != null) {
            int i50 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
            TuitionPaymentFragmentbindingInflater1 = i50 % 128;
            int i51 = i50 % 2;
            while (i2 < strArr5.length) {
                int i52 = TuitionPaymentFragmentbindingInflater1 + 73;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i52 % 128;
                if (i52 % 2 == 0) {
                    arrayList2.add(strArr5[i2]);
                    i2 += 81;
                } else {
                    arrayList2.add(strArr5[i2]);
                    i2++;
                }
            }
        }
        throw new RuntimeException(String.valueOf(i45));
    }

    private static void e(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        char c = '0';
        if (cArr != null) {
            int i9 = $11 + 87;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = new Object[i5];
                    objArr2[i3] = Integer.valueOf(cArr[i11]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char threadPriority = (char) ((Process.getThreadPriority(i3) + 20) >> 6);
                        int iIndexOf = TextUtils.indexOf("", c, i3, i3) + 1271;
                        int offsetAfter = 18 - TextUtils.getOffsetAfter("", i3);
                        byte b = $$c[i3];
                        byte b2 = (byte) (b - 1);
                        byte b3 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, iIndexOf, offsetAfter, 407021364, false, $$i(b2, b3, (byte) (b3 + 5)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i11++;
                    int i12 = $11 + 113;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    i3 = 0;
                    i5 = 1;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i4, cArr3, 0, i6);
        if (bArr != null) {
            int i14 = $11 + 119;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr4 = new char[i6];
            setvideostabilizationmode.b = 0;
            char c2 = 0;
            while (setvideostabilizationmode.b < i6) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i16 = $10 + 45;
                    $11 = i16 % 128;
                    if (i16 % 2 == 0) {
                        int i17 = setvideostabilizationmode.b;
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cMyPid = (char) (Process.myPid() >> 22);
                                int i18 = 3225 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int i19 = 14 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                byte b4 = $$c[0];
                                byte b5 = (byte) (b4 - 1);
                                byte b6 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, i18, i19, 2133916302, false, $$i(b5, b6, (byte) (b6 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            Object obj = null;
                            cArr4[i17] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            obj.hashCode();
                            throw null;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    int i20 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                        int iIndexOf2 = 3224 - TextUtils.indexOf((CharSequence) "", '0');
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 13;
                        byte b7 = $$c[0];
                        byte b8 = (byte) (b7 - 1);
                        byte b9 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, iIndexOf2, packedPositionType, 2133916302, false, $$i(b8, b9, (byte) (b9 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i20] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                } else {
                    int i21 = setvideostabilizationmode.b;
                    Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c4 = (char) (29945 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1755;
                        int i22 = 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        byte[] bArr2 = $$c;
                        byte b10 = bArr2[0];
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c4, minimumFlingVelocity, i22, 387247676, false, $$i((byte) (b10 - 1), b10, (byte) bArr2.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i21] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[setvideostabilizationmode.b];
                Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf = (char) (41241 - TextUtils.indexOf("", "", 0));
                    int iKeyCodeFromString = 1705 - KeyEvent.keyCodeFromString("");
                    int keyRepeatTimeout = 21 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte b11 = $$c[0];
                    byte b12 = (byte) (b11 - 1);
                    byte b13 = b11;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, iKeyCodeFromString, keyRepeatTimeout, -1434471773, false, $$i(b12, b13, b13), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i23 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i23, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i23);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i6];
            while (true) {
                setvideostabilizationmode.b = i;
                if (setvideostabilizationmode.b >= i6) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr3[(i6 - setvideostabilizationmode.b) - 1];
                i = setvideostabilizationmode.b + 1;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i24 = $11 + 47;
            $10 = i24 % 128;
            int i25 = i24 % 2;
            int i26 = 0;
            while (true) {
                setvideostabilizationmode.b = i26;
                if (setvideostabilizationmode.b >= i6) {
                    break;
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i26 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
        int i6 = ~i5;
        if (i4 != 436818192 + (((~((-799482534) | i6)) | (-1629470077)) * 519) + (((~(i6 | (-554115109))) | (~((-1075354969) | i5))) * (-519)) + (((~(i5 | (-1629470077))) | 799482533) * 519)) {
            int i7 = (-1660026370) % 2;
            throw new ArithmeticException();
        }
        int i8 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iNextInt = new Random().nextInt();
        int i9 = ~iNextInt;
        if (i8 != 767966968 + ((1872706391 | i9) * (-369)) + (((~((-790510152) | i9)) | 1788545813) * (-369)) + (((~(iNextInt | 790510151)) | 1082196240 | (~(i9 | (-84160579)))) * 369)) {
            int i10 = TuitionPaymentFragmentbindingInflater1 + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
            if (i10 % 2 == 0) {
                int[] iArr = new int[94910238];
                iArr[94910237] = 0;
                Toast.makeText((Context) null, iArr[-1], 0).show();
            } else {
                int[] iArr2 = new int[94910238];
                iArr2[94910237] = 1;
                int i11 = (-1986678682) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        super.onResume();
        int i12 = TuitionPaymentFragmentbindingInflater1 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 71 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iNextInt = new Random().nextInt();
        int i5 = ~iNextInt;
        if (i4 != (-1762405838) + (((~(1877280085 | i5)) | (-2146267008)) * 98) + (((~(i5 | (-1047292543))) | 1877280085 | (~(1047292542 | iNextInt))) * (-49)) + (((~(iNextInt | 1877280085)) | 1098974465) * 49)) {
            int[] iArr = new int[512039499];
            iArr[512039498] = 1;
            int i6 = (-904120402) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
            TuitionPaymentFragmentbindingInflater1 = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i10 = 681645568 + ((iIdentityHashCode | 268607522) * 988);
        int i11 = ~iIdentityHashCode;
        if (i9 != i10 + (((~(341567615 | i11)) | (-2130439040)) * (-1976)) + (((~(iIdentityHashCode | 2057478946)) | 268607522 | (~((-2057478947) | i11))) * 988)) {
            throw new RuntimeException("1384821663");
        }
        super.onStart();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b7, code lost:
    
        if (r1 != (((159221532 + (((~((-883239768) | r2)) | 604244485) * 1504)) + ((~(r2 | (-278995283))) * (-1504))) - 125771552)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b9, code lost:
    
        super.onCreate(r11);
        r11 = com.bpjstku.presentation.membership.payment.PaymentNonInstantDetailActivity.TuitionPaymentFragmentbindingInflater1 + 91;
        com.bpjstku.presentation.membership.payment.PaymentNonInstantDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c6, code lost:
    
        r11 = (-1410707726) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00cf, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d0, code lost:
    
        r11 = 669425390 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d9, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003d, code lost:
    
        if (r1 == ((((-717941512) + (((~((-1815222113) | r5)) | 674239488) * 184)) + ((r4 | (-2126217194)) * (-184))) + ((~((-985234570) | r5)) * 184))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006f, code lost:
    
        if (r1 == (((-415896311) + (((~((-571066147) | r5)) | (~(r4 | (-1401053690)))) * 333)) + (((~(r4 | (-571066147))) | (~(r5 | (-1401053690)))) * 333))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0071, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r4 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentNonInstantDetailActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Registration TuitionPaymentFragmentspecialinlinedviewModeldefault1(PaymentNonInstantDetailActivity paymentNonInstantDetailActivity) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Parcelable parcelableExtra = paymentNonInstantDetailActivity.getIntent().getParcelableExtra("successful_unregistered_registration_data");
        Intrinsics.checkNotNull(parcelableExtra);
        Registration registration = (Registration) parcelableExtra;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
        return registration;
    }

    public static /* synthetic */ Unit b(PaymentNonInstantDetailActivity paymentNonInstantDetailActivity, View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            Intrinsics.areEqual(((Registration) paymentNonInstantDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).getInterfaceDescriptor, "unregistered_member");
            obj.hashCode();
            throw null;
        }
        if (Intrinsics.areEqual(((Registration) paymentNonInstantDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).getInterfaceDescriptor, "unregistered_member")) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 != 0) {
                LoginActivity.Companion companion = LoginActivity.INSTANCE;
                LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentNonInstantDetailActivity, null, false, 12);
            } else {
                LoginActivity.Companion companion2 = LoginActivity.INSTANCE;
                LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentNonInstantDetailActivity, null, false, 6);
            }
        } else {
            MainActivity.Companion companion3 = MainActivity.INSTANCE;
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(paymentNonInstantDetailActivity, null, null, 6);
            paymentNonInstantDetailActivity.d_();
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    static {
        asInterface = 0;
        d();
        INSTANCE = new Companion(null);
        int i = f533a + 33;
        asInterface = i % 128;
        if (i % 2 != 0) {
            int i2 = 64 / 0;
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
        int iB = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
        TuitionPaymentFragmentbindingInflater1(lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), iB, new Object[]{this, p0}, -1194485200, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 335333319, lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), 1194485201);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return R.layout.activity_payment_non_instant_non_salaried_worker;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        TuitionPaymentFragmentbindingInflater1(ClaimOldDaySecurityWorkTerminationParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ClaimOldDaySecurityWorkTerminationParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this}, -1515661530, lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_5).substring(3, 4).length() - 218118197, 1515661530);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int iB = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
        TuitionPaymentFragmentbindingInflater1(lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), iB, new Object[]{this}, 335739676, lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), ClaimOldDaySecurityWorkTerminationParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -335739674);
    }

    static void d() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{59705, 59751, 59768, 59773, 59757, 59723, 59739, 59770, 59717, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59757, 59756, 59746, 59750, 59740, 59731, 59705, 59747, 59757, 59747, 59770, 59751, 59759, 59728, 59728, 59752, 59757, 59771, 59749, 59744, 59746, 59743, 59816, 59810, 59810, 59790, 59776, 59823, 59822, 59811, 59779, 59765, 59823, 59839, 59834, 59809, 59820, 59711, 59757, 59759, 59746, 59770, 59749, 59749, 59773, 59755, 59743, 59745, 59750, 59742, 59730, 59746, 59759};
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 88 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        PaymentNonInstantDetailActivity paymentNonInstantDetailActivity = (PaymentNonInstantDetailActivity) objArr[0];
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            return null;
        }
        int i4 = 39 / 0;
        return null;
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
    private static java.lang.String $$i(byte r6, int r7, short r8) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.bpjstku.presentation.membership.payment.PaymentNonInstantDetailActivity.$$c
            int r8 = 105 - r8
            int r7 = r7 * 3
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
            int r6 = r6 + 1
            r1[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentNonInstantDetailActivity.$$i(byte, int, short):java.lang.String");
    }
}
