package defpackage;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.R;
import com.bpjstku.data.digitalcard.DigitalCardRepository;
import com.bpjstku.data.digitalcard.model.request.DigitalCardImageRequest;
import com.bpjstku.data.digitalcard.model.request.DigitalCardRequest;
import com.bpjstku.data.digitalcard.model.request.MembershipInformationRequest;
import com.bpjstku.data.digitalcard.model.response.BPUMembershipInformationItem;
import com.bpjstku.data.digitalcard.model.response.DigitalCardItem;
import com.bpjstku.data.digitalcard.model.response.PMIMembershipInformationItem;
import com.bpjstku.data.digitalcard.model.response.PUMembershipInformationItem;
import com.bpjstku.domain.digitalcard.model.BPUMembershipInformation;
import com.bpjstku.domain.digitalcard.model.DigitalCard;
import com.bpjstku.domain.digitalcard.model.PMIMembershipInformation;
import com.bpjstku.domain.digitalcard.model.PUMembershipInformation;
import com.bpjstku.util.constant.MembershipType;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class addObserverForBackInvoker implements ensureViewModelStore {
    private final DigitalCardRepository TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public addObserverForBackInvoker(DigitalCardRepository digitalCardRepository) {
        Intrinsics.checkNotNullParameter(digitalCardRepository, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = digitalCardRepository;
    }

    @Override // defpackage.ensureViewModelStore
    public final deriveCodec<List<DigitalCard>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(DigitalCardRequest digitalCardRequest) {
        Intrinsics.checkNotNullParameter(digitalCardRequest, "");
        deriveCodec<List<DigitalCardItem>> digitalCards = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getDigitalCards(digitalCardRequest);
        final Function1 function1 = new Function1() { // from class: accessensureViewModelStore
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addObserverForBackInvoker.TuitionPaymentFragmentspecialinlinedviewModeldefault1((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: addObserverForBackInvokerlambda0
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return addObserverForBackInvoker.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(digitalCards, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ensureViewModelStore
    public final InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault1(DigitalCardImageRequest digitalCardImageRequest) {
        ResponseBody responseBodyBody;
        Intrinsics.checkNotNullParameter(digitalCardImageRequest, "");
        Response<ResponseBody> digitalCardImage = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getDigitalCardImage(digitalCardImageRequest);
        if (digitalCardImage == null || (responseBodyBody = digitalCardImage.body()) == null) {
            return null;
        }
        return responseBodyBody.byteStream();
    }

    @Override // defpackage.ensureViewModelStore
    public final deriveCodec<PMIMembershipInformation> TuitionPaymentFragmentspecialinlinedviewModeldefault2(MembershipInformationRequest membershipInformationRequest) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(membershipInformationRequest, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 46400), 40 - (ViewConfiguration.getScrollBarSize() >> 8), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 18, 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - KeyEvent.keyCodeFromString("")), 59 - TextUtils.indexOf("", "", 0, 0), 18 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - View.combineMeasuredStates(0, 0)), TextUtils.indexOf((CharSequence) "", '0') + 60, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 19, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = j;
        long j3 = -1;
        long j4 = j3 ^ 1749568973061850616L;
        long startElapsedRealtime = ((((long) ((int) Process.getStartElapsedRealtime())) ^ j3) | 1749568973061850616L) ^ j3;
        long j5 = j3 ^ 3769684524097935623L;
        long j6 = (((long) (-1939)) * 3769684524097935623L) + (((long) 971) * 1749568973061850616L) + (((long) (-970)) * (((j4 | 3769684524097935623L) ^ j3) | startElapsedRealtime)) + (((long) 1940) * ((j5 | 1749568973061850616L) ^ j3)) + (((long) 970) * (((j5 | j4) ^ j3) | startElapsedRealtime));
        int i4 = 0;
        while (true) {
            for (int i5 = 0; i5 != 8; i5++) {
                i3 = (((((int) (j2 >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            j2 = j6;
        }
        if (i3 != i) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 40 - View.resolveSize(0, 0), 19 - TextUtils.getOffsetBefore("", 0), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            int[] iArr = new int[i2];
            int i6 = i2 - 1;
            iArr[i6] = 1;
            Toast.makeText((Context) null, iArr[((i2 * i6) % 2) - 1], 1).show();
        }
        deriveCodec<PMIMembershipInformationItem> pMIMembershipInformation = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getPMIMembershipInformation(membershipInformationRequest);
        final Function1 function1 = new Function1() { // from class: _init_lambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addObserverForBackInvoker.b((PMIMembershipInformationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: _init_lambda3
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return addObserverForBackInvoker.TuitionPaymentFragmentbindingInflater1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(pMIMembershipInformation, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ensureViewModelStore
    public final deriveCodec<BPUMembershipInformation> b(MembershipInformationRequest membershipInformationRequest) {
        Intrinsics.checkNotNullParameter(membershipInformationRequest, "");
        deriveCodec<BPUMembershipInformationItem> bPUMembershipInformation = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getBPUMembershipInformation(membershipInformationRequest);
        final Function1 function1 = new Function1() { // from class: fullyDrawnReporter_delegatelambda00
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addObserverForBackInvoker.TuitionPaymentFragmentspecialinlinedviewModeldefault3((BPUMembershipInformationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: defaultViewModelProviderFactory_delegatelambda0
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return addObserverForBackInvoker.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(bPUMembershipInformation, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ensureViewModelStore
    public final deriveCodec<PUMembershipInformation> TuitionPaymentFragmentspecialinlinedviewModeldefault3(MembershipInformationRequest membershipInformationRequest) {
        Intrinsics.checkNotNullParameter(membershipInformationRequest, "");
        deriveCodec<PUMembershipInformationItem> pUMembershipInformation = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getPUMembershipInformation(membershipInformationRequest);
        final Function1 function1 = new Function1() { // from class: fullyDrawnReporter_delegatelambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addObserverForBackInvoker.TuitionPaymentFragmentbindingInflater1((PUMembershipInformationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: createFullyDrawnExecutor
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return addObserverForBackInvoker.b(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(pUMembershipInformation, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ PMIMembershipInformation b(PMIMembershipInformationItem pMIMembershipInformationItem) {
        Intrinsics.checkNotNullParameter(pMIMembershipInformationItem, "");
        Intrinsics.checkNotNullParameter(pMIMembershipInformationItem, "");
        String jenisPekerjaan = pMIMembershipInformationItem.getJenisPekerjaan();
        String str = jenisPekerjaan == null ? "" : jenisPekerjaan;
        String kantorKepesertaan = pMIMembershipInformationItem.getKantorKepesertaan();
        String str2 = kantorKepesertaan == null ? "" : kantorKepesertaan;
        String kodeTk = pMIMembershipInformationItem.getKodeTk();
        String str3 = kodeTk == null ? "" : kodeTk;
        String kpj = pMIMembershipInformationItem.getKpj();
        String str4 = kpj == null ? "" : kpj;
        String masaPerlindungan = pMIMembershipInformationItem.getMasaPerlindungan();
        String str5 = masaPerlindungan == null ? "" : masaPerlindungan;
        String negaraPenempatan = pMIMembershipInformationItem.getNegaraPenempatan();
        String str6 = negaraPenempatan == null ? "" : negaraPenempatan;
        String nomIuranItrf = pMIMembershipInformationItem.getNomIuranItrf();
        String str7 = nomIuranItrf == null ? "" : nomIuranItrf;
        String program = pMIMembershipInformationItem.getProgram();
        String str8 = program == null ? "" : program;
        String tglPniItrf = pMIMembershipInformationItem.getTglPniItrf();
        return new PMIMembershipInformation(str, str2, str3, str4, str5, str6, str7, str8, tglPniItrf == null ? "" : tglPniItrf);
    }

    public static /* synthetic */ BPUMembershipInformation TuitionPaymentFragmentspecialinlinedviewModeldefault3(BPUMembershipInformationItem bPUMembershipInformationItem) {
        Intrinsics.checkNotNullParameter(bPUMembershipInformationItem, "");
        Intrinsics.checkNotNullParameter(bPUMembershipInformationItem, "");
        String dasarUpah = bPUMembershipInformationItem.getDasarUpah();
        String str = dasarUpah == null ? "" : dasarUpah;
        String jenisPekerjaan = bPUMembershipInformationItem.getJenisPekerjaan();
        String str2 = jenisPekerjaan == null ? "" : jenisPekerjaan;
        String kantorKepesertaan = bPUMembershipInformationItem.getKantorKepesertaan();
        String str3 = kantorKepesertaan == null ? "" : kantorKepesertaan;
        String kodeTk = bPUMembershipInformationItem.getKodeTk();
        String str4 = kodeTk == null ? "" : kodeTk;
        String kpj = bPUMembershipInformationItem.getKpj();
        String str5 = kpj == null ? "" : kpj;
        String masaPerlindungan = bPUMembershipInformationItem.getMasaPerlindungan();
        String str6 = masaPerlindungan == null ? "" : masaPerlindungan;
        String nomIuranItrf = bPUMembershipInformationItem.getNomIuranItrf();
        String str7 = nomIuranItrf == null ? "" : nomIuranItrf;
        String program = bPUMembershipInformationItem.getProgram();
        String str8 = program == null ? "" : program;
        String tglPniItrf = bPUMembershipInformationItem.getTglPniItrf();
        return new BPUMembershipInformation(str, str2, str3, str4, str5, str6, str7, str8, tglPniItrf == null ? "" : tglPniItrf);
    }

    public static /* synthetic */ BPUMembershipInformation TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BPUMembershipInformation) function1.invoke(obj);
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ PMIMembershipInformation TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (PMIMembershipInformation) function1.invoke(obj);
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) {
        String string;
        Intrinsics.checkNotNullParameter(list, "");
        List<DigitalCardItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (DigitalCardItem digitalCardItem : list2) {
            Intrinsics.checkNotNullParameter(digitalCardItem, "");
            String hash = digitalCardItem.getHash();
            String str = hash == null ? "" : hash;
            String kodeSegmen = digitalCardItem.getKodeSegmen();
            MembershipType membershipType = Intrinsics.areEqual(kodeSegmen, "BPU") ? MembershipType.BPU : Intrinsics.areEqual(kodeSegmen, "PMI") ? MembershipType.PMI : MembershipType.PU;
            String kodeSegmen2 = digitalCardItem.getKodeSegmen();
            if (Intrinsics.areEqual(kodeSegmen2, "BPU")) {
                string = ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getString(R.string.label_non_salaried_participant);
                Intrinsics.checkNotNull(string);
            } else if (Intrinsics.areEqual(kodeSegmen2, "PMI")) {
                string = ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getString(R.string.label_indonesia_migrant_worker_oneline);
                Intrinsics.checkNotNull(string);
            } else {
                string = ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getString(R.string.label_salaried_participant);
                Intrinsics.checkNotNull(string);
            }
            String str2 = string;
            String kodeTk = digitalCardItem.getKodeTk();
            String str3 = kodeTk == null ? "" : kodeTk;
            String kpj = digitalCardItem.getKpj();
            arrayList.add(new DigitalCard(str, membershipType, str2, str3, kpj == null ? "" : kpj));
        }
        return arrayList;
    }

    public static /* synthetic */ PUMembershipInformation TuitionPaymentFragmentbindingInflater1(PUMembershipInformationItem pUMembershipInformationItem) {
        Intrinsics.checkNotNullParameter(pUMembershipInformationItem, "");
        Intrinsics.checkNotNullParameter(pUMembershipInformationItem, "");
        String blthItrf = pUMembershipInformationItem.getBlthItrf();
        String str = blthItrf == null ? "" : blthItrf;
        String jmlTkItrf = pUMembershipInformationItem.getJmlTkItrf();
        String str2 = jmlTkItrf == null ? "" : jmlTkItrf;
        String kodeTk = pUMembershipInformationItem.getKodeTk();
        String str3 = kodeTk == null ? "" : kodeTk;
        String kpj = pUMembershipInformationItem.getKpj();
        String str4 = kpj == null ? "" : kpj;
        String masaIurJp = pUMembershipInformationItem.getMasaIurJp();
        String str5 = masaIurJp == null ? "" : masaIurJp;
        String namaPerusahaan = pUMembershipInformationItem.getNamaPerusahaan();
        String str6 = namaPerusahaan == null ? "" : namaPerusahaan;
        String nomUpahItrf = pUMembershipInformationItem.getNomUpahItrf();
        String str7 = nomUpahItrf == null ? "" : nomUpahItrf;
        String npp = pUMembershipInformationItem.getNpp();
        String str8 = npp == null ? "" : npp;
        String program = pUMembershipInformationItem.getProgram();
        String str9 = program == null ? "" : program;
        String statusKeps = pUMembershipInformationItem.getStatusKeps();
        String str10 = statusKeps == null ? "" : statusKeps;
        String tglKepsJp = pUMembershipInformationItem.getTglKepsJp();
        String str11 = tglKepsJp == null ? "" : tglKepsJp;
        String tglPensiunJp = pUMembershipInformationItem.getTglPensiunJp();
        String str12 = tglPensiunJp == null ? "" : tglPensiunJp;
        String tglPniItrf = pUMembershipInformationItem.getTglPniItrf();
        String str13 = tglPniItrf == null ? "" : tglPniItrf;
        String tglKepsJkp = pUMembershipInformationItem.getTglKepsJkp();
        String str14 = tglKepsJkp == null ? "" : tglKepsJkp;
        String masaIurJkp = pUMembershipInformationItem.getMasaIurJkp();
        return new PUMembershipInformation(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, masaIurJkp == null ? "" : masaIurJkp);
    }

    public static /* synthetic */ PUMembershipInformation b(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (PUMembershipInformation) function1.invoke(obj);
    }
}
