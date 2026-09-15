package com.bpjstku.presentation.membership.registration.registeredmember;

import android.app.DatePickerDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityNonSalariedWorkerBpjstkRegistrationBinding;
import com.bpjstku.databinding.ActivityVideoListBinding;
import com.bpjstku.presentation.membership.registration.EmailVerificationActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.registeredmember.NonSalariedWorkerBpjstkRegistrationActivity;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.DecorContentParent;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.accessconfigureInstanceInternal;
import defpackage.accessgetMCameraInfoMapp;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.initSession;
import defpackage.runQueryOnBackgroundThread;
import defpackage.setInactive;
import defpackage.unregisterLifecycle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00138\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00168\u0015X\u0095D¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00020\u001a8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001cR\u0014\u0010\u0014\u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/registeredmember/NonSalariedWorkerBpjstkRegistrationActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityNonSalariedWorkerBpjstkRegistrationBinding;", "<init>", "()V", "", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "", "I", "()I", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "Ljava/util/Calendar;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/util/Calendar;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NonSalariedWorkerBpjstkRegistrationActivity extends BindingReactiveFormActivity<ActivityNonSalariedWorkerBpjstkRegistrationBinding> {
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static short[] f564a;
    private static int asBinder;
    private static byte[] d;
    private static int g;
    private static int notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Calendar TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private RegisteredMemberRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentbindingInflater1 = R.layout.activity_non_salaried_worker_bpjstk_registration;
    private static final byte[] $$c = {46, 126, -84, 108};
    private static final int $$f = 154;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {88, ByteCompanionObject.MAX_VALUE, -112, -47, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 105;
    private static int cancelAll = 0;
    private static int asInterface = 0;
    private static int onTransact = 1;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e7, code lost:
    
        if (r14 == ((((-1650577320) + (((-311650865) | (~r2)) * (-490))) + (((~(r2 | 1141671303)) | (-1453322168)) * 490)) + 1893779766)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0117, code lost:
    
        if (((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null) == (((407492164 + ((749095122 | r0) * (-757))) + ((~((-1091613705) | r9)) * 1514)) + (((~(r9 | 1840708826)) | ((~((-1829960843) | r0)) | 738347138)) * 757))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0119, code lost:
    
        r9 = com.bpjstku.presentation.membership.registration.registeredmember.NonSalariedWorkerBpjstkRegistrationActivity.asInterface + 9;
        com.bpjstku.presentation.membership.registration.registeredmember.NonSalariedWorkerBpjstkRegistrationActivity.onTransact = r9 % 128;
        r9 = r9 % 2;
        r9 = new int[368725453];
        r9[368725452(0x15fa4dcc, float:1.0109694E-25)] = 1;
        r12 = (-1743869860) % 2;
        android.widget.Toast.makeText((android.content.Context) null, r9[-1], 1).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x013a, code lost:
    
        super.onCreate(r8);
        r8 = com.bpjstku.presentation.membership.registration.registeredmember.NonSalariedWorkerBpjstkRegistrationActivity.onTransact + 77;
        com.bpjstku.presentation.membership.registration.registeredmember.NonSalariedWorkerBpjstkRegistrationActivity.asInterface = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x014e, code lost:
    
        throw new java.lang.RuntimeException("1452233662");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00ba, code lost:
    
        if (((java.lang.reflect.Field) defpackage.calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null) == ((((-1134047304) + ((654845440 | r0) * 1324)) + (((~(654851592 | r9)) | (~((-1484839136) | r9))) * (-1324))) + 872090992)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(java.lang.Object[] r8, int r9, int r10, int r11, int r12, int r13, int r14) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.registeredmember.NonSalariedWorkerBpjstkRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(java.lang.Object[], int, int, int, int, int, int):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 1
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r1 = com.bpjstku.presentation.membership.registration.registeredmember.NonSalariedWorkerBpjstkRegistrationActivity.$$a
            int r6 = 145 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L20:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L28:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            int r6 = r6 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.registeredmember.NonSalariedWorkerBpjstkRegistrationActivity.c(int, byte, short, java.lang.Object[]):void");
    }

    public NonSalariedWorkerBpjstkRegistrationActivity() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = calendar;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 73;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.TuitionPaymentFragmentbindingInflater1;
        int i6 = i2 + 41;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityNonSalariedWorkerBpjstkRegistrationBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        NonSalariedWorkerBpjstkRegistrationActivity$bindingInflater$1 nonSalariedWorkerBpjstkRegistrationActivity$bindingInflater$1 = NonSalariedWorkerBpjstkRegistrationActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = onTransact + 19;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return nonSalariedWorkerBpjstkRegistrationActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("registration_data");
            Intrinsics.checkNotNull(parcelableExtra);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (RegisteredMemberRegistration) parcelableExtra;
        } else {
            Parcelable parcelableExtra2 = getIntent().getParcelableExtra("registration_data");
            Intrinsics.checkNotNull(parcelableExtra2);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (RegisteredMemberRegistration) parcelableExtra2;
            int i3 = 44 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        MaterialToolbar materialToolbar = INotificationSideChannelStub().layoutToolbar.toolbar;
        String string = getString(R.string.title_registration_jmo);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        EditText editText = INotificationSideChannelStub().tilFullName.getEditText();
        if (editText != null) {
            Intrinsics.checkNotNullParameter(editText, "");
            editText.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
            int i4 = asInterface + 79;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        NonSalariedWorkerBpjstkRegistrationActivity nonSalariedWorkerBpjstkRegistrationActivity = this;
        Intrinsics.checkNotNullParameter(nonSalariedWorkerBpjstkRegistrationActivity, "");
        nonSalariedWorkerBpjstkRegistrationActivity.getWindow().addFlags(8192);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityNonSalariedWorkerBpjstkRegistrationBinding activityNonSalariedWorkerBpjstkRegistrationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = activityNonSalariedWorkerBpjstkRegistrationBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getSecondaryToolbarSwipeUpGesture
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NonSalariedWorkerBpjstkRegistrationActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, activityNonSalariedWorkerBpjstkRegistrationBindingINotificationSideChannelStub, (View) obj);
            }
        }));
        EditText editText = activityNonSalariedWorkerBpjstkRegistrationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: getMaxToolbarItems
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NonSalariedWorkerBpjstkRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
                }
            });
        }
        int i2 = asInterface + 107;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i2 = asInterface + 11;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    onBackPressed();
                    int i3 = 17 / 0;
                } else {
                    onBackPressed();
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = asInterface + 123;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
        int i4 = onTransact + 15;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
        int i4 = asInterface + 65;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int i = 2 % 2;
        ActivityNonSalariedWorkerBpjstkRegistrationBinding activityNonSalariedWorkerBpjstkRegistrationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputLayout textInputLayout = activityNonSalariedWorkerBpjstkRegistrationBindingINotificationSideChannelStub.tilIdNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.error_field_nik);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = getString(R.string.error_invalid_field);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string2, 16, 16), new accessconfigureInstanceInternal("^[0-9]{0,}$", string3)})));
        TextInputLayout textInputLayout2 = activityNonSalariedWorkerBpjstkRegistrationBindingINotificationSideChannelStub.tilFullName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string4 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string4))));
        TextInputLayout textInputLayout3 = activityNonSalariedWorkerBpjstkRegistrationBindingINotificationSideChannelStub.tilBirthDate;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string5 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string5))));
        int i2 = onTransact + 103;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x007b  */
    private static void e(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
        int i4;
        int length;
        byte[] bArr;
        int i5;
        int i6;
        int i7 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(g)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2267;
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33;
                byte length2 = (byte) $$c.length;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, keyRepeatDelay, scrollBarFadeDuration, 1387473586, false, $$i((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $10 + 109;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                int i9 = $11 + 125;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr2 = d;
                long j = 0;
                if (bArr2 != null) {
                    int length3 = bArr2.length;
                    byte[] bArr3 = new byte[length3];
                    int i10 = 0;
                    while (i10 < length3) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i10])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1))), 3358 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 17 - ImageFormat.getBitsPerPixel(0), -1054011043, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr3[i10] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i10++;
                        j = 0;
                    }
                    int i11 = $11 + 83;
                    $10 = i11 % 128;
                    i6 = 2;
                    int i12 = i11 % 2;
                    bArr2 = bArr3;
                } else {
                    i6 = 2;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = d;
                    Object[] objArr4 = new Object[i6];
                    objArr4[1] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    objArr4[0] = Integer.valueOf(i3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                        int i13 = 2268 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int iLastIndexOf = 32 - TextUtils.lastIndexOf("", '0');
                        byte length4 = (byte) $$c.length;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(modifierMetaStateMask, i13, iLastIndexOf, 1387473586, false, $$i((byte) 0, length4, (byte) (length4 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) g) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) f564a[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) g) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)) + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(asBinder), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55952 - AndroidCharacter.getMirror('0')), Color.alpha(0) + 2855, View.resolveSize(0, 0) + 13, -1529949196, false, $$i(b4, b5, (byte) (b5 - 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr5 = d;
                if (bArr5 != null) {
                    int i14 = $11 + 73;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        bArr[i5] = (byte) (((long) bArr5[i5]) ^ 3046761265686732006L);
                        i5++;
                    }
                    bArr5 = bArr;
                }
                boolean z = bArr5 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                int i15 = $10 + 35;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        byte[] bArr6 = d;
                        int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i17]) ^ 3046761265686732006L)) + s)) ^ b));
                    } else {
                        short[] sArr = f564a;
                        int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i18]) ^ 3046761265686732006L)) + s)) ^ b));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws Throwable {
        Object[] objArr2;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        int i = 0;
        NonSalariedWorkerBpjstkRegistrationActivity nonSalariedWorkerBpjstkRegistrationActivity = (NonSalariedWorkerBpjstkRegistrationActivity) objArr[0];
        int i2 = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
            int iRed = Color.red(0) + 1031;
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 15;
            byte b = $$a[7];
            Object[] objArr3 = new Object[1];
            c((short) 141, b, (byte) (b | 52), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, iRed, iCombineMeasuredStates, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(((byte) KeyEvent.getModifierMetaStateMask()) - 1140226949, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_getcard_token_failed).substring(9, 10).codePointAt(0) - 142, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 18), (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 88), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1066).substring(0, 54).codePointAt(44) + 1052131651, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1140226957, (-45) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step3).substring(18, 19).length() - 36), (byte) ((-88) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 1052131673, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1032;
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15;
            byte[] bArr = $$a;
            short s = (short) (bArr[0] + 1);
            byte b2 = bArr[7];
            Object[] objArr6 = new Object[1];
            c(s, b2, (byte) (b2 | 52), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode, iIndexOf, scrollDefaultDelay, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = onTransact + 71;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int i5 = 1032 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15;
                byte[] bArr2 = $$a;
                Object[] objArr7 = new Object[1];
                c((short) 37, bArr2[5], bArr2[7], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, i5, minimumFlingVelocity, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr8[3])[0];
            int i7 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i8 = (((1972551637 + ((~((~startElapsedRealtime) | (-131335))) * (-116))) + ((1069121137 | startElapsedRealtime) * 116)) + (((~(startElapsedRealtime | 824840967)) | 244411504) * 116)) - 2041170116;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr2[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e((-1140226940) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) - 45, (short) ((-2) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (byte) (KeyEvent.normalizeMetaState(0) - 92), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1052131750, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_app_instruction_5).substring(25, 26).length() - 1140226943, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_instruction_step3).substring(3, 4).length() - 46, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 30), (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 89), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_gopay).substring(0, 5).codePointAt(2) + 1052131722, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, nonSalariedWorkerBpjstkRegistrationActivity)).intValue();
            try {
                Object[] objArr11 = {-155286667};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - View.resolveSize(0, 0)), TextUtils.getOffsetAfter("", 0) + 1134, 18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, -2041170116, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int i11 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1031;
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 15;
                    byte b3 = $$a[7];
                    Object[] objArr13 = new Object[1];
                    c((short) 141, b3, (byte) (b3 | 52), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize, i11, packedPositionGroup, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - ExpandableListView.getPackedPositionType(0L)), (-16776099) - Color.rgb(0, 0, 0), 17 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), Boolean.TYPE});
                }
                objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                    int iIndexOf2 = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int longPressTimeout = 15 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    byte[] bArr3 = $$a;
                    Object[] objArr14 = new Object[1];
                    c((short) 37, bArr3[5], bArr3[7], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf2, iIndexOf2, longPressTimeout, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr2);
                try {
                    Object[] objArr15 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_hint_telkomsel_token).substring(0, 1).codePointAt(0) - 1140227034, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 56, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_user_canceled_liveness).substring(3, 4).codePointAt(0) - 20), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 52), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_bad_response_server).substring(0, 24).codePointAt(19) + 1052131648, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e((-1140226946) - (KeyEvent.getMaxKeyCode() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_full_name).substring(0, 12).length() - 57, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlTrustedGoBackButtonTitle).substring(0, 7).codePointAt(5) - 134), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_wearing_mask_text).substring(0, 6).codePointAt(4) - 189), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_atm_bni).substring(0, 7).codePointAt(5) + 1052131693, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                        int trimmedLength = 1031 - TextUtils.getTrimmedLength("");
                        int defaultSize = 15 - View.getDefaultSize(0, 0);
                        byte[] bArr4 = $$a;
                        short s2 = (short) (bArr4[0] + 1);
                        byte b4 = bArr4[7];
                        Object[] objArr17 = new Object[1];
                        c(s2, b4, (byte) (b4 | 52), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionChild, trimmedLength, defaultSize, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int i12 = 1032 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int i13 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14;
                        byte b5 = $$a[7];
                        Object[] objArr18 = new Object[1];
                        c((short) 141, b5, (byte) (b5 | 52), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(doubleTapTimeout, i12, i13, 1357589585, false, (String) objArr18[0], null);
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
        if (((int[]) objArr2[3])[0] != ((int[]) objArr2[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr2[0];
            if (strArr2 != null) {
                int i14 = onTransact;
                int i15 = i14 + 43;
                asInterface = i15 % 128;
                int i16 = 2;
                int i17 = i15 % 2;
                int i18 = i14 + 99;
                asInterface = i18 % 128;
                int i19 = i18 % 2;
                while (i < strArr2.length) {
                    int i20 = asInterface + 109;
                    onTransact = i20 % 128;
                    int i21 = i20 % i16;
                    arrayList.add(strArr2[i]);
                    i++;
                    int i22 = asInterface + 51;
                    onTransact = i22 % 128;
                    int i23 = i22 % 2;
                    i16 = 2;
                }
            }
            throw null;
        }
        Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i24 = ((int[]) objArr2[2])[0];
        int i25 = ((int[]) objArr2[3])[0];
        int i26 = ((int[]) objArr2[1])[0];
        String[] strArr3 = (String[]) objArr2[0];
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i27 = i24 + (-32342713) + (((~startUptimeMillis) | 313629562) * 1444) + (((~(startUptimeMillis | (-39525513))) | (~(283805682 | startUptimeMillis)) | 34674696) * (-1444)) + 1192722202;
        int i28 = (i27 << 13) ^ i27;
        int i29 = i28 ^ (i28 >>> 17);
        ((int[]) objArr19[2])[0] = i29 ^ (i29 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char maximumFlingVelocity = (char) (29944 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1756;
            int size = View.MeasureSpec.getSize(0) + 23;
            byte b6 = $$a[7];
            Object[] objArr20 = new Object[1];
            c((short) 37, b6, (byte) (b6 | 37), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(maximumFlingVelocity, iLastIndexOf, size, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cResolveSizeAndState = (char) (29944 - View.resolveSizeAndState(0, 0, 0));
                int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 1755;
                int modifierMetaStateMask = 22 - ((byte) KeyEvent.getModifierMetaStateMask());
                byte[] bArr5 = $$a;
                short s3 = (short) (bArr5[0] + 1);
                byte b7 = bArr5[7];
                Object[] objArr21 = new Object[1];
                c(s3, b7, (byte) (b7 | 52), objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cResolveSizeAndState, scrollBarSize2, modifierMetaStateMask, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i30 = ((int[]) objArr22[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{i30}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i31 = ~elapsedCpuTime;
            int i32 = ((((-1730823282) + ((~(829351294 | i31)) * 979)) + ((elapsedCpuTime | 1041953720) * (-979))) + (((~(elapsedCpuTime | 829351294)) | (~(i31 | 1041953720))) * 979)) - 1281505000;
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i34 ^ (i34 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1140226977, (-45) - ExpandableListView.getPackedPositionGroup(0L), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 13), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indomaret_instruction_step5).substring(1, 7).length() - 98), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1052131750, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1140226978, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 91, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_app_instruction_5).substring(25, 26).length() + 5), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1053).substring(0, 53).codePointAt(15) - 201), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1052131766, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, nonSalariedWorkerBpjstkRegistrationActivity)).intValue();
            Object[] objArr25 = {-155286667};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 42049), 1726 - KeyEvent.normalizeMetaState(0), View.resolveSize(0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = DecorContentParent.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -1281505000);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char maximumDrawingCacheSize = (char) (29944 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 1755;
                int iResolveSizeAndState = 23 - View.resolveSizeAndState(0, 0, 0);
                byte[] bArr6 = $$a;
                short s4 = (short) (bArr6[0] + 1);
                byte b8 = bArr6[7];
                Object[] objArr26 = new Object[1];
                c(s4, b8, (byte) (b8 | 52), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(maximumDrawingCacheSize, maxKeyCode2, iResolveSizeAndState, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e((-1140226949) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 44, (short) (81 - (ViewConfiguration.getScrollBarSize() >> 8)), (byte) (TextUtils.indexOf((CharSequence) "", '0') + 89), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlStatusCardWarningTitle).substring(0, 20).length() + 1052131729, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 1140226995, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_bersama1).substring(30, 31).length() - 46, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 142), (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 89), ((Process.getThreadPriority(0) + 20) >> 6) + 1052131771, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29944);
                    int i35 = 1756 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int iMyTid = (Process.myTid() >> 22) + 23;
                    short s5 = $$a[7];
                    byte b9 = (byte) s5;
                    Object[] objArr29 = new Object[1];
                    c(s5, b9, (byte) (b9 | 52), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(edgeSlop, i35, iMyTid, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char maxKeyCode3 = (char) (29944 - (KeyEvent.getMaxKeyCode() >> 16));
                    int iBlue = 1755 - Color.blue(0);
                    int iRed2 = 23 - Color.red(0);
                    byte b10 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    c((short) 37, b10, (byte) (b10 | 37), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(maxKeyCode3, iBlue, iRed2, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i36 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0];
        int i37 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        if (i37 == i36) {
            int i38 = onTransact + 49;
            asInterface = i38 % 128;
            int i39 = i38 % 2;
            int i40 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            int i41 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
            Object[] objArr31 = {new int[]{i41}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
            int i42 = ~startElapsedRealtime2;
            int i43 = i40 + 306283718 + ((startElapsedRealtime2 | 506352696) * (-859)) + (((~(startElapsedRealtime2 | (-237768705))) | (~(506352696 | i42))) * 859) + (((~(293750270 | i42)) | (-531518975)) * 859);
            int i44 = (i43 << 13) ^ i43;
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArr31[3])[0] = i45 ^ (i45 << 5);
            return null;
        }
        int i46 = 3;
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
        if (strArr4 != null) {
            int i47 = asInterface + 3;
            onTransact = i47 % 128;
            int i48 = 2;
            int i49 = i47 % 2;
            int i50 = 0;
            while (i50 < strArr4.length) {
                int i51 = onTransact + i46;
                asInterface = i51 % 128;
                if (i51 % i48 != 0) {
                    arrayList2.add(strArr4[i50]);
                    i50 += 106;
                } else {
                    arrayList2.add(strArr4[i50]);
                    i50++;
                }
                i46 = 3;
                i48 = 2;
            }
        }
        Toast.makeText((Context) null, i37 / (((i37 - 1) * i37) % 2), 0).show();
        int i52 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
        int i53 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        Object[] objArr32 = {new int[]{i53}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
        int i54 = (int) Runtime.getRuntime().totalMemory();
        int i55 = ~i54;
        int i56 = i52 + 1236420740 + ((i54 | 429394693) * (-859)) + (((~(i54 | (-286262021))) | (~(429394693 | i55))) * 859) + (((~(216792267 | i55)) | (-503054288)) * 859);
        int i57 = (i56 << 13) ^ i56;
        int i58 = i57 ^ (i57 >>> 17);
        ((int[]) objArr32[3])[0] = i58 ^ (i58 << 5);
        return null;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -2035900053
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.registeredmember.NonSalariedWorkerBpjstkRegistrationActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_blink_smile_and_your_eyes).substring(0, 25).length() + 633422115;
        int i5 = (-1130990248) + (((~((-305381377) | length)) | 35667968 | (~((-1135368920) | length))) * (-754));
        int i6 = ~((-35667969) | length);
        int i7 = ~length;
        if (i4 != i5 + ((i6 | (~((-1099700952) | i7))) * (-754)) + ((i7 | (-305381377)) * 754)) {
            int i8 = 398827484 % 2;
            throw new ArithmeticException();
        }
        int i9 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i10 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        if (i9 != 159221532 + (((~((-499696383) | i10)) | 432046686) * 1504) + ((~(i10 | (-67649697))) * (-1504)) + 1161680384) {
            int[] iArr = new int[300545968];
            iArr[300545967] = 1;
            int i11 = 471540048 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i12 = onTransact + 3;
            asInterface = i12 % 128;
            int i13 = i12 % 2;
        }
        super.onStart();
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final NonSalariedWorkerBpjstkRegistrationActivity nonSalariedWorkerBpjstkRegistrationActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: getTranslateLocale
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                    NonSalariedWorkerBpjstkRegistrationActivity.b(this.b, i2, i3, i4);
                }
            }, nonSalariedWorkerBpjstkRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(1), nonSalariedWorkerBpjstkRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(2), nonSalariedWorkerBpjstkRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(5)).show();
            ViewPortBuilder.b();
            int i2 = onTransact + 51;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        RegisteredMemberRegistration registeredMemberRegistration;
        Editable text;
        Editable text2;
        NonSalariedWorkerBpjstkRegistrationActivity nonSalariedWorkerBpjstkRegistrationActivity = (NonSalariedWorkerBpjstkRegistrationActivity) objArr[0];
        ActivityNonSalariedWorkerBpjstkRegistrationBinding activityNonSalariedWorkerBpjstkRegistrationBinding = (ActivityNonSalariedWorkerBpjstkRegistrationBinding) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = onTransact + 17;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Editable editable = null;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, nonSalariedWorkerBpjstkRegistrationActivity);
            activityNonSalariedWorkerBpjstkRegistrationBinding.nonSalariedWorkerRegistrationContainer.requestFocus();
            RegisteredMemberRegistration registeredMemberRegistration2 = nonSalariedWorkerBpjstkRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            editable.hashCode();
            throw null;
        }
        NonSalariedWorkerBpjstkRegistrationActivity nonSalariedWorkerBpjstkRegistrationActivity2 = nonSalariedWorkerBpjstkRegistrationActivity;
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, nonSalariedWorkerBpjstkRegistrationActivity2);
        activityNonSalariedWorkerBpjstkRegistrationBinding.nonSalariedWorkerRegistrationContainer.requestFocus();
        RegisteredMemberRegistration registeredMemberRegistration3 = nonSalariedWorkerBpjstkRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (registeredMemberRegistration3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            registeredMemberRegistration = null;
        } else {
            registeredMemberRegistration = registeredMemberRegistration3;
        }
        EditText editText = activityNonSalariedWorkerBpjstkRegistrationBinding.tilIdNumber.getEditText();
        if (editText != null) {
            text = editText.getText();
            int i4 = onTransact + 85;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        } else {
            text = null;
        }
        String string = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
        EditText editText2 = activityNonSalariedWorkerBpjstkRegistrationBinding.tilFullName.getEditText();
        if (editText2 != null) {
            int i6 = onTransact + 55;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            text2 = editText2.getText();
        } else {
            text2 = null;
        }
        String string2 = StringsKt.trim((CharSequence) String.valueOf(text2)).toString();
        EditText editText3 = activityNonSalariedWorkerBpjstkRegistrationBinding.tilBirthDate.getEditText();
        RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, string2, string, null, null, null, null, StringsKt.trim((CharSequence) String.valueOf(editText3 != null ? editText3.getText() : null)).toString(), null, null, null, null, null, null, null, null, null, null, 8384319);
        EmailVerificationActivity.Companion companion = EmailVerificationActivity.INSTANCE;
        EmailVerificationActivity.Companion.b(nonSalariedWorkerBpjstkRegistrationActivity2, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void b(NonSalariedWorkerBpjstkRegistrationActivity nonSalariedWorkerBpjstkRegistrationActivity, int i, int i2, int i3) {
        int i4 = 2 % 2;
        nonSalariedWorkerBpjstkRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(1, i);
        nonSalariedWorkerBpjstkRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(2, i2);
        nonSalariedWorkerBpjstkRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(5, i3);
        nonSalariedWorkerBpjstkRegistrationActivity.INotificationSideChannelStub().edtBirthDate.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(nonSalariedWorkerBpjstkRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getTime()));
        int i5 = onTransact + 63;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(NonSalariedWorkerBpjstkRegistrationActivity nonSalariedWorkerBpjstkRegistrationActivity, ActivityNonSalariedWorkerBpjstkRegistrationBinding activityNonSalariedWorkerBpjstkRegistrationBinding, View view) {
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{nonSalariedWorkerBpjstkRegistrationActivity, activityNonSalariedWorkerBpjstkRegistrationBinding, view}, -168401011, ActivityVideoListBinding.b(), ActivityVideoListBinding.b(), 168401013, ActivityVideoListBinding.b(), ActivityVideoListBinding.b());
    }

    static {
        notify = 1;
        g();
        INSTANCE = new Companion(null);
        int i = cancelAll + 83;
        notify = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{this, bundle}, -1344315494, runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 834214994, 1344315494, runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = onTransact + 65;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws IllegalAccessException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{this, context}, -318237188, ActivityVideoListBinding.b(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notification_gojek_app).substring(4, 5).codePointAt(0) - 1250942124, 318237189, ActivityVideoListBinding.b(), runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1306845885;
        g = -1934795574;
        asBinder = -816109823;
        d = new byte[]{12, 25, -67, -20, -58, -37, 25, -66, -18, -73, -53, -54, 116, -19, 46, -89, -76, -73, -78, -29, -69, -30, 5, -107, 41, 102, 37, 32, -111, 56, -113, -100, -101, 40, 44, 102, 52, 2, 72, -79, 65, -122, 98, 101, -125, -71, 77, -75, 122, -115, -73, 85, -77, 2, 70, -86, 99, -112, -86, 73, 94, -124, 122, 64, -86, 125, 78, 70, -80};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, int r7, byte r8) {
        /*
            int r8 = r8 * 4
            int r8 = 4 - r8
            byte[] r0 = com.bpjstku.presentation.membership.registration.registeredmember.NonSalariedWorkerBpjstkRegistrationActivity.$$c
            int r7 = 121 - r7
            int r6 = r6 * 4
            int r6 = 1 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r8]
        L24:
            int r8 = r8 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.registeredmember.NonSalariedWorkerBpjstkRegistrationActivity.$$i(short, int, byte):java.lang.String");
    }
}
