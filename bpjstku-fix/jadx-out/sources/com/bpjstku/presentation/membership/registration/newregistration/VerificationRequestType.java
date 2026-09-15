package com.bpjstku.presentation.membership.registration.newregistration;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.bpjstku.presentation.membership.registration.newregistration.VerificationRequestType[], still in use, count: 1, list:
  (r0v1 com.bpjstku.presentation.membership.registration.newregistration.VerificationRequestType[]) from 0x001c: INVOKE (r0v1 com.bpjstku.presentation.membership.registration.newregistration.VerificationRequestType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)]
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/newregistration/VerificationRequestType;", "", "<init>", "(Ljava/lang/String;I)V", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerificationRequestType {
    EMAIL,
    PHONE;

    private VerificationRequestType() {
        super(str, i);
    }

    static {
        EnumEntriesKt.enumEntries(verificationRequestTypeArr);
    }

    public static VerificationRequestType valueOf(String str) {
        return (VerificationRequestType) Enum.valueOf(VerificationRequestType.class, str);
    }

    public static VerificationRequestType[] values() {
        return (VerificationRequestType[]) TuitionPaymentFragmentbindingInflater1.clone();
    }
}
