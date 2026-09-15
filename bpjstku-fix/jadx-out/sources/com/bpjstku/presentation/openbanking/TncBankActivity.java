package com.bpjstku.presentation.openbanking;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.view.InputDeviceCompat;
import androidx.viewbinding.ViewBinding;
import androidx.work.WorkInfo;
import com.bpjstku.R;
import com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda16;
import com.bpjstku.data.openbanking.model.ListBank;
import com.bpjstku.databinding.ActivityTncBankBinding;
import com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$sharedViewModel$default$1;
import com.bpjstku.presentation.openbanking.TncBankActivity;
import com.bpjstku.presentation.util.WebviewCustomActivity;
import com.bpjstku.util.constant.CodeBank;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.timepicker.ClockHandView$$ExternalSyntheticLambda0;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.ViewPortBuilder;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\u000e8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00128UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013"}, d2 = {"Lcom/bpjstku/presentation/openbanking/TncBankActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityTncBankBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Lcom/bpjstku/data/openbanking/model/ListBank;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/data/openbanking/model/ListBank;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TncBankActivity extends BindingBaseActivity<ActivityTncBankBinding> {
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int g;
    private ListBank TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {1, 115, -83, 116};
    private static final int $$f = 130;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {55, -47, -47, 67, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 19;
    private static int d = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int asBinder = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = (~(i8 | i3)) | i7;
        int i10 = (~(i7 | (~i3) | i4)) | (~(i8 | i7 | i3));
        int i11 = (~(i3 | i4)) | (~(i2 | i4));
        int i12 = i2 + i4 + i6 + ((-1520811122) * i5) + (1880343047 * i);
        int i13 = i12 * i12;
        int i14 = (((-88056299) * i2) - 1254686720) + (875799021 * i4) + ((-481927660) * i9) + (i10 * 481927660) + (481927660 * i11) + (393871360 * i6) + ((-206831616) * i5) + (408289280 * i) + ((-683737088) * i13);
        int i15 = ((i2 * (-660833811)) - 1995073173) + (i4 * (-660833531)) + (i9 * (-140)) + (i10 * 140) + (i11 * 140) + (i6 * (-660833671)) + (i5 * 644061726) + (i * (-2012083377)) + (i13 * (-1027145728));
        if (i14 + (i15 * i15 * 814809088) == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        final TncBankActivity tncBankActivity = (TncBankActivity) objArr[0];
        int i16 = 2 % 2;
        ((ActivityTncBankBinding) ((ViewBinding) tncBankActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: TrustedWebActivityCallbackRemote
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TncBankActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
        ((ActivityTncBankBinding) ((ViewBinding) tncBankActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnAgree.setOnClickListener(new View.OnClickListener() { // from class: TrustedWebActivityDisplayModeDefaultMode
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TncBankActivity.TuitionPaymentFragmentbindingInflater1(this.b, view);
            }
        });
        int i17 = asBinder + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
        int i18 = i17 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r0 = com.bpjstku.presentation.openbanking.TncBankActivity.$$a
            int r1 = r6 + 1
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.openbanking.TncBankActivity.c(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.openbanking.TncBankActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/openbanking/TncBankActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/data/openbanking/model/ListBank;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;Lcom/bpjstku/data/openbanking/model/ListBank;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0, ListBank p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intent intent = new Intent(p0, (Class<?>) TncBankActivity.class);
            intent.putExtra("listBank", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityTncBankBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        TncBankActivity$bindingInflater$1 tncBankActivity$bindingInflater$1 = TncBankActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = asBinder + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return tncBankActivity$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        asBinder = i2 % 128;
        ListBank listBank = null;
        if (i2 % 2 == 0) {
            getIntent();
            throw null;
        }
        Intent intent = getIntent();
        if (intent != null) {
            listBank = (ListBank) intent.getParcelableExtra("listBank");
        } else {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        }
        this.TuitionPaymentFragmentbindingInflater1 = listBank;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityTncBankBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.toolbar, true);
        ((ActivityTncBankBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.tvToolbarTitle.setText("");
        ActivityTncBankBinding activityTncBankBinding = (ActivityTncBankBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        ListBank listBank = this.TuitionPaymentFragmentbindingInflater1;
        Object obj = null;
        String code = listBank != null ? listBank.getCode() : null;
        if (Intrinsics.areEqual(code, CodeBank.BRI.getCode())) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                activityTncBankBinding.tvTitleBank.setText(getString(R.string.label_title_open_account_bri));
                activityTncBankBinding.tvBankDesc.setText(getString(R.string.label_desc_open_account_bri));
                return;
            } else {
                activityTncBankBinding.tvTitleBank.setText(getString(R.string.label_title_open_account_bri));
                activityTncBankBinding.tvBankDesc.setText(getString(R.string.label_desc_open_account_bri));
                obj.hashCode();
                throw null;
            }
        }
        if (Intrinsics.areEqual(code, CodeBank.MANDIRI.getCode())) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                activityTncBankBinding.tvTitleBank.setText(getString(R.string.label_title_open_account_mandiri));
                activityTncBankBinding.tvBankDesc.setText(getString(R.string.label_desc_open_account_mandiri));
                return;
            } else {
                activityTncBankBinding.tvTitleBank.setText(getString(R.string.label_title_open_account_mandiri));
                activityTncBankBinding.tvBankDesc.setText(getString(R.string.label_desc_open_account_mandiri));
                throw null;
            }
        }
        if (!Intrinsics.areEqual(code, CodeBank.BNI.getCode())) {
            activityTncBankBinding.tvTitleBank.setVisibility(8);
            activityTncBankBinding.tvBankDesc.setVisibility(8);
            activityTncBankBinding.btnAgree.setEnabled(false);
        } else {
            activityTncBankBinding.tvTitleBank.setText(getString(R.string.label_title_open_account_bni));
            activityTncBankBinding.tvBankDesc.setText(getString(R.string.label_desc_open_account_bni));
            int i4 = asBinder + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:36:0x01b5  */
    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            j = 0;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i4 = $10 + 57;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cBlue = (char) Color.blue(0);
                    int tapTimeout = 2187 - (ViewConfiguration.getTapTimeout() >> 16);
                    int packedPositionChild = 39 - ExpandableListView.getPackedPositionChild(0L);
                    byte b = (byte) ($$c[0] - 1);
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, tapTimeout, packedPositionChild, 841711447, false, $$i(b, b2, (byte) (b2 + 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cBlue2 = (char) (33017 - Color.blue(0));
                    int maximumDrawingCacheSize = 3011 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27;
                    byte b3 = (byte) ($$c[0] - 1);
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue2, maximumDrawingCacheSize, iIndexOf, 321985076, false, $$i(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char offsetAfter = (char) (36505 - TextUtils.getOffsetAfter("", 0));
                    int iAlpha = 3376 - Color.alpha(0);
                    int iArgb = 17 - Color.argb(0, 0, 0, 0);
                    byte b5 = $$c[0];
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetAfter, iAlpha, iArgb, -968507904, false, $$i(b6, b6, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $10 + 33;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char c2 = (char) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 36504);
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 3376;
                int mode = 17 - View.MeasureSpec.getMode(0);
                byte b7 = $$c[0];
                byte b8 = (byte) (b7 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, jumpTapTimeout, mode, -968507904, false, $$i(b8, b8, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            j = 0;
        }
        objArr[0] = new String(cArr);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
            int i2 = 1031 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int packedPositionType = 15 - ExpandableListView.getPackedPositionType(0L);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) 52, bArr[5], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, i2, packedPositionType, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step8).substring(31, 33).codePointAt(1) - 101, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 76, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 65273), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(Color.alpha(0) + 22, ExpandableListView.getPackedPositionGroup(0L) + 15, (char) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.vida_preview_width) & (-865)) + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0') + 1);
            int i3 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1030;
            int iNormalizeMetaState = 15 - KeyEvent.normalizeMetaState(0);
            Object[] objArr5 = new Object[1];
            c((byte) 52, $$a[5], (short) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf2, i3, iNormalizeMetaState, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1031;
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15;
                byte b = $$a[7];
                byte b2 = b;
                Object[] objArr6 = new Object[1];
                c(b, b2, (short) (b2 | 104), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, iResolveSizeAndState, scrollBarFadeDuration, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[3])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iMyPid = Process.myPid();
            int i6 = ((((-1111539135) + ((((~(957872984 | iMyPid)) | 42468518) | (~((-713592815) | iMyPid))) * (-744))) + (((~iMyPid) | 286748688) * 744)) + ((iMyPid | (-42468519)) * 744)) - 1537617144;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_danamon_online).substring(1, 3).length() + 14, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 7428), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_web_instruction_4).substring(51, 53).length() + 51, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 100, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.xl_instruction_step4).substring(3, 4).codePointAt(0) - 117), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1558462976};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - Drawable.resolveOpacity(0, 0)), 1134 - Color.green(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1537617144, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int iMyTid = 1031 - (Process.myTid() >> 22);
                    int iBlue = Color.blue(0) + 15;
                    byte[] bArr2 = $$a;
                    Object[] objArr12 = new Object[1];
                    c((byte) 52, bArr2[5], bArr2[7], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, iMyTid, iBlue, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), View.getDefaultSize(0, 0) + 1117, ((Process.getThreadPriority(0) + 20) >> 6) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int iAxisFromString = MotionEvent.axisFromString("") + 1032;
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 15;
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr13 = new Object[1];
                    c(b3, b4, (short) (b4 | 104), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iAxisFromString, deadChar, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(ViewConfiguration.getLongPressTimeout() >> 16, 22 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 65273), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, Color.blue(0) + 15, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1031;
                        int offsetBefore = 15 - TextUtils.getOffsetBefore("", 0);
                        Object[] objArr16 = new Object[1];
                        c((byte) 52, $$a[5], (short) 52, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, packedPositionGroup, offsetBefore, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                        int threadPriority = 1031 - ((Process.getThreadPriority(0) + 20) >> 6);
                        int i9 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15;
                        byte[] bArr3 = $$a;
                        Object[] objArr17 = new Object[1];
                        c((byte) 52, bArr3[5], bArr3[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, threadPriority, i9, 1357589585, false, (String) objArr17[0], null);
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 == null) {
                throw null;
            }
            int i10 = asBinder + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
            int i11 = i10 % 2;
            for (String str : strArr2) {
                int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
                asBinder = i12 % 128;
                int i13 = i12 % 2;
                arrayList.add(str);
            }
            throw null;
        }
        int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
        asBinder = i14 % 128;
        int i15 = i14 % 2;
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i16 = ((int[]) objArr[2])[0];
        int i17 = ((int[]) objArr[3])[0];
        int i18 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i19 = i16 + 1972551637 + ((~((~iMaxMemory) | (-43521187))) * (-116)) + ((1030203469 | iMaxMemory) * 116) + (((~(iMaxMemory | 785923299)) | 287801356) * 116);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr18[2])[0] = i21 ^ (i21 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cResolveSize = (char) (29944 - View.resolveSize(0, 0));
            int bitsPerPixel = 1754 - ImageFormat.getBitsPerPixel(0);
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 23;
            Object[] objArr19 = new Object[1];
            c((byte) 37, $$a[5], (short) 104, objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cResolveSize, bitsPerPixel, edgeSlop, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 29944);
                int i22 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1754;
                int iArgb = Color.argb(0, 0, 0, 0) + 23;
                Object[] objArr20 = new Object[1];
                c((byte) 52, $$a[5], (short) 52, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(capsMode, i22, iArgb, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i23 = (~((-159895950) | startUptimeMillis)) | 17043596;
            int i24 = 2135982025 + (i23 * 992) + ((i23 | (~((~startUptimeMillis) | 195558829))) * (-496)) + ((startUptimeMillis | 52706476) * 496) + 35027959;
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i26 ^ (i26 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.no_saved_cards).substring(7, 8).codePointAt(0) - 84, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 7453), objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e((ViewConfiguration.getDoubleTapTimeout() >> 16) + 53, Color.rgb(0, 0, 0) + InputDeviceCompat.SOURCE_JOYSTICK, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {-1558462976};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 42049), View.MeasureSpec.makeMeasureSpec(0, 0) + 1726, 28 - ImageFormat.getBitsPerPixel(0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = ClockHandView$$ExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 35027959, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cAlpha = (char) (29944 - Color.alpha(0));
                int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 1755;
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 23;
                Object[] objArr25 = new Object[1];
                c((byte) 52, $$a[5], (short) 52, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cAlpha, edgeSlop2, windowTouchSlop, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr26 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_smile).substring(4, 5).codePointAt(0) - 101, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, (char) (65284 - ((Process.getThreadPriority(0) + 20) >> 6)), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(TextUtils.lastIndexOf("", '0', 0) + 23, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 115), objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char fadingEdgeLength = (char) (29944 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                    int edgeSlop3 = 1755 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int scrollBarSize = 23 - (ViewConfiguration.getScrollBarSize() >> 8);
                    byte b5 = $$a[5];
                    Object[] objArr28 = new Object[1];
                    c((byte) 52, b5, (short) (b5 | 140), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(fadingEdgeLength, edgeSlop3, scrollBarSize, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 29944);
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1755;
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 23;
                    Object[] objArr29 = new Object[1];
                    c((byte) 37, $$a[5], (short) 104, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cResolveSizeAndState, absoluteGravity, iIndexOf, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr4 == null) {
                throw null;
            }
            int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
            asBinder = i27 % 128;
            for (int i28 = i27 % 2 != 0 ? 0 : 1; i28 < strArr4.length; i28++) {
                arrayList2.add(strArr4[i28]);
            }
            throw null;
        }
        int i29 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr30 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i30 = i29 + 631833220 + (((~(iElapsedRealtime | 625440356)) | 412616714) * 305) + (((~((~iElapsedRealtime) | 625440356)) | 412837930) * 305);
        int i31 = (i30 << 13) ^ i30;
        int i32 = i31 ^ (i31 >>> 17);
        ((int[]) objArr30[3])[0] = i32 ^ (i32 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -750595779
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
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.reflect.Member[] r1 = defpackage.calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()
            long r4 = r4.totalMemory()
            int r4 = (int) r4
            r5 = 1071181179(0x3fd8ed7b, float:1.6947473)
            r6 = r5 | r4
            int r6 = ~r6
            r7 = 155207712(0x9404820, float:2.3145072E-33)
            r7 = r7 | r6
            int r7 = r7 * (-476)
            r8 = -1184427208(0xffffffffb9671338, float:-2.2037036E-4)
            int r8 = r8 + r7
            int r6 = r6 * 952
            int r8 = r8 + r6
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = ~r4
            int r4 = r4 * 476
            int r8 = r8 + r4
            if (r1 != r8) goto La5
            java.lang.reflect.Member[] r1 = defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            java.lang.String r4 = "android.app.ActivityThread"
            java.lang.Class r4 = java.lang.Class.forName(r4)
            java.lang.String r5 = "currentApplication"
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r2 = r4.getMethod(r5, r2)
            r4 = r3
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r2 = r2.invoke(r3, r3)
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.mnc
            r4 = -19932165(0xfffffffffecfdbfb, float:-1.381462E38)
            r5 = r4 | r2
            int r5 = ~r5
            int r5 = r5 * 521
            r6 = -1064255648(0xffffffffc090bf60, float:-4.523361)
            int r5 = r5 + r6
            int r2 = ~r2
            r2 = r2 | r4
            int r2 = ~r2
            r4 = 1141178648(0x44050118, float:532.0171)
            r2 = r2 | r4
            int r2 = r2 * 521
            int r5 = r5 + r2
            if (r1 == r5) goto L98
            int r1 = com.bpjstku.presentation.openbanking.TncBankActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r1 = r1 + 15
            int r2 = r1 % 128
            com.bpjstku.presentation.openbanking.TncBankActivity.asBinder = r2
            int r1 = r1 % r0
            r1 = -750595779(0xffffffffd342d13d, float:-8.367341E11)
            int[] r1 = new int[r1]
            r2 = -750595780(0xffffffffd342d13c, float:-8.36734E11)
            r4 = 1
            r1[r2] = r4
            r2 = 1228265292(0x4935d74c, float:744820.75)
            int r2 = r2 % r0
            r2 = -1
            r1 = r1[r2]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r4)
            r1.show()
        L98:
            super.onResume()
            int r1 = com.bpjstku.presentation.openbanking.TncBankActivity.asBinder
            int r1 = r1 + 85
            int r2 = r1 % 128
            com.bpjstku.presentation.openbanking.TncBankActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r2
            int r1 = r1 % r0
            return
        La5:
            r1 = 1251783160(0x4a9cb1f8, float:5134588.0)
            int r1 = r1 % r0
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.openbanking.TncBankActivity.onResume():void");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x00a3  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~(2006712255 | iIdentityHashCode);
            if (i3 != (-500188840) + ((637731476 | i4) * (-476)) + (i4 * 952) + ((~((~iIdentityHashCode) | 2006712255)) * 476)) {
                int[] iArr = new int[1348616918];
                iArr[1348616917] = 1;
                int i5 = (-1394030578) % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
                int i6 = asBinder + 47;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            int i8 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_kioson).substring(1, 3).codePointAt(1) - 2125826039;
            int i9 = ~iCodePointAt;
            if (i8 != 2142254032 + (((-1115234306) | i9) * (-369)) + (((~((-1023708543) | i9)) | (-1853696086)) * (-369)) + (((~(iCodePointAt | 1023708542)) | (-2138942848) | (~(i9 | (-738461781)))) * 369)) {
                int[] iArr2 = new int[1348616918];
                iArr2[1348616917] = 1;
                int i10 = (-1394030578) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
                int i11 = asBinder + 47;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                int i12 = i11 % 2;
            }
        }
        int i13 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i14 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1803329633;
        int i15 = 110604700 + (((~((-791809641) | i14)) | 704775776 | (~((-1787246325) | i14))) * (-880));
        int i16 = (~((-791809641) | (~i14))) | 1787246324;
        int i17 = ~(i14 | 791809640);
        if (i13 != i15 + ((i16 | i17) * (-880)) + (i17 * 880)) {
            throw new RuntimeException("-1471778606");
        }
        super.onStart();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
        if (i4 != 115380728 + (((~((~i5) | (-4227585))) | (~((-1208749144) | i5))) * (-302)) + ((~((-4227585) | i5)) * (-604)) + (((~(i5 | (-1212976728))) | (-1591738328)) * 302)) {
            throw new RuntimeException("-1392448105");
        }
        int i6 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        if (i6 != (((~(2107527975 | iElapsedRealtime)) | (-1791609764)) * 398) + 592199756 + (((~((~iElapsedRealtime) | 2107527975)) | (-1791609764)) * 398)) {
            throw new RuntimeException("-1471458474");
        }
        super.onCreate(bundle);
        int i7 = asBinder + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:13:0x003c A[Catch: all -> 0x0102, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0102, blocks: (B:4:0x0013, B:9:0x0020, B:13:0x003c, B:17:0x0057, B:19:0x0067, B:31:0x00ec, B:20:0x007d, B:21:0x008d, B:22:0x008e, B:23:0x009b, B:24:0x009c, B:26:0x00d6, B:30:0x00e9, B:32:0x00ef, B:7:0x001c), top: B:40:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0057 A[Catch: all -> 0x0102, TRY_ENTER, TryCatch #0 {all -> 0x0102, blocks: (B:4:0x0013, B:9:0x0020, B:13:0x003c, B:17:0x0057, B:19:0x0067, B:31:0x00ec, B:20:0x007d, B:21:0x008d, B:22:0x008e, B:23:0x009b, B:24:0x009c, B:26:0x00d6, B:30:0x00e9, B:32:0x00ef, B:7:0x001c), top: B:40:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0067 A[Catch: all -> 0x0102, TryCatch #0 {all -> 0x0102, blocks: (B:4:0x0013, B:9:0x0020, B:13:0x003c, B:17:0x0057, B:19:0x0067, B:31:0x00ec, B:20:0x007d, B:21:0x008d, B:22:0x008e, B:23:0x009b, B:24:0x009c, B:26:0x00d6, B:30:0x00e9, B:32:0x00ef, B:7:0x001c), top: B:40:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x007d A[Catch: all -> 0x0102, TryCatch #0 {all -> 0x0102, blocks: (B:4:0x0013, B:9:0x0020, B:13:0x003c, B:17:0x0057, B:19:0x0067, B:31:0x00ec, B:20:0x007d, B:21:0x008d, B:22:0x008e, B:23:0x009b, B:24:0x009c, B:26:0x00d6, B:30:0x00e9, B:32:0x00ef, B:7:0x001c), top: B:40:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x008e A[Catch: all -> 0x0102, TryCatch #0 {all -> 0x0102, blocks: (B:4:0x0013, B:9:0x0020, B:13:0x003c, B:17:0x0057, B:19:0x0067, B:31:0x00ec, B:20:0x007d, B:21:0x008d, B:22:0x008e, B:23:0x009b, B:24:0x009c, B:26:0x00d6, B:30:0x00e9, B:32:0x00ef, B:7:0x001c), top: B:40:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x009c A[Catch: all -> 0x0102, TryCatch #0 {all -> 0x0102, blocks: (B:4:0x0013, B:9:0x0020, B:13:0x003c, B:17:0x0057, B:19:0x0067, B:31:0x00ec, B:20:0x007d, B:21:0x008d, B:22:0x008e, B:23:0x009b, B:24:0x009c, B:26:0x00d6, B:30:0x00e9, B:32:0x00ef, B:7:0x001c), top: B:40:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00d6 A[Catch: all -> 0x0102, TRY_LEAVE, TryCatch #0 {all -> 0x0102, blocks: (B:4:0x0013, B:9:0x0020, B:13:0x003c, B:17:0x0057, B:19:0x0067, B:31:0x00ec, B:20:0x007d, B:21:0x008d, B:22:0x008e, B:23:0x009b, B:24:0x009c, B:26:0x00d6, B:30:0x00e9, B:32:0x00ef, B:7:0x001c), top: B:40:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e9 A[Catch: all -> 0x0102, TRY_ENTER, TryCatch #0 {all -> 0x0102, blocks: (B:4:0x0013, B:9:0x0020, B:13:0x003c, B:17:0x0057, B:19:0x0067, B:31:0x00ec, B:20:0x007d, B:21:0x008d, B:22:0x008e, B:23:0x009b, B:24:0x009c, B:26:0x00d6, B:30:0x00e9, B:32:0x00ef, B:7:0x001c), top: B:40:0x0011 }] */
    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(TncBankActivity tncBankActivity, View view) {
        ListBank listBank;
        TncBankActivity tncBankActivity2;
        Uri uri;
        CustomTabsIntent customTabsIntentBuild;
        int i;
        int i2;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i6 == 0) {
                listBank = tncBankActivity.TuitionPaymentFragmentbindingInflater1;
                int i7 = 31 / 0;
                if (listBank != null) {
                    if (Intrinsics.areEqual(listBank.getCode(), CodeBank.BRI.getCode())) {
                        tncBankActivity2 = tncBankActivity;
                        String url = listBank.getUrl();
                        Intrinsics.checkNotNullParameter(tncBankActivity2, "");
                        Intrinsics.checkNotNullParameter(url, "");
                        uri = Uri.parse(url);
                        customTabsIntentBuild = new CustomTabsIntent.Builder().setShowTitle(true).build();
                        Intrinsics.checkNotNullExpressionValue(customTabsIntentBuild, "");
                        customTabsIntentBuild.intent.setData(uri);
                        customTabsIntentBuild.intent.setPackage("com.android.chrome");
                        if (customTabsIntentBuild.intent.resolveActivity(tncBankActivity2.getPackageManager()) != null) {
                            tncBankActivity2.startActivity(customTabsIntentBuild.intent);
                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
                            asBinder = i % 128;
                            if (i % 2 == 0) {
                                int i8 = 4 / 2;
                            }
                        } else {
                            customTabsIntentBuild.launchUrl(tncBankActivity2, uri);
                        }
                    } else {
                        i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
                        asBinder = i2 % 128;
                        obj = null;
                        if (i2 % 2 != 0) {
                            Intrinsics.areEqual(listBank.getCode(), CodeBank.MANDIRI.getCode());
                            throw null;
                        }
                        if (Intrinsics.areEqual(listBank.getCode(), CodeBank.MANDIRI.getCode())) {
                            tncBankActivity2 = tncBankActivity;
                            String url2 = listBank.getUrl();
                            Intrinsics.checkNotNullParameter(tncBankActivity2, "");
                            Intrinsics.checkNotNullParameter(url2, "");
                            uri = Uri.parse(url2);
                            customTabsIntentBuild = new CustomTabsIntent.Builder().setShowTitle(true).build();
                            Intrinsics.checkNotNullExpressionValue(customTabsIntentBuild, "");
                            customTabsIntentBuild.intent.setData(uri);
                            customTabsIntentBuild.intent.setPackage("com.android.chrome");
                            if (customTabsIntentBuild.intent.resolveActivity(tncBankActivity2.getPackageManager()) != null) {
                                tncBankActivity2.startActivity(customTabsIntentBuild.intent);
                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
                                asBinder = i % 128;
                                if (i % 2 == 0) {
                                    int i9 = 4 / 2;
                                }
                            } else {
                                customTabsIntentBuild.launchUrl(tncBankActivity2, uri);
                            }
                        } else {
                            i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                            asBinder = i3 % 128;
                            if (i3 % 2 != 0) {
                                Intrinsics.areEqual(listBank.getCode(), CodeBank.BNI.getCode());
                                obj.hashCode();
                                throw null;
                            }
                            if (Intrinsics.areEqual(listBank.getCode(), CodeBank.BNI.getCode())) {
                                tncBankActivity2 = tncBankActivity;
                                String url3 = listBank.getUrl();
                                Intrinsics.checkNotNullParameter(tncBankActivity2, "");
                                Intrinsics.checkNotNullParameter(url3, "");
                                uri = Uri.parse(url3);
                                customTabsIntentBuild = new CustomTabsIntent.Builder().setShowTitle(true).build();
                                Intrinsics.checkNotNullExpressionValue(customTabsIntentBuild, "");
                                customTabsIntentBuild.intent.setData(uri);
                                customTabsIntentBuild.intent.setPackage("com.android.chrome");
                                if (customTabsIntentBuild.intent.resolveActivity(tncBankActivity2.getPackageManager()) != null) {
                                    tncBankActivity2.startActivity(customTabsIntentBuild.intent);
                                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
                                    asBinder = i % 128;
                                    if (i % 2 == 0) {
                                        int i10 = 4 / 2;
                                    }
                                } else {
                                    customTabsIntentBuild.launchUrl(tncBankActivity2, uri);
                                }
                            } else {
                                WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
                                WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tncBankActivity, listBank.getUrl(), listBank.getTitle(), 0, null, false, 56);
                            }
                        }
                    }
                    tncBankActivity.finish();
                }
            } else {
                listBank = tncBankActivity.TuitionPaymentFragmentbindingInflater1;
                if (listBank != null) {
                    if (Intrinsics.areEqual(listBank.getCode(), CodeBank.BRI.getCode())) {
                        i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
                        asBinder = i2 % 128;
                        obj = null;
                        if (i2 % 2 != 0) {
                            Intrinsics.areEqual(listBank.getCode(), CodeBank.MANDIRI.getCode());
                            throw null;
                        }
                        if (Intrinsics.areEqual(listBank.getCode(), CodeBank.MANDIRI.getCode())) {
                            i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                            asBinder = i3 % 128;
                            if (i3 % 2 != 0) {
                                Intrinsics.areEqual(listBank.getCode(), CodeBank.BNI.getCode());
                                obj.hashCode();
                                throw null;
                            }
                            if (Intrinsics.areEqual(listBank.getCode(), CodeBank.BNI.getCode())) {
                                WebviewCustomActivity.Companion companion2 = WebviewCustomActivity.INSTANCE;
                                WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tncBankActivity, listBank.getUrl(), listBank.getTitle(), 0, null, false, 56);
                            } else {
                                tncBankActivity2 = tncBankActivity;
                                String url4 = listBank.getUrl();
                                Intrinsics.checkNotNullParameter(tncBankActivity2, "");
                                Intrinsics.checkNotNullParameter(url4, "");
                                uri = Uri.parse(url4);
                                customTabsIntentBuild = new CustomTabsIntent.Builder().setShowTitle(true).build();
                                Intrinsics.checkNotNullExpressionValue(customTabsIntentBuild, "");
                                customTabsIntentBuild.intent.setData(uri);
                                customTabsIntentBuild.intent.setPackage("com.android.chrome");
                                if (customTabsIntentBuild.intent.resolveActivity(tncBankActivity2.getPackageManager()) != null) {
                                    tncBankActivity2.startActivity(customTabsIntentBuild.intent);
                                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
                                    asBinder = i % 128;
                                    if (i % 2 == 0) {
                                        int i11 = 4 / 2;
                                    }
                                } else {
                                    customTabsIntentBuild.launchUrl(tncBankActivity2, uri);
                                }
                            }
                        } else {
                            tncBankActivity2 = tncBankActivity;
                            String url5 = listBank.getUrl();
                            Intrinsics.checkNotNullParameter(tncBankActivity2, "");
                            Intrinsics.checkNotNullParameter(url5, "");
                            uri = Uri.parse(url5);
                            customTabsIntentBuild = new CustomTabsIntent.Builder().setShowTitle(true).build();
                            Intrinsics.checkNotNullExpressionValue(customTabsIntentBuild, "");
                            customTabsIntentBuild.intent.setData(uri);
                            customTabsIntentBuild.intent.setPackage("com.android.chrome");
                            if (customTabsIntentBuild.intent.resolveActivity(tncBankActivity2.getPackageManager()) != null) {
                                tncBankActivity2.startActivity(customTabsIntentBuild.intent);
                                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
                                asBinder = i % 128;
                                if (i % 2 == 0) {
                                    int i12 = 4 / 2;
                                }
                            } else {
                                customTabsIntentBuild.launchUrl(tncBankActivity2, uri);
                            }
                        }
                    } else {
                        tncBankActivity2 = tncBankActivity;
                        String url6 = listBank.getUrl();
                        Intrinsics.checkNotNullParameter(tncBankActivity2, "");
                        Intrinsics.checkNotNullParameter(url6, "");
                        uri = Uri.parse(url6);
                        customTabsIntentBuild = new CustomTabsIntent.Builder().setShowTitle(true).build();
                        Intrinsics.checkNotNullExpressionValue(customTabsIntentBuild, "");
                        customTabsIntentBuild.intent.setData(uri);
                        customTabsIntentBuild.intent.setPackage("com.android.chrome");
                        if (customTabsIntentBuild.intent.resolveActivity(tncBankActivity2.getPackageManager()) != null) {
                            tncBankActivity2.startActivity(customTabsIntentBuild.intent);
                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
                            asBinder = i % 128;
                            if (i % 2 == 0) {
                                int i13 = 4 / 2;
                            }
                        } else {
                            customTabsIntentBuild.launchUrl(tncBankActivity2, uri);
                        }
                    }
                    tncBankActivity.finish();
                }
            }
            ViewPortBuilder.b();
            int i14 = asBinder + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 19 / 0;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(TncBankActivity tncBankActivity, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            tncBankActivity.finish();
            ViewPortBuilder.b();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    static {
        g = 0;
        g();
        INSTANCE = new Companion(null);
        int i = d + 55;
        g = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return R.layout.activity_tnc_bank;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iB = SalariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$sharedViewModel$default$1.b();
        int iB2 = SalariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$sharedViewModel$default$1.b();
        TuitionPaymentFragmentbindingInflater1(AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1524513665, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 1524513665, iB2, iB, new Object[]{this});
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iB = SalariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$sharedViewModel$default$1.b();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(SalariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$sharedViewModel$default$1.b(), 1437020837, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1437020836, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iB, new Object[]{this});
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new char[]{20217, 33769, 54466, 10679, 31371, 20330, 32838, 54639, 9743, 30972, 19840, 40606, 54165, 9336, 31070, 18988, 40709, 53716, 8922, 30650, 18583, 40312, 45561, 31983, 11203, 54961, 34195, 45154, 32578, 10775, 55553, 34794, 45766, 25021, 11393, 56162, 34379, 44254, 25034, 14076, 52104, 39142, 44355, 25199, 14083, 50219, 39565, 45009, 31896, 12723, 50771, 39779, 43016, 45557, 31975, 11207, 54959, 34196, 45166, 32594, 10812, 55596, 34794, 45785, 24993, 11435, 56160, 34378, 46376};
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -6832632918308389757L;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        TncBankActivity tncBankActivity = (TncBankActivity) objArr[0];
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            return null;
        }
        int i4 = 61 / 0;
        return null;
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
    private static java.lang.String $$i(int r6, short r7, short r8) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r8 = 115 - r8
            byte[] r0 = com.bpjstku.presentation.openbanking.TncBankActivity.$$c
            int r6 = r6 * 3
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2b:
            int r7 = -r7
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.openbanking.TncBankActivity.$$i(int, short, short):java.lang.String");
    }
}
