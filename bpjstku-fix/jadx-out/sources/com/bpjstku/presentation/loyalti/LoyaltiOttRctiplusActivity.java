package com.bpjstku.presentation.loyalti;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Bundle;
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
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityLayoutOttRctiPlusBinding;
import com.bpjstku.databinding.ItemProgramChosenBinding;
import com.bpjstku.presentation.loyalti.LoyaltiOttRctiplusActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityMenu;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ViewPortBuilder;
import defpackage.getRealtimeCaptureLatency;
import defpackage.getSessionStateCallback;
import defpackage.initSession;
import defpackage.withType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000b\u0010\u0004J!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00020\u001a8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/bpjstku/presentation/loyalti/LoyaltiOttRctiplusActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityLayoutOttRctiPlusBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "cancelAll", "", "p0", "Landroid/view/KeyEvent;", "p1", "", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "Landroid/view/MenuItem;", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Landroid/os/Bundle;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Landroid/os/Bundle;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoyaltiOttRctiplusActivity extends BindingBaseActivity<ActivityLayoutOttRctiPlusBinding> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f494a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private Bundle TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$a = {27, -8, 5, 78, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 35;
    private static int g = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int b = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = (~(i7 | i8)) | (~(i7 | i2)) | (~(i8 | i2));
        int i10 = ~(i6 | i7);
        int i11 = i2 | i10 | (~(i8 | i5));
        int i12 = i2 + i5 + i + (1997535707 * i3) + (1930545336 * i4);
        int i13 = i12 * i12;
        int i14 = ((-1352905585) * i2) + 1468203008 + ((-417352845) * i5) + (i9 * 1679707278) + (1679707278 * i10) + ((-1679707278) * i11) + (1262354432 * i) + ((-1408630784) * i3) + ((-2070937600) * i4) + (392888320 * i13);
        int i15 = (i2 * (-2054695253)) + 138751921 + (i5 * (-2054693473)) + (i9 * (-890)) + (i10 * (-890)) + (i11 * 890) + (i * (-2054694363)) + (i3 * 1502648999) + (i4 * 931574424) + (i13 * (-2139684864));
        int i16 = i14 + (i15 * i15 * (-174260224));
        if (i16 != 1) {
            if (i16 != 2) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            }
            int i17 = 2 % 2;
            int i18 = b + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
            int i19 = i18 % 2;
            LoyaltiOttRctiplusActivity$bindingInflater$1 loyaltiOttRctiplusActivity$bindingInflater$1 = LoyaltiOttRctiplusActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
            b = i20 % 128;
            int i21 = i20 % 2;
            return loyaltiOttRctiplusActivity$bindingInflater$1;
        }
        LoyaltiOttRctiplusActivity loyaltiOttRctiplusActivity = (LoyaltiOttRctiplusActivity) objArr[0];
        int i22 = 2 % 2;
        int i23 = b + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 % 128;
        int i24 = i23 % 2;
        LoyaltiOttRctiplusActivity loyaltiOttRctiplusActivity2 = loyaltiOttRctiplusActivity;
        Intrinsics.checkNotNullParameter(loyaltiOttRctiplusActivity2, "");
        loyaltiOttRctiplusActivity2.getWindow().addFlags(8192);
        loyaltiOttRctiplusActivity.TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityLayoutOttRctiPlusBinding) ((ViewBinding) loyaltiOttRctiplusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityLayoutOttRctiPlusBinding) ((ViewBinding) loyaltiOttRctiplusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(loyaltiOttRctiplusActivity.getString(R.string.title_mnc_rcti));
        int i25 = b + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25 % 128;
        int i26 = i25 % 2;
        return null;
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
    private static void c(short r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.presentation.loyalti.LoyaltiOttRctiplusActivity.$$a
            int r9 = 145 - r9
            int r8 = 53 - r8
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            r6 = r9
            r9 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2b:
            int r9 = r9 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.loyalti.LoyaltiOttRctiplusActivity.c(short, short, short, java.lang.Object[]):void");
    }

    public static final /* synthetic */ ActivityLayoutOttRctiPlusBinding b(LoyaltiOttRctiplusActivity loyaltiOttRctiplusActivity) {
        int i = 2 % 2;
        int i2 = b + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return (ActivityLayoutOttRctiPlusBinding) ((ViewBinding) loyaltiOttRctiplusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        }
        int i3 = 92 / 0;
        return (ActivityLayoutOttRctiPlusBinding) ((ViewBinding) loyaltiOttRctiplusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.loyalti.LoyaltiOttRctiplusActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/loyalti/LoyaltiOttRctiplusActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            p0.startActivity(new Intent(p0, (Class<?>) LoyaltiOttRctiplusActivity.class));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        Button button = ((ActivityLayoutOttRctiPlusBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnTryAgain;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setQwertyMode
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoyaltiOttRctiplusActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
        int i2 = b + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        cancelAll();
        ActivityLayoutOttRctiPlusBinding activityLayoutOttRctiPlusBinding = (ActivityLayoutOttRctiPlusBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityLayoutOttRctiPlusBinding.webView.setWebChromeClient(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityLayoutOttRctiPlusBinding));
        new WebViewClient();
        ((ActivityLayoutOttRctiPlusBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.setVisibility(0);
        ((ActivityLayoutOttRctiPlusBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.loadUrl("https://m.rctiplus.com?utm_source=bpjs&utm_medium=bpjs&utm_campaign=bpjs&utm_id=bpsjs");
        cancelAll();
        ActivityLayoutOttRctiPlusBinding activityLayoutOttRctiPlusBinding2 = (ActivityLayoutOttRctiPlusBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityLayoutOttRctiPlusBinding2.webView.setWebChromeClient(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityLayoutOttRctiPlusBinding2));
        new WebViewClient();
        ((ActivityLayoutOttRctiPlusBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.setVisibility(0);
        ((ActivityLayoutOttRctiPlusBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.loadUrl("https://m.rctiplus.com?utm_source=bpjs&utm_medium=bpjs&utm_campaign=bpjs&utm_id=bpsjs");
        Unit unit = Unit.INSTANCE;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        b = i2 % 128;
        int i3 = i2 % 2;
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
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 19473), Color.argb(0, 0, 0, 0) + 2624, 13 - KeyEvent.normalizeMetaState(0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - View.MeasureSpec.makeMeasureSpec(0, 0)), 480 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 37 - View.MeasureSpec.makeMeasureSpec(0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        int i4 = $10 + 55;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $11 + 107;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.rgb(0, 0, 0) + 16816638), TextUtils.getCapsMode("", 0, 0) + 481, (-16777179) - Color.rgb(0, 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends WebViewClient {
        private /* synthetic */ ActivityLayoutOttRctiPlusBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private /* synthetic */ LoyaltiOttRctiplusActivity b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivityLayoutOttRctiPlusBinding activityLayoutOttRctiPlusBinding, LoyaltiOttRctiplusActivity loyaltiOttRctiplusActivity) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = activityLayoutOttRctiPlusBinding;
            this.b = loyaltiOttRctiplusActivity;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.webView.loadUrl("about:blank");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.webView.setVisibility(8);
            LoyaltiOttRctiplusActivity.b(this.b).containerError.setVisibility(0);
        }
    }

    private final void cancelAll() {
        int i = 2 % 2;
        ActivityLayoutOttRctiPlusBinding activityLayoutOttRctiPlusBinding = (ActivityLayoutOttRctiPlusBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityLayoutOttRctiPlusBinding.webView.getSettings().setJavaScriptEnabled(true);
        activityLayoutOttRctiPlusBinding.webView.getSettings().setLoadWithOverviewMode(true);
        activityLayoutOttRctiPlusBinding.webView.getSettings().setUseWideViewPort(true);
        activityLayoutOttRctiPlusBinding.webView.getSettings().setDomStorageEnabled(true);
        activityLayoutOttRctiPlusBinding.webView.getSettings().setMixedContentMode(0);
        activityLayoutOttRctiPlusBinding.webView.setWebViewClient(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(activityLayoutOttRctiPlusBinding, this));
        int i2 = b + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends WebChromeClient {
        private /* synthetic */ ActivityLayoutOttRctiPlusBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivityLayoutOttRctiPlusBinding activityLayoutOttRctiPlusBinding) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = activityLayoutOttRctiPlusBinding;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            Intrinsics.checkNotNullParameter(webView, "");
            super.onProgressChanged(webView, i);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.progressBar.setProgress(i);
            if (i < 100 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.progressBar.getVisibility() == 8) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.progressBar.setVisibility(0);
            }
            if (i == 100) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.progressBar.setVisibility(8);
            }
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            withType.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0] = Class.forName("Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda13").getDeclaredField("TuitionPaymentFragmentspecialinlinedviewModeldefault3");
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        LoyaltiOttRctiplusActivity loyaltiOttRctiplusActivity = (LoyaltiOttRctiplusActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        KeyEvent keyEvent = (KeyEvent) objArr[2];
        int i = 2 % 2;
        int i2 = b + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0 ? iIntValue == 4 : iIntValue == 4) {
            if (((ActivityLayoutOttRctiPlusBinding) ((ViewBinding) loyaltiOttRctiplusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.canGoBack()) {
                ((ActivityLayoutOttRctiPlusBinding) ((ViewBinding) loyaltiOttRctiplusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.goBack();
                int i3 = b + 111;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                if (i3 % 2 == 0) {
                    return true;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        boolean zOnKeyDown = super.onKeyDown(iIntValue, keyEvent);
        int i4 = b + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zOnKeyDown);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = b + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
                b = i3 % 128;
                if (i3 % 2 == 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    int i4 = 18 / 0;
                } else {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrB$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 1032;
            int iArgb = Color.argb(0, 0, 0, 0) + 15;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            c(b2, b3, (short) (b3 | 141), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iLastIndexOf, iArgb, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{34139, 44473, 54404, 65423, 9953, 18930, 28880, 39791, 49725, 62748, 7254, 18246, 28255, 37184, 47544, 57532, 2951, 12996, 26108, 36034, 47069, 56864}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 10371, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{34143, 11563, 54689, 31805, 9405, 53038, 30640, 7683, 50871, 26942, 4532, 47121, 24719, 2830, 45961}, (ViewConfiguration.getLongPressTimeout() >> 16) + 43133, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            int iGreen = Color.green(0) + 1031;
            int iMyTid = (Process.myTid() >> 22) + 15;
            byte b4 = $$a[7];
            byte b5 = b4;
            Object[] objArr5 = new Object[1];
            c(b4, b5, (short) (b5 | 89), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iGreen, iMyTid, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c3 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iAxisFromString = 1030 - MotionEvent.axisFromString("");
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 15;
                Object[] objArr6 = new Object[1];
                c($$a[132], (byte) 52, (short) ($$b + 2), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, iAxisFromString, windowTouchSlop, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i2 = ((int[]) objArr7[3])[0];
            int i3 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            int i5 = (-712064347) + (((~((-41981449) | i4)) | 286261618) * (-756)) + (((~i4) | (-41981449)) * 756) + 1860265957;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[2])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{34128, 17214, 2438, 54900, 40064, 23215, 8965, 59799, 46709, 31897, 15003, 788, 51701, 38511, 23769, 6844}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 50778, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{34131, 61641, 28273, 58769, 21266, 52896, 17604, 45666, 10698, 42772, 4783, 34863, 1645, 32254, 60188, 26246}, 30103 - Color.blue(0), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1973537276};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 46038), TextUtils.lastIndexOf("", '0', 0, 0) + 1135, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1860265957, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int iRgb = Color.rgb(0, 0, 0) + 16778247;
                    int i8 = 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte b6 = $$a[7];
                    byte b7 = b6;
                    Object[] objArr12 = new Object[1];
                    c(b6, b7, (short) (b7 | 141), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatDelay, iRgb, i8, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.normalizeMetaState(0) + 45993), (ViewConfiguration.getTouchSlop() >> 8) + 1117, 17 - View.resolveSize(0, 0)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1031;
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 15;
                    Object[] objArr13 = new Object[1];
                    c($$a[132], (byte) 52, (short) ($$b + 2), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(jumpTapTimeout, maxKeyCode, offsetAfter, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{34139, 44473, 54404, 65423, 9953, 18930, 28880, 39791, 49725, 62748, 7254, 18246, 28255, 37184, 47544, 57532, 2951, 12996, 26108, 36034, 47069, 56864}, 10476 - Process.getGidForName(""), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{34143, 11563, 54689, 31805, 9405, 53038, 30640, 7683, 50871, 26942, 4532, 47121, 24719, 2830, 45961}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 43097, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char jumpTapTimeout2 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int i9 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1031;
                        int iKeyCodeFromString = 15 - KeyEvent.keyCodeFromString("");
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr16 = new Object[1];
                        c(b8, b9, (short) (b9 | 89), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(jumpTapTimeout2, i9, iKeyCodeFromString, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                        int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int trimmedLength = 15 - TextUtils.getTrimmedLength("");
                        byte b10 = $$a[7];
                        byte b11 = b10;
                        Object[] objArr17 = new Object[1];
                        c(b10, b11, (short) (b11 | 141), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(bitsPerPixel, iIndexOf, trimmedLength, 1357589585, false, (String) objArr17[0], null);
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
        if (i11 != i10) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                int i12 = 0;
                while (i12 < strArr2.length) {
                    arrayList.add(strArr2[i12]);
                    i12++;
                    int i13 = b + 79;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                    int i14 = i13 % 2;
                }
            }
            int[] iArr = new int[i11];
            int i15 = i11 - 1;
            iArr[i15] = 1;
            Toast.makeText((Context) null, iArr[((i11 * i15) % 2) - 1], 1).show();
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[3])[0];
            int i18 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i19 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i20 = ~((-534135948) | (~i19));
            int i21 = i16 + (((-534175148) | i20 | (~(534135947 | i19))) * (-338)) + 81706577 + (((~(i19 | (-39201))) | i20) * 338);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr18[2])[0] = i23 ^ (i23 << 5);
        } else {
            int i24 = b + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i24 % 128;
            int i25 = i24 % 2;
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[3])[0];
            int i28 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i29 = i26 + 1739211802 + (((~((-119771189) | (~iIdentityHashCode))) | (-124508982)) * (-591)) + ((iIdentityHashCode | (-119771189)) * 591);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr19[2])[0] = i31 ^ (i31 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char scrollBarSize = (char) (29944 - (ViewConfiguration.getScrollBarSize() >> 8));
            int iMyPid = (Process.myPid() >> 22) + 1755;
            int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 24;
            byte b12 = $$a[7];
            Object[] objArr20 = new Object[1];
            c(b12, (byte) (b12 | 15), (short) ($$b + 2), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(scrollBarSize, iMyPid, bitsPerPixel2, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char doubleTapTimeout = (char) (29944 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                int iResolveSize = 1755 - View.resolveSize(0, 0);
                int threadPriority = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                byte b13 = $$a[7];
                byte b14 = b13;
                Object[] objArr21 = new Object[1];
                c(b13, b14, (short) (b14 | 89), objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(doubleTapTimeout, iResolveSize, threadPriority, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrB$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int i32 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i33 = ~i32;
            int i34 = (((1958332176 + (((~(107649550 | i33)) | 320251976) * 226)) + (((~(i33 | 394181198)) | ((~((-320251977) | i32)) | 33720328)) * (-113))) + ((~(i32 | 107649550)) * 113)) - 1826602124;
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i36 ^ (i36 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{34128, 17214, 2438, 54900, 40064, 23215, 8965, 59799, 46709, 31897, 15003, 788, 51701, 38511, 23769, 6844}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellTargetedBrandTitle).substring(0, 14).length() + 50775, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{34131, 61641, 28273, 58769, 21266, 52896, 17604, 45666, 10698, 42772, 4783, 34863, 1645, 32254, 60188, 26246}, 30103 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {1973537276};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 42050), 1726 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$5f1425da = ItemProgramChosenBinding.b$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -1826602124);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cRgb = (char) ((-16747272) - Color.rgb(0, 0, 0));
                int keyRepeatTimeout = 1755 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 24;
                byte b15 = $$a[7];
                byte b16 = b15;
                Object[] objArr26 = new Object[1];
                c(b15, b16, (short) (b16 | 89), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cRgb, keyRepeatTimeout, iIndexOf2, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{34139, 44473, 54404, 65423, 9953, 18930, 28880, 39791, 49725, 62748, 7254, 18246, 28255, 37184, 47544, 57532, 2951, 12996, 26108, 36034, 47069, 56864}, 10478 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{34143, 11563, 54689, 31805, 9405, 53038, 30640, 7683, 50871, 26942, 4532, 47121, 24719, 2830, 45961}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 43133, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
                    int pressedStateDuration2 = 1755 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int packedPositionChild = 22 - ExpandableListView.getPackedPositionChild(0L);
                    byte b17 = $$a[7];
                    byte b18 = b17;
                    Object[] objArr29 = new Object[1];
                    c(b17, b18, b18, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(pressedStateDuration, pressedStateDuration2, packedPositionChild, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char packedPositionChild2 = (char) (29943 - ExpandableListView.getPackedPositionChild(0L));
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 1755;
                    int windowTouchSlop2 = 23 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte b19 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    c(b19, (byte) (b19 | 15), (short) ($$b + 2), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(packedPositionChild2, capsMode, windowTouchSlop2, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i37 = ((int[]) objArrB$5f1425da[1])[0];
        int i38 = ((int[]) objArrB$5f1425da[0])[0];
        if (i38 == i37) {
            int i39 = ((int[]) objArrB$5f1425da[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrB$5f1425da[0])[0]}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i40 = i39 + (-1144866607) + (((~((-27207690) | iElapsedRealtime)) | 17571840) * 336) + (((~(iElapsedRealtime | 185394736)) | (-195030586)) * (-168)) + (((~((~iElapsedRealtime) | 185394736)) | (-27207690)) * 168);
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArr31[3])[0] = i42 ^ (i42 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrB$5f1425da[4];
        if (strArr5 != null) {
            for (String str : strArr5) {
                arrayList2.add(str);
            }
        }
        Toast.makeText((Context) null, i38 / (((i38 - 1) * i38) % 2), 0).show();
        int i43 = ((int[]) objArrB$5f1425da[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArrB$5f1425da[0])[0]}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i44 = ~iUptimeMillis;
        int i45 = i43 + (-144688828) + (((~((-739776644) | i44)) | (~(527174217 | i44))) * (-867)) + (((~((-739776644) | iUptimeMillis)) | 537923714 | (~(527174217 | iUptimeMillis))) * (-1734)) + (((~(iUptimeMillis | 1065097931)) | (~(i44 | (-537923715))) | (~((-201852930) | iUptimeMillis))) * 867);
        int i46 = (i45 << 13) ^ i45;
        int i47 = i46 ^ (i46 >>> 17);
        ((int[]) objArr32[3])[0] = i47 ^ (i47 << 5);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(LoyaltiOttRctiplusActivity loyaltiOttRctiplusActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ((ActivityLayoutOttRctiPlusBinding) ((ViewBinding) loyaltiOttRctiplusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.setVisibility(0);
        ((ActivityLayoutOttRctiPlusBinding) ((ViewBinding) loyaltiOttRctiplusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).containerError.setVisibility(8);
        loyaltiOttRctiplusActivity.cancelAll();
        ActivityLayoutOttRctiPlusBinding activityLayoutOttRctiPlusBinding = (ActivityLayoutOttRctiPlusBinding) ((ViewBinding) loyaltiOttRctiplusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityLayoutOttRctiPlusBinding.webView.setWebChromeClient(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityLayoutOttRctiPlusBinding));
        new WebViewClient();
        ((ActivityLayoutOttRctiPlusBinding) ((ViewBinding) loyaltiOttRctiplusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.setVisibility(0);
        ((ActivityLayoutOttRctiPlusBinding) ((ViewBinding) loyaltiOttRctiplusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.loadUrl("https://m.rctiplus.com?utm_source=bpjs&utm_medium=bpjs&utm_campaign=bpjs&utm_id=bpsjs");
        Unit unit = Unit.INSTANCE;
        int i2 = b + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 40 / 0;
        }
        return unit;
    }

    static {
        f494a = 1;
        g();
        INSTANCE = new Companion(null);
        int i = g + 55;
        f494a = i % 128;
        int i2 = i % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityLayoutOttRctiPlusBinding> TuitionPaymentFragmentbindingInflater1() {
        return (Function1) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, OldDaySecurityMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 273059256, OldDaySecurityMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -273059254, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 37;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 79;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return R.layout.activity_layout_ott_rcti_plus;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        b = i2 % 128;
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
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1799482484, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), OldDaySecurityMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1799482485, OldDaySecurityMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int p0, KeyEvent p1) {
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, Integer.valueOf(p0), p1}, getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -735535033, OldDaySecurityMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), OldDaySecurityMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 735535033, OldDaySecurityMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2())).booleanValue();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = b + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        b = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = b + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        b = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = b + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -2293606171143033823L;
    }
}
