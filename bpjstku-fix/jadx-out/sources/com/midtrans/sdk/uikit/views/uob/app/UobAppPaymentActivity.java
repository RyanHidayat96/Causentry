package com.midtrans.sdk.uikit.views.uob.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStub;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import com.bpjstku.R;
import com.bpjstku.data.promo.model.request.VoucherRequest;
import com.bpjstku.data.promo.model.response.ProvinceItem;
import com.midtrans.sdk.corekit.callback.GetTransactionStatusCallback;
import com.midtrans.sdk.corekit.callback.TransactionCallback;
import com.midtrans.sdk.corekit.core.Constants;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.corekit.models.snap.TransactionResult;
import com.midtrans.sdk.corekit.models.snap.TransactionStatusResponse;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.StreamSharingControl;
import defpackage.StreamSharingExternalSyntheticLambda2;
import defpackage.ViewPortBuilder;
import defpackage.abortCapture;
import defpackage.calculateCameraUseCases;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.createExtraPreview;
import defpackage.handleMessage;
import defpackage.initSession;
import defpackage.onConnectionFailed;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class UobAppPaymentActivity extends BasePaymentActivity implements StreamSharingControl {
    private FancyButton asInterface;
    private int cancel;
    private Boolean d = Boolean.FALSE;
    private int g;
    private StreamSharingExternalSyntheticLambda2 notify;
    private static final byte[] $$m = {49, 84, -120, 101};
    private static final int $$n = 251;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {60, 80, 13, 34, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$k = 134;
    private static int onTransact = 0;
    private static int INotificationSideChannel = 1;
    private static long cancelAll = 7699318611416878060L;

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(UobAppPaymentActivity uobAppPaymentActivity, String str) {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        uobAppPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
        int i4 = onTransact + 115;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(UobAppPaymentActivity uobAppPaymentActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 49;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Boolean bool = uobAppPaymentActivity.d;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 29;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ StreamSharingExternalSyntheticLambda2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(UobAppPaymentActivity uobAppPaymentActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        StreamSharingExternalSyntheticLambda2 streamSharingExternalSyntheticLambda2 = uobAppPaymentActivity.notify;
        if (i3 != 0) {
            return streamSharingExternalSyntheticLambda2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i;
        int i9 = (~(i7 | i8)) | (~(i8 | i5));
        int i10 = ~((~i5) | i2 | i);
        int i11 = i9 | i10;
        int i12 = (~(i5 | i8 | i2)) | i10;
        int i13 = i2 | i;
        int i14 = i2 + i + i4 + ((-1865910757) * i3) + ((-1665280692) * i6);
        int i15 = i14 * i14;
        int i16 = ((i2 * (-906343980)) - 215482368) + ((-906343980) * i) + (i11 * (-2063747539)) + (2063747539 * i12) + ((-2063747539) * i13) + (1324875776 * i4) + ((-1540882432) * i3) + ((-912261120) * i6) + (1566179328 * i15);
        int i17 = (i2 * (-52584228)) + 761582770 + (i * (-52584228)) + (i11 * 415) + (i12 * (-415)) + (i13 * 415) + (i4 * (-52583813)) + (i3 * (-195242759)) + (i6 * 1657508740) + (i15 * (-834797568));
        if (i16 + (i17 * i17 * 1251344384) != 1) {
            return b(objArr);
        }
        UobAppPaymentActivity uobAppPaymentActivity = (UobAppPaymentActivity) objArr[0];
        int i18 = 2 % 2;
        uobAppPaymentActivity.asBinder();
        StreamSharingExternalSyntheticLambda2 streamSharingExternalSyntheticLambda2 = uobAppPaymentActivity.notify;
        streamSharingExternalSyntheticLambda2.b().paymentUsingUobEzpay(streamSharingExternalSyntheticLambda2.b().readAuthenticationToken(), new TransactionCallback() { // from class: StreamSharingExternalSyntheticLambda2.1
            public AnonymousClass1() {
            }

            @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
            public final void onError(Throwable th) {
                ((StreamSharingControl) StreamSharingExternalSyntheticLambda2.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
            }

            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
            public final void onFailure(TransactionResponse transactionResponse, String str) {
                StreamSharingExternalSyntheticLambda2.this.b = transactionResponse;
                ((StreamSharingControl) StreamSharingExternalSyntheticLambda2.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
            }

            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
            public final void onSuccess(TransactionResponse transactionResponse) {
                StreamSharingExternalSyntheticLambda2.this.b = transactionResponse;
                ((StreamSharingControl) StreamSharingExternalSyntheticLambda2.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
            }
        });
        int i19 = INotificationSideChannel + 109;
        onTransact = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        UobAppPaymentActivity uobAppPaymentActivity = (UobAppPaymentActivity) objArr[0];
        TransactionResponse transactionResponse = (TransactionResponse) objArr[1];
        int i = 2 % 2;
        Intent intent = new Intent();
        intent.putExtra("transaction_response", transactionResponse);
        uobAppPaymentActivity.setResult(0, intent);
        uobAppPaymentActivity.finish();
        int i2 = onTransact + 119;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r0 = com.midtrans.sdk.uikit.views.uob.app.UobAppPaymentActivity.$$j
            int r1 = 53 - r7
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2d
        L15:
            r3 = r2
        L16:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L2d:
            int r6 = r6 + 1
            int r8 = r8 + r4
            int r8 = r8 + (-11)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.uob.app.UobAppPaymentActivity.m(int, byte, byte, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        setPrimaryBackgroundColor(this.asInterface);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface = (FancyButton) findViewById(R.id.button_primary);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 71;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (str != null) {
            Toast.makeText(this, getString(R.string.uikit_redirecting_to_uob), 0).show();
            startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse(str)), 347);
        } else {
            int i5 = i2 + 39;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            Toast.makeText(this, R.string.UOB_payment_cant_open_deeplink, 0).show();
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = INotificationSideChannel + 65;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        super.onActivityResult(i, i2, intent);
        if (i == 210) {
            TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Intent intent2 = new Intent();
            intent2.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            setResult(-1, intent2);
            finish();
            return;
        }
        if (i == 347) {
            this.cancel = i;
        }
        int i6 = INotificationSideChannel + 121;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        INotificationSideChannel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = ((BasePaymentActivity) this).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        if (((BasePaymentActivity) this).TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i3 = onTransact + 69;
            INotificationSideChannel = i3 % 128;
            int i4 = i3 % 2;
            d();
            int i5 = INotificationSideChannel + 119;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (!this.d.booleanValue()) {
            super.onBackPressed();
            return;
        }
        try {
            new AlertDialog.Builder(this, R.style.AlertDialogCustom).setPositiveButton(R.string.text_yes, new DialogInterface.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.uob.app.UobAppPaymentActivity.3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i6) {
                    if (UobAppPaymentActivity.this.isFinishing()) {
                        return;
                    }
                    dialogInterface.dismiss();
                    UobAppPaymentActivity uobAppPaymentActivity = UobAppPaymentActivity.this;
                    Object[] objArr = {uobAppPaymentActivity, UobAppPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(uobAppPaymentActivity).TuitionPaymentFragmentspecialinlinedviewModeldefault3()};
                    int iB = VoucherRequest.b();
                    UobAppPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(1651961575, objArr, -1651961575, VoucherRequest.b(), VoucherRequest.b(), iB, VoucherRequest.b());
                }
            }).setNegativeButton(R.string.text_no, new DialogInterface.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.uob.app.UobAppPaymentActivity.2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i6) {
                    if (UobAppPaymentActivity.this.isFinishing()) {
                        return;
                    }
                    dialogInterface.dismiss();
                }
            }).setTitle(R.string.cancel_transaction).setMessage(getString(R.string.uikit_confirm_uob_deeplink)).create().show();
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("showDialog:");
            sb.append(e2.getMessage());
            Logger.e("UobAppPaymentActivity", sb.toString());
        }
    }

    @Override // defpackage.StreamSharingControl
    public final void TuitionPaymentFragmentbindingInflater1(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 121;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        int i3 = INotificationSideChannel + 99;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        int i = 2 % 2;
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            int i2 = onTransact + 57;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.b(th, this).TuitionPaymentFragmentbindingInflater1);
            int i4 = onTransact + 73;
            INotificationSideChannel = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 % 5;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if (r4 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(r4, r3.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r1 < 2) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r1 < 2) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r4 = com.midtrans.sdk.uikit.views.uob.app.UobAppPaymentActivity.onTransact + 101;
        com.midtrans.sdk.uikit.views.uob.app.UobAppPaymentActivity.INotificationSideChannel = r4 % 128;
        r4 = r4 % 2;
        r3.g = r1 + 1;
        defpackage.onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r3, getString(com.bpjstku.R.string.uikit_error_uob_transaction));
        r4 = com.midtrans.sdk.uikit.views.uob.app.UobAppPaymentActivity.INotificationSideChannel + 95;
        com.midtrans.sdk.uikit.views.uob.app.UobAppPaymentActivity.onTransact = r4 % 128;
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
            int r1 = com.midtrans.sdk.uikit.views.uob.app.UobAppPaymentActivity.onTransact
            int r1 = r1 + 7
            int r2 = r1 % 128
            com.midtrans.sdk.uikit.views.uob.app.UobAppPaymentActivity.INotificationSideChannel = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L16
            r3.b()
            int r1 = r3.g
            if (r1 >= r0) goto L3e
            goto L1d
        L16:
            r3.b()
            int r1 = r3.g
            if (r1 >= r0) goto L3e
        L1d:
            int r4 = com.midtrans.sdk.uikit.views.uob.app.UobAppPaymentActivity.onTransact
            int r4 = r4 + 101
            int r2 = r4 % 128
            com.midtrans.sdk.uikit.views.uob.app.UobAppPaymentActivity.INotificationSideChannel = r2
            int r4 = r4 % r0
            int r1 = r1 + 1
            r3.g = r1
            r4 = 2132020116(0x7f140b94, float:1.9678586E38)
            java.lang.String r4 = r3.getString(r4)
            defpackage.onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r3, r4)
            int r4 = com.midtrans.sdk.uikit.views.uob.app.UobAppPaymentActivity.INotificationSideChannel
            int r4 = r4 + 95
            int r1 = r4 % 128
            com.midtrans.sdk.uikit.views.uob.app.UobAppPaymentActivity.onTransact = r1
            int r4 = r4 % r0
            return
        L3e:
            if (r4 == 0) goto L49
            StreamSharingExternalSyntheticLambda2 r0 = r3.notify
            boolean r0 = r0.TuitionPaymentFragmentspecialinlinedviewModeldefault1()
            r3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r4, r0)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.uob.app.UobAppPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(com.midtrans.sdk.corekit.models.TransactionResponse):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iMyPid = Process.myPid();
        int i5 = ~iMyPid;
        if (i4 != (-405185138) + ((112938011 | i5) * (-757)) + ((~(1052503803 | iMyPid)) * 1514) + (((~(iMyPid | (-939565793))) | (~(i5 | 942925554)) | 109578249) * 757)) {
            throw null;
        }
        int i6 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
        int i8 = ~i7;
        if (i6 != (-166285366) + ((~((-1565123618) | i8)) * 979) + ((i7 | 1013932347) * (-979)) + (((~(i7 | (-1565123618))) | (~(i8 | 1013932347))) * 979)) {
            int i9 = 253391774 % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        asBinder();
        setContentView(R.layout.uikit_activity_uob_app_payment);
        this.notify = new StreamSharingExternalSyntheticLambda2(this);
        ViewStub viewStub = (ViewStub) findViewById(R.id.uob_layout_stub);
        viewStub.setLayoutResource(R.layout.uikit_layout_uob_app_payment);
        viewStub.inflate();
        b(getString(R.string.page_title_uobapp));
        this.asInterface.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.uob.app.UobAppPaymentActivity.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    if (UobAppPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(UobAppPaymentActivity.this).booleanValue()) {
                        UobAppPaymentActivity uobAppPaymentActivity = UobAppPaymentActivity.this;
                        UobAppPaymentActivity.TuitionPaymentFragmentbindingInflater1(uobAppPaymentActivity, UobAppPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(uobAppPaymentActivity).TuitionPaymentFragmentspecialinlinedviewModeldefault3().getUobDeeplinkUrl());
                    } else {
                        Object[] objArr = {UobAppPaymentActivity.this};
                        int iB = VoucherRequest.b();
                        UobAppPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1623363098, objArr, 1623363099, VoucherRequest.b(), VoucherRequest.b(), iB, VoucherRequest.b());
                    }
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.asInterface.setTextBold();
        b();
        int i10 = onTransact + 43;
        INotificationSideChannel = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    private static void n(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(cancelAll ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $10 + 109;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(cancelAll)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - View.resolveSize(0, 0)), 1356 - Color.green(0), 37 - TextUtils.indexOf((CharSequence) "", '0'), 894276454, false, $$u(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.getDefaultSize(0, 0) + 47773), TextUtils.lastIndexOf("", '0') + 469, Color.argb(0, 0, 0, 0) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i6 = $11 + 75;
        $10 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void b(TransactionResponse transactionResponse) {
        boolean z;
        int i = 2 % 2;
        b();
        if (!this.TuitionPaymentFragmentbindingInflater1) {
            TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Intent intent = new Intent();
            intent.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            setResult(-1, intent);
            finish();
            return;
        }
        if (transactionResponse == null) {
            int i2 = INotificationSideChannel + 19;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        } else {
            z = !TextUtils.isEmpty(transactionResponse.getUobDeeplinkUrl());
        }
        if (!z) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
            return;
        }
        int i4 = INotificationSideChannel + 53;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        this.d = Boolean.TRUE;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse.getUobDeeplinkUrl());
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 125;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i5 = ~System.identityHashCode(this);
        if (i4 != (((-864906616) + (((~(i5 | (-1367383257))) | 537395713) * (-828))) + ((i5 | (-1367383257)) * (-828))) - 1678030176) {
            int i6 = (-923393872) % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        if (i7 != (((~(2103536992 | startUptimeMillis)) | (-1786503134)) * 398) + 1838508942 + (((~((~startUptimeMillis) | 2103536992)) | (-1786503134)) * 398)) {
            int i8 = 757786056 % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        if (this.cancel == 347) {
            int i9 = INotificationSideChannel + 121;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
            StreamSharingExternalSyntheticLambda2 streamSharingExternalSyntheticLambda2 = this.notify;
            if (streamSharingExternalSyntheticLambda2 != null) {
                streamSharingExternalSyntheticLambda2.b().getTransactionStatus(streamSharingExternalSyntheticLambda2.b().readAuthenticationToken(), new GetTransactionStatusCallback() { // from class: StreamSharingExternalSyntheticLambda2.3
                    public AnonymousClass3() {
                    }

                    @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                    public final void onError(Throwable th) {
                    }

                    @Override // com.midtrans.sdk.corekit.callback.GetTransactionStatusCallback
                    public final void onFailure(TransactionStatusResponse transactionStatusResponse, String str) {
                    }

                    @Override // com.midtrans.sdk.corekit.callback.GetTransactionStatusCallback
                    public final void onSuccess(TransactionStatusResponse transactionStatusResponse) {
                        if (transactionStatusResponse != null) {
                            String statusCode = transactionStatusResponse.getStatusCode();
                            String transactionStatus = transactionStatusResponse.getTransactionStatus();
                            if (TextUtils.isEmpty(statusCode) || !statusCode.equals(Constants.STATUS_CODE_201)) {
                                if (TextUtils.isEmpty(transactionStatus) || !transactionStatus.equalsIgnoreCase(TransactionResult.STATUS_PENDING)) {
                                    StreamSharingExternalSyntheticLambda2.this.b = filterOutChildSizesThatWillNeverBeSelected.TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionStatusResponse);
                                    ((StreamSharingControl) StreamSharingExternalSyntheticLambda2.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1(StreamSharingExternalSyntheticLambda2.this.b);
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
            int minimumFlingVelocity = 1031 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 15;
            byte[] bArr = $$j;
            short s = bArr[7];
            Object[] objArr2 = new Object[1];
            m(s, (byte) s, bArr[132], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString, minimumFlingVelocity, iMakeMeasureSpec, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        n(new char[]{8371, 8402, 8136, 32300, 4144, 4596, 54080, 13592, 42740, 63507, 22888, 47900, 11404, 29281, 57210, 8521, 45746, 60345, 17864, 42631, 14462, 26017, 52200, 11429, 48664, 8177}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 115, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        n(new char[]{60539, 60446, 60942, 36840, 4459, 29359, 53790, 22081, 27168, 2521, 22579, 55355, 57422, 33717, 56931, 16949, 32362, 6753, 17538}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cimb_instruction_step1).substring(0, 1).codePointAt(0) - 80, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int i3 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1030;
            int iMyPid = 15 - (Process.myPid() >> 22);
            byte[] bArr2 = $$j;
            Object[] objArr5 = new Object[1];
            m((short) 52, bArr2[7], bArr2[132], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity, i3, iMyPid, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int maxKeyCode = 1031 - (KeyEvent.getMaxKeyCode() >> 16);
                int windowTouchSlop = 15 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                short s2 = (short) 104;
                Object[] objArr6 = new Object[1];
                m(s2, (byte) (s2 >>> 1), $$j[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarFadeDuration, maxKeyCode, windowTouchSlop, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[3])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iNextInt = new Random().nextInt();
            int i6 = ~iNextInt;
            int i7 = (((2095968917 + ((((~(809079151 | i6)) | (-1053359322)) | (~((-809079152) | iNextInt))) * (-564))) + ((~(iNextInt | (-805867594))) * 1128)) + (((~((-1053359322) | i6)) | 3211558) * 564)) - 1506689518;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            n(new char[]{3658, 3616, 3404, 27815, 42431, 24806, 26333, 17433, 34892, 60050, 60642, 51790, 637, 24760, 27272, 20593, 40001, 63802, 61526, 55197}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            n(new char[]{28303, 28390, 31013, 6347, 9381, 31731, 59348, 24323, 59603, 40702, 28141, 53580, 25239, 5278, 60338, 19317, 64692, 36168, 29005, 52352}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_cannot_proccessed).substring(0, 6).codePointAt(5) - 97, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {350417297};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46037 - ImageFormat.getBitsPerPixel(0)), ExpandableListView.getPackedPositionGroup(0L) + 1134, 17 - Process.getGidForName(""), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1506689518, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
                    int iArgb = Color.argb(0, 0, 0, 0) + 15;
                    byte[] bArr3 = $$j;
                    short s3 = bArr3[7];
                    Object[] objArr12 = new Object[1];
                    m(s3, (byte) s3, bArr3[132], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout, keyRepeatTimeout, iArgb, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.getOffsetBefore("", 0) + 45993), 1117 - View.MeasureSpec.makeMeasureSpec(0, 0), 18 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    int iAlpha = Color.alpha(0) + 1031;
                    int offsetBefore = 15 - TextUtils.getOffsetBefore("", 0);
                    short s4 = (short) 104;
                    Object[] objArr13 = new Object[1];
                    m(s4, (byte) (s4 >>> 1), $$j[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cCombineMeasuredStates, iAlpha, offsetBefore, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    n(new char[]{8371, 8402, 8136, 32300, 4144, 4596, 54080, 13592, 42740, 63507, 22888, 47900, 11404, 29281, 57210, 8521, 45746, 60345, 17864, 42631, 14462, 26017, 52200, 11429, 48664, 8177}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    n(new char[]{60539, 60446, 60942, 36840, 4459, 29359, 53790, 22081, 27168, 2521, 22579, 55355, 57422, 33717, 56931, 16949, 32362, 6753, 17538}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellSiteTitle).substring(0, 4).codePointAt(2) - 84, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1031;
                        int iIndexOf = 14 - TextUtils.indexOf((CharSequence) "", '0');
                        byte[] bArr4 = $$j;
                        Object[] objArr16 = new Object[1];
                        m((short) 52, bArr4[7], bArr4[132], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(maximumDrawingCacheSize, touchSlop, iIndexOf, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char gidForName = (char) ((-1) - Process.getGidForName(""));
                        int i10 = 1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int iMakeMeasureSpec2 = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        byte[] bArr5 = $$j;
                        short s5 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        m(s5, (byte) s5, bArr5[132], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(gidForName, i10, iMakeMeasureSpec2, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    int i11 = INotificationSideChannel + 13;
                    onTransact = i11 % 128;
                    int i12 = i11 % 2;
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
            while (i2 < strArr2.length) {
                int i13 = onTransact + 123;
                INotificationSideChannel = i13 % 128;
                int i14 = i13 % 2;
                arrayList.add(strArr2[i2]);
                i2++;
            }
            throw null;
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i15 = ((int[]) objArr[2])[0];
        int i16 = ((int[]) objArr[3])[0];
        int i17 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int iMyTid = Process.myTid();
        int i18 = ~iMyTid;
        int i19 = i15 + 2028336827 + (((~((-171052521) | i18)) | (~(iMyTid | 73227649))) * 333) + (((~(iMyTid | (-171052521))) | (~(i18 | 73227649))) * 333);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr18[2])[0] = i21 ^ (i21 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char mode = (char) (29944 - View.MeasureSpec.getMode(0));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 1756;
            int scrollBarFadeDuration2 = 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            byte[] bArr6 = $$j;
            Object[] objArr19 = new Object[1];
            m((short) 104, (byte) (bArr6[33] - 1), bArr6[132], objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(mode, iLastIndexOf, scrollBarFadeDuration2, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 29944);
                int iIndexOf2 = TextUtils.indexOf("", "", 0) + 1755;
                int defaultSize = View.getDefaultSize(0, 0) + 23;
                byte[] bArr7 = $$j;
                Object[] objArr20 = new Object[1];
                m((short) 52, bArr7[7], bArr7[132], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(keyRepeatDelay, iIndexOf2, defaultSize, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i22 = ((int[]) objArr21[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{i22}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int i23 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            int i24 = ~i23;
            int i25 = ~(691414194 | i24);
            int i26 = 235372193 + (((-1035876091) | i25) * (-712)) + (((~(i23 | (-344461897))) | (~(i24 | 1035876090))) * (-712)) + ((478811768 | i25) * 712) + 1239419895;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i28 ^ (i28 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            n(new char[]{3658, 3616, 3404, 27815, 42431, 24806, 26333, 17433, 34892, 60050, 60642, 51790, 637, 24760, 27272, 20593, 40001, 63802, 61526, 55197}, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            n(new char[]{28303, 28390, 31013, 6347, 9381, 31731, 59348, 24323, 59603, 40702, 28141, 53580, 25239, 5278, 60338, 19317, 64692, 36168, 29005, 52352}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step2).substring(227, 231).codePointAt(1) - 67, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {350417297};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42048 - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1725, 29 - KeyEvent.keyCodeFromString(""), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = ProvinceItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 1239419895, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "") + 29944);
                int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0) + 1756;
                int iLastIndexOf2 = 22 - TextUtils.lastIndexOf("", '0', 0, 0);
                byte[] bArr8 = $$j;
                Object[] objArr25 = new Object[1];
                m((short) 52, bArr8[7], bArr8[132], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf, iIndexOf3, iLastIndexOf2, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
            try {
                Object[] objArr26 = new Object[1];
                n(new char[]{8371, 8402, 8136, 32300, 4144, 4596, 54080, 13592, 42740, 63507, 22888, 47900, 11404, 29281, 57210, 8521, 45746, 60345, 17864, 42631, 14462, 26017, 52200, 11429, 48664, 8177}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_notification_shopee_app_tablet).substring(29, 36).length() - 7, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                n(new char[]{60539, 60446, 60942, 36840, 4459, 29359, 53790, 22081, 27168, 2521, 22579, 55355, 57422, 33717, 56931, 16949, 32362, 6753, 17538}, ViewConfiguration.getTouchSlop() >> 8, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c = (char) (29945 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int scrollBarSize = 1755 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 23;
                    byte[] bArr9 = $$j;
                    Object[] objArr28 = new Object[1];
                    m((short) 141, bArr9[7], bArr9[132], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c, scrollBarSize, windowTouchSlop2, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cAxisFromString2 = (char) (29943 - MotionEvent.axisFromString(""));
                    int i29 = 1756 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 23;
                    byte[] bArr10 = $$j;
                    Object[] objArr29 = new Object[1];
                    m((short) 104, (byte) (bArr10[33] - 1), bArr10[132], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cAxisFromString2, i29, iCombineMeasuredStates, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i30 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0];
        int i31 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        if (i31 == i30) {
            int i32 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
            int i33 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
            Object[] objArr30 = {new int[]{i33}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
            int i34 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i35 = i32 + (-2042768457) + (((~((~i34) | (-527402))) | (~((-159650503) | i34))) * (-302)) + ((~((-527402) | i34)) * (-604)) + (((~(i34 | (-160177904))) | (-532430832)) * 302);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr30[3])[0] = i37 ^ (i37 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
        if (strArr4 != null) {
            int i38 = onTransact + 65;
            INotificationSideChannel = i38 % 128;
            int i39 = 2;
            int i40 = i38 % 2;
            while (i2 < strArr4.length) {
                int i41 = INotificationSideChannel + 19;
                onTransact = i41 % 128;
                int i42 = i41 % i39;
                arrayList2.add(strArr4[i2]);
                i2++;
                i39 = 2;
            }
        }
        throw new RuntimeException(String.valueOf(i31));
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
        int i6 = ~i5;
        if (i4 != (-1086173525) + (((~((-1036393358) | i6)) | (~(i5 | (-1866380901)))) * 333) + (((~(i5 | (-1036393358))) | (~(i6 | (-1866380901)))) * 333)) {
            throw null;
        }
        int i7 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i8 = ~((int) Runtime.getRuntime().totalMemory());
        if (i7 != ((479161148 + (((~(i8 | 1859869679)) | (~((-8519689) | i8))) * (-184))) + (((67719330 | (~((-76239019) | i8))) | (~(1792150349 | i8))) * 184)) - 1770527312) {
            throw new RuntimeException("1206650473");
        }
        super.onStart();
        int i9 = onTransact + 115;
        INotificationSideChannel = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(UobAppPaymentActivity uobAppPaymentActivity) {
        int iB = VoucherRequest.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1623363098, new Object[]{uobAppPaymentActivity}, 1623363099, VoucherRequest.b(), VoucherRequest.b(), iB, VoucherRequest.b());
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(UobAppPaymentActivity uobAppPaymentActivity, TransactionResponse transactionResponse) {
        int iB = VoucherRequest.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(1651961575, new Object[]{uobAppPaymentActivity, transactionResponse}, -1651961575, VoucherRequest.b(), VoucherRequest.b(), iB, VoucherRequest.b());
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        int i5 = INotificationSideChannel + 111;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$u(short r6, int r7, short r8) {
        /*
            byte[] r0 = com.midtrans.sdk.uikit.views.uob.app.UobAppPaymentActivity.$$m
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r7 = r7 * 3
            int r7 = r7 + 107
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r7 = r8
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r6]
        L27:
            int r6 = r6 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.uob.app.UobAppPaymentActivity.$$u(short, int, short):java.lang.String");
    }
}
