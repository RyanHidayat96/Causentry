package com.midtrans.sdk.uikit.views.creditcard.register;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import com.bpjstku.R;
import com.bpjstku.data.office.OfficeDataStore$$ExternalSyntheticLambda10;
import com.bpjstku.data.point.PointDataStore;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.TimeModel;
import com.midtrans.sdk.corekit.callback.CardRegistrationCallback;
import com.midtrans.sdk.corekit.core.IScanner;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.core.MidtransSDK;
import com.midtrans.sdk.corekit.models.BankType;
import com.midtrans.sdk.corekit.models.CardRegistrationResponse;
import com.midtrans.sdk.corekit.models.snap.BankBinsResponse;
import com.midtrans.sdk.corekit.utilities.Utils;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.scancard.ExternalScanner;
import com.midtrans.sdk.uikit.scancard.ScannerModel;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import com.midtrans.sdk.uikit.widgets.SemiBoldTextView;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.ResolutionsMergerCompareAspectRatioByOverlappingAreaToReference;
import defpackage.ViewPortBuilder;
import defpackage.addCameraErrorListener;
import defpackage.addTask;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.generateCameraId;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import defpackage.onConnectionFailed;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public class CardRegistrationActivity extends BasePaymentActivity implements ResolutionsMergerCompareAspectRatioByOverlappingAreaToReference {
    private static final String d = "CardRegistrationActivity";
    private TextInputEditText INotificationSideChannel;
    private ImageView INotificationSideChannelDefault;
    private String INotificationSideChannelStub = "";
    private TextInputEditText INotificationSideChannelStubProxy;
    private ImageView RemoteActionCompatParcelizer;
    private FancyButton asInterface;
    private TextInputLayout cancel;
    private TextInputEditText cancelAll;
    private FancyButton g;
    private addCameraErrorListener getInterfaceDescriptor;
    private TextInputLayout notify;
    private TextInputLayout onTransact;
    private SemiBoldTextView write;
    private static final byte[] $$m = {14, 116, 92, -78};
    private static final int $$n = 199;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {53, -70, 9, -72, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$k = 51;
    private static int getNotifyChildrenChangedOptions = 0;
    private static int disconnect = 1;
    private static char MediaBrowserCompat = 25088;
    private static char IconCompatParcelizer = 59816;
    private static char connect = 34164;
    private static char read = 17714;

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(CardRegistrationActivity cardRegistrationActivity) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 111;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        IScanner externalScanner = cardRegistrationActivity.getInterfaceDescriptor.b().getExternalScanner();
        if (externalScanner != null) {
            int i4 = getNotifyChildrenChangedOptions + 61;
            disconnect = i4 % 128;
            int i5 = i4 % 2;
            externalScanner.startScan(cardRegistrationActivity, 101);
            int i6 = getNotifyChildrenChangedOptions + 17;
            disconnect = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i3)) | i9 | (~(i8 | i3));
        int i11 = ~i3;
        int i12 = (~(i11 | i8 | i5)) | (~(i7 | i11 | i2));
        int i13 = i5 + i2 + i6 + ((-195996979) * i4) + ((-904719387) * i);
        int i14 = i13 * i13;
        int i15 = (i5 * 1886715248) + 940376064 + (1886715248 * i2) + (i10 * (-42925423)) + (i9 * (-42925423)) + ((-42925423) * i12) + (1843789824 * i6) + ((-1389494272) * i4) + (1623064576 * i) + (1510801408 * i14);
        int i16 = (i5 * 1590984816) + 1398186415 + (i2 * 1590984816) + (i10 * 737) + (i9 * 737) + (i12 * 737) + (i6 * 1590985553) + (i4 * (-1025631779)) + (i * 1121679989) + (i14 * 622657536);
        int i17 = i15 + (i16 * i16 * (-1928134656));
        if (i17 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i17 != 2) {
            return i17 != 3 ? TuitionPaymentFragmentbindingInflater1(objArr) : b(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        CardRegistrationActivity cardRegistrationActivity = (CardRegistrationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = disconnect + 7;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        boolean zCancel = cardRegistrationActivity.cancel();
        int i4 = disconnect + 33;
        getNotifyChildrenChangedOptions = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zCancel);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1(CardRegistrationActivity cardRegistrationActivity, String str) {
        int i = 2 % 2;
        int i2 = disconnect;
        int i3 = i2 + 27;
        getNotifyChildrenChangedOptions = i3 % 128;
        int i4 = i3 % 2;
        cardRegistrationActivity.INotificationSideChannelStub = str;
        int i5 = i2 + 87;
        getNotifyChildrenChangedOptions = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return str;
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(CardRegistrationActivity cardRegistrationActivity) throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 61;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {cardRegistrationActivity};
        int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
        Object obj = null;
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_4).substring(4, 5).length() + 716392474;
        boolean zBooleanValue = ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -664518649, iTuitionPaymentFragmentbindingInflater1, objArr, OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 664518651, length)).booleanValue();
        int i4 = getNotifyChildrenChangedOptions + 19;
        disconnect = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TextInputLayout TuitionPaymentFragmentspecialinlinedviewModeldefault2(CardRegistrationActivity cardRegistrationActivity) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions;
        int i3 = i2 + 63;
        disconnect = i3 % 128;
        int i4 = i3 % 2;
        TextInputLayout textInputLayout = cardRegistrationActivity.cancel;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 35;
        disconnect = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 52 / 0;
        }
        return textInputLayout;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(CardRegistrationActivity cardRegistrationActivity) throws NoSuchMethodException {
        int i = 2 % 2;
        if (!(!cardRegistrationActivity.cancel()) && !(!cardRegistrationActivity.INotificationSideChannel())) {
            int i2 = getNotifyChildrenChangedOptions + 1;
            disconnect = i2 % 128;
            int i3 = i2 % 2;
            int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_4).substring(4, 5).length() + 716392474;
            if (((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -664518649, iTuitionPaymentFragmentbindingInflater1, new Object[]{cardRegistrationActivity}, OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 664518651, length)).booleanValue()) {
                String string = cardRegistrationActivity.INotificationSideChannelStubProxy.getText().toString();
                String string2 = cardRegistrationActivity.cancelAll.getText().toString();
                String string3 = cardRegistrationActivity.INotificationSideChannel.getText().toString();
                String strTrim = string3.split("/")[0].trim();
                StringBuilder sb = new StringBuilder("20");
                sb.append(string3.split("/")[1].trim());
                String string4 = sb.toString();
                cardRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cardRegistrationActivity.getString(R.string.processing_card_registration));
                final addCameraErrorListener addcameraerrorlistener = cardRegistrationActivity.getInterfaceDescriptor;
                MidtransSDK midtransSDK = MidtransSDK.getInstance();
                final CardRegistrationCallback uiCardRegistrationCallback = midtransSDK.getUiCardRegistrationCallback();
                if (uiCardRegistrationCallback != null) {
                    midtransSDK.cardRegistration(string, string2, strTrim, string4, new CardRegistrationCallback() { // from class: addCameraErrorListener.4
                        private /* synthetic */ CardRegistrationCallback TuitionPaymentFragmentspecialinlinedviewModeldefault3;

                        public AnonymousClass4() {
                            cardRegistrationCallback = uiCardRegistrationCallback;
                        }

                        @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                        public final void onError(Throwable th) {
                            cardRegistrationCallback.onError(th);
                            ((ResolutionsMergerCompareAspectRatioByOverlappingAreaToReference) addCameraErrorListener.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault3(th);
                        }

                        @Override // com.midtrans.sdk.corekit.callback.CardRegistrationCallback
                        public final void onFailure(CardRegistrationResponse cardRegistrationResponse, String str) {
                            cardRegistrationCallback.onFailure(cardRegistrationResponse, str);
                            ((ResolutionsMergerCompareAspectRatioByOverlappingAreaToReference) addCameraErrorListener.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1(str);
                        }

                        @Override // com.midtrans.sdk.corekit.callback.CardRegistrationCallback
                        public final void onSuccess(CardRegistrationResponse cardRegistrationResponse) {
                            cardRegistrationCallback.onSuccess(cardRegistrationResponse);
                            ((ResolutionsMergerCompareAspectRatioByOverlappingAreaToReference) addCameraErrorListener.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).cancelAll();
                        }
                    });
                    return;
                }
                ((ResolutionsMergerCompareAspectRatioByOverlappingAreaToReference) addcameraerrorlistener.TuitionPaymentFragmentspecialinlinedviewModeldefault1).g();
                int i4 = disconnect + 89;
                getNotifyChildrenChangedOptions = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
        }
        int i6 = disconnect + 69;
        getNotifyChildrenChangedOptions = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 5 / 5;
        }
    }

    public static /* synthetic */ String a() {
        int i = 2 % 2;
        int i2 = disconnect;
        int i3 = i2 + 81;
        getNotifyChildrenChangedOptions = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = d;
        int i4 = i2 + 97;
        getNotifyChildrenChangedOptions = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static /* synthetic */ TextInputEditText asBinder(CardRegistrationActivity cardRegistrationActivity) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 13;
        int i3 = i2 % 128;
        disconnect = i3;
        int i4 = i2 % 2;
        TextInputEditText textInputEditText = cardRegistrationActivity.INotificationSideChannel;
        int i5 = i3 + 123;
        getNotifyChildrenChangedOptions = i5 % 128;
        int i6 = i5 % 2;
        return textInputEditText;
    }

    public static /* synthetic */ String asInterface(CardRegistrationActivity cardRegistrationActivity) {
        int i = 2 % 2;
        int i2 = disconnect;
        int i3 = i2 + 39;
        getNotifyChildrenChangedOptions = i3 % 128;
        int i4 = i3 % 2;
        String str = cardRegistrationActivity.INotificationSideChannelStub;
        int i5 = i2 + 109;
        getNotifyChildrenChangedOptions = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x009e A[PHI: r2
  0x009e: PHI (r2v14 java.lang.String) = (r2v8 java.lang.String), (r2v16 java.lang.String) binds: [B:25:0x009a, B:22:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a8 A[PHI: r2
  0x00a8: PHI (r2v12 java.lang.String) = (r2v8 java.lang.String), (r2v16 java.lang.String) binds: [B:25:0x009a, B:22:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0 A[PHI: r2
  0x00c0: PHI (r2v11 java.lang.String) = (r2v8 java.lang.String), (r2v16 java.lang.String) binds: [B:25:0x009a, B:22:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca A[PHI: r2
  0x00ca: PHI (r2v9 java.lang.String) = (r2v8 java.lang.String), (r2v16 java.lang.String) binds: [B:25:0x009a, B:22:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fe  */
    private static /* synthetic */ Object b(Object[] objArr) {
        String cardType;
        int i;
        byte b = 0;
        CardRegistrationActivity cardRegistrationActivity = (CardRegistrationActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = disconnect + 105;
        getNotifyChildrenChangedOptions = i3 % 128;
        int i4 = i3 % 2;
        String string = cardRegistrationActivity.INotificationSideChannelStubProxy.getText().toString();
        if (string.startsWith("4")) {
            int i5 = getNotifyChildrenChangedOptions + 37;
            disconnect = i5 % 128;
            if (i5 % 2 != 0) {
                cardRegistrationActivity.INotificationSideChannelDefault.setImageResource(2131231492);
                return null;
            }
            cardRegistrationActivity.INotificationSideChannelDefault.setImageResource(2131231492);
            int i6 = 32 / 0;
            return null;
        }
        if (!TextUtils.isEmpty(string)) {
            int i7 = getNotifyChildrenChangedOptions + 3;
            disconnect = i7 % 128;
            if (i7 % 2 != 0 ? string.length() >= 2 : string.length() >= 2) {
                int i8 = getNotifyChildrenChangedOptions + 67;
                disconnect = i8 % 128;
                if (i8 % 2 != 0) {
                    cardType = Utils.getCardType(string.replace(" ", ""));
                    cardType.hashCode();
                    cardType.hashCode();
                    switch (cardType.hashCode()) {
                        case -1553624974:
                            if (!cardType.equals(Utils.CARD_TYPE_MASTERCARD)) {
                            }
                            break;
                        case 73257:
                            if (cardType.equals(Utils.CARD_TYPE_JCB)) {
                                b = 1;
                            }
                            break;
                        case 2012639:
                            if (!cardType.equals(Utils.CARD_TYPE_AMEX)) {
                                i = getNotifyChildrenChangedOptions + 27;
                                disconnect = i % 128;
                                if (i % 2 == 0) {
                                    b = 2;
                                } else {
                                    b = 3;
                                }
                                break;
                            }
                            break;
                        case 2634817:
                            if (cardType.equals(Utils.CARD_TYPE_VISA)) {
                                b = 3;
                            }
                            break;
                    }
                    if (b == 0) {
                        cardRegistrationActivity.INotificationSideChannelDefault.setImageResource(2131231293);
                        return null;
                    }
                    if (b == 1) {
                        cardRegistrationActivity.INotificationSideChannelDefault.setImageResource(2131231244);
                        return null;
                    }
                    if (b == 2) {
                        cardRegistrationActivity.INotificationSideChannelDefault.setImageResource(2131231079);
                        return null;
                    }
                    if (b != 3) {
                        return null;
                    }
                    cardRegistrationActivity.INotificationSideChannelDefault.setImageResource(2131231492);
                    int i9 = getNotifyChildrenChangedOptions + 119;
                    disconnect = i9 % 128;
                    int i10 = i9 % 2;
                    return null;
                }
                cardType = Utils.getCardType(string.replace(" ", ""));
                cardType.hashCode();
                cardType.hashCode();
                int i11 = 71 / 0;
                switch (cardType.hashCode()) {
                    case -1553624974:
                        if (!cardType.equals(Utils.CARD_TYPE_MASTERCARD)) {
                        }
                        break;
                    case 73257:
                        if (cardType.equals(Utils.CARD_TYPE_JCB)) {
                            b = 1;
                        }
                        break;
                    case 2012639:
                        if (!cardType.equals(Utils.CARD_TYPE_AMEX)) {
                            i = getNotifyChildrenChangedOptions + 27;
                            disconnect = i % 128;
                            if (i % 2 == 0) {
                                b = 2;
                            } else {
                                b = 3;
                            }
                            break;
                        }
                        break;
                    case 2634817:
                        if (cardType.equals(Utils.CARD_TYPE_VISA)) {
                            b = 3;
                        }
                        break;
                }
                if (b == 0) {
                    cardRegistrationActivity.INotificationSideChannelDefault.setImageResource(2131231293);
                    return null;
                }
                if (b == 1) {
                    cardRegistrationActivity.INotificationSideChannelDefault.setImageResource(2131231244);
                    return null;
                }
                if (b == 2) {
                    cardRegistrationActivity.INotificationSideChannelDefault.setImageResource(2131231079);
                    return null;
                }
                if (b != 3) {
                    return null;
                }
                cardRegistrationActivity.INotificationSideChannelDefault.setImageResource(2131231492);
                int i12 = getNotifyChildrenChangedOptions + 119;
                disconnect = i12 % 128;
                int i13 = i12 % 2;
                return null;
                b = -1;
                if (b == 0) {
                    cardRegistrationActivity.INotificationSideChannelDefault.setImageResource(2131231293);
                    return null;
                }
                if (b == 1) {
                    cardRegistrationActivity.INotificationSideChannelDefault.setImageResource(2131231244);
                    return null;
                }
                if (b == 2) {
                    cardRegistrationActivity.INotificationSideChannelDefault.setImageResource(2131231079);
                    return null;
                }
                if (b != 3) {
                    return null;
                }
                cardRegistrationActivity.INotificationSideChannelDefault.setImageResource(2131231492);
                int i14 = getNotifyChildrenChangedOptions + 119;
                disconnect = i14 % 128;
                int i15 = i14 % 2;
                return null;
            }
        }
        cardRegistrationActivity.INotificationSideChannelDefault.setImageResource(0);
        return null;
    }

    public static /* synthetic */ boolean b(CardRegistrationActivity cardRegistrationActivity) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 25;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        boolean zINotificationSideChannel = cardRegistrationActivity.INotificationSideChannel();
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return zINotificationSideChannel;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x0101  */
    /* JADX WARN: Code duplicated, block: B:63:0x0103  */
    public static /* synthetic */ void d(CardRegistrationActivity cardRegistrationActivity) {
        String bank;
        int i = 2 % 2;
        String string = cardRegistrationActivity.INotificationSideChannelStubProxy.getText().toString();
        byte b = 3;
        if (TextUtils.isEmpty(string) || string.length() < 7) {
            cardRegistrationActivity.RemoteActionCompatParcelizer.setImageDrawable(null);
            int i2 = disconnect + 71;
            getNotifyChildrenChangedOptions = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 / 0;
                return;
            }
            return;
        }
        int i4 = getNotifyChildrenChangedOptions + 39;
        disconnect = i4 % 128;
        int i5 = i4 % 2;
        String strSubstring = string.replace(" ", "").substring(0, 6);
        List<BankBinsResponse> list = cardRegistrationActivity.getInterfaceDescriptor.TuitionPaymentFragmentbindingInflater1;
        if (list == null) {
            bank = null;
            break;
        }
        Iterator<BankBinsResponse> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                bank = null;
                break;
            }
            BankBinsResponse next = it.next();
            if (next.getBins() != null && !next.getBins().isEmpty()) {
                int i6 = disconnect + 81;
                getNotifyChildrenChangedOptions = i6 % 128;
                if (i6 % 2 != 0) {
                    next.getBins().iterator();
                    throw null;
                }
                Iterator<String> it2 = next.getBins().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (it2.next().contains(strSubstring)) {
                            bank = next.getBank();
                            break;
                        }
                    } else {
                        bank = null;
                        break;
                    }
                }
                if (bank != null) {
                    break;
                }
            }
        }
        if (bank == null) {
            cardRegistrationActivity.RemoteActionCompatParcelizer.setImageDrawable(null);
            return;
        }
        bank.hashCode();
        bank.hashCode();
        switch (bank.hashCode()) {
            case -1482248088:
                if (bank.equals(BankType.BNI_DEBIT_ONLINE)) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case 97344:
                if (bank.equals("bca")) {
                    int i7 = disconnect + 3;
                    getNotifyChildrenChangedOptions = i7 % 128;
                    if (i7 % 2 == 0) {
                        b = 1;
                    } else {
                        b = 0;
                    }
                } else {
                    b = -1;
                }
                break;
            case 97693:
                if (!bank.equals(BankType.BNI)) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 97817:
                if (!bank.equals(BankType.BRI)) {
                    b = -1;
                }
                break;
            case 3053691:
                if (!bank.equals(BankType.CIMB)) {
                    b = -1;
                } else {
                    int i8 = getNotifyChildrenChangedOptions + 73;
                    disconnect = i8 % 128;
                    if (i8 % 2 != 0) {
                        b = 4;
                    } else {
                        b = 5;
                    }
                }
                break;
            case 835352022:
                if (!bank.equals(BankType.MANDIRI)) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 845443361:
                if (!bank.equals(BankType.MAYBANK)) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                cardRegistrationActivity.RemoteActionCompatParcelizer.setImageResource(2131230982);
                return;
            case 1:
                cardRegistrationActivity.RemoteActionCompatParcelizer.setImageResource(2131230903);
                int i9 = getNotifyChildrenChangedOptions + 45;
                disconnect = i9 % 128;
                if (i9 % 2 == 0) {
                    throw null;
                }
                return;
            case 2:
                cardRegistrationActivity.RemoteActionCompatParcelizer.setImageResource(2131230982);
                return;
            case 3:
                cardRegistrationActivity.RemoteActionCompatParcelizer.setImageResource(2131230997);
                return;
            case 4:
                cardRegistrationActivity.RemoteActionCompatParcelizer.setImageResource(2131231011);
                return;
            case 5:
                cardRegistrationActivity.RemoteActionCompatParcelizer.setImageResource(2131231594);
                return;
            case 6:
                cardRegistrationActivity.RemoteActionCompatParcelizer.setImageResource(2131231607);
                return;
            default:
                cardRegistrationActivity.RemoteActionCompatParcelizer.setImageDrawable(null);
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 145 - r8
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r0 = com.midtrans.sdk.uikit.views.creditcard.register.CardRegistrationActivity.$$j
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r7 = r8
            r4 = r2
            goto L28
        L13:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L17:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r7]
        L28:
            int r3 = -r3
            int r8 = r8 + r3
            int r7 = r7 + 1
            int r8 = r8 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.creditcard.register.CardRegistrationActivity.m(byte, byte, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ TextInputEditText notify(CardRegistrationActivity cardRegistrationActivity) {
        int i = 2 % 2;
        int i2 = disconnect + 55;
        int i3 = i2 % 128;
        getNotifyChildrenChangedOptions = i3;
        int i4 = i2 % 2;
        TextInputEditText textInputEditText = cardRegistrationActivity.cancelAll;
        int i5 = i3 + 53;
        disconnect = i5 % 128;
        int i6 = i5 % 2;
        return textInputEditText;
    }

    @Override // defpackage.ResolutionsMergerCompareAspectRatioByOverlappingAreaToReference
    public final void g() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 1;
        disconnect = i2 % 128;
        if (i2 % 2 == 0) {
            Logger.d(d, "onCallbackUnImplemented()");
            b();
            setResult(0);
            finish();
        } else {
            Logger.d(d, "onCallbackUnImplemented()");
            b();
            setResult(0);
            finish();
        }
        int i3 = getNotifyChildrenChangedOptions + 59;
        disconnect = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        int i3 = 2 % 2;
        int i4 = getNotifyChildrenChangedOptions + 123;
        disconnect = i4 % 128;
        if (i4 % 2 == 0) {
            super.onActivityResult(i, i2, intent);
            if (i != 82) {
                return;
            }
        } else {
            super.onActivityResult(i, i2, intent);
            if (i != 101) {
                return;
            }
        }
        if (intent == null || !intent.hasExtra(ExternalScanner.EXTRA_SCAN_DATA)) {
            return;
        }
        ScannerModel scannerModel = (ScannerModel) intent.getSerializableExtra(ExternalScanner.EXTRA_SCAN_DATA);
        String cardNumber = scannerModel.getCardNumber();
        if (scannerModel.getExpiredMonth() < 10) {
            int i5 = getNotifyChildrenChangedOptions + 75;
            disconnect = i5 % 128;
            if (i5 % 2 == 0) {
                Object[] objArr = new Object[1];
                objArr[1] = Integer.valueOf(scannerModel.getExpiredMonth());
                str = String.format("0%d", objArr);
            } else {
                str = String.format("0%d", Integer.valueOf(scannerModel.getExpiredMonth()));
            }
        } else {
            str = String.format(TimeModel.NUMBER_FORMAT, Integer.valueOf(scannerModel.getExpiredMonth()));
        }
        Logger.d("scancard", String.format("Card Number: %s, Card Expire: %s/%d", cardNumber, str, Integer.valueOf(scannerModel.getExpiredYear() - 2000)));
        if (scannerModel != null) {
            String formattedCreditCardNumber = Utils.getFormattedCreditCardNumber(scannerModel.getCardNumber());
            if (scannerModel.getExpiredMonth() < 10) {
                int i6 = getNotifyChildrenChangedOptions + 95;
                disconnect = i6 % 128;
                int i7 = i6 % 2;
                str2 = String.format("0%d", Integer.valueOf(scannerModel.getExpiredMonth()));
            } else {
                str2 = String.format(TimeModel.NUMBER_FORMAT, Integer.valueOf(scannerModel.getExpiredMonth()));
            }
            String str3 = String.format("%s/%d", str2, Integer.valueOf(scannerModel.getExpiredYear() - 2000));
            this.cancelAll.setText(scannerModel.getCvv());
            this.INotificationSideChannel.setText(str3);
            this.INotificationSideChannelStubProxy.setText(formattedCreditCardNumber);
            int i8 = disconnect + 91;
            getNotifyChildrenChangedOptions = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 125;
        disconnect = i2 % 128;
        if (i2 % 2 == 0) {
            b(this.INotificationSideChannelStubProxy);
            b(this.INotificationSideChannel);
            b(this.cancelAll);
            setPrimaryBackgroundColor(this.g);
            int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        b(this.INotificationSideChannelStubProxy);
        b(this.INotificationSideChannel);
        b(this.cancelAll);
        setPrimaryBackgroundColor(this.g);
        FancyButton fancyButton = this.asInterface;
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i4 != 0) {
            fancyButton.setBorderColor(i4);
        }
        setTextColor(this.asInterface);
        FancyButton fancyButton2 = this.asInterface;
        int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i5 != 0) {
            fancyButton2.setIconColorFilter(i5);
            int i6 = getNotifyChildrenChangedOptions + 75;
            disconnect = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        CardRegistrationActivity cardRegistrationActivity = (CardRegistrationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 11;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        String strTrim = cardRegistrationActivity.cancelAll.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            cardRegistrationActivity.notify.setError(cardRegistrationActivity.getString(R.string.validation_message_cvv));
            int i4 = disconnect + 107;
            getNotifyChildrenChangedOptions = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 15 / 0;
            }
            return false;
        }
        if (strTrim.length() >= 3) {
            cardRegistrationActivity.notify.setError("");
            return true;
        }
        int i6 = disconnect + 87;
        getNotifyChildrenChangedOptions = i6 % 128;
        if (i6 % 2 != 0) {
            cardRegistrationActivity.notify.setError(cardRegistrationActivity.getString(R.string.validation_message_invalid_cvv));
            return false;
        }
        cardRegistrationActivity.notify.setError(cardRegistrationActivity.getString(R.string.validation_message_invalid_cvv));
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0056  */
    /* JADX WARN: Code duplicated, block: B:13:0x005b A[PHI: r1
  0x005b: PHI (r1v17 java.lang.String) = (r1v6 java.lang.String), (r1v20 java.lang.String) binds: [B:8:0x0034, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036 A[PHI: r1
  0x0036: PHI (r1v7 java.lang.String) = (r1v6 java.lang.String), (r1v20 java.lang.String) binds: [B:8:0x0034, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    private boolean cancel() {
        String string;
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = disconnect + 41;
        getNotifyChildrenChangedOptions = i3 % 128;
        if (i3 % 2 != 0) {
            string = this.INotificationSideChannelStubProxy.getText().toString();
            int i4 = 89 / 0;
            if (TextUtils.isEmpty(string)) {
                int i5 = disconnect + 35;
                getNotifyChildrenChangedOptions = i5 % 128;
                int i6 = i5 % 2;
                this.cancel.setError(getString(R.string.validation_message_card_number));
                i = disconnect + 19;
                getNotifyChildrenChangedOptions = i % 128;
                if (i % 2 != 0) {
                    int i7 = 3 / 4;
                }
                z = false;
            } else {
                this.cancel.setError("");
                z = true;
            }
        } else {
            string = this.INotificationSideChannelStubProxy.getText().toString();
            if (TextUtils.isEmpty(string)) {
                int i8 = disconnect + 35;
                getNotifyChildrenChangedOptions = i8 % 128;
                int i9 = i8 % 2;
                this.cancel.setError(getString(R.string.validation_message_card_number));
                i = disconnect + 19;
                getNotifyChildrenChangedOptions = i % 128;
                if (i % 2 != 0) {
                    int i10 = 3 / 4;
                }
                z = false;
            } else {
                this.cancel.setError("");
                z = true;
            }
        }
        String strReplace = string.replace(" ", "");
        if (strReplace.length() >= 13) {
            int i11 = getNotifyChildrenChangedOptions + 93;
            disconnect = i11 % 128;
            int i12 = i11 % 2;
            if (!(!onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strReplace))) {
                int i13 = getNotifyChildrenChangedOptions + 33;
                disconnect = i13 % 128;
                int i14 = i13 % 2;
                this.cancel.setError("");
                return z;
            }
        }
        this.cancel.setError(getString(R.string.validation_message_invalid_card_no));
        return false;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = disconnect + 95;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        this.INotificationSideChannelStubProxy = (TextInputEditText) findViewById(R.id.edit_card_number);
        this.INotificationSideChannel = (TextInputEditText) findViewById(R.id.edit_card_expiry);
        this.cancelAll = (TextInputEditText) findViewById(R.id.edit_card_cvv);
        this.cancel = (TextInputLayout) findViewById(R.id.container_edit_card_number);
        this.onTransact = (TextInputLayout) findViewById(R.id.container_card_expiry);
        this.notify = (TextInputLayout) findViewById(R.id.container_card_cvv);
        this.RemoteActionCompatParcelizer = (ImageView) findViewById(R.id.image_bank_logo);
        this.INotificationSideChannelDefault = (ImageView) findViewById(R.id.image_card_logo);
        this.g = (FancyButton) findViewById(R.id.button_primary);
        this.asInterface = (FancyButton) findViewById(R.id.button_scan_card);
        this.write = (SemiBoldTextView) findViewById(R.id.text_page_title);
        this.g.setText(getString(R.string.save_card));
        this.g.setTextBold();
        int i4 = disconnect + 39;
        getNotifyChildrenChangedOptions = i4 % 128;
        int i5 = i4 % 2;
    }

    private boolean INotificationSideChannel() {
        int i;
        boolean z;
        int i2;
        int i3 = 2 % 2;
        String strTrim = this.INotificationSideChannel.getText().toString().trim();
        String[] strArrSplit = new String[2];
        try {
            strArrSplit = strTrim.split("/");
            strArrSplit[0] = strArrSplit[0].trim();
            strArrSplit[1] = strArrSplit[1].trim();
            String str = d;
            StringBuilder sb = new StringBuilder("expDate:");
            sb.append(strArrSplit[0].trim());
            sb.append(strArrSplit[1].trim());
            Logger.d(str, sb.toString());
        } catch (IndexOutOfBoundsException unused) {
            Logger.d(d, "expiry date issue");
        } catch (NullPointerException unused2) {
            Logger.d(d, "expiry date empty");
        }
        if (TextUtils.isEmpty(strTrim)) {
            this.onTransact.setError(getString(R.string.validation_message_empty_expiry_date));
            return false;
        }
        if (!strTrim.contains("/")) {
            int i4 = disconnect + 85;
            getNotifyChildrenChangedOptions = i4 % 128;
            int i5 = i4 % 2;
            this.onTransact.setError(getString(R.string.validation_message_invalid_expiry_date));
            return false;
        }
        if (strArrSplit.length != 2) {
            this.onTransact.setError(getString(R.string.validation_message_invalid_expiry_date));
            return false;
        }
        try {
            i = Integer.parseInt(strArrSplit[0]);
            int i6 = disconnect + 67;
            getNotifyChildrenChangedOptions = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } catch (NumberFormatException unused3) {
            this.INotificationSideChannel.setText(getString(R.string.validation_message_invalid_expiry_date));
            i = 0;
            z = false;
        }
        try {
            i2 = Integer.parseInt(strArrSplit[1]);
        } catch (NumberFormatException unused4) {
            this.onTransact.setError(getString(R.string.validation_message_invalid_expiry_date));
            i2 = 0;
            z = false;
        }
        Calendar calendar = Calendar.getInstance();
        String str2 = new SimpleDateFormat("yy").format(calendar.getTime());
        int i8 = calendar.get(2) + 1;
        int i9 = Integer.parseInt(str2);
        String str3 = d;
        StringBuilder sb2 = new StringBuilder("currentMonth:");
        sb2.append(i8);
        sb2.append(",currentYear:");
        sb2.append(i9);
        Logger.d(str3, sb2.toString());
        if (i2 < i9) {
            this.onTransact.setError(getString(R.string.validation_message_invalid_expiry_date));
            return false;
        }
        if (i2 != i9 || i8 <= i) {
            this.onTransact.setError("");
            return z;
        }
        int i10 = disconnect + 101;
        getNotifyChildrenChangedOptions = i10 % 128;
        if (i10 % 2 != 0) {
            this.onTransact.setError(getString(R.string.validation_message_invalid_expiry_date));
            return false;
        }
        this.onTransact.setError(getString(R.string.validation_message_invalid_expiry_date));
        return false;
    }

    @Override // defpackage.ResolutionsMergerCompareAspectRatioByOverlappingAreaToReference
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) {
        int i = 2 % 2;
        String str = d;
        StringBuilder sb = new StringBuilder("onRegisterError():");
        sb.append(th.getMessage());
        Logger.d(str, sb.toString());
        b();
        onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, getString(R.string.message_card_register_error));
        int i2 = disconnect + 75;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.ResolutionsMergerCompareAspectRatioByOverlappingAreaToReference
    public final void cancelAll() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 55;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        b();
        onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, getString(R.string.message_card_register_success));
        setResult(-1);
        finish();
        int i4 = getNotifyChildrenChangedOptions + 121;
        disconnect = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        CardRegistrationActivity cardRegistrationActivity = (CardRegistrationActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = disconnect + 21;
        getNotifyChildrenChangedOptions = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Logger.d(d, "onRegisterFailure():".concat(String.valueOf(str)));
            cardRegistrationActivity.b();
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cardRegistrationActivity, cardRegistrationActivity.getString(R.string.message_card_register_error));
            cardRegistrationActivity.setResult(-1);
            cardRegistrationActivity.finish();
            obj.hashCode();
            throw null;
        }
        Logger.d(d, "onRegisterFailure():".concat(String.valueOf(str)));
        cardRegistrationActivity.b();
        onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cardRegistrationActivity, cardRegistrationActivity.getString(R.string.message_card_register_error));
        cardRegistrationActivity.setResult(-1);
        cardRegistrationActivity.finish();
        int i3 = disconnect + 47;
        getNotifyChildrenChangedOptions = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 62 / 0;
        }
        return null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = disconnect + 71;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) cacheInteropConfig.b[1]).getInt(null);
            int i4 = (~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 282526587)) | 362656356;
            if (i3 != (-733497957) + (i4 * 495) + (((~i4) | 277459524) * 495)) {
                throw null;
            }
        } else {
            int i5 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~((-537929770) | iIdentityHashCode);
            int i7 = ~iIdentityHashCode;
            if (i5 != 420084249 + ((i6 | (~(i7 | 2073952175))) * 497) + (((~(iIdentityHashCode | 2073952175)) | (~((-706034864) | i7)) | 168105094) * 497)) {
                throw null;
            }
        }
        int i8 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i9 = ~iIdentityHashCode2;
        if (i8 != (-914299716) + (((~(i9 | 50034853)) | (~(1765946184 | i9)) | (-1811643374)) * 464) + (((-45697190) | iIdentityHashCode2) * (-464)) + (((~(iIdentityHashCode2 | 50034853)) | (-1811643374)) * 464)) {
            throw new RuntimeException("-990586550");
        }
        super.onCreate(bundle);
        this.getInterfaceDescriptor = new addCameraErrorListener(this, this);
        setContentView(R.layout.activity_credit_card_register);
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.register.CardRegistrationActivity.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    CardRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(CardRegistrationActivity.this);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.asInterface.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.register.CardRegistrationActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    CardRegistrationActivity.TuitionPaymentFragmentbindingInflater1(CardRegistrationActivity.this);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.INotificationSideChannelStubProxy.addTextChangedListener(new TextWatcher() { // from class: com.midtrans.sdk.uikit.views.creditcard.register.CardRegistrationActivity.3
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String strA = CardRegistrationActivity.a();
                StringBuilder sb = new StringBuilder("card number:");
                sb.append(editable.length());
                Logger.i(strA, sb.toString());
                CardRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(CardRegistrationActivity.this).setError(null);
                try {
                    if (editable.length() > 0 && editable.length() % 5 == 0 && ' ' == editable.charAt(editable.length() - 1)) {
                        editable.delete(editable.length() - 1, editable.length());
                    }
                    if (editable.length() > 0 && editable.length() % 5 == 0 && Character.isDigit(editable.charAt(editable.length() - 1)) && TextUtils.split(editable.toString(), " ").length <= 3) {
                        editable.insert(editable.length() - 1, " ");
                    }
                    String cardType = Utils.getCardType(editable.toString());
                    Object[] objArr = {CardRegistrationActivity.this};
                    CardRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(addTask.TuitionPaymentFragmentbindingInflater1(), 366597596, addTask.TuitionPaymentFragmentbindingInflater1(), objArr, addTask.TuitionPaymentFragmentbindingInflater1(), -366597593, addTask.TuitionPaymentFragmentbindingInflater1());
                    CardRegistrationActivity.d(CardRegistrationActivity.this);
                    if (editable.length() < 18 || !cardType.equals(CardRegistrationActivity.this.getString(R.string.amex))) {
                        if (editable.length() == 19) {
                            Object[] objArr2 = {CardRegistrationActivity.this};
                            if (((Boolean) CardRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(addTask.TuitionPaymentFragmentbindingInflater1(), -1854398262, addTask.TuitionPaymentFragmentbindingInflater1(), objArr2, addTask.TuitionPaymentFragmentbindingInflater1(), 1854398263, addTask.TuitionPaymentFragmentbindingInflater1())).booleanValue()) {
                                CardRegistrationActivity.asBinder(CardRegistrationActivity.this).requestFocus();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (editable.length() == 19) {
                        editable.delete(editable.length() - 1, editable.length());
                    }
                    Object[] objArr3 = {CardRegistrationActivity.this};
                    if (((Boolean) CardRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(addTask.TuitionPaymentFragmentbindingInflater1(), -1854398262, addTask.TuitionPaymentFragmentbindingInflater1(), objArr3, addTask.TuitionPaymentFragmentbindingInflater1(), 1854398263, addTask.TuitionPaymentFragmentbindingInflater1())).booleanValue()) {
                        CardRegistrationActivity.asBinder(CardRegistrationActivity.this).requestFocus();
                    }
                } catch (RuntimeException e2) {
                    String strA2 = CardRegistrationActivity.a();
                    StringBuilder sb2 = new StringBuilder("cardnumber:");
                    sb2.append(e2.getMessage());
                    Logger.e(strA2, sb2.toString());
                }
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }
        });
        this.INotificationSideChannelStubProxy.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.register.CardRegistrationActivity.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    return;
                }
                Object[] objArr = {CardRegistrationActivity.this};
                int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
                int iTuitionPaymentFragmentbindingInflater2 = addTask.TuitionPaymentFragmentbindingInflater1();
                ((Boolean) CardRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(addTask.TuitionPaymentFragmentbindingInflater1(), -1854398262, iTuitionPaymentFragmentbindingInflater1, objArr, addTask.TuitionPaymentFragmentbindingInflater1(), 1854398263, iTuitionPaymentFragmentbindingInflater2)).booleanValue();
            }
        });
        this.INotificationSideChannel.addTextChangedListener(new TextWatcher() { // from class: com.midtrans.sdk.uikit.views.creditcard.register.CardRegistrationActivity.4
            /* JADX INFO: Removed unreachable split cross block B:43:0x019c */
            /* JADX INFO: Removed unreachable split cross block B:48:0x019c */
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String string = editable.toString();
                try {
                    if (editable.length() == 4) {
                        if (CardRegistrationActivity.asInterface(CardRegistrationActivity.this).length() > editable.length()) {
                            try {
                                if (Integer.parseInt(string.substring(0, 2)) <= 12) {
                                    CardRegistrationActivity.asBinder(CardRegistrationActivity.this).setText(CardRegistrationActivity.asBinder(CardRegistrationActivity.this).getText().toString().substring(0, 1));
                                    CardRegistrationActivity.asBinder(CardRegistrationActivity.this).setSelection(CardRegistrationActivity.asBinder(CardRegistrationActivity.this).getText().toString().length());
                                } else {
                                    CardRegistrationActivity.asBinder(CardRegistrationActivity.this).setText("");
                                    CardRegistrationActivity.asBinder(CardRegistrationActivity.this).setSelection(CardRegistrationActivity.asBinder(CardRegistrationActivity.this).getText().toString().length());
                                }
                            } catch (Exception e2) {
                                Logger.e(e2.toString());
                            }
                        }
                    } else if (editable.length() == 2) {
                        if (CardRegistrationActivity.asInterface(CardRegistrationActivity.this).length() < editable.length()) {
                            try {
                                if (Integer.parseInt(string) <= 12) {
                                    TextInputEditText textInputEditTextAsBinder = CardRegistrationActivity.asBinder(CardRegistrationActivity.this);
                                    CardRegistrationActivity cardRegistrationActivity = CardRegistrationActivity.this;
                                    textInputEditTextAsBinder.setText(cardRegistrationActivity.getString(R.string.expiry_month_format, CardRegistrationActivity.asBinder(cardRegistrationActivity).getText().toString()));
                                    CardRegistrationActivity.asBinder(CardRegistrationActivity.this).setSelection(CardRegistrationActivity.asBinder(CardRegistrationActivity.this).getText().toString().length());
                                } else {
                                    CardRegistrationActivity.asBinder(CardRegistrationActivity.this).setText(CardRegistrationActivity.this.getString(R.string.expiry_month_int_format, 12));
                                    CardRegistrationActivity.asBinder(CardRegistrationActivity.this).setSelection(CardRegistrationActivity.asBinder(CardRegistrationActivity.this).getText().toString().length());
                                }
                            } catch (Exception e3) {
                                Logger.e(e3.toString());
                            }
                        }
                    } else if (editable.length() == 1) {
                        try {
                            if (Integer.parseInt(string) > 1) {
                                TextInputEditText textInputEditTextAsBinder2 = CardRegistrationActivity.asBinder(CardRegistrationActivity.this);
                                CardRegistrationActivity cardRegistrationActivity2 = CardRegistrationActivity.this;
                                textInputEditTextAsBinder2.setText(cardRegistrationActivity2.getString(R.string.expiry_month_single_digit_format, CardRegistrationActivity.asBinder(cardRegistrationActivity2).getText().toString()));
                                CardRegistrationActivity.asBinder(CardRegistrationActivity.this).setSelection(CardRegistrationActivity.asBinder(CardRegistrationActivity.this).getText().toString().length());
                            }
                        } catch (Exception e4) {
                            Logger.e(e4.toString());
                        }
                    }
                } catch (RuntimeException e5) {
                    String strA = CardRegistrationActivity.a();
                    StringBuilder sb = new StringBuilder("inputcardnumber:");
                    sb.append(e5.getMessage());
                    Logger.e(strA, sb.toString());
                }
                CardRegistrationActivity cardRegistrationActivity3 = CardRegistrationActivity.this;
                CardRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(cardRegistrationActivity3, CardRegistrationActivity.asBinder(cardRegistrationActivity3).getText().toString());
                if (editable.length() == 7) {
                    CardRegistrationActivity.notify(CardRegistrationActivity.this).requestFocus();
                }
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }
        });
        this.INotificationSideChannel.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.register.CardRegistrationActivity.6
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    return;
                }
                CardRegistrationActivity.b(CardRegistrationActivity.this);
            }
        });
        this.cancelAll.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.midtrans.sdk.uikit.views.creditcard.register.CardRegistrationActivity.9
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) throws NoSuchMethodException {
                if (z) {
                    return;
                }
                CardRegistrationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CardRegistrationActivity.this);
            }
        });
        this.write.setText(getString(R.string.card_registration));
        int i10 = getNotifyChildrenChangedOptions + 83;
        disconnect = i10 % 128;
        int i11 = i10 % 2;
    }

    private static void n(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < cArr.length) {
            int i3 = $11 + 103;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                int i7 = $10 + 113;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i5) ^ ((c2 << 4) + ((char) (((long) connect) ^ 8611973335120459638L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(read)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (MotionEvent.axisFromString("") + 47774), 469 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) MediaBrowserCompat) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IconCompatParcelizer)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 47773), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 468, 12 - ((byte) KeyEvent.getModifierMetaStateMask()), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr3[0] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b = (byte) (-1);
                byte b2 = (byte) (b + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.blue(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2323, Color.green(0) + 44, -1312321721, false, $$u(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int maximumFlingVelocity = 1031 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15;
            byte b = (byte) ($$k + 1);
            byte b2 = $$j[5];
            Object[] objArr2 = new Object[1];
            m(b, b2, (short) (b2 | 140), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, maximumFlingVelocity, scrollBarFadeDuration, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        n(new char[]{49094, 59707, 37958, 51957, 2490, 34826, 54017, 61573, 37783, 52751, 20468, 64447, 14434, 12182, 25410, 27886, 57723, 54194, 42581, 17427, 42099, 26832, 43238, 40356}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        n(new char[]{12665, 36293, 11370, 51996, 17313, 5820, 41842, 24549, 22386, 51978, 21308, 59903, 59470, 24430, 35965, 30767, 29181, 28920}, 15 - TextUtils.getOffsetBefore("", 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int trimmedLength = 1031 - TextUtils.getTrimmedLength("");
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 15;
            byte b3 = (byte) ($$k + 1);
            byte b4 = $$j[5];
            Object[] objArr5 = new Object[1];
            m(b3, b4, (short) (b4 | 88), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration2, trimmedLength, threadPriority, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = getNotifyChildrenChangedOptions + 47;
            disconnect = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1031;
                int bitsPerPixel = 14 - ImageFormat.getBitsPerPixel(0);
                byte b5 = $$j[7];
                byte b6 = b5;
                Object[] objArr6 = new Object[1];
                m(b5, b6, (short) (b6 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cNormalizeMetaState, scrollDefaultDelay, bitsPerPixel, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[3])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i6 = ~iUptimeMillis;
            int i7 = 1057069164 + ((~((-167789485) | i6)) * 979) + ((iUptimeMillis | 76490685) * (-979)) + (((~(iUptimeMillis | (-167789485))) | (~(i6 | 76490685))) * 979) + 372090628;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
            int i10 = disconnect + 47;
            getNotifyChildrenChangedOptions = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 3 / 2;
            }
        } else {
            Object[] objArr8 = new Object[1];
            n(new char[]{23783, 57846, 8903, 34252, 28152, 44543, 30298, 6838, 32085, 36017, 35714, 48480, 27984, 1375, 34107, 9450, 50089, 8724}, (ViewConfiguration.getTouchSlop() >> 8) + 16, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            n(new char[]{709, 53240, 50433, 49085, 62045, 28309, 25349, 57132, 14817, 25192, 28846, 37471, 22534, 7476, 59238, 38135, 10705, 58012}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {537168848};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 1133 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 18 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 372090628, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1031;
                    int keyRepeatTimeout = 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte b7 = (byte) ($$k + 1);
                    byte b8 = $$j[5];
                    Object[] objArr12 = new Object[1];
                    m(b7, b8, (short) (b8 | 140), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iResolveOpacity, keyRepeatTimeout, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 45992), 1117 - Color.argb(0, 0, 0, 0), 17 - View.getDefaultSize(0, 0)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1031;
                    int size = 15 - View.MeasureSpec.getSize(0);
                    byte b9 = $$j[7];
                    byte b10 = b9;
                    Object[] objArr13 = new Object[1];
                    m(b9, b10, (short) (b10 | 37), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(edgeSlop, iMakeMeasureSpec, size, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    n(new char[]{49094, 59707, 37958, 51957, 2490, 34826, 54017, 61573, 37783, 52751, 20468, 64447, 14434, 12182, 25410, 27886, 57723, 54194, 42581, 17427, 42099, 26832, 43238, 40356}, 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    n(new char[]{12665, 36293, 11370, 51996, 17313, 5820, 41842, 24549, 22386, 51978, 21308, 59903, 59470, 24430, 35965, 30767, 29181, 28920}, (ViewConfiguration.getTapTimeout() >> 16) + 15, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int i12 = 1030 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int i13 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14;
                        byte b11 = (byte) ($$k + 1);
                        byte b12 = $$j[5];
                        Object[] objArr16 = new Object[1];
                        m(b11, b12, (short) (b12 | 88), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(longPressTimeout, i12, i13, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                        int iMyTid = 1031 - (Process.myTid() >> 22);
                        int iIndexOf = 15 - TextUtils.indexOf("", "");
                        byte b13 = (byte) ($$k + 1);
                        byte b14 = $$j[5];
                        Object[] objArr17 = new Object[1];
                        m(b13, b14, (short) (b14 | 140), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cRgb, iMyTid, iIndexOf, 1357589585, false, (String) objArr17[0], null);
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
            int iIdentityHashCode = System.identityHashCode(this);
            int i19 = i16 + (-1210876524) + (((-692387937) | iIdentityHashCode) * (-627)) + (((~(760584824 | iIdentityHashCode)) | 1004864994) * (-627)) + (((~(iIdentityHashCode | 1004864994)) | (~((~iIdentityHashCode) | (-760584825)))) * 627);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr18[2])[0] = i21 ^ (i21 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i22 = 0;
                while (i22 < strArr3.length) {
                    int i23 = getNotifyChildrenChangedOptions + 33;
                    disconnect = i23 % 128;
                    if (i23 % 2 == 0) {
                        arrayList.add(strArr3[i22]);
                        i22 += 4;
                    } else {
                        arrayList.add(strArr3[i22]);
                        i22++;
                    }
                }
            }
            Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr[2])[0];
            int i25 = ((int[]) objArr[3])[0];
            int i26 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i27 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i28 = ~i27;
            int i29 = ~((-199058478) | i28);
            int i30 = ~((-45221693) | i27);
            int i31 = i24 + 1517103762 + ((i29 | i30) * 1150) + (((~(45221692 | i28)) | i30) * (-575)) + (((~(i27 | (-199058478))) | (~(i28 | 199058477))) * 575);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr19[2])[0] = i33 ^ (i33 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0, 0));
            int scrollDefaultDelay2 = 1755 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 23;
            byte b15 = $$j[5];
            Object[] objArr20 = new Object[1];
            m((byte) 37, b15, (short) (b15 | 36), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cLastIndexOf, scrollDefaultDelay2, absoluteGravity, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i34 = getNotifyChildrenChangedOptions + 55;
            disconnect = i34 % 128;
            int i35 = i34 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char gidForName = (char) (29943 - Process.getGidForName(""));
                int modifierMetaStateMask = 1754 - ((byte) KeyEvent.getModifierMetaStateMask());
                int i36 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22;
                byte b16 = (byte) ($$k + 1);
                byte b17 = $$j[5];
                Object[] objArr21 = new Object[1];
                m(b16, b17, (short) (b17 | 88), objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(gidForName, modifierMetaStateMask, i36, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i37 = ((int[]) objArr22[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{i37}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i38 = ~iIdentityHashCode2;
            int i39 = ((((-1689837995) + (((~((-56623627) | i38)) | 269226052) * 220)) + (((~(i38 | (-133407292))) | 346009717) * (-440))) + ((iIdentityHashCode2 | (-56623627)) * 220)) - 617325728;
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i41 ^ (i41 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            n(new char[]{23783, 57846, 8903, 34252, 28152, 44543, 30298, 6838, 32085, 36017, 35714, 48480, 27984, 1375, 34107, 9450, 50089, 8724}, 16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            n(new char[]{709, 53240, 50433, 49085, 62045, 28309, 25349, 57132, 14817, 25192, 28846, 37471, 22534, 7476, 59238, 38135, 10705, 58012}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {537168848};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42049), (ViewConfiguration.getLongPressTimeout() >> 16) + 1726, View.resolveSizeAndState(0, 0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -617325728, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char touchSlop = (char) (29944 - (ViewConfiguration.getTouchSlop() >> 8));
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1755;
                int fadingEdgeLength = 23 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                byte b18 = (byte) ($$k + 1);
                byte b19 = $$j[5];
                Object[] objArr26 = new Object[1];
                m(b18, b19, (short) (b19 | 88), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(touchSlop, scrollBarSize, fadingEdgeLength, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
            try {
                Object[] objArr27 = new Object[1];
                n(new char[]{49094, 59707, 37958, 51957, 2490, 34826, 54017, 61573, 37783, 52751, 20468, 64447, 14434, 12182, 25410, 27886, 57723, 54194, 42581, 17427, 42099, 26832, 43238, 40356}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.processing_payment).substring(6, 7).codePointAt(0) - 93, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                n(new char[]{12665, 36293, 11370, 51996, 17313, 5820, 41842, 24549, 22386, 51978, 21308, 59903, 59470, 24430, 35965, 30767, 29181, 28920}, 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c2 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                    int mirror = AndroidCharacter.getMirror('0') + 1707;
                    int tapTimeout2 = 23 - (ViewConfiguration.getTapTimeout() >> 16);
                    byte b20 = (byte) ($$k + 1);
                    byte[] bArr = $$j;
                    Object[] objArr29 = new Object[1];
                    m(b20, bArr[5], bArr[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c2, mirror, tapTimeout2, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c3 = (char) (29944 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1755;
                    int modifierMetaStateMask2 = 24 + ((byte) KeyEvent.getModifierMetaStateMask());
                    byte b21 = $$j[5];
                    Object[] objArr30 = new Object[1];
                    m((byte) 37, b21, (short) (b21 | 36), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, pressedStateDuration, modifierMetaStateMask2, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i42 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
        int i43 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        if (i43 == i42) {
            int i44 = getNotifyChildrenChangedOptions + 39;
            disconnect = i44 % 128;
            int i45 = i44 % 2;
            int i46 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            int i47 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
            Object[] objArr31 = {new int[]{i47}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i48 = (~(595894587 | iIdentityHashCode3)) | 271584836;
            int i49 = ~((~iIdentityHashCode3) | (-58982411));
            int i50 = i46 + (-991543535) + ((i48 | i49) * (-470)) + (((~(iIdentityHashCode3 | 867479423)) | i49) * 470);
            int i51 = (i50 << 13) ^ i50;
            int i52 = i51 ^ (i51 >>> 17);
            ((int[]) objArr31[3])[0] = i52 ^ (i52 << 5);
            int i53 = getNotifyChildrenChangedOptions + 113;
            disconnect = i53 % 128;
            if (i53 % 2 == 0) {
                throw null;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
        if (strArr5 != null) {
            int i54 = 0;
            while (i54 < strArr5.length) {
                int i55 = disconnect + 85;
                getNotifyChildrenChangedOptions = i55 % 128;
                if (i55 % 2 != 0) {
                    arrayList2.add(strArr5[i54]);
                    i54 += 46;
                } else {
                    arrayList2.add(strArr5[i54]);
                    i54++;
                }
            }
        }
        Toast.makeText((Context) null, i43 / (((i43 - 1) * i43) % 2), 0).show();
        int i56 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
        int i57 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        Object[] objArr32 = {new int[]{i57}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
        int iNextInt = new Random().nextInt(2131280543);
        int i58 = ~iNextInt;
        int i59 = i56 + 22863509 + ((939458174 | iNextInt) * (-676)) + (((~(878111356 | i58)) | (-939458175)) * 676) + (((~(iNextInt | (-61346819))) | (~(i58 | 665508930)) | 273949244) * 676);
        int i60 = (i59 << 13) ^ i59;
        int i61 = i60 ^ (i60 >>> 17);
        ((int[]) objArr32[3])[0] = i61 ^ (i61 << 5);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = disconnect + 45;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int i4 = ~System.identityHashCode(this);
            if (i3 != (-982376137) + ((~((-17043713) | i4)) * (-783)) + (((~(i4 | (-890130904))) | (-60143361)) * 783)) {
                throw null;
            }
        } else {
            int i5 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            if (i5 != (-1250866172) + (((~((-964197577) | iIdentityHashCode)) | 24666304) * (-140)) + ((~((-939531273) | iIdentityHashCode)) * 70) + (((~(iIdentityHashCode | 134210033)) | (-1049075002)) * 70)) {
                throw null;
            }
        }
        int i6 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i7 = 110604700 + (((~((-118366224) | iFreeMemory)) | 34217997 | (~(1834277554 | iFreeMemory))) * (-880));
        int i8 = (~((-118366224) | (~iFreeMemory))) | (-1834277555);
        int i9 = ~(iFreeMemory | 118366223);
        if (i6 != i7 + ((i8 | i9) * (-880)) + (i9 * 880)) {
            throw new RuntimeException("-1152348216");
        }
        super.onResume();
        int i10 = getNotifyChildrenChangedOptions + 81;
        disconnect = i10 % 128;
        int i11 = i10 % 2;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -983684806
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.reflect.Member[] r1 = defpackage.cacheInteropConfig.b
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            long r4 = android.os.Process.getStartElapsedRealtime()
            int r4 = (int) r4
            int r4 = ~r4
            r5 = 818664776(0x30cbd548, float:1.4830812E-9)
            r5 = r5 | r4
            r6 = -1107566616(0xffffffffbdfbdfe8, float:-0.12298566)
            r6 = r6 | r4
            int r6 = ~r6
            int r6 = r6 * 52
            r7 = -281457656(0xffffffffef394c08, float:-5.7346643E28)
            int r7 = r7 + r6
            r6 = 1648652319(0x6244701f, float:9.0591025E20)
            r6 = r6 | r4
            int r6 = ~r6
            r8 = -1926231392(0xffffffff8d300aa0, float:-5.4246977E-31)
            r6 = r6 | r8
            int r5 = ~r5
            r5 = r5 | r6
            int r5 = r5 * (-52)
            int r7 = r7 + r5
            r5 = -818664777(0xffffffffcf342ab7, float:-3.0226982E9)
            r4 = r4 | r5
            int r4 = ~r4
            r5 = 541085704(0x20405008, float:1.6289513E-19)
            r4 = r4 | r5
            int r4 = r4 * 52
            int r7 = r7 + r4
            if (r1 == r7) goto L6b
            int r1 = com.midtrans.sdk.uikit.views.creditcard.register.CardRegistrationActivity.disconnect
            int r1 = r1 + 63
            int r4 = r1 % 128
            com.midtrans.sdk.uikit.views.creditcard.register.CardRegistrationActivity.getNotifyChildrenChangedOptions = r4
            int r1 = r1 % r0
            r1 = -983684806(0xffffffffc55e293a, float:-3554.5767)
            int[] r1 = new int[r1]
            r4 = -983684807(0xffffffffc55e2939, float:-3554.5764)
            r5 = 1
            r1[r4] = r5
            r4 = -874678294(0xffffffffcbdd77ea, float:-2.9028308E7)
            int r4 = r4 % r0
            r4 = -1
            r1 = r1[r4]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r5)
            r1.show()
            int r1 = com.midtrans.sdk.uikit.views.creditcard.register.CardRegistrationActivity.getNotifyChildrenChangedOptions
            int r1 = r1 + 29
            int r4 = r1 % 128
            com.midtrans.sdk.uikit.views.creditcard.register.CardRegistrationActivity.disconnect = r4
            int r1 = r1 % r0
        L6b:
            java.lang.reflect.Member[] r0 = defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r0 = r0[r2]
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            int r0 = r0.getInt(r3)
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r2 = 345832955(0x149cfdfb, float:1.5852152E-26)
            int r1 = r1.nextInt(r2)
            r2 = 1611942951(0x60144c27, float:4.2743836E19)
            r4 = r1 | r2
            int r4 = r4 * 140
            r5 = 163464112(0x9be43b0, float:4.580449E-33)
            int r5 = r5 + r4
            int r4 = ~r1
            r2 = r2 | r4
            int r2 = ~r2
            r6 = 429961488(0x19a0b110, float:1.6615127E-23)
            r2 = r2 | r6
            int r2 = r2 * (-280)
            int r5 = r5 + r2
            r2 = 967113013(0x39a4f935, float:3.146619E-4)
            r2 = r2 | r4
            int r2 = ~r2
            r4 = 1074791426(0x40100402, float:2.2502446)
            r2 = r2 | r4
            r4 = -429961489(0xffffffffe65f4eef, float:-2.6363595E23)
            r1 = r1 | r4
            int r1 = ~r1
            r1 = r1 | r2
            int r1 = r1 * 140
            int r5 = r5 + r1
            if (r0 != r5) goto Lae
            super.onStart()
            return
        Lae:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.creditcard.register.CardRegistrationActivity.onStart():void");
    }

    public static /* synthetic */ void a(CardRegistrationActivity cardRegistrationActivity) {
        int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = addTask.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(addTask.TuitionPaymentFragmentbindingInflater1(), 366597596, iTuitionPaymentFragmentbindingInflater1, new Object[]{cardRegistrationActivity}, iTuitionPaymentFragmentbindingInflater3, -366597593, iTuitionPaymentFragmentbindingInflater2);
    }

    public static /* synthetic */ boolean g(CardRegistrationActivity cardRegistrationActivity) {
        int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = addTask.TuitionPaymentFragmentbindingInflater1();
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(addTask.TuitionPaymentFragmentbindingInflater1(), -1854398262, iTuitionPaymentFragmentbindingInflater1, new Object[]{cardRegistrationActivity}, iTuitionPaymentFragmentbindingInflater3, 1854398263, iTuitionPaymentFragmentbindingInflater2)).booleanValue();
    }

    private boolean onTransact() {
        int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_4).substring(4, 5).length() + 716392474;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -664518649, iTuitionPaymentFragmentbindingInflater1, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 664518651, length)).booleanValue();
    }

    @Override // defpackage.ResolutionsMergerCompareAspectRatioByOverlappingAreaToReference
    public final void TuitionPaymentFragmentbindingInflater1(String str) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(851993246 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_wearing_mask_text).substring(0, 6).length(), 1116116849, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this, str}, addTask.TuitionPaymentFragmentbindingInflater1(), -1116116849, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 33;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
        int i4 = getNotifyChildrenChangedOptions + 115;
        disconnect = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$u(short r6, short r7, int r8) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r7 = r7 + 108
            byte[] r0 = com.midtrans.sdk.uikit.views.creditcard.register.CardRegistrationActivity.$$m
            int r8 = r8 * 4
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r0[r7]
        L2a:
            int r6 = r6 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.creditcard.register.CardRegistrationActivity.$$u(short, short, int):java.lang.String");
    }
}
