package com.bpjstku.presentation.membership.accountactivation;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
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
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import com.bpjstku.R;
import com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda7;
import com.bpjstku.databinding.ActivityChooseNationalityBinding;
import com.bpjstku.presentation.membership.accountactivation.ChooseNationalityActivationActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.util.constant.Citizenship;
import com.bpjstku.util.constant.RegistrationStatus;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.libraries.places.internal.zzpr;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.color.utilities.MaterialDynamicColors$$ExternalSyntheticLambda46;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.accessconfigureInstanceInternal;
import defpackage.calculateCameraUseCases;
import defpackage.createExtraPreview;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
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
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0015\u001a\u00020\u00178\u0015X\u0095D¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u001d"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/ChooseNationalityActivationActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityChooseNationalityBinding;", "<init>", "()V", "", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "a", "asInterface", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Landroid/widget/ArrayAdapter;", "", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChooseNationalityActivationActivity extends BindingReactiveFormActivity<ActivityChooseNationalityBinding> {
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f498a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final byte[] $$c = {110, -73, -111, 99};
    private static final int $$f = 144;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {83, ByteCompanionObject.MIN_VALUE, -37, -48, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 38;
    private static int d = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int asInterface = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentbindingInflater1 = R.layout.activity_choose_nationality_activation;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: access300
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChooseNationalityActivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d2, code lost:
    
        if (((java.lang.reflect.Field) defpackage.calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null) == (((1679164088 + (((~(1630265085 | r4)) | (~((-800277543) | r9))) * 1900)) + (((~(r4 | 800277542)) | (~(r9 | (-1630265086)))) * (-950))) + (((~(800277542 | r9)) | (~(r4 | (-1630265086)))) * 950))) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f8, code lost:
    
        if (((java.lang.reflect.Field) defpackage.calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null) == (((-1806733070) + (((~(r4 | 1063796487)) | 1082179800) * 529)) + (((~(1063796487 | r9)) | 1893784030) * 529))) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x011d, code lost:
    
        if (((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null) != (((-1261587043) + (((~(r9 | (-2116023763))) | 400112431) * 191)) + (((~(r4 | (-2116023763))) | 370749698) * 191))) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x011f, code lost:
    
        super.onResume();
        r8 = com.bpjstku.presentation.membership.accountactivation.ChooseNationalityActivationActivity.asInterface + 45;
        com.bpjstku.presentation.membership.accountactivation.ChooseNationalityActivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x012c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x012d, code lost:
    
        r8 = 628740688 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0136, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0137, code lost:
    
        r8 = (-494609076) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0140, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(java.lang.Object[] r8, int r9, int r10, int r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.ChooseNationalityActivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(java.lang.Object[], int, int, int, int, int, int):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r0 = com.bpjstku.presentation.membership.accountactivation.ChooseNationalityActivationActivity.$$a
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r6 = r7
            r4 = r8
            r3 = r2
            goto L28
        L13:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r4 = r0[r6]
            int r3 = r3 + 1
        L28:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            int r6 = r6 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.ChooseNationalityActivationActivity.c(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.accountactivation.ChooseNationalityActivationActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/ChooseNationalityActivationActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, ChooseNationalityActivationActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityChooseNationalityBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ChooseNationalityActivationActivity$bindingInflater$1 chooseNationalityActivationActivity$bindingInflater$1 = ChooseNationalityActivationActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return chooseNationalityActivationActivity$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = this.TuitionPaymentFragmentbindingInflater1;
        int i6 = i3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        ChooseNationalityActivationActivity chooseNationalityActivationActivity = this;
        Intrinsics.checkNotNullParameter(chooseNationalityActivationActivity, "");
        chooseNationalityActivationActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) INotificationSideChannelStub().layoutToolbar.toolbar, true);
        INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText(getString(R.string.label_string_null));
        int i4 = asInterface + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: ActionMenuPresenter
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseNationalityActivationActivity.TuitionPaymentFragmentbindingInflater1(this.b, (View) obj);
            }
        }));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ((ArrayAdapter) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).addAll(CollectionsKt.mutableListOf("Warga Negara Indonesia"));
        INotificationSideChannelStub().actvChooseNationality.setAdapter((ArrayAdapter) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            MaterialButton materialButton = INotificationSideChannelStub().btnNext;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(false);
        } else {
            MaterialButton materialButton3 = INotificationSideChannelStub().btnNext;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(false);
        }
        int i3 = asInterface + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        ChooseNationalityActivationActivity chooseNationalityActivationActivity = (ChooseNationalityActivationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = chooseNationalityActivationActivity.INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        asInterface = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int i = 2 % 2;
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilChooseNationality;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        int i2 = asInterface + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        asInterface = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i3 = asInterface + 7;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                int i4 = i3 % 2;
                onBackPressed();
                int i5 = asInterface + 91;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                int i6 = i5 % 2;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrB$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 1032;
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 15;
            byte b = $$a[7];
            short s = b;
            Object[] objArr2 = new Object[1];
            c(b, s, (byte) (s | 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iLastIndexOf, iIndexOf, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{0, 22, 0, 10}, false, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{22, 15, 87, 0}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
            int iIndexOf2 = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int windowTouchSlop = 15 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            byte b2 = $$a[7];
            short s2 = (short) (b2 | 52);
            Object[] objArr5 = new Object[1];
            c(b2, s2, (byte) s2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, iIndexOf2, windowTouchSlop, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = asInterface + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int i4 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1031;
                int gidForName = 14 - Process.getGidForName("");
                byte[] bArr = $$a;
                Object[] objArr6 = new Object[1];
                c(bArr[132], (short) 104, bArr[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, i4, gidForName, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i7 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            int i8 = ~(1010235152 | i7);
            int i9 = 1117932529 + ((i8 | (-765954983)) * 764) + (((~(i7 | (-765954983))) | 740721408) * (-1528)) + (((-294747319) | i8) * 764) + 161286501;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new int[]{37, 16, 0, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new int[]{53, 16, 54, 15}, false, new byte[]{0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {2058621798};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46086 - AndroidCharacter.getMirror('0')), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1135, 17 - TextUtils.lastIndexOf("", '0', 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 161286501, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int iLastIndexOf2 = 1030 - TextUtils.lastIndexOf("", '0');
                    int i12 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    byte b3 = $$a[7];
                    short s3 = b3;
                    Object[] objArr12 = new Object[1];
                    c(b3, s3, (byte) (s3 | 52), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iLastIndexOf2, i12, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getLongPressTimeout() >> 16)), 1117 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.getCapsMode("", 0, 0) + 17), Boolean.TYPE});
                }
                Object[] objArr13 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c2 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int defaultSize = View.getDefaultSize(0, 0) + 1031;
                    int iArgb = 15 - Color.argb(0, 0, 0, 0);
                    byte[] bArr2 = $$a;
                    Object[] objArr14 = new Object[1];
                    c(bArr2[132], (short) 104, bArr2[7], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, defaultSize, iArgb, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new int[]{0, 22, 0, 10}, false, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1}, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new int[]{22, 15, 87, 0}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1031;
                        int doubleTapTimeout = 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte b4 = $$a[7];
                        short s4 = (short) (b4 | 52);
                        Object[] objArr17 = new Object[1];
                        c(b4, s4, (byte) s4, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(bitsPerPixel, absoluteGravity, doubleTapTimeout, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iArgb2 = Color.argb(0, 0, 0, 0) + 1031;
                        int iRgb = (-16777201) - Color.rgb(0, 0, 0);
                        byte b5 = $$a[7];
                        short s5 = b5;
                        Object[] objArr18 = new Object[1];
                        c(b5, s5, (byte) (s5 | 52), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(longPressTimeout, iArgb2, iRgb, 1357589585, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr13;
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[3])[0];
            int i17 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i18 = ~iIdentityHashCode;
            int i19 = i15 + 1810138045 + ((869662587 | iIdentityHashCode) * (-676)) + (((~(844420731 | i18)) | (-869662588)) * 676) + (((~(iIdentityHashCode | (-25241857))) | (~(i18 | 600140561)) | 269522026) * 676);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr19[2])[0] = i21 ^ (i21 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
                asInterface = i22 % 128;
                int i23 = i22 % 2;
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            Object[] objArr20 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr[2])[0];
            int i25 = ((int[]) objArr[3])[0];
            int i26 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iMyTid = Process.myTid();
            int i27 = i24 + 20223097 + (((~(579695368 | iMyTid)) | (-823975539)) * (-964)) + (((~((~iMyTid) | 579695368)) | (-865992571)) * (-964));
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr20[2])[0] = i29 ^ (i29 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char maximumFlingVelocity2 = (char) (29944 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
            int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1755;
            int packedPositionType = 23 - ExpandableListView.getPackedPositionType(0L);
            byte[] bArr3 = $$a;
            byte b6 = bArr3[7];
            Object[] objArr21 = new Object[1];
            c(b6, (short) (b6 | 104), (byte) (-bArr3[2]), objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(maximumFlingVelocity2, windowTouchSlop2, packedPositionType, 986134021, false, (String) objArr21[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char maximumFlingVelocity3 = (char) (29944 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                int iRed = Color.red(0) + 1755;
                int jumpTapTimeout = 23 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                byte b7 = $$a[7];
                short s6 = (short) (b7 | 52);
                Object[] objArr22 = new Object[1];
                c(b7, s6, (byte) s6, objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(maximumFlingVelocity3, iRed, jumpTapTimeout, 1599039318, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrB$5f1425da = new Object[]{new int[]{((int[]) objArr23[0])[0]}, new int[]{((int[]) objArr23[1])[0]}, (Object[]) objArr23[2], new int[1], (String[]) objArr23[4]};
            int i30 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1012011645;
            int i31 = 1564494043 + (((-232001099) | i30) * 614);
            int i32 = ~i30;
            int i33 = i31 + (((~((-527105747) | i32)) | 304803984 | (~((-314503321) | i32))) * (-1228)) + (((~(i32 | (-9699337))) | (~((-222301763) | i32))) * 614) + 1159756796;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i35 ^ (i35 << 5);
        } else {
            Object[] objArr24 = new Object[1];
            e(new int[]{37, 16, 0, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr24);
            Class<?> cls4 = Class.forName((String) objArr24[0]);
            Object[] objArr25 = new Object[1];
            e(new int[]{53, 16, 54, 15}, false, new byte[]{0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0}, objArr25);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr25[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr26 = {2058621798};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 42049), AndroidCharacter.getMirror('0') + 1678, TextUtils.indexOf((CharSequence) "", '0', 0) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$5f1425da = PMIRegistrationDataStore$$ExternalSyntheticLambda7.b$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr26), 1159756796);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cMyTid = (char) (29944 - (Process.myTid() >> 22));
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1755;
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 23;
                byte b8 = $$a[7];
                short s7 = (short) (b8 | 52);
                Object[] objArr27 = new Object[1];
                c(b8, s7, (byte) s7, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cMyTid, iKeyCodeFromString, pressedStateDuration, 1599039318, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$5f1425da);
            try {
                Object[] objArr28 = new Object[1];
                e(new int[]{0, 22, 0, 10}, false, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1}, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(new int[]{22, 15, 87, 0}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0'));
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1755;
                    int i36 = 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte b9 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    c(b9, (short) (b9 | 141), (byte) 52, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cLastIndexOf, offsetBefore, i36, 1596667560, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cIndexOf2 = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int i37 = 1756 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23;
                    byte[] bArr4 = $$a;
                    byte b10 = bArr4[7];
                    Object[] objArr31 = new Object[1];
                    c(b10, (short) (b10 | 104), (byte) (-bArr4[2]), objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf2, i37, doubleTapTimeout2, 986134021, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i38 = ((int[]) objArrB$5f1425da[1])[0];
        int i39 = ((int[]) objArrB$5f1425da[0])[0];
        if (i39 != i38) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrB$5f1425da[4];
            if (strArr5 != null) {
                for (String str2 : strArr5) {
                    arrayList2.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i39));
        }
        int i40 = asInterface + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i40 % 128;
        int i41 = i40 % 2;
        int i42 = ((int[]) objArrB$5f1425da[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArrB$5f1425da[0])[0]}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
        int i43 = ~Process.myTid();
        int i44 = i42 + 525759993 + (((~(i43 | 574026658)) | 361235528) * (-160)) + (((~(i43 | 361424232)) | 574026658) * 160);
        int i45 = (i44 << 13) ^ i44;
        int i46 = i45 ^ (i45 >>> 17);
        ((int[]) objArr32[3])[0] = i46 ^ (i46 << 5);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:77:0x02be  */
    /* JADX WARN: Code duplicated, block: B:92:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x02ac -> B:76:0x02bb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int[] r26, boolean r27, byte[] r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.ChooseNationalityActivationActivity.e(int[], boolean, byte[], java.lang.Object[]):void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[1]).getInt(null);
            int iMyPid = Process.myPid();
            if (i3 != 1305086636 + (((~(1271543218 | iMyPid)) | (-441555676)) * (-964)) + (((~((~iMyPid) | 1271543218)) | (-1541128188)) * (-964))) {
                throw null;
            }
        } else {
            int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            if (i4 != (-1174391866) + (((~(1642117572 | iMaxMemory)) | 812130029) * (-366)) + (((~(iMaxMemory | 1911078893)) | 543168708) * 366)) {
                throw null;
            }
        }
        int i5 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i6 = ~Process.myUid();
        if (i5 != 1869146940 + (((~(i6 | 2510434)) | 1716060421) * (-160)) + (((~(i6 | 1718421765)) | 2510434) * 160)) {
            int[] iArr = new int[128710285];
            iArr[128710284] = 1;
            int i7 = (-64662756) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
        }
        super.onStart();
        int i10 = asInterface + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
        int i11 = i10 % 2;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -884799971
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.ChooseNationalityActivationActivity.onCreate(android.os.Bundle):void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        Editable text;
        Citizenship citizenship;
        ChooseNationalityActivationActivity chooseNationalityActivationActivity = (ChooseNationalityActivationActivity) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[1], "");
        ChooseNationalityActivationActivity chooseNationalityActivationActivity2 = chooseNationalityActivationActivity;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_register_account", "register_account_choose_nationality"));
        Intrinsics.checkNotNullParameter(chooseNationalityActivationActivity2, "");
        Intrinsics.checkNotNullParameter("register_account_choose_nationality", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("register_account_choose_nationality", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("register_account_choose_nationality", mapMutableMapOf);
        RegisteredMemberRegistration registeredMemberRegistration = new RegisteredMemberRegistration(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
        EditText editText = chooseNationalityActivationActivity.INotificationSideChannelStub().tilChooseNationality.getEditText();
        if (editText != null) {
            text = editText.getText();
        } else {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            text = null;
        }
        if (StringsKt.equals(String.valueOf(text), "Warga Negara Indonesia", true)) {
            int i4 = asInterface + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                citizenship = Citizenship.WNI;
                int i5 = 79 / 0;
            } else {
                citizenship = Citizenship.WNI;
            }
        } else {
            citizenship = Citizenship.WNA;
        }
        RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, citizenship, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388599);
        Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_event_register_account", "register_account_already_registered"));
        Intrinsics.checkNotNullParameter(chooseNationalityActivationActivity2, "");
        Intrinsics.checkNotNullParameter("register_account_already_registered", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
        TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("register_account_already_registered", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("register_account_already_registered", mapMutableMapOf2);
        ChooseMembershipActivationActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = ChooseMembershipActivationActivity.INSTANCE;
        ChooseMembershipActivationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(chooseNationalityActivationActivity, RegistrationStatus.REGISTERED, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ ArrayAdapter TuitionPaymentFragmentspecialinlinedviewModeldefault1(ChooseNationalityActivationActivity chooseNationalityActivationActivity) {
        int i = 2 % 2;
        ArrayAdapter arrayAdapter = new ArrayAdapter(chooseNationalityActivationActivity, R.layout.support_simple_spinner_dropdown_item);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return arrayAdapter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ChooseNationalityActivationActivity chooseNationalityActivationActivity, View view) {
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{chooseNationalityActivationActivity, view}, 698048618, zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -698048616, zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    static {
        f498a = 1;
        g();
        INSTANCE = new Companion(null);
        int i = d + 39;
        f498a = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{this}, -2015825808, zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 2015825808, zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{this}, -259357838, 1136917189 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_bill_transfer).substring(0, 12).codePointAt(6), MaterialDynamicColors$$ExternalSyntheticLambda46.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 259357839, MaterialDynamicColors$$ExternalSyntheticLambda46.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new char[]{59703, 59773, 59768, 59751, 59746, 59731, 59740, 59750, 59746, 59756, 59757, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59717, 59770, 59739, 59723, 59733, 59851, 59849, 59854, 59852, 59830, 59825, 59833, 59833, 59824, 59848, 59843, 59828, 59830, 59828, 59709, 59746, 59751, 59768, 59773, 59757, 59723, 59713, 59745, 59756, 59757, 59718, 59724, 59744, 59744, 59758, 59718, 59793, 59796, 59820, 59823, 59823, 59815, 59805, 59777, 59819, 59816, 59776, 59780, 59796, 59793, 59798};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, byte r7, byte r8) {
        /*
            int r6 = r6 + 99
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r0 = com.bpjstku.presentation.membership.accountactivation.ChooseNationalityActivationActivity.$$c
            int r8 = r8 * 4
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r7 = r7 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.ChooseNationalityActivationActivity.$$i(int, byte, byte):java.lang.String");
    }
}
