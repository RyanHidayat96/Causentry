package com.bpjstku.data.office;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.office.model.request.BranchOfficeDefaultSelectedRequest;
import com.bpjstku.data.office.model.request.BranchOfficeRequest;
import com.bpjstku.data.office.model.request.NearestBranchOfficeRequest;
import com.bpjstku.data.office.model.response.BranchOfficeDefaultSelectedResponse;
import com.bpjstku.data.office.model.response.BranchOfficeItem;
import com.bpjstku.data.office.model.response.BranchOfficeLocationByRegionResponse;
import com.bpjstku.data.office.model.response.BranchOfficeLocationResponse;
import com.bpjstku.data.office.model.response.BranchPioneerOfficeItem;
import com.bpjstku.data.office.model.response.BranchPioneerOfficeResponse;
import com.bpjstku.data.office.model.response.NearestBranchOfficeLocationResponse;
import com.bpjstku.data.office.model.response.RegionalOfficeItem;
import com.bpjstku.data.office.model.response.RegionalOfficeLocationResponse;
import com.bpjstku.data.office.remote.OfficeApi;
import defpackage.Api23Impl;
import defpackage.deriveCodec;
import defpackage.initSession;
import defpackage.mergeChildrenConfigs;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.share;
import defpackage.unbind;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\r\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000e\u0010\u000bJ#\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u00072\u0006\u0010\u0003\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0003\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\u0003\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\""}, d2 = {"Lcom/bpjstku/data/office/OfficeDataStore;", "Lcom/bpjstku/data/office/OfficeRepository;", "Lcom/bpjstku/data/office/remote/OfficeApi;", "p0", "<init>", "(Lcom/bpjstku/data/office/remote/OfficeApi;)V", "Lcom/bpjstku/data/lib/model/BaseRequest;", "LderiveCodec;", "", "Lcom/bpjstku/data/office/model/response/RegionalOfficeItem;", "getBranchOffice", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/office/model/response/BranchPioneerOfficeItem;", "getBranchPioneerOffices", "getRegionalOffice", "Lcom/bpjstku/data/office/model/request/BranchOfficeRequest;", "Lcom/bpjstku/data/office/model/response/BranchOfficeItem;", "getBranchOfficeByRegion", "(Lcom/bpjstku/data/office/model/request/BranchOfficeRequest;)LderiveCodec;", "Lcom/bpjstku/data/office/model/request/NearestBranchOfficeRequest;", "getNearestBranchOffice", "(Lcom/bpjstku/data/office/model/request/NearestBranchOfficeRequest;)LderiveCodec;", "Lcom/bpjstku/data/office/model/request/BranchOfficeDefaultSelectedRequest;", "Lcom/bpjstku/data/office/model/response/BranchOfficeDefaultSelectedResponse;", "getBranchDefaultSelected", "(Lcom/bpjstku/data/office/model/request/BranchOfficeDefaultSelectedRequest;)LderiveCodec;", "webService", "Lcom/bpjstku/data/office/remote/OfficeApi;", "getWebService", "()Lcom/bpjstku/data/office/remote/OfficeApi;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OfficeDataStore implements OfficeRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final OfficeApi webService;

    public OfficeDataStore(OfficeApi officeApi) {
        Intrinsics.checkNotNullParameter(officeApi, "");
        this.webService = officeApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7664getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final OfficeApi m7665getWebService() {
        return this.webService;
    }

    public final Void getDbService() {
        return this.dbService;
    }

    @Override // com.bpjstku.data.office.OfficeRepository
    public final deriveCodec<List<RegionalOfficeItem>> getBranchOffice(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BranchOfficeLocationResponse>> branchOffices = m7665getWebService().getBranchOffices(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(branchOffices, unbindVar);
        final OfficeDataStore$$ExternalSyntheticLambda10 officeDataStore$$ExternalSyntheticLambda10 = new OfficeDataStore$$ExternalSyntheticLambda10();
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.office.OfficeDataStore$$ExternalSyntheticLambda11
            @Override // defpackage.readableMs
            public final Object apply(Object obj) throws IllegalAccessException {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 46400), (Process.myPid() >> 22) + 40, Drawable.resolveOpacity(0, 0) + 19, 1513912262, false, "b", null);
                }
                int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 37836), 59 - View.getDefaultSize(0, 0), 18 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 37836), TextUtils.getCapsMode("", 0, 0) + 59, 17 - Process.getGidForName(""), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
                }
                int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
                long j2 = -494;
                long j3 = -1;
                long j4 = (j2 * 2971791596501822270L) + (j2 * 2547461900657963969L) + (((long) (-495)) * (3134487465935469567L ^ j3));
                long j5 = 495;
                long jUptimeMillis = (((long) ((int) SystemClock.uptimeMillis())) ^ j3) | 2971791596501822270L;
                long j6 = j4 + (j5 * jUptimeMillis) + (j5 * ((j3 ^ jUptimeMillis) | (((j3 ^ 2971791596501822270L) | (j3 ^ 2547461900657963969L)) ^ j3)));
                long j7 = j;
                int i3 = 0;
                while (true) {
                    for (int i4 = 0; i4 != 8; i4++) {
                        i2 = (((((int) (j7 >> i4)) & 255) + (i2 << 6)) + (i2 << 16)) - i2;
                    }
                    if (i3 != 0) {
                        break;
                    }
                    i3++;
                    j7 = j6;
                }
                if (i2 == i) {
                    return OfficeDataStore.getBranchOffice$lambda$1(officeDataStore$$ExternalSyntheticLambda10, obj);
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46399 - ((byte) KeyEvent.getModifierMetaStateMask())), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40, 19 - TextUtils.indexOf("", ""), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                throw null;
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getBranchOffice$lambda$0(BranchOfficeLocationResponse branchOfficeLocationResponse) {
        Intrinsics.checkNotNullParameter(branchOfficeLocationResponse, "");
        return branchOfficeLocationResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getBranchOffice$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.office.OfficeRepository
    public final deriveCodec<List<BranchPioneerOfficeItem>> getBranchPioneerOffices(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BranchPioneerOfficeResponse>> branchPioneerOffices = m7665getWebService().getBranchPioneerOffices(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(branchPioneerOffices, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.office.OfficeDataStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OfficeDataStore.getBranchPioneerOffices$lambda$2((BranchPioneerOfficeResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.office.OfficeDataStore$$ExternalSyntheticLambda5
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return OfficeDataStore.getBranchPioneerOffices$lambda$3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getBranchPioneerOffices$lambda$2(BranchPioneerOfficeResponse branchPioneerOfficeResponse) {
        Intrinsics.checkNotNullParameter(branchPioneerOfficeResponse, "");
        return branchPioneerOfficeResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getBranchPioneerOffices$lambda$3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.office.OfficeRepository
    public final deriveCodec<List<RegionalOfficeItem>> getRegionalOffice(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<RegionalOfficeLocationResponse>> regionalOffices = m7665getWebService().getRegionalOffices(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(regionalOffices, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.office.OfficeDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OfficeDataStore.getRegionalOffice$lambda$4((RegionalOfficeLocationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.office.OfficeDataStore$$ExternalSyntheticLambda3
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return OfficeDataStore.getRegionalOffice$lambda$5(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getRegionalOffice$lambda$4(RegionalOfficeLocationResponse regionalOfficeLocationResponse) {
        Intrinsics.checkNotNullParameter(regionalOfficeLocationResponse, "");
        return regionalOfficeLocationResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getRegionalOffice$lambda$5(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.office.OfficeRepository
    public final deriveCodec<List<BranchOfficeItem>> getBranchOfficeByRegion(BranchOfficeRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BranchOfficeLocationByRegionResponse>> branchOfficeByRegion = m7665getWebService().getBranchOfficeByRegion(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(branchOfficeByRegion, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.office.OfficeDataStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OfficeDataStore.getBranchOfficeByRegion$lambda$6((BranchOfficeLocationByRegionResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.office.OfficeDataStore$$ExternalSyntheticLambda7
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return OfficeDataStore.getBranchOfficeByRegion$lambda$7(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getBranchOfficeByRegion$lambda$6(BranchOfficeLocationByRegionResponse branchOfficeLocationByRegionResponse) {
        Intrinsics.checkNotNullParameter(branchOfficeLocationByRegionResponse, "");
        return branchOfficeLocationByRegionResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getBranchOfficeByRegion$lambda$7(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.office.OfficeRepository
    public final deriveCodec<BranchOfficeItem> getNearestBranchOffice(NearestBranchOfficeRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<NearestBranchOfficeLocationResponse>> nearestBranchOffice = m7665getWebService().getNearestBranchOffice(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(nearestBranchOffice, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.office.OfficeDataStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OfficeDataStore.getNearestBranchOffice$lambda$8((NearestBranchOfficeLocationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.office.OfficeDataStore$$ExternalSyntheticLambda2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return OfficeDataStore.getNearestBranchOffice$lambda$9(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BranchOfficeItem getNearestBranchOffice$lambda$8(NearestBranchOfficeLocationResponse nearestBranchOfficeLocationResponse) {
        Intrinsics.checkNotNullParameter(nearestBranchOfficeLocationResponse, "");
        return nearestBranchOfficeLocationResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BranchOfficeItem getNearestBranchOffice$lambda$9(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BranchOfficeItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.office.OfficeRepository
    public final deriveCodec<BranchOfficeDefaultSelectedResponse> getBranchDefaultSelected(BranchOfficeDefaultSelectedRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BranchOfficeDefaultSelectedResponse>> branchDefaultSelected = m7665getWebService().getBranchDefaultSelected(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(branchDefaultSelected, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.office.OfficeDataStore$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OfficeDataStore.getBranchDefaultSelected$lambda$10((BranchOfficeDefaultSelectedResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.office.OfficeDataStore$$ExternalSyntheticLambda9
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return OfficeDataStore.getBranchDefaultSelected$lambda$11(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BranchOfficeDefaultSelectedResponse getBranchDefaultSelected$lambda$11(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BranchOfficeDefaultSelectedResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BranchOfficeDefaultSelectedResponse getBranchDefaultSelected$lambda$10(BranchOfficeDefaultSelectedResponse branchOfficeDefaultSelectedResponse) {
        Intrinsics.checkNotNullParameter(branchOfficeDefaultSelectedResponse, "");
        return branchOfficeDefaultSelectedResponse;
    }
}
