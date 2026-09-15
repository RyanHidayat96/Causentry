package com.midtrans.sdk.uikit.views.telkomsel_cash;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bpjstku.R;
import com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda7;
import com.google.android.material.textfield.TextInputLayout;
import com.midtrans.sdk.corekit.callback.TransactionCallback;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import com.midtrans.sdk.uikit.widgets.SemiBoldTextView;
import defpackage.ViewPortBuilder;
import defpackage.cacheInteropConfig;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.filterOutChildSizesCausingDoubleCropping;
import defpackage.generateCameraId;
import defpackage.getChildren;
import defpackage.getConfigs;
import defpackage.handleMessage;
import defpackage.initSession;
import defpackage.onConnectionFailed;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes4.dex */
public class TelkomselCashPaymentActivity extends BasePaymentActivity implements filterOutChildSizesCausingDoubleCropping {
    private TextInputLayout INotificationSideChannel;
    private AppCompatEditText cancel;
    private getChildren cancelAll;
    private int g;
    private SemiBoldTextView notify;
    private FancyButton onTransact;
    private static final byte[] $$m = {21, ByteCompanionObject.MAX_VALUE, 49, -115};
    private static final int $$n = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {67, -127, -109, 9, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$k = 184;
    private static int INotificationSideChannelDefault = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int INotificationSideChannelStub = -83722374;
    private final String asInterface = "Telkomsel Cash Overview";
    private final String d = "Confirm Payment Telkomsel Cash";

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(TelkomselCashPaymentActivity telkomselCashPaymentActivity, String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        telkomselCashPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
        int i4 = RemoteActionCompatParcelizer + 25;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
    }

    public static /* synthetic */ getChildren TuitionPaymentFragmentspecialinlinedviewModeldefault1(TelkomselCashPaymentActivity telkomselCashPaymentActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 101;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        getChildren getchildren = telkomselCashPaymentActivity.cancelAll;
        int i5 = i2 + 121;
        RemoteActionCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return getchildren;
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(TelkomselCashPaymentActivity telkomselCashPaymentActivity, String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean z = true;
        if (!TextUtils.isEmpty(str)) {
            telkomselCashPaymentActivity.INotificationSideChannel.setError("");
            return true;
        }
        int i4 = RemoteActionCompatParcelizer + 47;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 != 0) {
            telkomselCashPaymentActivity.INotificationSideChannel.setError(telkomselCashPaymentActivity.getString(R.string.error_empty_tcash_token_field));
        } else {
            telkomselCashPaymentActivity.INotificationSideChannel.setError(telkomselCashPaymentActivity.getString(R.string.error_empty_tcash_token_field));
            z = false;
        }
        int i5 = INotificationSideChannelDefault + 57;
        RemoteActionCompatParcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ AppCompatEditText TuitionPaymentFragmentspecialinlinedviewModeldefault3(TelkomselCashPaymentActivity telkomselCashPaymentActivity) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        int i3 = i2 % 128;
        INotificationSideChannelDefault = i3;
        int i4 = i2 % 2;
        AppCompatEditText appCompatEditText = telkomselCashPaymentActivity.cancel;
        int i5 = i3 + 79;
        RemoteActionCompatParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return appCompatEditText;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.midtrans.sdk.uikit.views.telkomsel_cash.TelkomselCashPaymentActivity.$$j
            int r8 = r8 + 4
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r1 = 53 - r7
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L29:
            int r6 = r6 + r8
            int r6 = r6 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.telkomsel_cash.TelkomselCashPaymentActivity.m(short, int, int, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        setPrimaryBackgroundColor(this.onTransact);
        b(this.cancel);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.INotificationSideChannel);
        int i4 = INotificationSideChannelDefault + 81;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 29;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 != 0) {
            super.onActivityResult(i, i2, intent);
            if (i == 3495) {
                TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                Intent intent2 = new Intent();
                intent2.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                setResult(-1, intent2);
                finish();
                int i5 = INotificationSideChannelDefault + 11;
                RemoteActionCompatParcelizer = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            super.onActivityResult(i, i2, intent);
            if (i == 210) {
                TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault4 = this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                Intent intent3 = new Intent();
                intent3.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                setResult(-1, intent3);
                finish();
                int i7 = INotificationSideChannelDefault + 11;
                RemoteActionCompatParcelizer = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        int i9 = INotificationSideChannelDefault + 113;
        RemoteActionCompatParcelizer = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 31 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 47;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.onTransact = (FancyButton) findViewById(R.id.button_primary);
        this.cancel = (AppCompatEditText) findViewById(R.id.telkomsel_token_et);
        this.INotificationSideChannel = (TextInputLayout) findViewById(R.id.telkomsel_token_til);
        this.notify = (SemiBoldTextView) findViewById(R.id.text_page_title);
        int i4 = RemoteActionCompatParcelizer + 17;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 21;
        int i3 = i2 % 128;
        INotificationSideChannelDefault = i3;
        int i4 = i2 % 2;
        getChildren getchildren = this.cancelAll;
        if (getchildren != null) {
            int i5 = i3 + 113;
            RemoteActionCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
            getchildren.TuitionPaymentFragmentbindingInflater1("Back", "Telkomsel Cash Overview");
        }
        super.onBackPressed();
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 107;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            int i4 = INotificationSideChannelDefault + 49;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.b(th, this).TuitionPaymentFragmentbindingInflater1);
        }
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void b(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 17;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 == 0) {
            b();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        } else {
            b();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
        int i6 = ~(1502654980 | i5);
        int i7 = ~i5;
        if (i4 != 752373724 + ((i6 | (~((-1367384065) | i7))) * (-406)) + ((~(2040051501 | i7)) * (-406)) + (((~(i5 | (-672667438))) | (~((-1502654981) | i7))) * 406)) {
            int i8 = 917180888 % 2;
            throw new ArithmeticException();
        }
        int i9 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i10 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1889947016;
        int i11 = ~i10;
        if (i9 != 2050192698 + (((~(i11 | 1920678519)) | 658377445) * (-1042)) + ((1920678519 | i10) * 521) + (((~(i10 | (-658377446))) | 574229093 | (~(i11 | 2004826871))) * 521)) {
            throw null;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_telkomsel_cash);
        this.cancelAll = new getChildren(this);
        this.onTransact.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.telkomsel_cash.TelkomselCashPaymentActivity.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TelkomselCashPaymentActivity.this);
                    TelkomselCashPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TelkomselCashPaymentActivity.this).TuitionPaymentFragmentbindingInflater1("Confirm Payment Telkomsel Cash", "Telkomsel Cash Overview");
                    String strTrim = TelkomselCashPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(TelkomselCashPaymentActivity.this).getText().toString().trim();
                    if (TelkomselCashPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(TelkomselCashPaymentActivity.this, strTrim)) {
                        TelkomselCashPaymentActivity telkomselCashPaymentActivity = TelkomselCashPaymentActivity.this;
                        TelkomselCashPaymentActivity.TuitionPaymentFragmentbindingInflater1(telkomselCashPaymentActivity, telkomselCashPaymentActivity.getString(R.string.processing_payment));
                        getChildren getchildrenTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TelkomselCashPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TelkomselCashPaymentActivity.this);
                        getchildrenTuitionPaymentFragmentspecialinlinedviewModeldefault1.b().paymentUsingTelkomselEcash(getchildrenTuitionPaymentFragmentspecialinlinedviewModeldefault1.b().readAuthenticationToken(), strTrim, new TransactionCallback() { // from class: getChildren.3
                            public AnonymousClass3() {
                            }

                            @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                            public final void onError(Throwable th) {
                                ((filterOutChildSizesCausingDoubleCropping) getChildren.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
                            }

                            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                            public final void onFailure(TransactionResponse transactionResponse, String str) {
                                getChildren.this.b = transactionResponse;
                                ((filterOutChildSizesCausingDoubleCropping) getChildren.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
                            }

                            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                            public final void onSuccess(TransactionResponse transactionResponse) {
                                getChildren.this.b = transactionResponse;
                                ((filterOutChildSizesCausingDoubleCropping) getChildren.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
                            }
                        });
                    }
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.onTransact.setText(getString(R.string.confirm_payment));
        this.notify.setText(getString(R.string.telkomsel_cash));
        this.onTransact.setTextBold();
        this.cancelAll.b("Telkomsel Cash Overview", getIntent().getBooleanExtra("First Page", true));
        int i12 = RemoteActionCompatParcelizer + 41;
        INotificationSideChannelDefault = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 7;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        b();
        int i4 = this.g;
        if (i4 < 2) {
            this.g = i4 + 1;
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, getString(R.string.error_message_invalid_input_telkomsel));
        } else if (transactionResponse != null) {
            int i5 = RemoteActionCompatParcelizer + 31;
            INotificationSideChannelDefault = i5 % 128;
            int i6 = i5 % 2;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            if (i6 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:17:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:19:0x017f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0278 A[Catch: all -> 0x0c44, TryCatch #1 {all -> 0x0c44, blocks: (B:20:0x0264, B:22:0x0278, B:23:0x02aa, B:51:0x0869, B:53:0x087d, B:54:0x08ab, B:56:0x08dd, B:57:0x0957), top: B:101:0x0264 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:31:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:34:0x0413  */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object[] objArrB$5f1425da;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = 0;
        if (i2 % 2 != 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char pressedStateDuration = (char) (29944 - (ViewConfiguration.getPressedStateDuration() >> 16));
                int scrollBarSize = 1755 - (ViewConfiguration.getScrollBarSize() >> 8);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 24;
                byte[] bArr = $$j;
                byte b = bArr[28];
                Object[] objArr2 = new Object[1];
                m(b, (byte) (b | 14), bArr[7], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(pressedStateDuration, scrollBarSize, packedPositionChild, 986134021, false, (String) objArr2[0], null);
            }
            int i4 = 15 / 0;
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29944);
                    int i5 = 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iIndexOf = 23 - TextUtils.indexOf("", "", 0);
                    byte[] bArr2 = $$j;
                    byte b2 = bArr2[28];
                    byte b3 = bArr2[7];
                    Object[] objArr3 = new Object[1];
                    m(b2, b3, (short) (b3 | 37), objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay, i5, iIndexOf, 1599039318, false, (String) objArr3[0], null);
                }
                Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                int i6 = ((int[]) objArr4[0])[0];
                objArrB$5f1425da = new Object[]{new int[]{i6}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
                int i7 = (int) Runtime.getRuntime().totalMemory();
                int i8 = (((((~(365438551 | i7)) | (-935072455)) * 398) + 746899965) + (((~((~i7) | 365438551)) | (-935072455)) * 398)) - 687144045;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArrB$5f1425da[3])[0] = i10 ^ (i10 << 5);
            } else {
                Object[] objArr5 = new Object[1];
                n(new char[]{20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535}, false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gb_t_ev_connector_type).substring(0, 4).codePointAt(1) - 50, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 121, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_phone_number).substring(0, 2).codePointAt(0) - 64, objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                n(new char[]{65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506}, false, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 90, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 39, objArr6);
                int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr7 = {-1392649899};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 42048), 1726 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Color.green(0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrB$5f1425da = PMIRegistrationDataStore$$ExternalSyntheticLambda7.b$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr7), -687144045);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 29944);
                        int iIndexOf2 = 1755 - TextUtils.indexOf("", "");
                        int iIndexOf3 = 23 - TextUtils.indexOf("", "", 0);
                        byte[] bArr3 = $$j;
                        byte b4 = bArr3[28];
                        byte b5 = bArr3[7];
                        Object[] objArr8 = new Object[1];
                        m(b4, b5, (short) (b5 | 37), objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority, iIndexOf2, iIndexOf3, 1599039318, false, (String) objArr8[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrB$5f1425da);
                    try {
                        Object[] objArr9 = new Object[1];
                        n(new char[]{0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f'}, false, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, TextUtils.lastIndexOf("", '0', 0, 0) + 124, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 34, objArr9);
                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        n(new char[]{'\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5}, false, AndroidCharacter.getMirror('0') - '!', ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_bank_transfer).substring(0, 3).length() + 124, ExpandableListView.getPackedPositionGroup(0L) + 4, objArr10);
                        long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c = (char) (29945 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                            int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 23;
                            byte[] bArr4 = $$j;
                            byte b6 = bArr4[28];
                            byte b7 = bArr4[7];
                            Object[] objArr11 = new Object[1];
                            m(b6, b7, (short) (b7 | 89), objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, scrollDefaultDelay2, offsetBefore, 1596667560, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29944);
                            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1755;
                            int deadChar = 23 - KeyEvent.getDeadChar(0, 0);
                            byte[] bArr5 = $$j;
                            byte b8 = bArr5[28];
                            Object[] objArr12 = new Object[1];
                            m(b8, (byte) (b8 | 14), bArr5[7], objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity, offsetAfter, deadChar, 986134021, false, (String) objArr12[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
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
        } else {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char deadChar2 = (char) (29944 - KeyEvent.getDeadChar(0, 0));
                int iResolveOpacity = 1755 - Drawable.resolveOpacity(0, 0);
                int iResolveOpacity2 = 23 - Drawable.resolveOpacity(0, 0);
                byte[] bArr6 = $$j;
                byte b9 = bArr6[28];
                Object[] objArr13 = new Object[1];
                m(b9, (byte) (b9 | 14), bArr6[7], objArr13);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(deadChar2, iResolveOpacity, iResolveOpacity2, 986134021, false, (String) objArr13[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char scrollDefaultDelay3 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29944);
                    int i11 = 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iIndexOf4 = 23 - TextUtils.indexOf("", "", 0);
                    byte[] bArr7 = $$j;
                    byte b10 = bArr7[28];
                    byte b11 = bArr7[7];
                    Object[] objArr14 = new Object[1];
                    m(b10, b11, (short) (b11 | 37), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay3, i11, iIndexOf4, 1599039318, false, (String) objArr14[0], null);
                }
                Object[] objArr15 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                int i12 = ((int[]) objArr15[0])[0];
                objArrB$5f1425da = new Object[]{new int[]{i12}, new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[1], (String[]) objArr15[4]};
                int i13 = (int) Runtime.getRuntime().totalMemory();
                int i14 = (((((~(365438551 | i13)) | (-935072455)) * 398) + 746899965) + (((~((~i13) | 365438551)) | (-935072455)) * 398)) - 687144045;
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArrB$5f1425da[3])[0] = i16 ^ (i16 << 5);
            } else {
                Object[] objArr16 = new Object[1];
                n(new char[]{20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535}, false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gb_t_ev_connector_type).substring(0, 4).codePointAt(1) - 50, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 121, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_phone_number).substring(0, 2).codePointAt(0) - 64, objArr16);
                Class<?> cls3 = Class.forName((String) objArr16[0]);
                Object[] objArr17 = new Object[1];
                n(new char[]{65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506}, false, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 90, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 39, objArr17);
                int iIntValue2 = ((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr18 = {-1392649899};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 42048), 1726 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Color.green(0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$5f1425da = PMIRegistrationDataStore$$ExternalSyntheticLambda7.b$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr18), -687144045);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char threadPriority2 = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 29944);
                    int iIndexOf5 = 1755 - TextUtils.indexOf("", "");
                    int iIndexOf6 = 23 - TextUtils.indexOf("", "", 0);
                    byte[] bArr8 = $$j;
                    byte b12 = bArr8[28];
                    byte b13 = bArr8[7];
                    Object[] objArr19 = new Object[1];
                    m(b12, b13, (short) (b13 | 37), objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority2, iIndexOf5, iIndexOf6, 1599039318, false, (String) objArr19[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrB$5f1425da);
                Object[] objArr20 = new Object[1];
                n(new char[]{0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f'}, false, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, TextUtils.lastIndexOf("", '0', 0, 0) + 124, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 34, objArr20);
                Class<?> cls4 = Class.forName((String) objArr20[0]);
                Object[] objArr110 = new Object[1];
                n(new char[]{'\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5}, false, AndroidCharacter.getMirror('0') - '!', ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_bank_transfer).substring(0, 3).length() + 124, ExpandableListView.getPackedPositionGroup(0L) + 4, objArr110);
                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr110[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (29945 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int scrollDefaultDelay4 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                    int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 23;
                    byte[] bArr9 = $$j;
                    byte b14 = bArr9[28];
                    byte b15 = bArr9[7];
                    Object[] objArr111 = new Object[1];
                    m(b14, b15, (short) (b15 | 89), objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, scrollDefaultDelay4, offsetBefore2, 1596667560, false, (String) objArr111[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char minimumFlingVelocity2 = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29944);
                    int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 1755;
                    int deadChar3 = 23 - KeyEvent.getDeadChar(0, 0);
                    byte[] bArr10 = $$j;
                    byte b16 = bArr10[28];
                    Object[] objArr112 = new Object[1];
                    m(b16, (byte) (b16 | 14), bArr10[7], objArr112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity2, offsetAfter2, deadChar3, 986134021, false, (String) objArr112[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf4);
            }
        }
        int i17 = ((int[]) objArrB$5f1425da[1])[0];
        int i18 = ((int[]) objArrB$5f1425da[0])[0];
        if (i18 != i17) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$5f1425da[4];
            if (strArr != null) {
                while (i3 < strArr.length) {
                    arrayList.add(strArr[i3]);
                    i3++;
                    int i19 = INotificationSideChannelDefault + 87;
                    RemoteActionCompatParcelizer = i19 % 128;
                    if (i19 % 2 == 0) {
                        int i20 = 5 / 2;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i18));
        }
        int i21 = ((int[]) objArrB$5f1425da[3])[0];
        int i22 = ((int[]) objArrB$5f1425da[0])[0];
        Object[] objArr21 = {new int[]{i22}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i23 = i21 + (-1987310087) + (((~(660224702 | iIdentityHashCode)) | 268714048) * 576) + (((~((~iIdentityHashCode) | 928938750)) | 604113080) * 576) + 160468992;
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr21[3])[0] = i25 ^ (i25 << 5);
        int i26 = RemoteActionCompatParcelizer + 67;
        INotificationSideChannelDefault = i26 % 128;
        int i27 = i26 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char mode = (char) View.MeasureSpec.getMode(0);
            int gidForName = Process.getGidForName("") + 1032;
            int iRed = Color.red(0) + 15;
            byte[] bArr11 = $$j;
            byte b17 = bArr11[28];
            byte b18 = bArr11[7];
            Object[] objArr22 = new Object[1];
            m(b17, b18, (short) (b18 | 141), objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(mode, gidForName, iRed, 1357589585, false, (String) objArr22[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr23 = new Object[1];
        n(new char[]{0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f'}, false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_status_title).substring(1, 3).length() + 20, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.empty_card_number).substring(11, 12).length() + 122, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_face_too_close).substring(18, 19).codePointAt(0) - 30, objArr23);
        Class<?> cls5 = Class.forName((String) objArr23[0]);
        Object[] objArr24 = new Object[1];
        n(new char[]{'\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5}, false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_kioson).substring(1, 3).length() + 125, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4, objArr24);
        long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
            int i28 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1030;
            int iAlpha = Color.alpha(0) + 15;
            byte[] bArr12 = $$j;
            byte b19 = bArr12[28];
            byte b20 = bArr12[7];
            Object[] objArr25 = new Object[1];
            m(b19, b20, (short) (b20 | 37), objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf, i28, iAlpha, 1344079056, false, (String) objArr25[0], null);
        }
        if (j == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                int maxKeyCode = 1031 - (KeyEvent.getMaxKeyCode() >> 16);
                int i29 = 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte b21 = $$j[7];
                Object[] objArr26 = new Object[1];
                m(b21, (byte) (b21 | 52), (short) 193, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cLastIndexOf, maxKeyCode, i29, 632103528, false, (String) objArr26[0], null);
            }
            Object[] objArr27 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i30 = ((int[]) objArr27[3])[0];
            int i31 = ((int[]) objArr27[1])[0];
            String[] strArr2 = (String[]) objArr27[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i32 = ~iIdentityHashCode2;
            int i33 = (((1362835154 + (((~(i32 | 112822916)) | 131457253) * (-1042))) + ((112822916 | iIdentityHashCode2) * 521)) + ((((~(iIdentityHashCode2 | (-131457254))) | 110198916) | (~(i32 | 134081253))) * 521)) - 476182888;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr[2])[0] = i35 ^ (i35 << 5);
        } else {
            Object[] objArr28 = new Object[1];
            n(new char[]{20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535}, false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_alfamart).substring(19, 20).length() + 15, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_permission).substring(0, 77).codePointAt(62) + 21, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_3).substring(1, 3).length() + 12, objArr28);
            Class<?> cls6 = Class.forName((String) objArr28[0]);
            Object[] objArr29 = new Object[1];
            n(new char[]{65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506}, false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, 127 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 29, objArr29);
            int iIntValue3 = ((Integer) cls6.getMethod((String) objArr29[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr30 = {-1392649899};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (46038 - TextUtils.getOffsetAfter("", 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1135, 18 - TextUtils.getOffsetAfter("", 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr31 = {Integer.valueOf(iIntValue3), 0, -476182888, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr30), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int i36 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1031;
                int scrollDefaultDelay5 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15;
                byte[] bArr13 = $$j;
                byte b22 = bArr13[28];
                byte b23 = bArr13[7];
                Object[] objArr32 = new Object[1];
                m(b22, b23, (short) (b23 | 141), objArr32);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(touchSlop, i36, scrollDefaultDelay5, 1298546779, false, (String) objArr32[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45994 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 1117, 17 - TextUtils.getOffsetBefore("", 0)), Boolean.TYPE});
            }
            Object[] objArr33 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr31);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int i37 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1030;
                int maximumDrawingCacheSize = 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte b24 = $$j[7];
                Object[] objArr34 = new Object[1];
                m(b24, (byte) (b24 | 52), (short) 193, objArr34);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cMakeMeasureSpec, i37, maximumDrawingCacheSize, 632103528, false, (String) objArr34[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr33);
            try {
                Object[] objArr35 = new Object[1];
                n(new char[]{0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f'}, false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_mobile_instruction_5).substring(6, 7).length() + 21, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_confirm_shopeepay_deeplink).substring(1, 2).codePointAt(0) + 26, 2 - (Process.myPid() >> 22), objArr35);
                Class<?> cls7 = Class.forName((String) objArr35[0]);
                Object[] objArr36 = new Object[1];
                n(new char[]{'\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5}, false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indomaret_instruction_step1).substring(2, 4).codePointAt(1) - 86, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 111, objArr36);
                long jLongValue4 = ((Long) cls7.getDeclaredMethod((String) objArr36[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char maximumDrawingCacheSize2 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int i38 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1030;
                    int packedPositionType = 15 - ExpandableListView.getPackedPositionType(0L);
                    byte[] bArr14 = $$j;
                    byte b25 = bArr14[28];
                    byte b26 = bArr14[7];
                    Object[] objArr37 = new Object[1];
                    m(b25, b26, (short) (b26 | 37), objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(maximumDrawingCacheSize2, i38, packedPositionType, 1344079056, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int iLastIndexOf = 1030 - TextUtils.lastIndexOf("", '0');
                    int iLastIndexOf2 = 14 - TextUtils.lastIndexOf("", '0', 0, 0);
                    byte[] bArr15 = $$j;
                    byte b27 = bArr15[28];
                    byte b28 = bArr15[7];
                    Object[] objArr38 = new Object[1];
                    m(b27, b28, (short) (b28 | 141), objArr38);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(tapTimeout, iLastIndexOf, iLastIndexOf2, 1357589585, false, (String) objArr38[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf6);
                objArr = objArr33;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i39 = ((int[]) objArr[1])[0];
        int i40 = ((int[]) objArr[3])[0];
        if (i40 != i39) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                while (i3 < strArr3.length) {
                    arrayList2.add(strArr3[i3]);
                    i3++;
                }
            }
            throw new RuntimeException(String.valueOf(i40));
        }
        int i41 = INotificationSideChannelDefault + 35;
        RemoteActionCompatParcelizer = i41 % 128;
        int i42 = i41 % 2;
        Object[] objArr39 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i43 = ((int[]) objArr[2])[0];
        int i44 = ((int[]) objArr[3])[0];
        int i45 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i46 = ~iIdentityHashCode3;
        int i47 = (~((-36754121) | i46)) | 35668552;
        int i48 = ~(iIdentityHashCode3 | (-206440482));
        int i49 = i43 + (-1257020920) + ((i47 | i48) * (-713)) + (i48 * 1426) + ((~((-207526050) | i46)) * 713);
        int i50 = i49 ^ (i49 << 13);
        int i51 = i50 ^ (i50 >>> 17);
        ((int[]) objArr39[2])[0] = i51 ^ (i51 << 5);
    }

    private static void n(char[] cArr, boolean z, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i2 + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i6 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(INotificationSideChannelStub)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 1;
                    byte b2 = (byte) (b - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 3292 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (Process.myPid() >> 22) + 31, 1199271174, false, $$u(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 652, 45 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -450685997, false, $$u(b3, b4, b4), new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            int i7 = $10 + 43;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            int i9 = $11 + 61;
            $10 = i9 % 128;
            loop1: while (true) {
                int i10 = i9 % 2;
                do {
                    if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i) {
                        break loop1;
                    }
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 699 - AndroidCharacter.getMirror('0'), KeyEvent.getDeadChar(0, 0) + 44, -450685997, false, $$u(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    i4 = $11 + 79;
                    $10 = i4 % 128;
                } while (i4 % 2 == 0);
                i9 = 3;
            }
            int i11 = $10 + 69;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 11;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != (-402283012) + (((~((~iIdentityHashCode) | (-842079445))) | (-1672066988)) * (-235)) + (((~((-842079445) | iIdentityHashCode)) | (-1672066988)) * (-470)) + (((~(iIdentityHashCode | (-572593281))) | (-1941553152)) * 235)) {
            int i5 = 1881390050 % 2;
            throw new ArithmeticException();
        }
        int i6 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
        int i8 = ~i7;
        if (i6 != (-163210356) + (((~(i8 | (-1716191396))) | 280064) * 220) + (((~(i8 | (-1876658620))) | 160747288) * (-440)) + ((i7 | (-1716191396)) * 220)) {
            throw null;
        }
        super.onResume();
        int i9 = RemoteActionCompatParcelizer + 67;
        INotificationSideChannelDefault = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
        if (i4 != (-1192990342) + (((~(1556854232 | i5)) | (-726866690)) * (-983)) + (((~(i5 | (-726866690))) | 138612992) * 983)) {
            throw null;
        }
        int i6 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i7 = ~elapsedCpuTime;
        if (i6 != (-458405284) + ((18874514 | i7) * (-192)) + (((~((-1821327974) | i7)) | 738853477) * (-384)) + (((~(elapsedCpuTime | 1840202487)) | (~(i7 | (-1082474497))) | (~((-738853478) | elapsedCpuTime))) * DerHeader.TAG_CLASS_PRIVATE)) {
            throw new RuntimeException("-1394471823");
        }
        super.onStart();
        int i8 = RemoteActionCompatParcelizer + 9;
        INotificationSideChannelDefault = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = INotificationSideChannelDefault + 27;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$u(short r5, byte r6, short r7) {
        /*
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r1 = com.midtrans.sdk.uikit.views.telkomsel_cash.TelkomselCashPaymentActivity.$$m
            int r5 = r5 + 119
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            r3 = r1[r6]
        L24:
            int r3 = -r3
            int r5 = r5 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.telkomsel_cash.TelkomselCashPaymentActivity.$$u(short, byte, short):java.lang.String");
    }
}
