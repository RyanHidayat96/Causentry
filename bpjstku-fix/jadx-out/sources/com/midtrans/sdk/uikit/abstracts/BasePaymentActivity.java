package com.midtrans.sdk.uikit.abstracts;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.google.android.material.appbar.AppBarLayout;
import com.midtrans.sdk.corekit.core.Currency;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.models.MerchantPreferences;
import com.midtrans.sdk.corekit.models.PaymentDetails;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.corekit.models.snap.ItemDetails;
import com.midtrans.sdk.corekit.models.snap.MerchantData;
import com.midtrans.sdk.corekit.models.snap.Transaction;
import com.midtrans.sdk.corekit.models.snap.TransactionDetails;
import com.midtrans.sdk.corekit.utilities.Utils;
import com.midtrans.sdk.uikit.views.status.PaymentStatusActivity;
import com.midtrans.sdk.uikit.views.webview.WebViewPaymentActivity;
import com.midtrans.sdk.uikit.widgets.BoldTextView;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import com.midtrans.sdk.uikit.widgets.SemiBoldTextView;
import defpackage.MediaBrowserCompatCallbackHandler;
import defpackage.ViewPortBuilder;
import defpackage.calculateInvertedTextureTransform;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BasePaymentActivity extends BaseActivity {
    private static final String d = "BasePaymentActivity";
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
    boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BoldTextView f850a;
    public MediaBrowserCompatCallbackHandler asBinder;
    private static final byte[] $$l = {94, -1, 37, -59};
    private static final int $$o = 249;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {12, -88, 33, 118, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$h = 142;
    private static int asInterface = 0;
    private static int cancelAll = 1;
    private static char[] g = {59710, 59756, 59746, 59750, 59740, 59731, 59746, 59751, 59768, 59773, 59757, 59723, 59739, 59770, 59717, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59705, 59747, 59757, 59747, 59770, 59751, 59759, 59728, 59728, 59752, 59757, 59771, 59749, 59744, 59746, 59700, 59773, 59768, 59774, 59748, 59774, 59774, 59738, 59740, 59771, 59770, 59775, 59743, 59713, 59771, 59787, 59774, 59873, 59876, 59860, 59856, 59896, 59899, 59857, 59885, 59895, 59903, 59903, 59900, 59876, 59873, 59879};

    /* JADX INFO: renamed from: com.midtrans.sdk.uikit.abstracts.BasePaymentActivity$5, reason: invalid class name */
    public class AnonymousClass5 implements Runnable {
        private /* synthetic */ ItemDetails TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public AnonymousClass5(ItemDetails itemDetails) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = itemDetails;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MediaBrowserCompatCallbackHandler mediaBrowserCompatCallbackHandler = BasePaymentActivity.this.asBinder;
            ItemDetails itemDetails = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (mediaBrowserCompatCallbackHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                mediaBrowserCompatCallbackHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ArrayList();
            }
            if (itemDetails != null) {
                ItemDetails itemDetailsTuitionPaymentFragmentspecialinlinedviewModeldefault1 = mediaBrowserCompatCallbackHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault1(itemDetails.getId());
                if (itemDetailsTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    mediaBrowserCompatCallbackHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(itemDetails);
                } else {
                    itemDetailsTuitionPaymentFragmentspecialinlinedviewModeldefault1.setPrice(itemDetails.getPrice());
                    itemDetailsTuitionPaymentFragmentspecialinlinedviewModeldefault1.setName(itemDetails.getName());
                }
                mediaBrowserCompatCallbackHandler.notifyDataSetChanged();
            }
            BasePaymentActivity basePaymentActivity = BasePaymentActivity.this;
            basePaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(basePaymentActivity.asBinder.b());
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void k(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r0 = 53 - r5
            byte[] r1 = com.midtrans.sdk.uikit.abstracts.BasePaymentActivity.$$g
            int r7 = 145 - r7
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r0 = new byte[r0]
            int r5 = 52 - r5
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
        L26:
            int r4 = -r4
            int r6 = r6 + r4
            int r7 = r7 + 1
            int r6 = r6 + (-11)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.abstracts.BasePaymentActivity.k(byte, int, short, java.lang.Object[]):void");
    }

    public void b(String str) {
        int i = 2 % 2;
        int i2 = cancelAll + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        SemiBoldTextView semiBoldTextView = (SemiBoldTextView) findViewById(R.id.text_page_title);
        if (semiBoldTextView != null) {
            semiBoldTextView.setText(str);
        }
        int i4 = asInterface + 59;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            d();
            return;
        }
        super.onBackPressed();
        int i4 = cancelAll + 51;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
    }

    private void TuitionPaymentFragmentbindingInflater1(double d2, double d3) {
        int color;
        int i = 2 % 2;
        if (((BaseActivity) this).b != 0) {
            color = ((BaseActivity) this).b;
            int i2 = asInterface + 55;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
        } else {
            color = ContextCompat.getColor(this, R.color.dark_gray);
        }
        if (d3 != d2) {
            color = ContextCompat.getColor(this, R.color.promoAmount);
            int i4 = cancelAll + 71;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        this.f850a.setTextColor(color);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(TransactionResponse transactionResponse, boolean z) {
        int i = 2 % 2;
        Object obj = null;
        if (this.TuitionPaymentFragmentbindingInflater1) {
            int i2 = cancelAll + 35;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (z) {
                Intent intent = new Intent(this, (Class<?>) PaymentStatusActivity.class);
                intent.putExtra("payment.result", transactionResponse);
                startActivityForResult(intent, 210);
                return;
            }
        }
        Intent intent2 = new Intent();
        intent2.putExtra("transaction_response", transactionResponse);
        setResult(-1, intent2);
        finish();
        int i3 = asInterface + 57;
        cancelAll = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public final void b(TransactionResponse transactionResponse, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        if (this.TuitionPaymentFragmentbindingInflater1) {
            Intent intent = new Intent(this, (Class<?>) WebViewPaymentActivity.class);
            intent.putExtra("extra.paymentType", str);
            intent.putExtra("extra.url", transactionResponse.getRedirectUrl());
            startActivityForResult(intent, 111);
            return;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("transaction_response", transactionResponse);
        setResult(-1, intent2);
        finish();
        int i4 = cancelAll + 73;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0064 A[Catch: Exception -> 0x0114, PHI: r2
  0x0064: PHI (r2v7 java.lang.String) = (r2v6 java.lang.String), (r2v9 java.lang.String) binds: [B:18:0x0062, B:13:0x004d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {Exception -> 0x0114, blocks: (B:3:0x0006, B:5:0x001c, B:10:0x0039, B:12:0x004b, B:19:0x0064, B:23:0x0079, B:25:0x008d, B:33:0x00ab, B:38:0x00c9, B:32:0x00a8, B:30:0x0094, B:39:0x00de, B:41:0x00e9, B:17:0x0052, B:43:0x00f6), top: B:52:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x006e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0079 A[Catch: Exception -> 0x0114, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0114, blocks: (B:3:0x0006, B:5:0x001c, B:10:0x0039, B:12:0x004b, B:19:0x0064, B:23:0x0079, B:25:0x008d, B:33:0x00ab, B:38:0x00c9, B:32:0x00a8, B:30:0x0094, B:39:0x00de, B:41:0x00e9, B:17:0x0052, B:43:0x00f6), top: B:52:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0094 A[Catch: Exception -> 0x0114, TRY_ENTER, TryCatch #2 {Exception -> 0x0114, blocks: (B:3:0x0006, B:5:0x001c, B:10:0x0039, B:12:0x004b, B:19:0x0064, B:23:0x0079, B:25:0x008d, B:33:0x00ab, B:38:0x00c9, B:32:0x00a8, B:30:0x0094, B:39:0x00de, B:41:0x00e9, B:17:0x0052, B:43:0x00f6), top: B:52:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a8 A[Catch: Exception -> 0x0114, PHI: r3 r5 r7 r9
  0x00a8: PHI (r3v8 java.lang.String) = (r3v7 java.lang.String), (r3v11 java.lang.String) binds: [B:31:0x00a6, B:26:0x008f] A[DONT_GENERATE, DONT_INLINE]
  0x00a8: PHI (r5v2 double) = (r5v1 double), (r5v7 double) binds: [B:31:0x00a6, B:26:0x008f] A[DONT_GENERATE, DONT_INLINE]
  0x00a8: PHI (r7v1 double) = (r7v0 double), (r7v3 double) binds: [B:31:0x00a6, B:26:0x008f] A[DONT_GENERATE, DONT_INLINE]
  0x00a8: PHI (r9v1 com.midtrans.sdk.uikit.widgets.BoldTextView) = (r9v0 com.midtrans.sdk.uikit.widgets.BoldTextView), (r9v2 com.midtrans.sdk.uikit.widgets.BoldTextView) binds: [B:31:0x00a6, B:26:0x008f] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {Exception -> 0x0114, blocks: (B:3:0x0006, B:5:0x001c, B:10:0x0039, B:12:0x004b, B:19:0x0064, B:23:0x0079, B:25:0x008d, B:33:0x00ab, B:38:0x00c9, B:32:0x00a8, B:30:0x0094, B:39:0x00de, B:41:0x00e9, B:17:0x0052, B:43:0x00f6), top: B:52:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e9 A[Catch: Exception -> 0x0114, TryCatch #2 {Exception -> 0x0114, blocks: (B:3:0x0006, B:5:0x001c, B:10:0x0039, B:12:0x004b, B:19:0x0064, B:23:0x0079, B:25:0x008d, B:33:0x00ab, B:38:0x00c9, B:32:0x00a8, B:30:0x0094, B:39:0x00de, B:41:0x00e9, B:17:0x0052, B:43:0x00f6), top: B:52:0x0006 }] */
    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        String currency;
        PaymentDetails paymentDetails;
        TextView textView;
        int i2;
        double totalAmount;
        double amount;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        BoldTextView boldTextView;
        RecyclerView recyclerView;
        int i3 = 2 % 2;
        super.setContentView(i);
        try {
            new Handler().post(new Runnable() { // from class: com.midtrans.sdk.uikit.abstracts.BasePaymentActivity.3
                @Override // java.lang.Runnable
                public final void run() {
                    MerchantPreferences preference;
                    BasePaymentActivity basePaymentActivity = BasePaymentActivity.this;
                    ImageView imageView = (ImageView) basePaymentActivity.findViewById(R.id.merchant_logo);
                    DefaultTextView defaultTextView = (DefaultTextView) basePaymentActivity.findViewById(R.id.text_page_merchant_name);
                    MerchantData merchantData = basePaymentActivity.j_().getMerchantData();
                    if (merchantData != null && (preference = merchantData.getPreference()) != null) {
                        String displayName = preference.getDisplayName();
                        String logoUrl = preference.getLogoUrl();
                        if (TextUtils.isEmpty(logoUrl)) {
                            if (displayName != null && defaultTextView != null && !TextUtils.isEmpty(displayName)) {
                                basePaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                                defaultTextView.setVisibility(0);
                                defaultTextView.setText(displayName);
                                if (imageView != null) {
                                    imageView.setVisibility(8);
                                }
                            }
                        } else if (imageView != null) {
                            basePaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                            calculateInvertedTextureTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault2(imageView).TuitionPaymentFragmentbindingInflater1(logoUrl);
                            imageView.setVisibility(0);
                        }
                    }
                    final BasePaymentActivity basePaymentActivity2 = BasePaymentActivity.this;
                    Toolbar toolbar = (Toolbar) basePaymentActivity2.findViewById(R.id.main_toolbar);
                    if (toolbar != null) {
                        Drawable drawable = ContextCompat.getDrawable(basePaymentActivity2, 2131231099);
                        if (drawable != null) {
                            drawable.setColorFilter(((BaseActivity) basePaymentActivity2).b, PorterDuff.Mode.SRC_ATOP);
                        }
                        toolbar.setNavigationIcon(drawable);
                        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.abstracts.BasePaymentActivity.8
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                                try {
                                    BasePaymentActivity.this.onBackPressed();
                                } finally {
                                    ViewPortBuilder.b();
                                }
                            }
                        });
                        if (basePaymentActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) toolbar.getLayoutParams();
                            ((ViewGroup.LayoutParams) layoutParams).height += (int) basePaymentActivity2.getResources().getDimension(R.dimen.toolbar_expansion_size);
                            toolbar.setLayoutParams(layoutParams);
                        }
                    }
                }
            });
            if (findViewById(R.id.container_item_details) != null) {
                Transaction transaction = j_().getTransaction();
                List<ItemDetails> itemDetailsList = null;
                if (transaction.getTransactionDetails() != null) {
                    int i4 = asInterface + 63;
                    cancelAll = i4 % 128;
                    if (i4 % 2 == 0) {
                        currency = transaction.getTransactionDetails().getCurrency();
                        BoldTextView boldTextView2 = (BoldTextView) findViewById(R.id.text_amount);
                        this.f850a = boldTextView2;
                        int i5 = 43 / 0;
                        if (boldTextView2 != null) {
                            paymentDetails = j_().getPaymentDetails();
                            if (paymentDetails != null) {
                                i2 = asInterface + 119;
                                cancelAll = i2 % 128;
                                if (i2 % 2 == 0) {
                                    totalAmount = paymentDetails.getTotalAmount();
                                    amount = transaction.getTransactionDetails().getAmount();
                                    strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(totalAmount, currency);
                                    boldTextView = this.f850a;
                                    int i6 = 95 / 0;
                                    if (boldTextView != null) {
                                        boldTextView.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                    }
                                } else {
                                    totalAmount = paymentDetails.getTotalAmount();
                                    amount = transaction.getTransactionDetails().getAmount();
                                    strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(totalAmount, currency);
                                    boldTextView = this.f850a;
                                    if (boldTextView != null) {
                                        boldTextView.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                    }
                                }
                                TuitionPaymentFragmentbindingInflater1(amount, totalAmount);
                                itemDetailsList = paymentDetails.getItemDetailsList();
                                recyclerView = (RecyclerView) findViewById(R.id.rv_transaction_detail);
                                if (recyclerView != null) {
                                    int i7 = cancelAll + 119;
                                    asInterface = i7 % 128;
                                    int i8 = i7 % 2;
                                    if (itemDetailsList != null) {
                                        recyclerView.setHasFixedSize(true);
                                        recyclerView.setLayoutManager(new LinearLayoutManager(this));
                                        MediaBrowserCompatCallbackHandler mediaBrowserCompatCallbackHandler = new MediaBrowserCompatCallbackHandler(itemDetailsList, currency);
                                        this.asBinder = mediaBrowserCompatCallbackHandler;
                                        recyclerView.setAdapter(mediaBrowserCompatCallbackHandler);
                                    }
                                }
                            }
                            textView = (TextView) findViewById(R.id.text_order_id);
                            if (textView != null) {
                                textView.setText(transaction.getTransactionDetails().getOrderId());
                            }
                        }
                    } else {
                        currency = transaction.getTransactionDetails().getCurrency();
                        BoldTextView boldTextView3 = (BoldTextView) findViewById(R.id.text_amount);
                        this.f850a = boldTextView3;
                        if (boldTextView3 != null) {
                            paymentDetails = j_().getPaymentDetails();
                            if (paymentDetails != null) {
                                i2 = asInterface + 119;
                                cancelAll = i2 % 128;
                                if (i2 % 2 == 0) {
                                    totalAmount = paymentDetails.getTotalAmount();
                                    amount = transaction.getTransactionDetails().getAmount();
                                    strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(totalAmount, currency);
                                    boldTextView = this.f850a;
                                    int i9 = 95 / 0;
                                    if (boldTextView != null) {
                                        boldTextView.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                    }
                                } else {
                                    totalAmount = paymentDetails.getTotalAmount();
                                    amount = transaction.getTransactionDetails().getAmount();
                                    strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(totalAmount, currency);
                                    boldTextView = this.f850a;
                                    if (boldTextView != null) {
                                        boldTextView.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                    }
                                }
                                TuitionPaymentFragmentbindingInflater1(amount, totalAmount);
                                itemDetailsList = paymentDetails.getItemDetailsList();
                                recyclerView = (RecyclerView) findViewById(R.id.rv_transaction_detail);
                                if (recyclerView != null) {
                                    int i10 = cancelAll + 119;
                                    asInterface = i10 % 128;
                                    int i11 = i10 % 2;
                                    if (itemDetailsList != null) {
                                        recyclerView.setHasFixedSize(true);
                                        recyclerView.setLayoutManager(new LinearLayoutManager(this));
                                        MediaBrowserCompatCallbackHandler mediaBrowserCompatCallbackHandler2 = new MediaBrowserCompatCallbackHandler(itemDetailsList, currency);
                                        this.asBinder = mediaBrowserCompatCallbackHandler2;
                                        recyclerView.setAdapter(mediaBrowserCompatCallbackHandler2);
                                    }
                                }
                            }
                            textView = (TextView) findViewById(R.id.text_order_id);
                            if (textView != null) {
                                textView.setText(transaction.getTransactionDetails().getOrderId());
                            }
                        }
                    }
                }
                if (itemDetailsList != null) {
                    findViewById(R.id.background_dim).setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.abstracts.BasePaymentActivity.2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                            try {
                                BasePaymentActivity.this.d();
                            } finally {
                                ViewPortBuilder.b();
                            }
                        }
                    });
                    ((LinearLayout) findViewById(R.id.container_item_details)).setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.abstracts.BasePaymentActivity.4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                            try {
                                BasePaymentActivity.this.d();
                            } finally {
                                ViewPortBuilder.b();
                            }
                        }
                    });
                }
            }
        } catch (Exception e2) {
            String str = d;
            StringBuilder sb = new StringBuilder("appbar:");
            sb.append(e2.getMessage());
            Logger.e(str, sb.toString());
        }
    }

    public final void d() {
        int i = 2 % 2;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_transaction_detail);
        View viewFindViewById = findViewById(R.id.background_dim);
        if (recyclerView != null) {
            int i2 = asInterface;
            int i3 = i2 + 107;
            cancelAll = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 64 / 0;
                if (viewFindViewById == null) {
                    return;
                }
            } else if (viewFindViewById == null) {
                return;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                int i5 = i2 + 39;
                cancelAll = i5 % 128;
                int i6 = i5 % 2;
                recyclerView.setVisibility(8);
                ((TextView) findViewById(R.id.text_amount)).setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231080, 0);
                viewFindViewById.setVisibility(8);
            } else {
                recyclerView.setVisibility(0);
                ((TextView) findViewById(R.id.text_amount)).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                viewFindViewById.setVisibility(0);
                int i7 = asInterface + 113;
                cancelAll = i7 % 128;
                int i8 = i7 % 2;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = !this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(double d2) {
        String currency;
        int i = 2 % 2;
        if (this.f850a != null) {
            int i2 = cancelAll + 35;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                j_().getTransaction().getTransactionDetails();
                throw null;
            }
            TransactionDetails transactionDetails = j_().getTransaction().getTransactionDetails();
            if (transactionDetails != null) {
                int i3 = asInterface + 87;
                cancelAll = i3 % 128;
                int i4 = i3 % 2;
                TuitionPaymentFragmentbindingInflater1(transactionDetails.getAmount(), d2);
                currency = transactionDetails.getCurrency();
                PaymentDetails paymentDetails = j_().getPaymentDetails();
                if (paymentDetails != null) {
                    int i5 = cancelAll + 19;
                    asInterface = i5 % 128;
                    int i6 = i5 % 2;
                    if (paymentDetails.getItemDetailsList() != null) {
                        paymentDetails.changePaymentDetails(this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1, d2);
                    }
                }
            } else {
                currency = Currency.IDR;
            }
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(d2, currency);
            BoldTextView boldTextView = this.f850a;
            if (boldTextView != null) {
                int i7 = asInterface + 123;
                cancelAll = i7 % 128;
                if (i7 % 2 != 0) {
                    boldTextView.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                } else {
                    boldTextView.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    int i8 = 3 / 0;
                }
            }
        }
    }

    private String TuitionPaymentFragmentspecialinlinedviewModeldefault3(double d2, String str) {
        int i = 2 % 2;
        if (!TextUtils.isEmpty(str)) {
            str.hashCode();
            if (str.equals(Currency.SGD)) {
                return getString(R.string.prefix_money_sgd, Utils.getFormattedAmount(d2));
            }
            int i2 = asInterface + 67;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
            return getString(R.string.prefix_money, Utils.getFormattedAmount(d2));
        }
        int i4 = cancelAll + 13;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        String string = getString(R.string.prefix_money, Utils.getFormattedAmount(d2));
        int i6 = asInterface + 65;
        cancelAll = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 6 / 0;
        }
        return string;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        int i = 2 % 2;
        int i2 = asInterface + 107;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cRed = (char) Color.red(0);
            int iMyPid = (Process.myPid() >> 22) + 1031;
            int packedPositionType = 15 - ExpandableListView.getPackedPositionType(0L);
            byte b = $$g[7];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            k(b, b2, (short) (b2 | 141), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRed, iMyPid, packedPositionType, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        l(new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, new int[]{0, 22, 0, 0}, true, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        l(new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, new int[]{22, 15, 0, 0}, false, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1032;
            int i4 = 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            byte b3 = $$g[7];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            k(b3, b4, (short) (b4 | 89), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, iLastIndexOf, i4, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = cancelAll + 19;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
                int i7 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14;
                byte b5 = $$g[5];
                Object[] objArr6 = new Object[1];
                k((byte) 52, b5, (short) (b5 | 36), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(modifierMetaStateMask, keyRepeatTimeout, i7, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i8 = ((int[]) objArr7[3])[0];
            int i9 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i10 = ~((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_card_atm_bersama).substring(52, 57).codePointAt(4) + 325154855) | (-691922904));
            int i11 = (((((-1073608664) | i10) * (-196)) - 1525585399) + ((i10 | 381685760) * 196)) - 1438099933;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[2])[0] = i13 ^ (i13 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            l(new byte[]{0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0}, new int[]{37, 16, 10, 3}, false, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            l(new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, new int[]{53, 16, 134, 0}, true, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {458793701};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 46038), 1134 - TextUtils.indexOf("", "", 0, 0), 18 - KeyEvent.getDeadChar(0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1438099933, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char touchSlop2 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1032;
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 15;
                    byte b6 = $$g[7];
                    byte b7 = b6;
                    Object[] objArr12 = new Object[1];
                    k(b6, b7, (short) (b7 | 141), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop2, packedPositionChild, fadingEdgeLength, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45994 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 1117 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 1031;
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15;
                    byte b8 = $$g[5];
                    Object[] objArr13 = new Object[1];
                    k((byte) 52, b8, (short) (b8 | 36), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, deadChar, minimumFlingVelocity, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    l(new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, new int[]{0, 22, 0, 0}, true, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    l(new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, new int[]{22, 15, 0, 0}, false, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int iGreen = 1031 - Color.green(0);
                        int threadPriority = 15 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte b9 = $$g[7];
                        byte b10 = b9;
                        Object[] objArr16 = new Object[1];
                        k(b9, b10, (short) (b10 | 89), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(tapTimeout, iGreen, threadPriority, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1031;
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 16;
                        byte b11 = $$g[7];
                        byte b12 = b11;
                        Object[] objArr17 = new Object[1];
                        k(b11, b12, (short) (b12 | 141), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maximumFlingVelocity, longPressTimeout, bitsPerPixel, 1357589585, false, (String) objArr17[0], null);
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
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[3])[0];
            int i18 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i19 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 403977246);
            int i20 = i16 + ((((-1216497432) + (((~((-390655839) | i19)) | 146375668) * (-933))) + (((~(i19 | 146375668)) | (-536473599)) * 933)) - 1390983392);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr18[2])[0] = i22 ^ (i22 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i23 = 0;
                while (i23 < strArr3.length) {
                    arrayList.add(strArr3[i23]);
                    i23++;
                    int i24 = asInterface + 15;
                    cancelAll = i24 % 128;
                    int i25 = i24 % 2;
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
            int i30 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
            int i31 = 462464089 + (((~((-880019860) | i30)) | 269484434 | (~(635739689 | i30))) * (-880));
            int i32 = (~((-880019860) | (~i30))) | (-635739690);
            int i33 = ~(i30 | 880019859);
            int i34 = i27 + i31 + ((i32 | i33) * (-880)) + (i33 * 880);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr19[2])[0] = i36 ^ (i36 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char tapTimeout2 = (char) (29944 - (ViewConfiguration.getTapTimeout() >> 16));
            int iMyTid = 1755 - (Process.myTid() >> 22);
            int iLastIndexOf2 = 22 - TextUtils.lastIndexOf("", '0');
            byte b13 = $$g[7];
            Object[] objArr20 = new Object[1];
            k((byte) 15, b13, (short) (b13 | 37), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(tapTimeout2, iMyTid, iLastIndexOf2, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29944);
                int iLastIndexOf3 = TextUtils.lastIndexOf("", '0') + 1756;
                int i37 = 24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                byte b14 = $$g[7];
                byte b15 = b14;
                Object[] objArr21 = new Object[1];
                k(b14, b15, (short) (b15 | 89), objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c, iLastIndexOf3, i37, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int i38 = ~System.identityHashCode(this);
            int i39 = ((176792851 + (((-4284442) | i38) * 494)) + (((~(i38 | (-415328288))) | 1034690118) * 494)) - 2116185449;
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i41 ^ (i41 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            l(new byte[]{0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0}, new int[]{37, 16, 10, 3}, false, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            l(new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, new int[]{53, 16, 134, 0}, true, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {458793701};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 42049), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1726, 30 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = MediaSessionCompat.MediaSessionImplBase.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -2116185449);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cMyTid = (char) (29944 - (Process.myTid() >> 22));
                int doubleTapTimeout = 1755 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iAlpha = 23 - Color.alpha(0);
                byte b16 = $$g[7];
                byte b17 = b16;
                Object[] objArr26 = new Object[1];
                k(b16, b17, (short) (b17 | 89), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cMyTid, doubleTapTimeout, iAlpha, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                l(new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, new int[]{0, 22, 0, 0}, true, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                l(new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, new int[]{22, 15, 0, 0}, false, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 29945);
                    int i42 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1754;
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 23;
                    byte b18 = $$g[7];
                    byte b19 = b18;
                    Object[] objArr29 = new Object[1];
                    k(b18, b19, b19, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf, i42, iResolveOpacity, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c2 = (char) (29944 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 1755;
                    int iRed = 23 - Color.red(0);
                    byte b20 = $$g[7];
                    Object[] objArr30 = new Object[1];
                    k((byte) 15, b20, (short) (b20 | 37), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c2, threadPriority2, iRed, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr5 != null) {
                int i43 = asInterface + 75;
                cancelAll = i43 % 128;
                int i44 = i43 % 2;
                for (String str : strArr5) {
                    arrayList2.add(str);
                }
            }
            throw null;
        }
        int i45 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
        int i46 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
        int i47 = ~i46;
        int i48 = i45 + (-2085564891) + ((i46 | (-291800752)) * 140) + (((~((-291800752) | i47)) | 268469417) * (-280)) + (((~(i46 | (-268469418))) | (~(504403177 | i47)) | (-527734512)) * 140);
        int i49 = (i48 << 13) ^ i48;
        int i50 = i49 ^ (i49 >>> 17);
        ((int[]) objArr31[3])[0] = i50 ^ (i50 << 5);
    }

    private static void l(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        char[] cArr;
        char[] cArr2;
        char c;
        int i = 2;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr3 = g;
        if (cArr3 != null) {
            int i9 = $10;
            int i10 = i9 + 63;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i12 = i9 + 83;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 0;
            while (i14 < length) {
                int i15 = $10 + 101;
                $11 = i15 % 128;
                if (i15 % i == 0) {
                    try {
                        Object[] objArr2 = new Object[i5];
                        objArr2[i3] = Integer.valueOf(cArr3[i14]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1270;
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', i3) + 19;
                            byte b = $$l[i5];
                            byte b2 = (byte) (b + 1);
                            byte b3 = (byte) (-b);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop, minimumFlingVelocity, iLastIndexOf, 407021364, false, $$r(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i14 >>>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i14])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                        int iBlue = Color.blue(0) + 1270;
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 18;
                        byte b4 = $$l[1];
                        byte b5 = (byte) (b4 + 1);
                        byte b6 = (byte) (-b4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, iBlue, absoluteGravity, 407021364, false, $$r(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i14++;
                }
                int i16 = $11 + 121;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                i = 2;
                i3 = 0;
                i5 = 1;
            }
            cArr3 = cArr4;
        }
        char[] cArr5 = new char[i6];
        System.arraycopy(cArr3, i4, cArr5, 0, i6);
        if (bArr != null) {
            int i18 = $11 + 5;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                cArr2 = new char[i6];
                c = 0;
                setvideostabilizationmode.b = 0;
            } else {
                cArr2 = new char[i6];
                setvideostabilizationmode.b = 0;
                c = 0;
            }
            while (setvideostabilizationmode.b < i6) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i19 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr5[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int i20 = 3226 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int iIndexOf = 13 - TextUtils.indexOf("", "", 0);
                        byte b7 = (byte) ($$l[1] + 1);
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(windowTouchSlop, i20, iIndexOf, 2133916302, false, $$r(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i19] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                } else {
                    int i21 = setvideostabilizationmode.b;
                    Object[] objArr5 = {Integer.valueOf(cArr5[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char deadChar = (char) (29944 - KeyEvent.getDeadChar(0, 0));
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1755;
                        int threadPriority = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte b9 = (byte) ($$l[1] + 1);
                        byte b10 = (byte) (b9 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(deadChar, iNormalizeMetaState, threadPriority, 387247676, false, $$r(b9, b10, (byte) (b10 - 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i21] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                }
                c = cArr2[setvideostabilizationmode.b];
                Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cRed = (char) (Color.red(0) + 41241);
                    int mode = 1705 - View.MeasureSpec.getMode(0);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 21;
                    byte b11 = $$l[1];
                    byte b12 = (byte) (b11 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRed, mode, scrollBarFadeDuration, -1434471773, false, $$r(b12, (byte) (b12 | 6), (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            cArr5 = cArr2;
        }
        if (i8 > 0) {
            char[] cArr6 = new char[i6];
            System.arraycopy(cArr5, 0, cArr6, 0, i6);
            int i22 = i6 - i8;
            System.arraycopy(cArr6, 0, cArr5, i22, i8);
            System.arraycopy(cArr6, i8, cArr5, 0, i22);
        }
        if (z) {
            int i23 = $10 + 23;
            $11 = i23 % 128;
            if (i23 % 2 == 0) {
                cArr = new char[i6];
                setvideostabilizationmode.b = 0;
            } else {
                cArr = new char[i6];
                setvideostabilizationmode.b = 0;
            }
            while (setvideostabilizationmode.b < i6) {
                int i24 = $10 + 15;
                $11 = i24 % 128;
                int i25 = i24 % 2;
                cArr[setvideostabilizationmode.b] = cArr5[(i6 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
            }
            cArr5 = cArr;
        }
        if (i7 > 0) {
            int i26 = 0;
            while (true) {
                setvideostabilizationmode.b = i26;
                if (setvideostabilizationmode.b >= i6) {
                    break;
                }
                cArr5[setvideostabilizationmode.b] = (char) (cArr5[setvideostabilizationmode.b] - iArr[2]);
                i26 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr5);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = asInterface + 11;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = cancelAll + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$r(short r6, byte r7, byte r8) {
        /*
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r7 = r7 + 99
            int r6 = r6 * 2
            int r0 = 1 - r6
            byte[] r1 = com.midtrans.sdk.uikit.abstracts.BasePaymentActivity.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2a:
            int r8 = -r8
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.abstracts.BasePaymentActivity.$$r(short, byte, byte):java.lang.String");
    }
}
