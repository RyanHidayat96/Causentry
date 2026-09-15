package defpackage;

import com.bpjstku.R;
import com.bpjstku.data.user.model.response.ForgotAccountItem;
import com.bpjstku.data.user.model.response.ForgotPasswdResponse;
import com.bpjstku.data.user.model.response.ForgotPasswordItem;
import com.bpjstku.data.user.model.response.Kpj;
import com.bpjstku.data.user.model.response.LoginItem;
import com.bpjstku.data.user.model.response.NotificationBadgeResponse;
import com.bpjstku.data.user.model.response.RefreshTokenResponse;
import com.bpjstku.data.user.model.response.ResetPasswordItem;
import com.bpjstku.data.user.model.response.UserItem;
import com.bpjstku.data.user.model.response.ValidationOtpItem;
import com.bpjstku.domain.user.model.ForgotAccount;
import com.bpjstku.domain.user.model.Login;
import com.bpjstku.domain.user.model.Otp;
import com.bpjstku.domain.user.model.SubscribedProgram;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.domain.user.model.UserAccessToken;
import com.bpjstku.domain.user.model.ValidationOtp;
import com.bpjstku.presentation.program.model.ProgramInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R(\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00160\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R(\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u000b\u0010\u0012R(\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012R(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R(\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010!0\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0006\u0010\u0012"}, d2 = {"Lunregisteractivity;", "", "<init>", "()V", "Lcom/bpjstku/data/user/model/response/NotificationBadgeResponse;", "LActivityResultRegistryExternalSyntheticLambda1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/bpjstku/data/user/model/response/NotificationBadgeResponse;)LActivityResultRegistryExternalSyntheticLambda1;", "", "g", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Function1;", "Lcom/bpjstku/data/user/model/response/UserItem;", "Lcom/bpjstku/domain/user/model/User;", "asInterface", "Lkotlin/jvm/functions/Function1;", "b", "()Lkotlin/jvm/functions/Function1;", "Lcom/bpjstku/data/user/model/response/Kpj;", "Lcom/bpjstku/domain/user/model/SubscribedProgram;", "asBinder", "Lcom/bpjstku/data/user/model/response/ForgotPasswordItem;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/bpjstku/data/user/model/response/RefreshTokenResponse;", "Lcom/bpjstku/domain/user/model/UserAccessToken;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/data/user/model/response/ValidationOtpItem;", "Lcom/bpjstku/domain/user/model/ValidationOtp;", "d", "Lcom/bpjstku/data/user/model/response/ForgotAccountItem;", "Lcom/bpjstku/domain/user/model/ForgotAccount;", "Lcom/bpjstku/data/user/model/response/ResetPasswordItem;", "LActivityResultRegistryExternalSyntheticLambda0;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class unregisteractivity {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private static final Function1<ForgotAccountItem, ForgotAccount> asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private static final Function1<RefreshTokenResponse, UserAccessToken> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private static final Function1<ForgotPasswordItem, ForgotPasswordItem> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private static final Function1<Kpj, SubscribedProgram> b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final Function1<ResetPasswordItem, ActivityResultRegistryExternalSyntheticLambda0> d;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final Function1<ValidationOtpItem, ValidationOtp> asBinder;
    public static final unregisteractivity INSTANCE = new unregisteractivity();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private static final Function1<UserItem, User> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Function1() { // from class: ActivityResultRegistryCallbackAndContract
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return unregisteractivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3((UserItem) obj);
        }
    };

    private unregisteractivity() {
    }

    static {
        new Function1() { // from class: ActivityResultRegistryLifecycleContainer
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return unregisteractivity.TuitionPaymentFragmentbindingInflater1((LoginItem) obj);
            }
        };
        b = new Function1() { // from class: ActivityResultRegistryCompanion
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return unregisteractivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Kpj) obj);
            }
        };
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Function1() { // from class: clearObservers
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return unregisteractivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3((ForgotPasswordItem) obj);
            }
        };
        TuitionPaymentFragmentbindingInflater1 = new Function1() { // from class: addObserver
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return unregisteractivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2((RefreshTokenResponse) obj);
            }
        };
        asBinder = new Function1() { // from class: ActivityResultRegistryOwner
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return unregisteractivity.TuitionPaymentFragmentbindingInflater1((ValidationOtpItem) obj);
            }
        };
        new Function1() { // from class: IntentSenderRequest
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return unregisteractivity.b((ForgotPasswdResponse) obj);
            }
        };
        asInterface = new Function1() { // from class: ActivityResultRegistryregister2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return unregisteractivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3((ForgotAccountItem) obj);
            }
        };
        d = new Function1() { // from class: ActivityResultRegistryregister3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return unregisteractivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3((ResetPasswordItem) obj);
            }
        };
    }

    public static Function1<UserItem, User> b() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e8  */
    public static final User TuitionPaymentFragmentspecialinlinedviewModeldefault3(UserItem userItem) {
        ArrayList arrayListEmptyList;
        List<String> listSplit$default;
        String str;
        int i;
        String str2 = "";
        Intrinsics.checkNotNullParameter(userItem, "");
        try {
            List<Kpj> kpj = userItem.getKpj();
            ArrayList arrayList = new ArrayList();
            if (kpj != null) {
                Iterator<T> it = kpj.iterator();
                while (it.hasNext()) {
                    String program = ((Kpj) it.next()).getProgram();
                    if (program != null && (listSplit$default = StringsKt.split$default((CharSequence) program, new String[]{","}, false, 0, 6, (Object) null)) != null) {
                        for (String str3 : listSplit$default) {
                            String string = StringsKt.trim((CharSequence) str3).toString();
                            String string2 = StringsKt.trim((CharSequence) str3).toString();
                            int iHashCode = string2.hashCode();
                            if (iHashCode != 2374) {
                                if (iHashCode != 73430) {
                                    if (iHashCode != 73516) {
                                        if (iHashCode == 73672 && string2.equals("JPN")) {
                                            str = "Jaminan Pensiun";
                                        } else {
                                            str = "Jaminan Kecelakaan Kerja";
                                        }
                                    } else if (string2.equals("JKM")) {
                                        str = "Jaminan Kematian";
                                    } else {
                                        str = "Jaminan Kecelakaan Kerja";
                                    }
                                } else if (string2.equals("JHT")) {
                                    str = "Jaminan Hari Tua";
                                } else {
                                    str = "Jaminan Kecelakaan Kerja";
                                }
                            } else if (string2.equals("JP")) {
                                str = "Jaminan Prakerja";
                            } else {
                                str = "Jaminan Kecelakaan Kerja";
                            }
                            String string3 = StringsKt.trim((CharSequence) str3).toString();
                            int iHashCode2 = string3.hashCode();
                            if (iHashCode2 != 2374) {
                                if (iHashCode2 != 73430) {
                                    if (iHashCode2 != 73516) {
                                        if (iHashCode2 == 73672 && string3.equals("JPN")) {
                                            i = R.drawable.ic_pension_security;
                                        } else {
                                            i = R.drawable.ic_work_accident_security;
                                        }
                                    } else if (string3.equals("JKM")) {
                                        i = R.drawable.ic_death_security;
                                    } else {
                                        i = R.drawable.ic_work_accident_security;
                                    }
                                } else if (string3.equals("JHT")) {
                                    i = R.drawable.ic_old_day_security;
                                } else {
                                    i = R.drawable.ic_work_accident_security;
                                }
                            } else if (string3.equals("JP")) {
                                i = R.drawable.ic_preemployee_security;
                            } else {
                                i = R.drawable.ic_work_accident_security;
                            }
                            arrayList.add(new ProgramInfo(string, str, i, true));
                        }
                    }
                }
            }
            List listDistinct = CollectionsKt.distinct(arrayList);
            if (listDistinct == null) {
                return null;
            }
            Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
            String namaLengkap = userItem.getNamaLengkap();
            if (namaLengkap == null) {
                namaLengkap = "";
            }
            String str4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(namaLengkap, str4);
            Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
            String email = userItem.getEmail();
            if (email == null) {
                email = "";
            }
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = companion2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(email, str4);
            Camera2InteropExtender.Companion companion3 = Camera2InteropExtender.INSTANCE;
            String msisdn = userItem.getMsisdn();
            if (msisdn == null) {
                msisdn = "";
            }
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault5 = companion3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(msisdn, str4);
            Camera2InteropExtender.Companion companion4 = Camera2InteropExtender.INSTANCE;
            String nik = userItem.getNik();
            if (nik == null) {
                nik = "";
            }
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault6 = companion4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(nik, str4);
            Camera2InteropExtender.Companion companion5 = Camera2InteropExtender.INSTANCE;
            String noKk = userItem.getNoKk();
            if (noKk == null) {
                noKk = "";
            }
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault7 = companion5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(noKk, str4);
            String displayPict = userItem.getDisplayPict();
            String str5 = displayPict == null ? "" : displayPict;
            String kodePos = userItem.getKodePos();
            String str6 = kodePos == null ? "" : kodePos;
            String alamat = userItem.getAlamat();
            String str7 = alamat == null ? "" : alamat;
            Camera2InteropExtender.Companion companion6 = Camera2InteropExtender.INSTANCE;
            String tglLahir = userItem.getTglLahir();
            if (tglLahir == null) {
                tglLahir = "";
            }
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault8 = companion6.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tglLahir, str4);
            String tempatLahir = userItem.getTempatLahir();
            String str8 = tempatLahir == null ? "" : tempatLahir;
            String kabupaten = userItem.getKabupaten();
            String str9 = kabupaten == null ? "" : kabupaten;
            String kecamatan = userItem.getKecamatan();
            String str10 = kecamatan == null ? "" : kecamatan;
            String jenisKelamin = userItem.getJenisKelamin();
            String str11 = jenisKelamin == null ? "" : jenisKelamin;
            String propinsi = userItem.getPropinsi();
            String str12 = propinsi == null ? "" : propinsi;
            List<Kpj> kpj2 = userItem.getKpj();
            if (kpj2 != null) {
                List<Kpj> list = kpj2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(b.invoke((Kpj) it2.next()));
                }
                arrayListEmptyList = arrayList2;
            } else {
                arrayListEmptyList = null;
            }
            if (arrayListEmptyList == null) {
                arrayListEmptyList = CollectionsKt.emptyList();
            }
            List list2 = arrayListEmptyList;
            Camera2InteropExtender.Companion companion7 = Camera2InteropExtender.INSTANCE;
            String statusPelapor = userItem.getStatusPelapor();
            if (statusPelapor == null) {
                statusPelapor = "";
            }
            String str13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault9 = companion7.TuitionPaymentFragmentspecialinlinedviewModeldefault3(statusPelapor, str13);
            Camera2InteropExtender.Companion companion8 = Camera2InteropExtender.INSTANCE;
            String statusPeserta = userItem.getStatusPeserta();
            if (statusPeserta != null) {
                str2 = statusPeserta;
            }
            return new User(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, strTuitionPaymentFragmentspecialinlinedviewModeldefault4, str5, strTuitionPaymentFragmentspecialinlinedviewModeldefault5, strTuitionPaymentFragmentspecialinlinedviewModeldefault6, strTuitionPaymentFragmentspecialinlinedviewModeldefault7, str6, str7, str10, strTuitionPaymentFragmentspecialinlinedviewModeldefault8, str12, str9, str11, str8, list2, listDistinct, "", strTuitionPaymentFragmentspecialinlinedviewModeldefault9, companion8.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str2, str13), userItem.getListFitur());
        } catch (Exception e2) {
            e2.printStackTrace();
            setCaptureRequestTemplate setcapturerequesttemplate = setCaptureRequestTemplate.INSTANCE;
            setCaptureRequestTemplate.TuitionPaymentFragmentbindingInflater1("UserMapper.mapUser");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SubscribedProgram TuitionPaymentFragmentspecialinlinedviewModeldefault3(Kpj kpj) {
        String str = "";
        Intrinsics.checkNotNullParameter(kpj, "");
        String strB = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        try {
            Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
            String kodeTk = kpj.getKodeTk();
            if (kodeTk == null) {
                kodeTk = "";
            }
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(kodeTk, strB);
            String kodeSegmen = kpj.getKodeSegmen();
            Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
            String kpj2 = kpj.getKpj();
            if (kpj2 == null) {
                kpj2 = "";
            }
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = companion2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(kpj2, strB);
            Camera2InteropExtender.Companion companion3 = Camera2InteropExtender.INSTANCE;
            String namaTk = kpj.getNamaTk();
            if (namaTk == null) {
                namaTk = "";
            }
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault5 = companion3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(namaTk, strB);
            Camera2InteropExtender.Companion companion4 = Camera2InteropExtender.INSTANCE;
            String nomorIdentitas = kpj.getNomorIdentitas();
            if (nomorIdentitas != null) {
                str = nomorIdentitas;
            }
            return new SubscribedProgram(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, kpj.getProgram(), strTuitionPaymentFragmentspecialinlinedviewModeldefault4, kodeSegmen, companion4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, strB), strTuitionPaymentFragmentspecialinlinedviewModeldefault5, kpj.getTglKepesertaan(), kpj.getStatusKepesertaan());
        } catch (Exception e2) {
            e2.printStackTrace();
            setCaptureRequestTemplate setcapturerequesttemplate = setCaptureRequestTemplate.INSTANCE;
            setCaptureRequestTemplate.TuitionPaymentFragmentbindingInflater1("UserMapper.mapSubscribedProgram");
            return new SubscribedProgram("", kpj.getProgram(), "", kpj.getKodeSegmen(), "", "", kpj.getTglKepesertaan(), kpj.getStatusKepesertaan());
        }
    }

    public static Function1<ForgotPasswordItem, ForgotPasswordItem> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static Function1<RefreshTokenResponse, UserAccessToken> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return TuitionPaymentFragmentbindingInflater1;
    }

    public static Function1<ValidationOtpItem, ValidationOtp> d() {
        return asBinder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ValidationOtp TuitionPaymentFragmentbindingInflater1(ValidationOtpItem validationOtpItem) {
        Intrinsics.checkNotNullParameter(validationOtpItem, "");
        try {
            return new ValidationOtp(Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(validationOtpItem.getSignature()), TuitionPaymentFragmentspecialinlinedviewModeldefault3), String.valueOf(validationOtpItem.getCheckSum()));
        } catch (Exception e2) {
            e2.printStackTrace();
            setCaptureRequestTemplate setcapturerequesttemplate = setCaptureRequestTemplate.INSTANCE;
            setCaptureRequestTemplate.TuitionPaymentFragmentbindingInflater1("UserMapper.mapValidationOtp");
            return null;
        }
    }

    public static Function1<ForgotAccountItem, ForgotAccount> TuitionPaymentFragmentbindingInflater1() {
        return asInterface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ForgotAccount TuitionPaymentFragmentspecialinlinedviewModeldefault3(ForgotAccountItem forgotAccountItem) {
        Intrinsics.checkNotNullParameter(forgotAccountItem, "");
        try {
            Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
            String strValueOf = String.valueOf(forgotAccountItem.getEmail());
            String str = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            return new ForgotAccount(companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strValueOf, str), Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(forgotAccountItem.getPhoneNumber()), str), forgotAccountItem.getCheckSum());
        } catch (Exception e2) {
            e2.printStackTrace();
            setCaptureRequestTemplate setcapturerequesttemplate = setCaptureRequestTemplate.INSTANCE;
            setCaptureRequestTemplate.TuitionPaymentFragmentbindingInflater1("UserMapper.mapForgotAccount");
            return null;
        }
    }

    public static Function1<ResetPasswordItem, ActivityResultRegistryExternalSyntheticLambda0> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return d;
    }

    public static ActivityResultRegistryExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault1(NotificationBadgeResponse notificationBadgeResponse) {
        Intrinsics.checkNotNullParameter(notificationBadgeResponse, "");
        Boolean boolIsBadge = notificationBadgeResponse.isBadge();
        return new ActivityResultRegistryExternalSyntheticLambda1(Boolean.valueOf(boolIsBadge != null ? boolIsBadge.booleanValue() : false));
    }

    public static /* synthetic */ ForgotPasswordItem TuitionPaymentFragmentspecialinlinedviewModeldefault3(ForgotPasswordItem forgotPasswordItem) {
        Intrinsics.checkNotNullParameter(forgotPasswordItem, "");
        return new ForgotPasswordItem(String.valueOf(forgotPasswordItem.getOtp()), String.valueOf(forgotPasswordItem.getCheckSum()));
    }

    public static /* synthetic */ UserAccessToken TuitionPaymentFragmentspecialinlinedviewModeldefault2(RefreshTokenResponse refreshTokenResponse) {
        Intrinsics.checkNotNullParameter(refreshTokenResponse, "");
        return new UserAccessToken(String.valueOf(refreshTokenResponse.getAccessToken()));
    }

    public static /* synthetic */ Otp b(ForgotPasswdResponse forgotPasswdResponse) {
        Intrinsics.checkNotNullParameter(forgotPasswdResponse, "");
        return new Otp(String.valueOf(forgotPasswdResponse.getOtp()));
    }

    public static /* synthetic */ ActivityResultRegistryExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault3(ResetPasswordItem resetPasswordItem) {
        Intrinsics.checkNotNullParameter(resetPasswordItem, "");
        return new ActivityResultRegistryExternalSyntheticLambda0(resetPasswordItem.getMessage());
    }

    public static /* synthetic */ Login TuitionPaymentFragmentbindingInflater1(LoginItem loginItem) {
        Intrinsics.checkNotNullParameter(loginItem, "");
        return new Login(String.valueOf(loginItem.getAccessToken()), loginItem.getStatusCode().toString());
    }
}
