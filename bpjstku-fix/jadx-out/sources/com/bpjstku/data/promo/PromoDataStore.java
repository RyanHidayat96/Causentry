package com.bpjstku.data.promo;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.promo.model.request.DetailMerchantRequest;
import com.bpjstku.data.promo.model.request.DetailVoucherRequest;
import com.bpjstku.data.promo.model.request.FlagDeeplinkRequest;
import com.bpjstku.data.promo.model.request.MerchantRequest;
import com.bpjstku.data.promo.model.request.RedeemRequest;
import com.bpjstku.data.promo.model.request.VoucherRequest;
import com.bpjstku.data.promo.model.response.CategoryItem;
import com.bpjstku.data.promo.model.response.CategoryMerchantResponse;
import com.bpjstku.data.promo.model.response.DetailMerchantItem;
import com.bpjstku.data.promo.model.response.DetailMerchantResponse;
import com.bpjstku.data.promo.model.response.ListMerchantItem;
import com.bpjstku.data.promo.model.response.ListMerchantResponse;
import com.bpjstku.data.promo.model.response.ProvinceItem;
import com.bpjstku.data.promo.model.response.ProvinceMerchantResponse;
import com.bpjstku.data.promo.model.response.RedeemResponse;
import com.bpjstku.data.promo.model.response.VoucherList;
import com.bpjstku.data.promo.model.response.VoucherResponse;
import com.bpjstku.data.promo.remote.PromoApi;
import com.google.android.gms.common.api.internal.zaaq;
import defpackage.Api23Impl;
import defpackage.deInitSession;
import defpackage.deriveCodec;
import defpackage.getRealtimeCaptureLatency;
import defpackage.getServiceInfo;
import defpackage.initSession;
import defpackage.mergeChildrenConfigs;
import defpackage.onCaptureSessionEnd;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.share;
import defpackage.unbind;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0003\u001a\u00020\bH\u0017¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\t2\u0006\u0010\u0003\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000f\u0010\rJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\n0\t2\u0006\u0010\u0003\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\n0\t2\u0006\u0010\u0003\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\t2\u0006\u0010\u0003\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\u0006\u0010\u0003\u001a\u00020 H\u0017¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\t2\u0006\u0010\u0003\u001a\u00020#H\u0017¢\u0006\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010*\u001a\u0004\u0018\u00010)8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101"}, d2 = {"Lcom/bpjstku/data/promo/PromoDataStore;", "Lcom/bpjstku/data/promo/PromoRepository;", "Lcom/bpjstku/data/promo/remote/PromoApi;", "p0", "Lcom/bpjstku/data/lib/PreferenceManager;", "p1", "<init>", "(Lcom/bpjstku/data/promo/remote/PromoApi;Lcom/bpjstku/data/lib/PreferenceManager;)V", "Lcom/bpjstku/data/lib/model/BaseRequest;", "LderiveCodec;", "", "Lcom/bpjstku/data/promo/model/response/CategoryItem;", "getCategoryMerchant", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/response/ProvinceItem;", "getProvinceMerchant", "Lcom/bpjstku/data/promo/model/request/DetailMerchantRequest;", "Lcom/bpjstku/data/promo/model/response/DetailMerchantItem;", "getDetailMerchant", "(Lcom/bpjstku/data/promo/model/request/DetailMerchantRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/request/MerchantRequest;", "Lcom/bpjstku/data/promo/model/response/ListMerchantItem;", "getListMerchant", "(Lcom/bpjstku/data/promo/model/request/MerchantRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/request/VoucherRequest;", "Lcom/bpjstku/data/promo/model/response/VoucherList;", "getListVoucher", "(Lcom/bpjstku/data/promo/model/request/VoucherRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/request/RedeemRequest;", "Lcom/bpjstku/data/promo/model/response/RedeemResponse;", "getVoucherCode", "(Lcom/bpjstku/data/promo/model/request/RedeemRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/request/DetailVoucherRequest;", "getDetailVoucher", "(Lcom/bpjstku/data/promo/model/request/DetailVoucherRequest;)LderiveCodec;", "Lcom/bpjstku/data/promo/model/request/FlagDeeplinkRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "updateFlagAksesDeeplink", "(Lcom/bpjstku/data/promo/model/request/FlagDeeplinkRequest;)LderiveCodec;", "preferenceManager", "Lcom/bpjstku/data/lib/PreferenceManager;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;", "webService", "Lcom/bpjstku/data/promo/remote/PromoApi;", "getWebService", "()Lcom/bpjstku/data/promo/remote/PromoApi;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PromoDataStore implements PromoRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final PreferenceManager preferenceManager;
    private final PromoApi webService;

    public PromoDataStore(PromoApi promoApi, PreferenceManager preferenceManager) {
        Intrinsics.checkNotNullParameter(promoApi, "");
        Intrinsics.checkNotNullParameter(preferenceManager, "");
        this.preferenceManager = preferenceManager;
        this.webService = promoApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7700getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    @Override // com.bpjstku.data.promo.PromoRepository
    public final deriveCodec<List<CategoryItem>> getCategoryMerchant(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<CategoryMerchantResponse>> categoryMerchant = m7701getWebService().getCategoryMerchant(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(categoryMerchant, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.promo.PromoDataStore$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PromoDataStore.getCategoryMerchant$lambda$0((CategoryMerchantResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.promo.PromoDataStore$$ExternalSyntheticLambda15
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PromoDataStore.getCategoryMerchant$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getCategoryMerchant$lambda$0(CategoryMerchantResponse categoryMerchantResponse) {
        Intrinsics.checkNotNullParameter(categoryMerchantResponse, "");
        return categoryMerchantResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getCategoryMerchant$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.promo.PromoRepository
    public final deriveCodec<List<ProvinceItem>> getProvinceMerchant(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ProvinceMerchantResponse>> provinceMerchant = m7701getWebService().getProvinceMerchant(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(provinceMerchant, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.promo.PromoDataStore$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PromoDataStore.getProvinceMerchant$lambda$2((ProvinceMerchantResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.promo.PromoDataStore$$ExternalSyntheticLambda13
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PromoDataStore.getProvinceMerchant$lambda$3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getProvinceMerchant$lambda$2(ProvinceMerchantResponse provinceMerchantResponse) {
        Intrinsics.checkNotNullParameter(provinceMerchantResponse, "");
        return provinceMerchantResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getProvinceMerchant$lambda$3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.promo.PromoRepository
    public final deriveCodec<DetailMerchantItem> getDetailMerchant(DetailMerchantRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<DetailMerchantResponse>> detailMerchant = m7701getWebService().getDetailMerchant(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(detailMerchant, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.promo.PromoDataStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PromoDataStore.getDetailMerchant$lambda$4((DetailMerchantResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.promo.PromoDataStore$$ExternalSyntheticLambda4
            private static final byte[] $$a = {19, 78, 114, 113};
            private static final int $$b = 158;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int g = 0;
            private static int asBinder = 1;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 33717;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 54695;
            private static char b = 36858;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 31955;
            private static char[] TuitionPaymentFragmentbindingInflater1 = {60047, 60052, 60058, 60088, 60059, 60040, 60056, 60057, 60048, 60062, 60049, 60086, 60050, 60085, 60107, 60117, 59747, 60055, 59746, 59744, 60082, 60051, 60041, 60075, 60043, 59745, 60110, 60046, 60054, 60067, 60053, 60061, 60035, 60063, 60072, 60060};
            private static char asInterface = 57191;

            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                int i = 2 % 2;
                int i2 = asBinder + 93;
                g = i2 % 128;
                int i3 = i2 % 2;
                DetailMerchantItem detailMerchant$lambda$5 = PromoDataStore.getDetailMerchant$lambda$5(function1, obj);
                if (i3 != 0) {
                    int i4 = 5 / 0;
                }
                return detailMerchant$lambda$5;
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
                char[] cArr2 = new char[cArr.length - 2];
                oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
                char[] cArr3 = new char[2];
                int i3 = $11 + 41;
                $10 = i3 % 128;
                while (true) {
                    int i4 = i3 % 2;
                    char c = 0;
                    if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                        objArr[0] = new String(cArr2, 0, i);
                        return;
                    }
                    int i5 = $10 + 111;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    char c2 = 1;
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    int i7 = 58224;
                    int i8 = 0;
                    while (i8 < 16) {
                        int i9 = $11 + 117;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        char c3 = cArr3[c2];
                        char c4 = cArr3[c];
                        int i11 = i8;
                        int i12 = (c4 + i7) ^ ((c4 << 4) + ((char) (((long) b) ^ 8611973335120459638L)));
                        int i13 = c4 >>> 5;
                        try {
                            Object[] objArr2 = new Object[4];
                            objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            objArr2[2] = Integer.valueOf(i13);
                            objArr2[c2] = Integer.valueOf(i12);
                            objArr2[0] = Integer.valueOf(c3);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 47773);
                                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 468;
                                int iCombineMeasuredStates = 13 - View.combineMeasuredStates(0, 0);
                                Class[] clsArr = new Class[4];
                                clsArr[0] = Integer.TYPE;
                                clsArr[c2] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, maximumDrawingCacheSize, iCombineMeasuredStates, -2007001706, false, "o", clsArr);
                            }
                            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            cArr3[c2] = cCharValue;
                            Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 47774), 468 - TextUtils.getOffsetBefore("", 0), 13 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            i7 -= 40503;
                            i8 = i11 + 1;
                            int i14 = $10 + 105;
                            $11 = i14 % 128;
                            int i15 = i14 % 2;
                            c2 = 1;
                            c = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
                    Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2324, 44 - View.resolveSizeAndState(0, 0, 0), -1312321721, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    i3 = $10 + 31;
                    $11 = i3 % 128;
                }
            }

            /* JADX WARN: Code duplicated, block: B:38:0x0130  */
            /* JADX WARN: Code duplicated, block: B:39:0x0148  */
            /* JADX WARN: Code duplicated, block: B:42:0x0191 A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:7:0x001e, B:9:0x002c, B:10:0x0061, B:40:0x014a, B:42:0x0191, B:44:0x0208, B:48:0x021d, B:50:0x0257, B:51:0x02ba), top: B:72:0x001e }] */
            /* JADX WARN: Code duplicated, block: B:43:0x0206  */
            /* JADX WARN: Code duplicated, block: B:47:0x021b  */
            /* JADX WARN: Code duplicated, block: B:50:0x0257 A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:7:0x001e, B:9:0x002c, B:10:0x0061, B:40:0x014a, B:42:0x0191, B:44:0x0208, B:48:0x021d, B:50:0x0257, B:51:0x02ba), top: B:72:0x001e }] */
            /* JADX WARN: Code duplicated, block: B:53:0x02db  */
            /* JADX WARN: Code duplicated, block: B:55:0x02e2  */
            /* JADX WARN: Code duplicated, block: B:56:0x0314  */
            private static void c(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
                int i2;
                Object obj;
                Object[] objArr2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i3 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
                long j = 0;
                Object obj2 = null;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i4 = 0;
                    while (i4 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = (byte) (b3 + 5);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) - 1), 2267 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), 33 - View.resolveSize(0, 0), -1927765101, false, $$c(b3, b4, (byte) (b4 - 5)), new Class[]{Integer.TYPE});
                            }
                            cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                            i4++;
                            j = 0;
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
                    Object[] objArr4 = {Integer.valueOf(asInterface)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 2267, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 33, -1927765101, false, $$c(b5, b6, (byte) (b6 - 5)), new Class[]{Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
                    char[] cArr4 = new char[i];
                    if (i % 2 != 0) {
                        int i5 = $10 + 17;
                        $11 = i5 % 128;
                        if (i5 % 2 == 0) {
                            i2 = i + 17;
                            cArr4[i2] = (char) (cArr[i2] + b2);
                        } else {
                            i2 = i - 1;
                            cArr4[i2] = (char) (cArr[i2] - b2);
                        }
                    } else {
                        i2 = i;
                    }
                    if (i2 > 1) {
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                        int i6 = $11 + 95;
                        $10 = i6 % 128;
                        int i7 = 2;
                        int i8 = i6 % 2;
                        while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                            int i9 = $10 + 7;
                            $11 = i9 % 128;
                            if (i9 % i7 == 0) {
                                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                    obj = obj2;
                                } else {
                                    objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        byte b7 = (byte) 0;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49266 - ExpandableListView.getPackedPositionChild(0L)), 3261 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 30 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -127612708, false, $$c(b7, (byte) (b7 | 6), b7), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                    }
                                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            byte b8 = (byte) 0;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.normalizeMetaState(0) + 22878), 594 - View.getDefaultSize(0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16, 1570859318, false, $$c(b8, (byte) (b8 | 8), b8), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                        }
                                        obj = null;
                                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                                        int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i10];
                                    } else {
                                        obj = null;
                                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                            int i11 = $11 + 65;
                                            $10 = i11 % 128;
                                            int i12 = i11 % 2;
                                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                            int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                            int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i13];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                                        } else {
                                            int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                                        }
                                    }
                                }
                            } else {
                                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                    obj = obj2;
                                } else {
                                    objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        byte b9 = (byte) 0;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49266 - ExpandableListView.getPackedPositionChild(0L)), 3261 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 30 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -127612708, false, $$c(b9, (byte) (b9 | 6), b9), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                    }
                                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                        Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            byte b10 = (byte) 0;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.normalizeMetaState(0) + 22878), 594 - View.getDefaultSize(0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16, 1570859318, false, $$c(b10, (byte) (b10 | 8), b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                        }
                                        obj = null;
                                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                                        int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                                    } else {
                                        obj = null;
                                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                            int i18 = $11 + 65;
                                            $10 = i18 % 128;
                                            int i19 = i18 % 2;
                                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                            int i110 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                            int i111 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i110];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i111];
                                        } else {
                                            int i112 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                            int i113 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i112];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i113];
                                        }
                                    }
                                }
                            }
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                            obj2 = obj;
                            i7 = 2;
                        }
                    }
                    int i20 = 0;
                    while (i20 < i) {
                        int i21 = $11;
                        int i22 = i21 + 7;
                        $10 = i22 % 128;
                        int i23 = i22 % 2;
                        cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                        i20++;
                        int i24 = i21 + 55;
                        $10 = i24 % 128;
                        int i25 = i24 % 2;
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

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.reflect.Method] */
            /* JADX WARN: Type inference failed for: r1v32 */
            /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.Class[]] */
            /* JADX WARN: Type inference failed for: r3v28 */
            /* JADX WARN: Type inference failed for: r4v0 */
            /* JADX WARN: Type inference failed for: r4v1 */
            /* JADX WARN: Type inference failed for: r4v107, types: [int] */
            /* JADX WARN: Type inference failed for: r4v140 */
            /* JADX WARN: Type inference failed for: r4v166, types: [java.lang.Class] */
            /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v171 */
            /* JADX WARN: Type inference failed for: r4v172 */
            /* JADX WARN: Type inference failed for: r4v173 */
            /* JADX WARN: Type inference failed for: r4v174 */
            /* JADX WARN: Type inference failed for: r4v175 */
            /* JADX WARN: Type inference failed for: r4v176 */
            /* JADX WARN: Type inference failed for: r4v2, types: [int] */
            /* JADX WARN: Type inference failed for: r4v3 */
            /* JADX WARN: Type inference failed for: r4v69, types: [java.lang.Class<java.lang.String>] */
            /* JADX WARN: Type inference failed for: r4v70 */
            /* JADX WARN: Type inference failed for: r4v90, types: [byte[]] */
            /* JADX WARN: Type inference failed for: r4v93, types: [char[]] */
            /* JADX WARN: Type inference failed for: r4v98 */
            /* JADX WARN: Type inference failed for: r7v6 */
            /* JADX WARN: Type inference failed for: r8v2 */
            /* JADX WARN: Type inference failed for: r9v72, types: [java.lang.Class] */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, int i, int i2) {
                int i3;
                Object objInvoke;
                int i4;
                int i5;
                int i6;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i7;
                int i8 = i2;
                ?? scrollBarFadeDuration = 2;
                scrollBarFadeDuration = 2;
                scrollBarFadeDuration = 2;
                scrollBarFadeDuration = 2;
                scrollBarFadeDuration = 2;
                int i9 = 2 % 2;
                if (context != null) {
                    try {
                        Object[] objArr = new Object[1];
                        a(new char[]{32827, 43206, 40189, 2600, 30456, 65100, 15253, 62204, 54100, 4133, 50730, 45102, 3441, 41295, 36594, 19062, 48530, 9278, 52644, 23300, 33708, 24106, 41823, 30813, 32030, 23938, 396, 27060, 3058, 28599, 38442, 21912, 58103, 51630}, 30 - (~ExpandableListView.getPackedPositionType(0L)), objArr);
                        try {
                            try {
                                Object[] objArr2 = {(String) objArr[0]};
                                char[] cArr = {23189, 37100, 34278, 16766, 28150, 40041, 30747, 34325, 30109, 3372, 45976, 37933, 32039, 60441, 38724, 13114, 51046, 4797, 42325, 26917, 18920, 35812, 44753, 38079, 37132, 11803, 41517, 25937, 24076, 52356, 55195, 64004, 3549, 5966, 7737, 19647, 22576, 34394, 4634, 51741};
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0');
                                int i10 = g + 69;
                                asBinder = i10 % 128;
                                int i11 = i10 % 2;
                                int i12 = -(-iLastIndexOf);
                                int i13 = (39 & i12) + (i12 | 39);
                                Object[] objArr3 = new Object[1];
                                a(cArr, i13, objArr3);
                                Object objNewInstance = Class.forName((String) objArr3[0]).getDeclaredConstructor(String.class).newInstance(objArr2);
                                char[] cArr2 = {31653, 38193, 41317, 31727, 24223, 27206, 55746, 18164, 33519, 22928, 27490, 20097, 56832, 37472, 61063, 11226, 2417, 22287, 28224, 54594, 55702, 43154, 9590, 44032, 33646, 57683, 20275, 4593, 53973, 56401, 18855, 27539, 9877, 44918};
                                int i14 = -View.resolveSize(0, 0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i15 = i14 * 399;
                                int i16 = ((i15 | 12369) << 1) - (i15 ^ 12369);
                                int i17 = ~i14;
                                int i18 = ~((i17 & 31) | (i17 ^ 31));
                                int i19 = (~((-32) | i14)) | i18;
                                int i20 = ~((-32) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                int i21 = -(-(((i19 ^ i20) | (i19 & i20)) * 398));
                                int i22 = (i16 ^ i21) + ((i21 & i16) << 1);
                                int i23 = ((i14 ^ 31) | (i14 & 31)) * (-1194);
                                int i24 = (i22 & i23) + (i23 | i22);
                                int i25 = asBinder;
                                int i26 = ((i25 | 13) << 1) - (i25 ^ 13);
                                g = i26 % 128;
                                int i27 = i26 % 2;
                                int i28 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i29 = ~((i28 & (-32)) | ((-32) ^ i28));
                                int i30 = (i29 & i18) | (i29 ^ i18);
                                int i31 = ~(((-32) ^ i14) | (i14 & (-32)));
                                int i32 = -(-(((i30 & i31) | (i30 ^ i31)) * 398));
                                int i33 = (i24 ^ i32) + ((i32 & i24) << 1);
                                Object[] objArr4 = new Object[1];
                                a(cArr2, i33, objArr4);
                                String str = (String) objArr4[0];
                                int i34 = asBinder;
                                int i35 = ((i34 | 97) << 1) - (i34 ^ 97);
                                g = i35 % 128;
                                int i36 = i35 % 2;
                                try {
                                    Object[] objArr5 = new Object[1];
                                    a(new char[]{23189, 37100, 34278, 16766, 28150, 40041, 30747, 34325, 30109, 3372, 45976, 37933, 32039, 60441, 38724, 13114, 51046, 4797, 42325, 26917, 18920, 35812, 44753, 38079, 37132, 11803, 41517, 25937, 24076, 52356, 55195, 64004, 3549, 5966, 7737, 19647, 22576, 34394, 4634, 51741}, 38 - (~(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))), objArr5);
                                    Object objNewInstance2 = Class.forName((String) objArr5[0]).getDeclaredConstructor(String.class).newInstance(str);
                                    try {
                                        int trimmedLength = TextUtils.getTrimmedLength("");
                                        int i37 = trimmedLength * 375;
                                        int i38 = (i37 ^ (-17181)) + ((i37 & (-17181)) << 1);
                                        int i39 = ~trimmedLength;
                                        int i40 = ~((i39 ^ 23) | (i39 & 23));
                                        int i41 = ~i;
                                        int i42 = (i38 - (~(-(-((i40 | (~((i41 ^ trimmedLength) | (i41 & trimmedLength)))) * (-374)))))) - 1;
                                        int i43 = (~(((-24) ^ trimmedLength) | ((-24) & trimmedLength))) * 748;
                                        int i44 = (i42 ^ i43) + ((i42 & i43) << 1);
                                        int i45 = ~((i39 & (-24)) | (i39 ^ (-24)));
                                        int i46 = ~i;
                                        int i47 = -(-(((~((i46 ^ trimmedLength) | (trimmedLength & i46))) | i45) * 374));
                                        int i48 = (i44 & i47) + (i47 | i44);
                                        char[] cArr3 = {0, ' ', Typography.quote, 21, 0, '\r', 3, 21, 7, 0, 0, 6, 6, '!', 3, '\f', 4, 2, 0, 6, '\b', '!', 13830};
                                        int i49 = -TextUtils.indexOf("", "", 0);
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        int i50 = i49 * (-711);
                                        int i51 = (i50 & 17112) + (i50 | 17112);
                                        int i52 = ~(((-25) ^ i49) | ((-25) & i49));
                                        int i53 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        int i54 = ~((i53 ^ i49) | (i53 & i49));
                                        int i55 = i51 + (((i52 ^ i54) | (i54 & i52)) * (-712));
                                        int i56 = ((-25) ^ i53) | ((-25) & i53);
                                        int i57 = (i49 ^ 24) | (i49 & 24);
                                        byte b2 = (byte) (i55 + (((~((i56 & i49) | (i56 ^ i49))) | (~((i57 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i57 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4)))) * (-712)) + (((~((i53 ^ i49) | (i53 & i49))) | (-25)) * 712));
                                        Object[] objArr6 = new Object[1];
                                        c(i48, cArr3, b2, objArr6);
                                        Class<?> cls = Class.forName((String) objArr6[0]);
                                        char[] cArr4 = {51550, 29564, 9928, 54493, 58342, 57095, 32119, 60775, 54040, 48484, 22504, 61770, 40743, 42007, 19465, 41516, 4652, 56691, 17419, 30872};
                                        int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        int i58 = doubleTapTimeout * 367;
                                        int i59 = (((i58 | 6239) << 1) - (i58 ^ 6239)) + ((doubleTapTimeout | 17) * (-366));
                                        int i60 = ~(((-18) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | ((-18) & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                        int i61 = -(-(((doubleTapTimeout ^ i60) | (i60 & doubleTapTimeout)) * (-366)));
                                        int i62 = (i59 & i61) + (i59 | i61);
                                        int i63 = ~doubleTapTimeout;
                                        int i64 = g;
                                        int i65 = (i64 ^ 61) + ((i64 & 61) << 1);
                                        asBinder = i65 % 128;
                                        if (i65 % 2 == 0) {
                                            int i66 = ~((i63 & 17) | (i63 ^ 17));
                                            int i67 = (doubleTapTimeout & (-18)) | ((-18) ^ doubleTapTimeout);
                                            int i68 = ~((i67 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i67 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                            Object[] objArr7 = new Object[1];
                                            a(cArr4, i62 >>> (366 << ((i68 & i66) | (i66 ^ i68))), objArr7);
                                            i3 = 0;
                                            scrollBarFadeDuration = cls.getMethod((String) objArr7[0], null).invoke(context, null);
                                        } else {
                                            int i69 = (doubleTapTimeout & (-18)) | ((-18) ^ doubleTapTimeout);
                                            int i70 = i62 + (((~((i69 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i69 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) | (~(i63 | 17))) * 366);
                                            Object[] objArr8 = new Object[1];
                                            a(cArr4, i70, objArr8);
                                            i3 = 0;
                                            scrollBarFadeDuration = cls.getMethod((String) objArr8[0], null).invoke(context, null);
                                        }
                                        try {
                                            int i71 = 22 - (~(-View.getDefaultSize(i3, i3)));
                                            char[] cArr5 = {0, ' ', Typography.quote, 21, 0, '\r', 3, 21, 7, 0, 0, 6, 6, '!', 3, '\f', 4, 2, 0, 6, '\b', '!', 13830};
                                            int i72 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                            int i73 = (i72 * 677) - 16200;
                                            int i74 = -(-(((i72 ^ i) | (i72 & i) | (-25)) * (-676)));
                                            int i75 = (i73 ^ i74) + ((i73 & i74) << 1);
                                            int i76 = ~(((-25) ^ i72) | ((-25) & i72));
                                            int i77 = ~(i46 | i72);
                                            int i78 = (i75 - (~(-(-(((i76 ^ i77) | (i76 & i77)) * 676))))) - 1;
                                            int i79 = g;
                                            int i80 = (i79 & 65) + (i79 | 65);
                                            asBinder = i80 % 128;
                                            if (i80 % 2 == 0) {
                                                Object obj = null;
                                                try {
                                                    obj.hashCode();
                                                    throw null;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    Throwable cause = th.getCause();
                                                    if (cause != null) {
                                                        throw cause;
                                                    }
                                                    throw th;
                                                }
                                            }
                                            int i81 = ~i72;
                                            int i82 = (~(((-25) & i46) | ((-25) ^ i46))) | (~((i81 & (-25)) | (i81 ^ (-25))));
                                            int i83 = i72 | 24;
                                            int i84 = ~((i83 & i) | (i83 ^ i));
                                            int i85 = 676 * ((i84 & i82) | (i82 ^ i84));
                                            byte b3 = (byte) (((i78 | i85) << 1) - (i85 ^ i78));
                                            Object[] objArr9 = new Object[1];
                                            c(i71, cArr5, b3, objArr9);
                                            Class<?> cls2 = Class.forName((String) objArr9[0]);
                                            int i86 = g;
                                            int i87 = ((i86 | 123) << 1) - (i86 ^ 123);
                                            asBinder = i87 % 128;
                                            int i88 = i87 % 2;
                                            int longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
                                            int i89 = (longPressTimeout ^ 14) + ((longPressTimeout & 14) << 1);
                                            char[] cArr6 = {'!', 11, 5, 18, 0, '\b', 14, '\b', '!', 11, 14, 1, 27, '\n'};
                                            byte minimumFlingVelocity = (byte) (46 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                            int i90 = asBinder;
                                            int i91 = (i90 & 19) + (i90 | 19);
                                            g = i91 % 128;
                                            if (i91 % 2 != 0) {
                                                Object[] objArr10 = new Object[1];
                                                c(i89, cArr6, minimumFlingVelocity, objArr10);
                                                objInvoke = cls2.getMethod((String) objArr10[0], null).invoke(context, null);
                                                i4 = 95;
                                            } else {
                                                Object[] objArr11 = new Object[1];
                                                c(i89, cArr6, minimumFlingVelocity, objArr11);
                                                objInvoke = cls2.getMethod((String) objArr11[0], null).invoke(context, null);
                                                i4 = 64;
                                            }
                                            int i92 = g;
                                            int i93 = (i92 & 37) + (i92 | 37);
                                            asBinder = i93 % 128;
                                            int i94 = i93 % 2;
                                            try {
                                                Object[] objArr12 = {objInvoke, Integer.valueOf(i4)};
                                                int i95 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                                int i96 = (i95 & 32) + (i95 | 32);
                                                char[] cArr7 = {0, ' ', Typography.quote, 21, 0, '\r', 3, 21, 7, 0, 0, 6, 6, '!', 3, '\f', 25, 29, 17, 21, 0, '\b', 14, '\b', '!', 11, '\b', 5, ' ', 0, '!', 11, 13853};
                                                int i97 = -TextUtils.lastIndexOf("", '0', 0, 0);
                                                int i98 = (i97 * (-523)) + 13676;
                                                int i99 = ~i97;
                                                int i100 = -(-(((~((-53) | i97)) | (~((i99 ^ 52) | (i99 & 52))) | (~(((-53) ^ i) | ((-53) & i)))) * 262));
                                                int i101 = (i98 & i100) + (i100 | i98);
                                                int i102 = -(-((~(((-53) & i97) | ((-53) ^ i97))) * (-786)));
                                                int i103 = ((i101 | i102) << 1) - (i102 ^ i101);
                                                int i104 = ~((-53) | i41);
                                                int i105 = asBinder;
                                                int i106 = (i105 & 91) + (i105 | 91);
                                                g = i106 % 128;
                                                int i107 = i106 % 2;
                                                int i108 = ~i97;
                                                int i109 = ~((i108 & 52) | (i108 ^ 52));
                                                int i110 = (i104 & i109) | (i104 ^ i109);
                                                int i111 = ~(((-53) ^ i97) | ((-53) & i97));
                                                int i112 = -(-(262 * ((i110 & i111) | (i110 ^ i111))));
                                                Object[] objArr13 = new Object[1];
                                                c(i96, cArr7, (byte) (((i103 | i112) << 1) - (i112 ^ i103)), objArr13);
                                                Class<?> cls3 = Class.forName((String) objArr13[0]);
                                                int i113 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                Object[] objArr14 = new Object[1];
                                                c(15 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{'!', 11, 5, 18, 0, '\b', 14, '\b', '!', 11, 18, ' ', 1, 7}, (byte) ((i113 ^ 15) + ((i113 & 15) << 1)), objArr14);
                                                Object objInvoke2 = cls3.getMethod((String) objArr14[0], String.class, Integer.TYPE).invoke(scrollBarFadeDuration, objArr12);
                                                int i114 = -MotionEvent.axisFromString("");
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                int i115 = ~i114;
                                                int i116 = (i115 ^ 29) | (i115 & 29);
                                                int i117 = (((i114 * (-520)) + 15138) - (~((~((i116 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i116 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6))) * 521))) - 1;
                                                int i118 = asBinder + 53;
                                                g = i118 % 128;
                                                int i119 = i118 % 2;
                                                int i120 = i117 + ((-1042) * (~(((-30) ^ i114) | ((-30) & i114))));
                                                int i121 = ~(i114 | (-30));
                                                int i122 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                int i123 = (i122 & i115) | (i115 ^ i122);
                                                int i124 = ~((i123 & 29) | (i123 ^ 29));
                                                Object[] objArr15 = new Object[1];
                                                c((i120 - (~(((i121 & i124) | (i121 ^ i124)) * 521))) - 1, new char[]{0, ' ', Typography.quote, 21, 0, '\r', 3, 21, 7, 0, 0, 6, 6, '!', 3, '\f', 25, 29, 17, 21, 0, '\b', 14, '\b', '!', 11, 18, ' ', 1, 7}, (byte) (54 - KeyEvent.getDeadChar(0, 0)), objArr15);
                                                Class<?> cls4 = Class.forName((String) objArr15[0]);
                                                int i125 = -Drawable.resolveOpacity(0, 0);
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                int i126 = i125 * (-963);
                                                int i127 = (i126 & (-964)) + (i126 | (-964)) + 9650;
                                                int i128 = ~i125;
                                                int i129 = ~((-11) | iTuitionPaymentFragmentspecialinlinedviewModeldefault7);
                                                int i130 = -(-(((i128 ^ i129) | (i128 & i129)) * (-964)));
                                                int i131 = (i127 ^ i130) + ((i130 & i127) << 1);
                                                int i132 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                int i133 = ~((i132 & (-11)) | ((-11) ^ i132));
                                                int i134 = ~(i125 | (-11));
                                                int i135 = -(-(((i134 & i133) | (i133 ^ i134)) * (-964)));
                                                int i136 = (i131 & i135) + (i135 | i131);
                                                char[] cArr8 = {0, 17, 30, 31, 3, 1, 28, 21, 11, 3};
                                                int i137 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                int i138 = (i137 * 236) + 14130;
                                                int i139 = ~i137;
                                                int i140 = -(-(((~((i139 ^ i46) | (i139 & i46))) | 30) * (-235)));
                                                int i141 = (i138 ^ i140) + ((i140 & i138) << 1);
                                                int i142 = g + 107;
                                                asBinder = i142 % 128;
                                                int i143 = i142 % 2;
                                                int i144 = ~((i139 ^ i) | (i139 & i));
                                                int i145 = (i141 - (~(-(-((-470) * ((30 & i144) | (30 ^ i144))))))) - 1;
                                                int i146 = ~((-31) | i137);
                                                int i147 = ~i137;
                                                int i148 = (i147 & 30) | (i147 ^ 30);
                                                Object[] objArr16 = new Object[1];
                                                c(i136, cArr8, (byte) (i145 + (((~((i148 & i) | (i148 ^ i))) | i146) * 235)), objArr16);
                                                Object[] objArr17 = (Object[]) cls4.getField((String) objArr16[0]).get(objInvoke2);
                                                int length = objArr17.length;
                                                int i149 = 0;
                                                while (true) {
                                                    if (i149 < length) {
                                                        Object obj2 = objArr17[i149];
                                                        int i150 = -View.getDefaultSize(0, 0);
                                                        int i151 = (i150 ^ 5) + ((i150 & 5) << 1);
                                                        Object[] objArr18 = new Object[1];
                                                        a(new char[]{1111, 14761, 26192, 2056, 4334, 55905, 50900, 41394}, i151, objArr18);
                                                        try {
                                                            Object[] objArr19 = {(String) objArr18[0]};
                                                            Object[] objArr20 = new Object[1];
                                                            a(new char[]{34961, 8129, 57477, 58989, 4194, 42980, 48097, 7205, 58156, 36701, 18407, 12984, 4836, 52369, 23722, 44936, 27210, 30872, 19973, 24356, 59726, 47586, 55302, 40725, 52008, 62900, 48127, 63692, 35838, 23698, 32330, 29987, 22505, 54722, 60571, 25791, 9473, 17652, 9071, 6621}, 36 - (~TextUtils.getTrimmedLength("")), objArr20);
                                                            ?? cls5 = Class.forName((String) objArr20[0]);
                                                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 11;
                                                            char[] cArr9 = {'!', 11, 2, 18, '#', 0, 1, 3, 0, '\f', 13852};
                                                            int i152 = -TextUtils.getTrimmedLength("");
                                                            Object[] objArr21 = objArr17;
                                                            int i153 = asBinder + 39;
                                                            int i154 = length;
                                                            g = i153 % 128;
                                                            int i155 = i153 % 2;
                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                            int i156 = i152 * 677;
                                                            int i157 = i149;
                                                            int i158 = ((i156 | (-19575)) << 1) - (i156 ^ (-19575));
                                                            int i159 = ((i152 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i152 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (-30)) * (-676);
                                                            int i160 = (i158 ^ i159) + ((i159 & i158) << 1);
                                                            int i161 = ~(((-30) ^ i152) | ((-30) & i152));
                                                            int i162 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                                            int i163 = ~((i162 ^ i152) | (i162 & i152));
                                                            int i164 = (i160 - (~(((i161 ^ i163) | (i161 & i163)) * 676))) - 1;
                                                            int i165 = asBinder;
                                                            int i166 = ((i165 | 119) << 1) - (i165 ^ 119);
                                                            int i167 = i166 % 128;
                                                            g = i167;
                                                            int i168 = i166 % 2;
                                                            int i169 = ~i152;
                                                            int i170 = (~((-30) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault8))) | (~((i169 ^ (-30)) | (i169 & (-30))));
                                                            int i171 = i167 + 19;
                                                            asBinder = i171 % 128;
                                                            int i172 = i171 % 2;
                                                            int i173 = -(-(676 * ((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault8 | i152 | 29)) | i170)));
                                                            try {
                                                                Object[] objArr22 = new Object[1];
                                                                c(iCombineMeasuredStates, cArr9, (byte) (((i164 | i173) << 1) - (i164 ^ i173)), objArr22);
                                                                scrollBarFadeDuration = String.class;
                                                                Object objInvoke3 = cls5.getMethod((String) objArr22[0], new Class[]{scrollBarFadeDuration}).invoke(null, objArr19);
                                                                try {
                                                                    try {
                                                                        int i174 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                        int i175 = i174 * (-300);
                                                                        int i176 = ((((i175 | 8456) << 1) - (i175 ^ 8456)) - (~((~(((i174 ^ 28) | (i174 & 28)) | iTuitionPaymentFragmentspecialinlinedviewModeldefault9)) * (-301)))) - 1;
                                                                        int i177 = ~(((-29) & iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | ((-29) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                                                                        int i178 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                                                        int i179 = ~((i178 & i174) | (i178 ^ i174));
                                                                        int i180 = ((i177 & i179) | (i177 ^ i179)) * (-301);
                                                                        int i181 = (i176 ^ i180) + ((i180 & i176) << 1);
                                                                        int i182 = asBinder + 15;
                                                                        g = i182 % 128;
                                                                        int i183 = i182 % 2;
                                                                        int i184 = ~((~i174) | iTuitionPaymentFragmentspecialinlinedviewModeldefault9);
                                                                        int i185 = (i181 - (~(-(-(301 * ((i184 & (-29)) | ((-29) ^ i184))))))) - 1;
                                                                        char[] cArr10 = {0, ' ', Typography.quote, 21, 0, '\r', 3, 21, 7, 0, 0, 6, 6, '!', 3, '\f', 25, 29, 16, '!', 17, 30, ' ', 0, 3, 24, 21, '\n'};
                                                                        int i186 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                                        Object[] objArr23 = new Object[1];
                                                                        c(i185, cArr10, (byte) ((i186 ^ 47) + ((i186 & 47) << 1)), objArr23);
                                                                        Class<?> cls6 = Class.forName((String) objArr23[0]);
                                                                        int i187 = -(-TextUtils.indexOf((CharSequence) "", '0'));
                                                                        Object[] objArr24 = new Object[1];
                                                                        a(new char[]{52102, 12903, 10853, 22766, 8568, 2484, 63982, 43408, 17628, 11714, 30197, 26587, 9620, 39485}, (i187 & 12) + (i187 | 12), objArr24);
                                                                        scrollBarFadeDuration = (byte[]) cls6.getMethod((String) objArr24[0], null).invoke(obj2, null);
                                                                        try {
                                                                            Object[] objArr25 = {new ByteArrayInputStream(scrollBarFadeDuration)};
                                                                            scrollBarFadeDuration = new char[]{34961, 8129, 57477, 58989, 4194, 42980, 48097, 7205, 58156, 36701, 18407, 12984, 4836, 52369, 23722, 44936, 27210, 30872, 19973, 24356, 59726, 47586, 55302, 40725, 52008, 62900, 48127, 63692, 35838, 23698, 32330, 29987, 22505, 54722, 60571, 25791, 9473, 17652, 9071, 6621};
                                                                            int threadPriority = Process.getThreadPriority(0);
                                                                            int i188 = threadPriority * (-103);
                                                                            int i189 = ((-2060) ^ i188) + ((i188 & (-2060)) << 1);
                                                                            int i190 = ~threadPriority;
                                                                            int i191 = ~((-21) | i190);
                                                                            int i192 = g;
                                                                            int i193 = (i192 & 19) + (i192 | 19);
                                                                            asBinder = i193 % 128;
                                                                            if (i193 % 2 == 0) {
                                                                                int i194 = ~((i190 & i) | (i190 ^ i));
                                                                                i6 = ((i189 - (~(104 / ((i194 & i191) | (i191 ^ i194))))) - 1) * ((-104) / (~(((i46 ^ 20) | (i46 & 20)) | threadPriority)));
                                                                                i5 = 1;
                                                                            } else {
                                                                                int i195 = ~threadPriority;
                                                                                int i196 = ((~((i195 & i) | (i195 ^ i))) | i191) * 104;
                                                                                int i197 = ((i189 | i196) << 1) - (i196 ^ i189);
                                                                                int i198 = i41 | 20;
                                                                                int i199 = (~((i198 & threadPriority) | (i198 ^ threadPriority))) * (-104);
                                                                                int i200 = i197 ^ i199;
                                                                                int i201 = i199 & i197;
                                                                                i5 = 1;
                                                                                i6 = i200 + (i201 << 1);
                                                                            }
                                                                            int i202 = (20 & i) | (20 ^ i);
                                                                            int i203 = 104 * i202;
                                                                            int i204 = 37 - ((((i6 | i203) << i5) - (i203 ^ i6)) >> 6);
                                                                            Object[] objArr26 = new Object[i5];
                                                                            a(scrollBarFadeDuration, i204, objArr26);
                                                                            Class<?> cls7 = Class.forName((String) objArr26[0]);
                                                                            char[] cArr11 = {18500, 58577, 63580, 63743, 3065, 63171, 25909, 50508, 17983, 64979, 63113, 24266, 62854, 63892, 54602, 6767, 61903, 58220, 60569, 37717, 17212, 39191};
                                                                            int i205 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                            int i206 = i205 * (-563);
                                                                            int i207 = ((i206 | 11300) << 1) - (i206 ^ 11300);
                                                                            int i208 = ~i205;
                                                                            int i209 = ~((-21) | i41);
                                                                            int i210 = -(-(((~i202) | (i208 ^ i209) | (i209 & i208)) * (-564)));
                                                                            int i211 = ((i207 | i210) << 1) - (i210 ^ i207);
                                                                            int i212 = (i208 ^ 20) | (i208 & 20);
                                                                            int i213 = (~((i212 & i) | (i212 ^ i))) * 1128;
                                                                            int i214 = (i211 & i213) + (i213 | i211);
                                                                            int i215 = ~((i208 ^ i46) | (i208 & i46));
                                                                            int i216 = ~(i205 | 20);
                                                                            int i217 = (i215 & i216) | (i215 ^ i216);
                                                                            int i218 = g;
                                                                            int i219 = (i218 ^ 113) + ((i218 & 113) << 1);
                                                                            asBinder = i219 % 128;
                                                                            int i220 = i219 % 2;
                                                                            int i221 = 564 * i217;
                                                                            int i222 = (i214 ^ i221) + ((i221 & i214) << 1);
                                                                            Object[] objArr27 = new Object[1];
                                                                            a(cArr11, i222, objArr27);
                                                                            Object objInvoke4 = cls7.getMethod((String) objArr27[0], InputStream.class).invoke(objInvoke3, objArr25);
                                                                            int i223 = g + 85;
                                                                            asBinder = i223 % 128;
                                                                            scrollBarFadeDuration = 2;
                                                                            int i224 = i223 % 2;
                                                                            try {
                                                                                Object[] objArr28 = new Object[1];
                                                                                a(new char[]{29847, 1455, 61600, 33602, 7796, 26706, 33032, 53026, 50757, 15783, 39139, 48039, 10485, 30892, 62682, 21603, 36640, 1160, 42328, 65161, 7286, 12130, 53686, 27762, 61106, 64775, 19680, 62635, 8949, 26239, 16228, 60996, 31547, 47415, 29085, 1668}, 32 - (~(-TextUtils.indexOf((CharSequence) "", '0'))), objArr28);
                                                                                Class<?> cls8 = Class.forName((String) objArr28[0]);
                                                                                scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration();
                                                                                int i225 = scrollBarFadeDuration >> 16;
                                                                                int i226 = asBinder;
                                                                                int i227 = (i226 & 61) + (i226 | 61);
                                                                                g = i227 % 128;
                                                                                if (i227 % 2 != 0) {
                                                                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                                    i7 = ((860 >> i225) - 835) << ((-859) >> (i225 | iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                                                                } else {
                                                                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                                    int i228 = (i225 * 860) - 19734;
                                                                                    int i229 = ((i225 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i225 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2)) * (-859);
                                                                                    i7 = ((i228 | i229) << 1) - (i228 ^ i229);
                                                                                }
                                                                                int i230 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                                                int i231 = ~((i230 & i225) | (i230 ^ i225));
                                                                                int i232 = ~i225;
                                                                                int i233 = ~((i232 & (-24)) | (i232 ^ (-24)) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                                                                int i234 = (i7 - (~(-(-(859 * ((i231 & i233) | (i231 ^ i233))))))) - 1;
                                                                                int i235 = g + 77;
                                                                                asBinder = i235 % 128;
                                                                                int i236 = i235 % 2;
                                                                                int i237 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                                                int i238 = ~((i237 & (-24)) | ((-24) ^ i237));
                                                                                int i239 = ~((i225 & (-24)) | ((-24) ^ i225));
                                                                                int i240 = -(-(859 * ((i239 & i238) | (i238 ^ i239))));
                                                                                int i241 = (i234 ^ i240) + ((i240 & i234) << 1);
                                                                                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                                int i242 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                                                                int i243 = ~(((-50) ^ i242) | ((-50) & i242));
                                                                                int i244 = ~iMakeMeasureSpec;
                                                                                int i245 = ~(i244 | iTuitionPaymentFragmentspecialinlinedviewModeldefault10);
                                                                                int i246 = (((iMakeMeasureSpec * 371) + 18179) - (~(((i243 ^ i245) | (i245 & i243)) * (-370)))) - 1;
                                                                                int i247 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                                                                int i248 = ~((i244 & i247) | (i244 ^ i247));
                                                                                int i249 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault10 & (-50)) | ((-50) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                                                                int i250 = -(-(((i249 & i248) | (i248 ^ i249) | (~((iMakeMeasureSpec ^ 49) | (iMakeMeasureSpec & 49)))) * (-370)));
                                                                                Object[] objArr29 = new Object[1];
                                                                                c(i241, new char[]{'!', 11, 4, 30, 25, '\t', 11, '\n', '\f', 6, 24, 27, 13787, 13787, 18, 23, 18, 0, '\f', 18, 26, 0, 13863}, (byte) (((((i246 | i250) << 1) - (i250 ^ i246)) - (~(-(-((~(iMakeMeasureSpec | 49)) * 370))))) - 1), objArr29);
                                                                                scrollBarFadeDuration = 1;
                                                                                if (!objNewInstance.equals(cls8.getMethod((String) objArr29[0], null).invoke(objInvoke4, null))) {
                                                                                    try {
                                                                                        Object[] objArr30 = new Object[1];
                                                                                        a(new char[]{29847, 1455, 61600, 33602, 7796, 26706, 33032, 53026, 50757, 15783, 39139, 48039, 10485, 30892, 62682, 21603, 36640, 1160, 42328, 65161, 7286, 12130, 53686, 27762, 61106, 64775, 19680, 62635, 8949, 26239, 16228, 60996, 31547, 47415, 29085, 1668}, 33 - (~(-(ViewConfiguration.getTapTimeout() >> 16))), objArr30);
                                                                                        scrollBarFadeDuration = Class.forName((String) objArr30[0]);
                                                                                        int i251 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                                        int i252 = (i251 * (-115)) - 2645;
                                                                                        int i253 = i41 | i251;
                                                                                        int i254 = -(-((~((i253 & 23) | (i253 ^ 23))) * (-116)));
                                                                                        int i255 = (((i252 & i254) + (i252 | i254)) - (~(((i251 ^ i) | (i251 & i)) * 116))) - 1;
                                                                                        int i256 = ~((~i251) | (-24));
                                                                                        int i257 = ~(((-24) & i) | ((-24) ^ i));
                                                                                        int i258 = i256 ^ i257;
                                                                                        Object[] objArr31 = new Object[1];
                                                                                        c((i255 - (~(-(-(((i256 & i257) | i258) * 116))))) - 1, new char[]{'!', 11, 4, 30, 25, '\t', 11, '\n', '\f', 6, 24, 27, 13787, 13787, 18, 23, 18, 0, '\f', 18, 26, 0, 13863}, (byte) (48 - (~TextUtils.indexOf("", "", 0, 0))), objArr31);
                                                                                        if (!objNewInstance2.equals(scrollBarFadeDuration.getMethod((String) objArr31[0], null).invoke(objInvoke4, null))) {
                                                                                            int i259 = (i157 ^ 121) + ((i157 & 121) << 1);
                                                                                            int i260 = g + 17;
                                                                                            asBinder = i260 % 128;
                                                                                            int i261 = i260 % 2;
                                                                                            i149 = ((i259 | (-120)) << 1) - (i259 ^ (-120));
                                                                                            i8 = i2;
                                                                                            length = i154;
                                                                                            objArr17 = objArr21;
                                                                                        }
                                                                                    } catch (Throwable th2) {
                                                                                        Throwable cause2 = th2.getCause();
                                                                                        if (cause2 != null) {
                                                                                            throw cause2;
                                                                                        }
                                                                                        throw th2;
                                                                                    }
                                                                                }
                                                                                int i262 = (~(i & 1)) & (i | 1);
                                                                                Object[] objArr32 = new Object[4];
                                                                                int[] iArr = new int[1];
                                                                                objArr32[0] = iArr;
                                                                                objArr32[1] = new int[1];
                                                                                int i263 = asBinder + 103;
                                                                                g = i263 % 128;
                                                                                int i264 = i263 % 2;
                                                                                objArr32[2] = new int[]{i262};
                                                                                iArr[0] = i;
                                                                                objArr32[3] = null;
                                                                                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                                                                                int i265 = (-319304657) + (((~(startElapsedRealtime | (-441764452))) | 482074680) * 191) + (((~((~startElapsedRealtime) | (-441764452))) | 403750944) * 191);
                                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                                                int i266 = -(-(i265 * 334));
                                                                                int i267 = ((((-10640) | i266) << 1) - (i266 ^ (-10640))) + 5661;
                                                                                int i268 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (-17));
                                                                                int i269 = ~((i265 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (i265 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                                                                                int i270 = -(-(((i268 & i269) | (i268 ^ i269)) * 333));
                                                                                int i271 = ((i267 | i270) << 1) - (i270 ^ i267);
                                                                                int i272 = g;
                                                                                int i273 = ((i272 | 99) << 1) - (i272 ^ 99);
                                                                                int i274 = i273 % 128;
                                                                                asBinder = i274;
                                                                                int i275 = i273 % 2;
                                                                                int i276 = ~(((-17) & iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | ((-17) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                                                                                int i277 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                                                                int i278 = (i2 - (~(-(-(i271 + (333 * ((~((i277 & i265) | (i277 ^ i265))) | i276))))))) - 1;
                                                                                int i279 = i278 ^ (i278 << 13);
                                                                                int i280 = (i274 & 97) + (i274 | 97);
                                                                                int i281 = i280 % 128;
                                                                                g = i281;
                                                                                int i282 = i280 % 2;
                                                                                int i283 = i279 ^ (i279 >>> 17);
                                                                                int i284 = i283 << 5;
                                                                                ((int[]) objArr32[1])[0] = (i283 | i284) & (~(i283 & i284));
                                                                                int i285 = i281 + 91;
                                                                                asBinder = i285 % 128;
                                                                                if (i285 % 2 == 0) {
                                                                                    int i286 = 7 / 0;
                                                                                }
                                                                                return objArr32;
                                                                            } catch (Throwable th3) {
                                                                                Throwable cause3 = th3.getCause();
                                                                                if (cause3 != null) {
                                                                                    throw cause3;
                                                                                }
                                                                                throw th3;
                                                                            }
                                                                        } catch (Throwable th4) {
                                                                            Throwable cause4 = th4.getCause();
                                                                            if (cause4 != null) {
                                                                                throw cause4;
                                                                            }
                                                                            throw th4;
                                                                        }
                                                                    } catch (Throwable th5) {
                                                                        Throwable cause5 = th5.getCause();
                                                                        if (cause5 != null) {
                                                                            throw cause5;
                                                                        }
                                                                        throw th5;
                                                                    }
                                                                } catch (Throwable unused) {
                                                                    scrollBarFadeDuration = i2;
                                                                }
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                Throwable cause6 = th.getCause();
                                                                if (cause6 != null) {
                                                                    throw cause6;
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                        }
                                                    } else {
                                                        scrollBarFadeDuration = i8;
                                                    }
                                                }
                                            } catch (Throwable th8) {
                                                Throwable cause7 = th8.getCause();
                                                if (cause7 != null) {
                                                    throw cause7;
                                                }
                                                throw th8;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                        }
                                    } catch (Throwable th10) {
                                        Throwable cause8 = th10.getCause();
                                        if (cause8 != null) {
                                            throw cause8;
                                        }
                                        throw th10;
                                    }
                                } catch (Throwable th11) {
                                    Throwable cause9 = th11.getCause();
                                    if (cause9 != null) {
                                        throw cause9;
                                    }
                                    throw th11;
                                }
                            } catch (Throwable th12) {
                                Throwable cause10 = th12.getCause();
                                if (cause10 != null) {
                                    throw cause10;
                                }
                                throw th12;
                            }
                        } catch (Throwable unused2) {
                        }
                    } catch (Throwable unused3) {
                    }
                } else {
                    scrollBarFadeDuration = i8;
                }
                Object[] objArr33 = {new int[]{i}, new int[1], new int[]{i}, null};
                int iMyPid = Process.myPid();
                int i287 = 1014397714 + (((~((~iMyPid) | 731667538)) | (-798981752)) * (-245));
                int i288 = ~(iMyPid | 731667538);
                int i289 = i287 + (i288 * (-245)) + ((i288 | 771977767) * 245);
                int i290 = ~(((-1) ^ i289) | i289);
                int i291 = ~(((-1) ^ i) | i);
                int i292 = (i290 & i291) | (i290 ^ i291);
                int i293 = ~((i289 ^ i) | (i289 & i));
                int i294 = (i289 * (-753)) + (((i292 & i293) | (i292 ^ i293)) * (-754));
                int i295 = ~(((-1) ^ i) | i);
                int i296 = ~i;
                int i297 = ~((i296 & i289) | (i296 ^ i289));
                int i298 = ((i297 & i295) | (i295 ^ i297)) * (-754);
                int i299 = (((i294 | i298) << 1) - (i298 ^ i294)) - 754;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i300 = (i299 * (-183)) + (scrollBarFadeDuration * (-183));
                int i301 = ~i299;
                int i302 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                int i303 = (i301 ^ i302) | (i301 & i302);
                int i304 = ~(((i303 & scrollBarFadeDuration) == true ? 1 : 0) | ((i303 ^ scrollBarFadeDuration) == true ? 1 : 0));
                int i305 = ~scrollBarFadeDuration;
                int i306 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | i305;
                int i307 = -(-(((~((i306 & i299) | (i306 ^ i299))) | i304) * (-184)));
                int i308 = (i300 & i307) + (i307 | i300);
                int i309 = ~scrollBarFadeDuration;
                int i310 = ~((i309 & i301) | (i301 ^ i309));
                int i311 = ~(i301 | i302);
                int i312 = (i310 & i311) | (i310 ^ i311);
                int i313 = ~((i305 ^ i302) | (i305 & i302));
                int i314 = -(-(((i312 & i313) | (i312 ^ i313)) * 184));
                int i315 = (((i308 & i314) + (i314 | i308)) - (~(-(-((((i299 ^ scrollBarFadeDuration) == true ? 1 : 0) | ((i299 & scrollBarFadeDuration) == true ? 1 : 0)) * 184))))) - 1;
                int i316 = i315 << 13;
                int i317 = (i316 | i315) & (~(i315 & i316));
                int i318 = i317 ^ (i317 >>> 17);
                int i319 = i318 << 5;
                ((int[]) objArr33[1])[0] = (i318 | i319) & (~(i318 & i319));
                return objArr33;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$c(byte r6, int r7, byte r8) {
                /*
                    byte[] r0 = com.bpjstku.data.promo.PromoDataStore$$ExternalSyntheticLambda4.$$a
                    int r7 = r7 + 108
                    int r6 = r6 * 3
                    int r6 = r6 + 4
                    int r8 = r8 * 4
                    int r1 = 1 - r8
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r8 = 0 - r8
                    if (r0 != 0) goto L17
                    r3 = r7
                    r4 = r2
                    r7 = r6
                    goto L2c
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    if (r3 != r8) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L23:
                    int r3 = r3 + 1
                    r4 = r0[r6]
                    r5 = r7
                    r7 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L2c:
                    int r6 = r6 + r3
                    int r7 = r7 + 1
                    r3 = r4
                    r5 = r7
                    r7 = r6
                    r6 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.promo.PromoDataStore$$ExternalSyntheticLambda4.$$c(byte, int, byte):java.lang.String");
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DetailMerchantItem getDetailMerchant$lambda$4(DetailMerchantResponse detailMerchantResponse) {
        Intrinsics.checkNotNullParameter(detailMerchantResponse, "");
        return detailMerchantResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DetailMerchantItem getDetailMerchant$lambda$5(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (DetailMerchantItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.promo.PromoRepository
    public final deriveCodec<List<ListMerchantItem>> getListMerchant(MerchantRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ListMerchantResponse>> listMerchant = m7701getWebService().getListMerchant(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(listMerchant, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.promo.PromoDataStore$$ExternalSyntheticLambda10
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {49, 89, 41, 48};
            private static final int $$b = 77;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            private static long TuitionPaymentFragmentbindingInflater1 = -5724535031168526820L;

            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(int r6, short r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 * 4
                    int r8 = r8 + 4
                    int r7 = r7 * 2
                    int r0 = 1 - r7
                    int r6 = r6 * 3
                    int r6 = r6 + 98
                    byte[] r1 = com.bpjstku.data.promo.PromoDataStore$$ExternalSyntheticLambda10.$$a
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r7 = 0 - r7
                    if (r1 != 0) goto L19
                    r6 = r7
                    r3 = r8
                    r4 = r2
                    goto L2e
                L19:
                    r3 = r2
                L1a:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r7) goto L29
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L29:
                    r3 = r1[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r5
                L2e:
                    int r6 = r6 + r8
                    int r8 = r3 + 1
                    r3 = r4
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.promo.PromoDataStore$$ExternalSyntheticLambda10.c(int, short, byte, java.lang.Object[]):void");
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                ListMerchantResponse listMerchantResponse = (ListMerchantResponse) obj;
                if (i2 % 2 == 0) {
                    PromoDataStore.getListMerchant$lambda$6(listMerchantResponse);
                    throw null;
                }
                List listMerchant$lambda$6 = PromoDataStore.getListMerchant$lambda$6(listMerchantResponse);
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 34 / 0;
                }
                return listMerchant$lambda$6;
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i3 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.MeasureSpec.getMode(0) + 19472), 2624 - View.combineMeasuredStates(0, 0), View.MeasureSpec.getSize(0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                        try {
                            Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 39421), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 481, TextUtils.getOffsetAfter("", 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                            int i4 = $10 + 33;
                            $11 = i4 % 128;
                            int i5 = i4 % 2;
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
                char[] cArr2 = new char[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    try {
                        Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 39421), TextUtils.getOffsetBefore("", 0) + 481, TextUtils.indexOf((CharSequence) "", '0', 0) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        int i6 = $10 + 101;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                objArr[0] = new String(cArr2);
                int i8 = $10 + 11;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            }

            /* JADX WARN: Code duplicated, block: B:105:0x04fe  */
            /* JADX WARN: Code duplicated, block: B:106:0x0505  */
            /* JADX WARN: Code duplicated, block: B:62:0x03ca A[Catch: Exception -> 0x04e5, TRY_ENTER, TryCatch #4 {Exception -> 0x04e5, blocks: (B:59:0x034a, B:62:0x03ca, B:65:0x03d2, B:67:0x03fd, B:70:0x0413, B:73:0x0449, B:75:0x047a, B:91:0x04ce, B:92:0x04d4, B:94:0x04d6, B:95:0x04dc, B:96:0x04dd, B:98:0x04e1, B:66:0x03dc, B:74:0x0453), top: B:124:0x034a, inners: #2, #5 }] */
            /* JADX WARN: Code duplicated, block: B:64:0x03d0  */
            /* JADX WARN: Code duplicated, block: B:65:0x03d2 A[Catch: Exception -> 0x04e5, TRY_LEAVE, TryCatch #4 {Exception -> 0x04e5, blocks: (B:59:0x034a, B:62:0x03ca, B:65:0x03d2, B:67:0x03fd, B:70:0x0413, B:73:0x0449, B:75:0x047a, B:91:0x04ce, B:92:0x04d4, B:94:0x04d6, B:95:0x04dc, B:96:0x04dd, B:98:0x04e1, B:66:0x03dc, B:74:0x0453), top: B:124:0x034a, inners: #2, #5 }] */
            /* JADX WARN: Code duplicated, block: B:70:0x0413 A[Catch: Exception -> 0x04e5, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x04e5, blocks: (B:59:0x034a, B:62:0x03ca, B:65:0x03d2, B:67:0x03fd, B:70:0x0413, B:73:0x0449, B:75:0x047a, B:91:0x04ce, B:92:0x04d4, B:94:0x04d6, B:95:0x04dc, B:96:0x04dd, B:98:0x04e1, B:66:0x03dc, B:74:0x0453), top: B:124:0x034a, inners: #2, #5 }] */
            /* JADX WARN: Code duplicated, block: B:72:0x0439  */
            /* JADX WARN: Code duplicated, block: B:73:0x0449 A[Catch: Exception -> 0x04e5, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x04e5, blocks: (B:59:0x034a, B:62:0x03ca, B:65:0x03d2, B:67:0x03fd, B:70:0x0413, B:73:0x0449, B:75:0x047a, B:91:0x04ce, B:92:0x04d4, B:94:0x04d6, B:95:0x04dc, B:96:0x04dd, B:98:0x04e1, B:66:0x03dc, B:74:0x0453), top: B:124:0x034a, inners: #2, #5 }] */
            /* JADX WARN: Code duplicated, block: B:78:0x0483  */
            /* JADX WARN: Code duplicated, block: B:80:0x048f  */
            /* JADX WARN: Code duplicated, block: B:82:0x0498  */
            /* JADX WARN: Code duplicated, block: B:83:0x04a0  */
            /* JADX WARN: Code duplicated, block: B:86:0x04bf  */
            /* JADX WARN: Code duplicated, block: B:87:0x04c2  */
            /* JADX WARN: Code duplicated, block: B:89:0x04cb  */
            /* JADX WARN: Code duplicated, block: B:96:0x04dd A[Catch: Exception -> 0x04e5, TRY_LEAVE, TryCatch #4 {Exception -> 0x04e5, blocks: (B:59:0x034a, B:62:0x03ca, B:65:0x03d2, B:67:0x03fd, B:70:0x0413, B:73:0x0449, B:75:0x047a, B:91:0x04ce, B:92:0x04d4, B:94:0x04d6, B:95:0x04dc, B:96:0x04dd, B:98:0x04e1, B:66:0x03dc, B:74:0x0453), top: B:124:0x034a, inners: #2, #5 }] */
            public static Object[] b(int i, int i2) throws Throwable {
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                String line;
                Object[] objArr;
                int i9;
                int[] iArr;
                int i10;
                File file;
                int i11;
                FileReader fileReader;
                BufferedReader bufferedReader;
                boolean zEquals;
                File file2;
                FileReader fileReader2;
                BufferedReader bufferedReader2;
                boolean zEquals2;
                int i12;
                int i13;
                int i14;
                Object obj;
                String str;
                char[] cArr;
                int iResolveSize;
                int i15;
                int i16;
                int i17;
                int i18 = 2 % 2;
                int i19 = 16;
                int i20 = 0;
                try {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{16238, 23429, 63137, 4529, 44193, 51143, 25286, 65015, 6378, 45836, 52782, 26931, 33829, 8020, 47692, 54651, 28771, 35683, 10129}, 25840 - (~(-Color.argb(0, 0, 0, 0))), objArr2);
                    int offsetBefore = TextUtils.getOffsetBefore("", 0);
                    int i21 = (offsetBefore & 25087) + (offsetBefore | 25087);
                    Object[] objArr3 = new Object[1];
                    a(new char[]{16240, 24217, 64656, 6798, 47250, 54930, 29850, 37560, 12432, 20098, 60597, 2711, 43153, 50817, 25746, 33425, 8338, 48794}, i21, objArr3);
                    String[] strArr = {(String) objArr2[0], (String) objArr3[0]};
                    int i22 = 0;
                    while (true) {
                        if (i22 >= 2) {
                            i5 = i;
                            break;
                        }
                        int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i24 = (i23 & 13) + (i23 | 13);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24 % 128;
                        if (i24 % 2 != 0) {
                            str = strArr[i22];
                            cArr = new char[i19];
                            // fill-array-data instruction
                            cArr[0] = 16230;
                            cArr[1] = 16256;
                            cArr[2] = 16049;
                            cArr[3] = 15822;
                            cArr[4] = 15564;
                            cArr[5] = 15331;
                            cArr[6] = 14869;
                            cArr[7] = 14710;
                            cArr[8] = 14368;
                            cArr[9] = 14149;
                            cArr[10] = 13875;
                            cArr[11] = 13632;
                            cArr[12] = 13710;
                            cArr[13] = 13488;
                            cArr[14] = 13260;
                            cArr[15] = 12999;
                            iResolveSize = View.resolveSize(i20, 1);
                            i15 = 18576;
                        } else {
                            str = strArr[i22];
                            cArr = new char[i19];
                            // fill-array-data instruction
                            cArr[0] = 16230;
                            cArr[1] = 16256;
                            cArr[2] = 16049;
                            cArr[3] = 15822;
                            cArr[4] = 15564;
                            cArr[5] = 15331;
                            cArr[6] = 14869;
                            cArr[7] = 14710;
                            cArr[8] = 14368;
                            cArr[9] = 14149;
                            cArr[10] = 13875;
                            cArr[11] = 13632;
                            cArr[12] = 13710;
                            cArr[13] = 13488;
                            cArr[14] = 13260;
                            cArr[15] = 12999;
                            iResolveSize = View.resolveSize(i20, i20);
                            i15 = 233;
                        }
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i25 = iResolveSize * 141;
                        int i26 = i15 * (-279);
                        int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i28 = (i27 ^ 53) + ((i27 & 53) << 1);
                        int i29 = i28 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i29;
                        if (i28 % 2 == 0) {
                            int i30 = i25 * i26;
                            int i31 = 139 - (~(i15 | iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                            i16 = (i30 ^ i31) + ((i31 & i30) << 1);
                        } else {
                            int i32 = ((i25 | i26) << 1) - (i26 ^ i25);
                            int i33 = ((i15 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i15 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1)) * 140;
                            i16 = (i32 & i33) + (i33 | i32);
                        }
                        int i34 = ~iResolveSize;
                        int i35 = ((i29 | 53) << 1) - (i29 ^ 53);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i35 % 128;
                        if (i35 % 2 != 0) {
                            int i36 = ~((i34 & i15) | (i34 ^ i15));
                            int i37 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | i15);
                            i17 = i16 >>> ((-280) / ((i36 ^ i37) | (i36 & i37)));
                        } else {
                            int i38 = ~((i34 & i15) | (i34 ^ i15));
                            int i39 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i40 = ~((i39 ^ i15) | (i39 & i15));
                            int i41 = -(-((-280) * ((i38 ^ i40) | (i38 & i40))));
                            i17 = (i41 | i16) + (i16 & i41);
                        }
                        int i42 = ~i15;
                        int i43 = ~((i42 & iResolveSize) | (i42 ^ iResolveSize));
                        int i44 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i45 = ~((i44 & iResolveSize) | (i44 ^ iResolveSize));
                        int i46 = (i43 & i45) | (i43 ^ i45);
                        int i47 = (~iResolveSize) | i15;
                        int i48 = ~((i47 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i47 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        int i49 = -(-(140 * ((i46 & i48) | (i46 ^ i48))));
                        int i50 = (i17 & i49) + (i17 | i49);
                        Object[] objArr4 = new Object[1];
                        a(cArr, i50, objArr4);
                        Class<?> cls = Class.forName((String) objArr4[0]);
                        if (((Boolean) cls.getMethod(str, new Class[0]).invoke(cls, null)).booleanValue()) {
                            i3 = i & (-2);
                            i4 = (~i) & 1;
                            i5 = i3 | i4;
                            break;
                        }
                        i22++;
                        i19 = 16;
                        i20 = 0;
                    }
                } catch (Exception unused) {
                    i3 = i & (-3);
                    i4 = (~i) & 2;
                }
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cMyPid = (char) (2419 - (Process.myPid() >> 22));
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2845;
                        int i51 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4;
                        byte b = (byte) 0;
                        byte b2 = b;
                        Object[] objArr5 = new Object[1];
                        c(b, b2, b2, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyPid, scrollBarFadeDuration, i51, -501222268, false, (String) objArr5[0], new Class[0]);
                    }
                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                    long j = 539527145;
                    long j2 = 829;
                    long j3 = (j2 * j) + (j2 * jLongValue);
                    long j4 = -828;
                    long j5 = -1;
                    long j6 = ((long) i) ^ j5;
                    long j7 = j3 + (((((j ^ j5) | (jLongValue ^ j5)) ^ j5) | (((j6 | j) | jLongValue) ^ j5)) * j4);
                    long j8 = jLongValue | j;
                    long j9 = j7 + (j4 * (j6 | j8)) + (((long) 828) * (j5 ^ j8)) + ((long) (-1698713831));
                    int i52 = ~i;
                    int i53 = ((int) (j9 >> 32)) & ((-1019427974) + (((~((-294920323) | i52)) | (~((-100641) | i52))) * (-184)) + (((~(1281460601 | i52)) | (-1576380924) | (~(1576280283 | i52))) * 184) + 452968272);
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i54 = ((int) j9) & (465785187 + (((~(1140225506 | elapsedCpuTime)) | 28464578) * (-502)) + ((~((~elapsedCpuTime) | (-268536326))) * (-502)) + (((~(elapsedCpuTime | 297000903)) | 1140225506) * TypedValues.PositionType.TYPE_DRAWPATH));
                    int i55 = (i54 & i53) | (i53 ^ i54);
                    int i56 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i57 = (i56 ^ 17) + ((i56 & 17) << 1);
                    int i58 = i57 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i58;
                    if (i57 % 2 == 0) {
                        i6 = (i & (-4)) | (i52 & 3);
                        int i59 = -i55;
                        i7 = ((i55 & i59) | (i55 ^ i59)) >> 91;
                    } else {
                        i6 = (i & (-11)) | (i52 & 10);
                        int i60 = i55 ^ 1;
                        int i61 = -i60;
                        i7 = ((i60 & i61) | (i60 ^ i61)) >> 31;
                    }
                    int i62 = ((i58 | 93) << 1) - (i58 ^ 93);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i62 % 128;
                    int i63 = i62 % 2;
                    int i64 = (~i7) & i6;
                    int i65 = i7 & i;
                    int i66 = (i65 & i64) | (i64 ^ i65);
                    if (i63 != 0) {
                        i8 = (~(i & i5)) & (i | i5);
                        int i67 = 63 / 0;
                    } else {
                        i8 = ((~i5) & i) | (i5 & i52);
                    }
                    int i68 = (i8 | (-i8)) >> 31;
                    int i69 = i66 & (~i68);
                    int i70 = i5 & i68;
                    int i71 = (i69 ^ i70) | (i70 & i69);
                    try {
                        int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                        int i72 = (keyRepeatTimeout * 628) - (-26403004);
                        int i73 = (i ^ 42043) | (i & 42043);
                        int i74 = ~keyRepeatTimeout;
                        int i75 = ((i73 ^ i74) | (i73 & i74)) * (-627);
                        int i76 = (i72 & i75) + (i72 | i75);
                        int i77 = ~(((-42044) & i) | ((-42044) ^ i));
                        int i78 = ((i77 & keyRepeatTimeout) | (keyRepeatTimeout ^ i77)) * (-627);
                        int i79 = (i76 & i78) + (i78 | i76);
                        int i80 = ((~((keyRepeatTimeout & i) | (keyRepeatTimeout ^ i))) | (~((i52 ^ 42043) | (42043 & i52)))) * 627;
                        int i81 = (i79 & i80) + (i80 | i79);
                        Object[] objArr6 = new Object[1];
                        a(new char[]{16168, 39759, 30472, 54213, 44996, 2635, 58880, 17128, 7857, 63857, 21797, 12705, 36263, 27037, 50271, 40967, 31952, 55491, 45909, 3860, 60410, 18355, 8828, 65060, 23272, 14059, 37530, 27979, 51457, 42458, 392, 56396, 47123, 5315, 61605, 19300, 10026, 33763, 24480, 15240}, i81, objArr6);
                        File file3 = new File((String) objArr6[0]);
                        try {
                            if (file3.canRead()) {
                                FileReader fileReader3 = new FileReader(file3);
                                BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                try {
                                    line = bufferedReader3.readLine();
                                    int i82 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                    int i83 = (i82 & 9533) + (i82 | 9533);
                                    Object[] objArr7 = new Object[1];
                                    a(new char[]{16233, 6741, 29965}, i83, objArr7);
                                    if (!line.equals((String) objArr7[0])) {
                                        int i84 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i85 = (i84 & 117) + (i84 | 117);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i85 % 128;
                                        if (i85 % 2 != 0) {
                                            fileReader3.close();
                                            bufferedReader3.close();
                                            int i86 = 78 / 0;
                                        } else {
                                            fileReader3.close();
                                            bufferedReader3.close();
                                        }
                                    } else {
                                        fileReader3.close();
                                        bufferedReader3.close();
                                        int i87 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i88 = (i87 & 67) + (i87 | 67);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i88 % 128;
                                        int i89 = i88 % 2;
                                    }
                                    int i90 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                    int i91 = i90 * (-1975);
                                    int i92 = (i91 ^ 62680842) + ((i91 & 62680842) << 1);
                                    int i93 = ~i90;
                                    int i94 = ~((i93 ^ 63378) | (i93 & 63378));
                                    int i95 = ((i ^ i94) | (i & i94)) * 988;
                                    int i96 = ((i92 | i95) << 1) - (i92 ^ i95);
                                    int i97 = ~((-63379) | i90);
                                    int i98 = ~((i52 ^ i90) | (i90 & i52));
                                    int i99 = i96 + (((i97 ^ i98) | (i97 & i98)) * (-1976));
                                    int i100 = ~(((-63379) & i) | ((-63379) ^ i));
                                    int i101 = (i100 & i94) | (i94 ^ i100);
                                    int i102 = ~i;
                                    int i103 = ~((i102 & 63378) | (i102 ^ 63378));
                                    int i104 = i99 + (((i101 & i103) | (i101 ^ i103)) * 988);
                                    Object[] objArr8 = new Object[1];
                                    a(new char[]{16168, 51430, 53335, 55771, 57632, 60157, 61970, 64393, 33788, 35633, 38086, 40025, 42425, 44340, 46732, 48660, 17976, 20416, 22337, 24758, 26674, 29057, 30996, 351, 2810, 4672, 7132, 9006, 11447, 13327, 15773}, i104, objArr8);
                                    file = new File((String) objArr8[0]);
                                    int i105 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    i11 = ((i105 | 101) << 1) - (i105 ^ 101);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                                    if (i11 % 2 != 0) {
                                        file.canRead();
                                        throw null;
                                    }
                                    if (!file.canRead()) {
                                        fileReader = new FileReader(file);
                                        bufferedReader = new BufferedReader(fileReader);
                                        try {
                                            String line2 = bufferedReader.readLine();
                                            Object[] objArr9 = new Object[1];
                                            a(new char[]{16182}, (-16717659) - Color.rgb(0, 0, 0), objArr9);
                                            zEquals = line2.equals((String) objArr9[0]);
                                            fileReader.close();
                                            bufferedReader.close();
                                            int i106 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                            int i107 = ((i106 | 53) << 1) - (i106 ^ 53);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i107 % 128;
                                            int i108 = i107 % 2;
                                            if (zEquals) {
                                                Object[] objArr10 = new Object[1];
                                                a(new char[]{16168, 40841, 32388, 56707, 48348, 7069, 64140, 22942, 14465, 38791, 30345, 54775, 46271, 5051, 62131, 20897, 12464, 36837, 28345, 52658, 44194, 2981, 60112, 18898, 10456, 34717, 26305, 50650, 42186, 973, 58056, 16842, 8384, 65477, 24306, 15870}, 41212 - TextUtils.lastIndexOf("", '0', 0, 0), objArr10);
                                                file2 = new File((String) objArr10[0]);
                                                if (file2.canRead()) {
                                                    fileReader2 = new FileReader(file2);
                                                    bufferedReader2 = new BufferedReader(fileReader2);
                                                    try {
                                                        String line3 = bufferedReader2.readLine();
                                                        int i109 = -(-Gravity.getAbsoluteGravity(0, 0));
                                                        int i110 = ((i109 | 59557) << 1) - (i109 ^ 59557);
                                                        Object[] objArr11 = new Object[1];
                                                        a(new char[]{16182}, i110, objArr11);
                                                        zEquals2 = line3.equals((String) objArr11[0]);
                                                        fileReader2.close();
                                                        bufferedReader2.close();
                                                        if (!zEquals2) {
                                                            int i111 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
                                                            i12 = i111 % 128;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12;
                                                            int i112 = i111 % 2;
                                                            if (line != null) {
                                                                i13 = i12 + 67;
                                                                int i113 = i13 % 128;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i113;
                                                                if (i13 % 2 == 0) {
                                                                    objArr = new Object[5];
                                                                    objArr[0] = new int[1];
                                                                } else {
                                                                    objArr = new Object[2];
                                                                    objArr[0] = new int[1];
                                                                }
                                                                int i114 = (i & (-21)) | (i52 & 20);
                                                                String[] strArr2 = {line};
                                                                i14 = ((i113 | 97) << 1) - (i113 ^ 97);
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                                                                if (i14 % 2 != 0) {
                                                                    obj = objArr[0];
                                                                } else {
                                                                    obj = objArr[0];
                                                                }
                                                                ((int[]) obj)[0] = i114;
                                                                objArr[1] = strArr2;
                                                            } else {
                                                                i9 = 2;
                                                            }
                                                        }
                                                        objArr = new Object[i9];
                                                        iArr = new int[1];
                                                        objArr[0] = iArr;
                                                        String[] strArr3 = new String[0];
                                                        int i115 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                        i10 = (i115 & 105) + (i115 | 105);
                                                        int i116 = i10 % 128;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i116;
                                                        if (i10 % 2 != 0) {
                                                            ((int[]) objArr[1])[1] = i;
                                                        } else {
                                                            iArr[0] = i;
                                                        }
                                                        objArr[1] = strArr3;
                                                        int i117 = (i116 ^ 5) + ((i116 & 5) << 1);
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i117 % 128;
                                                        int i118 = i117 % 2;
                                                    } catch (Throwable th) {
                                                        fileReader2.close();
                                                        bufferedReader2.close();
                                                        throw th;
                                                    }
                                                } else {
                                                    int i119 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                    int i120 = (i119 ^ 45) + ((i119 & 45) << 1);
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i120 % 128;
                                                    int i121 = i120 % 2;
                                                }
                                            }
                                            int i122 = ((int[]) objArr[0])[0];
                                            int i123 = (~(i & i71)) & (i | i71);
                                            int i124 = -i123;
                                            int i125 = ((i123 & i124) | (i123 ^ i124)) >> 31;
                                            int i126 = (i125 & i71) | ((~i125) & i122);
                                            String[] strArr4 = (String[]) objArr[1];
                                            Object[] objArr12 = new Object[2];
                                            int i127 = (i122 | i) & (~(i & i122));
                                            int i128 = -i127;
                                            int i129 = (((i127 & i128) | (i127 ^ i128)) >> 31) & 1;
                                            int i130 = -i129;
                                            int i131 = (~(((i130 & i129) | (i129 ^ i130)) >> 31)) & 1;
                                            objArr12[i129] = null;
                                            objArr12[i131] = strArr4;
                                            String[] strArr5 = (String[]) objArr12[0];
                                            int i132 = ((~i126) & i) | (i126 & i52);
                                            int i133 = -i132;
                                            int i134 = (((i132 & i133) | (i132 ^ i133)) >> 31) & 16;
                                            Object[] objArr13 = {new int[]{i}, new int[1], new int[]{i126}, strArr5};
                                            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                                            int i135 = ~iMaxMemory;
                                            int i136 = (-768894332) + (((~((-74457174) | i135)) | (~((-579440523) | iMaxMemory))) * 520);
                                            int i137 = ~(579440522 | i135);
                                            int i138 = ~(iMaxMemory | 619750751);
                                            int i139 = i136 + ((i137 | i138) * (-1040)) + ((i138 | (~(i135 | (-619750752))) | (-653897696)) * 520);
                                            int i140 = ((i134 * (-515)) - (~(i139 * 517))) - 1;
                                            int i141 = ~i139;
                                            int i142 = ~((i141 & i) | (i141 ^ i));
                                            int i143 = ~i;
                                            int i144 = ~((i143 ^ i134) | (i143 & i134));
                                            int i145 = (i142 & i144) | (i142 ^ i144);
                                            int i146 = ~(i52 | i139);
                                            int i147 = i140 + (((i145 & i146) | (i145 ^ i146)) * (-516));
                                            int i148 = ~i134;
                                            int i149 = ~i139;
                                            int i150 = (i149 & i148) | (i148 ^ i149);
                                            int i151 = ~((i150 & i) | (i150 ^ i));
                                            int i152 = ~((i148 & i52) | (i148 ^ i52) | i139);
                                            int i153 = (i147 - (~(((i152 & i151) | (i151 ^ i152)) * 516))) - 1;
                                            int i154 = ~i134;
                                            int i155 = ~((i154 & i139) | (i154 ^ i139));
                                            int i156 = ~((i139 & i52) | (i52 ^ i139));
                                            int i157 = i153 + (((i155 & i156) | (i155 ^ i156)) * 516);
                                            int i158 = i157 * (-515);
                                            int i159 = -(-(i2 * 517));
                                            int i160 = ((i158 | i159) << 1) - (i158 ^ i159);
                                            int i161 = ~((~i2) | i);
                                            int i162 = ~((i52 ^ i157) | (i52 & i157));
                                            int i163 = (i161 & i162) | (i161 ^ i162);
                                            int i164 = ~((i143 ^ i2) | (i143 & i2));
                                            int i165 = -(-(((i163 & i164) | (i163 ^ i164)) * (-516)));
                                            int i166 = ((i160 | i165) << 1) - (i165 ^ i160);
                                            int i167 = ~i157;
                                            int i168 = ~i2;
                                            int i169 = (i167 & i168) | (i167 ^ i168);
                                            int i170 = ~((i & i169) | (i169 ^ i));
                                            int i171 = ~i157;
                                            int i172 = ~(i171 | i143 | i2);
                                            int i173 = ((i170 & i172) | (i170 ^ i172)) * 516;
                                            int i174 = ((i166 | i173) << 1) - (i173 ^ i166);
                                            int i175 = ~(i171 | i2);
                                            int i176 = ~(i143 | i2);
                                            int i177 = i174 + (((i175 & i176) | (i175 ^ i176)) * 516);
                                            int i178 = i177 << 13;
                                            int i179 = (i178 | i177) & (~(i177 & i178));
                                            int i180 = i179 >>> 17;
                                            int i181 = ((~i179) & i180) | ((~i180) & i179);
                                            int i182 = i181 << 5;
                                            ((int[]) objArr13[1])[0] = (i181 | i182) & (~(i181 & i182));
                                            return objArr13;
                                        } catch (Throwable th2) {
                                            fileReader.close();
                                            bufferedReader.close();
                                            throw th2;
                                        }
                                    }
                                    i9 = 2;
                                    objArr = new Object[i9];
                                    iArr = new int[1];
                                    objArr[0] = iArr;
                                    String[] strArr6 = new String[0];
                                    int i1110 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    i10 = (i1110 & 105) + (i1110 | 105);
                                    int i1111 = i10 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1111;
                                    if (i10 % 2 != 0) {
                                        ((int[]) objArr[1])[1] = i;
                                    } else {
                                        iArr[0] = i;
                                    }
                                    objArr[1] = strArr6;
                                    int i1112 = (i1111 ^ 5) + ((i1111 & 5) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1112 % 128;
                                    int i1113 = i1112 % 2;
                                    int i1210 = ((int[]) objArr[0])[0];
                                    int i1211 = (~(i & i71)) & (i | i71);
                                    int i1212 = -i1211;
                                    int i1213 = ((i1211 & i1212) | (i1211 ^ i1212)) >> 31;
                                    int i1214 = (i1213 & i71) | ((~i1213) & i1210);
                                    String[] strArr7 = (String[]) objArr[1];
                                    Object[] objArr14 = new Object[2];
                                    int i1215 = (i1210 | i) & (~(i & i1210));
                                    int i1216 = -i1215;
                                    int i1217 = (((i1215 & i1216) | (i1215 ^ i1216)) >> 31) & 1;
                                    int i1310 = -i1217;
                                    int i1311 = (~(((i1310 & i1217) | (i1217 ^ i1310)) >> 31)) & 1;
                                    objArr14[i1217] = null;
                                    objArr14[i1311] = strArr7;
                                    String[] strArr8 = (String[]) objArr14[0];
                                    int i1312 = ((~i1214) & i) | (i1214 & i52);
                                    int i1313 = -i1312;
                                    int i1314 = (((i1312 & i1313) | (i1312 ^ i1313)) >> 31) & 16;
                                    Object[] objArr15 = {new int[]{i}, new int[1], new int[]{i1214}, strArr8};
                                    int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
                                    int i1315 = ~iMaxMemory2;
                                    int i1316 = (-768894332) + (((~((-74457174) | i1315)) | (~((-579440523) | iMaxMemory2))) * 520);
                                    int i1317 = ~(579440522 | i1315);
                                    int i1318 = ~(iMaxMemory2 | 619750751);
                                    int i1319 = i1316 + ((i1317 | i1318) * (-1040)) + ((i1318 | (~(i1315 | (-619750752))) | (-653897696)) * 520);
                                    int i1410 = ((i1314 * (-515)) - (~(i1319 * 517))) - 1;
                                    int i1411 = ~i1319;
                                    int i1412 = ~((i1411 & i) | (i1411 ^ i));
                                    int i1413 = ~i;
                                    int i1414 = ~((i1413 ^ i1314) | (i1413 & i1314));
                                    int i1415 = (i1412 & i1414) | (i1412 ^ i1414);
                                    int i1416 = ~(i52 | i1319);
                                    int i1417 = i1410 + (((i1415 & i1416) | (i1415 ^ i1416)) * (-516));
                                    int i1418 = ~i1314;
                                    int i1419 = ~i1319;
                                    int i1510 = (i1419 & i1418) | (i1418 ^ i1419);
                                    int i1511 = ~((i1510 & i) | (i1510 ^ i));
                                    int i1512 = ~((i1418 & i52) | (i1418 ^ i52) | i1319);
                                    int i1513 = (i1417 - (~(((i1512 & i1511) | (i1511 ^ i1512)) * 516))) - 1;
                                    int i1514 = ~i1314;
                                    int i1515 = ~((i1514 & i1319) | (i1514 ^ i1319));
                                    int i1516 = ~((i1319 & i52) | (i52 ^ i1319));
                                    int i1517 = i1513 + (((i1515 & i1516) | (i1515 ^ i1516)) * 516);
                                    int i1518 = i1517 * (-515);
                                    int i1519 = -(-(i2 * 517));
                                    int i1610 = ((i1518 | i1519) << 1) - (i1518 ^ i1519);
                                    int i1611 = ~((~i2) | i);
                                    int i1612 = ~((i52 ^ i1517) | (i52 & i1517));
                                    int i1613 = (i1611 & i1612) | (i1611 ^ i1612);
                                    int i1614 = ~((i1413 ^ i2) | (i1413 & i2));
                                    int i1615 = -(-(((i1613 & i1614) | (i1613 ^ i1614)) * (-516)));
                                    int i1616 = ((i1610 | i1615) << 1) - (i1615 ^ i1610);
                                    int i1617 = ~i1517;
                                    int i1618 = ~i2;
                                    int i1619 = (i1617 & i1618) | (i1617 ^ i1618);
                                    int i1710 = ~((i & i1619) | (i1619 ^ i));
                                    int i1711 = ~i1517;
                                    int i1712 = ~(i1711 | i1413 | i2);
                                    int i1713 = ((i1710 & i1712) | (i1710 ^ i1712)) * 516;
                                    int i1714 = ((i1616 | i1713) << 1) - (i1713 ^ i1616);
                                    int i1715 = ~(i1711 | i2);
                                    int i1716 = ~(i1413 | i2);
                                    int i1717 = i1714 + (((i1715 & i1716) | (i1715 ^ i1716)) * 516);
                                    int i1718 = i1717 << 13;
                                    int i1719 = (i1718 | i1717) & (~(i1717 & i1718));
                                    int i183 = i1719 >>> 17;
                                    int i184 = ((~i1719) & i183) | ((~i183) & i1719);
                                    int i185 = i184 << 5;
                                    ((int[]) objArr15[1])[0] = (i184 | i185) & (~(i184 & i185));
                                    return objArr15;
                                } catch (Throwable th3) {
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    throw th3;
                                }
                            }
                            int i910 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int i911 = i910 * (-1975);
                            int i912 = (i911 ^ 62680842) + ((i911 & 62680842) << 1);
                            int i913 = ~i910;
                            int i914 = ~((i913 ^ 63378) | (i913 & 63378));
                            int i915 = ((i ^ i914) | (i & i914)) * 988;
                            int i916 = ((i912 | i915) << 1) - (i912 ^ i915);
                            int i917 = ~((-63379) | i910);
                            int i918 = ~((i52 ^ i910) | (i910 & i52));
                            int i919 = i916 + (((i917 ^ i918) | (i917 & i918)) * (-1976));
                            int i1010 = ~(((-63379) & i) | ((-63379) ^ i));
                            int i1011 = (i1010 & i914) | (i914 ^ i1010);
                            int i1012 = ~i;
                            int i1013 = ~((i1012 & 63378) | (i1012 ^ 63378));
                            int i1014 = i919 + (((i1011 & i1013) | (i1011 ^ i1013)) * 988);
                            Object[] objArr16 = new Object[1];
                            a(new char[]{16168, 51430, 53335, 55771, 57632, 60157, 61970, 64393, 33788, 35633, 38086, 40025, 42425, 44340, 46732, 48660, 17976, 20416, 22337, 24758, 26674, 29057, 30996, 351, 2810, 4672, 7132, 9006, 11447, 13327, 15773}, i1014, objArr16);
                            file = new File((String) objArr16[0]);
                            int i1015 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            i11 = ((i1015 | 101) << 1) - (i1015 ^ 101);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                            if (i11 % 2 != 0) {
                                file.canRead();
                                throw null;
                            }
                            if (!file.canRead()) {
                                fileReader = new FileReader(file);
                                bufferedReader = new BufferedReader(fileReader);
                                String line4 = bufferedReader.readLine();
                                Object[] objArr17 = new Object[1];
                                a(new char[]{16182}, (-16717659) - Color.rgb(0, 0, 0), objArr17);
                                zEquals = line4.equals((String) objArr17[0]);
                                fileReader.close();
                                bufferedReader.close();
                                int i1016 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i1017 = ((i1016 | 53) << 1) - (i1016 ^ 53);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1017 % 128;
                                int i1018 = i1017 % 2;
                                if (zEquals) {
                                    Object[] objArr18 = new Object[1];
                                    a(new char[]{16168, 40841, 32388, 56707, 48348, 7069, 64140, 22942, 14465, 38791, 30345, 54775, 46271, 5051, 62131, 20897, 12464, 36837, 28345, 52658, 44194, 2981, 60112, 18898, 10456, 34717, 26305, 50650, 42186, 973, 58056, 16842, 8384, 65477, 24306, 15870}, 41212 - TextUtils.lastIndexOf("", '0', 0, 0), objArr18);
                                    file2 = new File((String) objArr18[0]);
                                    if (file2.canRead()) {
                                        int i1114 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                        int i1218 = (i1114 ^ 45) + ((i1114 & 45) << 1);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1218 % 128;
                                        int i1219 = i1218 % 2;
                                    } else {
                                        fileReader2 = new FileReader(file2);
                                        bufferedReader2 = new BufferedReader(fileReader2);
                                        String line5 = bufferedReader2.readLine();
                                        int i1019 = -(-Gravity.getAbsoluteGravity(0, 0));
                                        int i1115 = ((i1019 | 59557) << 1) - (i1019 ^ 59557);
                                        Object[] objArr19 = new Object[1];
                                        a(new char[]{16182}, i1115, objArr19);
                                        zEquals2 = line5.equals((String) objArr19[0]);
                                        fileReader2.close();
                                        bufferedReader2.close();
                                        if (!zEquals2) {
                                            int i1116 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
                                            i12 = i1116 % 128;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12;
                                            int i1117 = i1116 % 2;
                                            if (line != null) {
                                                i13 = i12 + 67;
                                                int i1118 = i13 % 128;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1118;
                                                if (i13 % 2 == 0) {
                                                    objArr = new Object[5];
                                                    objArr[0] = new int[1];
                                                } else {
                                                    objArr = new Object[2];
                                                    objArr[0] = new int[1];
                                                }
                                                int i1119 = (i & (-21)) | (i52 & 20);
                                                String[] strArr9 = {line};
                                                i14 = ((i1118 | 97) << 1) - (i1118 ^ 97);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                                                if (i14 % 2 != 0) {
                                                    obj = objArr[0];
                                                } else {
                                                    obj = objArr[0];
                                                }
                                                ((int[]) obj)[0] = i1119;
                                                objArr[1] = strArr9;
                                            } else {
                                                i9 = 2;
                                            }
                                        }
                                        objArr = new Object[i9];
                                        iArr = new int[1];
                                        objArr[0] = iArr;
                                        String[] strArr10 = new String[0];
                                        int i11110 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        i10 = (i11110 & 105) + (i11110 | 105);
                                        int i11111 = i10 % 128;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11111;
                                        if (i10 % 2 != 0) {
                                            ((int[]) objArr[1])[1] = i;
                                        } else {
                                            iArr[0] = i;
                                        }
                                        objArr[1] = strArr10;
                                        int i11112 = (i11111 ^ 5) + ((i11111 & 5) << 1);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11112 % 128;
                                        int i11113 = i11112 % 2;
                                    }
                                }
                                int i12110 = ((int[]) objArr[0])[0];
                                int i12111 = (~(i & i71)) & (i | i71);
                                int i12112 = -i12111;
                                int i12113 = ((i12111 & i12112) | (i12111 ^ i12112)) >> 31;
                                int i12114 = (i12113 & i71) | ((~i12113) & i12110);
                                String[] strArr11 = (String[]) objArr[1];
                                Object[] objArr110 = new Object[2];
                                int i12115 = (i12110 | i) & (~(i & i12110));
                                int i12116 = -i12115;
                                int i12117 = (((i12115 & i12116) | (i12115 ^ i12116)) >> 31) & 1;
                                int i13110 = -i12117;
                                int i13111 = (~(((i13110 & i12117) | (i12117 ^ i13110)) >> 31)) & 1;
                                objArr110[i12117] = null;
                                objArr110[i13111] = strArr11;
                                String[] strArr12 = (String[]) objArr110[0];
                                int i13112 = ((~i12114) & i) | (i12114 & i52);
                                int i13113 = -i13112;
                                int i13114 = (((i13112 & i13113) | (i13112 ^ i13113)) >> 31) & 16;
                                Object[] objArr111 = {new int[]{i}, new int[1], new int[]{i12114}, strArr12};
                                int iMaxMemory3 = (int) Runtime.getRuntime().maxMemory();
                                int i13115 = ~iMaxMemory3;
                                int i13116 = (-768894332) + (((~((-74457174) | i13115)) | (~((-579440523) | iMaxMemory3))) * 520);
                                int i13117 = ~(579440522 | i13115);
                                int i13118 = ~(iMaxMemory3 | 619750751);
                                int i13119 = i13116 + ((i13117 | i13118) * (-1040)) + ((i13118 | (~(i13115 | (-619750752))) | (-653897696)) * 520);
                                int i14110 = ((i13114 * (-515)) - (~(i13119 * 517))) - 1;
                                int i14111 = ~i13119;
                                int i14112 = ~((i14111 & i) | (i14111 ^ i));
                                int i14113 = ~i;
                                int i14114 = ~((i14113 ^ i13114) | (i14113 & i13114));
                                int i14115 = (i14112 & i14114) | (i14112 ^ i14114);
                                int i14116 = ~(i52 | i13119);
                                int i14117 = i14110 + (((i14115 & i14116) | (i14115 ^ i14116)) * (-516));
                                int i14118 = ~i13114;
                                int i14119 = ~i13119;
                                int i15110 = (i14119 & i14118) | (i14118 ^ i14119);
                                int i15111 = ~((i15110 & i) | (i15110 ^ i));
                                int i15112 = ~((i14118 & i52) | (i14118 ^ i52) | i13119);
                                int i15113 = (i14117 - (~(((i15112 & i15111) | (i15111 ^ i15112)) * 516))) - 1;
                                int i15114 = ~i13114;
                                int i15115 = ~((i15114 & i13119) | (i15114 ^ i13119));
                                int i15116 = ~((i13119 & i52) | (i52 ^ i13119));
                                int i15117 = i15113 + (((i15115 & i15116) | (i15115 ^ i15116)) * 516);
                                int i15118 = i15117 * (-515);
                                int i15119 = -(-(i2 * 517));
                                int i16110 = ((i15118 | i15119) << 1) - (i15118 ^ i15119);
                                int i16111 = ~((~i2) | i);
                                int i16112 = ~((i52 ^ i15117) | (i52 & i15117));
                                int i16113 = (i16111 & i16112) | (i16111 ^ i16112);
                                int i16114 = ~((i14113 ^ i2) | (i14113 & i2));
                                int i16115 = -(-(((i16113 & i16114) | (i16113 ^ i16114)) * (-516)));
                                int i16116 = ((i16110 | i16115) << 1) - (i16115 ^ i16110);
                                int i16117 = ~i15117;
                                int i16118 = ~i2;
                                int i16119 = (i16117 & i16118) | (i16117 ^ i16118);
                                int i17110 = ~((i & i16119) | (i16119 ^ i));
                                int i17111 = ~i15117;
                                int i17112 = ~(i17111 | i14113 | i2);
                                int i17113 = ((i17110 & i17112) | (i17110 ^ i17112)) * 516;
                                int i17114 = ((i16116 | i17113) << 1) - (i17113 ^ i16116);
                                int i17115 = ~(i17111 | i2);
                                int i17116 = ~(i14113 | i2);
                                int i17117 = i17114 + (((i17115 & i17116) | (i17115 ^ i17116)) * 516);
                                int i17118 = i17117 << 13;
                                int i17119 = (i17118 | i17117) & (~(i17117 & i17118));
                                int i186 = i17119 >>> 17;
                                int i187 = ((~i17119) & i186) | ((~i186) & i17119);
                                int i188 = i187 << 5;
                                ((int[]) objArr111[1])[0] = (i187 | i188) & (~(i187 & i188));
                                return objArr111;
                            }
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                    }
                    line = null;
                    i9 = 2;
                    objArr = new Object[i9];
                    iArr = new int[1];
                    objArr[0] = iArr;
                    String[] strArr13 = new String[0];
                    int i11114 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    i10 = (i11114 & 105) + (i11114 | 105);
                    int i11115 = i10 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11115;
                    if (i10 % 2 != 0) {
                        ((int[]) objArr[1])[1] = i;
                    } else {
                        iArr[0] = i;
                    }
                    objArr[1] = strArr13;
                    int i11116 = (i11115 ^ 5) + ((i11115 & 5) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11116 % 128;
                    int i11117 = i11116 % 2;
                    int i12118 = ((int[]) objArr[0])[0];
                    int i12119 = (~(i & i71)) & (i | i71);
                    int i121110 = -i12119;
                    int i121111 = ((i12119 & i121110) | (i12119 ^ i121110)) >> 31;
                    int i121112 = (i121111 & i71) | ((~i121111) & i12118);
                    String[] strArr14 = (String[]) objArr[1];
                    Object[] objArr112 = new Object[2];
                    int i121113 = (i12118 | i) & (~(i & i12118));
                    int i121114 = -i121113;
                    int i121115 = (((i121113 & i121114) | (i121113 ^ i121114)) >> 31) & 1;
                    int i131110 = -i121115;
                    int i131111 = (~(((i131110 & i121115) | (i121115 ^ i131110)) >> 31)) & 1;
                    objArr112[i121115] = null;
                    objArr112[i131111] = strArr14;
                    String[] strArr15 = (String[]) objArr112[0];
                    int i131112 = ((~i121112) & i) | (i121112 & i52);
                    int i131113 = -i131112;
                    int i131114 = (((i131112 & i131113) | (i131112 ^ i131113)) >> 31) & 16;
                    Object[] objArr113 = {new int[]{i}, new int[1], new int[]{i121112}, strArr15};
                    int iMaxMemory4 = (int) Runtime.getRuntime().maxMemory();
                    int i131115 = ~iMaxMemory4;
                    int i131116 = (-768894332) + (((~((-74457174) | i131115)) | (~((-579440523) | iMaxMemory4))) * 520);
                    int i131117 = ~(579440522 | i131115);
                    int i131118 = ~(iMaxMemory4 | 619750751);
                    int i131119 = i131116 + ((i131117 | i131118) * (-1040)) + ((i131118 | (~(i131115 | (-619750752))) | (-653897696)) * 520);
                    int i141110 = ((i131114 * (-515)) - (~(i131119 * 517))) - 1;
                    int i141111 = ~i131119;
                    int i141112 = ~((i141111 & i) | (i141111 ^ i));
                    int i141113 = ~i;
                    int i141114 = ~((i141113 ^ i131114) | (i141113 & i131114));
                    int i141115 = (i141112 & i141114) | (i141112 ^ i141114);
                    int i141116 = ~(i52 | i131119);
                    int i141117 = i141110 + (((i141115 & i141116) | (i141115 ^ i141116)) * (-516));
                    int i141118 = ~i131114;
                    int i141119 = ~i131119;
                    int i151110 = (i141119 & i141118) | (i141118 ^ i141119);
                    int i151111 = ~((i151110 & i) | (i151110 ^ i));
                    int i151112 = ~((i141118 & i52) | (i141118 ^ i52) | i131119);
                    int i151113 = (i141117 - (~(((i151112 & i151111) | (i151111 ^ i151112)) * 516))) - 1;
                    int i151114 = ~i131114;
                    int i151115 = ~((i151114 & i131119) | (i151114 ^ i131119));
                    int i151116 = ~((i131119 & i52) | (i52 ^ i131119));
                    int i151117 = i151113 + (((i151115 & i151116) | (i151115 ^ i151116)) * 516);
                    int i151118 = i151117 * (-515);
                    int i151119 = -(-(i2 * 517));
                    int i161110 = ((i151118 | i151119) << 1) - (i151118 ^ i151119);
                    int i161111 = ~((~i2) | i);
                    int i161112 = ~((i52 ^ i151117) | (i52 & i151117));
                    int i161113 = (i161111 & i161112) | (i161111 ^ i161112);
                    int i161114 = ~((i141113 ^ i2) | (i141113 & i2));
                    int i161115 = -(-(((i161113 & i161114) | (i161113 ^ i161114)) * (-516)));
                    int i161116 = ((i161110 | i161115) << 1) - (i161115 ^ i161110);
                    int i161117 = ~i151117;
                    int i161118 = ~i2;
                    int i161119 = (i161117 & i161118) | (i161117 ^ i161118);
                    int i171110 = ~((i & i161119) | (i161119 ^ i));
                    int i171111 = ~i151117;
                    int i171112 = ~(i171111 | i141113 | i2);
                    int i171113 = ((i171110 & i171112) | (i171110 ^ i171112)) * 516;
                    int i171114 = ((i161116 | i171113) << 1) - (i171113 ^ i161116);
                    int i171115 = ~(i171111 | i2);
                    int i171116 = ~(i141113 | i2);
                    int i171117 = i171114 + (((i171115 & i171116) | (i171115 ^ i171116)) * 516);
                    int i171118 = i171117 << 13;
                    int i171119 = (i171118 | i171117) & (~(i171117 & i171118));
                    int i189 = i171119 >>> 17;
                    int i1810 = ((~i171119) & i189) | ((~i189) & i171119);
                    int i1811 = i1810 << 5;
                    ((int[]) objArr113[1])[0] = (i1810 | i1811) & (~(i1810 & i1811));
                    return objArr113;
                } catch (Throwable th4) {
                    Throwable cause = th4.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th4;
                }
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.promo.PromoDataStore$$ExternalSyntheticLambda11
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PromoDataStore.getListMerchant$lambda$7(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getListMerchant$lambda$6(ListMerchantResponse listMerchantResponse) {
        Intrinsics.checkNotNullParameter(listMerchantResponse, "");
        return listMerchantResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getListMerchant$lambda$7(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.promo.PromoRepository
    public final deriveCodec<List<VoucherList>> getListVoucher(VoucherRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<VoucherResponse>> listVoucher = m7701getWebService().getListVoucher(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(listVoucher, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.promo.PromoDataStore$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PromoDataStore.getListVoucher$lambda$8((VoucherResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.promo.PromoDataStore$$ExternalSyntheticLambda9
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PromoDataStore.getListVoucher$lambda$9(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getListVoucher$lambda$8(VoucherResponse voucherResponse) {
        Intrinsics.checkNotNullParameter(voucherResponse, "");
        return voucherResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getListVoucher$lambda$9(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.promo.PromoRepository
    public final deriveCodec<RedeemResponse> getVoucherCode(RedeemRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<RedeemResponse>> voucherCode = m7701getWebService().getVoucherCode(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(voucherCode, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.promo.PromoDataStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PromoDataStore.getVoucherCode$lambda$10((RedeemResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.promo.PromoDataStore$$ExternalSyntheticLambda2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PromoDataStore.getVoucherCode$lambda$11(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RedeemResponse getVoucherCode$lambda$11(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (RedeemResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.promo.PromoRepository
    public final deriveCodec<DetailMerchantItem> getDetailVoucher(DetailVoucherRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<DetailMerchantResponse>> detailVoucher = m7701getWebService().getDetailVoucher(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(detailVoucher, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.promo.PromoDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PromoDataStore.getDetailVoucher$lambda$12((DetailMerchantResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.promo.PromoDataStore$$ExternalSyntheticLambda7
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PromoDataStore.getDetailVoucher$lambda$13(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DetailMerchantItem getDetailVoucher$lambda$12(DetailMerchantResponse detailMerchantResponse) {
        Intrinsics.checkNotNullParameter(detailMerchantResponse, "");
        return detailMerchantResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DetailMerchantItem getDetailVoucher$lambda$13(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (DetailMerchantItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.promo.PromoRepository
    public final deriveCodec<BaseItem> updateFlagAksesDeeplink(FlagDeeplinkRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecUpdateFlagAksesDeeplink = m7701getWebService().updateFlagAksesDeeplink(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecUpdateFlagAksesDeeplink, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.promo.PromoDataStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PromoDataStore.updateFlagAksesDeeplink$lambda$14((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.promo.PromoDataStore$$ExternalSyntheticLambda6
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PromoDataStore.updateFlagAksesDeeplink$lambda$15(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem updateFlagAksesDeeplink$lambda$15(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    public final Void getDbService() {
        return this.dbService;
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final PromoApi m7701getWebService() {
        return this.webService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RedeemResponse getVoucherCode$lambda$10(RedeemResponse redeemResponse) {
        Intrinsics.checkNotNullParameter(redeemResponse, "");
        return redeemResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem updateFlagAksesDeeplink$lambda$14(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }
}
