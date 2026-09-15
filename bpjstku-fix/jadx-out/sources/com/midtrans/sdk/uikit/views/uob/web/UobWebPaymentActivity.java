package com.midtrans.sdk.uikit.views.uob.web;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
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
import android.widget.Toast;
import com.bpjstku.R;
import com.bpjstku.data.registration.bpu.BPURegistrationDataStore$$ExternalSyntheticLambda24;
import com.google.android.gms.tasks.zzu;
import com.midtrans.sdk.corekit.callback.TransactionCallback;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import defpackage.SearchView9;
import defpackage.StreamSharingBuilder;
import defpackage.StreamSharingExternalSyntheticLambda3;
import defpackage.calculateCameraUseCases;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.createExtraPreview;
import defpackage.getRealtimeCaptureLatency;
import defpackage.handleMessage;
import defpackage.initSession;
import defpackage.onConnectionFailed;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class UobWebPaymentActivity extends BasePaymentActivity implements StreamSharingBuilder {
    private static int $10 = 0;
    private static int $11 = 1;
    private StreamSharingExternalSyntheticLambda3 INotificationSideChannel;
    private int asInterface;
    private int cancel;
    private FancyButton d;
    private Boolean g = Boolean.FALSE;
    private static final byte[] $$j = {29, 88, -118, 32, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$k = 77;
    private static int onTransact = 0;
    private static int notify = 1;
    private static long cancelAll = -6480644163395192180L;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = i3 | i7;
        int i9 = (~(i | i5)) | i3;
        int i10 = ~i;
        int i11 = (~(i5 | i | i3)) | (~(i7 | i10)) | (~((~i3) | i10));
        int i12 = i + i3 + i4 + (1609234610 * i2) + (1307081305 * i6);
        int i13 = i12 * i12;
        int i14 = (((-490261092) * i) - 1772093440) + (1576585830 * i3) + (i8 * 1033423461) + ((-2066846922) * i9) + (1033423461 * i11) + (543162368 * i4) + ((-2101346304) * i2) + (23068672 * i6) + ((-2103967744) * i13);
        int i15 = (i * 273352028) + 245730370 + (i3 * 273352646) + (i8 * 309) + (i9 * (-618)) + (i11 * 309) + (i4 * 273352337) + (i2 * (-770635566)) + (i6 * (-73506199)) + (i13 * (-2011693056));
        return i14 + ((i15 * i15) * 1080557568) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(UobWebPaymentActivity uobWebPaymentActivity) {
        int i = 2 % 2;
        uobWebPaymentActivity.asBinder();
        StreamSharingExternalSyntheticLambda3 streamSharingExternalSyntheticLambda3 = uobWebPaymentActivity.INotificationSideChannel;
        streamSharingExternalSyntheticLambda3.b().paymentUsingUobEzpay(streamSharingExternalSyntheticLambda3.b().readAuthenticationToken(), new TransactionCallback() { // from class: StreamSharingExternalSyntheticLambda3.4
            public AnonymousClass4() {
            }

            @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
            public final void onError(Throwable th) {
                ((StreamSharingBuilder) StreamSharingExternalSyntheticLambda3.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
            }

            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
            public final void onFailure(TransactionResponse transactionResponse, String str) {
                StreamSharingExternalSyntheticLambda3.this.b = transactionResponse;
                ((StreamSharingBuilder) StreamSharingExternalSyntheticLambda3.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
            }

            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
            public final void onSuccess(TransactionResponse transactionResponse) {
                StreamSharingExternalSyntheticLambda3.this.b = transactionResponse;
                ((StreamSharingBuilder) StreamSharingExternalSyntheticLambda3.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
            }
        });
        int i2 = onTransact + 111;
        notify = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(UobWebPaymentActivity uobWebPaymentActivity, String str) {
        int i = 2 % 2;
        int i2 = notify + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        uobWebPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
        int i4 = onTransact + 15;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
    }

    public static /* synthetic */ StreamSharingExternalSyntheticLambda3 TuitionPaymentFragmentspecialinlinedviewModeldefault3(UobWebPaymentActivity uobWebPaymentActivity) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 75;
        notify = i3 % 128;
        int i4 = i3 % 2;
        StreamSharingExternalSyntheticLambda3 streamSharingExternalSyntheticLambda3 = uobWebPaymentActivity.INotificationSideChannel;
        int i5 = i2 + 23;
        notify = i5 % 128;
        int i6 = i5 % 2;
        return streamSharingExternalSyntheticLambda3;
    }

    public static /* synthetic */ Boolean b(UobWebPaymentActivity uobWebPaymentActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = uobWebPaymentActivity.g;
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
        return bool;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 1
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r6 = 145 - r6
            byte[] r0 = com.midtrans.sdk.uikit.views.uob.web.UobWebPaymentActivity.$$j
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r4 = r8
            r3 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L28:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            int r7 = r7 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.uob.web.UobWebPaymentActivity.m(int, int, short, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        notify = i2 % 128;
        int i3 = i2 % 2;
        setPrimaryBackgroundColor(this.d);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = notify + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.d = (FancyButton) findViewById(R.id.button_primary);
        int i4 = onTransact + 51;
        notify = i4 % 128;
        int i5 = i4 % 2;
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
        if (i == 347) {
            int i4 = notify + 77;
            int i5 = i4 % 128;
            onTransact = i5;
            int i6 = i4 % 2;
            this.cancel = i;
            int i7 = i5 + 39;
            notify = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = onTransact + 51;
        notify = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = ((BasePaymentActivity) this).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        if (((BasePaymentActivity) this).TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i3 = onTransact + 47;
            notify = i3 % 128;
            if (i3 % 2 != 0) {
                d();
                return;
            } else {
                d();
                throw null;
            }
        }
        if (!this.g.booleanValue()) {
            super.onBackPressed();
            return;
        }
        TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Intent intent = new Intent();
        intent.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        setResult(0, intent);
        finish();
        int i4 = onTransact + 11;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str == null) {
            Toast.makeText(this, R.string.UOB_payment_cant_open_deeplink, 0).show();
        } else {
            this.d.setEnabled(false);
            Toast.makeText(this, getString(R.string.uikit_redirecting_to_uob_web), 0).show();
            startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse(str)), 347);
            int i3 = notify + 85;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
        }
        TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Intent intent = new Intent();
        intent.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        setResult(0, intent);
        finish();
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        UobWebPaymentActivity uobWebPaymentActivity = (UobWebPaymentActivity) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = notify + 101;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            uobWebPaymentActivity.b();
            boolean z = uobWebPaymentActivity.TuitionPaymentFragmentbindingInflater1;
            throw null;
        }
        uobWebPaymentActivity.b();
        if (uobWebPaymentActivity.TuitionPaymentFragmentbindingInflater1) {
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(uobWebPaymentActivity, handleMessage.b(th, uobWebPaymentActivity).TuitionPaymentFragmentbindingInflater1);
            int i3 = onTransact + 85;
            notify = i3 % 128;
            int i4 = i3 % 2;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0130  */
    /* JADX WARN: Code duplicated, block: B:30:0x0131  */
    private static void n(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (true) {
            obj = null;
            if (getrealtimecapturelatency.b >= cArr.length) {
                break;
            }
            int i3 = $11 + 39;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getLongPressTimeout() >> 16)), 2672 - AndroidCharacter.getMirror('0'), TextUtils.getOffsetBefore("", 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (cancelAll ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-16737794) - Color.rgb(0, 0, 0)), TextUtils.getOffsetBefore("", 0) + 481, View.combineMeasuredStates(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i6 = $10 + 41;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39470 - AndroidCharacter.getMirror('0')), 481 - ExpandableListView.getPackedPositionGroup(0L), 36 - TextUtils.indexOf((CharSequence) "", '0'), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
        int i8 = $10 + 9;
        $11 = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        UobWebPaymentActivity uobWebPaymentActivity = (UobWebPaymentActivity) objArr[0];
        TransactionResponse transactionResponse = (TransactionResponse) objArr[1];
        int i = 2 % 2;
        uobWebPaymentActivity.b();
        int i2 = uobWebPaymentActivity.asInterface;
        if (i2 >= 2) {
            if (transactionResponse != null) {
                int i3 = notify + 55;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                uobWebPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, uobWebPaymentActivity.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
            return null;
        }
        int i5 = notify + 39;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        uobWebPaymentActivity.asInterface = i2 + 1;
        onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(uobWebPaymentActivity, uobWebPaymentActivity.getString(R.string.uikit_error_uob_transaction));
        int i7 = onTransact + 35;
        notify = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 7 / 0;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a6, code lost:
    
        if (r1 != (((733896068 + (((~(r4 | (-2080374214))) | 364462882) * (-1042))) + (((-2080374214) | r2) * 521)) + ((((~(r2 | (-364462883))) | 67109410) | (~(r4 | (-1783020742)))) * 521))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a8, code lost:
    
        super.onCreate(r11);
        asBinder();
        setContentView(com.bpjstku.R.layout.uikit_activity_uob_web_payment);
        r10.INotificationSideChannel = new defpackage.StreamSharingExternalSyntheticLambda3(r10);
        r11 = (android.view.ViewStub) findViewById(com.bpjstku.R.id.uob_layout_stub);
        r11.setLayoutResource(com.bpjstku.R.layout.uikit_layout_uob_web_payment);
        r11.inflate();
        b(getString(com.bpjstku.R.string.page_title_uobweb));
        r10.d.setOnClickListener(new com.midtrans.sdk.uikit.views.uob.web.UobWebPaymentActivity.AnonymousClass5(r10));
        r10.d.setTextBold();
        b();
        r11 = com.midtrans.sdk.uikit.views.uob.web.UobWebPaymentActivity.onTransact + 83;
        com.midtrans.sdk.uikit.views.uob.web.UobWebPaymentActivity.notify = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00f2, code lost:
    
        if ((r11 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00fe, code lost:
    
        throw new java.lang.RuntimeException("-1328599190");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0048, code lost:
    
        if (r1 == (((1168966376 + (((~(1243619760 | r4)) | 277317193) * 336)) + (((~(r4 | 413632217)) | 1107304736) * (-168))) + (((~((~r4) | 413632217)) | 1243619760) * 168))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006f, code lost:
    
        if (r1 == (((((-1368964464) | r4) * (-658)) - 1693120216) + ((r4 | (-2046492528)) * 658))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0071, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r10);
        r4 = ~r2;
     */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r11) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.uob.web.UobWebPaymentActivity.onCreate(android.os.Bundle):void");
    }

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
        int i2 = onTransact;
        int i3 = i2 + 53;
        notify = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (transactionResponse == null) {
            int i4 = i2 + 99;
            notify = i4 % 128;
            int i5 = i4 % 2;
        } else if (!TextUtils.isEmpty(transactionResponse.getUobWebUrl())) {
            int i6 = notify + 105;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                this.g = Boolean.TRUE;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse.getUobWebUrl());
                return;
            } else {
                this.g = Boolean.TRUE;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse.getUobWebUrl());
                int i7 = 65 / 0;
                return;
            }
        }
        TuitionPaymentFragmentbindingInflater1(-2127753607, new Object[]{this, transactionResponse}, BPURegistrationDataStore$$ExternalSyntheticLambda24.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 2127753607, SearchView9.b(), SearchView9.b(), BPURegistrationDataStore$$ExternalSyntheticLambda24.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int iBlue = Color.blue(0) + 1031;
            int i2 = 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            byte b = $$j[7];
            Object[] objArr2 = new Object[1];
            m((short) 141, b, (byte) (b | 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, iBlue, i2, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        n(new char[]{21494, 14970, 33013, 28524, 62964, 23665, 10977, 45356, 8160, 59007, 19623, 56165, 41418, 2115, 38601, 32095, 52170, 21095, 14541, 34625, 28104, 62531}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27011, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        n(new char[]{21490, 14508, 34136, 4578, 65208, 19265, 55289, 48292, 2378, 38393, 25245, 53086, 23530, 8337, 36144}, ImageFormat.getBitsPerPixel(0) + 27480, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1031;
            int i3 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15;
            byte[] bArr = $$j;
            short s = (short) (bArr[1] + 1);
            byte b2 = bArr[7];
            Object[] objArr5 = new Object[1];
            m(s, b2, (byte) (b2 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarSize, iKeyCodeFromString, i3, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int iAxisFromString = MotionEvent.axisFromString("") + 1032;
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15;
                byte[] bArr2 = $$j;
                Object[] objArr6 = new Object[1];
                m((short) 37, bArr2[132], bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iAxisFromString, scrollDefaultDelay, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[3])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
            int i7 = ~i6;
            int i8 = (~(642670367 | i7)) | 277971072;
            int i9 = ~(i6 | (-33690903));
            int i10 = ((((i8 | i9) * (-252)) + 1573513577) + ((i9 | (~(i7 | 920641439))) * 252)) - 908135306;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            n(new char[]{21501, 40891, 52091, 14097, 25229, 44666, 39480, 50658, 12696, 32012, 43206, 38049, 49272, 3082, 32708, 43897}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step2).substring(32, 33).codePointAt(0) + 52202, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            n(new char[]{21502, 25234, 12592, 51162, 38503, 42267, 31653, 2633, 55511, 61343, 48686, 19668, 856, 53781, 57533, 46941}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_bad_response_server).substring(0, 24).length() + 12617, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1276593727};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46038), 1134 - View.getDefaultSize(0, 0), 18 - TextUtils.indexOf("", "", 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -908135306, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cRed = (char) Color.red(0);
                    int iResolveOpacity = 1031 - Drawable.resolveOpacity(0, 0);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 16;
                    byte b3 = $$j[7];
                    Object[] objArr12 = new Object[1];
                    m((short) 141, b3, (byte) (b3 | 52), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRed, iResolveOpacity, iLastIndexOf, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 45992), TextUtils.indexOf((CharSequence) "", '0') + 1118, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cAlpha = (char) Color.alpha(0);
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1031;
                    int iIndexOf = TextUtils.indexOf("", "") + 15;
                    byte[] bArr3 = $$j;
                    Object[] objArr13 = new Object[1];
                    m((short) 37, bArr3[132], bArr3[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAlpha, fadingEdgeLength, iIndexOf, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    n(new char[]{21494, 14970, 33013, 28524, 62964, 23665, 10977, 45356, 8160, 59007, 19623, 56165, 41418, 2115, 38601, 32095, 52170, 21095, 14541, 34625, 28104, 62531}, 27010 - TextUtils.indexOf((CharSequence) "", '0'), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    n(new char[]{21490, 14508, 34136, 4578, 65208, 19265, 55289, 48292, 2378, 38393, 25245, 53086, 23530, 8337, 36144}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_bank_transfer).substring(1, 3).length() + 27477, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                        int iResolveOpacity2 = 1031 - Drawable.resolveOpacity(0, 0);
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 16;
                        byte[] bArr4 = $$j;
                        short s2 = (short) (bArr4[1] + 1);
                        byte b4 = bArr4[7];
                        Object[] objArr16 = new Object[1];
                        m(s2, b4, (byte) (b4 | 52), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, iResolveOpacity2, iLastIndexOf2, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int scrollBarFadeDuration = 1031 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int iKeyCodeFromString2 = 15 - KeyEvent.keyCodeFromString("");
                        byte b5 = $$j[7];
                        Object[] objArr17 = new Object[1];
                        m((short) 141, b5, (byte) (b5 | 52), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(tapTimeout, scrollBarFadeDuration, iKeyCodeFromString2, 1357589585, false, (String) objArr17[0], null);
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            int i15 = notify + 123;
            onTransact = i15 % 128;
            int i16 = i15 % 2;
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i17 = ((int[]) objArr[2])[0];
            int i18 = ((int[]) objArr[3])[0];
            int i19 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i20 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
            int i21 = (~(527337480 | i20)) | 546403186;
            int i22 = ~i20;
            int i23 = i17 + 820728743 + ((i21 | (~((-302123017) | i22))) * 886) + (((~(i22 | (-527337481))) | 771617650) * (-1772)) + ((~(i22 | 771617650)) * 886);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr18[2])[0] = i25 ^ (i25 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i14];
            int i26 = i14 - 1;
            iArr[i26] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i26) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr[2])[0];
            int i28 = ((int[]) objArr[3])[0];
            int i29 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i30 = i27 + 561806418 + ((~(396324318 | iIdentityHashCode)) * 623) + (((~iIdentityHashCode) | 17825864) * (-623)) + (((~(iIdentityHashCode | 329215176)) | (~(84935006 | iIdentityHashCode)) | (-396324319)) * 623);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr19[2])[0] = i32 ^ (i32 << 5);
            int i33 = notify + 43;
            onTransact = i33 % 128;
            if (i33 % 2 != 0) {
                int i34 = 2 / 5;
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cArgb = (char) (Color.argb(0, 0, 0, 0) + 29944);
            int i35 = 1755 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int iResolveSizeAndState = 23 - View.resolveSizeAndState(0, 0, 0);
            byte b6 = $$j[7];
            Object[] objArr20 = new Object[1];
            m((short) 37, b6, (byte) (b6 | 37), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cArgb, i35, iResolveSizeAndState, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 29945);
                int iMyPid = (Process.myPid() >> 22) + 1755;
                int minimumFlingVelocity = 23 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                byte[] bArr5 = $$j;
                short s3 = (short) (bArr5[1] + 1);
                byte b7 = bArr5[7];
                Object[] objArr21 = new Object[1];
                m(s3, b7, (byte) (b7 | 52), objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cLastIndexOf, iMyPid, minimumFlingVelocity, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iMyUid = Process.myUid();
            int i36 = (-120790168) + (((~((-354573144) | iMyUid)) | 352326210) * 345) + (((~((-354573144) | (~iMyUid))) | (-494296928)) * 345) + ((~(iMyUid | (-352326211))) * 345) + 407753316;
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i38 ^ (i38 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            n(new char[]{21501, 40891, 52091, 14097, 25229, 44666, 39480, 50658, 12696, 32012, 43206, 38049, 49272, 3082, 32708, 43897}, 52301 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            n(new char[]{21502, 25234, 12592, 51162, 38503, 42267, 31653, 2633, 55511, 61343, 48686, 19668, 856, 53781, 57533, 46941}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_message_invalid_expiry_date).substring(14, 16).length() + 12639, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {1276593727};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 42049), Gravity.getAbsoluteGravity(0, 0) + 1726, 29 - TextUtils.getOffsetBefore("", 0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 407753316, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cKeyCodeFromString = (char) (29944 - KeyEvent.keyCodeFromString(""));
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1755;
                int gidForName = 22 - Process.getGidForName("");
                byte[] bArr6 = $$j;
                short s4 = (short) (bArr6[1] + 1);
                byte b8 = bArr6[7];
                Object[] objArr26 = new Object[1];
                m(s4, b8, (byte) (b8 | 52), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cKeyCodeFromString, doubleTapTimeout, gidForName, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr27 = new Object[1];
                n(new char[]{21494, 14970, 33013, 28524, 62964, 23665, 10977, 45356, 8160, 59007, 19623, 56165, 41418, 2115, 38601, 32095, 52170, 21095, 14541, 34625, 28104, 62531}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 26965, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                n(new char[]{21490, 14508, 34136, 4578, 65208, 19265, 55289, 48292, 2378, 38393, 25245, 53086, 23530, 8337, 36144}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 27364, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char mode = (char) (View.MeasureSpec.getMode(0) + 29944);
                    int maximumFlingVelocity = 1755 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 23;
                    short s5 = $$j[7];
                    byte b9 = (byte) s5;
                    Object[] objArr29 = new Object[1];
                    m(s5, b9, (byte) (b9 | 52), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(mode, maximumFlingVelocity, offsetAfter, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cGreen = (char) (Color.green(0) + 29944);
                    int i39 = 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int windowTouchSlop = 23 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte b10 = $$j[7];
                    Object[] objArr30 = new Object[1];
                    m((short) 37, b10, (byte) (b10 | 37), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cGreen, i39, windowTouchSlop, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i40 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i41 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i41 != i40) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr5 != null) {
                for (String str2 : strArr5) {
                    arrayList2.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i41));
        }
        int i42 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i43 = ~startUptimeMillis;
        int i44 = (~((-430905443) | i43)) | 151193632;
        int i45 = ~(startUptimeMillis | 498014826);
        int i46 = i42 + (-758234276) + ((i44 | i45) * (-713)) + (i45 * 1426) + ((~(218303016 | i43)) * 713);
        int i47 = (i46 << 13) ^ i46;
        int i48 = i47 ^ (i47 >>> 17);
        ((int[]) objArr31[3])[0] = i48 ^ (i48 << 5);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iMyUid = Process.myUid();
            if (i3 != (((~((-471574285) | iMyUid)) | 202375424) * (-283)) + 607682600 + ((~(iMyUid | (-269198861))) * 283)) {
                throw null;
            }
        } else {
            int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            if (i4 != ((((~(iIdentityHashCode | 90868183)) | (-920855727)) * 56) - 1800840280) + (((~((~iIdentityHashCode) | (-920855727))) | 90868183) * 56)) {
                throw null;
            }
        }
        int i5 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        if (i5 != (-525556301) + (((~(i6 | 1697405410)) | 881650554) * 191) + (((~((~i6) | 1697405410)) | 276865560) * 191)) {
            throw null;
        }
        super.onResume();
        int i7 = onTransact + 119;
        notify = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i3 = ~((~((int) Runtime.getRuntime().freeMemory())) | 174173273);
        if (i2 != (((171967504 | i3) * (-374)) - 1763608094) + ((i3 | 2205769) * 374)) {
            int i4 = onTransact + 41;
            notify = i4 % 128;
            int i5 = i4 % 2;
            int[] iArr = new int[1409702072];
            iArr[1409702071] = 1;
            int i6 = (-1286034552) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i7 = onTransact + 111;
            notify = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i10 = ~startUptimeMillis;
        int i11 = ~(399725738 | i10);
        if (i9 == (-1652868196) + (((-2145083376) | i11) * (-712)) + (((~(startUptimeMillis | (-1745357638))) | (~(i10 | 2145083375))) * (-712)) + ((2115637069 | i11) * 712)) {
            super.onStart();
        } else {
            int i12 = (-596768384) % 2;
            throw new ArithmeticException();
        }
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        int iB = SearchView9.b();
        TuitionPaymentFragmentbindingInflater1(-1350604249, new Object[]{this, th}, SearchView9.b(), 1350604250, BPURegistrationDataStore$$ExternalSyntheticLambda24.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iB, BPURegistrationDataStore$$ExternalSyntheticLambda24.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TransactionResponse transactionResponse) {
        int iB = SearchView9.b();
        TuitionPaymentFragmentbindingInflater1(-2127753607, new Object[]{this, transactionResponse}, BPURegistrationDataStore$$ExternalSyntheticLambda24.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 2127753607, SearchView9.b(), iB, BPURegistrationDataStore$$ExternalSyntheticLambda24.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = notify + 107;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = onTransact + 63;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
    }
}
