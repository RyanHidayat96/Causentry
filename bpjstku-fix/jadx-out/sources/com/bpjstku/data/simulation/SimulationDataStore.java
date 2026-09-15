package com.bpjstku.data.simulation;

import com.bpjstku.data.simulation.model.request.JhtSimulationRequest;
import com.bpjstku.data.simulation.model.request.JpSimulationRequest;
import com.bpjstku.data.simulation.model.response.JhtSimulationItem;
import com.bpjstku.data.simulation.model.response.JpSimulationItem;
import com.bpjstku.data.simulation.remote.SimulationApi;
import defpackage.Api23Impl;
import defpackage.deriveCodec;
import defpackage.mergeChildrenConfigs;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.share;
import defpackage.unbind;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/bpjstku/data/simulation/SimulationDataStore;", "Lcom/bpjstku/data/simulation/SimulationRepository;", "Lcom/bpjstku/data/simulation/remote/SimulationApi;", "p0", "<init>", "(Lcom/bpjstku/data/simulation/remote/SimulationApi;)V", "Lcom/bpjstku/data/simulation/model/request/JhtSimulationRequest;", "LderiveCodec;", "Lcom/bpjstku/data/simulation/model/response/JhtSimulationItem;", "postJhtSimulation", "(Lcom/bpjstku/data/simulation/model/request/JhtSimulationRequest;)LderiveCodec;", "Lcom/bpjstku/data/simulation/model/request/JpSimulationRequest;", "Lcom/bpjstku/data/simulation/model/response/JpSimulationItem;", "postJpSimulation", "(Lcom/bpjstku/data/simulation/model/request/JpSimulationRequest;)LderiveCodec;", "simulationApi", "Lcom/bpjstku/data/simulation/remote/SimulationApi;", "LmergeChildrenConfigs;", "dbService", "LmergeChildrenConfigs;", "getDbService", "()LmergeChildrenConfigs;", "webService", "getWebService", "()Lcom/bpjstku/data/simulation/remote/SimulationApi;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SimulationDataStore implements SimulationRepository {
    public static final int $stable = 8;
    private final mergeChildrenConfigs dbService;
    private final SimulationApi simulationApi;
    private final SimulationApi webService;

    public SimulationDataStore(SimulationApi simulationApi) {
        Intrinsics.checkNotNullParameter(simulationApi, "");
        this.simulationApi = simulationApi;
        this.webService = simulationApi;
    }

    public final mergeChildrenConfigs getDbService() {
        return this.dbService;
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final SimulationApi m7781getWebService() {
        return this.webService;
    }

    @Override // com.bpjstku.data.simulation.SimulationRepository
    public final deriveCodec<JhtSimulationItem> postJhtSimulation(JhtSimulationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<JhtSimulationItem>> derivecodecPostJhtSimulation = m7781getWebService().postJhtSimulation(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostJhtSimulation, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.simulation.SimulationDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SimulationDataStore.postJhtSimulation$lambda$0((JhtSimulationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.simulation.SimulationDataStore$$ExternalSyntheticLambda1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SimulationDataStore.postJhtSimulation$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JhtSimulationItem postJhtSimulation$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (JhtSimulationItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.simulation.SimulationRepository
    public final deriveCodec<JpSimulationItem> postJpSimulation(JpSimulationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<JpSimulationItem>> derivecodecPostJpSimulation = m7781getWebService().postJpSimulation(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostJpSimulation, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.simulation.SimulationDataStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SimulationDataStore.postJpSimulation$lambda$2((JpSimulationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.simulation.SimulationDataStore$$ExternalSyntheticLambda3
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return SimulationDataStore.postJpSimulation$lambda$3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JpSimulationItem postJpSimulation$lambda$3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (JpSimulationItem) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JhtSimulationItem postJhtSimulation$lambda$0(JhtSimulationItem jhtSimulationItem) {
        Intrinsics.checkNotNullParameter(jhtSimulationItem, "");
        return jhtSimulationItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JpSimulationItem postJpSimulation$lambda$2(JpSimulationItem jpSimulationItem) {
        Intrinsics.checkNotNullParameter(jpSimulationItem, "");
        return jpSimulationItem;
    }
}
