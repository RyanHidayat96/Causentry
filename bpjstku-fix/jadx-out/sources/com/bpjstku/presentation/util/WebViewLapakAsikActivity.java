package com.bpjstku.presentation.util;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import com.appsflyer.internal.AFg1xSDK;
import com.bpjstku.R;
import com.bpjstku.data.scholarship.model.request.ScholarshipPhotoPersonForInsert;
import com.bpjstku.databinding.ActivityWebViewLapakAsikBinding;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import defpackage.ViewPortBuilder;
import defpackage.calculateCameraUseCases;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.captureSingleRequest;
import defpackage.createExtraImageCapture;
import defpackage.createExtraPreview;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u000b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/bpjstku/presentation/util/WebViewLapakAsikActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityWebViewLapakAsikBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "", "p0", "Landroid/view/KeyEvent;", "p1", "", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "Landroid/view/MenuItem;", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WebViewLapakAsikActivity extends BindingBaseActivity<ActivityWebViewLapakAsikBinding> {
    private static char[] TuitionPaymentFragmentbindingInflater1;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int g;
    private static final byte[] $$c = {99, -43, -44, -62};
    private static final int $$f = 63;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {12, 11, -9, -106, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 165;
    private static int d = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f4, code lost:
    
        if (((java.lang.reflect.Field) defpackage.calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null) == ((((-200056842) + (((~((-195293616) | r2)) | 1025281158) * (-933))) + (((~(1025281158 | r2)) | (-1069546928)) * 933)) - 365446144)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00f6, code lost:
    
        r8 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r14 = (int) android.os.Process.getStartUptimeMillis();
        r1 = ~r14;
        r2 = (~((-896657216) | r1)) | 288399650;
        r14 = ~(r14 | (-1074141185));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0126, code lost:
    
        if (r8 == (((691090702 + ((r2 | r14) * (-713))) + (r14 * 1426)) + ((~((-1682398750) | r1)) * 713))) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0128, code lost:
    
        r8 = com.bpjstku.presentation.util.WebViewLapakAsikActivity.d + 85;
        com.bpjstku.presentation.util.WebViewLapakAsikActivity.asBinder = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0138, code lost:
    
        if ((r8 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x013a, code lost:
    
        r8 = new int[1888701167];
        r8[1888701166(0x70934aee, float:3.6467905E29)] = 0;
        android.widget.Toast.makeText((android.content.Context) null, r8[-1], 1).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0148, code lost:
    
        r8 = new int[1888701167];
        r8[1888701166(0x70934aee, float:3.6467905E29)] = 1;
        r10 = (-740966350) % 2;
        android.widget.Toast.makeText((android.content.Context) null, r8[-1], 1).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0159, code lost:
    
        super.onCreate(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x015d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0165, code lost:
    
        throw new java.lang.RuntimeException("150945339");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00ca, code lost:
    
        if (((java.lang.reflect.Field) defpackage.calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null) == ((((-570944008) + (((~(r8 | (-922188774))) | ((~((-17334283) | r2)) | 847321825)) * (-68))) + ((~((-74866949) | r2)) * (-68))) + (((~(922188773 | r2)) | (-92201231)) * 68))) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int r8, int r9, int r10, int r11, int r12, java.lang.Object[] r13, int r14) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.WebViewLapakAsikActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(int, int, int, int, int, java.lang.Object[], int):java.lang.Object");
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
    private static void c(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            int r9 = r9 * 14
            int r9 = 98 - r9
            int r7 = 53 - r7
            byte[] r0 = com.bpjstku.presentation.util.WebViewLapakAsikActivity.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            r6 = r9
            r9 = r8
            r8 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L2b:
            int r8 = r8 + 1
            int r9 = r9 + r3
            int r9 = r9 + (-11)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.WebViewLapakAsikActivity.c(int, short, int, java.lang.Object[]):void");
    }

    public static final /* synthetic */ ActivityWebViewLapakAsikBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3(WebViewLapakAsikActivity webViewLapakAsikActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        d = i2 % 128;
        int i3 = i2 % 2;
        ActivityWebViewLapakAsikBinding activityWebViewLapakAsikBinding = (ActivityWebViewLapakAsikBinding) ((ViewBinding) webViewLapakAsikActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        int i4 = d + 7;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return activityWebViewLapakAsikBinding;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityWebViewLapakAsikBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = d + 19;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            WebViewLapakAsikActivity$bindingInflater$1 webViewLapakAsikActivity$bindingInflater$1 = WebViewLapakAsikActivity$bindingInflater$1.b;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        WebViewLapakAsikActivity$bindingInflater$1 webViewLapakAsikActivity$bindingInflater$2 = WebViewLapakAsikActivity$bindingInflater$1.b;
        int i3 = d + 31;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return webViewLapakAsikActivity$bindingInflater$2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        ActivityWebViewLapakAsikBinding activityWebViewLapakAsikBinding = (ActivityWebViewLapakAsikBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityWebViewLapakAsikBinding.webView.getSettings().setJavaScriptEnabled(true);
        activityWebViewLapakAsikBinding.webView.getSettings().setLoadWithOverviewMode(true);
        activityWebViewLapakAsikBinding.webView.getSettings().setUseWideViewPort(true);
        activityWebViewLapakAsikBinding.webView.getSettings().setDomStorageEnabled(true);
        activityWebViewLapakAsikBinding.webView.getSettings().setAllowContentAccess(true);
        activityWebViewLapakAsikBinding.webView.getSettings().setAllowFileAccess(true);
        activityWebViewLapakAsikBinding.webView.setWebViewClient(new TuitionPaymentFragmentbindingInflater1());
        ((ActivityWebViewLapakAsikBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.setWebChromeClient(new TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        ((ActivityWebViewLapakAsikBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.loadUrl("https://lapakasik.bpjsketenagakerjaan.go.id");
        int i2 = d + 105;
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
        int i2 = asBinder + 91;
        d = i2 % 128;
        int i3 = i2 % 2;
        WebViewLapakAsikActivity webViewLapakAsikActivity = this;
        Intrinsics.checkNotNullParameter(webViewLapakAsikActivity, "");
        webViewLapakAsikActivity.getWindow().addFlags(8192);
        ((ActivityWebViewLapakAsikBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText("Lapak Asik");
        int i4 = d + 117;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class TuitionPaymentFragmentbindingInflater1 extends WebViewClient {
        TuitionPaymentFragmentbindingInflater1() {
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends WebChromeClient {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            Intrinsics.checkNotNullParameter(webView, "");
            super.onProgressChanged(webView, i);
            WebViewLapakAsikActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(WebViewLapakAsikActivity.this).progressBar.setProgress(i);
            if (i < 100 && WebViewLapakAsikActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(WebViewLapakAsikActivity.this).progressBar.getVisibility() == 8) {
                WebViewLapakAsikActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(WebViewLapakAsikActivity.this).progressBar.setVisibility(0);
            }
            if (i == 100) {
                WebViewLapakAsikActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(WebViewLapakAsikActivity.this).progressBar.setVisibility(8);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int p0, KeyEvent p1) {
        boolean z;
        int i = 2 % 2;
        int i2 = asBinder + 19;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (p0 != 4 || !((ActivityWebViewLapakAsikBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.canGoBack()) {
            return super.onKeyDown(p0, p1);
        }
        int i4 = asBinder + 67;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            ((ActivityWebViewLapakAsikBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.goBack();
            z = false;
        } else {
            ((ActivityWebViewLapakAsikBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.goBack();
            z = true;
        }
        int i5 = d + 39;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:5:0x0016, B:17:0x0046, B:13:0x0032, B:11:0x0029), top: B:25:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i;
        int i2 = 2 % 2;
        int i3 = d + 63;
        asBinder = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                int i4 = 51 / 0;
                if (p0.getItemId() == 16908332) {
                    getOnBackPressedDispatcher().onBackPressed();
                    i = d + 9;
                    asBinder = i % 128;
                    if (i % 2 == 0) {
                        int i5 = 2 % 5;
                    }
                }
            } else {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                if (p0.getItemId() == 16908332) {
                    getOnBackPressedDispatcher().onBackPressed();
                    i = d + 9;
                    asBinder = i % 128;
                    if (i % 2 == 0) {
                        int i6 = 2 % 5;
                    }
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i7 = asBinder + 105;
            d = i7 % 128;
            if (i7 % 2 == 0) {
                return zOnOptionsItemSelected;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int iRed = Color.red(0) + 1031;
            int iArgb = Color.argb(0, 0, 0, 0) + 15;
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b, b, bArr[132], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay, iRed, iArgb, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step1).substring(3, 4).codePointAt(0) + 10, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 16, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cAlpha = (char) Color.alpha(0);
            int i2 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1030;
            int defaultSize = 15 - View.getDefaultSize(0, 0);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(b2, (short) (b2 | 52), bArr2[132], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha, i2, defaultSize, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = asBinder + 23;
            d = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int packedPositionChild = 1030 - ExpandableListView.getPackedPositionChild(0L);
                int offsetAfter = 15 - TextUtils.getOffsetAfter("", 0);
                byte b3 = (byte) 52;
                Object[] objArr6 = new Object[1];
                c(b3, (short) (b3 << 1), $$a[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(touchSlop, packedPositionChild, offsetAfter, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i7 = ~((int) Process.getStartUptimeMillis());
            int i8 = 1373214724 + (((~((-265450325) | i7)) | 21170154) * (-933)) + (((~(i7 | 21170154)) | (-265517055)) * 933) + 1338771672;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redeem_mandiri_title).substring(0, 18).length() + 109, new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(null, null, 126 - TextUtils.indexOf((CharSequence) "", '0'), new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {924810927};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 46038), 1134 - (ViewConfiguration.getLongPressTimeout() >> 16), 'B' - AndroidCharacter.getMirror('0'), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1276512582, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int i11 = 1030 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int i12 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15;
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[7];
                    Object[] objArr12 = new Object[1];
                    c(b4, b4, bArr3[132], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, i11, i12, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf("", "", 0, 0) + 45993), 1117 - Color.red(0), 16 - ImageFormat.getBitsPerPixel(0)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                    int keyRepeatTimeout = 1031 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int i13 = 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    byte b5 = (byte) 52;
                    Object[] objArr13 = new Object[1];
                    c(b5, (short) (b5 << 1), $$a[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAxisFromString, keyRepeatTimeout, i13, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 16, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16;
                        byte[] bArr4 = $$a;
                        byte b6 = bArr4[7];
                        Object[] objArr16 = new Object[1];
                        c(b6, (short) (b6 | 52), bArr4[132], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cKeyCodeFromString, iIndexOf, iIndexOf2, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 1);
                        int iIndexOf3 = 1031 - TextUtils.indexOf("", "");
                        int iIndexOf4 = 15 - TextUtils.indexOf("", "", 0, 0);
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        c(b7, b7, bArr5[132], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(gidForName, iIndexOf3, iIndexOf4, 1357589585, false, (String) objArr17[0], null);
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
            int i16 = asBinder + 59;
            d = i16 % 128;
            int i17 = i16 % 2;
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[3])[0];
            int i20 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i21 = i18 + 1904042242 + (((~((-385) | (~iIdentityHashCode))) | (-244279786)) * (-591)) + ((iIdentityHashCode | (-385)) * 591);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr18[2])[0] = i23 ^ (i23 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    int i24 = asBinder + 25;
                    d = i24 % 128;
                    int i25 = i24 % 2;
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i15];
            int i26 = i15 - 1;
            iArr[i26] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i26) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr[2])[0];
            int i28 = ((int[]) objArr[3])[0];
            int i29 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i30 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i31 = i27 + (((1671955928 + (((~((-159732343) | i30)) | (-84547828)) * (-933))) + (((~(i30 | (-84547828))) | 67766401) * 933)) - 1802930648);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr19[2])[0] = i33 ^ (i33 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29943);
            int bitsPerPixel = 1754 - ImageFormat.getBitsPerPixel(0);
            int iIndexOf5 = 22 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            byte[] bArr6 = $$a;
            Object[] objArr20 = new Object[1];
            c((byte) (bArr6[33] - 1), (short) 104, bArr6[132], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, bitsPerPixel, iIndexOf5, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i34 = d + 125;
            asBinder = i34 % 128;
            int i35 = i34 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char packedPositionType = (char) (29944 - ExpandableListView.getPackedPositionType(0L));
                int mirror = AndroidCharacter.getMirror('0') + 1707;
                int deadChar = 23 - KeyEvent.getDeadChar(0, 0);
                byte[] bArr7 = $$a;
                byte b8 = bArr7[7];
                Object[] objArr21 = new Object[1];
                c(b8, (short) (b8 | 52), bArr7[132], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(packedPositionType, mirror, deadChar, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int i36 = ~((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tesla_ev_connector_type).substring(1, 5).codePointAt(1) + 1094762417) | (-741031453));
            int i37 = (((((-1023376991) | i36) * (-196)) + 1989024501) + ((i36 | 282345538) * 196)) - 565784933;
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i39 ^ (i39 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(null, null, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_message_invalid_expiry_date).substring(14, 16).codePointAt(0) + 30, new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {924810927};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - Color.argb(0, 0, 0, 0)), KeyEvent.keyCodeFromString("") + 1726, 29 - (Process.myTid() >> 22), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -565784933, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c3 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29944);
                int i40 = 1754 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
                byte[] bArr8 = $$a;
                byte b9 = bArr8[7];
                Object[] objArr26 = new Object[1];
                c(b9, (short) (b9 | 52), bArr8[132], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, i40, iLastIndexOf, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 116, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(null, null, 127 - View.MeasureSpec.getMode(0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c4 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 29943);
                    int iLastIndexOf2 = 1754 - TextUtils.lastIndexOf("", '0', 0);
                    int scrollBarFadeDuration = 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte[] bArr9 = $$a;
                    byte b10 = bArr9[7];
                    Object[] objArr29 = new Object[1];
                    c(b10, (short) (b10 | 141), bArr9[132], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c4, iLastIndexOf2, scrollBarFadeDuration, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cAlpha2 = (char) (Color.alpha(0) + 29944);
                    int iIndexOf6 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1756;
                    int i41 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22;
                    byte[] bArr10 = $$a;
                    Object[] objArr30 = new Object[1];
                    c((byte) (bArr10[33] - 1), (short) 104, bArr10[132], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cAlpha2, iIndexOf6, i41, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i42 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i43 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i43 != i42) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr5 != null) {
                for (String str2 : strArr5) {
                    arrayList2.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i43));
        }
        int i44 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i45 = ~iIdentityHashCode2;
        int i46 = i44 + (-1917404935) + ((4368400 | i45) * (-192)) + (((~(4631128 | i45)) | 212865154) * (-384)) + (((~(iIdentityHashCode2 | (-262729))) | (~(i45 | 217496282)) | (~((-212865155) | iIdentityHashCode2))) * DerHeader.TAG_CLASS_PRIVATE);
        int i47 = (i46 << 13) ^ i46;
        int i48 = i47 ^ (i47 >>> 17);
        ((int[]) objArr31[3])[0] = i48 ^ (i48 << 5);
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
        char c = '0';
        long j = 0;
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i4]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c2 = (char) ((SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 31338);
                        int gidForName = Process.getGidForName("") + 2995;
                        int iIndexOf = TextUtils.indexOf("", c, i3) + 18;
                        byte b = (byte) i3;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, gidForName, iIndexOf, 1182129903, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i4++;
                    c = '0';
                    j = 0;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i5 = $11 + 93;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            float f = 0.0f;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.getGidForName("") + 43326), 254 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i7 = $11 + 117;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33602 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1))), (Process.myPid() >> 22) + 3085, 25 - TextUtils.lastIndexOf("", '0'), -2146875848, false, $$i(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    f = 0.0f;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            int i9 = 0;
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i10 = $11 + 47;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - View.MeasureSpec.makeMeasureSpec(0, 0)), KeyEvent.keyCodeFromString("") + 3085, 26 - (ViewConfiguration.getTapTimeout() >> 16), -2146875848, false, $$i(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            while (true) {
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9;
                if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                int i12 = $10 + 85;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                i9 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) throws IllegalAccessException {
        WebViewLapakAsikActivity webViewLapakAsikActivity = (WebViewLapakAsikActivity) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        int i2 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i3 = ~iElapsedRealtime;
        if (i2 != 183490024 + (((~((-955925988) | i3)) | 277349697 | (~(1785913530 | i3))) * (-1136)) + (((~((-955925988) | iElapsedRealtime)) | (~(1785913530 | iElapsedRealtime)) | (~((-1107337241) | i3))) * (-568)) + (((~(iElapsedRealtime | (-277349698))) | (~(i3 | (-1785913531))) | (~(955925987 | i3))) * 568)) {
            int i4 = d + 123;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            int[] iArr = new int[203040513];
            iArr[203040512] = 1;
            int i6 = (-32823552) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i7 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        if (i7 != (-778344900) + ((1851344227 | iUptimeMillis) * 376) + (((~((~iUptimeMillis) | 338685292)) | 1783627779) * (-376)) + (((~(iUptimeMillis | (-338685293))) | (-2054596624)) * 376)) {
            int i8 = (-1347181294) % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i9 = asBinder + 71;
        d = i9 % 128;
        if (i9 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = d + 65;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
        int i6 = ~((-656418178) | i5);
        int i7 = ~i5;
        if (i4 != (-1745625752) + ((i6 | (~(i7 | 2143026653))) * 920) + (((~((-656620934) | i7)) | 656418177) * 920) + (((~(i5 | 2143026653)) | (~((-656418178) | i7)) | (~((-202757) | i5))) * 920)) {
            throw null;
        }
        int i8 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
        int i10 = (~(2142487587 | i9)) | 4983168;
        int i11 = ~((~i9) | (-1720894500));
        if (i8 != 626177628 + ((i10 | i11) * (-470)) + (((~(i9 | 2147470755)) | i11) * 470)) {
            throw new RuntimeException("-263708413");
        }
        super.onStart();
        int i12 = asBinder + 77;
        d = i12 % 128;
        if (i12 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static {
        g = 0;
        g();
        INSTANCE = new Companion(null);
        int i = asInterface + 67;
        g = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 73;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 73 / 0;
        }
        return R.layout.activity_web_view_lapak_asik;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = d + 3;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(captureSingleRequest.b(), 582682834, captureSingleRequest.b(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1255931343, new Object[]{this, bundle}, -582682833);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iB = captureSingleRequest.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -314308989, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iB, (-796080796) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7), new Object[]{this}, 314308989);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = d + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = d + 41;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        TuitionPaymentFragmentbindingInflater1 = new char[]{47271, 47322, 47268, 47318, 47321, 47327, 47258, 47317, 47285, 47311, 47316, 47267, 47323, 47237, 47324, 47269, 47325, 47320, 47286, 47326, 47314, 47265, 47232, 47264};
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2047719496;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, byte r7, int r8) {
        /*
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r6 = r6 * 2
            int r0 = r6 + 1
            int r8 = r8 + 67
            byte[] r1 = com.bpjstku.presentation.util.WebViewLapakAsikActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2a
        L15:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            int r3 = r3 + 1
            r4 = r1[r8]
        L2a:
            int r7 = r7 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.WebViewLapakAsikActivity.$$i(int, byte, int):java.lang.String");
    }
}
