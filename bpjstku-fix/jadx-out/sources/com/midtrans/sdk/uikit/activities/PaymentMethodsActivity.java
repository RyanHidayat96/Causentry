package com.midtrans.sdk.uikit.activities;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.google.android.material.appbar.AppBarLayout;
import com.midtrans.sdk.analytics.MixpanelAnalyticsManager;
import com.midtrans.sdk.corekit.callback.CheckoutCallback;
import com.midtrans.sdk.corekit.callback.TransactionOptionsCallback;
import com.midtrans.sdk.corekit.core.Constants;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.core.MidtransSDK;
import com.midtrans.sdk.corekit.core.PaymentType;
import com.midtrans.sdk.corekit.core.TransactionRequest;
import com.midtrans.sdk.corekit.core.themes.ColorTheme;
import com.midtrans.sdk.corekit.core.themes.CustomColorTheme;
import com.midtrans.sdk.corekit.models.CustomerDetails;
import com.midtrans.sdk.corekit.models.MerchantPreferences;
import com.midtrans.sdk.corekit.models.PaymentDetails;
import com.midtrans.sdk.corekit.models.PaymentMethodsModel;
import com.midtrans.sdk.corekit.models.snap.EnabledPayment;
import com.midtrans.sdk.corekit.models.snap.ItemDetails;
import com.midtrans.sdk.corekit.models.snap.MerchantData;
import com.midtrans.sdk.corekit.models.snap.Token;
import com.midtrans.sdk.corekit.models.snap.Transaction;
import com.midtrans.sdk.corekit.models.snap.TransactionDetails;
import com.midtrans.sdk.corekit.models.snap.TransactionResult;
import com.midtrans.sdk.uikit.models.EnabledPayments;
import com.midtrans.sdk.uikit.views.akulaku.AkulakuActivity;
import com.midtrans.sdk.uikit.views.alfamart.payment.AlfamartPaymentActivity;
import com.midtrans.sdk.uikit.views.banktransfer.list.BankTransferListActivity;
import com.midtrans.sdk.uikit.views.bca_klikbca.payment.KlikBcaPaymentActivity;
import com.midtrans.sdk.uikit.views.bca_klikpay.BcaKlikPayPaymentActivity;
import com.midtrans.sdk.uikit.views.bri_epay.BriEpayPaymentActivity;
import com.midtrans.sdk.uikit.views.cimb_click.CimbClickPaymentActivity;
import com.midtrans.sdk.uikit.views.creditcard.saved.SavedCreditCardActivity;
import com.midtrans.sdk.uikit.views.danamon_online.DanamonOnlineActivity;
import com.midtrans.sdk.uikit.views.gci.GciPaymentActivity;
import com.midtrans.sdk.uikit.views.gopay.payment.GoPayPaymentActivity;
import com.midtrans.sdk.uikit.views.indomaret.payment.IndomaretPaymentActivity;
import com.midtrans.sdk.uikit.views.indosat_dompetku.IndosatDompetkuPaymentActivity;
import com.midtrans.sdk.uikit.views.kioson.payment.KiosonPaymentActivity;
import com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity;
import com.midtrans.sdk.uikit.views.mandiri_ecash.MandiriEcashPaymentActivity;
import com.midtrans.sdk.uikit.views.shopeepay.payment.ShopeePayPaymentActivity;
import com.midtrans.sdk.uikit.views.telkomsel_cash.TelkomselCashPaymentActivity;
import com.midtrans.sdk.uikit.views.uob.UobListActivity;
import com.midtrans.sdk.uikit.views.xl_tunai.payment.XlTunaiPaymentActivity;
import com.midtrans.sdk.uikit.widgets.BoldTextView;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.DeviceQuirksExternalSyntheticLambda0;
import defpackage.DualSurfaceProcessorNodeExternalSyntheticLambda0;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.ViewPortBuilder;
import defpackage.calculateInvertedTextureTransform;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.getHumanReadableName;
import defpackage.getPreferredChildSizePairInternal;
import defpackage.getSensorAspectRatio;
import defpackage.getSessionToken;
import defpackage.handleMessage;
import defpackage.initSession;
import defpackage.isConnected;
import defpackage.onConnectionFailed;
import defpackage.setCallbacksMessenger;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes4.dex */
public class PaymentMethodsActivity extends BaseActivity implements setCallbacksMessenger.TuitionPaymentFragmentspecialinlinedviewModeldefault1, isConnected.TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
    private static String TuitionPaymentFragmentbindingInflater1 = "PaymentMethodsActivity";
    private DefaultTextView INotificationSideChannelDefault;
    private AppBarLayout INotificationSideChannelStub;
    private BoldTextView INotificationSideChannelStubProxy;
    private boolean MediaBrowserCompatConnectionCallback;
    private FancyButton RemoteActionCompatParcelizer;
    private LinearLayout asInterface;
    private ImageView cancel;
    private AlertDialog cancelAll;
    private TextView getInterfaceDescriptor;
    private ImageView notify;
    private boolean onConnectionSuspended;
    private setCallbacksMessenger onTransact;
    private static final byte[] $$s = {53, -70, 9, -72};
    private static final int $$t = 106;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {94, -1, 37, -59, 48, 1, -44, 45, -1, 4, -14, 20, -47, 34, 8, -6, 3, -5, 20, -14, -27, 37, 4, -3, -31, 30, 11, 2, -38, 25, 10, 8, -48, 34, -1, 13, 4, -27, 20, -3, 19};
    private static final int $$n = 44;
    private static final byte[] $$g = {91, -9, 99, 11, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$h = 210;
    private static int onError = 0;
    private static int MediaBrowserCompatCustomActionCallback = 1;
    private static int[] MediaBrowserCompatConnectionCallbackConnectionCallbackInternal = {-673343114, 1768569145, 982246544, -202907170, 426528848, -2047626526, -1364954699, 794802037, 2043968307, 159405025, 456245494, -1534518442, -321997443, 871432962, 1901940643, -1936335593, 1224409844, 622984123};
    private ArrayList<PaymentMethodsModel> write = new ArrayList<>();
    private boolean connect = false;
    private boolean IconCompatParcelizer = false;
    private boolean MediaBrowserCompat = false;
    private boolean read = false;
    private boolean disconnect = false;
    private boolean getExtras = false;
    private boolean getRoot = false;
    private boolean getItem = false;
    private boolean getNotifyChildrenChangedOptions = false;
    private boolean search = false;
    private boolean getSessionToken = false;
    private boolean sendCustomAction = false;
    private boolean isConnected = false;
    private boolean getServiceComponent = false;
    private boolean subscribe = false;
    private boolean MediaBrowserCompatCallbackHandler = false;
    private boolean setCallbacksMessenger = false;
    private boolean unsubscribe = false;
    private boolean handleMessage = false;
    private boolean onConnected = false;
    private MidtransSDK setInternalConnectionCallback = null;
    private Toolbar onConnectionFailed = null;
    private RecyclerView MediaBrowserCompatConnectionCallbackStubApi21 = null;
    private RecyclerView TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
    private TextView d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f852a = null;
    private ImageView asBinder = null;
    private ArrayList<EnabledPayment> g = new ArrayList<>();
    private ArrayList<EnabledPayment> INotificationSideChannel = new ArrayList<>();
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;

    public class TuitionPaymentFragmentbindingInflater1 implements DialogInterface.OnClickListener {
        public TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            if (!PaymentMethodsActivity.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                PaymentMethodsActivity.asInterface(PaymentMethodsActivity.this);
            } else {
                PaymentMethodsActivity paymentMethodsActivity = PaymentMethodsActivity.this;
                onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentMethodsActivity, paymentMethodsActivity.getString(R.string.error_utilized_orderid));
            }
        }
    }

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements View.OnClickListener {
        public TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
            try {
                PaymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(PaymentMethodsActivity.this);
                if (PaymentMethodsActivity.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    PaymentMethodsActivity paymentMethodsActivity = PaymentMethodsActivity.this;
                    onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentMethodsActivity, paymentMethodsActivity.getString(R.string.error_utilized_orderid));
                } else {
                    PaymentMethodsActivity.asInterface(PaymentMethodsActivity.this);
                }
            } finally {
                ViewPortBuilder.b();
            }
        }
    }

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements CheckoutCallback {
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
        public final void onError(Throwable th) {
            Object[] objArr = {PaymentMethodsActivity.this};
            PaymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 925498631, DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr, -925498628);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            String str = (String) PaymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1080889820, DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[0], 1080889821);
            StringBuilder sb = new StringBuilder("checkout>error:");
            sb.append(th.getMessage());
            Logger.e(str, sb.toString());
            PaymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(PaymentMethodsActivity.this, th);
        }

        @Override // com.midtrans.sdk.corekit.callback.CheckoutCallback
        public final void onFailure(Token token, String str) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Logger.d((String) PaymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1080889820, DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[0], 1080889821), "Failed to registering transaction: ".concat(String.valueOf(str)));
            Object[] objArr = {PaymentMethodsActivity.this};
            PaymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 925498631, DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr, -925498628);
            PaymentMethodsActivity paymentMethodsActivity = PaymentMethodsActivity.this;
            ArrayList<String> errorMessage = token.getErrorMessage();
            String string = paymentMethodsActivity.getString(R.string.error_message_status_code_400);
            if (errorMessage != null && !errorMessage.isEmpty()) {
                if (errorMessage.contains("has been paid") || errorMessage.contains("transaction has been processed")) {
                    string = paymentMethodsActivity.getString(R.string.error_message_status_code_406);
                } else if (errorMessage.contains("is not equal to the sum")) {
                    string = paymentMethodsActivity.getString(R.string.error_gross_amount_not_equal);
                } else if (errorMessage.contains("amount is required")) {
                    string = paymentMethodsActivity.getString(R.string.error_gross_amount_required);
                } else if (errorMessage.contains("order_id is required")) {
                    string = paymentMethodsActivity.getString(R.string.error_order_id_required);
                } else {
                    String str2 = errorMessage.get(0);
                    if (str2.contains("timed out") || str2.contains("timeout") || str2.equals("timeout")) {
                        string = paymentMethodsActivity.getString(R.string.timeout_message);
                    } else if (errorMessage.contains("Currency is not included")) {
                        string = paymentMethodsActivity.getString(R.string.currency_invalid);
                    }
                }
            }
            PaymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(PaymentMethodsActivity.this, string);
        }

        @Override // com.midtrans.sdk.corekit.callback.CheckoutCallback
        public final void onSuccess(Token token) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            String str = (String) PaymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1080889820, DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[0], 1080889821);
            StringBuilder sb = new StringBuilder("checkout token:");
            sb.append(token.getTokenId());
            Logger.i(str, sb.toString());
            PaymentMethodsActivity.TuitionPaymentFragmentbindingInflater1(PaymentMethodsActivity.this).setAuthenticationToken(token.getTokenId());
            PaymentMethodsActivity.b(PaymentMethodsActivity.this, token.getTokenId());
        }
    }

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements DialogInterface.OnClickListener {
        public TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            PaymentMethodsActivity.this.finish();
        }
    }

    public class a implements Runnable {

        public class b implements View.OnClickListener {
            public b() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(PaymentMethodsActivity.this);
                    PaymentMethodsActivity.this.onBackPressed();
                } finally {
                    ViewPortBuilder.b();
                }
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Drawable drawable = ContextCompat.getDrawable(PaymentMethodsActivity.this, 2131231099);
            if (PaymentMethodsActivity.TuitionPaymentFragmentbindingInflater1(PaymentMethodsActivity.this).getColorTheme() != null && PaymentMethodsActivity.TuitionPaymentFragmentbindingInflater1(PaymentMethodsActivity.this).getColorTheme().getPrimaryDarkColor() != 0) {
                drawable.setColorFilter(PaymentMethodsActivity.TuitionPaymentFragmentbindingInflater1(PaymentMethodsActivity.this).getColorTheme().getPrimaryDarkColor(), PorterDuff.Mode.SRC_ATOP);
            }
            PaymentMethodsActivity.d(PaymentMethodsActivity.this).setNavigationIcon(drawable);
            PaymentMethodsActivity.d(PaymentMethodsActivity.this).setNavigationOnClickListener(new b());
        }
    }

    public class asBinder implements DialogInterface.OnClickListener {
        public asBinder() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            if (!PaymentMethodsActivity.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                PaymentMethodsActivity.asInterface(PaymentMethodsActivity.this);
            } else {
                PaymentMethodsActivity paymentMethodsActivity = PaymentMethodsActivity.this;
                onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentMethodsActivity, paymentMethodsActivity.getString(R.string.error_utilized_orderid));
            }
        }
    }

    public class asInterface implements DialogInterface.OnClickListener {
        public asInterface() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            PaymentMethodsActivity.this.finish();
        }
    }

    public class b implements TransactionOptionsCallback {
        public b() {
        }

        @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
        public final void onError(Throwable th) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            String str = (String) PaymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1080889820, DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[0], 1080889821);
            StringBuilder sb = new StringBuilder("onError:");
            sb.append(th.getMessage());
            Logger.e(str, sb.toString());
            Object[] objArr = {PaymentMethodsActivity.this};
            PaymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 925498631, DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr, -925498628);
            PaymentMethodsActivity.g(PaymentMethodsActivity.this).setVisibility(8);
            PaymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(PaymentMethodsActivity.this, th);
        }

        @Override // com.midtrans.sdk.corekit.callback.TransactionOptionsCallback
        public final void onFailure(Transaction transaction, String str) {
            Object[] objArr = {PaymentMethodsActivity.this};
            PaymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 925498631, DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr, -925498628);
            PaymentMethodsActivity.g(PaymentMethodsActivity.this).setVisibility(8);
            PaymentMethodsActivity.asBinder(PaymentMethodsActivity.this);
        }

        @Override // com.midtrans.sdk.corekit.callback.TransactionOptionsCallback
        public final void onSuccess(Transaction transaction) throws Throwable {
            Object[] objArr = {PaymentMethodsActivity.this};
            PaymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 925498631, DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr, -925498628);
            Object[] objArr2 = {PaymentMethodsActivity.this};
            PaymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1331924945, DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr2, -1331924943);
            try {
                String logoUrl = transaction.getMerchantData().getPreference().getLogoUrl();
                String displayName = transaction.getMerchantData().getPreference().getDisplayName();
                PaymentMethodsActivity.TuitionPaymentFragmentbindingInflater1(PaymentMethodsActivity.this).setTransaction(transaction);
                PaymentMethodsActivity.TuitionPaymentFragmentbindingInflater1(PaymentMethodsActivity.this).setPromoResponses(transaction.getPromos());
                PaymentMethodsActivity.TuitionPaymentFragmentbindingInflater1(PaymentMethodsActivity.this).setMerchantLogo(logoUrl);
                PaymentMethodsActivity.TuitionPaymentFragmentbindingInflater1(PaymentMethodsActivity.this).setMerchantName(displayName);
                PaymentMethodsActivity.TuitionPaymentFragmentbindingInflater1(PaymentMethodsActivity.this).setPaymentDetails(new PaymentDetails(transaction.getTransactionDetails(), transaction.getItemDetails()));
                if (PaymentMethodsActivity.TuitionPaymentFragmentbindingInflater1(PaymentMethodsActivity.this).getColorTheme() == null || !(PaymentMethodsActivity.TuitionPaymentFragmentbindingInflater1(PaymentMethodsActivity.this).getColorTheme() instanceof CustomColorTheme)) {
                    PaymentMethodsActivity.TuitionPaymentFragmentbindingInflater1(PaymentMethodsActivity.this).setColorTheme(new ColorTheme(PaymentMethodsActivity.this, transaction.getMerchantData().getPreference().getColorScheme()));
                }
                PaymentMethodsActivity.cancelAll(PaymentMethodsActivity.this).setBackgroundColor(PaymentMethodsActivity.TuitionPaymentFragmentbindingInflater1(PaymentMethodsActivity.this).getColorTheme().getPrimaryColor());
                PaymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(PaymentMethodsActivity.this, logoUrl);
                if (TextUtils.isEmpty(logoUrl)) {
                    PaymentMethodsActivity.TuitionPaymentFragmentbindingInflater1(PaymentMethodsActivity.this, displayName);
                }
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 1) {
                    Object[] objArr3 = {PaymentMethodsActivity.this};
                    ((ImageView) PaymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 661629429, DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr3, -661629429)).setImageResource(2131230900);
                } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 3) {
                    Object[] objArr4 = {PaymentMethodsActivity.this};
                    ((ImageView) PaymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 661629429, DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr4, -661629429)).setImageResource(2131230901);
                } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 != 4) {
                    Object[] objArr5 = {PaymentMethodsActivity.this};
                    ((ImageView) PaymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 661629429, DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr5, -661629429)).setImageResource(2131230899);
                } else {
                    Object[] objArr6 = {PaymentMethodsActivity.this};
                    ((ImageView) PaymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 661629429, DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr6, -661629429)).setImageResource(2131230898);
                }
                PaymentMethodsActivity.b(PaymentMethodsActivity.this, transaction);
                PaymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(PaymentMethodsActivity.this, transaction);
                Object[] objArr7 = {PaymentMethodsActivity.this, transaction.getEnabledPayments()};
                PaymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 384734716, DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr7, -384734712);
                PaymentMethodsActivity.b(PaymentMethodsActivity.this);
            } catch (NullPointerException e2) {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                Logger.e((String) PaymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1080889820, DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[0], 1080889821), e2.getMessage());
            }
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            PaymentMethodsActivity.this.finish();
        }
    }

    public static /* synthetic */ MidtransSDK TuitionPaymentFragmentbindingInflater1(PaymentMethodsActivity paymentMethodsActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionCallback;
        int i3 = i2 + 77;
        onError = i3 % 128;
        int i4 = i3 % 2;
        MidtransSDK midtransSDK = paymentMethodsActivity.setInternalConnectionCallback;
        int i5 = i2 + 99;
        onError = i5 % 128;
        int i6 = i5 % 2;
        return midtransSDK;
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~((~i6) | i7 | i2);
        int i9 = ~i2;
        int i10 = (~(i7 | i6)) | (~(i7 | i9)) | (~(i9 | i6));
        int i11 = (~(i9 | i3)) | i6;
        int i12 = i3 + i6 + i5 + ((-946781377) * i) + ((-59450693) * i4);
        int i13 = i12 * i12;
        int i14 = (((-143250568) * i3) - 346488832) + (357422218 * i6) + (i8 * (-1897147255)) + ((-1897147255) * i10) + (1897147255 * i11) + ((-2040397824) * i5) + ((-1205993472) * i) + ((-1651113984) * i4) + ((-884408320) * i13);
        int i15 = ((i3 * 358501064) - 1042343473) + (i6 * 358500518) + (i8 * (-273)) + (i10 * (-273)) + (i11 * 273) + (i5 * 358500791) + (i * (-249165559)) + (i4 * 1905372845) + (i13 * 573505536);
        int i16 = i14 + (i15 * i15 * (-553189376));
        if (i16 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i16 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i16 != 3) {
            return i16 != 4 ? b(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        PaymentMethodsActivity paymentMethodsActivity = (PaymentMethodsActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onError + 59;
        int i3 = i2 % 128;
        MediaBrowserCompatCustomActionCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = paymentMethodsActivity.onConnectionSuspended;
            obj.hashCode();
            throw null;
        }
        if (paymentMethodsActivity.onConnectionSuspended) {
            int i4 = i3 + 123;
            onError = i4 % 128;
            int i5 = i4 % 2;
            if (paymentMethodsActivity.getSupportActionBar() != null) {
                new Handler().postDelayed(paymentMethodsActivity.new a(), 50L);
            }
        }
        return null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onError + 111;
        MediaBrowserCompatCustomActionCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = TuitionPaymentFragmentbindingInflater1;
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        return str;
    }

    public static /* synthetic */ void asBinder(PaymentMethodsActivity paymentMethodsActivity) {
        int i = 2 % 2;
        int i2 = onError + 99;
        MediaBrowserCompatCustomActionCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!paymentMethodsActivity.isFinishing()) {
            AlertDialog alertDialogCreate = new AlertDialog.Builder(paymentMethodsActivity).setMessage(paymentMethodsActivity.getString(R.string.error_snap_transaction_details)).setPositiveButton(R.string.btn_retry, paymentMethodsActivity.new asBinder()).setNegativeButton(R.string.btn_cancel, paymentMethodsActivity.new d()).create();
            paymentMethodsActivity.cancelAll = alertDialogCreate;
            alertDialogCreate.show();
        }
        int i4 = MediaBrowserCompatCustomActionCallback + 5;
        onError = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void asInterface(PaymentMethodsActivity paymentMethodsActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionCallback + 123;
        onError = i2 % 128;
        int i3 = i2 % 2;
        paymentMethodsActivity.b();
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        int i5 = onError + 19;
        MediaBrowserCompatCustomActionCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void b(PaymentMethodsActivity paymentMethodsActivity) {
        int i = 2 % 2;
        DualSurfaceProcessorNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new getSessionToken(paymentMethodsActivity);
        int i2 = MediaBrowserCompatCustomActionCallback + 25;
        onError = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ RecyclerView cancelAll(PaymentMethodsActivity paymentMethodsActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionCallback + 21;
        onError = i2 % 128;
        int i3 = i2 % 2;
        RecyclerView recyclerView = paymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return recyclerView;
    }

    public static /* synthetic */ Toolbar d(PaymentMethodsActivity paymentMethodsActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionCallback + 103;
        int i3 = i2 % 128;
        onError = i3;
        int i4 = i2 % 2;
        Toolbar toolbar = paymentMethodsActivity.onConnectionFailed;
        int i5 = i3 + 61;
        MediaBrowserCompatCustomActionCallback = i5 % 128;
        int i6 = i5 % 2;
        return toolbar;
    }

    public static /* synthetic */ LinearLayout g(PaymentMethodsActivity paymentMethodsActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionCallback;
        int i3 = i2 + 13;
        onError = i3 % 128;
        int i4 = i3 % 2;
        LinearLayout linearLayout = paymentMethodsActivity.f852a;
        int i5 = i2 + 39;
        onError = i5 % 128;
        if (i5 % 2 == 0) {
            return linearLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void k(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 84
            byte[] r0 = com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.$$g
            int r8 = r8 + 4
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L11
            r4 = r7
            r6 = r8
            r3 = r2
            goto L26
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L1f
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L1f:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L26:
            int r8 = r8 + r4
            int r6 = r6 + 1
            int r8 = r8 + (-11)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.k(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.$$m
            int r7 = r7 * 37
            int r1 = r7 + 1
            int r5 = r5 * 33
            int r5 = 98 - r5
            int r6 = r6 * 37
            int r6 = 41 - r6
            byte[] r1 = new byte[r1]
            r2 = -1
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            int r3 = r3 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L27:
            r4 = r0[r6]
        L29:
            int r5 = r5 + r4
            int r6 = r6 + 1
            int r5 = r5 + r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.m(int, short, int, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.activities.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        MidtransSDK midtransSDK = this.setInternalConnectionCallback;
        if (midtransSDK != null) {
            int i2 = MediaBrowserCompatCustomActionCallback + 47;
            onError = i2 % 128;
            if (i2 % 2 != 0) {
                midtransSDK.getmMixpanelAnalyticsManager().trackButtonClicked(this.setInternalConnectionCallback.readAuthenticationToken(), "Back", "Select Payment");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            midtransSDK.getmMixpanelAnalyticsManager().trackButtonClicked(this.setInternalConnectionCallback.readAuthenticationToken(), "Back", "Select Payment");
        }
        if (this.onConnectionSuspended) {
            this.setInternalConnectionCallback.notifyTransactionFinished(new TransactionResult(true));
            super.onBackPressed();
        } else {
            int i3 = onError + 1;
            MediaBrowserCompatCustomActionCallback = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(PaymentMethodsActivity paymentMethodsActivity, String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionCallback + 51;
        onError = i2 % 128;
        int i3 = i2 % 2;
        if (!(!TextUtils.isEmpty(str))) {
            return;
        }
        int i4 = MediaBrowserCompatCustomActionCallback + 77;
        onError = i4 % 128;
        if (i4 % 2 != 0) {
            paymentMethodsActivity.d.setVisibility(1);
            paymentMethodsActivity.d.setText(str);
        } else {
            paymentMethodsActivity.d.setVisibility(0);
            paymentMethodsActivity.d.setText(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r3.asBinder.setVisibility(4);
        r3 = com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.MediaBrowserCompatCustomActionCallback + 27;
        com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.onError = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if ((r3 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        r3 = null;
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r3.d.setVisibility(8);
        defpackage.calculateInvertedTextureTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r3.asBinder).TuitionPaymentFragmentbindingInflater1(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(com.midtrans.sdk.uikit.activities.PaymentMethodsActivity r3, java.lang.String r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.onError
            int r1 = r1 + 25
            int r2 = r1 % 128
            com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.MediaBrowserCompatCustomActionCallback = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1a
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            r2 = 67
            int r2 = r2 / 0
            r2 = 1
            if (r1 == r2) goto L31
            goto L20
        L1a:
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L31
        L20:
            android.widget.TextView r0 = r3.d
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ImageView r3 = r3.asBinder
            getHumanReadableName$b$TuitionPaymentFragmentspecialinlinedviewModeldefault3 r3 = defpackage.calculateInvertedTextureTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r3)
            r3.TuitionPaymentFragmentbindingInflater1(r4)
            return
        L31:
            android.widget.ImageView r3 = r3.asBinder
            r4 = 4
            r3.setVisibility(r4)
            int r3 = com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.MediaBrowserCompatCustomActionCallback
            int r3 = r3 + 27
            int r4 = r3 % 128
            com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.onError = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L43
            return
        L43:
            r3 = 0
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(com.midtrans.sdk.uikit.activities.PaymentMethodsActivity, java.lang.String):void");
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(PaymentMethodsActivity paymentMethodsActivity, String str) {
        int i = 2 % 2;
        int i2 = onError + 15;
        MediaBrowserCompatCustomActionCallback = i2 % 128;
        if (i2 % 2 == 0) {
            paymentMethodsActivity.isFinishing();
            throw null;
        }
        if (!paymentMethodsActivity.isFinishing()) {
            AlertDialog alertDialogCreate = new AlertDialog.Builder(paymentMethodsActivity).setMessage(str).setPositiveButton(R.string.btn_retry, paymentMethodsActivity.new TuitionPaymentFragmentbindingInflater1()).setNegativeButton(R.string.btn_cancel, paymentMethodsActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault3()).create();
            paymentMethodsActivity.cancelAll = alertDialogCreate;
            alertDialogCreate.show();
            int i3 = MediaBrowserCompatCustomActionCallback + 95;
            onError = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 % 4;
            }
        }
        int i5 = onError + 75;
        MediaBrowserCompatCustomActionCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void b(PaymentMethodsActivity paymentMethodsActivity, String str) {
        int i = 2 % 2;
        paymentMethodsActivity.setInternalConnectionCallback.getTransactionOptions(str, paymentMethodsActivity.new b());
        int i2 = onError + 9;
        MediaBrowserCompatCustomActionCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        PaymentMethodsActivity paymentMethodsActivity = (PaymentMethodsActivity) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionCallback;
        int i3 = i2 + 43;
        onError = i3 % 128;
        int i4 = i3 % 2;
        ImageView imageView = paymentMethodsActivity.cancel;
        int i5 = i2 + 1;
        onError = i5 % 128;
        int i6 = i5 % 2;
        return imageView;
    }

    public static /* synthetic */ void b(PaymentMethodsActivity paymentMethodsActivity, Transaction transaction) {
        int i = 2 % 2;
        int i2 = onError + 109;
        MediaBrowserCompatCustomActionCallback = i2 % 128;
        int i3 = i2 % 2;
        if (transaction != null) {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            int size = transaction.getItemDetails() != null ? transaction.getItemDetails().size() : 0;
            double amount = transaction.getTransactionDetails().getAmount();
            String currency = transaction.getTransactionDetails().getCurrency();
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = paymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(amount, currency);
            BoldTextView boldTextView = paymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (boldTextView != null) {
                int i4 = MediaBrowserCompatCustomActionCallback + 9;
                onError = i4 % 128;
                int i5 = i4 % 2;
                boldTextView.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            if (size > 0) {
                int i6 = MediaBrowserCompatCustomActionCallback + 39;
                onError = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            }
            arrayList.add(new getSensorAspectRatio(null, strTuitionPaymentFragmentspecialinlinedviewModeldefault1, "item.header", z));
            if (size > 0) {
                for (ItemDetails itemDetails : transaction.getItemDetails()) {
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = paymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(itemDetails.getPrice(), currency);
                    String name = itemDetails.getName();
                    if (itemDetails.getQuantity() > 1) {
                        name = paymentMethodsActivity.getString(R.string.text_item_name_format, itemDetails.getName(), Integer.valueOf(itemDetails.getQuantity()));
                    }
                    arrayList.add(new getSensorAspectRatio(name, strTuitionPaymentFragmentspecialinlinedviewModeldefault2, "item", true));
                }
            }
            isConnected isconnected = new isConnected(arrayList, paymentMethodsActivity, transaction.getTransactionDetails().getOrderId());
            paymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setLayoutManager(new LinearLayoutManager(paymentMethodsActivity));
            paymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setAdapter(isconnected);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v5 setCallbacksMessenger) = (r1v4 setCallbacksMessenger), (r1v8 setCallbacksMessenger) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // setCallbacksMessenger.TuitionPaymentFragmentspecialinlinedviewModeldefault1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        setCallbacksMessenger setcallbacksmessenger;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatCustomActionCallback + 109;
        onError = i3 % 128;
        if (i3 % 2 != 0) {
            setcallbacksmessenger = this.onTransact;
            int i4 = 45 / 0;
            if (setcallbacksmessenger != null) {
                TuitionPaymentFragmentbindingInflater1(setcallbacksmessenger.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i));
            }
        } else {
            setcallbacksmessenger = this.onTransact;
            if (setcallbacksmessenger != null) {
                TuitionPaymentFragmentbindingInflater1(setcallbacksmessenger.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i));
            }
        }
        int i5 = onError + 41;
        MediaBrowserCompatCustomActionCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int i = 2 % 2;
        super.onStop();
        AlertDialog alertDialog = this.cancelAll;
        if (alertDialog != null) {
            int i2 = MediaBrowserCompatCustomActionCallback + 1;
            onError = i2 % 128;
            int i3 = i2 % 2;
            alertDialog.cancel();
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i4 = MediaBrowserCompatCustomActionCallback + 39;
        onError = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0100  */
    /* JADX WARN: Code duplicated, block: B:453:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x016a  */
    /* JADX WARN: Code duplicated, block: B:60:0x017c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0186  */
    /* JADX WARN: Code duplicated, block: B:66:0x019a  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c3  */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0829, code lost:
    
        if (defpackage.onConnectionFailed.TuitionPaymentFragmentbindingInflater1(r3, r1.getString(com.bpjstku.R.string.payment_alfamart)) != false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0837, code lost:
    
        if (defpackage.onConnectionFailed.TuitionPaymentFragmentbindingInflater1(r3, r1.getString(com.bpjstku.R.string.payment_alfamart)) != false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0839, code lost:
    
        r1.startActivityForResult(new android.content.Intent(r1, (java.lang.Class<?>) com.midtrans.sdk.uikit.views.alfamart.payment.AlfamartPaymentActivity.class), com.midtrans.sdk.corekit.core.Constants.RESULT_CODE_PAYMENT_TRANSFER);
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x084b, code lost:
    
        if (com.midtrans.sdk.corekit.core.MidtransSDK.getInstance().getUIKitCustomSetting() == null) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0859, code lost:
    
        if (com.midtrans.sdk.corekit.core.MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation() == false) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x085b, code lost:
    
        r1.overridePendingTransition(com.bpjstku.R.anim.slide_in, com.bpjstku.R.anim.slide_out);
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0861, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0862, code lost:
    
        r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r1.getString(com.bpjstku.R.string.payment_not_enabled_message));
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0869, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object TuitionPaymentFragmentbindingInflater1(java.lang.Object[] r16) {
        /*
            Method dump skipped, instruction units count: 2464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.TuitionPaymentFragmentbindingInflater1(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(PaymentMethodsActivity paymentMethodsActivity, Transaction transaction) throws Throwable {
        Object[] objArr;
        MixpanelAnalyticsManager mixpanelAnalyticsManager;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionCallback + 53;
        onError = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyTid = (char) (Process.myTid() >> 22);
            int iAlpha = 876 - Color.alpha(0);
            int trimmedLength = TextUtils.getTrimmedLength("") + 10;
            byte[] bArr = $$g;
            Object[] objArr2 = new Object[1];
            k(bArr[12], bArr[26], bArr[24], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, iAlpha, trimmedLength, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        l(new int[]{-593168669, 284236107, 1530309569, -1763448987, 27623745, 1825521161, 439113251, -1737957242, 1749736025, -145094813, -399524477, 314235709, 1532940762, -1141292629}, TextUtils.getTrimmedLength("") + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        l(new int[]{837936289, -1816032443, 262684268, 1710800456, 59499737, -491398308, -184437398, -1107031018, -225745297, -895806026}, View.MeasureSpec.makeMeasureSpec(0, 0) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int mode = 876 - View.MeasureSpec.getMode(0);
            int iNormalizeMetaState = 10 - KeyEvent.normalizeMetaState(0);
            byte[] bArr2 = $$g;
            Object[] objArr5 = new Object[1];
            k(bArr2[17], bArr2[24], bArr2[26], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(longPressTimeout, mode, iNormalizeMetaState, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                int tapTimeout = 876 - (ViewConfiguration.getTapTimeout() >> 16);
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 10;
                byte[] bArr3 = $$g;
                Object[] objArr6 = new Object[1];
                k(bArr3[12], bArr3[95], bArr3[26], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(absoluteGravity, tapTimeout, jumpTapTimeout, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i4 = ~iMaxMemory;
            int i5 = 1808449279 + (((~((-185171648) | i4)) | (~(iMaxMemory | (-144861419)))) * 333) + (((~(iMaxMemory | (-185171648))) | (~(i4 | (-144861419)))) * 333) + 920530629;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            l(new int[]{-2094371642, 1471651874, 309646420, -520261936, 1451268386, -1447482318, -908041257, 819393877, 1272057550, -866072613}, 15 - Process.getGidForName(""), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            l(new int[]{-1080709628, -1072232605, 1712397708, -675535615, 1073423568, -486526124, 1352718791, -970859869, 1017400917, -65691585}, (Process.myTid() >> 22) + 16, objArr9);
            try {
                Object[] objArr10 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, paymentMethodsActivity)).intValue()), 920530629};
                byte[] bArr4 = $$m;
                byte b2 = bArr4[5];
                byte b3 = b2;
                Object[] objArr11 = new Object[1];
                m(b2, b3, b3, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b4 = (byte) (bArr4[5] - 1);
                byte b5 = b4;
                Object[] objArr12 = new Object[1];
                m(b4, b5, b5, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                    int packedPositionType = 876 - ExpandableListView.getPackedPositionType(0L);
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10;
                    byte[] bArr5 = $$g;
                    Object[] objArr13 = new Object[1];
                    k(bArr5[12], bArr5[95], bArr5[26], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, packedPositionType, maximumFlingVelocity, 1324201839, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    l(new int[]{-593168669, 284236107, 1530309569, -1763448987, 27623745, 1825521161, 439113251, -1737957242, 1749736025, -145094813, -399524477, 314235709, 1532940762, -1141292629}, Gravity.getAbsoluteGravity(0, 0) + 22, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    l(new int[]{837936289, -1816032443, 262684268, 1710800456, 59499737, -491398308, -184437398, -1107031018, -225745297, -895806026}, 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int i8 = 877 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int iRgb = Color.rgb(0, 0, 0) + 16777226;
                        byte[] bArr6 = $$g;
                        Object[] objArr16 = new Object[1];
                        k(bArr6[17], bArr6[24], bArr6[26], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyPid, i8, iRgb, 254769921, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 877;
                        int iIndexOf = 10 - TextUtils.indexOf("", "", 0, 0);
                        byte[] bArr7 = $$g;
                        Object[] objArr17 = new Object[1];
                        k(bArr7[12], bArr7[26], bArr7[24], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, modifierMetaStateMask, iIndexOf, -1199417970, false, (String) objArr17[0], null);
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
        if (((int[]) objArr[0])[0] == ((int[]) objArr[2])[0]) {
            int i9 = ((int[]) objArr[1])[0];
            Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMyPid = Process.myPid();
            int i10 = i9 + ((((-1703544620) + (((~(177116507 | iMyPid)) | 74525216) * 576)) + (((~((~iMyPid) | 251641723)) | 142901520) * 576)) - 23148544);
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr18[1])[0] = i12 ^ (i12 << 5);
            int i13 = onError + 49;
            MediaBrowserCompatCustomActionCallback = i13 % 128;
            if (i13 % 2 == 0) {
                mixpanelAnalyticsManager = paymentMethodsActivity.setInternalConnectionCallback.getmMixpanelAnalyticsManager();
                int i14 = 70 / 0;
                if (transaction == null) {
                    return;
                }
            } else {
                mixpanelAnalyticsManager = paymentMethodsActivity.setInternalConnectionCallback.getmMixpanelAnalyticsManager();
                if (transaction == null) {
                    return;
                }
            }
            mixpanelAnalyticsManager.setEnabledPayments(TuitionPaymentFragmentspecialinlinedviewModeldefault2(transaction.getEnabledPayments()));
            TransactionDetails transactionDetails = transaction.getTransactionDetails();
            if (transactionDetails != null) {
                mixpanelAnalyticsManager.setOrderId(transactionDetails.getOrderId());
            }
            MerchantData merchantData = transaction.getMerchantData();
            if (merchantData != null) {
                mixpanelAnalyticsManager.setMerchantId(merchantData.getMerchantId());
                MerchantPreferences preference = merchantData.getPreference();
                if (preference != null) {
                    mixpanelAnalyticsManager.setMerchantName(preference.getDisplayName());
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[3];
        if (strArr != null) {
            int i15 = MediaBrowserCompatCustomActionCallback + 93;
            onError = i15 % 128;
            for (int i16 = i15 % 2 == 0 ? 0 : 1; i16 < strArr.length; i16++) {
                arrayList.add(strArr[i16]);
            }
            throw null;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        PaymentMethodsActivity paymentMethodsActivity = (PaymentMethodsActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onError;
        int i3 = i2 + 21;
        MediaBrowserCompatCustomActionCallback = i3 % 128;
        if (i3 % 2 == 0) {
            paymentMethodsActivity.onConnectionSuspended = false;
        } else {
            paymentMethodsActivity.onConnectionSuspended = true;
        }
        int i4 = i2 + 37;
        MediaBrowserCompatCustomActionCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(PaymentMethodsActivity paymentMethodsActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionCallback + 17;
        onError = i2 % 128;
        int i3 = i2 % 2;
        paymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(false);
        int i4 = MediaBrowserCompatCustomActionCallback + 89;
        onError = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(PaymentMethodsActivity paymentMethodsActivity, Throwable th) {
        int i = 2 % 2;
        getPreferredChildSizePairInternal getpreferredchildsizepairinternalB = handleMessage.b(th, paymentMethodsActivity);
        paymentMethodsActivity.INotificationSideChannelStubProxy.setText(getpreferredchildsizepairinternalB.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        paymentMethodsActivity.INotificationSideChannelDefault.setText(getpreferredchildsizepairinternalB.TuitionPaymentFragmentbindingInflater1);
        paymentMethodsActivity.RemoteActionCompatParcelizer.setText(paymentMethodsActivity.getString(R.string.try_again));
        paymentMethodsActivity.RemoteActionCompatParcelizer.setOnClickListener(paymentMethodsActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        paymentMethodsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(true);
        int i2 = onError + 59;
        MediaBrowserCompatCustomActionCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x02dc  */
    @Override // com.midtrans.sdk.uikit.activities.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        Object obj = null;
        int i2 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 126351957;
        int i4 = ~i3;
        if (i2 != 1099988477 + (((~((-846092737) | i4)) | (~(i3 | (-1676080280)))) * 333) + (((~(i3 | (-846092737))) | (~(i4 | (-1676080280)))) * 333)) {
            throw null;
        }
        int i5 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i5 != (-881696457) + (((~((~iIdentityHashCode) | (-402683368))) | (-2118594699)) * (-235)) + (((~((-402683368) | iIdentityHashCode)) | (-2118594699)) * (-470)) + (((~(iIdentityHashCode | (-402665603))) | (-2118612464)) * 235)) {
            int i6 = (-224516902) % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_payments_method);
        this.connect = getIntent().getBooleanExtra("cconly", false);
        this.IconCompatParcelizer = getIntent().getBooleanExtra("btonly", false);
        this.subscribe = getIntent().getBooleanExtra(PaymentType.GOPAY, false);
        this.MediaBrowserCompatCallbackHandler = getIntent().getBooleanExtra(PaymentType.SHOPEEPAY, false);
        this.MediaBrowserCompat = getIntent().getBooleanExtra("bcaklikpay", false);
        this.read = getIntent().getBooleanExtra("klikbca", false);
        this.disconnect = getIntent().getBooleanExtra("mandiriclickpay", false);
        this.getExtras = getIntent().getBooleanExtra("mandiriecash", false);
        this.getRoot = getIntent().getBooleanExtra("cimbclicks", false);
        this.getItem = getIntent().getBooleanExtra("briepay", false);
        this.getNotifyChildrenChangedOptions = getIntent().getBooleanExtra("tcash", false);
        this.search = getIntent().getBooleanExtra("indosatdompetku", false);
        this.getSessionToken = getIntent().getBooleanExtra("xltunai", false);
        this.sendCustomAction = getIntent().getBooleanExtra(PaymentType.INDOMARET, false);
        this.isConnected = getIntent().getBooleanExtra(PaymentType.KIOSON, false);
        this.getServiceComponent = getIntent().getBooleanExtra(PaymentType.GCI, false);
        this.setCallbacksMessenger = getIntent().getBooleanExtra(PaymentType.DANAMON_ONLINE, false);
        this.unsubscribe = getIntent().getBooleanExtra(PaymentType.AKULAKU, false);
        this.handleMessage = getIntent().getBooleanExtra(PaymentType.ALFAMART, false);
        this.onConnected = getIntent().getBooleanExtra("uob", false);
        StringBuilder sb = new StringBuilder("CLICK ALFAMART ");
        sb.append(this.handleMessage);
        Logger.d(sb.toString());
        this.setInternalConnectionCallback = MidtransSDK.getInstance();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (this.setInternalConnectionCallback == null) {
            Logger.e("Veritrans SDK is not started.");
            finish();
            return;
        }
        this.MediaBrowserCompatConnectionCallbackStubApi21 = (RecyclerView) findViewById(R.id.rv_payment_methods);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (RecyclerView) findViewById(R.id.rv_item_list);
        this.onConnectionFailed = (Toolbar) findViewById(R.id.main_toolbar);
        this.INotificationSideChannelStub = (AppBarLayout) findViewById(R.id.main_appbar);
        this.asBinder = (ImageView) findViewById(R.id.merchant_logo);
        this.d = (TextView) findViewById(R.id.merchant_name);
        this.f852a = (LinearLayout) findViewById(R.id.progress_container);
        this.asInterface = (LinearLayout) findViewById(R.id.maintenance_container);
        this.notify = (ImageView) findViewById(R.id.progress_bar_image);
        this.cancel = (ImageView) findViewById(R.id.secure_badge);
        this.getInterfaceDescriptor = (TextView) findViewById(R.id.progress_bar_message);
        this.INotificationSideChannelStubProxy = (BoldTextView) findViewById(R.id.text_maintenance_title);
        this.INotificationSideChannelDefault = (DefaultTextView) findViewById(R.id.text_maintenance_message);
        this.RemoteActionCompatParcelizer = (FancyButton) findViewById(R.id.button_maintenance_retry);
        if (this.connect || this.IconCompatParcelizer || this.read || this.MediaBrowserCompat || this.disconnect) {
            this.getInterfaceDescriptor.setText(R.string.txt_checkout);
        } else {
            int i7 = onError + 97;
            int i8 = i7 % 128;
            MediaBrowserCompatCustomActionCallback = i8;
            if (i7 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (this.getExtras || this.getRoot) {
                this.getInterfaceDescriptor.setText(R.string.txt_checkout);
            } else {
                int i9 = i8 + 19;
                onError = i9 % 128;
                if (i9 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (this.getItem || this.getNotifyChildrenChangedOptions) {
                    this.getInterfaceDescriptor.setText(R.string.txt_checkout);
                } else {
                    int i10 = i8 + 63;
                    int i11 = i10 % 128;
                    onError = i11;
                    if (i10 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (this.search) {
                        this.getInterfaceDescriptor.setText(R.string.txt_checkout);
                    } else {
                        int i12 = i11 + 103;
                        MediaBrowserCompatCustomActionCallback = i12 % 128;
                        if (i12 % 2 == 0) {
                            throw null;
                        }
                        if (this.getSessionToken || this.sendCustomAction || this.isConnected) {
                            this.getInterfaceDescriptor.setText(R.string.txt_checkout);
                        } else {
                            int i13 = i11 + 65;
                            MediaBrowserCompatCustomActionCallback = i13 % 128;
                            if (i13 % 2 == 0) {
                                throw null;
                            }
                            if (this.getServiceComponent || this.setCallbacksMessenger || this.unsubscribe) {
                                this.getInterfaceDescriptor.setText(R.string.txt_checkout);
                            } else {
                                int i14 = i11 + 97;
                                MediaBrowserCompatCustomActionCallback = i14 % 128;
                                if (i14 % 2 == 0) {
                                    this.getInterfaceDescriptor.setText(getString(R.string.txt_loading_payment));
                                    throw null;
                                }
                                this.getInterfaceDescriptor.setText(getString(R.string.txt_loading_payment));
                            }
                        }
                    }
                }
            }
        }
        getHumanReadableName.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3<? extends getHumanReadableName.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3<?>> tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = calculateInvertedTextureTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.notify);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder("android.resource://");
        sb3.append(getPackageName());
        sb3.append("/");
        sb2.append(sb3.toString());
        sb2.append(R.drawable.midtrans_loader);
        tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(sb2.toString());
        MidtransSDK midtransSDK = this.setInternalConnectionCallback;
        if (midtransSDK != null) {
            int i15 = onError + 1;
            MediaBrowserCompatCustomActionCallback = i15 % 128;
            int i16 = i15 % 2;
            if (midtransSDK.getColorTheme() != null && this.setInternalConnectionCallback.getColorTheme().getPrimaryDarkColor() != 0) {
                this.RemoteActionCompatParcelizer.setBorderColor(this.setInternalConnectionCallback.getColorTheme().getPrimaryDarkColor());
                this.RemoteActionCompatParcelizer.setTextColor(this.setInternalConnectionCallback.getColorTheme().getPrimaryDarkColor());
            }
        }
        setSupportActionBar(this.onConnectionFailed);
        b();
        this.onTransact = new setCallbacksMessenger(this);
        this.MediaBrowserCompatConnectionCallbackStubApi21.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.MediaBrowserCompatConnectionCallbackStubApi21.setAdapter(this.onTransact);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e8, code lost:
    
        if (r16.connect != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ec, code lost:
    
        if (r16.IconCompatParcelizer != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ee, code lost:
    
        r2 = r0 + 55;
        com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.onError = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f5, code lost:
    
        if ((r2 % 2) != 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f9, code lost:
    
        if (r16.MediaBrowserCompat != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01fd, code lost:
    
        if (r16.read != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0201, code lost:
    
        if (r16.disconnect != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0205, code lost:
    
        if (r16.getExtras != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0209, code lost:
    
        if (r16.getRoot != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x020d, code lost:
    
        if (r16.getItem != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0212, code lost:
    
        if ((!r16.getNotifyChildrenChangedOptions) == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0214, code lost:
    
        r0 = r0 + 11;
        com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.onError = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x021e, code lost:
    
        if (r16.search != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0223, code lost:
    
        if ((!r16.getSessionToken) == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0227, code lost:
    
        if (r16.sendCustomAction != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x022b, code lost:
    
        if (r16.isConnected != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x022f, code lost:
    
        if (r16.getServiceComponent != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0233, code lost:
    
        if (r16.subscribe != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0237, code lost:
    
        if (r16.setCallbacksMessenger != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x023b, code lost:
    
        if (r16.MediaBrowserCompatCallbackHandler == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x023f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0241, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0242, code lost:
    
        r16.setInternalConnectionCallback.notifyTransactionFinished(new com.midtrans.sdk.corekit.models.snap.TransactionResult(true));
        finish();
        r0 = com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.MediaBrowserCompatCustomActionCallback + 25;
        com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.onError = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0259, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x025a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x025b, code lost:
    
        r2 = com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.TuitionPaymentFragmentbindingInflater1;
        r3 = new java.lang.StringBuilder("onActivityResult:");
        r3.append(r0.getMessage());
        com.midtrans.sdk.corekit.core.Logger.e(r2, r3.toString());
        finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0273, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
    
        if (r18 == (-1)) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
    
        if (r18 == (-1)) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
    
        r0 = (com.midtrans.sdk.corekit.models.TransactionResponse) r19.getSerializableExtra("transaction_response");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        if (r0.getStatusCode().equals(com.midtrans.sdk.corekit.core.Constants.STATUS_CODE_200) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        r16.setInternalConnectionCallback.notifyTransactionFinished(new com.midtrans.sdk.corekit.models.snap.TransactionResult(r0, null, "success"));
        r16.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        if (r0.getStatusCode().equals(com.midtrans.sdk.corekit.core.Constants.STATUS_CODE_201) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
    
        r16.setInternalConnectionCallback.notifyTransactionFinished(new com.midtrans.sdk.corekit.models.snap.TransactionResult(r0, null, com.midtrans.sdk.corekit.models.snap.TransactionResult.STATUS_PENDING));
        r16.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bd, code lost:
    
        r16.setInternalConnectionCallback.notifyTransactionFinished(new com.midtrans.sdk.corekit.models.snap.TransactionResult(r0, null, com.midtrans.sdk.corekit.models.snap.TransactionResult.STATUS_FAILED));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c8, code lost:
    
        r16.setInternalConnectionCallback.notifyTransactionFinished(new com.midtrans.sdk.corekit.models.snap.TransactionResult(null, null, com.midtrans.sdk.corekit.models.snap.TransactionResult.STATUS_INVALID));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d5, code lost:
    
        finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00da, code lost:
    
        r2 = com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.TuitionPaymentFragmentbindingInflater1;
        r3 = new java.lang.StringBuilder("onActivityResult:");
        r3.append(r0.getMessage());
        com.midtrans.sdk.corekit.core.Logger.e(r2, r3.toString());
        finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f3, code lost:
    
        if (r18 != 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f5, code lost:
    
        if (r19 != null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fd, code lost:
    
        if (r16.write.size() == 1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0101, code lost:
    
        if (r16.connect != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0105, code lost:
    
        if (r16.IconCompatParcelizer != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0109, code lost:
    
        if (r16.MediaBrowserCompat != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010b, code lost:
    
        r0 = com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.onError + 9;
        r2 = r0 % 128;
        com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.MediaBrowserCompatCustomActionCallback = r2;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0117, code lost:
    
        if (r16.read != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0119, code lost:
    
        r0 = r2 + 89;
        com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.onError = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0120, code lost:
    
        if ((r0 % 2) != 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0124, code lost:
    
        if (r16.disconnect != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0128, code lost:
    
        if (r16.getExtras != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012c, code lost:
    
        if (r16.getRoot != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012e, code lost:
    
        r0 = r2 + 25;
        com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.onError = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0138, code lost:
    
        if (r16.getItem != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013c, code lost:
    
        if (r16.getNotifyChildrenChangedOptions != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0141, code lost:
    
        if ((!r16.search) == true) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0146, code lost:
    
        if (r16.getSessionToken != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014a, code lost:
    
        if (r16.sendCustomAction != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014e, code lost:
    
        if (r16.isConnected != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0150, code lost:
    
        r2 = r2 + 9;
        r0 = r2 % 128;
        com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.onError = r0;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015a, code lost:
    
        if (r16.getServiceComponent != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015e, code lost:
    
        if (r16.setCallbacksMessenger != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0162, code lost:
    
        if (r16.subscribe != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0164, code lost:
    
        r0 = r0 + 41;
        com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.MediaBrowserCompatCustomActionCallback = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016c, code lost:
    
        if ((r0 % 2) != 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016e, code lost:
    
        r2 = 69 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0174, code lost:
    
        if (r16.MediaBrowserCompatCallbackHandler == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0179, code lost:
    
        if (r16.MediaBrowserCompatCallbackHandler == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017e, code lost:
    
        r16.setInternalConnectionCallback.notifyTransactionFinished(new com.midtrans.sdk.corekit.models.snap.TransactionResult(true));
        finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x018b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018c, code lost:
    
        r0 = (com.midtrans.sdk.corekit.models.TransactionResponse) r19.getSerializableExtra("transaction_response");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0192, code lost:
    
        if (r0 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019c, code lost:
    
        if (r0.getStatusCode().equals(com.midtrans.sdk.corekit.core.Constants.STATUS_CODE_200) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019e, code lost:
    
        r16.setInternalConnectionCallback.notifyTransactionFinished(new com.midtrans.sdk.corekit.models.snap.TransactionResult(r0, null, "success"));
        r16.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b5, code lost:
    
        if (r0.getStatusCode().equals(com.midtrans.sdk.corekit.core.Constants.STATUS_CODE_201) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b7, code lost:
    
        r16.setInternalConnectionCallback.notifyTransactionFinished(new com.midtrans.sdk.corekit.models.snap.TransactionResult(r0, null, com.midtrans.sdk.corekit.models.snap.TransactionResult.STATUS_PENDING));
        r16.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c4, code lost:
    
        r16.setInternalConnectionCallback.notifyTransactionFinished(new com.midtrans.sdk.corekit.models.snap.TransactionResult(r0, null, com.midtrans.sdk.corekit.models.snap.TransactionResult.STATUS_FAILED));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ce, code lost:
    
        finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d8, code lost:
    
        if (r16.write.size() == 1) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01da, code lost:
    
        r0 = com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.MediaBrowserCompatCustomActionCallback;
        r2 = r0 + 113;
        com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.onError = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e4, code lost:
    
        if ((r2 % 2) != 0) goto L138;
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r17, int r18, android.content.Intent r19) {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    private void b() {
        int i = 2 % 2;
        int i2 = onError + 119;
        MediaBrowserCompatCustomActionCallback = i2 % 128;
        int i3 = i2 % 2;
        this.f852a.setVisibility(0);
        this.onConnectionSuspended = false;
        String string = UUID.randomUUID().toString();
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, getString(R.string.error_utilized_orderid));
            return;
        }
        String stringExtra = getIntent().getStringExtra("snap.token");
        if (!TextUtils.isEmpty(stringExtra)) {
            this.setInternalConnectionCallback.setAuthenticationToken(stringExtra);
            this.setInternalConnectionCallback.getTransactionOptions(stringExtra, new b());
            return;
        }
        TransactionRequest transactionRequest = this.setInternalConnectionCallback.getTransactionRequest();
        if (transactionRequest != null && transactionRequest.getCustomerDetails() != null) {
            CustomerDetails customerDetails = transactionRequest.getCustomerDetails();
            if (customerDetails.getCustomerIdentifier() != null) {
                int i4 = MediaBrowserCompatCustomActionCallback + 105;
                onError = i4 % 128;
                int i5 = i4 % 2;
                string = customerDetails.getCustomerIdentifier();
            }
        }
        this.setInternalConnectionCallback.checkout(string, new TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        int i6 = onError + 81;
        MediaBrowserCompatCustomActionCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    private static void l(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = MediaBrowserCompatConnectionCallbackConnectionCallbackInternal;
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int i7 = $10 + 107;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.green(0), 3291 - Color.green(0), 31 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1948206109, false, $$u(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i9++;
                    i4 = -1870535734;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = MediaBrowserCompatConnectionCallbackConnectionCallbackInternal;
        char c = '0';
        if (iArr5 != null) {
            int i10 = $11 + 51;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                Object[] objArr3 = new Object[i5];
                objArr3[i6] = Integer.valueOf(iArr5[i12]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", c, i6, i6));
                    int deadChar = KeyEvent.getDeadChar(i6, i6) + 3291;
                    int i13 = (CdmaCellLocation.convertQuartSecToDecDegrees(i6) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i6) == 0.0d ? 0 : -1)) + 31;
                    byte b4 = (byte) i6;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, deadChar, i13, 1948206109, false, $$u(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr6[i12] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i12++;
                c = '0';
                i5 = 1;
                i6 = 0;
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[i2] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i14 = 17;
            for (int i15 = 1; i14 > i15; i15 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i14];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ('0' - AndroidCharacter.getMirror('0')), Color.blue(0) + 2559, 29 - View.getDefaultSize(0, 0), 683220507, false, $$u(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i14--;
            }
            int i16 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28879), View.resolveSize(0, 0) + 348, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 26, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z) {
        int i = 2 % 2;
        if (!z) {
            this.INotificationSideChannelStub.setVisibility(0);
            this.asInterface.setVisibility(8);
            return;
        }
        int i2 = MediaBrowserCompatCustomActionCallback + 59;
        onError = i2 % 128;
        if (i2 % 2 != 0) {
            this.INotificationSideChannelStub.setVisibility(62);
            this.asInterface.setVisibility(1);
        } else {
            this.INotificationSideChannelStub.setVisibility(8);
            this.asInterface.setVisibility(0);
        }
        int i3 = onError + 57;
        MediaBrowserCompatCustomActionCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 3 / 0;
        }
    }

    private static List<String> TuitionPaymentFragmentspecialinlinedviewModeldefault2(List<EnabledPayment> list) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int i2 = MediaBrowserCompatCustomActionCallback + 115;
            onError = i2 % 128;
            if (i2 % 2 != 0) {
                list.isEmpty();
                throw null;
            }
            if (!list.isEmpty()) {
                Iterator<EnabledPayment> it = list.iterator();
                while (!(!it.hasNext())) {
                    int i3 = MediaBrowserCompatCustomActionCallback + 21;
                    onError = i3 % 128;
                    if (i3 % 2 != 0) {
                        arrayList.add(it.next().getType());
                        int i4 = 37 / 0;
                    } else {
                        arrayList.add(it.next().getType());
                    }
                }
            }
        }
        return arrayList;
    }

    private void TuitionPaymentFragmentbindingInflater1(PaymentMethodsModel paymentMethodsModel) {
        int i = 2 % 2;
        String name = paymentMethodsModel.getName();
        if (name.equalsIgnoreCase(getString(R.string.payment_method_credit_card))) {
            Intent intent = new Intent(this, (Class<?>) SavedCreditCardActivity.class);
            intent.putExtra("First Page", this.MediaBrowserCompatConnectionCallback);
            startActivityForResult(intent, Constants.RESULT_CODE_PAYMENT_TRANSFER);
            if (MidtransSDK.getInstance().getUIKitCustomSetting() == null || !MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation()) {
                return;
            }
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            return;
        }
        if (name.equalsIgnoreCase(getString(R.string.payment_method_bank_transfer))) {
            Intent intent2 = new Intent(this, (Class<?>) BankTransferListActivity.class);
            intent2.putExtra("extra.bank.list", new EnabledPayments(this.g));
            intent2.putExtra("First Page", this.MediaBrowserCompatConnectionCallback);
            startActivityForResult(intent2, Constants.RESULT_CODE_PAYMENT_TRANSFER);
            if (MidtransSDK.getInstance().getUIKitCustomSetting() == null || !MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation()) {
                return;
            }
            int i2 = onError + 47;
            MediaBrowserCompatCustomActionCallback = i2 % 128;
            if (i2 % 2 != 0) {
                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
                return;
            } else {
                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
                throw null;
            }
        }
        if (name.equalsIgnoreCase(getString(R.string.payment_method_uob))) {
            Intent intent3 = new Intent(this, (Class<?>) UobListActivity.class);
            intent3.putExtra("extra.uob.list", new EnabledPayments(this.INotificationSideChannel));
            intent3.putExtra("First Page", this.MediaBrowserCompatConnectionCallback);
            startActivityForResult(intent3, Constants.RESULT_CODE_PAYMENT_TRANSFER);
            if (MidtransSDK.getInstance().getUIKitCustomSetting() == null || !MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation()) {
                return;
            }
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            return;
        }
        if (name.equalsIgnoreCase(getString(R.string.payment_method_mandiri_clickpay))) {
            Intent intent4 = new Intent(this, (Class<?>) MandiriClickPayActivity.class);
            intent4.putExtra("First Page", this.MediaBrowserCompatConnectionCallback);
            startActivityForResult(intent4, Constants.RESULT_CODE_PAYMENT_TRANSFER);
            if (MidtransSDK.getInstance().getUIKitCustomSetting() == null || !MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation()) {
                return;
            }
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            return;
        }
        if (name.equalsIgnoreCase(getString(R.string.payment_method_bri_epay))) {
            Intent intent5 = new Intent(this, (Class<?>) BriEpayPaymentActivity.class);
            intent5.putExtra("First Page", this.MediaBrowserCompatConnectionCallback);
            startActivityForResult(intent5, Constants.RESULT_CODE_PAYMENT_TRANSFER);
            if (MidtransSDK.getInstance().getUIKitCustomSetting() == null || !MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation()) {
                return;
            }
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            return;
        }
        if (name.equalsIgnoreCase(getString(R.string.payment_method_cimb_clicks))) {
            Intent intent6 = new Intent(this, (Class<?>) CimbClickPaymentActivity.class);
            intent6.putExtra("First Page", this.MediaBrowserCompatConnectionCallback);
            startActivityForResult(intent6, Constants.RESULT_CODE_PAYMENT_TRANSFER);
            if (MidtransSDK.getInstance().getUIKitCustomSetting() == null || !MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation()) {
                return;
            }
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            return;
        }
        if (name.equalsIgnoreCase(getString(R.string.payment_method_mandiri_ecash))) {
            Intent intent7 = new Intent(this, (Class<?>) MandiriEcashPaymentActivity.class);
            intent7.putExtra("First Page", this.MediaBrowserCompatConnectionCallback);
            startActivityForResult(intent7, Constants.RESULT_CODE_PAYMENT_TRANSFER);
            if (MidtransSDK.getInstance().getUIKitCustomSetting() == null || !MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation()) {
                return;
            }
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            return;
        }
        if (name.equalsIgnoreCase(getString(R.string.payment_method_indosat_dompetku))) {
            Intent intent8 = new Intent(this, (Class<?>) IndosatDompetkuPaymentActivity.class);
            intent8.putExtra("First Page", this.MediaBrowserCompatConnectionCallback);
            startActivityForResult(intent8, Constants.RESULT_CODE_PAYMENT_TRANSFER);
            if (MidtransSDK.getInstance().getUIKitCustomSetting() != null) {
                int i3 = onError + 29;
                MediaBrowserCompatCustomActionCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 19 / 0;
                    if (!MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation()) {
                        return;
                    }
                } else if (!MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation()) {
                    return;
                }
                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
                return;
            }
            return;
        }
        if (name.equalsIgnoreCase(getString(R.string.payment_method_indomaret))) {
            Intent intent9 = new Intent(this, (Class<?>) IndomaretPaymentActivity.class);
            intent9.putExtra("First Page", this.MediaBrowserCompatConnectionCallback);
            startActivityForResult(intent9, Constants.RESULT_CODE_PAYMENT_TRANSFER);
            if (MidtransSDK.getInstance().getUIKitCustomSetting() != null) {
                int i5 = MediaBrowserCompatCustomActionCallback + 97;
                onError = i5 % 128;
                int i6 = i5 % 2;
                if (MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation()) {
                    overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
                    return;
                }
                return;
            }
            return;
        }
        if (name.equalsIgnoreCase(getString(R.string.payment_method_bca_klikpay))) {
            Intent intent10 = new Intent(this, (Class<?>) BcaKlikPayPaymentActivity.class);
            intent10.putExtra("First Page", this.MediaBrowserCompatConnectionCallback);
            startActivityForResult(intent10, Constants.RESULT_CODE_PAYMENT_TRANSFER);
            if (MidtransSDK.getInstance().getUIKitCustomSetting() == null || !MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation()) {
                return;
            }
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            return;
        }
        if (name.equalsIgnoreCase(getString(R.string.payment_method_klik_bca))) {
            Intent intent11 = new Intent(this, (Class<?>) KlikBcaPaymentActivity.class);
            intent11.putExtra("First Page", this.MediaBrowserCompatConnectionCallback);
            intent11.putExtra(getString(R.string.position), 11);
            startActivityForResult(intent11, Constants.RESULT_CODE_PAYMENT_TRANSFER);
            if (MidtransSDK.getInstance().getUIKitCustomSetting() != null) {
                int i7 = MediaBrowserCompatCustomActionCallback + 99;
                onError = i7 % 128;
                int i8 = i7 % 2;
                if (MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation()) {
                    overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
                    return;
                }
                return;
            }
            return;
        }
        if (name.equalsIgnoreCase(getString(R.string.payment_method_telkomsel_cash))) {
            Intent intent12 = new Intent(this, (Class<?>) TelkomselCashPaymentActivity.class);
            intent12.putExtra("First Page", this.MediaBrowserCompatConnectionCallback);
            startActivityForResult(intent12, Constants.RESULT_CODE_PAYMENT_TRANSFER);
            if (MidtransSDK.getInstance().getUIKitCustomSetting() == null || !MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation()) {
                return;
            }
            int i9 = onError + 87;
            MediaBrowserCompatCustomActionCallback = i9 % 128;
            if (i9 % 2 != 0) {
                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
                return;
            } else {
                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
                throw null;
            }
        }
        if (name.equalsIgnoreCase(getString(R.string.payment_method_xl_tunai))) {
            Intent intent13 = new Intent(this, (Class<?>) XlTunaiPaymentActivity.class);
            intent13.putExtra("First Page", this.MediaBrowserCompatConnectionCallback);
            startActivityForResult(intent13, Constants.RESULT_CODE_PAYMENT_TRANSFER);
            if (MidtransSDK.getInstance().getUIKitCustomSetting() == null || !MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation()) {
                return;
            }
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            return;
        }
        if (name.equalsIgnoreCase(getString(R.string.payment_method_kioson))) {
            Intent intent14 = new Intent(this, (Class<?>) KiosonPaymentActivity.class);
            intent14.putExtra("First Page", this.MediaBrowserCompatConnectionCallback);
            startActivityForResult(intent14, Constants.RESULT_CODE_PAYMENT_TRANSFER);
            if (MidtransSDK.getInstance().getUIKitCustomSetting() == null || !MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation()) {
                return;
            }
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            return;
        }
        if (name.equalsIgnoreCase(getString(R.string.payment_method_gci))) {
            Intent intent15 = new Intent(this, (Class<?>) GciPaymentActivity.class);
            intent15.putExtra("First Page", this.MediaBrowserCompatConnectionCallback);
            startActivityForResult(intent15, Constants.RESULT_CODE_PAYMENT_TRANSFER);
            if (MidtransSDK.getInstance().getUIKitCustomSetting() == null || !MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation()) {
                return;
            }
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            return;
        }
        if (name.equalsIgnoreCase(getString(R.string.payment_method_gopay)) || name.equalsIgnoreCase(getString(R.string.payment_method_gopay_qris))) {
            startActivityForResult(new Intent(this, (Class<?>) GoPayPaymentActivity.class), Constants.RESULT_CODE_PAYMENT_TRANSFER);
            if (MidtransSDK.getInstance().getUIKitCustomSetting() != null) {
                int i10 = MediaBrowserCompatCustomActionCallback + 117;
                onError = i10 % 128;
                int i11 = i10 % 2;
                if (MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation()) {
                    overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
                    return;
                }
                return;
            }
            return;
        }
        if (name.equalsIgnoreCase(getString(R.string.payment_method_shopeepay_deeplink)) || !(!name.equalsIgnoreCase(getString(R.string.payment_method_shopeepay_qris)))) {
            startActivityForResult(new Intent(this, (Class<?>) ShopeePayPaymentActivity.class), Constants.RESULT_CODE_PAYMENT_TRANSFER);
            if (MidtransSDK.getInstance().getUIKitCustomSetting() != null) {
                int i12 = onError + 109;
                MediaBrowserCompatCustomActionCallback = i12 % 128;
                int i13 = i12 % 2;
                if (MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation()) {
                    int i14 = onError + 89;
                    MediaBrowserCompatCustomActionCallback = i14 % 128;
                    int i15 = i14 % 2;
                    overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
                    return;
                }
                return;
            }
            return;
        }
        if (name.equalsIgnoreCase(getString(R.string.payment_method_danamon_online))) {
            Intent intent16 = new Intent(this, (Class<?>) DanamonOnlineActivity.class);
            intent16.putExtra("First Page", this.MediaBrowserCompatConnectionCallback);
            startActivityForResult(intent16, Constants.RESULT_CODE_PAYMENT_TRANSFER);
            if (MidtransSDK.getInstance().getUIKitCustomSetting() == null || !MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation()) {
                return;
            }
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            return;
        }
        if (name.equalsIgnoreCase(getString(R.string.payment_method_akulaku))) {
            Intent intent17 = new Intent(this, (Class<?>) AkulakuActivity.class);
            intent17.putExtra("First Page", this.MediaBrowserCompatConnectionCallback);
            startActivityForResult(intent17, Constants.RESULT_CODE_PAYMENT_TRANSFER);
            if (MidtransSDK.getInstance().getUIKitCustomSetting() != null) {
                int i16 = MediaBrowserCompatCustomActionCallback + 125;
                onError = i16 % 128;
                int i17 = i16 % 2;
                if (MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation()) {
                    overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
                    return;
                }
                return;
            }
            return;
        }
        if (!name.equalsIgnoreCase(getString(R.string.payment_method_alfamart))) {
            Toast.makeText(getApplicationContext(), "This feature is not implemented yet.", 0).show();
            return;
        }
        Intent intent18 = new Intent(this, (Class<?>) AlfamartPaymentActivity.class);
        intent18.putExtra("First Page", this.MediaBrowserCompatConnectionCallback);
        startActivityForResult(intent18, Constants.RESULT_CODE_PAYMENT_TRANSFER);
        if (MidtransSDK.getInstance().getUIKitCustomSetting() != null) {
            int i18 = MediaBrowserCompatCustomActionCallback + 29;
            onError = i18 % 128;
            int i19 = i18 % 2;
            if (!(!MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation())) {
                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            }
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionCallback + 125;
        onError = i2 % 128;
        int i3 = i2 % 2;
        if (isFinishing()) {
            return;
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this).setMessage(str).setNegativeButton(R.string.btn_cancel, new asInterface()).create();
        this.cancelAll = alertDialogCreate;
        alertDialogCreate.show();
        int i4 = onError + 67;
        MediaBrowserCompatCustomActionCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.midtrans.sdk.uikit.activities.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrB$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 29944);
            int iMyPid = 1755 - (Process.myPid() >> 22);
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23;
            byte[] bArr = $$g;
            byte b2 = bArr[24];
            Object[] objArr2 = new Object[1];
            k(b2, (byte) (b2 | 37), bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, iMyPid, scrollBarFadeDuration, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i3 = MediaBrowserCompatCustomActionCallback + 33;
            onError = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 29944);
                int i5 = 1755 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iAlpha = 23 - Color.alpha(0);
                byte[] bArr2 = $$g;
                byte b3 = bArr2[24];
                Object[] objArr3 = new Object[1];
                k(b3, (byte) (b3 | 52), (short) (-bArr2[57]), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(deadChar, i5, iAlpha, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i6 = ((int[]) objArr4[0])[0];
            objArrB$7879113 = new Object[]{new int[]{i6}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i8 = (((((~(121129212 | i7)) | (-349970379)) * 398) - 666688431) + (((~((~i7) | 121129212)) | (-349970379)) * 398)) - 37686803;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            l(new int[]{-2094371642, 1471651874, 309646420, -520261936, 1451268386, -1447482318, -908041257, 819393877, 1272057550, -866072613}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            l(new int[]{-1080709628, -1072232605, 1712397708, -675535615, 1073423568, -486526124, 1352718791, -970859869, 1017400917, -65691585}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_no_shopee_message).substring(3, 4).length() + 15, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {941881028};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 42048), 1726 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 28 - Process.getGidForName(""), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -37686803, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cAlpha = (char) (Color.alpha(0) + 29944);
                    int iIndexOf = 1755 - TextUtils.indexOf("", "", 0, 0);
                    int mode = 23 - View.MeasureSpec.getMode(0);
                    byte[] bArr3 = $$g;
                    byte b4 = bArr3[24];
                    Object[] objArr8 = new Object[1];
                    k(b4, (byte) (b4 | 52), (short) (-bArr3[57]), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAlpha, iIndexOf, mode, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    l(new int[]{-593168669, 284236107, 1530309569, -1763448987, 27623745, 1825521161, 439113251, -1737957242, 1749736025, -145094813, -399524477, 314235709, 1532940762, -1141292629}, 22 - (ViewConfiguration.getTapTimeout() >> 16), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    l(new int[]{837936289, -1816032443, 262684268, 1710800456, 59499737, -491398308, -184437398, -1107031018, -225745297, -895806026}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_null_json_response_from_server).substring(0, 40).codePointAt(24) - 17, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 29944);
                        int offsetAfter = 1755 - TextUtils.getOffsetAfter("", 0);
                        int doubleTapTimeout = 23 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte b5 = $$g[24];
                        Object[] objArr11 = new Object[1];
                        k(b5, (byte) (b5 | 52), (short) 106, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, offsetAfter, doubleTapTimeout, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cArgb = (char) (29944 - Color.argb(0, 0, 0, 0));
                        int bitsPerPixel = 1754 - ImageFormat.getBitsPerPixel(0);
                        int iRed = 23 - Color.red(0);
                        byte[] bArr4 = $$g;
                        byte b6 = bArr4[24];
                        Object[] objArr12 = new Object[1];
                        k(b6, (byte) (b6 | 37), bArr4[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cArgb, bitsPerPixel, iRed, 986134021, false, (String) objArr12[0], null);
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
        int i11 = ((int[]) objArrB$7879113[1])[0];
        int i12 = ((int[]) objArrB$7879113[0])[0];
        if (i12 != i11) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$7879113[4];
            if (strArr != null) {
                while (i2 < strArr.length) {
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i12));
        }
        int i13 = ((int[]) objArrB$7879113[3])[0];
        int i14 = ((int[]) objArrB$7879113[0])[0];
        Object[] objArr13 = {new int[]{i14}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int i15 = (int) Runtime.getRuntime().totalMemory();
        int i16 = ~i15;
        int i17 = i13 + 2109908025 + (((~(292648940 | i16)) | (-528349167)) * 98) + (((~(i16 | (-505251367))) | 292648940 | (~(505251366 | i15))) * (-49)) + (((~(i15 | 292648940)) | 23097800) * 49);
        int i18 = (i17 << 13) ^ i17;
        int i19 = i18 ^ (i18 >>> 17);
        ((int[]) objArr13[3])[0] = i19 ^ (i19 << 5);
        int i20 = onError + 57;
        MediaBrowserCompatCustomActionCallback = i20 % 128;
        int i21 = i20 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int offsetBefore2 = 1031 - TextUtils.getOffsetBefore("", 0);
            int iArgb = 15 - Color.argb(0, 0, 0, 0);
            byte b7 = $$g[24];
            Object[] objArr14 = new Object[1];
            k(b7, (byte) (b7 | 52), (short) 158, objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(longPressTimeout, offsetBefore2, iArgb, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        l(new int[]{-593168669, 284236107, 1530309569, -1763448987, 27623745, 1825521161, 439113251, -1737957242, 1749736025, -145094813, -399524477, 314235709, 1532940762, -1141292629}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        l(new int[]{837936289, -1816032443, 262684268, 1710800456, 59499737, -491398308, -184437398, -1107031018, -225745297, -895806026}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellTargetedBrandTitle).substring(0, 14).length() + 1, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
            int iResolveSizeAndState = 1031 - View.resolveSizeAndState(0, 0, 0);
            int bitsPerPixel2 = 14 - ImageFormat.getBitsPerPixel(0);
            byte[] bArr5 = $$g;
            byte b8 = bArr5[24];
            Object[] objArr17 = new Object[1];
            k(b8, (byte) (b8 | 52), (short) (-bArr5[57]), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(deadChar2, iResolveSizeAndState, bitsPerPixel2, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                int i22 = 1032 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int iIndexOf2 = 15 - TextUtils.indexOf("", "");
                byte[] bArr6 = $$g;
                Object[] objArr18 = new Object[1];
                k((byte) (bArr6[12] + 1), bArr6[24], (short) $$h, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(packedPositionChild, i22, iIndexOf2, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i23 = ((int[]) objArr19[3])[0];
            int i24 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int i25 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i26 = ((((-802910953) + (((~((~i25) | (-558629378))) | (~((-140587) | i25))) * (-302))) + ((~((-558629378) | i25)) * (-604))) + (((~(i25 | (-558769964))) | (-803190720)) * 302)) - 2052191720;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr[2])[0] = i28 ^ (i28 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            l(new int[]{-2094371642, 1471651874, 309646420, -520261936, 1451268386, -1447482318, -908041257, 819393877, 1272057550, -866072613}, 16 - Drawable.resolveOpacity(0, 0), objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            l(new int[]{-1080709628, -1072232605, 1712397708, -675535615, 1073423568, -486526124, 1352718791, -970859869, 1017400917, -65691585}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {941881028};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 46039), 1134 - Gravity.getAbsoluteGravity(0, 0), 19 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -2052191720, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int i29 = 1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int jumpTapTimeout = 15 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                byte b9 = $$g[24];
                Object[] objArr24 = new Object[1];
                k(b9, (byte) (b9 | 52), (short) 158, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(windowTouchSlop, i29, jumpTapTimeout, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.getOffsetAfter("", 0) + 45993), ImageFormat.getBitsPerPixel(0) + 1118, ImageFormat.getBitsPerPixel(0) + 18), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                int iMyPid2 = 1031 - (Process.myPid() >> 22);
                int i30 = 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr7 = $$g;
                Object[] objArr25 = new Object[1];
                k((byte) (bArr7[12] + 1), bArr7[24], (short) $$h, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(capsMode, iMyPid2, i30, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                l(new int[]{-593168669, 284236107, 1530309569, -1763448987, 27623745, 1825521161, 439113251, -1737957242, 1749736025, -145094813, -399524477, 314235709, 1532940762, -1141292629}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                l(new int[]{837936289, -1816032443, 262684268, 1710800456, 59499737, -491398308, -184437398, -1107031018, -225745297, -895806026}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_failed).substring(0, 1).length() + 14, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    int mirror = AndroidCharacter.getMirror('0') + 983;
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15;
                    byte[] bArr8 = $$g;
                    byte b10 = bArr8[24];
                    Object[] objArr28 = new Object[1];
                    k(b10, (byte) (b10 | 52), (short) (-bArr8[57]), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c, mirror, maximumFlingVelocity, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1031;
                    int iBlue = 15 - Color.blue(0);
                    byte b11 = $$g[24];
                    Object[] objArr29 = new Object[1];
                    k(b11, (byte) (b11 | 52), (short) 158, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf2, minimumFlingVelocity, iBlue, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i31 = MediaBrowserCompatCustomActionCallback + 83;
                onError = i31 % 128;
                int i32 = i31 % 2;
                while (i2 < strArr3.length) {
                    arrayList2.add(strArr3[i2]);
                    i2++;
                }
            }
            throw null;
        }
        Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i33 = ((int[]) objArr[2])[0];
        int i34 = ((int[]) objArr[3])[0];
        int i35 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.ef_content_desc_folder).substring(0, 6).codePointAt(4) + 925407480;
        int i36 = ~(335543546 | iCodePointAt);
        int i37 = i33 + (-982151651) + ((4755456 | i36) * (-476)) + (i36 * 952) + ((~((~iCodePointAt) | 335543546)) * 476);
        int i38 = (i37 << 13) ^ i37;
        int i39 = i38 ^ (i38 >>> 17);
        ((int[]) objArr30[2])[0] = i39 ^ (i39 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1867204690
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.midtrans.sdk.uikit.activities.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.MediaBrowserCompatCustomActionCallback
            int r1 = r1 + 45
            int r2 = r1 % 128
            com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.onError = r2
            int r1 = r1 % r0
            java.lang.reflect.Member[] r1 = defpackage.calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1
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
            r5 = -536887953(0xffffffffdfffbd6f, float:-3.6856015E19)
            r5 = r5 | r4
            int r5 = r5 * (-627)
            r6 = -1541134816(0xffffffffa4242620, float:-3.5594124E-17)
            int r6 = r6 + r5
            r5 = 1686266547(0x648262b3, float:1.924151E22)
            r5 = r5 | r4
            int r5 = ~r5
            r7 = 856279004(0x3309c7dc, float:3.207957E-8)
            r5 = r5 | r7
            int r5 = r5 * (-627)
            int r6 = r6 + r5
            int r5 = ~r4
            r8 = -1686266548(0xffffffff9b7d9d4c, float:-2.0978495E-22)
            r5 = r5 | r8
            int r5 = ~r5
            r4 = r4 | r7
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = r4 * 627
            int r6 = r6 + r4
            if (r1 != r6) goto Lbb
            java.lang.reflect.Member[] r1 = defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            long r4 = android.os.SystemClock.uptimeMillis()
            int r2 = (int) r4
            r4 = 1791879117(0x6acde7cd, float:1.2446222E26)
            r4 = r4 | r2
            int r4 = ~r4
            r5 = 69343234(0x4221802, float:1.9054032E-36)
            r4 = r4 | r5
            int r4 = r4 * (-140)
            r5 = 969373800(0x39c77868, float:3.8045947E-4)
            int r5 = r5 + r4
            r4 = 1861222351(0x6eefffcf, float:3.7138085E28)
            r4 = r4 | r2
            int r4 = ~r4
            int r4 = r4 * 70
            int r5 = r5 + r4
            r4 = 787176847(0x2eeb5d8f, float:1.0703182E-10)
            r2 = r2 | r4
            int r2 = ~r2
            r4 = 1143388738(0x4426ba42, float:666.9103)
            r2 = r2 | r4
            int r2 = r2 * 70
            int r5 = r5 + r2
            if (r1 == r5) goto Lb7
            r1 = -1867204690(0xffffffff90b4b7ae, float:-7.1280485E-29)
            int[] r1 = new int[r1]
            r2 = -1867204691(0xffffffff90b4b7ad, float:-7.128048E-29)
            r4 = 1
            r1[r2] = r4
            r2 = -3833194(0xffffffffffc58296, float:NaN)
            int r2 = r2 % r0
            r2 = -1
            r1 = r1[r2]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r4)
            r1.show()
            int r1 = com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.onError
            int r1 = r1 + 73
            int r2 = r1 % 128
            com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.MediaBrowserCompatCustomActionCallback = r2
            int r1 = r1 % r0
            if (r1 != 0) goto Lb7
            int r0 = r0 / 5
        Lb7:
            super.onResume()
            return
        Lbb:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.onResume():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00bb, code lost:
    
        if (r1 != ((((-923635948) + (((~((~r2) | (-2020925746))) | 541351969) * 446)) + (((~(r2 | (-1479573777))) | 16778250) * 446)) + 924809598)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00bd, code lost:
    
        super.onStart();
        r1 = com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.onError + 93;
        com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.MediaBrowserCompatCustomActionCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ca, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00cb, code lost:
    
        r1 = 1235050974 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d4, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003d, code lost:
    
        if (r1 == (((959287048 + ((~((~r4) | (-1107894569))) * (-116))) + ((817028823 | r4) * 116)) + (((~(r4 | 1647016366)) | 277907025) * 116))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008a, code lost:
    
        if (r1 == ((((-1459180216) + (((~((-1420418718) | r5)) | 2179716) * 184)) + ((r4 | (-2008670176)) * (-184))) + ((~((-590431175) | r5)) * 184))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008c, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        r2 = (int) android.os.SystemClock.elapsedRealtime();
     */
    @Override // com.midtrans.sdk.uikit.activities.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStart() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.onStart():void");
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(PaymentMethodsActivity paymentMethodsActivity, List list) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 384734716, DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{paymentMethodsActivity, list}, -384734712);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(PaymentMethodsActivity paymentMethodsActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 925498631, DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{paymentMethodsActivity}, -925498628);
    }

    public static /* synthetic */ ImageView TuitionPaymentFragmentspecialinlinedviewModeldefault2(PaymentMethodsActivity paymentMethodsActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (ImageView) TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 661629429, DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{paymentMethodsActivity}, -661629429);
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (String) TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1080889820, DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[0], 1080889821);
    }

    public static /* synthetic */ void a(PaymentMethodsActivity paymentMethodsActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1331924945, DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{paymentMethodsActivity}, -1331924943);
    }

    @Override // com.midtrans.sdk.uikit.activities.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = onError + 93;
        MediaBrowserCompatCustomActionCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$u(byte r6, short r7, int r8) {
        /*
            int r8 = r8 * 56
            int r8 = r8 + 66
            int r7 = r7 * 2
            int r0 = 1 - r7
            byte[] r1 = com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.$$s
            int r6 = r6 * 2
            int r6 = 3 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2d
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            r3 = r1[r6]
            r5 = r3
            r3 = r8
            r8 = r5
        L2d:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.activities.PaymentMethodsActivity.$$u(byte, short, int):java.lang.String");
    }
}
