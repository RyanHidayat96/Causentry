package defpackage;

import com.bpjstku.data.promo.model.response.DetailMerchantItem;
import com.bpjstku.data.promo.model.response.SyaratItem;
import com.bpjstku.domain.promo.model.DetailMerchant;
import com.bpjstku.domain.promo.model.SyaratMerchant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class OnBackPressedDispatcherKtaddCallbackcallback1 {
    public static final DetailMerchant TuitionPaymentFragmentspecialinlinedviewModeldefault3(DetailMerchantItem detailMerchantItem) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(detailMerchantItem, "");
        String kodePks = detailMerchantItem.getKodePks();
        String str = kodePks == null ? "" : kodePks;
        String tglAwalPromo = detailMerchantItem.getTglAwalPromo();
        String str2 = tglAwalPromo == null ? "" : tglAwalPromo;
        String namaProduk = detailMerchantItem.getNamaProduk();
        String str3 = namaProduk == null ? "" : namaProduk;
        String shortDesc = detailMerchantItem.getShortDesc();
        String str4 = shortDesc == null ? "" : shortDesc;
        String fileBanner = detailMerchantItem.getFileBanner();
        String str5 = fileBanner == null ? "" : fileBanner;
        List<SyaratItem> syaratInput = detailMerchantItem.getSyaratInput();
        ArrayList arrayList2 = null;
        if (syaratInput != null) {
            List<SyaratItem> list = syaratInput;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(TuitionPaymentFragmentspecialinlinedviewModeldefault2((SyaratItem) it.next()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        List listEmptyList = arrayList == null ? CollectionsKt.emptyList() : arrayList;
        String tglPromo = detailMerchantItem.getTglPromo();
        if (tglPromo == null) {
            tglPromo = "";
        }
        String lokasiComar = detailMerchantItem.getLokasiComar();
        if (lokasiComar == null) {
            lokasiComar = "";
        }
        String kodeProgram = detailMerchantItem.getKodeProgram();
        if (kodeProgram == null) {
            kodeProgram = "";
        }
        String statusPromo = detailMerchantItem.getStatusPromo();
        if (statusPromo == null) {
            statusPromo = "";
        }
        String judulPks = detailMerchantItem.getJudulPks();
        if (judulPks == null) {
            judulPks = "";
        }
        String tglBerakhirPromo = detailMerchantItem.getTglBerakhirPromo();
        if (tglBerakhirPromo == null) {
            tglBerakhirPromo = "";
        }
        String kodeJenisProduk = detailMerchantItem.getKodeJenisProduk();
        if (kodeJenisProduk == null) {
            kodeJenisProduk = "";
        }
        String namaJenisKategori = detailMerchantItem.getNamaJenisKategori();
        if (namaJenisKategori == null) {
            namaJenisKategori = "";
        }
        String kodePengajuanPromo = detailMerchantItem.getKodePengajuanPromo();
        if (kodePengajuanPromo == null) {
            kodePengajuanPromo = "";
        }
        String keteranganPks = detailMerchantItem.getKeteranganPks();
        if (keteranganPks == null) {
            keteranganPks = "";
        }
        String keterangan = detailMerchantItem.getKeterangan();
        if (keterangan == null) {
            keterangan = "";
        }
        String tglApproval = detailMerchantItem.getTglApproval();
        if (tglApproval == null) {
            tglApproval = "";
        }
        String fileThumbnail = detailMerchantItem.getFileThumbnail();
        if (fileThumbnail == null) {
            fileThumbnail = "";
        }
        List<SyaratItem> syaratDefault = detailMerchantItem.getSyaratDefault();
        if (syaratDefault != null) {
            List<SyaratItem> list2 = syaratDefault;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(TuitionPaymentFragmentspecialinlinedviewModeldefault2((SyaratItem) it2.next()));
            }
            arrayList2 = arrayList4;
        }
        List listEmptyList2 = arrayList2 == null ? CollectionsKt.emptyList() : arrayList2;
        String namaProgram = detailMerchantItem.getNamaProgram();
        String str6 = namaProgram == null ? "" : namaProgram;
        String namaPropinsi = detailMerchantItem.getNamaPropinsi();
        String str7 = namaPropinsi == null ? r0 : namaPropinsi;
        String kodeVoucherRedeem = detailMerchantItem.getKodeVoucherRedeem();
        String str8 = kodeVoucherRedeem == null ? r0 : kodeVoucherRedeem;
        String linkVoucherRedeem = detailMerchantItem.getLinkVoucherRedeem();
        return new DetailMerchant(str, str2, str3, str4, str5, listEmptyList, tglPromo, lokasiComar, kodeProgram, statusPromo, judulPks, tglBerakhirPromo, kodeJenisProduk, namaJenisKategori, kodePengajuanPromo, keteranganPks, keterangan, tglApproval, fileThumbnail, listEmptyList2, str6, str7, str8, linkVoucherRedeem == null ? r0 : linkVoucherRedeem);
    }

    private static SyaratMerchant TuitionPaymentFragmentspecialinlinedviewModeldefault2(SyaratItem syaratItem) {
        Intrinsics.checkNotNullParameter(syaratItem, "");
        String kodeSyaratKetentuan = syaratItem.getKodeSyaratKetentuan();
        if (kodeSyaratKetentuan == null) {
            kodeSyaratKetentuan = "";
        }
        String namaSyaratKetentuan = syaratItem.getNamaSyaratKetentuan();
        if (namaSyaratKetentuan == null) {
            namaSyaratKetentuan = "";
        }
        String isiSyaratKetentuan = syaratItem.getIsiSyaratKetentuan();
        if (isiSyaratKetentuan == null) {
            isiSyaratKetentuan = "";
        }
        String kodeComarSyarat = syaratItem.getKodeComarSyarat();
        return new SyaratMerchant(kodeSyaratKetentuan, namaSyaratKetentuan, isiSyaratKetentuan, kodeComarSyarat != null ? kodeComarSyarat : "");
    }
}
