package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
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
import androidx.compose.runtime.ComposerKt;
import androidx.core.view.PointerIconCompat;
import com.bpjstku.R;
import com.bpjstku.data.asik.AsikDataStore$$ExternalSyntheticLambda16;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.midtrans.sdk.corekit.callback.BankBinsCallback;
import com.midtrans.sdk.corekit.callback.CardTokenCallback;
import com.midtrans.sdk.corekit.callback.SaveCardCallback;
import com.midtrans.sdk.corekit.callback.TransactionCallback;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.core.MidtransSDK;
import com.midtrans.sdk.corekit.core.TransactionRequest;
import com.midtrans.sdk.corekit.models.BankType;
import com.midtrans.sdk.corekit.models.CardTokenRequest;
import com.midtrans.sdk.corekit.models.CustomerDetails;
import com.midtrans.sdk.corekit.models.SaveCardRequest;
import com.midtrans.sdk.corekit.models.SaveCardResponse;
import com.midtrans.sdk.corekit.models.TokenDetailsResponse;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.corekit.models.promo.Promo;
import com.midtrans.sdk.corekit.models.promo.PromoDetails;
import com.midtrans.sdk.corekit.models.snap.BankBinsResponse;
import com.midtrans.sdk.corekit.models.snap.CreditCard;
import com.midtrans.sdk.corekit.models.snap.CreditCardPaymentModel;
import com.midtrans.sdk.corekit.models.snap.TransactionDetails;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public final class toRational extends filterResolutionsByAspectRatio<getMergedResolutions> {
    static final String TuitionPaymentFragmentbindingInflater1 = "CreditCardDetailsPresenter";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TokenDetailsResponse f1413a;
    CardTokenRequest asBinder;
    public int asInterface;
    public List<Promo> cancel;
    public int d;
    Context g;
    public TransactionResponse notify;
    private static final byte[] $$c = {94, -1, 37, -59};
    private static final int $$f = 162;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {21, ByteCompanionObject.MAX_VALUE, 49, -115, 12, 13, 0, 5, 13, -56, Base64.padSymbol, 20, 5, 8, 1, 6, 25, -3, 14, 7, 13, -61, 39, 28, 23, -17, 26, 19, -4, -28, 41, 9, 3, 28, -1, 16, -35, 44, 11, 4, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, -10, 15, 13, -2, 13, 13, 1, -22, 45, 0, 14, -3, 27, -7, 21, -57, 17, 13, 10, 5, -5, -9, 21, 9, 25, -38, 59, -7, 18, 9, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -59};
    private static final int $$e = 66;
    private static final byte[] $$a = {68, 83, 49, -116, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
    private static final int $$b = 129;
    private static int cancelAll = 0;
    private static int onTransact = 1;
    private static int[] INotificationSideChannel = {1915883161, -538317951, -1736258113, -263789403, 109902751, 962494877, 828793560, 2115581089, 258518422, -199301044, -2037265116, -512503964, 525822107, -1300254800, -345810744, 1820087670, -336682554, 981558062};

    /* JADX INFO: renamed from: toRational$3, reason: invalid class name */
    public class AnonymousClass3 implements TransactionCallback {
        public AnonymousClass3() {
        }

        @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
        public final void onError(Throwable th) {
            ((getMergedResolutions) toRational.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
        }

        @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
        public final void onFailure(TransactionResponse transactionResponse, String str) {
            toRational.this.notify = transactionResponse;
            ((getMergedResolutions) toRational.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(transactionResponse);
        }

        @Override // com.midtrans.sdk.corekit.callback.TransactionCallback
        public final void onSuccess(TransactionResponse transactionResponse) {
            CardTokenRequest cardTokenRequest;
            String string;
            toRational.this.notify = transactionResponse;
            final toRational torational = toRational.this;
            if (!torational.b().isEnableBuiltInTokenStorage() && (cardTokenRequest = torational.asBinder) != null && cardTokenRequest.isSaved()) {
                List<SaveCardRequest> listTuitionPaymentFragmentspecialinlinedviewModeldefault3 = onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault3(torational.b().getCreditCard().getSavedTokens());
                String string2 = torational.g.getString(R.string.card_click_type_two_click);
                SaveCardRequest saveCardRequest = null;
                if (TextUtils.isEmpty(torational.asBinder.getCardNumber())) {
                    string = null;
                } else {
                    String strSubstring = torational.asBinder.getCardNumber().replace(" ", "").substring(0, 6);
                    String strSubstring2 = torational.asBinder.getCardNumber().replace(" ", "").substring(12);
                    StringBuilder sb = new StringBuilder();
                    sb.append(strSubstring);
                    sb.append("-");
                    sb.append(strSubstring2);
                    string = sb.toString();
                }
                if (!listTuitionPaymentFragmentspecialinlinedviewModeldefault3.isEmpty()) {
                    for (SaveCardRequest saveCardRequest2 : listTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                        if (saveCardRequest2.getMaskedCard().equals(string)) {
                            saveCardRequest = saveCardRequest2;
                            break;
                        }
                    }
                }
                if (saveCardRequest != null) {
                    listTuitionPaymentFragmentspecialinlinedviewModeldefault3.remove(saveCardRequest);
                }
                listTuitionPaymentFragmentspecialinlinedviewModeldefault3.add(new SaveCardRequest(transactionResponse.getSavedTokenId(), string, string2));
                Collections.reverse(listTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                HashSet hashSet = new HashSet();
                Iterator<SaveCardRequest> it = listTuitionPaymentFragmentspecialinlinedviewModeldefault3.iterator();
                while (it.hasNext()) {
                    if (!hashSet.add(it.next().getMaskedCard())) {
                        it.remove();
                    }
                }
                CustomerDetails customerDetails = torational.b().getTransactionRequest().getCustomerDetails();
                torational.b().saveCards(customerDetails.getEmail() != null ? customerDetails.getEmail() : UUID.randomUUID().toString(), new ArrayList<>(listTuitionPaymentFragmentspecialinlinedviewModeldefault3), new SaveCardCallback() { // from class: toRational.2
                    @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                    public final void onError(Throwable th) {
                        Logger.d(toRational.TuitionPaymentFragmentbindingInflater1, "savecards:error");
                    }

                    @Override // com.midtrans.sdk.corekit.callback.SaveCardCallback
                    public final void onFailure(String str) {
                        Logger.d(toRational.TuitionPaymentFragmentbindingInflater1, "savecards:failed");
                    }

                    @Override // com.midtrans.sdk.corekit.callback.SaveCardCallback
                    public final void onSuccess(SaveCardResponse saveCardResponse) {
                        Logger.d(toRational.TuitionPaymentFragmentbindingInflater1, "savecards:success");
                    }
                });
            }
            ((getMergedResolutions) toRational.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b(transactionResponse);
        }
    }

    public toRational(Context context, getMergedResolutions getmergedresolutions) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getmergedresolutions;
        ((filterResolutionsByAspectRatio) this).TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new getFallbackAspectRatio();
        this.g = context;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(context);
        PromoDetails promoDetails = b().getTransaction().getPromoDetails();
        if (promoDetails != null) {
            List<Promo> promos = promoDetails.getPromos();
            this.cancel = new ArrayList();
            if (promos != null) {
                int i = cancelAll + 49;
                onTransact = i % 128;
                if (i % 2 == 0) {
                    promos.isEmpty();
                    throw null;
                }
                if (!promos.isEmpty()) {
                    Iterator<Promo> it = promos.iterator();
                    while (!(!it.hasNext())) {
                        Promo next = it.next();
                        try {
                            Promo promo = (Promo) next.clone();
                            int i2 = cancelAll + 55;
                            onTransact = i2 % 128;
                            if (i2 % 2 != 0) {
                                int i3 = 2 % 2;
                            }
                            next = promo;
                        } catch (CloneNotSupportedException e2) {
                            StringBuilder sb = new StringBuilder("CloneNotSupportedException:");
                            sb.append(e2.getMessage());
                            Logger.e(sb.toString());
                        }
                        this.cancel.add(next);
                        int i4 = 2 % 2;
                    }
                }
            }
        }
        try {
            b().getBankBins(new BankBinsCallback() { // from class: toRational.1
                @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                public final void onError(Throwable th) {
                }

                @Override // com.midtrans.sdk.corekit.callback.BankBinsCallback
                public final void onFailure(String str) {
                }

                @Override // com.midtrans.sdk.corekit.callback.BankBinsCallback
                public final void onSuccess(ArrayList<BankBinsResponse> arrayList) {
                    getFallbackAspectRatio getfallbackaspectratio = ((filterResolutionsByAspectRatio) toRational.this).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
            });
        } catch (RuntimeException e3) {
            String str = TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb2 = new StringBuilder("fetchBankBins");
            sb2.append(e3.getMessage());
            Logger.d(str, sb2.toString());
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i2;
        int i9 = (~(i8 | i5)) | i7;
        int i10 = (~(i7 | (~i5) | i2)) | (~(i8 | i7 | i5));
        int i11 = (~(i5 | i2)) | (~(i6 | i2));
        int i12 = i6 + i2 + i4 + ((-1520811122) * i3) + (1880343047 * i);
        int i13 = i12 * i12;
        int i14 = (((-88056299) * i6) - 1254686720) + (875799021 * i2) + ((-481927660) * i9) + (i10 * 481927660) + (481927660 * i11) + (393871360 * i4) + ((-206831616) * i3) + (408289280 * i) + ((-683737088) * i13);
        int i15 = ((i6 * (-660833811)) - 1995073173) + (i2 * (-660833531)) + (i9 * (-140)) + (i10 * 140) + (i11 * 140) + (i4 * (-660833671)) + (i3 * 644061726) + (i * (-2012083377)) + (i13 * (-1027145728));
        return i14 + ((i15 * i15) * 814809088) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = 154 - r7
            byte[] r0 = defpackage.toRational.$$a
            int r1 = 53 - r8
            int r6 = r6 + 84
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2b:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            r7 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.toRational.c(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.toRational.$$d
            int r6 = r6 + 84
            int r1 = r8 + 15
            int r7 = 90 - r7
            byte[] r1 = new byte[r1]
            int r8 = r8 + 14
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2b:
            int r6 = r6 + r7
            int r6 = r6 + (-8)
            r7 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.toRational.f(byte, int, byte, java.lang.Object[]):void");
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(CardTokenRequest cardTokenRequest) {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((filterResolutionsByAspectRatio) this).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.b;
        Logger.d(TuitionPaymentFragmentbindingInflater1, "applyInstallmentProperties()>term:".concat(String.valueOf(i4)));
        if (i4 > 0) {
            int i5 = onTransact + 47;
            cancelAll = i5 % 128;
            if (i5 % 2 != 0) {
                cardTokenRequest.setInstallment(true);
            } else {
                cardTokenRequest.setInstallment(true);
            }
            cardTokenRequest.setInstalmentTerm(i4);
        }
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = INotificationSideChannel;
        int i4 = -1870535734;
        char c = '0';
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 101;
                $10 = i8 % 128;
                if (i8 % i2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i6] = Integer.valueOf(iArr2[i7]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(i6, i6);
                            int iIndexOf = TextUtils.indexOf("", c) + 3292;
                            int iIndexOf2 = TextUtils.indexOf("", c) + 32;
                            byte b = (byte) ($$c[1] + 1);
                            byte b2 = b;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec, iIndexOf, iIndexOf2, 1948206109, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int i9 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3292;
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 32;
                        byte b3 = (byte) ($$c[1] + 1);
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarSize, i9, iLastIndexOf, 1948206109, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i7++;
                }
                i2 = 2;
                i4 = -1870535734;
                c = '0';
                i6 = 0;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = INotificationSideChannel;
        float f = 0.0f;
        if (iArr5 != null) {
            int i10 = $11 + 39;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                try {
                    Object[] objArr4 = new Object[i5];
                    objArr4[0] = Integer.valueOf(iArr5[i12]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        int i13 = 3291 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1));
                        int iNormalizeMetaState = 31 - KeyEvent.normalizeMetaState(0);
                        byte b5 = (byte) ($$c[i5] + 1);
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, i13, iNormalizeMetaState, 1948206109, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    i12++;
                    iArr5 = iArr5;
                    f = 0.0f;
                    i5 = 1;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i14 = 17;
            for (int i15 = 1; i14 > i15; i15 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i14];
                Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int bitsPerPixel = 2558 - ImageFormat.getBitsPerPixel(0);
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 30;
                    byte b7 = $$c[1];
                    byte b8 = (byte) (b7 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, bitsPerPixel, iLastIndexOf2, 683220507, false, $$g(b8, b8, (byte) (-b7)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
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
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28879), 347 - TextUtils.indexOf((CharSequence) "", '0', 0), 25 - ExpandableListView.getPackedPositionGroup(0L), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) throws Throwable {
        char c;
        Object[] objArr2;
        toRational torational = (toRational) objArr[0];
        CreditCardPaymentModel creditCardPaymentModel = (CreditCardPaymentModel) objArr[1];
        int i = 2 % 2;
        int i2 = ((filterResolutionsByAspectRatio) torational).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.b;
        String str = ((filterResolutionsByAspectRatio) torational).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i2 > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_");
            sb.append(i2);
            creditCardPaymentModel.setInstallment(sb.toString());
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 877;
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 11;
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[153]);
            short s = (short) (-bArr[9]);
            Object[] objArr3 = new Object[1];
            c(b, s, (byte) (s | 32), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iLastIndexOf, bitsPerPixel, -1199417970, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new int[]{-613371243, 2042325007, 1146167576, -875342193, 846846228, 512076488, 972639640, 347623676, 1413391792, 2103651495, -2120771203, 218345768, -215583619, 712665292}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new int[]{-1021970885, -1394808020, -1321677130, 801170167, -2024493552, 483243511, -1551705226, -1747315851, 952000202, 1361902392}, 15 - ((Process.getThreadPriority(0) + 20) >> 6), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int i3 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 876;
            int mirror = AndroidCharacter.getMirror('0') - '&';
            byte[] bArr2 = $$a;
            byte b2 = (byte) (-bArr2[27]);
            short s2 = bArr2[7];
            Object[] objArr6 = new Object[1];
            c(b2, s2, (byte) (s2 | 52), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, i3, mirror, 254769921, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cAlpha = (char) Color.alpha(0);
                int i4 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 10;
                byte[] bArr3 = $$a;
                Object[] objArr7 = new Object[1];
                c((byte) (-bArr3[153]), bArr3[7], (byte) (-bArr3[81]), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha, i4, offsetAfter, 1324201839, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int i5 = ~((int) Process.getStartUptimeMillis());
            int i6 = (((-1639416436) + (((-570953731) | i5) * 494)) + (((~(i5 | (-600317207))) | 99037181) * 494)) - 2136891524;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr2[1])[0] = i8 ^ (i8 << 5);
            c = 2;
        } else {
            Object[] objArr9 = new Object[1];
            e(new int[]{-483559931, -1398786776, -1566659134, 1585018044, -106926009, -1638931098, -1562546397, -1647034411, -282901357, -1489999550}, 16 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new int[]{-1073740546, -1269987148, -1534001722, 1095797708, -241749261, -2021896622, -644391195, 2007606702, 661824823, 433071746}, 16 - Color.alpha(0), objArr10);
            try {
                Object[] objArr11 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, torational)).intValue()), -2136891524};
                byte[] bArr4 = $$d;
                Object[] objArr12 = new Object[1];
                f(bArr4[51], bArr4[18], bArr4[6], objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b3 = bArr4[6];
                Object[] objArr13 = new Object[1];
                f(b3, b3, (byte) (-bArr4[53]), objArr13);
                Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iMyTid = 876 - (Process.myTid() >> 22);
                    int i9 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte[] bArr5 = $$a;
                    Object[] objArr15 = new Object[1];
                    c((byte) (-bArr5[153]), bArr5[7], (byte) (-bArr5[81]), objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, iMyTid, i9, 1324201839, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                try {
                    Object[] objArr16 = new Object[1];
                    e(new int[]{-613371243, 2042325007, 1146167576, -875342193, 846846228, 512076488, 972639640, 347623676, 1413391792, 2103651495, -2120771203, 218345768, -215583619, 712665292}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22, objArr16);
                    Class<?> cls4 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e(new int[]{-1021970885, -1394808020, -1321677130, 801170167, -2024493552, 483243511, -1551705226, -1747315851, 952000202, 1361902392}, 14 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr17);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        int iResolveSizeAndState = 876 - View.resolveSizeAndState(0, 0, 0);
                        int iLastIndexOf2 = 9 - TextUtils.lastIndexOf("", '0');
                        byte[] bArr6 = $$a;
                        byte b4 = (byte) (-bArr6[27]);
                        short s3 = bArr6[7];
                        Object[] objArr18 = new Object[1];
                        c(b4, s3, (byte) (s3 | 52), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cKeyCodeFromString, iResolveSizeAndState, iLastIndexOf2, 254769921, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int i10 = 876 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i11 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9;
                        byte[] bArr7 = $$a;
                        byte b5 = (byte) (-bArr7[153]);
                        short s4 = (short) (-bArr7[9]);
                        Object[] objArr19 = new Object[1];
                        c(b5, s4, (byte) (s4 | 32), objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatDelay, i10, i11, -1199417970, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i12 = onTransact + 35;
                    cancelAll = i12 % 128;
                    c = 2;
                    int i13 = i12 % 2;
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
        if (((int[]) objArr2[0])[0] != ((int[]) objArr2[c])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr2[3];
            if (strArr == null) {
                throw null;
            }
            for (String str2 : strArr) {
                arrayList.add(str2);
            }
            throw null;
        }
        int i14 = cancelAll + 7;
        onTransact = i14 % 128;
        int i15 = i14 % 2;
        int i16 = ((int[]) objArr2[1])[0];
        Object[] objArr20 = {new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
        int iMyUid = Process.myUid();
        int i17 = ~((-792444503) | iMyUid);
        int i18 = 1532974068 + ((739289088 | i17) * (-280)) + ((i17 | (~(752134273 | iMyUid))) * 140);
        int i19 = ~((-53155415) | iMyUid);
        int i20 = ~iMyUid;
        int i21 = i16 + i18 + (((~(i20 | 805289687)) | i19 | (~((-739289089) | i20))) * 140);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr20[1])[0] = i23 ^ (i23 << 5);
        creditCardPaymentModel.setPointRedeemed(((filterResolutionsByAspectRatio) torational).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        if (((filterResolutionsByAspectRatio) torational).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            int i24 = cancelAll + 109;
            onTransact = i24 % 128;
            int i25 = i24 % 2;
            String str3 = ((filterResolutionsByAspectRatio) torational).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i26 = ((int[]) objArr20[1])[0];
            int i27 = ((((i26 * i26) - (~(-(1672903331 * i26)))) - 1) - (~(-(i26 * 258634621)))) - (-1231020287);
            int i28 = i27 >> 26;
            int i29 = (((i28 | ComposerKt.defaultsKey) << 1) - (i28 ^ ComposerKt.defaultsKey)) / 64;
            int i30 = ((i29 | 1) << 1) - (i29 ^ 1);
            int i31 = ((i27 | i30) << 1) - (i30 ^ i27);
            int i32 = i27 >> 19;
            int i33 = ((i32 & (-16383)) + (i32 | (-16383))) / 8192;
            int i34 = -(((i33 & 1) + (i33 | 1)) ^ i31);
            int i35 = (i34 ^ 4) + ((i34 & 4) << 1);
            int i36 = i35 >> 24;
            int i37 = ((i36 ^ (-511)) + ((i36 & (-511)) << 1)) / 256;
            if (str3.equalsIgnoreCase("15\\18\\12\\30\\mandiri".substring(48960 / (((-((((i37 | 1) << 1) - (1 ^ i37)) + 1)) & i35) * PointerIconCompat.TYPE_GRAB)))) {
                creditCardPaymentModel.setBank(((filterResolutionsByAspectRatio) torational).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        creditCardPaymentModel.setPromoSelected(((filterResolutionsByAspectRatio) torational).TuitionPaymentFragmentspecialinlinedviewModeldefault2.d);
        return null;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(CardTokenRequest cardTokenRequest) {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(cardTokenRequest);
        cardTokenRequest.setPoint(((getMergedResolutions) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).cancel());
        MidtransSDK midtransSDKB = b();
        CreditCard creditCard = midtransSDKB.getCreditCard();
        if (creditCard != null) {
            int i4 = onTransact + 113;
            cancelAll = i4 % 128;
            if (i4 % 2 != 0) {
                String bank = creditCard.getBank();
                String channel = creditCard.getChannel();
                cardTokenRequest.setBank(bank);
                cardTokenRequest.setChannel(channel);
                cardTokenRequest.setType(creditCard.getType());
                int i5 = 6 / 0;
            } else {
                String bank2 = creditCard.getBank();
                String channel2 = creditCard.getChannel();
                cardTokenRequest.setBank(bank2);
                cardTokenRequest.setChannel(channel2);
                cardTokenRequest.setType(creditCard.getType());
            }
        }
        TransactionDetails transactionDetails = midtransSDKB.getTransaction().getTransactionDetails();
        if (transactionDetails != null) {
            cardTokenRequest.setCurrency(transactionDetails.getCurrency());
        }
    }

    @Override // defpackage.filterOutChildSizesThatWillNeverBeSelected
    public final TransactionResponse TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancelAll + 39;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.notify;
        }
        throw null;
    }

    public final void b(CardTokenRequest cardTokenRequest) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        int i = 2 % 2;
        int i2 = cancelAll + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder = cardTokenRequest;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (29944 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
            int iIndexOf = 1755 - TextUtils.indexOf("", "", 0);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 24;
            byte b = $$a[7];
            Object[] objArr = new Object[1];
            c(b, (short) (b | 151), (byte) 15, objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iIndexOf, iLastIndexOf, 986134021, false, (String) objArr[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr2 = new Object[1];
        e(new int[]{-613371243, 2042325007, 1146167576, -875342193, 846846228, 512076488, 972639640, 347623676, 1413391792, 2103651495, -2120771203, 218345768, -215583619, 712665292}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        e(new int[]{-1021970885, -1394808020, -1321677130, 801170167, -2024493552, 483243511, -1551705226, -1747315851, 952000202, 1361902392}, 15 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 29945);
            int mirror = AndroidCharacter.getMirror('0') + 1707;
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 23;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr4 = new Object[1];
            c(b3, (short) (b3 | 114), b2, objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAxisFromString, mirror, windowTouchSlop, 1596667560, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29943);
                int iIndexOf2 = 1754 - TextUtils.indexOf((CharSequence) "", '0', 0);
                int iIndexOf3 = TextUtils.indexOf("", "", 0, 0) + 23;
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr5 = new Object[1];
                c(b5, (short) (b5 | 62), b4, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iIndexOf2, iIndexOf3, 1599039318, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            int i5 = (((711695537 + ((((~((-698051546) | i4)) | 554705472) | (~(485449119 | i4))) * (-1136))) + ((((~((-698051546) | iIdentityHashCode)) | (~(485449119 | iIdentityHashCode))) | (~((-342103047) | i4))) * (-568))) + (((~(iIdentityHashCode | (-554705473))) | ((~(i4 | (-485449120))) | (~(698051545 | i4)))) * 568)) - 1544127604;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr7 = new Object[1];
            e(new int[]{-483559931, -1398786776, -1566659134, 1585018044, -106926009, -1638931098, -1562546397, -1647034411, -282901357, -1489999550}, Color.red(0) + 16, objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            e(new int[]{-1073740546, -1269987148, -1534001722, 1095797708, -241749261, -2021896622, -644391195, 2007606702, 661824823, 433071746}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 15, objArr8);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr9 = {-514189872};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.rgb(0, 0, 0) + 16819265), 1725 - MotionEvent.axisFromString(""), (ViewConfiguration.getPressedStateDuration() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), -1544127604);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29944);
                    int packedPositionType = 1755 - ExpandableListView.getPackedPositionType(0L);
                    int iGreen = 23 - Color.green(0);
                    byte b6 = $$a[7];
                    byte b7 = b6;
                    Object[] objArr10 = new Object[1];
                    c(b7, (short) (b7 | 62), b6, objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(longPressTimeout, packedPositionType, iGreen, 1599039318, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    Object[] objArr11 = new Object[1];
                    e(new int[]{-613371243, 2042325007, 1146167576, -875342193, 846846228, 512076488, 972639640, 347623676, 1413391792, 2103651495, -2120771203, 218345768, -215583619, 712665292}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 22, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    e(new int[]{-1021970885, -1394808020, -1321677130, 801170167, -2024493552, 483243511, -1551705226, -1747315851, 952000202, 1361902392}, 15 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr12);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 29944);
                        int iGreen2 = Color.green(0) + 1755;
                        int i8 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr13 = new Object[1];
                        c(b9, (short) (b9 | 114), b8, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(trimmedLength, iGreen2, i8, 1596667560, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cMyPid = (char) (29944 - (Process.myPid() >> 22));
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1755;
                        int iMyPid = 23 - (Process.myPid() >> 22);
                        byte b10 = $$a[7];
                        Object[] objArr14 = new Object[1];
                        c(b10, (short) (b10 | 151), (byte) 15, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cMyPid, absoluteGravity, iMyPid, 986134021, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0] == ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]) {
            int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int i10 = ~System.identityHashCode(this);
            int i11 = i9 + (-153870247) + (((~(i10 | 410238953)) | 58982406) * (-160)) + (((~(i10 | 197636527)) | 410238953) * 160);
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr15[3])[0] = i13 ^ (i13 << 5);
            b().getCardToken(cardTokenRequest, new CardTokenCallback() { // from class: toRational.5
                @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                public final void onError(Throwable th2) {
                    ((getMergedResolutions) toRational.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).INotificationSideChannel();
                }

                @Override // com.midtrans.sdk.corekit.callback.CardTokenCallback
                public final void onFailure(TokenDetailsResponse tokenDetailsResponse, String str) {
                    ((getMergedResolutions) toRational.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).INotificationSideChannel();
                }

                @Override // com.midtrans.sdk.corekit.callback.CardTokenCallback
                public final void onSuccess(TokenDetailsResponse tokenDetailsResponse) {
                    toRational.this.f1413a = tokenDetailsResponse;
                    ((getMergedResolutions) toRational.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1(tokenDetailsResponse);
                }
            });
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
        if (strArr == null) {
            throw null;
        }
        int i14 = cancelAll + 67;
        onTransact = i14 % 128;
        int i15 = i14 % 2 != 0 ? 0 : 1;
        while (i15 < strArr.length) {
            int i16 = onTransact + 123;
            cancelAll = i16 % 128;
            int i17 = i16 % 2;
            arrayList.add(strArr[i15]);
            i15++;
            int i18 = cancelAll + 79;
            onTransact = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 2 / 3;
            }
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        toRational torational = (toRational) objArr[0];
        int i = 2 % 2;
        String strB = ((filterResolutionsByAspectRatio) torational).TuitionPaymentFragmentspecialinlinedviewModeldefault2.b((String) objArr[1]);
        ArrayList<String> banksPointEnabled = torational.b().getBanksPointEnabled();
        if (!TextUtils.isEmpty(strB)) {
            int i2 = onTransact + 1;
            int i3 = i2 % 128;
            cancelAll = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (banksPointEnabled != null) {
                int i4 = i3 + 53;
                onTransact = i4 % 128;
                if (i4 % 2 == 0) {
                    banksPointEnabled.contains(strB);
                    obj.hashCode();
                    throw null;
                }
                if (banksPointEnabled.contains(strB) && strB.equals(BankType.BNI)) {
                    return true;
                }
            }
        }
        int i5 = onTransact + 111;
        cancelAll = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final Double TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = cancelAll + 45;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (((filterResolutionsByAspectRatio) this).TuitionPaymentFragmentspecialinlinedviewModeldefault2.d == null) {
            TransactionDetails transactionDetails = b().getTransaction().getTransactionDetails();
            if (transactionDetails != null) {
                return Double.valueOf(transactionDetails.getAmount());
            }
            return Double.valueOf(0.0d);
        }
        int i4 = onTransact + 119;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
        return Double.valueOf(((filterResolutionsByAspectRatio) this).TuitionPaymentFragmentspecialinlinedviewModeldefault2.d.getDiscountedGrossAmount());
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) throws Throwable {
        int length;
        Object[] objArr;
        Object[] objArr2;
        int i;
        char c = 2;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int pressedStateDuration = 876 - (ViewConfiguration.getPressedStateDuration() >> 16);
            int iIndexOf = 9 - TextUtils.indexOf((CharSequence) "", '0', 0);
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[153]);
            short s = (short) (-bArr[9]);
            Object[] objArr3 = new Object[1];
            c(b, s, (byte) (s | 32), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay, pressedStateDuration, iIndexOf, -1199417970, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new int[]{-613371243, 2042325007, 1146167576, -875342193, 846846228, 512076488, 972639640, 347623676, 1413391792, 2103651495, -2120771203, 218345768, -215583619, 712665292}, (Process.myTid() >> 22) + 22, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new int[]{-1021970885, -1394808020, -1321677130, 801170167, -2024493552, 483243511, -1551705226, -1747315851, 952000202, 1361902392}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 15, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
            int mirror = AndroidCharacter.getMirror('0') - '&';
            byte[] bArr2 = $$a;
            byte b2 = (byte) (-bArr2[27]);
            short s2 = bArr2[7];
            Object[] objArr6 = new Object[1];
            c(b2, s2, (byte) (s2 | 52), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, windowTouchSlop, mirror, 254769921, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = cancelAll + 11;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int iArgb = 876 - Color.argb(0, 0, 0, 0);
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                byte[] bArr3 = $$a;
                Object[] objArr7 = new Object[1];
                c((byte) (-bArr3[153]), bArr3[7], (byte) (-bArr3[81]), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, iArgb, minimumFlingVelocity, 1324201839, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i5 = ~startElapsedRealtime;
            int i6 = (-915944926) + (((~((-201606191) | i5)) | (~(161295961 | startElapsedRealtime))) * 217) + (((~(startElapsedRealtime | (-201606191))) | 67125286) * 217) + (((~(161295961 | i5)) | 201606190) * 217) + 917370019;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
        } else {
            if (str != null) {
                int i9 = cancelAll + 73;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
                length = str.length();
            } else {
                length = 0;
            }
            try {
                Object[] objArr9 = {Integer.valueOf(length), 917370019};
                byte[] bArr4 = $$d;
                byte b3 = bArr4[24];
                Object[] objArr10 = new Object[1];
                f(b3, (byte) (b3 | 64), (byte) (-bArr4[46]), objArr10);
                Class<?> cls2 = Class.forName((String) objArr10[0]);
                byte b4 = bArr4[6];
                Object[] objArr11 = new Object[1];
                f(b4, (byte) (b4 | 51), bArr4[24], objArr11);
                Object[] objArr12 = (Object[]) cls2.getMethod((String) objArr11[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 877;
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10;
                    byte[] bArr5 = $$a;
                    Object[] objArr13 = new Object[1];
                    c((byte) (-bArr5[153]), bArr5[7], (byte) (-bArr5[81]), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarSize, bitsPerPixel, maximumFlingVelocity, 1324201839, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr12);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new int[]{-613371243, 2042325007, 1146167576, -875342193, 846846228, 512076488, 972639640, 347623676, 1413391792, 2103651495, -2120771203, 218345768, -215583619, 712665292}, 22 - KeyEvent.normalizeMetaState(0), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new int[]{-1021970885, -1394808020, -1321677130, 801170167, -2024493552, 483243511, -1551705226, -1747315851, 952000202, 1361902392}, 15 - TextUtils.indexOf("", "", 0, 0), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int iGreen = Color.green(0) + 876;
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 11;
                        byte[] bArr6 = $$a;
                        byte b5 = (byte) (-bArr6[27]);
                        short s3 = bArr6[7];
                        Object[] objArr16 = new Object[1];
                        c(b5, s3, (byte) (s3 | 52), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop, iGreen, modifierMetaStateMask, 254769921, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                        int defaultSize = 876 - View.getDefaultSize(0, 0);
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 10;
                        byte[] bArr7 = $$a;
                        byte b6 = (byte) (-bArr7[153]);
                        short s4 = (short) (-bArr7[9]);
                        Object[] objArr17 = new Object[1];
                        c(b6, s4, (byte) (s4 | 32), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionChild, defaultSize, maxKeyCode, -1199417970, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr12;
                    c = 2;
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
        int i11 = ((int[]) objArr[c])[0];
        int i12 = ((int[]) objArr[0])[0];
        if (i12 == i11) {
            int i13 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i14 = ~Process.myUid();
            int i15 = ~(808972965 | i14);
            int i16 = i13 + 1610955192 + ((i15 | (-768662737)) * 764) + (((~(i14 | (-768662737))) | 537972864) * (-1528)) + (((-501689974) | i15) * 764);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr2[1])[0] = i18 ^ (i18 << 5);
            i = 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                for (String str2 : strArr) {
                    arrayList.add(str2);
                }
            }
            Toast.makeText((Context) null, i12 / (((i12 - 1) * i12) % 2), 0).show();
            int i19 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i20 = i19 + (((~((-231469769) | iElapsedRealtime)) | 155242688) * (-566)) + 2008325716 + ((~(iElapsedRealtime | (-76227081))) * 566);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr2[1])[0] = i22 ^ (i22 << 5);
            int i23 = onTransact + 51;
            cancelAll = i23 % 128;
            i = 2;
            int i24 = i23 % 2;
        }
        if (!TextUtils.isEmpty(str)) {
            int i25 = cancelAll + 87;
            onTransact = i25 % 128;
            int i26 = i25 % i;
            if (str.length() > 5) {
                return true;
            }
        }
        int i27 = ((int[]) objArr2[1])[0];
        int i28 = i27 * i27;
        int i29 = -(2097353142 * i27);
        int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
        int i31 = -(i27 * 2085335328);
        int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
        int i33 = (i32 ^ (-424918343)) + (((-424918343) & i32) << 1);
        int i34 = i33 >> 26;
        int i35 = ((i34 & ComposerKt.defaultsKey) + (i34 | ComposerKt.defaultsKey)) / 64;
        int i36 = (i33 - (~((i35 ^ 1) + ((i35 & 1) << 1)))) - 1;
        int i37 = i33 >> 25;
        int i38 = ((i37 & (-255)) + (i37 | (-255))) / 128;
        int i39 = (-(i36 ^ (((i38 | 1) << 1) - (i38 ^ 1)))) + 6;
        int i40 = i39 >> 17;
        int i41 = ((((-65535) ^ i40) + ((i40 & (-65535)) << 1)) / 32768) + 1;
        return 0 / ((i39 & (-((i41 & 1) + (i41 | 1)))) * 1926);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TokenDetailsResponse tokenDetailsResponse = this.f1413a;
        if (tokenDetailsResponse != null) {
            CreditCardPaymentModel creditCardPaymentModel = new CreditCardPaymentModel(tokenDetailsResponse.getTokenId(), z);
            creditCardPaymentModel.setFromBankPoint(z2);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -2024183966, new Object[]{this, creditCardPaymentModel}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 2024183966);
            b().paymentUsingCard(b().readAuthenticationToken(), creditCardPaymentModel, new AnonymousClass3());
            return;
        }
        ((getMergedResolutions) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Throwable(this.g.getString(R.string.message_payment_failed)));
        int i3 = cancelAll + 109;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 96 / 0;
        }
    }

    public final boolean TuitionPaymentFragmentbindingInflater1(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        String strB = ((filterResolutionsByAspectRatio) this).TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(str);
        ArrayList<String> banksPointEnabled = b().getBanksPointEnabled();
        if (!(!TextUtils.isEmpty(strB)) || banksPointEnabled == null || !banksPointEnabled.contains(strB) || (!asInterface())) {
            return false;
        }
        int i4 = cancelAll + 31;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        if (!strB.equals(BankType.MANDIRI)) {
            return false;
        }
        int i6 = cancelAll + 45;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public final boolean asInterface() {
        int i = 2 % 2;
        int i2 = cancelAll + 59;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TransactionRequest transactionRequest = b().getTransactionRequest();
        if (transactionRequest != null) {
            if (TextUtils.isEmpty(transactionRequest.getCardClickType())) {
                if (b().getCreditCard().isSecure()) {
                    return true;
                }
            } else if (transactionRequest.isSecureCard()) {
                int i4 = cancelAll + 99;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        return b().getCreditCard().isSecure();
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CreditCardPaymentModel creditCardPaymentModel) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -2024183966, new Object[]{this, creditCardPaymentModel}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 2024183966);
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault3(AsikDataStore$$ExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 507152445, new Object[]{this, str}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -507152444)).booleanValue();
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
    private static java.lang.String $$g(short r6, byte r7, int r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r7 = 1 - r7
            byte[] r0 = defpackage.toRational.$$c
            int r8 = r8 * 56
            int r8 = r8 + 66
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r8 = r7
            r5 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r6]
        L27:
            int r6 = r6 + 1
            int r8 = r8 + r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.toRational.$$g(short, byte, int):java.lang.String");
    }
}
