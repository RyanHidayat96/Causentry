package com.bpjstku.presentation.membership.forgotaccount.inputnik;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.user.model.request.ForgotAccountRequest;
import com.bpjstku.databinding.ActivityForgotAccountBinding;
import com.bpjstku.domain.user.model.ForgotAccount;
import com.bpjstku.presentation.membership.forgotaccount.inputnik.ForgotAccountActivity;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.gms.internal.auth.zzgx;
import com.google.android.libraries.places.internal.zzrf;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.DelegatingImageCapturedCallback;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accessconfigureInstanceInternal;
import defpackage.accessgetMCameraInfoMapp;
import defpackage.deInitSession;
import defpackage.deriveCodec;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setCompoundDrawableTintMode;
import defpackage.setInactive;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import defpackage.unregisterLifecycle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0018\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u001b"}, d2 = {"Lcom/bpjstku/presentation/membership/forgotaccount/inputnik/ForgotAccountActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityForgotAccountBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "LsetCompoundDrawableTintMode;", "Lkotlin/Lazy;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ForgotAccountActivity extends BindingReactiveFormActivity<ActivityForgotAccountBinding> {
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char[] b;
    private static int d;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {119, -102, -34, -3};
    private static final int $$f = 96;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {46, 47, -18, 64, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 234;
    private static int g = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int asBinder = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = (~(i7 | i8 | (~i3))) | (~(i5 | i4 | i3));
        int i10 = (~(i8 | i3)) | (~(i8 | i5));
        int i11 = (~(i3 | i4)) | i5;
        int i12 = i5 + i4 + i2 + (1661237432 * i6) + (961048624 * i);
        int i13 = i12 * i12;
        int i14 = ((119520104 * i5) - 281083904) + ((-1329838950) * i4) + (i9 * 724679527) + (724679527 * i10) + ((-724679527) * i11) + ((-605159424) * i2) + ((-1559232512) * i6) + (1553989632 * i) + (2020540416 * i13);
        int i15 = (i5 * (-2040814728)) + 92927091 + (i4 * (-2040813538)) + (i9 * (-595)) + (i10 * (-595)) + (i11 * 595) + (i2 * (-2040814133)) + (i6 * (-1614655000)) + (i * 500164112) + (i13 * 184877056);
        int i16 = i14 + (i15 * i15 * 1800994816);
        if (i16 != 1) {
            return i16 != 2 ? b(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 1
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r1 = com.bpjstku.presentation.membership.forgotaccount.inputnik.ForgotAccountActivity.$$a
            int r7 = 196 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.forgotaccount.inputnik.ForgotAccountActivity.c(short, short, byte, java.lang.Object[]):void");
    }

    public ForgotAccountActivity() {
        final ForgotAccountActivity forgotAccountActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<setCompoundDrawableTintMode>() { // from class: com.bpjstku.presentation.membership.forgotaccount.inputnik.ForgotAccountActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setCompoundDrawableTintMode] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setCompoundDrawableTintMode invoke() {
                LifecycleOwner lifecycleOwner = forgotAccountActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(setCompoundDrawableTintMode.class);
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

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityForgotAccountBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ForgotAccountActivity$bindingInflater$1 forgotAccountActivity$bindingInflater$1 = ForgotAccountActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i3 != 0) {
            return forgotAccountActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityForgotAccountBinding activityForgotAccountBindingINotificationSideChannelStub = INotificationSideChannelStub();
        activityForgotAccountBindingINotificationSideChannelStub.btnCariAkun.setOnClickListener(new View.OnClickListener() { // from class: onFontRetrievalFailed
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ForgotAccountActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, activityForgotAccountBindingINotificationSideChannelStub, view);
            }
        });
        activityForgotAccountBindingINotificationSideChannelStub.btnToLogin.setOnClickListener(new View.OnClickListener() { // from class: AppCompatTextHelper1
            public static int b = 1553276820;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ForgotAccountActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((setCompoundDrawableTintMode) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(this, new Observer() { // from class: AppCompatTextHelper2
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                ForgotAccountActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ForgotAccountActivity forgotAccountActivity = this;
        Intrinsics.checkNotNullParameter(forgotAccountActivity, "");
        forgotAccountActivity.getWindow().addFlags(8192);
        TextInputEditText textInputEditText = INotificationSideChannelStub().edtIdNumber;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        ForgotAccountActivity forgotAccountActivity2 = this;
        Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputEditText, forgotAccountActivity2);
        TextInputEditText textInputEditText2 = INotificationSideChannelStub().edtKPJNumber;
        Intrinsics.checkNotNullExpressionValue(textInputEditText2, "");
        Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputEditText2, forgotAccountActivity2);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            MaterialButton materialButton = INotificationSideChannelStub().btnCariAkun;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(true);
        } else {
            MaterialButton materialButton3 = INotificationSideChannelStub().btnCariAkun;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(false);
        }
        int i3 = asBinder + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            MaterialButton materialButton = INotificationSideChannelStub().btnCariAkun;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(true);
            return;
        }
        MaterialButton materialButton3 = INotificationSideChannelStub().btnCariAkun;
        Intrinsics.checkNotNullExpressionValue(materialButton3, "");
        MaterialButton materialButton4 = materialButton3;
        Intrinsics.checkNotNullParameter(materialButton4, "");
        materialButton4.setEnabled(true);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        ForgotAccountActivity forgotAccountActivity = (ForgotAccountActivity) objArr[0];
        int i = 2 % 2;
        TextInputLayout textInputLayout = forgotAccountActivity.INotificationSideChannelStub().tilIdNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = forgotAccountActivity.getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = forgotAccountActivity.getString(R.string.error_field_nik);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        forgotAccountActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string2, 16, 16)})));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 44 / 0;
        }
        return null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:17:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:19:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:22:0x0276 A[Catch: all -> 0x0bb3, TryCatch #1 {all -> 0x0bb3, blocks: (B:20:0x0262, B:22:0x0276, B:23:0x02a7, B:62:0x0871, B:64:0x0885, B:65:0x08bb, B:67:0x08ed, B:68:0x0962), top: B:103:0x0262 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:31:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:34:0x040b  */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29945);
                int i3 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1754;
                int i4 = 24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                byte b2 = $$a[5];
                Object[] objArr2 = new Object[1];
                c(b2, (short) (b2 | 192), (byte) 37, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, i3, i4, 986134021, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
            int i5 = 74 / 0;
            if (j != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 29945);
                    int i6 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                    int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    Object[] objArr3 = new Object[1];
                    c($$a[5], (short) 156, (byte) 52, objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, i6, iIndexOf, 1599039318, false, (String) objArr3[0], null);
                }
                Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
                int i7 = (~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1152433802)) | 217517390;
                int i8 = 2058387730 + (i7 * 495) + (((~i7) | 213188682) * 495) + 1913057339;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0] = i10 ^ (i10 << 5);
                int i11 = asBinder + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                int i12 = i11 % 2;
            } else {
                Object[] objArr5 = new Object[1];
                e(new char[]{11, '\f', 16, 14, 0, 5, '\f', '\n', '\n', 23, 21, 18, 3, 19, 16, 22}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 114), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                e(new char[]{'\t', 6, 19, '\f', 23, '\r', 19, 17, 11, 16, '\t', 4, 5, 17, 7, 15}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_3).substring(1, 3).codePointAt(1) - 62), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr6);
                int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr7 = {1989430643};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 42050), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1725, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = zzgx.TuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr7), 1913057339);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cMyPid = (char) (29944 - (Process.myPid() >> 22));
                        int capsMode = 1755 - TextUtils.getCapsMode("", 0, 0);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 23;
                        Object[] objArr8 = new Object[1];
                        c($$a[5], (short) 156, (byte) 52, objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyPid, capsMode, iResolveSizeAndState, 1599039318, false, (String) objArr8[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da);
                    try {
                        Object[] objArr9 = new Object[1];
                        e(new char[]{'\f', '\n', 7, 0, 18, 5, '\n', 0, 19, 0, 21, 24, 19, 1, 19, 18, 22, 6, 5, 20, 21, 2}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.info_gci_payment).substring(18, 24).codePointAt(2) - 86), 22 - View.MeasureSpec.getMode(0), objArr9);
                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        e(new char[]{15, 2, '\f', '\r', 2, 19, 6, 5, 16, '\f', 3, 15, 6, 23, 13923}, (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 100), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_message_invalid_cvv).substring(12, 13).length() + 14, objArr10);
                        long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c2 = (char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            int i13 = 1755 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int i14 = 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            byte b3 = $$a[5];
                            short s = (short) ($$b & 380);
                            Object[] objArr11 = new Object[1];
                            c(b3, s, (byte) (s >>> 1), objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, i13, i14, 1596667560, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char offsetBefore = (char) (29944 - TextUtils.getOffsetBefore("", 0));
                            int scrollBarSize = 1755 - (ViewConfiguration.getScrollBarSize() >> 8);
                            int tapTimeout = 23 - (ViewConfiguration.getTapTimeout() >> 16);
                            byte b4 = $$a[5];
                            Object[] objArr12 = new Object[1];
                            c(b4, (short) (b4 | 192), (byte) 37, objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore, scrollBarSize, tapTimeout, 986134021, false, (String) objArr12[0], null);
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
            }
        } else {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char c3 = (char) (29945 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                int iKeyCodeFromString = 1755 - KeyEvent.keyCodeFromString("");
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 23;
                byte b5 = $$a[5];
                Object[] objArr13 = new Object[1];
                c(b5, (short) (b5 | 192), (byte) 37, objArr13);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, iKeyCodeFromString, longPressTimeout, 986134021, false, (String) objArr13[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0) + 29945);
                    int i15 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                    int iIndexOf2 = 22 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    Object[] objArr14 = new Object[1];
                    c($$a[5], (short) 156, (byte) 52, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf2, i15, iIndexOf2, 1599039318, false, (String) objArr14[0], null);
                }
                Object[] objArr15 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = new Object[]{new int[]{((int[]) objArr15[0])[0]}, new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[1], (String[]) objArr15[4]};
                int i16 = (~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1152433802)) | 217517390;
                int i17 = 2058387730 + (i16 * 495) + (((~i16) | 213188682) * 495) + 1913057339;
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0] = i19 ^ (i19 << 5);
                int i110 = asBinder + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i110 % 128;
                int i111 = i110 % 2;
            } else {
                Object[] objArr16 = new Object[1];
                e(new char[]{11, '\f', 16, 14, 0, 5, '\f', '\n', '\n', 23, 21, 18, 3, 19, 16, 22}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 114), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr16);
                Class<?> cls3 = Class.forName((String) objArr16[0]);
                Object[] objArr17 = new Object[1];
                e(new char[]{'\t', 6, 19, '\f', 23, '\r', 19, 17, 11, 16, '\t', 4, 5, 17, 7, 15}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_3).substring(1, 3).codePointAt(1) - 62), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr17);
                int iIntValue2 = ((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr18 = {1989430643};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 42050), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1725, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = zzgx.TuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr18), 1913057339);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cMyPid2 = (char) (29944 - (Process.myPid() >> 22));
                    int capsMode2 = 1755 - TextUtils.getCapsMode("", 0, 0);
                    int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 23;
                    Object[] objArr19 = new Object[1];
                    c($$a[5], (short) 156, (byte) 52, objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyPid2, capsMode2, iResolveSizeAndState2, 1599039318, false, (String) objArr19[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da);
                Object[] objArr20 = new Object[1];
                e(new char[]{'\f', '\n', 7, 0, 18, 5, '\n', 0, 19, 0, 21, 24, 19, 1, 19, 18, 22, 6, 5, 20, 21, 2}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.info_gci_payment).substring(18, 24).codePointAt(2) - 86), 22 - View.MeasureSpec.getMode(0), objArr20);
                Class<?> cls4 = Class.forName((String) objArr20[0]);
                Object[] objArr110 = new Object[1];
                e(new char[]{15, 2, '\f', '\r', 2, 19, 6, 5, 16, '\f', 3, 15, 6, 23, 13923}, (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 100), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_message_invalid_cvv).substring(12, 13).length() + 14, objArr110);
                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr110[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c4 = (char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int i112 = 1755 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i113 = 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    byte b6 = $$a[5];
                    short s2 = (short) ($$b & 380);
                    Object[] objArr111 = new Object[1];
                    c(b6, s2, (byte) (s2 >>> 1), objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c4, i112, i113, 1596667560, false, (String) objArr111[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char offsetBefore2 = (char) (29944 - TextUtils.getOffsetBefore("", 0));
                    int scrollBarSize2 = 1755 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int tapTimeout2 = 23 - (ViewConfiguration.getTapTimeout() >> 16);
                    byte b7 = $$a[5];
                    Object[] objArr112 = new Object[1];
                    c(b7, (short) (b7 | 192), (byte) 37, objArr112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore2, scrollBarSize2, tapTimeout2, 986134021, false, (String) objArr112[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf4);
            }
        }
        int i20 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0];
        int i21 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0];
        if (i21 == i20) {
            int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
            asBinder = i22 % 128;
            int i23 = i22 % 2;
            int i24 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
            Object[] objArr21 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i25 = i24 + ((((-1106378850) + (((~((-212864589) | iIdentityHashCode)) | (~((-262163) | iIdentityHashCode))) * 69)) + (((~(iIdentityHashCode | (-537722932))) | ((~((-750325358) | iIdentityHashCode)) | 537460769)) * (-69))) - 250931328);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr21[3])[0] = i27 ^ (i27 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4];
            if (strArr != null) {
                int i28 = 0;
                while (i28 < strArr.length) {
                    int i29 = asBinder + 105;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i29 % 128;
                    if (i29 % 2 != 0) {
                        arrayList.add(strArr[i28]);
                        i28 += 24;
                    } else {
                        arrayList.add(strArr[i28]);
                        i28++;
                    }
                }
            }
            int[] iArr = new int[i21];
            int i30 = i21 - 1;
            iArr[i30] = 1;
            Toast.makeText((Context) null, iArr[((i21 * i30) % 2) - 1], 1).show();
            int i31 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
            Object[] objArr22 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
            int i32 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i33 = (-1675824599) + (((~((-1059888856) | i32)) | 220991042 | (~(847286429 | i32))) * (-880));
            int i34 = (~((-1059888856) | (~i32))) | (-847286430);
            int i35 = ~(i32 | 1059888855);
            int i36 = i31 + i33 + ((i34 | i35) * (-880)) + (i35 * 880);
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArr22[3])[0] = i38 ^ (i38 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
            int i39 = 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            short s3 = (short) 52;
            Object[] objArr23 = new Object[1];
            c($$a[5], s3, (byte) s3, objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(jumpTapTimeout, doubleTapTimeout, i39, 1357589585, false, (String) objArr23[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr24 = new Object[1];
        e(new char[]{'\f', '\n', 7, 0, 18, 5, '\n', 0, 19, 0, 21, 24, 19, 1, 19, 18, 22, 6, 5, 20, 21, 2}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_shopeepay_deeplink).substring(0, 9).length() + 7), 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr24);
        Class<?> cls5 = Class.forName((String) objArr24[0]);
        Object[] objArr25 = new Object[1];
        e(new char[]{15, 2, '\f', '\r', 2, 19, 6, 5, 16, '\f', 3, 15, 6, 23, 13923}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step1).substring(3, 4).length() + 99), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.ef_video).substring(0, 5).length() + 10, objArr25);
        long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr25[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "");
            int offsetBefore3 = TextUtils.getOffsetBefore("", 0) + 1031;
            int packedPositionGroup = 15 - ExpandableListView.getPackedPositionGroup(0L);
            Object[] objArr26 = new Object[1];
            c($$a[5], (short) 156, (byte) 52, objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf, offsetBefore3, packedPositionGroup, 1344079056, false, (String) objArr26[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cMyTid = (char) (Process.myTid() >> 22);
                int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0) + 1032;
                int i40 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14;
                byte b8 = $$a[7];
                short s4 = b8;
                Object[] objArr27 = new Object[1];
                c(b8, s4, (byte) s4, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cMyTid, iIndexOf3, i40, 632103528, false, (String) objArr27[0], null);
            }
            Object[] objArr28 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i41 = ((int[]) objArr28[3])[0];
            int i42 = ((int[]) objArr28[1])[0];
            String[] strArr2 = (String[]) objArr28[0];
            int i43 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            int i44 = ((1735288292 + (((~(i43 | 781394973)) | 39074) * 305)) + (((~((~i43) | 781394973)) | 537114803) * 305)) - 1997506294;
            int i45 = (i44 << 13) ^ i44;
            int i46 = i45 ^ (i45 >>> 17);
            ((int[]) objArr[2])[0] = i46 ^ (i46 << 5);
        } else {
            Object[] objArr29 = new Object[1];
            e(new char[]{11, '\f', 16, 14, 0, 5, '\f', '\n', '\n', 23, 21, 18, 3, 19, 16, 22}, (byte) (125 - TextUtils.indexOf("", "", 0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr29);
            Class<?> cls6 = Class.forName((String) objArr29[0]);
            Object[] objArr30 = new Object[1];
            e(new char[]{'\t', 6, 19, '\f', 23, '\r', 19, 17, 11, 16, '\t', 4, 5, 17, 7, 15}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 32), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr30);
            int iIntValue3 = ((Integer) cls6.getMethod((String) objArr30[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr31 = {1989430643};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (46038 - ExpandableListView.getPackedPositionType(0L)), 1134 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 17, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr32 = {Integer.valueOf(iIntValue3), 0, -1997506294, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr31), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int i47 = 1031 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int keyRepeatTimeout = 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                short s5 = (short) 52;
                Object[] objArr33 = new Object[1];
                c($$a[5], s5, (byte) s5, objArr33);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(scrollBarFadeDuration, i47, keyRepeatTimeout, 1298546779, false, (String) objArr33[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - KeyEvent.keyCodeFromString("")), 1117 - Color.blue(0), TextUtils.indexOf((CharSequence) "", '0') + 18), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr32);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cGreen = (char) Color.green(0);
                int iMyTid = 1031 - (Process.myTid() >> 22);
                int mirror = '?' - AndroidCharacter.getMirror('0');
                byte b9 = $$a[7];
                short s6 = b9;
                Object[] objArr34 = new Object[1];
                c(b9, s6, (byte) s6, objArr34);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cGreen, iMyTid, mirror, 632103528, false, (String) objArr34[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr35 = new Object[1];
                e(new char[]{'\f', '\n', 7, 0, 18, 5, '\n', 0, 19, 0, 21, 24, 19, 1, 19, 18, 22, 6, 5, 20, 21, 2}, (byte) (16 - KeyEvent.getDeadChar(0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima5).substring(12, 13).codePointAt(0) - 86, objArr35);
                Class<?> cls7 = Class.forName((String) objArr35[0]);
                Object[] objArr36 = new Object[1];
                e(new char[]{15, 2, '\f', '\r', 2, 19, 6, 5, 16, '\f', 3, 15, 6, 23, 13923}, (byte) (99 - TextUtils.lastIndexOf("", '0', 0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 31, objArr36);
                long jLongValue4 = ((Long) cls7.getDeclaredMethod((String) objArr36[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                    int iMakeMeasureSpec = 1031 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int i48 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14;
                    Object[] objArr37 = new Object[1];
                    c($$a[5], (short) 156, (byte) 52, objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf2, iMakeMeasureSpec, i48, 1344079056, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char mode = (char) View.MeasureSpec.getMode(0);
                    int defaultSize = View.getDefaultSize(0, 0) + 1031;
                    int bitsPerPixel = 14 - ImageFormat.getBitsPerPixel(0);
                    short s7 = (short) 52;
                    Object[] objArr38 = new Object[1];
                    c($$a[5], s7, (byte) s7, objArr38);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(mode, defaultSize, bitsPerPixel, 1357589585, false, (String) objArr38[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf6);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i49 = ((int[]) objArr[1])[0];
        int i50 = ((int[]) objArr[3])[0];
        if (i50 != i49) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    int i51 = asBinder + 11;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i51 % 128;
                    int i52 = i51 % 2;
                    arrayList2.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i50));
        }
        Object[] objArr39 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i53 = ((int[]) objArr[2])[0];
        int i54 = ((int[]) objArr[3])[0];
        int i55 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.page_title_uobapp).substring(0, 12).codePointAt(3) - 651048095;
        int i56 = i53 + 619471748 + (((~((~iCodePointAt) | 724259683)) | 345023640) * 529) + (((~(iCodePointAt | 724259683)) | 479979513) * 529);
        int i57 = (i56 << 13) ^ i56;
        int i58 = i57 ^ (i57 >>> 17);
        ((int[]) objArr39[2])[0] = i58 ^ (i58 << 5);
    }

    private static void e(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = b;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 75;
                $10 = i6 % 128;
                int i7 = i6 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cRed = (char) Color.red(0);
                        int tapTimeout = 2267 - (ViewConfiguration.getTapTimeout() >> 16);
                        int packedPositionChild = 32 - ExpandableListView.getPackedPositionChild(j);
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRed, tapTimeout, packedPositionChild, -1927765101, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
                    i3 = 2;
                    j = 0;
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
        try {
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                byte b5 = (byte) 0;
                byte b6 = (byte) (b5 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2266, 33 - Gravity.getAbsoluteGravity(0, 0), -1927765101, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    int i8 = $10 + 97;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        obj = obj2;
                    } else {
                        try {
                            Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = (byte) (b7 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - Drawable.resolveOpacity(0, 0)), (ViewConfiguration.getTouchSlop() >> 8) + 3261, (ViewConfiguration.getEdgeSlop() >> 16) + 30, -127612708, false, $$i(b7, b8, (byte) (-b8)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b9 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 594 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 16 - TextUtils.indexOf((CharSequence) "", '0'), 1570859318, false, $$i(b9, (byte) (b9 - 1), (byte) (-$$c[3])), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i10];
                                int i11 = $10 + 117;
                                $11 = i11 % 128;
                                int i12 = i11 % 2;
                            } else {
                                obj = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i13];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                                } else {
                                    int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                                }
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    obj2 = obj;
                }
            }
            int i17 = 0;
            while (i17 < i) {
                int i18 = $11 + 107;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    cArr4[i17] = (char) (cArr4[i17] ^ 21789);
                    i17 += 89;
                } else {
                    cArr4[i17] = (char) (cArr4[i17] ^ 13722);
                    i17++;
                }
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d5, code lost:
    
        if (r1 != (((((-1811415038) | r2) * (-970)) + 336490478) + ((r2 | 46145645) * 970))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d7, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.membership.forgotaccount.inputnik.ForgotAccountActivity.asBinder + 5;
        com.bpjstku.presentation.membership.forgotaccount.inputnik.ForgotAccountActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e3, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e6, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ea, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00eb, code lost:
    
        r1 = 9158382 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f4, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0057, code lost:
    
        if (r1 == (((-461743500) + (((~(1497912181 | r2)) | 667924638) * (-366))) + (((~(r2 | 2144336895)) | 21499924) * 366))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a9, code lost:
    
        if (r1 == ((((-1530675584) + (((~(1022800446 | r3)) | 192812903) * 226)) + (((~(r3 | 1073657727)) | ((~((-192812904) | r2)) | 141955622)) * (-113))) + ((~(r2 | 1022800446)) * 113))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00ab, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = ~((~((int) java.lang.Runtime.getRuntime().maxMemory())) | (-1765269393));
     */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.forgotaccount.inputnik.ForgotAccountActivity.onResume():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x009e, code lost:
    
        if (r1 != (((-815339317) + (r2 * 495)) + (((~r2) | 432015744) * 495))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a0, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.membership.forgotaccount.inputnik.ForgotAccountActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
        com.bpjstku.presentation.membership.forgotaccount.inputnik.ForgotAccountActivity.asBinder = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ac, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ad, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ae, code lost:
    
        r1 = (-1611272524) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b7, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0047, code lost:
    
        if (r1 == (((921864544 + ((2013003611 | r4) * (-676))) + (((~(628276291 | r5)) | (-2013003612)) * 676)) + (((~(r4 | (-1384727321))) | ((~(r5 | 1458263834)) | 554739777)) * 676))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007b, code lost:
    
        if (r1 == (((2007683688 + ((1589182249 | r4) * 376)) + (((~((~r4) | 384119481)) | 1209584896) * (-376))) + (((~(r4 | (-384119482))) | (-1214107025)) * 376))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007d, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = (~java.lang.System.identityHashCode(r9)) | 469313988;
     */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.membership.forgotaccount.inputnik.ForgotAccountActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.bpjstku.presentation.membership.forgotaccount.inputnik.ForgotAccountActivity.asBinder = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L4a
            java.lang.reflect.Member[] r1 = defpackage.CameraUseCaseAdapter.b
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r4 = java.lang.System.identityHashCode(r9)
            r5 = 2013003611(0x77fbff5b, float:1.02222323E34)
            r5 = r5 | r4
            int r5 = r5 * (-676)
            r6 = 921864544(0x36f28960, float:7.2281546E-6)
            int r6 = r6 + r5
            int r5 = ~r4
            r7 = 628276291(0x2572bc43, float:2.105394E-16)
            r7 = r7 | r5
            int r7 = ~r7
            r8 = -2013003612(0xffffffff880400a4, float:-3.972306E-34)
            r7 = r7 | r8
            int r7 = r7 * 676
            int r6 = r6 + r7
            r7 = 1458263834(0x56eb571a, float:1.29379665E14)
            r5 = r5 | r7
            int r5 = ~r5
            r7 = 554739777(0x2110a841, float:4.901178E-19)
            r5 = r5 | r7
            r7 = -1384727321(0xffffffffad76bce7, float:-1.4025426E-11)
            r4 = r4 | r7
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = r4 * 676
            int r6 = r6 + r4
            if (r1 != r6) goto Lae
            goto L7d
        L4a:
            java.lang.reflect.Member[] r1 = defpackage.CameraUseCaseAdapter.b
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r4 = android.os.Process.myPid()
            r5 = 1589182249(0x5eb8ff29, float:6.665209E18)
            r5 = r5 | r4
            int r5 = r5 * 376
            r6 = 2007683688(0x77aad268, float:6.9293595E33)
            int r6 = r6 + r5
            int r5 = ~r4
            r7 = 384119481(0x16e532b9, float:3.7028956E-25)
            r5 = r5 | r7
            int r5 = ~r5
            r7 = 1209584896(0x4818cd00, float:156468.0)
            r5 = r5 | r7
            int r5 = r5 * (-376)
            int r6 = r6 + r5
            r5 = -384119482(0xffffffffe91acd46, float:-1.1696497E25)
            r4 = r4 | r5
            int r4 = ~r4
            r5 = -1214107025(0xffffffffb7a2326f, float:-1.933539E-5)
            r4 = r4 | r5
            int r4 = r4 * 376
            int r6 = r6 + r4
            if (r1 != r6) goto Lae
        L7d:
            java.lang.reflect.Member[] r1 = defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r2 = java.lang.System.identityHashCode(r9)
            int r2 = ~r2
            r4 = 469313988(0x1bf929c4, float:4.1220585E-22)
            r2 = r2 | r4
            int r4 = r2 * 495
            r5 = -815339317(0xffffffffcf66e8cb, float:-3.874016E9)
            int r5 = r5 + r4
            r4 = 432015744(0x19c00980, float:1.9856172E-23)
            int r2 = ~r2
            r2 = r2 | r4
            int r2 = r2 * 495
            int r5 = r5 + r2
            if (r1 != r5) goto Lad
            super.onStart()
            int r1 = com.bpjstku.presentation.membership.forgotaccount.inputnik.ForgotAccountActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r1 = r1 + 19
            int r2 = r1 % 128
            com.bpjstku.presentation.membership.forgotaccount.inputnik.ForgotAccountActivity.asBinder = r2
            int r1 = r1 % r0
            return
        Lad:
            throw r3
        Lae:
            r1 = -1611272524(0xffffffff9ff5eeb4, float:-1.0415644E-19)
            int r1 = r1 % r0
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.forgotaccount.inputnik.ForgotAccountActivity.onStart():void");
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1932206511
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.membership.forgotaccount.inputnik.ForgotAccountActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r1 = r1 + 83
            int r2 = r1 % 128
            com.bpjstku.presentation.membership.forgotaccount.inputnik.ForgotAccountActivity.asBinder = r2
            int r1 = r1 % r0
            java.lang.reflect.Member[] r1 = defpackage.CameraUseCaseAdapter.b
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            java.lang.String r4 = "android.app.ActivityThread"
            java.lang.Class r4 = java.lang.Class.forName(r4)
            java.lang.String r5 = "currentApplication"
            java.lang.Class[] r6 = new java.lang.Class[r2]
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)
            r5 = r3
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            java.lang.Object r4 = r4.invoke(r3, r3)
            android.content.Context r4 = (android.content.Context) r4
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.widthPixels
            int r5 = ~r4
            r6 = -1053295263(0xffffffffc137fd61, float:-11.49936)
            r7 = r5 | r6
            int r7 = ~r7
            r8 = 847249432(0x32800018, float:1.4901204E-8)
            r7 = r7 | r8
            r9 = -17261890(0xfffffffffef89abe, float:-1.6522601E38)
            r10 = r9 | r4
            int r10 = ~r10
            r7 = r7 | r10
            int r7 = r7 * 717
            r10 = -1507772835(0xffffffffa621365d, float:-5.593177E-16)
            int r10 = r10 + r7
            r5 = r5 | r9
            int r5 = ~r5
            r5 = r5 | r8
            r4 = r4 | r6
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = r4 * 717
            int r10 = r10 + r4
            if (r1 == r10) goto L7e
            int r1 = com.bpjstku.presentation.membership.forgotaccount.inputnik.ForgotAccountActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r1 = r1 + 21
            int r4 = r1 % 128
            com.bpjstku.presentation.membership.forgotaccount.inputnik.ForgotAccountActivity.asBinder = r4
            int r1 = r1 % r0
            r1 = -1932206511(0xffffffff8cd4de51, float:-3.2797574E-31)
            int[] r1 = new int[r1]
            r4 = -1932206512(0xffffffff8cd4de50, float:-3.2797571E-31)
            r5 = 1
            r1[r4] = r5
            r4 = 40089424(0x263b750, float:1.6729934E-37)
            int r4 = r4 % r0
            r0 = -1
            r0 = r1[r0]
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r5)
            r0.show()
        L7e:
            java.lang.reflect.Member[] r0 = defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r0 = r0[r2]
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            int r0 = r0.getInt(r3)
            int r1 = java.lang.System.identityHashCode(r11)
            int r2 = ~r1
            r4 = -642338409(0xffffffffd9b6b197, float:-6.4279635E15)
            r5 = r4 | r2
            int r5 = ~r5
            r6 = -1936717557(0xffffffff8c90090b, float:-2.2192155E-31)
            r7 = r6 | r1
            int r7 = ~r7
            r5 = r5 | r7
            int r5 = r5 * 217
            r7 = -678820808(0xffffffffd78a0438, float:-3.0350145E14)
            int r7 = r7 + r5
            r1 = r1 | r4
            int r1 = ~r1
            r4 = 575227488(0x22494660, float:2.7277836E-18)
            r1 = r1 | r4
            int r1 = r1 * 217
            int r7 = r7 + r1
            r1 = r6 | r2
            int r1 = ~r1
            r2 = 642338408(0x26494e68, float:6.9842144E-16)
            r1 = r1 | r2
            int r1 = r1 * 217
            int r7 = r7 + r1
            if (r0 != r7) goto Lb9
            super.onCreate(r12)
            return
        Lb9:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.forgotaccount.inputnik.ForgotAccountActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ForgotAccountActivity forgotAccountActivity, ActivityForgotAccountBinding activityForgotAccountBinding, View view) {
        Editable text;
        Editable text2;
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (forgotAccountActivity.RemoteActionCompatParcelizer()) {
                Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_search_account", "click_search_account"));
                Intrinsics.checkNotNullParameter(forgotAccountActivity, "");
                Intrinsics.checkNotNullParameter("search_account", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
                Intrinsics.checkNotNullParameter("search_account", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("search_account", mapMutableMapOf);
                TextInputLayout textInputLayout = activityForgotAccountBinding.tilIdNumber;
                Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
                VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(textInputLayout, forgotAccountActivity);
                final setCompoundDrawableTintMode setcompounddrawabletintmode = (setCompoundDrawableTintMode) forgotAccountActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                EditText editText = activityForgotAccountBinding.tilIdNumber.getEditText();
                if (editText != null) {
                    text = editText.getText();
                    int i2 = asBinder + 1;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                    int i3 = i2 % 2;
                } else {
                    text = null;
                }
                String strValueOf = String.valueOf(text);
                EditText editText2 = activityForgotAccountBinding.tilKPJNumber.getEditText();
                if (editText2 != null) {
                    text2 = editText2.getText();
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
                    asBinder = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    text2 = null;
                }
                String strValueOf2 = String.valueOf(text2);
                Intrinsics.checkNotNullParameter(strValueOf, "");
                Intrinsics.checkNotNullParameter(strValueOf2, "");
                MutableLiveData<VirtualCameraAdapter1<ForgotAccount>> mutableLiveData = setcompounddrawabletintmode.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(setcompounddrawabletintmode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ForgotAccountRequest(strValueOf, strValueOf2))));
                final Function1 function1 = new Function1() { // from class: onFontRetrieved
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return setCompoundDrawableTintMode.b(setcompounddrawabletintmode, (ForgotAccount) obj);
                    }
                };
                logToString logtostring = new logToString() { // from class: setTextLocales
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function1.invoke(obj);
                    }
                };
                final Function1 function2 = new Function1() { // from class: forLanguageTag
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return setCompoundDrawableTintMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setcompounddrawabletintmode, (Throwable) obj);
                    }
                };
                BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: AppCompatTextHelperApi21Impl
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function2.invoke(obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                setcompounddrawabletintmode.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            ViewPortBuilder.b();
            int i6 = asBinder + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 74 / 0;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ForgotAccountActivity forgotAccountActivity, View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                forgotAccountActivity.d_();
                ViewPortBuilder.b();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            forgotAccountActivity.d_();
            ViewPortBuilder.b();
            int i4 = asBinder + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(ForgotAccountActivity forgotAccountActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        Object obj = null;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            forgotAccountActivity.MediaBrowserCompat();
            str = "loading_search_account_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i4 = asBinder + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            forgotAccountActivity.IconCompatParcelizer();
            GetOtpMethodActivity.Companion companion = GetOtpMethodActivity.INSTANCE;
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            GetOtpMethodActivity.Companion.b(forgotAccountActivity, String.valueOf(((ForgotAccount) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1), String.valueOf(((ForgotAccount) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault3), String.valueOf(((ForgotAccount) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b));
            str = "success_search_account_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            forgotAccountActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(forgotAccountActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            str = "failure_search_account_result";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_search_account", str));
        Intrinsics.checkNotNullParameter(forgotAccountActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static {
        d = 0;
        g();
        INSTANCE = new Companion(null);
        int i = g + 67;
        d = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return R.layout.activity_forgot_account;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DelegatingImageCapturedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iB = zzrf.b();
        int iB2 = zzrf.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzrf.b(), iB, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 256928501, -256928501, new Object[]{this}, iB2);
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DelegatingImageCapturedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notification_otp_message).substring(8, 9).length() - 110921953, zzrf.b(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 38295884, -38295882, new Object[]{this}, zzrf.b());
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int iB = zzrf.b();
        int iCodePointAt = (-1356636941) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto4).substring(12, 13).codePointAt(0);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DelegatingImageCapturedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(DelegatingImageCapturedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iCodePointAt, iB, -1505527646, 1505527647, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    static void g() {
        b = new char[]{60055, 60048, 60041, 60057, 60040, 60063, 60083, 60088, 60050, 60073, 60049, 60058, 60043, 60060, 60053, 60052, 60034, 60062, 60047, 60045, 60117, 60054, 60056, 60072, 60051};
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 57188;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        ForgotAccountActivity forgotAccountActivity = (ForgotAccountActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = asBinder + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, byte r7, byte r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.forgotaccount.inputnik.ForgotAccountActivity.$$c
            int r8 = r8 + 113
            int r6 = r6 * 3
            int r6 = r6 + 1
            int r7 = r7 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r6
            r8 = r7
            r3 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.forgotaccount.inputnik.ForgotAccountActivity.$$i(byte, byte, byte):java.lang.String");
    }
}
