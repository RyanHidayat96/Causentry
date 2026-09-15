package defpackage;

import com.bpjstku.data.scholarship.model.response.ScholarshipBenefitPerson;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class LocalOnBackPressedDispatcherOwnerExternalSyntheticLambda0 {
    public static final ScholarPersonDetail TuitionPaymentFragmentbindingInflater1(ScholarshipBenefitPerson scholarshipBenefitPerson, String str, String str2) throws Throwable {
        Intrinsics.checkNotNullParameter(scholarshipBenefitPerson, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String strB = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        String bankPenerima = scholarshipBenefitPerson.getBankPenerima();
        if (bankPenerima == null) {
            bankPenerima = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bankPenerima, strB);
        Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
        String noRekeningPenerima = scholarshipBenefitPerson.getNoRekeningPenerima();
        if (noRekeningPenerima == null) {
            noRekeningPenerima = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = companion2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(noRekeningPenerima, strB);
        Camera2InteropExtender.Companion companion3 = Camera2InteropExtender.INSTANCE;
        String namaRekeningPenerima = scholarshipBenefitPerson.getNamaRekeningPenerima();
        if (namaRekeningPenerima == null) {
            namaRekeningPenerima = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault5 = companion3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(namaRekeningPenerima, strB);
        Camera2InteropExtender.Companion companion4 = Camera2InteropExtender.INSTANCE;
        String nikPenerima = scholarshipBenefitPerson.getNikPenerima();
        if (nikPenerima == null) {
            nikPenerima = "";
        }
        companion4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(nikPenerima, strB);
        Camera2InteropExtender.Companion companion5 = Camera2InteropExtender.INSTANCE;
        String nikPeserta = scholarshipBenefitPerson.getNikPeserta();
        if (nikPeserta == null) {
            nikPeserta = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault6 = companion5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(nikPeserta, strB);
        Camera2InteropExtender.Companion companion6 = Camera2InteropExtender.INSTANCE;
        String namaPeserta = scholarshipBenefitPerson.getNamaPeserta();
        if (namaPeserta == null) {
            namaPeserta = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault7 = companion6.TuitionPaymentFragmentspecialinlinedviewModeldefault3(namaPeserta, strB);
        Camera2InteropExtender.Companion companion7 = Camera2InteropExtender.INSTANCE;
        String kpjPeserta = scholarshipBenefitPerson.getKpjPeserta();
        if (kpjPeserta == null) {
            kpjPeserta = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault8 = companion7.TuitionPaymentFragmentspecialinlinedviewModeldefault3(kpjPeserta, strB);
        Camera2InteropExtender.Companion companion8 = Camera2InteropExtender.INSTANCE;
        String nikPenerima2 = scholarshipBenefitPerson.getNikPenerima();
        if (nikPenerima2 == null) {
            nikPenerima2 = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault9 = companion8.TuitionPaymentFragmentspecialinlinedviewModeldefault3(nikPenerima2, strB);
        Camera2InteropExtender.Companion companion9 = Camera2InteropExtender.INSTANCE;
        String namaPenerima = scholarshipBenefitPerson.getNamaPenerima();
        if (namaPenerima == null) {
            namaPenerima = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault10 = companion9.TuitionPaymentFragmentspecialinlinedviewModeldefault3(namaPenerima, strB);
        Camera2InteropExtender.Companion companion10 = Camera2InteropExtender.INSTANCE;
        String tempatLahir = scholarshipBenefitPerson.getTempatLahir();
        if (tempatLahir == null) {
            tempatLahir = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault11 = companion10.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tempatLahir, strB);
        Camera2InteropExtender.Companion companion11 = Camera2InteropExtender.INSTANCE;
        String tglLahir = scholarshipBenefitPerson.getTglLahir();
        if (tglLahir == null) {
            tglLahir = "";
        }
        String strSubstring = companion11.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tglLahir, strB).substring(0, 10);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        Camera2InteropExtender.Companion companion12 = Camera2InteropExtender.INSTANCE;
        String jenisKelamin = scholarshipBenefitPerson.getJenisKelamin();
        if (jenisKelamin == null) {
            jenisKelamin = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault12 = companion12.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jenisKelamin, strB);
        Camera2InteropExtender.Companion companion13 = Camera2InteropExtender.INSTANCE;
        String alamat = scholarshipBenefitPerson.getAlamat();
        if (alamat == null) {
            alamat = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault13 = companion13.TuitionPaymentFragmentspecialinlinedviewModeldefault3(alamat, strB);
        String email = scholarshipBenefitPerson.getEmail();
        if (email == null) {
            email = "";
        }
        Camera2InteropExtender.Companion companion14 = Camera2InteropExtender.INSTANCE;
        String handphone = scholarshipBenefitPerson.getHandphone();
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault14 = companion14.TuitionPaymentFragmentspecialinlinedviewModeldefault3(handphone != null ? handphone : "", strB);
        Camera2InteropExtender.Companion companion15 = Camera2InteropExtender.INSTANCE;
        String namaOrtuWali = scholarshipBenefitPerson.getNamaOrtuWali();
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault15 = companion15.TuitionPaymentFragmentspecialinlinedviewModeldefault3(namaOrtuWali == null ? "" : namaOrtuWali, strB);
        Camera2InteropExtender.Companion companion16 = Camera2InteropExtender.INSTANCE;
        String kodeManfaat = scholarshipBenefitPerson.getKodeManfaat();
        if (kodeManfaat == null) {
            kodeManfaat = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault16 = companion16.TuitionPaymentFragmentspecialinlinedviewModeldefault3(kodeManfaat, strB);
        Camera2InteropExtender.Companion companion17 = Camera2InteropExtender.INSTANCE;
        String kodeKantor = scholarshipBenefitPerson.getKodeKantor();
        if (kodeKantor == null) {
            kodeKantor = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault17 = companion17.TuitionPaymentFragmentspecialinlinedviewModeldefault3(kodeKantor, strB);
        Camera2InteropExtender.Companion companion18 = Camera2InteropExtender.INSTANCE;
        String kodeKlaim = scholarshipBenefitPerson.getKodeKlaim();
        if (kodeKlaim == null) {
            kodeKlaim = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault18 = companion18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(kodeKlaim, strB);
        Camera2InteropExtender.Companion companion19 = Camera2InteropExtender.INSTANCE;
        String kodeKlaimAkhir = scholarshipBenefitPerson.getKodeKlaimAkhir();
        if (kodeKlaimAkhir == null) {
            kodeKlaimAkhir = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault19 = companion19.TuitionPaymentFragmentspecialinlinedviewModeldefault3(kodeKlaimAkhir, strB);
        Camera2InteropExtender.Companion companion20 = Camera2InteropExtender.INSTANCE;
        String noUrut = scholarshipBenefitPerson.getNoUrut();
        if (noUrut == null) {
            noUrut = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault20 = companion20.TuitionPaymentFragmentspecialinlinedviewModeldefault3(noUrut, strB);
        Camera2InteropExtender.Companion companion21 = Camera2InteropExtender.INSTANCE;
        String namaHubungan = scholarshipBenefitPerson.getNamaHubungan();
        if (namaHubungan == null) {
            namaHubungan = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault21 = companion21.TuitionPaymentFragmentspecialinlinedviewModeldefault3(namaHubungan, strB);
        Camera2InteropExtender.Companion companion22 = Camera2InteropExtender.INSTANCE;
        String jenjangPendidikan = scholarshipBenefitPerson.getJenjangPendidikan();
        if (jenjangPendidikan == null) {
            jenjangPendidikan = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault22 = companion22.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jenjangPendidikan, strB);
        Integer jumlahPenerima = scholarshipBenefitPerson.getJumlahPenerima();
        return new ScholarPersonDetail(strTuitionPaymentFragmentspecialinlinedviewModeldefault6, strTuitionPaymentFragmentspecialinlinedviewModeldefault7, strTuitionPaymentFragmentspecialinlinedviewModeldefault8, strTuitionPaymentFragmentspecialinlinedviewModeldefault9, strTuitionPaymentFragmentspecialinlinedviewModeldefault10, strTuitionPaymentFragmentspecialinlinedviewModeldefault11, strSubstring, strTuitionPaymentFragmentspecialinlinedviewModeldefault12, strTuitionPaymentFragmentspecialinlinedviewModeldefault13, email, strTuitionPaymentFragmentspecialinlinedviewModeldefault14, strTuitionPaymentFragmentspecialinlinedviewModeldefault15, strTuitionPaymentFragmentspecialinlinedviewModeldefault22, jumlahPenerima != null ? jumlahPenerima.intValue() : 0, null, null, null, null, strTuitionPaymentFragmentspecialinlinedviewModeldefault20, strTuitionPaymentFragmentspecialinlinedviewModeldefault18, strTuitionPaymentFragmentspecialinlinedviewModeldefault19, strTuitionPaymentFragmentspecialinlinedviewModeldefault16, strTuitionPaymentFragmentspecialinlinedviewModeldefault17, null, null, null, null, null, null, null, null, str, str2, strTuitionPaymentFragmentspecialinlinedviewModeldefault21, strTuitionPaymentFragmentspecialinlinedviewModeldefault3, strTuitionPaymentFragmentspecialinlinedviewModeldefault4, strTuitionPaymentFragmentspecialinlinedviewModeldefault5, null, 2139340800, 32, null);
    }

    public static final List<ScholarPersonDetail> TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<ScholarshipBenefitPerson> list, String str) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(str, "");
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3()));
        if (list != null) {
            List<ScholarshipBenefitPerson> list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(TuitionPaymentFragmentbindingInflater1((ScholarshipBenefitPerson) it.next(), str, strTuitionPaymentFragmentspecialinlinedviewModeldefault3));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }
}
