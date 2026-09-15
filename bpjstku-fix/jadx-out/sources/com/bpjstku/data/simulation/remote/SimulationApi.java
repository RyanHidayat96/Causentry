package com.bpjstku.data.simulation.remote;

import com.bpjstku.data.simulation.model.request.JhtSimulationRequest;
import com.bpjstku.data.simulation.model.request.JpSimulationRequest;
import com.bpjstku.data.simulation.model.response.JhtSimulationItem;
import com.bpjstku.data.simulation.model.response.JpSimulationItem;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/bpjstku/data/simulation/remote/SimulationApi;", "LunbindChildren;", "Lcom/bpjstku/data/simulation/remote/SimulationApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/simulation/remote/SimulationApiClient;)V", "Lcom/bpjstku/data/simulation/model/request/JhtSimulationRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/simulation/model/response/JhtSimulationItem;", "postJhtSimulation", "(Lcom/bpjstku/data/simulation/model/request/JhtSimulationRequest;)LderiveCodec;", "Lcom/bpjstku/data/simulation/model/request/JpSimulationRequest;", "Lcom/bpjstku/data/simulation/model/response/JpSimulationItem;", "postJpSimulation", "(Lcom/bpjstku/data/simulation/model/request/JpSimulationRequest;)LderiveCodec;", "simulationApiClient", "Lcom/bpjstku/data/simulation/remote/SimulationApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SimulationApi implements unbindChildren, SimulationApiClient {
    public static final int $stable = 8;
    private final SimulationApiClient simulationApiClient;

    public SimulationApi(SimulationApiClient simulationApiClient) {
        Intrinsics.checkNotNullParameter(simulationApiClient, "");
        this.simulationApiClient = simulationApiClient;
    }

    @Override // com.bpjstku.data.simulation.remote.SimulationApiClient
    public final deriveCodec<Response<JhtSimulationItem>> postJhtSimulation(JhtSimulationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.simulationApiClient.postJhtSimulation(p0);
    }

    @Override // com.bpjstku.data.simulation.remote.SimulationApiClient
    public final deriveCodec<Response<JpSimulationItem>> postJpSimulation(JpSimulationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.simulationApiClient.postJpSimulation(p0);
    }
}
