package com.midtrans.sdk.uikit.views.webview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import com.bpjstku.R;
import com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda7;
import com.midtrans.sdk.corekit.BuildConfig;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.core.PaymentType;
import com.midtrans.sdk.uikit.abstracts.BaseActivity;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import com.midtrans.sdk.uikit.widgets.SemiBoldTextView;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.initSession;
import defpackage.propagateChildrenTemplate;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public class WebViewPaymentActivity extends BasePaymentActivity {
    private static short[] MediaBrowserCompat = null;
    private static final String asInterface = "WebViewPaymentActivity";
    private propagateChildrenTemplate INotificationSideChannel;
    private WebView INotificationSideChannelStub;
    private String cancel;
    private SemiBoldTextView cancelAll;
    private String d;
    private ImageView g;
    private Toolbar notify;
    private DefaultTextView onTransact;
    private static final byte[] $$m = {102, -96, -78, -55};
    private static final int $$n = 230;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {22, 102, 43, -6, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$k = 230;
    private static int write = 0;
    private static int IconCompatParcelizer = 1;
    private static int getInterfaceDescriptor = -1007187480;
    private static int INotificationSideChannelDefault = -1934795549;
    private static int INotificationSideChannelStubProxy = 207127359;
    private static byte[] RemoteActionCompatParcelizer = {-18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29, -18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, -26, -26, -26, -26};

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends WebViewClient {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1216289583;
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private WebViewPaymentActivity b;

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1(WebViewPaymentActivity webViewPaymentActivity, String str, byte b) {
            this(webViewPaymentActivity, str);
        }

        private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
            if (!TextUtils.isEmpty(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals("bca_klikpay")) {
                if (str.contains("?id=")) {
                    WebViewPaymentActivity.TuitionPaymentFragmentbindingInflater1(this.b);
                    return;
                }
                return;
            }
            if (!TextUtils.isEmpty(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals("mandiri_ecash")) {
                if (str.contains("notify?id=")) {
                    WebViewPaymentActivity.TuitionPaymentFragmentbindingInflater1(this.b);
                    return;
                }
                return;
            }
            if (!TextUtils.isEmpty(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals("bri_epay")) {
                if (str.contains("briPayment?tid=")) {
                    WebViewPaymentActivity.TuitionPaymentFragmentbindingInflater1(this.b);
                    return;
                }
                return;
            }
            if (!TextUtils.isEmpty(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals("cimb_clicks")) {
                if (str.contains("cimb-clicks/response")) {
                    WebViewPaymentActivity.TuitionPaymentFragmentbindingInflater1(this.b);
                }
            } else if (!TextUtils.isEmpty(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals(PaymentType.DANAMON_ONLINE)) {
                if (str.contains("/callback?signature=")) {
                    WebViewPaymentActivity.TuitionPaymentFragmentbindingInflater1(this.b);
                }
            } else if (!TextUtils.isEmpty(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals(PaymentType.AKULAKU) && str.contains("?refNo=")) {
                WebViewPaymentActivity.TuitionPaymentFragmentbindingInflater1(this.b);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            Logger.d(WebViewPaymentActivity.g(), "onPageFinished()>url:".concat(String.valueOf(str)));
            WebViewPaymentActivity webViewPaymentActivity = this.b;
            if (webViewPaymentActivity == null || !webViewPaymentActivity.TuitionPaymentFragmentbindingInflater1) {
                return;
            }
            if (str.contains(BuildConfig.CALLBACK_STRING) || str.contains("/token/rba/callback/")) {
                WebViewPaymentActivity.TuitionPaymentFragmentbindingInflater1(this.b);
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.d(WebViewPaymentActivity.g(), "onPageStarted()>url:".concat(String.valueOf(str)));
            super.onPageStarted(webView, str, bitmap);
            WebViewPaymentActivity webViewPaymentActivity = this.b;
            if (webViewPaymentActivity == null || !webViewPaymentActivity.TuitionPaymentFragmentbindingInflater1) {
                return;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d(WebViewPaymentActivity.g(), "shouldOverrideUrlLoading()>url:".concat(String.valueOf(str)));
            webView.loadUrl(str);
            return true;
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault1(WebViewPaymentActivity webViewPaymentActivity, String str) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.b = webViewPaymentActivity;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(WebViewPaymentActivity webViewPaymentActivity) {
        int i = 2 % 2;
        webViewPaymentActivity.setResult(-1, new Intent());
        webViewPaymentActivity.finish();
        webViewPaymentActivity.asInterface();
        int i2 = IconCompatParcelizer + 119;
        write = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ String g() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 19;
        write = i2 % 128;
        int i3 = i2 % 2;
        String str = asInterface;
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        return str;
    }

    private static void m(int i, int i2, byte b, Object[] objArr) {
        int i3 = i + 4;
        byte[] bArr = $$j;
        int i4 = 98 - (b * 14);
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3++;
            i4 = (i4 + i3) - 11;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i4;
            if (i5 == i2) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b2 = bArr[i3];
                i3++;
                i4 = (i4 + b2) - 11;
            }
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        String str;
        int i = 2 % 2;
        if (this.INotificationSideChannel == null || (str = this.d) == null) {
            return;
        }
        int i2 = write + 11;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            str.equalsIgnoreCase("credit_card");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str.equalsIgnoreCase("credit_card")) {
            int i3 = IconCompatParcelizer + 57;
            write = i3 % 128;
            if (i3 % 2 == 0) {
                this.INotificationSideChannel.TuitionPaymentFragmentbindingInflater1("Back", "CC 3DS");
            } else {
                this.INotificationSideChannel.TuitionPaymentFragmentbindingInflater1("Back", "CC 3DS");
                int i4 = 3 / 0;
            }
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 75;
        write = i2 % 128;
        int i3 = i2 % 2;
        Drawable drawable = ContextCompat.getDrawable(this, 2131231099);
        if (drawable != null) {
            drawable.setColorFilter(((BaseActivity) this).b, PorterDuff.Mode.SRC_ATOP);
            int i4 = IconCompatParcelizer + 97;
            write = i4 % 128;
            int i5 = i4 % 2;
        }
        this.notify.setNavigationIcon(drawable);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = write + 15;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.INotificationSideChannelStub = (WebView) findViewById(R.id.webview_container);
        this.g = (ImageView) findViewById(R.id.merchant_logo);
        this.cancelAll = (SemiBoldTextView) findViewById(R.id.text_page_title);
        this.onTransact = (DefaultTextView) findViewById(R.id.text_page_merchant_name);
        this.notify = (Toolbar) findViewById(R.id.main_toolbar);
        int i4 = write + 117;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -75446792
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.webview.WebViewPaymentActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrB$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 73;
        write = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.attachBaseContext(context);
        if (i3 != 0) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char keyRepeatTimeout = (char) (29944 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                int mode = 1755 - View.MeasureSpec.getMode(0);
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23;
                byte[] bArr = $$j;
                short s = bArr[7];
                Object[] objArr2 = new Object[1];
                m(s, (byte) (s | 37), bArr[28], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatTimeout, mode, minimumFlingVelocity, 986134021, false, (String) objArr2[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            obj.hashCode();
            throw null;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cNormalizeMetaState = (char) (29944 - KeyEvent.normalizeMetaState(0));
            int keyRepeatDelay = 1755 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int iMyTid = 23 - (Process.myTid() >> 22);
            byte[] bArr2 = $$j;
            short s2 = bArr2[7];
            Object[] objArr3 = new Object[1];
            m(s2, (byte) (s2 | 37), bArr2[28], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, keyRepeatDelay, iMyTid, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) != -1) {
            int i4 = IconCompatParcelizer + 1;
            write = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 29944);
                int mirror = 1803 - AndroidCharacter.getMirror('0');
                int iIndexOf = 23 - TextUtils.indexOf("", "");
                Object[] objArr4 = new Object[1];
                m((short) 37, (byte) 52, $$j[28], objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetAfter, mirror, iIndexOf, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrB$5f1425da = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            int i7 = (-1642628393) + (((~((-985140513) | i6)) | 705170464 | (~((-772538087) | i6))) * (-754));
            int i8 = ~((-705170465) | i6);
            int i9 = ~i6;
            int i10 = ((i7 + ((i8 | (~((-67367623) | i9))) * (-754))) + ((i9 | (-985140513)) * 754)) - 1310442288;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.xl_instruction_step1).substring(46, 48).length() - 1331352848, ExpandableListView.getPackedPositionType(0L) + 2131370129, (short) ((Process.getThreadPriority(0) + 20) >> 6), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.title_shipping_billing_address).substring(0, 26).codePointAt(9) - 27, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111), objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            n((-1331352831) - (ViewConfiguration.getScrollBarSize() >> 8), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.save_time_save_credit).substring(12, 14).length() + 2131370126, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlStatusCardCriticalTitle).substring(0, 17).codePointAt(11) - 73), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step5).substring(37, 38).length() + 10, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 117), objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr8 = {-282578086};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.getMode(0) + 42049), 1725 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.getOffsetAfter("", 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$5f1425da = PMIRegistrationDataStore$$ExternalSyntheticLambda7.b$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr8), -1310442288);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944);
                    int i13 = 1755 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int packedPositionChild = 22 - ExpandableListView.getPackedPositionChild(0L);
                    Object[] objArr9 = new Object[1];
                    m((short) 37, (byte) 52, $$j[28], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, i13, packedPositionChild, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrB$5f1425da);
                try {
                    Object[] objArr10 = new Object[1];
                    n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1331352852, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2131370084, (short) ('0' - AndroidCharacter.getMirror('0')), (KeyEvent.getMaxKeyCode() >> 16) + 17, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_message_invalid_cvv).substring(12, 13).length() - 1), objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    n((-1331352796) - TextUtils.lastIndexOf("", '0', 0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2131370088, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.done).substring(4, 5).codePointAt(0) - 115), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 26, (byte) (Process.myPid() >> 22), objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char mode2 = (char) (29944 - View.MeasureSpec.getMode(0));
                        int i14 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                        int i15 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23;
                        Object[] objArr12 = new Object[1];
                        m((short) 89, (byte) 52, $$j[28], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode2, i14, i15, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 29944);
                        int trimmedLength = TextUtils.getTrimmedLength("") + 1755;
                        int scrollBarSize = 23 - (ViewConfiguration.getScrollBarSize() >> 8);
                        byte[] bArr3 = $$j;
                        short s3 = bArr3[7];
                        Object[] objArr13 = new Object[1];
                        m(s3, (byte) (s3 | 37), bArr3[28], objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, trimmedLength, scrollBarSize, 986134021, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        if (((int[]) objArrB$5f1425da[0])[0] != ((int[]) objArrB$5f1425da[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$5f1425da[4];
            if (strArr != null) {
                int i16 = write + 111;
                IconCompatParcelizer = i16 % 128;
                for (int i17 = i16 % 2 != 0 ? 0 : 1; i17 < strArr.length; i17++) {
                    arrayList.add(strArr[i17]);
                }
            }
            throw null;
        }
        int i18 = ((int[]) objArrB$5f1425da[3])[0];
        Object[] objArr14 = {new int[]{((int[]) objArrB$5f1425da[0])[0]}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i19 = ~iUptimeMillis;
        int i20 = (~((-349611946) | i19)) | 349447808;
        int i21 = ~(iUptimeMillis | (-136845383));
        int i22 = i18 + (-458257095) + ((i20 | i21) * (-502)) + ((i21 | (~(i19 | (-164138)))) * TypedValues.PositionType.TYPE_DRAWPATH);
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        ((int[]) objArr14[3])[0] = i24 ^ (i24 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
            int defaultSize = View.getDefaultSize(0, 0) + 1031;
            int i25 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15;
            Object[] objArr15 = new Object[1];
            m((short) 141, (byte) 52, $$j[28], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf2, defaultSize, i25, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr16 = new Object[1];
        n(Color.alpha(0) - 1331352816, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step2).substring(28, 29).codePointAt(0) + 2131370023, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.installment_required).substring(16, 18).codePointAt(0) - 32), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 19, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_at_klik_bca).substring(4, 5).length() - 1), objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        n((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 1331352795, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_code).substring(4, 5).codePointAt(0) + 2131370092, (short) ExpandableListView.getPackedPositionGroup(0L), ((byte) KeyEvent.getModifierMetaStateMask()) + 11, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_bri_epay).substring(0, 9).codePointAt(5) - 32), objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
            int i26 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1031;
            int i27 = 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            Object[] objArr18 = new Object[1];
            m((short) 37, (byte) 52, $$j[28], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(fadingEdgeLength, i26, i27, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int mirror2 = 1079 - AndroidCharacter.getMirror('0');
                int trimmedLength2 = 15 - TextUtils.getTrimmedLength("");
                byte b = $$j[7];
                Object[] objArr19 = new Object[1];
                m((short) 193, b, b, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c, mirror2, trimmedLength2, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i28 = ((int[]) objArr20[3])[0];
            int i29 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int i30 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            int i31 = 2113466034 + ((~((~i30) | (-604250409))) * 433) + (((~(629552574 | i30)) | (-873832745)) * (-433)) + (((~(i30 | (-873832745))) | 25302166) * 433) + 106855610;
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr[2])[0] = i33 ^ (i33 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.activity_save_credit_card).substring(7, 10).codePointAt(0) - 1331352960, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2131370093, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 25, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            n((-1331352830) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 2131370019, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_open_with).substring(0, 9).codePointAt(4) - 32), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 87, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 109), objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-282578086};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 46038), 1134 - ((Process.getThreadPriority(0) + 20) >> 6), 18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 106855610, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                int offsetBefore = 1031 - TextUtils.getOffsetBefore("", 0);
                int i34 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15;
                Object[] objArr25 = new Object[1];
                m((short) 141, (byte) 52, $$j[28], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf3, offsetBefore, i34, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - ((byte) KeyEvent.getModifierMetaStateMask())), View.MeasureSpec.getSize(0) + 1117, 17 - Color.alpha(0)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int iRgb = Color.rgb(0, 0, 0) + 16778247;
                int iBlue = Color.blue(0) + 15;
                byte b2 = $$j[7];
                Object[] objArr26 = new Object[1];
                m((short) 193, b2, b2, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(scrollBarFadeDuration2, iRgb, iBlue, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1331352852, (ViewConfiguration.getScrollBarSize() >> 8) + 2131370120, (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.argb(0, 0, 0, 0) + 17, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.empty_card_number).substring(11, 12).length() - 1), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.telkomsel_instruction_step3).substring(10, 11).length() - 1331352796, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_with).substring(0, 4).length() + 2131370120, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_with).substring(0, 4).codePointAt(2) - 77), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cBlue = (char) Color.blue(0);
                    int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 1032;
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 15;
                    Object[] objArr29 = new Object[1];
                    m((short) 37, (byte) 52, $$j[28], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cBlue, packedPositionChild2, threadPriority, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1031;
                    int iMakeMeasureSpec2 = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    Object[] objArr30 = new Object[1];
                    m((short) 141, (byte) 52, $$j[28], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(keyRepeatDelay2, iMakeMeasureSpec, iMakeMeasureSpec2, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList2.add(str);
                }
            }
            throw null;
        }
        int i35 = write + 111;
        IconCompatParcelizer = i35 % 128;
        int i36 = i35 % 2;
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i37 = ((int[]) objArr[2])[0];
        int i38 = ((int[]) objArr[3])[0];
        int i39 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 1891864150;
        int i40 = ~iCodePointAt;
        int i41 = i37 + 533514957 + ((iCodePointAt | (-502150350)) * 140) + (((~((-502150350) | i40)) | 208412677) * (-280)) + (((~(iCodePointAt | (-208412678))) | (~(746430519 | i40)) | (-1040168192)) * 140);
        int i42 = i41 ^ (i41 << 13);
        int i43 = i42 ^ (i42 >>> 17);
        ((int[]) objArr31[2])[0] = i43 ^ (i43 << 5);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0217 A[PHI: r0
  0x0217: PHI (r0v35 int) = (r0v11 int), (r0v38 int) binds: [B:52:0x0215, B:49:0x0203] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0219 A[PHI: r0
  0x0219: PHI (r0v12 int) = (r0v11 int), (r0v38 int) binds: [B:52:0x0215, B:49:0x0203] A[DONT_GENERATE, DONT_INLINE]] */
    private static void n(int i, int i2, short s, int i3, byte b, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        int length;
        byte[] bArr;
        int i6;
        int i7 = 2;
        int i8 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(INotificationSideChannelDefault)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.myPid() >> 22), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2267, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32, 1387473586, false, $$u(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                z = true;
            } else {
                int i9 = $10 + 39;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                z = false;
            }
            if (z) {
                byte[] bArr2 = RemoteActionCompatParcelizer;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i11 = $11 + 1;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = 0;
                    while (i13 < length2) {
                        int i14 = $11 + 89;
                        $10 = i14 % 128;
                        if (i14 % i7 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i13])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), 3357 - TextUtils.indexOf((CharSequence) "", '0'), View.getDefaultSize(0, 0) + 18, -1054011043, false, $$u(b4, b4, (byte) $$m.length), new Class[]{Integer.TYPE});
                            }
                            bArr3[i13] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i13 /= 0;
                        } else {
                            try {
                                Object[] objArr4 = {Integer.valueOf(bArr2[i13])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b5 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - MotionEvent.axisFromString("")), 3358 - TextUtils.indexOf("", "", 0, 0), 18 - (ViewConfiguration.getScrollBarSize() >> 8), -1054011043, false, $$u(b5, b5, (byte) $$m.length), new Class[]{Integer.TYPE});
                                }
                                bArr3[i13] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                                i13++;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        i7 = 2;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = RemoteActionCompatParcelizer;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(getInterfaceDescriptor)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), (Process.myPid() >> 22) + 2267, 33 - (Process.myTid() >> 22), 1387473586, false, $$u(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) INotificationSideChannelDefault) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) MediaBrowserCompat[i + ((int) (((long) getInterfaceDescriptor) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) INotificationSideChannelDefault) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i15 = $11 + 33;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    i4 = ((i % iIntValue) << 3) - ((int) (((long) getInterfaceDescriptor) % 3046761265686732006L));
                    if (z) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                } else {
                    i4 = ((i + iIntValue) - 2) + ((int) (((long) getInterfaceDescriptor) ^ 3046761265686732006L));
                    if (!z) {
                        i5 = 0;
                    } else {
                        i5 = 1;
                    }
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i4 + i5;
                Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(INotificationSideChannelStubProxy), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (55904 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 2855 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13, -1529949196, false, $$u(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr5 = RemoteActionCompatParcelizer;
                if (bArr5 != null) {
                    int i16 = $10 + 13;
                    $11 = i16 % 128;
                    if (i16 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i6 = 1;
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i6 = 0;
                    }
                    while (i6 < length) {
                        int i17 = $11 + 19;
                        $10 = i17 % 128;
                        if (i17 % 2 != 0) {
                            bArr[i6] = (byte) (((long) bArr5[i6]) / 3046761265686732006L);
                        } else {
                            bArr[i6] = (byte) (((long) bArr5[i6]) ^ 3046761265686732006L);
                            i6++;
                        }
                    }
                    bArr5 = bArr;
                }
                boolean z2 = bArr5 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i18 = $10 + 79;
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
                    if (z2) {
                        byte[] bArr6 = RemoteActionCompatParcelizer;
                        int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i20]) ^ 3046761265686732006L)) + s)) ^ b));
                    } else {
                        short[] sArr = MediaBrowserCompat;
                        int i21 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i21 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i21]) ^ 3046761265686732006L)) + s)) ^ b));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
            int i22 = $10 + 57;
            $11 = i22 % 128;
            if (i22 % 2 != 0) {
                return;
            }
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

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1617154249
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.midtrans.sdk.uikit.views.webview.WebViewPaymentActivity.IconCompatParcelizer
            int r1 = r1 + 89
            int r2 = r1 % 128
            com.midtrans.sdk.uikit.views.webview.WebViewPaymentActivity.write = r2
            int r1 = r1 % r0
            java.lang.reflect.Member[] r1 = defpackage.CameraUseCaseAdapter.b
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            int r4 = java.lang.System.identityHashCode(r8)
            r5 = -1589965336(0xffffffffa13b0de8, float:-6.337647E-19)
            r4 = r4 | r5
            int r4 = ~r4
            r5 = -759977793(0xffffffffd2b3a8bf, float:-3.8581512E11)
            r5 = r5 | r4
            int r5 = r5 * (-220)
            r6 = -1625693864(0xffffffff9f19e158, float:-3.258541E-20)
            int r6 = r6 + r5
            r5 = 1384161303(0x5280a017, float:2.7622084E11)
            r4 = r4 | r5
            int r4 = r4 * 220
            int r6 = r6 + r4
            r4 = 1531507760(0x5b48f430, float:5.6563482E16)
            int r6 = r6 + r4
            if (r1 == r6) goto L51
            r1 = -1617154249(0xffffffff9f9c2f37, float:-6.614668E-20)
            int[] r1 = new int[r1]
            r4 = -1617154250(0xffffffff9f9c2f36, float:-6.6146674E-20)
            r5 = 1
            r1[r4] = r5
            r4 = 1176571546(0x46210e9a, float:10307.65)
            int r4 = r4 % r0
            r4 = -1
            r1 = r1[r4]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r5)
            r1.show()
        L51:
            java.lang.reflect.Member[] r1 = defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            java.util.Random r2 = new java.util.Random
            r2.<init>()
            r4 = 234495891(0xdfa1f93, float:1.5415041E-30)
            int r2 = r2.nextInt(r4)
            r4 = -2042767690(0xffffffff863dd6b6, float:-3.5704694E-35)
            r5 = r4 | r2
            int r5 = ~r5
            r6 = 1714763098(0x6635355a, float:2.1393312E23)
            r5 = r5 | r6
            int r5 = r5 * 262
            r7 = 138141726(0x83be01e, float:5.6536714E-34)
            int r5 = r5 + r7
            int r2 = ~r2
            r2 = r2 | r4
            int r2 = ~r2
            r2 = r2 | r6
            int r2 = r2 * 262
            int r5 = r5 + r2
            if (r1 != r5) goto L8d
            super.onResume()
            int r1 = com.midtrans.sdk.uikit.views.webview.WebViewPaymentActivity.write
            int r1 = r1 + 5
            int r2 = r1 % 128
            com.midtrans.sdk.uikit.views.webview.WebViewPaymentActivity.IconCompatParcelizer = r2
            int r1 = r1 % r0
            return
        L8d:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.webview.WebViewPaymentActivity.onResume():void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
        if (i2 != 2076007088 + (((~((-268469555) | i3)) | (~((~i3) | (-1098457098)))) * (-318)) + (((~(478598454 | i3)) | (-1577055552)) * (-318)) + (((~(i3 | (-478598455))) | 1308585997) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) {
            throw null;
        }
        int i4 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 2106187273;
        int i6 = ~((-180359521) | i5);
        int i7 = ~i5;
        if (i4 != 669516476 + ((i6 | (~(i7 | 2144272367))) * 920) + (((~((-248001517) | i7)) | 180359520) * 920) + (((~(i5 | 2144272367)) | (~((-180359521) | i7)) | (~((-67641997) | i5))) * 920)) {
            int i8 = IconCompatParcelizer + 85;
            write = i8 % 128;
            if (i8 % 2 != 0) {
                int[] iArr = new int[2105583957];
                iArr[2105583956] = 1;
                Toast.makeText((Context) null, iArr[-1], 0).show();
            } else {
                int[] iArr2 = new int[2105583957];
                iArr2[2105583956] = 1;
                int i9 = 1233169636 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        super.onStart();
        int i10 = IconCompatParcelizer + 115;
        write = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        write = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$u(int r7, short r8, int r9) {
        /*
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r0 = com.midtrans.sdk.uikit.views.webview.WebViewPaymentActivity.$$m
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r9 = r9 + 117
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r7
            r3 = r8
            r4 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = -r7
            int r9 = r9 + 1
            int r7 = r7 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.webview.WebViewPaymentActivity.$$u(int, short, int):java.lang.String");
    }
}
