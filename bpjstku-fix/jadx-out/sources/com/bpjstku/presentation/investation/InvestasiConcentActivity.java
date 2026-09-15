package com.bpjstku.presentation.investation;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.syariah.model.response.SyariahFaqResponse;
import com.bpjstku.databinding.ActivityInvestasiConcentBinding;
import com.bpjstku.databinding.ActivityLoginBinding;
import com.bpjstku.domain.investment.model.InvestmentService;
import com.bpjstku.presentation.investation.InvestasiConcentActivity;
import com.bpjstku.presentation.util.WebviewCustomActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.measurement.zzdm;
import com.google.android.material.button.MaterialButton;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ViewPortBuilder;
import defpackage.abortCapture;
import defpackage.cacheInteropConfig;
import defpackage.generateCameraId;
import defpackage.getMaxImages;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/bpjstku/presentation/investation/InvestasiConcentActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityInvestasiConcentBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lcom/bpjstku/domain/investment/model/InvestmentService;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/domain/investment/model/InvestmentService;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InvestasiConcentActivity extends BindingBaseActivity<ActivityInvestasiConcentBinding> {
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f492a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private InvestmentService TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {17, 104, 102, -28};
    private static final int $$f = 226;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {7, 15, 25, 25, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 147;
    private static int asInterface = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = ~i;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i5 | i);
        int i12 = (~(i | i5)) | (~(i7 | i9)) | i8;
        int i13 = i2 + i5 + i6 + (62936680 * i4) + ((-2032430997) * i3);
        int i14 = i13 * i13;
        int i15 = ((-476632153) * i2) + 797966336 + (1756943451 * i5) + (i10 * (-1030695846)) + ((-1030695846) * i11) + (1030695846 * i12) + ((-1507328000) * i6) + ((-264241152) * i4) + ((-222822400) * i3) + (2040594432 * i14);
        int i16 = ((i2 * 1175661207) - 43826732) + (i5 * 1175659659) + (i10 * (-774)) + (i11 * (-774)) + (i12 * 774) + (i6 * 1175660433) + (i4 * 1188219112) + (i3 * (-816965221)) + (i14 * 1798373376);
        return i15 + ((i16 * i16) * 914292736) != 1 ? b(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = r8 + 1
            byte[] r0 = com.bpjstku.presentation.investation.InvestasiConcentActivity.$$a
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L2e
        L12:
            r3 = r2
        L13:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r6 = r6 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.investation.InvestasiConcentActivity.c(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.investation.InvestasiConcentActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/investation/InvestasiConcentActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/domain/investment/model/InvestmentService;", "p1", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;Lcom/bpjstku/domain/investment/model/InvestmentService;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(Context p0, InvestmentService p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intent intent = new Intent(p0, (Class<?>) InvestasiConcentActivity.class);
            intent.putExtra("invest", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityInvestasiConcentBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            InvestasiConcentActivity$bindingInflater$1 investasiConcentActivity$bindingInflater$1 = InvestasiConcentActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
            throw null;
        }
        InvestasiConcentActivity$bindingInflater$1 investasiConcentActivity$bindingInflater$2 = InvestasiConcentActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        return investasiConcentActivity$bindingInflater$2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivityInvestasiConcentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).activityInvestasionAgree;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setDefaultShowAsAction
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestasiConcentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (View) obj);
            }
        }));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        InvestmentService investmentService;
        InvestasiConcentActivity investasiConcentActivity = (InvestasiConcentActivity) objArr[0];
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = investasiConcentActivity.getIntent();
        if (intent != null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            investmentService = (InvestmentService) intent.getParcelableExtra("invest");
        } else {
            investmentService = null;
        }
        investasiConcentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = investmentService;
        return null;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $11 + 21;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 64838), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1356, 38 - TextUtils.indexOf("", "", 0, 0), 894276454, false, $$i(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 468, 13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $10 + 29;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        TuitionPaymentFragmentbindingInflater1(((ActivityInvestasiConcentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityInvestasiConcentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.menu_investasi));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:5:0x0016, B:12:0x0037, B:11:0x0030, B:9:0x0027), top: B:20:0x0011 }] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                int i3 = 68 / 0;
                if (p0.getItemId() == 16908332) {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            } else {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                if (p0.getItemId() == 16908332) {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 48 / 0;
            }
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29944);
            int iIndexOf = 1754 - TextUtils.indexOf((CharSequence) "", '0', 0);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 23;
            byte[] bArr = $$a;
            byte b = bArr[7];
            short s = bArr[5];
            Object[] objArr2 = new Object[1];
            c(b, s, (byte) (s & 37), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iIndexOf, longPressTimeout, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char scrollDefaultDelay = (char) (29944 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1755;
                int mode = 23 - View.MeasureSpec.getMode(0);
                byte b2 = $$a[7];
                short s2 = (short) (b2 | 36);
                Object[] objArr3 = new Object[1];
                c(b2, s2, (byte) (s2 | 16), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay, threadPriority, mode, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i2 = (-1144866607) + (((~(667081616 | iIdentityHashCode)) | 271327306) * 336) + ((58724880 | (~(iIdentityHashCode | 879684042))) * (-168)) + (((~((~iIdentityHashCode) | 879684042)) | 667081616) * 168) + 1292956536;
            int i3 = (i2 << 13) ^ i2;
            int i4 = i3 ^ (i3 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i4 ^ (i4 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{61467, 39507, 3195, 61553, 48709, 19162, 44509, 52380, 45973, 36535, 59754, 2163, 30524, 49749, 9528, 18372, 14984, 495, 24750, 33712}, 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{42254, 49671, 13708, 42343, 61594, 4747, 37945, 33356, 59098, 55014, 53384, 18107, 8710, 39502, 7407, 2314, 28589, 22944, 22872, 52583}, TextUtils.getOffsetAfter("", 0), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-1599421817};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 42049), (ViewConfiguration.getEdgeSlop() >> 16) + 1726, 29 - (ViewConfiguration.getLongPressTimeout() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = ActivityLoginBinding.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 1292956536);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29944);
                    int iGreen = Color.green(0) + 1755;
                    int iArgb = 23 - Color.argb(0, 0, 0, 0);
                    byte b3 = $$a[7];
                    short s3 = (short) (b3 | 36);
                    Object[] objArr8 = new Object[1];
                    c(b3, s3, (byte) (s3 | 16), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iGreen, iArgb, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{60507, 27593, 28062, 60474, 58417, 47951, 52266, 38651, 44948, 32552, 34954, 21063, 27508, 13202, 17568, 7578, 9922, 61554, 346, 55756, 58038, 46306, 56738, 25958, 48664, 18602}, (-1) - TextUtils.indexOf((CharSequence) "", '0'), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{40017, 36189, 8344, 39988, 48501, 24025, 33065, 53181, 57218, 39344, 50572, 2943, 7028, 54548, 2532, 17657, 22232, 5880, 19533}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.card_detail_title).substring(8, 9).length() - 1, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char defaultSize = (char) (View.getDefaultSize(0, 0) + 29944);
                        int i5 = 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iAxisFromString = 22 - MotionEvent.axisFromString("");
                        byte b4 = $$a[7];
                        Object[] objArr11 = new Object[1];
                        c(b4, (short) (b4 | 88), (byte) 52, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize, i5, iAxisFromString, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char size = (char) (View.MeasureSpec.getSize(0) + 29944);
                        int i6 = 1756 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int i7 = 23 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        byte[] bArr2 = $$a;
                        byte b5 = bArr2[7];
                        short s4 = bArr2[5];
                        Object[] objArr12 = new Object[1];
                        c(b5, s4, (byte) (s4 & 37), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(size, i6, i7, 986134021, false, (String) objArr12[0], null);
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
        int i8 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i9 == i8) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int iNextInt = new Random().nextInt(1914775614);
            int i13 = (~(160637227 | iNextInt)) | 371985988;
            int i14 = ~iNextInt;
            int i15 = i12 + 758967197 + ((i13 | (~((-159383563) | i14))) * 886) + (((~(i14 | (-160637228))) | 373239653) * (-1772)) + ((~(i14 | 373239653)) * 886);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr13[3])[0] = i17 ^ (i17 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i9];
            int i18 = i9 - 1;
            iArr[i18] = 1;
            Toast.makeText((Context) null, iArr[((i9 * i18) % 2) - 1], 1).show();
            int i19 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int i20 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i21 = i19 + 1878469249 + ((215479246 | i20) * 376) + (((~((~i20) | 1019873556)) | 1438410) * (-376)) + (((~(i20 | (-1019873557))) | (-807271131)) * 376);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr14[3])[0] = i23 ^ (i23 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
            int deadChar = 15 - KeyEvent.getDeadChar(0, 0);
            byte b6 = $$a[7];
            Object[] objArr15 = new Object[1];
            c(b6, (short) (b6 | 140), (byte) 52, objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(windowTouchSlop, doubleTapTimeout, deadChar, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new char[]{60507, 27593, 28062, 60474, 58417, 47951, 52266, 38651, 44948, 32552, 34954, 21063, 27508, 13202, 17568, 7578, 9922, 61554, 346, 55756, 58038, 46306, 56738, 25958, 48664, 18602}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new char[]{40017, 36189, 8344, 39988, 48501, 24025, 33065, 53181, 57218, 39344, 50572, 2943, 7028, 54548, 2532, 17657, 22232, 5880, 19533}, View.MeasureSpec.getMode(0), objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cRed = (char) Color.red(0);
            int iMyPid = 1031 - (Process.myPid() >> 22);
            int i24 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14;
            byte b7 = $$a[7];
            short s5 = (short) (b7 | 36);
            Object[] objArr18 = new Object[1];
            c(b7, s5, (byte) (s5 | 16), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cRed, iMyPid, i24, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25 % 128;
            int i26 = i25 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cGreen = (char) Color.green(0);
                int i27 = 1030 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 16;
                byte[] bArr3 = $$a;
                Object[] objArr19 = new Object[1];
                c(bArr3[28], (short) DerHeader.TAG_CLASS_PRIVATE, bArr3[7], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cGreen, i27, modifierMetaStateMask, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i28 = ((int[]) objArr20[3])[0];
            int i29 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indomaret_instruction_step5).substring(1, 7).codePointAt(5) + 804174005;
            int i30 = ~iCodePointAt;
            int i31 = (((106353603 + (((~(694114638 | i30)) | (~((-938394809) | iCodePointAt))) * 1900)) + (((~(i30 | 938394808)) | (~(iCodePointAt | (-694114639)))) * (-950))) + (((~(iCodePointAt | 938394808)) | (~(i30 | (-694114639)))) * 950)) - 663326284;
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr[2])[0] = i33 ^ (i33 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new char[]{61467, 39507, 3195, 61553, 48709, 19162, 44509, 52380, 45973, 36535, 59754, 2163, 30524, 49749, 9528, 18372, 14984, 495, 24750, 33712}, ViewConfiguration.getJumpTapTimeout() >> 16, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new char[]{42254, 49671, 13708, 42343, 61594, 4747, 37945, 33356, 59098, 55014, 53384, 18107, 8710, 39502, 7407, 2314, 28589, 22944, 22872, 52583}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-1599421817};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46039 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 1134 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 17, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -663326284, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int iMakeMeasureSpec = 1031 - View.MeasureSpec.makeMeasureSpec(0, 0);
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 15;
                byte b8 = $$a[7];
                Object[] objArr25 = new Object[1];
                c(b8, (short) (b8 | 140), (byte) 52, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(windowTouchSlop2, iMakeMeasureSpec, packedPositionGroup, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - TextUtils.lastIndexOf("", '0', 0)), 1117 - TextUtils.getOffsetAfter("", 0), 16 - ((byte) KeyEvent.getModifierMetaStateMask())), Boolean.TYPE});
            }
            Object[] objArr26 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 1032;
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 15;
                byte[] bArr4 = $$a;
                Object[] objArr27 = new Object[1];
                c(bArr4[28], (short) DerHeader.TAG_CLASS_PRIVATE, bArr4[7], objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(bitsPerPixel, iIndexOf2, iMakeMeasureSpec2, 632103528, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr26);
            try {
                Object[] objArr28 = new Object[1];
                e(new char[]{60507, 27593, 28062, 60474, 58417, 47951, 52266, 38651, 44948, 32552, 34954, 21063, 27508, 13202, 17568, 7578, 9922, 61554, 346, 55756, 58038, 46306, 56738, 25958, 48664, 18602}, KeyEvent.normalizeMetaState(0), objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(new char[]{40017, 36189, 8344, 39988, 48501, 24025, 33065, 53181, 57218, 39344, 50572, 2943, 7028, 54548, 2532, 17657, 22232, 5880, 19533}, Drawable.resolveOpacity(0, 0), objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                    int mode2 = View.MeasureSpec.getMode(0) + 1031;
                    int iArgb2 = 15 - Color.argb(0, 0, 0, 0);
                    byte b9 = $$a[7];
                    short s6 = (short) (b9 | 36);
                    Object[] objArr30 = new Object[1];
                    c(b9, s6, (byte) (s6 | 16), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf, mode2, iArgb2, 1344079056, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                    int i34 = 1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int iNormalizeMetaState = 15 - KeyEvent.normalizeMetaState(0);
                    byte b10 = $$a[7];
                    Object[] objArr31 = new Object[1];
                    c(b10, (short) (b10 | 140), (byte) 52, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(offsetAfter, i34, iNormalizeMetaState, 1357589585, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr = objArr26;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i35 = ((int[]) objArr[1])[0];
        int i36 = ((int[]) objArr[3])[0];
        if (i36 != i35) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str2 : strArr3) {
                    arrayList2.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i36));
        }
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i37 = ((int[]) objArr[2])[0];
        int i38 = ((int[]) objArr[3])[0];
        int i39 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i40 = i37 + (-2140082559) + (((~(452136777 | startElapsedRealtime)) | 553676978) * 336) + (((~(startElapsedRealtime | 696416947)) | 309396808) * (-168)) + (((~((~startElapsedRealtime) | 696416947)) | 452136777) * 168);
        int i41 = (i40 << 13) ^ i40;
        int i42 = i41 ^ (i41 >>> 17);
        ((int[]) objArr32[2])[0] = i42 ^ (i42 << 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00be, code lost:
    
        if (r1 != ((((-1265652612) + (((~(r3 | 327348091)) | ((~(2043259422 | r3)) | (-2076962688))) * 464)) + (((-33703266) | r2) * (-464))) + (((~(r2 | 327348091)) | (-2076962688)) * 464))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c0, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.investation.InvestasiConcentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        com.bpjstku.presentation.investation.InvestasiConcentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00cc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d4, code lost:
    
        throw new java.lang.RuntimeException("841576556");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00dc, code lost:
    
        throw new java.lang.RuntimeException("2122951397");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
    
        if (r1 == (((-1249171351) + (r4 * 495)) + (((~r4) | 243794482) * 495))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008b, code lost:
    
        if (r1 == ((((-1718808584) + (((~(r4 | (-1261135654))) | ((~((-277907531) | r5)) | 1107895073)) * (-68))) + ((~((-153240581) | r5)) * (-68))) + (((~(1261135653 | r5)) | (-431148111)) * 68))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008d, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r8);
        r3 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.investation.InvestasiConcentActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            int i5 = ~i4;
            if (i3 != (-1530675584) + (((~(1043598219 | i5)) | 213610676) * 226) + (((~(i5 | 1052736447)) | (~((-213610677) | i4)) | 204472448) * (-113)) + ((~(i4 | 1043598219)) * 113)) {
                throw null;
            }
        } else {
            int i6 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i7 = ~iFreeMemory;
            if (i6 != ((((~(i7 | (-1852627332))) | ((~((-1022639789) | i7)) | 744757376)) * (-397)) - 1126176488) + ((iFreeMemory | (-1385752368)) * 397)) {
                throw null;
            }
        }
        int i8 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        if (i8 != 1897003192 + (((~((~startUptimeMillis) | (-449579169))) | (-2129476797)) * (-591)) + ((startUptimeMillis | (-449579169)) * 591)) {
            int i9 = (-977504654) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
        int i11 = i10 % 2;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1359298720
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.reflect.Member[] r1 = defpackage.cacheInteropConfig.b
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
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.mcc
            r5 = 593267661(0x235c8bcd, float:1.1955828E-17)
            r4 = r4 | r5
            int r4 = ~r4
            r5 = -2005511530(0xffffffff88765296, float:-7.412501E-34)
            r5 = r5 | r4
            int r5 = r5 * (-658)
            r6 = -1502225296(0xffffffffa675dc70, float:-8.53002E-16)
            int r5 = r5 + r6
            r6 = -2011017198(0xffffffff88225012, float:-4.8844224E-34)
            r4 = r4 | r6
            int r4 = r4 * 658
            int r5 = r5 + r4
            if (r1 == r5) goto L7a
            int r1 = com.bpjstku.presentation.investation.InvestasiConcentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 75
            int r4 = r1 % 128
            com.bpjstku.presentation.investation.InvestasiConcentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r4
            int r1 = r1 % r0
            r4 = -1
            r5 = -1359298721(0xffffffffaefabf5f, float:-1.1402678E-10)
            r6 = -1359298720(0xffffffffaefabf60, float:-1.1402679E-10)
            r7 = 1
            if (r1 == 0) goto L69
            int[] r1 = new int[r6]
            r1[r5] = r2
            r1 = r1[r4]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r7)
            r1.show()
            goto L7a
        L69:
            int[] r1 = new int[r6]
            r1[r5] = r7
            r5 = 664118432(0x2795a4a0, float:4.1534294E-15)
            int r5 = r5 % r0
            r1 = r1[r4]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r7)
            r1.show()
        L7a:
            java.lang.reflect.Member[] r1 = defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r2 = java.lang.System.identityHashCode(r8)
            int r3 = ~r2
            r4 = -1934545955(0xffffffff8cb12bdd, float:-2.7297567E-31)
            r4 = r4 | r3
            int r4 = ~r4
            r5 = -644510011(0xffffffffd9958ec5, float:-5.2620935E15)
            r4 = r4 | r5
            r6 = 1934545954(0x734ed422, float:1.6386653E31)
            r6 = r6 | r2
            int r6 = ~r6
            r4 = r4 | r6
            int r4 = r4 * (-564)
            r6 = 14888060(0xe32c7c, float:2.0862616E-38)
            int r6 = r6 + r4
            r4 = -69214489(0xfffffffffbdfdee7, float:-2.3248064E36)
            r2 = r2 | r4
            int r2 = ~r2
            int r2 = r2 * 1128
            int r6 = r6 + r2
            r2 = r5 | r3
            int r2 = ~r2
            r3 = -2003760443(0xffffffff88910ac5, float:-8.729402E-34)
            r2 = r2 | r3
            int r2 = r2 * 564
            int r6 = r6 + r2
            if (r1 != r6) goto Lbf
            super.onCreate(r9)
            int r9 = com.bpjstku.presentation.investation.InvestasiConcentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r9 = r9 + 11
            int r1 = r9 % 128
            com.bpjstku.presentation.investation.InvestasiConcentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1
            int r9 = r9 % r0
            return
        Lbf:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r0 = "583568704"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.investation.InvestasiConcentActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(InvestasiConcentActivity investasiConcentActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        InvestmentService investmentService = investasiConcentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (investmentService != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 == 0 ? investmentService.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == 1 : investmentService.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == 0) {
                getMaxImages getmaximages = getMaxImages.INSTANCE;
                String strMediaBrowserCompatMediaBrowserImplApi215 = getMaxImages.MediaBrowserCompatMediaBrowserImplApi215();
                WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
                String string = investasiConcentActivity.getString(R.string.menu_investasi);
                Intrinsics.checkNotNullExpressionValue(string, "");
                WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(investasiConcentActivity, strMediaBrowserCompatMediaBrowserImplApi215, string, 0, null, false, 56);
                investasiConcentActivity.d_();
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    static {
        f492a = 0;
        d();
        INSTANCE = new Companion(null);
        int i = asInterface + 49;
        f492a = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_investasi_concent;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 1180774272;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iCodePointAt, 1244986979, zzdm.b(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, -1244986978, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 1162971877;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1048630466, zzdm.b(), SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, 1048630466, iCodePointAt);
    }

    static void d() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -415584840705820018L;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        InvestasiConcentActivity investasiConcentActivity = (InvestasiConcentActivity) objArr[0];
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            return null;
        }
        int i4 = 17 / 0;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r5, int r6, short r7) {
        /*
            int r5 = r5 * 4
            int r5 = 107 - r5
            int r6 = r6 * 4
            int r0 = 1 - r6
            byte[] r1 = com.bpjstku.presentation.investation.InvestasiConcentActivity.$$c
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L18
            r4 = r6
            r3 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
        L28:
            int r4 = -r4
            int r5 = r5 + r4
            int r7 = r7 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.investation.InvestasiConcentActivity.$$i(byte, int, short):java.lang.String");
    }
}
