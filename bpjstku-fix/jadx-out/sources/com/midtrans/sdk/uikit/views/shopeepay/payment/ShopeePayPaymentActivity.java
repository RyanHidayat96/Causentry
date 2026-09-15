package com.midtrans.sdk.uikit.views.shopeepay.payment;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStub;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import com.bpjstku.R;
import com.bpjstku.data.syariah.model.response.SyariahFaqResponse;
import com.google.android.gms.internal.measurement.zzdm;
import com.midtrans.sdk.corekit.callback.TransactionCallback;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.views.shopeepay.status.ShopeePayStatusActivity;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import defpackage.EncoderImplByteBufferInput;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.ViewPortBuilder;
import defpackage.calculateCameraUseCases;
import defpackage.createExtraPreview;
import defpackage.getVirtualCameraAdapter;
import defpackage.handleMessage;
import defpackage.initSession;
import defpackage.lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing;
import defpackage.onConnectionFailed;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class ShopeePayPaymentActivity extends BasePaymentActivity implements getVirtualCameraAdapter {
    private lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing INotificationSideChannel;
    private FancyButton asInterface;
    private int cancel;
    private int d;
    private Boolean g = Boolean.FALSE;
    private static final byte[] $$m = {80, -8, 43, 65};
    private static final int $$n = 135;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {25, 31, 20, 1, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$k = 131;
    private static int cancelAll = 0;
    private static int onTransact = 1;
    private static int[] notify = {-1917278427, 1417019291, 1694859504, 477415808, -240624235, 745503641, 429881679, -261267586, -1992287824, 1844714756, -1857729262, 1849568680, 1547302365, 1372281302, -1810752280, 1631897838, -1529266224, 716989702};

    public static /* synthetic */ lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing TuitionPaymentFragmentbindingInflater1(ShopeePayPaymentActivity shopeePayPaymentActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 87;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing lambdaaddcameraerrorlistener1androidxcameracorestreamsharingstreamsharing = shopeePayPaymentActivity.INotificationSideChannel;
        int i5 = i3 + 29;
        cancelAll = i5 % 128;
        if (i5 % 2 == 0) {
            return lambdaaddcameraerrorlistener1androidxcameracorestreamsharingstreamsharing;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        ShopeePayPaymentActivity shopeePayPaymentActivity = (ShopeePayPaymentActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 117;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        shopeePayPaymentActivity.setPrimaryBackgroundColor(shopeePayPaymentActivity.asInterface);
        int i4 = cancelAll + 65;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ShopeePayPaymentActivity shopeePayPaymentActivity, String str) {
        int i = 2 % 2;
        int i2 = onTransact + 51;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        shopeePayPaymentActivity.TuitionPaymentFragmentbindingInflater1(str);
        int i4 = cancelAll + 59;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = (~(i3 | i6)) | i5;
        int i8 = i6 | i3 | i5;
        int i9 = ~i3;
        int i10 = i3 + i5 + i + ((-421447895) * i2) + ((-859425246) * i4);
        int i11 = i10 * i10;
        int i12 = (i3 * (-629045104)) + 1817116672 + ((-629045104) * i5) + (i7 * (-1407420559)) + ((-1407420559) * i8) + (1407420559 * i9) + ((-2036465664) * i) + ((-2125594624) * i2) + (888930304 * i4) + (441384960 * i11);
        int i13 = (i3 * 1303038832) + 2077918271 + (i5 * 1303038832) + (i7 * (-49)) + (i8 * (-49)) + (i9 * 49) + (i * 1303038783) + (i2 * 1583617559) + (i4 * (-1102559138)) + (i11 * 510722048);
        return i12 + ((i13 * i13) * 607191040) != 1 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ShopeePayPaymentActivity shopeePayPaymentActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        cancelAll = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            shopeePayPaymentActivity.asBinder();
            lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing lambdaaddcameraerrorlistener1androidxcameracorestreamsharingstreamsharing = shopeePayPaymentActivity.INotificationSideChannel;
            lambdaaddcameraerrorlistener1androidxcameracorestreamsharingstreamsharing.b().readAuthenticationToken();
            lambdaaddcameraerrorlistener1androidxcameracorestreamsharingstreamsharing.TuitionPaymentFragmentbindingInflater1.booleanValue();
            obj.hashCode();
            throw null;
        }
        shopeePayPaymentActivity.asBinder();
        lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing lambdaaddcameraerrorlistener1androidxcameracorestreamsharingstreamsharing2 = shopeePayPaymentActivity.INotificationSideChannel;
        String authenticationToken = lambdaaddcameraerrorlistener1androidxcameracorestreamsharingstreamsharing2.b().readAuthenticationToken();
        if (lambdaaddcameraerrorlistener1androidxcameracorestreamsharingstreamsharing2.TuitionPaymentFragmentbindingInflater1.booleanValue()) {
            lambdaaddcameraerrorlistener1androidxcameracorestreamsharingstreamsharing2.b().paymentUsingShopeePayQris(authenticationToken, new TransactionCallback() { // from class: lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing.2
                public AnonymousClass2() {
                }

                @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                public final void onError(Throwable th) {
                    ((getVirtualCameraAdapter) lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
                }

                @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                public final void onFailure(TransactionResponse transactionResponse, String str) {
                    lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing.this.b = transactionResponse;
                    ((getVirtualCameraAdapter) lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
                }

                @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                public final void onSuccess(TransactionResponse transactionResponse) {
                    lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing.this.b = transactionResponse;
                    ((getVirtualCameraAdapter) lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
                }
            });
            return;
        }
        lambdaaddcameraerrorlistener1androidxcameracorestreamsharingstreamsharing2.b().paymentUsingShopeePayDeeplink(authenticationToken, new TransactionCallback() { // from class: lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing.4
            public AnonymousClass4() {
            }

            @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
            public final void onError(Throwable th) {
                ((getVirtualCameraAdapter) lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
            }

            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
            public final void onFailure(TransactionResponse transactionResponse, String str) {
                lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing.this.b = transactionResponse;
                ((getVirtualCameraAdapter) lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
            }

            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
            public final void onSuccess(TransactionResponse transactionResponse) {
                lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing.this.b = transactionResponse;
                ((getVirtualCameraAdapter) lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
            }
        });
        int i3 = onTransact + 69;
        cancelAll = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ShopeePayPaymentActivity shopeePayPaymentActivity, TransactionResponse transactionResponse) {
        int i = 2 % 2;
        Intent intent = new Intent();
        intent.putExtra("transaction_response", transactionResponse);
        shopeePayPaymentActivity.setResult(0, intent);
        shopeePayPaymentActivity.finish();
        int i2 = onTransact + 69;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ Boolean b(ShopeePayPaymentActivity shopeePayPaymentActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        int i3 = i2 % 128;
        cancelAll = i3;
        int i4 = i2 % 2;
        Boolean bool = shopeePayPaymentActivity.g;
        int i5 = i3 + 37;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    private static void m(int i, int i2, short s, Object[] objArr) {
        byte[] bArr = $$j;
        int i3 = 98 - (i2 * 14);
        int i4 = s + 4;
        byte[] bArr2 = new byte[i + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = (i4 + (-i3)) - 11;
            i4++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = (i3 + (-bArr[i4])) - 11;
            i4++;
            i5 = i6;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancelAll + 45;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface = (FancyButton) findViewById(R.id.button_primary);
        int i4 = cancelAll + 25;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
    }

    private void TuitionPaymentFragmentbindingInflater1(String str) {
        int i = 2 % 2;
        if (str != null) {
            Toast.makeText(this, getString(R.string.uikit_redirecting_to_shopee), 0).show();
            startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse(str)), 346);
            int i2 = onTransact + 19;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        Toast.makeText(this, R.string.shopeepay_payment_cant_open_deeplink, 0).show();
        int i4 = cancelAll + 45;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        super.onActivityResult(i, i2, intent);
        if (i == 210) {
            TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Intent intent2 = new Intent();
            intent2.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            setResult(-1, intent2);
            finish();
            return;
        }
        if (i == 346) {
            int i4 = cancelAll;
            int i5 = i4 + 87;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            this.cancel = i;
            int i7 = i4 + 23;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        if (!(!((BasePaymentActivity) this).TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            int i2 = cancelAll + 69;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                d();
                return;
            } else {
                d();
                int i3 = 14 / 0;
                return;
            }
        }
        if (!this.g.booleanValue()) {
            super.onBackPressed();
            int i4 = onTransact + 79;
            cancelAll = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        try {
            new AlertDialog.Builder(this, R.style.AlertDialogCustom).setPositiveButton(R.string.text_yes, new DialogInterface.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.shopeepay.payment.ShopeePayPaymentActivity.4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    if (ShopeePayPaymentActivity.this.isFinishing()) {
                        return;
                    }
                    dialogInterface.dismiss();
                    ShopeePayPaymentActivity shopeePayPaymentActivity = ShopeePayPaymentActivity.this;
                    ShopeePayPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(shopeePayPaymentActivity, ShopeePayPaymentActivity.TuitionPaymentFragmentbindingInflater1(shopeePayPaymentActivity).TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                }
            }).setNegativeButton(R.string.text_no, new DialogInterface.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.shopeepay.payment.ShopeePayPaymentActivity.5
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    if (ShopeePayPaymentActivity.this.isFinishing()) {
                        return;
                    }
                    dialogInterface.dismiss();
                }
            }).setTitle(R.string.cancel_transaction).setMessage(getString(R.string.uikit_confirm_shopeepay_deeplink)).create().show();
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("showDialog:");
            sb.append(e2.getMessage());
            Logger.e("ShopeePayPaymentActivity", sb.toString());
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        ShopeePayPaymentActivity shopeePayPaymentActivity = (ShopeePayPaymentActivity) objArr[0];
        TransactionResponse transactionResponse = (TransactionResponse) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 19;
        cancelAll = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            shopeePayPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, shopeePayPaymentActivity.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            obj.hashCode();
            throw null;
        }
        shopeePayPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, shopeePayPaymentActivity.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        int i3 = cancelAll + 33;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 14 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        int i = 2 % 2;
        int i2 = cancelAll + 87;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            b();
            int i3 = 80 / 0;
            if (!(!this.TuitionPaymentFragmentbindingInflater1)) {
                onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.b(th, this).TuitionPaymentFragmentbindingInflater1);
            }
        } else {
            b();
            if (this.TuitionPaymentFragmentbindingInflater1) {
                onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.b(th, this).TuitionPaymentFragmentbindingInflater1);
            }
        }
        int i4 = cancelAll + 27;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r4 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        r1 = com.midtrans.sdk.uikit.views.shopeepay.payment.ShopeePayPaymentActivity.onTransact + 23;
        com.midtrans.sdk.uikit.views.shopeepay.payment.ShopeePayPaymentActivity.cancelAll = r1 % 128;
        r1 = r1 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(r4, r3.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r1 != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r1 < 2) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r1 < 2) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r3.d = r1 + 1;
        defpackage.onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r3, getString(com.bpjstku.R.string.uikit_error_shopeepay_transaction));
        r4 = com.midtrans.sdk.uikit.views.shopeepay.payment.ShopeePayPaymentActivity.onTransact + 121;
        com.midtrans.sdk.uikit.views.shopeepay.payment.ShopeePayPaymentActivity.cancelAll = r4 % 128;
        r4 = r4 % 2;
     */
    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(com.midtrans.sdk.corekit.models.TransactionResponse r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.midtrans.sdk.uikit.views.shopeepay.payment.ShopeePayPaymentActivity.cancelAll
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.midtrans.sdk.uikit.views.shopeepay.payment.ShopeePayPaymentActivity.onTransact = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L16
            r3.b()
            int r1 = r3.d
            if (r1 >= r0) goto L35
            goto L1d
        L16:
            r3.b()
            int r1 = r3.d
            if (r1 >= r0) goto L35
        L1d:
            int r1 = r1 + 1
            r3.d = r1
            r4 = 2132020115(0x7f140b93, float:1.9678584E38)
            java.lang.String r4 = r3.getString(r4)
            defpackage.onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r3, r4)
            int r4 = com.midtrans.sdk.uikit.views.shopeepay.payment.ShopeePayPaymentActivity.onTransact
            int r4 = r4 + 121
            int r1 = r4 % 128
            com.midtrans.sdk.uikit.views.shopeepay.payment.ShopeePayPaymentActivity.cancelAll = r1
            int r4 = r4 % r0
            return
        L35:
            if (r4 == 0) goto L4e
            int r1 = com.midtrans.sdk.uikit.views.shopeepay.payment.ShopeePayPaymentActivity.onTransact
            int r1 = r1 + 23
            int r2 = r1 % 128
            com.midtrans.sdk.uikit.views.shopeepay.payment.ShopeePayPaymentActivity.cancelAll = r2
            int r1 = r1 % r0
            lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing r0 = r3.INotificationSideChannel
            boolean r0 = r0.TuitionPaymentFragmentspecialinlinedviewModeldefault1()
            r3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r4, r0)
            if (r1 != 0) goto L4c
            goto L4e
        L4c:
            r4 = 0
            throw r4
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.shopeepay.payment.ShopeePayPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(com.midtrans.sdk.corekit.models.TransactionResponse):void");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:17:0x00ea  */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        boolean z = false;
        int i2 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
        int i4 = ~i3;
        if (i2 != 476177244 + (((~(1466696653 | i4)) | (~((-636709111) | i3))) * 210) + (((~(i3 | 2013228031)) | (~(i4 | (-90177733)))) * 210)) {
            int[] iArr = new int[1114153551];
            iArr[1114153550] = 1;
            int i5 = (-1062243822) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i6 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        if (i6 != (((~((-1808038260) | iUptimeMillis)) | 1177596570) * 398) + 1797511606 + (((~((~iUptimeMillis) | (-1808038260))) | 1177596570) * 398)) {
            throw new RuntimeException("-1940833016");
        }
        super.onCreate(bundle);
        asBinder();
        setContentView(R.layout.uikit_activity_shopeepay_payment);
        lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing lambdaaddcameraerrorlistener1androidxcameracorestreamsharingstreamsharing = new lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing(this);
        this.INotificationSideChannel = lambdaaddcameraerrorlistener1androidxcameracorestreamsharingstreamsharing;
        if (onConnectionFailed.b((Activity) this).equals("TABLET")) {
            int i7 = onTransact + 81;
            cancelAll = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 96 / 0;
                if (getResources().getBoolean(R.bool.isTablet)) {
                    int i9 = onTransact + 21;
                    int i10 = i9 % 128;
                    cancelAll = i10;
                    int i11 = i9 % 2;
                    int i12 = i10 + 85;
                    onTransact = i12 % 128;
                    int i13 = i12 % 2;
                    z = true;
                } else {
                    int i14 = cancelAll + 17;
                    onTransact = i14 % 128;
                    int i15 = i14 % 2;
                }
            } else if (getResources().getBoolean(R.bool.isTablet)) {
                int i16 = onTransact + 21;
                int i17 = i16 % 128;
                cancelAll = i17;
                int i18 = i16 % 2;
                int i19 = i17 + 85;
                onTransact = i19 % 128;
                int i110 = i19 % 2;
                z = true;
            } else {
                int i111 = cancelAll + 17;
                onTransact = i111 % 128;
                int i112 = i111 % 2;
            }
        } else {
            int i113 = cancelAll + 17;
            onTransact = i113 % 128;
            int i114 = i113 % 2;
        }
        lambdaaddcameraerrorlistener1androidxcameracorestreamsharingstreamsharing.TuitionPaymentFragmentbindingInflater1 = Boolean.valueOf(z);
        ViewStub viewStub = (ViewStub) findViewById(R.id.shopee_layout_stub);
        if (this.INotificationSideChannel.TuitionPaymentFragmentbindingInflater1.booleanValue()) {
            viewStub.setLayoutResource(R.layout.uikit_layout_shopeepay_payment_tablet);
        } else {
            viewStub.setLayoutResource(R.layout.uikit_layout_shopeepay_payment);
        }
        viewStub.inflate();
        b(getString(R.string.uikit_shopeepay));
        this.asInterface.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.shopeepay.payment.ShopeePayPaymentActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    if (ShopeePayPaymentActivity.b(ShopeePayPaymentActivity.this).booleanValue()) {
                        ShopeePayPaymentActivity shopeePayPaymentActivity = ShopeePayPaymentActivity.this;
                        ShopeePayPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(shopeePayPaymentActivity, ShopeePayPaymentActivity.TuitionPaymentFragmentbindingInflater1(shopeePayPaymentActivity).TuitionPaymentFragmentspecialinlinedviewModeldefault3().getDeeplinkUrl());
                    } else {
                        ShopeePayPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(ShopeePayPaymentActivity.this);
                    }
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.asInterface.setTextBold();
        this.asInterface.setText(getString(R.string.uikit_shopeepay_confirm_button));
        this.asInterface.setIconResource(R.drawable.uikit_ic_shopeepay_white);
        this.asInterface.setIconPosition(2);
        b();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void b(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        b();
        if (!this.TuitionPaymentFragmentbindingInflater1) {
            TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Intent intent = new Intent();
            intent.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            setResult(-1, intent);
            finish();
            return;
        }
        Object obj = null;
        if (transactionResponse != null) {
            if (!TextUtils.isEmpty(transactionResponse.getDeeplinkUrl())) {
                if (TextUtils.isEmpty(transactionResponse.getQrisUrl())) {
                }
                int i2 = cancelAll + 37;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                if (this.INotificationSideChannel.TuitionPaymentFragmentbindingInflater1.booleanValue()) {
                    this.g = Boolean.TRUE;
                    TuitionPaymentFragmentbindingInflater1(transactionResponse.getDeeplinkUrl());
                    return;
                } else {
                    Intent intent2 = new Intent(this, (Class<?>) ShopeePayStatusActivity.class);
                    intent2.putExtra("extra.status", transactionResponse);
                    startActivityForResult(intent2, 210);
                    return;
                }
            }
            int i4 = onTransact + 17;
            cancelAll = i4 % 128;
            if (i4 % 2 != 0) {
                this.INotificationSideChannel.TuitionPaymentFragmentbindingInflater1.booleanValue();
                obj.hashCode();
                throw null;
            }
            if (this.INotificationSideChannel.TuitionPaymentFragmentbindingInflater1.booleanValue()) {
                if (TextUtils.isEmpty(transactionResponse.getQrisUrl()) || !this.INotificationSideChannel.TuitionPaymentFragmentbindingInflater1.booleanValue()) {
                    int i5 = cancelAll + 37;
                    onTransact = i5 % 128;
                    int i6 = i5 % 2;
                    if (this.INotificationSideChannel.TuitionPaymentFragmentbindingInflater1.booleanValue()) {
                        this.g = Boolean.TRUE;
                        TuitionPaymentFragmentbindingInflater1(transactionResponse.getDeeplinkUrl());
                        return;
                    } else {
                        Intent intent3 = new Intent(this, (Class<?>) ShopeePayStatusActivity.class);
                        intent3.putExtra("extra.status", transactionResponse);
                        startActivityForResult(intent3, 210);
                        return;
                    }
                }
            }
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
        int i7 = cancelAll + 101;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private static void n(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        int length;
        int[] iArr2;
        int i4;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = notify;
        int i6 = -1870535734;
        long j = 0;
        int i7 = 1;
        int i8 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i9 = 0;
            while (i9 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i9])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int i10 = (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 3290;
                        int packedPositionType = ExpandableListView.getPackedPositionType(j) + 31;
                        byte b = (byte) ($$n & 1);
                        byte b2 = (byte) (b - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, i10, packedPositionType, 1948206109, false, $$u(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr4[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i9++;
                    i6 = -1870535734;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = notify;
        if (iArr6 != null) {
            int i11 = $10 + 69;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i4 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i4 = 0;
            }
            while (i4 < length) {
                Object[] objArr3 = new Object[i7];
                objArr3[i8] = Integer.valueOf(iArr6[i4]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iArgb = 3291 - Color.argb(i8, i8, i8, i8);
                    int minimumFlingVelocity = 31 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte b3 = (byte) ($$n & 1);
                    byte b4 = (byte) (b3 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumFlingVelocity, iArgb, minimumFlingVelocity, 1948206109, false, $$u(b3, b4, b4), new Class[]{Integer.TYPE});
                }
                iArr2[i4] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i4++;
                i7 = 1;
                i8 = 0;
            }
            int i12 = $10 + 117;
            $11 = i12 % 128;
            i2 = 2;
            int i13 = i12 % 2;
            iArr6 = iArr2;
            i3 = 0;
        } else {
            i2 = 2;
            i3 = 0;
        }
        System.arraycopy(iArr6, i3, iArr5, i3, length3);
        sessionConfigValidatingBuilder.b = i2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i14 = $10 + 7;
            $11 = i14 % 128;
            int i15 = i14 % i2;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i16 = 17;
            for (int i17 = 1; i16 > i17; i17 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i16];
                try {
                    Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 2559 - (ViewConfiguration.getLongPressTimeout() >> 16), 29 - View.combineMeasuredStates(0, 0), 683220507, false, $$u(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i16--;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (28879 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 347, 25 - (Process.myTid() >> 22), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            i2 = 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -828158973
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
            java.lang.reflect.Member[] r1 = defpackage.calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            int r4 = java.lang.System.identityHashCode(r8)
            r5 = 303682308(0x1219d304, float:4.8538384E-28)
            r6 = r4 | r5
            int r6 = ~r6
            r7 = 1099050203(0x41822cdb, float:16.271902)
            r6 = r6 | r7
            int r6 = r6 * 305
            r7 = -573117390(0xffffffffddd6ec32, float:-1.935851E18)
            int r7 = r7 + r6
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = ~r4
            r5 = 1133669851(0x43926ddb, float:292.85825)
            r4 = r4 | r5
            int r4 = r4 * 305
            int r7 = r7 + r4
            if (r1 == r7) goto L51
            r1 = -828158973(0xffffffffcea34c03, float:-1.3698339E9)
            int[] r1 = new int[r1]
            r4 = -828158974(0xffffffffcea34c02, float:-1.3698337E9)
            r5 = 1
            r1[r4] = r5
            r4 = -406815738(0xffffffffe7c07c06, float:-1.8179644E24)
            int r4 = r4 % r0
            r4 = -1
            r1 = r1[r4]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r5)
            r1.show()
            int r1 = com.midtrans.sdk.uikit.views.shopeepay.payment.ShopeePayPaymentActivity.onTransact
            int r1 = r1 + 43
            int r4 = r1 % 128
            com.midtrans.sdk.uikit.views.shopeepay.payment.ShopeePayPaymentActivity.cancelAll = r4
            int r1 = r1 % r0
        L51:
            java.lang.reflect.Member[] r1 = defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r2 = java.lang.System.identityHashCode(r8)
            int r4 = ~r2
            r5 = 1759037180(0x68d8c6fc, float:8.189614E24)
            r5 = r5 | r4
            int r5 = ~r5
            r6 = -43125850(0xfffffffffd6df3a6, float:-1.9768258E37)
            r6 = r6 | r2
            int r6 = ~r6
            r5 = r5 | r6
            int r5 = r5 * 210
            r6 = 627634358(0x2568f0b6, float:2.0204348E-16)
            int r6 = r6 + r5
            r5 = -9438297(0xffffffffff6ffba7, float:-3.1899214E38)
            r4 = r4 | r5
            int r4 = ~r4
            r5 = 1792724733(0x6adacefd, float:1.3226165E26)
            r2 = r2 | r5
            int r2 = ~r2
            r2 = r2 | r4
            int r2 = r2 * 210
            int r6 = r6 + r2
            if (r1 != r6) goto Lb3
            super.onResume()
            int r1 = r8.cancel
            r2 = 346(0x15a, float:4.85E-43)
            if (r1 != r2) goto Lb2
            int r1 = com.midtrans.sdk.uikit.views.shopeepay.payment.ShopeePayPaymentActivity.cancelAll
            int r1 = r1 + 109
            int r2 = r1 % 128
            com.midtrans.sdk.uikit.views.shopeepay.payment.ShopeePayPaymentActivity.onTransact = r2
            int r1 = r1 % r0
            if (r1 == 0) goto Lae
            lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing r0 = r8.INotificationSideChannel
            if (r0 == 0) goto Lb2
            com.midtrans.sdk.corekit.core.MidtransSDK r1 = r0.b()
            java.lang.String r1 = r1.readAuthenticationToken()
            com.midtrans.sdk.corekit.core.MidtransSDK r2 = r0.b()
            lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing$3 r3 = new lambdaaddCameraErrorListener1androidxcameracorestreamsharingStreamSharing$3
            r3.<init>()
            r2.getTransactionStatus(r1, r3)
            goto Lb2
        Lae:
            r3.hashCode()
            throw r3
        Lb2:
            return
        Lb3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "-169093032"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.shopeepay.payment.ShopeePayPaymentActivity.onResume():void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 29944);
            int i2 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1754;
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 24;
            byte[] bArr = $$j;
            Object[] objArr2 = new Object[1];
            m((byte) 37, bArr[3], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, i2, iIndexOf, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i3 = cancelAll + 121;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int iBlue = Color.blue(0) + 1755;
                int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0');
                byte b = $$j[3];
                Object[] objArr3 = new Object[1];
                m((byte) 52, b, (short) (b | 36), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iBlue, iLastIndexOf, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i5 = (~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels) | 208198093;
            int i6 = (-1865642700) + (i5 * 495) + (((~i5) | 4198476) * 495) + 858232598;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            n(new int[]{1839815035, -2002523128, -631536411, -1746668445, -1331023675, -806140621, 1271893600, 648191777, 1094637619, -625331087}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            n(new int[]{-457547666, 1937209065, 1431215635, 952400969, -1471481863, -1162326395, 189750623, 1680655018, -480805932, 672618919}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step6).substring(6, 7).length() + 15, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {1151308831};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 42049), View.MeasureSpec.makeMeasureSpec(0, 0) + 1726, TextUtils.lastIndexOf("", '0', 0) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = EncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 858232598, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
                    int offsetBefore = 1755 - TextUtils.getOffsetBefore("", 0);
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 23;
                    byte b2 = $$j[3];
                    Object[] objArr8 = new Object[1];
                    m((byte) 52, b2, (short) (b2 | 36), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyTid, offsetBefore, iResolveSizeAndState, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    n(new int[]{289466425, 2043698162, -650033224, -184600460, 391437022, -1633334803, -1156871989, 1313226290, 1170200608, -1689166987, 1982289484, -1871927322, 958042597, -2073257802}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_bank_transfer).substring(0, 7).codePointAt(5) - 94, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    n(new int[]{1937793135, 795131796, -1823233537, 1329466345, 593462558, -1680378584, 1986413178, 1150573195, 61813431, -554956083}, View.resolveSize(0, 0) + 15, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cRgb = (char) ((-16747272) - Color.rgb(0, 0, 0));
                        int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 1755;
                        int scrollBarSize = 23 - (ViewConfiguration.getScrollBarSize() >> 8);
                        byte b3 = $$j[3];
                        Object[] objArr11 = new Object[1];
                        m((byte) 52, b3, (short) (b3 | 88), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, iIndexOf2, scrollBarSize, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char capsMode = (char) (29944 - TextUtils.getCapsMode("", 0, 0));
                        int i9 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1754;
                        int mirror = AndroidCharacter.getMirror('0') - 25;
                        byte[] bArr2 = $$j;
                        Object[] objArr12 = new Object[1];
                        m((byte) 37, bArr2[3], bArr2[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(capsMode, i9, mirror, 986134021, false, (String) objArr12[0], null);
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
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0];
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        if (i11 == i10) {
            int i12 = cancelAll + 13;
            onTransact = i12 % 128;
            int i13 = i12 % 2;
            int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i15 = i14 + 846062898 + ((~((-68420129) | iIdentityHashCode)) * (-301)) + (((~(120950436 | iIdentityHashCode)) | (~((~iIdentityHashCode) | 333552862))) * (-301)) + (((~(iIdentityHashCode | (-333552863))) | 120950436) * 301);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr13[3])[0] = i17 ^ (i17 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
            if (strArr != null) {
                int i18 = 0;
                while (i18 < strArr.length) {
                    arrayList.add(strArr[i18]);
                    i18++;
                    int i19 = cancelAll + 21;
                    onTransact = i19 % 128;
                    int i20 = i19 % 2;
                }
            }
            int[] iArr = new int[i11];
            int i21 = i11 - 1;
            iArr[i21] = 1;
            Toast.makeText((Context) null, iArr[((i11 * i21) % 2) - 1], 1).show();
            int i22 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
            int i23 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
            int i24 = i22 + ((~((~i23) | 1072657214)) * 130) + 504188975 + (((~(i23 | 1072657214)) | 574841092) * 130);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr14[3])[0] = i26 ^ (i26 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char size = (char) View.MeasureSpec.getSize(0);
            int i27 = 1031 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int iIndexOf3 = 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            byte b4 = $$j[3];
            Object[] objArr15 = new Object[1];
            m((byte) 52, b4, (short) (b4 | 140), objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(size, i27, iIndexOf3, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        n(new int[]{289466425, 2043698162, -650033224, -184600460, 391437022, -1633334803, -1156871989, 1313226290, 1170200608, -1689166987, 1982289484, -1871927322, 958042597, -2073257802}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        n(new int[]{1937793135, 795131796, -1823233537, 1329466345, 593462558, -1680378584, 1986413178, 1150573195, 61813431, -554956083}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_guideline_text).substring(9, 10).codePointAt(0) - 82, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1031;
            int i28 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            byte b5 = $$j[3];
            Object[] objArr18 = new Object[1];
            m((byte) 52, b5, (short) (b5 | 36), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, iKeyCodeFromString, i28, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i29 = onTransact + 29;
            cancelAll = i29 % 128;
            int i30 = i29 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
                int scrollBarSize2 = 1031 - (ViewConfiguration.getScrollBarSize() >> 8);
                int keyRepeatDelay = 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                byte b6 = $$j[7];
                byte b7 = b6;
                Object[] objArr19 = new Object[1];
                m(b6, b7, (short) (b7 | 193), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(capsMode2, scrollBarSize2, keyRepeatDelay, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i31 = ((int[]) objArr20[3])[0];
            int i32 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int i33 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
            int i34 = ~i33;
            int i35 = (-1981226907) + (((~(i33 | (-366786163))) | (~((-538968461) | i34)) | 294688290) * (-68)) + ((~((-72097873) | i34)) * (-68)) + (((~(366786162 | i34)) | (-611066333)) * 68) + 882517586;
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr[2])[0] = i37 ^ (i37 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            n(new int[]{1839815035, -2002523128, -631536411, -1746668445, -1331023675, -806140621, 1271893600, 648191777, 1094637619, -625331087}, View.MeasureSpec.makeMeasureSpec(0, 0) + 16, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            n(new int[]{-457547666, 1937209065, 1431215635, 952400969, -1471481863, -1162326395, 189750623, 1680655018, -480805932, 672618919}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {1151308831};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 46038), (ViewConfiguration.getLongPressTimeout() >> 16) + 1134, 18 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 882517586, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int iMakeMeasureSpec = 1031 - View.MeasureSpec.makeMeasureSpec(0, 0);
                int iIndexOf4 = TextUtils.indexOf("", "", 0, 0) + 15;
                byte b8 = $$j[3];
                Object[] objArr25 = new Object[1];
                m((byte) 52, b8, (short) (b8 | 140), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(windowTouchSlop, iMakeMeasureSpec, iIndexOf4, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45993), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1117, 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1031;
                int iRgb = Color.rgb(0, 0, 0) + 16777231;
                byte b9 = $$j[7];
                byte b10 = b9;
                Object[] objArr26 = new Object[1];
                m(b9, b10, (short) (b10 | 193), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cMakeMeasureSpec, scrollBarFadeDuration, iRgb, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                n(new int[]{289466425, 2043698162, -650033224, -184600460, 391437022, -1633334803, -1156871989, 1313226290, 1170200608, -1689166987, 1982289484, -1871927322, 958042597, -2073257802}, TextUtils.lastIndexOf("", '0', 0) + 23, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                n(new int[]{1937793135, 795131796, -1823233537, 1329466345, 593462558, -1680378584, 1986413178, 1150573195, 61813431, -554956083}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15;
                    byte b11 = $$j[3];
                    Object[] objArr29 = new Object[1];
                    m((byte) 52, b11, (short) (b11 | 36), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(doubleTapTimeout, keyRepeatTimeout, scrollDefaultDelay, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                    int packedPositionType = 1031 - ExpandableListView.getPackedPositionType(0L);
                    int i38 = 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte b12 = $$j[3];
                    Object[] objArr30 = new Object[1];
                    m((byte) 52, b12, (short) (b12 | 140), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cNormalizeMetaState2, packedPositionType, i38, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 == null) {
                throw null;
            }
            for (String str : strArr3) {
                int i39 = cancelAll + 17;
                onTransact = i39 % 128;
                int i40 = i39 % 2;
                arrayList2.add(str);
            }
            throw null;
        }
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i41 = ((int[]) objArr[2])[0];
        int i42 = ((int[]) objArr[3])[0];
        int i43 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i44 = ~(406363816 | iIdentityHashCode2);
        int i45 = i41 + (-1366919152) + (((-431603647) | i44) * (-814)) + ((i44 | (~((~iIdentityHashCode2) | 162083646)) | 136843816) * 407) + (((~(iIdentityHashCode2 | (-162083647))) | (~((-406363817) | iIdentityHashCode2)) | 136843816) * 407);
        int i46 = (i45 << 13) ^ i45;
        int i47 = i46 ^ (i46 >>> 17);
        ((int[]) objArr31[2])[0] = i47 ^ (i47 << 5);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = cancelAll + 119;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            if (i3 != 1217563452 + (((~(1710441600 | startUptimeMillis)) | (-880454058)) * (-964)) + (((~((~startUptimeMillis) | 1710441600)) | (-1979444650)) * (-964))) {
                throw null;
            }
        } else {
            int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int i5 = ~((~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels) | (-1284454263));
            if (i4 != (((-1604304896) | i5) * (-970)) + 1049923086 + ((i5 | 319850633) * 970)) {
                throw null;
            }
        }
        int i6 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_title_text).substring(0, 25).length() - 1022570045;
        if (i6 != (-1479480218) + (((-27566081) | length) * (-381)) + (((~((~length) | (-1945478313))) | 2119913133) * 381) + 1912741888) {
            throw new RuntimeException("-1009980090");
        }
        super.onStart();
        int i7 = cancelAll + 27;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int iB = zzdm.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzdm.b(), zzdm.b(), 1239200735, SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1239200734, iB, new Object[]{this});
    }

    @Override // defpackage.getVirtualCameraAdapter
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(TransactionResponse transactionResponse) {
        int iB = zzdm.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 25856491 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_confirm_shopeepay_qr_scan_tablet).substring(12, 17).length(), 1040302044, zzdm.b(), -1040302044, iB, new Object[]{this, transactionResponse});
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = cancelAll + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
    }

    private static String $$u(int i, int i2, byte b) {
        int i3 = 122 - (i * 56);
        byte[] bArr = $$m;
        int i4 = 4 - (i2 * 4);
        int i5 = b * 2;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            int i7 = i4 + i5;
            i4++;
            i3 = i7;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            int i8 = i4;
            i4 = i8 + 1;
            i3 += bArr[i4];
        }
    }
}
