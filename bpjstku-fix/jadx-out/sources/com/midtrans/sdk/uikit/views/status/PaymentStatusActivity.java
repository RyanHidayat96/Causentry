package com.midtrans.sdk.uikit.views.status;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.bpjstku.R;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.android.gms.tasks.zzu;
import com.midtrans.sdk.corekit.core.Constants;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.core.PaymentType;
import com.midtrans.sdk.corekit.models.PaymentDetails;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.corekit.models.promo.Promo;
import com.midtrans.sdk.corekit.models.snap.TransactionResult;
import com.midtrans.sdk.uikit.abstracts.BaseActivity;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import com.midtrans.sdk.uikit.widgets.SemiBoldTextView;
import defpackage.CameraUseCaseAdapter;
import defpackage.ViewPortBuilder;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.getConfigs;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.onConnectionFailed;
import defpackage.propagateChildrenTemplate;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class PaymentStatusActivity extends BaseActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private FrameLayout INotificationSideChannel;
    private LinearLayout INotificationSideChannelDefault;
    private String INotificationSideChannelStub;
    private propagateChildrenTemplate INotificationSideChannelStubProxy;
    private SemiBoldTextView IconCompatParcelizer;
    private DefaultTextView MediaBrowserCompat;
    private DefaultTextView RemoteActionCompatParcelizer;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "Page Success";
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "Page Failed";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FancyButton f855a;
    private LinearLayout asBinder;
    private ImageView asInterface;
    private LinearLayout cancel;
    private LinearLayout cancelAll;
    private DefaultTextView connect;
    private LinearLayout d;
    private DefaultTextView disconnect;
    private FancyButton g;
    private DefaultTextView getExtras;
    private LinearLayout getInterfaceDescriptor;
    private TransactionResponse getItem;
    private DefaultTextView getNotifyChildrenChangedOptions;
    private DefaultTextView getRoot;
    private LinearLayout notify;
    private LinearLayout onTransact;
    private DefaultTextView read;
    private DefaultTextView write;
    private static final byte[] $$g = {32, 1, 70, -122, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$h = 51;
    private static int getServiceComponent = 0;
    private static int search = 1;
    private static long isConnected = 6611841586577373673L;

    public static /* synthetic */ TransactionResponse TuitionPaymentFragmentspecialinlinedviewModeldefault1(PaymentStatusActivity paymentStatusActivity) {
        int i = 2 % 2;
        int i2 = search;
        int i3 = i2 + 9;
        getServiceComponent = i3 % 128;
        int i4 = i3 % 2;
        TransactionResponse transactionResponse = paymentStatusActivity.getItem;
        int i5 = i2 + 15;
        getServiceComponent = i5 % 128;
        int i6 = i5 % 2;
        return transactionResponse;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(PaymentStatusActivity paymentStatusActivity) {
        int i = 2 % 2;
        int i2 = getServiceComponent + 117;
        search = i2 % 128;
        int i3 = i2 % 2;
        paymentStatusActivity.setResult(-1);
        paymentStatusActivity.finish();
        int i4 = search + 57;
        getServiceComponent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3(PaymentStatusActivity paymentStatusActivity) {
        int i = 2 % 2;
        int i2 = getServiceComponent + 93;
        int i3 = i2 % 128;
        search = i3;
        int i4 = i2 % 2;
        String str = paymentStatusActivity.INotificationSideChannelStub;
        int i5 = i3 + 87;
        getServiceComponent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static /* synthetic */ propagateChildrenTemplate b(PaymentStatusActivity paymentStatusActivity) {
        int i = 2 % 2;
        int i2 = getServiceComponent;
        int i3 = i2 + 125;
        search = i3 % 128;
        int i4 = i3 % 2;
        propagateChildrenTemplate propagatechildrentemplate = paymentStatusActivity.INotificationSideChannelStubProxy;
        int i5 = i2 + 81;
        search = i5 % 128;
        if (i5 % 2 != 0) {
            return propagatechildrentemplate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
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
    private static void k(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 14
            int r6 = r6 + 84
            int r7 = r7 + 4
            int r0 = r8 + 1
            byte[] r1 = com.midtrans.sdk.uikit.views.status.PaymentStatusActivity.$$g
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + (-11)
            int r7 = r3 + 1
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.status.PaymentStatusActivity.k(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[PHI: r1
  0x0031: PHI (r1v7 java.lang.String) = (r1v6 java.lang.String), (r1v19 java.lang.String) binds: [B:15:0x002f, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i;
        String str;
        int i2 = 2 % 2;
        int i3 = search + 115;
        int i4 = i3 % 128;
        getServiceComponent = i4;
        if (i3 % 2 != 0) {
            int i5 = 86 / 0;
            if (this.INotificationSideChannelStubProxy != null) {
                i = i4 + 55;
                search = i % 128;
                if (i % 2 == 0) {
                    str = this.INotificationSideChannelStub;
                    int i6 = 69 / 0;
                    if (str != null) {
                        if (str.equalsIgnoreCase("success")) {
                            this.INotificationSideChannelStubProxy.TuitionPaymentFragmentbindingInflater1("Back", "Page Success");
                        } else if (this.INotificationSideChannelStub.equalsIgnoreCase(TransactionResult.STATUS_FAILED)) {
                            int i7 = search + 123;
                            getServiceComponent = i7 % 128;
                            int i8 = i7 % 2;
                            this.INotificationSideChannelStubProxy.TuitionPaymentFragmentbindingInflater1("Back", "Page Failed");
                            int i9 = search + 5;
                            getServiceComponent = i9 % 128;
                            int i10 = i9 % 2;
                        }
                    }
                } else {
                    str = this.INotificationSideChannelStub;
                    if (str != null) {
                        if (str.equalsIgnoreCase("success")) {
                            this.INotificationSideChannelStubProxy.TuitionPaymentFragmentbindingInflater1("Back", "Page Success");
                        } else if (this.INotificationSideChannelStub.equalsIgnoreCase(TransactionResult.STATUS_FAILED)) {
                            int i11 = search + 123;
                            getServiceComponent = i11 % 128;
                            int i12 = i11 % 2;
                            this.INotificationSideChannelStubProxy.TuitionPaymentFragmentbindingInflater1("Back", "Page Failed");
                            int i13 = search + 5;
                            getServiceComponent = i13 % 128;
                            int i14 = i13 % 2;
                        }
                    }
                }
            }
        } else if (this.INotificationSideChannelStubProxy != null) {
            i = i4 + 55;
            search = i % 128;
            if (i % 2 == 0) {
                str = this.INotificationSideChannelStub;
                int i15 = 69 / 0;
                if (str != null) {
                    if (str.equalsIgnoreCase("success")) {
                        this.INotificationSideChannelStubProxy.TuitionPaymentFragmentbindingInflater1("Back", "Page Success");
                    } else if (this.INotificationSideChannelStub.equalsIgnoreCase(TransactionResult.STATUS_FAILED)) {
                        int i16 = search + 123;
                        getServiceComponent = i16 % 128;
                        int i17 = i16 % 2;
                        this.INotificationSideChannelStubProxy.TuitionPaymentFragmentbindingInflater1("Back", "Page Failed");
                        int i18 = search + 5;
                        getServiceComponent = i18 % 128;
                        int i19 = i18 % 2;
                    }
                }
            } else {
                str = this.INotificationSideChannelStub;
                if (str != null) {
                    if (str.equalsIgnoreCase("success")) {
                        this.INotificationSideChannelStubProxy.TuitionPaymentFragmentbindingInflater1("Back", "Page Success");
                    } else if (this.INotificationSideChannelStub.equalsIgnoreCase(TransactionResult.STATUS_FAILED)) {
                        int i110 = search + 123;
                        getServiceComponent = i110 % 128;
                        int i111 = i110 % 2;
                        this.INotificationSideChannelStubProxy.TuitionPaymentFragmentbindingInflater1("Back", "Page Failed");
                        int i112 = search + 5;
                        getServiceComponent = i112 % 128;
                        int i113 = i112 % 2;
                    }
                }
            }
        }
        super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault1(TransactionResponse transactionResponse) {
        double d;
        int i = 2 % 2;
        int i2 = getServiceComponent + 29;
        search = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                String grossAmount = transactionResponse.getGrossAmount();
                String currency = transactionResponse.getCurrency();
                d = Double.parseDouble(grossAmount);
                int i3 = 91 / 0;
                transactionResponse = currency;
            } else {
                String grossAmount2 = transactionResponse.getGrossAmount();
                String currency2 = transactionResponse.getCurrency();
                d = Double.parseDouble(grossAmount2);
                transactionResponse = currency2;
            }
        } catch (RuntimeException e2) {
            Logger.e(e2.getMessage());
            d = 0.0d;
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, d, transactionResponse);
        int i4 = search + 27;
        getServiceComponent = i4 % 128;
        int i5 = i4 % 2;
        return strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = search + 15;
        getServiceComponent = i2 % 128;
        int i3 = i2 % 2;
        this.getNotifyChildrenChangedOptions = (DefaultTextView) findViewById(R.id.text_status_title);
        this.disconnect = (DefaultTextView) findViewById(R.id.text_status_message);
        this.IconCompatParcelizer = (SemiBoldTextView) findViewById(R.id.text_status_error_message);
        this.MediaBrowserCompat = (DefaultTextView) findViewById(R.id.text_order_id);
        this.getExtras = (DefaultTextView) findViewById(R.id.text_status_amount);
        this.getRoot = (DefaultTextView) findViewById(R.id.text_status_due_amount);
        this.RemoteActionCompatParcelizer = (DefaultTextView) findViewById(R.id.text_status_due_installment);
        this.read = (DefaultTextView) findViewById(R.id.text_payment_type);
        this.write = (DefaultTextView) findViewById(R.id.text_point_amount);
        this.connect = (DefaultTextView) findViewById(R.id.text_status_promo_amount);
        this.cancel = (LinearLayout) findViewById(R.id.layout_status_order);
        this.getInterfaceDescriptor = (LinearLayout) findViewById(R.id.layout_status_total_amount);
        this.INotificationSideChannelDefault = (LinearLayout) findViewById(R.id.layout_status_due_amount);
        this.d = (LinearLayout) findViewById(R.id.layout_status_due_installment);
        this.notify = (LinearLayout) findViewById(R.id.layout_status_payment_type);
        this.INotificationSideChannel = (FrameLayout) findViewById(R.id.layout_main);
        this.asBinder = (LinearLayout) findViewById(R.id.layout_status_details);
        this.onTransact = (LinearLayout) findViewById(R.id.layout_status_point_amount);
        this.cancelAll = (LinearLayout) findViewById(R.id.layout_status_promo);
        this.asInterface = (ImageView) findViewById(R.id.image_status_payment);
        this.g = (FancyButton) findViewById(R.id.button_status_see_instruction);
        this.f855a = (FancyButton) findViewById(R.id.button_primary);
        int i4 = getServiceComponent + 85;
        search = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:120:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:155:0x0507  */
    /* JADX WARN: Code duplicated, block: B:157:0x0512  */
    /* JADX WARN: Code duplicated, block: B:159:0x051e  */
    /* JADX WARN: Code duplicated, block: B:160:0x0524  */
    /* JADX WARN: Code duplicated, block: B:161:0x0535  */
    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException {
        int i;
        Promo promoSelected;
        int i2 = 2 % 2;
        Object obj = null;
        int i3 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        if (i3 != (-1015191312) + (((~((~iElapsedRealtime) | (-16777281))) | (~((-1208549386) | iElapsedRealtime))) * (-302)) + ((~((-16777281) | iElapsedRealtime)) * (-604)) + (((~(iElapsedRealtime | (-1225326666))) | (-1603888508)) * 302)) {
            throw new RuntimeException("-700519389");
        }
        int i4 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
        int i6 = ~i5;
        if (i4 != (-1395971716) + (((~((-908954582) | i6)) | 571050373 | (~((-1670101384) | i6))) * (-1136)) + (((~((-908954582) | i5)) | (~((-1670101384) | i5)) | (~(2008005591 | i6))) * (-568)) + (((~(i5 | (-571050374))) | (~(i6 | 1670101383)) | (~(908954581 | i6))) * 568)) {
            throw new RuntimeException("-1982747380");
        }
        super.onCreate(bundle);
        this.INotificationSideChannelStubProxy = new propagateChildrenTemplate();
        TransactionResponse transactionResponse = (TransactionResponse) getIntent().getSerializableExtra("payment.result");
        this.getItem = transactionResponse;
        byte b = -1;
        if (transactionResponse == null) {
            this.INotificationSideChannelStub = TransactionResult.STATUS_FAILED;
            setResult(-1);
            finish();
        } else if (transactionResponse.getStatusCode().equals(Constants.STATUS_CODE_200)) {
            this.INotificationSideChannelStub = "success";
            this.INotificationSideChannelStubProxy.b("Page Success", false);
        } else {
            if (!TextUtils.isEmpty(this.getItem.getTransactionStatus())) {
                if (!this.getItem.getTransactionStatus().equalsIgnoreCase("success")) {
                    int i7 = search + 63;
                    getServiceComponent = i7 % 128;
                    int i8 = i7 % 2;
                    if (!this.getItem.getTransactionStatus().equalsIgnoreCase("settlement")) {
                    }
                }
                this.INotificationSideChannelStub = "success";
                this.INotificationSideChannelStubProxy.b("Page Success", false);
            }
            if (!this.getItem.getStatusCode().equals(Constants.STATUS_CODE_201) && (TextUtils.isEmpty(this.getItem.getTransactionStatus()) || !this.getItem.getTransactionStatus().equalsIgnoreCase(TransactionResult.STATUS_PENDING))) {
                this.INotificationSideChannelStub = TransactionResult.STATUS_FAILED;
                this.INotificationSideChannelStubProxy.b("Page Failed", false);
            } else if (TextUtils.isEmpty(this.getItem.getFraudStatus()) || (!this.getItem.getFraudStatus().equalsIgnoreCase(ClientData.KEY_CHALLENGE))) {
                this.INotificationSideChannelStub = TransactionResult.STATUS_PENDING;
            } else {
                int i9 = getServiceComponent + 69;
                search = i9 % 128;
                if (i9 % 2 == 0) {
                    this.INotificationSideChannelStub = ClientData.KEY_CHALLENGE;
                    obj.hashCode();
                    throw null;
                }
                this.INotificationSideChannelStub = ClientData.KEY_CHALLENGE;
            }
        }
        setContentView(R.layout.activity_payment_status);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.status.PaymentStatusActivity.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.f855a.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.status.PaymentStatusActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    if (PaymentStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(PaymentStatusActivity.this) != null) {
                        String paymentType = PaymentStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(PaymentStatusActivity.this).getPaymentType();
                        paymentType.hashCode();
                        if (paymentType.equals("credit_card")) {
                            str = "Done Credit Card";
                        } else {
                            str = !paymentType.equals("mandiri_clickpay") ? "Next" : "Done Mandiri Clickpay";
                        }
                        if (PaymentStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(PaymentStatusActivity.this) != null) {
                            if (PaymentStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(PaymentStatusActivity.this).equalsIgnoreCase("success")) {
                                PaymentStatusActivity.b(PaymentStatusActivity.this).TuitionPaymentFragmentbindingInflater1(str, "Page Success");
                            } else if (PaymentStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(PaymentStatusActivity.this).equalsIgnoreCase(TransactionResult.STATUS_FAILED)) {
                                PaymentStatusActivity.b(PaymentStatusActivity.this).TuitionPaymentFragmentbindingInflater1(str, "Page Failed");
                            }
                        }
                    }
                    PaymentStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(PaymentStatusActivity.this);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        if (!TextUtils.isEmpty(this.INotificationSideChannelStub)) {
            String str = this.INotificationSideChannelStub;
            str.hashCode();
            if (str.equals("success")) {
                this.getNotifyChildrenChangedOptions.setText(getString(R.string.payment_successful));
                this.asInterface.setImageResource(2131231473);
                this.disconnect.setText(getString(R.string.thank_you));
            } else if (str.equals(TransactionResult.STATUS_PENDING)) {
                if (this.getItem.getFraudStatus().equals(ClientData.KEY_CHALLENGE)) {
                    this.getNotifyChildrenChangedOptions.setText(getString(R.string.payment_challenged));
                } else {
                    this.getNotifyChildrenChangedOptions.setText(getString(R.string.payment_pending));
                }
                this.disconnect.setText(getString(R.string.thank_you));
                this.asInterface.setImageResource(2131231472);
            } else {
                this.getNotifyChildrenChangedOptions.setText(getString(R.string.payment_unsuccessful));
                this.disconnect.setText(getString(R.string.sorry));
                this.asInterface.setImageResource(2131231471);
                this.IconCompatParcelizer.setVisibility(0);
                if (this.getItem.getTransactionStatus() != null && this.getItem.getTransactionStatus().equalsIgnoreCase(getString(R.string.deny))) {
                    this.IconCompatParcelizer.setText(getString(R.string.message_payment_denied));
                } else if (this.getItem.getStatusCode().equals(Constants.STATUS_CODE_400)) {
                    String str2 = (this.getItem.getValidationMessages() == null || this.getItem.getValidationMessages().isEmpty()) ? "" : this.getItem.getValidationMessages().get(0);
                    if (TextUtils.isEmpty(str2) || !str2.toLowerCase().contains(getString(R.string.label_expired))) {
                        this.IconCompatParcelizer.setText(getString(R.string.message_payment_cannot_proccessed));
                    } else {
                        this.IconCompatParcelizer.setText(getString(R.string.message_payment_expired));
                    }
                } else if (this.getItem.getStatusCode().equals("411") && !TextUtils.isEmpty(this.getItem.getStatusMessage()) && this.getItem.getStatusMessage().toLowerCase().contains("promo is not available")) {
                    this.IconCompatParcelizer.setText(getString(R.string.promo_unavailable));
                } else if (!(!this.getItem.getStatusCode().equals("406"))) {
                    this.IconCompatParcelizer.setText(getString(R.string.message_payment_paid));
                } else {
                    this.IconCompatParcelizer.setText(this.getItem.getStatusMessage());
                }
                String orderId = this.getItem.getOrderId();
                if (TextUtils.isEmpty(orderId)) {
                    int i10 = getServiceComponent + 17;
                    search = i10 % 128;
                    int i11 = i10 % 2;
                    this.cancel.setVisibility(8);
                    int i12 = search + 33;
                    getServiceComponent = i12 % 128;
                    int i13 = i12 % 2;
                } else {
                    this.MediaBrowserCompat.setText(orderId);
                }
                if (TextUtils.isEmpty(this.getItem.getGrossAmount())) {
                    this.getInterfaceDescriptor.setVisibility(8);
                } else {
                    this.getExtras.setText(TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.getItem));
                }
                if (TextUtils.isEmpty(this.getItem.getPaymentType())) {
                    this.notify.setVisibility(8);
                }
            }
        }
        TransactionResponse transactionResponse2 = this.getItem;
        if (transactionResponse2 != null) {
            String paymentType = transactionResponse2.getPaymentType();
            paymentType.hashCode();
            paymentType.hashCode();
            switch (paymentType.hashCode()) {
                case -2098630958:
                    if (paymentType.equals(PaymentType.SHOPEEPAY)) {
                        b = 0;
                    }
                    break;
                case -1596777616:
                    if (paymentType.equals(PaymentType.INDOSAT_DOMPETKU)) {
                        int i14 = search + 79;
                        getServiceComponent = i14 % 128;
                        if (i14 % 2 == 0) {
                            b = 1;
                        } else {
                            b = 0;
                        }
                    }
                    break;
                case -1242518052:
                    if (paymentType.equals(PaymentType.UOB_EZPAY)) {
                        b = 2;
                    }
                    break;
                case -303793002:
                    if (paymentType.equals("credit_card")) {
                        b = 3;
                    }
                    break;
                case 102157:
                    if (paymentType.equals(PaymentType.GCI)) {
                        b = 4;
                    }
                    break;
                case 98540224:
                    if (paymentType.equals(PaymentType.GOPAY)) {
                        b = 5;
                    }
                    break;
                case 855280233:
                    if (!(!paymentType.equals("mandiri_clickpay"))) {
                        b = 6;
                    }
                    break;
                case 1080416134:
                    if (paymentType.equals(PaymentType.TELKOMSEL_CASH)) {
                        int i15 = search + 73;
                        getServiceComponent = i15 % 128;
                        int i16 = i15 % 2;
                        b = 7;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    this.read.setText(getString(R.string.payment_method_shopeepay_deeplink));
                    this.MediaBrowserCompat.setText(String.valueOf(this.getItem.getOrderId()));
                    this.getExtras.setText(TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.getItem));
                    if (this.getItem.getPaymentType().equalsIgnoreCase("credit_card")) {
                        i = search + 17;
                        getServiceComponent = i % 128;
                        if (i % 2 != 0) {
                            TextUtils.isEmpty(this.getItem.getInstallmentTerm());
                            obj.hashCode();
                            throw null;
                        }
                        if (!TextUtils.isEmpty(this.getItem.getInstallmentTerm())) {
                            this.d.setVisibility(0);
                            this.RemoteActionCompatParcelizer.setText(this.getItem.getInstallmentTerm());
                        } else {
                            this.d.setVisibility(8);
                        }
                    }
                    break;
                case 1:
                    this.read.setText(getString(R.string.payment_method_indosat_dompetku));
                    this.MediaBrowserCompat.setText(String.valueOf(this.getItem.getOrderId()));
                    this.getExtras.setText(TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.getItem));
                    if (this.getItem.getPaymentType().equalsIgnoreCase("credit_card")) {
                        i = search + 17;
                        getServiceComponent = i % 128;
                        if (i % 2 != 0) {
                            TextUtils.isEmpty(this.getItem.getInstallmentTerm());
                            obj.hashCode();
                            throw null;
                        }
                        if (!TextUtils.isEmpty(this.getItem.getInstallmentTerm())) {
                            this.d.setVisibility(0);
                            this.RemoteActionCompatParcelizer.setText(this.getItem.getInstallmentTerm());
                        } else {
                            this.d.setVisibility(8);
                        }
                    }
                    break;
                case 2:
                    this.read.setText(getString(R.string.payment_method_uob));
                    this.MediaBrowserCompat.setText(String.valueOf(this.getItem.getOrderId()));
                    this.getExtras.setText(TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.getItem));
                    if (this.getItem.getPaymentType().equalsIgnoreCase("credit_card")) {
                        i = search + 17;
                        getServiceComponent = i % 128;
                        if (i % 2 != 0) {
                            TextUtils.isEmpty(this.getItem.getInstallmentTerm());
                            obj.hashCode();
                            throw null;
                        }
                        if (!TextUtils.isEmpty(this.getItem.getInstallmentTerm())) {
                            this.d.setVisibility(0);
                            this.RemoteActionCompatParcelizer.setText(this.getItem.getInstallmentTerm());
                        } else {
                            this.d.setVisibility(8);
                        }
                    }
                    break;
                case 3:
                    this.read.setText(R.string.payment_method_credit_card);
                    int pointRedeemAmount = (int) this.getItem.getPointRedeemAmount();
                    if (pointRedeemAmount != 0.0f) {
                        this.write.setText(onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, pointRedeemAmount, this.getItem.getCurrency()));
                        this.onTransact.setVisibility(0);
                    }
                    String transactionStatus = this.getItem.getTransactionStatus();
                    if (!TextUtils.isEmpty(transactionStatus)) {
                        int i17 = getServiceComponent + 15;
                        search = i17 % 128;
                        if (i17 % 2 == 0) {
                            transactionStatus.equals(TransactionResult.STATUS_PENDING);
                            throw null;
                        }
                        if (transactionStatus.equals(TransactionResult.STATUS_PENDING)) {
                            String statusMessage = this.getItem.getStatusMessage();
                            if (!TextUtils.isEmpty(statusMessage) && !(!statusMessage.contains("payment has not been made"))) {
                                this.disconnect.setText(R.string.status_rba_unsuccessful);
                            }
                        }
                    }
                    PaymentDetails paymentDetails = j_().getPaymentDetails();
                    if (paymentDetails != null && (promoSelected = paymentDetails.getPromoSelected()) != null && promoSelected.getId() != 0) {
                        this.cancelAll.setVisibility(0);
                        this.connect.setText(onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, promoSelected.getCalculatedDiscountAmount(), this.getItem.getCurrency()));
                    }
                    this.MediaBrowserCompat.setText(String.valueOf(this.getItem.getOrderId()));
                    this.getExtras.setText(TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.getItem));
                    if (this.getItem.getPaymentType().equalsIgnoreCase("credit_card")) {
                        i = search + 17;
                        getServiceComponent = i % 128;
                        if (i % 2 != 0) {
                            TextUtils.isEmpty(this.getItem.getInstallmentTerm());
                            obj.hashCode();
                            throw null;
                        }
                        if (!TextUtils.isEmpty(this.getItem.getInstallmentTerm())) {
                            this.d.setVisibility(0);
                            this.RemoteActionCompatParcelizer.setText(this.getItem.getInstallmentTerm());
                        } else {
                            this.d.setVisibility(8);
                        }
                    }
                    break;
                case 4:
                    this.read.setText(R.string.payment_method_gci);
                    this.MediaBrowserCompat.setText(String.valueOf(this.getItem.getOrderId()));
                    this.getExtras.setText(TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.getItem));
                    if (this.getItem.getPaymentType().equalsIgnoreCase("credit_card")) {
                        i = search + 17;
                        getServiceComponent = i % 128;
                        if (i % 2 != 0) {
                            TextUtils.isEmpty(this.getItem.getInstallmentTerm());
                            obj.hashCode();
                            throw null;
                        }
                        if (!TextUtils.isEmpty(this.getItem.getInstallmentTerm())) {
                            this.d.setVisibility(0);
                            this.RemoteActionCompatParcelizer.setText(this.getItem.getInstallmentTerm());
                        } else {
                            this.d.setVisibility(8);
                        }
                    }
                    break;
                case 5:
                    this.read.setText(getString(R.string.payment_method_gopay));
                    this.MediaBrowserCompat.setText(String.valueOf(this.getItem.getOrderId()));
                    this.getExtras.setText(TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.getItem));
                    if (this.getItem.getPaymentType().equalsIgnoreCase("credit_card")) {
                        i = search + 17;
                        getServiceComponent = i % 128;
                        if (i % 2 != 0) {
                            TextUtils.isEmpty(this.getItem.getInstallmentTerm());
                            obj.hashCode();
                            throw null;
                        }
                        if (!TextUtils.isEmpty(this.getItem.getInstallmentTerm())) {
                            this.d.setVisibility(0);
                            this.RemoteActionCompatParcelizer.setText(this.getItem.getInstallmentTerm());
                        } else {
                            this.d.setVisibility(8);
                        }
                    }
                    break;
                case 6:
                    this.read.setText(R.string.payment_method_mandiri_clickpay);
                    this.MediaBrowserCompat.setText(String.valueOf(this.getItem.getOrderId()));
                    this.getExtras.setText(TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.getItem));
                    if (this.getItem.getPaymentType().equalsIgnoreCase("credit_card")) {
                        i = search + 17;
                        getServiceComponent = i % 128;
                        if (i % 2 != 0) {
                            TextUtils.isEmpty(this.getItem.getInstallmentTerm());
                            obj.hashCode();
                            throw null;
                        }
                        if (!TextUtils.isEmpty(this.getItem.getInstallmentTerm())) {
                            this.d.setVisibility(0);
                            this.RemoteActionCompatParcelizer.setText(this.getItem.getInstallmentTerm());
                        } else {
                            this.d.setVisibility(8);
                        }
                    }
                    break;
                case 7:
                    this.read.setText(getString(R.string.payment_method_telkomsel_cash));
                    this.MediaBrowserCompat.setText(String.valueOf(this.getItem.getOrderId()));
                    this.getExtras.setText(TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.getItem));
                    if (this.getItem.getPaymentType().equalsIgnoreCase("credit_card")) {
                        i = search + 17;
                        getServiceComponent = i % 128;
                        if (i % 2 != 0) {
                            TextUtils.isEmpty(this.getItem.getInstallmentTerm());
                            obj.hashCode();
                            throw null;
                        }
                        if (!TextUtils.isEmpty(this.getItem.getInstallmentTerm())) {
                            this.d.setVisibility(0);
                            this.RemoteActionCompatParcelizer.setText(this.getItem.getInstallmentTerm());
                        } else {
                            this.d.setVisibility(8);
                        }
                    }
                    break;
                default:
                    this.MediaBrowserCompat.setText(String.valueOf(this.getItem.getOrderId()));
                    this.getExtras.setText(TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.getItem));
                    if (this.getItem.getPaymentType().equalsIgnoreCase("credit_card")) {
                        i = search + 17;
                        getServiceComponent = i % 128;
                        if (i % 2 != 0) {
                            TextUtils.isEmpty(this.getItem.getInstallmentTerm());
                            obj.hashCode();
                            throw null;
                        }
                        if (!TextUtils.isEmpty(this.getItem.getInstallmentTerm())) {
                            this.d.setVisibility(0);
                            this.RemoteActionCompatParcelizer.setText(this.getItem.getInstallmentTerm());
                        } else {
                            this.d.setVisibility(8);
                        }
                    }
                    break;
            }
        }
        this.g.setVisibility(8);
    }

    private static void l(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $11 + 85;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (MotionEvent.axisFromString("") + 19473), ExpandableListView.getPackedPositionGroup(0L) + 2624, 13 - View.MeasureSpec.getSize(0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() / (isConnected & 9053247990562531611L);
                    try {
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.green(0) + 39422), ((byte) KeyEvent.getModifierMetaStateMask()) + 482, TextUtils.getCapsMode("", 0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 19472), 2624 - View.resolveSizeAndState(0, 0, 0), TextUtils.getOffsetBefore("", 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (isConnected ^ 9053247990562531611L);
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39421 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 481 - View.getDefaultSize(0, 0), Color.blue(0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i6 = $11 + 109;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 / 4;
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i8 = $10 + 73;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39422 - (Process.myTid() >> 22)), Color.red(0) + 481, 36 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr7 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (39422 - Color.blue(0)), 481 - (ViewConfiguration.getTouchSlop() >> 8), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v5 int) = (r1v4 int), (r1v13 int) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i;
        int color;
        int i2 = 2 % 2;
        int i3 = getServiceComponent + 89;
        search = i3 % 128;
        if (i3 % 2 == 0) {
            i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i4 = 14 / 0;
            if (i != 0) {
                getWindow().setStatusBarColor(i);
            }
        } else {
            i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (i != 0) {
                getWindow().setStatusBarColor(i);
            }
        }
        String str = this.INotificationSideChannelStub;
        str.hashCode();
        if (str.equals("success")) {
            color = ContextCompat.getColor(this, R.color.payment_status_success);
        } else {
            int i5 = search + 23;
            getServiceComponent = i5 % 128;
            if (i5 % 2 != 0) {
                str.equals(TransactionResult.STATUS_PENDING);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            color = !str.equals(TransactionResult.STATUS_PENDING) ? ContextCompat.getColor(this, R.color.payment_status_failed) : ContextCompat.getColor(this, R.color.payment_status_pending);
        }
        this.INotificationSideChannel.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{((BaseActivity) this).b, color}));
        this.g.setTextColor(ContextCompat.getColor(this, R.color.white));
        this.g.setIconColorFilter(ContextCompat.getColor(this, R.color.white));
        setPrimaryBackgroundColor(this.f855a);
        this.f855a.setText(getString(R.string.done));
        this.f855a.setTextBold();
        findViewById(R.id.button_chevron).setVisibility(8);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = getServiceComponent + 9;
        search = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int iKeyCodeFromString = 1031 - KeyEvent.keyCodeFromString("");
            int i4 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
            byte b = $$g[7];
            short s = b;
            Object[] objArr3 = new Object[1];
            k(b, s, (byte) (s | 52), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iKeyCodeFromString, i4, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        l(new char[]{53395, 4423, 21280, 38161, 55281, 6620, 23476, 39969, 56901, '2', 16978, 33992, 50895, 2206, 18812, 35650, 52527, 3898, 29176, 46044, 62861, 13934}, Color.rgb(0, 0, 0) + 16826843, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        l(new char[]{53399, 15745, 2733, 6111, 25853, 28940, 24108, 43897, 47215, 34436, 37800, 57555, 52719, 55820, 10021}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 60667, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int threadPriority = 1031 - ((Process.getThreadPriority(0) + 20) >> 6);
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 15;
            byte b2 = $$g[7];
            short s2 = (short) (b2 | 52);
            Object[] objArr6 = new Object[1];
            k(b2, s2, (byte) s2, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(tapTimeout, threadPriority, fadingEdgeLength, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                int keyRepeatTimeout = 1031 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int keyRepeatDelay = 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                byte[] bArr = $$g;
                Object[] objArr7 = new Object[1];
                k(bArr[1], (short) 104, bArr[7], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, keyRepeatTimeout, keyRepeatDelay, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr8[3])[0];
            int i6 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = (-2025377589) + (((~((-402201357) | iIdentityHashCode)) | 157921186) * (-318));
            int i8 = ~(157921186 | iIdentityHashCode);
            int i9 = ~iIdentityHashCode;
            int i10 = ((i7 + ((i8 | (~((-134259875) | i9))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) + (((~(iIdentityHashCode | (-134259875))) | (~(536461230 | i9))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) - 914725134;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            l(new char[]{53400, 23206, 50414, 19980, 63496, 25495, 60845, 6127, 33085, 2817, 46771, 8396, 43773, 54327, 24177, 51588}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 35370, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            l(new char[]{53403, 23901, 51969, 31229, 59306, 5228, 33348, 12294, 48866, 11440, 22895, 50979, 30005, 58322, 4492, 40562}, 36299 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr11 = {-1875980580};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1134, 18 - TextUtils.indexOf("", "", 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, -914725134, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int i13 = 1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0');
                    byte b3 = $$g[7];
                    short s3 = b3;
                    Object[] objArr13 = new Object[1];
                    k(b3, s3, (byte) (s3 | 52), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout2, i13, iLastIndexOf, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.normalizeMetaState(0) + 45993), (ViewConfiguration.getTapTimeout() >> 16) + 1117, (KeyEvent.getMaxKeyCode() >> 16) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                    int i14 = 1032 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 15;
                    byte[] bArr2 = $$g;
                    Object[] objArr14 = new Object[1];
                    k(bArr2[1], (short) 104, bArr2[7], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRgb, i14, tapTimeout3, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    l(new char[]{53395, 4423, 21280, 38161, 55281, 6620, 23476, 39969, 56901, '2', 16978, 33992, 50895, 2206, 18812, 35650, 52527, 3898, 29176, 46044, 62861, 13934}, Color.rgb(0, 0, 0) + 16826843, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    l(new char[]{53399, 15745, 2733, 6111, 25853, 28940, 24108, 43897, 47215, 34436, 37800, 57555, 52719, 55820, 10021}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 60667, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int defaultSize = View.getDefaultSize(0, 0) + 1031;
                        int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        byte b4 = $$g[7];
                        short s4 = (short) (b4 | 52);
                        Object[] objArr17 = new Object[1];
                        k(b4, s4, (byte) s4, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionGroup, defaultSize, scrollBarFadeDuration, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                        int offsetBefore = 1031 - TextUtils.getOffsetBefore("", 0);
                        int i15 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15;
                        byte b5 = $$g[7];
                        short s5 = b5;
                        Object[] objArr18 = new Object[1];
                        k(b5, s5, (byte) (s5 | 52), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(threadPriority2, offsetBefore, i15, 1357589585, false, (String) objArr18[0], null);
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
        int i16 = ((int[]) objArr[1])[0];
        int i17 = ((int[]) objArr[3])[0];
        if (i17 == i16) {
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[3])[0];
            int i20 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iMyPid = Process.myPid();
            int i21 = (-1830750761) + ((iMyPid | 316138140) * (-50));
            int i22 = ~((-311918733) | iMyPid);
            int i23 = ~iMyPid;
            int i24 = i18 + i21 + ((i22 | (~(383776702 | i23))) * 50) + (((~(i23 | 316138140)) | (~(71857970 | i23)) | (-383776703)) * 50);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr19[2])[0] = i26 ^ (i26 << 5);
            int i27 = search + 99;
            getServiceComponent = i27 % 128;
            int i28 = i27 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i29 = 0;
                while (i29 < strArr3.length) {
                    int i30 = search + 83;
                    getServiceComponent = i30 % 128;
                    if (i30 % 2 != 0) {
                        arrayList.add(strArr3[i29]);
                        i29 += 77;
                    } else {
                        arrayList.add(strArr3[i29]);
                        i29++;
                    }
                }
            }
            Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
            Object[] objArr20 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i31 = ((int[]) objArr[2])[0];
            int i32 = ((int[]) objArr[3])[0];
            int i33 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int integer = (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.vida_preview_width) & (-865)) - 657803038;
            int i34 = 655431731 + (((~((-504061020) | integer)) | 235622481 | (~((-259780850) | integer))) * (-754));
            int i35 = ~((-235622482) | integer);
            int i36 = ~integer;
            int i37 = i31 + i34 + ((i35 | (~((-24158369) | i36))) * (-754)) + ((i36 | (-504061020)) * 754);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr20[2])[0] = i39 ^ (i39 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char threadPriority3 = (char) (29944 - ((Process.getThreadPriority(0) + 20) >> 6));
            int i40 = 1754 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int iResolveSize = View.resolveSize(0, 0) + 23;
            byte b6 = $$g[7];
            Object[] objArr21 = new Object[1];
            k(b6, (short) (b6 | 104), (byte) 37, objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(threadPriority3, i40, iResolveSize, 986134021, false, (String) objArr21[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i41 = search + 113;
            getServiceComponent = i41 % 128;
            int i42 = i41 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29944);
                int offsetAfter = 1755 - TextUtils.getOffsetAfter("", 0);
                int iLastIndexOf2 = 22 - TextUtils.lastIndexOf("", '0', 0);
                byte b7 = $$g[7];
                short s6 = (short) (b7 | 52);
                Object[] objArr22 = new Object[1];
                k(b7, s6, (byte) s6, objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(doubleTapTimeout, offsetAfter, iLastIndexOf2, 1599039318, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr23[0])[0]}, new int[]{((int[]) objArr23[1])[0]}, (Object[]) objArr23[2], new int[1], (String[]) objArr23[4]};
            int i43 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
            int i44 = ((((-423213295) + (((~(613173706 | i43)) | 288362500) * 104)) + ((~((~i43) | (-75760075))) * (-104))) + ((i43 | 825776132) * 104)) - 420191431;
            int i45 = (i44 << 13) ^ i44;
            int i46 = i45 ^ (i45 >>> 17);
            ((int[]) objArr2[3])[0] = i46 ^ (i46 << 5);
        } else {
            Object[] objArr24 = new Object[1];
            l(new char[]{53400, 23206, 50414, 19980, 63496, 25495, 60845, 6127, 33085, 2817, 46771, 8396, 43773, 54327, 24177, 51588}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) + 35264, objArr24);
            Class<?> cls4 = Class.forName((String) objArr24[0]);
            Object[] objArr25 = new Object[1];
            l(new char[]{53403, 23901, 51969, 31229, 59306, 5228, 33348, 12294, 48866, 11440, 22895, 50979, 30005, 58322, 4492, 40562}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_backend_liveness_is_not_configured).substring(0, 64).codePointAt(14) + 36267, objArr25);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr25[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr26 = {-1875980580};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - View.MeasureSpec.makeMeasureSpec(0, 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1725, ExpandableListView.getPackedPositionGroup(0L) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113 = zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr26), -420191431, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c3 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29945);
                int mode = 1755 - View.MeasureSpec.getMode(0);
                int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
                byte b8 = $$g[7];
                short s7 = (short) (b8 | 52);
                Object[] objArr27 = new Object[1];
                k(b8, s7, (byte) s7, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, mode, iLastIndexOf3, 1599039318, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr28 = new Object[1];
                l(new char[]{53395, 4423, 21280, 38161, 55281, 6620, 23476, 39969, 56901, '2', 16978, 33992, 50895, 2206, 18812, 35650, 52527, 3898, 29176, 46044, 62861, 13934}, 49627 - (Process.myPid() >> 22), objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                l(new char[]{53399, 15745, 2733, 6111, 25853, 28940, 24108, 43897, 47215, 34436, 37800, 57555, 52719, 55820, 10021}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 60657, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char jumpTapTimeout = (char) (29944 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    int i47 = 1755 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int gidForName = Process.getGidForName("") + 24;
                    byte b9 = $$g[7];
                    Object[] objArr30 = new Object[1];
                    k(b9, (short) (b9 | 141), (byte) ($$h + 1), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(jumpTapTimeout, i47, gidForName, 1596667560, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char scrollBarFadeDuration2 = (char) (29944 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    int i48 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1754;
                    int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23;
                    byte b10 = $$g[7];
                    Object[] objArr31 = new Object[1];
                    k(b10, (short) (b10 | 104), (byte) 37, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(scrollBarFadeDuration2, i48, keyRepeatDelay2, 986134021, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr2 = objArrTuitionPaymentFragmentbindingInflater1$7879113;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i49 = ((int[]) objArr2[1])[0];
        int i50 = ((int[]) objArr2[0])[0];
        if (i50 != i49) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArr2[4];
            if (strArr5 != null) {
                for (String str : strArr5) {
                    arrayList2.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i50));
        }
        int i51 = ((int[]) objArr2[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArr2[0])[0]}, new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[1], (String[]) objArr2[4]};
        int i52 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
        int i53 = ~i52;
        int i54 = i51 + (-1342658113) + (((~(i53 | 131890151)) | (-132119544) | (~((-80482883) | i52))) * 717) + (((~(i52 | 131890151)) | (~(i53 | (-80482883))) | (-132119544)) * 717);
        int i55 = (i54 << 13) ^ i54;
        int i56 = i55 ^ (i55 >>> 17);
        ((int[]) objArr32[3])[0] = i56 ^ (i56 << 5);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i3 = ~iIdentityHashCode;
        int i4 = (-321899434) + (((~((-1163899357) | i3)) | 21434628) * (-1188));
        int i5 = (~(iIdentityHashCode | 1163899356)) | 21434628;
        int i6 = ~(333911813 | i3);
        if (i2 != i4 + ((i5 | i6) * 594) + (((~(1163899356 | i3)) | (-1476376542) | i6) * 594)) {
            throw new RuntimeException("1144065246");
        }
        int i7 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        if (i7 != (-601514216) + (((~((-1704454495) | iFreeMemory)) | (-874601471)) * (-964)) + (((~((~iFreeMemory) | (-1704454495))) | 1100390400) * (-964))) {
            int i8 = getServiceComponent + 17;
            search = i8 % 128;
            if (i8 % 2 == 0) {
                int[] iArr = new int[1751334338];
                iArr[1751334337] = 1;
                Toast.makeText((Context) null, iArr[-1], 0).show();
            } else {
                int[] iArr2 = new int[1751334338];
                iArr2[1751334337] = 1;
                int i9 = 177129794 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        super.onResume();
        int i10 = getServiceComponent + 41;
        search = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = getServiceComponent + 15;
        search = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~((-325197209) | (~iIdentityHashCode));
        if (i4 != (((((-1476050432) | i5) | (~(325197208 | iIdentityHashCode))) * (-338)) - 1518827224) + (((~(iIdentityHashCode | (-1150853224))) | i5) * 338)) {
            int i6 = (-654413398) % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i8 = ~((~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step6).substring(3, 4).codePointAt(0) - 1593535141)) | 202583012);
        if (i7 != ((1122948 | i8) * (-374)) + 667418612 + ((i8 | 201460064) * 374)) {
            int i9 = 897425304 % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i10 = getServiceComponent + 39;
        search = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 12 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = getServiceComponent + 47;
        search = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = search + 45;
        getServiceComponent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
    }
}
