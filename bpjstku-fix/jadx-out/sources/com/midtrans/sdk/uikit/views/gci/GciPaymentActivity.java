package com.midtrans.sdk.uikit.views.gci;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import com.bpjstku.R;
import com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.midtrans.sdk.corekit.callback.TransactionCallback;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import defpackage.CameraUseCaseAdapter;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.ViewPortBuilder;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.filterOutChildSizesCausingDoubleCropping;
import defpackage.getChildTemplate;
import defpackage.handleMessage;
import defpackage.initSession;
import defpackage.onConnectionFailed;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class GciPaymentActivity extends BasePaymentActivity implements filterOutChildSizesCausingDoubleCropping {
    private TextInputLayout INotificationSideChannel;
    private FancyButton asInterface;
    private getChildTemplate cancel;
    private AppCompatEditText cancelAll;
    private AppCompatEditText d;
    private final String g = "GCI";
    private int notify = 2;
    private TextInputLayout onTransact;
    private static final byte[] $$m = {97, 58, 103, -72};
    private static final int $$n = 44;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {89, 92, -72, 43, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$k = 30;
    private static int INotificationSideChannelDefault = 0;
    private static int getInterfaceDescriptor = 1;
    private static int[] INotificationSideChannelStubProxy = {-1454174218, -98231530, -1525858849, 756471631, 1230248268, 1770755548, -171127431, -687711318, -1933909215, -1708667832, -383937977, -333255822, -2062117708, 1378806666, -1154548539, -130436081, 1219076007, -1190742959};

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(GciPaymentActivity gciPaymentActivity, String str) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 37;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        gciPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = INotificationSideChannelDefault + 55;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ AppCompatEditText TuitionPaymentFragmentspecialinlinedviewModeldefault1(GciPaymentActivity gciPaymentActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        int i3 = i2 % 128;
        INotificationSideChannelDefault = i3;
        int i4 = i2 % 2;
        Object obj = null;
        AppCompatEditText appCompatEditText = gciPaymentActivity.d;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 77;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return appCompatEditText;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ AppCompatEditText TuitionPaymentFragmentspecialinlinedviewModeldefault2(GciPaymentActivity gciPaymentActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 35;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        AppCompatEditText appCompatEditText = gciPaymentActivity.cancelAll;
        if (i3 != 0) {
            return appCompatEditText;
        }
        throw null;
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = ~i4;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i4 | i6);
        int i12 = i10 | i11;
        int i13 = (~(i7 | i6)) | (~(i7 | i9)) | (~(i9 | i6));
        int i14 = i6 + i3 + i + (669352129 * i2) + (266941808 * i5);
        int i15 = i14 * i14;
        int i16 = (720661947 * i6) + 1572077568 + ((-1243901369) * i3) + (1165201990 * i12) + (i11 * (-1165201990)) + ((-1165201990) * i13) + (1885863936 * i) + ((-1100480512) * i2) + ((-1249902592) * i5) + ((-491520000) * i15);
        int i17 = (i6 * 1617402437) + 56426783 + (i3 * 1617401273) + (i12 * (-582)) + (i11 * 582) + (i13 * 582) + (i * 1617401855) + (i2 * 1244927807) + (i5 * (-404665712)) + (i15 * (-45350912));
        return i16 + ((i17 * i17) * 1565261824) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        GciPaymentActivity gciPaymentActivity = (GciPaymentActivity) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 17;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return gciPaymentActivity.d.getText().toString();
        }
        gciPaymentActivity.d.getText().toString();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00b0 A[RETURN] */
    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(GciPaymentActivity gciPaymentActivity) {
        boolean z;
        boolean z2;
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 31;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String strReplace = gciPaymentActivity.cancelAll.getText().toString().trim().replace(" ", "");
        if (TextUtils.isEmpty(strReplace)) {
            gciPaymentActivity.onTransact.setError(gciPaymentActivity.getString(R.string.validation_message_card_number));
            z = false;
        } else {
            gciPaymentActivity.onTransact.setError(null);
            z = true;
        }
        if (strReplace.length() != 16) {
            gciPaymentActivity.onTransact.setError(gciPaymentActivity.getString(R.string.validation_message_invalid_card_no));
        } else {
            gciPaymentActivity.onTransact.setError(null);
            if (z) {
                int i4 = INotificationSideChannelDefault + 107;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                String string = gciPaymentActivity.d.getText().toString();
                if (TextUtils.isEmpty(string)) {
                    int i6 = INotificationSideChannelDefault + 87;
                    getInterfaceDescriptor = i6 % 128;
                    int i7 = i6 % 2;
                    gciPaymentActivity.INotificationSideChannel.setError(gciPaymentActivity.getString(R.string.error_password_empty));
                } else {
                    if (string.length() < 3) {
                        gciPaymentActivity.INotificationSideChannel.setError(gciPaymentActivity.getString(R.string.error_password_invalid));
                    } else {
                        gciPaymentActivity.INotificationSideChannel.setError(null);
                        int i8 = INotificationSideChannelDefault + 15;
                        getInterfaceDescriptor = i8 % 128;
                        int i9 = i8 % 2;
                        z2 = true;
                    }
                    if (z2) {
                        return true;
                    }
                }
                z2 = false;
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ getChildTemplate asBinder(GciPaymentActivity gciPaymentActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 123;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        getChildTemplate getchildtemplate = gciPaymentActivity.cancel;
        if (i4 == 0) {
            int i5 = 4 / 0;
        }
        int i6 = i2 + 79;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
        return getchildtemplate;
    }

    public static /* synthetic */ String b(GciPaymentActivity gciPaymentActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        String strReplace = gciPaymentActivity.cancelAll.getText().toString().trim().replace(" ", "");
        int i4 = getInterfaceDescriptor + 87;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return strReplace;
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
    private static void m(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.midtrans.sdk.uikit.views.gci.GciPaymentActivity.$$j
            int r1 = 53 - r5
            int r6 = 144 - r6
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r1 = new byte[r1]
            int r5 = 52 - r5
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r5
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r3 = r0[r6]
        L28:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.gci.GciPaymentActivity.m(byte, short, int, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = INotificationSideChannelDefault + 77;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        super.onActivityResult(i, i2, intent);
        if (i != 210 && i != 111) {
            int i6 = getInterfaceDescriptor + 15;
            INotificationSideChannelDefault = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        TransactionResponse transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Intent intent2 = new Intent();
        intent2.putExtra("transaction_response", transactionResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        setResult(-1, intent2);
        finish();
        int i8 = INotificationSideChannelDefault + 121;
        getInterfaceDescriptor = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getChildTemplate getchildtemplate = this.cancel;
        if (getchildtemplate != null) {
            getchildtemplate.TuitionPaymentFragmentbindingInflater1("Back", "GCI");
            int i3 = INotificationSideChannelDefault + 79;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
        }
        super.onBackPressed();
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 55;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            b(this.cancelAll);
            b(this.d);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.onTransact);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.INotificationSideChannel);
            setPrimaryBackgroundColor(this.asInterface);
            throw null;
        }
        b(this.cancelAll);
        b(this.d);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.onTransact);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.INotificationSideChannel);
        setPrimaryBackgroundColor(this.asInterface);
        int i3 = getInterfaceDescriptor + 5;
        INotificationSideChannelDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 37;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface = (FancyButton) findViewById(R.id.button_primary);
        this.cancelAll = (AppCompatEditText) findViewById(R.id.edit_gci_card_number);
        this.d = (AppCompatEditText) findViewById(R.id.edit_gci_password);
        this.onTransact = (TextInputLayout) findViewById(R.id.card_number_container);
        this.INotificationSideChannel = (TextInputLayout) findViewById(R.id.password_container);
        int i4 = getInterfaceDescriptor + 13;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        int i = 2 % 2;
        b();
        if (this.TuitionPaymentFragmentbindingInflater1) {
            int i2 = INotificationSideChannelDefault + 121;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, handleMessage.b(th, this).TuitionPaymentFragmentbindingInflater1);
        }
        int i4 = getInterfaceDescriptor + 69;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void b(TransactionResponse transactionResponse) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 != 0) {
            b();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            throw null;
        }
        b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        int i3 = getInterfaceDescriptor + 79;
        INotificationSideChannelDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 40 / 0;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        int i6 = ~i5;
        if (i4 != 475278640 + (((~(1356360816 | i6)) | 526373273) * (-90)) + (((~(1356360816 | i5)) | 1082141792) * (-45)) + (((~(i5 | (-526373274))) | 1356360816 | (~(i6 | 526373273))) * 45)) {
            throw new RuntimeException("-1619283296");
        }
        int i7 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        if (i7 != ((159221532 + (((~((-596806629) | layoutDirection)) | 570591584) * 1504)) + ((~(layoutDirection | (-26215045))) * (-1504))) - 1051416000) {
            int i8 = getInterfaceDescriptor + 9;
            INotificationSideChannelDefault = i8 % 128;
            if (i8 % 2 != 0) {
                int[] iArr = new int[396446121];
                iArr[396446120] = 1;
                int i9 = 35817448 / 3;
                Toast.makeText((Context) null, iArr[-1], 0).show();
            } else {
                int[] iArr2 = new int[396446121];
                iArr2[396446120] = 1;
                int i10 = 35817448 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_gci_payment);
        this.cancel = new getChildTemplate(this);
        this.asInterface.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.gci.GciPaymentActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    if (GciPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(GciPaymentActivity.this)) {
                        GciPaymentActivity gciPaymentActivity = GciPaymentActivity.this;
                        GciPaymentActivity.TuitionPaymentFragmentbindingInflater1(gciPaymentActivity, gciPaymentActivity.getString(R.string.processing_payment));
                        getChildTemplate getchildtemplateAsBinder = GciPaymentActivity.asBinder(GciPaymentActivity.this);
                        String strB = GciPaymentActivity.b(GciPaymentActivity.this);
                        String str = (String) GciPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), new Object[]{GciPaymentActivity.this}, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), -1641399144, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), 1641399144);
                        getchildtemplateAsBinder.b().paymentUsingGCI(getchildtemplateAsBinder.b().readAuthenticationToken(), strB, str, new TransactionCallback() { // from class: getChildTemplate.3
                            public AnonymousClass3() {
                            }

                            @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                            public final void onError(Throwable th) {
                                ((filterOutChildSizesCausingDoubleCropping) getChildTemplate.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
                            }

                            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                            public final void onFailure(TransactionResponse transactionResponse, String str2) {
                                getChildTemplate.this.b = transactionResponse;
                                ((filterOutChildSizesCausingDoubleCropping) getChildTemplate.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
                            }

                            @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
                            public final void onSuccess(TransactionResponse transactionResponse) {
                                getChildTemplate.this.b = transactionResponse;
                                ((filterOutChildSizesCausingDoubleCropping) getChildTemplate.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
                            }
                        });
                    }
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        b(getString(R.string.payment_method_gci));
        this.asInterface.setText(getString(R.string.confirm_payment));
        this.asInterface.setTextBold();
        this.cancelAll.addTextChangedListener(new TextWatcher() { // from class: com.midtrans.sdk.uikit.views.gci.GciPaymentActivity.4
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                GciPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(GciPaymentActivity.this).setError(null);
                if (editable.length() > 0 && editable.length() % 5 == 0 && ' ' == editable.charAt(editable.length() - 1)) {
                    editable.delete(editable.length() - 1, editable.length());
                }
                if (editable.length() > 0 && editable.length() % 5 == 0 && Character.isDigit(editable.charAt(editable.length() - 1)) && TextUtils.split(editable.toString(), " ").length <= 3) {
                    editable.insert(editable.length() - 1, " ");
                }
                if (editable.length() >= 19) {
                    GciPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(GciPaymentActivity.this).requestFocus();
                }
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            }
        });
        this.cancel.b("GCI", getIntent().getBooleanExtra("First Page", true));
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        GciPaymentActivity gciPaymentActivity = (GciPaymentActivity) objArr[0];
        TransactionResponse transactionResponse = (TransactionResponse) objArr[1];
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 123;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            gciPaymentActivity.b();
            onConnectionFailed.TuitionPaymentFragmentbindingInflater1();
            int i3 = gciPaymentActivity.notify;
            throw null;
        }
        gciPaymentActivity.b();
        onConnectionFailed.TuitionPaymentFragmentbindingInflater1();
        if (gciPaymentActivity.notify > 0) {
            StringBuilder sb = new StringBuilder("");
            sb.append(gciPaymentActivity.getString(R.string.message_payment_failed));
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(gciPaymentActivity, sb.toString());
            gciPaymentActivity.notify--;
            return null;
        }
        gciPaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(transactionResponse, gciPaymentActivity.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        int i4 = getInterfaceDescriptor + 67;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int iIndexOf = TextUtils.indexOf("", "", 0) + 1031;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 16;
            byte b = $$j[7];
            byte b2 = b;
            Object[] objArr3 = new Object[1];
            m(b2, (short) (b2 | 141), b, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, iIndexOf, iLastIndexOf, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        n(new int[]{-382516359, 879876469, -2074976969, 986076410, 677130214, 1587293343, 1993243430, 1218361783, 606547269, 1436992315, 1149336999, 76587622, -1189921507, -1919882781}, ((Process.getThreadPriority(0) + 20) >> 6) + 22, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        n(new int[]{-1028616836, -622653933, -321101323, -1312990679, 758423422, -1858361554, 1660479640, -828737775, -1883653202, -1240570039}, Process.getGidForName("") + 16, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int iResolveSizeAndState = 1031 - View.resolveSizeAndState(0, 0, 0);
            int fadingEdgeLength = 15 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            byte[] bArr = $$j;
            byte b3 = bArr[7];
            Object[] objArr6 = new Object[1];
            m(b3, bArr[0], b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatTimeout, iResolveSizeAndState, fadingEdgeLength, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1031;
                int i2 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15;
                Object[] objArr7 = new Object[1];
                m((byte) 52, (short) 37, $$j[5], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, offsetAfter, i2, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i3 = ((int[]) objArr8[3])[0];
            int i4 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i5 = ~startElapsedRealtime;
            int i6 = (-332428766) + (((~((-847201174) | i5)) | (-602921004)) * (-602)) + (((~(startElapsedRealtime | (-847201174))) | 269484948 | (~((-25204779) | i5))) * (-301)) + ((~(i5 | (-602921004))) * 301) + 1621138867;
            int i7 = i6 ^ (i6 << 13);
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            n(new int[]{-2083194983, 1479901321, -473588415, 1855857486, -677489199, -1469902832, 233420487, -1951586180, 1107452910, 216898312}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            n(new int[]{-1672705045, -1605225780, -542509311, -1037062355, 293462177, 1426446977, -2109135081, -2109340178, 1799608711, -598674470}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_list_header_prima).substring(0, 4).codePointAt(3) - 91, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr11 = {-2134521350};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46037 - ((byte) KeyEvent.getModifierMetaStateMask())), 1182 - AndroidCharacter.getMirror('0'), 19 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, 1621138867, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int iMyPid = (Process.myPid() >> 22) + 1031;
                    int iMakeMeasureSpec = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte b4 = $$j[7];
                    byte b5 = b4;
                    Object[] objArr13 = new Object[1];
                    m(b5, (short) (b5 | 141), b4, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(windowTouchSlop, iMyPid, iMakeMeasureSpec, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - TextUtils.getCapsMode("", 0, 0)), 1116 - TextUtils.indexOf((CharSequence) "", '0', 0), 18 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cBlue = (char) Color.blue(0);
                    int iMakeMeasureSpec2 = 1031 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 15;
                    Object[] objArr14 = new Object[1];
                    m((byte) 52, (short) 37, $$j[5], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cBlue, iMakeMeasureSpec2, iNormalizeMetaState, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    n(new int[]{-382516359, 879876469, -2074976969, 986076410, 677130214, 1587293343, 1993243430, 1218361783, 606547269, 1436992315, 1149336999, 76587622, -1189921507, -1919882781}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    n(new int[]{-1028616836, -622653933, -321101323, -1312990679, 758423422, -1858361554, 1660479640, -828737775, -1883653202, -1240570039}, 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1032;
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 15;
                        byte[] bArr2 = $$j;
                        byte b6 = bArr2[7];
                        Object[] objArr17 = new Object[1];
                        m(b6, bArr2[0], b6, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(modifierMetaStateMask, bitsPerPixel, tapTimeout, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1031;
                        int jumpTapTimeout = 15 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        byte b7 = $$j[7];
                        byte b8 = b7;
                        Object[] objArr18 = new Object[1];
                        m(b8, (short) (b8 | 141), b7, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(longPressTimeout, iResolveOpacity, jumpTapTimeout, 1357589585, false, (String) objArr18[0], null);
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
        int i9 = ((int[]) objArr[1])[0];
        int i10 = ((int[]) objArr[3])[0];
        if (i10 == i9) {
            int i11 = INotificationSideChannelDefault + 21;
            getInterfaceDescriptor = i11 % 128;
            int i12 = i11 % 2;
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i13 = ((int[]) objArr[2])[0];
            int i14 = ((int[]) objArr[3])[0];
            int i15 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message).substring(0, 25).codePointAt(7) - 290867475;
            int i16 = i13 + (-923022791) + (((~((-119567235) | (~iCodePointAt))) | (~(124712935 | iCodePointAt))) * (-272)) + (((~((-119994308) | iCodePointAt)) | 427073) * (-272)) + (((~(iCodePointAt | 119994307)) | 124285862) * 272);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr19[2])[0] = i18 ^ (i18 << 5);
            int i19 = INotificationSideChannelDefault + 59;
            getInterfaceDescriptor = i19 % 128;
            int i20 = i19 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i21 = getInterfaceDescriptor + 93;
                INotificationSideChannelDefault = i21 % 128;
                int i22 = i21 % 2;
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i10];
            int i23 = i10 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i10 * i23) % 2) - 1], 1).show();
            Object[] objArr20 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr[2])[0];
            int i25 = ((int[]) objArr[3])[0];
            int i26 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i27 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            int i28 = ~i27;
            int i29 = i24 + 2012023541 + (((~(409356083 | i28)) | (-653636254) | (~((-409356084) | i27))) * (-564)) + ((~(i27 | (-6554130))) * 1128) + (((~((-653636254) | i28)) | 402801954) * 564);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr20[2])[0] = i31 ^ (i31 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 29944);
            int iRed = 1755 - Color.red(0);
            int iRgb = (-16777193) - Color.rgb(0, 0, 0);
            Object[] objArr21 = new Object[1];
            m((byte) ($$k >>> 1), (short) 37, $$j[7], objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cResolveOpacity, iRed, iRgb, 986134021, false, (String) objArr21[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c2 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29944);
                int i32 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                int offsetAfter2 = 23 - TextUtils.getOffsetAfter("", 0);
                byte[] bArr3 = $$j;
                byte b9 = bArr3[7];
                Object[] objArr22 = new Object[1];
                m(b9, bArr3[0], b9, objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c2, i32, offsetAfter2, 1599039318, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr23[0])[0]}, new int[]{((int[]) objArr23[1])[0]}, (Object[]) objArr23[2], new int[1], (String[]) objArr23[4]};
            int i33 = ~System.identityHashCode(this);
            int i34 = (((-251538111) + (((~(i33 | 1073551099)) | (~((-187236402) | i33))) * (-184))) + (((549458562 | (~((-736694964) | i33))) | (~(524092537 | i33))) * 184)) - 300453660;
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr2[3])[0] = i36 ^ (i36 << 5);
        } else {
            Object[] objArr24 = new Object[1];
            n(new int[]{-2083194983, 1479901321, -473588415, 1855857486, -677489199, -1469902832, 233420487, -1951586180, 1107452910, 216898312}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1054).substring(0, 34).codePointAt(27) - 89, objArr24);
            Class<?> cls4 = Class.forName((String) objArr24[0]);
            Object[] objArr25 = new Object[1];
            n(new int[]{-1672705045, -1605225780, -542509311, -1037062355, 293462177, 1426446977, -2109135081, -2109340178, 1799608711, -598674470}, 16 - KeyEvent.normalizeMetaState(0), objArr25);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr25[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr26 = {-2134521350};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 42048), (ViewConfiguration.getTouchSlop() >> 8) + 1726, 29 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = MediaSessionCompat.MediaSessionImplBase.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr26), 1551533404);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c3 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 29943);
                int size = View.MeasureSpec.getSize(0) + 1755;
                int size2 = View.MeasureSpec.getSize(0) + 23;
                byte[] bArr4 = $$j;
                byte b10 = bArr4[7];
                Object[] objArr27 = new Object[1];
                m(b10, bArr4[0], b10, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, size, size2, 1599039318, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
            try {
                Object[] objArr28 = new Object[1];
                n(new int[]{-382516359, 879876469, -2074976969, 986076410, 677130214, 1587293343, 1993243430, 1218361783, 606547269, 1436992315, 1149336999, 76587622, -1189921507, -1919882781}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.page_title_uobapp).substring(0, 12).codePointAt(4) - 62, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                n(new int[]{-1028616836, -622653933, -321101323, -1312990679, 758423422, -1858361554, 1660479640, -828737775, -1883653202, -1240570039}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step2).substring(1, 2).codePointAt(0) - 82, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char doubleTapTimeout2 = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29944);
                    int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1755;
                    int trimmedLength = TextUtils.getTrimmedLength("") + 23;
                    byte b11 = $$j[7];
                    short s = b11;
                    Object[] objArr30 = new Object[1];
                    m(b11, s, (byte) s, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(doubleTapTimeout2, keyRepeatTimeout2, trimmedLength, 1596667560, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c4 = (char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 1755;
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23;
                    Object[] objArr31 = new Object[1];
                    m((byte) ($$k >>> 1), (short) 37, $$j[7], objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c4, tapTimeout2, minimumFlingVelocity, 986134021, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i37 = INotificationSideChannelDefault + 51;
                getInterfaceDescriptor = i37 % 128;
                int i38 = i37 % 2;
                objArr2 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr2[0])[0] != ((int[]) objArr2[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArr2[4];
            if (strArr5 != null) {
                for (String str2 : strArr5) {
                    arrayList2.add(str2);
                }
            }
            throw null;
        }
        int i39 = ((int[]) objArr2[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArr2[0])[0]}, new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[1], (String[]) objArr2[4]};
        int i40 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        int i41 = ~i40;
        int i42 = i39 + (-1895290361) + (((~((-260979885) | i41)) | (-48377459)) * (-602)) + (((~(i40 | (-260979885))) | 218894476 | (~((-6292051) | i41))) * (-301)) + ((~(i41 | (-48377459))) * 301);
        int i43 = (i42 << 13) ^ i42;
        int i44 = i43 ^ (i43 >>> 17);
        ((int[]) objArr32[3])[0] = i44 ^ (i44 << 5);
    }

    private static void n(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = INotificationSideChannelStubProxy;
        int i5 = -1870535734;
        int i6 = 1;
        int i7 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 19;
                $11 = i9 % 128;
                int i10 = i9 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 1;
                        byte b2 = (byte) (b - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.myPid() >> 22), 3291 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 31, 1948206109, false, $$u(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i8++;
                    int i11 = $11 + 43;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 3 % 4;
                    }
                    i3 = 2;
                    i5 = -1870535734;
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
        int[] iArr5 = INotificationSideChannelStubProxy;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                Object[] objArr3 = new Object[i6];
                objArr3[i7] = Integer.valueOf(iArr5[i13]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) i6;
                    byte b4 = (byte) (b3 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", i7), 3291 - (TypedValue.complexToFraction(i7, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i7, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 32, 1948206109, false, $$u(b3, b4, b4), new Class[]{Integer.TYPE});
                }
                iArr6[i13] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i13++;
                iArr5 = iArr5;
                i6 = 1;
                i7 = 0;
            }
            i2 = i7;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        int i14 = 2;
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i15 = $10 + 41;
            $11 = i15 % 128;
            int i16 = i15 % i14;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i17 = 17;
            for (int i18 = 1; i17 > i18; i18 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i17];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.MeasureSpec.getMode(0), TextUtils.lastIndexOf("", '0', 0, 0) + 2560, 28 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 683220507, false, $$u(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i17--;
            }
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i20 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 28880), ExpandableListView.getPackedPositionType(0L) + 348, KeyEvent.getDeadChar(0, 0) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            int i21 = $10 + 121;
            $11 = i21 % 128;
            int i22 = i21 % 2;
            i14 = 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1798371016
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
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.gci.GciPaymentActivity.onResume():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d3, code lost:
    
        if (r1 != ((((-1738915040) + ((~(1884524455 | r3)) * 979)) + ((r2 | 168613124) * (-979))) + (((~(r2 | 1884524455)) | (~(r3 | 168613124))) * 979))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d5, code lost:
    
        super.onStart();
        r1 = com.midtrans.sdk.uikit.views.gci.GciPaymentActivity.INotificationSideChannelDefault + 67;
        com.midtrans.sdk.uikit.views.gci.GciPaymentActivity.getInterfaceDescriptor = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e2, code lost:
    
        r1 = 888192028 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00eb, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ec, code lost:
    
        r1 = 1442425866 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f5, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0048, code lost:
    
        if (r1 == (((1312266488 + (((~(1797659880 | r5)) | (~((-967672338) | r4))) * (-370))) + ((((~(r4 | 1797659880)) | (~(r5 | (-967672338)))) | 1107434728) * (-370))) + 1728956240)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0074, code lost:
    
        if (r1 == ((((~(r4 | (-1300913201))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 986712740) + (((~((~r4) | (-1300913201))) | 269582665) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0076, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r5 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.copied_bill_code).substring(12, 13).codePointAt(0) - 52379966;
        r3 = ~r2;
     */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStart() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.gci.GciPaymentActivity.onStart():void");
    }

    public static /* synthetic */ String TuitionPaymentFragmentbindingInflater1(GciPaymentActivity gciPaymentActivity) {
        int iB = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        return (String) TuitionPaymentFragmentspecialinlinedviewModeldefault2(LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), new Object[]{gciPaymentActivity}, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), -1641399144, iB, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), 1641399144);
    }

    @Override // defpackage.filterOutChildSizesCausingDoubleCropping
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TransactionResponse transactionResponse) {
        int iB = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), new Object[]{this, transactionResponse}, CrashlyticsWorkers.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1008744831, iB, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), 1008744832);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 11;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = getInterfaceDescriptor + 7;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
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
    private static java.lang.String $$u(int r6, byte r7, short r8) {
        /*
            int r6 = r6 * 56
            int r6 = 122 - r6
            int r8 = r8 * 4
            int r0 = r8 + 1
            byte[] r1 = com.midtrans.sdk.uikit.views.gci.GciPaymentActivity.$$m
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2a:
            int r7 = -r7
            int r3 = r3 + 1
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.gci.GciPaymentActivity.$$u(int, byte, short):java.lang.String");
    }
}
