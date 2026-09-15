package defpackage;

import com.bpjstku.data.programinfo.ProgramInfoRepository;
import com.bpjstku.data.programinfo.model.request.ProgramInfoRequest;
import com.bpjstku.data.programinfo.model.response.Benefit;
import com.bpjstku.data.programinfo.model.response.Data;
import com.bpjstku.data.programinfo.model.response.Item;
import com.bpjstku.data.programinfo.model.response.ProgramInfoItem;
import com.bpjstku.domain.programinfo.ProgramUseCase;
import com.bpjstku.domain.programinfo.model.BenefitItem;
import com.bpjstku.domain.programinfo.model.BenefitProgram;
import com.bpjstku.domain.programinfo.model.ProgramAttribute;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hasEnabledCallbacks implements ProgramUseCase {
    private final ProgramInfoRepository b;

    public hasEnabledCallbacks(ProgramInfoRepository programInfoRepository) {
        Intrinsics.checkNotNullParameter(programInfoRepository, "");
        this.b = programInfoRepository;
    }

    @Override // com.bpjstku.domain.programinfo.ProgramUseCase
    public final deriveCodec<r8lambdadPEOltVNxwFUffOSXiaKZsPUiI> geProgram(ProgramInfoRequest programInfoRequest) {
        Intrinsics.checkNotNullParameter(programInfoRequest, "");
        deriveCodec<ProgramInfoItem> programInfo = this.b.getProgramInfo(programInfoRequest);
        final Function1 function1 = new Function1() { // from class: getEventDispatcheractivity
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return hasEnabledCallbacks.b((ProgramInfoItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: OnBackPressedDispatcherExternalSyntheticLambda1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return hasEnabledCallbacks.TuitionPaymentFragmentbindingInflater1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(programInfo, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ r8lambdadPEOltVNxwFUffOSXiaKZsPUiI TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (r8lambdadPEOltVNxwFUffOSXiaKZsPUiI) function1.invoke(obj);
    }

    public static /* synthetic */ r8lambdadPEOltVNxwFUffOSXiaKZsPUiI b(ProgramInfoItem programInfoItem) {
        ArrayList arrayList;
        List<Benefit> benefits;
        ArrayList arrayListEmptyList;
        Intrinsics.checkNotNullParameter(programInfoItem, "");
        Intrinsics.checkNotNullParameter(programInfoItem, "");
        Data data = programInfoItem.getData();
        String besarIuranBpu = data != null ? data.getBesarIuranBpu() : null;
        String str = besarIuranBpu == null ? "" : besarIuranBpu;
        Data data2 = programInfoItem.getData();
        String title = data2 != null ? data2.getTitle() : null;
        String str2 = title == null ? "" : title;
        Data data3 = programInfoItem.getData();
        String deskripsi = data3 != null ? data3.getDeskripsi() : null;
        String str3 = deskripsi == null ? "" : deskripsi;
        Data data4 = programInfoItem.getData();
        if (data4 == null || (benefits = data4.getBenefits()) == null) {
            arrayList = null;
        } else {
            List<Benefit> list = benefits;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Benefit benefit : list) {
                Intrinsics.checkNotNullParameter(benefit, "");
                String title2 = benefit.getTitle();
                if (title2 == null) {
                    title2 = "";
                }
                List<Item> items = benefit.getItems();
                if (items != null) {
                    List<Item> list2 = items;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (Item item : list2) {
                        Intrinsics.checkNotNullParameter(item, "");
                        String title3 = item.getTitle();
                        if (title3 == null) {
                            title3 = "";
                        }
                        String deskripsi2 = item.getDeskripsi();
                        if (deskripsi2 == null) {
                            deskripsi2 = "";
                        }
                        arrayList3.add(new BenefitItem(deskripsi2, title3));
                    }
                    arrayListEmptyList = arrayList3;
                } else {
                    arrayListEmptyList = null;
                }
                if (arrayListEmptyList == null) {
                    arrayListEmptyList = CollectionsKt.emptyList();
                }
                arrayList2.add(new BenefitProgram(title2, arrayListEmptyList));
            }
            arrayList = arrayList2;
        }
        List listEmptyList = arrayList == null ? CollectionsKt.emptyList() : arrayList;
        Data data5 = programInfoItem.getData();
        String besarIuranJakon = data5 != null ? data5.getBesarIuranJakon() : null;
        String str4 = besarIuranJakon == null ? "" : besarIuranJakon;
        Data data6 = programInfoItem.getData();
        String besarIuranPmi = data6 != null ? data6.getBesarIuranPmi() : null;
        String str5 = besarIuranPmi == null ? "" : besarIuranPmi;
        Data data7 = programInfoItem.getData();
        String besarIuranPu = data7 != null ? data7.getBesarIuranPu() : null;
        return new r8lambdadPEOltVNxwFUffOSXiaKZsPUiI(new ProgramAttribute(str, str4, str5, besarIuranPu == null ? "" : besarIuranPu, str3, str2, listEmptyList));
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        Absent.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0] = withType.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0];
    }
}
