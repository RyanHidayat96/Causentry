package com.bpjstku.presentation.bsu;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.bsu.model.request.DataKantor;
import com.bpjstku.data.bsu.model.request.DataPekerja;
import com.bpjstku.data.bsu.model.request.DataRekening;
import com.bpjstku.data.bsu.model.request.UpdateRekeningBsuRequest;
import com.bpjstku.data.bsu.model.response.DataAccountBalanceEmployee;
import com.bpjstku.data.bsu.model.response.DataEmployee;
import com.bpjstku.data.bsu.model.response.DataEmployeeOffice;
import com.bpjstku.data.bsu.remote.UpdateRekeningBsuResponse;
import com.bpjstku.databinding.ActivityCheckEligibleBsuResultBinding;
import com.bpjstku.presentation.bsu.CheckEligibleBsuResultActivity;
import com.bpjstku.presentation.bsu.model.BankStatus;
import com.bpjstku.presentation.bsu.model.CheckEligibleResult;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerPasswordFragment$special$$inlined$viewModel$default$1;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.textfield.TextInputLayout;
import com.midtrans.sdk.corekit.core.Constants;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.dispatchOnCreate;
import defpackage.generateCameraId;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.jumpToCurrentState;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0011\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0015\u0010\u0018\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0015\u0010\t\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014"}, d2 = {"Lcom/bpjstku/presentation/bsu/CheckEligibleBsuResultActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityCheckEligibleBsuResultBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "cancelAll", "asBinder", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lcom/bpjstku/presentation/bsu/model/CheckEligibleResult;", "Lkotlin/Lazy;", "LgetStringOrNull;", "LgetStringOrNull;", "LjumpToCurrentState;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LdispatchOnCreate;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CheckEligibleBsuResultActivity extends BindingBaseActivity<ActivityCheckEligibleBsuResultBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int[] f473a;
    private static int d;
    public getStringOrNull TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {74, 60, 122, -26};
    private static final int $$f = 110;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {117, 50, 102, 124, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 2;
    private static int g = 0;
    private static int asInterface = 0;
    private static int asBinder = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: AnimatedStateListDrawableCompat
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CheckEligibleBsuResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: inflateChildElements
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CheckEligibleBsuResultActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy asInterface = LazyKt.lazy(new CheckEligibleBsuResultActivity$special$$inlined$viewModel$default$1(this));

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        String nomorRekening;
        String namaRekening;
        int i7 = ~i;
        int i8 = ~(i7 | i5);
        int i9 = ~i5;
        int i10 = ~((~i4) | i9);
        int i11 = ~(i9 | i);
        int i12 = i10 | i11;
        int i13 = (~(i4 | i7)) | i11 | i8;
        int i14 = i5 + i + i2 + ((-168536539) * i6) + (1787681333 * i3);
        int i15 = i14 * i14;
        int i16 = ((-1349843359) * i5) + 1460535296 + ((-923239215) * i) + ((-1716058528) * i8) + (i12 * (-1289454384)) + ((-1289454384) * i13) + (366215168 * i2) + (1604583424 * i6) + (216268800 * i3) + (1778253824 * i15);
        int i17 = (i5 * (-925914073)) + 175428941 + (i * (-925912777)) + (i8 * (-864)) + (i12 * 432) + (i13 * 432) + (i2 * (-925913209)) + (i6 * 1252505731) + (i3 * 30625011) + (i15 * (-2030960640));
        int i18 = i16 + (i17 * i17 * 899809280);
        if (i18 == 1) {
            final CheckEligibleBsuResultActivity checkEligibleBsuResultActivity = (CheckEligibleBsuResultActivity) objArr[0];
            int i19 = 2 % 2;
            MutableLiveData<VirtualCameraAdapter1<UpdateRekeningBsuResponse>> mutableLiveData = ((dispatchOnCreate) checkEligibleBsuResultActivity.asInterface.getValue()).b;
            new Observer() { // from class: getColorStateList
                @Override // androidx.p002lifecycle.Observer
                public final void onChanged(Object obj) {
                    CheckEligibleBsuResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
                }
            };
            throw null;
        }
        if (i18 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i18 != 3) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        CheckEligibleBsuResultActivity checkEligibleBsuResultActivity2 = (CheckEligibleBsuResultActivity) objArr[0];
        int i20 = 2 % 2;
        ActivityCheckEligibleBsuResultBinding activityCheckEligibleBsuResultBinding = (ActivityCheckEligibleBsuResultBinding) ((ViewBinding) checkEligibleBsuResultActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityCheckEligibleBsuResultBinding.tvStatusEligible.setText(((CheckEligibleResult) checkEligibleBsuResultActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1);
        String str = ((CheckEligibleResult) checkEligibleBsuResultActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b;
        if (Intrinsics.areEqual(str, "0")) {
            activityCheckEligibleBsuResultBinding.imgCheckEligibleResult.setImageResource(R.drawable.ic_success);
            activityCheckEligibleBsuResultBinding.tvInstructionUpdateRekening.setVisibility(0);
            activityCheckEligibleBsuResultBinding.tvInstructionUpdateRekening.setText("Silakan kunjungi portal bsu.bpjsketenagakerjaan.go.id untuk informasi lebih lanjut");
            checkEligibleBsuResultActivity2.cancelAll();
            activityCheckEligibleBsuResultBinding.btnOk.setText("Ok");
            return null;
        }
        if (!Intrinsics.areEqual(str, "1")) {
            activityCheckEligibleBsuResultBinding.imgCheckEligibleResult.setImageResource(R.drawable.ic_failed);
            activityCheckEligibleBsuResultBinding.tvInstructionUpdateRekening.setVisibility(0);
            activityCheckEligibleBsuResultBinding.tvInstructionUpdateRekening.setText("Silakan kunjungi portal bsu.bpjsketenagakerjaan.go.id untuk informasi lebih lanjut");
            checkEligibleBsuResultActivity2.cancelAll();
            activityCheckEligibleBsuResultBinding.btnOk.setText("Ok");
            int i21 = asInterface + 59;
            asBinder = i21 % 128;
            int i22 = i21 % 2;
            return null;
        }
        int i23 = asBinder + 105;
        asInterface = i23 % 128;
        int i24 = i23 % 2;
        activityCheckEligibleBsuResultBinding.imgCheckEligibleResult.setImageResource(R.drawable.ic_success);
        activityCheckEligibleBsuResultBinding.tvInstructionUpdateRekening.setVisibility(0);
        ActivityCheckEligibleBsuResultBinding activityCheckEligibleBsuResultBinding2 = (ActivityCheckEligibleBsuResultBinding) ((ViewBinding) checkEligibleBsuResultActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityCheckEligibleBsuResultBinding2.tilBankAccountName.setVisibility(0);
        activityCheckEligibleBsuResultBinding2.tilBankAccountNumber.setVisibility(0);
        activityCheckEligibleBsuResultBinding2.tilBankName.setVisibility(0);
        ActivityCheckEligibleBsuResultBinding activityCheckEligibleBsuResultBinding3 = (ActivityCheckEligibleBsuResultBinding) ((ViewBinding) checkEligibleBsuResultActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        EditText editText = activityCheckEligibleBsuResultBinding3.tilBankName.getEditText();
        if (editText != null) {
            DataAccountBalanceEmployee dataAccountBalanceEmployeeB = ((CheckEligibleResult) checkEligibleBsuResultActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b();
            editText.setText(String.valueOf(dataAccountBalanceEmployeeB != null ? dataAccountBalanceEmployeeB.getNamaBank() : null));
        }
        EditText editText2 = activityCheckEligibleBsuResultBinding3.tilBankAccountName.getEditText();
        if (editText2 != null) {
            DataAccountBalanceEmployee dataAccountBalanceEmployeeB2 = ((CheckEligibleResult) checkEligibleBsuResultActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b();
            if (dataAccountBalanceEmployeeB2 != null) {
                int i25 = asBinder + 59;
                asInterface = i25 % 128;
                int i26 = i25 % 2;
                namaRekening = dataAccountBalanceEmployeeB2.getNamaRekening();
            } else {
                namaRekening = null;
            }
            editText2.setText(String.valueOf(namaRekening));
        }
        EditText editText3 = activityCheckEligibleBsuResultBinding3.tilBankAccountNumber.getEditText();
        if (editText3 != null) {
            int i27 = asInterface + 17;
            asBinder = i27 % 128;
            int i28 = i27 % 2;
            DataAccountBalanceEmployee dataAccountBalanceEmployeeB3 = ((CheckEligibleResult) checkEligibleBsuResultActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b();
            if (dataAccountBalanceEmployeeB3 != null) {
                nomorRekening = dataAccountBalanceEmployeeB3.getNomorRekening();
                int i29 = asBinder + 99;
                asInterface = i29 % 128;
                int i30 = i29 % 2;
            } else {
                nomorRekening = null;
            }
            editText3.setText(String.valueOf(nomorRekening));
        }
        ActivityCheckEligibleBsuResultBinding activityCheckEligibleBsuResultBinding4 = (ActivityCheckEligibleBsuResultBinding) ((ViewBinding) checkEligibleBsuResultActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        TextInputLayout textInputLayout = activityCheckEligibleBsuResultBinding4.tilBankName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        TextInputLayout textInputLayout2 = textInputLayout;
        Intrinsics.checkNotNullParameter(textInputLayout2, "");
        textInputLayout2.setEnabled(true);
        TextInputLayout textInputLayout3 = activityCheckEligibleBsuResultBinding4.tilBankAccountName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        TextInputLayout textInputLayout4 = textInputLayout3;
        Intrinsics.checkNotNullParameter(textInputLayout4, "");
        textInputLayout4.setEnabled(true);
        TextInputLayout textInputLayout5 = activityCheckEligibleBsuResultBinding4.tilBankAccountNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout5, "");
        TextInputLayout textInputLayout6 = textInputLayout5;
        Intrinsics.checkNotNullParameter(textInputLayout6, "");
        textInputLayout6.setEnabled(true);
        activityCheckEligibleBsuResultBinding.btnOk.setText("Simpan");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.bsu.CheckEligibleBsuResultActivity.$$a
            int r5 = r5 * 14
            int r5 = r5 + 84
            int r7 = r7 + 4
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r5 = r7
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
        L27:
            int r7 = r7 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.bsu.CheckEligibleBsuResultActivity.c(int, short, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.bsu.CheckEligibleBsuResultActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/bsu/CheckEligibleBsuResultActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/bsu/model/CheckEligibleResult;", "p1", "", "b", "(Landroid/content/Context;Lcom/bpjstku/presentation/bsu/model/CheckEligibleResult;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0, CheckEligibleResult p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) CheckEligibleBsuResultActivity.class);
            intent.putExtra("check_eligible_result", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityCheckEligibleBsuResultBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        CheckEligibleBsuResultActivity$bindingInflater$1 checkEligibleBsuResultActivity$bindingInflater$1 = CheckEligibleBsuResultActivity$bindingInflater$1.b;
        int i4 = asInterface + 11;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return checkEligibleBsuResultActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ((ActivityCheckEligibleBsuResultBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilBankName.getEditText();
            obj.hashCode();
            throw null;
        }
        final ActivityCheckEligibleBsuResultBinding activityCheckEligibleBsuResultBinding = (ActivityCheckEligibleBsuResultBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        EditText editText = activityCheckEligibleBsuResultBinding.tilBankName.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: addTransition
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CheckEligibleBsuResultActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, view);
                }
            });
        }
        Button button = activityCheckEligibleBsuResultBinding.btnOk;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: selectTransition
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return CheckEligibleBsuResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, activityCheckEligibleBsuResultBinding, (View) obj2);
            }
        }));
        int i3 = asInterface + 117;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f473a;
        int i4 = -1870535734;
        char c = '0';
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 13;
                $10 = i8 % 128;
                if (i8 % i2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i6] = Integer.valueOf(iArr2[i7]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) i6;
                            byte b2 = b;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", c) + 1), 3290 - TextUtils.lastIndexOf("", c, i6, i6), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 30, 1948206109, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.resolveSizeAndState(0, 0, 0), 3291 - ExpandableListView.getPackedPositionType(0L), Process.getGidForName("") + 32, 1948206109, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i7++;
                }
                i2 = 2;
                i4 = -1870535734;
                c = '0';
                i6 = 0;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f473a;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                int i10 = $11 + 19;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    Object[] objArr4 = new Object[i5];
                    objArr4[0] = Integer.valueOf(iArr5[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ('0' - AndroidCharacter.getMirror('0')), Color.blue(0) + 3291, View.combineMeasuredStates(0, 0) + 31, 1948206109, false, $$i(b5, b6, b6), new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                } else {
                    length3 = length3;
                    Object[] objArr5 = {Integer.valueOf(iArr5[i9])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), Color.green(0) + 3291, TextUtils.lastIndexOf("", '0', 0) + 32, 1948206109, false, $$i(b7, b8, b8), new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    i9++;
                }
                int i11 = $10 + 105;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                length3 = length3;
                i5 = 1;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i13 = $10 + 89;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i15 = 17;
            for (int i16 = 1; i15 > i16; i16 = 1) {
                int i17 = $10 + 23;
                $11 = i17 % 128;
                if (i17 % 2 == 0) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                    Object[] objArr6 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) Color.blue(0), Color.green(0) + 2559, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 28, 683220507, false, $$i(b9, b10, (byte) (b10 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i15 += 120;
                } else {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                    Object[] objArr7 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 2559 - ExpandableListView.getPackedPositionGroup(0L), 30 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 683220507, false, $$i(b11, b12, (byte) (b12 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                    i15--;
                }
            }
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr8 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (28879 - TextUtils.getOffsetBefore("", 0)), 348 - Color.argb(0, 0, 0, 0), 24 - TextUtils.lastIndexOf("", '0', 0, 0), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8)).intValue()];
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

    private void cancelAll() {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            ActivityCheckEligibleBsuResultBinding activityCheckEligibleBsuResultBinding = (ActivityCheckEligibleBsuResultBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
            activityCheckEligibleBsuResultBinding.tilBankAccountName.setVisibility(23);
            activityCheckEligibleBsuResultBinding.tilBankAccountNumber.setVisibility(101);
            activityCheckEligibleBsuResultBinding.tilBankName.setVisibility(86);
            return;
        }
        ActivityCheckEligibleBsuResultBinding activityCheckEligibleBsuResultBinding2 = (ActivityCheckEligibleBsuResultBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityCheckEligibleBsuResultBinding2.tilBankAccountName.setVisibility(8);
        activityCheckEligibleBsuResultBinding2.tilBankAccountNumber.setVisibility(8);
        activityCheckEligibleBsuResultBinding2.tilBankName.setVisibility(8);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ((ActivityCheckEligibleBsuResultBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText("Bantuan Subsidi Upah");
            obj.hashCode();
            throw null;
        }
        ((ActivityCheckEligibleBsuResultBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText("Bantuan Subsidi Upah");
        int i3 = asInterface + 17;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = asInterface + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cGreen = (char) (29944 - Color.green(0));
            int iIndexOf = 1755 - TextUtils.indexOf("", "", 0);
            int i4 = 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            byte b = $$a[7];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            c(b2, (byte) (b2 | 15), b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, iIndexOf, i4, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29944);
                int iResolveSize = View.resolveSize(0, 0) + 1755;
                int size = 23 - View.MeasureSpec.getSize(0);
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr3 = new Object[1];
                c(b3, b4, (short) (b4 | 37), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iResolveSize, size, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i5 = ~System.identityHashCode(this);
            int i6 = (((~((-604977682) | i5)) | 537661440) * (-241)) + 1740534929 + (((~(i5 | (-67316242))) | (-930036696)) * 241) + 132862597;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new int[]{-377637655, -158175824, -521123344, 350599708, -935173226, 1515664685, 2076467883, -1554573048, 972920741, -1769168905}, Gravity.getAbsoluteGravity(0, 0) + 16, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new int[]{1249939231, -1832077260, 1445319418, -665979526, -1411458517, 959374205, -1173432337, -1342483243, -1554940043, 662490818}, 17 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-1947892879};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.resolveSize(0, 0) + 42049), 1726 - View.resolveSize(0, 0), View.MeasureSpec.getMode(0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 132862597, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char keyRepeatTimeout = (char) (29944 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int i9 = 1756 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int iArgb = Color.argb(0, 0, 0, 0) + 23;
                    byte b5 = $$a[7];
                    byte b6 = b5;
                    Object[] objArr8 = new Object[1];
                    c(b5, b6, (short) (b6 | 37), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatTimeout, i9, iArgb, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new int[]{1466523555, 392488302, -250509101, 960341562, 600527622, 1182984839, -610277286, 849260645, -912119742, -2029869549, 2027363159, -1306569866, -1313937414, 2101441017}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.copied_company_code).substring(1, 2).codePointAt(0) - 89, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new int[]{-1398162018, -552819795, 758931519, -1244711193, -860199459, 7151300, 1835504001, 720191122, 1458419055, 1265712223}, TextUtils.getOffsetBefore("", 0) + 15, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cResolveOpacity = (char) (29944 - Drawable.resolveOpacity(0, 0));
                        int mode = 1755 - View.MeasureSpec.getMode(0);
                        int jumpTapTimeout = 23 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        byte b7 = $$a[7];
                        byte b8 = b7;
                        Object[] objArr11 = new Object[1];
                        c(b7, b8, (short) (b8 | 89), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveOpacity, mode, jumpTapTimeout, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) (29945 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1755;
                        int i10 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22;
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr12 = new Object[1];
                        c(b10, (byte) (b10 | 15), b9, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iResolveSizeAndState, i10, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i12 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i12 == i11) {
            int i13 = asInterface + 93;
            asBinder = i13 % 128;
            int i14 = i13 % 2;
            int i15 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int i16 = ~((~System.identityHashCode(this)) | (-638532362));
            int i17 = i15 + (((-918518604) | i16) * (-970)) + 1599039021 + ((i16 | 279986242) * 970);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr13[3])[0] = i19 ^ (i19 << 5);
            int i20 = asBinder + 25;
            asInterface = i20 % 128;
            int i21 = i20 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr != null) {
                int i22 = asInterface + 65;
                asBinder = i22 % 128;
                int i23 = i22 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i12];
            int i24 = i12 - 1;
            iArr[i24] = 1;
            Toast.makeText((Context) null, iArr[((i12 * i24) % 2) - 1], 1).show();
            int i25 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.xl_instruction_step5).substring(3, 4).codePointAt(0) - 1731621120;
            int i26 = ~iCodePointAt;
            int i27 = i25 + 1481630657 + (((~((-177399040) | i26)) | (~((-35203387) | iCodePointAt))) * 217) + (((~(iCodePointAt | (-177399040))) | 34611258) * 217) + (((~((-35203387) | i26)) | 177399039) * 217);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr14[3])[0] = i29 ^ (i29 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c3 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i30 = 1031 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0');
            byte b11 = $$a[7];
            byte b12 = b11;
            Object[] objArr15 = new Object[1];
            c(b11, b12, (short) (b12 | 141), objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, i30, iLastIndexOf, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new int[]{1466523555, 392488302, -250509101, 960341562, 600527622, 1182984839, -610277286, 849260645, -912119742, -2029869549, 2027363159, -1306569866, -1313937414, 2101441017}, 22 - TextUtils.getTrimmedLength(""), objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new int[]{-1398162018, -552819795, 758931519, -1244711193, -860199459, 7151300, 1835504001, 720191122, 1458419055, 1265712223}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1031;
            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 16;
            byte b13 = $$a[7];
            byte b14 = b13;
            Object[] objArr18 = new Object[1];
            c(b13, b14, (short) (b14 | 37), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(scrollDefaultDelay, minimumFlingVelocity, iLastIndexOf2, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                int maximumDrawingCacheSize = 1031 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int iResolveOpacity = 15 - Drawable.resolveOpacity(0, 0);
                Object[] objArr19 = new Object[1];
                c($$a[28], (byte) 52, (short) 193, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(mirror, maximumDrawingCacheSize, iResolveOpacity, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i31 = ((int[]) objArr20[3])[0];
            int i32 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int i33 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1612096571;
            int i34 = (((((~((-134479873) | i33)) | 109711465) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 1836495380) + ((~((~i33) | (-134479873))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) - 1306034929;
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr[2])[0] = i36 ^ (i36 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new int[]{-377637655, -158175824, -521123344, 350599708, -935173226, 1515664685, 2076467883, -1554573048, 972920741, -1769168905}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 30, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new int[]{1249939231, -1832077260, 1445319418, -665979526, -1411458517, 959374205, -1173432337, -1342483243, -1554940043, 662490818}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_atm_bni).substring(0, 7).codePointAt(2) - 61, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-1947892879};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 1134, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -1306034929, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                int scrollBarSize = 1031 - (ViewConfiguration.getScrollBarSize() >> 8);
                int i37 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15;
                byte b15 = $$a[7];
                byte b16 = b15;
                Object[] objArr25 = new Object[1];
                c(b15, b16, (short) (b16 | 141), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(packedPositionChild, scrollBarSize, i37, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (MotionEvent.axisFromString("") + 45994), 1117 - TextUtils.indexOf("", ""), ExpandableListView.getPackedPositionChild(0L) + 18), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c4 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                int i38 = 1031 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int deadChar = KeyEvent.getDeadChar(0, 0) + 15;
                Object[] objArr26 = new Object[1];
                c($$a[28], (byte) 52, (short) 193, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c4, i38, deadChar, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(new int[]{1466523555, 392488302, -250509101, 960341562, 600527622, 1182984839, -610277286, 849260645, -912119742, -2029869549, 2027363159, -1306569866, -1313937414, 2101441017}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_encryption_error_json_object).substring(0, 41).length() - 19, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new int[]{-1398162018, -552819795, 758931519, -1244711193, -860199459, 7151300, 1835504001, 720191122, 1458419055, 1265712223}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_challenge_token).substring(0, 15).length(), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c5 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int size2 = 1031 - View.MeasureSpec.getSize(0);
                    int i39 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                    byte b17 = $$a[7];
                    byte b18 = b17;
                    Object[] objArr29 = new Object[1];
                    c(b17, b18, (short) (b18 | 37), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c5, size2, i39, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
                    int iGreen = Color.green(0) + 15;
                    byte b19 = $$a[7];
                    byte b20 = b19;
                    Object[] objArr30 = new Object[1];
                    c(b19, b20, (short) (b20 | 141), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(scrollBarSize2, doubleTapTimeout, iGreen, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i40 = ((int[]) objArr[1])[0];
        int i41 = ((int[]) objArr[3])[0];
        if (i41 == i40) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i42 = ((int[]) objArr[2])[0];
            int i43 = ((int[]) objArr[3])[0];
            int i44 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i45 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i46 = (~((-87657258) | i45)) | 17924096;
            int i47 = i42 + (-659599367) + (i46 * 992) + ((i46 | (~((~i45) | 226356073))) * (-496)) + ((i45 | 156622912) * 496);
            int i48 = (i47 << 13) ^ i47;
            int i49 = i48 ^ (i48 >>> 17);
            ((int[]) objArr31[2])[0] = i49 ^ (i49 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str2 : strArr4) {
                arrayList2.add(str2);
            }
        }
        Toast.makeText((Context) null, i41 / (((i41 - 1) * i41) % 2), 0).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i50 = ((int[]) objArr[2])[0];
        int i51 = ((int[]) objArr[3])[0];
        int i52 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i53 = i50 + (((~(107716113 | iIdentityHashCode)) | (-311465835)) * 398) + 138676561 + (((~((~iIdentityHashCode) | 107716113)) | (-311465835)) * 398);
        int i54 = i53 ^ (i53 << 13);
        int i55 = i54 ^ (i54 >>> 17);
        ((int[]) objArr32[2])[0] = i55 ^ (i55 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        if (i4 != 436818192 + (((~((-914623526) | i5)) | (-1744611069)) * 519) + (((~(i5 | (-646186021))) | (~((-1098425049) | iIdentityHashCode))) * (-519)) + (((~(iIdentityHashCode | (-1744611069))) | 914623525) * 519)) {
            throw null;
        }
        int i6 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i7 = ~(System.identityHashCode(this) | 1696177203);
        if (i6 != (((1090524178 | i7) * (-196)) - 1170445856) + ((i7 | 605653025) * 196)) {
            throw null;
        }
        super.onResume();
        int i8 = asInterface + 3;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -854525725
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.bsu.CheckEligibleBsuResultActivity.onStart():void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) throws IllegalAccessException {
        CheckEligibleBsuResultActivity checkEligibleBsuResultActivity = (CheckEligibleBsuResultActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i5 = ~startUptimeMillis;
        if (i4 != (-1587556291) + (((~(i5 | (-1143008063))) | 1140894488 | (~((-310906946) | startUptimeMillis))) * 717) + (((~(startUptimeMillis | (-1143008063))) | (~(i5 | (-310906946))) | 1140894488) * 717)) {
            throw new RuntimeException("-1296745895");
        }
        int i6 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i7 = ~((-893747184) | (~startElapsedRealtime));
        if (i6 != ((1077051392 | i7 | (~(893747183 | startElapsedRealtime))) * (-338)) + 1550206300 + (((~(startElapsedRealtime | 1970798575)) | i7) * 338)) {
            throw new RuntimeException("1252248188");
        }
        super.onCreate(bundle);
        int i8 = asBinder + 109;
        asInterface = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 91 / 0;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if ((r14 instanceof VirtualCameraAdapter1.asBinder) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        r14 = (VirtualCameraAdapter1.asBinder) r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (((com.bpjstku.data.bsu.remote.UpdateRekeningBsuResponse) r14.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getStatusCode() != 200) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        r1 = com.bpjstku.presentation.bsu.CheckEligibleBsuResultActivity.asBinder + 69;
        com.bpjstku.presentation.bsu.CheckEligibleBsuResultActivity.asInterface = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if ((r1 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.bpjstku.data.bsu.remote.UpdateRekeningBsuResponse) r14.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessageCode(), androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        r0 = defpackage.getStringOrNull.INSTANCE;
        r14 = defpackage.getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(com.bpjstku.R.drawable.ic_success, "Berhasil", ((com.bpjstku.data.bsu.remote.UpdateRekeningBsuResponse) r14.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage().toString(), "Ok", new defpackage.parseItem(r13), null, null);
        r13.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r14;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r14);
        r13 = r13.getSupportFragmentManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
    
        if (r13.findFragmentByTag(r14.g) != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        r14.show(r13, r14.g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        kotlin.jvm.internal.Intrinsics.areEqual(((com.bpjstku.data.bsu.remote.UpdateRekeningBsuResponse) r14.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessageCode(), androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D);
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
    
        if (((com.bpjstku.data.bsu.remote.UpdateRekeningBsuResponse) r14.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getStatusCode() != 200) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        r1 = com.bpjstku.presentation.bsu.CheckEligibleBsuResultActivity.asBinder + 105;
        com.bpjstku.presentation.bsu.CheckEligibleBsuResultActivity.asInterface = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
    
        if ((r1 % 2) == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
    
        r2 = 22 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c0, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.bpjstku.data.bsu.remote.UpdateRekeningBsuResponse) r14.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessageCode(), androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cf, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.bpjstku.data.bsu.remote.UpdateRekeningBsuResponse) r14.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessageCode(), androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d1, code lost:
    
        r1 = defpackage.getStringOrNull.INSTANCE;
        r14 = defpackage.getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(com.bpjstku.R.drawable.ic_asik_loading_send_data, "Berhasil", ((com.bpjstku.data.bsu.remote.UpdateRekeningBsuResponse) r14.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage().toString(), "Ok", new defpackage.createFromXmlInner(r13), null, null);
        r13.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r14;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r14);
        r13 = r13.getSupportFragmentManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0106, code lost:
    
        if (r13.findFragmentByTag(r14.g) != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0108, code lost:
    
        r14.show(r13, r14.g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010d, code lost:
    
        r13 = com.bpjstku.presentation.bsu.CheckEligibleBsuResultActivity.asBinder + 35;
        com.bpjstku.presentation.bsu.CheckEligibleBsuResultActivity.asInterface = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0116, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0117, code lost:
    
        r0 = defpackage.getStringOrNull.INSTANCE;
        r14 = defpackage.getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(com.bpjstku.R.drawable.ic_failed, "Gagal", ((com.bpjstku.data.bsu.remote.UpdateRekeningBsuResponse) r14.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage().toString(), "Ulangi", new defpackage.getDrawable(), "Kembali", new defpackage.updateStateFromTypedArray(r13));
        r13.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r14;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r14);
        r13 = r13.getSupportFragmentManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0151, code lost:
    
        if (r13.findFragmentByTag(r14.g) != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0153, code lost:
    
        r14.show(r13, r14.g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0158, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x015b, code lost:
    
        if ((r14 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015d, code lost:
    
        defpackage.retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r13, java.lang.String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r14).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x016a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if ((r14 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if ((r14 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r13.MediaBrowserCompat();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final com.bpjstku.presentation.bsu.CheckEligibleBsuResultActivity r13, defpackage.VirtualCameraAdapter1 r14) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.bsu.CheckEligibleBsuResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(com.bpjstku.presentation.bsu.CheckEligibleBsuResultActivity, VirtualCameraAdapter1):void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(CheckEligibleBsuResultActivity checkEligibleBsuResultActivity, BankStatus bankStatus) {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bankStatus, "");
        String str = bankStatus.TuitionPaymentFragmentbindingInflater1;
        EditText editText = ((ActivityCheckEligibleBsuResultBinding) ((ViewBinding) checkEligibleBsuResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tilBankName.getEditText();
        if (editText != null) {
            editText.setText(str);
            int i4 = asInterface + 125;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ jumpToCurrentState TuitionPaymentFragmentbindingInflater1(final CheckEligibleBsuResultActivity checkEligibleBsuResultActivity) {
        int i = 2 % 2;
        jumpToCurrentState.Companion companion = jumpToCurrentState.INSTANCE;
        jumpToCurrentState jumptocurrentstateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = jumpToCurrentState.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: AppCompatResources
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckEligibleBsuResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (BankStatus) obj);
            }
        });
        int i2 = asInterface + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return jumptocurrentstateTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(CheckEligibleBsuResultActivity checkEligibleBsuResultActivity, ActivityCheckEligibleBsuResultBinding activityCheckEligibleBsuResultBinding, View view) {
        String str;
        Editable text;
        Editable text2;
        String nomorPegawai;
        String nomorIdentitas;
        int i = 2 % 2;
        int i2 = asInterface + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 == 0) {
            Intrinsics.areEqual(((CheckEligibleResult) checkEligibleBsuResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b, "1");
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(((CheckEligibleResult) checkEligibleBsuResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b, "1")) {
            checkEligibleBsuResultActivity.d_();
            return Unit.INSTANCE;
        }
        EditText editText = activityCheckEligibleBsuResultBinding.tilBankName.getEditText();
        String string = StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString();
        switch (string.hashCode()) {
            case -1077080679:
                str = !string.equals("BANK BNI") ? "" : "009";
                break;
            case -1077080555:
                if (!string.equals("BANK BRI")) {
                    str = "";
                } else {
                    int i4 = asBinder + 1;
                    asInterface = i4 % 128;
                    int i5 = i4 % 2;
                    str = "002";
                }
                break;
            case -1077080488:
                str = !string.equals("BANK BTN") ? "" : Constants.STATUS_CODE_200;
                break;
            case -339064167:
                if (!string.equals("BANK SYARIAH INDONESIA")) {
                    str = "";
                } else {
                    int i6 = asInterface + 95;
                    asBinder = i6 % 128;
                    if (i6 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    str = "451";
                }
                break;
            case 17211346:
                if (!string.equals("BANK MANDIRI")) {
                    str = "";
                } else {
                    int i7 = asBinder + 77;
                    asInterface = i7 % 128;
                    if (i7 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    str = "008";
                }
                break;
            default:
                str = "";
                break;
        }
        dispatchOnCreate dispatchoncreate = (dispatchOnCreate) checkEligibleBsuResultActivity.asInterface.getValue();
        EditText editText2 = activityCheckEligibleBsuResultBinding.tilBankAccountName.getEditText();
        if (editText2 != null) {
            int i8 = asBinder + 87;
            asInterface = i8 % 128;
            if (i8 % 2 != 0) {
                editText2.getText();
                obj.hashCode();
                throw null;
            }
            text = editText2.getText();
        } else {
            int i9 = asBinder + 7;
            asInterface = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 3 / 3;
            }
            text = null;
        }
        String string2 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
        EditText editText3 = activityCheckEligibleBsuResultBinding.tilBankAccountNumber.getEditText();
        if (editText3 != null) {
            int i11 = asBinder + 51;
            asInterface = i11 % 128;
            int i12 = i11 % 2;
            text2 = editText3.getText();
        } else {
            text2 = null;
        }
        DataRekening dataRekening = new DataRekening(str, string, string2, StringsKt.trim((CharSequence) String.valueOf(text2)).toString());
        DataEmployeeOffice dataEmployeeOffice = ((CheckEligibleResult) checkEligibleBsuResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).asInterface;
        String strValueOf = String.valueOf(dataEmployeeOffice != null ? dataEmployeeOffice.getKodePerusahaan() : null);
        DataEmployeeOffice dataEmployeeOffice2 = ((CheckEligibleResult) checkEligibleBsuResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).asInterface;
        String strValueOf2 = String.valueOf(dataEmployeeOffice2 != null ? dataEmployeeOffice2.getKodeDivisi() : null);
        DataEmployeeOffice dataEmployeeOffice3 = ((CheckEligibleResult) checkEligibleBsuResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).asInterface;
        String strValueOf3 = String.valueOf(dataEmployeeOffice3 != null ? dataEmployeeOffice3.getKodeKepesertaan() : null);
        DataEmployeeOffice dataEmployeeOffice4 = ((CheckEligibleResult) checkEligibleBsuResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).asInterface;
        String strValueOf4 = String.valueOf(dataEmployeeOffice4 != null ? dataEmployeeOffice4.getKodeTk() : null);
        DataEmployeeOffice dataEmployeeOffice5 = ((CheckEligibleResult) checkEligibleBsuResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).asInterface;
        DataKantor dataKantor = new DataKantor(strValueOf2, strValueOf3, strValueOf, strValueOf4, String.valueOf(dataEmployeeOffice5 != null ? dataEmployeeOffice5.getKpj() : null));
        DataEmployee dataEmployee = ((CheckEligibleResult) checkEligibleBsuResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String strValueOf5 = String.valueOf(dataEmployee != null ? dataEmployee.getChId() : null);
        DataEmployee dataEmployee2 = ((CheckEligibleResult) checkEligibleBsuResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String strValueOf6 = String.valueOf(dataEmployee2 != null ? dataEmployee2.getEmail() : null);
        DataEmployee dataEmployee3 = ((CheckEligibleResult) checkEligibleBsuResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String strValueOf7 = String.valueOf(dataEmployee3 != null ? dataEmployee3.getMssisdn() : null);
        DataEmployee dataEmployee4 = ((CheckEligibleResult) checkEligibleBsuResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String strValueOf8 = String.valueOf(dataEmployee4 != null ? dataEmployee4.getNamaIbu() : null);
        DataEmployee dataEmployee5 = ((CheckEligibleResult) checkEligibleBsuResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String strValueOf9 = String.valueOf(dataEmployee5 != null ? dataEmployee5.getName() : null);
        DataEmployee dataEmployee6 = ((CheckEligibleResult) checkEligibleBsuResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (dataEmployee6 != null) {
            int i13 = asInterface + 109;
            asBinder = i13 % 128;
            if (i13 % 2 == 0) {
                dataEmployee6.getNomorPegawai();
                throw null;
            }
            nomorPegawai = dataEmployee6.getNomorPegawai();
        } else {
            nomorPegawai = null;
        }
        String strValueOf10 = String.valueOf(nomorPegawai);
        DataEmployee dataEmployee7 = ((CheckEligibleResult) checkEligibleBsuResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (dataEmployee7 != null) {
            int i14 = asInterface + 25;
            asBinder = i14 % 128;
            int i15 = i14 % 2;
            nomorIdentitas = dataEmployee7.getNomorIdentitas();
        } else {
            nomorIdentitas = null;
        }
        String strValueOf11 = String.valueOf(nomorIdentitas);
        DataEmployee dataEmployee8 = ((CheckEligibleResult) checkEligibleBsuResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String strValueOf12 = String.valueOf(dataEmployee8 != null ? dataEmployee8.getStatusEligible() : null);
        DataEmployee dataEmployee9 = ((CheckEligibleResult) checkEligibleBsuResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Intrinsics.checkNotNullParameter(new UpdateRekeningBsuRequest(dataRekening, dataKantor, new DataPekerja(strValueOf5, strValueOf6, strValueOf7, strValueOf8, strValueOf9, strValueOf10, strValueOf11, strValueOf12, String.valueOf(dataEmployee9 != null ? dataEmployee9.getTglLahir() : null))), "");
        MutableLiveData<VirtualCameraAdapter1<UpdateRekeningBsuResponse>> mutableLiveData = dispatchoncreate.b;
        new VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(CheckEligibleBsuResultActivity checkEligibleBsuResultActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            jumpToCurrentState jumptocurrentstate = (jumpToCurrentState) checkEligibleBsuResultActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            FragmentManager supportFragmentManager = checkEligibleBsuResultActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(jumptocurrentstate.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i2 = asInterface + 55;
                asBinder = i2 % 128;
                if (i2 % 2 == 0) {
                    jumptocurrentstate.show(supportFragmentManager, jumptocurrentstate.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    throw null;
                }
                jumptocurrentstate.show(supportFragmentManager, jumptocurrentstate.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            ViewPortBuilder.b();
            int i3 = asInterface + 27;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ CheckEligibleResult TuitionPaymentFragmentspecialinlinedviewModeldefault1(CheckEligibleBsuResultActivity checkEligibleBsuResultActivity) {
        CheckEligibleResult checkEligibleResult;
        int i = 2 % 2;
        int i2 = asInterface + 23;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Parcelable parcelableExtra = checkEligibleBsuResultActivity.getIntent().getParcelableExtra("check_eligible_result");
            Intrinsics.checkNotNull(parcelableExtra);
            checkEligibleResult = (CheckEligibleResult) parcelableExtra;
            int i3 = 73 / 0;
        } else {
            Parcelable parcelableExtra2 = checkEligibleBsuResultActivity.getIntent().getParcelableExtra("check_eligible_result");
            Intrinsics.checkNotNull(parcelableExtra2);
            checkEligibleResult = (CheckEligibleResult) parcelableExtra2;
        }
        int i4 = asBinder + 61;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return checkEligibleResult;
    }

    public static /* synthetic */ Unit b(CheckEligibleBsuResultActivity checkEligibleBsuResultActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            checkEligibleBsuResultActivity.d_();
            return Unit.INSTANCE;
        }
        checkEligibleBsuResultActivity.d_();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(CheckEligibleBsuResultActivity checkEligibleBsuResultActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        checkEligibleBsuResultActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 55;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit d() {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 1;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(CheckEligibleBsuResultActivity checkEligibleBsuResultActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            checkEligibleBsuResultActivity.d_();
            return Unit.INSTANCE;
        }
        checkEligibleBsuResultActivity.d_();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        d = 1;
        g();
        INSTANCE = new Companion(null);
        int i = g + 85;
        d = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = SalariedWorkerPasswordFragment$special$$inlined$viewModel$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_confirm_shopeepay_qr_scan_tablet).substring(12, 17).codePointAt(3) + 785894400;
        return ((Integer) TuitionPaymentFragmentbindingInflater1(395312832, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, -395312832, iCodePointAt)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(-385986815, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, SalariedWorkerPasswordFragment$special$$inlined$viewModel$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, 385986816, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SalariedWorkerPasswordFragment$special$$inlined$viewModel$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = 1620475531 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = SalariedWorkerPasswordFragment$special$$inlined$viewModel$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(-1228739805, i, LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, 1228739808, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SalariedWorkerPasswordFragment$special$$inlined$viewModel$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(-158744010, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, LoginActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this, bundle}, 158744012, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void g() {
        f473a = new int[]{-1972216551, -329109934, 1218564277, -1228071780, -1386262032, 1117929201, -968000967, -95729728, 474589422, 571575303, -1480829837, 2111100534, -2011179176, -1439589530, -1333136138, 180085975, 312379797, 667194811};
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return Integer.valueOf(R.layout.activity_check_eligible_bsu_result);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static String $$i(byte b, short s, int i) {
        int i2 = 4 - (b * 3);
        int i3 = (i * 56) + 66;
        byte[] bArr = $$c;
        int i4 = s * 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2++;
            i3 = i4 + (-i2);
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            int i6 = bArr[i2];
            i2++;
            i3 += -i6;
        }
    }
}
