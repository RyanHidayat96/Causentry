package com.midtrans.sdk.uikit.views.alfamart.status;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
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
import defpackage.SessionProcessor;
import defpackage.ViewPortBuilder;
import defpackage.cacheInteropConfig;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.generateCameraId;
import defpackage.getConfigs;
import defpackage.initSession;
import defpackage.onConnectionFailed;
import defpackage.onScroll;
import defpackage.propagateChildrenTemplate;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class AlfamartStatusActivity extends BasePaymentActivity {
    private FancyButton INotificationSideChannel;
    private SemiBoldTextView INotificationSideChannelStub;
    private DefaultTextView INotificationSideChannelStubProxy;
    private DefaultTextView RemoteActionCompatParcelizer;
    private AppCompatButton cancel;
    private propagateChildrenTemplate cancelAll;
    private FancyButton notify;
    private LinearLayout onTransact;
    private static final byte[] $$m = {90, 46, 113, 8};
    private static final int $$n = 38;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {19, 78, 114, 113, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$k = 126;
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompat = 1;
    private static long getInterfaceDescriptor = -6377398940819159759L;
    private static int INotificationSideChannelDefault = -981105359;
    private static char write = 32943;
    private final String asInterface = "Alfamart Payment Code";
    private final String g = "Done Alfamart";
    private final String d = "AlfamartStatusActivity";

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(AlfamartStatusActivity alfamartStatusActivity, String str, String str2) {
        int i = 2 % 2;
        ClipboardManager clipboardManager = (ClipboardManager) alfamartStatusActivity.getSystemService("clipboard");
        ClipData clipDataNewPlainText = ClipData.newPlainText(str, str2);
        if (clipboardManager == null) {
            int i2 = IconCompatParcelizer + 95;
            MediaBrowserCompat = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 45 / 0;
            }
            return false;
        }
        clipboardManager.setPrimaryClip(clipDataNewPlainText);
        int i4 = MediaBrowserCompat + 39;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(AlfamartStatusActivity alfamartStatusActivity) {
        Drawable drawable;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 81;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((BaseActivity) alfamartStatusActivity).b;
        if (i4 != 0) {
            if (alfamartStatusActivity.onTransact.getVisibility() == 0) {
                int i5 = MediaBrowserCompat + 21;
                IconCompatParcelizer = i5 % 128;
                if (i5 % 2 != 0) {
                    drawable = ContextCompat.getDrawable(alfamartStatusActivity, 2131231195);
                    alfamartStatusActivity.onTransact.setVisibility(10);
                } else {
                    drawable = ContextCompat.getDrawable(alfamartStatusActivity, 2131231195);
                    alfamartStatusActivity.onTransact.setVisibility(8);
                }
            } else {
                Drawable drawable2 = ContextCompat.getDrawable(alfamartStatusActivity, 2131231194);
                alfamartStatusActivity.onTransact.setVisibility(0);
                int i6 = MediaBrowserCompat + 121;
                IconCompatParcelizer = i6 % 128;
                int i7 = i6 % 2;
                drawable = drawable2;
            }
            try {
                drawable.setColorFilter(i4, PorterDuff.Mode.SRC_IN);
                alfamartStatusActivity.cancel.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            } catch (RuntimeException e2) {
                String str = alfamartStatusActivity.d;
                StringBuilder sb = new StringBuilder("changeToggleInstructionVisibility");
                sb.append(e2.getMessage());
                Logger.e(str, sb.toString());
            }
        }
    }

    public static /* synthetic */ propagateChildrenTemplate TuitionPaymentFragmentspecialinlinedviewModeldefault3(AlfamartStatusActivity alfamartStatusActivity) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        int i3 = i2 % 128;
        MediaBrowserCompat = i3;
        int i4 = i2 % 2;
        propagateChildrenTemplate propagatechildrentemplate = alfamartStatusActivity.cancelAll;
        int i5 = i3 + 35;
        IconCompatParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            return propagatechildrentemplate;
        }
        throw null;
    }

    private static void m(int i, byte b, int i2, Object[] objArr) {
        int i3 = 98 - (b * 14);
        byte[] bArr = $$j;
        int i4 = i2 + 4;
        byte[] bArr2 = new byte[53 - i];
        int i5 = 52 - i;
        int i6 = -1;
        if (bArr == null) {
            i4++;
            i3 = (i4 + (-i3)) - 11;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i4];
            i4++;
            i3 = (i3 + (-b2)) - 11;
            i6 = i7;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 89;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        setPrimaryBackgroundColor(this.INotificationSideChannel);
        setTextColor(this.cancel);
        FancyButton fancyButton = this.notify;
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i4 != 0) {
            fancyButton.setBorderColor(i4);
        }
        setTextColor(this.notify);
        int i5 = IconCompatParcelizer + 3;
        MediaBrowserCompat = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a A[PHI: r1
  0x001a: PHI (r1v5 propagateChildrenTemplate) = (r1v4 propagateChildrenTemplate), (r1v9 propagateChildrenTemplate) binds: [B:8:0x0018, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        propagateChildrenTemplate propagatechildrentemplate;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 113;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 == 0) {
            propagatechildrentemplate = this.cancelAll;
            int i3 = 5 / 0;
            if (propagatechildrentemplate != null) {
                propagatechildrentemplate.TuitionPaymentFragmentbindingInflater1("Back", "Alfamart Payment Code");
            }
        } else {
            propagatechildrentemplate = this.cancelAll;
            if (propagatechildrentemplate != null) {
                propagatechildrentemplate.TuitionPaymentFragmentbindingInflater1("Back", "Alfamart Payment Code");
            }
        }
        super.onBackPressed();
        int i4 = MediaBrowserCompat + 63;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 33;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.notify = (FancyButton) findViewById(R.id.btn_copy_va);
        this.INotificationSideChannel = (FancyButton) findViewById(R.id.button_primary);
        this.cancel = (AppCompatButton) findViewById(R.id.instruction_toggle);
        this.onTransact = (LinearLayout) findViewById(R.id.instruction_layout);
        this.INotificationSideChannelStubProxy = (DefaultTextView) findViewById(R.id.text_validity);
        this.INotificationSideChannelStub = (SemiBoldTextView) findViewById(R.id.text_page_title);
        this.RemoteActionCompatParcelizer = (DefaultTextView) findViewById(R.id.text_payment_code);
        int i4 = MediaBrowserCompat + 25;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException {
        int i;
        int i2 = 2 % 2;
        Object obj = null;
        int i3 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i4 = (int) Runtime.getRuntime().totalMemory();
        int i5 = ~i4;
        int i6 = (~(1066729338 | i5)) | 524417;
        int i7 = ~(i4 | (-830511961));
        if (i3 != (((i6 | i7) * (-252)) - 697834460) + ((i7 | (~(i5 | 1067253755))) * 252)) {
            int i8 = MediaBrowserCompat + 115;
            IconCompatParcelizer = i8 % 128;
            int i9 = i8 % 2;
            int[] iArr = new int[368703650];
            iArr[368703649] = 1;
            int i10 = 446975458 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i11 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i12 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        if (i11 != (-1308756986) + (((~((~i12) | (-788306235))) | 1790749730) * (-235)) + (((~((-788306235) | i12)) | 1790749730) * (-470)) + (((~(i12 | (-71307545))) | 1073751040) * 235)) {
            throw new RuntimeException("-562154273");
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_alfamart_status);
        onConnectionFailed.b((AppCompatActivity) this);
        this.cancelAll = new propagateChildrenTemplate((TransactionResponse) getIntent().getSerializableExtra("extra.status"));
        this.notify.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.alfamart.status.AlfamartStatusActivity.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    AlfamartStatusActivity alfamartStatusActivity = AlfamartStatusActivity.this;
                    boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AlfamartStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(alfamartStatusActivity, "Payment Code", AlfamartStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(alfamartStatusActivity).TuitionPaymentFragmentspecialinlinedviewModeldefault3().getPaymentCodeResponse());
                    AlfamartStatusActivity alfamartStatusActivity2 = AlfamartStatusActivity.this;
                    onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(alfamartStatusActivity2, alfamartStatusActivity2.getString(zTuitionPaymentFragmentspecialinlinedviewModeldefault1 ? R.string.copied_to_clipboard : R.string.failed_to_copy));
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.INotificationSideChannel.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.alfamart.status.AlfamartStatusActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    AlfamartStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(AlfamartStatusActivity.this).TuitionPaymentFragmentbindingInflater1("Done Alfamart", "Alfamart Payment Code");
                    AlfamartStatusActivity.this.finish();
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.alfamart.status.AlfamartStatusActivity.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    AlfamartStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(AlfamartStatusActivity.this);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            int i13 = IconCompatParcelizer + 111;
            MediaBrowserCompat = i13 % 128;
            int i14 = i13 % 2;
            if (TextUtils.isEmpty(transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3.getStatusCode()) || !(transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3.getStatusCode().equals(Constants.STATUS_CODE_200) || transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3.getStatusCode().equals(Constants.STATUS_CODE_201))) {
                this.INotificationSideChannelStubProxy.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_offer_failure));
                this.INotificationSideChannelStubProxy.setText(getString(R.string.payment_failed));
            } else {
                this.INotificationSideChannelStubProxy.setText(getString(R.string.text_format_valid_until, transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3.getAlfamartExpireTime()));
                if (transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3.getPaymentCodeResponse() != null) {
                    String paymentCodeResponse = this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3().getPaymentCodeResponse();
                    StringBuilder sb = new StringBuilder();
                    if (!TextUtils.isEmpty(paymentCodeResponse)) {
                        int i15 = 0;
                        while (i15 < paymentCodeResponse.length()) {
                            int i16 = IconCompatParcelizer + 5;
                            MediaBrowserCompat = i16 % 128;
                            if (i16 % 2 != 0 ? (i = i15 + 4) >= paymentCodeResponse.length() : (i = i15 + 3) >= paymentCodeResponse.length()) {
                                sb.append(paymentCodeResponse.substring(i15));
                            } else {
                                int i17 = IconCompatParcelizer + 51;
                                MediaBrowserCompat = i17 % 128;
                                if (i17 % 2 == 0) {
                                    sb.append(paymentCodeResponse.substring(i15, i));
                                    sb.append(" ");
                                    obj.hashCode();
                                    throw null;
                                }
                                sb.append(paymentCodeResponse.substring(i15, i));
                                sb.append(" ");
                            }
                            i15 = i;
                        }
                    }
                    this.RemoteActionCompatParcelizer.setText(sb.toString());
                }
            }
        }
        this.INotificationSideChannel.setText(getString(R.string.complete_payment_alfamart));
        this.INotificationSideChannel.setTextBold();
        this.INotificationSideChannelStub.setText(getString(R.string.alfamart));
        this.cancelAll.b("Alfamart Payment Code", false);
        onConnectionFailed.TuitionPaymentFragmentbindingInflater1();
    }

    private static void n(char[] cArr, char[] cArr2, char c, char[] cArr3, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        int i4 = $11 + 77;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cIndexOf = (char) (8327 - TextUtils.indexOf((CharSequence) "", '0'));
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1235;
                    int iIndexOf = TextUtils.indexOf("", "") + 35;
                    byte b = (byte) i3;
                    byte b2 = b;
                    String str$$u = $$u(b, b2, (byte) (b2 + 2));
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, pressedStateDuration, iIndexOf, -653973969, false, str$$u, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) i3;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Gravity.getAbsoluteGravity(i3, i3), Color.rgb(i3, i3, i3) + 16779980, View.MeasureSpec.getSize(i3) + 14, 1504416861, false, $$u(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43324 - MotionEvent.axisFromString("")), 253 - View.combineMeasuredStates(0, 0), View.MeasureSpec.getSize(0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 65200), 2891 - Color.red(0), 17 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2012627446, false, $$u(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (getInterfaceDescriptor ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) INotificationSideChannelDefault) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) write) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                i3 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
        int i6 = $10 + 73;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrB$7879113;
        Object[] objArr;
        int i;
        int i2;
        int i3 = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cAlpha = (char) (Color.alpha(0) + 29944);
            int i4 = 1756 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23;
            byte[] bArr = $$j;
            Object[] objArr2 = new Object[1];
            m((byte) 15, bArr[5], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha, i4, maximumFlingVelocity, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cRed = (char) (Color.red(0) + 29944);
                int doubleTapTimeout = 1755 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int mirror = 'G' - AndroidCharacter.getMirror('0');
                byte[] bArr2 = $$j;
                byte b = bArr2[7];
                byte b2 = bArr2[5];
                Object[] objArr3 = new Object[1];
                m(b, b2, (short) (b2 | 36), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRed, doubleTapTimeout, mirror, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrB$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ((((-423213295) + (((~(298319241 | iIdentityHashCode)) | 238027330) * 104)) + ((~((~iIdentityHashCode) | (-25424905))) * (-104))) + ((iIdentityHashCode | 510921667) * 104)) - 899751133;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            n(new char[]{48076, 35561, 41717, 19322, 41439, 35657, 40279, 552, 2070, 51405, 50993, 8090, 52731, 22270, 49822, 46339}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 57210), new char[]{25628, 11534, 40662, 35551}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            n(new char[]{33116, 43914, 51968, 9344, 32128, 47484, 55821, 7000, 7802, 30008, 59841, 5111, 50453, 26321, 29421, 10988}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 31810), new char[]{13353, 37229, 26257, 39548}, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {1822681729};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42048 - TextUtils.indexOf((CharSequence) "", '0', 0)), (Process.myTid() >> 22) + 1726, 29 - ExpandableListView.getPackedPositionGroup(0L), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = onScroll.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -899751133, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char packedPositionGroup = (char) (29944 - ExpandableListView.getPackedPositionGroup(0L));
                    int mirror2 = 1803 - AndroidCharacter.getMirror('0');
                    int fadingEdgeLength = 23 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte[] bArr3 = $$j;
                    byte b3 = bArr3[7];
                    byte b4 = bArr3[5];
                    Object[] objArr8 = new Object[1];
                    m(b3, b4, (short) (b4 | 36), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup, mirror2, fadingEdgeLength, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    n(new char[]{23519, 63433, 8006, 4824, 8543, 1640, 63904, 61468, 56740, 17242, 34156, 11438, 19409, 33971, 42827, 9518, 5392, 12567, 25234, 35000, 57015, 3775}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.formatted_installment_month).substring(16, 17).codePointAt(0) - 97), new char[]{25992, 38183, 63011, 37628}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.minutes).substring(0, 1).codePointAt(0) - 109, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    n(new char[]{55051, 9966, 41569, 17555, 28955, 1497, 57908, 46026, 8164, 25117, 51254, 58204, 16750, 18063, 37509}, new char[]{0, 0, 0, 0}, (char) (View.resolveSizeAndState(0, 0, 0) + 17790), new char[]{19471, 5670, 32256, 55109}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1451560, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 29945);
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1755;
                        int i8 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22;
                        byte[] bArr4 = $$j;
                        byte b5 = bArr4[7];
                        byte b6 = bArr4[5];
                        Object[] objArr11 = new Object[1];
                        m(b5, b6, (short) (b6 | 88), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(gidForName, iCombineMeasuredStates, i8, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cArgb = (char) (Color.argb(0, 0, 0, 0) + 29944);
                        int trimmedLength = 1755 - TextUtils.getTrimmedLength("");
                        int bitsPerPixel = 22 - ImageFormat.getBitsPerPixel(0);
                        byte[] bArr5 = $$j;
                        Object[] objArr12 = new Object[1];
                        m((byte) 15, bArr5[5], bArr5[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cArgb, trimmedLength, bitsPerPixel, 986134021, false, (String) objArr12[0], null);
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
        int i9 = ((int[]) objArrB$7879113[1])[0];
        int i10 = ((int[]) objArrB$7879113[0])[0];
        if (i10 == i9) {
            int i11 = ((int[]) objArrB$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i12 = i11 + ((((-1826578221) + (((-369364737) | (~iElapsedRealtime)) * (-490))) + (((~(iElapsedRealtime | 158957791)) | (-528322528)) * 490)) - 1675880388);
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr13[3])[0] = i14 ^ (i14 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$7879113[4];
            if (strArr != null) {
                int i15 = MediaBrowserCompat + 11;
                IconCompatParcelizer = i15 % 128;
                int i16 = i15 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i10 / (((i10 - 1) * i10) % 2), 0).show();
            int i17 = ((int[]) objArrB$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i18 = 964970470 + (((~((~iIdentityHashCode2) | 111294326)) | (-401504247)) * (-245));
            int i19 = ~(iIdentityHashCode2 | 111294326);
            int i20 = i17 + i18 + (i19 * (-245)) + ((i19 | 323896752) * 245);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr14[3])[0] = i22 ^ (i22 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cAlpha2 = (char) Color.alpha(0);
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1031;
            int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 15;
            byte[] bArr6 = $$j;
            byte b7 = bArr6[7];
            byte b8 = bArr6[5];
            Object[] objArr15 = new Object[1];
            m(b7, b8, (short) (b8 | 140), objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cAlpha2, maximumDrawingCacheSize, doubleTapTimeout2, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        n(new char[]{23519, 63433, 8006, 4824, 8543, 1640, 63904, 61468, 56740, 17242, 34156, 11438, 19409, 33971, 42827, 9518, 5392, 12567, 25234, 35000, 57015, 3775}, new char[]{0, 0, 0, 0}, (char) ExpandableListView.getPackedPositionGroup(0L), new char[]{25992, 38183, 63011, 37628}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        n(new char[]{55051, 9966, 41569, 17555, 28955, 1497, 57908, 46026, 8164, 25117, 51254, 58204, 16750, 18063, 37509}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 17779), new char[]{19471, 5670, 32256, 55109}, 1451597 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1031;
            int jumpTapTimeout = 15 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            byte[] bArr7 = $$j;
            byte b9 = bArr7[7];
            byte b10 = bArr7[5];
            Object[] objArr18 = new Object[1];
            m(b9, b10, (short) (b10 | 36), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(modifierMetaStateMask, scrollDefaultDelay, jumpTapTimeout, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char defaultSize = (char) View.getDefaultSize(0, 0);
                int iAxisFromString = 1030 - MotionEvent.axisFromString("");
                int i23 = 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                byte b11 = (byte) ($$k & 181);
                byte b12 = $$j[7];
                Object[] objArr19 = new Object[1];
                m(b11, b12, (short) (b12 | 193), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(defaultSize, iAxisFromString, i23, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr20[3])[0];
            int i25 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iMyUid = Process.myUid();
            int i26 = (-1475168503) + (((~(701001897 | iMyUid)) | (-456721728)) * 672);
            int i27 = ~iMyUid;
            int i28 = i26 + (((~(iMyUid | (-456721728))) | (~((-701001898) | i27))) * (-672)) + (((~(456721727 | i27)) | (-1006204352)) * 672) + 2011554161;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            i2 = 2;
            ((int[]) objArr[2])[0] = i30 ^ (i30 << 5);
            i = IconCompatParcelizer + 15;
            MediaBrowserCompat = i % 128;
        } else {
            Object[] objArr21 = new Object[1];
            n(new char[]{48076, 35561, 41717, 19322, 41439, 35657, 40279, 552, 2070, 51405, 50993, 8090, 52731, 22270, 49822, 46339}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 57134), new char[]{25628, 11534, 40662, 35551}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            n(new char[]{33116, 43914, 51968, 9344, 32128, 47484, 55821, 7000, 7802, 30008, 59841, 5111, 50453, 26321, 29421, 10988}, new char[]{0, 0, 0, 0}, (char) (31846 - ExpandableListView.getPackedPositionGroup(0L)), new char[]{13353, 37229, 26257, 39548}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notification_token_message).substring(1, 2).length() - 1, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {1822681729};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46037 - TextUtils.indexOf((CharSequence) "", '0', 0)), 1134 - ExpandableListView.getPackedPositionType(0L), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 2011554161, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char modifierMetaStateMask2 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1031;
                int i31 = 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                byte[] bArr8 = $$j;
                byte b13 = bArr8[7];
                byte b14 = bArr8[5];
                Object[] objArr25 = new Object[1];
                m(b13, b14, (short) (b14 | 140), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(modifierMetaStateMask2, edgeSlop, i31, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 1117 - (ViewConfiguration.getScrollBarSize() >> 8), 17 - ExpandableListView.getPackedPositionGroup(0L)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                int modifierMetaStateMask3 = ((byte) KeyEvent.getModifierMetaStateMask()) + 1032;
                int size = 15 - View.MeasureSpec.getSize(0);
                byte b15 = (byte) ($$k & 181);
                byte b16 = $$j[7];
                Object[] objArr26 = new Object[1];
                m(b15, b16, (short) (b16 | 193), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(longPressTimeout, modifierMetaStateMask3, size, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                n(new char[]{23519, 63433, 8006, 4824, 8543, 1640, 63904, 61468, 56740, 17242, 34156, 11438, 19409, 33971, 42827, 9518, 5392, 12567, 25234, 35000, 57015, 3775}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 98), new char[]{25992, 38183, 63011, 37628}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                n(new char[]{55051, 9966, 41569, 17555, 28955, 1497, 57908, 46026, 8164, 25117, 51254, 58204, 16750, 18063, 37509}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 17754), new char[]{19471, 5670, 32256, 55109}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_message_invalid_cvv).substring(12, 13).length() + 1451595, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 1032;
                    int iResolveOpacity = 15 - Drawable.resolveOpacity(0, 0);
                    byte[] bArr9 = $$j;
                    byte b17 = bArr9[7];
                    byte b18 = bArr9[5];
                    Object[] objArr29 = new Object[1];
                    m(b17, b18, (short) (b18 | 36), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c, iIndexOf, iResolveOpacity, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int maximumDrawingCacheSize2 = 1031 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 15;
                    byte[] bArr10 = $$j;
                    byte b19 = bArr10[7];
                    byte b20 = bArr10[5];
                    Object[] objArr30 = new Object[1];
                    m(b19, b20, (short) (b20 | 140), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(scrollBarSize, maximumDrawingCacheSize2, deadChar, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                i = MediaBrowserCompat + 63;
                IconCompatParcelizer = i % 128;
                i2 = 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i32 = i % i2;
        int i33 = ((int[]) objArr[1])[0];
        int i34 = ((int[]) objArr[3])[0];
        if (i34 == i33) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i35 = ((int[]) objArr[2])[0];
            int i36 = ((int[]) objArr[3])[0];
            int i37 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iMyPid = Process.myPid();
            int i38 = i35 + 1735288292 + (((~(iMyPid | 553967163)) | 309403840) * 305) + (((~((~iMyPid) | 553967163)) | 309686993) * 305);
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr31[2])[0] = i40 ^ (i40 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str2 : strArr4) {
                arrayList2.add(str2);
            }
        }
        int[] iArr = new int[i34];
        int i41 = i34 - 1;
        iArr[i41] = 1;
        Toast.makeText((Context) null, iArr[((i34 * i41) % 2) - 1], 1).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i42 = ((int[]) objArr[2])[0];
        int i43 = ((int[]) objArr[3])[0];
        int i44 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1497919341;
        int i45 = 714663753 + (((~(226999975 | length)) | 17280194) * 672);
        int i46 = ~length;
        int i47 = i42 + i45 + (((~(length | 17280194)) | (~((-226999976) | i46))) * (-672)) + (((~((-17280195) | i46)) | 64) * 672);
        int i48 = i47 ^ (i47 << 13);
        int i49 = i48 ^ (i48 >>> 17);
        ((int[]) objArr32[2])[0] = i49 ^ (i49 << 5);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 57;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2079618259;
        int i6 = ~i5;
        if (i4 != (-557952628) + ((i5 | (-1085173113)) * 140) + (((~((-1085173113) | i6)) | 2375712) * (-280)) + (((~(i5 | (-2375713))) | (~(255185569 | i6)) | (-1337982970)) * 140)) {
            int i7 = (-1712986034) % 2;
            throw new ArithmeticException();
        }
        int i8 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message).substring(0, 25).length() + 22045777;
        int i9 = ~((-1817317825) | length);
        int i10 = ~length;
        int i11 = i9 | (~(761738140 | i10));
        int i12 = ~(1817317824 | i10);
        if (i8 != 1797326316 + ((i11 | i12) * (-516)) + (((~(length | (-742527361))) | (~((-19210781) | i10))) * 516) + ((19210780 | i12) * 516)) {
            throw null;
        }
        super.onResume();
        int i13 = MediaBrowserCompat + 33;
        IconCompatParcelizer = i13 % 128;
        if (i13 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 21;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        int i6 = ~(120032135 | i5);
        if (i4 != 1797299576 + (((-1067954144) | i6) * (-712)) + (((~(iIdentityHashCode | (-947922009))) | (~(i5 | 1067954143))) * (-712)) + ((950019678 | i6) * 712)) {
            int i7 = (-311595756) % 2;
            throw new ArithmeticException();
        }
        int i8 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_image_captured_failed).substring(6, 7).codePointAt(0) - 1394463799;
        int i9 = ~iCodePointAt;
        if (i8 != 1690430396 + (((~(i9 | (-1749614758))) | 33703426) * 220) + (((~(i9 | (-2105381094))) | 389469762) * (-440)) + ((iCodePointAt | (-1749614758)) * 220)) {
            int i10 = 38055186 % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i11 = IconCompatParcelizer + 79;
        MediaBrowserCompat = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 107;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$u(int r5, byte r6, byte r7) {
        /*
            int r7 = 104 - r7
            int r6 = r6 * 2
            int r6 = 3 - r6
            byte[] r0 = com.midtrans.sdk.uikit.views.alfamart.status.AlfamartStatusActivity.$$m
            int r5 = r5 * 3
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r5
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            r3 = r0[r6]
        L26:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.alfamart.status.AlfamartStatusActivity.$$u(int, byte, byte):java.lang.String");
    }
}
