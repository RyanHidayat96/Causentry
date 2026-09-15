package com.midtrans.sdk.uikit.views.creditcard.details;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda16;
import com.bpjstku.data.syariah.model.response.SyariahFaqResponse;
import com.bpjstku.util.custom.WrapContentLinearLayoutManager;
import com.google.android.gms.internal.measurement.zzdm;
import com.google.android.material.timepicker.TimeModel;
import com.midtrans.sdk.analytics.MixpanelAnalyticsManager;
import com.midtrans.sdk.corekit.callback.BanksPointCallback;
import com.midtrans.sdk.corekit.callback.GetTransactionStatusCallback;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.core.UIKitCustomSetting;
import com.midtrans.sdk.corekit.models.BankType;
import com.midtrans.sdk.corekit.models.CustomerDetails;
import com.midtrans.sdk.corekit.models.PaymentDetails;
import com.midtrans.sdk.corekit.models.SaveCardRequest;
import com.midtrans.sdk.corekit.models.TokenDetailsResponse;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.corekit.models.promo.Promo;
import com.midtrans.sdk.corekit.models.snap.BanksPointResponse;
import com.midtrans.sdk.corekit.models.snap.SavedToken;
import com.midtrans.sdk.corekit.models.snap.Transaction;
import com.midtrans.sdk.corekit.models.snap.TransactionDetails;
import com.midtrans.sdk.corekit.models.snap.TransactionResult;
import com.midtrans.sdk.corekit.models.snap.TransactionStatusResponse;
import com.midtrans.sdk.corekit.utilities.Utils;
import com.midtrans.sdk.uikit.abstracts.BaseActivity;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.scancard.ExternalScanner;
import com.midtrans.sdk.uikit.scancard.ScannerModel;
import com.midtrans.sdk.uikit.views.creditcard.bankpoints.BankPointsActivity;
import com.midtrans.sdk.uikit.views.creditcard.tnc.TermsAndConditionsActivity;
import com.midtrans.sdk.uikit.views.status.PaymentStatusActivity;
import com.midtrans.sdk.uikit.views.webview.WebViewPaymentActivity;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import com.midtrans.sdk.uikit.widgets.SemiBoldTextView;
import defpackage.MediaBrowserCompatCallbackHandler;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.ViewPortBuilder;
import defpackage.abortCapture;
import defpackage.cacheInteropConfig;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.computeAreaOverlapping;
import defpackage.createPipelineAndUpdateChildrenSpecs;
import defpackage.filterResolutionsByAspectRatio;
import defpackage.findCloserAspectRatio;
import defpackage.generateCameraId;
import defpackage.getConfigs;
import defpackage.getFallbackAspectRatio;
import defpackage.getMergedResolutions;
import defpackage.handleMessage;
import defpackage.initSession;
import defpackage.onConnectionFailed;
import defpackage.toRational;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes4.dex */
public class CreditCardDetailsActivity extends BasePaymentActivity implements getMergedResolutions {
    private static final String d = "CreditCardDetailsActivity";
    private ImageButton INotificationSideChannel;
    private FancyButton INotificationSideChannelDefault;
    private FancyButton INotificationSideChannelStub;
    private ImageButton INotificationSideChannelStubProxy;
    private LinearLayout IconCompatParcelizer;
    private ImageView MediaBrowserCompat;
    private createPipelineAndUpdateChildrenSpecs MediaBrowserCompatCallbackHandler;
    private TextView MediaBrowserCompatConnectionCallback;
    private DefaultTextView MediaBrowserCompatConnectionCallbackConnectionCallbackInternal;
    private DefaultTextView MediaBrowserCompatConnectionCallbackStubApi21;
    private DefaultTextView MediaBrowserCompatCustomActionCallback;
    private TextView MediaBrowserCompatCustomActionResultReceiver;
    private DefaultTextView MediaBrowserCompatItemCallback;
    private TextView MediaBrowserCompatItemReceiver;
    private ImageButton RemoteActionCompatParcelizer;
    private FancyButton cancel;
    private FancyButton cancelAll;
    private AppCompatCheckBox connect;
    private LinearLayout disconnect;
    private RelativeLayout getExtras;
    private FancyButton getInterfaceDescriptor;
    private AppCompatEditText getItem;
    private AppCompatEditText getNotifyChildrenChangedOptions;
    private AppCompatEditText getRoot;
    private ImageView getServiceComponent;
    private AppCompatEditText getSessionToken;
    private AppCompatEditText isConnected;
    private SaveCardRequest onConnected;
    private TextView onConnectionFailed;
    private TextView onError;
    private TextView onItemLoaded;
    private DefaultTextView onProgressUpdate;
    private SemiBoldTextView onReceiveResult;
    private DefaultTextView onResult;
    private RelativeLayout read;
    private ImageView search;
    private toRational setCallbacksMessenger;
    private TextView setInternalConnectionCallback;
    private RecyclerView unsubscribe;
    private AppCompatCheckBox write;
    private static final byte[] $$u = {48, -119, -71, 110};
    private static final int $$v = 253;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {49, -45, -112, 57, 3, -26, 36, -54, -4, -5, -13, -20, -17, 4, -24, 37, -56, -17, -4, -1, -26, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$n = 96;
    private static final byte[] $$j = {14, 116, 92, -78, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
    private static final int $$k = 42;
    private static int onLoadChildren = 0;
    private static int MediaBrowserCompatItemCallbackStubApi23 = 1;
    private static long MediaBrowserCompatMediaBrowserImpl = 7865363830610873810L;
    private final String onTransact = "CC Card Details";
    private final String g = "Confirm Payment Credit Card";
    private final String asInterface = "Retry Credit Card";
    private String handleMessage = "";
    private String onConnectionSuspended = null;
    private float subscribe = 0.0f;
    private int notify = 0;
    private boolean sendCustomAction = false;

    /* JADX INFO: renamed from: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public AnonymousClass2(String str, boolean z) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList<Promo> arrayList;
            createPipelineAndUpdateChildrenSpecs createpipelineandupdatechildrenspecsCancelAll = CreditCardDetailsActivity.cancelAll(CreditCardDetailsActivity.this);
            toRational torationalTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CreditCardDetailsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CreditCardDetailsActivity.this);
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            List<Promo> list = torationalTuitionPaymentFragmentspecialinlinedviewModeldefault1.cancel;
            if (list == null || list.isEmpty()) {
                arrayList = null;
            } else {
                List<Promo> list2 = torationalTuitionPaymentFragmentspecialinlinedviewModeldefault1.cancel;
                arrayList = new ArrayList();
                for (Promo promo : list2) {
                    if (promo.getPaymentTypes() != null && promo.getPaymentTypes().contains("credit_card")) {
                        if (TextUtils.isEmpty(str)) {
                            arrayList.add(promo);
                        } else if (promo.getBins() == null || promo.getBins().isEmpty()) {
                            arrayList.add(promo);
                        } else {
                            Iterator<String> it = promo.getBins().iterator();
                            while (it.hasNext()) {
                                if (str.startsWith(it.next())) {
                                    arrayList.add(promo);
                                } else if (promo.isSelected()) {
                                    promo.setSelected(false);
                                    ((getMergedResolutions) torationalTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(promo);
                                }
                            }
                        }
                    }
                }
                if (arrayList.size() == 1 && z) {
                    list2.get(0).setSelected(true);
                } else if (arrayList.isEmpty() && !z) {
                    for (Promo promo2 : torationalTuitionPaymentFragmentspecialinlinedviewModeldefault1.cancel) {
                        if (promo2.isSelected()) {
                            promo2.setSelected(false);
                        }
                    }
                }
            }
            if (arrayList == null || createpipelineandupdatechildrenspecsCancelAll.b == null) {
                return;
            }
            if (!arrayList.isEmpty()) {
                for (Promo promo3 : arrayList) {
                    if (promo3.isSelected()) {
                        createpipelineandupdatechildrenspecsCancelAll.b.TuitionPaymentFragmentbindingInflater1(promo3);
                        break;
                    }
                }
            } else {
                createpipelineandupdatechildrenspecsCancelAll.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
            createpipelineandupdatechildrenspecsCancelAll.TuitionPaymentFragmentbindingInflater1 = arrayList;
            createpipelineandupdatechildrenspecsCancelAll.notifyDataSetChanged();
        }
    }

    private static /* synthetic */ Object INotificationSideChannel(Object[] objArr) {
        CreditCardDetailsActivity creditCardDetailsActivity = (CreditCardDetailsActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onLoadChildren + 81;
        MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
        int i3 = i2 % 2;
        AppCompatCheckBox appCompatCheckBox = creditCardDetailsActivity.connect;
        if (i3 != 0) {
            return appCompatCheckBox;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void INotificationSideChannel(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        if (!((filterResolutionsByAspectRatio) creditCardDetailsActivity.setCallbacksMessenger).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(creditCardDetailsActivity.getItem())) {
            creditCardDetailsActivity.onResult.setVisibility(8);
            int i2 = onLoadChildren + 73;
            MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = onLoadChildren + 71;
        MediaBrowserCompatItemCallbackStubApi23 = i4 % 128;
        if (i4 % 2 == 0) {
            creditCardDetailsActivity.onResult.setVisibility(0);
        } else {
            creditCardDetailsActivity.onResult.setVisibility(0);
        }
    }

    public static /* synthetic */ boolean INotificationSideChannelDefault(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 105;
        onLoadChildren = i2 % 128;
        int i3 = i2 % 2;
        boolean zINotificationSideChannelDefault = creditCardDetailsActivity.INotificationSideChannelDefault();
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        int i5 = MediaBrowserCompatItemCallbackStubApi23 + 15;
        onLoadChildren = i5 % 128;
        int i6 = i5 % 2;
        return zINotificationSideChannelDefault;
    }

    public static /* synthetic */ AppCompatEditText INotificationSideChannelStub(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23;
        int i3 = i2 + 79;
        onLoadChildren = i3 % 128;
        int i4 = i3 % 2;
        AppCompatEditText appCompatEditText = creditCardDetailsActivity.getRoot;
        if (i4 != 0) {
            int i5 = 70 / 0;
        }
        int i6 = i2 + 101;
        onLoadChildren = i6 % 128;
        int i7 = i6 % 2;
        return appCompatEditText;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0035  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r6 == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ boolean INotificationSideChannelStubProxy(com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r6.sendCustomAction
            r2 = 1
            if (r1 == 0) goto L71
            toRational r1 = r6.setCallbacksMessenger
            androidx.appcompat.widget.AppCompatEditText r1 = r6.getSessionToken
            android.text.Editable r1 = r1.getEditableText()
            java.lang.String r1 = r1.toString()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            r4 = 0
            if (r3 != 0) goto L35
            int r3 = com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.onLoadChildren
            int r3 = r3 + 15
            int r5 = r3 % 128
            com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.MediaBrowserCompatItemCallbackStubApi23 = r5
            int r3 = r3 % r0
            boolean r1 = defpackage.onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r1)
            if (r1 != 0) goto L35
            int r1 = com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.onLoadChildren
            int r1 = r1 + 31
            int r3 = r1 % 128
            com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.MediaBrowserCompatItemCallbackStubApi23 = r3
            int r1 = r1 % r0
            r1 = r4
            goto L36
        L35:
            r1 = r2
        L36:
            androidx.appcompat.widget.AppCompatEditText r6 = r6.isConnected
            android.text.Editable r6 = r6.getEditableText()
            java.lang.String r6 = r6.toString()
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 != 0) goto L58
            int r6 = r6.length()
            r3 = 5
            if (r6 > r3) goto L58
            int r6 = com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.onLoadChildren
            int r6 = r6 + 117
            int r3 = r6 % 128
            com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.MediaBrowserCompatItemCallbackStubApi23 = r3
            int r6 = r6 % r0
            r6 = r4
            goto L59
        L58:
            r6 = r2
        L59:
            if (r1 == r2) goto L5c
            goto L67
        L5c:
            int r1 = com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.onLoadChildren
            int r1 = r1 + 67
            int r3 = r1 % 128
            com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.MediaBrowserCompatItemCallbackStubApi23 = r3
            int r1 = r1 % r0
            if (r6 != 0) goto L71
        L67:
            int r6 = com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.onLoadChildren
            int r6 = r6 + 91
            int r1 = r6 % 128
            com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.MediaBrowserCompatItemCallbackStubApi23 = r1
            int r6 = r6 % r0
            return r4
        L71:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.INotificationSideChannelStubProxy(com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        r1 = ((defpackage.filterResolutionsByAspectRatio) r5.setCallbacksMessenger).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
    
        if (r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        if (r1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isRequired() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r1.b == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        android.widget.Toast.makeText(r5, r5.getString(com.bpjstku.R.string.installment_required), 0).show();
        r5 = com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.onLoadChildren + 99;
        com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.MediaBrowserCompatItemCallbackStubApi23 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if ((r5 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        r5 = 25 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (((defpackage.filterResolutionsByAspectRatio) r5.setCallbacksMessenger).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r5.getItem()) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if ((!((defpackage.filterResolutionsByAspectRatio) r5.setCallbacksMessenger).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r5.getItem())) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        android.widget.Toast.makeText(r5, r5.getString(com.bpjstku.R.string.offer_not_applied), 0).show();
        r5 = com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.onLoadChildren + 33;
        com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.MediaBrowserCompatItemCallbackStubApi23 = r5 % 128;
        r5 = r5 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ boolean MediaBrowserCompat(com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.onLoadChildren
            int r1 = r1 + 49
            int r2 = r1 % 128
            com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.MediaBrowserCompatItemCallbackStubApi23 = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L22
            java.lang.String r1 = r5.getItem()
            toRational r4 = r5.setCallbacksMessenger
            getFallbackAspectRatio r4 = r4.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            boolean r1 = r4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r1)
            r4 = 48
            int r4 = r4 / r3
            if (r1 == 0) goto L49
            goto L31
        L22:
            java.lang.String r1 = r5.getItem()
            toRational r4 = r5.setCallbacksMessenger
            getFallbackAspectRatio r4 = r4.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            boolean r1 = r4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r1)
            r1 = r1 ^ r2
            if (r1 == r2) goto L49
        L31:
            r1 = 2132019450(0x7f1408fa, float:1.9677235E38)
            java.lang.String r1 = r5.getString(r1)
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r1, r3)
            r5.show()
            int r5 = com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.onLoadChildren
            int r5 = r5 + 33
            int r1 = r5 % 128
            com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.MediaBrowserCompatItemCallbackStubApi23 = r1
            int r5 = r5 % r0
            return r3
        L49:
            toRational r1 = r5.setCallbacksMessenger
            getFallbackAspectRatio r1 = r1.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            findCloserAspectRatio r1 = r1.TuitionPaymentFragmentbindingInflater1
            boolean r4 = r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            if (r4 == 0) goto L84
            com.midtrans.sdk.corekit.models.snap.Installment r4 = r1.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            boolean r4 = r4.isRequired()
            if (r4 == 0) goto L84
            int r4 = r1.b
            if (r4 == 0) goto L67
            java.lang.String r1 = r1.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L84
        L67:
            r1 = 2132018087(0x7f1403a7, float:1.967447E38)
            java.lang.String r1 = r5.getString(r1)
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r1, r3)
            r5.show()
            int r5 = com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.onLoadChildren
            int r5 = r5 + 99
            int r1 = r5 % 128
            com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.MediaBrowserCompatItemCallbackStubApi23 = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L83
            r5 = 25
            int r5 = r5 / r3
        L83:
            return r3
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.MediaBrowserCompat(com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity):boolean");
    }

    public static /* synthetic */ boolean RemoteActionCompatParcelizer(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        boolean zINotificationSideChannelStubProxy = creditCardDetailsActivity.INotificationSideChannelStubProxy();
        boolean zRemoteActionCompatParcelizer = creditCardDetailsActivity.RemoteActionCompatParcelizer();
        boolean zINotificationSideChannelDefault = creditCardDetailsActivity.INotificationSideChannelDefault();
        if (!zINotificationSideChannelStubProxy) {
            return false;
        }
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 107;
        int i3 = i2 % 128;
        onLoadChildren = i3;
        int i4 = i2 % 2;
        if (!zRemoteActionCompatParcelizer) {
            return false;
        }
        int i5 = i3 + 55;
        MediaBrowserCompatItemCallbackStubApi23 = i5 % 128;
        if (i5 % 2 != 0) {
            return zINotificationSideChannelDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        CreditCardDetailsActivity creditCardDetailsActivity = (CreditCardDetailsActivity) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 13;
        onLoadChildren = i2 % 128;
        int i3 = i2 % 2;
        AppCompatEditText appCompatEditText = creditCardDetailsActivity.getNotifyChildrenChangedOptions;
        if (i3 == 0) {
            return appCompatEditText;
        }
        throw null;
    }

    public static String TuitionPaymentFragmentbindingInflater1(String str) {
        int i = 2 % 2;
        if (str != null) {
            return str.replaceAll(".{4}(?!$)", "$0 ");
        }
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 7;
        int i3 = i2 % 128;
        onLoadChildren = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 9;
        MediaBrowserCompatItemCallbackStubApi23 = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 57;
        onLoadChildren = i2 % 128;
        int i3 = i2 % 2;
        creditCardDetailsActivity.onResult.setVisibility(8);
        int i4 = onLoadChildren + 121;
        MediaBrowserCompatItemCallbackStubApi23 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        CreditCardDetailsActivity creditCardDetailsActivity = (CreditCardDetailsActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onLoadChildren + 89;
        MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
        int i3 = i2 % 2;
        boolean zINotificationSideChannelStubProxy = creditCardDetailsActivity.INotificationSideChannelStubProxy();
        int i4 = MediaBrowserCompatItemCallbackStubApi23 + 105;
        onLoadChildren = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zINotificationSideChannelStubProxy);
    }

    public static /* synthetic */ toRational TuitionPaymentFragmentspecialinlinedviewModeldefault1(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        int i2 = onLoadChildren + 37;
        MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
        int i3 = i2 % 2;
        toRational torational = creditCardDetailsActivity.setCallbacksMessenger;
        if (i3 != 0) {
            return torational;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CreditCardDetailsActivity creditCardDetailsActivity, AlertDialog alertDialog) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 51;
        onLoadChildren = i2 % 128;
        int i3 = i2 % 2;
        try {
            creditCardDetailsActivity.setTextColor(alertDialog.getButton(-1));
            int i4 = onLoadChildren + 37;
            MediaBrowserCompatItemCallbackStubApi23 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e2) {
            String str = d;
            StringBuilder sb = new StringBuilder("RenderThemeError:");
            sb.append(e2.getMessage());
            Logger.d(str, sb.toString());
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CreditCardDetailsActivity creditCardDetailsActivity, String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 121;
        onLoadChildren = i2 % 128;
        int i3 = i2 % 2;
        creditCardDetailsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
        int i4 = onLoadChildren + 97;
        MediaBrowserCompatItemCallbackStubApi23 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        CreditCardDetailsActivity creditCardDetailsActivity = (CreditCardDetailsActivity) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 93;
        onLoadChildren = i2 % 128;
        int i3 = i2 % 2;
        DefaultTextView defaultTextView = creditCardDetailsActivity.onResult;
        if (i3 == 0) {
            return defaultTextView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void a(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        creditCardDetailsActivity.unsubscribe.postDelayed(creditCardDetailsActivity.new AnonymousClass2(creditCardDetailsActivity.getItem(), false), 100L);
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 121;
        onLoadChildren = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        CreditCardDetailsActivity creditCardDetailsActivity = (CreditCardDetailsActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onLoadChildren;
        int i3 = i2 + 119;
        MediaBrowserCompatItemCallbackStubApi23 = i3 % 128;
        int i4 = i3 % 2;
        TextView textView = creditCardDetailsActivity.MediaBrowserCompatConnectionCallback;
        int i5 = i2 + 119;
        MediaBrowserCompatItemCallbackStubApi23 = i5 % 128;
        if (i5 % 2 != 0) {
            return textView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void asInterface(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 51;
        onLoadChildren = i2 % 128;
        int i3 = i2 % 2;
        creditCardDetailsActivity.write();
        int i4 = MediaBrowserCompatItemCallbackStubApi23 + 17;
        onLoadChildren = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object b(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = i7 | i6;
        int i11 = (~i10) | i9;
        int i12 = ~i6;
        int i13 = (~(i2 | i10)) | (~(i8 | i12)) | (~(i12 | i5));
        int i14 = i5 + i6 + i4 + ((-1017789379) * i3) + (461141949 * i);
        int i15 = i14 * i14;
        int i16 = ((-551480932) * i5) + 431816704 + ((-1613042074) * i6) + ((-1061561142) * i11) + (i13 * (-1616703077)) + ((-1616703077) * i9) + (1065222144 * i4) + ((-1727660032) * i3) + (1912995840 * i) + ((-1005256704) * i15);
        int i17 = ((i5 * (-1063000396)) - 360994079) + (i6 * (-1063001374)) + (i11 * (-978)) + (i13 * 489) + (i9 * 489) + (i4 * (-1063000885)) + (i3 * (-90181537)) + (i * (-1548859681)) + (i15 * 816250880);
        switch (i16 + (i17 * i17 * 1493368832)) {
            case 1:
                return b(objArr);
            case 2:
                return TuitionPaymentFragmentbindingInflater1(objArr);
            case 3:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 4:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            case 5:
                return d(objArr);
            case 6:
                return g(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return asBinder(objArr);
            case 9:
                return a(objArr);
            case 10:
                return onTransact(objArr);
            case 11:
                return notify(objArr);
            case 12:
                return cancel(objArr);
            case 13:
                return cancelAll(objArr);
            case 14:
                return INotificationSideChannel(objArr);
            case 15:
                CreditCardDetailsActivity creditCardDetailsActivity = (CreditCardDetailsActivity) objArr[0];
                int i18 = 2 % 2;
                int i19 = MediaBrowserCompatItemCallbackStubApi23;
                int i20 = i19 + 47;
                onLoadChildren = i20 % 128;
                int i21 = i20 % 2;
                boolean z = creditCardDetailsActivity.sendCustomAction;
                int i22 = i19 + 11;
                onLoadChildren = i22 % 128;
                int i23 = i22 % 2;
                return Boolean.valueOf(z);
            default:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
    }

    public static /* synthetic */ void cancel(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 23;
        onLoadChildren = i2 % 128;
        int i3 = i2 % 2;
        creditCardDetailsActivity.getInterfaceDescriptor();
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        int i5 = MediaBrowserCompatItemCallbackStubApi23 + 39;
        onLoadChildren = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
    }

    public static /* synthetic */ createPipelineAndUpdateChildrenSpecs cancelAll(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        int i2 = onLoadChildren;
        int i3 = i2 + 11;
        MediaBrowserCompatItemCallbackStubApi23 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        createPipelineAndUpdateChildrenSpecs createpipelineandupdatechildrenspecs = creditCardDetailsActivity.MediaBrowserCompatCallbackHandler;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 57;
        MediaBrowserCompatItemCallbackStubApi23 = i5 % 128;
        if (i5 % 2 != 0) {
            return createpipelineandupdatechildrenspecs;
        }
        throw null;
    }

    public static /* synthetic */ void connect(CreditCardDetailsActivity creditCardDetailsActivity) throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = onLoadChildren + 67;
        MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
        int i3 = i2 % 2;
        creditCardDetailsActivity.INotificationSideChannelStub();
        int i4 = MediaBrowserCompatItemCallbackStubApi23 + 11;
        onLoadChildren = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object d(Object[] objArr) throws NoSuchMethodException {
        CreditCardDetailsActivity creditCardDetailsActivity = (CreditCardDetailsActivity) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 5;
        onLoadChildren = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.ef_content_desc_folder).substring(0, 6).codePointAt(2) + 2095977509;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int iB = zzdm.b();
            b(SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iCodePointAt, iB, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -626001062, new Object[]{creditCardDetailsActivity}, 626001074);
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {creditCardDetailsActivity};
        int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.ef_content_desc_folder).substring(0, 6).codePointAt(2) + 2095977509;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iCodePointAt2, zzdm.b(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -626001062, objArr2, 626001074);
        int i3 = onLoadChildren + 43;
        MediaBrowserCompatItemCallbackStubApi23 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 57 / 0;
        }
        return null;
    }

    public static /* synthetic */ void d(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        int i2 = onLoadChildren + 81;
        MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
        int i3 = i2 % 2;
        creditCardDetailsActivity.connect();
        if (i3 == 0) {
            throw null;
        }
        int i4 = MediaBrowserCompatItemCallbackStubApi23 + 79;
        onLoadChildren = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ int disconnect(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23;
        int i3 = i2 + 55;
        onLoadChildren = i3 % 128;
        int i4 = i3 % 2;
        int i5 = creditCardDetailsActivity.notify;
        if (i4 != 0) {
            throw null;
        }
        int i6 = i2 + 123;
        onLoadChildren = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public static /* synthetic */ AppCompatEditText g(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23;
        int i3 = i2 + 59;
        onLoadChildren = i3 % 128;
        int i4 = i3 % 2;
        AppCompatEditText appCompatEditText = creditCardDetailsActivity.getItem;
        int i5 = i2 + 123;
        onLoadChildren = i5 % 128;
        int i6 = i5 % 2;
        return appCompatEditText;
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        CreditCardDetailsActivity creditCardDetailsActivity = (CreditCardDetailsActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onLoadChildren + 45;
        int i3 = i2 % 128;
        MediaBrowserCompatItemCallbackStubApi23 = i3;
        int i4 = i2 % 2;
        creditCardDetailsActivity.handleMessage = str;
        int i5 = i3 + 121;
        onLoadChildren = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ String g() {
        int i = 2 % 2;
        int i2 = onLoadChildren + 101;
        int i3 = i2 % 128;
        MediaBrowserCompatItemCallbackStubApi23 = i3;
        int i4 = i2 % 2;
        String str = d;
        int i5 = i3 + 99;
        onLoadChildren = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TextView getExtras(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        int i2 = onLoadChildren;
        int i3 = i2 + 15;
        MediaBrowserCompatItemCallbackStubApi23 = i3 % 128;
        int i4 = i3 % 2;
        TextView textView = creditCardDetailsActivity.onItemLoaded;
        int i5 = i2 + 25;
        MediaBrowserCompatItemCallbackStubApi23 = i5 % 128;
        int i6 = i5 % 2;
        return textView;
    }

    public static /* synthetic */ boolean getInterfaceDescriptor(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 1;
        onLoadChildren = i2 % 128;
        int i3 = i2 % 2;
        boolean zRemoteActionCompatParcelizer = creditCardDetailsActivity.RemoteActionCompatParcelizer();
        int i4 = MediaBrowserCompatItemCallbackStubApi23 + 105;
        onLoadChildren = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return zRemoteActionCompatParcelizer;
    }

    public static /* synthetic */ TextView getItem(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        int i2 = onLoadChildren;
        int i3 = i2 + 113;
        MediaBrowserCompatItemCallbackStubApi23 = i3 % 128;
        int i4 = i3 % 2;
        TextView textView = creditCardDetailsActivity.onError;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 49;
        MediaBrowserCompatItemCallbackStubApi23 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return textView;
    }

    public static /* synthetic */ void getNotifyChildrenChangedOptions(CreditCardDetailsActivity creditCardDetailsActivity) {
        Promo promo;
        int i = 2 % 2;
        createPipelineAndUpdateChildrenSpecs createpipelineandupdatechildrenspecs = creditCardDetailsActivity.MediaBrowserCompatCallbackHandler;
        if (createpipelineandupdatechildrenspecs != null) {
            toRational torational = creditCardDetailsActivity.setCallbacksMessenger;
            Iterator<Promo> it = createpipelineandupdatechildrenspecs.TuitionPaymentFragmentbindingInflater1.iterator();
            while (true) {
                promo = null;
                if (!it.hasNext()) {
                    int i2 = onLoadChildren + 43;
                    MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
                    int i3 = i2 % 2;
                    break;
                }
                Promo next = it.next();
                if (next.isSelected()) {
                    int i4 = MediaBrowserCompatItemCallbackStubApi23 + 63;
                    onLoadChildren = i4 % 128;
                    if (i4 % 2 == 0) {
                        promo = next;
                        break;
                    } else {
                        promo.hashCode();
                        throw null;
                    }
                }
            }
            ((filterResolutionsByAspectRatio) torational).TuitionPaymentFragmentspecialinlinedviewModeldefault2.d = promo;
            PaymentDetails paymentDetails = torational.b().getPaymentDetails();
            if (paymentDetails != null) {
                paymentDetails.setPromoSelected(promo);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ba, code lost:
    
        if (r11.onConnected == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00bc, code lost:
    
        r1 = com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.MediaBrowserCompatItemCallbackStubApi23 + 57;
        com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.onLoadChildren = r1 % 128;
        r1 = r1 % 2;
        r0 = r11.getRoot.getText().toString().trim();
        r1 = r11.setCallbacksMessenger;
        r11 = r11.onConnected.getSavedTokenId();
        r3 = new com.midtrans.sdk.corekit.models.CardTokenRequest();
        r3.setSavedTokenId(r11);
        r3.setCardCVV(r0);
        r3.setGrossAmount(r1.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        r3.setSecure(r1.asInterface());
        r3.setTwoClick(true);
        r3.setSecure(r1.asInterface());
        r3.setClientKey(r1.b().getClientKey());
        r1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r3);
        r1.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x010f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0110, code lost:
    
        r5 = r11.getItem();
        r6 = r11.getRoot.getText().toString().trim();
        r0 = r11.getNotifyChildrenChangedOptions.getText().toString();
        r7 = r0.split("/")[0].trim();
        r3 = new java.lang.StringBuilder("20");
        r3.append(r0.split("/")[1].trim());
        r8 = r3.toString();
        r0 = r11.setCallbacksMessenger;
        r11 = r11.write.isChecked();
        r1 = new com.midtrans.sdk.corekit.models.CardTokenRequest(r5, r6, r7, r8, r0.b().getClientKey());
        r1.setIsSaved(r11);
        r1.setSecure(r0.asInterface());
        r1.setGrossAmount(r0.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        r0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r1);
        r0.b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x017d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003f, code lost:
    
        if (((java.lang.Boolean) b(com.bpjstku.data.syariah.model.response.SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), r5, r6, r7, -1781249968, new java.lang.Object[]{r11}, 1781249969)).booleanValue() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006d, code lost:
    
        if (((java.lang.Boolean) b(com.bpjstku.data.syariah.model.response.SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), r5, r6, r7, -1781249968, new java.lang.Object[]{r11}, 1781249969)).booleanValue() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006f, code lost:
    
        r1 = r11.setCallbacksMessenger;
        r2 = new com.midtrans.sdk.corekit.models.snap.CreditCardPaymentModel(r11.onConnected.getMaskedCard());
        r8 = com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        r7 = com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        r6 = com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        defpackage.toRational.TuitionPaymentFragmentspecialinlinedviewModeldefault3(com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -2024183966, new java.lang.Object[]{r1, r2}, r6, r7, r8, 2024183966);
        r1.b().paymentUsingCard(r1.b().readAuthenticationToken(), r2, r1.new AnonymousClass3());
        r11 = com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.onLoadChildren + 63;
        com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.MediaBrowserCompatItemCallbackStubApi23 = r11 % 128;
        r11 = r11 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void getRoot(com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.getRoot(com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity):void");
    }

    public static /* synthetic */ MediaBrowserCompatCallbackHandler getServiceComponent(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 73;
        onLoadChildren = i2 % 128;
        int i3 = i2 % 2;
        MediaBrowserCompatCallbackHandler mediaBrowserCompatCallbackHandler = ((BasePaymentActivity) creditCardDetailsActivity).asBinder;
        if (i3 == 0) {
            return mediaBrowserCompatCallbackHandler;
        }
        throw null;
    }

    public static /* synthetic */ void isConnected(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        int i2 = creditCardDetailsActivity.setCallbacksMessenger.d;
        int i3 = creditCardDetailsActivity.setCallbacksMessenger.asInterface;
        if (i2 == 0 && i3 == 0) {
            creditCardDetailsActivity.cancelAll.setEnabled(false);
            creditCardDetailsActivity.INotificationSideChannelStub.setEnabled(false);
            int i4 = MediaBrowserCompatItemCallbackStubApi23 + 35;
            onLoadChildren = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (i2 > 0) {
            int i5 = MediaBrowserCompatItemCallbackStubApi23 + 29;
            onLoadChildren = i5 % 128;
            int i6 = i5 % 2;
            if (i2 < i3) {
                creditCardDetailsActivity.cancelAll.setEnabled(true);
                creditCardDetailsActivity.INotificationSideChannelStub.setEnabled(true);
                return;
            }
        }
        if (i2 > 0 && i2 == i3) {
            int i7 = MediaBrowserCompatItemCallbackStubApi23 + 23;
            onLoadChildren = i7 % 128;
            if (i7 % 2 != 0) {
                creditCardDetailsActivity.cancelAll.setEnabled(true);
                creditCardDetailsActivity.INotificationSideChannelStub.setEnabled(true);
                return;
            } else {
                creditCardDetailsActivity.cancelAll.setEnabled(true);
                creditCardDetailsActivity.INotificationSideChannelStub.setEnabled(false);
                return;
            }
        }
        if (i2 != 0 || i2 >= i3) {
            return;
        }
        int i8 = onLoadChildren + 125;
        MediaBrowserCompatItemCallbackStubApi23 = i8 % 128;
        if (i8 % 2 == 0) {
            creditCardDetailsActivity.cancelAll.setEnabled(true);
            creditCardDetailsActivity.INotificationSideChannelStub.setEnabled(false);
        } else {
            creditCardDetailsActivity.cancelAll.setEnabled(false);
            creditCardDetailsActivity.INotificationSideChannelStub.setEnabled(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.$$j
            int r5 = 207 - r5
            int r6 = r6 + 84
            int r1 = 53 - r7
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L20:
            int r3 = r3 + 1
            r4 = r0[r5]
        L24:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            int r5 = r5 + 1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.m(short, int, byte, java.lang.Object[]):void");
    }

    public static /* synthetic */ String notify(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23;
        int i3 = i2 + 61;
        onLoadChildren = i3 % 128;
        int i4 = i3 % 2;
        String str = creditCardDetailsActivity.handleMessage;
        int i5 = i2 + 105;
        onLoadChildren = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
        return str;
    }

    private static void o(int i, int i2, byte b, Object[] objArr) {
        byte[] bArr = $$m;
        int i3 = (i * 31) + 84;
        int i4 = b * 35;
        int i5 = (i2 * 17) + 4;
        byte[] bArr2 = new byte[53 - i4];
        int i6 = 52 - i4;
        int i7 = -1;
        if (bArr == null) {
            i3 = (i3 + (-i5)) - 11;
            i5++;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i3;
            if (i8 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i9 = i5;
            i3 = (i3 + (-bArr[i5])) - 11;
            i5 = i9 + 1;
            i7 = i8;
        }
    }

    public static /* synthetic */ void onTransact(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        int i2 = onLoadChildren + 53;
        MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
        int i3 = i2 % 2;
        creditCardDetailsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(false);
        int i4 = onLoadChildren + 85;
        MediaBrowserCompatItemCallbackStubApi23 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ AppCompatEditText read(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        int i2 = onLoadChildren + 7;
        MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
        int i3 = i2 % 2;
        AppCompatEditText appCompatEditText = creditCardDetailsActivity.getSessionToken;
        if (i3 != 0) {
            return appCompatEditText;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void search(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 69;
        onLoadChildren = i2 % 128;
        int i3 = i2 % 2;
        creditCardDetailsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Promo) null);
        int i4 = onLoadChildren + 103;
        MediaBrowserCompatItemCallbackStubApi23 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
    }

    public static /* synthetic */ void sendCustomAction(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        int i2 = onLoadChildren + 3;
        MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
        int i3 = i2 % 2;
        if (creditCardDetailsActivity.setCallbacksMessenger.d == 0) {
            int i4 = onLoadChildren + 107;
            MediaBrowserCompatItemCallbackStubApi23 = i4 % 128;
            int i5 = i4 % 2;
            creditCardDetailsActivity.getInterfaceDescriptor();
            return;
        }
        creditCardDetailsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1("", false);
        int i6 = onLoadChildren + 89;
        MediaBrowserCompatItemCallbackStubApi23 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 21 / 0;
        }
    }

    public static /* synthetic */ SaveCardRequest setCallbacksMessenger(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23;
        int i3 = i2 + 73;
        onLoadChildren = i3 % 128;
        int i4 = i3 % 2;
        SaveCardRequest saveCardRequest = creditCardDetailsActivity.onConnected;
        int i5 = i2 + 119;
        onLoadChildren = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return saveCardRequest;
    }

    public static /* synthetic */ void unsubscribe(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        new AlertDialog.Builder(creditCardDetailsActivity).setMessage(R.string.card_delete_message).setPositiveButton(R.string.text_yes, new DialogInterface.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.17
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
                CreditCardDetailsActivity creditCardDetailsActivity2 = CreditCardDetailsActivity.this;
                CreditCardDetailsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(creditCardDetailsActivity2, creditCardDetailsActivity2.getString(R.string.processing_delete));
                toRational torationalTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CreditCardDetailsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CreditCardDetailsActivity.this);
                torationalTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(CreditCardDetailsActivity.setCallbacksMessenger(CreditCardDetailsActivity.this), (computeAreaOverlapping) torationalTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        }).setNegativeButton(R.string.text_no, new DialogInterface.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.16
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
            }
        }).create().show();
        int i2 = onLoadChildren + 85;
        MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ AppCompatEditText write(CreditCardDetailsActivity creditCardDetailsActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23;
        int i3 = i2 + 115;
        onLoadChildren = i3 % 128;
        int i4 = i3 % 2;
        AppCompatEditText appCompatEditText = creditCardDetailsActivity.isConnected;
        int i5 = i2 + 101;
        onLoadChildren = i5 % 128;
        int i6 = i5 % 2;
        return appCompatEditText;
    }

    private void MediaBrowserCompat() {
        int i = 2 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2((String) null);
        final toRational torational = this.setCallbacksMessenger;
        torational.b().getTransactionStatus(torational.b().readAuthenticationToken(), new GetTransactionStatusCallback() { // from class: toRational.9
            public AnonymousClass9() {
            }

            @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
            public final void onError(Throwable th) {
                ((getMergedResolutions) toRational.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }

            @Override // com.midtrans.sdk.corekit.callback.GetTransactionStatusCallback
            public final void onFailure(TransactionStatusResponse transactionStatusResponse, String str) {
                TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault2 = filterOutChildSizesThatWillNeverBeSelected.TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionStatusResponse);
                toRational.this.notify = transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                ((getMergedResolutions) toRational.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault3(transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }

            @Override // com.midtrans.sdk.corekit.callback.GetTransactionStatusCallback
            public final void onSuccess(TransactionStatusResponse transactionStatusResponse) {
                TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault2 = filterOutChildSizesThatWillNeverBeSelected.TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionStatusResponse);
                toRational.this.notify = transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                ((getMergedResolutions) toRational.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        int i2 = onLoadChildren + 115;
        MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void TuitionPaymentFragmentbindingInflater1(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 75;
        onLoadChildren = i2 % 128;
        int i3 = i2 % 2;
        if (this.setCallbacksMessenger.b().getUIKitCustomSetting().isShowPaymentStatus()) {
            Intent intent = new Intent(this, (Class<?>) PaymentStatusActivity.class);
            intent.putExtra("payment.result", transactionResponse);
            startActivityForResult(intent, 210);
            return;
        }
        b(-1);
        int i4 = MediaBrowserCompatItemCallbackStubApi23 + 69;
        onLoadChildren = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void b(int i) {
        int i2 = 2 % 2;
        Intent intent = new Intent();
        intent.putExtra("transaction_response", this.setCallbacksMessenger.notify);
        setResult(i, intent);
        finish();
        int i3 = onLoadChildren + 27;
        MediaBrowserCompatItemCallbackStubApi23 = i3 % 128;
        int i4 = i3 % 2;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 109;
        onLoadChildren = i2 % 128;
        int i3 = i2 % 2;
        if (z) {
            this.IconCompatParcelizer.setVisibility(0);
            this.cancelAll.setEnabled(false);
            this.INotificationSideChannelStub.setEnabled(true);
            return;
        }
        this.IconCompatParcelizer.setVisibility(8);
        toRational torational = this.setCallbacksMessenger;
        torational.d = 0;
        ((filterResolutionsByAspectRatio) torational).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0);
        int i4 = MediaBrowserCompatItemCallbackStubApi23 + 25;
        onLoadChildren = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    private static /* synthetic */ Object cancel(Object[] objArr) {
        String string;
        boolean z = false;
        CreditCardDetailsActivity creditCardDetailsActivity = (CreditCardDetailsActivity) objArr[0];
        int i = 2 % 2;
        toRational torational = creditCardDetailsActivity.setCallbacksMessenger;
        int iIntValue = ((filterResolutionsByAspectRatio) torational).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1.get(torational.d).intValue();
        Object obj = null;
        if (iIntValue <= 0) {
            getFallbackAspectRatio getfallbackaspectratio = ((filterResolutionsByAspectRatio) creditCardDetailsActivity.setCallbacksMessenger).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (getfallbackaspectratio != null) {
                int i2 = onLoadChildren + 125;
                MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
                if (i2 % 2 == 0) {
                    getfallbackaspectratio.b();
                    obj.hashCode();
                    throw null;
                }
                if (getfallbackaspectratio.b()) {
                    z = true;
                } else {
                    int i3 = MediaBrowserCompatItemCallbackStubApi23 + 45;
                    onLoadChildren = i3 % 128;
                    int i4 = i3 % 2;
                }
            } else {
                int i5 = MediaBrowserCompatItemCallbackStubApi23 + 45;
                onLoadChildren = i5 % 128;
                int i6 = i5 % 2;
            }
            if (!z) {
                string = creditCardDetailsActivity.getString(R.string.no_installment);
            } else {
                int i7 = onLoadChildren + 117;
                MediaBrowserCompatItemCallbackStubApi23 = i7 % 128;
                int i8 = i7 % 2;
                string = creditCardDetailsActivity.getString(R.string.choose_installment);
            }
        } else {
            string = creditCardDetailsActivity.getString(R.string.formatted_installment_month, String.valueOf(iIntValue));
        }
        creditCardDetailsActivity.MediaBrowserCompatCustomActionResultReceiver.setText(string);
        return null;
    }

    private void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onLoadChildren + 115;
        MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            TextUtils.isEmpty(a());
            throw null;
        }
        String strA = a();
        if (TextUtils.isEmpty(strA)) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1("", false);
            int i3 = onLoadChildren + 123;
            MediaBrowserCompatItemCallbackStubApi23 = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        Object[] objArr = {this.setCallbacksMessenger, strA};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (((Boolean) toRational.TuitionPaymentFragmentspecialinlinedviewModeldefault3(AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 507152445, objArr, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -507152444)).booleanValue()) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(BankType.BNI, true);
        } else if (this.setCallbacksMessenger.TuitionPaymentFragmentbindingInflater1(strA)) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(BankType.MANDIRI, true);
        } else {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1("", false);
        }
    }

    private void IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 61;
        onLoadChildren = i2 % 128;
        if (i2 % 2 != 0) {
            this.setCallbacksMessenger.b().getExternalScanner();
            throw null;
        }
        if (this.setCallbacksMessenger.b().getExternalScanner() == null) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            b(zzdm.b(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -436859433, new Object[]{this, false}, 436859437);
            return;
        }
        int i3 = onLoadChildren + 111;
        MediaBrowserCompatItemCallbackStubApi23 = i3 % 128;
        int i4 = i3 % 2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(zzdm.b(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault6, iTuitionPaymentFragmentspecialinlinedviewModeldefault5, -436859433, new Object[]{this, true}, 436859437);
        this.INotificationSideChannelDefault.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    toRational torationalTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CreditCardDetailsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CreditCardDetailsActivity.this);
                    CreditCardDetailsActivity creditCardDetailsActivity = CreditCardDetailsActivity.this;
                    if (torationalTuitionPaymentFragmentspecialinlinedviewModeldefault1.b().getExternalScanner() != null) {
                        torationalTuitionPaymentFragmentspecialinlinedviewModeldefault1.b().getExternalScanner().startScan(creditCardDetailsActivity, 101);
                    }
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        boolean z = false;
        CreditCardDetailsActivity creditCardDetailsActivity = (CreditCardDetailsActivity) objArr[0];
        TransactionResponse transactionResponse = (TransactionResponse) objArr[1];
        int i = 2 % 2;
        MixpanelAnalyticsManager mixpanelAnalyticsManager = creditCardDetailsActivity.j_().getmMixpanelAnalyticsManager();
        if (mixpanelAnalyticsManager == null || transactionResponse == null) {
            return null;
        }
        mixpanelAnalyticsManager.setTransactionid(transactionResponse.getTransactionId());
        if (((Boolean) b(SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), zzdm.b(), SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1781249968, new Object[]{creditCardDetailsActivity}, 1781249969)).booleanValue()) {
            int i2 = MediaBrowserCompatItemCallbackStubApi23 + 85;
            onLoadChildren = i2 % 128;
            int i3 = i2 % 2;
            mixpanelAnalyticsManager.setOneCLick(((Boolean) b(SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), zzdm.b(), SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1781249968, new Object[]{creditCardDetailsActivity}, 1781249969)).booleanValue());
        } else {
            SaveCardRequest saveCardRequest = creditCardDetailsActivity.onConnected;
            if (saveCardRequest != null) {
                int i4 = MediaBrowserCompatItemCallbackStubApi23 + 41;
                onLoadChildren = i4 % 128;
                int i5 = i4 % 2;
                mixpanelAnalyticsManager.setTwoclicks(saveCardRequest != null);
            }
        }
        if (TextUtils.isEmpty(transactionResponse.getInstallmentTerm())) {
            return null;
        }
        mixpanelAnalyticsManager.setInstallmentAvailable(true);
        getFallbackAspectRatio getfallbackaspectratio = ((filterResolutionsByAspectRatio) creditCardDetailsActivity.setCallbacksMessenger).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (getfallbackaspectratio != null) {
            int i6 = onLoadChildren + 45;
            MediaBrowserCompatItemCallbackStubApi23 = i6 % 128;
            int i7 = i6 % 2;
            if (getfallbackaspectratio.b()) {
                z = true;
            }
        }
        mixpanelAnalyticsManager.setInstallmentRequired(z);
        return null;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final String str, boolean z) {
        int i = 2 % 2;
        int i2 = onLoadChildren + 115;
        MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
        int i3 = i2 % 2;
        if (!z) {
            this.connect.setChecked(false);
            this.read.setVisibility(8);
            return;
        }
        this.INotificationSideChannelStubProxy.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4;
                int i5;
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    if (str.equalsIgnoreCase(BankType.BNI)) {
                        i4 = R.string.redeem_bni_title;
                        i5 = R.string.redeem_bni_details;
                    } else if (str.equalsIgnoreCase(BankType.MANDIRI)) {
                        i4 = R.string.redeem_mandiri_title;
                        i5 = R.string.redeem_mandiri_details;
                    } else {
                        i4 = 0;
                        i5 = 0;
                    }
                    AlertDialog alertDialogCreate = new AlertDialog.Builder(CreditCardDetailsActivity.this).setTitle(i4).setMessage(i5).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.9.5
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i6) {
                            dialogInterface.dismiss();
                        }
                    }).create();
                    alertDialogCreate.show();
                    CreditCardDetailsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CreditCardDetailsActivity.this, alertDialogCreate);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        str.hashCode();
        if (str.equals(BankType.BNI)) {
            this.connect.setText(getString(R.string.redeem_bni_reward));
        } else if (str.equals(BankType.MANDIRI)) {
            int i4 = onLoadChildren + 55;
            MediaBrowserCompatItemCallbackStubApi23 = i4 % 128;
            if (i4 % 2 == 0) {
                this.connect.setText(getString(R.string.redeem_mandiri_point));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.connect.setText(getString(R.string.redeem_mandiri_point));
        }
        this.read.setVisibility(0);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0075  */
    private boolean INotificationSideChannelDefault() {
        int i = 2 % 2;
        int iB = zzdm.b();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (((Boolean) b(SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iB, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1781249968, new Object[]{this}, 1781249969)).booleanValue()) {
            return true;
        }
        String strTrim = this.getRoot.getText().toString().trim();
        if (!TextUtils.isEmpty(strTrim)) {
            if (strTrim.length() >= 3) {
                this.onConnectionFailed.setVisibility(8);
                return true;
            }
            TextView textView = this.onConnectionFailed;
            String string = getString(R.string.validation_message_invalid_cvv);
            if (string == null || TextUtils.isEmpty(string)) {
                textView.setVisibility(8);
            } else {
                int i2 = MediaBrowserCompatItemCallbackStubApi23 + 67;
                onLoadChildren = i2 % 128;
                int i3 = i2 % 2;
                textView.setVisibility(0);
                textView.setText(string);
            }
            return false;
        }
        TextView textView2 = this.onConnectionFailed;
        String string2 = getString(R.string.validation_message_cvv);
        if (string2 != null) {
            int i4 = onLoadChildren + 51;
            MediaBrowserCompatItemCallbackStubApi23 = i4 % 128;
            int i5 = i4 % 2;
            if (TextUtils.isEmpty(string2)) {
                textView2.setVisibility(8);
            } else {
                int i6 = MediaBrowserCompatItemCallbackStubApi23 + 43;
                onLoadChildren = i6 % 128;
                if (i6 % 2 != 0) {
                    textView2.setVisibility(1);
                    textView2.setText(string2);
                } else {
                    textView2.setVisibility(0);
                    textView2.setText(string2);
                }
            }
        } else {
            textView2.setVisibility(8);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0052  */
    private void INotificationSideChannelStub() throws NoSuchMethodException {
        boolean z;
        ArrayList<Integer> arrayListTuitionPaymentFragmentbindingInflater1;
        int i = 2 % 2;
        int i2 = onLoadChildren + 23;
        MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
        int i3 = i2 % 2;
        String item = getItem();
        if (((filterResolutionsByAspectRatio) this.setCallbacksMessenger).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i4 = MediaBrowserCompatItemCallbackStubApi23 + 67;
            onLoadChildren = i4 % 128;
            int i5 = i4 % 2;
            if (toRational.TuitionPaymentFragmentspecialinlinedviewModeldefault1(item)) {
                String strA = a();
                findCloserAspectRatio findcloseraspectratio = ((filterResolutionsByAspectRatio) this.setCallbacksMessenger).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1;
                if (findcloseraspectratio.b("offline") != null) {
                    int i6 = MediaBrowserCompatItemCallbackStubApi23 + 79;
                    onLoadChildren = i6 % 128;
                    int i7 = i6 % 2;
                    if (findcloseraspectratio.b("offline").isEmpty()) {
                        int i8 = MediaBrowserCompatItemCallbackStubApi23 + 79;
                        onLoadChildren = i8 % 128;
                        int i9 = i8 % 2;
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    int i10 = MediaBrowserCompatItemCallbackStubApi23 + 79;
                    onLoadChildren = i10 % 128;
                    int i11 = i10 % 2;
                    z = false;
                }
                if (z) {
                    int i12 = MediaBrowserCompatItemCallbackStubApi23 + 81;
                    onLoadChildren = i12 % 128;
                    if (i12 % 2 != 0) {
                        arrayListTuitionPaymentFragmentbindingInflater1 = ((filterResolutionsByAspectRatio) this.setCallbacksMessenger).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strA);
                        int i13 = 28 / 0;
                    } else {
                        arrayListTuitionPaymentFragmentbindingInflater1 = ((filterResolutionsByAspectRatio) this.setCallbacksMessenger).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strA);
                    }
                } else {
                    arrayListTuitionPaymentFragmentbindingInflater1 = ((filterResolutionsByAspectRatio) this.setCallbacksMessenger).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(strA);
                }
                if (arrayListTuitionPaymentFragmentbindingInflater1 == null || arrayListTuitionPaymentFragmentbindingInflater1.size() <= 1) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1(false);
                    int i14 = MediaBrowserCompatItemCallbackStubApi23 + 101;
                    onLoadChildren = i14 % 128;
                    int i15 = i14 % 2;
                    return;
                }
                toRational torational = this.setCallbacksMessenger;
                torational.d = 0;
                torational.asInterface = arrayListTuitionPaymentFragmentbindingInflater1.size() - 1;
                int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.ef_content_desc_folder).substring(0, 6).codePointAt(2) + 2095977509;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                b(SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iCodePointAt, zzdm.b(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -626001062, new Object[]{this}, 626001074);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(true);
                return;
            }
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    private void write() {
        int i = 2 % 2;
        String strTrim = this.getItem.getText().toString().trim();
        byte b = 0;
        if (TextUtils.isEmpty(strTrim)) {
            int i2 = MediaBrowserCompatItemCallbackStubApi23 + 117;
            onLoadChildren = i2 % 128;
            int i3 = i2 % 2;
            this.search.setImageResource(0);
            int i4 = onLoadChildren + 3;
            MediaBrowserCompatItemCallbackStubApi23 = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        String cardType = Utils.getCardType(strTrim);
        cardType.hashCode();
        cardType.hashCode();
        switch (cardType.hashCode()) {
            case -1553624974:
                if (!cardType.equals(Utils.CARD_TYPE_MASTERCARD)) {
                    b = -1;
                }
                break;
            case 73257:
                if (cardType.equals(Utils.CARD_TYPE_JCB)) {
                    int i6 = onLoadChildren + 23;
                    MediaBrowserCompatItemCallbackStubApi23 = i6 % 128;
                    int i7 = i6 % 2;
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case 2012639:
                if (cardType.equals(Utils.CARD_TYPE_AMEX)) {
                    int i8 = MediaBrowserCompatItemCallbackStubApi23 + 53;
                    onLoadChildren = i8 % 128;
                    b = i8 % 2 == 0 ? (byte) 2 : (byte) 4;
                } else {
                    b = -1;
                }
                break;
            case 2634817:
                if (!cardType.equals(Utils.CARD_TYPE_VISA)) {
                    b = -1;
                } else {
                    int i9 = MediaBrowserCompatItemCallbackStubApi23 + 71;
                    onLoadChildren = i9 % 128;
                    int i10 = i9 % 2;
                    b = 3;
                }
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            this.search.setImageResource(2131231293);
            return;
        }
        if (b == 1) {
            this.search.setImageResource(2131231244);
            return;
        }
        if (b == 2) {
            this.search.setImageResource(2131231079);
        } else {
            if (b == 3) {
                this.search.setImageResource(2131231492);
                return;
            }
            int i11 = MediaBrowserCompatItemCallbackStubApi23 + 65;
            onLoadChildren = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:37:0x00af  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    private boolean INotificationSideChannelStubProxy() {
        boolean z;
        boolean z2;
        int i;
        int i2 = 2 % 2;
        if (this.onConnected != null) {
            int i3 = onLoadChildren + 59;
            MediaBrowserCompatItemCallbackStubApi23 = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        String item = getItem();
        if (TextUtils.isEmpty(item)) {
            int i5 = MediaBrowserCompatItemCallbackStubApi23 + 123;
            onLoadChildren = i5 % 128;
            if (i5 % 2 != 0) {
                getString(R.string.validation_message_card_number);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            TextView textView = this.MediaBrowserCompatConnectionCallback;
            String string = getString(R.string.validation_message_card_number);
            if (string != null) {
                int i6 = MediaBrowserCompatItemCallbackStubApi23 + 121;
                onLoadChildren = i6 % 128;
                int i7 = i6 % 2;
                if (TextUtils.isEmpty(string)) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    textView.setText(string);
                }
            } else {
                textView.setVisibility(8);
            }
            z2 = false;
        } else {
            this.MediaBrowserCompatConnectionCallback.setVisibility(8);
            z2 = true;
        }
        if (item.length() >= 13) {
            int i8 = onLoadChildren + 95;
            MediaBrowserCompatItemCallbackStubApi23 = i8 % 128;
            int i9 = i8 % 2;
            if (onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(item)) {
                this.MediaBrowserCompatConnectionCallback.setVisibility(8);
                int i10 = onLoadChildren + 97;
                MediaBrowserCompatItemCallbackStubApi23 = i10 % 128;
                int i11 = i10 % 2;
                return z2;
            }
        }
        TextView textView2 = this.MediaBrowserCompatConnectionCallback;
        String string2 = getString(R.string.validation_message_invalid_card_no);
        if (string2 != null) {
            int i12 = MediaBrowserCompatItemCallbackStubApi23 + 43;
            onLoadChildren = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 64 / 0;
                if (TextUtils.isEmpty(string2)) {
                    textView2.setVisibility(8);
                } else {
                    i = onLoadChildren + 35;
                    MediaBrowserCompatItemCallbackStubApi23 = i % 128;
                    if (i % 2 == 0) {
                        textView2.setVisibility(1);
                        textView2.setText(string2);
                    } else {
                        textView2.setVisibility(0);
                        textView2.setText(string2);
                    }
                }
            } else if (TextUtils.isEmpty(string2)) {
                textView2.setVisibility(8);
            } else {
                i = onLoadChildren + 35;
                MediaBrowserCompatItemCallbackStubApi23 = i % 128;
                if (i % 2 == 0) {
                    textView2.setVisibility(1);
                    textView2.setText(string2);
                } else {
                    textView2.setVisibility(0);
                    textView2.setText(string2);
                }
            }
        } else {
            textView2.setVisibility(8);
        }
        return false;
    }

    private static void n(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(MediaBrowserCompatMediaBrowserImpl ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $11 + 15;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(MediaBrowserCompatMediaBrowserImpl)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - View.MeasureSpec.getSize(0)), (-16775860) - Color.rgb(0, 0, 0), 38 - View.getDefaultSize(0, 0), 894276454, false, $$w(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 47774), 468 - View.resolveSize(0, 0), View.MeasureSpec.getSize(0) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
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
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i6 = $11 + 23;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws NoSuchMethodException {
        String email;
        CreditCardDetailsActivity creditCardDetailsActivity = (CreditCardDetailsActivity) objArr[0];
        int i = 2 % 2;
        creditCardDetailsActivity.onReceiveResult.setText(R.string.card_details);
        if (creditCardDetailsActivity.onConnected != null) {
            creditCardDetailsActivity.cancel.setVisibility(0);
            creditCardDetailsActivity.findViewById(R.id.button_separator).setVisibility(0);
            String cardType = Utils.getCardType(creditCardDetailsActivity.onConnected.getMaskedCard());
            if (!TextUtils.isEmpty(cardType)) {
                try {
                    String strSubstring = creditCardDetailsActivity.onConnected.getMaskedCard().substring(0, 4);
                    StringBuilder sb = new StringBuilder();
                    sb.append(cardType);
                    sb.append("-");
                    sb.append(strSubstring);
                    creditCardDetailsActivity.onReceiveResult.setText(sb.toString());
                } catch (RuntimeException e2) {
                    String str = d;
                    StringBuilder sb2 = new StringBuilder("cardType:");
                    sb2.append(e2.getMessage());
                    Logger.e(str, sb2.toString());
                }
            }
            creditCardDetailsActivity.write.setChecked(false);
            creditCardDetailsActivity.getExtras.setVisibility(8);
            creditCardDetailsActivity.getNotifyChildrenChangedOptions.setInputType(1);
            InputFilter[] inputFilterArr = {new InputFilter.LengthFilter(20)};
            creditCardDetailsActivity.getNotifyChildrenChangedOptions.setFilters(inputFilterArr);
            creditCardDetailsActivity.getNotifyChildrenChangedOptions.setEnabled(false);
            creditCardDetailsActivity.getNotifyChildrenChangedOptions.setText("●● / ●●");
            creditCardDetailsActivity.getItem.setEnabled(false);
            creditCardDetailsActivity.getItem.setText(onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault3(creditCardDetailsActivity.onConnected.getMaskedCard()));
            creditCardDetailsActivity.getRoot.requestFocus();
            if (!((Boolean) b(SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), zzdm.b(), SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1781249968, new Object[]{creditCardDetailsActivity}, 1781249969)).booleanValue()) {
                creditCardDetailsActivity.INotificationSideChannelStub();
                creditCardDetailsActivity.getInterfaceDescriptor();
                if (!((filterResolutionsByAspectRatio) creditCardDetailsActivity.setCallbacksMessenger).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(creditCardDetailsActivity.getItem())) {
                    creditCardDetailsActivity.onResult.setVisibility(8);
                } else {
                    int i2 = MediaBrowserCompatItemCallbackStubApi23 + 91;
                    onLoadChildren = i2 % 128;
                    if (i2 % 2 != 0) {
                        creditCardDetailsActivity.onResult.setVisibility(0);
                    } else {
                        creditCardDetailsActivity.onResult.setVisibility(0);
                    }
                    int i3 = onLoadChildren + 59;
                    MediaBrowserCompatItemCallbackStubApi23 = i3 % 128;
                    int i4 = i3 % 2;
                }
            } else {
                creditCardDetailsActivity.getRoot.setInputType(1);
                creditCardDetailsActivity.getRoot.setFilters(inputFilterArr);
                creditCardDetailsActivity.getRoot.setText("●●●");
                creditCardDetailsActivity.getRoot.setEnabled(false);
                creditCardDetailsActivity.INotificationSideChannelStub();
            }
            creditCardDetailsActivity.connect();
            creditCardDetailsActivity.write();
        }
        toRational torational = creditCardDetailsActivity.setCallbacksMessenger;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 1) {
            creditCardDetailsActivity.MediaBrowserCompat.setImageResource(2131230900);
            int i5 = onLoadChildren + 121;
            MediaBrowserCompatItemCallbackStubApi23 = i5 % 128;
            int i6 = i5 % 2;
        } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 3) {
            creditCardDetailsActivity.MediaBrowserCompat.setImageResource(2131230901);
        } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 != 4) {
            creditCardDetailsActivity.MediaBrowserCompat.setImageResource(2131230899);
        } else {
            creditCardDetailsActivity.MediaBrowserCompat.setImageResource(2131230898);
        }
        creditCardDetailsActivity.setCallbacksMessenger.b("CC Card Details", creditCardDetailsActivity.getIntent().getBooleanExtra("First Page", true));
        UIKitCustomSetting uIKitCustomSetting = creditCardDetailsActivity.setCallbacksMessenger.b().getUIKitCustomSetting();
        if (uIKitCustomSetting != null) {
            int i7 = onLoadChildren + 81;
            MediaBrowserCompatItemCallbackStubApi23 = i7 % 128;
            if (i7 % 2 == 0) {
                uIKitCustomSetting.isShowEmailInCcForm();
                throw null;
            }
            if (uIKitCustomSetting.isShowEmailInCcForm()) {
                creditCardDetailsActivity.sendCustomAction = true;
                AppCompatEditText appCompatEditText = creditCardDetailsActivity.getSessionToken;
                CustomerDetails customerDetails = creditCardDetailsActivity.setCallbacksMessenger.b().getTransaction().getCustomerDetails();
                if (customerDetails != null) {
                    email = customerDetails.getEmail();
                    int i8 = onLoadChildren + 19;
                    MediaBrowserCompatItemCallbackStubApi23 = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    email = "";
                }
                appCompatEditText.setText(email);
                creditCardDetailsActivity.getSessionToken.clearFocus();
                creditCardDetailsActivity.getSessionToken.addTextChangedListener(new TextWatcher() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.8
                    @Override // android.text.TextWatcher
                    public final void afterTextChanged(Editable editable) {
                        String string = editable.toString();
                        if (!TextUtils.isEmpty(string)) {
                            CreditCardDetailsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CreditCardDetailsActivity.this);
                            if (!TextUtils.isEmpty(string) && !onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string)) {
                                CreditCardDetailsActivity.getItem(CreditCardDetailsActivity.this).setVisibility(0);
                                return;
                            }
                        }
                        CreditCardDetailsActivity.getItem(CreditCardDetailsActivity.this).setVisibility(8);
                    }

                    @Override // android.text.TextWatcher
                    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                    }

                    @Override // android.text.TextWatcher
                    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                    }
                });
                AppCompatEditText appCompatEditText2 = creditCardDetailsActivity.isConnected;
                CustomerDetails customerDetails2 = creditCardDetailsActivity.setCallbacksMessenger.b().getTransaction().getCustomerDetails();
                appCompatEditText2.setText(customerDetails2 != null ? customerDetails2.getPhone() : "");
                creditCardDetailsActivity.isConnected.clearFocus();
                creditCardDetailsActivity.isConnected.addTextChangedListener(new TextWatcher() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.13
                    @Override // android.text.TextWatcher
                    public final void afterTextChanged(Editable editable) {
                        String string = editable.toString();
                        if (TextUtils.isEmpty(string) || string.length() > 5) {
                            CreditCardDetailsActivity.getExtras(CreditCardDetailsActivity.this).setVisibility(8);
                        } else {
                            CreditCardDetailsActivity.getExtras(CreditCardDetailsActivity.this).setVisibility(0);
                        }
                    }

                    @Override // android.text.TextWatcher
                    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                    }

                    @Override // android.text.TextWatcher
                    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                    }
                });
                creditCardDetailsActivity.isConnected.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.11
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z) {
                        if (z) {
                            CreditCardDetailsActivity.write(CreditCardDetailsActivity.this).setSelection(CreditCardDetailsActivity.write(CreditCardDetailsActivity.this).getEditableText().toString().length());
                        }
                    }
                });
                creditCardDetailsActivity.disconnect.setVisibility(0);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d5, code lost:
    
        if (android.text.TextUtils.isEmpty(r2) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01dc, code lost:
    
        if (android.text.TextUtils.isEmpty(r2) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01de, code lost:
    
        r3 = com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.MediaBrowserCompatItemCallbackStubApi23 + 77;
        com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.onLoadChildren = r3 % 128;
        r3 = r3 % 2;
        r0.setVisibility(0);
        r0.setText(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean RemoteActionCompatParcelizer() {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.RemoteActionCompatParcelizer():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0079  */
    /* JADX WARN: Code duplicated, block: B:19:0x0082  */
    /* JADX WARN: Code duplicated, block: B:20:0x0086  */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    /* JADX WARN: Code duplicated, block: B:26:0x009b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00de  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109  */
    /* JADX WARN: Code duplicated, block: B:53:0x010f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0125  */
    /* JADX WARN: Code duplicated, block: B:57:0x012e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0134  */
    /* JADX WARN: Code duplicated, block: B:61:0x013d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0146  */
    /* JADX WARN: Code duplicated, block: B:65:0x014f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0155  */
    /* JADX WARN: Code duplicated, block: B:69:0x015e  */
    private void connect() {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatItemCallbackStubApi23 + 9;
        onLoadChildren = i3 % 128;
        int i4 = i3 % 2;
        String strTrim = this.getItem.getText().toString().trim();
        byte b = 1;
        if (!(!TextUtils.isEmpty(strTrim)) || strTrim.length() < 7) {
            this.getServiceComponent.setImageDrawable(null);
            this.onReceiveResult.setText(R.string.card_details);
            return;
        }
        int i5 = onLoadChildren + 111;
        MediaBrowserCompatItemCallbackStubApi23 = i5 % 128;
        int i6 = i5 % 2;
        String strB = ((filterResolutionsByAspectRatio) this.setCallbacksMessenger).TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(a());
        this.onReceiveResult.setText(R.string.card_details);
        if (strB == null) {
            this.getServiceComponent.setImageDrawable(null);
            return;
        }
        int i7 = MediaBrowserCompatItemCallbackStubApi23 + 61;
        onLoadChildren = i7 % 128;
        if (i7 % 2 == 0) {
            strB.hashCode();
            strB.hashCode();
            switch (strB.hashCode()) {
                case -1482248088:
                    if (strB.equals(BankType.BNI_DEBIT_ONLINE)) {
                        b = 0;
                    }
                    break;
                case 97344:
                    if (!strB.equals("bca")) {
                    }
                    break;
                case 97693:
                    if (strB.equals(BankType.BNI)) {
                        i = onLoadChildren + 13;
                        MediaBrowserCompatItemCallbackStubApi23 = i % 128;
                        if (i % 2 == 0) {
                            b = 2;
                        } else {
                            b = 4;
                        }
                    }
                    break;
                case 97817:
                    if (strB.equals(BankType.BRI)) {
                        int i8 = MediaBrowserCompatItemCallbackStubApi23 + 59;
                        onLoadChildren = i8 % 128;
                        int i9 = i8 % 2;
                        b = 3;
                    }
                    break;
                case 3053691:
                    if (strB.equals(BankType.CIMB)) {
                        b = 4;
                    }
                    break;
                case 3347570:
                    if (strB.equals(BankType.MEGA)) {
                        int i10 = onLoadChildren + 123;
                        MediaBrowserCompatItemCallbackStubApi23 = i10 % 128;
                        int i11 = i10 % 2;
                        b = 5;
                    }
                    break;
                case 835352022:
                    if (strB.equals(BankType.MANDIRI)) {
                        int i12 = MediaBrowserCompatItemCallbackStubApi23 + 11;
                        onLoadChildren = i12 % 128;
                        int i13 = i12 % 2;
                        b = 6;
                    }
                    break;
                case 845443361:
                    if (!strB.equals(BankType.MAYBANK)) {
                        b = 7;
                        break;
                    }
                    break;
                case 1268856131:
                    if (!(!strB.equals(BankType.MANDIRI_DEBIT))) {
                        b = 8;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    this.getServiceComponent.setImageResource(2131230982);
                    this.onReceiveResult.setText(R.string.bni_debit_online_card);
                    break;
                case 1:
                    this.getServiceComponent.setImageResource(2131230903);
                    break;
                case 2:
                    this.getServiceComponent.setImageResource(2131230982);
                    break;
                case 3:
                    this.getServiceComponent.setImageResource(2131230997);
                    break;
                case 4:
                    this.getServiceComponent.setImageResource(2131231011);
                    break;
                case 5:
                    this.getServiceComponent.setImageResource(R.drawable.ic_mega);
                    break;
                case 6:
                    this.getServiceComponent.setImageResource(2131231594);
                    break;
                case 7:
                    this.getServiceComponent.setImageResource(2131231607);
                    break;
                case 8:
                    this.getServiceComponent.setImageResource(2131231594);
                    this.onReceiveResult.setText(R.string.mandiri_debit_card);
                    int i14 = onLoadChildren + 7;
                    MediaBrowserCompatItemCallbackStubApi23 = i14 % 128;
                    int i15 = i14 % 2;
                    break;
                default:
                    this.getServiceComponent.setImageDrawable(null);
                    break;
            }
        }
        strB.hashCode();
        strB.hashCode();
        int i16 = 17 / 0;
        switch (strB.hashCode()) {
            case -1482248088:
                if (strB.equals(BankType.BNI_DEBIT_ONLINE)) {
                    b = 0;
                }
                break;
            case 97344:
                if (!strB.equals("bca")) {
                }
                break;
            case 97693:
                if (strB.equals(BankType.BNI)) {
                    i = onLoadChildren + 13;
                    MediaBrowserCompatItemCallbackStubApi23 = i % 128;
                    if (i % 2 == 0) {
                        b = 2;
                    } else {
                        b = 4;
                    }
                }
                break;
            case 97817:
                if (strB.equals(BankType.BRI)) {
                    int i17 = MediaBrowserCompatItemCallbackStubApi23 + 59;
                    onLoadChildren = i17 % 128;
                    int i18 = i17 % 2;
                    b = 3;
                }
                break;
            case 3053691:
                if (strB.equals(BankType.CIMB)) {
                    b = 4;
                }
                break;
            case 3347570:
                if (strB.equals(BankType.MEGA)) {
                    int i19 = onLoadChildren + 123;
                    MediaBrowserCompatItemCallbackStubApi23 = i19 % 128;
                    int i110 = i19 % 2;
                    b = 5;
                }
                break;
            case 835352022:
                if (strB.equals(BankType.MANDIRI)) {
                    int i111 = MediaBrowserCompatItemCallbackStubApi23 + 11;
                    onLoadChildren = i111 % 128;
                    int i112 = i111 % 2;
                    b = 6;
                }
                break;
            case 845443361:
                if (!strB.equals(BankType.MAYBANK)) {
                    b = 7;
                    break;
                }
                break;
            case 1268856131:
                if (!(!strB.equals(BankType.MANDIRI_DEBIT))) {
                    b = 8;
                }
                break;
        }
        switch (b) {
            case 0:
                this.getServiceComponent.setImageResource(2131230982);
                this.onReceiveResult.setText(R.string.bni_debit_online_card);
                break;
            case 1:
                this.getServiceComponent.setImageResource(2131230903);
                break;
            case 2:
                this.getServiceComponent.setImageResource(2131230982);
                break;
            case 3:
                this.getServiceComponent.setImageResource(2131230997);
                break;
            case 4:
                this.getServiceComponent.setImageResource(2131231011);
                break;
            case 5:
                this.getServiceComponent.setImageResource(R.drawable.ic_mega);
                break;
            case 6:
                this.getServiceComponent.setImageResource(2131231594);
                break;
            case 7:
                this.getServiceComponent.setImageResource(2131231607);
                break;
            case 8:
                this.getServiceComponent.setImageResource(2131231594);
                this.onReceiveResult.setText(R.string.mandiri_debit_card);
                int i113 = onLoadChildren + 7;
                MediaBrowserCompatItemCallbackStubApi23 = i113 % 128;
                int i114 = i113 % 2;
                break;
            default:
                this.getServiceComponent.setImageDrawable(null);
                break;
        }
        b = -1;
        switch (b) {
            case 0:
                this.getServiceComponent.setImageResource(2131230982);
                this.onReceiveResult.setText(R.string.bni_debit_online_card);
                break;
            case 1:
                this.getServiceComponent.setImageResource(2131230903);
                break;
            case 2:
                this.getServiceComponent.setImageResource(2131230982);
                break;
            case 3:
                this.getServiceComponent.setImageResource(2131230997);
                break;
            case 4:
                this.getServiceComponent.setImageResource(2131231011);
                break;
            case 5:
                this.getServiceComponent.setImageResource(R.drawable.ic_mega);
                break;
            case 6:
                this.getServiceComponent.setImageResource(2131231594);
                break;
            case 7:
                this.getServiceComponent.setImageResource(2131231607);
                break;
            case 8:
                this.getServiceComponent.setImageResource(2131231594);
                this.onReceiveResult.setText(R.string.mandiri_debit_card);
                int i115 = onLoadChildren + 7;
                MediaBrowserCompatItemCallbackStubApi23 = i115 % 128;
                int i116 = i115 % 2;
                break;
            default:
                this.getServiceComponent.setImageDrawable(null);
                break;
        }
    }

    @Override // defpackage.getMergedResolutions
    public final boolean cancel() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 95;
        onLoadChildren = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsChecked = this.connect.isChecked();
        int i4 = onLoadChildren + 39;
        MediaBrowserCompatItemCallbackStubApi23 = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsChecked;
        }
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        CreditCardDetailsActivity creditCardDetailsActivity = (CreditCardDetailsActivity) objArr[0];
        int i = 2 % 2;
        SaveCardRequest saveCardRequest = creditCardDetailsActivity.onConnected;
        if (saveCardRequest != null && saveCardRequest.getType() != null && creditCardDetailsActivity.onConnected.getType().equals(SavedToken.ONE_CLICK)) {
            int i2 = MediaBrowserCompatItemCallbackStubApi23 + 85;
            onLoadChildren = i2 % 128;
            return i2 % 2 == 0;
        }
        int i3 = MediaBrowserCompatItemCallbackStubApi23 + 67;
        onLoadChildren = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    private void b(String str, int i) {
        int i2 = 2 % 2;
        Intent intent = new Intent(this, (Class<?>) WebViewPaymentActivity.class);
        intent.putExtra("extra.url", str);
        intent.putExtra("extra.paymentType", "credit_card");
        startActivityForResult(intent, i);
        int i3 = MediaBrowserCompatItemCallbackStubApi23 + 73;
        onLoadChildren = i3 % 128;
        int i4 = i3 % 2;
    }

    private String getItem() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 11;
        onLoadChildren = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.getItem.getText().toString().trim().replace(" ", "");
                throw null;
            }
            String strReplace = this.getItem.getText().toString().trim().replace(" ", "");
            int i3 = MediaBrowserCompatItemCallbackStubApi23 + 65;
            onLoadChildren = i3 % 128;
            int i4 = i3 % 2;
            return strReplace;
        } catch (RuntimeException e2) {
            String str = d;
            StringBuilder sb = new StringBuilder("getCleanedCardNumber():");
            sb.append(e2.getMessage());
            Logger.e(str, sb.toString());
            return "";
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws Throwable {
        Object[] objArr2;
        CreditCardDetailsActivity creditCardDetailsActivity = (CreditCardDetailsActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSize = (char) View.resolveSize(0, 0);
            int i2 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 875;
            int i3 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9;
            byte[] bArr = $$j;
            Object[] objArr3 = new Object[1];
            m((short) (-bArr[9]), (byte) (-bArr[205]), (byte) $$k, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSize, i2, i3, -1199417970, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        n(new char[]{32722, 38531, 32691, 29932, 12633, 15328, 31861, 35611, 57709, 53358, 39600, 59831, 16925, 29604, 63946, 18586, 41947, 4820, 24384, 44956, 1279, 46132, 48680, 3654, 26017, 22316}, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        n(new char[]{30371, 28749, 30406, 10320, 55189, 26457, 16200, 51236, 59392, 13996, 50700, 43766, 19302, 38264, 42292, 2944, 43706, 62468, 1005}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_atm_instruction_7).substring(0, 1).length() - 1, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int i4 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 876;
            int iIndexOf = 10 - TextUtils.indexOf("", "", 0);
            byte[] bArr2 = $$j;
            short s = bArr2[7];
            byte b = (byte) (-bArr2[27]);
            Object[] objArr6 = new Object[1];
            m(s, b, (byte) (b | 36), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(longPressTimeout, i4, iIndexOf, 254769921, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = onLoadChildren + 51;
            MediaBrowserCompatItemCallbackStubApi23 = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                int i7 = 877 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 10;
                byte[] bArr3 = $$j;
                Object[] objArr7 = new Object[1];
                m(bArr3[7], (byte) (-bArr3[205]), (byte) (-bArr3[81]), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration, i7, offsetAfter, 1324201839, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iNextInt = new Random().nextInt();
            int i8 = 1001096684 + (((~iNextInt) | 132774445) * 1444) + (((~(iNextInt | (-986019581))) | (~(1026329809 | iNextInt)) | 46232108) * (-1444)) + 250149534;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr2[1])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            n(new char[]{25601, 7484, 25707, 16565, 47849, 4011, 9425, 54188, 64255, 23508, 44780, 45395, 22982, 63558, 52718, 4116, 47106, 39276, 27400, 63280}, (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            n(new char[]{37938, 47742, 37979, 18710, 7598, 1563, 60664, 7050, 2710, 64659, 42842, 31085, 43482, 24395, 50285, 55340, 18433, 15925, 25258, 16145}, ViewConfiguration.getLongPressTimeout() >> 16, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, creditCardDetailsActivity)).intValue();
            int i11 = MediaBrowserCompatItemCallbackStubApi23 + 23;
            onLoadChildren = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr11 = {Integer.valueOf(iIntValue), 1624019034};
                byte[] bArr4 = $$m;
                byte b2 = bArr4[22];
                Object[] objArr12 = new Object[1];
                o(b2, bArr4[24], b2, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b3 = bArr4[24];
                Object[] objArr13 = new Object[1];
                o(b3, bArr4[22], b3, objArr13);
                Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i13 = 876 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 11;
                    byte[] bArr5 = $$j;
                    Object[] objArr15 = new Object[1];
                    m(bArr5[7], (byte) (-bArr5[205]), (byte) (-bArr5[81]), objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, i13, iLastIndexOf, 1324201839, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                try {
                    Object[] objArr16 = new Object[1];
                    n(new char[]{32722, 38531, 32691, 29932, 12633, 15328, 31861, 35611, 57709, 53358, 39600, 59831, 16925, 29604, 63946, 18586, 41947, 4820, 24384, 44956, 1279, 46132, 48680, 3654, 26017, 22316}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_instruction_step6).substring(49, 56).codePointAt(3) - 105, objArr16);
                    Class<?> cls4 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    n(new char[]{30371, 28749, 30406, 10320, 55189, 26457, 16200, 51236, 59392, 13996, 50700, 43766, 19302, 38264, 42292, 2944, 43706, 62468, 1005}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, objArr17);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                        int iAlpha = Color.alpha(0) + 876;
                        int iIndexOf2 = 9 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        byte[] bArr6 = $$j;
                        short s2 = bArr6[7];
                        byte b4 = (byte) (-bArr6[27]);
                        Object[] objArr18 = new Object[1];
                        m(s2, b4, (byte) (b4 | 36), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iAlpha, iIndexOf2, 254769921, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char offsetAfter2 = (char) TextUtils.getOffsetAfter("", 0);
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 876;
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 11;
                        byte[] bArr7 = $$j;
                        Object[] objArr19 = new Object[1];
                        m((short) (-bArr7[9]), (byte) (-bArr7[205]), (byte) $$k, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetAfter2, doubleTapTimeout, iLastIndexOf2, -1199417970, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr2 = objArr14;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr2[0])[0] != ((int[]) objArr2[2])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr2[3];
            if (strArr == null) {
                throw null;
            }
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i14 = MediaBrowserCompatItemCallbackStubApi23 + 81;
        onLoadChildren = i14 % 128;
        int i15 = i14 % 2;
        int i16 = ((int[]) objArr2[1])[0];
        Object[] objArr20 = {new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
        int iMyUid = Process.myUid();
        int i17 = i16 + 2139239324 + (((~((~iMyUid) | (-845177153))) | (~((-27001908) | iMyUid))) * (-302)) + ((~((-845177153) | iMyUid)) * (-604)) + (((~(iMyUid | (-872179060))) | (-939491196)) * 302);
        int i18 = (i17 << 13) ^ i17;
        int i19 = i18 ^ (i18 >>> 17);
        ((int[]) objArr20[1])[0] = i19 ^ (i19 << 5);
        if (zBooleanValue) {
            creditCardDetailsActivity.INotificationSideChannelDefault.setVisibility(0);
            creditCardDetailsActivity.findViewById(R.id.button_separator).setVisibility(0);
            return null;
        }
        creditCardDetailsActivity.INotificationSideChannelDefault.setVisibility(8);
        View viewFindViewById = creditCardDetailsActivity.findViewById(R.id.button_separator);
        int i20 = ((int[]) objArr20[1])[0];
        int i21 = i20 * i20;
        int i22 = -(1897921255 * i20);
        int i23 = (i21 & i22) + (i21 | i22);
        int i24 = -(i20 * 2110964913);
        int i25 = (((i23 | i24) << 1) - (i24 ^ i23)) - (-1521552016);
        int i26 = i25 >> 28;
        int i27 = ((i26 & (-31)) + (i26 | (-31))) / 16;
        int i28 = (i27 & 1) + (i27 | 1);
        int i29 = ((i25 | i28) << 1) - (i28 ^ i25);
        int i30 = i25 >> 19;
        int i31 = ((i30 ^ (-16383)) + ((i30 & (-16383)) << 1)) / 8192;
        int i32 = (-(((i31 & 1) + (i31 | 1)) ^ i29)) + 5;
        int i33 = i32 >> 24;
        int i34 = ((i33 & (-511)) + (i33 | (-511))) / 256;
        int i35 = ((i34 | 1) << 1) - (i34 ^ 1);
        viewFindViewById.setVisibility(38600 / ((i32 & (-((i35 ^ 1) + ((i35 & 1) << 1)))) * 965));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r12.isSelected() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r12 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r0 = new com.midtrans.sdk.corekit.models.snap.ItemDetails("promo_id", r12.getName(), (-1.0d) * r12.getCalculatedDiscountAmount(), 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (((com.midtrans.sdk.uikit.abstracts.BasePaymentActivity) r11).asBinder == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        new android.os.Handler().postDelayed(new com.midtrans.sdk.uikit.abstracts.BasePaymentActivity.AnonymousClass5(r0), 200);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r12.isSelected() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(com.midtrans.sdk.corekit.models.promo.Promo r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            MediaBrowserCompatCallbackHandler r1 = r11.asBinder
            if (r1 == 0) goto L6d
            r1 = 200(0xc8, double:9.9E-322)
            if (r12 == 0) goto L51
            int r3 = com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.onLoadChildren
            int r3 = r3 + 85
            int r4 = r3 % 128
            com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.MediaBrowserCompatItemCallbackStubApi23 = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L21
            boolean r3 = r12.isSelected()
            r4 = 29
            int r4 = r4 / 0
            if (r3 == 0) goto L51
            goto L27
        L21:
            boolean r3 = r12.isSelected()
            if (r3 == 0) goto L51
        L27:
            if (r12 == 0) goto L3e
            double r3 = r12.getCalculatedDiscountAmount()
            com.midtrans.sdk.corekit.models.snap.ItemDetails r0 = new com.midtrans.sdk.corekit.models.snap.ItemDetails
            java.lang.String r6 = "promo_id"
            java.lang.String r7 = r12.getName()
            r8 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r8 = r8 * r3
            r10 = 1
            r5 = r0
            r5.<init>(r6, r7, r8, r10)
            goto L3f
        L3e:
            r0 = 0
        L3f:
            MediaBrowserCompatCallbackHandler r12 = r11.asBinder
            if (r12 == 0) goto L50
            android.os.Handler r12 = new android.os.Handler
            r12.<init>()
            com.midtrans.sdk.uikit.abstracts.BasePaymentActivity$5 r3 = new com.midtrans.sdk.uikit.abstracts.BasePaymentActivity$5
            r3.<init>(r0)
            r12.postDelayed(r3, r1)
        L50:
            return
        L51:
            MediaBrowserCompatCallbackHandler r12 = r11.asBinder
            if (r12 == 0) goto L6d
            android.os.Handler r12 = new android.os.Handler
            r12.<init>()
            com.midtrans.sdk.uikit.abstracts.BasePaymentActivity$1 r3 = new com.midtrans.sdk.uikit.abstracts.BasePaymentActivity$1
            java.lang.String r4 = "promo_id"
            r3.<init>()
            r12.postDelayed(r3, r1)
            int r12 = com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.MediaBrowserCompatItemCallbackStubApi23
            int r12 = r12 + 41
            int r1 = r12 % 128
            com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.onLoadChildren = r1
            int r12 = r12 % r0
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(com.midtrans.sdk.corekit.models.promo.Promo):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 11;
        int i3 = i2 % 128;
        onLoadChildren = i3;
        int i4 = i2 % 2;
        toRational torational = this.setCallbacksMessenger;
        if (torational != null) {
            int i5 = i3 + 81;
            MediaBrowserCompatItemCallbackStubApi23 = i5 % 128;
            int i6 = i5 % 2;
            torational.TuitionPaymentFragmentbindingInflater1("Back", "CC Card Details");
            int i7 = MediaBrowserCompatItemCallbackStubApi23 + 73;
            onLoadChildren = i7 % 128;
            int i8 = i7 % 2;
        }
        super.onBackPressed();
    }

    public final String a() {
        int i = 2 % 2;
        try {
            String strTrim = this.getItem.getText().toString().trim();
            if (TextUtils.isEmpty(strTrim)) {
                return null;
            }
            int i2 = MediaBrowserCompatItemCallbackStubApi23 + 79;
            onLoadChildren = i2 % 128;
            int i3 = i2 % 2;
            if (strTrim.length() <= 6) {
                return null;
            }
            int i4 = MediaBrowserCompatItemCallbackStubApi23 + 39;
            onLoadChildren = i4 % 128;
            int i5 = i4 % 2;
            return strTrim.replace(" ", "").substring(0, 6);
        } catch (RuntimeException e2) {
            String str = d;
            StringBuilder sb = new StringBuilder("getCardNumberBin:");
            sb.append(e2.getMessage());
            Logger.e(str, sb.toString());
            return null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 43;
        onLoadChildren = i2 % 128;
        int i3 = i2 % 2;
        try {
            b(this.getItem);
            b(this.getNotifyChildrenChangedOptions);
            b(this.getRoot);
            setSecondaryBackgroundColor(this.MediaBrowserCompatCustomActionResultReceiver);
            this.MediaBrowserCompatCustomActionResultReceiver.getBackground().setAlpha(50);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.write);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.connect);
            setTextColor(this.MediaBrowserCompatCustomActionResultReceiver);
            setTextColor(this.MediaBrowserCompatConnectionCallbackStubApi21);
            setTextColor(this.onProgressUpdate);
            setTextColor(this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal);
            setTextColor(this.MediaBrowserCompatCustomActionCallback);
            setTextColor(this.MediaBrowserCompatItemCallback);
            setTextColor(this.INotificationSideChannelStub);
            setTextColor(this.cancelAll);
            FancyButton fancyButton = this.INotificationSideChannelStub;
            int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (i4 != 0) {
                int i5 = onLoadChildren + 79;
                MediaBrowserCompatItemCallbackStubApi23 = i5 % 128;
                int i6 = i5 % 2;
                fancyButton.setBorderColor(i4);
            }
            FancyButton fancyButton2 = this.cancelAll;
            int i7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (i7 != 0) {
                int i8 = MediaBrowserCompatItemCallbackStubApi23 + 5;
                onLoadChildren = i8 % 128;
                int i9 = i8 % 2;
                fancyButton2.setBorderColor(i7);
            }
            setColorFilter(this.RemoteActionCompatParcelizer);
            setColorFilter(this.INotificationSideChannel);
            setColorFilter(this.INotificationSideChannelStubProxy);
            setTextColor(this.INotificationSideChannelDefault);
            FancyButton fancyButton3 = this.INotificationSideChannelDefault;
            int i10 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (i10 != 0) {
                fancyButton3.setIconColorFilter(i10);
                int i11 = MediaBrowserCompatItemCallbackStubApi23 + 77;
                onLoadChildren = i11 % 128;
                int i12 = i11 % 2;
            }
            setPrimaryBackgroundColor(this.getInterfaceDescriptor);
        } catch (Exception e2) {
            String str = d;
            StringBuilder sb = new StringBuilder("rendering theme:");
            sb.append(e2.getMessage());
            Logger.e(str, sb.toString());
        }
    }

    private static /* synthetic */ Object cancelAll(Object[] objArr) {
        CreditCardDetailsActivity creditCardDetailsActivity = (CreditCardDetailsActivity) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 71;
        onLoadChildren = i2 % 128;
        int i3 = i2 % 2;
        creditCardDetailsActivity.getItem = (AppCompatEditText) creditCardDetailsActivity.findViewById(R.id.field_card_number);
        creditCardDetailsActivity.getRoot = (AppCompatEditText) creditCardDetailsActivity.findViewById(R.id.field_cvv);
        creditCardDetailsActivity.getNotifyChildrenChangedOptions = (AppCompatEditText) creditCardDetailsActivity.findViewById(R.id.field_expiry);
        creditCardDetailsActivity.getSessionToken = (AppCompatEditText) creditCardDetailsActivity.findViewById(R.id.field_email);
        creditCardDetailsActivity.isConnected = (AppCompatEditText) creditCardDetailsActivity.findViewById(R.id.field_phone);
        creditCardDetailsActivity.MediaBrowserCompatCustomActionResultReceiver = (TextView) creditCardDetailsActivity.findViewById(R.id.text_installment_term);
        creditCardDetailsActivity.MediaBrowserCompatItemReceiver = (TextView) creditCardDetailsActivity.findViewById(R.id.title_installment);
        creditCardDetailsActivity.onReceiveResult = (SemiBoldTextView) creditCardDetailsActivity.findViewById(R.id.text_page_title);
        creditCardDetailsActivity.MediaBrowserCompatConnectionCallbackStubApi21 = (DefaultTextView) creditCardDetailsActivity.findViewById(R.id.hint_card_number);
        creditCardDetailsActivity.onProgressUpdate = (DefaultTextView) creditCardDetailsActivity.findViewById(R.id.hint_card_expiry);
        creditCardDetailsActivity.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal = (DefaultTextView) creditCardDetailsActivity.findViewById(R.id.hint_card_cvv);
        creditCardDetailsActivity.onResult = (DefaultTextView) creditCardDetailsActivity.findViewById(R.id.text_offer_status_not_applied);
        creditCardDetailsActivity.MediaBrowserCompatCustomActionCallback = (DefaultTextView) creditCardDetailsActivity.findViewById(R.id.hint_user_email);
        creditCardDetailsActivity.MediaBrowserCompatItemCallback = (DefaultTextView) creditCardDetailsActivity.findViewById(R.id.hint_user_phone);
        creditCardDetailsActivity.MediaBrowserCompatConnectionCallback = (TextView) creditCardDetailsActivity.findViewById(R.id.error_message_card_number);
        creditCardDetailsActivity.setInternalConnectionCallback = (TextView) creditCardDetailsActivity.findViewById(R.id.error_message_expiry);
        creditCardDetailsActivity.onConnectionFailed = (TextView) creditCardDetailsActivity.findViewById(R.id.error_message_cvv);
        creditCardDetailsActivity.onError = (TextView) creditCardDetailsActivity.findViewById(R.id.error_message_email);
        creditCardDetailsActivity.onItemLoaded = (TextView) creditCardDetailsActivity.findViewById(R.id.error_message_phone);
        creditCardDetailsActivity.search = (ImageView) creditCardDetailsActivity.findViewById(R.id.payment_card_logo);
        creditCardDetailsActivity.getServiceComponent = (ImageView) creditCardDetailsActivity.findViewById(R.id.bank_logo);
        creditCardDetailsActivity.MediaBrowserCompat = (ImageView) creditCardDetailsActivity.findViewById(R.id.cc_badge);
        creditCardDetailsActivity.INotificationSideChannel = (ImageButton) creditCardDetailsActivity.findViewById(R.id.help_cvv_button);
        creditCardDetailsActivity.RemoteActionCompatParcelizer = (ImageButton) creditCardDetailsActivity.findViewById(R.id.help_save_card);
        creditCardDetailsActivity.INotificationSideChannelStubProxy = (ImageButton) creditCardDetailsActivity.findViewById(R.id.help_bank_point);
        creditCardDetailsActivity.INotificationSideChannelDefault = (FancyButton) creditCardDetailsActivity.findViewById(R.id.button_scan_card);
        creditCardDetailsActivity.cancel = (FancyButton) creditCardDetailsActivity.findViewById(R.id.button_delete);
        creditCardDetailsActivity.getInterfaceDescriptor = (FancyButton) creditCardDetailsActivity.findViewById(R.id.button_primary);
        creditCardDetailsActivity.cancelAll = (FancyButton) creditCardDetailsActivity.findViewById(R.id.button_installment_decrease);
        creditCardDetailsActivity.INotificationSideChannelStub = (FancyButton) creditCardDetailsActivity.findViewById(R.id.button_installment_increase);
        creditCardDetailsActivity.getExtras = (RelativeLayout) creditCardDetailsActivity.findViewById(R.id.container_save_card_details);
        creditCardDetailsActivity.IconCompatParcelizer = (LinearLayout) creditCardDetailsActivity.findViewById(R.id.container_installment);
        creditCardDetailsActivity.read = (RelativeLayout) creditCardDetailsActivity.findViewById(R.id.container_bni_point);
        creditCardDetailsActivity.disconnect = (LinearLayout) creditCardDetailsActivity.findViewById(R.id.container_user_detail);
        creditCardDetailsActivity.write = (AppCompatCheckBox) creditCardDetailsActivity.findViewById(R.id.checkbox_save_card);
        creditCardDetailsActivity.connect = (AppCompatCheckBox) creditCardDetailsActivity.findViewById(R.id.checkbox_point);
        creditCardDetailsActivity.unsubscribe = (RecyclerView) creditCardDetailsActivity.findViewById(R.id.recycler_promo);
        int i4 = MediaBrowserCompatItemCallbackStubApi23 + 45;
        onLoadChildren = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return null;
    }

    @Override // defpackage.computeAreaOverlapping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 11;
        onLoadChildren = i2 % 128;
        int i3 = i2 % 2;
        b();
        int i4 = MediaBrowserCompatItemCallbackStubApi23 + 85;
        onLoadChildren = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        int i = 2 % 2;
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            int i2 = onLoadChildren + 51;
            MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
            int i3 = i2 % 2;
            if (this.TuitionPaymentFragmentbindingInflater1) {
                int i4 = MediaBrowserCompatItemCallbackStubApi23 + 1;
                onLoadChildren = i4 % 128;
                if (i4 % 2 == 0) {
                    b();
                    onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.b(th, this).TuitionPaymentFragmentbindingInflater1);
                } else {
                    b();
                    onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.b(th, this).TuitionPaymentFragmentbindingInflater1);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        }
    }

    @Override // defpackage.getMergedResolutions
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th) {
        int i = 2 % 2;
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            int i2 = onLoadChildren + 45;
            MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
            int i3 = i2 % 2;
            if (!this.TuitionPaymentFragmentbindingInflater1) {
                return;
            }
            int i4 = onLoadChildren + 79;
            MediaBrowserCompatItemCallbackStubApi23 = i4 % 128;
            int i5 = i4 % 2;
            b();
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.b(th, this).TuitionPaymentFragmentbindingInflater1);
        }
    }

    @Override // defpackage.getMergedResolutions
    public final void b(BanksPointResponse banksPointResponse) {
        int i = 2 % 2;
        int i2 = onLoadChildren + 83;
        MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
        if (i2 % 2 == 0) {
            b();
            boolean z = this.TuitionPaymentFragmentbindingInflater1;
            throw null;
        }
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            Intent intent = new Intent(this, (Class<?>) BankPointsActivity.class);
            intent.putExtra("point.balance", Float.parseFloat(banksPointResponse.getPointBalanceAmount()));
            intent.putExtra("point.bank", ((filterResolutionsByAspectRatio) this.setCallbacksMessenger).TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(a()));
            startActivityForResult(intent, TypedValues.PositionType.TYPE_PERCENT_HEIGHT);
            int i3 = onLoadChildren + 115;
            MediaBrowserCompatItemCallbackStubApi23 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 / 3;
            }
        }
    }

    @Override // defpackage.getMergedResolutions
    public final void cancelAll() {
        int i = 2 % 2;
        int i2 = onLoadChildren + 71;
        MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
        int i3 = i2 % 2;
        b();
        if (!this.TuitionPaymentFragmentbindingInflater1) {
            return;
        }
        int i4 = MediaBrowserCompatItemCallbackStubApi23 + 59;
        onLoadChildren = i4 % 128;
        int i5 = i4 % 2;
        onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, getString(R.string.failed_to_get_bank_point));
    }

    @Override // defpackage.getMergedResolutions
    public final void INotificationSideChannel() {
        int i = 2 % 2;
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            int i2 = MediaBrowserCompatItemCallbackStubApi23 + 61;
            onLoadChildren = i2 % 128;
            if (i2 % 2 != 0) {
                onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, getString(R.string.message_getcard_token_failed));
                int i3 = 63 / 0;
            } else {
                onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, getString(R.string.message_getcard_token_failed));
            }
        }
        int i4 = MediaBrowserCompatItemCallbackStubApi23 + 27;
        onLoadChildren = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // defpackage.getMergedResolutions
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = onLoadChildren + 111;
        MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
        int i3 = i2 % 2;
        Logger.d(d, "rba>onGetTransactionStatusFailure()");
        b();
        if (!this.TuitionPaymentFragmentbindingInflater1) {
            return;
        }
        int i4 = onLoadChildren + 85;
        MediaBrowserCompatItemCallbackStubApi23 = i4 % 128;
        int i5 = i4 % 2;
        TuitionPaymentFragmentbindingInflater1(transactionResponse);
        int i6 = MediaBrowserCompatItemCallbackStubApi23 + 117;
        onLoadChildren = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // defpackage.getMergedResolutions
    public final void b(Promo promo) {
        int i = 2 % 2;
        int i2 = onLoadChildren + 91;
        MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            MediaBrowserCompatCallbackHandler mediaBrowserCompatCallbackHandler = ((BasePaymentActivity) this).asBinder;
            obj.hashCode();
            throw null;
        }
        if (((BasePaymentActivity) this).asBinder == null) {
            if (promo == null || !promo.isSelected()) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(j_().getPaymentDetails().getTotalAmount());
                return;
            } else {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(promo.getDiscountedGrossAmount());
                return;
            }
        }
        int i3 = onLoadChildren + 101;
        MediaBrowserCompatItemCallbackStubApi23 = i3 % 128;
        if (i3 % 2 != 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(promo);
        } else {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(promo);
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00db  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:35:0x0107  */
    /* JADX WARN: Code duplicated, block: B:47:0x016e  */
    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        ScannerModel scannerModel;
        String str;
        String str2;
        int i3 = 2 % 2;
        int i4 = MediaBrowserCompatItemCallbackStubApi23 + 67;
        onLoadChildren = i4 % 128;
        if (i4 % 2 != 0) {
            super.onActivityResult(i, i2, intent);
            throw null;
        }
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            if (i2 == 0) {
                if (i == 100) {
                    int i5 = MediaBrowserCompatItemCallbackStubApi23 + 55;
                    onLoadChildren = i5 % 128;
                    if (i5 % 2 == 0) {
                        b();
                        return;
                    } else {
                        b();
                        int i6 = 68 / 0;
                        return;
                    }
                }
                if (i != 102) {
                    if (i == 210) {
                        b(-1);
                        return;
                    }
                    return;
                } else {
                    int i7 = MediaBrowserCompatItemCallbackStubApi23 + 3;
                    onLoadChildren = i7 % 128;
                    if (i7 % 2 == 0) {
                        MediaBrowserCompat();
                        return;
                    } else {
                        MediaBrowserCompat();
                        throw null;
                    }
                }
            }
            return;
        }
        if (i == 100) {
            int i8 = onLoadChildren + 21;
            MediaBrowserCompatItemCallbackStubApi23 = i8 % 128;
            if (i8 % 2 == 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(getString(R.string.processing_payment));
                this.setCallbacksMessenger.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.write.isChecked(), true);
            } else {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(getString(R.string.processing_payment));
                this.setCallbacksMessenger.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.write.isChecked(), false);
            }
        } else if (i == 104) {
            float f = this.subscribe;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(getString(R.string.processing_payment));
            toRational torational = this.setCallbacksMessenger;
            boolean zIsChecked = this.write.isChecked();
            ((filterResolutionsByAspectRatio) torational).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = f;
            torational.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zIsChecked, true);
        } else if (i == 102) {
            MediaBrowserCompat();
        } else if (i == 101) {
            if (intent != null) {
                int i9 = onLoadChildren + 23;
                MediaBrowserCompatItemCallbackStubApi23 = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 5 / 0;
                    if (intent.hasExtra(ExternalScanner.EXTRA_SCAN_DATA)) {
                        scannerModel = (ScannerModel) intent.getSerializableExtra(ExternalScanner.EXTRA_SCAN_DATA);
                        String cardNumber = scannerModel.getCardNumber();
                        if (scannerModel.getExpiredMonth() < 10) {
                            int i11 = MediaBrowserCompatItemCallbackStubApi23 + 73;
                            onLoadChildren = i11 % 128;
                            int i12 = i11 % 2;
                            str = String.format("0%d", Integer.valueOf(scannerModel.getExpiredMonth()));
                        } else {
                            str = String.format(TimeModel.NUMBER_FORMAT, Integer.valueOf(scannerModel.getExpiredMonth()));
                        }
                        Logger.i(String.format("Card Number: %s, Card Expire: %s/%d", cardNumber, str, Integer.valueOf(scannerModel.getExpiredYear() - 2000)));
                        if (scannerModel != null) {
                            String formattedCreditCardNumber = Utils.getFormattedCreditCardNumber(scannerModel.getCardNumber());
                            String cvv = scannerModel.getCvv();
                            if (scannerModel.getExpiredMonth() < 10) {
                                str2 = String.format("0%d", Integer.valueOf(scannerModel.getExpiredMonth()));
                                int i13 = MediaBrowserCompatItemCallbackStubApi23 + 81;
                                onLoadChildren = i13 % 128;
                                int i14 = i13 % 2;
                            } else {
                                str2 = String.format(TimeModel.NUMBER_FORMAT, Integer.valueOf(scannerModel.getExpiredMonth()));
                            }
                            String str3 = String.format("%s/%d", str2, Integer.valueOf(scannerModel.getExpiredYear() - 2000));
                            this.getItem.setText(formattedCreditCardNumber);
                            this.getRoot.setText(cvv);
                            this.getNotifyChildrenChangedOptions.setText(str3);
                        }
                    }
                } else if (intent.hasExtra(ExternalScanner.EXTRA_SCAN_DATA)) {
                    scannerModel = (ScannerModel) intent.getSerializableExtra(ExternalScanner.EXTRA_SCAN_DATA);
                    String cardNumber2 = scannerModel.getCardNumber();
                    if (scannerModel.getExpiredMonth() < 10) {
                        int i15 = MediaBrowserCompatItemCallbackStubApi23 + 73;
                        onLoadChildren = i15 % 128;
                        int i16 = i15 % 2;
                        str = String.format("0%d", Integer.valueOf(scannerModel.getExpiredMonth()));
                    } else {
                        str = String.format(TimeModel.NUMBER_FORMAT, Integer.valueOf(scannerModel.getExpiredMonth()));
                    }
                    Logger.i(String.format("Card Number: %s, Card Expire: %s/%d", cardNumber2, str, Integer.valueOf(scannerModel.getExpiredYear() - 2000)));
                    if (scannerModel != null) {
                        String formattedCreditCardNumber2 = Utils.getFormattedCreditCardNumber(scannerModel.getCardNumber());
                        String cvv2 = scannerModel.getCvv();
                        if (scannerModel.getExpiredMonth() < 10) {
                            str2 = String.format("0%d", Integer.valueOf(scannerModel.getExpiredMonth()));
                            int i17 = MediaBrowserCompatItemCallbackStubApi23 + 81;
                            onLoadChildren = i17 % 128;
                            int i18 = i17 % 2;
                        } else {
                            str2 = String.format(TimeModel.NUMBER_FORMAT, Integer.valueOf(scannerModel.getExpiredMonth()));
                        }
                        String str4 = String.format("%s/%d", str2, Integer.valueOf(scannerModel.getExpiredYear() - 2000));
                        this.getItem.setText(formattedCreditCardNumber2);
                        this.getRoot.setText(cvv2);
                        this.getNotifyChildrenChangedOptions.setText(str4);
                    }
                }
            }
        } else if (i == 210) {
            b(i2);
        } else if (i == 504) {
            int i19 = MediaBrowserCompatItemCallbackStubApi23;
            int i20 = i19 + 45;
            onLoadChildren = i20 % 128;
            int i21 = i20 % 2;
            if (intent != null) {
                int i22 = i19 + 9;
                onLoadChildren = i22 % 128;
                int i23 = i22 % 2;
                this.subscribe = intent.getFloatExtra("point.redeemed", 0.0f);
            }
            if (TextUtils.isEmpty(this.onConnectionSuspended)) {
                float f2 = this.subscribe;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(getString(R.string.processing_payment));
                toRational torational2 = this.setCallbacksMessenger;
                boolean zIsChecked2 = this.write.isChecked();
                ((filterResolutionsByAspectRatio) torational2).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = f2;
                torational2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zIsChecked2, true);
            } else {
                b(this.onConnectionSuspended, 104);
            }
        }
        if (i == 909) {
            int i24 = MediaBrowserCompatItemCallbackStubApi23 + 43;
            onLoadChildren = i24 % 128;
            int i25 = i24 % 2;
            this.connect.setChecked(true);
        }
    }

    @Override // defpackage.getMergedResolutions
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 41;
        onLoadChildren = i2 % 128;
        int i3 = i2 % 2;
        Logger.d(d, "rba>onGetTransactionStatusSuccess()");
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            int i4 = onLoadChildren + 29;
            MediaBrowserCompatItemCallbackStubApi23 = i4 % 128;
            int i5 = i4 % 2;
            TuitionPaymentFragmentbindingInflater1(transactionResponse);
            if (i5 == 0) {
                throw null;
            }
        }
    }

    @Override // defpackage.computeAreaOverlapping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 51;
        onLoadChildren = i2 % 128;
        if (i2 % 2 != 0) {
            b();
            boolean z = this.TuitionPaymentFragmentbindingInflater1;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            Intent intent = new Intent();
            intent.putExtra("card.deleted.details", str);
            setResult(TypedValues.PositionType.TYPE_PERCENT_WIDTH, intent);
            onBackPressed();
        }
        int i3 = MediaBrowserCompatItemCallbackStubApi23 + 113;
        onLoadChildren = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws NoSuchMethodException {
        CreditCardDetailsActivity creditCardDetailsActivity = (CreditCardDetailsActivity) objArr[0];
        TransactionResponse transactionResponse = (TransactionResponse) objArr[1];
        int i = 2 % 2;
        int i2 = onLoadChildren + 19;
        MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
        if (i2 % 2 == 0) {
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_face_too_close).substring(18, 19).length() - 817621388;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            b(zzdm.b(), length, SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -533827471, new Object[]{creditCardDetailsActivity, transactionResponse}, 533827478);
            creditCardDetailsActivity.b();
            boolean z = creditCardDetailsActivity.TuitionPaymentFragmentbindingInflater1;
            throw null;
        }
        int length2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_face_too_close).substring(18, 19).length() - 817621388;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(zzdm.b(), length2, SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -533827471, new Object[]{creditCardDetailsActivity, transactionResponse}, 533827478);
        creditCardDetailsActivity.b();
        if (creditCardDetailsActivity.TuitionPaymentFragmentbindingInflater1) {
            int i3 = creditCardDetailsActivity.notify;
            if (i3 < 2) {
                int i4 = MediaBrowserCompatItemCallbackStubApi23 + 39;
                onLoadChildren = i4 % 128;
                int i5 = i4 % 2;
                creditCardDetailsActivity.notify = i3 + 1;
                String string = creditCardDetailsActivity.getString(R.string.message_payment_failed);
                if (transactionResponse != null) {
                    int i6 = MediaBrowserCompatItemCallbackStubApi23 + 91;
                    onLoadChildren = i6 % 128;
                    int i7 = i6 % 2;
                    if (transactionResponse.getStatusCode().equals("411") && (!TextUtils.isEmpty(transactionResponse.getStatusMessage())) && transactionResponse.getStatusMessage().toLowerCase().contains("promo is not available")) {
                        int i8 = onLoadChildren + 117;
                        MediaBrowserCompatItemCallbackStubApi23 = i8 % 128;
                        if (i8 % 2 == 0) {
                            string = creditCardDetailsActivity.getString(R.string.promo_unavailable);
                            int i9 = 90 / 0;
                        } else {
                            string = creditCardDetailsActivity.getString(R.string.promo_unavailable);
                        }
                    }
                }
                onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(creditCardDetailsActivity, string);
                return null;
            }
            creditCardDetailsActivity.TuitionPaymentFragmentbindingInflater1(transactionResponse);
        }
        return null;
    }

    @Override // defpackage.getMergedResolutions
    public final void TuitionPaymentFragmentbindingInflater1(TokenDetailsResponse tokenDetailsResponse) {
        int i = 2 % 2;
        if (this.TuitionPaymentFragmentbindingInflater1) {
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
            if (!TextUtils.isEmpty(tokenDetailsResponse.getRedirectUrl())) {
                int i2 = MediaBrowserCompatItemCallbackStubApi23 + 25;
                onLoadChildren = i2 % 128;
                if (i2 % 2 != 0) {
                    this.onConnectionSuspended = tokenDetailsResponse.getRedirectUrl();
                    throw null;
                }
                this.onConnectionSuspended = tokenDetailsResponse.getRedirectUrl();
            }
            final String strB = ((filterResolutionsByAspectRatio) this.setCallbacksMessenger).TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(a());
            if (this.connect.isChecked() && strB != null) {
                final toRational torational = this.setCallbacksMessenger;
                if (torational.f1413a == null) {
                    ((getMergedResolutions) torational.TuitionPaymentFragmentspecialinlinedviewModeldefault1).cancelAll();
                    return;
                } else {
                    torational.b().getBanksPoint(torational.f1413a.getTokenId(), Double.valueOf(torational.b().getPaymentDetails().getTotalAmount()), new BanksPointCallback() { // from class: toRational.4
                        private /* synthetic */ String b;

                        public AnonymousClass4() {
                            str = strB;
                        }

                        @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                        public final void onError(Throwable th) {
                            ((getMergedResolutions) toRational.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).cancelAll();
                        }

                        @Override // com.midtrans.sdk.corekit.callback.BanksPointCallback
                        public final void onFailure(String str) {
                            ((getMergedResolutions) toRational.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).cancelAll();
                        }

                        @Override // com.midtrans.sdk.corekit.callback.BanksPointCallback
                        public final void onSuccess(BanksPointResponse banksPointResponse) {
                            getFallbackAspectRatio getfallbackaspectratio = ((filterResolutionsByAspectRatio) toRational.this).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            String str = str;
                            getCenterCroppedRectangle getcentercroppedrectangle = getfallbackaspectratio.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            getcentercroppedrectangle.TuitionPaymentFragmentbindingInflater1 = banksPointResponse;
                            getcentercroppedrectangle.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
                            ((getMergedResolutions) toRational.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(banksPointResponse);
                        }
                    });
                    return;
                }
            }
            if (!TextUtils.isEmpty(this.onConnectionSuspended)) {
                b(this.onConnectionSuspended, 100);
                return;
            }
            int i3 = MediaBrowserCompatItemCallbackStubApi23 + 77;
            onLoadChildren = i3 % 128;
            if (i3 % 2 != 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(getString(R.string.processing_payment));
                this.setCallbacksMessenger.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.write.isChecked(), true);
            } else {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(getString(R.string.processing_payment));
                this.setCallbacksMessenger.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.write.isChecked(), false);
            }
        }
    }

    private static /* synthetic */ Object notify(Object[] objArr) {
        boolean z = false;
        CreditCardDetailsActivity creditCardDetailsActivity = (CreditCardDetailsActivity) objArr[0];
        TransactionResponse transactionResponse = (TransactionResponse) objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 25;
        onLoadChildren = i2 % 128;
        int i3 = i2 % 2;
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_face_too_close).substring(18, 19).length() - 817621388;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(zzdm.b(), length, SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -533827471, new Object[]{creditCardDetailsActivity, transactionResponse}, 533827478);
        if (!creditCardDetailsActivity.TuitionPaymentFragmentbindingInflater1) {
            creditCardDetailsActivity.b(-1);
            return null;
        }
        toRational torational = creditCardDetailsActivity.setCallbacksMessenger;
        if (transactionResponse != null) {
            String transactionStatus = transactionResponse.getTransactionStatus();
            if (!TextUtils.isEmpty(transactionStatus)) {
                int i4 = MediaBrowserCompatItemCallbackStubApi23 + 83;
                onLoadChildren = i4 % 128;
                int i5 = i4 % 2;
                if (transactionStatus.equals(TransactionResult.STATUS_PENDING)) {
                    int i6 = onLoadChildren + 41;
                    MediaBrowserCompatItemCallbackStubApi23 = i6 % 128;
                    int i7 = i6 % 2;
                    z = true;
                }
            }
        }
        if (!(!z)) {
            creditCardDetailsActivity.b(transactionResponse.getRedirectUrl(), 102);
            return null;
        }
        creditCardDetailsActivity.b();
        creditCardDetailsActivity.TuitionPaymentFragmentbindingInflater1(transactionResponse);
        return null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException {
        String currency;
        int i = 2 % 2;
        int i2 = onLoadChildren + 19;
        MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i5 = ~elapsedCpuTime;
        if (i4 != ((((~(937291615 | i5)) | (~((-831078684) | elapsedCpuTime))) * 988) - 48871164) + (((~(elapsedCpuTime | 936200475)) | 1091140 | (~(i5 | (-831078684)))) * 988)) {
            int i6 = 939371424 % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        if (i7 != 444474800 + (((-339083283) | iMaxMemory) * (-627)) + (((~((-1673634726) | iMaxMemory)) | 905421239) * (-627)) + (((~(iMaxMemory | 905421239)) | (~((~iMaxMemory) | 1673634725))) * 627)) {
            throw new RuntimeException("1833523473");
        }
        super.onCreate(bundle);
        getWindow().setFlags(8192, 8192);
        this.onConnected = (SaveCardRequest) getIntent().getSerializableExtra("extra.card.saved");
        this.setCallbacksMessenger = new toRational(this, this);
        setContentView(R.layout.activity_credit_card);
        this.getItem.addTextChangedListener(new TextWatcher() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.22
            private boolean TuitionPaymentFragmentbindingInflater1;
            private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            private int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                Object[] objArr = {CreditCardDetailsActivity.this};
                ((TextView) CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), -2013531028, objArr, 2013531036)).setError(null);
                try {
                    String strTuitionPaymentFragmentbindingInflater1 = CreditCardDetailsActivity.TuitionPaymentFragmentbindingInflater1(editable.toString().replaceAll("[\\s-]+", ""));
                    if (editable.length() <= 0) {
                        Object[] objArr2 = {CreditCardDetailsActivity.this};
                        if (((DefaultTextView) CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), 1757658991, objArr2, -1757658982)) != null) {
                            CreditCardDetailsActivity.TuitionPaymentFragmentbindingInflater1(CreditCardDetailsActivity.this);
                        }
                    } else if (!this.TuitionPaymentFragmentbindingInflater1) {
                        if (editable.charAt(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == ' ') {
                            int i8 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            editable.delete(i8 - 1, i8);
                        }
                        if (strTuitionPaymentFragmentbindingInflater1.charAt(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == ' ') {
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 2;
                        } else {
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                        }
                    } else if (editable.charAt(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1) == ' ') {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1;
                    } else {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    }
                    String cardType = Utils.getCardType(editable.toString());
                    if (editable.length() >= 18 && cardType.equals(CreditCardDetailsActivity.this.getString(R.string.amex))) {
                        if (editable.length() == 19) {
                            editable.delete(editable.length() - 1, editable.length());
                        }
                        Object[] objArr3 = {CreditCardDetailsActivity.this};
                        if (((Boolean) CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), -2013257040, objArr3, 2013257043)).booleanValue()) {
                            Object[] objArr4 = {CreditCardDetailsActivity.this};
                            ((AppCompatEditText) CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), 1300546827, objArr4, -1300546825)).requestFocus();
                        }
                    } else if (editable.length() == 19) {
                        Object[] objArr5 = {CreditCardDetailsActivity.this};
                        if (((Boolean) CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), -2013257040, objArr5, 2013257043)).booleanValue()) {
                            Object[] objArr6 = {CreditCardDetailsActivity.this};
                            ((AppCompatEditText) CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), 1300546827, objArr6, -1300546825)).requestFocus();
                        }
                    }
                    CreditCardDetailsActivity.g(CreditCardDetailsActivity.this).removeTextChangedListener(this);
                    CreditCardDetailsActivity.g(CreditCardDetailsActivity.this).setText(strTuitionPaymentFragmentbindingInflater1);
                    if (!TextUtils.isEmpty(strTuitionPaymentFragmentbindingInflater1)) {
                        CreditCardDetailsActivity.g(CreditCardDetailsActivity.this).setSelection(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    }
                    CreditCardDetailsActivity.g(CreditCardDetailsActivity.this).addTextChangedListener(this);
                    CreditCardDetailsActivity.asInterface(CreditCardDetailsActivity.this);
                    CreditCardDetailsActivity.d(CreditCardDetailsActivity.this);
                    CreditCardDetailsActivity.a(CreditCardDetailsActivity.this);
                } catch (RuntimeException e2) {
                    String strG = CreditCardDetailsActivity.g();
                    StringBuilder sb = new StringBuilder("inputCcNumber:");
                    sb.append(e2.getMessage());
                    Logger.e(strG, sb.toString());
                }
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8;
                this.TuitionPaymentFragmentbindingInflater1 = i10 == 0;
            }
        });
        this.getItem.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.24
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) throws NoSuchMethodException {
                if (z) {
                    return;
                }
                Object[] objArr = {CreditCardDetailsActivity.this};
                int iB = zzdm.b();
                int iB2 = zzdm.b();
                ((Boolean) CreditCardDetailsActivity.b(zzdm.b(), iB, zzdm.b(), iB2, -2013257040, objArr, 2013257043)).booleanValue();
                CreditCardDetailsActivity.INotificationSideChannel(CreditCardDetailsActivity.this);
                CreditCardDetailsActivity.connect(CreditCardDetailsActivity.this);
                CreditCardDetailsActivity.cancel(CreditCardDetailsActivity.this);
            }
        });
        this.getNotifyChildrenChangedOptions.addTextChangedListener(new TextWatcher() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.3
            /* JADX INFO: Removed unreachable split cross block B:46:0x0377 */
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String string = editable.toString();
                try {
                    if (editable.length() == 4) {
                        if (CreditCardDetailsActivity.notify(CreditCardDetailsActivity.this).length() > editable.length()) {
                            try {
                                if (Integer.parseInt(string.substring(0, 2)) <= 12) {
                                    Object[] objArr = {CreditCardDetailsActivity.this};
                                    AppCompatEditText appCompatEditText = (AppCompatEditText) CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), 1300546827, objArr, -1300546825);
                                    Object[] objArr2 = {CreditCardDetailsActivity.this};
                                    appCompatEditText.setText(((AppCompatEditText) CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), 1300546827, objArr2, -1300546825)).getText().toString().substring(0, 1));
                                    Object[] objArr3 = {CreditCardDetailsActivity.this};
                                    AppCompatEditText appCompatEditText2 = (AppCompatEditText) CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), 1300546827, objArr3, -1300546825);
                                    Object[] objArr4 = {CreditCardDetailsActivity.this};
                                    appCompatEditText2.setSelection(((AppCompatEditText) CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), 1300546827, objArr4, -1300546825)).getText().toString().length());
                                } else {
                                    Object[] objArr5 = {CreditCardDetailsActivity.this};
                                    ((AppCompatEditText) CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), 1300546827, objArr5, -1300546825)).setText("");
                                    Object[] objArr6 = {CreditCardDetailsActivity.this};
                                    AppCompatEditText appCompatEditText3 = (AppCompatEditText) CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), 1300546827, objArr6, -1300546825);
                                    Object[] objArr7 = {CreditCardDetailsActivity.this};
                                    appCompatEditText3.setSelection(((AppCompatEditText) CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), 1300546827, objArr7, -1300546825)).getText().toString().length());
                                }
                            } catch (Exception e2) {
                                Logger.e(e2.toString());
                            }
                        }
                    } else if (editable.length() == 2) {
                        if (CreditCardDetailsActivity.notify(CreditCardDetailsActivity.this).length() < editable.length()) {
                            try {
                                if (Integer.parseInt(string) <= 12) {
                                    Object[] objArr8 = {CreditCardDetailsActivity.this};
                                    AppCompatEditText appCompatEditText4 = (AppCompatEditText) CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), 1300546827, objArr8, -1300546825);
                                    CreditCardDetailsActivity creditCardDetailsActivity = CreditCardDetailsActivity.this;
                                    int iB = zzdm.b();
                                    int iB2 = zzdm.b();
                                    appCompatEditText4.setText(creditCardDetailsActivity.getString(R.string.expiry_month_format, ((AppCompatEditText) CreditCardDetailsActivity.b(zzdm.b(), iB, zzdm.b(), iB2, 1300546827, new Object[]{creditCardDetailsActivity}, -1300546825)).getText().toString()));
                                    Object[] objArr9 = {CreditCardDetailsActivity.this};
                                    AppCompatEditText appCompatEditText5 = (AppCompatEditText) CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), 1300546827, objArr9, -1300546825);
                                    Object[] objArr10 = {CreditCardDetailsActivity.this};
                                    appCompatEditText5.setSelection(((AppCompatEditText) CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), 1300546827, objArr10, -1300546825)).getText().toString().length());
                                } else {
                                    Object[] objArr11 = {CreditCardDetailsActivity.this};
                                    ((AppCompatEditText) CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), 1300546827, objArr11, -1300546825)).setText(CreditCardDetailsActivity.this.getString(R.string.expiry_month_int_format, 12));
                                    Object[] objArr12 = {CreditCardDetailsActivity.this};
                                    AppCompatEditText appCompatEditText6 = (AppCompatEditText) CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), 1300546827, objArr12, -1300546825);
                                    Object[] objArr13 = {CreditCardDetailsActivity.this};
                                    appCompatEditText6.setSelection(((AppCompatEditText) CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), 1300546827, objArr13, -1300546825)).getText().toString().length());
                                }
                            } catch (Exception e3) {
                                Logger.e(e3.toString());
                            }
                        }
                    } else if (editable.length() == 1) {
                        try {
                            if (Integer.parseInt(string) > 1) {
                                Object[] objArr14 = {CreditCardDetailsActivity.this};
                                AppCompatEditText appCompatEditText7 = (AppCompatEditText) CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), 1300546827, objArr14, -1300546825);
                                CreditCardDetailsActivity creditCardDetailsActivity2 = CreditCardDetailsActivity.this;
                                int iB3 = zzdm.b();
                                int iB4 = zzdm.b();
                                appCompatEditText7.setText(creditCardDetailsActivity2.getString(R.string.expiry_month_single_digit_format, ((AppCompatEditText) CreditCardDetailsActivity.b(zzdm.b(), iB3, zzdm.b(), iB4, 1300546827, new Object[]{creditCardDetailsActivity2}, -1300546825)).getText().toString()));
                                Object[] objArr15 = {CreditCardDetailsActivity.this};
                                AppCompatEditText appCompatEditText8 = (AppCompatEditText) CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), 1300546827, objArr15, -1300546825);
                                Object[] objArr16 = {CreditCardDetailsActivity.this};
                                appCompatEditText8.setSelection(((AppCompatEditText) CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), 1300546827, objArr16, -1300546825)).getText().toString().length());
                            }
                        } catch (Exception e4) {
                            Logger.e(e4.toString());
                        }
                    }
                } catch (RuntimeException e5) {
                    String strG = CreditCardDetailsActivity.g();
                    StringBuilder sb = new StringBuilder("ccexpiry:");
                    sb.append(e5.getMessage());
                    Logger.e(strG, sb.toString());
                }
                CreditCardDetailsActivity creditCardDetailsActivity3 = CreditCardDetailsActivity.this;
                int iB5 = zzdm.b();
                int iB6 = zzdm.b();
                Object[] objArr17 = {creditCardDetailsActivity3, ((AppCompatEditText) CreditCardDetailsActivity.b(zzdm.b(), iB5, zzdm.b(), iB6, 1300546827, new Object[]{creditCardDetailsActivity3}, -1300546825)).getText().toString()};
                if (editable.length() == 7) {
                    CreditCardDetailsActivity.INotificationSideChannelStub(CreditCardDetailsActivity.this).requestFocus();
                }
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            }
        });
        this.getNotifyChildrenChangedOptions.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    return;
                }
                CreditCardDetailsActivity.getInterfaceDescriptor(CreditCardDetailsActivity.this);
            }
        });
        this.getRoot.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    return;
                }
                CreditCardDetailsActivity.INotificationSideChannelDefault(CreditCardDetailsActivity.this);
            }
        });
        this.getInterfaceDescriptor.setTextBold();
        this.getInterfaceDescriptor.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CreditCardDetailsActivity.this);
                    if (CreditCardDetailsActivity.RemoteActionCompatParcelizer(CreditCardDetailsActivity.this) && CreditCardDetailsActivity.INotificationSideChannelStubProxy(CreditCardDetailsActivity.this)) {
                        Object[] objArr = {CreditCardDetailsActivity.this};
                        if (((Boolean) CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), 2104298852, objArr, -2104298837)).booleanValue()) {
                            Transaction transaction = CreditCardDetailsActivity.this.j_().getTransaction();
                            CustomerDetails customerDetails = transaction.getCustomerDetails();
                            String string = CreditCardDetailsActivity.read(CreditCardDetailsActivity.this).getEditableText().toString();
                            String string2 = CreditCardDetailsActivity.write(CreditCardDetailsActivity.this).getEditableText().toString();
                            if (customerDetails != null) {
                                if (!string.isEmpty() || !string2.isEmpty()) {
                                    customerDetails.setEmail(string);
                                    customerDetails.setPhone(string2);
                                    transaction.setCustomerDetails(new CustomerDetails(customerDetails.getFirstName(), customerDetails.getLastName(), customerDetails.getEmail(), customerDetails.getPhone()));
                                    CreditCardDetailsActivity.this.j_().setTransaction(transaction);
                                }
                            } else if (!string.isEmpty() || !string2.isEmpty()) {
                                transaction.setCustomerDetails(new CustomerDetails(null, null, string.toString(), string2.toString()));
                                CreditCardDetailsActivity.this.j_().setTransaction(transaction);
                            }
                        }
                        if (CreditCardDetailsActivity.MediaBrowserCompat(CreditCardDetailsActivity.this)) {
                            CreditCardDetailsActivity.getNotifyChildrenChangedOptions(CreditCardDetailsActivity.this);
                            CreditCardDetailsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CreditCardDetailsActivity.this).TuitionPaymentFragmentbindingInflater1(CreditCardDetailsActivity.disconnect(CreditCardDetailsActivity.this) == 0 ? "Confirm Payment Credit Card" : "Retry Credit Card", "CC Card Details");
                            CreditCardDetailsActivity.getRoot(CreditCardDetailsActivity.this);
                        }
                    }
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.INotificationSideChannel.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    AlertDialog alertDialogCreate = new AlertDialog.Builder(CreditCardDetailsActivity.this).setTitle(R.string.what_is_cvv).setView(R.layout.dialog_cvv).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.7.5
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i8) {
                            dialogInterface.dismiss();
                        }
                    }).create();
                    alertDialogCreate.show();
                    CreditCardDetailsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CreditCardDetailsActivity.this, alertDialogCreate);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.6
            private static short[] d;
            private static final byte[] $$c = {91, -17, 90, 37};
            private static final int $$d = 197;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {0, -94, -62, -97, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 239;
            private static int asBinder = 0;
            private static int asInterface = 1;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -147575025;
            private static int TuitionPaymentFragmentbindingInflater1 = -1934795637;
            private static int b = -848888777;
            private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {76, -71, -112, -78, -113, -124, 105, -98, -5, -113, -118, -78, -113, -124, -119, 126, -53, -72, -69, -122, -105, -65, -106, 67, 74, 125, 46, -104, 68, 79, 126, 80, 71, 123, 70, 121, 69, 52, -106, 84, 71, 83, -91, -44, -71, -13, -33, -90, -55, -85, -34, -46, -47, -48, -36, -113, -85, 29, -47, -102, 18, -90, -91, -51, -90, -33, -96, -119, -30, -45, -46, -47, -82, -42, -95, 126, -59, -5, -22, -5, 73, -117, 38, -93, -109, 96, -101, -112, -102, -120, 105, -97, -101, 85, -93, -109, -99, -102, 95, -47, 97, -111, 103, 80, -82, -115, 109, 84, 114, 70, -101, 104, 99, -104, 98, -112, 113, 103, 99, 92, -91, 103};

            private static void c(short s, int i8, short s2, Object[] objArr) {
                int i9 = 98 - (s * 14);
                byte[] bArr = $$a;
                int i10 = s2 + 4;
                byte[] bArr2 = new byte[i8 + 1];
                int i11 = -1;
                if (bArr == null) {
                    i9 = (i10 + (-i9)) - 11;
                    i10 = i10;
                    i11 = -1;
                }
                while (true) {
                    int i12 = i11 + 1;
                    int i13 = i10 + 1;
                    bArr2[i12] = (byte) i9;
                    if (i12 == i8) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    i9 = (i9 + (-bArr[i13])) - 11;
                    i10 = i13;
                    i11 = i12;
                }
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int i8 = 2 % 2;
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    AlertDialog alertDialogCreate = new AlertDialog.Builder(CreditCardDetailsActivity.this).setTitle(R.string.save_card_message).setMessage(R.string.save_card_dialog).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.6.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i9) {
                            dialogInterface.dismiss();
                        }
                    }).create();
                    alertDialogCreate.show();
                    CreditCardDetailsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CreditCardDetailsActivity.this, alertDialogCreate);
                    ViewPortBuilder.b();
                    int i9 = asBinder + 93;
                    asInterface = i9 % 128;
                    if (i9 % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                } catch (Throwable th) {
                    ViewPortBuilder.b();
                    throw th;
                }
            }

            /* JADX WARN: Code duplicated, block: B:59:0x0286  */
            private static void a(int i8, int i9, short s, byte b2, int i10, Object[] objArr) throws Throwable {
                boolean z;
                int i11;
                boolean z2;
                int i12;
                int i13 = 2;
                int i14 = 2 % 2;
                SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr2 = {Integer.valueOf(i9), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2268, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 34, 1387473586, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    if (iIntValue == -1) {
                        int i15 = $10 + 7;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        if (bArr != null) {
                            int i17 = $10 + 117;
                            $11 = i17 % 128;
                            int i18 = i17 % 2;
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            int i19 = 0;
                            while (i19 < length) {
                                int i20 = $11 + 37;
                                $10 = i20 % 128;
                                if (i20 % i13 != 0) {
                                    try {
                                        Object[] objArr3 = {Integer.valueOf(bArr[i19])};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            byte b5 = (byte) 0;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.red(0) + 3358, TextUtils.getCapsMode("", 0, 0) + 18, -1054011043, false, $$e(b5, b5, (byte) $$c.length), new Class[]{Integer.TYPE});
                                        }
                                        bArr2[i19] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                        i19 /= 0;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                } else {
                                    Object[] objArr4 = {Integer.valueOf(bArr[i19])};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        byte b6 = (byte) 0;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 3358 - KeyEvent.getDeadChar(0, 0), 18 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1054011043, false, $$e(b6, b6, (byte) $$c.length), new Class[]{Integer.TYPE});
                                    }
                                    bArr2[i19] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                                    i19++;
                                }
                                i13 = 2;
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            int i21 = $11 + 63;
                            $10 = i21 % 128;
                            if (i21 % 2 != 0) {
                                byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                Object[] objArr5 = {Integer.valueOf(i10), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b7 = (byte) 0;
                                    byte b8 = b7;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (MotionEvent.axisFromString("") + 1), AndroidCharacter.getMirror('0') + 2219, TextUtils.indexOf("", "", 0) + 33, 1387473586, false, $$e(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                i12 = ((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) * 3046761265686732006L)) << ((int) (((long) TuitionPaymentFragmentbindingInflater1) / 3046761265686732006L));
                            } else {
                                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                Object[] objArr6 = {Integer.valueOf(i10), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    byte b9 = (byte) 0;
                                    byte b10 = b9;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2266, 33 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1387473586, false, $$e(b9, b10, b10), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                i12 = ((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L));
                            }
                            iIntValue = (byte) i12;
                        } else {
                            iIntValue = (short) (((short) (((long) d[i10 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                        }
                    }
                    if (iIntValue > 0) {
                        int i22 = $11 + 115;
                        int i23 = i22 % 128;
                        $10 = i23;
                        int i24 = i22 % 2;
                        int i25 = ((i10 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L));
                        if (z) {
                            int i26 = i23 + 95;
                            $11 = i26 % 128;
                            if (i26 % 2 == 0) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                        } else {
                            i11 = 0;
                        }
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i25 + i11;
                        Object[] objArr7 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i8), Integer.valueOf(b), sb};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            byte b11 = (byte) 0;
                            byte b12 = b11;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 55904), ImageFormat.getBitsPerPixel(0) + 2856, (-16777203) - Color.rgb(0, 0, 0), -1529949196, false, $$e(b11, b12, (byte) (b12 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        byte[] bArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        if (bArr5 != null) {
                            int length2 = bArr5.length;
                            byte[] bArr6 = new byte[length2];
                            for (int i27 = 0; i27 < length2; i27++) {
                                bArr6[i27] = (byte) (((long) bArr5[i27]) ^ 3046761265686732006L);
                            }
                            bArr5 = bArr6;
                        }
                        if (bArr5 != null) {
                            z2 = true;
                        } else {
                            int i28 = $11 + 17;
                            $10 = i28 % 128;
                            int i29 = i28 % 2;
                            z2 = false;
                        }
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                        while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                            if (z2) {
                                byte[] bArr7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i30 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i30 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i30]) ^ 3046761265686732006L)) + s)) ^ b2));
                                int i31 = $10 + 45;
                                $11 = i31 % 128;
                                if (i31 % 2 == 0) {
                                    int i32 = 4 % 3;
                                }
                            } else {
                                short[] sArr = d;
                                int i33 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i33 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i33]) ^ 3046761265686732006L)) + s)) ^ b2));
                            }
                            sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                        }
                    }
                    objArr[0] = sb.toString();
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }

            /* JADX WARN: Code duplicated, block: B:101:0x0b65  */
            /* JADX WARN: Code duplicated, block: B:104:0x0bfc  */
            /* JADX WARN: Code duplicated, block: B:115:0x051b A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:18:0x03b2  */
            /* JADX WARN: Code duplicated, block: B:41:0x0508  */
            /* JADX WARN: Code duplicated, block: B:43:0x050e  */
            /* JADX WARN: Code duplicated, block: B:47:0x0521  */
            /* JADX WARN: Code duplicated, block: B:51:0x055a  */
            /* JADX WARN: Code duplicated, block: B:52:0x0574  */
            /* JADX WARN: Code duplicated, block: B:59:0x06c6  */
            /* JADX WARN: Code duplicated, block: B:63:0x06f0 A[Catch: all -> 0x07c9, TryCatch #5 {all -> 0x07c9, blocks: (B:61:0x06e3, B:63:0x06f0, B:64:0x072e), top: B:120:0x06e3, outer: #2 }] */
            /* JADX WARN: Code duplicated, block: B:72:0x07d2 A[Catch: Exception -> 0x0b1e, TRY_LEAVE, TryCatch #2 {Exception -> 0x0b1e, blocks: (B:44:0x051b, B:48:0x0530, B:54:0x059b, B:56:0x0649, B:60:0x06c8, B:66:0x077d, B:68:0x07ca, B:70:0x07d0, B:71:0x07d1, B:72:0x07d2, B:61:0x06e3, B:63:0x06f0, B:64:0x072e), top: B:115:0x051b, inners: #5 }] */
            /* JADX WARN: Code duplicated, block: B:75:0x0800 A[Catch: all -> 0x08e1, TryCatch #1 {all -> 0x08e1, blocks: (B:73:0x07f3, B:75:0x0800, B:76:0x0837), top: B:113:0x07f3, outer: #0 }] */
            /* JADX WARN: Code duplicated, block: B:84:0x08ec A[Catch: Exception -> 0x0b20, TRY_LEAVE, TryCatch #0 {Exception -> 0x0b20, blocks: (B:78:0x088c, B:80:0x08e2, B:82:0x08ea, B:83:0x08eb, B:84:0x08ec, B:89:0x0b0d, B:93:0x0b16, B:95:0x0b1c, B:96:0x0b1d, B:73:0x07f3, B:75:0x0800, B:76:0x0837, B:85:0x0ab7, B:87:0x0ac4, B:88:0x0b06), top: B:112:0x051f, inners: #1, #3 }] */
            /* JADX WARN: Code duplicated, block: B:87:0x0ac4 A[Catch: all -> 0x0b15, TryCatch #3 {all -> 0x0b15, blocks: (B:85:0x0ab7, B:87:0x0ac4, B:88:0x0b06), top: B:116:0x0ab7, outer: #0 }] */
            /* JADX WARN: Code duplicated, block: B:8:0x002c  */
            /* JADX WARN: Code duplicated, block: B:91:0x0b13  */
            /* JADX WARN: Code duplicated, block: B:98:0x0b20 A[PHI: r21
  0x0b20: PHI (r21v6 byte) = (r21v5 byte), (r21v8 byte), (r21v9 byte) binds: [B:97:0x0b1e, B:111:0x0b20, B:90:0x0b11] A[DONT_GENERATE, DONT_INLINE]] */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i8, int i9, int i10) throws Throwable {
                byte b2;
                int i11;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                String str;
                Object[] objArr;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i17;
                int i18;
                int i19;
                int i20;
                int i21;
                int i22;
                int i23;
                short s;
                int i24;
                int i25;
                int i26;
                int i27;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                int i28 = 2 % 2;
                int i29 = asBinder;
                int i30 = i29 + 115;
                asInterface = i30 % 128;
                int i31 = i30 % 2;
                int i32 = ((i29 | 115) << 1) - (i29 ^ 115);
                int i33 = i32 % 128;
                asInterface = i33;
                if (i32 % 2 == 0) {
                    int i34 = 90 / 0;
                    if (context != null) {
                        int i35 = i33 + 17;
                        asBinder = i35 % 128;
                        int i36 = i35 % 2;
                        try {
                            int i37 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int iTuitionPaymentFragmentbindingInflater1 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                            int i38 = i37 * 860;
                            int i39 = ((i38 | (-2072529056)) << 1) - (i38 ^ (-2072529056));
                            int i40 = ((i37 ^ iTuitionPaymentFragmentbindingInflater1) | (i37 & iTuitionPaymentFragmentbindingInflater1)) * (-859);
                            int i41 = (i39 & i40) + (i40 | i39);
                            int i42 = ~iTuitionPaymentFragmentbindingInflater1;
                            int i43 = ~((i42 ^ i37) | (i42 & i37));
                            int i44 = ~i37;
                            int i45 = (i44 ^ 1103863919) | (i44 & 1103863919);
                            int i46 = ~((i45 ^ iTuitionPaymentFragmentbindingInflater1) | (i45 & iTuitionPaymentFragmentbindingInflater1));
                            int i47 = (i41 - (~(((i46 & i43) | (i43 ^ i46)) * 859))) - 1;
                            int i48 = ~(1103863919 | i42);
                            int i49 = ~(1103863919 | i37);
                            int i50 = (i47 - (~(-(-(((i49 & i48) | (i48 ^ i49)) * 859))))) - 1;
                            int i51 = (-111) - (~(-TextUtils.getCapsMode("", 0, 0)));
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
                            int iTuitionPaymentFragmentbindingInflater2 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                            int i52 = asInterface + 125;
                            asBinder = i52 % 128;
                            int i53 = i52 % 2;
                            int i54 = iNormalizeMetaState * (-501);
                            int i55 = (i54 ^ (-49797)) + ((i54 & (-49797)) << 1);
                            int i56 = ~(98 | iTuitionPaymentFragmentbindingInflater2);
                            int i57 = ~((iNormalizeMetaState ^ (-99)) | (iNormalizeMetaState & (-99)));
                            int i58 = ((i56 & i57) | (i56 ^ i57)) * (-502);
                            int i59 = ((i55 | i58) << 1) - (i58 ^ i55);
                            int i60 = ~iTuitionPaymentFragmentbindingInflater2;
                            int i61 = (i60 & 98) | (98 ^ i60);
                            int i62 = (~((i61 & iNormalizeMetaState) | (i61 ^ iNormalizeMetaState))) * (-502);
                            int i63 = ~iNormalizeMetaState;
                            int i64 = ~((i63 & iTuitionPaymentFragmentbindingInflater2) | (i63 ^ iTuitionPaymentFragmentbindingInflater2));
                            short s2 = (short) ((((i59 & i62) + (i62 | i59)) - (~(((i64 & 98) | (98 ^ i64)) * TypedValues.PositionType.TYPE_DRAWPATH))) - 1);
                            byte b3 = (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i65 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int i66 = ((i65 | (-2073654248)) << 1) - (i65 ^ (-2073654248));
                            Object[] objArr2 = new Object[1];
                            a(i50, i51, s2, b3, i66, objArr2);
                            Class<?> cls = Class.forName((String) objArr2[0]);
                            int i67 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int iTuitionPaymentFragmentbindingInflater3 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                            int i68 = i67 * 253;
                            int i69 = (i68 ^ (-104696002)) + ((i68 & (-104696002)) << 1);
                            int i70 = ~i67;
                            int i71 = ~((i70 ^ 1103863913) | (i70 & 1103863913));
                            int i72 = ~iTuitionPaymentFragmentbindingInflater3;
                            int i73 = (~((1103863913 ^ i72) | (i72 & 1103863913))) | i71;
                            int i74 = i67 | (-1103863914);
                            int i75 = ~((i74 ^ iTuitionPaymentFragmentbindingInflater3) | (i74 & iTuitionPaymentFragmentbindingInflater3));
                            int i76 = i69 + (((i73 ^ i75) | (i73 & i75)) * (-252));
                            int i77 = (i67 ^ (-1103863914)) | (i67 & (-1103863914));
                            int i78 = i76 + (i77 * (-252));
                            int i79 = ~iTuitionPaymentFragmentbindingInflater3;
                            int i80 = ~((i79 & 1103863913) | (1103863913 ^ i79) | i67);
                            int i81 = ~((i77 & iTuitionPaymentFragmentbindingInflater3) | (i77 ^ iTuitionPaymentFragmentbindingInflater3));
                            int i82 = ((i81 & i80) | (i80 ^ i81)) * 252;
                            int i83 = ((i78 | i82) << 1) - (i82 ^ i78);
                            int gidForName = (-111) - Process.getGidForName("");
                            int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0);
                            int i84 = (iNormalizeMetaState2 * (-1335)) - 62031;
                            int i85 = ~((iNormalizeMetaState2 ^ i8) | (iNormalizeMetaState2 & i8));
                            int i86 = -(-(((i85 & (-94)) | ((-94) ^ i85)) * (-668)));
                            int i87 = (i84 ^ i86) + ((i84 & i86) << 1);
                            int i88 = ~((-94) | i8);
                            int i89 = (i87 - (~(-(-(((i88 & iNormalizeMetaState2) | (iNormalizeMetaState2 ^ i88)) * 1336))))) - 1;
                            int i90 = iNormalizeMetaState2 | i8;
                            int i91 = -(-(((i90 & (-94)) | (i90 ^ (-94))) * 668));
                            byte b4 = (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                            int i92 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int i93 = (i92 & (-2073654226)) + (i92 | (-2073654226));
                            Object[] objArr3 = new Object[1];
                            a(i83, gidForName, (short) ((i89 ^ i91) + ((i91 & i89) << 1)), b4, i93, objArr3);
                            Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(context, null);
                            int i94 = -(Process.myTid() >> 22);
                            int i95 = (i94 & (-1103863920)) + (i94 | (-1103863920));
                            int i96 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            int iTuitionPaymentFragmentbindingInflater4 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                            int i97 = (i96 * (-947)) - 103441;
                            int i98 = ((~i96) | (~((108 & iTuitionPaymentFragmentbindingInflater4) | (108 ^ iTuitionPaymentFragmentbindingInflater4)))) * (-948);
                            int i99 = ((i97 | i98) << 1) - (i97 ^ i98);
                            int i100 = (~i96) | 108;
                            int i101 = ~iTuitionPaymentFragmentbindingInflater4;
                            int i102 = i99 + ((~((i101 & i100) | (i100 ^ i101))) * (-948));
                            int i103 = ((i96 & 108) | (i96 ^ 108)) * 948;
                            int i104 = (i102 ^ i103) + ((i103 & i102) << 1);
                            byte modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
                            int iTuitionPaymentFragmentbindingInflater5 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                            int i105 = (modifierMetaStateMask * 866) + 49248;
                            int i106 = ~modifierMetaStateMask;
                            int i107 = ~iTuitionPaymentFragmentbindingInflater5;
                            int i108 = ~((i106 & i107) | (i106 ^ i107));
                            int i109 = ((i108 & 56) | (56 ^ i108)) * (-865);
                            int i110 = (((i105 | i109) << 1) - (i105 ^ i109)) + ((~((modifierMetaStateMask ^ iTuitionPaymentFragmentbindingInflater5) | (modifierMetaStateMask & iTuitionPaymentFragmentbindingInflater5))) * 865);
                            int i111 = ~iTuitionPaymentFragmentbindingInflater5;
                            int i112 = asBinder;
                            int i113 = (i112 ^ 85) + ((i112 & 85) << 1);
                            asInterface = i113 % 128;
                            int i114 = i113 % 2;
                            int i115 = 865 * ((~(modifierMetaStateMask | i111)) | (~((56 & i111) | (56 ^ i111))));
                            short s3 = (short) ((i110 & i115) + (i115 | i110));
                            byte edgeSlop = (byte) (ViewConfiguration.getEdgeSlop() >> 16);
                            int i116 = -ExpandableListView.getPackedPositionChild(0L);
                            int iTuitionPaymentFragmentbindingInflater6 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                            int i117 = ~((~iTuitionPaymentFragmentbindingInflater6) | 2073654208);
                            int i118 = ~((2073654208 ^ i116) | (2073654208 & i116));
                            int i119 = (i116 * (-244)) + 982172810 + (((i117 ^ i118) | (i118 & i117)) * (-245));
                            int i120 = (~((2073654208 ^ iTuitionPaymentFragmentbindingInflater6) | (2073654208 & iTuitionPaymentFragmentbindingInflater6))) * (-245);
                            int i121 = ((i119 | i120) << 1) - (i120 ^ i119);
                            int i122 = ~((2073654208 & iTuitionPaymentFragmentbindingInflater6) | (2073654208 ^ iTuitionPaymentFragmentbindingInflater6));
                            int i123 = ((i116 & i122) | (i116 ^ i122)) * 245;
                            int i124 = (i121 & i123) + (i123 | i121);
                            Object[] objArr4 = new Object[1];
                            b2 = edgeSlop;
                            a(i95, i104, s3, b2 == true ? (byte) 1 : (byte) 0, i124, objArr4);
                            Class<?> cls2 = Class.forName((String) objArr4[0]);
                            int i125 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int iTuitionPaymentFragmentbindingInflater7 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                            int i126 = i125 * 569;
                            int i127 = (i126 & (-1033341850)) + (i126 | (-1033341850));
                            int i128 = ~i125;
                            int i129 = ~((i128 & 1103863913) | (i128 ^ 1103863913));
                            int i130 = ~i125;
                            int i131 = ~iTuitionPaymentFragmentbindingInflater7;
                            int i132 = ~((i130 ^ i131) | (i130 & i131));
                            int i133 = (i129 ^ i132) | (i129 & i132);
                            int i134 = ~(1103863913 | i131);
                            int i135 = -(-(((i133 ^ i134) | (i133 & i134)) * (-1136)));
                            int i136 = (i127 & i135) + (i135 | i127);
                            int i137 = (~((i130 ^ iTuitionPaymentFragmentbindingInflater7) | (i130 & iTuitionPaymentFragmentbindingInflater7))) | (~((1103863913 ^ iTuitionPaymentFragmentbindingInflater7) | (1103863913 & iTuitionPaymentFragmentbindingInflater7)));
                            int i138 = ~iTuitionPaymentFragmentbindingInflater7;
                            int i139 = (i138 ^ i125) | (i125 & i138);
                            int i140 = ~(i139 | (-1103863914));
                            int i141 = ((i137 ^ i140) | (i137 & i140)) * (-568);
                            int i142 = (i136 ^ i141) + ((i141 & i136) << 1);
                            int i143 = (~i139) | (~((i131 ^ (-1103863914)) | ((-1103863914) & i131)));
                            int i144 = asBinder + 67;
                            asInterface = i144 % 128;
                            int i145 = i144 % 2;
                            int i146 = 568 * (i143 | (~(iTuitionPaymentFragmentbindingInflater7 | (i130 ^ 1103863913) | (i130 & 1103863913))));
                            int i147 = -(-ExpandableListView.getPackedPositionType(0L));
                            int i148 = (i147 & (-110)) + (i147 | (-110));
                            int touchSlop = ViewConfiguration.getTouchSlop() >> 8;
                            byte packedPositionChild = (byte) (ExpandableListView.getPackedPositionChild(0L) + 1);
                            int i149 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                            int i150 = ((i149 | (-2073654174)) << 1) - (i149 ^ (-2073654174));
                            Object[] objArr5 = new Object[1];
                            a(((i142 | i146) << 1) - (i146 ^ i142), i148, (short) ((touchSlop ^ (-23)) + ((touchSlop & (-23)) << 1)), packedPositionChild, i150, objArr5);
                            int i151 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                            int i152 = -i151;
                            int i153 = ((i151 & i152) | (i151 ^ i152)) >> 31;
                            int i154 = (~i153) & i8;
                            int i155 = i153 & (i8 ^ 1);
                            i11 = (i155 & i154) | (i154 ^ i155);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } else {
                        i11 = i8;
                    }
                } else if (context != null) {
                    int i310 = i33 + 17;
                    asBinder = i310 % 128;
                    int i311 = i310 % 2;
                    int i312 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iTuitionPaymentFragmentbindingInflater8 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                    int i313 = i312 * 860;
                    int i314 = ((i313 | (-2072529056)) << 1) - (i313 ^ (-2072529056));
                    int i410 = ((i312 ^ iTuitionPaymentFragmentbindingInflater8) | (i312 & iTuitionPaymentFragmentbindingInflater8)) * (-859);
                    int i411 = (i314 & i410) + (i410 | i314);
                    int i412 = ~iTuitionPaymentFragmentbindingInflater8;
                    int i413 = ~((i412 ^ i312) | (i412 & i312));
                    int i414 = ~i312;
                    int i415 = (i414 ^ 1103863919) | (i414 & 1103863919);
                    int i416 = ~((i415 ^ iTuitionPaymentFragmentbindingInflater8) | (i415 & iTuitionPaymentFragmentbindingInflater8));
                    int i417 = (i411 - (~(((i416 & i413) | (i413 ^ i416)) * 859))) - 1;
                    int i418 = ~(1103863919 | i412);
                    int i419 = ~(1103863919 | i312);
                    int i510 = (i417 - (~(-(-(((i419 & i418) | (i418 ^ i419)) * 859))))) - 1;
                    int i511 = (-111) - (~(-TextUtils.getCapsMode("", 0, 0)));
                    int iNormalizeMetaState3 = KeyEvent.normalizeMetaState(0);
                    int iTuitionPaymentFragmentbindingInflater9 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                    int i512 = asInterface + 125;
                    asBinder = i512 % 128;
                    int i513 = i512 % 2;
                    int i514 = iNormalizeMetaState3 * (-501);
                    int i515 = (i514 ^ (-49797)) + ((i514 & (-49797)) << 1);
                    int i516 = ~(98 | iTuitionPaymentFragmentbindingInflater9);
                    int i517 = ~((iNormalizeMetaState3 ^ (-99)) | (iNormalizeMetaState3 & (-99)));
                    int i518 = ((i516 & i517) | (i516 ^ i517)) * (-502);
                    int i519 = ((i515 | i518) << 1) - (i518 ^ i515);
                    int i610 = ~iTuitionPaymentFragmentbindingInflater9;
                    int i611 = (i610 & 98) | (98 ^ i610);
                    int i612 = (~((i611 & iNormalizeMetaState3) | (i611 ^ iNormalizeMetaState3))) * (-502);
                    int i613 = ~iNormalizeMetaState3;
                    int i614 = ~((i613 & iTuitionPaymentFragmentbindingInflater9) | (i613 ^ iTuitionPaymentFragmentbindingInflater9));
                    short s4 = (short) ((((i519 & i612) + (i612 | i519)) - (~(((i614 & 98) | (98 ^ i614)) * TypedValues.PositionType.TYPE_DRAWPATH))) - 1);
                    byte b5 = (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i615 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int i616 = ((i615 | (-2073654248)) << 1) - (i615 ^ (-2073654248));
                    Object[] objArr6 = new Object[1];
                    a(i510, i511, s4, b5, i616, objArr6);
                    Class<?> cls3 = Class.forName((String) objArr6[0]);
                    int i617 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iTuitionPaymentFragmentbindingInflater10 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                    int i618 = i617 * 253;
                    int i619 = (i618 ^ (-104696002)) + ((i618 & (-104696002)) << 1);
                    int i710 = ~i617;
                    int i711 = ~((i710 ^ 1103863913) | (i710 & 1103863913));
                    int i712 = ~iTuitionPaymentFragmentbindingInflater10;
                    int i713 = (~((1103863913 ^ i712) | (i712 & 1103863913))) | i711;
                    int i714 = i617 | (-1103863914);
                    int i715 = ~((i714 ^ iTuitionPaymentFragmentbindingInflater10) | (i714 & iTuitionPaymentFragmentbindingInflater10));
                    int i716 = i619 + (((i713 ^ i715) | (i713 & i715)) * (-252));
                    int i717 = (i617 ^ (-1103863914)) | (i617 & (-1103863914));
                    int i718 = i716 + (i717 * (-252));
                    int i719 = ~iTuitionPaymentFragmentbindingInflater10;
                    int i810 = ~((i719 & 1103863913) | (1103863913 ^ i719) | i617);
                    int i811 = ~((i717 & iTuitionPaymentFragmentbindingInflater10) | (i717 ^ iTuitionPaymentFragmentbindingInflater10));
                    int i812 = ((i811 & i810) | (i810 ^ i811)) * 252;
                    int i813 = ((i718 | i812) << 1) - (i812 ^ i718);
                    int gidForName2 = (-111) - Process.getGidForName("");
                    int iNormalizeMetaState4 = KeyEvent.normalizeMetaState(0);
                    int i814 = (iNormalizeMetaState4 * (-1335)) - 62031;
                    int i815 = ~((iNormalizeMetaState4 ^ i8) | (iNormalizeMetaState4 & i8));
                    int i816 = -(-(((i815 & (-94)) | ((-94) ^ i815)) * (-668)));
                    int i817 = (i814 ^ i816) + ((i814 & i816) << 1);
                    int i818 = ~((-94) | i8);
                    int i819 = (i817 - (~(-(-(((i818 & iNormalizeMetaState4) | (iNormalizeMetaState4 ^ i818)) * 1336))))) - 1;
                    int i910 = iNormalizeMetaState4 | i8;
                    int i911 = -(-(((i910 & (-94)) | (i910 ^ (-94))) * 668));
                    byte b6 = (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                    int i912 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int i913 = (i912 & (-2073654226)) + (i912 | (-2073654226));
                    Object[] objArr7 = new Object[1];
                    a(i813, gidForName2, (short) ((i819 ^ i911) + ((i911 & i819) << 1)), b6, i913, objArr7);
                    Object objInvoke2 = cls3.getMethod((String) objArr7[0], null).invoke(context, null);
                    int i914 = -(Process.myTid() >> 22);
                    int i915 = (i914 & (-1103863920)) + (i914 | (-1103863920));
                    int i916 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int iTuitionPaymentFragmentbindingInflater11 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                    int i917 = (i916 * (-947)) - 103441;
                    int i918 = ((~i916) | (~((108 & iTuitionPaymentFragmentbindingInflater11) | (108 ^ iTuitionPaymentFragmentbindingInflater11)))) * (-948);
                    int i919 = ((i917 | i918) << 1) - (i917 ^ i918);
                    int i1010 = (~i916) | 108;
                    int i1011 = ~iTuitionPaymentFragmentbindingInflater11;
                    int i1012 = i919 + ((~((i1011 & i1010) | (i1010 ^ i1011))) * (-948));
                    int i1013 = ((i916 & 108) | (i916 ^ 108)) * 948;
                    int i1014 = (i1012 ^ i1013) + ((i1013 & i1012) << 1);
                    byte modifierMetaStateMask2 = (byte) KeyEvent.getModifierMetaStateMask();
                    int iTuitionPaymentFragmentbindingInflater12 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                    int i1015 = (modifierMetaStateMask2 * 866) + 49248;
                    int i1016 = ~modifierMetaStateMask2;
                    int i1017 = ~iTuitionPaymentFragmentbindingInflater12;
                    int i1018 = ~((i1016 & i1017) | (i1016 ^ i1017));
                    int i1019 = ((i1018 & 56) | (56 ^ i1018)) * (-865);
                    int i1110 = (((i1015 | i1019) << 1) - (i1015 ^ i1019)) + ((~((modifierMetaStateMask2 ^ iTuitionPaymentFragmentbindingInflater12) | (modifierMetaStateMask2 & iTuitionPaymentFragmentbindingInflater12))) * 865);
                    int i1111 = ~iTuitionPaymentFragmentbindingInflater12;
                    int i1112 = asBinder;
                    int i1113 = (i1112 ^ 85) + ((i1112 & 85) << 1);
                    asInterface = i1113 % 128;
                    int i1114 = i1113 % 2;
                    int i1115 = 865 * ((~(modifierMetaStateMask2 | i1111)) | (~((56 & i1111) | (56 ^ i1111))));
                    short s5 = (short) ((i1110 & i1115) + (i1115 | i1110));
                    byte edgeSlop2 = (byte) (ViewConfiguration.getEdgeSlop() >> 16);
                    int i1116 = -ExpandableListView.getPackedPositionChild(0L);
                    int iTuitionPaymentFragmentbindingInflater13 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                    int i1117 = ~((~iTuitionPaymentFragmentbindingInflater13) | 2073654208);
                    int i1118 = ~((2073654208 ^ i1116) | (2073654208 & i1116));
                    int i1119 = (i1116 * (-244)) + 982172810 + (((i1117 ^ i1118) | (i1118 & i1117)) * (-245));
                    int i1210 = (~((2073654208 ^ iTuitionPaymentFragmentbindingInflater13) | (2073654208 & iTuitionPaymentFragmentbindingInflater13))) * (-245);
                    int i1211 = ((i1119 | i1210) << 1) - (i1210 ^ i1119);
                    int i1212 = ~((2073654208 & iTuitionPaymentFragmentbindingInflater13) | (2073654208 ^ iTuitionPaymentFragmentbindingInflater13));
                    int i1213 = ((i1116 & i1212) | (i1116 ^ i1212)) * 245;
                    int i1214 = (i1211 & i1213) + (i1213 | i1211);
                    Object[] objArr8 = new Object[1];
                    b2 = edgeSlop2;
                    a(i915, i1014, s5, b2 == true ? (byte) 1 : (byte) 0, i1214, objArr8);
                    Class<?> cls4 = Class.forName((String) objArr8[0]);
                    int i1215 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int iTuitionPaymentFragmentbindingInflater14 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                    int i1216 = i1215 * 569;
                    int i1217 = (i1216 & (-1033341850)) + (i1216 | (-1033341850));
                    int i1218 = ~i1215;
                    int i1219 = ~((i1218 & 1103863913) | (i1218 ^ 1103863913));
                    int i1310 = ~i1215;
                    int i1311 = ~iTuitionPaymentFragmentbindingInflater14;
                    int i1312 = ~((i1310 ^ i1311) | (i1310 & i1311));
                    int i1313 = (i1219 ^ i1312) | (i1219 & i1312);
                    int i1314 = ~(1103863913 | i1311);
                    int i1315 = -(-(((i1313 ^ i1314) | (i1313 & i1314)) * (-1136)));
                    int i1316 = (i1217 & i1315) + (i1315 | i1217);
                    int i1317 = (~((i1310 ^ iTuitionPaymentFragmentbindingInflater14) | (i1310 & iTuitionPaymentFragmentbindingInflater14))) | (~((1103863913 ^ iTuitionPaymentFragmentbindingInflater14) | (1103863913 & iTuitionPaymentFragmentbindingInflater14)));
                    int i1318 = ~iTuitionPaymentFragmentbindingInflater14;
                    int i1319 = (i1318 ^ i1215) | (i1215 & i1318);
                    int i1410 = ~(i1319 | (-1103863914));
                    int i1411 = ((i1317 ^ i1410) | (i1317 & i1410)) * (-568);
                    int i1412 = (i1316 ^ i1411) + ((i1411 & i1316) << 1);
                    int i1413 = (~i1319) | (~((i1311 ^ (-1103863914)) | ((-1103863914) & i1311)));
                    int i1414 = asBinder + 67;
                    asInterface = i1414 % 128;
                    int i1415 = i1414 % 2;
                    int i1416 = 568 * (i1413 | (~(iTuitionPaymentFragmentbindingInflater14 | (i1310 ^ 1103863913) | (i1310 & 1103863913))));
                    int i1417 = -(-ExpandableListView.getPackedPositionType(0L));
                    int i1418 = (i1417 & (-110)) + (i1417 | (-110));
                    int touchSlop2 = ViewConfiguration.getTouchSlop() >> 8;
                    byte packedPositionChild2 = (byte) (ExpandableListView.getPackedPositionChild(0L) + 1);
                    int i1419 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                    int i156 = ((i1419 | (-2073654174)) << 1) - (i1419 ^ (-2073654174));
                    Object[] objArr9 = new Object[1];
                    a(((i1412 | i1416) << 1) - (i1416 ^ i1412), i1418, (short) ((touchSlop2 ^ (-23)) + ((touchSlop2 & (-23)) << 1)), packedPositionChild2, i156, objArr9);
                    int i157 = cls4.getField((String) objArr9[0]).getInt(objInvoke2) & 2;
                    int i158 = -i157;
                    int i159 = ((i157 & i158) | (i157 ^ i158)) >> 31;
                    int i1510 = (~i159) & i8;
                    int i1511 = i159 & (i8 ^ 1);
                    i11 = (i1511 & i1510) | (i1510 ^ i1511);
                } else {
                    i11 = i8;
                }
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char gidForName3 = (char) (16948 - Process.getGidForName(""));
                        int iLastIndexOf = 2738 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int iLastIndexOf2 = 12 - TextUtils.lastIndexOf("", '0', 0, 0);
                        byte[] bArr = $$a;
                        Object[] objArr10 = new Object[1];
                        c(bArr[5], (byte) 52, bArr[132], objArr10);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(gidForName3, iLastIndexOf, iLastIndexOf2, 1501733736, false, (String) objArr10[0], new Class[0]);
                    }
                    Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, null);
                    int i160 = asInterface + 25;
                    asBinder = i160 % 128;
                    if (i160 % 2 != 0) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 16949);
                            int i161 = 2738 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int i162 = 14 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            byte b7 = (byte) 52;
                            Object[] objArr11 = new Object[1];
                            c($$a[5], b7, (short) (b7 - 1), objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(deadChar, i161, i162, 47863026, false, (String) objArr11[0], null);
                        }
                        set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null));
                        throw null;
                    }
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16794165);
                        int i163 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2738;
                        int iIndexOf = 12 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        byte b8 = (byte) 52;
                        Object[] objArr12 = new Object[1];
                        c($$a[5], b8, (short) (b8 - 1), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRgb, i163, iIndexOf, 47863026, false, (String) objArr12[0], null);
                    }
                    if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null))) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char cMyTid = (char) (16949 - (Process.myTid() >> 22));
                            int size = 2739 - View.MeasureSpec.getSize(0);
                            int trimmedLength = 13 - TextUtils.getTrimmedLength("");
                            byte b9 = $$a[5];
                            byte b10 = (byte) (b9 | 36);
                            Object[] objArr13 = new Object[1];
                            c(b9, b10, (short) (b10 | 66), objArr13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cMyTid, size, trimmedLength, 631063962, false, (String) objArr13[0], null);
                        }
                        if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null))) {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i164 = asInterface;
                                int i165 = ((i164 | 9) << 1) - (i164 ^ 9);
                                asBinder = i165 % 128;
                                int i166 = i165 % 2;
                                i17 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                int i167 = (-965) - (~(-(-(i17 * (-963)))));
                                i18 = ((i167 | (-76841642)) << 1) - (i167 ^ (-76841642));
                                int i168 = asInterface;
                                i19 = (i168 & 105) + (i168 | 105);
                                asBinder = i19 % 128;
                                if (i19 % 2 != 0) {
                                    int i169 = -((~i17) | (~((1103863969 ^ i8) | (1103863969 & i8))));
                                    i20 = i18 * ((i169 ^ (-964)) + ((i169 & (-964)) << 1));
                                    int i170 = ~i8;
                                    i21 = (~(i17 | 1103863969)) | (~((i170 & 1103863969) | (1103863969 ^ i170)));
                                } else {
                                    int i171 = -(-(((~i17) | (~((1103863969 ^ i8) | (1103863969 & i8)))) * (-964)));
                                    i20 = (i18 ^ i171) + ((i171 & i18) << 1);
                                    int i172 = ~i8;
                                    int i173 = ~((i172 & 1103863969) | (1103863969 ^ i172));
                                    int i174 = ~((i17 & 1103863969) | (1103863969 ^ i17));
                                    i21 = (i174 & i173) | (i173 ^ i174);
                                }
                                i22 = i20 + ((-964) * i21);
                                int i175 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                int i176 = i175 * 46;
                                int i177 = (i176 ^ (-5060)) + ((i176 & (-5060)) << 1);
                                int i178 = ~i8;
                                int i179 = ~((i178 & 109) | (109 ^ i178));
                                int i180 = -(-(((i179 & i175) | (i175 ^ i179)) * (-90)));
                                int i181 = (i177 & i180) + (i180 | i177);
                                int i182 = ~((109 ^ i8) | (109 & i8));
                                int i183 = ~((i175 ^ (-110)) | (i175 & (-110)));
                                int i184 = -(-(((i182 & i183) | (i182 ^ i183)) * (-45)));
                                int i185 = (i181 & i184) + (i184 | i181);
                                int i186 = ~((~i175) | i8);
                                int i187 = (i186 & 109) | (109 ^ i186);
                                int i188 = ~i8;
                                int i189 = ~((i175 & i188) | (i188 ^ i175));
                                int i190 = -(-(((i189 & i187) | (i187 ^ i189)) * 45));
                                i23 = (i185 ^ i190) + ((i190 & i185) << 1);
                                int iRed = Color.red(0);
                                int i191 = asInterface;
                                int i192 = (i191 & 63) + (i191 | 63);
                                int i193 = i192 % 128;
                                asBinder = i193;
                                int i194 = i192 % 2;
                                int i195 = iRed * (-300);
                                int i196 = ((i195 | (-37448)) << 1) - (i195 ^ (-37448));
                                int i197 = (~((iRed ^ (-124)) | (iRed & (-124)) | i8)) * (-301);
                                int i198 = (i196 & i197) + (i197 | i196);
                                int i199 = i193 + 69;
                                asInterface = i199 % 128;
                                int i200 = i199 % 2;
                                int i201 = ~((123 & i8) | (123 ^ i8));
                                int i202 = ~((i188 ^ iRed) | (i188 & iRed));
                                int i203 = (-301) * ((i201 & i202) | (i201 ^ i202));
                                int i204 = ~iRed;
                                int i205 = ~((i204 & i8) | (i204 ^ i8));
                                s = (short) ((i198 & i203) + (i203 | i198) + (((i205 & 123) | (123 ^ i205)) * 301));
                                i24 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int i206 = 241188992 | i188;
                                int i207 = (-1524166555) - (~(((i206 & 796677) | (i206 ^ 796677)) * 1444));
                                int i208 = ~(((-1342975038) & i8) | ((-1342975038) ^ i8));
                                int i209 = (i207 - (~(-(-((((i208 & 796677) | (796677 ^ i208)) | (~((1583367352 & i8) | (1583367352 ^ i8)))) * (-1444)))))) - 1;
                                i25 = (i209 & 1380005396) + (1380005396 | i209);
                                int iTuitionPaymentFragmentbindingInflater15 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                int i210 = ~iTuitionPaymentFragmentbindingInflater15;
                                int i211 = ~((-802014265) | i210);
                                int i212 = ~((857580217 ^ iTuitionPaymentFragmentbindingInflater15) | (857580217 & iTuitionPaymentFragmentbindingInflater15));
                                int i213 = ((i211 & i212) | (i211 ^ i212)) * 959;
                                int i214 = ((-1219764632) ^ i213) + ((i213 & (-1219764632)) << 1);
                                i26 = (i214 & 332534151) + (332534151 | i214);
                                int i215 = ~((iTuitionPaymentFragmentbindingInflater15 & (-802014265)) | ((-802014265) ^ iTuitionPaymentFragmentbindingInflater15));
                                int i216 = ~(i210 | 857580217);
                                i27 = ((i215 & i216) | (i215 ^ i216)) * 959;
                                if (i25 > (i26 ^ i27) + ((i27 & i26) << 1)) {
                                    byte b11 = (byte) i24;
                                    Object[] objArr14 = new Object[1];
                                    a(i22, i23, s, b11, (-2073654170) - (~(-View.getDefaultSize(0, 1))), objArr14);
                                    Object[] objArr15 = {(String) objArr14[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 994;
                                        int iLastIndexOf3 = 7 - TextUtils.lastIndexOf("", '0', 0, 0);
                                        byte b12 = $$a[0];
                                        byte b13 = b12;
                                        Object[] objArr16 = new Object[1];
                                        c(b12, b13, (short) (b13 | 140), objArr16);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, bitsPerPixel, iLastIndexOf3, 410748506, false, (String) objArr16[0], new Class[]{String.class});
                                    }
                                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr15)).longValue();
                                    long j = 1332482729;
                                    long j2 = (((long) 450) * j) + (((long) (-448)) * jLongValue);
                                    long j3 = 449;
                                    long j4 = -1;
                                    long j5 = ((j ^ j4) | jLongValue) ^ j4;
                                    long j6 = jLongValue ^ j4;
                                    long j7 = i8;
                                    long j8 = j2 + ((j5 | (((j6 | j) | j7) ^ j4)) * j3) + (((long) (-1347)) * j5) + (j3 * (j5 | (((j6 | (j7 ^ j4)) | j) ^ j4))) + ((long) (-1533400966));
                                    int i217 = (int) (j8 >>> 88);
                                    int iNextInt = new Random().nextInt();
                                    int i218 = i217 & ((((-818884594) + (((~iNextInt) | 1708283345) * 1324)) + (((~(iNextInt | (-438938159))) | (~(1876164569 | iNextInt))) * (-1324))) - 358240080);
                                    int i219 = ~Process.myPid();
                                    int i220 = ((int) j8) & (832424957 + (((-269090817) | i219) * 184) + (((~(i219 | (-1926896141))) | 1878384238) * 184));
                                    i13 = (i218 & i220) | (i218 ^ i220);
                                    b2 = i11 == true ? 1 : 0;
                                } else {
                                    int i221 = -View.getDefaultSize(0, 0);
                                    int i222 = (i221 ^ (-2073654169)) + ((i221 & (-2073654169)) << 1);
                                    Object[] objArr17 = new Object[1];
                                    a(i22, i23, s, (byte) i24, i222, objArr17);
                                    Object[] objArr18 = {(String) objArr17[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 993;
                                        int iArgb = Color.argb(0, 0, 0, 0) + 8;
                                        byte b14 = $$a[0];
                                        byte b15 = b14;
                                        Object[] objArr19 = new Object[1];
                                        c(b14, b15, (short) (b15 | 140), objArr19);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatTimeout, scrollDefaultDelay, iArgb, 410748506, false, (String) objArr19[0], new Class[]{String.class});
                                    }
                                    long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr18)).longValue();
                                    long j9 = 1487898597;
                                    long j10 = 52;
                                    long j11 = -1;
                                    long j12 = ((long) i8) ^ j11;
                                    long j13 = j12 | j9;
                                    b2 = i11 == true ? 1 : 0;
                                    long j14 = jLongValue2 ^ j11;
                                    long j15 = j9 ^ j11;
                                    long j16 = (((long) (-51)) * j9) + (((long) 53) * jLongValue2) + (((j13 | jLongValue2) ^ j11) * j10) + (((long) (-52)) * (((j14 | j12) ^ j11) | ((j14 | j9) ^ j11) | (j13 ^ j11))) + (j10 * (((j15 | jLongValue2) ^ j11) | ((j15 | j12) ^ j11))) + ((long) (-1688816834));
                                    int i223 = (int) (j16 >> 32);
                                    int iMyTid = Process.myTid();
                                    int i224 = i223 & (1704617878 + (((~((-876436435) | iMyTid)) | 874007170) * 305) + (((~((~iMyTid) | (-876436435))) | 1981304450) * 305));
                                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                                    int i225 = 1112788367 + (((~((-2142591822) | iUptimeMillis)) | 1427443781 | (~(715149064 | iUptimeMillis))) * (-754));
                                    int i226 = ~((-1427443782) | iUptimeMillis);
                                    int i227 = ~iUptimeMillis;
                                    int i228 = ((int) j16) & (i225 + ((i226 | (~(2142592845 | i227))) * (-754)) + ((i227 | (-2142591822)) * 754));
                                    i13 = (i224 & i228) | (i224 ^ i228);
                                }
                            } else {
                                b2 = i11 == true ? 1 : 0;
                                int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
                                int iTuitionPaymentFragmentbindingInflater16 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                int i229 = pressedStateDuration * 673;
                                int i230 = (i229 ^ 725591904) + ((i229 & 725591904) << 1);
                                int i231 = -(-(((~(pressedStateDuration | iTuitionPaymentFragmentbindingInflater16)) | (-1103863968)) * 672));
                                int i232 = (i230 ^ i231) + ((i231 & i230) << 1);
                                int i233 = ~pressedStateDuration;
                                int i234 = ~iTuitionPaymentFragmentbindingInflater16;
                                int i235 = -(-(((~((i233 & i234) | (i233 ^ i234))) | (~(((-1103863968) & iTuitionPaymentFragmentbindingInflater16) | (iTuitionPaymentFragmentbindingInflater16 ^ (-1103863968))))) * (-672)));
                                int i236 = ~iTuitionPaymentFragmentbindingInflater16;
                                int i237 = ~((i236 & 1103863967) | (1103863967 ^ i236));
                                int i238 = ~((pressedStateDuration & 1103863967) | (1103863967 ^ pressedStateDuration));
                                int i239 = ((((i232 | i235) << 1) - (i235 ^ i232)) - (~(((i238 & i237) | (i237 ^ i238)) * 672))) - 1;
                                int i240 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                int i241 = (i240 & (-109)) + (i240 | (-109));
                                int i242 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                int i243 = i242 * (-755);
                                int i244 = (i243 & 6795) + (i243 | 6795);
                                int i245 = ~i242;
                                int i246 = i244 + ((~((i245 ^ 8) | (i245 & 8))) * 1512);
                                int i247 = ~((i245 & 8) | (i245 ^ 8));
                                int i248 = (i242 & (-9)) | (i242 ^ (-9));
                                int i249 = ~(i248 | i8);
                                int i250 = ((i247 & i249) | (i247 ^ i249)) * (-756);
                                int i251 = (i246 ^ i250) + ((i250 & i246) << 1);
                                int i252 = ~i8;
                                Object[] objArr20 = new Object[1];
                                a(i239, i241, (short) ((i251 - (~(-(-(((i248 & i252) | (i248 ^ i252)) * 756))))) - 1), (byte) ((-1) - ImageFormat.getBitsPerPixel(0)), (-2073654141) - (~(-(-Process.getGidForName("")))), objArr20);
                                str = (String) objArr20[0];
                                int i253 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                int i254 = i253 * 71;
                                int i255 = (i254 & (-1142801952)) + (i254 | (-1142801952));
                                int i256 = ~i253;
                                int i257 = ~((i256 & (-1103863904)) | (i256 ^ (-1103863904)));
                                int i258 = ~(i8 | (-1103863904));
                                int i259 = -(-(((i257 & i258) | (i257 ^ i258)) * (-140)));
                                int i260 = (i255 & i259) + (i259 | i255);
                                int i261 = (i253 ^ (-1103863904)) | (i253 & (-1103863904));
                                int i262 = i260 + ((~((i261 & i8) | (i261 ^ i8))) * 70);
                                int i263 = ~i253;
                                int i264 = ~((i263 & (-1103863904)) | (i263 ^ (-1103863904)));
                                int i265 = ~((1103863903 & i253) | (1103863903 ^ i253));
                                int i266 = (i264 & i265) | (i264 ^ i265);
                                int i267 = ~((i253 & i8) | (i253 ^ i8));
                                int i268 = i262 + (((i267 & i266) | (i266 ^ i267)) * 70);
                                int iAxisFromString = MotionEvent.axisFromString("");
                                int i269 = ((iAxisFromString | (-109)) << 1) - (iAxisFromString ^ (-109));
                                int i270 = -Color.argb(0, 0, 0, 0);
                                int i271 = i270 * (-464);
                                int i272 = ((i271 | (-115196)) << 1) - (i271 ^ (-115196));
                                int i273 = ~i270;
                                int i274 = (i8 ^ 124) | (i8 & 124);
                                int i275 = ((~i274) | i273) * (-465);
                                int i276 = ((i272 | i275) << 1) - (i275 ^ i272);
                                int i277 = ~((i273 ^ i8) | (i273 & i8));
                                short s6 = (short) (((i276 - (~(-(-(((i277 & 124) | (i277 ^ 124)) * 930))))) - 1) + ((i273 | i274) * 465));
                                byte size2 = (byte) View.MeasureSpec.getSize(0);
                                int i278 = -((byte) KeyEvent.getModifierMetaStateMask());
                                int i279 = i278 * 624;
                                int i280 = (2073654140 ^ i278) | (2073654140 & i278);
                                int i281 = (((i279 & 1322686902) + (i279 | 1322686902)) - (~(-(-((~((i280 & i8) | (i280 ^ i8))) * 623))))) - 1;
                                int i282 = ~i278;
                                int i283 = ~((i282 & (-2073654141)) | (i282 ^ (-2073654141)));
                                int i284 = ((i252 & i283) | (i252 ^ i283)) * (-623);
                                int i285 = ((i281 | i284) << 1) - (i284 ^ i281);
                                int i286 = ((~((2073654140 ^ i278) | (2073654140 & i278))) | (~((2073654140 & i8) | (2073654140 ^ i8))) | (~((i278 & i8) | (i278 ^ i8)))) * 623;
                                int i287 = ((i285 | i286) << 1) - (i286 ^ i285);
                                Object[] objArr21 = new Object[1];
                                a(i268, i269, s6, size2, i287, objArr21);
                                objArr = new Object[]{(String) objArr21[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 33602);
                                    int iIndexOf2 = TextUtils.indexOf("", "") + 3085;
                                    int packedPositionGroup = 26 - ExpandableListView.getPackedPositionGroup(0L);
                                    byte b16 = $$a[0];
                                    byte b17 = b16;
                                    Object[] objArr22 = new Object[1];
                                    c(b16, b17, (short) (b17 | 140), objArr22);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, iIndexOf2, packedPositionGroup, 1411172903, false, (String) objArr22[0], new Class[]{String.class});
                                }
                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                            }
                            int i288 = (i8 & (-11)) | ((~i8) & 10);
                            int i289 = -i13;
                            int i290 = asBinder;
                            int i291 = (i290 ^ 43) + ((i290 & 43) << 1);
                            int i292 = i291 % 128;
                            asInterface = i292;
                            int i293 = i291 % 2;
                            int i294 = ((i13 & i289) | (i13 ^ i289)) >> 31;
                            int i295 = (i292 & 73) + (i292 | 73);
                            asBinder = i295 % 128;
                            int i296 = i295 % 2;
                            int i297 = (~i294) & i8;
                            int i298 = i294 & i288;
                            i14 = (i298 & i297) | (i297 ^ i298);
                            int i299 = i9 & 32;
                            int i300 = -i299;
                            i15 = ((i299 & i300) | (i299 ^ i300)) >> 31;
                            i16 = (i292 & 37) + (i292 | 37);
                            asBinder = i16 % 128;
                            if (i16 % 2 != 0) {
                                throw null;
                            }
                            int i301 = i14 & (~i15);
                            int i302 = i15 & i8;
                            i12 = (i301 & i302) | (i301 ^ i302);
                            i11 = b2;
                        } else if (Build.VERSION.SDK_INT == 30) {
                            int i303 = asBinder + 17;
                            asInterface = i303 % 128;
                            int i304 = i303 % 2;
                            i12 = i8;
                        } else {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i1610 = asInterface;
                                int i1611 = ((i1610 | 9) << 1) - (i1610 ^ 9);
                                asBinder = i1611 % 128;
                                int i1612 = i1611 % 2;
                                i17 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                int i1613 = (-965) - (~(-(-(i17 * (-963)))));
                                i18 = ((i1613 | (-76841642)) << 1) - (i1613 ^ (-76841642));
                                int i1614 = asInterface;
                                i19 = (i1614 & 105) + (i1614 | 105);
                                asBinder = i19 % 128;
                                if (i19 % 2 != 0) {
                                    int i1615 = -((~i17) | (~((1103863969 ^ i8) | (1103863969 & i8))));
                                    i20 = i18 * ((i1615 ^ (-964)) + ((i1615 & (-964)) << 1));
                                    int i1710 = ~i8;
                                    i21 = (~(i17 | 1103863969)) | (~((i1710 & 1103863969) | (1103863969 ^ i1710)));
                                } else {
                                    int i1711 = -(-(((~i17) | (~((1103863969 ^ i8) | (1103863969 & i8)))) * (-964)));
                                    i20 = (i18 ^ i1711) + ((i1711 & i18) << 1);
                                    int i1712 = ~i8;
                                    int i1713 = ~((i1712 & 1103863969) | (1103863969 ^ i1712));
                                    int i1714 = ~((i17 & 1103863969) | (1103863969 ^ i17));
                                    i21 = (i1714 & i1713) | (i1713 ^ i1714);
                                }
                                i22 = i20 + ((-964) * i21);
                                int i1715 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                int i1716 = i1715 * 46;
                                int i1717 = (i1716 ^ (-5060)) + ((i1716 & (-5060)) << 1);
                                int i1718 = ~i8;
                                int i1719 = ~((i1718 & 109) | (109 ^ i1718));
                                int i1810 = -(-(((i1719 & i1715) | (i1715 ^ i1719)) * (-90)));
                                int i1811 = (i1717 & i1810) + (i1810 | i1717);
                                int i1812 = ~((109 ^ i8) | (109 & i8));
                                int i1813 = ~((i1715 ^ (-110)) | (i1715 & (-110)));
                                int i1814 = -(-(((i1812 & i1813) | (i1812 ^ i1813)) * (-45)));
                                int i1815 = (i1811 & i1814) + (i1814 | i1811);
                                int i1816 = ~((~i1715) | i8);
                                int i1817 = (i1816 & 109) | (109 ^ i1816);
                                int i1818 = ~i8;
                                int i1819 = ~((i1715 & i1818) | (i1818 ^ i1715));
                                int i1910 = -(-(((i1819 & i1817) | (i1817 ^ i1819)) * 45));
                                i23 = (i1815 ^ i1910) + ((i1910 & i1815) << 1);
                                int iRed2 = Color.red(0);
                                int i1911 = asInterface;
                                int i1912 = (i1911 & 63) + (i1911 | 63);
                                int i1913 = i1912 % 128;
                                asBinder = i1913;
                                int i1914 = i1912 % 2;
                                int i1915 = iRed2 * (-300);
                                int i1916 = ((i1915 | (-37448)) << 1) - (i1915 ^ (-37448));
                                int i1917 = (~((iRed2 ^ (-124)) | (iRed2 & (-124)) | i8)) * (-301);
                                int i1918 = (i1916 & i1917) + (i1917 | i1916);
                                int i1919 = i1913 + 69;
                                asInterface = i1919 % 128;
                                int i2010 = i1919 % 2;
                                int i2011 = ~((123 & i8) | (123 ^ i8));
                                int i2012 = ~((i1818 ^ iRed2) | (i1818 & iRed2));
                                int i2013 = (-301) * ((i2011 & i2012) | (i2011 ^ i2012));
                                int i2014 = ~iRed2;
                                int i2015 = ~((i2014 & i8) | (i2014 ^ i8));
                                s = (short) ((i1918 & i2013) + (i2013 | i1918) + (((i2015 & 123) | (123 ^ i2015)) * 301));
                                i24 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int i2016 = 241188992 | i1818;
                                int i2017 = (-1524166555) - (~(((i2016 & 796677) | (i2016 ^ 796677)) * 1444));
                                int i2018 = ~(((-1342975038) & i8) | ((-1342975038) ^ i8));
                                int i2019 = (i2017 - (~(-(-((((i2018 & 796677) | (796677 ^ i2018)) | (~((1583367352 & i8) | (1583367352 ^ i8)))) * (-1444)))))) - 1;
                                i25 = (i2019 & 1380005396) + (1380005396 | i2019);
                                int iTuitionPaymentFragmentbindingInflater17 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                int i2110 = ~iTuitionPaymentFragmentbindingInflater17;
                                int i2111 = ~((-802014265) | i2110);
                                int i2112 = ~((857580217 ^ iTuitionPaymentFragmentbindingInflater17) | (857580217 & iTuitionPaymentFragmentbindingInflater17));
                                int i2113 = ((i2111 & i2112) | (i2111 ^ i2112)) * 959;
                                int i2114 = ((-1219764632) ^ i2113) + ((i2113 & (-1219764632)) << 1);
                                i26 = (i2114 & 332534151) + (332534151 | i2114);
                                int i2115 = ~((iTuitionPaymentFragmentbindingInflater17 & (-802014265)) | ((-802014265) ^ iTuitionPaymentFragmentbindingInflater17));
                                int i2116 = ~(i2110 | 857580217);
                                i27 = ((i2115 & i2116) | (i2115 ^ i2116)) * 959;
                                if (i25 > (i26 ^ i27) + ((i27 & i26) << 1)) {
                                    byte b18 = (byte) i24;
                                    Object[] objArr110 = new Object[1];
                                    a(i22, i23, s, b18, (-2073654170) - (~(-View.getDefaultSize(0, 1))), objArr110);
                                    Object[] objArr111 = {(String) objArr110[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                        int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 994;
                                        int iLastIndexOf4 = 7 - TextUtils.lastIndexOf("", '0', 0, 0);
                                        byte b19 = $$a[0];
                                        byte b110 = b19;
                                        Object[] objArr112 = new Object[1];
                                        c(b19, b110, (short) (b110 | 140), objArr112);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, bitsPerPixel2, iLastIndexOf4, 410748506, false, (String) objArr112[0], new Class[]{String.class});
                                    }
                                    long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr111)).longValue();
                                    long j17 = 1332482729;
                                    long j18 = (((long) 450) * j17) + (((long) (-448)) * jLongValue3);
                                    long j19 = 449;
                                    long j20 = -1;
                                    long j21 = ((j17 ^ j20) | jLongValue3) ^ j20;
                                    long j22 = jLongValue3 ^ j20;
                                    long j23 = i8;
                                    long j24 = j18 + ((j21 | (((j22 | j17) | j23) ^ j20)) * j19) + (((long) (-1347)) * j21) + (j19 * (j21 | (((j22 | (j23 ^ j20)) | j17) ^ j20))) + ((long) (-1533400966));
                                    int i2117 = (int) (j24 >>> 88);
                                    int iNextInt2 = new Random().nextInt();
                                    int i2118 = i2117 & ((((-818884594) + (((~iNextInt2) | 1708283345) * 1324)) + (((~(iNextInt2 | (-438938159))) | (~(1876164569 | iNextInt2))) * (-1324))) - 358240080);
                                    int i2119 = ~Process.myPid();
                                    int i2210 = ((int) j24) & (832424957 + (((-269090817) | i2119) * 184) + (((~(i2119 | (-1926896141))) | 1878384238) * 184));
                                    i13 = (i2118 & i2210) | (i2118 ^ i2210);
                                    b2 = i11 == true ? 1 : 0;
                                } else {
                                    int i2211 = -View.getDefaultSize(0, 0);
                                    int i2212 = (i2211 ^ (-2073654169)) + ((i2211 & (-2073654169)) << 1);
                                    Object[] objArr113 = new Object[1];
                                    a(i22, i23, s, (byte) i24, i2212, objArr113);
                                    Object[] objArr114 = {(String) objArr113[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                        int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 993;
                                        int iArgb2 = Color.argb(0, 0, 0, 0) + 8;
                                        byte b111 = $$a[0];
                                        byte b112 = b111;
                                        Object[] objArr115 = new Object[1];
                                        c(b111, b112, (short) (b112 | 140), objArr115);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatTimeout2, scrollDefaultDelay2, iArgb2, 410748506, false, (String) objArr115[0], new Class[]{String.class});
                                    }
                                    long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr114)).longValue();
                                    long j25 = 1487898597;
                                    long j110 = 52;
                                    long j111 = -1;
                                    long j112 = ((long) i8) ^ j111;
                                    long j113 = j112 | j25;
                                    b2 = i11 == true ? 1 : 0;
                                    long j114 = jLongValue4 ^ j111;
                                    long j115 = j25 ^ j111;
                                    long j116 = (((long) (-51)) * j25) + (((long) 53) * jLongValue4) + (((j113 | jLongValue4) ^ j111) * j110) + (((long) (-52)) * (((j114 | j112) ^ j111) | ((j114 | j25) ^ j111) | (j113 ^ j111))) + (j110 * (((j115 | jLongValue4) ^ j111) | ((j115 | j112) ^ j111))) + ((long) (-1688816834));
                                    int i2213 = (int) (j116 >> 32);
                                    int iMyTid2 = Process.myTid();
                                    int i2214 = i2213 & (1704617878 + (((~((-876436435) | iMyTid2)) | 874007170) * 305) + (((~((~iMyTid2) | (-876436435))) | 1981304450) * 305));
                                    int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                                    int i2215 = 1112788367 + (((~((-2142591822) | iUptimeMillis2)) | 1427443781 | (~(715149064 | iUptimeMillis2))) * (-754));
                                    int i2216 = ~((-1427443782) | iUptimeMillis2);
                                    int i2217 = ~iUptimeMillis2;
                                    int i2218 = ((int) j116) & (i2215 + ((i2216 | (~(2142592845 | i2217))) * (-754)) + ((i2217 | (-2142591822)) * 754));
                                    i13 = (i2214 & i2218) | (i2214 ^ i2218);
                                }
                            } else {
                                b2 = i11 == true ? 1 : 0;
                                int pressedStateDuration2 = ViewConfiguration.getPressedStateDuration() >> 16;
                                int iTuitionPaymentFragmentbindingInflater18 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                int i2219 = pressedStateDuration2 * 673;
                                int i2310 = (i2219 ^ 725591904) + ((i2219 & 725591904) << 1);
                                int i2311 = -(-(((~(pressedStateDuration2 | iTuitionPaymentFragmentbindingInflater18)) | (-1103863968)) * 672));
                                int i2312 = (i2310 ^ i2311) + ((i2311 & i2310) << 1);
                                int i2313 = ~pressedStateDuration2;
                                int i2314 = ~iTuitionPaymentFragmentbindingInflater18;
                                int i2315 = -(-(((~((i2313 & i2314) | (i2313 ^ i2314))) | (~(((-1103863968) & iTuitionPaymentFragmentbindingInflater18) | (iTuitionPaymentFragmentbindingInflater18 ^ (-1103863968))))) * (-672)));
                                int i2316 = ~iTuitionPaymentFragmentbindingInflater18;
                                int i2317 = ~((i2316 & 1103863967) | (1103863967 ^ i2316));
                                int i2318 = ~((pressedStateDuration2 & 1103863967) | (1103863967 ^ pressedStateDuration2));
                                int i2319 = ((((i2312 | i2315) << 1) - (i2315 ^ i2312)) - (~(((i2318 & i2317) | (i2317 ^ i2318)) * 672))) - 1;
                                int i2410 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                int i2411 = (i2410 & (-109)) + (i2410 | (-109));
                                int i2412 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                int i2413 = i2412 * (-755);
                                int i2414 = (i2413 & 6795) + (i2413 | 6795);
                                int i2415 = ~i2412;
                                int i2416 = i2414 + ((~((i2415 ^ 8) | (i2415 & 8))) * 1512);
                                int i2417 = ~((i2415 & 8) | (i2415 ^ 8));
                                int i2418 = (i2412 & (-9)) | (i2412 ^ (-9));
                                int i2419 = ~(i2418 | i8);
                                int i2510 = ((i2417 & i2419) | (i2417 ^ i2419)) * (-756);
                                int i2511 = (i2416 ^ i2510) + ((i2510 & i2416) << 1);
                                int i2512 = ~i8;
                                Object[] objArr23 = new Object[1];
                                a(i2319, i2411, (short) ((i2511 - (~(-(-(((i2418 & i2512) | (i2418 ^ i2512)) * 756))))) - 1), (byte) ((-1) - ImageFormat.getBitsPerPixel(0)), (-2073654141) - (~(-(-Process.getGidForName("")))), objArr23);
                                str = (String) objArr23[0];
                                int i2513 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                int i2514 = i2513 * 71;
                                int i2515 = (i2514 & (-1142801952)) + (i2514 | (-1142801952));
                                int i2516 = ~i2513;
                                int i2517 = ~((i2516 & (-1103863904)) | (i2516 ^ (-1103863904)));
                                int i2518 = ~(i8 | (-1103863904));
                                int i2519 = -(-(((i2517 & i2518) | (i2517 ^ i2518)) * (-140)));
                                int i2610 = (i2515 & i2519) + (i2519 | i2515);
                                int i2611 = (i2513 ^ (-1103863904)) | (i2513 & (-1103863904));
                                int i2612 = i2610 + ((~((i2611 & i8) | (i2611 ^ i8))) * 70);
                                int i2613 = ~i2513;
                                int i2614 = ~((i2613 & (-1103863904)) | (i2613 ^ (-1103863904)));
                                int i2615 = ~((1103863903 & i2513) | (1103863903 ^ i2513));
                                int i2616 = (i2614 & i2615) | (i2614 ^ i2615);
                                int i2617 = ~((i2513 & i8) | (i2513 ^ i8));
                                int i2618 = i2612 + (((i2617 & i2616) | (i2616 ^ i2617)) * 70);
                                int iAxisFromString2 = MotionEvent.axisFromString("");
                                int i2619 = ((iAxisFromString2 | (-109)) << 1) - (iAxisFromString2 ^ (-109));
                                int i2710 = -Color.argb(0, 0, 0, 0);
                                int i2711 = i2710 * (-464);
                                int i2712 = ((i2711 | (-115196)) << 1) - (i2711 ^ (-115196));
                                int i2713 = ~i2710;
                                int i2714 = (i8 ^ 124) | (i8 & 124);
                                int i2715 = ((~i2714) | i2713) * (-465);
                                int i2716 = ((i2712 | i2715) << 1) - (i2715 ^ i2712);
                                int i2717 = ~((i2713 ^ i8) | (i2713 & i8));
                                short s7 = (short) (((i2716 - (~(-(-(((i2717 & 124) | (i2717 ^ 124)) * 930))))) - 1) + ((i2713 | i2714) * 465));
                                byte size3 = (byte) View.MeasureSpec.getSize(0);
                                int i2718 = -((byte) KeyEvent.getModifierMetaStateMask());
                                int i2719 = i2718 * 624;
                                int i2810 = (2073654140 ^ i2718) | (2073654140 & i2718);
                                int i2811 = (((i2719 & 1322686902) + (i2719 | 1322686902)) - (~(-(-((~((i2810 & i8) | (i2810 ^ i8))) * 623))))) - 1;
                                int i2812 = ~i2718;
                                int i2813 = ~((i2812 & (-2073654141)) | (i2812 ^ (-2073654141)));
                                int i2814 = ((i2512 & i2813) | (i2512 ^ i2813)) * (-623);
                                int i2815 = ((i2811 | i2814) << 1) - (i2814 ^ i2811);
                                int i2816 = ((~((2073654140 ^ i2718) | (2073654140 & i2718))) | (~((2073654140 & i8) | (2073654140 ^ i8))) | (~((i2718 & i8) | (i2718 ^ i8)))) * 623;
                                int i2817 = ((i2815 | i2816) << 1) - (i2816 ^ i2815);
                                Object[] objArr24 = new Object[1];
                                a(i2618, i2619, s7, size3, i2817, objArr24);
                                objArr = new Object[]{(String) objArr24[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char tapTimeout2 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 33602);
                                    int iIndexOf3 = TextUtils.indexOf("", "") + 3085;
                                    int packedPositionGroup2 = 26 - ExpandableListView.getPackedPositionGroup(0L);
                                    byte b113 = $$a[0];
                                    byte b114 = b113;
                                    Object[] objArr25 = new Object[1];
                                    c(b113, b114, (short) (b114 | 140), objArr25);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout2, iIndexOf3, packedPositionGroup2, 1411172903, false, (String) objArr25[0], new Class[]{String.class});
                                }
                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                            }
                            int i2818 = (i8 & (-11)) | ((~i8) & 10);
                            int i2819 = -i13;
                            int i2910 = asBinder;
                            int i2911 = (i2910 ^ 43) + ((i2910 & 43) << 1);
                            int i2912 = i2911 % 128;
                            asInterface = i2912;
                            int i2913 = i2911 % 2;
                            int i2914 = ((i13 & i2819) | (i13 ^ i2819)) >> 31;
                            int i2915 = (i2912 & 73) + (i2912 | 73);
                            asBinder = i2915 % 128;
                            int i2916 = i2915 % 2;
                            int i2917 = (~i2914) & i8;
                            int i2918 = i2914 & i2818;
                            i14 = (i2918 & i2917) | (i2917 ^ i2918);
                            int i2919 = i9 & 32;
                            int i305 = -i2919;
                            i15 = ((i2919 & i305) | (i2919 ^ i305)) >> 31;
                            i16 = (i2912 & 37) + (i2912 | 37);
                            asBinder = i16 % 128;
                            if (i16 % 2 != 0) {
                                throw null;
                            }
                            int i306 = i14 & (~i15);
                            int i307 = i15 & i8;
                            i12 = (i306 & i307) | (i306 ^ i307);
                            i11 = b2;
                        }
                    } else if (Build.VERSION.SDK_INT == 30) {
                        int i308 = asBinder + 17;
                        asInterface = i308 % 128;
                        int i309 = i308 % 2;
                        i12 = i8;
                    } else {
                        try {
                            try {
                                if (Build.VERSION.SDK_INT > 33) {
                                    int i1616 = asInterface;
                                    int i1617 = ((i1616 | 9) << 1) - (i1616 ^ 9);
                                    asBinder = i1617 % 128;
                                    int i1618 = i1617 % 2;
                                    i17 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                    int i1619 = (-965) - (~(-(-(i17 * (-963)))));
                                    i18 = ((i1619 | (-76841642)) << 1) - (i1619 ^ (-76841642));
                                    int i16110 = asInterface;
                                    i19 = (i16110 & 105) + (i16110 | 105);
                                    asBinder = i19 % 128;
                                    if (i19 % 2 != 0) {
                                        int i16111 = -((~i17) | (~((1103863969 ^ i8) | (1103863969 & i8))));
                                        i20 = i18 * ((i16111 ^ (-964)) + ((i16111 & (-964)) << 1));
                                        int i17110 = ~i8;
                                        i21 = (~(i17 | 1103863969)) | (~((i17110 & 1103863969) | (1103863969 ^ i17110)));
                                    } else {
                                        int i17111 = -(-(((~i17) | (~((1103863969 ^ i8) | (1103863969 & i8)))) * (-964)));
                                        i20 = (i18 ^ i17111) + ((i17111 & i18) << 1);
                                        int i17112 = ~i8;
                                        int i17113 = ~((i17112 & 1103863969) | (1103863969 ^ i17112));
                                        int i17114 = ~((i17 & 1103863969) | (1103863969 ^ i17));
                                        i21 = (i17114 & i17113) | (i17113 ^ i17114);
                                    }
                                    i22 = i20 + ((-964) * i21);
                                    int i17115 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                    int i17116 = i17115 * 46;
                                    int i17117 = (i17116 ^ (-5060)) + ((i17116 & (-5060)) << 1);
                                    int i17118 = ~i8;
                                    int i17119 = ~((i17118 & 109) | (109 ^ i17118));
                                    int i18110 = -(-(((i17119 & i17115) | (i17115 ^ i17119)) * (-90)));
                                    int i18111 = (i17117 & i18110) + (i18110 | i17117);
                                    int i18112 = ~((109 ^ i8) | (109 & i8));
                                    int i18113 = ~((i17115 ^ (-110)) | (i17115 & (-110)));
                                    int i18114 = -(-(((i18112 & i18113) | (i18112 ^ i18113)) * (-45)));
                                    int i18115 = (i18111 & i18114) + (i18114 | i18111);
                                    int i18116 = ~((~i17115) | i8);
                                    int i18117 = (i18116 & 109) | (109 ^ i18116);
                                    int i18118 = ~i8;
                                    int i18119 = ~((i17115 & i18118) | (i18118 ^ i17115));
                                    int i19110 = -(-(((i18119 & i18117) | (i18117 ^ i18119)) * 45));
                                    i23 = (i18115 ^ i19110) + ((i19110 & i18115) << 1);
                                    int iRed3 = Color.red(0);
                                    int i19111 = asInterface;
                                    int i19112 = (i19111 & 63) + (i19111 | 63);
                                    int i19113 = i19112 % 128;
                                    asBinder = i19113;
                                    int i19114 = i19112 % 2;
                                    int i19115 = iRed3 * (-300);
                                    int i19116 = ((i19115 | (-37448)) << 1) - (i19115 ^ (-37448));
                                    int i19117 = (~((iRed3 ^ (-124)) | (iRed3 & (-124)) | i8)) * (-301);
                                    int i19118 = (i19116 & i19117) + (i19117 | i19116);
                                    int i19119 = i19113 + 69;
                                    asInterface = i19119 % 128;
                                    int i20110 = i19119 % 2;
                                    int i20111 = ~((123 & i8) | (123 ^ i8));
                                    int i20112 = ~((i18118 ^ iRed3) | (i18118 & iRed3));
                                    int i20113 = (-301) * ((i20111 & i20112) | (i20111 ^ i20112));
                                    int i20114 = ~iRed3;
                                    int i20115 = ~((i20114 & i8) | (i20114 ^ i8));
                                    s = (short) ((i19118 & i20113) + (i20113 | i19118) + (((i20115 & 123) | (123 ^ i20115)) * 301));
                                    i24 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    int i20116 = 241188992 | i18118;
                                    int i20117 = (-1524166555) - (~(((i20116 & 796677) | (i20116 ^ 796677)) * 1444));
                                    int i20118 = ~(((-1342975038) & i8) | ((-1342975038) ^ i8));
                                    int i20119 = (i20117 - (~(-(-((((i20118 & 796677) | (796677 ^ i20118)) | (~((1583367352 & i8) | (1583367352 ^ i8)))) * (-1444)))))) - 1;
                                    i25 = (i20119 & 1380005396) + (1380005396 | i20119);
                                    int iTuitionPaymentFragmentbindingInflater19 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                    int i21110 = ~iTuitionPaymentFragmentbindingInflater19;
                                    int i21111 = ~((-802014265) | i21110);
                                    int i21112 = ~((857580217 ^ iTuitionPaymentFragmentbindingInflater19) | (857580217 & iTuitionPaymentFragmentbindingInflater19));
                                    int i21113 = ((i21111 & i21112) | (i21111 ^ i21112)) * 959;
                                    int i21114 = ((-1219764632) ^ i21113) + ((i21113 & (-1219764632)) << 1);
                                    i26 = (i21114 & 332534151) + (332534151 | i21114);
                                    int i21115 = ~((iTuitionPaymentFragmentbindingInflater19 & (-802014265)) | ((-802014265) ^ iTuitionPaymentFragmentbindingInflater19));
                                    int i21116 = ~(i21110 | 857580217);
                                    i27 = ((i21115 & i21116) | (i21115 ^ i21116)) * 959;
                                    if (i25 > (i26 ^ i27) + ((i27 & i26) << 1)) {
                                        byte b115 = (byte) i24;
                                        Object[] objArr116 = new Object[1];
                                        a(i22, i23, s, b115, (-2073654170) - (~(-View.getDefaultSize(0, 1))), objArr116);
                                        try {
                                            Object[] objArr117 = {(String) objArr116[0]};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char c3 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0) + 994;
                                                int iLastIndexOf5 = 7 - TextUtils.lastIndexOf("", '0', 0, 0);
                                                byte b116 = $$a[0];
                                                byte b117 = b116;
                                                Object[] objArr118 = new Object[1];
                                                c(b116, b117, (short) (b117 | 140), objArr118);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, bitsPerPixel3, iLastIndexOf5, 410748506, false, (String) objArr118[0], new Class[]{String.class});
                                            }
                                            long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr117)).longValue();
                                            long j117 = 1332482729;
                                            long j118 = (((long) 450) * j117) + (((long) (-448)) * jLongValue5);
                                            long j119 = 449;
                                            long j26 = -1;
                                            long j27 = ((j117 ^ j26) | jLongValue5) ^ j26;
                                            long j28 = jLongValue5 ^ j26;
                                            long j29 = i8;
                                            long j210 = j118 + ((j27 | (((j28 | j117) | j29) ^ j26)) * j119) + (((long) (-1347)) * j27) + (j119 * (j27 | (((j28 | (j29 ^ j26)) | j117) ^ j26))) + ((long) (-1533400966));
                                            int i21117 = (int) (j210 >>> 88);
                                            int iNextInt3 = new Random().nextInt();
                                            int i21118 = i21117 & ((((-818884594) + (((~iNextInt3) | 1708283345) * 1324)) + (((~(iNextInt3 | (-438938159))) | (~(1876164569 | iNextInt3))) * (-1324))) - 358240080);
                                            int i21119 = ~Process.myPid();
                                            int i22110 = ((int) j210) & (832424957 + (((-269090817) | i21119) * 184) + (((~(i21119 | (-1926896141))) | 1878384238) * 184));
                                            i13 = (i21118 & i22110) | (i21118 ^ i22110);
                                            b2 = i11 == true ? 1 : 0;
                                        } catch (Throwable th2) {
                                            Throwable cause2 = th2.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th2;
                                        }
                                    } else {
                                        int i22111 = -View.getDefaultSize(0, 0);
                                        int i22112 = (i22111 ^ (-2073654169)) + ((i22111 & (-2073654169)) << 1);
                                        Object[] objArr119 = new Object[1];
                                        a(i22, i23, s, (byte) i24, i22112, objArr119);
                                        try {
                                            Object[] objArr1110 = {(String) objArr119[0]};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char keyRepeatTimeout3 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 993;
                                                int iArgb3 = Color.argb(0, 0, 0, 0) + 8;
                                                byte b118 = $$a[0];
                                                byte b119 = b118;
                                                Object[] objArr1111 = new Object[1];
                                                c(b118, b119, (short) (b119 | 140), objArr1111);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatTimeout3, scrollDefaultDelay3, iArgb3, 410748506, false, (String) objArr1111[0], new Class[]{String.class});
                                            }
                                            long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr1110)).longValue();
                                            long j211 = 1487898597;
                                            long j1110 = 52;
                                            long j1111 = -1;
                                            long j1112 = ((long) i8) ^ j1111;
                                            long j1113 = j1112 | j211;
                                            b2 = i11 == true ? 1 : 0;
                                            long j1114 = jLongValue6 ^ j1111;
                                            long j1115 = j211 ^ j1111;
                                            long j1116 = (((long) (-51)) * j211) + (((long) 53) * jLongValue6) + (((j1113 | jLongValue6) ^ j1111) * j1110) + (((long) (-52)) * (((j1114 | j1112) ^ j1111) | ((j1114 | j211) ^ j1111) | (j1113 ^ j1111))) + (j1110 * (((j1115 | jLongValue6) ^ j1111) | ((j1115 | j1112) ^ j1111))) + ((long) (-1688816834));
                                            int i22113 = (int) (j1116 >> 32);
                                            int iMyTid3 = Process.myTid();
                                            int i22114 = i22113 & (1704617878 + (((~((-876436435) | iMyTid3)) | 874007170) * 305) + (((~((~iMyTid3) | (-876436435))) | 1981304450) * 305));
                                            int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
                                            int i22115 = 1112788367 + (((~((-2142591822) | iUptimeMillis3)) | 1427443781 | (~(715149064 | iUptimeMillis3))) * (-754));
                                            int i22116 = ~((-1427443782) | iUptimeMillis3);
                                            int i22117 = ~iUptimeMillis3;
                                            int i22118 = ((int) j1116) & (i22115 + ((i22116 | (~(2142592845 | i22117))) * (-754)) + ((i22117 | (-2142591822)) * 754));
                                            i13 = (i22114 & i22118) | (i22114 ^ i22118);
                                        } catch (Throwable th3) {
                                            Object[] objArr26 = i11 == true ? 1 : 0;
                                            Throwable cause3 = th3.getCause();
                                            if (cause3 != null) {
                                                throw cause3;
                                            }
                                            throw th3;
                                        }
                                    }
                                } else {
                                    b2 = i11 == true ? 1 : 0;
                                    int pressedStateDuration3 = ViewConfiguration.getPressedStateDuration() >> 16;
                                    int iTuitionPaymentFragmentbindingInflater110 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                    int i22119 = pressedStateDuration3 * 673;
                                    int i23110 = (i22119 ^ 725591904) + ((i22119 & 725591904) << 1);
                                    int i23111 = -(-(((~(pressedStateDuration3 | iTuitionPaymentFragmentbindingInflater110)) | (-1103863968)) * 672));
                                    int i23112 = (i23110 ^ i23111) + ((i23111 & i23110) << 1);
                                    int i23113 = ~pressedStateDuration3;
                                    int i23114 = ~iTuitionPaymentFragmentbindingInflater110;
                                    int i23115 = -(-(((~((i23113 & i23114) | (i23113 ^ i23114))) | (~(((-1103863968) & iTuitionPaymentFragmentbindingInflater110) | (iTuitionPaymentFragmentbindingInflater110 ^ (-1103863968))))) * (-672)));
                                    int i23116 = ~iTuitionPaymentFragmentbindingInflater110;
                                    int i23117 = ~((i23116 & 1103863967) | (1103863967 ^ i23116));
                                    int i23118 = ~((pressedStateDuration3 & 1103863967) | (1103863967 ^ pressedStateDuration3));
                                    int i23119 = ((((i23112 | i23115) << 1) - (i23115 ^ i23112)) - (~(((i23118 & i23117) | (i23117 ^ i23118)) * 672))) - 1;
                                    int i24110 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    int i24111 = (i24110 & (-109)) + (i24110 | (-109));
                                    int i24112 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    int i24113 = i24112 * (-755);
                                    int i24114 = (i24113 & 6795) + (i24113 | 6795);
                                    int i24115 = ~i24112;
                                    int i24116 = i24114 + ((~((i24115 ^ 8) | (i24115 & 8))) * 1512);
                                    int i24117 = ~((i24115 & 8) | (i24115 ^ 8));
                                    int i24118 = (i24112 & (-9)) | (i24112 ^ (-9));
                                    int i24119 = ~(i24118 | i8);
                                    int i25110 = ((i24117 & i24119) | (i24117 ^ i24119)) * (-756);
                                    int i25111 = (i24116 ^ i25110) + ((i25110 & i24116) << 1);
                                    int i25112 = ~i8;
                                    Object[] objArr27 = new Object[1];
                                    a(i23119, i24111, (short) ((i25111 - (~(-(-(((i24118 & i25112) | (i24118 ^ i25112)) * 756))))) - 1), (byte) ((-1) - ImageFormat.getBitsPerPixel(0)), (-2073654141) - (~(-(-Process.getGidForName("")))), objArr27);
                                    str = (String) objArr27[0];
                                    int i25113 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                    int i25114 = i25113 * 71;
                                    int i25115 = (i25114 & (-1142801952)) + (i25114 | (-1142801952));
                                    int i25116 = ~i25113;
                                    int i25117 = ~((i25116 & (-1103863904)) | (i25116 ^ (-1103863904)));
                                    int i25118 = ~(i8 | (-1103863904));
                                    int i25119 = -(-(((i25117 & i25118) | (i25117 ^ i25118)) * (-140)));
                                    int i26110 = (i25115 & i25119) + (i25119 | i25115);
                                    int i26111 = (i25113 ^ (-1103863904)) | (i25113 & (-1103863904));
                                    int i26112 = i26110 + ((~((i26111 & i8) | (i26111 ^ i8))) * 70);
                                    int i26113 = ~i25113;
                                    int i26114 = ~((i26113 & (-1103863904)) | (i26113 ^ (-1103863904)));
                                    int i26115 = ~((1103863903 & i25113) | (1103863903 ^ i25113));
                                    int i26116 = (i26114 & i26115) | (i26114 ^ i26115);
                                    int i26117 = ~((i25113 & i8) | (i25113 ^ i8));
                                    int i26118 = i26112 + (((i26117 & i26116) | (i26116 ^ i26117)) * 70);
                                    int iAxisFromString3 = MotionEvent.axisFromString("");
                                    int i26119 = ((iAxisFromString3 | (-109)) << 1) - (iAxisFromString3 ^ (-109));
                                    int i27110 = -Color.argb(0, 0, 0, 0);
                                    int i27111 = i27110 * (-464);
                                    int i27112 = ((i27111 | (-115196)) << 1) - (i27111 ^ (-115196));
                                    int i27113 = ~i27110;
                                    int i27114 = (i8 ^ 124) | (i8 & 124);
                                    int i27115 = ((~i27114) | i27113) * (-465);
                                    int i27116 = ((i27112 | i27115) << 1) - (i27115 ^ i27112);
                                    int i27117 = ~((i27113 ^ i8) | (i27113 & i8));
                                    short s8 = (short) (((i27116 - (~(-(-(((i27117 & 124) | (i27117 ^ 124)) * 930))))) - 1) + ((i27113 | i27114) * 465));
                                    byte size4 = (byte) View.MeasureSpec.getSize(0);
                                    int i27118 = -((byte) KeyEvent.getModifierMetaStateMask());
                                    int i27119 = i27118 * 624;
                                    int i28110 = (2073654140 ^ i27118) | (2073654140 & i27118);
                                    int i28111 = (((i27119 & 1322686902) + (i27119 | 1322686902)) - (~(-(-((~((i28110 & i8) | (i28110 ^ i8))) * 623))))) - 1;
                                    int i28112 = ~i27118;
                                    int i28113 = ~((i28112 & (-2073654141)) | (i28112 ^ (-2073654141)));
                                    int i28114 = ((i25112 & i28113) | (i25112 ^ i28113)) * (-623);
                                    int i28115 = ((i28111 | i28114) << 1) - (i28114 ^ i28111);
                                    int i28116 = ((~((2073654140 ^ i27118) | (2073654140 & i27118))) | (~((2073654140 & i8) | (2073654140 ^ i8))) | (~((i27118 & i8) | (i27118 ^ i8)))) * 623;
                                    int i28117 = ((i28115 | i28116) << 1) - (i28116 ^ i28115);
                                    Object[] objArr28 = new Object[1];
                                    a(i26118, i26119, s8, size4, i28117, objArr28);
                                    try {
                                        objArr = new Object[]{(String) objArr28[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char tapTimeout3 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 33602);
                                            int iIndexOf4 = TextUtils.indexOf("", "") + 3085;
                                            int packedPositionGroup3 = 26 - ExpandableListView.getPackedPositionGroup(0L);
                                            byte b1110 = $$a[0];
                                            byte b1111 = b1110;
                                            Object[] objArr29 = new Object[1];
                                            c(b1110, b1111, (short) (b1111 | 140), objArr29);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout3, iIndexOf4, packedPositionGroup3, 1411172903, false, (String) objArr29[0], new Class[]{String.class});
                                        }
                                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                            i13 = 1;
                                        } else {
                                            i13 = 0;
                                        }
                                    } catch (Throwable th4) {
                                        Throwable cause4 = th4.getCause();
                                        if (cause4 != null) {
                                            throw cause4;
                                        }
                                        throw th4;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            b2 = i11 == true ? 1 : 0;
                        }
                        int i28118 = (i8 & (-11)) | ((~i8) & 10);
                        int i28119 = -i13;
                        int i29110 = asBinder;
                        int i29111 = (i29110 ^ 43) + ((i29110 & 43) << 1);
                        int i29112 = i29111 % 128;
                        asInterface = i29112;
                        int i29113 = i29111 % 2;
                        int i29114 = ((i13 & i28119) | (i13 ^ i28119)) >> 31;
                        int i29115 = (i29112 & 73) + (i29112 | 73);
                        asBinder = i29115 % 128;
                        int i29116 = i29115 % 2;
                        int i29117 = (~i29114) & i8;
                        int i29118 = i29114 & i28118;
                        i14 = (i29118 & i29117) | (i29117 ^ i29118);
                        int i29119 = i9 & 32;
                        int i3010 = -i29119;
                        i15 = ((i29119 & i3010) | (i29119 ^ i3010)) >> 31;
                        i16 = (i29112 & 37) + (i29112 | 37);
                        asBinder = i16 % 128;
                        if (i16 % 2 != 0) {
                            throw null;
                        }
                        int i3011 = i14 & (~i15);
                        int i3012 = i15 & i8;
                        i12 = (i3011 & i3012) | (i3011 ^ i3012);
                        i11 = b2;
                    }
                    int i315 = ((~i11) & i8) | ((~i8) & i11);
                    int i316 = -i315;
                    int i317 = ((i315 & i316) | (i315 ^ i316)) >> 31;
                    int i318 = (i12 & (~i317)) | (i11 & i317);
                    int i319 = (~(i8 & i318)) & (i8 | i318);
                    int i320 = -i319;
                    Object[] objArr30 = {new int[]{i8}, new int[1], new int[]{i318}, null};
                    int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                    int i321 = ((((~(587153403 | elapsedCpuTime2)) | 538186144) * 449) - 575636592) + (((~((~elapsedCpuTime2) | 587153403)) | 538186144) * 449) + ((((i319 & i320) | (i319 ^ i320)) >> 31) & 16);
                    int i322 = (i10 & i321) + (i10 | i321);
                    int i323 = i322 << 13;
                    int i324 = (i322 | i323) & (~(i322 & i323));
                    int i325 = i324 >>> 17;
                    int i326 = (i324 | i325) & (~(i324 & i325));
                    int i327 = i326 << 5;
                    ((int[]) objArr30[1])[0] = (i326 | i327) & (~(i326 & i327));
                    int i328 = asBinder;
                    int i329 = (i328 ^ 93) + ((i328 & 93) << 1);
                    asInterface = i329 % 128;
                    int i330 = i329 % 2;
                    return objArr30;
                } catch (Throwable th5) {
                    Throwable cause5 = th5.getCause();
                    if (cause5 != null) {
                        throw cause5;
                    }
                    throw th5;
                }
            }

            private static String $$e(byte b2, int i8, short s) {
                int i9 = (i8 * 4) + 4;
                int i10 = s + 117;
                int i11 = b2 * 2;
                byte[] bArr = $$c;
                byte[] bArr2 = new byte[1 - i11];
                int i12 = 0 - i11;
                int i13 = -1;
                if (bArr == null) {
                    i13 = -1;
                    i10 = i9 + i12;
                    i9++;
                }
                while (true) {
                    int i14 = i13 + 1;
                    bArr2[i14] = (byte) i10;
                    if (i14 == i12) {
                        return new String(bArr2, 0);
                    }
                    int i15 = i10;
                    i13 = i14;
                    i10 = bArr[i9] + i15;
                    i9++;
                }
            }
        });
        this.INotificationSideChannelStub.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.15
            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 583912079;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    int i8 = CreditCardDetailsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CreditCardDetailsActivity.this).d;
                    int i9 = CreditCardDetailsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CreditCardDetailsActivity.this).asInterface;
                    if (i8 >= 0 && i8 < i9) {
                        toRational torationalTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CreditCardDetailsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CreditCardDetailsActivity.this);
                        int i10 = i8 + 1;
                        torationalTuitionPaymentFragmentspecialinlinedviewModeldefault1.d = i10;
                        ((filterResolutionsByAspectRatio) torationalTuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i10);
                        Object[] objArr = {CreditCardDetailsActivity.this};
                        int iB = zzdm.b();
                        int iB2 = zzdm.b();
                        CreditCardDetailsActivity.b(zzdm.b(), iB, zzdm.b(), iB2, 414831620, objArr, -414831615);
                    }
                    CreditCardDetailsActivity.sendCustomAction(CreditCardDetailsActivity.this);
                    CreditCardDetailsActivity.isConnected(CreditCardDetailsActivity.this);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.cancelAll.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.14
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    int i8 = CreditCardDetailsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CreditCardDetailsActivity.this).d;
                    int i9 = CreditCardDetailsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CreditCardDetailsActivity.this).asInterface;
                    if (i8 > 0 && i8 <= i9) {
                        toRational torationalTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CreditCardDetailsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CreditCardDetailsActivity.this);
                        int i10 = i8 - 1;
                        torationalTuitionPaymentFragmentspecialinlinedviewModeldefault1.d = i10;
                        ((filterResolutionsByAspectRatio) torationalTuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i10);
                        Object[] objArr = {CreditCardDetailsActivity.this};
                        CreditCardDetailsActivity.b(zzdm.b(), zzdm.b(), zzdm.b(), zzdm.b(), 414831620, objArr, -414831615);
                    }
                    CreditCardDetailsActivity.sendCustomAction(CreditCardDetailsActivity.this);
                    CreditCardDetailsActivity.isConnected(CreditCardDetailsActivity.this);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        IconCompatParcelizer();
        this.cancel.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.19
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    CreditCardDetailsActivity.unsubscribe(CreditCardDetailsActivity.this);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.connect.setOnTouchListener(new View.OnTouchListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.12
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr = {CreditCardDetailsActivity.this};
                int iB = zzdm.b();
                int iB2 = zzdm.b();
                if (((AppCompatCheckBox) CreditCardDetailsActivity.b(zzdm.b(), iB, zzdm.b(), iB2, 1623486085, objArr, -1623486071)).isChecked()) {
                    return false;
                }
                Object[] objArr2 = {CreditCardDetailsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CreditCardDetailsActivity.this), CreditCardDetailsActivity.this.a()};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                if (!((Boolean) toRational.TuitionPaymentFragmentspecialinlinedviewModeldefault3(AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 507152445, objArr2, AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -507152444)).booleanValue()) {
                    return false;
                }
                if (motionEvent.getAction() != 0) {
                    return true;
                }
                CreditCardDetailsActivity.this.startActivityForResult(new Intent(CreditCardDetailsActivity.this, (Class<?>) TermsAndConditionsActivity.class), 909);
                return true;
            }
        });
        this.connect.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.20
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) throws NoSuchMethodException {
                if (z) {
                    CreditCardDetailsActivity.onTransact(CreditCardDetailsActivity.this);
                } else {
                    CreditCardDetailsActivity.connect(CreditCardDetailsActivity.this);
                }
            }
        });
        if (this.setCallbacksMessenger.TuitionPaymentFragmentbindingInflater1()) {
            this.getExtras.setVisibility(0);
            if (this.setCallbacksMessenger.b().getUIKitCustomSetting().isSaveCardChecked()) {
                int i8 = onLoadChildren + 111;
                MediaBrowserCompatItemCallbackStubApi23 = i8 % 128;
                int i9 = i8 % 2;
                this.write.setChecked(true);
            }
        }
        int iB = zzdm.b();
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 404208639;
        b(SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iB, SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), length, 1191534187, new Object[]{this}, -1191534187);
        TransactionDetails transactionDetails = j_().getTransaction().getTransactionDetails();
        if (transactionDetails == null) {
            currency = "";
        } else {
            currency = transactionDetails.getCurrency();
        }
        this.MediaBrowserCompatCallbackHandler = new createPipelineAndUpdateChildrenSpecs(((BaseActivity) this).b, currency, new createPipelineAndUpdateChildrenSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.18
            @Override // createPipelineAndUpdateChildrenSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            public final void TuitionPaymentFragmentbindingInflater1(Promo promo) {
                CreditCardDetailsActivity.this.b(promo);
            }

            @Override // createPipelineAndUpdateChildrenSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
                if (CreditCardDetailsActivity.getServiceComponent(CreditCardDetailsActivity.this) != null) {
                    CreditCardDetailsActivity.search(CreditCardDetailsActivity.this);
                }
            }
        });
        this.unsubscribe.setLayoutManager(new LinearLayoutManager(this));
        this.unsubscribe.setHasFixedSize(true);
        this.unsubscribe.setAdapter(this.MediaBrowserCompatCallbackHandler);
        this.unsubscribe.postDelayed(new AnonymousClass2(getItem(), true), 100L);
        int i10 = onLoadChildren + 107;
        MediaBrowserCompatItemCallbackStubApi23 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 29 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrB$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyPid = (char) ((Process.myPid() >> 22) + 29944);
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1755;
            int iGreen = 23 - Color.green(0);
            byte b = $$j[7];
            Object[] objArr2 = new Object[1];
            m((short) 203, b, (byte) (b | 15), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyPid, absoluteGravity, iGreen, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i3 = onLoadChildren + 53;
            MediaBrowserCompatItemCallbackStubApi23 = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1755;
                int maxKeyCode = 23 - (KeyEvent.getMaxKeyCode() >> 16);
                byte b2 = $$j[7];
                Object[] objArr3 = new Object[1];
                m((short) 166, b2, b2, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, packedPositionType, maxKeyCode, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i5 = ((int[]) objArr4[0])[0];
            objArrB$7879113 = new Object[]{new int[]{i5}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.title_shipping_billing_address).substring(0, 26).codePointAt(22) + 1998425965;
            int i6 = ((((-120790168) + (((~((-1054978295) | iCodePointAt)) | 213913666) * 345)) + (((~((-1054978295) | (~iCodePointAt))) | (-1056289535)) * 345)) + ((~(iCodePointAt | (-213913667))) * 345)) - 1247095412;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i8 ^ (i8 << 5);
            int i9 = onLoadChildren + 31;
            MediaBrowserCompatItemCallbackStubApi23 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            Object[] objArr5 = new Object[1];
            n(new char[]{25601, 7484, 25707, 16565, 47849, 4011, 9425, 54188, 64255, 23508, 44780, 45395, 22982, 63558, 52718, 4116, 47106, 39276, 27400, 63280}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            n(new char[]{37938, 47742, 37979, 18710, 7598, 1563, 60664, 7050, 2710, 64659, 42842, 31085, 43482, 24395, 50285, 55340, 18433, 15925, 25258, 16145}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_consent_screen_cta_text_retake_selfie).substring(8, 13).codePointAt(1) - 108, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {249288201};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - KeyEvent.normalizeMetaState(0)), ExpandableListView.getPackedPositionType(0L) + 1726, 29 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -1247095412, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (29945 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int jumpTapTimeout = 1755 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int iResolveSize = View.resolveSize(0, 0) + 23;
                    byte b3 = $$j[7];
                    Object[] objArr8 = new Object[1];
                    m((short) 166, b3, b3, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, jumpTapTimeout, iResolveSize, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    n(new char[]{32722, 38531, 32691, 29932, 12633, 15328, 31861, 35611, 57709, 53358, 39600, 59831, 16925, 29604, 63946, 18586, 41947, 4820, 24384, 44956, 1279, 46132, 48680, 3654, 26017, 22316}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_liveliness_invalid_gesture_combination).substring(0, 99).length() - 99, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    n(new char[]{30371, 28749, 30406, 10320, 55189, 26457, 16200, 51236, 59392, 13996, 50700, 43766, 19302, 38264, 42292, 2944, 43706, 62468, 1005}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_billingcountry_empty).substring(10, 11).codePointAt(0) - 101, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char maximumDrawingCacheSize = (char) (29944 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1755;
                        int iMyTid = (Process.myTid() >> 22) + 23;
                        byte b4 = $$j[7];
                        Object[] objArr11 = new Object[1];
                        m((short) 114, b4, b4, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumDrawingCacheSize, maximumFlingVelocity, iMyTid, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29944);
                        int doubleTapTimeout2 = 1755 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int i11 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22;
                        byte b5 = $$j[7];
                        Object[] objArr12 = new Object[1];
                        m((short) 203, b5, (byte) (b5 | 15), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(doubleTapTimeout, doubleTapTimeout2, i11, 986134021, false, (String) objArr12[0], null);
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
        int i12 = ((int[]) objArrB$7879113[1])[0];
        int i13 = ((int[]) objArrB$7879113[0])[0];
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$7879113[4];
            if (strArr != null) {
                int i14 = MediaBrowserCompatItemCallbackStubApi23 + 91;
                onLoadChildren = i14 % 128;
                int i15 = i14 % 2;
                while (i2 < strArr.length) {
                    int i16 = onLoadChildren + 123;
                    MediaBrowserCompatItemCallbackStubApi23 = i16 % 128;
                    int i17 = i16 % 2;
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        int i18 = ((int[]) objArrB$7879113[3])[0];
        int i19 = ((int[]) objArrB$7879113[0])[0];
        Object[] objArr13 = {new int[]{i19}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int i20 = ~(((int) Process.getStartElapsedRealtime()) | 703927947);
        int i21 = i18 + ((((-884743899) | i20) * (-658)) - 708964149) + ((i20 | (-1039998684)) * 658);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr13[3])[0] = i23 ^ (i23 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char maxKeyCode2 = (char) (KeyEvent.getMaxKeyCode() >> 16);
            int longPressTimeout = 1031 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int i24 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15;
            short s = (short) ($$k | 20);
            byte b6 = $$j[7];
            Object[] objArr14 = new Object[1];
            m(s, b6, b6, objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(maxKeyCode2, longPressTimeout, i24, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        n(new char[]{32722, 38531, 32691, 29932, 12633, 15328, 31861, 35611, 57709, 53358, 39600, 59831, 16925, 29604, 63946, 18586, 41947, 4820, 24384, 44956, 1279, 46132, 48680, 3654, 26017, 22316}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_mandiri_clickpay).substring(1, 3).codePointAt(0) - 97, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        n(new char[]{30371, 28749, 30406, 10320, 55189, 26457, 16200, 51236, 59392, 13996, 50700, 43766, 19302, 38264, 42292, 2944, 43706, 62468, 1005}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 46, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int i25 = 1031 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int iRgb = (-16777201) - Color.rgb(0, 0, 0);
            byte b7 = $$j[7];
            Object[] objArr17 = new Object[1];
            m((short) 166, b7, b7, objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(windowTouchSlop, i25, iRgb, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i26 = onLoadChildren + 25;
            MediaBrowserCompatItemCallbackStubApi23 = i26 % 128;
            int i27 = i26 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int iLastIndexOf = 1030 - TextUtils.lastIndexOf("", '0');
                int i28 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14;
                byte[] bArr = $$j;
                Object[] objArr18 = new Object[1];
                m((short) (-bArr[9]), bArr[0], (byte) 52, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c3, iLastIndexOf, i28, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i29 = ((int[]) objArr19[3])[0];
            int i30 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iNextInt = new Random().nextInt(121700755);
            int i31 = (((~(iNextInt | (-246400911))) * TypedValues.CycleType.TYPE_EASING) - 140734799) + (((~((~iNextInt) | (-246400911))) | 286273648) * TypedValues.CycleType.TYPE_EASING) + 963140469;
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr[2])[0] = i33 ^ (i33 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            n(new char[]{25601, 7484, 25707, 16565, 47849, 4011, 9425, 54188, 64255, 23508, 44780, 45395, 22982, 63558, 52718, 4116, 47106, 39276, 27400, 63280}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlTrustedGoBackButtonTitle).substring(0, 7).length() - 7, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            n(new char[]{37938, 47742, 37979, 18710, 7598, 1563, 60664, 7050, 2710, 64659, 42842, 31085, 43482, 24395, 50285, 55340, 18433, 15925, 25258, 16145}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_confirm_shopeepay_qr_scan_tablet).substring(12, 17).length() - 5, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {249288201};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46039 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 1134 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 18 - (ViewConfiguration.getTouchSlop() >> 8), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 963140469, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char maxKeyCode3 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 1031;
                int iIndexOf2 = TextUtils.indexOf("", "", 0) + 15;
                short s2 = (short) ($$k | 20);
                byte b8 = $$j[7];
                Object[] objArr24 = new Object[1];
                m(s2, b8, b8, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(maxKeyCode3, iIndexOf, iIndexOf2, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 45993), (ViewConfiguration.getPressedStateDuration() >> 16) + 1117, 17 - ExpandableListView.getPackedPositionType(0L)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 1032;
                int gidForName = Process.getGidForName("") + 16;
                byte[] bArr2 = $$j;
                Object[] objArr25 = new Object[1];
                m((short) (-bArr2[9]), bArr2[0], (byte) 52, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cAxisFromString, iLastIndexOf2, gidForName, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                n(new char[]{32722, 38531, 32691, 29932, 12633, 15328, 31861, 35611, 57709, 53358, 39600, 59831, 16925, 29604, 63946, 18586, 41947, 4820, 24384, 44956, 1279, 46132, 48680, 3654, 26017, 22316}, TextUtils.getOffsetBefore("", 0), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                n(new char[]{30371, 28749, 30406, 10320, 55189, 26457, 16200, 51236, 59392, 13996, 50700, 43766, 19302, 38264, 42292, 2944, 43706, 62468, 1005}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int capsMode = 1031 - TextUtils.getCapsMode("", 0, 0);
                    int mode = View.MeasureSpec.getMode(0) + 15;
                    byte b9 = $$j[7];
                    Object[] objArr28 = new Object[1];
                    m((short) 166, b9, b9, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(minimumFlingVelocity, capsMode, mode, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int i34 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1032;
                    int mode2 = 15 - View.MeasureSpec.getMode(0);
                    short s3 = (short) ($$k | 20);
                    byte b10 = $$j[7];
                    Object[] objArr29 = new Object[1];
                    m(s3, b10, b10, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(scrollBarSize, i34, mode2, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
            Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i35 = ((int[]) objArr[2])[0];
            int i36 = ((int[]) objArr[3])[0];
            int i37 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i38 = (int) Runtime.getRuntime().totalMemory();
            int i39 = i35 + 619471748 + (((~((~i38) | 21518760)) | (-223304170)) * 529) + (((~(i38 | 21518760)) | (-222761410)) * 529);
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr30[2])[0] = i41 ^ (i41 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 == null) {
            throw null;
        }
        while (i2 < strArr4.length) {
            arrayList2.add(strArr4[i2]);
            i2++;
            int i42 = onLoadChildren + 53;
            MediaBrowserCompatItemCallbackStubApi23 = i42 % 128;
            int i43 = i42 % 2;
        }
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = onLoadChildren + 85;
        MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        if (i4 != 2142254032 + (((-1107872804) | i5) * (-369)) + (((~((-435171677) | i5)) | (-1265159220)) * (-369)) + (((~(iIdentityHashCode | 435171676)) | (-1543044480) | (~(i5 | (-157286417)))) * 369)) {
            int i6 = (-989981812) % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
        int i9 = ~i8;
        int i10 = 1250855804 + (((~((-440551041) | i9)) | (~(1515388560 | i8))) * 520);
        int i11 = ~((-1515388561) | i9);
        int i12 = ~(i8 | 1063667404);
        if (i7 != i10 + ((i11 | i12) * (-1040)) + ((i12 | (~(i9 | (-1063667405))) | 1074837520) * 520)) {
            throw null;
        }
        super.onResume();
        int i13 = onLoadChildren + 97;
        MediaBrowserCompatItemCallbackStubApi23 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 76 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = onLoadChildren + 19;
        MediaBrowserCompatItemCallbackStubApi23 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i5 = (~(1288051174 | iFreeMemory)) | 319383049;
        int i6 = ~iFreeMemory;
        if (i4 != (-2138012042) + ((i5 | (~((-1149370593) | i6))) * 886) + (((~(i6 | (-1288051175))) | 458063631) * (-1772)) + ((~(i6 | 458063631)) * 886)) {
            int i7 = (-28903594) % 2;
            throw new ArithmeticException();
        }
        int i8 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i8 != (-524404896) + (((~(2078106376 | iIdentityHashCode)) | (-362195046)) * (-964)) + (((~((~iIdentityHashCode) | 2078106376)) | (-2145381230)) * (-964))) {
            throw new RuntimeException("1304678268");
        }
        super.onStart();
        int i9 = onLoadChildren + 71;
        MediaBrowserCompatItemCallbackStubApi23 = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ AppCompatCheckBox TuitionPaymentFragmentspecialinlinedviewModeldefault2(CreditCardDetailsActivity creditCardDetailsActivity) {
        int iB = zzdm.b();
        int iB2 = zzdm.b();
        int iB3 = zzdm.b();
        return (AppCompatCheckBox) b(zzdm.b(), iB, iB3, iB2, 1623486085, new Object[]{creditCardDetailsActivity}, -1623486071);
    }

    public static /* synthetic */ DefaultTextView TuitionPaymentFragmentspecialinlinedviewModeldefault3(CreditCardDetailsActivity creditCardDetailsActivity) {
        int iB = zzdm.b();
        int iB2 = zzdm.b();
        int iB3 = zzdm.b();
        return (DefaultTextView) b(zzdm.b(), iB, iB3, iB2, 1757658991, new Object[]{creditCardDetailsActivity}, -1757658982);
    }

    public static /* synthetic */ boolean b(CreditCardDetailsActivity creditCardDetailsActivity) {
        int iB = zzdm.b();
        int iB2 = zzdm.b();
        int iB3 = zzdm.b();
        return ((Boolean) b(zzdm.b(), iB, iB3, iB2, -2013257040, new Object[]{creditCardDetailsActivity}, 2013257043)).booleanValue();
    }

    public static /* synthetic */ AppCompatEditText asBinder(CreditCardDetailsActivity creditCardDetailsActivity) {
        int iB = zzdm.b();
        int iB2 = zzdm.b();
        int iB3 = zzdm.b();
        return (AppCompatEditText) b(zzdm.b(), iB, iB3, iB2, 1300546827, new Object[]{creditCardDetailsActivity}, -1300546825);
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2(CreditCardDetailsActivity creditCardDetailsActivity, String str) {
        int iB = zzdm.b();
        int iB2 = zzdm.b();
        int iB3 = zzdm.b();
        return (String) b(zzdm.b(), iB, iB3, iB2, 390219441, new Object[]{creditCardDetailsActivity, str}, -390219435);
    }

    public static /* synthetic */ boolean IconCompatParcelizer(CreditCardDetailsActivity creditCardDetailsActivity) {
        int iB = zzdm.b();
        int iB2 = zzdm.b();
        int iB3 = zzdm.b();
        return ((Boolean) b(zzdm.b(), iB, iB3, iB2, 2104298852, new Object[]{creditCardDetailsActivity}, -2104298837)).booleanValue();
    }

    public static /* synthetic */ void getSessionToken(CreditCardDetailsActivity creditCardDetailsActivity) {
        int iB = zzdm.b();
        int iB2 = zzdm.b();
        int iB3 = zzdm.b();
        b(zzdm.b(), iB, iB3, iB2, 414831620, new Object[]{creditCardDetailsActivity}, -414831615);
    }

    public static /* synthetic */ TextView subscribe(CreditCardDetailsActivity creditCardDetailsActivity) {
        int iB = zzdm.b();
        int iB2 = zzdm.b();
        int iB3 = zzdm.b();
        return (TextView) b(zzdm.b(), iB, iB3, iB2, -2013531028, new Object[]{creditCardDetailsActivity}, 2013531036);
    }

    private void onTransact() {
        int iB = zzdm.b();
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 404208639;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iB, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, length, 1191534187, new Object[]{this}, -1191534187);
    }

    private void asBinder(TransactionResponse transactionResponse) {
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_face_too_close).substring(18, 19).length() - 817621388;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(zzdm.b(), length, SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -533827471, new Object[]{this, transactionResponse}, 533827478);
    }

    private void read() {
        int iCodePointAt = 2095977509 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.ef_content_desc_folder).substring(0, 6).codePointAt(2);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iB = zzdm.b();
        b(SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iCodePointAt, iB, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -626001062, new Object[]{this}, 626001074);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(zzdm.b(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -436859433, objArr, 436859437);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int length = 1626883753 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_qr_code).substring(1, 2).length();
        b(zzdm.b(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, length, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 673084741, new Object[]{this}, -673084728);
    }

    private boolean getNotifyChildrenChangedOptions() {
        int iB = zzdm.b();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return ((Boolean) b(SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iB, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1781249968, new Object[]{this}, 1781249969)).booleanValue();
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TransactionResponse transactionResponse) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(zzdm.b(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1069844292, new Object[]{this, transactionResponse}, 1069844302);
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void b(TransactionResponse transactionResponse) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iB = zzdm.b();
        b(SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iB, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 410130966, new Object[]{this, transactionResponse}, -410130955);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemCallbackStubApi23 + 3;
        onLoadChildren = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onLoadChildren + 125;
        MediaBrowserCompatItemCallbackStubApi23 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$w(int r7, short r8, short r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 107
            int r9 = r9 * 2
            int r9 = 1 - r9
            int r8 = r8 * 2
            int r8 = 3 - r8
            byte[] r0 = com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.$$u
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r5 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2c:
            int r7 = r7 + r8
            r8 = r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.creditcard.details.CreditCardDetailsActivity.$$w(int, short, short):java.lang.String");
    }
}
