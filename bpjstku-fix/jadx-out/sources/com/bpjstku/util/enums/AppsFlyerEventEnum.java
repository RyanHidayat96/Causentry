package com.bpjstku.util.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.bpjstku.util.enums.AppsFlyerEventEnum[], still in use, count: 1, list:
  (r0v1 com.bpjstku.util.enums.AppsFlyerEventEnum[]) from 0x0038: INVOKE (r0v1 com.bpjstku.util.enums.AppsFlyerEventEnum[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/bpjstku/util/enums/AppsFlyerEventEnum;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppsFlyerEventEnum {
    TERM_N_CONDITION_BPU("term_n_condition_bpu"),
    PAYMENT_DETAIL_BPU("payment_detail_bpu"),
    SUCCESS_BPU("success_bpu"),
    REGISTRASI_BPU("registrasi_bpu");

    private final String type;

    private AppsFlyerEventEnum(String str) {
        super(str, i);
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }

    static {
        EnumEntriesKt.enumEntries(appsFlyerEventEnumArr);
    }

    public static AppsFlyerEventEnum valueOf(String str) {
        return (AppsFlyerEventEnum) Enum.valueOf(AppsFlyerEventEnum.class, str);
    }

    public static AppsFlyerEventEnum[] values() {
        return (AppsFlyerEventEnum[]) b.clone();
    }
}
