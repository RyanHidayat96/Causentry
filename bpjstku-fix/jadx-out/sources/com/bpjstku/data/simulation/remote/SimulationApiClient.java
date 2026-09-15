package com.bpjstku.data.simulation.remote;

import com.bpjstku.data.simulation.model.request.JhtSimulationRequest;
import com.bpjstku.data.simulation.model.request.JpSimulationRequest;
import com.bpjstku.data.simulation.model.response.JhtSimulationItem;
import com.bpjstku.data.simulation.model.response.JpSimulationItem;
import defpackage.deriveCodec;
import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/simulation/remote/SimulationApiClient;", "", "Lcom/bpjstku/data/simulation/model/request/JhtSimulationRequest;", "p0", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/simulation/model/response/JhtSimulationItem;", "postJhtSimulation", "(Lcom/bpjstku/data/simulation/model/request/JhtSimulationRequest;)LderiveCodec;", "Lcom/bpjstku/data/simulation/model/request/JpSimulationRequest;", "Lcom/bpjstku/data/simulation/model/response/JpSimulationItem;", "postJpSimulation", "(Lcom/bpjstku/data/simulation/model/request/JpSimulationRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SimulationApiClient {
    @POST("simulasi/jht")
    deriveCodec<Response<JhtSimulationItem>> postJhtSimulation(@Body JhtSimulationRequest p0);

    @POST("simulasi/jp")
    deriveCodec<Response<JpSimulationItem>> postJpSimulation(@Body JpSimulationRequest p0);
}
