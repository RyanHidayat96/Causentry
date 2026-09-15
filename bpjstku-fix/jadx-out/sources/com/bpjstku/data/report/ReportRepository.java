package com.bpjstku.data.report;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.report.model.request.DataCorrectionRequest;
import com.bpjstku.data.report.model.request.NearestHealthcareRequest;
import com.bpjstku.data.report.model.request.PreloadDataRequest;
import com.bpjstku.data.report.model.request.ReportUnregisteredCompanyRequest;
import com.bpjstku.data.report.model.request.ReportWorkAccidentRequest;
import com.bpjstku.data.report.model.response.HealthcareItem;
import com.bpjstku.data.report.model.response.PreloadDataResponse;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0003\u001a\u00020\u0010H'¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\u0006\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/report/ReportRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/report/model/request/NearestHealthcareRequest;", "p0", "LderiveCodec;", "", "Lcom/bpjstku/data/report/model/response/HealthcareItem;", "getNearestHealthcare", "(Lcom/bpjstku/data/report/model/request/NearestHealthcareRequest;)LderiveCodec;", "Lcom/bpjstku/data/report/model/request/DataCorrectionRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "postDataCorrection", "(Lcom/bpjstku/data/report/model/request/DataCorrectionRequest;)LderiveCodec;", "Lcom/bpjstku/data/report/model/request/ReportWorkAccidentRequest;", "reportWorkAccident", "(Lcom/bpjstku/data/report/model/request/ReportWorkAccidentRequest;)LderiveCodec;", "Lcom/bpjstku/data/report/model/request/ReportUnregisteredCompanyRequest;", "reportUnregisteredCompany", "(Lcom/bpjstku/data/report/model/request/ReportUnregisteredCompanyRequest;)LderiveCodec;", "Lcom/bpjstku/data/report/model/request/PreloadDataRequest;", "Lcom/bpjstku/data/report/model/response/PreloadDataResponse;", "postPreloadData", "(Lcom/bpjstku/data/report/model/request/PreloadDataRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ReportRepository extends getChildrenOutConfigs {
    deriveCodec<List<HealthcareItem>> getNearestHealthcare(NearestHealthcareRequest p0);

    deriveCodec<BaseItem> postDataCorrection(DataCorrectionRequest p0);

    deriveCodec<PreloadDataResponse> postPreloadData(PreloadDataRequest p0);

    deriveCodec<BaseItem> reportUnregisteredCompany(ReportUnregisteredCompanyRequest p0);

    deriveCodec<BaseItem> reportWorkAccident(ReportWorkAccidentRequest p0);
}
