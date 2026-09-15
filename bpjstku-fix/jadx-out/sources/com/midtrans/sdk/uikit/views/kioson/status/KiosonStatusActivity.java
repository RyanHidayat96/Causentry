package com.midtrans.sdk.uikit.views.kioson.status;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
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
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;
import com.bpjstku.R;
import com.midtrans.sdk.corekit.core.Constants;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.abstracts.BaseActivity;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import com.midtrans.sdk.uikit.widgets.SemiBoldTextView;
import defpackage.ViewPortBuilder;
import defpackage.cacheInteropConfig;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.generateCameraId;
import defpackage.getConfigs;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.onConnectionFailed;
import defpackage.propagateChildrenTemplate;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes5.dex */
public class KiosonStatusActivity extends BasePaymentActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private FancyButton INotificationSideChannel;
    private SemiBoldTextView INotificationSideChannelStub;
    private SemiBoldTextView INotificationSideChannelStubProxy;
    private propagateChildrenTemplate cancel;
    private FancyButton cancelAll;
    private DefaultTextView getInterfaceDescriptor;
    private AppCompatButton notify;
    private LinearLayout onTransact;
    private static final byte[] $$j = {6, 51, 46, 31, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$k = 85;
    private static int RemoteActionCompatParcelizer = 0;
    private static int MediaBrowserCompat = 1;
    private static long INotificationSideChannelDefault = 8669773105255967108L;
    private final String d = "KiosonStatusActivity";
    private final String asInterface = "Kioson Payment Code";
    private final String g = "Done Kioson";

    public static /* synthetic */ DefaultTextView TuitionPaymentFragmentbindingInflater1(KiosonStatusActivity kiosonStatusActivity) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 105;
        MediaBrowserCompat = i3 % 128;
        int i4 = i3 % 2;
        DefaultTextView defaultTextView = kiosonStatusActivity.getInterfaceDescriptor;
        int i5 = i2 + 121;
        MediaBrowserCompat = i5 % 128;
        int i6 = i5 % 2;
        return defaultTextView;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(KiosonStatusActivity kiosonStatusActivity) {
        int i;
        Drawable drawable;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 9;
        MediaBrowserCompat = i3 % 128;
        if (i3 % 2 == 0) {
            i = ((BaseActivity) kiosonStatusActivity).b;
            int i4 = 52 / 0;
            if (i == 0) {
                return;
            }
        } else {
            i = ((BaseActivity) kiosonStatusActivity).b;
            if (i == 0) {
                return;
            }
        }
        if (kiosonStatusActivity.onTransact.getVisibility() == 0) {
            int i5 = RemoteActionCompatParcelizer + 97;
            MediaBrowserCompat = i5 % 128;
            if (i5 % 2 == 0) {
                drawable = ContextCompat.getDrawable(kiosonStatusActivity, 2131231195);
                kiosonStatusActivity.onTransact.setVisibility(7);
            } else {
                drawable = ContextCompat.getDrawable(kiosonStatusActivity, 2131231195);
                kiosonStatusActivity.onTransact.setVisibility(8);
            }
        } else {
            drawable = ContextCompat.getDrawable(kiosonStatusActivity, 2131231194);
            kiosonStatusActivity.onTransact.setVisibility(0);
        }
        try {
            drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            kiosonStatusActivity.notify.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } catch (RuntimeException e2) {
            String str = kiosonStatusActivity.d;
            StringBuilder sb = new StringBuilder("changeToggleInstructionVisibility");
            sb.append(e2.getMessage());
            Logger.e(str, sb.toString());
        }
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(KiosonStatusActivity kiosonStatusActivity, String str, String str2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 101;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            ClipData.newPlainText(str, str2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ClipboardManager clipboardManager = (ClipboardManager) kiosonStatusActivity.getSystemService("clipboard");
        ClipData clipDataNewPlainText = ClipData.newPlainText(str, str2);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
            return true;
        }
        int i3 = MediaBrowserCompat + 15;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public static /* synthetic */ propagateChildrenTemplate TuitionPaymentFragmentspecialinlinedviewModeldefault3(KiosonStatusActivity kiosonStatusActivity) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 59;
        int i3 = i2 % 128;
        MediaBrowserCompat = i3;
        int i4 = i2 % 2;
        propagateChildrenTemplate propagatechildrentemplate = kiosonStatusActivity.cancel;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 27;
        RemoteActionCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return propagatechildrentemplate;
    }

    private static void m(byte b, short s, int i, Object[] objArr) {
        int i2 = 98 - (b * 14);
        byte[] bArr = $$j;
        int i3 = i + 4;
        byte[] bArr2 = new byte[53 - s];
        int i4 = 52 - s;
        int i5 = -1;
        if (bArr == null) {
            i2 = (i2 + (-i4)) - 11;
            i3++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = (i2 + (-bArr[i3])) - 11;
                i3++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0033 A[PHI: r1 r2
  0x0033: PHI (r1v7 com.midtrans.sdk.uikit.widgets.FancyButton) = (r1v6 com.midtrans.sdk.uikit.widgets.FancyButton), (r1v13 com.midtrans.sdk.uikit.widgets.FancyButton) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r2v2 int) = (r2v1 int), (r2v4 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        FancyButton fancyButton;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 37;
        MediaBrowserCompat = i3 % 128;
        if (i3 % 2 == 0) {
            setPrimaryBackgroundColor(this.INotificationSideChannel);
            setTextColor(this.notify);
            fancyButton = this.cancelAll;
            i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i4 = 95 / 0;
            if (i != 0) {
                int i5 = MediaBrowserCompat + 33;
                RemoteActionCompatParcelizer = i5 % 128;
                int i6 = i5 % 2;
                fancyButton.setBorderColor(i);
                int i7 = MediaBrowserCompat + 13;
                RemoteActionCompatParcelizer = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            setPrimaryBackgroundColor(this.INotificationSideChannel);
            setTextColor(this.notify);
            fancyButton = this.cancelAll;
            i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (i != 0) {
                int i9 = MediaBrowserCompat + 33;
                RemoteActionCompatParcelizer = i9 % 128;
                int i10 = i9 % 2;
                fancyButton.setBorderColor(i);
                int i11 = MediaBrowserCompat + 13;
                RemoteActionCompatParcelizer = i11 % 128;
                int i12 = i11 % 2;
            }
        }
        setTextColor(this.cancelAll);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v5 propagateChildrenTemplate) = (r1v4 propagateChildrenTemplate), (r1v9 propagateChildrenTemplate) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        propagateChildrenTemplate propagatechildrentemplate;
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 37;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            propagatechildrentemplate = this.cancel;
            int i3 = 68 / 0;
            if (propagatechildrentemplate != null) {
                propagatechildrentemplate.TuitionPaymentFragmentbindingInflater1("Back", "Kioson Payment Code");
                int i4 = RemoteActionCompatParcelizer + 21;
                MediaBrowserCompat = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            propagatechildrentemplate = this.cancel;
            if (propagatechildrentemplate != null) {
                propagatechildrentemplate.TuitionPaymentFragmentbindingInflater1("Back", "Kioson Payment Code");
                int i6 = RemoteActionCompatParcelizer + 21;
                MediaBrowserCompat = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        super.onBackPressed();
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 19;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.cancelAll = (FancyButton) findViewById(R.id.btn_copy_va);
        this.INotificationSideChannel = (FancyButton) findViewById(R.id.button_primary);
        this.notify = (AppCompatButton) findViewById(R.id.instruction_toggle);
        this.onTransact = (LinearLayout) findViewById(R.id.instruction_layout);
        this.INotificationSideChannelStub = (SemiBoldTextView) findViewById(R.id.text_validity);
        this.INotificationSideChannelStubProxy = (SemiBoldTextView) findViewById(R.id.text_page_title);
        this.getInterfaceDescriptor = (DefaultTextView) findViewById(R.id.text_payment_code);
        int i4 = RemoteActionCompatParcelizer + 93;
        MediaBrowserCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 59;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            if (i3 != 501467944 + (((~(976639773 | iIdentityHashCode)) | 9021506) * 576) + (((~((~iIdentityHashCode) | 985661279)) | 137630724) * 576) + 901420160) {
                throw null;
            }
        } else {
            int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int i5 = (int) Runtime.getRuntime().totalMemory();
            int i6 = (-1242610118) + (((~((~i5) | 1827039398)) | (-2146430448)) * (-245));
            int i7 = ~(i5 | 1827039398);
            if (i4 != i6 + (i7 * (-245)) + ((i7 | 997051855) * 245)) {
                throw null;
            }
        }
        int i8 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        if (i8 != (-238692436) + ((~((~i9) | (-1884357924))) * (-116)) + ((176876224 | i9) * 116) + (((~(i9 | 1892787555)) | 168446592) * 116)) {
            throw null;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_kioson_status);
        this.cancel = new propagateChildrenTemplate();
        this.cancelAll.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.kioson.status.KiosonStatusActivity.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    KiosonStatusActivity kiosonStatusActivity = KiosonStatusActivity.this;
                    boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault2 = KiosonStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(kiosonStatusActivity, "Payment Code", KiosonStatusActivity.TuitionPaymentFragmentbindingInflater1(kiosonStatusActivity).getText().toString());
                    KiosonStatusActivity kiosonStatusActivity2 = KiosonStatusActivity.this;
                    onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(kiosonStatusActivity2, kiosonStatusActivity2.getString(zTuitionPaymentFragmentspecialinlinedviewModeldefault2 ? R.string.copied_to_clipboard : R.string.failed_to_copy));
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.INotificationSideChannel.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.kioson.status.KiosonStatusActivity.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    KiosonStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(KiosonStatusActivity.this).TuitionPaymentFragmentbindingInflater1("Done Kioson", "Kioson Payment Code");
                    KiosonStatusActivity.this.finish();
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.notify.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.kioson.status.KiosonStatusActivity.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    KiosonStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(KiosonStatusActivity.this);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        TransactionResponse transactionResponse = (TransactionResponse) getIntent().getSerializableExtra("extra.status");
        if (transactionResponse != null) {
            int i10 = RemoteActionCompatParcelizer + 97;
            MediaBrowserCompat = i10 % 128;
            int i11 = i10 % 2;
            if (!TextUtils.isEmpty(transactionResponse.getStatusCode()) && (transactionResponse.getStatusCode().equals(Constants.STATUS_CODE_200) || transactionResponse.getStatusCode().equals(Constants.STATUS_CODE_201))) {
                this.INotificationSideChannelStub.setText(transactionResponse.getKiosonExpireTime());
                if (transactionResponse.getPaymentCodeResponse() != null) {
                    this.getInterfaceDescriptor.setText(transactionResponse.getPaymentCodeResponse());
                }
            }
        }
        this.INotificationSideChannel.setText(getString(R.string.complete_payment_kioson));
        this.INotificationSideChannel.setTextBold();
        this.INotificationSideChannelStubProxy.setText(getString(R.string.kioson));
        this.cancel.b("Kioson Payment Code", getIntent().getBooleanExtra("First Page", true));
    }

    private static void n(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 79;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getLongPressTimeout() >> 16)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2625, 13 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() & (INotificationSideChannelDefault / 9053247990562531611L);
                    try {
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - TextUtils.indexOf("", "", 0)), 481 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19472 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 2624 - View.resolveSizeAndState(0, 0, 0), 12 - MotionEvent.axisFromString(""), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (INotificationSideChannelDefault ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ViewConfiguration.getTouchSlop() >> 8) + 481, (ViewConfiguration.getJumpTapTimeout() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            try {
                Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 39422), TextUtils.getCapsMode("", 0, 0) + 481, (ViewConfiguration.getLongPressTimeout() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        objArr[0] = new String(cArr2);
        int i6 = $11 + 97;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrB$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
            int deadChar = 1031 - KeyEvent.getDeadChar(0, 0);
            int iMyPid = 15 - (Process.myPid() >> 22);
            byte[] bArr = $$j;
            byte b = bArr[5];
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            m(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString, deadChar, iMyPid, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        n(new char[]{49406, 52234, 55565, 58908, 62236, 32785, 36121, 39532, 42792, 46143, 16767, 19973, 23330, 26707, 30033, 591, 3906, 7287, 10581, 13905, 50016, 53347}, 3323 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        n(new char[]{49402, 10776, 5416, '.', 27456, 22125, 16761, 44192, 38818, 33469, 60893, 55538, 50162, 11549, 6176}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 60139, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int iBlue = 1031 - Color.blue(0);
            int i3 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            byte[] bArr2 = $$j;
            byte b3 = bArr2[5];
            byte b4 = bArr2[7];
            Object[] objArr5 = new Object[1];
            m(b3, b4, (short) (b4 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, iBlue, i3, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cMyPid = (char) (Process.myPid() >> 22);
                int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                int i4 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14;
                byte b5 = $$j[7];
                byte b6 = (byte) (b5 | 52);
                Object[] objArr6 = new Object[1];
                m(b5, b6, (short) (b6 << 1), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyPid, iIndexOf, i4, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i7 = (-1573332995) + (((~(431546430 | iMaxMemory)) | (-675826601)) * (-948)) + ((~((~iMaxMemory) | (-541068161))) * (-948)) + 498290354;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            n(new char[]{49397, 37413, 25951, 14447, 35805, 24244, 12764, 33548, 22048, 10498, 64578, 20367, 8872, 62964, 18176, 6695}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto5).substring(8, 9).codePointAt(0) + 21179, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            n(new char[]{49398, 63314, 44968, 26122, 7759, 54971, 36125, 17785, 32159, 13327, 60534, 42164, 23344, 4965, 52165, 33309}, 14249 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-880914215};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 46038), 1134 - TextUtils.indexOf("", ""), (ViewConfiguration.getEdgeSlop() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1877627674, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    int i10 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1030;
                    int iMakeMeasureSpec = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte[] bArr3 = $$j;
                    byte b7 = bArr3[5];
                    byte b8 = bArr3[7];
                    Object[] objArr12 = new Object[1];
                    m(b7, b8, b8, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, i10, iMakeMeasureSpec, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (46041 - AndroidCharacter.getMirror('0')), 1118 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 16 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                    int i11 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1032;
                    int defaultSize = View.getDefaultSize(0, 0) + 15;
                    byte b9 = $$j[7];
                    byte b10 = (byte) (b9 | 52);
                    Object[] objArr13 = new Object[1];
                    m(b9, b10, (short) (b10 << 1), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar2, i11, defaultSize, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    n(new char[]{49406, 52234, 55565, 58908, 62236, 32785, 36121, 39532, 42792, 46143, 16767, 19973, 23330, 26707, 30033, 591, 3906, 7287, 10581, 13905, 50016, 53347}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 3287, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    n(new char[]{49402, 10776, 5416, '.', 27456, 22125, 16761, 44192, 38818, 33469, 60893, 55538, 50162, 11549, 6176}, View.getDefaultSize(0, 0) + 60139, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cAlpha = (char) Color.alpha(0);
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1031;
                        int mode = View.MeasureSpec.getMode(0) + 15;
                        byte[] bArr4 = $$j;
                        byte b11 = bArr4[5];
                        byte b12 = bArr4[7];
                        Object[] objArr16 = new Object[1];
                        m(b11, b12, (short) (b12 | 52), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cAlpha, longPressTimeout, mode, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1032;
                        int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 15;
                        byte[] bArr5 = $$j;
                        byte b13 = bArr5[5];
                        byte b14 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        m(b13, b14, b14, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(capsMode, packedPositionChild, touchSlop2, 1357589585, false, (String) objArr17[0], null);
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
            int i12 = MediaBrowserCompat + 123;
            RemoteActionCompatParcelizer = i12 % 128;
            int i13 = i12 % 2;
            while (i2 < strArr2.length) {
                arrayList.add(strArr2[i2]);
                i2++;
            }
            throw null;
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i14 = ((int[]) objArr[2])[0];
        int i15 = ((int[]) objArr[3])[0];
        int i16 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 2086339140;
        int i17 = ~iCodePointAt;
        int i18 = i14 + (-1374510448) + (((~(132087102 | i17)) | (~((-26285335) | iCodePointAt))) * (-831)) + ((~(402652606 | iCodePointAt)) * (-1662)) + (((~(iCodePointAt | (-132087103))) | (~(i17 | (-376367273))) | (~(376367272 | iCodePointAt))) * 831);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr18[2])[0] = i20 ^ (i20 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c2 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29944);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 1755;
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0) + 23;
            byte b15 = $$j[5];
            Object[] objArr19 = new Object[1];
            m(b15, (byte) (b15 | 14), (short) 104, objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, iMakeMeasureSpec2, iMakeMeasureSpec3, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char mode2 = (char) (29944 - View.MeasureSpec.getMode(0));
                int packedPositionChild2 = 1754 - ExpandableListView.getPackedPositionChild(0L);
                int iMyPid2 = (Process.myPid() >> 22) + 23;
                byte[] bArr6 = $$j;
                byte b16 = bArr6[5];
                byte b17 = bArr6[7];
                Object[] objArr20 = new Object[1];
                m(b16, b17, (short) (b17 | 52), objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(mode2, packedPositionChild2, iMyPid2, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i21 = ((int[]) objArr21[0])[0];
            objArrB$7879113 = new Object[]{new int[]{i21}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i22 = (((~((~iIdentityHashCode) | 803208923)) * 130) - 1803689617) + (((~(iIdentityHashCode | 803208923)) | 587451393) * 130) + 2044482560;
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i24 ^ (i24 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            n(new char[]{49397, 37413, 25951, 14447, 35805, 24244, 12764, 33548, 22048, 10498, 64578, 20367, 8872, 62964, 18176, 6695}, (Process.myTid() >> 22) + 21211, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            n(new char[]{49398, 63314, 44968, 26122, 7759, 54971, 36125, 17785, 32159, 13327, 60534, 42164, 23344, 4965, 52165, 33309}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redeem_bni_details).substring(34, 36).codePointAt(0) + 14139, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {-880914215};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 1726 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 28 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 2044482560, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c3 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1755;
                int i25 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22;
                byte[] bArr7 = $$j;
                byte b18 = bArr7[5];
                byte b19 = bArr7[7];
                Object[] objArr25 = new Object[1];
                m(b18, b19, (short) (b19 | 52), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, keyRepeatDelay, i25, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$7879113);
            try {
                Object[] objArr26 = new Object[1];
                n(new char[]{49406, 52234, 55565, 58908, 62236, 32785, 36121, 39532, 42792, 46143, 16767, 19973, 23330, 26707, 30033, 591, 3906, 7287, 10581, 13905, 50016, 53347}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 3312, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                n(new char[]{49402, 10776, 5416, '.', 27456, 22125, 16761, 44192, 38818, 33469, 60893, 55538, 50162, 11549, 6176}, 60139 - Color.green(0), objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cGreen = (char) (Color.green(0) + 29944);
                    int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0, 0);
                    int touchSlop3 = 23 - (ViewConfiguration.getTouchSlop() >> 8);
                    byte[] bArr8 = $$j;
                    byte b20 = bArr8[5];
                    byte b21 = bArr8[7];
                    Object[] objArr28 = new Object[1];
                    m(b20, b21, (short) (b21 | 141), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cGreen, iLastIndexOf, touchSlop3, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char packedPositionChild3 = (char) (ExpandableListView.getPackedPositionChild(0L) + 29945);
                    int scrollBarFadeDuration = 1755 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int i26 = 23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte b22 = $$j[5];
                    Object[] objArr29 = new Object[1];
                    m(b22, (byte) (b22 | 14), (short) 104, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(packedPositionChild3, scrollBarFadeDuration, i26, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i27 = ((int[]) objArrB$7879113[1])[0];
        int i28 = ((int[]) objArrB$7879113[0])[0];
        if (i28 != i27) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrB$7879113[4];
            if (strArr4 != null) {
                int i29 = MediaBrowserCompat + 11;
                RemoteActionCompatParcelizer = i29 % 128;
                int i30 = i29 % 2;
                while (i2 < strArr4.length) {
                    arrayList2.add(strArr4[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i28));
        }
        int i31 = ((int[]) objArrB$7879113[3])[0];
        int i32 = ((int[]) objArrB$7879113[0])[0];
        Object[] objArr30 = {new int[]{i32}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int i33 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
        int i34 = i31 + 1929030434 + (((~(336124774 | i33)) | (-548727201)) * (-983)) + (((~(i33 | (-548727201))) | 51488) * 983);
        int i35 = (i34 << 13) ^ i34;
        int i36 = i35 ^ (i35 >>> 17);
        ((int[]) objArr30[3])[0] = i36 ^ (i36 << 5);
        int i37 = RemoteActionCompatParcelizer + 61;
        MediaBrowserCompat = i37 % 128;
        int i38 = i37 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~((-345590312) | iIdentityHashCode);
        int i6 = 1680158192 + ((68239398 | i5) * (-280)) + ((i5 | (~(1175577854 | iIdentityHashCode))) * 140);
        int i7 = ~((-277350914) | iIdentityHashCode);
        int i8 = ~iIdentityHashCode;
        if (i4 != i6 + (((~(i8 | 1452928767)) | i7 | (~((-68239399) | i8))) * 140)) {
            int i9 = (-154590852) % 2;
            throw new ArithmeticException();
        }
        int i10 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        if (i10 != (((~(layoutDirection | 379385334)) | (-2095296666)) * 56) + 596252484 + (((~((~layoutDirection) | (-2095296666))) | 379385334) * 56)) {
            int i11 = 1353287872 % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i12 = RemoteActionCompatParcelizer + 11;
        MediaBrowserCompat = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 109;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iMyPid = Process.myPid();
        int i5 = ~iMyPid;
        int i6 = ~((-212953324) | i5);
        int i7 = ~(1042940866 | iMyPid);
        if (i4 != (-328519600) + ((i6 | i7) * 1150) + (((~((-1042940867) | i5)) | i7) * (-575)) + (((~(iMyPid | (-212953324))) | (~(i5 | 212953323))) * 575)) {
            throw new RuntimeException("-2136796272");
        }
        int i8 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        if (i8 != (-2044097113) + (((~(iMaxMemory | 1524779624)) | 1054276340) * 191) + (((~((~iMaxMemory) | 1524779624)) | 605335700) * 191)) {
            throw null;
        }
        super.onStart();
        int i9 = MediaBrowserCompat + 117;
        RemoteActionCompatParcelizer = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 45;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
    }
}
