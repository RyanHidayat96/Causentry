package com.midtrans.sdk.uikit.views.mandiri_clickpay;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import com.bpjstku.R;
import com.bpjstku.data.promo.model.response.ProvinceItem;
import com.google.android.material.textfield.TextInputLayout;
import com.midtrans.sdk.corekit.callback.CardTokenCallback;
import com.midtrans.sdk.corekit.callback.TransactionCallback;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.core.MidtransSDK;
import com.midtrans.sdk.corekit.models.CardTokenRequest;
import com.midtrans.sdk.corekit.models.TokenDetailsResponse;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.corekit.models.snap.params.NewMandiriClickPaymentParams;
import com.midtrans.sdk.uikit.abstracts.BaseActivity;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.MediaSpecOutputFormat;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.deInitSession;
import defpackage.generateCameraId;
import defpackage.getRotationAppliedByEffect;
import defpackage.handleMessage;
import defpackage.initSession;
import defpackage.onConnectionFailed;
import defpackage.propagateChildrenCamera2Interop;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public class MandiriClickPayActivity extends BasePaymentActivity implements propagateChildrenCamera2Interop {
    private static final String asInterface = "MandiriClickPayActivity";
    private FancyButton INotificationSideChannel;
    private String INotificationSideChannelDefault;
    private LinearLayout INotificationSideChannelStub;
    private AppCompatEditText INotificationSideChannelStubProxy;
    private DefaultTextView IconCompatParcelizer;
    private DefaultTextView MediaBrowserCompat;
    private TextInputLayout RemoteActionCompatParcelizer;
    private String cancelAll;
    private getRotationAppliedByEffect connect;
    private AppCompatEditText getInterfaceDescriptor;
    private TextInputLayout onTransact;
    private DefaultTextView read;
    private AppCompatButton write;
    private static final byte[] $$u = {82, Base64.padSymbol, -66, -42};
    private static final int $$v = 215;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {29, 88, -118, 32, 20, 6, -55, 60, 22, 2, 17, 9, -1, 18, -63, 62, 5, 27, -11, 9, 15, 13, -2, 13, 13, 1, -49, 32, 52, -9, 14, 14, 0, 17, 14, -43, 58, -2, 10, -34, 42, 25, -3, 21, -9, -13, 25, 25, 10, -3, 2, 14, 15, -7, 21, 14, -41, 46, 19, -3, 25, -13, 17, 13, -3, 9, 15, -36, 51, -4, 26, 0, 0, 17, 14, -42, 47, 13, -2, 13, 13, 1, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -58};
    private static final int $$n = 175;
    private static final byte[] $$j = {89, 92, -72, 43, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$k = 249;
    private static int getExtras = 0;
    private static int getItem = 1;
    private static char[] getNotifyChildrenChangedOptions = {57184, 60048, 60088, 60056, 60043, 60054, 60058, 60034, 60055, 60062, 60073, 60047, 60063, 60117, 60072, 60053, 60041, 60045, 60051, 60040, 60052, 60083, 60050, 60060, 60049};
    private static char getRoot = 57188;
    private final String notify = "Mandiri Clickpay Overview";
    private final String d = "Confirm Payment Mandiri Clickpay";
    private final String g = "Retry Mandiri Clickpay";
    private int cancel = 0;

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(MandiriClickPayActivity mandiriClickPayActivity) {
        Drawable drawable;
        int i = 2 % 2;
        int i2 = ((BaseActivity) mandiriClickPayActivity).b;
        if (i2 != 0) {
            int i3 = getItem + 39;
            getExtras = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                mandiriClickPayActivity.INotificationSideChannelStub.getVisibility();
                throw null;
            }
            if (mandiriClickPayActivity.INotificationSideChannelStub.getVisibility() == 0) {
                drawable = ContextCompat.getDrawable(mandiriClickPayActivity, 2131231194);
                mandiriClickPayActivity.INotificationSideChannelStub.setVisibility(8);
            } else {
                drawable = ContextCompat.getDrawable(mandiriClickPayActivity, 2131231195);
                mandiriClickPayActivity.INotificationSideChannelStub.setVisibility(0);
            }
            try {
                drawable.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
                mandiriClickPayActivity.write.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                int i4 = getExtras + 121;
                getItem = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            } catch (RuntimeException e2) {
                String str = asInterface;
                StringBuilder sb = new StringBuilder("changeToggleInstructionVisibility");
                sb.append(e2.getMessage());
                Logger.e(str, sb.toString());
            }
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(MandiriClickPayActivity mandiriClickPayActivity, CharSequence charSequence) {
        int i = 2 % 2;
        if (charSequence == null || charSequence.length() <= 0) {
            mandiriClickPayActivity.MediaBrowserCompat.setText("");
            return;
        }
        int i2 = getItem + 95;
        getExtras = i2 % 128;
        int i3 = i2 % 2;
        String strReplace = charSequence.toString().trim().replace(" ", "");
        if (strReplace.length() > 10) {
            int i4 = getItem + 17;
            getExtras = i4 % 128;
            int i5 = i4 % 2;
            mandiriClickPayActivity.MediaBrowserCompat.setText(strReplace.substring(strReplace.length() - 10, strReplace.length()));
            return;
        }
        mandiriClickPayActivity.MediaBrowserCompat.setText(strReplace);
        int i6 = getItem + 119;
        getExtras = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String a() {
        String str;
        int i = 2 % 2;
        int i2 = getExtras;
        int i3 = i2 + 79;
        getItem = i3 % 128;
        if (i3 % 2 == 0) {
            str = asInterface;
            int i4 = 82 / 0;
        } else {
            str = asInterface;
        }
        int i5 = i2 + 93;
        getItem = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static /* synthetic */ Object b(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = (~i4) | i7;
        int i9 = ~i8;
        int i10 = (~(i7 | i3)) | i9;
        int i11 = (~(i7 | (~i3) | i4)) | (~(i8 | i3)) | (~(i2 | i3 | i4));
        int i12 = (~(i4 | i2)) | i3 | i9;
        int i13 = i2 + i3 + i5 + (5090439 * i) + ((-1076018391) * i6);
        int i14 = i13 * i13;
        int i15 = ((1425068070 * i2) - 1475346432) + (1088368604 * i3) + (i10 * (-168349733)) + ((-168349733) * i11) + (168349733 * i12) + (1256718336 * i5) + (1616379904 * i) + ((-1222115328) * i6) + (1028194304 * i14);
        int i16 = (i2 * (-1092730454)) + 799718796 + (i3 * (-1092731068)) + (i10 * (-307)) + (i11 * (-307)) + (i12 * 307) + (i5 * (-1092730761)) + (i * 1582232257) + (i6 * 741505039) + (i14 * (-1125187584));
        return i15 + ((i16 * i16) * (-410583040)) != 1 ? b(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0065  */
    public static /* synthetic */ void b(MandiriClickPayActivity mandiriClickPayActivity) {
        String str;
        int i = 2 % 2;
        String strTrim = mandiriClickPayActivity.getInterfaceDescriptor.getText().toString().trim();
        String strTrim2 = mandiriClickPayActivity.INotificationSideChannelStubProxy.getText().toString().trim();
        boolean z = false;
        if (TextUtils.isEmpty(strTrim)) {
            mandiriClickPayActivity.onTransact.setError(mandiriClickPayActivity.getString(R.string.empty_card_number));
        } else {
            String strReplace = strTrim.replace(" ", "");
            if (strReplace.length() >= 16) {
                int i2 = getExtras + 69;
                getItem = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 57 / 0;
                    if (onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strReplace)) {
                        mandiriClickPayActivity.onTransact.setError("");
                        z = true;
                    } else {
                        mandiriClickPayActivity.onTransact.setError(mandiriClickPayActivity.getString(R.string.validation_message_invalid_card_no));
                    }
                } else if (onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strReplace)) {
                    mandiriClickPayActivity.onTransact.setError("");
                    z = true;
                } else {
                    mandiriClickPayActivity.onTransact.setError(mandiriClickPayActivity.getString(R.string.validation_message_invalid_card_no));
                }
            } else {
                mandiriClickPayActivity.onTransact.setError(mandiriClickPayActivity.getString(R.string.validation_message_invalid_card_no));
            }
        }
        if (TextUtils.isEmpty(strTrim2)) {
            mandiriClickPayActivity.RemoteActionCompatParcelizer.setError(mandiriClickPayActivity.getString(R.string.empty_challenge_token));
            return;
        }
        if (strTrim2.trim().length() != 6) {
            mandiriClickPayActivity.RemoteActionCompatParcelizer.setError(mandiriClickPayActivity.getString(R.string.validation_message_invalid_token_no));
            return;
        }
        mandiriClickPayActivity.RemoteActionCompatParcelizer.setError("");
        if (z) {
            int i4 = getItem + 35;
            getExtras = i4 % 128;
            int i5 = i4 % 2;
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mandiriClickPayActivity);
            mandiriClickPayActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mandiriClickPayActivity.getString(R.string.processing_payment));
            String strReplace2 = strTrim.replace(" ", "");
            mandiriClickPayActivity.cancelAll = strTrim2;
            mandiriClickPayActivity.INotificationSideChannelDefault = mandiriClickPayActivity.read.getText().toString().trim();
            getRotationAppliedByEffect getrotationappliedbyeffect = mandiriClickPayActivity.connect;
            if (mandiriClickPayActivity.cancel == 0) {
                int i6 = getItem + 125;
                getExtras = i6 % 128;
                int i7 = i6 % 2;
                str = "Confirm Payment Mandiri Clickpay";
            } else {
                str = "Retry Mandiri Clickpay";
            }
            getrotationappliedbyeffect.TuitionPaymentFragmentbindingInflater1(str, "Mandiri Clickpay Overview");
            getRotationAppliedByEffect getrotationappliedbyeffect2 = mandiriClickPayActivity.connect;
            MidtransSDK.getInstance().getCardToken(new CardTokenRequest(strReplace2, null, null, null, getrotationappliedbyeffect2.b().getClientKey()), new CardTokenCallback() { // from class: getRotationAppliedByEffect.3
                public AnonymousClass3() {
                }

                @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                public final void onError(Throwable th) {
                    ((propagateChildrenCamera2Interop) getRotationAppliedByEffect.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1(th);
                }

                @Override // com.midtrans.sdk.corekit.callback.CardTokenCallback
                public final void onFailure(TokenDetailsResponse tokenDetailsResponse, String str2) {
                    ((propagateChildrenCamera2Interop) getRotationAppliedByEffect.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).g();
                }

                @Override // com.midtrans.sdk.corekit.callback.CardTokenCallback
                public final void onSuccess(TokenDetailsResponse tokenDetailsResponse) {
                    ((propagateChildrenCamera2Interop) getRotationAppliedByEffect.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(tokenDetailsResponse);
                }
            });
        }
    }

    private static void m(short s, int i, int i2, Object[] objArr) {
        int i3 = 197 - s;
        int i4 = (i * 14) + 84;
        byte[] bArr = $$j;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 = (i4 + i2) - 11;
            i3++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i4;
            if (i5 == i2) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i4 = (i4 + bArr[i3]) - 11;
                i3++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void o(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 26
            int r7 = 79 - r7
            int r5 = r5 * 15
            int r5 = 99 - r5
            byte[] r0 = com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity.$$m
            int r6 = r6 * 78
            int r6 = 82 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r6
            r5 = r7
            r3 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            r4 = r0[r6]
        L29:
            int r6 = r6 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-8)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity.o(short, short, int, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = getExtras + 65;
        getItem = i4 % 128;
        int i5 = i4 % 2;
        super.onActivityResult(i, i2, intent);
        if (i == 210) {
            TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.connect.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Intent intent2 = new Intent();
            intent2.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            setResult(-1, intent2);
            finish();
            int i6 = getItem + 65;
            getExtras = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        getRotationAppliedByEffect getrotationappliedbyeffect = this.connect;
        if (getrotationappliedbyeffect != null) {
            int i2 = getItem + 99;
            getExtras = i2 % 128;
            int i3 = i2 % 2;
            getrotationappliedbyeffect.TuitionPaymentFragmentbindingInflater1("Back", "Mandiri Clickpay Overview");
        }
        super.onBackPressed();
        int i4 = getExtras + 109;
        getItem = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        MandiriClickPayActivity mandiriClickPayActivity = (MandiriClickPayActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getItem + 123;
        getExtras = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            mandiriClickPayActivity.b(mandiriClickPayActivity.getInterfaceDescriptor);
            mandiriClickPayActivity.b(mandiriClickPayActivity.INotificationSideChannelStubProxy);
            mandiriClickPayActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mandiriClickPayActivity.onTransact);
            mandiriClickPayActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mandiriClickPayActivity.RemoteActionCompatParcelizer);
            mandiriClickPayActivity.setPrimaryBackgroundColor(mandiriClickPayActivity.INotificationSideChannel);
            mandiriClickPayActivity.setTextColor(mandiriClickPayActivity.write);
            throw null;
        }
        mandiriClickPayActivity.b(mandiriClickPayActivity.getInterfaceDescriptor);
        mandiriClickPayActivity.b(mandiriClickPayActivity.INotificationSideChannelStubProxy);
        mandiriClickPayActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mandiriClickPayActivity.onTransact);
        mandiriClickPayActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mandiriClickPayActivity.RemoteActionCompatParcelizer);
        mandiriClickPayActivity.setPrimaryBackgroundColor(mandiriClickPayActivity.INotificationSideChannel);
        mandiriClickPayActivity.setTextColor(mandiriClickPayActivity.write);
        int i3 = getItem + 63;
        getExtras = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = getExtras + 115;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        this.onTransact = (TextInputLayout) findViewById(R.id.container_card_number);
        this.RemoteActionCompatParcelizer = (TextInputLayout) findViewById(R.id.container_challenge_token);
        this.INotificationSideChannelStub = (LinearLayout) findViewById(R.id.instruction_layout);
        this.getInterfaceDescriptor = (AppCompatEditText) findViewById(R.id.edit_card_number);
        this.INotificationSideChannelStubProxy = (AppCompatEditText) findViewById(R.id.edit_challenge_token);
        this.MediaBrowserCompat = (DefaultTextView) findViewById(R.id.text_input_1);
        this.IconCompatParcelizer = (DefaultTextView) findViewById(R.id.text_input_2);
        this.read = (DefaultTextView) findViewById(R.id.text_input_3);
        this.INotificationSideChannel = (FancyButton) findViewById(R.id.button_primary);
        this.write = (AppCompatButton) findViewById(R.id.instruction_toggle);
        int i4 = getItem + 65;
        getExtras = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        MandiriClickPayActivity mandiriClickPayActivity = (MandiriClickPayActivity) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        mandiriClickPayActivity.b();
        if (mandiriClickPayActivity.TuitionPaymentFragmentbindingInflater1) {
            int i2 = getItem + 23;
            getExtras = i2 % 128;
            if (i2 % 2 != 0) {
                onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mandiriClickPayActivity, handleMessage.b(th, mandiriClickPayActivity).TuitionPaymentFragmentbindingInflater1);
                throw null;
            }
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mandiriClickPayActivity, handleMessage.b(th, mandiriClickPayActivity).TuitionPaymentFragmentbindingInflater1);
        }
        int i3 = getItem + 79;
        getExtras = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        int i = 2 % 2;
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            int i2 = getExtras + 47;
            getItem = i2 % 128;
            if (i2 % 2 == 0) {
                onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.b(th, this).TuitionPaymentFragmentbindingInflater1);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.b(th, this).TuitionPaymentFragmentbindingInflater1);
            int i3 = getExtras + 75;
            getItem = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void b(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = getItem + 33;
        getExtras = i2 % 128;
        if (i2 % 2 == 0) {
            b();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.connect.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        } else {
            b();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.connect.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r2 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r2 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r2 = r2.getContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        r4 = com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity.getItem + 103;
        com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity.getExtras = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if ((r4 % 2) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        r0 = r1.contains(r2.getString(com.bpjstku.R.string.retrofit_network_message));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        r2 = 37 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r0 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (r1.contains(r2.getString(com.bpjstku.R.string.retrofit_network_message)) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        android.widget.Toast.makeText(r6, getString(com.bpjstku.R.string.no_network_msg), 0).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        android.widget.Toast.makeText(r6, r1, 0).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        com.midtrans.sdk.corekit.core.Logger.e("Context is not available.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        com.midtrans.sdk.corekit.core.Logger.e("Veritrans SDK is not started.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
    
        return;
     */
    @Override // defpackage.propagateChildrenCamera2Interop
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity.getItem
            int r1 = r1 + 109
            int r2 = r1 % 128
            com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity.getExtras = r2
            int r1 = r1 % r0
            r6.b()
            r1 = 2132019305(0x7f140869, float:1.9676941E38)
            java.lang.String r1 = r6.getString(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.RuntimeException -> La1
            r3 = 0
            if (r2 != 0) goto L89
            int r2 = com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity.getItem
            int r2 = r2 + 79
            int r4 = r2 % 128
            com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity.getExtras = r4
            int r2 = r2 % r0
            if (r2 == 0) goto L32
            com.midtrans.sdk.corekit.core.MidtransSDK r2 = com.midtrans.sdk.corekit.core.MidtransSDK.getInstance()     // Catch: java.lang.RuntimeException -> La1
            r4 = 13
            int r4 = r4 / r3
            if (r2 == 0) goto L83
            goto L38
        L32:
            com.midtrans.sdk.corekit.core.MidtransSDK r2 = com.midtrans.sdk.corekit.core.MidtransSDK.getInstance()     // Catch: java.lang.RuntimeException -> La1
            if (r2 == 0) goto L83
        L38:
            android.content.Context r2 = r2.getContext()     // Catch: java.lang.RuntimeException -> La1
            if (r2 == 0) goto L7d
            int r4 = com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity.getItem
            int r4 = r4 + 103
            int r5 = r4 % 128
            com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity.getExtras = r5
            int r4 = r4 % r0
            r0 = 2132019760(0x7f140a30, float:1.9677864E38)
            if (r4 == 0) goto L5c
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.RuntimeException -> La1
            boolean r0 = r1.contains(r0)     // Catch: java.lang.RuntimeException -> La1
            r2 = 37
            int r2 = r2 / r3
            if (r0 == 0) goto L75
            goto L66
        L5a:
            r0 = move-exception
            throw r0
        L5c:
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.RuntimeException -> La1
            boolean r0 = r1.contains(r0)     // Catch: java.lang.RuntimeException -> La1
            if (r0 == 0) goto L75
        L66:
            r0 = 2132019424(0x7f1408e0, float:1.9677183E38)
            java.lang.String r0 = r6.getString(r0)     // Catch: java.lang.RuntimeException -> La1
            android.widget.Toast r0 = android.widget.Toast.makeText(r6, r0, r3)     // Catch: java.lang.RuntimeException -> La1
            r0.show()     // Catch: java.lang.RuntimeException -> La1
            return
        L75:
            android.widget.Toast r0 = android.widget.Toast.makeText(r6, r1, r3)     // Catch: java.lang.RuntimeException -> La1
            r0.show()     // Catch: java.lang.RuntimeException -> La1
            return
        L7d:
            java.lang.String r0 = "Context is not available."
            com.midtrans.sdk.corekit.core.Logger.e(r0)     // Catch: java.lang.RuntimeException -> La1
            return
        L83:
            java.lang.String r0 = "Veritrans SDK is not started."
            com.midtrans.sdk.corekit.core.Logger.e(r0)     // Catch: java.lang.RuntimeException -> La1
            return
        L89:
            r1 = 2132017358(0x7f1400ce, float:1.9672992E38)
            java.lang.String r1 = r6.getString(r1)     // Catch: java.lang.RuntimeException -> La1
            android.widget.Toast r1 = android.widget.Toast.makeText(r6, r1, r3)     // Catch: java.lang.RuntimeException -> La1
            r1.show()     // Catch: java.lang.RuntimeException -> La1
            int r1 = com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity.getExtras
            int r1 = r1 + 73
            int r2 = r1 % 128
            com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity.getItem = r2
            int r1 = r1 % r0
            return
        La1:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Nullpointer:"
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.midtrans.sdk.corekit.core.Logger.i(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity.g():void");
    }

    @Override // defpackage.propagateChildrenCamera2Interop
    public final void b(TokenDetailsResponse tokenDetailsResponse) throws Throwable {
        int i;
        int length;
        Object[] objArr;
        int i2 = 2 % 2;
        int i3 = getExtras + 39;
        getItem = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z = this.TuitionPaymentFragmentbindingInflater1;
            throw null;
        }
        if (!this.TuitionPaymentFragmentbindingInflater1) {
            b();
            finish();
            return;
        }
        getRotationAppliedByEffect getrotationappliedbyeffect = this.connect;
        String tokenId = tokenDetailsResponse.getTokenId();
        String str = this.cancelAll;
        String str2 = this.INotificationSideChannelDefault;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 43042);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 3112;
            int iRgb = (-16777194) - Color.rgb(0, 0, 0);
            short s = (short) ($$k & 967);
            byte b = $$j[7];
            Object[] objArr2 = new Object[1];
            m(s, b, (byte) (b | 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionGroup, iLastIndexOf, iRgb, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step4).substring(7, 8).codePointAt(0) - 10, new char[]{5, 16, 11, 17, 21, 23, '\r', 14, 24, 15, 14, '\n', '\t', 17, 14, 6, 7, 0, 5, 23, 4, 2}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_shippingzipcode_invalid).substring(24, 25).length() + 31), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        n(((byte) KeyEvent.getModifierMetaStateMask()) + 16, new char[]{5, '\t', '\t', 1, 24, 14, '\r', 11, 5, 7, 6, '\r', 20, 7, 13858}, (byte) (ImageFormat.getBitsPerPixel(0) + 36), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43041);
            int iAxisFromString = 3110 - MotionEvent.axisFromString("");
            int i4 = 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte b2 = $$j[7];
            Object[] objArr5 = new Object[1];
            m((short) 141, b2, (byte) (b2 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iAxisFromString, i4, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = getExtras + 11;
            getItem = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (43041 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int i7 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3110;
                int iIndexOf = 22 - TextUtils.indexOf("", "", 0, 0);
                byte[] bArr = $$j;
                short s2 = bArr[0];
                byte b3 = bArr[7];
                Object[] objArr6 = new Object[1];
                m(s2, b3, (byte) (b3 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, i7, iIndexOf, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i8 = ((int[]) objArr7[2])[0];
            int i9 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i9};
            int i10 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i11 = ((((~((-944760062) | i10)) | 269427928) * (-566)) - 417583950) + ((~(i10 | (-675332134))) * 566) + 1136652389;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[0])[0] = i13 ^ (i13 << 5);
            objArr = new Object[]{new int[1], iArr, new int[]{i8}, strArr};
        } else {
            if (tokenId != null) {
                int i14 = getExtras + 1;
                getItem = i14 % 128;
                i = 2;
                int i15 = i14 % 2;
                length = tokenId.length();
            } else {
                i = 2;
                length = 0;
            }
            int i16 = getExtras + 93;
            getItem = i16 % 128;
            int i17 = i16 % i;
            try {
                Object[] objArr8 = new Object[4];
                objArr8[3] = 1136652389;
                objArr8[i] = 0;
                objArr8[1] = Integer.valueOf(length);
                objArr8[0] = null;
                byte[] bArr2 = $$m;
                byte b4 = bArr2[32];
                Object[] objArr9 = new Object[1];
                o(b4, bArr2[25], b4, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                byte b5 = bArr2[25];
                Object[] objArr10 = new Object[1];
                o(b5, bArr2[32], b5, objArr10);
                objArr = (Object[]) cls2.getMethod((String) objArr10[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char scrollDefaultDelay = (char) (43042 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 3111;
                    int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 22;
                    byte[] bArr3 = $$j;
                    short s3 = bArr3[0];
                    byte b6 = bArr3[7];
                    Object[] objArr11 = new Object[1];
                    m(s3, b6, (byte) (b6 | 37), objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollDefaultDelay, offsetBefore, iIndexOf2, 154975793, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr12 = new Object[1];
                    n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_dialog_screen_title_text).substring(12, 13).codePointAt(0) - 79, new char[]{5, 16, 11, 17, 21, 23, '\r', 14, 24, 15, 14, '\n', '\t', 17, 14, 6, 7, 0, 5, 23, 4, 2}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 4), objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, new char[]{5, '\t', '\t', 1, 24, 14, '\r', 11, 5, 7, 6, '\r', 20, 7, 13858}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step2).substring(0, 3).codePointAt(2) + 26), objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char mode = (char) (View.MeasureSpec.getMode(0) + 43042);
                        int threadPriority = 3111 - ((Process.getThreadPriority(0) + 20) >> 6);
                        int scrollDefaultDelay2 = 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        byte b7 = $$j[7];
                        Object[] objArr14 = new Object[1];
                        m((short) 141, b7, (byte) (b7 | 52), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mode, threadPriority, scrollDefaultDelay2, -1269618118, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 43042);
                        int iRed = Color.red(0) + 3111;
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 22;
                        short s4 = (short) ($$k & 967);
                        byte b8 = $$j[7];
                        Object[] objArr15 = new Object[1];
                        m(s4, b8, (byte) (b8 | 52), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(capsMode, iRed, scrollBarSize, -1272852037, false, (String) objArr15[0], null);
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
        int i18 = ((int[]) objArr[1])[0];
        int i19 = ((int[]) objArr[2])[0];
        if (i19 == i18) {
            int i20 = getExtras + 89;
            getItem = i20 % 128;
            int i21 = i20 % 2;
            int i22 = ((int[]) objArr[0])[0];
            int i23 = ((int[]) objArr[2])[0];
            int i24 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr2 = {i24};
            int i25 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 804471880;
            int i26 = ~i25;
            int i27 = i22 + (-2123286414) + (((~(1449010244 | i26)) | 151032474) * 184) + ((i25 | 1344021504) * (-184)) + ((~((-256021215) | i26)) * 184);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr[0])[0] = i29 ^ (i29 << 5);
            Object[] objArr16 = {new int[1], iArr2, new int[]{i23}, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i30 = getExtras + 95;
                int i31 = i30 % 128;
                getItem = i31;
                int i32 = i30 % 2;
                int i33 = i31 + 113;
                getExtras = i33 % 128;
                int i34 = i33 % 2;
                for (String str3 : strArr3) {
                    arrayList.add(str3);
                }
            }
            Toast.makeText((Context) null, i19 / (((i19 - 1) * i19) % 2), 0).show();
            int i35 = ((int[]) objArr[0])[0];
            int i36 = ((int[]) objArr[2])[0];
            int i37 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr3 = {i36};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i38 = (~((-971707069) | startUptimeMillis)) | 698417188;
            int i39 = i35 + 2117985602 + (i38 * 992) + ((i38 | (~((~startUptimeMillis) | 1006614270))) * (-496)) + ((startUptimeMillis | 733324390) * 496);
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr[0])[0] = i41 ^ (i41 << 5);
            Object[] objArr17 = {new int[1], new int[]{i37}, iArr3, strArr4};
        }
        MidtransSDK.getInstance().paymentUsingMandiriClickPay(getrotationappliedbyeffect.b().readAuthenticationToken(), new NewMandiriClickPaymentParams(tokenId, str, str2), new TransactionCallback() { // from class: getRotationAppliedByEffect.4
            public AnonymousClass4() {
            }

            @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
            public final void onError(Throwable th2) {
                ((propagateChildrenCamera2Interop) getRotationAppliedByEffect.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th2);
            }

            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
            public final void onFailure(TransactionResponse transactionResponse, String str4) {
                getRotationAppliedByEffect.this.b = transactionResponse;
                ((propagateChildrenCamera2Interop) getRotationAppliedByEffect.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
            }

            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
            public final void onSuccess(TransactionResponse transactionResponse) {
                getRotationAppliedByEffect.this.b = transactionResponse;
                ((propagateChildrenCamera2Interop) getRotationAppliedByEffect.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a9, code lost:
    
        if (r1 != (((((~((-1865186945) | r2)) | 1168160860) * 262) + 204456460) + (((~((~r2) | (-1865186945))) | 1168160860) * 262))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ab, code lost:
    
        super.onCreate(r9);
        setContentView(com.bpjstku.R.layout.activity_new_mandiri_clickpay);
        r8.connect = new defpackage.getRotationAppliedByEffect(r8);
        r8.getInterfaceDescriptor.addTextChangedListener(new com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity.AnonymousClass2(r8));
        r8.INotificationSideChannel.setTextBold();
        r8.INotificationSideChannel.setOnClickListener(new com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity.AnonymousClass3(r8));
        r8.write.setOnClickListener(new com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity.AnonymousClass4(r8));
        b(getString(com.bpjstku.R.string.mandiri_click_pay));
        r1 = com.midtrans.sdk.corekit.core.MidtransSDK.getInstance().getTransaction().getTransactionDetails();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00f4, code lost:
    
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f6, code lost:
    
        r2 = com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity.getExtras + 59;
        com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity.getItem = r2 % 128;
        r2 = r2 % 2;
        r8.IconCompatParcelizer.setText(com.midtrans.sdk.corekit.utilities.Utils.formatDouble(r1.getAmount()));
        r1 = com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity.getExtras + 25;
        com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity.getItem = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0115, code lost:
    
        r8.read.setText(java.lang.String.valueOf(defpackage.onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault3()));
        r8.write.setText(getString(com.bpjstku.R.string.payment_instruction, getString(com.bpjstku.R.string.mandiri_click_pay)));
        r8.connect.b("Mandiri Clickpay Overview", getIntent().getBooleanExtra("First Page", true));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0148, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0149, code lost:
    
        r9 = 1096461986 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0152, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0153, code lost:
    
        r9 = 1743649948 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x015c, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0038, code lost:
    
        if (r1 == ((((-864906616) + (((~(r4 | (-1099563224))) | 269575680) * (-828))) + ((r4 | (-1099563224)) * (-828))) - 94718108)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0065, code lost:
    
        if (r1 == (((-1037039080) + ((1066400751 | r4) * 184)) + (((~(r4 | 219013388)) | 864787183) * 184))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0067, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r4 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
     */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r9) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        b();
        int i2 = this.cancel;
        if (i2 >= 2) {
            if (transactionResponse != null) {
                int i3 = getItem + 67;
                getExtras = i3 % 128;
                int i4 = i3 % 2;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.connect.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                return;
            }
            return;
        }
        int i5 = getItem + 21;
        getExtras = i5 % 128;
        if (i5 % 2 != 0) {
            this.cancel = i2 + 1;
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, getString(R.string.message_payment_failed));
        } else {
            this.cancel = i2 + 1;
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, getString(R.string.message_payment_failed));
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 29944);
            int iMyPid = (Process.myPid() >> 22) + 1755;
            int iResolveSize = 23 - View.resolveSize(0, 0);
            byte[] bArr = $$j;
            short s = bArr[0];
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            m(s, b, (byte) (b | 37), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength, iMyPid, iResolveSize, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i2 = getExtras + 95;
            getItem = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cResolveSizeAndState = (char) (29944 - View.resolveSizeAndState(0, 0, 0));
                int i4 = 1756 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int packedPositionGroup = 23 - ExpandableListView.getPackedPositionGroup(0L);
                byte b2 = $$j[7];
                Object[] objArr3 = new Object[1];
                m((short) 141, b2, (byte) (b2 | 52), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, i4, packedPositionGroup, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i5 = ((((-2023669115) + (((~(startUptimeMillis | 780902418)) | 568299992) * (-668))) + ((780902418 | (~(568299992 | startUptimeMillis))) * 1336)) + ((startUptimeMillis | 803189210) * 668)) - 408820233;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            n(16 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{21, '\t', 16, 7, 18, '\r', 5, 16, 3, 18, '\f', '\t', 16, 14, 5, 6}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step4).substring(26, 27).codePointAt(0) - 107), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, new char[]{2, 17, 5, 19, '\f', 21, '\f', 6, 1, 11, 15, 19, 0, 22, 14, 7}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_instruction_step5).substring(28, 30).codePointAt(1) - 21), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {932473569};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 1727 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = ProvinceItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -408820233, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29944);
                    int i8 = 1755 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int fadingEdgeLength = 23 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte b3 = $$j[7];
                    Object[] objArr8 = new Object[1];
                    m((short) 141, b3, (byte) (b3 | 52), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, i8, fadingEdgeLength, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_general_network_error).substring(0, 37).length() - 15, new char[]{5, 16, 11, 17, 21, 23, '\r', 14, 24, 15, 14, '\n', '\t', 17, 14, 6, 7, 0, 5, 23, 4, 2}, (byte) (31 - TextUtils.lastIndexOf("", '0')), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, new char[]{5, '\t', '\t', 1, 24, 14, '\r', 11, 5, 7, 6, '\r', 20, 7, 13858}, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 34), objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 29944);
                        int scrollDefaultDelay = 1755 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 23;
                        byte b4 = $$j[7];
                        Object[] objArr11 = new Object[1];
                        m((short) 52, b4, (byte) (b4 | 52), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetAfter, scrollDefaultDelay, iIndexOf, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29944);
                        int i9 = 1756 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int modifierMetaStateMask = 22 - ((byte) KeyEvent.getModifierMetaStateMask());
                        byte[] bArr2 = $$j;
                        short s2 = bArr2[0];
                        byte b5 = bArr2[7];
                        Object[] objArr12 = new Object[1];
                        m(s2, b5, (byte) (b5 | 37), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, i9, modifierMetaStateMask, 986134021, false, (String) objArr12[0], null);
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
            int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i13 = (-664678862) + (((~((~iElapsedRealtime) | 184742056)) | (-531562219)) * (-245));
            int i14 = ~(iElapsedRealtime | 184742056);
            int i15 = i12 + i13 + (i14 * (-245)) + ((i14 | 397344482) * 245);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr13[3])[0] = i17 ^ (i17 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
            if (strArr != null) {
                int i18 = getExtras + 97;
                getItem = i18 % 128;
                int i19 = i18 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i11];
            int i20 = i11 - 1;
            iArr[i20] = 1;
            Toast.makeText((Context) null, iArr[((i11 * i20) % 2) - 1], 1).show();
            int i21 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
            int iMyTid = Process.myTid();
            int i22 = ~(587252194 | iMyTid);
            int i23 = ~iMyTid;
            int i24 = i21 + (-312048689) + ((i22 | (~(i23 | (-483)))) * (-406)) + ((~(799855102 | i23)) * (-406)) + (((~(iMyTid | (-799854621))) | (~((-587252195) | i23))) * 406);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr14[3])[0] = i26 ^ (i26 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cMyPid = (char) (Process.myPid() >> 22);
            int iAlpha = Color.alpha(0) + 1031;
            int i27 = 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            short s3 = (short) ($$k & 967);
            byte b6 = $$j[7];
            Object[] objArr15 = new Object[1];
            m(s3, b6, (byte) (b6 | 52), objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cMyPid, iAlpha, i27, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.btn_cancel).substring(1, 2).length() + 21, new char[]{5, 16, 11, 17, 21, 23, '\r', 14, 24, 15, 14, '\n', '\t', 17, 14, 6, 7, 0, 5, 23, 4, 2}, (byte) (View.getDefaultSize(0, 0) + 32), objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        n((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15, new char[]{5, '\t', '\t', 1, 24, 14, '\r', 11, 5, 7, 6, '\r', 20, 7, 13858}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.fetching_offers).substring(1, 2).codePointAt(0) - 66), objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1031;
            int i28 = 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            byte b7 = $$j[7];
            Object[] objArr18 = new Object[1];
            m((short) 141, b7, (byte) (b7 | 52), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maximumFlingVelocity, jumpTapTimeout, i28, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cAlpha = (char) Color.alpha(0);
                int i29 = 1032 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int i30 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14;
                byte[] bArr3 = $$j;
                byte b8 = bArr3[7];
                Object[] objArr19 = new Object[1];
                m(b8, bArr3[132], b8, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cAlpha, i29, i30, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i31 = ((int[]) objArr20[3])[0];
            int i32 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
            int i33 = ~iElapsedRealtime2;
            int i34 = (-711022115) + (((~((-985952629) | i33)) | 314601844 | (~(741672458 | i33)) | (~((-70321675) | iElapsedRealtime2))) * (-84));
            int i35 = (~(iElapsedRealtime2 | 741672458)) | 985952628;
            int i36 = ~(i33 | (-741672459));
            int i37 = i34 + ((i35 | i36) * (-84)) + ((70321674 | i36) * 84) + 218755904;
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr[2])[0] = i39 ^ (i39 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, new char[]{21, '\t', 16, 7, 18, '\r', 5, 16, 3, 18, '\f', '\t', 16, 14, 5, 6}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 7), objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.title_payment_successful).substring(0, 1).codePointAt(0) - 64, new char[]{2, 17, 5, 19, '\f', 21, '\f', 6, 1, 11, 15, 19, 0, 22, 14, 7}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 40), objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {932473569};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - Color.green(0)), 1134 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 18 - Color.blue(0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 218755904, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 1031;
                int iBlue = Color.blue(0) + 15;
                short s4 = (short) ($$k & 967);
                byte b9 = $$j[7];
                Object[] objArr25 = new Object[1];
                m(s4, b9, (byte) (b9 | 52), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(mirror, capsMode, iBlue, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - Color.alpha(0)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1116, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17), Boolean.TYPE});
            }
            Object[] objArr26 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
                int i40 = 1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 16;
                byte[] bArr4 = $$j;
                byte b10 = bArr4[7];
                Object[] objArr27 = new Object[1];
                m(b10, bArr4[132], b10, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(capsMode2, i40, iLastIndexOf, 632103528, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr26);
            try {
                Object[] objArr28 = new Object[1];
                n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, new char[]{5, 16, 11, 17, 21, 23, '\r', 14, 24, 15, 14, '\n', '\t', 17, 14, 6, 7, 0, 5, 23, 4, 2}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 21), objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.btn_save_card).substring(1, 2).length() + 14, new char[]{5, '\t', '\t', 1, 24, 14, '\r', 11, 5, 7, 6, '\r', 20, 7, 13858}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1), objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1032;
                    int offsetBefore = 15 - TextUtils.getOffsetBefore("", 0);
                    byte b11 = $$j[7];
                    Object[] objArr30 = new Object[1];
                    m((short) 141, b11, (byte) (b11 | 52), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(pressedStateDuration, iIndexOf2, offsetBefore, 1344079056, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cRed = (char) Color.red(0);
                    int defaultSize = 1031 - View.getDefaultSize(0, 0);
                    int iArgb = Color.argb(0, 0, 0, 0) + 15;
                    short s5 = (short) ($$k & 967);
                    byte b12 = $$j[7];
                    Object[] objArr31 = new Object[1];
                    m(s5, b12, (byte) (b12 | 52), objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cRed, defaultSize, iArgb, 1357589585, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr = objArr26;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i41 = ((int[]) objArr[1])[0];
        int i42 = ((int[]) objArr[3])[0];
        if (i42 != i41) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i43 = getExtras + 81;
                getItem = i43 % 128;
                for (int i44 = i43 % 2 != 0 ? 0 : 1; i44 < strArr3.length; i44++) {
                    arrayList2.add(strArr3[i44]);
                }
            }
            throw new RuntimeException(String.valueOf(i42));
        }
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i45 = ((int[]) objArr[2])[0];
        int i46 = ((int[]) objArr[3])[0];
        int i47 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int i48 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
        int i49 = (-1098517849) + ((i48 | 452309488) * (-50));
        int i50 = ~((-311538033) | i48);
        int i51 = ~i48;
        int i52 = i45 + i49 + ((i50 | (~(519567350 | i51))) * 50) + (((~(i51 | 452309488)) | (~(208029318 | i51)) | (-519567351)) * 50);
        int i53 = (i52 << 13) ^ i52;
        int i54 = i53 ^ (i53 >>> 17);
        ((int[]) objArr32[2])[0] = i54 ^ (i54 << 5);
    }

    private static void n(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = getNotifyChildrenChangedOptions;
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $11 + 5;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2267, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33, -1927765101, false, $$w(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(getRoot)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                byte b4 = (byte) 0;
                byte b5 = b4;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 2267 - View.combineMeasuredStates(0, 0), 33 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1927765101, false, $$w(b4, b5, b5), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 49267), 3261 - (ViewConfiguration.getScrollBarSize() >> 8), 30 - Color.blue(0), -127612708, false, $$w(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 22879), 594 - View.getDefaultSize(0, 0), 16 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1570859318, false, $$w(b8, b9, (byte) (b9 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i7 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i7];
                            int i8 = $10 + 57;
                            $11 = i8 % 128;
                            int i9 = i8 % 2;
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i10 = $11 + 91;
                                $10 = i10 % 128;
                                int i11 = i10 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i12 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i12];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                            } else {
                                int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                            }
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    obj2 = obj;
                }
            }
            for (int i16 = 0; i16 < i; i16++) {
                int i17 = $10 + 99;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                cArr4[i16] = (char) (cArr4[i16] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = getExtras + 17;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iMyUid = Process.myUid();
        if (i4 != 1848471576 + (((~((-947954978) | iMyUid)) | 117967434) * (-756)) + (((~iMyUid) | (-947954978)) * 756)) {
            throw null;
        }
        int i5 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i6 = (-1712686052) + (((~(100237746 | iMaxMemory)) | (-1816149078)) * 672);
        int i7 = ~iMaxMemory;
        if (i5 != i6 + (((~(iMaxMemory | (-1816149078))) | (~((-100237747) | i7))) * (-672)) + (((~(1816149077 | i7)) | (-1845083640)) * 672)) {
            int i8 = (-1760991870) % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i9 = getItem + 5;
        getExtras = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = getExtras + 61;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i5 = ~startElapsedRealtime;
        if (i4 != 873762918 + (((~((-487189396) | i5)) | 1317176938) * (-865)) + ((~(startElapsedRealtime | 487189395)) * 865) + (((~(1317176938 | i5)) | (~(i5 | 487189395))) * 865)) {
            throw null;
        }
        int i6 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i7 = (~((-278799857) | iIdentityHashCode)) | 1705312;
        if (i6 != (-1027415268) + (i7 * 992) + ((i7 | (~((~iIdentityHashCode) | (-1717616644)))) * (-496)) + ((iIdentityHashCode | (-1994711188)) * 496)) {
            int i8 = (-619980390) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i9 = getExtras + 77;
        getItem = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int iTuitionPaymentFragmentbindingInflater1 = MediaSpecOutputFormat.TuitionPaymentFragmentbindingInflater1();
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_message_invalid_expiry_date).substring(14, 16).codePointAt(1) + 812873284;
        b(MediaSpecOutputFormat.TuitionPaymentFragmentbindingInflater1(), -258511187, 258511187, iTuitionPaymentFragmentbindingInflater1, iCodePointAt, MediaSpecOutputFormat.TuitionPaymentFragmentbindingInflater1(), new Object[]{this});
    }

    @Override // defpackage.propagateChildrenCamera2Interop
    public final void TuitionPaymentFragmentbindingInflater1(Throwable th) {
        int iTuitionPaymentFragmentbindingInflater1 = MediaSpecOutputFormat.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = MediaSpecOutputFormat.TuitionPaymentFragmentbindingInflater1();
        b(1330112096 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_unsuccessful).substring(0, 1).length(), -499939618, 499939619, iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentbindingInflater2, MediaSpecOutputFormat.TuitionPaymentFragmentbindingInflater1(), new Object[]{this, th});
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = getItem + 65;
        getExtras = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = getItem + 83;
        getExtras = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$w(short r6, int r7, int r8) {
        /*
            byte[] r0 = com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity.$$u
            int r6 = r6 * 2
            int r1 = r6 + 1
            int r8 = r8 + 113
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r8 = r7
            r3 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
        L28:
            int r7 = r7 + r4
            int r8 = r8 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.mandiri_clickpay.MandiriClickPayActivity.$$w(short, int, int):java.lang.String");
    }
}
