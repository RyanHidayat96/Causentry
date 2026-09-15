package com.bpjstku.presentation.investation;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda16;
import com.bpjstku.databinding.ActivityInvestmentListBinding;
import com.bpjstku.domain.investment.model.InvestmentService;
import com.bpjstku.presentation.investation.InvestmentListActivity;
import com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$sharedViewModel$default$1;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.ViewPortBuilder;
import defpackage.calculateCameraUseCases;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.createExtraPreview;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.setOptionalIconsVisible;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u0015\u0010\r\u001a\u00020\u000b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\u000e8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0014"}, d2 = {"Lcom/bpjstku/presentation/investation/InvestmentListActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityInvestmentListBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "LsetOptionalIconsVisible;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InvestmentListActivity extends BindingBaseActivity<ActivityInvestmentListBinding> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int d;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: setHeaderIconInt
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            return (setOptionalIconsVisible) InvestmentListActivity.TuitionPaymentFragmentbindingInflater1(AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 712938545, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -712938545);
        }
    });
    private static final byte[] $$a = {22, 102, 43, -6, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 249;
    private static int g = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = i7 | i6;
        int i9 = ~(i8 | i4);
        int i10 = (~i4) | (~((~i6) | i3));
        int i11 = (~(i4 | i6)) | (~(i7 | i4)) | (~i8);
        int i12 = i3 + i6 + i + ((-953487067) * i5) + ((-1992133889) * i2);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i3) + 1765277696 + (1051104396 * i6) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i) + ((-1703411712) * i5) + (1961361408 * i2) + (907935744 * i13);
        int i15 = ((i3 * 272661978) - 2115615402) + (i6 * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i * 272662391) + (i5 * 2077717299) + (i2 * 1957688713) + (i13 * 166854656);
        int i16 = i14 + (i15 * i15 * (-213778432));
        if (i16 != 1) {
            return i16 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : b(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
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
    private static void c(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 + 1
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r1 = com.bpjstku.presentation.investation.InvestmentListActivity.$$a
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            int r6 = r6 + 1
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.investation.InvestmentListActivity.c(int, short, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.investation.InvestmentListActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/investation/InvestmentListActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            p0.startActivity(new Intent(p0, (Class<?>) InvestmentListActivity.class));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityInvestmentListBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        InvestmentListActivity$bindingInflater$1 investmentListActivity$bindingInflater$1 = InvestmentListActivity$bindingInflater$1.b;
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        return investmentListActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ((ActivityInvestmentListBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: setHeaderTitleInt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InvestmentListActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, view);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        InvestmentListActivity investmentListActivity = (InvestmentListActivity) objArr[0];
        int i = 2 % 2;
        setOptionalIconsVisible setoptionaliconsvisible = (setOptionalIconsVisible) investmentListActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        String string = investmentListActivity.getString(R.string.label_tanamduit);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = investmentListActivity.getString(R.string.label_company_tanamduit);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = investmentListActivity.getString(R.string.label_description_tanamduit);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        setoptionaliconsvisible.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CollectionsKt.listOf(new InvestmentService(1, R.drawable.ic_tanam_duit, string, string2, string3)));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityInvestmentListBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityInvestmentListBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.menu_investasi));
        RecyclerView recyclerView = ((ActivityInvestmentListBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvInvestment;
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        recyclerView.setAdapter((setOptionalIconsVisible) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
        int i2 = TuitionPaymentFragmentbindingInflater1 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 8 / 0;
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $11 + 77;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 19473), 2624 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() + (TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (ViewConfiguration.getTapTimeout() >> 16)), 480 - TextUtils.lastIndexOf("", '0', 0, 0), 36 - TextUtils.indexOf((CharSequence) "", '0', 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-16757744) - Color.rgb(0, 0, 0)), 2624 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Color.red(0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39421 - ((byte) KeyEvent.getModifierMetaStateMask())), 481 - Color.green(0), (ViewConfiguration.getTapTimeout() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $10 + 77;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39423 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 481 - Drawable.resolveOpacity(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr7 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (Color.red(0) + 39422), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 481, 37 - View.resolveSizeAndState(0, 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
            int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0);
            int iCombineMeasuredStates = 15 - View.combineMeasuredStates(0, 0);
            byte[] bArr = $$a;
            short s = bArr[132];
            Object[] objArr2 = new Object[1];
            c(s, (byte) (s & 52), bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter, iIndexOf, iCombineMeasuredStates, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{21084, 35944, 60975, 51454, 10942, 1395, 26427, 16782, 41866, 33373, 64605, 57063, 14464, 6833, 30067, 22317, 45536, 37781, 62071, 11315, 3778, 26753}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.failed_to_get_bank_point).substring(1, 2).length() + 56890, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{21080, 34318, 64226, 12112, 818, 30595, 43107, 40182, 61600, 9483, 6631, 29276, 42528, 39555, 53098}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 54366, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
            int trimmedLength = TextUtils.getTrimmedLength("") + 15;
            short s2 = (short) 51;
            Object[] objArr5 = new Object[1];
            c(s2, (byte) (s2 + 1), $$a[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, keyRepeatTimeout, trimmedLength, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                int trimmedLength2 = 1031 - TextUtils.getTrimmedLength("");
                int iGreen = 15 - Color.green(0);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c((short) (bArr2[1] + 1), bArr2[7], bArr2[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cNormalizeMetaState, trimmedLength2, iGreen, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i2 = ((int[]) objArr7[3])[0];
            int i3 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            int i5 = ~(563908281 | i4);
            int i6 = ((((-455182597) + (((-865972224) | i5) * (-814))) + ((i5 | ((~((~i4) | 319628111)) | 17564169)) * 407)) + (((~(i4 | (-319628112))) | ((~((-563908282) | i4)) | 17564169)) * 407)) - 1522540719;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{21079, 29397, 4953, 13255, 53303, 61692, 37226, 45548, 22034, 30402, 5940, 14247, 54306, 62652, 38182, 47703}, 8328 - ExpandableListView.getPackedPositionChild(0L), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{21076, 5686, 55942, 40734, 17397, 1151, 51411, 36173, 28941, 13755, 65048, 41616, 26442, 11249, 60491, 20697}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 17483, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-408197566};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 46038), (ViewConfiguration.getTapTimeout() >> 16) + 1134, 'B' - AndroidCharacter.getMirror('0'), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1522540719, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                    int iMyPid = (Process.myPid() >> 22) + 1031;
                    int iMyPid2 = 15 - (Process.myPid() >> 22);
                    byte[] bArr3 = $$a;
                    short s3 = bArr3[132];
                    Object[] objArr12 = new Object[1];
                    c(s3, (byte) (s3 & 52), bArr3[7], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iMyPid, iMyPid2, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1116, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                    int i9 = 1031 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int i10 = 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte[] bArr4 = $$a;
                    Object[] objArr13 = new Object[1];
                    c((short) (bArr4[1] + 1), bArr4[7], bArr4[5], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRgb, i9, i10, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{21084, 35944, 60975, 51454, 10942, 1395, 26427, 16782, 41866, 33373, 64605, 57063, 14464, 6833, 30067, 22317, 45536, 37781, 62071, 11315, 3778, 26753}, 56891 - (ViewConfiguration.getEdgeSlop() >> 16), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{21080, 34318, 64226, 12112, 818, 30595, 43107, 40182, 61600, 9483, 6631, 29276, 42528, 39555, 53098}, 54367 - TextUtils.getTrimmedLength(""), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int mode = 1031 - View.MeasureSpec.getMode(0);
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 15;
                        short s4 = (short) 51;
                        Object[] objArr16 = new Object[1];
                        c(s4, (byte) (s4 + 1), $$a[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, mode, capsMode, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iGreen2 = Color.green(0) + 1031;
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 15;
                        byte[] bArr5 = $$a;
                        short s5 = bArr5[132];
                        Object[] objArr17 = new Object[1];
                        c(s5, (byte) (s5 & 52), bArr5[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, iGreen2, offsetBefore, 1357589585, false, (String) objArr17[0], null);
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
        int i11 = ((int[]) objArr[1])[0];
        int i12 = ((int[]) objArr[3])[0];
        if (i12 != i11) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                int i13 = TuitionPaymentFragmentbindingInflater1 + 63;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                for (int i14 = i13 % 2 != 0 ? 0 : 1; i14 < strArr2.length; i14++) {
                    int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
                    TuitionPaymentFragmentbindingInflater1 = i15 % 128;
                    int i16 = i15 % 2;
                    arrayList.add(strArr2[i14]);
                }
            }
            throw new RuntimeException(String.valueOf(i12));
        }
        int i17 = TuitionPaymentFragmentbindingInflater1 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
        int i18 = i17 % 2;
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i19 = ((int[]) objArr[2])[0];
        int i20 = ((int[]) objArr[3])[0];
        int i21 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_backend_liveness_is_not_configured).substring(0, 64).length() + 688319765;
        int i22 = ~(999599614 | length);
        int i23 = i19 + (-160079283) + ((704905552 | i22) * (-476)) + (i22 * 952) + ((~((~length) | 999599614)) * 476);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr18[2])[0] = i25 ^ (i25 << 5);
        int i26 = TuitionPaymentFragmentbindingInflater1 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
        int i27 = i26 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char capsMode2 = (char) (TextUtils.getCapsMode("", 0, 0) + 29944);
            int i28 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1755;
            int deadChar = 23 - KeyEvent.getDeadChar(0, 0);
            byte[] bArr6 = $$a;
            short s6 = (short) (bArr6[1] + 1);
            Object[] objArr19 = new Object[1];
            c(s6, (byte) (s6 & 189), bArr6[7], objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(capsMode2, i28, deadChar, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i29 = TuitionPaymentFragmentbindingInflater1 + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i29 % 128;
            int i30 = i29 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29944);
                int i31 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1756;
                int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 23;
                short s7 = (short) 51;
                Object[] objArr20 = new Object[1];
                c(s7, (byte) (s7 + 1), $$a[7], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(doubleTapTimeout, i31, iIndexOf2, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i32 = (-1466630143) + (((~(811078850 | iIdentityHashCode)) | 1023681276) * (-366)) + (((~(iIdentityHashCode | 1029453566)) | 805306560) * 366) + 1964849998;
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i34 ^ (i34 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(new char[]{21079, 29397, 4953, 13255, 53303, 61692, 37226, 45548, 22034, 30402, 5940, 14247, 54306, 62652, 38182, 47703}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_app_instruction_4).substring(1, 2).length() + 8328, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(new char[]{21076, 5686, 55942, 40734, 17397, 1151, 51411, 36173, 28941, 13755, 65048, 41616, 26442, 11249, 60491, 20697}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 17483, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {-408197566};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 42049), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1726, 29 - ((Process.getThreadPriority(0) + 20) >> 6), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = com.google.firebase.abt.R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 1964849998);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char deadChar2 = (char) (29944 - KeyEvent.getDeadChar(0, 0));
                int defaultSize = 1755 - View.getDefaultSize(0, 0);
                int mirror = AndroidCharacter.getMirror('0') - 25;
                short s8 = (short) 51;
                Object[] objArr25 = new Object[1];
                c(s8, (byte) (s8 + 1), $$a[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(deadChar2, defaultSize, mirror, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{21084, 35944, 60975, 51454, 10942, 1395, 26427, 16782, 41866, 33373, 64605, 57063, 14464, 6833, 30067, 22317, 45536, 37781, 62071, 11315, 3778, 26753}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 56855, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{21080, 34318, 64226, 12112, 818, 30595, 43107, 40182, 61600, 9483, 6631, 29276, 42528, 39555, 53098}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_atm_instruction_6).substring(12, 13).codePointAt(0) + 54259, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cMyPid = (char) ((Process.myPid() >> 22) + 29944);
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1755;
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 23;
                    Object[] objArr28 = new Object[1];
                    c((short) 140, (byte) 52, $$a[7], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cMyPid, packedPositionType, threadPriority, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0'));
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1755;
                    int i35 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23;
                    byte[] bArr7 = $$a;
                    short s9 = (short) (bArr7[1] + 1);
                    Object[] objArr29 = new Object[1];
                    c(s9, (byte) (s9 & 189), bArr7[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cLastIndexOf, minimumFlingVelocity, i35, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i36 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
        int i37 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        if (i37 == i36) {
            int i38 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr30 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int i39 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i40 = i38 + (-423213295) + (((~(362210914 | i39)) | 574623900) * 104) + ((~((~i39) | (-362021475))) * (-104)) + ((i39 | 574813340) * 104);
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArr30[3])[0] = i42 ^ (i42 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
        if (strArr4 != null) {
            int i43 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
            TuitionPaymentFragmentbindingInflater1 = i43 % 128;
            int i44 = i43 % 2;
            for (String str : strArr4) {
                arrayList2.add(str);
            }
        }
        Toast.makeText((Context) null, i37 / (((i37 - 1) * i37) % 2), 0).show();
        int i45 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
        int i46 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        int i47 = (~(63658478 | i46)) | 271851520;
        int i48 = ~i46;
        int i49 = i45 + 687490115 + ((i47 | (~((-59249095) | i48))) * 886) + (((~(i48 | (-63658479))) | 276260904) * (-1772)) + ((~(i48 | 276260904)) * 886);
        int i50 = (i49 << 13) ^ i49;
        int i51 = i50 ^ (i50 >>> 17);
        ((int[]) objArr31[3])[0] = i51 ^ (i51 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
            if (i3 != (-1134047304) + (((~i4) | 537395728) * 1324) + (((~(i4 | (-1602330096))) | (~(772342552 | i4))) * (-1324)) + 1756687024) {
                throw null;
            }
        } else {
            int i5 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            if (i5 != (-1941741040) + (((~(934328826 | i6)) | (-104341284)) * (-948)) + ((~((~i6) | (-525826))) * (-948)) + 1478946172) {
                throw null;
            }
        }
        int i7 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 576813675;
        if (i7 != 645208060 + (((~(2080211509 | i8)) | 67257730) * 104) + ((~((~i8) | (-1783169062))) * (-104)) + ((i8 | 364300178) * 104)) {
            throw null;
        }
        super.onResume();
        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        TuitionPaymentFragmentbindingInflater1 = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ~((int) Process.getStartUptimeMillis());
        if (i4 != (-1193000420) + (((-138879169) | i5) * 494) + (((~(i5 | (-1506262466))) | 1904779051) * 494)) {
            throw null;
        }
        int i6 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
        if (i6 != 1100061850 + (((~((~i7) | 985281491)) | (-2130654172)) * 529) + (((~(i7 | 985281491)) | (-1593774474)) * 529)) {
            int i8 = (-161791164) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i9 = TuitionPaymentFragmentbindingInflater1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1607921886
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.investation.InvestmentListActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(InvestmentListActivity investmentListActivity, InvestmentService investmentService) {
        Unit unit;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(investmentService, "");
        if (i3 == 0) {
            InvestasiConcentActivity.Companion companion = InvestasiConcentActivity.INSTANCE;
            InvestasiConcentActivity.Companion.TuitionPaymentFragmentbindingInflater1(investmentListActivity, investmentService);
            unit = Unit.INSTANCE;
            int i4 = 46 / 0;
        } else {
            InvestasiConcentActivity.Companion companion2 = InvestasiConcentActivity.INSTANCE;
            InvestasiConcentActivity.Companion.TuitionPaymentFragmentbindingInflater1(investmentListActivity, investmentService);
            unit = Unit.INSTANCE;
        }
        int i5 = TuitionPaymentFragmentbindingInflater1 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(InvestmentListActivity investmentListActivity, View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                investmentListActivity.finish();
                ViewPortBuilder.b();
                throw null;
            }
            investmentListActivity.finish();
            ViewPortBuilder.b();
            int i4 = TuitionPaymentFragmentbindingInflater1 + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        final InvestmentListActivity investmentListActivity = (InvestmentListActivity) objArr[0];
        int i = 2 % 2;
        setOptionalIconsVisible setoptionaliconsvisible = new setOptionalIconsVisible(investmentListActivity, null, new Function1() { // from class: setGroupVisible
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentListActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (InvestmentService) obj);
            }
        }, 2, null);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return setoptionaliconsvisible;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ setOptionalIconsVisible TuitionPaymentFragmentspecialinlinedviewModeldefault2(InvestmentListActivity investmentListActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (setOptionalIconsVisible) TuitionPaymentFragmentbindingInflater1(AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{investmentListActivity}, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 712938545, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -712938545);
    }

    static {
        d = 0;
        d();
        INSTANCE = new Companion(null);
        int i = g + 121;
        d = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_investment_list;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 40 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this}, SalariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$sharedViewModel$default$1.b(), 363429557, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -363429556);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int iB = SalariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$sharedViewModel$default$1.b();
        TuitionPaymentFragmentbindingInflater1(SalariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$sharedViewModel$default$1.b(), new Object[]{this}, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 285095518, iB, SalariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$sharedViewModel$default$1.b(), -285095516);
    }

    static void d() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1056124121021547738L;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        InvestmentListActivity investmentListActivity = (InvestmentListActivity) objArr[0];
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }
}
