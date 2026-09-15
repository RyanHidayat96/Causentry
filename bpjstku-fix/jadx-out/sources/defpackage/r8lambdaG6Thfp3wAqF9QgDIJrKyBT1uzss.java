package defpackage;

import com.bpjstku.data.complaint.model.response.ComplaintDetailItem;
import com.bpjstku.data.complaint.model.response.ComplaintHistoryItem;
import com.bpjstku.data.complaint.model.response.DetailPbtItem;
import com.bpjstku.data.complaint.model.response.TindakLanjutItem;
import com.bpjstku.data.complaint.model.response.TrackingComplaintItem;
import com.bpjstku.domain.complaint.model.ComplaintDetail;
import com.bpjstku.domain.complaint.model.ComplaintHistory;
import com.bpjstku.domain.complaint.model.DetailPerusahaanBelumTerdaftar;
import com.bpjstku.domain.complaint.model.TindakLanjut;
import com.bpjstku.domain.complaint.model.TrackingComplaint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss {
    private static final String b = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());

    public static final ComplaintHistory TuitionPaymentFragmentspecialinlinedviewModeldefault3(ComplaintHistoryItem complaintHistoryItem) {
        Intrinsics.checkNotNullParameter(complaintHistoryItem, "");
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        String checksum = complaintHistoryItem.getChecksum();
        if (checksum == null) {
            checksum = "";
        }
        String str = b;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(checksum, str);
        Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
        String idPengaduan = complaintHistoryItem.getIdPengaduan();
        if (idPengaduan == null) {
            idPengaduan = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = companion2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(idPengaduan, str);
        Camera2InteropExtender.Companion companion3 = Camera2InteropExtender.INSTANCE;
        String tipePengaduan = complaintHistoryItem.getTipePengaduan();
        if (tipePengaduan == null) {
            tipePengaduan = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault5 = companion3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tipePengaduan, str);
        Camera2InteropExtender.Companion companion4 = Camera2InteropExtender.INSTANCE;
        String tanggalPengaduan = complaintHistoryItem.getTanggalPengaduan();
        if (tanggalPengaduan == null) {
            tanggalPengaduan = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault6 = companion4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tanggalPengaduan, str);
        Camera2InteropExtender.Companion companion5 = Camera2InteropExtender.INSTANCE;
        String kodeJenisPengaduan = complaintHistoryItem.getKodeJenisPengaduan();
        if (kodeJenisPengaduan == null) {
            kodeJenisPengaduan = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault7 = companion5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(kodeJenisPengaduan, str);
        Camera2InteropExtender.Companion companion6 = Camera2InteropExtender.INSTANCE;
        String deskripsiPengaduan = complaintHistoryItem.getDeskripsiPengaduan();
        return new ComplaintHistory(strTuitionPaymentFragmentspecialinlinedviewModeldefault5, strTuitionPaymentFragmentspecialinlinedviewModeldefault6, strTuitionPaymentFragmentspecialinlinedviewModeldefault4, strTuitionPaymentFragmentspecialinlinedviewModeldefault7, companion6.TuitionPaymentFragmentspecialinlinedviewModeldefault3(deskripsiPengaduan != null ? deskripsiPengaduan : "", str), strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        if (Intrinsics.areEqual(str, "")) {
            return "";
        }
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        if (str == null) {
            str = "";
        }
        return companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, b);
    }

    public static final ComplaintDetail TuitionPaymentFragmentbindingInflater1(ComplaintDetailItem complaintDetailItem) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        DetailPerusahaanBelumTerdaftar detailPerusahaanBelumTerdaftar;
        Intrinsics.checkNotNullParameter(complaintDetailItem, "");
        String checksum = complaintDetailItem.getChecksum();
        if (checksum == null) {
            checksum = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(checksum);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(complaintDetailItem.getIdPengaduan());
        List<TrackingComplaintItem> trackingJumlahKaryawan = complaintDetailItem.getTrackingJumlahKaryawan();
        if (trackingJumlahKaryawan != null) {
            List<TrackingComplaintItem> list = trackingJumlahKaryawan;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList4.add(TuitionPaymentFragmentspecialinlinedviewModeldefault3((TrackingComplaintItem) it.next()));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        String kpj = complaintDetailItem.getKpj();
        if (kpj == null) {
            kpj = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(kpj);
        String tipePengaduan = complaintDetailItem.getTipePengaduan();
        if (tipePengaduan == null) {
            tipePengaduan = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(tipePengaduan);
        String alamatPerusahaan = complaintDetailItem.getAlamatPerusahaan();
        if (alamatPerusahaan == null) {
            alamatPerusahaan = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(alamatPerusahaan);
        String namaPerusahaan = complaintDetailItem.getNamaPerusahaan();
        if (namaPerusahaan == null) {
            namaPerusahaan = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(namaPerusahaan);
        List<TrackingComplaintItem> trackingJumlahUpah = complaintDetailItem.getTrackingJumlahUpah();
        if (trackingJumlahUpah != null) {
            List<TrackingComplaintItem> list2 = trackingJumlahUpah;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList5.add(TuitionPaymentFragmentspecialinlinedviewModeldefault3((TrackingComplaintItem) it2.next()));
            }
            arrayList2 = arrayList5;
        } else {
            arrayList2 = null;
        }
        List<TrackingComplaintItem> trackingPerusahaan = complaintDetailItem.getTrackingPerusahaan();
        if (trackingPerusahaan != null) {
            List<TrackingComplaintItem> list3 = trackingPerusahaan;
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList6.add(TuitionPaymentFragmentspecialinlinedviewModeldefault3((TrackingComplaintItem) it3.next()));
            }
            arrayList3 = arrayList6;
        } else {
            arrayList3 = null;
        }
        String detailDataTidakSesuai = complaintDetailItem.getDetailDataTidakSesuai();
        if (detailDataTidakSesuai == null) {
            detailDataTidakSesuai = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(detailDataTidakSesuai);
        DetailPbtItem detailPerusahaanBelumTerdaftar2 = complaintDetailItem.getDetailPerusahaanBelumTerdaftar();
        if (detailPerusahaanBelumTerdaftar2 != null) {
            Intrinsics.checkNotNullParameter(detailPerusahaanBelumTerdaftar2, "");
            String alamatPerusahaan2 = detailPerusahaanBelumTerdaftar2.getAlamatPerusahaan();
            if (alamatPerusahaan2 == null) {
                alamatPerusahaan2 = "";
            }
            String namaPerusahaan2 = detailPerusahaanBelumTerdaftar2.getNamaPerusahaan();
            if (namaPerusahaan2 == null) {
                namaPerusahaan2 = "";
            }
            String lokasiPerusahaan = detailPerusahaanBelumTerdaftar2.getLokasiPerusahaan();
            if (lokasiPerusahaan == null) {
                lokasiPerusahaan = "";
            }
            detailPerusahaanBelumTerdaftar = new DetailPerusahaanBelumTerdaftar(alamatPerusahaan2, namaPerusahaan2, lokasiPerusahaan);
        } else {
            detailPerusahaanBelumTerdaftar = null;
        }
        String kodeJenisPengaduan = complaintDetailItem.getKodeJenisPengaduan();
        return new ComplaintDetail(strTuitionPaymentFragmentspecialinlinedviewModeldefault2, arrayList, strTuitionPaymentFragmentspecialinlinedviewModeldefault4, strTuitionPaymentFragmentspecialinlinedviewModeldefault5, strTuitionPaymentFragmentspecialinlinedviewModeldefault6, strTuitionPaymentFragmentspecialinlinedviewModeldefault7, arrayList2, strTuitionPaymentFragmentspecialinlinedviewModeldefault3, arrayList3, strTuitionPaymentFragmentspecialinlinedviewModeldefault8, detailPerusahaanBelumTerdaftar, TuitionPaymentFragmentspecialinlinedviewModeldefault2(kodeJenisPengaduan != null ? kodeJenisPengaduan : ""));
    }

    private static TrackingComplaint TuitionPaymentFragmentspecialinlinedviewModeldefault3(TrackingComplaintItem trackingComplaintItem) {
        TindakLanjut tindakLanjut;
        Intrinsics.checkNotNullParameter(trackingComplaintItem, "");
        String tahapan = trackingComplaintItem.getTahapan();
        if (tahapan == null) {
            tahapan = "";
        }
        String tanggal = trackingComplaintItem.getTanggal();
        if (tanggal == null) {
            tanggal = "";
        }
        String status = trackingComplaintItem.getStatus();
        if (status == null) {
            status = "";
        }
        TindakLanjutItem tindakLanjut2 = trackingComplaintItem.getTindakLanjut();
        if (tindakLanjut2 != null) {
            Intrinsics.checkNotNullParameter(tindakLanjut2, "");
            String keterangan = tindakLanjut2.getKeterangan();
            if (keterangan == null) {
                keterangan = "";
            }
            String statusTindakLanjut = tindakLanjut2.getStatusTindakLanjut();
            if (statusTindakLanjut == null) {
                statusTindakLanjut = "";
            }
            String aktifitas = tindakLanjut2.getAktifitas();
            tindakLanjut = new TindakLanjut(keterangan, statusTindakLanjut, aktifitas != null ? aktifitas : "");
        } else {
            tindakLanjut = null;
        }
        return new TrackingComplaint(tahapan, tanggal, status, tindakLanjut);
    }
}
