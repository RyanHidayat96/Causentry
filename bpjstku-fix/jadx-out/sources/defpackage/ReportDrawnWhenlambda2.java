package defpackage;

import com.bpjstku.data.simulation.SimulationRepository;
import com.bpjstku.data.simulation.model.request.JhtSimulationRequest;
import com.bpjstku.data.simulation.model.request.JpSimulationRequest;
import com.bpjstku.data.simulation.model.response.JhtSimulationItem;
import com.bpjstku.data.simulation.model.response.JpSimulationItem;
import com.bpjstku.data.simulation.model.response.SimulasiJHT;
import com.bpjstku.data.simulation.model.response.SimulasiJp;
import com.bpjstku.domain.simulation.model.JhtSimulation;
import com.bpjstku.domain.simulation.model.JpSimulation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ReportDrawnWhenlambda2 implements ReportDrawnKtExternalSyntheticLambda5 {
    private final SimulationRepository TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public ReportDrawnWhenlambda2(SimulationRepository simulationRepository) {
        Intrinsics.checkNotNullParameter(simulationRepository, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = simulationRepository;
    }

    @Override // defpackage.ReportDrawnKtExternalSyntheticLambda5
    public final deriveCodec<JhtSimulation> TuitionPaymentFragmentspecialinlinedviewModeldefault2(JhtSimulationRequest jhtSimulationRequest) {
        Intrinsics.checkNotNullParameter(jhtSimulationRequest, "");
        deriveCodec<JhtSimulationItem> derivecodecPostJhtSimulation = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.postJhtSimulation(jhtSimulationRequest);
        final Function1 function1 = new Function1() { // from class: ReportDrawnKtExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReportDrawnWhenlambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault2((JhtSimulationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ReportDrawnKtReportDrawnAfter11
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ReportDrawnWhenlambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostJhtSimulation, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ReportDrawnKtExternalSyntheticLambda5
    public final deriveCodec<JpSimulation> b(JpSimulationRequest jpSimulationRequest) {
        Intrinsics.checkNotNullParameter(jpSimulationRequest, "");
        deriveCodec<JpSimulationItem> derivecodecPostJpSimulation = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.postJpSimulation(jpSimulationRequest);
        final Function1 function1 = new Function1() { // from class: ReportDrawnKtExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReportDrawnWhenlambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault2((JpSimulationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ReportDrawnKtExternalSyntheticLambda0
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ReportDrawnWhenlambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostJpSimulation, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ JhtSimulation TuitionPaymentFragmentspecialinlinedviewModeldefault2(JhtSimulationItem jhtSimulationItem) {
        Intrinsics.checkNotNullParameter(jhtSimulationItem, "");
        Intrinsics.checkNotNullParameter(jhtSimulationItem, "");
        SimulasiJHT data = jhtSimulationItem.getData();
        String jumlahTahun = data.getJumlahTahun();
        String str = jumlahTahun == null ? "" : jumlahTahun;
        String saldoAkhir = data.getSaldoAkhir();
        String str2 = saldoAkhir == null ? "" : saldoAkhir;
        String saldoAwal = data.getSaldoAwal();
        String str3 = saldoAwal == null ? "" : saldoAwal;
        String hasilPengembanganJHT = data.getHasilPengembanganJHT();
        String str4 = hasilPengembanganJHT == null ? "" : hasilPengembanganJHT;
        String iuranJHT = data.getIuranJHT();
        String str5 = iuranJHT == null ? "" : iuranJHT;
        String catatan = data.getCatatan();
        return new JhtSimulation(str, str3, str5, str4, str2, catatan == null ? "" : catatan);
    }

    public static /* synthetic */ JhtSimulation TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (JhtSimulation) function1.invoke(obj);
    }

    public static /* synthetic */ JpSimulation TuitionPaymentFragmentspecialinlinedviewModeldefault2(JpSimulationItem jpSimulationItem) {
        Intrinsics.checkNotNullParameter(jpSimulationItem, "");
        Intrinsics.checkNotNullParameter(jpSimulationItem, "");
        SimulasiJp simulasiJp = jpSimulationItem.getSimulasiJp();
        String strValueOf = String.valueOf(simulasiJp.getTahunPensiun());
        return new JpSimulation(String.valueOf(simulasiJp.getUsiaPensiun()), String.valueOf(simulasiJp.getMasaIuran()), String.valueOf(simulasiJp.getMasaIuranTerbilang()), String.valueOf(simulasiJp.getManfaat()), strValueOf);
    }

    public static /* synthetic */ JpSimulation TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (JpSimulation) function1.invoke(obj);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        readUnsignedByte.TuitionPaymentFragmentbindingInflater1[0] = readLong.b[0];
    }
}
